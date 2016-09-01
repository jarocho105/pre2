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
import com.bydan.erp.comisiones.util.ComisionMarcaConstantesFunciones;

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
public class ComisionMarcaJInternalFrame extends ComisionMarcaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarComisionMarca;
	
	protected JMenuBar jmenuBarComisionMarca;
	
	protected JMenu jmenuComisionMarca;
	protected JMenu jmenuDatosComisionMarca;
	protected JMenu jmenuArchivoComisionMarca;
	protected JMenu jmenuAccionesComisionMarca;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosComisionMarca = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutComisionMarca;	
	protected GridBagConstraints gridBagConstraintsComisionMarca;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ComisionMarcaDetalleFormJInternalFrame jInternalFrameDetalleFormComisionMarca;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoComisionMarca;	
	protected ImportacionJInternalFrame jInternalFrameImportacionComisionMarca;	
	
	
	
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

	protected LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarca="";

	protected EstadoComisionBeanSwingJInternalFrame estadocomisionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadocomision="";
	
	public ComisionMarcaSessionBean comisionmarcaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ComisionConfigSessionBean comisionconfigSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	public EstadoComisionSessionBean estadocomisionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ComisionMarca> comisionmarcas;		
	public List<ComisionMarca> comisionmarcasEliminados;	
	public List<ComisionMarca> comisionmarcasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByComisionMarca;		
	protected JButton jButtonAbrirOrderByComisionMarca;
	
	
	//protected JPanel jPanelOrderByComisionMarca;
	//public JScrollPane jScrollPanelOrderByComisionMarca;	
	//protected JButton jButtonCerrarOrderByComisionMarca;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ComisionMarcaLogic comisionmarcaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosComisionMarca;
	public JScrollPane jScrollPanelDatosEdicionComisionMarca;
	public JScrollPane jScrollPanelDatosGeneralComisionMarca;
    
	
	
	//public JScrollPane jScrollPanelDatosComisionMarcaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoComisionMarca;
	//public JScrollPane jScrollPanelImportacionComisionMarca;
	
	
	
	protected JPanel jPanelAccionesComisionMarca;
	
    protected JPanel jPanelPaginacionComisionMarca;
    protected JPanel jPanelParametrosReportesComisionMarca;
	protected JPanel jPanelParametrosReportesAccionesComisionMarca;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ComisionMarca;
	protected JPanel jPanelParametrosAuxiliar2ComisionMarca;
	protected JPanel jPanelParametrosAuxiliar3ComisionMarca;
	protected JPanel jPanelParametrosAuxiliar4ComisionMarca;
	//protected JPanel jPanelParametrosAuxiliar5ComisionMarca;
	
	
	
	//protected JPanel jPanelReporteDinamicoComisionMarca;
	//protected JPanel jPanelImportacionComisionMarca;
	
	
	public JTable jTableDatosComisionMarca;
	
	
	
	//public JTable jTableDatosComisionMarcaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoComisionMarca;
	protected JButton jButtonDuplicarComisionMarca;
	protected JButton jButtonCopiarComisionMarca;
	protected JButton jButtonVerFormComisionMarca;
	protected JButton jButtonNuevoRelacionesComisionMarca;
	protected JButton jButtonModificarComisionMarca;
	
    protected JButton jButtonGuardarCambiosTablaComisionMarca;
	protected JButton jButtonCerrarComisionMarca;
	
	
	protected JButton jButtonRecargarInformacionComisionMarca;
	protected JButton jButtonProcesarInformacionComisionMarca;
	
	
	protected JButton jButtonAnterioresComisionMarca;
	protected JButton jButtonSiguientesComisionMarca;
	protected JButton jButtonNuevoGuardarCambiosComisionMarca;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoComisionMarca;
	//protected JButton jButtonCerrarReporteDinamicoComisionMarca;
	//protected JButton jButtonGenerarExcelReporteDinamicoComisionMarca;	
	
	
	
	//protected JButton jButtonAbrirImportacionComisionMarca;
	//protected JButton jButtonGenerarImportacionComisionMarca;
	//protected JButton jButtonCerrarImportacionComisionMarca;
	//protected JFileChooser jFileChooserImportacionComisionMarca;
	//protected File fileImportacionComisionMarca;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarComisionMarca;
	protected JButton jButtonDuplicarToolBarComisionMarca;
	protected JButton jButtonNuevoRelacionesToolBarComisionMarca;
	
	
	public JButton jButtonGuardarCambiosToolBarComisionMarca;
	protected JButton jButtonCopiarToolBarComisionMarca;
	protected JButton jButtonVerFormToolBarComisionMarca;
	public JButton jButtonGuardarCambiosTablaToolBarComisionMarca;
	protected JButton jButtonMostrarOcultarTablaToolBarComisionMarca;
	protected JButton jButtonCerrarToolBarComisionMarca;
	
	protected JButton jButtonRecargarInformacionToolBarComisionMarca;
	protected JButton jButtonProcesarInformacionToolBarComisionMarca;
	protected JButton jButtonAnterioresToolBarComisionMarca;
	protected JButton jButtonSiguientesToolBarComisionMarca;
	protected JButton jButtonNuevoGuardarCambiosToolBarComisionMarca;
	protected JButton jButtonAbrirOrderByToolBarComisionMarca;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoComisionMarca;
	protected JMenuItem jMenuItemDuplicarComisionMarca;
	protected JMenuItem jMenuItemNuevoRelacionesComisionMarca;
	
	
	protected JMenuItem jMenuItemGuardarCambiosComisionMarca;
	protected JMenuItem jMenuItemCopiarComisionMarca;
	protected JMenuItem jMenuItemVerFormComisionMarca;
	protected JMenuItem jMenuItemGuardarCambiosTablaComisionMarca;
	protected JMenuItem jMenuItemCerrarComisionMarca;
	protected JMenuItem jMenuItemDetalleCerrarComisionMarca;
	protected JMenuItem jMenuItemDetalleAbrirOrderByComisionMarca;
	protected JMenuItem jMenuItemDetalleMostarOcultarComisionMarca;
	
	protected JMenuItem jMenuItemRecargarInformacionComisionMarca;
	protected JMenuItem jMenuItemProcesarInformacionComisionMarca;
	protected JMenuItem jMenuItemAnterioresComisionMarca;
	protected JMenuItem jMenuItemSiguientesComisionMarca;
	protected JMenuItem jMenuItemNuevoGuardarCambiosComisionMarca;
	protected JMenuItem jMenuItemAbrirOrderByComisionMarca;
	protected JMenuItem jMenuItemMostrarOcultarComisionMarca;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesComisionMarca;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosComisionMarca;
	protected JCheckBox jCheckBoxSeleccionadosComisionMarca;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaComisionMarca;
	protected JCheckBox jCheckBoxConGraficoReporteComisionMarca;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesComisionMarca;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesComisionMarca;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoComisionMarca;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoComisionMarca;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesComisionMarca;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionComisionMarca;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesComisionMarca;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesComisionMarca;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarComisionMarca;
	protected JTextField jTextFieldValorCampoGeneralComisionMarca;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteComisionMarca;
	//public JList<Reporte> jListColumnasSelectReporteComisionMarca;
	//public JScrollPane jScrollColumnasSelectReporteComisionMarca;
	
	//public JLabel jLabelRelacionesSelectReporteComisionMarca;
	//public JList<Reporte> jListRelacionesSelectReporteComisionMarca;
	//public JScrollPane jScrollRelacionesSelectReporteComisionMarca;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoComisionMarca;
	//protected JCheckBox jCheckBoxConGraficoDinamicoComisionMarca;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoComisionMarca;
	//public JLabel jLabelTiposArchivoReporteDinamicoComisionMarca;
	
		
	//public JLabel jLabelArchivoImportacionComisionMarca;	
	//public JLabel jLabelPathArchivoImportacionComisionMarca;
	//protected JTextField jTextFieldPathArchivoImportacionComisionMarca;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoComisionMarca;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoComisionMarca;
	
	//public JLabel jLabelColumnaCategoriaValorComisionMarca;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorComisionMarca;
	
	//public JLabel jLabelColumnasValoresGraficoComisionMarca;
	//public JList<Reporte> jListColumnasValoresGraficoComisionMarca;
	//public JScrollPane jScrollColumnasValoresGraficoComisionMarca;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoComisionMarca;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoComisionMarca;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasComisionMarca;
	public JPanel jPanelFK_IdComisionConfigComisionMarca;
	public JButton jButtonFK_IdComisionConfigComisionMarca;
	
	public JPanel jPanelid_comision_configFK_IdComisionConfigComisionMarca;
	public JLabel jLabelid_comision_configFK_IdComisionConfigComisionMarca;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_comision_configFK_IdComisionConfigComisionMarca;
	public JButton jButtonid_comision_configFK_IdComisionConfigComisionMarca= new JButtonMe();
	public JButton jButtonid_comision_configFK_IdComisionConfigComisionMarcaUpdate= new JButtonMe();
	public JButton jButtonid_comision_configFK_IdComisionConfigComisionMarcaBusqueda= new JButtonMe();

	
	
	
	
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
	public ComisionMarcaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ComisionMarca No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionMarcaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComisionMarca No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionMarcaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComisionMarca No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionMarcaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ComisionMarca No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionComisionMarca)	{
		this.jButtonRecargarInformacionComisionMarca = jButtonRecargarInformacionComisionMarca;
	}
	
	public JButton getjButtonProcesarInformacionComisionMarca() {
		return this.jButtonProcesarInformacionComisionMarca;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionComisionMarca)	{
		this.jButtonProcesarInformacionComisionMarca = jButtonProcesarInformacionComisionMarca;
	}
	
	
	public JButton getjButtonRecargarInformacionComisionMarca() {
		return this.jButtonRecargarInformacionComisionMarca;
	}
	
	
	public List<ComisionMarca> getcomisionmarcas() {
		return this.comisionmarcas;
	}

	public void setcomisionmarcas(List<ComisionMarca> comisionmarcas) {
		this.comisionmarcas = comisionmarcas;
	}
	
	public List<ComisionMarca> getcomisionmarcasAux() {
		return this.comisionmarcasAux;
	}

	public void setcomisionmarcasAux(List<ComisionMarca> comisionmarcasAux) {
		this.comisionmarcasAux = comisionmarcasAux;
	}
	
	public List<ComisionMarca> getcomisionmarcasEliminados() {
		return this.comisionmarcasEliminados;
	}

	public void setComisionMarcasEliminados(List<ComisionMarca> comisionmarcasEliminados) {
		this.comisionmarcasEliminados = comisionmarcasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarComisionMarca() {
		return jComboBoxTiposSeleccionarComisionMarca;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarComisionMarca(
			JComboBox jComboBoxTiposSeleccionarComisionMarca) {
		this.jComboBoxTiposSeleccionarComisionMarca = jComboBoxTiposSeleccionarComisionMarca;
	}
	
	public void setBorderResaltarTiposSeleccionarComisionMarca() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarComisionMarca.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarComisionMarca .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralComisionMarca() {
		return jTextFieldValorCampoGeneralComisionMarca;
	}

	public void setjTextFieldValorCampoGeneralComisionMarca(
			JTextField jTextFieldValorCampoGeneralComisionMarca) {
		this.jTextFieldValorCampoGeneralComisionMarca = jTextFieldValorCampoGeneralComisionMarca;
	}

	public void setBorderResaltarValorCampoGeneralComisionMarca() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionMarca.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralComisionMarca .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosComisionMarca() {
		return this.jCheckBoxSeleccionarTodosComisionMarca;
	}

	public void setjCheckBoxSeleccionarTodosComisionMarca(
			JCheckBox jCheckBoxSeleccionarTodosComisionMarca) {
		this.jCheckBoxSeleccionarTodosComisionMarca = jCheckBoxSeleccionarTodosComisionMarca;
	}

	public void setBorderResaltarSeleccionarTodosComisionMarca() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionMarca.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosComisionMarca .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosComisionMarca() {
		return this.jCheckBoxSeleccionadosComisionMarca;
	}

	public void setjCheckBoxSeleccionadosComisionMarca(
			JCheckBox jCheckBoxSeleccionadosComisionMarca) {
		this.jCheckBoxSeleccionadosComisionMarca = jCheckBoxSeleccionadosComisionMarca;
	}
	
	public void setBorderResaltarSeleccionadosComisionMarca() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionMarca.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosComisionMarca .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesComisionMarca() {
		return this.jComboBoxTiposArchivosReportesComisionMarca;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesComisionMarca(
			JComboBox jComboBoxTiposArchivosReportesComisionMarca) {
		this.jComboBoxTiposArchivosReportesComisionMarca = jComboBoxTiposArchivosReportesComisionMarca;
	}

	public void setBorderResaltarTiposArchivosReportesComisionMarca() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionMarca.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesComisionMarca .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesComisionMarca() {
		return this.jComboBoxTiposReportesComisionMarca;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesComisionMarca(
			JComboBox jComboBoxTiposReportesComisionMarca) {
		this.jComboBoxTiposReportesComisionMarca = jComboBoxTiposReportesComisionMarca;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoComisionMarca() {
	//	return jComboBoxTiposReportesDinamicoComisionMarca;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoComisionMarca(
	//		JComboBox jComboBoxTiposReportesDinamicoComisionMarca) {
	//	this.jComboBoxTiposReportesDinamicoComisionMarca = jComboBoxTiposReportesDinamicoComisionMarca;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoComisionMarca() {
	//	return jComboBoxTiposArchivosReportesDinamicoComisionMarca;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoComisionMarca(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoComisionMarca) {
	//	this.jComboBoxTiposArchivosReportesDinamicoComisionMarca = jComboBoxTiposArchivosReportesDinamicoComisionMarca;
	//}
	
	public void setBorderResaltarTiposReportesComisionMarca() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionMarca.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesComisionMarca .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesComisionMarca() {
		return this.jComboBoxTiposGraficosReportesComisionMarca;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesComisionMarca(
			JComboBox jComboBoxTiposGraficosReportesComisionMarca) {
		this.jComboBoxTiposGraficosReportesComisionMarca = jComboBoxTiposGraficosReportesComisionMarca;
	}
	
	public void setBorderResaltarTiposGraficosReportesComisionMarca() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionMarca.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesComisionMarca .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionComisionMarca() {
		return this.jComboBoxTiposPaginacionComisionMarca;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionComisionMarca(
			JComboBox jComboBoxTiposPaginacionComisionMarca) {
		this.jComboBoxTiposPaginacionComisionMarca = jComboBoxTiposPaginacionComisionMarca;
	}
	
	public void setBorderResaltarTiposPaginacionComisionMarca() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionMarca.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionComisionMarca .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesComisionMarca() {
		return this.jComboBoxTiposRelacionesComisionMarca;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesComisionMarca() {
		return this.jComboBoxTiposAccionesComisionMarca;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesComisionMarca(
			JComboBox jComboBoxTiposRelacionesComisionMarca) {
		this.jComboBoxTiposRelacionesComisionMarca = jComboBoxTiposRelacionesComisionMarca;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesComisionMarca(
			JComboBox jComboBoxTiposAccionesComisionMarca) {
		this.jComboBoxTiposAccionesComisionMarca = jComboBoxTiposAccionesComisionMarca;
	}
	
	public void setBorderResaltarTiposRelacionesComisionMarca() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionMarca.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesComisionMarca .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesComisionMarca() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionMarca.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesComisionMarca .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoComisionMarca() {
	//	return jCheckBoxConGraficoDinamicoComisionMarca;
	//}

	//public void setjCheckBoxConGraficoDinamicoComisionMarca(
	//		JCheckBox jCheckBoxConGraficoDinamicoComisionMarca) {
	//	this.jCheckBoxConGraficoDinamicoComisionMarca = jCheckBoxConGraficoDinamicoComisionMarca;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoComisionMarca() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarComisionMarca.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoComisionMarca .setBorder(borderResaltar);		
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
		this.comisionmarcaSessionBean=new ComisionMarcaSessionBean();
		
		this.comisionmarcaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comisionmarcaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.comisionmarcaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ComisionMarcaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ComisionMarcaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ComisionMarcaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ComisionMarcaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ComisionMarcaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Comision Marca MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {
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
		
		ComisionMarcaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ComisionMarca No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarComisionMarca= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarComisionMarca=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarComisionMarca,this.jTtoolBarComisionMarca,
							"nuevo","nuevo","Nuevo"+" "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarComisionMarca=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarComisionMarca,this.jTtoolBarComisionMarca,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarComisionMarca=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarComisionMarca,this.jTtoolBarComisionMarca,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarComisionMarca=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarComisionMarca,this.jTtoolBarComisionMarca,
							"duplicar","duplicar","Duplicar"+" "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarComisionMarca=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarComisionMarca,this.jTtoolBarComisionMarca,
							"copiar","copiar","Copiar"+" "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarComisionMarca=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarComisionMarca,this.jTtoolBarComisionMarca,
							"ver_form","ver_form","Ver"+" "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarComisionMarca=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComisionMarca,this.jTtoolBarComisionMarca,
							"recargar","recargar","Recargar"+" "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarComisionMarca=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComisionMarca,this.jTtoolBarComisionMarca,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarComisionMarca=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComisionMarca,this.jTtoolBarComisionMarca,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarComisionMarca=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarComisionMarca,this.jTtoolBarComisionMarca,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarComisionMarca=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarComisionMarca,this.jTtoolBarComisionMarca,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarComisionMarca=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarComisionMarca,this.jTtoolBarComisionMarca,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarComisionMarca=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarComisionMarca,this.jTtoolBarComisionMarca,
							"cerrar","cerrar","Salir"+" "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarComisionMarca=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarComisionMarca;
			
				this.jButtonProcesarInformacionToolBarComisionMarca=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarComisionMarca;
				
		//protected JButton jButtonModificarToolBarComisionMarca;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarComisionMarca=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuComisionMarca=new JMenuMe("General");
		this.jmenuArchivoComisionMarca=new JMenuMe("Archivo");
		this.jmenuAccionesComisionMarca=new JMenuMe("Acciones");
		this.jmenuDatosComisionMarca=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoComisionMarca= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoComisionMarca.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoComisionMarca,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarComisionMarca= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarComisionMarca.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarComisionMarca,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesComisionMarca= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesComisionMarca.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesComisionMarca,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosComisionMarca= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosComisionMarca.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosComisionMarca,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarComisionMarca= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarComisionMarca.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarComisionMarca,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormComisionMarca= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormComisionMarca.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormComisionMarca,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaComisionMarca= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaComisionMarca.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaComisionMarca,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarComisionMarca= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarComisionMarca.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarComisionMarca,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionComisionMarca= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionComisionMarca.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionComisionMarca,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionComisionMarca= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionComisionMarca.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionComisionMarca,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresComisionMarca= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresComisionMarca.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresComisionMarca,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesComisionMarca= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesComisionMarca.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesComisionMarca,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByComisionMarca= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByComisionMarca.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByComisionMarca,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarComisionMarca= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarComisionMarca.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarComisionMarca,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByComisionMarca= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByComisionMarca.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByComisionMarca,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarComisionMarca= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarComisionMarca.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarComisionMarca,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosComisionMarca= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosComisionMarca.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosComisionMarca,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoComisionMarca.add(this.jMenuItemCerrarComisionMarca);
			
			this.jmenuAccionesComisionMarca.add(this.jMenuItemNuevoComisionMarca);
			this.jmenuAccionesComisionMarca.add(this.jMenuItemNuevoGuardarCambiosComisionMarca);
			this.jmenuAccionesComisionMarca.add(this.jMenuItemNuevoRelacionesComisionMarca);
			this.jmenuAccionesComisionMarca.add(this.jMenuItemGuardarCambiosTablaComisionMarca);		
			this.jmenuAccionesComisionMarca.add(this.jMenuItemDuplicarComisionMarca);		
			this.jmenuAccionesComisionMarca.add(this.jMenuItemCopiarComisionMarca);		
			this.jmenuAccionesComisionMarca.add(this.jMenuItemVerFormComisionMarca);		
			
			this.jmenuDatosComisionMarca.add(this.jMenuItemRecargarInformacionComisionMarca);				
			this.jmenuDatosComisionMarca.add(this.jMenuItemAnterioresComisionMarca);				
			this.jmenuDatosComisionMarca.add(this.jMenuItemSiguientesComisionMarca);				
			this.jmenuDatosComisionMarca.add(this.jMenuItemAbrirOrderByComisionMarca);				
			this.jmenuDatosComisionMarca.add(this.jMenuItemMostrarOcultarComisionMarca);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesComisionMarca.add(this.jMenuItemGuardarCambiosComisionMarca);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarComisionMarca.add(this.jmenuArchivoComisionMarca);		
			this.jmenuBarComisionMarca.add(this.jmenuAccionesComisionMarca);		
			this.jmenuBarComisionMarca.add(this.jmenuDatosComisionMarca);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarComisionMarca);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasComisionMarca() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdComisionConfigComisionMarca=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdComisionConfigComisionMarca.setToolTipText("Buscar Por Configuracion ");
		this.jButtonFK_IdComisionConfigComisionMarca= new JButtonMe();
		this.jButtonFK_IdComisionConfigComisionMarca.setText("Buscar");
		this.jButtonFK_IdComisionConfigComisionMarca.setToolTipText("Buscar Por Configuracion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdComisionConfigComisionMarca,"buscar_button","Buscar Por Configuracion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdComisionConfigComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_comision_configFK_IdComisionConfigComisionMarca = new JLabelMe();
		jLabelid_comision_configFK_IdComisionConfigComisionMarca.setText("Configuracion :");
		jLabelid_comision_configFK_IdComisionConfigComisionMarca.setToolTipText("Configuracion");
		jLabelid_comision_configFK_IdComisionConfigComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_comision_configFK_IdComisionConfigComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_comision_configFK_IdComisionConfigComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_comision_configFK_IdComisionConfigComisionMarca,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_comision_configFK_IdComisionConfigComisionMarca= new JComboBoxMe();
		jComboBoxid_comision_configFK_IdComisionConfigComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_comision_configFK_IdComisionConfigComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_comision_configFK_IdComisionConfigComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_comision_configFK_IdComisionConfigComisionMarca,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasComisionMarca=new JTabbedPane();


		this.jTabbedPaneBusquedasComisionMarca.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasComisionMarca.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasComisionMarca.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasComisionMarca.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasComisionMarca.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasComisionMarca,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleComisionMarca = new ComisionMarcaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Comision Marca DATOS");
			this.jInternalFrameDetalleFormComisionMarca = new ComisionMarcaDetalleFormJInternalFrame(jDesktopPane,this.comisionmarcaSessionBean.getConGuardarRelaciones(),this.comisionmarcaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormComisionMarca = null;//new ComisionMarcaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutComisionMarca= new GridBagLayout();
		
		
		this.jTableDatosComisionMarca = new JTableMe();      
		
		String sToolTipComisionMarca="";
		sToolTipComisionMarca=ComisionMarcaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipComisionMarca+="(Comisiones.ComisionMarca)";
		}
		
		if(!this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {
			sToolTipComisionMarca+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosComisionMarca.setToolTipText(sToolTipComisionMarca);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosComisionMarca);
		this.jTableDatosComisionMarca.setAutoCreateRowSorter(true);
		this.jTableDatosComisionMarca.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosComisionMarca.setRowSelectionAllowed(true);
		this.jTableDatosComisionMarca.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosComisionMarca,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoComisionMarca = new JButtonMe();
		this.jButtonDuplicarComisionMarca = new JButtonMe();
		this.jButtonCopiarComisionMarca = new JButtonMe();
		this.jButtonVerFormComisionMarca = new JButtonMe();
		this.jButtonNuevoRelacionesComisionMarca = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaComisionMarca = new JButtonMe();
		this.jButtonCerrarComisionMarca = new JButtonMe();
		
		this.jScrollPanelDatosComisionMarca = new JScrollPane();   
        this.jScrollPanelDatosGeneralComisionMarca = new JScrollPane();
		
				
		
		
		this.jPanelAccionesComisionMarca = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Comision Marca";
		
		if(!this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosComisionMarca.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comision Marcas" + this.sPath));
		} else {
			this.jScrollPanelDatosComisionMarca.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralComisionMarca.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesComisionMarca.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesComisionMarca.setToolTipText("Acciones");
        this.jPanelAccionesComisionMarca.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralComisionMarca, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosComisionMarca, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoComisionMarca=new ReporteDinamicoJInternalFrame(ComisionMarcaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoComisionMarca();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionComisionMarca=new ImportacionJInternalFrame(ComisionMarcaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionComisionMarca();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByComisionMarca = new JButtonMe();
		
		this.jButtonAbrirOrderByComisionMarca.setText("Orden");
		this.jButtonAbrirOrderByComisionMarca.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByComisionMarca,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByComisionMarca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByComisionMarca.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByComisionMarca=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComisionMarca,false,this);
			
			//this.cargarOrderByComisionMarca(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByComisionMarca=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComisionMarca,true,this);
			
			//this.cargarOrderByComisionMarca(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosComisionMarca.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosComisionMarca.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosComisionMarca.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosComisionMarca.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosComisionMarca.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosComisionMarca.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoComisionMarca.setText("Nuevo");
		this.jButtonDuplicarComisionMarca.setText("Duplicar");
		this.jButtonCopiarComisionMarca.setText("Copiar");
		this.jButtonVerFormComisionMarca.setText("Ver");
		this.jButtonNuevoRelacionesComisionMarca.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaComisionMarca.setText("Guardar");
		this.jButtonCerrarComisionMarca.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoComisionMarca,"nuevo_button","Nuevo",this.comisionmarcaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarComisionMarca,"duplicar_button","Duplicar",this.comisionmarcaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarComisionMarca,"copiar_button","Copiar",this.comisionmarcaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormComisionMarca,"ver_form","Ver",this.comisionmarcaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesComisionMarca,"nuevorelaciones_button","Nuevo Rel",this.comisionmarcaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaComisionMarca,"guardarcambiostabla_button","Guardar",this.comisionmarcaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarComisionMarca,"cerrar_button","Salir",this.comisionmarcaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoComisionMarca.setToolTipText("Nuevo"+" "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarComisionMarca.setToolTipText("Duplicar"+" "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarComisionMarca.setToolTipText("Copiar"+" "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormComisionMarca.setToolTipText("Ver"+" "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesComisionMarca.setToolTipText("Nuevo Rel"+" "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaComisionMarca.setToolTipText("Guardar"+" "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarComisionMarca.setToolTipText("Salir"+" "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoComisionMarca";
		inputMap = this.jButtonNuevoComisionMarca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoComisionMarca.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoComisionMarca"));
		
		//DUPLICAR
		sMapKey = "DuplicarComisionMarca";
		inputMap = this.jButtonDuplicarComisionMarca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarComisionMarca.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarComisionMarca"));
		
		//COPIAR
		sMapKey = "CopiarComisionMarca";
		inputMap = this.jButtonCopiarComisionMarca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarComisionMarca.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarComisionMarca"));
		
		//VEr FORM
		sMapKey = "VerFormComisionMarca";
		inputMap = this.jButtonVerFormComisionMarca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormComisionMarca.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormComisionMarca"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesComisionMarca";
		inputMap = this.jButtonNuevoRelacionesComisionMarca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesComisionMarca.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesComisionMarca"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarComisionMarca";
		inputMap = this.jButtonModificarComisionMarca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarComisionMarca.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarComisionMarca"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarComisionMarca";
		inputMap = this.jButtonCerrarComisionMarca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarComisionMarca.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarComisionMarca"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaComisionMarca";
		inputMap = this.jButtonGuardarCambiosTablaComisionMarca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaComisionMarca.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaComisionMarca"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesComisionMarca = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesComisionMarca = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionComisionMarca = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ComisionMarca= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ComisionMarca= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ComisionMarca= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ComisionMarca= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ComisionMarca= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesComisionMarca.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesComisionMarca.setName("jPanelParametrosReportesComisionMarca"); 
		
		this.jPanelParametrosReportesAccionesComisionMarca.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesComisionMarca.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesComisionMarca.setName("jPanelParametrosReportesAccionesComisionMarca"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesComisionMarca, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesComisionMarca, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionComisionMarca = new JButtonMe();
		this.jButtonRecargarInformacionComisionMarca.setText("Recargar");
		this.jButtonRecargarInformacionComisionMarca.setToolTipText("Recargar"+" "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionComisionMarca,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionComisionMarca = new JButtonMe();
		this.jButtonProcesarInformacionComisionMarca.setText("Procesar");
		this.jButtonProcesarInformacionComisionMarca.setToolTipText("Procesar"+" "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionComisionMarca.setVisible(false);
			
		this.jButtonProcesarInformacionComisionMarca.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionComisionMarca.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionComisionMarca.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesComisionMarca = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComisionMarca.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesComisionMarca.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesComisionMarca = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComisionMarca.setText("TIPO");       
		this.jComboBoxTiposReportesComisionMarca.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesComisionMarca = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComisionMarca.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesComisionMarca.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionComisionMarca = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionComisionMarca.setText("Paginacion");
		this.jComboBoxTiposPaginacionComisionMarca.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesComisionMarca = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesComisionMarca.setText("Accion");
		this.jComboBoxTiposRelacionesComisionMarca.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesComisionMarca = new JComboBoxMe();
		//this.jComboBoxTiposAccionesComisionMarca.setText("Accion");
		this.jComboBoxTiposAccionesComisionMarca.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarComisionMarca = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarComisionMarca.setText("Accion");
		this.jComboBoxTiposSeleccionarComisionMarca.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralComisionMarca=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralComisionMarca.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralComisionMarca.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralComisionMarca.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesComisionMarca = new JLabelMe();
		
		this.jLabelAccionesComisionMarca.setText("Acciones");		
		this.jLabelAccionesComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosComisionMarca = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosComisionMarca.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosComisionMarca.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosComisionMarca = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosComisionMarca.setText("Seleccionados");
		this.jCheckBoxSeleccionadosComisionMarca.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaComisionMarca = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaComisionMarca.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaComisionMarca.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteComisionMarca = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteComisionMarca.setText("Graf.");
		this.jCheckBoxConGraficoReporteComisionMarca.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresComisionMarca = new JButtonMe();
		//this.jButtonAnterioresComisionMarca.setText("<<");
        this.jButtonAnterioresComisionMarca.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresComisionMarca,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesComisionMarca = new JButtonMe();
		//this.jButtonSiguientesComisionMarca.setText(">>");
        this.jButtonSiguientesComisionMarca.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesComisionMarca,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosComisionMarca = new JButtonMe();
		this.jButtonNuevoGuardarCambiosComisionMarca.setText("Nue");
        this.jButtonNuevoGuardarCambiosComisionMarca.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosComisionMarca,"nuevoguardarcambios_button","Nue",this.comisionmarcaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosComisionMarca";
		inputMap = this.jButtonNuevoGuardarCambiosComisionMarca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosComisionMarca.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosComisionMarca"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionComisionMarca";
		inputMap = this.jButtonRecargarInformacionComisionMarca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionComisionMarca.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionComisionMarca"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesComisionMarca";
		inputMap = this.jButtonSiguientesComisionMarca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesComisionMarca.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesComisionMarca"));
		
		//ANTERIORES		
		sMapKey = "AnterioresComisionMarca";
		inputMap = this.jButtonAnterioresComisionMarca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresComisionMarca.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresComisionMarca"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasComisionMarca();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesComisionMarca.setMinimumSize(new Dimension(this.getWidth(),ComisionMarcaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComisionMarcaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesComisionMarca.setMaximumSize(new Dimension(this.getWidth(),ComisionMarcaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComisionMarcaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesComisionMarca.setPreferredSize(new Dimension(this.getWidth(),ComisionMarcaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComisionMarcaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionComisionMarca = new GridBagLayout();

			this.jPanelPaginacionComisionMarca.setLayout(gridaBagLayoutPaginacionComisionMarca);						
			
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionMarca.gridy = 0;
			this.gridBagConstraintsComisionMarca.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionComisionMarca.add(this.jButtonAnterioresComisionMarca, this.gridBagConstraintsComisionMarca);
					
						
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsComisionMarca.gridy = 0;
			
			this.jPanelPaginacionComisionMarca.add(this.jButtonNuevoGuardarCambiosComisionMarca, this.gridBagConstraintsComisionMarca);
						
			
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsComisionMarca.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsComisionMarca.gridy = 0;
			this.jPanelPaginacionComisionMarca.add(this.jButtonSiguientesComisionMarca, this.gridBagConstraintsComisionMarca);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionMarca.gridy = 1;
			this.gridBagConstraintsComisionMarca.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComisionMarca.add(this.jButtonNuevoComisionMarca, this.gridBagConstraintsComisionMarca);
						
			
			
			if(!this.comisionmarcaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsComisionMarca = new GridBagConstraints();
				this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsComisionMarca.gridy = 1;
				this.gridBagConstraintsComisionMarca.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionComisionMarca.add(this.jButtonGuardarCambiosTablaComisionMarca, this.gridBagConstraintsComisionMarca);
			}
			
			
			
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionMarca.gridy = 1;
			this.gridBagConstraintsComisionMarca.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComisionMarca.add(this.jButtonDuplicarComisionMarca, this.gridBagConstraintsComisionMarca);
			
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionMarca.gridy = 1;
			this.gridBagConstraintsComisionMarca.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComisionMarca.add(this.jButtonCopiarComisionMarca, this.gridBagConstraintsComisionMarca);
		
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionMarca.gridy = 1;
			this.gridBagConstraintsComisionMarca.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComisionMarca.add(this.jButtonVerFormComisionMarca, this.gridBagConstraintsComisionMarca);
		
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionMarca.gridy = 1;
			this.gridBagConstraintsComisionMarca.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionComisionMarca.add(this.jButtonCerrarComisionMarca, this.gridBagConstraintsComisionMarca);
		
		
		
		this.jButtonRecargarInformacionComisionMarca.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionComisionMarca.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionComisionMarca.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesComisionMarca.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesComisionMarca.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesComisionMarca.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesComisionMarca.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesComisionMarca.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesComisionMarca.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesComisionMarca.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesComisionMarca.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesComisionMarca.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionComisionMarca.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionComisionMarca.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionComisionMarca.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesComisionMarca.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesComisionMarca.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesComisionMarca.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesComisionMarca.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComisionMarca.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComisionMarca.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarComisionMarca.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarComisionMarca.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarComisionMarca.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaComisionMarca.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaComisionMarca.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaComisionMarca.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteComisionMarca.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteComisionMarca.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteComisionMarca.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosComisionMarca.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosComisionMarca.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosComisionMarca.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosComisionMarca.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosComisionMarca.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosComisionMarca.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesComisionMarca = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesComisionMarca = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ComisionMarca = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ComisionMarca = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ComisionMarca = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ComisionMarca = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesComisionMarca.setLayout(gridaBagParametrosReportesComisionMarca);
			this.jPanelParametrosReportesAccionesComisionMarca.setLayout(gridaBagParametrosReportesAccionesComisionMarca);
			
			
			this.jPanelParametrosAuxiliar1ComisionMarca.setLayout(gridaBagParametrosAuxiliar1ComisionMarca);
			this.jPanelParametrosAuxiliar2ComisionMarca.setLayout(gridaBagParametrosAuxiliar2ComisionMarca);
			this.jPanelParametrosAuxiliar3ComisionMarca.setLayout(gridaBagParametrosAuxiliar3ComisionMarca);
			this.jPanelParametrosAuxiliar4ComisionMarca.setLayout(gridaBagParametrosAuxiliar4ComisionMarca);
			//this.jPanelParametrosAuxiliar5ComisionMarca.setLayout(gridaBagParametrosAuxiliar2ComisionMarca);			
			
			
			
			
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionMarca.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComisionMarca.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComisionMarca.add(this.jButtonRecargarInformacionComisionMarca, this.gridBagConstraintsComisionMarca);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionMarca.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComisionMarca.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComisionMarca.add(this.jComboBoxTiposPaginacionComisionMarca, this.gridBagConstraintsComisionMarca);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionMarca.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComisionMarca.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComisionMarca.add(this.jCheckBoxConAltoMaximoTablaComisionMarca, this.gridBagConstraintsComisionMarca);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionMarca.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComisionMarca.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComisionMarca.add(this.jComboBoxTiposArchivosReportesComisionMarca, this.gridBagConstraintsComisionMarca);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionMarca.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionMarca.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisionMarca.add(this.jPanelParametrosAuxiliar1ComisionMarca, this.gridBagConstraintsComisionMarca);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionMarca.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComisionMarca.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ComisionMarca.add(this.jComboBoxTiposReportesComisionMarca, this.gridBagConstraintsComisionMarca);																		
			
			
			
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionMarca.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComisionMarca.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ComisionMarca.add(this.jComboBoxTiposGraficosReportesComisionMarca, this.gridBagConstraintsComisionMarca);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionMarca.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionMarca.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisionMarca.add(this.jPanelParametrosAuxiliar4ComisionMarca, this.gridBagConstraintsComisionMarca);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionMarca.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsComisionMarca.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisionMarca.add(this.jComboBoxTiposReportesComisionMarca, this.gridBagConstraintsComisionMarca);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionMarca.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionMarca.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComisionMarca.add(this.jCheckBoxGenerarReporteComisionMarca, this.gridBagConstraintsComisionMarca);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionMarca.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionMarca.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisionMarca.add(this.jPanelParametrosAuxiliar2ComisionMarca, this.gridBagConstraintsComisionMarca);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionMarca.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComisionMarca.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComisionMarca.add(this.jLabelAccionesComisionMarca, this.gridBagConstraintsComisionMarca);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsComisionMarca = new GridBagConstraints();
				this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsComisionMarca.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsComisionMarca.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesComisionMarca.add(this.jButtonAbrirOrderByComisionMarca, this.gridBagConstraintsComisionMarca);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsComisionMarca.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionMarca.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComisionMarca.add(this.jComboBoxTiposSeleccionarComisionMarca, this.gridBagConstraintsComisionMarca);			
			
			
			/*
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionMarca.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComisionMarca.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComisionMarca.add(this.jCheckBoxSeleccionarTodosComisionMarca, this.gridBagConstraintsComisionMarca);
			
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionMarca.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComisionMarca.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComisionMarca.add(this.jCheckBoxConGraficoReporteComisionMarca, this.gridBagConstraintsComisionMarca);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionMarca.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComisionMarca.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComisionMarca.add(this.jCheckBoxSeleccionarTodosComisionMarca, this.gridBagConstraintsComisionMarca);															
				
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionMarca.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComisionMarca.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComisionMarca.add(this.jCheckBoxSeleccionadosComisionMarca, this.gridBagConstraintsComisionMarca);															
			
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionMarca.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComisionMarca.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComisionMarca.add(this.jCheckBoxConGraficoReporteComisionMarca, this.gridBagConstraintsComisionMarca);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionMarca.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionMarca.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisionMarca.add(this.jPanelParametrosAuxiliar3ComisionMarca, this.gridBagConstraintsComisionMarca);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionMarca.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComisionMarca.add(this.jComboBoxTiposAccionesComisionMarca, this.gridBagConstraintsComisionMarca);
	
				
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionMarca.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComisionMarca.add(this.jTextFieldValorCampoGeneralComisionMarca, this.gridBagConstraintsComisionMarca);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosComisionMarca = new GridBagLayout();

			this.jScrollPanelDatosComisionMarca.setLayout(gridaBagLayoutDatosComisionMarca);
			
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionMarca.gridy = 0;
			this.gridBagConstraintsComisionMarca.gridx = 0;
			
			this.jScrollPanelDatosComisionMarca.add(this.jTableDatosComisionMarca, this.gridBagConstraintsComisionMarca);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosComisionMarca.setViewportView(this.jTableDatosComisionMarca);
		this.jTableDatosComisionMarca.setFillsViewportHeight(true);
		this.jTableDatosComisionMarca.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesComisionMarca= new GridBagLayout();
		this.jPanelAccionesComisionMarca.setLayout(gridaBagLayoutAccionesComisionMarca);
		
		
		/*	
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionMarca.gridy = 0;
		this.gridBagConstraintsComisionMarca.gridx = 0;
			
		this.jPanelAccionesComisionMarca.add(this.jButtonNuevoComisionMarca, this.gridBagConstraintsComisionMarca);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdComisionConfigComisionMarca= new GridBagLayout();
		gridaBagLayoutFK_IdComisionConfigComisionMarca.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdComisionConfigComisionMarca.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdComisionConfigComisionMarca.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdComisionConfigComisionMarca.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdComisionConfigComisionMarca.setLayout(gridaBagLayoutFK_IdComisionConfigComisionMarca);

		gridBagConstraintsComisionMarca = new GridBagConstraints();
		gridBagConstraintsComisionMarca.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComisionMarca.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComisionMarca.gridy = 0;
		gridBagConstraintsComisionMarca.gridx = 0;
		jPanelFK_IdComisionConfigComisionMarca.add(jLabelid_comision_configFK_IdComisionConfigComisionMarca, gridBagConstraintsComisionMarca);

		gridBagConstraintsComisionMarca = new GridBagConstraints();
		gridBagConstraintsComisionMarca.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComisionMarca.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComisionMarca.gridy = 0;
		gridBagConstraintsComisionMarca.gridx = 1;
		jPanelFK_IdComisionConfigComisionMarca.add(jComboBoxid_comision_configFK_IdComisionConfigComisionMarca, gridBagConstraintsComisionMarca);

		gridBagConstraintsComisionMarca = new GridBagConstraints();
		gridBagConstraintsComisionMarca.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComisionMarca.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComisionMarca.gridy = 1;
		gridBagConstraintsComisionMarca.gridx =1;
		jPanelFK_IdComisionConfigComisionMarca.add(jButtonFK_IdComisionConfigComisionMarca, gridBagConstraintsComisionMarca);

		jTabbedPaneBusquedasComisionMarca.addTab("1.-Por Configuracion ", jPanelFK_IdComisionConfigComisionMarca);
		jTabbedPaneBusquedasComisionMarca.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutComisionMarca = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutComisionMarca);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();						
			this.gridBagConstraintsComisionMarca.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComisionMarca.gridx = 0;		
			//this.gridBagConstraintsComisionMarca.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionMarca.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsComisionMarca.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarComisionMarca, this.gridBagConstraintsComisionMarca);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.gridy = iGridyPrincipal++;
		this.gridBagConstraintsComisionMarca.gridx = 0;		
		//this.gridBagConstraintsComisionMarca.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionMarca.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsComisionMarca.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsComisionMarca);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsComisionMarca.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComisionMarca.gridx = 0;		
			this.gridBagConstraintsComisionMarca.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionMarca.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsComisionMarca.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasComisionMarca, this.gridBagConstraintsComisionMarca);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionMarca.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesComisionMarca, this.gridBagConstraintsComisionMarca);								
		
		
		/*
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionMarca.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesComisionMarca, this.gridBagConstraintsComisionMarca);
		*/		
		
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.gridy =iGridyPrincipal++;
		this.gridBagConstraintsComisionMarca.gridx =0;
		this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsComisionMarca.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosComisionMarca, this.gridBagConstraintsComisionMarca);
				
		
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionMarca.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionComisionMarca, this.gridBagConstraintsComisionMarca);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ComisionMarcaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosComisionMarca= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosComisionMarca = new GridBagLayout();
			this.jPanelBusquedasParametrosComisionMarca.setLayout(gridaBagLayoutBusquedasParametrosComisionMarca);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralComisionMarca=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralComisionMarca.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComisionMarca.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComisionMarca.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionMarca.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposComisionMarca, this.gridBagConstraintsComisionMarca);
			
			
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionMarca.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosComisionMarca, this.gridBagConstraintsComisionMarca);
		
			
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsComisionMarca.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesComisionMarca, this.gridBagConstraintsComisionMarca);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralComisionMarca;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoComisionMarca() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoComisionMarca = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoComisionMarca = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoComisionMarca.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoComisionMarca.setName("jPanelReporteDinamicoComisionMarca"); 
		
		this.jPanelReporteDinamicoComisionMarca.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoComisionMarca.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoComisionMarca.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoComisionMarca.setLayout(gridaBagLayoutReporteDinamicoComisionMarca);
		
		
		this.jInternalFrameReporteDinamicoComisionMarca= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoComisionMarca = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteComisionMarca= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoComisionMarca.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoComisionMarca.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoComisionMarca.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoComisionMarca.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoComisionMarca.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoComisionMarca.setResizable(true);
	    this.jInternalFrameReporteDinamicoComisionMarca.setClosable(true);
	    this.jInternalFrameReporteDinamicoComisionMarca.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoComisionMarca.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoComisionMarca.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoComisionMarca.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoComisionMarca.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comision Marcas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteComisionMarca = new JLabelMe();

		this.jLabelColumnasSelectReporteComisionMarca.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionMarca.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionMarca.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComisionMarca.add(this.jLabelColumnasSelectReporteComisionMarca, this.gridBagConstraintsComisionMarca);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteComisionMarca = new JList<Reporte>();
		this.jListColumnasSelectReporteComisionMarca.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteComisionMarca.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteComisionMarca.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteComisionMarca.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteComisionMarca.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteComisionMarca=new JScrollPane(this.jListColumnasSelectReporteComisionMarca);
			
			this.jScrollColumnasSelectReporteComisionMarca.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteComisionMarca.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteComisionMarca.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteComisionMarca.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionMarca.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionMarca.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoComisionMarca.add(this.jListColumnasSelectReporteComisionMarca, this.gridBagConstraintsComisionMarca);
		this.jPanelReporteDinamicoComisionMarca.add(this.jScrollColumnasSelectReporteComisionMarca, this.gridBagConstraintsComisionMarca);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteComisionMarca = new JLabelMe();

		this.jLabelRelacionesSelectReporteComisionMarca.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteComisionMarca = new JList<Reporte>();
		this.jListRelacionesSelectReporteComisionMarca.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteComisionMarca.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteComisionMarca.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteComisionMarca.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteComisionMarca.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteComisionMarca=new JScrollPane(this.jListRelacionesSelectReporteComisionMarca);
			
			this.jScrollRelacionesSelectReporteComisionMarca.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteComisionMarca.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteComisionMarca.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteComisionMarca.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoComisionMarca = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoComisionMarca = new JComboBoxMe();
		this.jListColumnasValoresGraficoComisionMarca = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoComisionMarca = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoComisionMarca.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoComisionMarca.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoComisionMarca.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoComisionMarca.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoComisionMarca = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoComisionMarca.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoComisionMarca.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoComisionMarca.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoComisionMarca.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoComisionMarca = new JLabelMe();

		this.jLabelConGraficoDinamicoComisionMarca.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionMarca.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionMarca.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComisionMarca.add(this.jLabelConGraficoDinamicoComisionMarca, this.gridBagConstraintsComisionMarca);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoComisionMarca = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoComisionMarca.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoComisionMarca.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoComisionMarca.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoComisionMarca.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoComisionMarca.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionMarca.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionMarca.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionMarca.add(this.jCheckBoxConGraficoDinamicoComisionMarca, this.gridBagConstraintsComisionMarca);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoComisionMarca = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoComisionMarca.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionMarca.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionMarca.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComisionMarca.add(this.jLabelColumnaCategoriaGraficoComisionMarca, this.gridBagConstraintsComisionMarca);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoComisionMarca = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoComisionMarca.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoComisionMarca.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoComisionMarca.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoComisionMarca.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoComisionMarca.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionMarca.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionMarca.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoComisionMarca.add(this.jComboBoxColumnaCategoriaGraficoComisionMarca, this.gridBagConstraintsComisionMarca);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorComisionMarca = new JLabelMe();

		this.jLabelColumnaCategoriaValorComisionMarca.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionMarca.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionMarca.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionMarca.add(this.jLabelColumnaCategoriaValorComisionMarca, this.gridBagConstraintsComisionMarca);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorComisionMarca = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorComisionMarca.setText("Accion");
        this.jComboBoxColumnaCategoriaValorComisionMarca.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorComisionMarca.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorComisionMarca.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorComisionMarca.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionMarca.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionMarca.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoComisionMarca.add(this.jComboBoxColumnaCategoriaValorComisionMarca, this.gridBagConstraintsComisionMarca);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoComisionMarca = new JLabelMe();

		this.jLabelColumnasValoresGraficoComisionMarca.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionMarca.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionMarca.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionMarca.add(this.jLabelColumnasValoresGraficoComisionMarca, this.gridBagConstraintsComisionMarca);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoComisionMarca = new JList<Reporte>();
		this.jListColumnasValoresGraficoComisionMarca.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoComisionMarca.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoComisionMarca.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoComisionMarca.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoComisionMarca.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoComisionMarca=new JScrollPane(this.jListColumnasValoresGraficoComisionMarca);
			
			this.jScrollColumnasValoresGraficoComisionMarca.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoComisionMarca.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoComisionMarca.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoComisionMarca.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionMarca.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionMarca.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoComisionMarca.add(this.jListColumnasSelectReporteComisionMarca, this.gridBagConstraintsComisionMarca);
		this.jPanelReporteDinamicoComisionMarca.add(this.jScrollColumnasValoresGraficoComisionMarca, this.gridBagConstraintsComisionMarca);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoComisionMarca = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoComisionMarca.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionMarca.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionMarca.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionMarca.add(this.jLabelTiposGraficosReportesDinamicoComisionMarca, this.gridBagConstraintsComisionMarca);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoComisionMarca = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoComisionMarca.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoComisionMarca.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoComisionMarca.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoComisionMarca.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoComisionMarca.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionMarca.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionMarca.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionMarca.add(this.jComboBoxTiposGraficosReportesDinamicoComisionMarca, this.gridBagConstraintsComisionMarca);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoComisionMarca = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoComisionMarca.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionMarca.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionMarca.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionMarca.add(this.jLabelGenerarExcelReporteDinamicoComisionMarca, this.gridBagConstraintsComisionMarca);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoComisionMarca = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoComisionMarca.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoComisionMarca,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoComisionMarca.setToolTipText("Generar EXCEL"+" "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		//this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsComisionMarca.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsComisionMarca.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoComisionMarca.add(this.jButtonGenerarExcelReporteDinamicoComisionMarca, this.gridBagConstraintsComisionMarca);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionMarca.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComisionMarca.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComisionMarca.add(this.jComboBoxTiposReportesDinamicoComisionMarca, this.gridBagConstraintsComisionMarca);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoComisionMarca = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoComisionMarca.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionMarca.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionMarca.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionMarca.add(this.jLabelTiposArchivoReporteDinamicoComisionMarca, this.gridBagConstraintsComisionMarca);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionMarca.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComisionMarca.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComisionMarca.add(this.jComboBoxTiposArchivosReportesDinamicoComisionMarca, this.gridBagConstraintsComisionMarca);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoComisionMarca = new JButtonMe();
		this.jButtonGenerarReporteDinamicoComisionMarca.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoComisionMarca,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoComisionMarca.setToolTipText("Generar"+" "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionMarca.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComisionMarca.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComisionMarca.add(this.jButtonGenerarReporteDinamicoComisionMarca, this.gridBagConstraintsComisionMarca);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoComisionMarca = new JButtonMe();
		this.jButtonCerrarReporteDinamicoComisionMarca.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoComisionMarca,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoComisionMarca.setToolTipText("Cancelar"+" "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionMarca.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComisionMarca.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComisionMarca.add(this.jButtonCerrarReporteDinamicoComisionMarca, this.gridBagConstraintsComisionMarca);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalComisionMarca = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoComisionMarca= new JScrollPane(jPanelReporteDinamicoComisionMarca,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoComisionMarca.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoComisionMarca.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoComisionMarca.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoComisionMarca.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comision Marcas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsComisionMarca.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoComisionMarca.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoComisionMarca.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalComisionMarca);
		this.jInternalFrameReporteDinamicoComisionMarca.getContentPane().add(this.jScrollPanelReporteDinamicoComisionMarca, this.gridBagConstraintsComisionMarca);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionComisionMarca() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionComisionMarca = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionComisionMarca = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionComisionMarca.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionComisionMarca.setName("jPanelImportacionComisionMarca"); 
		
		this.jPanelImportacionComisionMarca.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionComisionMarca.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionComisionMarca.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionComisionMarca.setLayout(gridaBagLayoutImportacionComisionMarca);
		
		
		this.jInternalFrameImportacionComisionMarca= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionComisionMarca= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionComisionMarca = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteComisionMarca= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionComisionMarca.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionComisionMarca.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionComisionMarca.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionComisionMarca.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionComisionMarca.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionComisionMarca.setResizable(true);
	    this.jInternalFrameImportacionComisionMarca.setClosable(true);
	    this.jInternalFrameImportacionComisionMarca.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionComisionMarca.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionComisionMarca.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionComisionMarca.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionComisionMarca.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionComisionMarca.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionComisionMarca.setResizable(true);
	    this.jInternalFrameImportacionComisionMarca.setClosable(true);
	    this.jInternalFrameImportacionComisionMarca.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionComisionMarca.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionComisionMarca.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionComisionMarca.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionComisionMarca.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comision Marcas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionComisionMarca = new JLabelMe();

		this.jLabelArchivoImportacionComisionMarca.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionMarca.gridy = iPosYImportacion;		
		this.gridBagConstraintsComisionMarca.gridx = iPosXImportacion++;
			
		this.jPanelImportacionComisionMarca.add(this.jLabelArchivoImportacionComisionMarca, this.gridBagConstraintsComisionMarca);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionComisionMarca = new JFileChooser();		
		this.jFileChooserImportacionComisionMarca.setToolTipText("ESCOGER ARCHIVO"+" "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionComisionMarca = new JButtonMe();
		this.jButtonAbrirImportacionComisionMarca.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionComisionMarca,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionComisionMarca.setToolTipText("Generar"+" "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionMarca.gridy = iPosYImportacion;
		this.gridBagConstraintsComisionMarca.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComisionMarca.add(this.jButtonAbrirImportacionComisionMarca, this.gridBagConstraintsComisionMarca);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionComisionMarca = new JLabelMe();

		this.jLabelPathArchivoImportacionComisionMarca.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionComisionMarca.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionComisionMarca.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionComisionMarca.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionMarca.gridy = iPosYImportacion;		
		this.gridBagConstraintsComisionMarca.gridx = iPosXImportacion++;
			
		this.jPanelImportacionComisionMarca.add(this.jLabelPathArchivoImportacionComisionMarca, this.gridBagConstraintsComisionMarca);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionComisionMarca=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionComisionMarca.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionComisionMarca.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionComisionMarca.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionMarca.gridy = iPosYImportacion;
		this.gridBagConstraintsComisionMarca.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComisionMarca.add(this.jTextFieldPathArchivoImportacionComisionMarca, this.gridBagConstraintsComisionMarca);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionComisionMarca = new JButtonMe();
		this.jButtonGenerarImportacionComisionMarca.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionComisionMarca,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionComisionMarca.setToolTipText("Generar"+" "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionMarca.gridy = iPosYImportacion;
		this.gridBagConstraintsComisionMarca.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComisionMarca.add(this.jButtonGenerarImportacionComisionMarca, this.gridBagConstraintsComisionMarca);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionComisionMarca = new JButtonMe();
		this.jButtonCerrarImportacionComisionMarca.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionComisionMarca,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionComisionMarca.setToolTipText("Cancelar"+" "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionMarca.gridy = iPosYImportacion;
		this.gridBagConstraintsComisionMarca.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComisionMarca.add(this.jButtonCerrarImportacionComisionMarca, this.gridBagConstraintsComisionMarca);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalComisionMarca = new GridBagLayout();
		
		this.jScrollPanelImportacionComisionMarca= new JScrollPane(jPanelImportacionComisionMarca,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsComisionMarca = new GridBagConstraints();
		this.gridBagConstraintsComisionMarca.gridy =iPosYImportacion;
		this.gridBagConstraintsComisionMarca.gridx =iPosXImportacion;
		this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionComisionMarca.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionComisionMarca.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalComisionMarca);
		this.jInternalFrameImportacionComisionMarca.getContentPane().add(this.jScrollPanelImportacionComisionMarca, this.gridBagConstraintsComisionMarca);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByComisionMarca(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByComisionMarca = new JButtonMe();
			this.jButtonAbrirOrderByComisionMarca.setText("Orden");
			this.jButtonAbrirOrderByComisionMarca.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByComisionMarca,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByComisionMarca";
			inputMap = this.jButtonAbrirOrderByComisionMarca.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByComisionMarca.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByComisionMarca"));
		
		
			GridBagLayout gridaBagLayoutOrderByComisionMarca = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByComisionMarca = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByComisionMarca.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByComisionMarca.setName("jPanelOrderByComisionMarca"); 
			
			this.jPanelOrderByComisionMarca.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByComisionMarca.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByComisionMarca.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByComisionMarca.setLayout(gridaBagLayoutOrderByComisionMarca);
			
			
			this.jTableDatosComisionMarcaOrderBy = new JTableMe();        
			this.jTableDatosComisionMarcaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosComisionMarcaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosComisionMarcaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosComisionMarcaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosComisionMarcaOrderBy.setViewportView(this.jTableDatosComisionMarcaOrderBy);
			this.jTableDatosComisionMarcaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosComisionMarcaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByComisionMarca= new OrderByJInternalFrame();
			this.jInternalFrameOrderByComisionMarca= new OrderByJInternalFrame();
			this.jScrollPanelOrderByComisionMarca = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteComisionMarca= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByComisionMarca.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByComisionMarca.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByComisionMarca.setTitle("Orden");
			this.jInternalFrameOrderByComisionMarca.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByComisionMarca.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByComisionMarca.setResizable(true);
			this.jInternalFrameOrderByComisionMarca.setClosable(true);
			this.jInternalFrameOrderByComisionMarca.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByComisionMarca.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByComisionMarca.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByComisionMarca.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByComisionMarca.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comision Marcas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.gridy =iPosYOrderBy++;
			this.gridBagConstraintsComisionMarca.gridx =iPosXOrderBy;
			this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsComisionMarca.ipady =150;
				
			this.jPanelOrderByComisionMarca.add(jScrollPanelDatosComisionMarcaOrderBy, this.gridBagConstraintsComisionMarca);//this.jTableDatosComisionMarcaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByComisionMarca = new JButtonMe();
			this.jButtonCerrarOrderByComisionMarca.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByComisionMarca,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByComisionMarca.setToolTipText("Cancelar"+" "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByComisionMarca, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionMarca.gridy = iPosYOrderBy++;
			this.gridBagConstraintsComisionMarca.gridx = iPosXOrderBy;
									
			this.jPanelOrderByComisionMarca.add(this.jButtonCerrarOrderByComisionMarca, this.gridBagConstraintsComisionMarca);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalComisionMarca = new GridBagLayout();
			
			this.jScrollPanelOrderByComisionMarca= new JScrollPane(jPanelOrderByComisionMarca,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsComisionMarca = new GridBagConstraints();
			this.gridBagConstraintsComisionMarca.gridy =iPosYOrderBy;
			this.gridBagConstraintsComisionMarca.gridx =iPosXOrderBy;
			this.gridBagConstraintsComisionMarca.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByComisionMarca.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByComisionMarca.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalComisionMarca);
			
			this.jInternalFrameOrderByComisionMarca.getContentPane().add(this.jScrollPanelOrderByComisionMarca, this.gridBagConstraintsComisionMarca);			
		
		} else {
			this.jButtonAbrirOrderByComisionMarca = new JButtonMe();
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
		int iWidthTableCalculado=0;//2230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.comisionmarcaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosComisionMarca.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosComisionMarca.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosComisionMarca.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosComisionMarca.getRowHeight();//ComisionMarcaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ComisionMarcaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaComisionMarca.isSelected()) {
					iHeightTable=ComisionMarcaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ComisionMarcaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ComisionMarcaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ComisionMarcaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaComisionMarca.isSelected()) {
					iHeightTable=ComisionMarcaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ComisionMarcaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ComisionMarcaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosComisionMarca.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosComisionMarca.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosComisionMarca.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosComisionMarca.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosComisionMarca.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosComisionMarca.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByComisionMarca!=null && this.jInternalFrameOrderByComisionMarca.getjTableDatosOrderBy()!=null) {
			//if(!this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByComisionMarca.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByComisionMarca.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByComisionMarca.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByComisionMarca.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByComisionMarca.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByComisionMarca.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByComisionMarca.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosComisionMarca.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosComisionMarca.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosComisionMarca.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=comisionmarcaLogic.getComisionMarcas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comisionmarcas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ComisionMarca> TraerComisionMarcaBeans(List<ComisionMarca> comisionmarcas,ArrayList<Classe> classes)throws Exception {
		try {
			for(ComisionMarca comisionmarca:comisionmarcas) {
					
				if(!(ComisionMarcaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ComisionMarcaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					comisionmarca.setsDetalleGeneralEntityReporte(ComisionMarcaConstantesFunciones.getComisionMarcaDescripcion(comisionmarca));
										
						
					
						
					
				} else  {
							
					//comisionmarca.setsDetalleGeneralEntityReporte(comisionmarca.getsDetalleGeneralEntityReporte());
										
				}
				
				//comisionmarcabeans.add(comisionmarcabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return comisionmarcas;
    }
	//PARA REPORTES FIN
}
