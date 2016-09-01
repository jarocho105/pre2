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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
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
import com.bydan.erp.inventario.util.TallaProductoConstantesFunciones;

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
public class TallaProductoJInternalFrame extends TallaProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTallaProducto;
	
	protected JMenuBar jmenuBarTallaProducto;
	
	protected JMenu jmenuTallaProducto;
	protected JMenu jmenuDatosTallaProducto;
	protected JMenu jmenuArchivoTallaProducto;
	protected JMenu jmenuAccionesTallaProducto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTallaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTallaProducto;	
	protected GridBagConstraints gridBagConstraintsTallaProducto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TallaProductoDetalleFormJInternalFrame jInternalFrameDetalleFormTallaProducto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTallaProducto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTallaProducto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoProductoBeanSwingJInternalFrame tipoproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoproducto="";
	
	public TallaProductoSessionBean tallaproductoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoProductoSessionBean tipoproductoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TallaProducto> tallaproductos;		
	public List<TallaProducto> tallaproductosEliminados;	
	public List<TallaProducto> tallaproductosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTallaProducto;		
	protected JButton jButtonAbrirOrderByTallaProducto;
	
	
	//protected JPanel jPanelOrderByTallaProducto;
	//public JScrollPane jScrollPanelOrderByTallaProducto;	
	//protected JButton jButtonCerrarOrderByTallaProducto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TallaProductoLogic tallaproductoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTallaProducto;
	public JScrollPane jScrollPanelDatosEdicionTallaProducto;
	public JScrollPane jScrollPanelDatosGeneralTallaProducto;
    
	
	
	//public JScrollPane jScrollPanelDatosTallaProductoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTallaProducto;
	//public JScrollPane jScrollPanelImportacionTallaProducto;
	
	
	
	protected JPanel jPanelAccionesTallaProducto;
	
    protected JPanel jPanelPaginacionTallaProducto;
    protected JPanel jPanelParametrosReportesTallaProducto;
	protected JPanel jPanelParametrosReportesAccionesTallaProducto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TallaProducto;
	protected JPanel jPanelParametrosAuxiliar2TallaProducto;
	protected JPanel jPanelParametrosAuxiliar3TallaProducto;
	protected JPanel jPanelParametrosAuxiliar4TallaProducto;
	//protected JPanel jPanelParametrosAuxiliar5TallaProducto;
	
	
	
	//protected JPanel jPanelReporteDinamicoTallaProducto;
	//protected JPanel jPanelImportacionTallaProducto;
	
	
	public JTable jTableDatosTallaProducto;
	
	
	
	//public JTable jTableDatosTallaProductoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTallaProducto;
	protected JButton jButtonDuplicarTallaProducto;
	protected JButton jButtonCopiarTallaProducto;
	protected JButton jButtonVerFormTallaProducto;
	protected JButton jButtonNuevoRelacionesTallaProducto;
	protected JButton jButtonModificarTallaProducto;
	
    protected JButton jButtonGuardarCambiosTablaTallaProducto;
	protected JButton jButtonCerrarTallaProducto;
	
	
	protected JButton jButtonRecargarInformacionTallaProducto;
	protected JButton jButtonProcesarInformacionTallaProducto;
	
	
	protected JButton jButtonAnterioresTallaProducto;
	protected JButton jButtonSiguientesTallaProducto;
	protected JButton jButtonNuevoGuardarCambiosTallaProducto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTallaProducto;
	//protected JButton jButtonCerrarReporteDinamicoTallaProducto;
	//protected JButton jButtonGenerarExcelReporteDinamicoTallaProducto;	
	
	
	
	//protected JButton jButtonAbrirImportacionTallaProducto;
	//protected JButton jButtonGenerarImportacionTallaProducto;
	//protected JButton jButtonCerrarImportacionTallaProducto;
	//protected JFileChooser jFileChooserImportacionTallaProducto;
	//protected File fileImportacionTallaProducto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTallaProducto;
	protected JButton jButtonDuplicarToolBarTallaProducto;
	protected JButton jButtonNuevoRelacionesToolBarTallaProducto;
	
	
	public JButton jButtonGuardarCambiosToolBarTallaProducto;
	protected JButton jButtonCopiarToolBarTallaProducto;
	protected JButton jButtonVerFormToolBarTallaProducto;
	public JButton jButtonGuardarCambiosTablaToolBarTallaProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarTallaProducto;
	protected JButton jButtonCerrarToolBarTallaProducto;
	
	protected JButton jButtonRecargarInformacionToolBarTallaProducto;
	protected JButton jButtonProcesarInformacionToolBarTallaProducto;
	protected JButton jButtonAnterioresToolBarTallaProducto;
	protected JButton jButtonSiguientesToolBarTallaProducto;
	protected JButton jButtonNuevoGuardarCambiosToolBarTallaProducto;
	protected JButton jButtonAbrirOrderByToolBarTallaProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTallaProducto;
	protected JMenuItem jMenuItemDuplicarTallaProducto;
	protected JMenuItem jMenuItemNuevoRelacionesTallaProducto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTallaProducto;
	protected JMenuItem jMenuItemCopiarTallaProducto;
	protected JMenuItem jMenuItemVerFormTallaProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaTallaProducto;
	protected JMenuItem jMenuItemCerrarTallaProducto;
	protected JMenuItem jMenuItemDetalleCerrarTallaProducto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTallaProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarTallaProducto;
	
	protected JMenuItem jMenuItemRecargarInformacionTallaProducto;
	protected JMenuItem jMenuItemProcesarInformacionTallaProducto;
	protected JMenuItem jMenuItemAnterioresTallaProducto;
	protected JMenuItem jMenuItemSiguientesTallaProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTallaProducto;
	protected JMenuItem jMenuItemAbrirOrderByTallaProducto;
	protected JMenuItem jMenuItemMostrarOcultarTallaProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTallaProducto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTallaProducto;
	protected JCheckBox jCheckBoxSeleccionadosTallaProducto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTallaProducto;
	protected JCheckBox jCheckBoxConGraficoReporteTallaProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTallaProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTallaProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTallaProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTallaProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTallaProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTallaProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTallaProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTallaProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTallaProducto;
	protected JTextField jTextFieldValorCampoGeneralTallaProducto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTallaProducto;
	//public JList<Reporte> jListColumnasSelectReporteTallaProducto;
	//public JScrollPane jScrollColumnasSelectReporteTallaProducto;
	
	//public JLabel jLabelRelacionesSelectReporteTallaProducto;
	//public JList<Reporte> jListRelacionesSelectReporteTallaProducto;
	//public JScrollPane jScrollRelacionesSelectReporteTallaProducto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTallaProducto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTallaProducto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTallaProducto;
	//public JLabel jLabelTiposArchivoReporteDinamicoTallaProducto;
	
		
	//public JLabel jLabelArchivoImportacionTallaProducto;	
	//public JLabel jLabelPathArchivoImportacionTallaProducto;
	//protected JTextField jTextFieldPathArchivoImportacionTallaProducto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTallaProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTallaProducto;
	
	//public JLabel jLabelColumnaCategoriaValorTallaProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTallaProducto;
	
	//public JLabel jLabelColumnasValoresGraficoTallaProducto;
	//public JList<Reporte> jListColumnasValoresGraficoTallaProducto;
	//public JScrollPane jScrollColumnasValoresGraficoTallaProducto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTallaProducto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTallaProducto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTallaProducto;
	public JPanel jPanelBusquedaPorCodigoTallaProducto;
	public JButton jButtonBusquedaPorCodigoTallaProducto;
	public JPanel jPanelBusquedaPorNombreTallaProducto;
	public JButton jButtonBusquedaPorNombreTallaProducto;
	public JPanel jPanelFK_IdTipoProductoTallaProducto;
	public JButton jButtonFK_IdTipoProductoTallaProducto;
	
	public JPanel jPanelcodigoBusquedaPorCodigoTallaProducto;
	public JLabel jLabelcodigoBusquedaPorCodigoTallaProducto;
	public JTextField jTextFieldcodigoBusquedaPorCodigoTallaProducto;
	public JButton jButtoncodigoBusquedaPorCodigoTallaProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTallaProducto;
	public JLabel jLabelnombreBusquedaPorNombreTallaProducto;
	public JTextArea jTextAreanombreBusquedaPorNombreTallaProducto;
	public JButton jButtonnombreBusquedaPorNombreTallaProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_productoFK_IdTipoProductoTallaProducto;
	public JLabel jLabelid_tipo_productoFK_IdTipoProductoTallaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_productoFK_IdTipoProductoTallaProducto;
	public JButton jButtonid_tipo_productoFK_IdTipoProductoTallaProducto= new JButtonMe();
	public JButton jButtonid_tipo_productoFK_IdTipoProductoTallaProductoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_productoFK_IdTipoProductoTallaProductoBusqueda= new JButtonMe();

	
	
	
	
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
	public TallaProductoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TallaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TallaProductoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TallaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TallaProductoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TallaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TallaProductoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TallaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTallaProducto)	{
		this.jButtonRecargarInformacionTallaProducto = jButtonRecargarInformacionTallaProducto;
	}
	
	public JButton getjButtonProcesarInformacionTallaProducto() {
		return this.jButtonProcesarInformacionTallaProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTallaProducto)	{
		this.jButtonProcesarInformacionTallaProducto = jButtonProcesarInformacionTallaProducto;
	}
	
	
	public JButton getjButtonRecargarInformacionTallaProducto() {
		return this.jButtonRecargarInformacionTallaProducto;
	}
	
	
	public List<TallaProducto> gettallaproductos() {
		return this.tallaproductos;
	}

	public void settallaproductos(List<TallaProducto> tallaproductos) {
		this.tallaproductos = tallaproductos;
	}
	
	public List<TallaProducto> gettallaproductosAux() {
		return this.tallaproductosAux;
	}

	public void settallaproductosAux(List<TallaProducto> tallaproductosAux) {
		this.tallaproductosAux = tallaproductosAux;
	}
	
	public List<TallaProducto> gettallaproductosEliminados() {
		return this.tallaproductosEliminados;
	}

	public void setTallaProductosEliminados(List<TallaProducto> tallaproductosEliminados) {
		this.tallaproductosEliminados = tallaproductosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTallaProducto() {
		return jComboBoxTiposSeleccionarTallaProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTallaProducto(
			JComboBox jComboBoxTiposSeleccionarTallaProducto) {
		this.jComboBoxTiposSeleccionarTallaProducto = jComboBoxTiposSeleccionarTallaProducto;
	}
	
	public void setBorderResaltarTiposSeleccionarTallaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTallaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTallaProducto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTallaProducto() {
		return jTextFieldValorCampoGeneralTallaProducto;
	}

	public void setjTextFieldValorCampoGeneralTallaProducto(
			JTextField jTextFieldValorCampoGeneralTallaProducto) {
		this.jTextFieldValorCampoGeneralTallaProducto = jTextFieldValorCampoGeneralTallaProducto;
	}

	public void setBorderResaltarValorCampoGeneralTallaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTallaProducto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTallaProducto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTallaProducto() {
		return this.jCheckBoxSeleccionarTodosTallaProducto;
	}

	public void setjCheckBoxSeleccionarTodosTallaProducto(
			JCheckBox jCheckBoxSeleccionarTodosTallaProducto) {
		this.jCheckBoxSeleccionarTodosTallaProducto = jCheckBoxSeleccionarTodosTallaProducto;
	}

	public void setBorderResaltarSeleccionarTodosTallaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTallaProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTallaProducto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTallaProducto() {
		return this.jCheckBoxSeleccionadosTallaProducto;
	}

	public void setjCheckBoxSeleccionadosTallaProducto(
			JCheckBox jCheckBoxSeleccionadosTallaProducto) {
		this.jCheckBoxSeleccionadosTallaProducto = jCheckBoxSeleccionadosTallaProducto;
	}
	
	public void setBorderResaltarSeleccionadosTallaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTallaProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTallaProducto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTallaProducto() {
		return this.jComboBoxTiposArchivosReportesTallaProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTallaProducto(
			JComboBox jComboBoxTiposArchivosReportesTallaProducto) {
		this.jComboBoxTiposArchivosReportesTallaProducto = jComboBoxTiposArchivosReportesTallaProducto;
	}

	public void setBorderResaltarTiposArchivosReportesTallaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTallaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTallaProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTallaProducto() {
		return this.jComboBoxTiposReportesTallaProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTallaProducto(
			JComboBox jComboBoxTiposReportesTallaProducto) {
		this.jComboBoxTiposReportesTallaProducto = jComboBoxTiposReportesTallaProducto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTallaProducto() {
	//	return jComboBoxTiposReportesDinamicoTallaProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTallaProducto(
	//		JComboBox jComboBoxTiposReportesDinamicoTallaProducto) {
	//	this.jComboBoxTiposReportesDinamicoTallaProducto = jComboBoxTiposReportesDinamicoTallaProducto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTallaProducto() {
	//	return jComboBoxTiposArchivosReportesDinamicoTallaProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTallaProducto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTallaProducto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTallaProducto = jComboBoxTiposArchivosReportesDinamicoTallaProducto;
	//}
	
	public void setBorderResaltarTiposReportesTallaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTallaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTallaProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTallaProducto() {
		return this.jComboBoxTiposGraficosReportesTallaProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTallaProducto(
			JComboBox jComboBoxTiposGraficosReportesTallaProducto) {
		this.jComboBoxTiposGraficosReportesTallaProducto = jComboBoxTiposGraficosReportesTallaProducto;
	}
	
	public void setBorderResaltarTiposGraficosReportesTallaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTallaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTallaProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTallaProducto() {
		return this.jComboBoxTiposPaginacionTallaProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTallaProducto(
			JComboBox jComboBoxTiposPaginacionTallaProducto) {
		this.jComboBoxTiposPaginacionTallaProducto = jComboBoxTiposPaginacionTallaProducto;
	}
	
	public void setBorderResaltarTiposPaginacionTallaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTallaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTallaProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTallaProducto() {
		return this.jComboBoxTiposRelacionesTallaProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTallaProducto() {
		return this.jComboBoxTiposAccionesTallaProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTallaProducto(
			JComboBox jComboBoxTiposRelacionesTallaProducto) {
		this.jComboBoxTiposRelacionesTallaProducto = jComboBoxTiposRelacionesTallaProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTallaProducto(
			JComboBox jComboBoxTiposAccionesTallaProducto) {
		this.jComboBoxTiposAccionesTallaProducto = jComboBoxTiposAccionesTallaProducto;
	}
	
	public void setBorderResaltarTiposRelacionesTallaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTallaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTallaProducto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTallaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTallaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTallaProducto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTallaProducto() {
	//	return jCheckBoxConGraficoDinamicoTallaProducto;
	//}

	//public void setjCheckBoxConGraficoDinamicoTallaProducto(
	//		JCheckBox jCheckBoxConGraficoDinamicoTallaProducto) {
	//	this.jCheckBoxConGraficoDinamicoTallaProducto = jCheckBoxConGraficoDinamicoTallaProducto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTallaProducto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTallaProducto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTallaProducto .setBorder(borderResaltar);		
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
		this.tallaproductoSessionBean=new TallaProductoSessionBean();
		
		this.tallaproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tallaproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tallaproductoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TallaProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TallaProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TallaProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TallaProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TallaProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Talla Producto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tallaproductoSessionBean.getEsGuardarRelacionado()) {
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
		
		TallaProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TallaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTallaProducto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTallaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTallaProducto,this.jTtoolBarTallaProducto,
							"nuevo","nuevo","Nuevo"+" "+TallaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTallaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTallaProducto,this.jTtoolBarTallaProducto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTallaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTallaProducto,this.jTtoolBarTallaProducto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TallaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTallaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTallaProducto,this.jTtoolBarTallaProducto,
							"duplicar","duplicar","Duplicar"+" "+TallaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTallaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTallaProducto,this.jTtoolBarTallaProducto,
							"copiar","copiar","Copiar"+" "+TallaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTallaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTallaProducto,this.jTtoolBarTallaProducto,
							"ver_form","ver_form","Ver"+" "+TallaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTallaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTallaProducto,this.jTtoolBarTallaProducto,
							"recargar","recargar","Recargar"+" "+TallaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTallaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTallaProducto,this.jTtoolBarTallaProducto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTallaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTallaProducto,this.jTtoolBarTallaProducto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTallaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTallaProducto,this.jTtoolBarTallaProducto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTallaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTallaProducto,this.jTtoolBarTallaProducto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTallaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTallaProducto,this.jTtoolBarTallaProducto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TallaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTallaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTallaProducto,this.jTtoolBarTallaProducto,
							"cerrar","cerrar","Salir"+" "+TallaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTallaProducto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTallaProducto;
			
				this.jButtonProcesarInformacionToolBarTallaProducto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTallaProducto;
				
		//protected JButton jButtonModificarToolBarTallaProducto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTallaProducto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTallaProducto=new JMenuMe("General");
		this.jmenuArchivoTallaProducto=new JMenuMe("Archivo");
		this.jmenuAccionesTallaProducto=new JMenuMe("Acciones");
		this.jmenuDatosTallaProducto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTallaProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTallaProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTallaProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTallaProducto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTallaProducto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTallaProducto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTallaProducto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTallaProducto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTallaProducto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTallaProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTallaProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTallaProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTallaProducto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTallaProducto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTallaProducto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTallaProducto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTallaProducto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTallaProducto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTallaProducto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTallaProducto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTallaProducto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTallaProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTallaProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTallaProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTallaProducto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTallaProducto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTallaProducto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTallaProducto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTallaProducto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTallaProducto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTallaProducto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTallaProducto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTallaProducto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTallaProducto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTallaProducto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTallaProducto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTallaProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTallaProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTallaProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTallaProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTallaProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTallaProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTallaProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTallaProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTallaProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTallaProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTallaProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTallaProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTallaProducto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTallaProducto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTallaProducto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTallaProducto.add(this.jMenuItemCerrarTallaProducto);
			
			this.jmenuAccionesTallaProducto.add(this.jMenuItemNuevoTallaProducto);
			this.jmenuAccionesTallaProducto.add(this.jMenuItemNuevoGuardarCambiosTallaProducto);
			this.jmenuAccionesTallaProducto.add(this.jMenuItemNuevoRelacionesTallaProducto);
			this.jmenuAccionesTallaProducto.add(this.jMenuItemGuardarCambiosTablaTallaProducto);		
			this.jmenuAccionesTallaProducto.add(this.jMenuItemDuplicarTallaProducto);		
			this.jmenuAccionesTallaProducto.add(this.jMenuItemCopiarTallaProducto);		
			this.jmenuAccionesTallaProducto.add(this.jMenuItemVerFormTallaProducto);		
			
			this.jmenuDatosTallaProducto.add(this.jMenuItemRecargarInformacionTallaProducto);				
			this.jmenuDatosTallaProducto.add(this.jMenuItemAnterioresTallaProducto);				
			this.jmenuDatosTallaProducto.add(this.jMenuItemSiguientesTallaProducto);				
			this.jmenuDatosTallaProducto.add(this.jMenuItemAbrirOrderByTallaProducto);				
			this.jmenuDatosTallaProducto.add(this.jMenuItemMostrarOcultarTallaProducto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTallaProducto.add(this.jMenuItemGuardarCambiosTallaProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTallaProducto.add(this.jmenuArchivoTallaProducto);		
			this.jmenuBarTallaProducto.add(this.jmenuAccionesTallaProducto);		
			this.jmenuBarTallaProducto.add(this.jmenuDatosTallaProducto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTallaProducto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTallaProducto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoTallaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoTallaProducto.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoTallaProducto= new JButtonMe();
		this.jButtonBusquedaPorCodigoTallaProducto.setText("Buscar");
		this.jButtonBusquedaPorCodigoTallaProducto.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoTallaProducto,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoTallaProducto = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoTallaProducto.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoTallaProducto.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoTallaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTallaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTallaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoTallaProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoTallaProducto= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoTallaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTallaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTallaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoTallaProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreTallaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTallaProducto.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTallaProducto= new JButtonMe();
		this.jButtonBusquedaPorNombreTallaProducto.setText("Buscar");
		this.jButtonBusquedaPorNombreTallaProducto.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTallaProducto,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTallaProducto = new JLabelMe();
		jLabelnombreBusquedaPorNombreTallaProducto.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTallaProducto.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTallaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTallaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTallaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTallaProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTallaProducto= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTallaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTallaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTallaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTallaProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoProductoTallaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoProductoTallaProducto.setToolTipText("Buscar Por Tipo Producto ");
		this.jButtonFK_IdTipoProductoTallaProducto= new JButtonMe();
		this.jButtonFK_IdTipoProductoTallaProducto.setText("Buscar");
		this.jButtonFK_IdTipoProductoTallaProducto.setToolTipText("Buscar Por Tipo Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoProductoTallaProducto,"buscar_button","Buscar Por Tipo Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoProductoTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_productoFK_IdTipoProductoTallaProducto = new JLabelMe();
		jLabelid_tipo_productoFK_IdTipoProductoTallaProducto.setText("Tipo Producto :");
		jLabelid_tipo_productoFK_IdTipoProductoTallaProducto.setToolTipText("Tipo Producto");
		jLabelid_tipo_productoFK_IdTipoProductoTallaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_productoFK_IdTipoProductoTallaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_productoFK_IdTipoProductoTallaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_productoFK_IdTipoProductoTallaProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_productoFK_IdTipoProductoTallaProducto= new JComboBoxMe();
		jComboBoxid_tipo_productoFK_IdTipoProductoTallaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoFK_IdTipoProductoTallaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoFK_IdTipoProductoTallaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_productoFK_IdTipoProductoTallaProducto,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTallaProducto=new JTabbedPane();


		this.jTabbedPaneBusquedasTallaProducto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTallaProducto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTallaProducto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTallaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTallaProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTallaProducto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTallaProducto = new TallaProductoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Talla Producto DATOS");
			this.jInternalFrameDetalleFormTallaProducto = new TallaProductoDetalleFormJInternalFrame(jDesktopPane,this.tallaproductoSessionBean.getConGuardarRelaciones(),this.tallaproductoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTallaProducto = null;//new TallaProductoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTallaProducto= new GridBagLayout();
		
		
		this.jTableDatosTallaProducto = new JTableMe();      
		
		String sToolTipTallaProducto="";
		sToolTipTallaProducto=TallaProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTallaProducto+="(Inventario.TallaProducto)";
		}
		
		if(!this.tallaproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTallaProducto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTallaProducto.setToolTipText(sToolTipTallaProducto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTallaProducto);
		this.jTableDatosTallaProducto.setAutoCreateRowSorter(true);
		this.jTableDatosTallaProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTallaProducto.setRowSelectionAllowed(true);
		this.jTableDatosTallaProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTallaProducto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTallaProducto = new JButtonMe();
		this.jButtonDuplicarTallaProducto = new JButtonMe();
		this.jButtonCopiarTallaProducto = new JButtonMe();
		this.jButtonVerFormTallaProducto = new JButtonMe();
		this.jButtonNuevoRelacionesTallaProducto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTallaProducto = new JButtonMe();
		this.jButtonCerrarTallaProducto = new JButtonMe();
		
		this.jScrollPanelDatosTallaProducto = new JScrollPane();   
        this.jScrollPanelDatosGeneralTallaProducto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTallaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Talla Producto";
		
		if(!this.tallaproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTallaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Talla Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosTallaProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTallaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTallaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTallaProducto.setToolTipText("Acciones");
        this.jPanelAccionesTallaProducto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTallaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTallaProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTallaProducto=new ReporteDinamicoJInternalFrame(TallaProductoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTallaProducto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTallaProducto=new ImportacionJInternalFrame(TallaProductoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTallaProducto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTallaProducto = new JButtonMe();
		
		this.jButtonAbrirOrderByTallaProducto.setText("Orden");
		this.jButtonAbrirOrderByTallaProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTallaProducto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTallaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTallaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTallaProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTallaProducto,false,this);
			
			//this.cargarOrderByTallaProducto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTallaProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTallaProducto,true,this);
			
			//this.cargarOrderByTallaProducto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTallaProducto.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosTallaProducto.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosTallaProducto.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosTallaProducto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTallaProducto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTallaProducto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTallaProducto.setText("Nuevo");
		this.jButtonDuplicarTallaProducto.setText("Duplicar");
		this.jButtonCopiarTallaProducto.setText("Copiar");
		this.jButtonVerFormTallaProducto.setText("Ver");
		this.jButtonNuevoRelacionesTallaProducto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTallaProducto.setText("Guardar");
		this.jButtonCerrarTallaProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTallaProducto,"nuevo_button","Nuevo",this.tallaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTallaProducto,"duplicar_button","Duplicar",this.tallaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTallaProducto,"copiar_button","Copiar",this.tallaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTallaProducto,"ver_form","Ver",this.tallaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTallaProducto,"nuevorelaciones_button","Nuevo Rel",this.tallaproductoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTallaProducto,"guardarcambiostabla_button","Guardar",this.tallaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTallaProducto,"cerrar_button","Salir",this.tallaproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTallaProducto.setToolTipText("Nuevo"+" "+TallaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTallaProducto.setToolTipText("Duplicar"+" "+TallaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTallaProducto.setToolTipText("Copiar"+" "+TallaProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTallaProducto.setToolTipText("Ver"+" "+TallaProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTallaProducto.setToolTipText("Nuevo Rel"+" "+TallaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTallaProducto.setToolTipText("Guardar"+" "+TallaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTallaProducto.setToolTipText("Salir"+" "+TallaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTallaProducto";
		inputMap = this.jButtonNuevoTallaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTallaProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTallaProducto"));
		
		//DUPLICAR
		sMapKey = "DuplicarTallaProducto";
		inputMap = this.jButtonDuplicarTallaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTallaProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTallaProducto"));
		
		//COPIAR
		sMapKey = "CopiarTallaProducto";
		inputMap = this.jButtonCopiarTallaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTallaProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTallaProducto"));
		
		//VEr FORM
		sMapKey = "VerFormTallaProducto";
		inputMap = this.jButtonVerFormTallaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTallaProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTallaProducto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTallaProducto";
		inputMap = this.jButtonNuevoRelacionesTallaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTallaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTallaProducto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTallaProducto";
		inputMap = this.jButtonModificarTallaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTallaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTallaProducto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTallaProducto";
		inputMap = this.jButtonCerrarTallaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTallaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTallaProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTallaProducto";
		inputMap = this.jButtonGuardarCambiosTablaTallaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTallaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTallaProducto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTallaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTallaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTallaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TallaProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TallaProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TallaProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TallaProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TallaProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTallaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTallaProducto.setName("jPanelParametrosReportesTallaProducto"); 
		
		this.jPanelParametrosReportesAccionesTallaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTallaProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTallaProducto.setName("jPanelParametrosReportesAccionesTallaProducto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTallaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTallaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTallaProducto = new JButtonMe();
		this.jButtonRecargarInformacionTallaProducto.setText("Recargar");
		this.jButtonRecargarInformacionTallaProducto.setToolTipText("Recargar"+" "+TallaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTallaProducto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTallaProducto = new JButtonMe();
		this.jButtonProcesarInformacionTallaProducto.setText("Procesar");
		this.jButtonProcesarInformacionTallaProducto.setToolTipText("Procesar"+" "+TallaProductoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTallaProducto.setVisible(false);
			
		this.jButtonProcesarInformacionTallaProducto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTallaProducto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTallaProducto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTallaProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTallaProducto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTallaProducto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTallaProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTallaProducto.setText("TIPO");       
		this.jComboBoxTiposReportesTallaProducto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTallaProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTallaProducto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTallaProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTallaProducto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTallaProducto.setText("Paginacion");
		this.jComboBoxTiposPaginacionTallaProducto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTallaProducto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTallaProducto.setText("Accion");
		this.jComboBoxTiposRelacionesTallaProducto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTallaProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTallaProducto.setText("Accion");
		this.jComboBoxTiposAccionesTallaProducto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTallaProducto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTallaProducto.setText("Accion");
		this.jComboBoxTiposSeleccionarTallaProducto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTallaProducto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTallaProducto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTallaProducto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTallaProducto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTallaProducto = new JLabelMe();
		
		this.jLabelAccionesTallaProducto.setText("Acciones");		
		this.jLabelAccionesTallaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTallaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTallaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTallaProducto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTallaProducto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTallaProducto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTallaProducto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTallaProducto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTallaProducto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTallaProducto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTallaProducto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTallaProducto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTallaProducto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTallaProducto.setText("Graf.");
		this.jCheckBoxConGraficoReporteTallaProducto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTallaProducto = new JButtonMe();
		//this.jButtonAnterioresTallaProducto.setText("<<");
        this.jButtonAnterioresTallaProducto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTallaProducto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTallaProducto = new JButtonMe();
		//this.jButtonSiguientesTallaProducto.setText(">>");
        this.jButtonSiguientesTallaProducto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTallaProducto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTallaProducto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTallaProducto.setText("Nue");
        this.jButtonNuevoGuardarCambiosTallaProducto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTallaProducto,"nuevoguardarcambios_button","Nue",this.tallaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTallaProducto";
		inputMap = this.jButtonNuevoGuardarCambiosTallaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTallaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTallaProducto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTallaProducto";
		inputMap = this.jButtonRecargarInformacionTallaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTallaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTallaProducto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTallaProducto";
		inputMap = this.jButtonSiguientesTallaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTallaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTallaProducto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTallaProducto";
		inputMap = this.jButtonAnterioresTallaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTallaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTallaProducto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTallaProducto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTallaProducto.setMinimumSize(new Dimension(this.getWidth(),TallaProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TallaProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTallaProducto.setMaximumSize(new Dimension(this.getWidth(),TallaProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TallaProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTallaProducto.setPreferredSize(new Dimension(this.getWidth(),TallaProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TallaProductoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTallaProducto = new GridBagLayout();

			this.jPanelPaginacionTallaProducto.setLayout(gridaBagLayoutPaginacionTallaProducto);						
			
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			this.gridBagConstraintsTallaProducto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTallaProducto.gridy = 0;
			this.gridBagConstraintsTallaProducto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTallaProducto.add(this.jButtonAnterioresTallaProducto, this.gridBagConstraintsTallaProducto);
					
						
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			this.gridBagConstraintsTallaProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTallaProducto.gridy = 0;
			
			this.jPanelPaginacionTallaProducto.add(this.jButtonNuevoGuardarCambiosTallaProducto, this.gridBagConstraintsTallaProducto);
						
			
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			this.gridBagConstraintsTallaProducto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTallaProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTallaProducto.gridy = 0;
			this.jPanelPaginacionTallaProducto.add(this.jButtonSiguientesTallaProducto, this.gridBagConstraintsTallaProducto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTallaProducto.gridy = 1;
			this.gridBagConstraintsTallaProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTallaProducto.add(this.jButtonNuevoTallaProducto, this.gridBagConstraintsTallaProducto);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTallaProducto = new GridBagConstraints();
				this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTallaProducto.gridy = 1;
				this.gridBagConstraintsTallaProducto.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTallaProducto.add(this.jButtonNuevoRelacionesTallaProducto, this.gridBagConstraintsTallaProducto);
			}
			
			
			if(!this.tallaproductoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTallaProducto = new GridBagConstraints();
				this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTallaProducto.gridy = 1;
				this.gridBagConstraintsTallaProducto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTallaProducto.add(this.jButtonGuardarCambiosTablaTallaProducto, this.gridBagConstraintsTallaProducto);
			}
			
			
			
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTallaProducto.gridy = 1;
			this.gridBagConstraintsTallaProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTallaProducto.add(this.jButtonDuplicarTallaProducto, this.gridBagConstraintsTallaProducto);
			
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTallaProducto.gridy = 1;
			this.gridBagConstraintsTallaProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTallaProducto.add(this.jButtonCopiarTallaProducto, this.gridBagConstraintsTallaProducto);
		
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTallaProducto.gridy = 1;
			this.gridBagConstraintsTallaProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTallaProducto.add(this.jButtonVerFormTallaProducto, this.gridBagConstraintsTallaProducto);
		
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTallaProducto.gridy = 1;
			this.gridBagConstraintsTallaProducto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTallaProducto.add(this.jButtonCerrarTallaProducto, this.gridBagConstraintsTallaProducto);
		
		
		
		this.jButtonRecargarInformacionTallaProducto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTallaProducto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTallaProducto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTallaProducto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTallaProducto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTallaProducto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTallaProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTallaProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTallaProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTallaProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTallaProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTallaProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTallaProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTallaProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTallaProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTallaProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTallaProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTallaProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTallaProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTallaProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTallaProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTallaProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTallaProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTallaProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTallaProducto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTallaProducto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTallaProducto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTallaProducto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTallaProducto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTallaProducto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTallaProducto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTallaProducto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTallaProducto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTallaProducto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTallaProducto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTallaProducto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTallaProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTallaProducto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TallaProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TallaProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TallaProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TallaProducto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTallaProducto.setLayout(gridaBagParametrosReportesTallaProducto);
			this.jPanelParametrosReportesAccionesTallaProducto.setLayout(gridaBagParametrosReportesAccionesTallaProducto);
			
			
			this.jPanelParametrosAuxiliar1TallaProducto.setLayout(gridaBagParametrosAuxiliar1TallaProducto);
			this.jPanelParametrosAuxiliar2TallaProducto.setLayout(gridaBagParametrosAuxiliar2TallaProducto);
			this.jPanelParametrosAuxiliar3TallaProducto.setLayout(gridaBagParametrosAuxiliar3TallaProducto);
			this.jPanelParametrosAuxiliar4TallaProducto.setLayout(gridaBagParametrosAuxiliar4TallaProducto);
			//this.jPanelParametrosAuxiliar5TallaProducto.setLayout(gridaBagParametrosAuxiliar2TallaProducto);			
			
			
			
			
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTallaProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTallaProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTallaProducto.add(this.jButtonRecargarInformacionTallaProducto, this.gridBagConstraintsTallaProducto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			this.gridBagConstraintsTallaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTallaProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTallaProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TallaProducto.add(this.jComboBoxTiposPaginacionTallaProducto, this.gridBagConstraintsTallaProducto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			this.gridBagConstraintsTallaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTallaProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTallaProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TallaProducto.add(this.jCheckBoxConAltoMaximoTablaTallaProducto, this.gridBagConstraintsTallaProducto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			this.gridBagConstraintsTallaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTallaProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTallaProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TallaProducto.add(this.jComboBoxTiposArchivosReportesTallaProducto, this.gridBagConstraintsTallaProducto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			this.gridBagConstraintsTallaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTallaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTallaProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTallaProducto.add(this.jPanelParametrosAuxiliar1TallaProducto, this.gridBagConstraintsTallaProducto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			this.gridBagConstraintsTallaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTallaProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTallaProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TallaProducto.add(this.jComboBoxTiposReportesTallaProducto, this.gridBagConstraintsTallaProducto);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			this.gridBagConstraintsTallaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTallaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTallaProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTallaProducto.add(this.jPanelParametrosAuxiliar4TallaProducto, this.gridBagConstraintsTallaProducto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			this.gridBagConstraintsTallaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTallaProducto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTallaProducto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTallaProducto.add(this.jComboBoxTiposReportesTallaProducto, this.gridBagConstraintsTallaProducto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			this.gridBagConstraintsTallaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTallaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTallaProducto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTallaProducto.add(this.jCheckBoxGenerarReporteTallaProducto, this.gridBagConstraintsTallaProducto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			this.gridBagConstraintsTallaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTallaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTallaProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTallaProducto.add(this.jPanelParametrosAuxiliar2TallaProducto, this.gridBagConstraintsTallaProducto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTallaProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTallaProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTallaProducto.add(this.jLabelAccionesTallaProducto, this.gridBagConstraintsTallaProducto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTallaProducto = new GridBagConstraints();
				this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTallaProducto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTallaProducto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTallaProducto.add(this.jButtonAbrirOrderByTallaProducto, this.gridBagConstraintsTallaProducto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTallaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTallaProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTallaProducto.add(this.jComboBoxTiposSeleccionarTallaProducto, this.gridBagConstraintsTallaProducto);			
			
			
			/*
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTallaProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTallaProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTallaProducto.add(this.jCheckBoxSeleccionarTodosTallaProducto, this.gridBagConstraintsTallaProducto);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			this.gridBagConstraintsTallaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTallaProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTallaProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TallaProducto.add(this.jCheckBoxSeleccionarTodosTallaProducto, this.gridBagConstraintsTallaProducto);															
				
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			this.gridBagConstraintsTallaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTallaProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTallaProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TallaProducto.add(this.jCheckBoxSeleccionadosTallaProducto, this.gridBagConstraintsTallaProducto);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			this.gridBagConstraintsTallaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTallaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTallaProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTallaProducto.add(this.jPanelParametrosAuxiliar3TallaProducto, this.gridBagConstraintsTallaProducto);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			this.gridBagConstraintsTallaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTallaProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTallaProducto.add(this.jComboBoxTiposRelacionesTallaProducto, this.gridBagConstraintsTallaProducto);
				
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			this.gridBagConstraintsTallaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTallaProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTallaProducto.add(this.jComboBoxTiposAccionesTallaProducto, this.gridBagConstraintsTallaProducto);
	
				
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			this.gridBagConstraintsTallaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTallaProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTallaProducto.add(this.jTextFieldValorCampoGeneralTallaProducto, this.gridBagConstraintsTallaProducto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTallaProducto = new GridBagLayout();

			this.jScrollPanelDatosTallaProducto.setLayout(gridaBagLayoutDatosTallaProducto);
			
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTallaProducto.gridy = 0;
			this.gridBagConstraintsTallaProducto.gridx = 0;
			
			this.jScrollPanelDatosTallaProducto.add(this.jTableDatosTallaProducto, this.gridBagConstraintsTallaProducto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTallaProducto.setViewportView(this.jTableDatosTallaProducto);
		this.jTableDatosTallaProducto.setFillsViewportHeight(true);
		this.jTableDatosTallaProducto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTallaProducto= new GridBagLayout();
		this.jPanelAccionesTallaProducto.setLayout(gridaBagLayoutAccionesTallaProducto);
		
		
		/*	
		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTallaProducto.gridy = 0;
		this.gridBagConstraintsTallaProducto.gridx = 0;
			
		this.jPanelAccionesTallaProducto.add(this.jButtonNuevoTallaProducto, this.gridBagConstraintsTallaProducto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoTallaProducto= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoTallaProducto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTallaProducto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTallaProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoTallaProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoTallaProducto.setLayout(gridaBagLayoutBusquedaPorCodigoTallaProducto);

		gridBagConstraintsTallaProducto = new GridBagConstraints();
		gridBagConstraintsTallaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTallaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTallaProducto.gridy = 0;
		gridBagConstraintsTallaProducto.gridx = 0;
		jPanelBusquedaPorCodigoTallaProducto.add(jLabelcodigoBusquedaPorCodigoTallaProducto, gridBagConstraintsTallaProducto);

		gridBagConstraintsTallaProducto = new GridBagConstraints();
		gridBagConstraintsTallaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTallaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTallaProducto.gridy = 0;
		gridBagConstraintsTallaProducto.gridx = 1;
		jPanelBusquedaPorCodigoTallaProducto.add(jTextFieldcodigoBusquedaPorCodigoTallaProducto, gridBagConstraintsTallaProducto);

		gridBagConstraintsTallaProducto = new GridBagConstraints();
		gridBagConstraintsTallaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTallaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTallaProducto.gridy = 1;
		gridBagConstraintsTallaProducto.gridx =1;
		jPanelBusquedaPorCodigoTallaProducto.add(jButtonBusquedaPorCodigoTallaProducto, gridBagConstraintsTallaProducto);

		jTabbedPaneBusquedasTallaProducto.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoTallaProducto);
		jTabbedPaneBusquedasTallaProducto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTallaProducto= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTallaProducto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTallaProducto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTallaProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTallaProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTallaProducto.setLayout(gridaBagLayoutBusquedaPorNombreTallaProducto);

		gridBagConstraintsTallaProducto = new GridBagConstraints();
		gridBagConstraintsTallaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTallaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTallaProducto.gridy = 0;
		gridBagConstraintsTallaProducto.gridx = 0;
		jPanelBusquedaPorNombreTallaProducto.add(jLabelnombreBusquedaPorNombreTallaProducto, gridBagConstraintsTallaProducto);

		gridBagConstraintsTallaProducto = new GridBagConstraints();
		gridBagConstraintsTallaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTallaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTallaProducto.gridy = 0;
		gridBagConstraintsTallaProducto.gridx = 1;
		jPanelBusquedaPorNombreTallaProducto.add(jTextAreanombreBusquedaPorNombreTallaProducto, gridBagConstraintsTallaProducto);

		gridBagConstraintsTallaProducto = new GridBagConstraints();
		gridBagConstraintsTallaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTallaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTallaProducto.gridy = 1;
		gridBagConstraintsTallaProducto.gridx =1;
		jPanelBusquedaPorNombreTallaProducto.add(jButtonBusquedaPorNombreTallaProducto, gridBagConstraintsTallaProducto);

		jTabbedPaneBusquedasTallaProducto.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreTallaProducto);
		jTabbedPaneBusquedasTallaProducto.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoProductoTallaProducto= new GridBagLayout();
		gridaBagLayoutFK_IdTipoProductoTallaProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoProductoTallaProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoProductoTallaProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoProductoTallaProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoProductoTallaProducto.setLayout(gridaBagLayoutFK_IdTipoProductoTallaProducto);

		gridBagConstraintsTallaProducto = new GridBagConstraints();
		gridBagConstraintsTallaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTallaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTallaProducto.gridy = 0;
		gridBagConstraintsTallaProducto.gridx = 0;
		jPanelFK_IdTipoProductoTallaProducto.add(jLabelid_tipo_productoFK_IdTipoProductoTallaProducto, gridBagConstraintsTallaProducto);

		gridBagConstraintsTallaProducto = new GridBagConstraints();
		gridBagConstraintsTallaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTallaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTallaProducto.gridy = 0;
		gridBagConstraintsTallaProducto.gridx = 1;
		jPanelFK_IdTipoProductoTallaProducto.add(jComboBoxid_tipo_productoFK_IdTipoProductoTallaProducto, gridBagConstraintsTallaProducto);

		gridBagConstraintsTallaProducto = new GridBagConstraints();
		gridBagConstraintsTallaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTallaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTallaProducto.gridy = 1;
		gridBagConstraintsTallaProducto.gridx =1;
		jPanelFK_IdTipoProductoTallaProducto.add(jButtonFK_IdTipoProductoTallaProducto, gridBagConstraintsTallaProducto);

		jTabbedPaneBusquedasTallaProducto.addTab("3.-Por Tipo Producto ", jPanelFK_IdTipoProductoTallaProducto);
		jTabbedPaneBusquedasTallaProducto.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTallaProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTallaProducto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tallaproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();						
			this.gridBagConstraintsTallaProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTallaProducto.gridx = 0;		
			//this.gridBagConstraintsTallaProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTallaProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTallaProducto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTallaProducto, this.gridBagConstraintsTallaProducto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTallaProducto.gridx = 0;		
		//this.gridBagConstraintsTallaProducto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTallaProducto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTallaProducto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTallaProducto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTallaProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTallaProducto.gridx = 0;		
			this.gridBagConstraintsTallaProducto.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTallaProducto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTallaProducto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTallaProducto, this.gridBagConstraintsTallaProducto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTallaProducto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTallaProducto, this.gridBagConstraintsTallaProducto);								
		
		
		/*
		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTallaProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTallaProducto, this.gridBagConstraintsTallaProducto);
		*/		
		
		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTallaProducto.gridx =0;
		this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTallaProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTallaProducto, this.gridBagConstraintsTallaProducto);
				
		
		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTallaProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTallaProducto, this.gridBagConstraintsTallaProducto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TallaProductoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTallaProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTallaProducto = new GridBagLayout();
			this.jPanelBusquedasParametrosTallaProducto.setLayout(gridaBagLayoutBusquedasParametrosTallaProducto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTallaProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTallaProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTallaProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTallaProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTallaProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTallaProducto, this.gridBagConstraintsTallaProducto);
			
			
		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTallaProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTallaProducto, this.gridBagConstraintsTallaProducto);
		
			
		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTallaProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTallaProducto, this.gridBagConstraintsTallaProducto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTallaProducto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTallaProducto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTallaProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTallaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTallaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTallaProducto.setName("jPanelReporteDinamicoTallaProducto"); 
		
		this.jPanelReporteDinamicoTallaProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTallaProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTallaProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTallaProducto.setLayout(gridaBagLayoutReporteDinamicoTallaProducto);
		
		
		this.jInternalFrameReporteDinamicoTallaProducto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTallaProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTallaProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTallaProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTallaProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTallaProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTallaProducto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTallaProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTallaProducto.setResizable(true);
	    this.jInternalFrameReporteDinamicoTallaProducto.setClosable(true);
	    this.jInternalFrameReporteDinamicoTallaProducto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTallaProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTallaProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTallaProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTallaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Talla Productos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTallaProducto = new JLabelMe();

		this.jLabelColumnasSelectReporteTallaProducto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTallaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTallaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTallaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTallaProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTallaProducto.add(this.jLabelColumnasSelectReporteTallaProducto, this.gridBagConstraintsTallaProducto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTallaProducto = new JList<Reporte>();
		this.jListColumnasSelectReporteTallaProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTallaProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTallaProducto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTallaProducto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTallaProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTallaProducto=new JScrollPane(this.jListColumnasSelectReporteTallaProducto);
			
			this.jScrollColumnasSelectReporteTallaProducto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTallaProducto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTallaProducto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTallaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTallaProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTallaProducto.add(this.jListColumnasSelectReporteTallaProducto, this.gridBagConstraintsTallaProducto);
		this.jPanelReporteDinamicoTallaProducto.add(this.jScrollColumnasSelectReporteTallaProducto, this.gridBagConstraintsTallaProducto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTallaProducto = new JLabelMe();

		this.jLabelRelacionesSelectReporteTallaProducto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTallaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTallaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTallaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTallaProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTallaProducto.add(this.jLabelRelacionesSelectReporteTallaProducto, this.gridBagConstraintsTallaProducto);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTallaProducto = new JList<Reporte>();
		this.jListRelacionesSelectReporteTallaProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTallaProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTallaProducto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTallaProducto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTallaProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTallaProducto=new JScrollPane(this.jListRelacionesSelectReporteTallaProducto);
			
			this.jScrollRelacionesSelectReporteTallaProducto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTallaProducto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTallaProducto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTallaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTallaProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTallaProducto.add(this.jListRelacionesSelectReporteTallaProducto, this.gridBagConstraintsTallaProducto);
		this.jPanelReporteDinamicoTallaProducto.add(this.jScrollRelacionesSelectReporteTallaProducto, this.gridBagConstraintsTallaProducto);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTallaProducto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTallaProducto = new JComboBoxMe();
		this.jListColumnasValoresGraficoTallaProducto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTallaProducto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTallaProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTallaProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTallaProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTallaProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTallaProducto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTallaProducto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTallaProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTallaProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTallaProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTallaProducto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTallaProducto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTallaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTallaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTallaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTallaProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTallaProducto.add(this.jLabelGenerarExcelReporteDinamicoTallaProducto, this.gridBagConstraintsTallaProducto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTallaProducto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTallaProducto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTallaProducto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTallaProducto.setToolTipText("Generar EXCEL"+" "+TallaProductoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		//this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTallaProducto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTallaProducto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTallaProducto.add(this.jButtonGenerarExcelReporteDinamicoTallaProducto, this.gridBagConstraintsTallaProducto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTallaProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTallaProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTallaProducto.add(this.jComboBoxTiposReportesDinamicoTallaProducto, this.gridBagConstraintsTallaProducto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTallaProducto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTallaProducto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTallaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTallaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTallaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTallaProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTallaProducto.add(this.jLabelTiposArchivoReporteDinamicoTallaProducto, this.gridBagConstraintsTallaProducto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTallaProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTallaProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTallaProducto.add(this.jComboBoxTiposArchivosReportesDinamicoTallaProducto, this.gridBagConstraintsTallaProducto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTallaProducto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTallaProducto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTallaProducto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTallaProducto.setToolTipText("Generar"+" "+TallaProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTallaProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTallaProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTallaProducto.add(this.jButtonGenerarReporteDinamicoTallaProducto, this.gridBagConstraintsTallaProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTallaProducto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTallaProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTallaProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTallaProducto.setToolTipText("Cancelar"+" "+TallaProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTallaProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTallaProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTallaProducto.add(this.jButtonCerrarReporteDinamicoTallaProducto, this.gridBagConstraintsTallaProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTallaProducto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTallaProducto= new JScrollPane(jPanelReporteDinamicoTallaProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTallaProducto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTallaProducto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTallaProducto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTallaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Talla Productos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTallaProducto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTallaProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTallaProducto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTallaProducto);
		this.jInternalFrameReporteDinamicoTallaProducto.getContentPane().add(this.jScrollPanelReporteDinamicoTallaProducto, this.gridBagConstraintsTallaProducto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTallaProducto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTallaProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTallaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTallaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTallaProducto.setName("jPanelImportacionTallaProducto"); 
		
		this.jPanelImportacionTallaProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTallaProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTallaProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTallaProducto.setLayout(gridaBagLayoutImportacionTallaProducto);
		
		
		this.jInternalFrameImportacionTallaProducto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTallaProducto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTallaProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTallaProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTallaProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTallaProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTallaProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTallaProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTallaProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTallaProducto.setResizable(true);
	    this.jInternalFrameImportacionTallaProducto.setClosable(true);
	    this.jInternalFrameImportacionTallaProducto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTallaProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTallaProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTallaProducto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTallaProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTallaProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTallaProducto.setResizable(true);
	    this.jInternalFrameImportacionTallaProducto.setClosable(true);
	    this.jInternalFrameImportacionTallaProducto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTallaProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTallaProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTallaProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTallaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Talla Productos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTallaProducto = new JLabelMe();

		this.jLabelArchivoImportacionTallaProducto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTallaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTallaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTallaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsTallaProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTallaProducto.add(this.jLabelArchivoImportacionTallaProducto, this.gridBagConstraintsTallaProducto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTallaProducto = new JFileChooser();		
		this.jFileChooserImportacionTallaProducto.setToolTipText("ESCOGER ARCHIVO"+" "+TallaProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTallaProducto = new JButtonMe();
		this.jButtonAbrirImportacionTallaProducto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTallaProducto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTallaProducto.setToolTipText("Generar"+" "+TallaProductoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTallaProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsTallaProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTallaProducto.add(this.jButtonAbrirImportacionTallaProducto, this.gridBagConstraintsTallaProducto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTallaProducto = new JLabelMe();

		this.jLabelPathArchivoImportacionTallaProducto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTallaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTallaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTallaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsTallaProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTallaProducto.add(this.jLabelPathArchivoImportacionTallaProducto, this.gridBagConstraintsTallaProducto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTallaProducto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTallaProducto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTallaProducto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTallaProducto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTallaProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsTallaProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTallaProducto.add(this.jTextFieldPathArchivoImportacionTallaProducto, this.gridBagConstraintsTallaProducto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTallaProducto = new JButtonMe();
		this.jButtonGenerarImportacionTallaProducto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTallaProducto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTallaProducto.setToolTipText("Generar"+" "+TallaProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTallaProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsTallaProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTallaProducto.add(this.jButtonGenerarImportacionTallaProducto, this.gridBagConstraintsTallaProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTallaProducto = new JButtonMe();
		this.jButtonCerrarImportacionTallaProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTallaProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTallaProducto.setToolTipText("Cancelar"+" "+TallaProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTallaProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsTallaProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTallaProducto.add(this.jButtonCerrarImportacionTallaProducto, this.gridBagConstraintsTallaProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTallaProducto = new GridBagLayout();
		
		this.jScrollPanelImportacionTallaProducto= new JScrollPane(jPanelImportacionTallaProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTallaProducto = new GridBagConstraints();
		this.gridBagConstraintsTallaProducto.gridy =iPosYImportacion;
		this.gridBagConstraintsTallaProducto.gridx =iPosXImportacion;
		this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTallaProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTallaProducto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTallaProducto);
		this.jInternalFrameImportacionTallaProducto.getContentPane().add(this.jScrollPanelImportacionTallaProducto, this.gridBagConstraintsTallaProducto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTallaProducto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTallaProducto = new JButtonMe();
			this.jButtonAbrirOrderByTallaProducto.setText("Orden");
			this.jButtonAbrirOrderByTallaProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTallaProducto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTallaProducto";
			inputMap = this.jButtonAbrirOrderByTallaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTallaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTallaProducto"));
		
		
			GridBagLayout gridaBagLayoutOrderByTallaProducto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTallaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTallaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTallaProducto.setName("jPanelOrderByTallaProducto"); 
			
			this.jPanelOrderByTallaProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTallaProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTallaProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTallaProducto.setLayout(gridaBagLayoutOrderByTallaProducto);
			
			
			this.jTableDatosTallaProductoOrderBy = new JTableMe();        
			this.jTableDatosTallaProductoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTallaProductoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTallaProductoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTallaProductoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTallaProductoOrderBy.setViewportView(this.jTableDatosTallaProductoOrderBy);
			this.jTableDatosTallaProductoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTallaProductoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTallaProducto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTallaProducto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTallaProducto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTallaProducto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTallaProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTallaProducto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTallaProducto.setTitle("Orden");
			this.jInternalFrameOrderByTallaProducto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTallaProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTallaProducto.setResizable(true);
			this.jInternalFrameOrderByTallaProducto.setClosable(true);
			this.jInternalFrameOrderByTallaProducto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTallaProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTallaProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTallaProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTallaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Talla Productos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			this.gridBagConstraintsTallaProducto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTallaProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTallaProducto.ipady =150;
				
			this.jPanelOrderByTallaProducto.add(jScrollPanelDatosTallaProductoOrderBy, this.gridBagConstraintsTallaProducto);//this.jTableDatosTallaProductoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTallaProducto = new JButtonMe();
			this.jButtonCerrarOrderByTallaProducto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTallaProducto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTallaProducto.setToolTipText("Cancelar"+" "+TallaProductoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTallaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTallaProducto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTallaProducto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTallaProducto.add(this.jButtonCerrarOrderByTallaProducto, this.gridBagConstraintsTallaProducto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTallaProducto = new GridBagLayout();
			
			this.jScrollPanelOrderByTallaProducto= new JScrollPane(jPanelOrderByTallaProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTallaProducto = new GridBagConstraints();
			this.gridBagConstraintsTallaProducto.gridy =iPosYOrderBy;
			this.gridBagConstraintsTallaProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsTallaProducto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTallaProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTallaProducto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTallaProducto);
			
			this.jInternalFrameOrderByTallaProducto.getContentPane().add(this.jScrollPanelOrderByTallaProducto, this.gridBagConstraintsTallaProducto);			
		
		} else {
			this.jButtonAbrirOrderByTallaProducto = new JButtonMe();
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
			&& this.tallaproductoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTallaProducto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTallaProducto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTallaProducto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTallaProducto.getRowHeight();//TallaProductoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tallaproductoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TallaProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTallaProducto.isSelected()) {
					iHeightTable=TallaProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TallaProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TallaProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TallaProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTallaProducto.isSelected()) {
					iHeightTable=TallaProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TallaProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TallaProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTallaProducto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTallaProducto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTallaProducto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTallaProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTallaProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTallaProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTallaProducto!=null && this.jInternalFrameOrderByTallaProducto.getjTableDatosOrderBy()!=null) {
			//if(!this.tallaproductoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTallaProducto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTallaProducto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTallaProducto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTallaProducto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTallaProducto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTallaProducto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTallaProducto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTallaProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTallaProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTallaProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tallaproductoLogic.getTallaProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tallaproductos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TallaProducto> TraerTallaProductoBeans(List<TallaProducto> tallaproductos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TallaProducto tallaproducto:tallaproductos) {
					
				if(!(TallaProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TallaProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tallaproducto.setsDetalleGeneralEntityReporte(TallaProductoConstantesFunciones.getTallaProductoDescripcion(tallaproducto));
										
						
					
					

					if(tallaproducto.getProductos()!=null && Funciones.existeClass(classes,Producto.class)) {
						try{tallaproducto.setproductosDescripcionReporte(new JRBeanCollectionDataSource(ProductoJInternalFrame.TraerProductoBeans(tallaproducto.getProductos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tallaproducto.getParametroInventarioDefectos()!=null && Funciones.existeClass(classes,ParametroInventarioDefecto.class)) {
						try{tallaproducto.setparametroinventariodefectosDescripcionReporte(new JRBeanCollectionDataSource(ParametroInventarioDefectoJInternalFrame.TraerParametroInventarioDefectoBeans(tallaproducto.getParametroInventarioDefectos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tallaproducto.setsDetalleGeneralEntityReporte(tallaproducto.getsDetalleGeneralEntityReporte());
										
				}
				
				//tallaproductobeans.add(tallaproductobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tallaproductos;
    }
	//PARA REPORTES FIN
}
