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

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.cartera.util.MontoConstantesFunciones;

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
public class MontoJInternalFrame extends MontoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarMonto;
	
	protected JMenuBar jmenuBarMonto;
	
	protected JMenu jmenuMonto;
	protected JMenu jmenuDatosMonto;
	protected JMenu jmenuArchivoMonto;
	protected JMenu jmenuAccionesMonto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosMonto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutMonto;	
	protected GridBagConstraints gridBagConstraintsMonto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public MontoDetalleFormJInternalFrame jInternalFrameDetalleFormMonto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoMonto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionMonto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public MontoSessionBean montoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Monto> montos;		
	public List<Monto> montosEliminados;	
	public List<Monto> montosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByMonto;		
	protected JButton jButtonAbrirOrderByMonto;
	
	
	//protected JPanel jPanelOrderByMonto;
	//public JScrollPane jScrollPanelOrderByMonto;	
	//protected JButton jButtonCerrarOrderByMonto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public MontoLogic montoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosMonto;
	public JScrollPane jScrollPanelDatosEdicionMonto;
	public JScrollPane jScrollPanelDatosGeneralMonto;
    
	
	
	//public JScrollPane jScrollPanelDatosMontoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoMonto;
	//public JScrollPane jScrollPanelImportacionMonto;
	
	
	
	protected JPanel jPanelAccionesMonto;
	
    protected JPanel jPanelPaginacionMonto;
    protected JPanel jPanelParametrosReportesMonto;
	protected JPanel jPanelParametrosReportesAccionesMonto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Monto;
	protected JPanel jPanelParametrosAuxiliar2Monto;
	protected JPanel jPanelParametrosAuxiliar3Monto;
	protected JPanel jPanelParametrosAuxiliar4Monto;
	//protected JPanel jPanelParametrosAuxiliar5Monto;
	
	
	
	//protected JPanel jPanelReporteDinamicoMonto;
	//protected JPanel jPanelImportacionMonto;
	
	
	public JTable jTableDatosMonto;
	
	
	
	//public JTable jTableDatosMontoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoMonto;
	protected JButton jButtonDuplicarMonto;
	protected JButton jButtonCopiarMonto;
	protected JButton jButtonVerFormMonto;
	protected JButton jButtonNuevoRelacionesMonto;
	protected JButton jButtonModificarMonto;
	
    protected JButton jButtonGuardarCambiosTablaMonto;
	protected JButton jButtonCerrarMonto;
	
	
	protected JButton jButtonRecargarInformacionMonto;
	protected JButton jButtonProcesarInformacionMonto;
	
	
	protected JButton jButtonAnterioresMonto;
	protected JButton jButtonSiguientesMonto;
	protected JButton jButtonNuevoGuardarCambiosMonto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoMonto;
	//protected JButton jButtonCerrarReporteDinamicoMonto;
	//protected JButton jButtonGenerarExcelReporteDinamicoMonto;	
	
	
	
	//protected JButton jButtonAbrirImportacionMonto;
	//protected JButton jButtonGenerarImportacionMonto;
	//protected JButton jButtonCerrarImportacionMonto;
	//protected JFileChooser jFileChooserImportacionMonto;
	//protected File fileImportacionMonto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarMonto;
	protected JButton jButtonDuplicarToolBarMonto;
	protected JButton jButtonNuevoRelacionesToolBarMonto;
	
	
	public JButton jButtonGuardarCambiosToolBarMonto;
	protected JButton jButtonCopiarToolBarMonto;
	protected JButton jButtonVerFormToolBarMonto;
	public JButton jButtonGuardarCambiosTablaToolBarMonto;
	protected JButton jButtonMostrarOcultarTablaToolBarMonto;
	protected JButton jButtonCerrarToolBarMonto;
	
	protected JButton jButtonRecargarInformacionToolBarMonto;
	protected JButton jButtonProcesarInformacionToolBarMonto;
	protected JButton jButtonAnterioresToolBarMonto;
	protected JButton jButtonSiguientesToolBarMonto;
	protected JButton jButtonNuevoGuardarCambiosToolBarMonto;
	protected JButton jButtonAbrirOrderByToolBarMonto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoMonto;
	protected JMenuItem jMenuItemDuplicarMonto;
	protected JMenuItem jMenuItemNuevoRelacionesMonto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosMonto;
	protected JMenuItem jMenuItemCopiarMonto;
	protected JMenuItem jMenuItemVerFormMonto;
	protected JMenuItem jMenuItemGuardarCambiosTablaMonto;
	protected JMenuItem jMenuItemCerrarMonto;
	protected JMenuItem jMenuItemDetalleCerrarMonto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByMonto;
	protected JMenuItem jMenuItemDetalleMostarOcultarMonto;
	
	protected JMenuItem jMenuItemRecargarInformacionMonto;
	protected JMenuItem jMenuItemProcesarInformacionMonto;
	protected JMenuItem jMenuItemAnterioresMonto;
	protected JMenuItem jMenuItemSiguientesMonto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosMonto;
	protected JMenuItem jMenuItemAbrirOrderByMonto;
	protected JMenuItem jMenuItemMostrarOcultarMonto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesMonto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosMonto;
	protected JCheckBox jCheckBoxSeleccionadosMonto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaMonto;
	protected JCheckBox jCheckBoxConGraficoReporteMonto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesMonto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesMonto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoMonto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoMonto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesMonto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionMonto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesMonto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesMonto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarMonto;
	protected JTextField jTextFieldValorCampoGeneralMonto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteMonto;
	//public JList<Reporte> jListColumnasSelectReporteMonto;
	//public JScrollPane jScrollColumnasSelectReporteMonto;
	
	//public JLabel jLabelRelacionesSelectReporteMonto;
	//public JList<Reporte> jListRelacionesSelectReporteMonto;
	//public JScrollPane jScrollRelacionesSelectReporteMonto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoMonto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoMonto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoMonto;
	//public JLabel jLabelTiposArchivoReporteDinamicoMonto;
	
		
	//public JLabel jLabelArchivoImportacionMonto;	
	//public JLabel jLabelPathArchivoImportacionMonto;
	//protected JTextField jTextFieldPathArchivoImportacionMonto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoMonto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoMonto;
	
	//public JLabel jLabelColumnaCategoriaValorMonto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorMonto;
	
	//public JLabel jLabelColumnasValoresGraficoMonto;
	//public JList<Reporte> jListColumnasValoresGraficoMonto;
	//public JScrollPane jScrollColumnasValoresGraficoMonto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoMonto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoMonto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasMonto;
	public JPanel jPanelBusquedaPorEsGeneralMonto;
	public JButton jButtonBusquedaPorEsGeneralMonto;
	public JPanel jPanelFK_IdClienteMonto;
	public JButton jButtonFK_IdClienteMonto;
	
	public JPanel jPaneles_generalBusquedaPorEsGeneralMonto;
	public JLabel jLabeles_generalBusquedaPorEsGeneralMonto;
	public JCheckBox jCheckBoxes_generalBusquedaPorEsGeneralMonto;
	public JButton jButtones_generalBusquedaPorEsGeneralMontoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_clienteFK_IdClienteMonto;
	public JLabel jLabelid_clienteFK_IdClienteMonto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteMonto;
	public JButton jButtonid_clienteFK_IdClienteMonto= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteMontoUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteMontoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteMonto;
	
	
	
	
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
	public MontoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Monto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MontoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Monto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MontoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Monto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MontoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Monto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionMonto)	{
		this.jButtonRecargarInformacionMonto = jButtonRecargarInformacionMonto;
	}
	
	public JButton getjButtonProcesarInformacionMonto() {
		return this.jButtonProcesarInformacionMonto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionMonto)	{
		this.jButtonProcesarInformacionMonto = jButtonProcesarInformacionMonto;
	}
	
	
	public JButton getjButtonRecargarInformacionMonto() {
		return this.jButtonRecargarInformacionMonto;
	}
	
	
	public List<Monto> getmontos() {
		return this.montos;
	}

	public void setmontos(List<Monto> montos) {
		this.montos = montos;
	}
	
	public List<Monto> getmontosAux() {
		return this.montosAux;
	}

	public void setmontosAux(List<Monto> montosAux) {
		this.montosAux = montosAux;
	}
	
	public List<Monto> getmontosEliminados() {
		return this.montosEliminados;
	}

	public void setMontosEliminados(List<Monto> montosEliminados) {
		this.montosEliminados = montosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarMonto() {
		return jComboBoxTiposSeleccionarMonto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarMonto(
			JComboBox jComboBoxTiposSeleccionarMonto) {
		this.jComboBoxTiposSeleccionarMonto = jComboBoxTiposSeleccionarMonto;
	}
	
	public void setBorderResaltarTiposSeleccionarMonto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarMonto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarMonto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralMonto() {
		return jTextFieldValorCampoGeneralMonto;
	}

	public void setjTextFieldValorCampoGeneralMonto(
			JTextField jTextFieldValorCampoGeneralMonto) {
		this.jTextFieldValorCampoGeneralMonto = jTextFieldValorCampoGeneralMonto;
	}

	public void setBorderResaltarValorCampoGeneralMonto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMonto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralMonto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosMonto() {
		return this.jCheckBoxSeleccionarTodosMonto;
	}

	public void setjCheckBoxSeleccionarTodosMonto(
			JCheckBox jCheckBoxSeleccionarTodosMonto) {
		this.jCheckBoxSeleccionarTodosMonto = jCheckBoxSeleccionarTodosMonto;
	}

	public void setBorderResaltarSeleccionarTodosMonto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMonto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosMonto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosMonto() {
		return this.jCheckBoxSeleccionadosMonto;
	}

	public void setjCheckBoxSeleccionadosMonto(
			JCheckBox jCheckBoxSeleccionadosMonto) {
		this.jCheckBoxSeleccionadosMonto = jCheckBoxSeleccionadosMonto;
	}
	
	public void setBorderResaltarSeleccionadosMonto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMonto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosMonto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesMonto() {
		return this.jComboBoxTiposArchivosReportesMonto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesMonto(
			JComboBox jComboBoxTiposArchivosReportesMonto) {
		this.jComboBoxTiposArchivosReportesMonto = jComboBoxTiposArchivosReportesMonto;
	}

	public void setBorderResaltarTiposArchivosReportesMonto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMonto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesMonto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesMonto() {
		return this.jComboBoxTiposReportesMonto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesMonto(
			JComboBox jComboBoxTiposReportesMonto) {
		this.jComboBoxTiposReportesMonto = jComboBoxTiposReportesMonto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoMonto() {
	//	return jComboBoxTiposReportesDinamicoMonto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoMonto(
	//		JComboBox jComboBoxTiposReportesDinamicoMonto) {
	//	this.jComboBoxTiposReportesDinamicoMonto = jComboBoxTiposReportesDinamicoMonto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoMonto() {
	//	return jComboBoxTiposArchivosReportesDinamicoMonto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoMonto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoMonto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoMonto = jComboBoxTiposArchivosReportesDinamicoMonto;
	//}
	
	public void setBorderResaltarTiposReportesMonto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMonto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesMonto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesMonto() {
		return this.jComboBoxTiposGraficosReportesMonto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesMonto(
			JComboBox jComboBoxTiposGraficosReportesMonto) {
		this.jComboBoxTiposGraficosReportesMonto = jComboBoxTiposGraficosReportesMonto;
	}
	
	public void setBorderResaltarTiposGraficosReportesMonto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMonto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesMonto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionMonto() {
		return this.jComboBoxTiposPaginacionMonto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionMonto(
			JComboBox jComboBoxTiposPaginacionMonto) {
		this.jComboBoxTiposPaginacionMonto = jComboBoxTiposPaginacionMonto;
	}
	
	public void setBorderResaltarTiposPaginacionMonto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMonto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionMonto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesMonto() {
		return this.jComboBoxTiposRelacionesMonto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesMonto() {
		return this.jComboBoxTiposAccionesMonto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesMonto(
			JComboBox jComboBoxTiposRelacionesMonto) {
		this.jComboBoxTiposRelacionesMonto = jComboBoxTiposRelacionesMonto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesMonto(
			JComboBox jComboBoxTiposAccionesMonto) {
		this.jComboBoxTiposAccionesMonto = jComboBoxTiposAccionesMonto;
	}
	
	public void setBorderResaltarTiposRelacionesMonto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMonto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesMonto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesMonto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMonto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesMonto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoMonto() {
	//	return jCheckBoxConGraficoDinamicoMonto;
	//}

	//public void setjCheckBoxConGraficoDinamicoMonto(
	//		JCheckBox jCheckBoxConGraficoDinamicoMonto) {
	//	this.jCheckBoxConGraficoDinamicoMonto = jCheckBoxConGraficoDinamicoMonto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoMonto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarMonto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoMonto .setBorder(borderResaltar);		
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
		this.montoSessionBean=new MontoSessionBean();
		
		this.montoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.montoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.montoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=MontoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=MontoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		MontoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		MontoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		MontoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Monto De Facturacion MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.montoSessionBean.getEsGuardarRelacionado()) {
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
		
		MontoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Monto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarMonto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarMonto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarMonto,this.jTtoolBarMonto,
							"nuevo","nuevo","Nuevo"+" "+MontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarMonto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarMonto,this.jTtoolBarMonto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarMonto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarMonto,this.jTtoolBarMonto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+MontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarMonto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarMonto,this.jTtoolBarMonto,
							"duplicar","duplicar","Duplicar"+" "+MontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarMonto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarMonto,this.jTtoolBarMonto,
							"copiar","copiar","Copiar"+" "+MontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarMonto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarMonto,this.jTtoolBarMonto,
							"ver_form","ver_form","Ver"+" "+MontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarMonto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMonto,this.jTtoolBarMonto,
							"recargar","recargar","Recargar"+" "+MontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarMonto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMonto,this.jTtoolBarMonto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarMonto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMonto,this.jTtoolBarMonto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarMonto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarMonto,this.jTtoolBarMonto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarMonto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarMonto,this.jTtoolBarMonto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarMonto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarMonto,this.jTtoolBarMonto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+MontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarMonto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarMonto,this.jTtoolBarMonto,
							"cerrar","cerrar","Salir"+" "+MontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarMonto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarMonto;
			
				this.jButtonProcesarInformacionToolBarMonto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarMonto;
				
		//protected JButton jButtonModificarToolBarMonto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarMonto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuMonto=new JMenuMe("General");
		this.jmenuArchivoMonto=new JMenuMe("Archivo");
		this.jmenuAccionesMonto=new JMenuMe("Acciones");
		this.jmenuDatosMonto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoMonto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoMonto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoMonto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarMonto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarMonto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarMonto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesMonto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesMonto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesMonto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosMonto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosMonto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosMonto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarMonto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarMonto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarMonto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormMonto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormMonto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormMonto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaMonto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaMonto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaMonto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarMonto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarMonto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarMonto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionMonto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionMonto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionMonto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionMonto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionMonto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionMonto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresMonto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresMonto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresMonto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesMonto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesMonto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesMonto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByMonto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByMonto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByMonto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarMonto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarMonto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarMonto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByMonto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByMonto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByMonto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarMonto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarMonto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarMonto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarMonto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosMonto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosMonto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosMonto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoMonto.add(this.jMenuItemCerrarMonto);
			
			this.jmenuAccionesMonto.add(this.jMenuItemNuevoMonto);
			this.jmenuAccionesMonto.add(this.jMenuItemNuevoGuardarCambiosMonto);
			this.jmenuAccionesMonto.add(this.jMenuItemNuevoRelacionesMonto);
			this.jmenuAccionesMonto.add(this.jMenuItemGuardarCambiosTablaMonto);		
			this.jmenuAccionesMonto.add(this.jMenuItemDuplicarMonto);		
			this.jmenuAccionesMonto.add(this.jMenuItemCopiarMonto);		
			this.jmenuAccionesMonto.add(this.jMenuItemVerFormMonto);		
			
			this.jmenuDatosMonto.add(this.jMenuItemRecargarInformacionMonto);				
			this.jmenuDatosMonto.add(this.jMenuItemAnterioresMonto);				
			this.jmenuDatosMonto.add(this.jMenuItemSiguientesMonto);				
			this.jmenuDatosMonto.add(this.jMenuItemAbrirOrderByMonto);				
			this.jmenuDatosMonto.add(this.jMenuItemMostrarOcultarMonto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesMonto.add(this.jMenuItemGuardarCambiosMonto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesMonto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosMonto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarMonto.add(this.jmenuArchivoMonto);		
			this.jmenuBarMonto.add(this.jmenuAccionesMonto);		
			this.jmenuBarMonto.add(this.jmenuDatosMonto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarMonto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasMonto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorEsGeneralMonto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorEsGeneralMonto.setToolTipText("Buscar Por Es General ");
		this.jButtonBusquedaPorEsGeneralMonto= new JButtonMe();
		this.jButtonBusquedaPorEsGeneralMonto.setText("Buscar");
		this.jButtonBusquedaPorEsGeneralMonto.setToolTipText("Buscar Por Es General ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorEsGeneralMonto,"buscar_button","Buscar Por Es General ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorEsGeneralMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabeles_generalBusquedaPorEsGeneralMonto = new JLabelMe();
		jLabeles_generalBusquedaPorEsGeneralMonto.setText("Es General :");
		jLabeles_generalBusquedaPorEsGeneralMonto.setToolTipText("Es General");
		jLabeles_generalBusquedaPorEsGeneralMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabeles_generalBusquedaPorEsGeneralMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabeles_generalBusquedaPorEsGeneralMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabeles_generalBusquedaPorEsGeneralMonto,STIPO_TAMANIO_GENERAL,false,true,this);

		jCheckBoxes_generalBusquedaPorEsGeneralMonto= new JCheckBoxMe();
		jCheckBoxes_generalBusquedaPorEsGeneralMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_generalBusquedaPorEsGeneralMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_generalBusquedaPorEsGeneralMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_generalBusquedaPorEsGeneralMonto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdClienteMonto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteMonto.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteMonto= new JButtonMe();
		this.jButtonFK_IdClienteMonto.setText("Buscar");
		this.jButtonFK_IdClienteMonto.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteMonto,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteMonto = new JLabelMe();
		jLabelid_clienteFK_IdClienteMonto.setText("Cliente :");
		jLabelid_clienteFK_IdClienteMonto.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteMonto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteMonto= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteMonto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteMonto= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteMonto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteMonto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteMonto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteMonto.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteMonto.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteMonto.setFocusable(false);


		this.jTabbedPaneBusquedasMonto=new JTabbedPane();


		this.jTabbedPaneBusquedasMonto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasMonto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasMonto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasMonto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasMonto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleMonto = new MontoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Monto De Facturacion DATOS");
			this.jInternalFrameDetalleFormMonto = new MontoDetalleFormJInternalFrame(jDesktopPane,this.montoSessionBean.getConGuardarRelaciones(),this.montoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormMonto = null;//new MontoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutMonto= new GridBagLayout();
		
		
		this.jTableDatosMonto = new JTableMe();      
		
		String sToolTipMonto="";
		sToolTipMonto=MontoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipMonto+="(Cartera.Monto)";
		}
		
		if(!this.montoSessionBean.getEsGuardarRelacionado()) {
			sToolTipMonto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosMonto.setToolTipText(sToolTipMonto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosMonto);
		this.jTableDatosMonto.setAutoCreateRowSorter(true);
		this.jTableDatosMonto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosMonto.setRowSelectionAllowed(true);
		this.jTableDatosMonto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosMonto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoMonto = new JButtonMe();
		this.jButtonDuplicarMonto = new JButtonMe();
		this.jButtonCopiarMonto = new JButtonMe();
		this.jButtonVerFormMonto = new JButtonMe();
		this.jButtonNuevoRelacionesMonto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaMonto = new JButtonMe();
		this.jButtonCerrarMonto = new JButtonMe();
		
		this.jScrollPanelDatosMonto = new JScrollPane();   
        this.jScrollPanelDatosGeneralMonto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesMonto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Monto De Facturacion";
		
		if(!this.montoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Monto De Facturacions" + this.sPath));
		} else {
			this.jScrollPanelDatosMonto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesMonto.setToolTipText("Acciones");
        this.jPanelAccionesMonto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralMonto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosMonto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoMonto=new ReporteDinamicoJInternalFrame(MontoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoMonto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionMonto=new ImportacionJInternalFrame(MontoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionMonto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByMonto = new JButtonMe();
		
		this.jButtonAbrirOrderByMonto.setText("Orden");
		this.jButtonAbrirOrderByMonto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByMonto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByMonto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByMonto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMonto,false,this);
			
			//this.cargarOrderByMonto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByMonto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMonto,true,this);
			
			//this.cargarOrderByMonto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosMonto.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosMonto.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosMonto.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosMonto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosMonto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosMonto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoMonto.setText("Nuevo");
		this.jButtonDuplicarMonto.setText("Duplicar");
		this.jButtonCopiarMonto.setText("Copiar");
		this.jButtonVerFormMonto.setText("Ver");
		this.jButtonNuevoRelacionesMonto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaMonto.setText("Guardar");
		this.jButtonCerrarMonto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoMonto,"nuevo_button","Nuevo",this.montoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarMonto,"duplicar_button","Duplicar",this.montoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarMonto,"copiar_button","Copiar",this.montoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormMonto,"ver_form","Ver",this.montoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesMonto,"nuevorelaciones_button","Nuevo Rel",this.montoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaMonto,"guardarcambiostabla_button","Guardar",this.montoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarMonto,"cerrar_button","Salir",this.montoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesMonto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoMonto.setToolTipText("Nuevo"+" "+MontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarMonto.setToolTipText("Duplicar"+" "+MontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarMonto.setToolTipText("Copiar"+" "+MontoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormMonto.setToolTipText("Ver"+" "+MontoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesMonto.setToolTipText("Nuevo Rel"+" "+MontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaMonto.setToolTipText("Guardar"+" "+MontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarMonto.setToolTipText("Salir"+" "+MontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoMonto";
		inputMap = this.jButtonNuevoMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoMonto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoMonto"));
		
		//DUPLICAR
		sMapKey = "DuplicarMonto";
		inputMap = this.jButtonDuplicarMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarMonto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarMonto"));
		
		//COPIAR
		sMapKey = "CopiarMonto";
		inputMap = this.jButtonCopiarMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarMonto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarMonto"));
		
		//VEr FORM
		sMapKey = "VerFormMonto";
		inputMap = this.jButtonVerFormMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormMonto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormMonto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesMonto";
		inputMap = this.jButtonNuevoRelacionesMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesMonto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesMonto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarMonto";
		inputMap = this.jButtonModificarMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarMonto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarMonto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarMonto";
		inputMap = this.jButtonCerrarMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarMonto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarMonto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaMonto";
		inputMap = this.jButtonGuardarCambiosTablaMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaMonto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaMonto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesMonto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesMonto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionMonto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Monto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Monto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Monto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Monto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Monto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesMonto.setName("jPanelParametrosReportesMonto"); 
		
		this.jPanelParametrosReportesAccionesMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesMonto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesMonto.setName("jPanelParametrosReportesAccionesMonto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesMonto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesMonto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionMonto = new JButtonMe();
		this.jButtonRecargarInformacionMonto.setText("Recargar");
		this.jButtonRecargarInformacionMonto.setToolTipText("Recargar"+" "+MontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionMonto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionMonto = new JButtonMe();
		this.jButtonProcesarInformacionMonto.setText("Procesar");
		this.jButtonProcesarInformacionMonto.setToolTipText("Procesar"+" "+MontoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionMonto.setVisible(false);
			
		this.jButtonProcesarInformacionMonto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionMonto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionMonto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesMonto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMonto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesMonto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesMonto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMonto.setText("TIPO");       
		this.jComboBoxTiposReportesMonto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesMonto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMonto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesMonto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionMonto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionMonto.setText("Paginacion");
		this.jComboBoxTiposPaginacionMonto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesMonto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesMonto.setText("Accion");
		this.jComboBoxTiposRelacionesMonto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesMonto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesMonto.setText("Accion");
		this.jComboBoxTiposAccionesMonto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarMonto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarMonto.setText("Accion");
		this.jComboBoxTiposSeleccionarMonto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralMonto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralMonto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralMonto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralMonto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesMonto = new JLabelMe();
		
		this.jLabelAccionesMonto.setText("Acciones");		
		this.jLabelAccionesMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosMonto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosMonto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosMonto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosMonto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosMonto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosMonto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaMonto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaMonto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaMonto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteMonto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteMonto.setText("Graf.");
		this.jCheckBoxConGraficoReporteMonto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresMonto = new JButtonMe();
		//this.jButtonAnterioresMonto.setText("<<");
        this.jButtonAnterioresMonto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresMonto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesMonto = new JButtonMe();
		//this.jButtonSiguientesMonto.setText(">>");
        this.jButtonSiguientesMonto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesMonto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosMonto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosMonto.setText("Nue");
        this.jButtonNuevoGuardarCambiosMonto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosMonto,"nuevoguardarcambios_button","Nue",this.montoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosMonto";
		inputMap = this.jButtonNuevoGuardarCambiosMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosMonto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosMonto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionMonto";
		inputMap = this.jButtonRecargarInformacionMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionMonto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionMonto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesMonto";
		inputMap = this.jButtonSiguientesMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesMonto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesMonto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresMonto";
		inputMap = this.jButtonAnterioresMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresMonto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresMonto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasMonto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesMonto.setMinimumSize(new Dimension(this.getWidth(),MontoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MontoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesMonto.setMaximumSize(new Dimension(this.getWidth(),MontoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MontoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesMonto.setPreferredSize(new Dimension(this.getWidth(),MontoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MontoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionMonto = new GridBagLayout();

			this.jPanelPaginacionMonto.setLayout(gridaBagLayoutPaginacionMonto);						
			
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsMonto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMonto.gridy = 0;
			this.gridBagConstraintsMonto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionMonto.add(this.jButtonAnterioresMonto, this.gridBagConstraintsMonto);
					
						
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsMonto.gridy = 0;
			
			this.jPanelPaginacionMonto.add(this.jButtonNuevoGuardarCambiosMonto, this.gridBagConstraintsMonto);
						
			
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsMonto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsMonto.gridy = 0;
			this.jPanelPaginacionMonto.add(this.jButtonSiguientesMonto, this.gridBagConstraintsMonto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMonto.gridy = 1;
			this.gridBagConstraintsMonto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMonto.add(this.jButtonNuevoMonto, this.gridBagConstraintsMonto);
						
			
			
			if(!this.montoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsMonto = new GridBagConstraints();
				this.gridBagConstraintsMonto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsMonto.gridy = 1;
				this.gridBagConstraintsMonto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionMonto.add(this.jButtonGuardarCambiosTablaMonto, this.gridBagConstraintsMonto);
			}
			
			
			
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMonto.gridy = 1;
			this.gridBagConstraintsMonto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMonto.add(this.jButtonDuplicarMonto, this.gridBagConstraintsMonto);
			
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMonto.gridy = 1;
			this.gridBagConstraintsMonto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMonto.add(this.jButtonCopiarMonto, this.gridBagConstraintsMonto);
		
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMonto.gridy = 1;
			this.gridBagConstraintsMonto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMonto.add(this.jButtonVerFormMonto, this.gridBagConstraintsMonto);
		
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMonto.gridy = 1;
			this.gridBagConstraintsMonto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionMonto.add(this.jButtonCerrarMonto, this.gridBagConstraintsMonto);
		
		
		
		this.jButtonRecargarInformacionMonto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionMonto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionMonto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionMonto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesMonto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesMonto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesMonto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesMonto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesMonto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesMonto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesMonto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesMonto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesMonto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionMonto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionMonto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionMonto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesMonto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesMonto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesMonto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesMonto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMonto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMonto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarMonto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarMonto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarMonto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaMonto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaMonto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaMonto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteMonto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteMonto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteMonto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteMonto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosMonto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosMonto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosMonto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosMonto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosMonto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosMonto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesMonto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesMonto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Monto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Monto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Monto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Monto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesMonto.setLayout(gridaBagParametrosReportesMonto);
			this.jPanelParametrosReportesAccionesMonto.setLayout(gridaBagParametrosReportesAccionesMonto);
			
			
			this.jPanelParametrosAuxiliar1Monto.setLayout(gridaBagParametrosAuxiliar1Monto);
			this.jPanelParametrosAuxiliar2Monto.setLayout(gridaBagParametrosAuxiliar2Monto);
			this.jPanelParametrosAuxiliar3Monto.setLayout(gridaBagParametrosAuxiliar3Monto);
			this.jPanelParametrosAuxiliar4Monto.setLayout(gridaBagParametrosAuxiliar4Monto);
			//this.jPanelParametrosAuxiliar5Monto.setLayout(gridaBagParametrosAuxiliar2Monto);			
			
			
			
			
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMonto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMonto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMonto.add(this.jButtonRecargarInformacionMonto, this.gridBagConstraintsMonto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMonto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMonto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Monto.add(this.jComboBoxTiposPaginacionMonto, this.gridBagConstraintsMonto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMonto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMonto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Monto.add(this.jCheckBoxConAltoMaximoTablaMonto, this.gridBagConstraintsMonto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMonto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMonto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Monto.add(this.jComboBoxTiposArchivosReportesMonto, this.gridBagConstraintsMonto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMonto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMonto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMonto.add(this.jPanelParametrosAuxiliar1Monto, this.gridBagConstraintsMonto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMonto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMonto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMonto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Monto.add(this.jComboBoxTiposReportesMonto, this.gridBagConstraintsMonto);																		
			
			
			
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMonto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMonto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMonto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4Monto.add(this.jComboBoxTiposGraficosReportesMonto, this.gridBagConstraintsMonto);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMonto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMonto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMonto.add(this.jPanelParametrosAuxiliar4Monto, this.gridBagConstraintsMonto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMonto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsMonto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMonto.add(this.jComboBoxTiposReportesMonto, this.gridBagConstraintsMonto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMonto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMonto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMonto.add(this.jCheckBoxGenerarReporteMonto, this.gridBagConstraintsMonto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMonto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMonto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMonto.add(this.jPanelParametrosAuxiliar2Monto, this.gridBagConstraintsMonto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMonto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMonto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMonto.add(this.jLabelAccionesMonto, this.gridBagConstraintsMonto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsMonto = new GridBagConstraints();
				this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsMonto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsMonto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesMonto.add(this.jButtonAbrirOrderByMonto, this.gridBagConstraintsMonto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsMonto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMonto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMonto.add(this.jComboBoxTiposSeleccionarMonto, this.gridBagConstraintsMonto);			
			
			
			/*
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMonto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMonto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMonto.add(this.jCheckBoxSeleccionarTodosMonto, this.gridBagConstraintsMonto);
			
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMonto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMonto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMonto.add(this.jCheckBoxConGraficoReporteMonto, this.gridBagConstraintsMonto);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMonto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMonto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMonto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Monto.add(this.jCheckBoxSeleccionarTodosMonto, this.gridBagConstraintsMonto);															
				
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMonto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMonto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMonto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Monto.add(this.jCheckBoxSeleccionadosMonto, this.gridBagConstraintsMonto);															
			
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMonto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMonto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMonto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Monto.add(this.jCheckBoxConGraficoReporteMonto, this.gridBagConstraintsMonto);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMonto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMonto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMonto.add(this.jPanelParametrosAuxiliar3Monto, this.gridBagConstraintsMonto);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMonto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMonto.add(this.jComboBoxTiposAccionesMonto, this.gridBagConstraintsMonto);
	
				
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMonto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMonto.add(this.jTextFieldValorCampoGeneralMonto, this.gridBagConstraintsMonto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosMonto = new GridBagLayout();

			this.jScrollPanelDatosMonto.setLayout(gridaBagLayoutDatosMonto);
			
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMonto.gridy = 0;
			this.gridBagConstraintsMonto.gridx = 0;
			
			this.jScrollPanelDatosMonto.add(this.jTableDatosMonto, this.gridBagConstraintsMonto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosMonto.setViewportView(this.jTableDatosMonto);
		this.jTableDatosMonto.setFillsViewportHeight(true);
		this.jTableDatosMonto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesMonto= new GridBagLayout();
		this.jPanelAccionesMonto.setLayout(gridaBagLayoutAccionesMonto);
		
		
		/*	
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMonto.gridy = 0;
		this.gridBagConstraintsMonto.gridx = 0;
			
		this.jPanelAccionesMonto.add(this.jButtonNuevoMonto, this.gridBagConstraintsMonto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorEsGeneralMonto= new GridBagLayout();
		gridaBagLayoutBusquedaPorEsGeneralMonto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorEsGeneralMonto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorEsGeneralMonto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorEsGeneralMonto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorEsGeneralMonto.setLayout(gridaBagLayoutBusquedaPorEsGeneralMonto);

		gridBagConstraintsMonto = new GridBagConstraints();
		gridBagConstraintsMonto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMonto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMonto.gridy = 0;
		gridBagConstraintsMonto.gridx = 0;
		jPanelBusquedaPorEsGeneralMonto.add(jLabeles_generalBusquedaPorEsGeneralMonto, gridBagConstraintsMonto);

		gridBagConstraintsMonto = new GridBagConstraints();
		gridBagConstraintsMonto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMonto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMonto.gridy = 0;
		gridBagConstraintsMonto.gridx = 1;
		jPanelBusquedaPorEsGeneralMonto.add(jCheckBoxes_generalBusquedaPorEsGeneralMonto, gridBagConstraintsMonto);

		gridBagConstraintsMonto = new GridBagConstraints();
		gridBagConstraintsMonto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMonto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMonto.gridy = 1;
		gridBagConstraintsMonto.gridx =1;
		jPanelBusquedaPorEsGeneralMonto.add(jButtonBusquedaPorEsGeneralMonto, gridBagConstraintsMonto);

		jTabbedPaneBusquedasMonto.addTab("1.-Por Es General ", jPanelBusquedaPorEsGeneralMonto);
		jTabbedPaneBusquedasMonto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdClienteMonto= new GridBagLayout();
		gridaBagLayoutFK_IdClienteMonto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteMonto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteMonto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteMonto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteMonto.setLayout(gridaBagLayoutFK_IdClienteMonto);

		gridBagConstraintsMonto = new GridBagConstraints();
		gridBagConstraintsMonto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMonto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMonto.gridy = 0;
		gridBagConstraintsMonto.gridx = 0;
		jPanelFK_IdClienteMonto.add(jLabelid_clienteFK_IdClienteMonto, gridBagConstraintsMonto);

		gridBagConstraintsMonto = new GridBagConstraints();
		gridBagConstraintsMonto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMonto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMonto.gridy = 0;
		gridBagConstraintsMonto.gridx = 1;
		jPanelFK_IdClienteMonto.add(jComboBoxid_clienteFK_IdClienteMonto, gridBagConstraintsMonto);


		gridBagConstraintsMonto = new GridBagConstraints();
		gridBagConstraintsMonto.anchor = GridBagConstraints.EAST;
		gridBagConstraintsMonto.fill = GridBagConstraints.NONE;
		gridBagConstraintsMonto.gridy = 0;
		gridBagConstraintsMonto.gridx = 0;
		jPanelFK_IdClienteMonto.add(this.jButtonBuscarFK_IdClienteid_clienteMonto, gridBagConstraintsMonto);

		gridBagConstraintsMonto = new GridBagConstraints();
		gridBagConstraintsMonto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMonto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMonto.gridy = 1;
		gridBagConstraintsMonto.gridx =1;
		jPanelFK_IdClienteMonto.add(jButtonFK_IdClienteMonto, gridBagConstraintsMonto);

		jTabbedPaneBusquedasMonto.addTab("2.-Por Cliente ", jPanelFK_IdClienteMonto);
		jTabbedPaneBusquedasMonto.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutMonto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutMonto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.montoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsMonto = new GridBagConstraints();						
			this.gridBagConstraintsMonto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMonto.gridx = 0;		
			//this.gridBagConstraintsMonto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMonto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsMonto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarMonto, this.gridBagConstraintsMonto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsMonto.gridx = 0;		
		//this.gridBagConstraintsMonto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMonto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsMonto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsMonto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsMonto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsMonto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMonto.gridx = 0;		
			this.gridBagConstraintsMonto.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMonto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsMonto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasMonto, this.gridBagConstraintsMonto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMonto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesMonto, this.gridBagConstraintsMonto);								
		
		
		/*
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMonto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesMonto, this.gridBagConstraintsMonto);
		*/		
		
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsMonto.gridx =0;
		this.gridBagConstraintsMonto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsMonto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosMonto, this.gridBagConstraintsMonto);
				
		
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMonto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionMonto, this.gridBagConstraintsMonto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(MontoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosMonto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosMonto = new GridBagLayout();
			this.jPanelBusquedasParametrosMonto.setLayout(gridaBagLayoutBusquedasParametrosMonto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralMonto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralMonto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMonto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMonto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsMonto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMonto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposMonto, this.gridBagConstraintsMonto);
			
			
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMonto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosMonto, this.gridBagConstraintsMonto);
		
			
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsMonto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesMonto, this.gridBagConstraintsMonto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralMonto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoMonto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoMonto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoMonto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoMonto.setName("jPanelReporteDinamicoMonto"); 
		
		this.jPanelReporteDinamicoMonto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoMonto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoMonto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoMonto.setLayout(gridaBagLayoutReporteDinamicoMonto);
		
		
		this.jInternalFrameReporteDinamicoMonto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoMonto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteMonto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoMonto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoMonto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoMonto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoMonto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoMonto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoMonto.setResizable(true);
	    this.jInternalFrameReporteDinamicoMonto.setClosable(true);
	    this.jInternalFrameReporteDinamicoMonto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoMonto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoMonto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoMonto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Monto De Facturacions"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteMonto = new JLabelMe();

		this.jLabelColumnasSelectReporteMonto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMonto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMonto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMonto.add(this.jLabelColumnasSelectReporteMonto, this.gridBagConstraintsMonto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteMonto = new JList<Reporte>();
		this.jListColumnasSelectReporteMonto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteMonto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteMonto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteMonto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteMonto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteMonto=new JScrollPane(this.jListColumnasSelectReporteMonto);
			
			this.jScrollColumnasSelectReporteMonto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteMonto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteMonto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMonto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMonto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoMonto.add(this.jListColumnasSelectReporteMonto, this.gridBagConstraintsMonto);
		this.jPanelReporteDinamicoMonto.add(this.jScrollColumnasSelectReporteMonto, this.gridBagConstraintsMonto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteMonto = new JLabelMe();

		this.jLabelRelacionesSelectReporteMonto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteMonto = new JList<Reporte>();
		this.jListRelacionesSelectReporteMonto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteMonto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteMonto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteMonto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteMonto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteMonto=new JScrollPane(this.jListRelacionesSelectReporteMonto);
			
			this.jScrollRelacionesSelectReporteMonto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteMonto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteMonto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoMonto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoMonto = new JComboBoxMe();
		this.jListColumnasValoresGraficoMonto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoMonto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoMonto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoMonto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoMonto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoMonto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoMonto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoMonto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoMonto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoMonto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoMonto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoMonto = new JLabelMe();

		this.jLabelConGraficoDinamicoMonto.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMonto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMonto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMonto.add(this.jLabelConGraficoDinamicoMonto, this.gridBagConstraintsMonto);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoMonto = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoMonto.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoMonto.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoMonto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoMonto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoMonto.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMonto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMonto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMonto.add(this.jCheckBoxConGraficoDinamicoMonto, this.gridBagConstraintsMonto);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoMonto = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoMonto.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMonto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMonto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMonto.add(this.jLabelColumnaCategoriaGraficoMonto, this.gridBagConstraintsMonto);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoMonto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoMonto.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoMonto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoMonto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoMonto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoMonto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMonto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMonto.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoMonto.add(this.jComboBoxColumnaCategoriaGraficoMonto, this.gridBagConstraintsMonto);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorMonto = new JLabelMe();

		this.jLabelColumnaCategoriaValorMonto.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMonto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMonto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMonto.add(this.jLabelColumnaCategoriaValorMonto, this.gridBagConstraintsMonto);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorMonto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorMonto.setText("Accion");
        this.jComboBoxColumnaCategoriaValorMonto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorMonto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorMonto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorMonto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMonto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMonto.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoMonto.add(this.jComboBoxColumnaCategoriaValorMonto, this.gridBagConstraintsMonto);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoMonto = new JLabelMe();

		this.jLabelColumnasValoresGraficoMonto.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMonto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMonto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMonto.add(this.jLabelColumnasValoresGraficoMonto, this.gridBagConstraintsMonto);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoMonto = new JList<Reporte>();
		this.jListColumnasValoresGraficoMonto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoMonto.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoMonto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoMonto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoMonto.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoMonto=new JScrollPane(this.jListColumnasValoresGraficoMonto);
			
			this.jScrollColumnasValoresGraficoMonto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoMonto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoMonto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMonto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMonto.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoMonto.add(this.jListColumnasSelectReporteMonto, this.gridBagConstraintsMonto);
		this.jPanelReporteDinamicoMonto.add(this.jScrollColumnasValoresGraficoMonto, this.gridBagConstraintsMonto);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoMonto = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoMonto.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMonto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMonto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMonto.add(this.jLabelTiposGraficosReportesDinamicoMonto, this.gridBagConstraintsMonto);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoMonto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoMonto.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoMonto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoMonto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoMonto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoMonto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMonto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMonto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMonto.add(this.jComboBoxTiposGraficosReportesDinamicoMonto, this.gridBagConstraintsMonto);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoMonto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoMonto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMonto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMonto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMonto.add(this.jLabelGenerarExcelReporteDinamicoMonto, this.gridBagConstraintsMonto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoMonto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoMonto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoMonto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoMonto.setToolTipText("Generar EXCEL"+" "+MontoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsMonto = new GridBagConstraints();
		//this.gridBagConstraintsMonto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsMonto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsMonto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoMonto.add(this.jButtonGenerarExcelReporteDinamicoMonto, this.gridBagConstraintsMonto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMonto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMonto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMonto.add(this.jComboBoxTiposReportesDinamicoMonto, this.gridBagConstraintsMonto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoMonto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoMonto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMonto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMonto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMonto.add(this.jLabelTiposArchivoReporteDinamicoMonto, this.gridBagConstraintsMonto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMonto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMonto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMonto.add(this.jComboBoxTiposArchivosReportesDinamicoMonto, this.gridBagConstraintsMonto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoMonto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoMonto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoMonto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoMonto.setToolTipText("Generar"+" "+MontoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMonto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMonto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMonto.add(this.jButtonGenerarReporteDinamicoMonto, this.gridBagConstraintsMonto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoMonto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoMonto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoMonto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoMonto.setToolTipText("Cancelar"+" "+MontoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMonto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMonto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMonto.add(this.jButtonCerrarReporteDinamicoMonto, this.gridBagConstraintsMonto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalMonto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoMonto= new JScrollPane(jPanelReporteDinamicoMonto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoMonto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoMonto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoMonto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Monto De Facturacions"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsMonto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsMonto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoMonto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoMonto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalMonto);
		this.jInternalFrameReporteDinamicoMonto.getContentPane().add(this.jScrollPanelReporteDinamicoMonto, this.gridBagConstraintsMonto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionMonto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionMonto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionMonto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionMonto.setName("jPanelImportacionMonto"); 
		
		this.jPanelImportacionMonto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionMonto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionMonto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionMonto.setLayout(gridaBagLayoutImportacionMonto);
		
		
		this.jInternalFrameImportacionMonto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionMonto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionMonto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteMonto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionMonto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionMonto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionMonto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionMonto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionMonto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionMonto.setResizable(true);
	    this.jInternalFrameImportacionMonto.setClosable(true);
	    this.jInternalFrameImportacionMonto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionMonto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionMonto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionMonto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionMonto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionMonto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionMonto.setResizable(true);
	    this.jInternalFrameImportacionMonto.setClosable(true);
	    this.jInternalFrameImportacionMonto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionMonto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionMonto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionMonto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Monto De Facturacions"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionMonto = new JLabelMe();

		this.jLabelArchivoImportacionMonto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMonto.gridy = iPosYImportacion;		
		this.gridBagConstraintsMonto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionMonto.add(this.jLabelArchivoImportacionMonto, this.gridBagConstraintsMonto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionMonto = new JFileChooser();		
		this.jFileChooserImportacionMonto.setToolTipText("ESCOGER ARCHIVO"+" "+MontoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionMonto = new JButtonMe();
		this.jButtonAbrirImportacionMonto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionMonto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionMonto.setToolTipText("Generar"+" "+MontoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMonto.gridy = iPosYImportacion;
		this.gridBagConstraintsMonto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMonto.add(this.jButtonAbrirImportacionMonto, this.gridBagConstraintsMonto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionMonto = new JLabelMe();

		this.jLabelPathArchivoImportacionMonto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMonto.gridy = iPosYImportacion;		
		this.gridBagConstraintsMonto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionMonto.add(this.jLabelPathArchivoImportacionMonto, this.gridBagConstraintsMonto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionMonto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionMonto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionMonto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionMonto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMonto.gridy = iPosYImportacion;
		this.gridBagConstraintsMonto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMonto.add(this.jTextFieldPathArchivoImportacionMonto, this.gridBagConstraintsMonto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionMonto = new JButtonMe();
		this.jButtonGenerarImportacionMonto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionMonto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionMonto.setToolTipText("Generar"+" "+MontoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMonto.gridy = iPosYImportacion;
		this.gridBagConstraintsMonto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMonto.add(this.jButtonGenerarImportacionMonto, this.gridBagConstraintsMonto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionMonto = new JButtonMe();
		this.jButtonCerrarImportacionMonto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionMonto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionMonto.setToolTipText("Cancelar"+" "+MontoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMonto.gridy = iPosYImportacion;
		this.gridBagConstraintsMonto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMonto.add(this.jButtonCerrarImportacionMonto, this.gridBagConstraintsMonto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalMonto = new GridBagLayout();
		
		this.jScrollPanelImportacionMonto= new JScrollPane(jPanelImportacionMonto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.gridy =iPosYImportacion;
		this.gridBagConstraintsMonto.gridx =iPosXImportacion;
		this.gridBagConstraintsMonto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionMonto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionMonto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalMonto);
		this.jInternalFrameImportacionMonto.getContentPane().add(this.jScrollPanelImportacionMonto, this.gridBagConstraintsMonto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByMonto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByMonto = new JButtonMe();
			this.jButtonAbrirOrderByMonto.setText("Orden");
			this.jButtonAbrirOrderByMonto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByMonto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByMonto";
			inputMap = this.jButtonAbrirOrderByMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByMonto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByMonto"));
		
		
			GridBagLayout gridaBagLayoutOrderByMonto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByMonto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByMonto.setName("jPanelOrderByMonto"); 
			
			this.jPanelOrderByMonto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByMonto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByMonto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByMonto.setLayout(gridaBagLayoutOrderByMonto);
			
			
			this.jTableDatosMontoOrderBy = new JTableMe();        
			this.jTableDatosMontoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosMontoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosMontoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosMontoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosMontoOrderBy.setViewportView(this.jTableDatosMontoOrderBy);
			this.jTableDatosMontoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosMontoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByMonto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByMonto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByMonto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteMonto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByMonto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByMonto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByMonto.setTitle("Orden");
			this.jInternalFrameOrderByMonto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByMonto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByMonto.setResizable(true);
			this.jInternalFrameOrderByMonto.setClosable(true);
			this.jInternalFrameOrderByMonto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByMonto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByMonto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByMonto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Monto De Facturacions"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsMonto.gridx =iPosXOrderBy;
			this.gridBagConstraintsMonto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsMonto.ipady =150;
				
			this.jPanelOrderByMonto.add(jScrollPanelDatosMontoOrderBy, this.gridBagConstraintsMonto);//this.jTableDatosMontoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByMonto = new JButtonMe();
			this.jButtonCerrarOrderByMonto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByMonto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByMonto.setToolTipText("Cancelar"+" "+MontoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMonto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsMonto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByMonto.add(this.jButtonCerrarOrderByMonto, this.gridBagConstraintsMonto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalMonto = new GridBagLayout();
			
			this.jScrollPanelOrderByMonto= new JScrollPane(jPanelOrderByMonto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.gridy =iPosYOrderBy;
			this.gridBagConstraintsMonto.gridx =iPosXOrderBy;
			this.gridBagConstraintsMonto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByMonto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByMonto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalMonto);
			
			this.jInternalFrameOrderByMonto.getContentPane().add(this.jScrollPanelOrderByMonto, this.gridBagConstraintsMonto);			
		
		} else {
			this.jButtonAbrirOrderByMonto = new JButtonMe();
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
		int iWidthTableCalculado=0;//1730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.montoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosMonto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosMonto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosMonto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosMonto.getRowHeight();//MontoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.montoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > MontoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaMonto.isSelected()) {
					iHeightTable=MontoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < MontoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=MontoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > MontoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaMonto.isSelected()) {
					iHeightTable=MontoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < MontoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=MontoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosMonto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosMonto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosMonto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosMonto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosMonto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosMonto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByMonto!=null && this.jInternalFrameOrderByMonto.getjTableDatosOrderBy()!=null) {
			//if(!this.montoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByMonto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByMonto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByMonto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByMonto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByMonto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByMonto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByMonto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosMonto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosMonto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosMonto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=montoLogic.getMontos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=montos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Monto> TraerMontoBeans(List<Monto> montos,ArrayList<Classe> classes)throws Exception {
		try {
			for(Monto monto:montos) {
					
				if(!(MontoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || MontoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					monto.setsDetalleGeneralEntityReporte(MontoConstantesFunciones.getMontoDescripcion(monto));
										
					monto.setes_general_descripcion(MontoConstantesFunciones.getes_generalDescripcion(monto));	
					
						
					
				} else  {
							
					//monto.setsDetalleGeneralEntityReporte(monto.getsDetalleGeneralEntityReporte());
										
				}
				
				//montobeans.add(montobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return montos;
    }
	//PARA REPORTES FIN
}
