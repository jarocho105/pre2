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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

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
import com.bydan.erp.cartera.util.TransporteConstantesFunciones;

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
public class TransporteJInternalFrame extends TransporteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTransporte;
	
	protected JMenuBar jmenuBarTransporte;
	
	protected JMenu jmenuTransporte;
	protected JMenu jmenuDatosTransporte;
	protected JMenu jmenuArchivoTransporte;
	protected JMenu jmenuAccionesTransporte;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTransporte;	
	protected GridBagConstraints gridBagConstraintsTransporte;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TransporteDetalleFormJInternalFrame jInternalFrameDetalleFormTransporte;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTransporte;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTransporte;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoViaTransporteBeanSwingJInternalFrame tipoviatransporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoviatransporte="";
	
	public TransporteSessionBean transporteSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoViaTransporteSessionBean tipoviatransporteSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Transporte> transportes;		
	public List<Transporte> transportesEliminados;	
	public List<Transporte> transportesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTransporte;		
	protected JButton jButtonAbrirOrderByTransporte;
	
	
	//protected JPanel jPanelOrderByTransporte;
	//public JScrollPane jScrollPanelOrderByTransporte;	
	//protected JButton jButtonCerrarOrderByTransporte;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TransporteLogic transporteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTransporte;
	public JScrollPane jScrollPanelDatosEdicionTransporte;
	public JScrollPane jScrollPanelDatosGeneralTransporte;
    
	
	
	//public JScrollPane jScrollPanelDatosTransporteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTransporte;
	//public JScrollPane jScrollPanelImportacionTransporte;
	
	
	
	protected JPanel jPanelAccionesTransporte;
	
    protected JPanel jPanelPaginacionTransporte;
    protected JPanel jPanelParametrosReportesTransporte;
	protected JPanel jPanelParametrosReportesAccionesTransporte;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Transporte;
	protected JPanel jPanelParametrosAuxiliar2Transporte;
	protected JPanel jPanelParametrosAuxiliar3Transporte;
	protected JPanel jPanelParametrosAuxiliar4Transporte;
	//protected JPanel jPanelParametrosAuxiliar5Transporte;
	
	
	
	//protected JPanel jPanelReporteDinamicoTransporte;
	//protected JPanel jPanelImportacionTransporte;
	
	
	public JTable jTableDatosTransporte;
	
	
	
	//public JTable jTableDatosTransporteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTransporte;
	protected JButton jButtonDuplicarTransporte;
	protected JButton jButtonCopiarTransporte;
	protected JButton jButtonVerFormTransporte;
	protected JButton jButtonNuevoRelacionesTransporte;
	protected JButton jButtonModificarTransporte;
	
    protected JButton jButtonGuardarCambiosTablaTransporte;
	protected JButton jButtonCerrarTransporte;
	
	
	protected JButton jButtonRecargarInformacionTransporte;
	protected JButton jButtonProcesarInformacionTransporte;
	
	
	protected JButton jButtonAnterioresTransporte;
	protected JButton jButtonSiguientesTransporte;
	protected JButton jButtonNuevoGuardarCambiosTransporte;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTransporte;
	//protected JButton jButtonCerrarReporteDinamicoTransporte;
	//protected JButton jButtonGenerarExcelReporteDinamicoTransporte;	
	
	
	
	//protected JButton jButtonAbrirImportacionTransporte;
	//protected JButton jButtonGenerarImportacionTransporte;
	//protected JButton jButtonCerrarImportacionTransporte;
	//protected JFileChooser jFileChooserImportacionTransporte;
	//protected File fileImportacionTransporte;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTransporte;
	protected JButton jButtonDuplicarToolBarTransporte;
	protected JButton jButtonNuevoRelacionesToolBarTransporte;
	
	
	public JButton jButtonGuardarCambiosToolBarTransporte;
	protected JButton jButtonCopiarToolBarTransporte;
	protected JButton jButtonVerFormToolBarTransporte;
	public JButton jButtonGuardarCambiosTablaToolBarTransporte;
	protected JButton jButtonMostrarOcultarTablaToolBarTransporte;
	protected JButton jButtonCerrarToolBarTransporte;
	
	protected JButton jButtonRecargarInformacionToolBarTransporte;
	protected JButton jButtonProcesarInformacionToolBarTransporte;
	protected JButton jButtonAnterioresToolBarTransporte;
	protected JButton jButtonSiguientesToolBarTransporte;
	protected JButton jButtonNuevoGuardarCambiosToolBarTransporte;
	protected JButton jButtonAbrirOrderByToolBarTransporte;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTransporte;
	protected JMenuItem jMenuItemDuplicarTransporte;
	protected JMenuItem jMenuItemNuevoRelacionesTransporte;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTransporte;
	protected JMenuItem jMenuItemCopiarTransporte;
	protected JMenuItem jMenuItemVerFormTransporte;
	protected JMenuItem jMenuItemGuardarCambiosTablaTransporte;
	protected JMenuItem jMenuItemCerrarTransporte;
	protected JMenuItem jMenuItemDetalleCerrarTransporte;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTransporte;
	protected JMenuItem jMenuItemDetalleMostarOcultarTransporte;
	
	protected JMenuItem jMenuItemRecargarInformacionTransporte;
	protected JMenuItem jMenuItemProcesarInformacionTransporte;
	protected JMenuItem jMenuItemAnterioresTransporte;
	protected JMenuItem jMenuItemSiguientesTransporte;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTransporte;
	protected JMenuItem jMenuItemAbrirOrderByTransporte;
	protected JMenuItem jMenuItemMostrarOcultarTransporte;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTransporte;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTransporte;
	protected JCheckBox jCheckBoxSeleccionadosTransporte;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTransporte;
	protected JCheckBox jCheckBoxConGraficoReporteTransporte;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTransporte;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTransporte;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTransporte;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTransporte;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTransporte;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTransporte;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTransporte;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTransporte;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTransporte;
	protected JTextField jTextFieldValorCampoGeneralTransporte;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTransporte;
	//public JList<Reporte> jListColumnasSelectReporteTransporte;
	//public JScrollPane jScrollColumnasSelectReporteTransporte;
	
	//public JLabel jLabelRelacionesSelectReporteTransporte;
	//public JList<Reporte> jListRelacionesSelectReporteTransporte;
	//public JScrollPane jScrollRelacionesSelectReporteTransporte;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTransporte;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTransporte;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTransporte;
	//public JLabel jLabelTiposArchivoReporteDinamicoTransporte;
	
		
	//public JLabel jLabelArchivoImportacionTransporte;	
	//public JLabel jLabelPathArchivoImportacionTransporte;
	//protected JTextField jTextFieldPathArchivoImportacionTransporte;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTransporte;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTransporte;
	
	//public JLabel jLabelColumnaCategoriaValorTransporte;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTransporte;
	
	//public JLabel jLabelColumnasValoresGraficoTransporte;
	//public JList<Reporte> jListColumnasValoresGraficoTransporte;
	//public JScrollPane jScrollColumnasValoresGraficoTransporte;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTransporte;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTransporte;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTransporte;
	public JPanel jPanelBusquedaPorCodigoTransporte;
	public JButton jButtonBusquedaPorCodigoTransporte;
	public JPanel jPanelBusquedaPorNombreTransporte;
	public JButton jButtonBusquedaPorNombreTransporte;
	public JPanel jPanelFK_IdTipoViaTransporteTransporte;
	public JButton jButtonFK_IdTipoViaTransporteTransporte;
	
	public JPanel jPanelcodigoBusquedaPorCodigoTransporte;
	public JLabel jLabelcodigoBusquedaPorCodigoTransporte;
	public JTextField jTextFieldcodigoBusquedaPorCodigoTransporte;
	public JButton jButtoncodigoBusquedaPorCodigoTransporteBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTransporte;
	public JLabel jLabelnombreBusquedaPorNombreTransporte;
	public JTextArea jTextAreanombreBusquedaPorNombreTransporte;
	public JButton jButtonnombreBusquedaPorNombreTransporteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_via_transporteFK_IdTipoViaTransporteTransporte;
	public JLabel jLabelid_tipo_via_transporteFK_IdTipoViaTransporteTransporte;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransporte;
	public JButton jButtonid_tipo_via_transporteFK_IdTipoViaTransporteTransporte= new JButtonMe();
	public JButton jButtonid_tipo_via_transporteFK_IdTipoViaTransporteTransporteUpdate= new JButtonMe();
	public JButton jButtonid_tipo_via_transporteFK_IdTipoViaTransporteTransporteBusqueda= new JButtonMe();

	
	
	
	
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
	public TransporteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Transporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransporteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Transporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransporteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Transporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransporteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Transporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTransporte)	{
		this.jButtonRecargarInformacionTransporte = jButtonRecargarInformacionTransporte;
	}
	
	public JButton getjButtonProcesarInformacionTransporte() {
		return this.jButtonProcesarInformacionTransporte;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTransporte)	{
		this.jButtonProcesarInformacionTransporte = jButtonProcesarInformacionTransporte;
	}
	
	
	public JButton getjButtonRecargarInformacionTransporte() {
		return this.jButtonRecargarInformacionTransporte;
	}
	
	
	public List<Transporte> gettransportes() {
		return this.transportes;
	}

	public void settransportes(List<Transporte> transportes) {
		this.transportes = transportes;
	}
	
	public List<Transporte> gettransportesAux() {
		return this.transportesAux;
	}

	public void settransportesAux(List<Transporte> transportesAux) {
		this.transportesAux = transportesAux;
	}
	
	public List<Transporte> gettransportesEliminados() {
		return this.transportesEliminados;
	}

	public void setTransportesEliminados(List<Transporte> transportesEliminados) {
		this.transportesEliminados = transportesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTransporte() {
		return jComboBoxTiposSeleccionarTransporte;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTransporte(
			JComboBox jComboBoxTiposSeleccionarTransporte) {
		this.jComboBoxTiposSeleccionarTransporte = jComboBoxTiposSeleccionarTransporte;
	}
	
	public void setBorderResaltarTiposSeleccionarTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTransporte.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTransporte .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTransporte() {
		return jTextFieldValorCampoGeneralTransporte;
	}

	public void setjTextFieldValorCampoGeneralTransporte(
			JTextField jTextFieldValorCampoGeneralTransporte) {
		this.jTextFieldValorCampoGeneralTransporte = jTextFieldValorCampoGeneralTransporte;
	}

	public void setBorderResaltarValorCampoGeneralTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransporte.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTransporte .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTransporte() {
		return this.jCheckBoxSeleccionarTodosTransporte;
	}

	public void setjCheckBoxSeleccionarTodosTransporte(
			JCheckBox jCheckBoxSeleccionarTodosTransporte) {
		this.jCheckBoxSeleccionarTodosTransporte = jCheckBoxSeleccionarTodosTransporte;
	}

	public void setBorderResaltarSeleccionarTodosTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransporte.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTransporte .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTransporte() {
		return this.jCheckBoxSeleccionadosTransporte;
	}

	public void setjCheckBoxSeleccionadosTransporte(
			JCheckBox jCheckBoxSeleccionadosTransporte) {
		this.jCheckBoxSeleccionadosTransporte = jCheckBoxSeleccionadosTransporte;
	}
	
	public void setBorderResaltarSeleccionadosTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransporte.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTransporte .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTransporte() {
		return this.jComboBoxTiposArchivosReportesTransporte;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTransporte(
			JComboBox jComboBoxTiposArchivosReportesTransporte) {
		this.jComboBoxTiposArchivosReportesTransporte = jComboBoxTiposArchivosReportesTransporte;
	}

	public void setBorderResaltarTiposArchivosReportesTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransporte.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTransporte .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTransporte() {
		return this.jComboBoxTiposReportesTransporte;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTransporte(
			JComboBox jComboBoxTiposReportesTransporte) {
		this.jComboBoxTiposReportesTransporte = jComboBoxTiposReportesTransporte;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTransporte() {
	//	return jComboBoxTiposReportesDinamicoTransporte;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTransporte(
	//		JComboBox jComboBoxTiposReportesDinamicoTransporte) {
	//	this.jComboBoxTiposReportesDinamicoTransporte = jComboBoxTiposReportesDinamicoTransporte;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTransporte() {
	//	return jComboBoxTiposArchivosReportesDinamicoTransporte;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTransporte(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTransporte) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTransporte = jComboBoxTiposArchivosReportesDinamicoTransporte;
	//}
	
	public void setBorderResaltarTiposReportesTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransporte.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTransporte .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTransporte() {
		return this.jComboBoxTiposGraficosReportesTransporte;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTransporte(
			JComboBox jComboBoxTiposGraficosReportesTransporte) {
		this.jComboBoxTiposGraficosReportesTransporte = jComboBoxTiposGraficosReportesTransporte;
	}
	
	public void setBorderResaltarTiposGraficosReportesTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransporte.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTransporte .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTransporte() {
		return this.jComboBoxTiposPaginacionTransporte;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTransporte(
			JComboBox jComboBoxTiposPaginacionTransporte) {
		this.jComboBoxTiposPaginacionTransporte = jComboBoxTiposPaginacionTransporte;
	}
	
	public void setBorderResaltarTiposPaginacionTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransporte.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTransporte .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTransporte() {
		return this.jComboBoxTiposRelacionesTransporte;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTransporte() {
		return this.jComboBoxTiposAccionesTransporte;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTransporte(
			JComboBox jComboBoxTiposRelacionesTransporte) {
		this.jComboBoxTiposRelacionesTransporte = jComboBoxTiposRelacionesTransporte;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTransporte(
			JComboBox jComboBoxTiposAccionesTransporte) {
		this.jComboBoxTiposAccionesTransporte = jComboBoxTiposAccionesTransporte;
	}
	
	public void setBorderResaltarTiposRelacionesTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransporte.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTransporte .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransporte.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTransporte .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTransporte() {
	//	return jCheckBoxConGraficoDinamicoTransporte;
	//}

	//public void setjCheckBoxConGraficoDinamicoTransporte(
	//		JCheckBox jCheckBoxConGraficoDinamicoTransporte) {
	//	this.jCheckBoxConGraficoDinamicoTransporte = jCheckBoxConGraficoDinamicoTransporte;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTransporte() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTransporte.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTransporte .setBorder(borderResaltar);		
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
		this.transporteSessionBean=new TransporteSessionBean();
		
		this.transporteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.transporteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.transporteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TransporteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TransporteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TransporteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TransporteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TransporteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Transporte MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.transporteSessionBean.getEsGuardarRelacionado()) {
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
		
		TransporteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Transporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTransporte= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTransporte,this.jTtoolBarTransporte,
							"nuevo","nuevo","Nuevo"+" "+TransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTransporte,this.jTtoolBarTransporte,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTransporte,this.jTtoolBarTransporte,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTransporte,this.jTtoolBarTransporte,
							"duplicar","duplicar","Duplicar"+" "+TransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTransporte,this.jTtoolBarTransporte,
							"copiar","copiar","Copiar"+" "+TransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTransporte,this.jTtoolBarTransporte,
							"ver_form","ver_form","Ver"+" "+TransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTransporte,this.jTtoolBarTransporte,
							"recargar","recargar","Recargar"+" "+TransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTransporte,this.jTtoolBarTransporte,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTransporte,this.jTtoolBarTransporte,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTransporte,this.jTtoolBarTransporte,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTransporte,this.jTtoolBarTransporte,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTransporte,this.jTtoolBarTransporte,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTransporte,this.jTtoolBarTransporte,
							"cerrar","cerrar","Salir"+" "+TransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTransporte=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTransporte;
			
				this.jButtonProcesarInformacionToolBarTransporte=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTransporte;
				
		//protected JButton jButtonModificarToolBarTransporte;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTransporte=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTransporte=new JMenuMe("General");
		this.jmenuArchivoTransporte=new JMenuMe("Archivo");
		this.jmenuAccionesTransporte=new JMenuMe("Acciones");
		this.jmenuDatosTransporte=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTransporte= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTransporte.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTransporte,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTransporte= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTransporte.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTransporte,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTransporte= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTransporte.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTransporte,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTransporte= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTransporte.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTransporte,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTransporte= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTransporte.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTransporte,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTransporte= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTransporte.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTransporte,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTransporte= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTransporte.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTransporte,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTransporte= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTransporte.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTransporte,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTransporte= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTransporte.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTransporte,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTransporte= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTransporte.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTransporte,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTransporte= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTransporte.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTransporte,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTransporte= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTransporte.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTransporte,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTransporte= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTransporte.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTransporte,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTransporte= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTransporte.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTransporte,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTransporte= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTransporte.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTransporte,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTransporte= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTransporte.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTransporte,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTransporte= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTransporte.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTransporte,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTransporte.add(this.jMenuItemCerrarTransporte);
			
			this.jmenuAccionesTransporte.add(this.jMenuItemNuevoTransporte);
			this.jmenuAccionesTransporte.add(this.jMenuItemNuevoGuardarCambiosTransporte);
			this.jmenuAccionesTransporte.add(this.jMenuItemNuevoRelacionesTransporte);
			this.jmenuAccionesTransporte.add(this.jMenuItemGuardarCambiosTablaTransporte);		
			this.jmenuAccionesTransporte.add(this.jMenuItemDuplicarTransporte);		
			this.jmenuAccionesTransporte.add(this.jMenuItemCopiarTransporte);		
			this.jmenuAccionesTransporte.add(this.jMenuItemVerFormTransporte);		
			
			this.jmenuDatosTransporte.add(this.jMenuItemRecargarInformacionTransporte);				
			this.jmenuDatosTransporte.add(this.jMenuItemAnterioresTransporte);				
			this.jmenuDatosTransporte.add(this.jMenuItemSiguientesTransporte);				
			this.jmenuDatosTransporte.add(this.jMenuItemAbrirOrderByTransporte);				
			this.jmenuDatosTransporte.add(this.jMenuItemMostrarOcultarTransporte);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTransporte.add(this.jMenuItemGuardarCambiosTransporte);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTransporte.add(this.jmenuArchivoTransporte);		
			this.jmenuBarTransporte.add(this.jmenuAccionesTransporte);		
			this.jmenuBarTransporte.add(this.jmenuDatosTransporte);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTransporte);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTransporte() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoTransporte.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoTransporte= new JButtonMe();
		this.jButtonBusquedaPorCodigoTransporte.setText("Buscar");
		this.jButtonBusquedaPorCodigoTransporte.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoTransporte,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoTransporte = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoTransporte.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoTransporte.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoTransporte,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoTransporte= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoTransporte,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTransporte.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTransporte= new JButtonMe();
		this.jButtonBusquedaPorNombreTransporte.setText("Buscar");
		this.jButtonBusquedaPorNombreTransporte.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTransporte,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTransporte = new JLabelMe();
		jLabelnombreBusquedaPorNombreTransporte.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTransporte.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTransporte,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTransporte= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTransporte,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoViaTransporteTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoViaTransporteTransporte.setToolTipText("Buscar Por Tipo Via Transporte ");
		this.jButtonFK_IdTipoViaTransporteTransporte= new JButtonMe();
		this.jButtonFK_IdTipoViaTransporteTransporte.setText("Buscar");
		this.jButtonFK_IdTipoViaTransporteTransporte.setToolTipText("Buscar Por Tipo Via Transporte ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoViaTransporteTransporte,"buscar_button","Buscar Por Tipo Via Transporte ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoViaTransporteTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_via_transporteFK_IdTipoViaTransporteTransporte = new JLabelMe();
		jLabelid_tipo_via_transporteFK_IdTipoViaTransporteTransporte.setText("Tipo Via Transporte :");
		jLabelid_tipo_via_transporteFK_IdTipoViaTransporteTransporte.setToolTipText("Tipo Via Transporte");
		jLabelid_tipo_via_transporteFK_IdTipoViaTransporteTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_via_transporteFK_IdTipoViaTransporteTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_via_transporteFK_IdTipoViaTransporteTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_via_transporteFK_IdTipoViaTransporteTransporte,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransporte= new JComboBoxMe();
		jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransporte,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTransporte=new JTabbedPane();


		this.jTabbedPaneBusquedasTransporte.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTransporte.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTransporte.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTransporte.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTransporte,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTransporte = new TransporteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Transporte DATOS");
			this.jInternalFrameDetalleFormTransporte = new TransporteDetalleFormJInternalFrame(jDesktopPane,this.transporteSessionBean.getConGuardarRelaciones(),this.transporteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTransporte = null;//new TransporteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTransporte= new GridBagLayout();
		
		
		this.jTableDatosTransporte = new JTableMe();      
		
		String sToolTipTransporte="";
		sToolTipTransporte=TransporteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTransporte+="(Cartera.Transporte)";
		}
		
		if(!this.transporteSessionBean.getEsGuardarRelacionado()) {
			sToolTipTransporte+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTransporte.setToolTipText(sToolTipTransporte);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTransporte);
		this.jTableDatosTransporte.setAutoCreateRowSorter(true);
		this.jTableDatosTransporte.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTransporte.setRowSelectionAllowed(true);
		this.jTableDatosTransporte.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTransporte,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTransporte = new JButtonMe();
		this.jButtonDuplicarTransporte = new JButtonMe();
		this.jButtonCopiarTransporte = new JButtonMe();
		this.jButtonVerFormTransporte = new JButtonMe();
		this.jButtonNuevoRelacionesTransporte = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTransporte = new JButtonMe();
		this.jButtonCerrarTransporte = new JButtonMe();
		
		this.jScrollPanelDatosTransporte = new JScrollPane();   
        this.jScrollPanelDatosGeneralTransporte = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Transporte";
		
		if(!this.transporteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transportes" + this.sPath));
		} else {
			this.jScrollPanelDatosTransporte.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTransporte.setToolTipText("Acciones");
        this.jPanelAccionesTransporte.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTransporte, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTransporte=new ReporteDinamicoJInternalFrame(TransporteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTransporte();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTransporte=new ImportacionJInternalFrame(TransporteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTransporte();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTransporte = new JButtonMe();
		
		this.jButtonAbrirOrderByTransporte.setText("Orden");
		this.jButtonAbrirOrderByTransporte.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTransporte,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTransporte=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransporte,false,this);
			
			//this.cargarOrderByTransporte(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTransporte=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransporte,true,this);
			
			//this.cargarOrderByTransporte(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTransporte.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosTransporte.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosTransporte.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosTransporte.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTransporte.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTransporte.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTransporte.setText("Nuevo");
		this.jButtonDuplicarTransporte.setText("Duplicar");
		this.jButtonCopiarTransporte.setText("Copiar");
		this.jButtonVerFormTransporte.setText("Ver");
		this.jButtonNuevoRelacionesTransporte.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTransporte.setText("Guardar");
		this.jButtonCerrarTransporte.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTransporte,"nuevo_button","Nuevo",this.transporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTransporte,"duplicar_button","Duplicar",this.transporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTransporte,"copiar_button","Copiar",this.transporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTransporte,"ver_form","Ver",this.transporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTransporte,"nuevorelaciones_button","Nuevo Rel",this.transporteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTransporte,"guardarcambiostabla_button","Guardar",this.transporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTransporte,"cerrar_button","Salir",this.transporteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTransporte, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTransporte.setToolTipText("Nuevo"+" "+TransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTransporte.setToolTipText("Duplicar"+" "+TransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTransporte.setToolTipText("Copiar"+" "+TransporteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTransporte.setToolTipText("Ver"+" "+TransporteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTransporte.setToolTipText("Nuevo Rel"+" "+TransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTransporte.setToolTipText("Guardar"+" "+TransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTransporte.setToolTipText("Salir"+" "+TransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTransporte";
		inputMap = this.jButtonNuevoTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTransporte.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTransporte"));
		
		//DUPLICAR
		sMapKey = "DuplicarTransporte";
		inputMap = this.jButtonDuplicarTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTransporte.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTransporte"));
		
		//COPIAR
		sMapKey = "CopiarTransporte";
		inputMap = this.jButtonCopiarTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTransporte.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTransporte"));
		
		//VEr FORM
		sMapKey = "VerFormTransporte";
		inputMap = this.jButtonVerFormTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTransporte.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTransporte"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTransporte";
		inputMap = this.jButtonNuevoRelacionesTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTransporte"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTransporte";
		inputMap = this.jButtonModificarTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTransporte"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTransporte";
		inputMap = this.jButtonCerrarTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTransporte"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTransporte";
		inputMap = this.jButtonGuardarCambiosTablaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTransporte"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Transporte= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Transporte= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Transporte= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Transporte= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Transporte= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTransporte.setName("jPanelParametrosReportesTransporte"); 
		
		this.jPanelParametrosReportesAccionesTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTransporte.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTransporte.setName("jPanelParametrosReportesAccionesTransporte"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTransporte = new JButtonMe();
		this.jButtonRecargarInformacionTransporte.setText("Recargar");
		this.jButtonRecargarInformacionTransporte.setToolTipText("Recargar"+" "+TransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTransporte,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTransporte = new JButtonMe();
		this.jButtonProcesarInformacionTransporte.setText("Procesar");
		this.jButtonProcesarInformacionTransporte.setToolTipText("Procesar"+" "+TransporteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTransporte.setVisible(false);
			
		this.jButtonProcesarInformacionTransporte.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTransporte.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTransporte.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTransporte = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTransporte.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTransporte.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTransporte = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTransporte.setText("TIPO");       
		this.jComboBoxTiposReportesTransporte.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTransporte = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTransporte.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTransporte.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTransporte = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTransporte.setText("Paginacion");
		this.jComboBoxTiposPaginacionTransporte.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTransporte = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTransporte.setText("Accion");
		this.jComboBoxTiposRelacionesTransporte.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTransporte = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTransporte.setText("Accion");
		this.jComboBoxTiposAccionesTransporte.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTransporte = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTransporte.setText("Accion");
		this.jComboBoxTiposSeleccionarTransporte.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTransporte=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTransporte.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTransporte.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTransporte.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTransporte = new JLabelMe();
		
		this.jLabelAccionesTransporte.setText("Acciones");		
		this.jLabelAccionesTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTransporte = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTransporte.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTransporte.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTransporte = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTransporte.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTransporte.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTransporte = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTransporte.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTransporte.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTransporte = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTransporte.setText("Graf.");
		this.jCheckBoxConGraficoReporteTransporte.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTransporte = new JButtonMe();
		//this.jButtonAnterioresTransporte.setText("<<");
        this.jButtonAnterioresTransporte.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTransporte,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTransporte = new JButtonMe();
		//this.jButtonSiguientesTransporte.setText(">>");
        this.jButtonSiguientesTransporte.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTransporte,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTransporte = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTransporte.setText("Nue");
        this.jButtonNuevoGuardarCambiosTransporte.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTransporte,"nuevoguardarcambios_button","Nue",this.transporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTransporte";
		inputMap = this.jButtonNuevoGuardarCambiosTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTransporte"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTransporte";
		inputMap = this.jButtonRecargarInformacionTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTransporte"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTransporte";
		inputMap = this.jButtonSiguientesTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTransporte"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTransporte";
		inputMap = this.jButtonAnterioresTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTransporte"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTransporte();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTransporte.setMinimumSize(new Dimension(this.getWidth(),TransporteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TransporteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTransporte.setMaximumSize(new Dimension(this.getWidth(),TransporteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TransporteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTransporte.setPreferredSize(new Dimension(this.getWidth(),TransporteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TransporteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTransporte = new GridBagLayout();

			this.jPanelPaginacionTransporte.setLayout(gridaBagLayoutPaginacionTransporte);						
			
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			this.gridBagConstraintsTransporte.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransporte.gridy = 0;
			this.gridBagConstraintsTransporte.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTransporte.add(this.jButtonAnterioresTransporte, this.gridBagConstraintsTransporte);
					
						
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			this.gridBagConstraintsTransporte.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTransporte.gridy = 0;
			
			this.jPanelPaginacionTransporte.add(this.jButtonNuevoGuardarCambiosTransporte, this.gridBagConstraintsTransporte);
						
			
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			this.gridBagConstraintsTransporte.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTransporte.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTransporte.gridy = 0;
			this.jPanelPaginacionTransporte.add(this.jButtonSiguientesTransporte, this.gridBagConstraintsTransporte);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			this.gridBagConstraintsTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransporte.gridy = 1;
			this.gridBagConstraintsTransporte.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransporte.add(this.jButtonNuevoTransporte, this.gridBagConstraintsTransporte);
						
			
			
			if(!this.transporteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTransporte = new GridBagConstraints();
				this.gridBagConstraintsTransporte.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTransporte.gridy = 1;
				this.gridBagConstraintsTransporte.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTransporte.add(this.jButtonGuardarCambiosTablaTransporte, this.gridBagConstraintsTransporte);
			}
			
			
			
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			this.gridBagConstraintsTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransporte.gridy = 1;
			this.gridBagConstraintsTransporte.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransporte.add(this.jButtonDuplicarTransporte, this.gridBagConstraintsTransporte);
			
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			this.gridBagConstraintsTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransporte.gridy = 1;
			this.gridBagConstraintsTransporte.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransporte.add(this.jButtonCopiarTransporte, this.gridBagConstraintsTransporte);
		
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			this.gridBagConstraintsTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransporte.gridy = 1;
			this.gridBagConstraintsTransporte.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransporte.add(this.jButtonVerFormTransporte, this.gridBagConstraintsTransporte);
		
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			this.gridBagConstraintsTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransporte.gridy = 1;
			this.gridBagConstraintsTransporte.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTransporte.add(this.jButtonCerrarTransporte, this.gridBagConstraintsTransporte);
		
		
		
		this.jButtonRecargarInformacionTransporte.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTransporte.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTransporte.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTransporte, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTransporte.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTransporte.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTransporte.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTransporte.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTransporte.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTransporte.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTransporte.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTransporte.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTransporte.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTransporte.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTransporte.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTransporte.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTransporte.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTransporte.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTransporte.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTransporte.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransporte.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransporte.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTransporte.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTransporte.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTransporte.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTransporte.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTransporte.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTransporte.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTransporte.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTransporte.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTransporte.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTransporte, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTransporte.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTransporte.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTransporte.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTransporte.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTransporte.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTransporte.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTransporte = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTransporte = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Transporte = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Transporte = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Transporte = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Transporte = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTransporte.setLayout(gridaBagParametrosReportesTransporte);
			this.jPanelParametrosReportesAccionesTransporte.setLayout(gridaBagParametrosReportesAccionesTransporte);
			
			
			this.jPanelParametrosAuxiliar1Transporte.setLayout(gridaBagParametrosAuxiliar1Transporte);
			this.jPanelParametrosAuxiliar2Transporte.setLayout(gridaBagParametrosAuxiliar2Transporte);
			this.jPanelParametrosAuxiliar3Transporte.setLayout(gridaBagParametrosAuxiliar3Transporte);
			this.jPanelParametrosAuxiliar4Transporte.setLayout(gridaBagParametrosAuxiliar4Transporte);
			//this.jPanelParametrosAuxiliar5Transporte.setLayout(gridaBagParametrosAuxiliar2Transporte);			
			
			
			
			
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			this.gridBagConstraintsTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransporte.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransporte.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransporte.add(this.jButtonRecargarInformacionTransporte, this.gridBagConstraintsTransporte);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			this.gridBagConstraintsTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransporte.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransporte.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Transporte.add(this.jComboBoxTiposPaginacionTransporte, this.gridBagConstraintsTransporte);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			this.gridBagConstraintsTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransporte.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransporte.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Transporte.add(this.jCheckBoxConAltoMaximoTablaTransporte, this.gridBagConstraintsTransporte);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			this.gridBagConstraintsTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransporte.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransporte.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Transporte.add(this.jComboBoxTiposArchivosReportesTransporte, this.gridBagConstraintsTransporte);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			this.gridBagConstraintsTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransporte.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransporte.add(this.jPanelParametrosAuxiliar1Transporte, this.gridBagConstraintsTransporte);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			this.gridBagConstraintsTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransporte.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransporte.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Transporte.add(this.jComboBoxTiposReportesTransporte, this.gridBagConstraintsTransporte);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			this.gridBagConstraintsTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransporte.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransporte.add(this.jPanelParametrosAuxiliar4Transporte, this.gridBagConstraintsTransporte);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			this.gridBagConstraintsTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransporte.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransporte.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransporte.add(this.jComboBoxTiposReportesTransporte, this.gridBagConstraintsTransporte);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			this.gridBagConstraintsTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransporte.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransporte.add(this.jCheckBoxGenerarReporteTransporte, this.gridBagConstraintsTransporte);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			this.gridBagConstraintsTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransporte.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransporte.add(this.jPanelParametrosAuxiliar2Transporte, this.gridBagConstraintsTransporte);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			this.gridBagConstraintsTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransporte.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransporte.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransporte.add(this.jLabelAccionesTransporte, this.gridBagConstraintsTransporte);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTransporte = new GridBagConstraints();
				this.gridBagConstraintsTransporte.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTransporte.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTransporte.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTransporte.add(this.jButtonAbrirOrderByTransporte, this.gridBagConstraintsTransporte);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			this.gridBagConstraintsTransporte.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransporte.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransporte.add(this.jComboBoxTiposSeleccionarTransporte, this.gridBagConstraintsTransporte);			
			
			
			/*
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			this.gridBagConstraintsTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransporte.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransporte.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransporte.add(this.jCheckBoxSeleccionarTodosTransporte, this.gridBagConstraintsTransporte);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			this.gridBagConstraintsTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransporte.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransporte.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Transporte.add(this.jCheckBoxSeleccionarTodosTransporte, this.gridBagConstraintsTransporte);															
				
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			this.gridBagConstraintsTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransporte.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransporte.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Transporte.add(this.jCheckBoxSeleccionadosTransporte, this.gridBagConstraintsTransporte);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			this.gridBagConstraintsTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransporte.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransporte.add(this.jPanelParametrosAuxiliar3Transporte, this.gridBagConstraintsTransporte);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			this.gridBagConstraintsTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransporte.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransporte.add(this.jComboBoxTiposRelacionesTransporte, this.gridBagConstraintsTransporte);
				
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			this.gridBagConstraintsTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransporte.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransporte.add(this.jComboBoxTiposAccionesTransporte, this.gridBagConstraintsTransporte);
	
				
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			this.gridBagConstraintsTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransporte.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransporte.add(this.jTextFieldValorCampoGeneralTransporte, this.gridBagConstraintsTransporte);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTransporte = new GridBagLayout();

			this.jScrollPanelDatosTransporte.setLayout(gridaBagLayoutDatosTransporte);
			
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			this.gridBagConstraintsTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransporte.gridy = 0;
			this.gridBagConstraintsTransporte.gridx = 0;
			
			this.jScrollPanelDatosTransporte.add(this.jTableDatosTransporte, this.gridBagConstraintsTransporte);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTransporte.setViewportView(this.jTableDatosTransporte);
		this.jTableDatosTransporte.setFillsViewportHeight(true);
		this.jTableDatosTransporte.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTransporte= new GridBagLayout();
		this.jPanelAccionesTransporte.setLayout(gridaBagLayoutAccionesTransporte);
		
		
		/*	
		this.gridBagConstraintsTransporte = new GridBagConstraints();
		this.gridBagConstraintsTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransporte.gridy = 0;
		this.gridBagConstraintsTransporte.gridx = 0;
			
		this.jPanelAccionesTransporte.add(this.jButtonNuevoTransporte, this.gridBagConstraintsTransporte);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoTransporte= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoTransporte.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTransporte.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTransporte.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoTransporte.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoTransporte.setLayout(gridaBagLayoutBusquedaPorCodigoTransporte);

		gridBagConstraintsTransporte = new GridBagConstraints();
		gridBagConstraintsTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransporte.gridy = 0;
		gridBagConstraintsTransporte.gridx = 0;
		jPanelBusquedaPorCodigoTransporte.add(jLabelcodigoBusquedaPorCodigoTransporte, gridBagConstraintsTransporte);

		gridBagConstraintsTransporte = new GridBagConstraints();
		gridBagConstraintsTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransporte.gridy = 0;
		gridBagConstraintsTransporte.gridx = 1;
		jPanelBusquedaPorCodigoTransporte.add(jTextFieldcodigoBusquedaPorCodigoTransporte, gridBagConstraintsTransporte);

		gridBagConstraintsTransporte = new GridBagConstraints();
		gridBagConstraintsTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransporte.gridy = 1;
		gridBagConstraintsTransporte.gridx =1;
		jPanelBusquedaPorCodigoTransporte.add(jButtonBusquedaPorCodigoTransporte, gridBagConstraintsTransporte);

		jTabbedPaneBusquedasTransporte.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoTransporte);
		jTabbedPaneBusquedasTransporte.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTransporte= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTransporte.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTransporte.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTransporte.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTransporte.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTransporte.setLayout(gridaBagLayoutBusquedaPorNombreTransporte);

		gridBagConstraintsTransporte = new GridBagConstraints();
		gridBagConstraintsTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransporte.gridy = 0;
		gridBagConstraintsTransporte.gridx = 0;
		jPanelBusquedaPorNombreTransporte.add(jLabelnombreBusquedaPorNombreTransporte, gridBagConstraintsTransporte);

		gridBagConstraintsTransporte = new GridBagConstraints();
		gridBagConstraintsTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransporte.gridy = 0;
		gridBagConstraintsTransporte.gridx = 1;
		jPanelBusquedaPorNombreTransporte.add(jTextAreanombreBusquedaPorNombreTransporte, gridBagConstraintsTransporte);

		gridBagConstraintsTransporte = new GridBagConstraints();
		gridBagConstraintsTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransporte.gridy = 1;
		gridBagConstraintsTransporte.gridx =1;
		jPanelBusquedaPorNombreTransporte.add(jButtonBusquedaPorNombreTransporte, gridBagConstraintsTransporte);

		jTabbedPaneBusquedasTransporte.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreTransporte);
		jTabbedPaneBusquedasTransporte.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoViaTransporteTransporte= new GridBagLayout();
		gridaBagLayoutFK_IdTipoViaTransporteTransporte.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoViaTransporteTransporte.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoViaTransporteTransporte.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoViaTransporteTransporte.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoViaTransporteTransporte.setLayout(gridaBagLayoutFK_IdTipoViaTransporteTransporte);

		gridBagConstraintsTransporte = new GridBagConstraints();
		gridBagConstraintsTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransporte.gridy = 0;
		gridBagConstraintsTransporte.gridx = 0;
		jPanelFK_IdTipoViaTransporteTransporte.add(jLabelid_tipo_via_transporteFK_IdTipoViaTransporteTransporte, gridBagConstraintsTransporte);

		gridBagConstraintsTransporte = new GridBagConstraints();
		gridBagConstraintsTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransporte.gridy = 0;
		gridBagConstraintsTransporte.gridx = 1;
		jPanelFK_IdTipoViaTransporteTransporte.add(jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransporte, gridBagConstraintsTransporte);

		gridBagConstraintsTransporte = new GridBagConstraints();
		gridBagConstraintsTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransporte.gridy = 1;
		gridBagConstraintsTransporte.gridx =1;
		jPanelFK_IdTipoViaTransporteTransporte.add(jButtonFK_IdTipoViaTransporteTransporte, gridBagConstraintsTransporte);

		jTabbedPaneBusquedasTransporte.addTab("3.-Por Tipo Via Transporte ", jPanelFK_IdTipoViaTransporteTransporte);
		jTabbedPaneBusquedasTransporte.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTransporte = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTransporte);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.transporteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTransporte = new GridBagConstraints();						
			this.gridBagConstraintsTransporte.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTransporte.gridx = 0;		
			//this.gridBagConstraintsTransporte.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransporte.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTransporte.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTransporte, this.gridBagConstraintsTransporte);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTransporte = new GridBagConstraints();
		this.gridBagConstraintsTransporte.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTransporte.gridx = 0;		
		//this.gridBagConstraintsTransporte.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransporte.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTransporte.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTransporte);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTransporte = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTransporte.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTransporte.gridx = 0;		
			this.gridBagConstraintsTransporte.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransporte.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTransporte.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTransporte, this.gridBagConstraintsTransporte);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTransporte = new GridBagConstraints();
		this.gridBagConstraintsTransporte.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransporte.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTransporte, this.gridBagConstraintsTransporte);								
		
		
		/*
		this.gridBagConstraintsTransporte = new GridBagConstraints();
		this.gridBagConstraintsTransporte.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransporte.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTransporte, this.gridBagConstraintsTransporte);
		*/		
		
		this.gridBagConstraintsTransporte = new GridBagConstraints();
		this.gridBagConstraintsTransporte.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTransporte.gridx =0;
		this.gridBagConstraintsTransporte.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTransporte.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTransporte, this.gridBagConstraintsTransporte);
				
		
		this.gridBagConstraintsTransporte = new GridBagConstraints();
		this.gridBagConstraintsTransporte.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransporte.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTransporte, this.gridBagConstraintsTransporte);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TransporteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTransporte= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTransporte = new GridBagLayout();
			this.jPanelBusquedasParametrosTransporte.setLayout(gridaBagLayoutBusquedasParametrosTransporte);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTransporte=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTransporte.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransporte.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransporte.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTransporte = new GridBagConstraints();
		this.gridBagConstraintsTransporte.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransporte.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTransporte, this.gridBagConstraintsTransporte);
			
			
		this.gridBagConstraintsTransporte = new GridBagConstraints();
		this.gridBagConstraintsTransporte.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransporte.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTransporte, this.gridBagConstraintsTransporte);
		
			
		this.gridBagConstraintsTransporte = new GridBagConstraints();
		this.gridBagConstraintsTransporte.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTransporte.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTransporte, this.gridBagConstraintsTransporte);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTransporte;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTransporte() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTransporte = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTransporte.setName("jPanelReporteDinamicoTransporte"); 
		
		this.jPanelReporteDinamicoTransporte.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTransporte.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTransporte.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTransporte.setLayout(gridaBagLayoutReporteDinamicoTransporte);
		
		
		this.jInternalFrameReporteDinamicoTransporte= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTransporte = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTransporte= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTransporte.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTransporte.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTransporte.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTransporte.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTransporte.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTransporte.setResizable(true);
	    this.jInternalFrameReporteDinamicoTransporte.setClosable(true);
	    this.jInternalFrameReporteDinamicoTransporte.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTransporte.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTransporte.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTransporte.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transportes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTransporte = new JLabelMe();

		this.jLabelColumnasSelectReporteTransporte.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTransporte = new GridBagConstraints();
		this.gridBagConstraintsTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransporte.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTransporte.add(this.jLabelColumnasSelectReporteTransporte, this.gridBagConstraintsTransporte);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTransporte = new JList<Reporte>();
		this.jListColumnasSelectReporteTransporte.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTransporte.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTransporte.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTransporte.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTransporte.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTransporte=new JScrollPane(this.jListColumnasSelectReporteTransporte);
			
			this.jScrollColumnasSelectReporteTransporte.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTransporte.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTransporte.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTransporte = new GridBagConstraints();
		this.gridBagConstraintsTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransporte.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTransporte.add(this.jListColumnasSelectReporteTransporte, this.gridBagConstraintsTransporte);
		this.jPanelReporteDinamicoTransporte.add(this.jScrollColumnasSelectReporteTransporte, this.gridBagConstraintsTransporte);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTransporte = new JLabelMe();

		this.jLabelRelacionesSelectReporteTransporte.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTransporte = new JList<Reporte>();
		this.jListRelacionesSelectReporteTransporte.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTransporte.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTransporte.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTransporte.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTransporte.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTransporte=new JScrollPane(this.jListRelacionesSelectReporteTransporte);
			
			this.jScrollRelacionesSelectReporteTransporte.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTransporte.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTransporte.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTransporte = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTransporte = new JComboBoxMe();
		this.jListColumnasValoresGraficoTransporte = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTransporte = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTransporte.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTransporte.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTransporte.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTransporte.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTransporte = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTransporte.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTransporte.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTransporte.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTransporte.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTransporte = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTransporte.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTransporte = new GridBagConstraints();
		this.gridBagConstraintsTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransporte.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransporte.add(this.jLabelGenerarExcelReporteDinamicoTransporte, this.gridBagConstraintsTransporte);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTransporte = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTransporte.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTransporte,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTransporte.setToolTipText("Generar EXCEL"+" "+TransporteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTransporte = new GridBagConstraints();
		//this.gridBagConstraintsTransporte.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTransporte.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTransporte.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTransporte.add(this.jButtonGenerarExcelReporteDinamicoTransporte, this.gridBagConstraintsTransporte);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTransporte = new GridBagConstraints();
		this.gridBagConstraintsTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransporte.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransporte.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransporte.add(this.jComboBoxTiposReportesDinamicoTransporte, this.gridBagConstraintsTransporte);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTransporte = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTransporte.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTransporte = new GridBagConstraints();
		this.gridBagConstraintsTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransporte.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransporte.add(this.jLabelTiposArchivoReporteDinamicoTransporte, this.gridBagConstraintsTransporte);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTransporte = new GridBagConstraints();
		this.gridBagConstraintsTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransporte.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransporte.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransporte.add(this.jComboBoxTiposArchivosReportesDinamicoTransporte, this.gridBagConstraintsTransporte);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTransporte = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTransporte.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTransporte,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTransporte.setToolTipText("Generar"+" "+TransporteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTransporte = new GridBagConstraints();
		this.gridBagConstraintsTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransporte.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransporte.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransporte.add(this.jButtonGenerarReporteDinamicoTransporte, this.gridBagConstraintsTransporte);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTransporte = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTransporte.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTransporte,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTransporte.setToolTipText("Cancelar"+" "+TransporteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTransporte = new GridBagConstraints();
		this.gridBagConstraintsTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransporte.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransporte.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransporte.add(this.jButtonCerrarReporteDinamicoTransporte, this.gridBagConstraintsTransporte);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTransporte = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTransporte= new JScrollPane(jPanelReporteDinamicoTransporte,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTransporte.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTransporte.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTransporte.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transportes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTransporte = new GridBagConstraints();
		this.gridBagConstraintsTransporte.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTransporte.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTransporte.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTransporte.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTransporte.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTransporte);
		this.jInternalFrameReporteDinamicoTransporte.getContentPane().add(this.jScrollPanelReporteDinamicoTransporte, this.gridBagConstraintsTransporte);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTransporte() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTransporte = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTransporte.setName("jPanelImportacionTransporte"); 
		
		this.jPanelImportacionTransporte.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTransporte.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTransporte.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTransporte.setLayout(gridaBagLayoutImportacionTransporte);
		
		
		this.jInternalFrameImportacionTransporte= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTransporte= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTransporte = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTransporte= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTransporte.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTransporte.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTransporte.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTransporte.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTransporte.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTransporte.setResizable(true);
	    this.jInternalFrameImportacionTransporte.setClosable(true);
	    this.jInternalFrameImportacionTransporte.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTransporte.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTransporte.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTransporte.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTransporte.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTransporte.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTransporte.setResizable(true);
	    this.jInternalFrameImportacionTransporte.setClosable(true);
	    this.jInternalFrameImportacionTransporte.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTransporte.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTransporte.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTransporte.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transportes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTransporte = new JLabelMe();

		this.jLabelArchivoImportacionTransporte.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTransporte = new GridBagConstraints();
		this.gridBagConstraintsTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransporte.gridy = iPosYImportacion;		
		this.gridBagConstraintsTransporte.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTransporte.add(this.jLabelArchivoImportacionTransporte, this.gridBagConstraintsTransporte);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTransporte = new JFileChooser();		
		this.jFileChooserImportacionTransporte.setToolTipText("ESCOGER ARCHIVO"+" "+TransporteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTransporte = new JButtonMe();
		this.jButtonAbrirImportacionTransporte.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTransporte,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTransporte.setToolTipText("Generar"+" "+TransporteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTransporte = new GridBagConstraints();
		this.gridBagConstraintsTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransporte.gridy = iPosYImportacion;
		this.gridBagConstraintsTransporte.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransporte.add(this.jButtonAbrirImportacionTransporte, this.gridBagConstraintsTransporte);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTransporte = new JLabelMe();

		this.jLabelPathArchivoImportacionTransporte.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTransporte = new GridBagConstraints();
		this.gridBagConstraintsTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransporte.gridy = iPosYImportacion;		
		this.gridBagConstraintsTransporte.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTransporte.add(this.jLabelPathArchivoImportacionTransporte, this.gridBagConstraintsTransporte);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTransporte=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTransporte.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTransporte.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTransporte.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTransporte = new GridBagConstraints();
		this.gridBagConstraintsTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransporte.gridy = iPosYImportacion;
		this.gridBagConstraintsTransporte.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransporte.add(this.jTextFieldPathArchivoImportacionTransporte, this.gridBagConstraintsTransporte);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTransporte = new JButtonMe();
		this.jButtonGenerarImportacionTransporte.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTransporte,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTransporte.setToolTipText("Generar"+" "+TransporteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTransporte = new GridBagConstraints();
		this.gridBagConstraintsTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransporte.gridy = iPosYImportacion;
		this.gridBagConstraintsTransporte.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransporte.add(this.jButtonGenerarImportacionTransporte, this.gridBagConstraintsTransporte);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTransporte = new JButtonMe();
		this.jButtonCerrarImportacionTransporte.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTransporte,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTransporte.setToolTipText("Cancelar"+" "+TransporteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTransporte = new GridBagConstraints();
		this.gridBagConstraintsTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransporte.gridy = iPosYImportacion;
		this.gridBagConstraintsTransporte.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransporte.add(this.jButtonCerrarImportacionTransporte, this.gridBagConstraintsTransporte);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTransporte = new GridBagLayout();
		
		this.jScrollPanelImportacionTransporte= new JScrollPane(jPanelImportacionTransporte,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTransporte = new GridBagConstraints();
		this.gridBagConstraintsTransporte.gridy =iPosYImportacion;
		this.gridBagConstraintsTransporte.gridx =iPosXImportacion;
		this.gridBagConstraintsTransporte.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTransporte.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTransporte.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTransporte);
		this.jInternalFrameImportacionTransporte.getContentPane().add(this.jScrollPanelImportacionTransporte, this.gridBagConstraintsTransporte);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTransporte(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTransporte = new JButtonMe();
			this.jButtonAbrirOrderByTransporte.setText("Orden");
			this.jButtonAbrirOrderByTransporte.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTransporte,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTransporte";
			inputMap = this.jButtonAbrirOrderByTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTransporte"));
		
		
			GridBagLayout gridaBagLayoutOrderByTransporte = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTransporte.setName("jPanelOrderByTransporte"); 
			
			this.jPanelOrderByTransporte.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTransporte.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTransporte.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTransporte.setLayout(gridaBagLayoutOrderByTransporte);
			
			
			this.jTableDatosTransporteOrderBy = new JTableMe();        
			this.jTableDatosTransporteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTransporteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTransporteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTransporteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTransporteOrderBy.setViewportView(this.jTableDatosTransporteOrderBy);
			this.jTableDatosTransporteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTransporteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTransporte= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTransporte= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTransporte = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTransporte= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTransporte.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTransporte.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTransporte.setTitle("Orden");
			this.jInternalFrameOrderByTransporte.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTransporte.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTransporte.setResizable(true);
			this.jInternalFrameOrderByTransporte.setClosable(true);
			this.jInternalFrameOrderByTransporte.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTransporte.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTransporte.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTransporte.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transportes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			this.gridBagConstraintsTransporte.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTransporte.gridx =iPosXOrderBy;
			this.gridBagConstraintsTransporte.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTransporte.ipady =150;
				
			this.jPanelOrderByTransporte.add(jScrollPanelDatosTransporteOrderBy, this.gridBagConstraintsTransporte);//this.jTableDatosTransporteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTransporte = new JButtonMe();
			this.jButtonCerrarOrderByTransporte.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTransporte,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTransporte.setToolTipText("Cancelar"+" "+TransporteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			this.gridBagConstraintsTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransporte.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTransporte.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTransporte.add(this.jButtonCerrarOrderByTransporte, this.gridBagConstraintsTransporte);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTransporte = new GridBagLayout();
			
			this.jScrollPanelOrderByTransporte= new JScrollPane(jPanelOrderByTransporte,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			this.gridBagConstraintsTransporte.gridy =iPosYOrderBy;
			this.gridBagConstraintsTransporte.gridx =iPosXOrderBy;
			this.gridBagConstraintsTransporte.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTransporte.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTransporte.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTransporte);
			
			this.jInternalFrameOrderByTransporte.getContentPane().add(this.jScrollPanelOrderByTransporte, this.gridBagConstraintsTransporte);			
		
		} else {
			this.jButtonAbrirOrderByTransporte = new JButtonMe();
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
		int iWidthTableCalculado=0;//1030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.transporteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTransporte.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTransporte.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTransporte.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTransporte.getRowHeight();//TransporteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.transporteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TransporteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTransporte.isSelected()) {
					iHeightTable=TransporteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TransporteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TransporteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TransporteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTransporte.isSelected()) {
					iHeightTable=TransporteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TransporteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TransporteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTransporte.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTransporte.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTransporte.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTransporte.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTransporte.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTransporte.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTransporte!=null && this.jInternalFrameOrderByTransporte.getjTableDatosOrderBy()!=null) {
			//if(!this.transporteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTransporte.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTransporte.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTransporte.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTransporte.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTransporte.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTransporte.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTransporte.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTransporte.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTransporte.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTransporte.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=transporteLogic.getTransportes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=transportes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Transporte> TraerTransporteBeans(List<Transporte> transportes,ArrayList<Classe> classes)throws Exception {
		try {
			for(Transporte transporte:transportes) {
					
				if(!(TransporteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TransporteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					transporte.setsDetalleGeneralEntityReporte(TransporteConstantesFunciones.getTransporteDescripcion(transporte));
										
						
					
						
					
				} else  {
							
					//transporte.setsDetalleGeneralEntityReporte(transporte.getsDetalleGeneralEntityReporte());
										
				}
				
				//transportebeans.add(transportebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return transportes;
    }
	//PARA REPORTES FIN
}
