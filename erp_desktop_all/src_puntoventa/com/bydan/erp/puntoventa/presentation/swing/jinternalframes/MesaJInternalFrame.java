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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.MesaConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class MesaJInternalFrame extends MesaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarMesa;
	
	protected JMenuBar jmenuBarMesa;
	
	protected JMenu jmenuMesa;
	protected JMenu jmenuDatosMesa;
	protected JMenu jmenuArchivoMesa;
	protected JMenu jmenuAccionesMesa;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosMesa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutMesa;	
	protected GridBagConstraints gridBagConstraintsMesa;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public MesaDetalleFormJInternalFrame jInternalFrameDetalleFormMesa;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoMesa;	
	protected ImportacionJInternalFrame jInternalFrameImportacionMesa;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public MesaSessionBean mesaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Mesa> mesas;		
	public List<Mesa> mesasEliminados;	
	public List<Mesa> mesasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByMesa;		
	protected JButton jButtonAbrirOrderByMesa;
	
	
	//protected JPanel jPanelOrderByMesa;
	//public JScrollPane jScrollPanelOrderByMesa;	
	//protected JButton jButtonCerrarOrderByMesa;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public MesaLogic mesaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosMesa;
	public JScrollPane jScrollPanelDatosEdicionMesa;
	public JScrollPane jScrollPanelDatosGeneralMesa;
    
	
	
	//public JScrollPane jScrollPanelDatosMesaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoMesa;
	//public JScrollPane jScrollPanelImportacionMesa;
	
	
	
	protected JPanel jPanelAccionesMesa;
	
    protected JPanel jPanelPaginacionMesa;
    protected JPanel jPanelParametrosReportesMesa;
	protected JPanel jPanelParametrosReportesAccionesMesa;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Mesa;
	protected JPanel jPanelParametrosAuxiliar2Mesa;
	protected JPanel jPanelParametrosAuxiliar3Mesa;
	protected JPanel jPanelParametrosAuxiliar4Mesa;
	//protected JPanel jPanelParametrosAuxiliar5Mesa;
	
	
	
	//protected JPanel jPanelReporteDinamicoMesa;
	//protected JPanel jPanelImportacionMesa;
	
	
	public JTable jTableDatosMesa;
	
	
	
	//public JTable jTableDatosMesaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoMesa;
	protected JButton jButtonDuplicarMesa;
	protected JButton jButtonCopiarMesa;
	protected JButton jButtonVerFormMesa;
	protected JButton jButtonNuevoRelacionesMesa;
	protected JButton jButtonModificarMesa;
	
    protected JButton jButtonGuardarCambiosTablaMesa;
	protected JButton jButtonCerrarMesa;
	
	
	protected JButton jButtonRecargarInformacionMesa;
	protected JButton jButtonProcesarInformacionMesa;
	
	
	protected JButton jButtonAnterioresMesa;
	protected JButton jButtonSiguientesMesa;
	protected JButton jButtonNuevoGuardarCambiosMesa;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoMesa;
	//protected JButton jButtonCerrarReporteDinamicoMesa;
	//protected JButton jButtonGenerarExcelReporteDinamicoMesa;	
	
	
	
	//protected JButton jButtonAbrirImportacionMesa;
	//protected JButton jButtonGenerarImportacionMesa;
	//protected JButton jButtonCerrarImportacionMesa;
	//protected JFileChooser jFileChooserImportacionMesa;
	//protected File fileImportacionMesa;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarMesa;
	protected JButton jButtonDuplicarToolBarMesa;
	protected JButton jButtonNuevoRelacionesToolBarMesa;
	
	
	public JButton jButtonGuardarCambiosToolBarMesa;
	protected JButton jButtonCopiarToolBarMesa;
	protected JButton jButtonVerFormToolBarMesa;
	public JButton jButtonGuardarCambiosTablaToolBarMesa;
	protected JButton jButtonMostrarOcultarTablaToolBarMesa;
	protected JButton jButtonCerrarToolBarMesa;
	
	protected JButton jButtonRecargarInformacionToolBarMesa;
	protected JButton jButtonProcesarInformacionToolBarMesa;
	protected JButton jButtonAnterioresToolBarMesa;
	protected JButton jButtonSiguientesToolBarMesa;
	protected JButton jButtonNuevoGuardarCambiosToolBarMesa;
	protected JButton jButtonAbrirOrderByToolBarMesa;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoMesa;
	protected JMenuItem jMenuItemDuplicarMesa;
	protected JMenuItem jMenuItemNuevoRelacionesMesa;
	
	
	protected JMenuItem jMenuItemGuardarCambiosMesa;
	protected JMenuItem jMenuItemCopiarMesa;
	protected JMenuItem jMenuItemVerFormMesa;
	protected JMenuItem jMenuItemGuardarCambiosTablaMesa;
	protected JMenuItem jMenuItemCerrarMesa;
	protected JMenuItem jMenuItemDetalleCerrarMesa;
	protected JMenuItem jMenuItemDetalleAbrirOrderByMesa;
	protected JMenuItem jMenuItemDetalleMostarOcultarMesa;
	
	protected JMenuItem jMenuItemRecargarInformacionMesa;
	protected JMenuItem jMenuItemProcesarInformacionMesa;
	protected JMenuItem jMenuItemAnterioresMesa;
	protected JMenuItem jMenuItemSiguientesMesa;
	protected JMenuItem jMenuItemNuevoGuardarCambiosMesa;
	protected JMenuItem jMenuItemAbrirOrderByMesa;
	protected JMenuItem jMenuItemMostrarOcultarMesa;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesMesa;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosMesa;
	protected JCheckBox jCheckBoxSeleccionadosMesa;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaMesa;
	protected JCheckBox jCheckBoxConGraficoReporteMesa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesMesa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesMesa;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoMesa;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoMesa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesMesa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionMesa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesMesa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesMesa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarMesa;
	protected JTextField jTextFieldValorCampoGeneralMesa;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteMesa;
	//public JList<Reporte> jListColumnasSelectReporteMesa;
	//public JScrollPane jScrollColumnasSelectReporteMesa;
	
	//public JLabel jLabelRelacionesSelectReporteMesa;
	//public JList<Reporte> jListRelacionesSelectReporteMesa;
	//public JScrollPane jScrollRelacionesSelectReporteMesa;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoMesa;
	//protected JCheckBox jCheckBoxConGraficoDinamicoMesa;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoMesa;
	//public JLabel jLabelTiposArchivoReporteDinamicoMesa;
	
		
	//public JLabel jLabelArchivoImportacionMesa;	
	//public JLabel jLabelPathArchivoImportacionMesa;
	//protected JTextField jTextFieldPathArchivoImportacionMesa;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoMesa;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoMesa;
	
	//public JLabel jLabelColumnaCategoriaValorMesa;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorMesa;
	
	//public JLabel jLabelColumnasValoresGraficoMesa;
	//public JList<Reporte> jListColumnasValoresGraficoMesa;
	//public JScrollPane jScrollColumnasValoresGraficoMesa;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoMesa;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoMesa;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasMesa;
	
	
	
	
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
	//public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public MesaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Mesa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MesaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Mesa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MesaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Mesa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MesaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Mesa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionMesa)	{
		this.jButtonRecargarInformacionMesa = jButtonRecargarInformacionMesa;
	}
	
	public JButton getjButtonProcesarInformacionMesa() {
		return this.jButtonProcesarInformacionMesa;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionMesa)	{
		this.jButtonProcesarInformacionMesa = jButtonProcesarInformacionMesa;
	}
	
	
	public JButton getjButtonRecargarInformacionMesa() {
		return this.jButtonRecargarInformacionMesa;
	}
	
	
	public List<Mesa> getmesas() {
		return this.mesas;
	}

	public void setmesas(List<Mesa> mesas) {
		this.mesas = mesas;
	}
	
	public List<Mesa> getmesasAux() {
		return this.mesasAux;
	}

	public void setmesasAux(List<Mesa> mesasAux) {
		this.mesasAux = mesasAux;
	}
	
	public List<Mesa> getmesasEliminados() {
		return this.mesasEliminados;
	}

	public void setMesasEliminados(List<Mesa> mesasEliminados) {
		this.mesasEliminados = mesasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarMesa() {
		return jComboBoxTiposSeleccionarMesa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarMesa(
			JComboBox jComboBoxTiposSeleccionarMesa) {
		this.jComboBoxTiposSeleccionarMesa = jComboBoxTiposSeleccionarMesa;
	}
	
	public void setBorderResaltarTiposSeleccionarMesa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarMesa.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarMesa .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralMesa() {
		return jTextFieldValorCampoGeneralMesa;
	}

	public void setjTextFieldValorCampoGeneralMesa(
			JTextField jTextFieldValorCampoGeneralMesa) {
		this.jTextFieldValorCampoGeneralMesa = jTextFieldValorCampoGeneralMesa;
	}

	public void setBorderResaltarValorCampoGeneralMesa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMesa.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralMesa .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosMesa() {
		return this.jCheckBoxSeleccionarTodosMesa;
	}

	public void setjCheckBoxSeleccionarTodosMesa(
			JCheckBox jCheckBoxSeleccionarTodosMesa) {
		this.jCheckBoxSeleccionarTodosMesa = jCheckBoxSeleccionarTodosMesa;
	}

	public void setBorderResaltarSeleccionarTodosMesa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMesa.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosMesa .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosMesa() {
		return this.jCheckBoxSeleccionadosMesa;
	}

	public void setjCheckBoxSeleccionadosMesa(
			JCheckBox jCheckBoxSeleccionadosMesa) {
		this.jCheckBoxSeleccionadosMesa = jCheckBoxSeleccionadosMesa;
	}
	
	public void setBorderResaltarSeleccionadosMesa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMesa.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosMesa .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesMesa() {
		return this.jComboBoxTiposArchivosReportesMesa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesMesa(
			JComboBox jComboBoxTiposArchivosReportesMesa) {
		this.jComboBoxTiposArchivosReportesMesa = jComboBoxTiposArchivosReportesMesa;
	}

	public void setBorderResaltarTiposArchivosReportesMesa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMesa.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesMesa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesMesa() {
		return this.jComboBoxTiposReportesMesa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesMesa(
			JComboBox jComboBoxTiposReportesMesa) {
		this.jComboBoxTiposReportesMesa = jComboBoxTiposReportesMesa;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoMesa() {
	//	return jComboBoxTiposReportesDinamicoMesa;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoMesa(
	//		JComboBox jComboBoxTiposReportesDinamicoMesa) {
	//	this.jComboBoxTiposReportesDinamicoMesa = jComboBoxTiposReportesDinamicoMesa;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoMesa() {
	//	return jComboBoxTiposArchivosReportesDinamicoMesa;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoMesa(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoMesa) {
	//	this.jComboBoxTiposArchivosReportesDinamicoMesa = jComboBoxTiposArchivosReportesDinamicoMesa;
	//}
	
	public void setBorderResaltarTiposReportesMesa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMesa.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesMesa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesMesa() {
		return this.jComboBoxTiposGraficosReportesMesa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesMesa(
			JComboBox jComboBoxTiposGraficosReportesMesa) {
		this.jComboBoxTiposGraficosReportesMesa = jComboBoxTiposGraficosReportesMesa;
	}
	
	public void setBorderResaltarTiposGraficosReportesMesa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMesa.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesMesa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionMesa() {
		return this.jComboBoxTiposPaginacionMesa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionMesa(
			JComboBox jComboBoxTiposPaginacionMesa) {
		this.jComboBoxTiposPaginacionMesa = jComboBoxTiposPaginacionMesa;
	}
	
	public void setBorderResaltarTiposPaginacionMesa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMesa.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionMesa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesMesa() {
		return this.jComboBoxTiposRelacionesMesa;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesMesa() {
		return this.jComboBoxTiposAccionesMesa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesMesa(
			JComboBox jComboBoxTiposRelacionesMesa) {
		this.jComboBoxTiposRelacionesMesa = jComboBoxTiposRelacionesMesa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesMesa(
			JComboBox jComboBoxTiposAccionesMesa) {
		this.jComboBoxTiposAccionesMesa = jComboBoxTiposAccionesMesa;
	}
	
	public void setBorderResaltarTiposRelacionesMesa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMesa.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesMesa .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesMesa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMesa.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesMesa .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoMesa() {
	//	return jCheckBoxConGraficoDinamicoMesa;
	//}

	//public void setjCheckBoxConGraficoDinamicoMesa(
	//		JCheckBox jCheckBoxConGraficoDinamicoMesa) {
	//	this.jCheckBoxConGraficoDinamicoMesa = jCheckBoxConGraficoDinamicoMesa;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoMesa() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarMesa.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoMesa .setBorder(borderResaltar);		
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
		this.mesaSessionBean=new MesaSessionBean();
		
		this.mesaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.mesaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.mesaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=MesaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=MesaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		MesaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		MesaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		MesaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Mesa MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.mesaSessionBean.getEsGuardarRelacionado()) {
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
		
		MesaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Mesa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarMesa= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarMesa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarMesa,this.jTtoolBarMesa,
							"nuevo","nuevo","Nuevo"+" "+MesaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarMesa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarMesa,this.jTtoolBarMesa,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarMesa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarMesa,this.jTtoolBarMesa,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+MesaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarMesa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarMesa,this.jTtoolBarMesa,
							"duplicar","duplicar","Duplicar"+" "+MesaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarMesa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarMesa,this.jTtoolBarMesa,
							"copiar","copiar","Copiar"+" "+MesaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarMesa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarMesa,this.jTtoolBarMesa,
							"ver_form","ver_form","Ver"+" "+MesaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarMesa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMesa,this.jTtoolBarMesa,
							"recargar","recargar","Recargar"+" "+MesaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarMesa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMesa,this.jTtoolBarMesa,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarMesa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMesa,this.jTtoolBarMesa,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarMesa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarMesa,this.jTtoolBarMesa,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarMesa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarMesa,this.jTtoolBarMesa,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarMesa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarMesa,this.jTtoolBarMesa,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+MesaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarMesa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarMesa,this.jTtoolBarMesa,
							"cerrar","cerrar","Salir"+" "+MesaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarMesa=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarMesa;
			
				this.jButtonProcesarInformacionToolBarMesa=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarMesa;
				
		//protected JButton jButtonModificarToolBarMesa;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarMesa=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuMesa=new JMenuMe("General");
		this.jmenuArchivoMesa=new JMenuMe("Archivo");
		this.jmenuAccionesMesa=new JMenuMe("Acciones");
		this.jmenuDatosMesa=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoMesa= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoMesa.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoMesa,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarMesa= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarMesa.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarMesa,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesMesa= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesMesa.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesMesa,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosMesa= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosMesa.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosMesa,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarMesa= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarMesa.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarMesa,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormMesa= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormMesa.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormMesa,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaMesa= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaMesa.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaMesa,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarMesa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarMesa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarMesa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionMesa= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionMesa.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionMesa,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionMesa= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionMesa.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionMesa,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresMesa= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresMesa.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresMesa,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesMesa= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesMesa.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesMesa,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByMesa= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByMesa.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByMesa,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarMesa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarMesa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarMesa,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByMesa= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByMesa.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByMesa,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarMesa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarMesa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarMesa,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarMesa, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosMesa= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosMesa.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosMesa,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoMesa.add(this.jMenuItemCerrarMesa);
			
			this.jmenuAccionesMesa.add(this.jMenuItemNuevoMesa);
			this.jmenuAccionesMesa.add(this.jMenuItemNuevoGuardarCambiosMesa);
			this.jmenuAccionesMesa.add(this.jMenuItemNuevoRelacionesMesa);
			this.jmenuAccionesMesa.add(this.jMenuItemGuardarCambiosTablaMesa);		
			this.jmenuAccionesMesa.add(this.jMenuItemDuplicarMesa);		
			this.jmenuAccionesMesa.add(this.jMenuItemCopiarMesa);		
			this.jmenuAccionesMesa.add(this.jMenuItemVerFormMesa);		
			
			this.jmenuDatosMesa.add(this.jMenuItemRecargarInformacionMesa);				
			this.jmenuDatosMesa.add(this.jMenuItemAnterioresMesa);				
			this.jmenuDatosMesa.add(this.jMenuItemSiguientesMesa);				
			this.jmenuDatosMesa.add(this.jMenuItemAbrirOrderByMesa);				
			this.jmenuDatosMesa.add(this.jMenuItemMostrarOcultarMesa);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesMesa.add(this.jMenuItemGuardarCambiosMesa);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoMesa, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesMesa, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosMesa, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarMesa.add(this.jmenuArchivoMesa);		
			this.jmenuBarMesa.add(this.jmenuAccionesMesa);		
			this.jmenuBarMesa.add(this.jmenuDatosMesa);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarMesa);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasMesa() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasMesa=new JTabbedPane();


		this.jTabbedPaneBusquedasMesa.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasMesa.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasMesa.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasMesa.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasMesa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasMesa,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleMesa = new MesaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Mesa DATOS");
			this.jInternalFrameDetalleFormMesa = new MesaDetalleFormJInternalFrame(jDesktopPane,this.mesaSessionBean.getConGuardarRelaciones(),this.mesaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormMesa = null;//new MesaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutMesa= new GridBagLayout();
		
		
		this.jTableDatosMesa = new JTableMe();      
		
		String sToolTipMesa="";
		sToolTipMesa=MesaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipMesa+="(PuntoVenta.Mesa)";
		}
		
		if(!this.mesaSessionBean.getEsGuardarRelacionado()) {
			sToolTipMesa+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosMesa.setToolTipText(sToolTipMesa);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosMesa);
		this.jTableDatosMesa.setAutoCreateRowSorter(true);
		this.jTableDatosMesa.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosMesa.setRowSelectionAllowed(true);
		this.jTableDatosMesa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosMesa,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoMesa = new JButtonMe();
		this.jButtonDuplicarMesa = new JButtonMe();
		this.jButtonCopiarMesa = new JButtonMe();
		this.jButtonVerFormMesa = new JButtonMe();
		this.jButtonNuevoRelacionesMesa = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaMesa = new JButtonMe();
		this.jButtonCerrarMesa = new JButtonMe();
		
		this.jScrollPanelDatosMesa = new JScrollPane();   
        this.jScrollPanelDatosGeneralMesa = new JScrollPane();
		
				
		
		
		this.jPanelAccionesMesa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Mesa";
		
		if(!this.mesaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosMesa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mesas" + this.sPath));
		} else {
			this.jScrollPanelDatosMesa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralMesa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesMesa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesMesa.setToolTipText("Acciones");
        this.jPanelAccionesMesa.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralMesa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosMesa, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoMesa=new ReporteDinamicoJInternalFrame(MesaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoMesa();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionMesa=new ImportacionJInternalFrame(MesaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionMesa();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByMesa = new JButtonMe();
		
		this.jButtonAbrirOrderByMesa.setText("Orden");
		this.jButtonAbrirOrderByMesa.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByMesa,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByMesa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByMesa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByMesa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByMesa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMesa,false,this);
			
			//this.cargarOrderByMesa(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByMesa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMesa,true,this);
			
			//this.cargarOrderByMesa(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosMesa.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosMesa.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosMesa.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosMesa.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosMesa.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosMesa.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoMesa.setText("Nuevo");
		this.jButtonDuplicarMesa.setText("Duplicar");
		this.jButtonCopiarMesa.setText("Copiar");
		this.jButtonVerFormMesa.setText("Ver");
		this.jButtonNuevoRelacionesMesa.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaMesa.setText("Guardar");
		this.jButtonCerrarMesa.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoMesa,"nuevo_button","Nuevo",this.mesaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarMesa,"duplicar_button","Duplicar",this.mesaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarMesa,"copiar_button","Copiar",this.mesaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormMesa,"ver_form","Ver",this.mesaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesMesa,"nuevorelaciones_button","Nuevo Rel",this.mesaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaMesa,"guardarcambiostabla_button","Guardar",this.mesaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarMesa,"cerrar_button","Salir",this.mesaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesMesa, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoMesa.setToolTipText("Nuevo"+" "+MesaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarMesa.setToolTipText("Duplicar"+" "+MesaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarMesa.setToolTipText("Copiar"+" "+MesaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormMesa.setToolTipText("Ver"+" "+MesaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesMesa.setToolTipText("Nuevo Rel"+" "+MesaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaMesa.setToolTipText("Guardar"+" "+MesaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarMesa.setToolTipText("Salir"+" "+MesaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoMesa";
		inputMap = this.jButtonNuevoMesa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoMesa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoMesa"));
		
		//DUPLICAR
		sMapKey = "DuplicarMesa";
		inputMap = this.jButtonDuplicarMesa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarMesa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarMesa"));
		
		//COPIAR
		sMapKey = "CopiarMesa";
		inputMap = this.jButtonCopiarMesa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarMesa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarMesa"));
		
		//VEr FORM
		sMapKey = "VerFormMesa";
		inputMap = this.jButtonVerFormMesa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormMesa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormMesa"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesMesa";
		inputMap = this.jButtonNuevoRelacionesMesa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesMesa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesMesa"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarMesa";
		inputMap = this.jButtonModificarMesa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarMesa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarMesa"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarMesa";
		inputMap = this.jButtonCerrarMesa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarMesa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarMesa"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaMesa";
		inputMap = this.jButtonGuardarCambiosTablaMesa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaMesa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaMesa"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesMesa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesMesa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionMesa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Mesa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Mesa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Mesa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Mesa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Mesa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesMesa.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesMesa.setName("jPanelParametrosReportesMesa"); 
		
		this.jPanelParametrosReportesAccionesMesa.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesMesa.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesMesa.setName("jPanelParametrosReportesAccionesMesa"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesMesa, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesMesa, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionMesa = new JButtonMe();
		this.jButtonRecargarInformacionMesa.setText("Recargar");
		this.jButtonRecargarInformacionMesa.setToolTipText("Recargar"+" "+MesaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionMesa,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionMesa = new JButtonMe();
		this.jButtonProcesarInformacionMesa.setText("Procesar");
		this.jButtonProcesarInformacionMesa.setToolTipText("Procesar"+" "+MesaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionMesa.setVisible(false);
			
		this.jButtonProcesarInformacionMesa.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionMesa.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionMesa.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesMesa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMesa.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesMesa.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesMesa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMesa.setText("TIPO");       
		this.jComboBoxTiposReportesMesa.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesMesa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMesa.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesMesa.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionMesa = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionMesa.setText("Paginacion");
		this.jComboBoxTiposPaginacionMesa.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesMesa = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesMesa.setText("Accion");
		this.jComboBoxTiposRelacionesMesa.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesMesa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesMesa.setText("Accion");
		this.jComboBoxTiposAccionesMesa.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarMesa = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarMesa.setText("Accion");
		this.jComboBoxTiposSeleccionarMesa.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralMesa=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralMesa.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralMesa.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralMesa.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesMesa = new JLabelMe();
		
		this.jLabelAccionesMesa.setText("Acciones");		
		this.jLabelAccionesMesa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMesa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMesa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosMesa = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosMesa.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosMesa.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosMesa = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosMesa.setText("Seleccionados");
		this.jCheckBoxSeleccionadosMesa.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaMesa = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaMesa.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaMesa.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteMesa = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteMesa.setText("Graf.");
		this.jCheckBoxConGraficoReporteMesa.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresMesa = new JButtonMe();
		//this.jButtonAnterioresMesa.setText("<<");
        this.jButtonAnterioresMesa.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresMesa,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesMesa = new JButtonMe();
		//this.jButtonSiguientesMesa.setText(">>");
        this.jButtonSiguientesMesa.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesMesa,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosMesa = new JButtonMe();
		this.jButtonNuevoGuardarCambiosMesa.setText("Nue");
        this.jButtonNuevoGuardarCambiosMesa.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosMesa,"nuevoguardarcambios_button","Nue",this.mesaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosMesa";
		inputMap = this.jButtonNuevoGuardarCambiosMesa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosMesa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosMesa"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionMesa";
		inputMap = this.jButtonRecargarInformacionMesa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionMesa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionMesa"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesMesa";
		inputMap = this.jButtonSiguientesMesa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesMesa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesMesa"));
		
		//ANTERIORES		
		sMapKey = "AnterioresMesa";
		inputMap = this.jButtonAnterioresMesa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresMesa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresMesa"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasMesa();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesMesa.setMinimumSize(new Dimension(this.getWidth(),MesaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MesaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesMesa.setMaximumSize(new Dimension(this.getWidth(),MesaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MesaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesMesa.setPreferredSize(new Dimension(this.getWidth(),MesaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MesaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionMesa = new GridBagLayout();

			this.jPanelPaginacionMesa.setLayout(gridaBagLayoutPaginacionMesa);						
			
			this.gridBagConstraintsMesa = new GridBagConstraints();
			this.gridBagConstraintsMesa.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsMesa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMesa.gridy = 0;
			this.gridBagConstraintsMesa.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionMesa.add(this.jButtonAnterioresMesa, this.gridBagConstraintsMesa);
					
						
			this.gridBagConstraintsMesa = new GridBagConstraints();
			this.gridBagConstraintsMesa.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsMesa.gridy = 0;
			
			this.jPanelPaginacionMesa.add(this.jButtonNuevoGuardarCambiosMesa, this.gridBagConstraintsMesa);
						
			
			this.gridBagConstraintsMesa = new GridBagConstraints();
			this.gridBagConstraintsMesa.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsMesa.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsMesa.gridy = 0;
			this.jPanelPaginacionMesa.add(this.jButtonSiguientesMesa, this.gridBagConstraintsMesa);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsMesa = new GridBagConstraints();
			this.gridBagConstraintsMesa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMesa.gridy = 1;
			this.gridBagConstraintsMesa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMesa.add(this.jButtonNuevoMesa, this.gridBagConstraintsMesa);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsMesa = new GridBagConstraints();
				this.gridBagConstraintsMesa.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsMesa.gridy = 1;
				this.gridBagConstraintsMesa.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionMesa.add(this.jButtonNuevoRelacionesMesa, this.gridBagConstraintsMesa);
			}
			
			
			if(!this.mesaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsMesa = new GridBagConstraints();
				this.gridBagConstraintsMesa.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsMesa.gridy = 1;
				this.gridBagConstraintsMesa.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionMesa.add(this.jButtonGuardarCambiosTablaMesa, this.gridBagConstraintsMesa);
			}
			
			
			
			this.gridBagConstraintsMesa = new GridBagConstraints();
			this.gridBagConstraintsMesa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMesa.gridy = 1;
			this.gridBagConstraintsMesa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMesa.add(this.jButtonDuplicarMesa, this.gridBagConstraintsMesa);
			
			this.gridBagConstraintsMesa = new GridBagConstraints();
			this.gridBagConstraintsMesa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMesa.gridy = 1;
			this.gridBagConstraintsMesa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMesa.add(this.jButtonCopiarMesa, this.gridBagConstraintsMesa);
		
			this.gridBagConstraintsMesa = new GridBagConstraints();
			this.gridBagConstraintsMesa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMesa.gridy = 1;
			this.gridBagConstraintsMesa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMesa.add(this.jButtonVerFormMesa, this.gridBagConstraintsMesa);
		
			this.gridBagConstraintsMesa = new GridBagConstraints();
			this.gridBagConstraintsMesa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMesa.gridy = 1;
			this.gridBagConstraintsMesa.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionMesa.add(this.jButtonCerrarMesa, this.gridBagConstraintsMesa);
		
		
		
		this.jButtonRecargarInformacionMesa.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionMesa.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionMesa.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionMesa, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesMesa.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesMesa.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesMesa.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesMesa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesMesa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesMesa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesMesa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesMesa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesMesa.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesMesa.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesMesa.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesMesa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionMesa.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionMesa.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionMesa.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionMesa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesMesa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesMesa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesMesa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesMesa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesMesa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMesa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMesa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesMesa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarMesa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarMesa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarMesa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarMesa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaMesa.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaMesa.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaMesa.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaMesa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteMesa.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteMesa.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteMesa.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteMesa, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosMesa.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosMesa.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosMesa.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosMesa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosMesa.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosMesa.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosMesa.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosMesa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesMesa = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesMesa = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Mesa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Mesa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Mesa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Mesa = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesMesa.setLayout(gridaBagParametrosReportesMesa);
			this.jPanelParametrosReportesAccionesMesa.setLayout(gridaBagParametrosReportesAccionesMesa);
			
			
			this.jPanelParametrosAuxiliar1Mesa.setLayout(gridaBagParametrosAuxiliar1Mesa);
			this.jPanelParametrosAuxiliar2Mesa.setLayout(gridaBagParametrosAuxiliar2Mesa);
			this.jPanelParametrosAuxiliar3Mesa.setLayout(gridaBagParametrosAuxiliar3Mesa);
			this.jPanelParametrosAuxiliar4Mesa.setLayout(gridaBagParametrosAuxiliar4Mesa);
			//this.jPanelParametrosAuxiliar5Mesa.setLayout(gridaBagParametrosAuxiliar2Mesa);			
			
			
			
			
			this.gridBagConstraintsMesa = new GridBagConstraints();
			this.gridBagConstraintsMesa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMesa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMesa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMesa.add(this.jButtonRecargarInformacionMesa, this.gridBagConstraintsMesa);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsMesa = new GridBagConstraints();
			this.gridBagConstraintsMesa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMesa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMesa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Mesa.add(this.jComboBoxTiposPaginacionMesa, this.gridBagConstraintsMesa);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsMesa = new GridBagConstraints();
			this.gridBagConstraintsMesa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMesa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMesa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Mesa.add(this.jCheckBoxConAltoMaximoTablaMesa, this.gridBagConstraintsMesa);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsMesa = new GridBagConstraints();
			this.gridBagConstraintsMesa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMesa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMesa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Mesa.add(this.jComboBoxTiposArchivosReportesMesa, this.gridBagConstraintsMesa);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsMesa = new GridBagConstraints();
			this.gridBagConstraintsMesa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMesa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMesa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMesa.add(this.jPanelParametrosAuxiliar1Mesa, this.gridBagConstraintsMesa);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsMesa = new GridBagConstraints();
			this.gridBagConstraintsMesa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMesa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMesa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMesa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Mesa.add(this.jComboBoxTiposReportesMesa, this.gridBagConstraintsMesa);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsMesa = new GridBagConstraints();
			this.gridBagConstraintsMesa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMesa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMesa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMesa.add(this.jPanelParametrosAuxiliar4Mesa, this.gridBagConstraintsMesa);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsMesa = new GridBagConstraints();
			this.gridBagConstraintsMesa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMesa.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsMesa.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMesa.add(this.jComboBoxTiposReportesMesa, this.gridBagConstraintsMesa);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsMesa = new GridBagConstraints();
			this.gridBagConstraintsMesa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMesa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMesa.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMesa.add(this.jCheckBoxGenerarReporteMesa, this.gridBagConstraintsMesa);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsMesa = new GridBagConstraints();
			this.gridBagConstraintsMesa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMesa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMesa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMesa.add(this.jPanelParametrosAuxiliar2Mesa, this.gridBagConstraintsMesa);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsMesa = new GridBagConstraints();
			this.gridBagConstraintsMesa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMesa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMesa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMesa.add(this.jLabelAccionesMesa, this.gridBagConstraintsMesa);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsMesa = new GridBagConstraints();
				this.gridBagConstraintsMesa.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsMesa.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsMesa.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesMesa.add(this.jButtonAbrirOrderByMesa, this.gridBagConstraintsMesa);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsMesa = new GridBagConstraints();
			this.gridBagConstraintsMesa.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsMesa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMesa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMesa.add(this.jComboBoxTiposSeleccionarMesa, this.gridBagConstraintsMesa);			
			
			
			/*
			this.gridBagConstraintsMesa = new GridBagConstraints();
			this.gridBagConstraintsMesa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMesa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMesa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMesa.add(this.jCheckBoxSeleccionarTodosMesa, this.gridBagConstraintsMesa);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsMesa = new GridBagConstraints();
			this.gridBagConstraintsMesa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMesa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMesa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMesa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Mesa.add(this.jCheckBoxSeleccionarTodosMesa, this.gridBagConstraintsMesa);															
				
			this.gridBagConstraintsMesa = new GridBagConstraints();
			this.gridBagConstraintsMesa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMesa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMesa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMesa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Mesa.add(this.jCheckBoxSeleccionadosMesa, this.gridBagConstraintsMesa);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsMesa = new GridBagConstraints();
			this.gridBagConstraintsMesa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMesa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMesa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMesa.add(this.jPanelParametrosAuxiliar3Mesa, this.gridBagConstraintsMesa);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsMesa = new GridBagConstraints();
			this.gridBagConstraintsMesa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMesa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMesa.add(this.jComboBoxTiposRelacionesMesa, this.gridBagConstraintsMesa);
				
			this.gridBagConstraintsMesa = new GridBagConstraints();
			this.gridBagConstraintsMesa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMesa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMesa.add(this.jComboBoxTiposAccionesMesa, this.gridBagConstraintsMesa);
	
				
			this.gridBagConstraintsMesa = new GridBagConstraints();
			this.gridBagConstraintsMesa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMesa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMesa.add(this.jTextFieldValorCampoGeneralMesa, this.gridBagConstraintsMesa);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosMesa = new GridBagLayout();

			this.jScrollPanelDatosMesa.setLayout(gridaBagLayoutDatosMesa);
			
			this.gridBagConstraintsMesa = new GridBagConstraints();
			this.gridBagConstraintsMesa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMesa.gridy = 0;
			this.gridBagConstraintsMesa.gridx = 0;
			
			this.jScrollPanelDatosMesa.add(this.jTableDatosMesa, this.gridBagConstraintsMesa);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosMesa.setViewportView(this.jTableDatosMesa);
		this.jTableDatosMesa.setFillsViewportHeight(true);
		this.jTableDatosMesa.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesMesa= new GridBagLayout();
		this.jPanelAccionesMesa.setLayout(gridaBagLayoutAccionesMesa);
		
		
		/*	
		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMesa.gridy = 0;
		this.gridBagConstraintsMesa.gridx = 0;
			
		this.jPanelAccionesMesa.add(this.jButtonNuevoMesa, this.gridBagConstraintsMesa);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutMesa = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutMesa);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.mesaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsMesa = new GridBagConstraints();						
			this.gridBagConstraintsMesa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMesa.gridx = 0;		
			//this.gridBagConstraintsMesa.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMesa.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsMesa.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarMesa, this.gridBagConstraintsMesa);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.gridy = iGridyPrincipal++;
		this.gridBagConstraintsMesa.gridx = 0;		
		//this.gridBagConstraintsMesa.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMesa.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsMesa.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsMesa);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMesa.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesMesa, this.gridBagConstraintsMesa);								
		
		
		/*
		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMesa.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesMesa, this.gridBagConstraintsMesa);
		*/		
		
		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.gridy =iGridyPrincipal++;
		this.gridBagConstraintsMesa.gridx =0;
		this.gridBagConstraintsMesa.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsMesa.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosMesa, this.gridBagConstraintsMesa);
				
		
		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMesa.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionMesa, this.gridBagConstraintsMesa);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(MesaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosMesa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosMesa = new GridBagLayout();
			this.jPanelBusquedasParametrosMesa.setLayout(gridaBagLayoutBusquedasParametrosMesa);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralMesa=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralMesa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMesa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMesa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsMesa = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMesa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposMesa, this.gridBagConstraintsMesa);
			
			
		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMesa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosMesa, this.gridBagConstraintsMesa);
		
			
		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsMesa.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesMesa, this.gridBagConstraintsMesa);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralMesa;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoMesa() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoMesa = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoMesa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoMesa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoMesa.setName("jPanelReporteDinamicoMesa"); 
		
		this.jPanelReporteDinamicoMesa.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoMesa.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoMesa.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoMesa.setLayout(gridaBagLayoutReporteDinamicoMesa);
		
		
		this.jInternalFrameReporteDinamicoMesa= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoMesa = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteMesa= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoMesa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoMesa.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoMesa.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoMesa.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoMesa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoMesa.setResizable(true);
	    this.jInternalFrameReporteDinamicoMesa.setClosable(true);
	    this.jInternalFrameReporteDinamicoMesa.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoMesa.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoMesa.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoMesa.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoMesa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mesas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteMesa = new JLabelMe();

		this.jLabelColumnasSelectReporteMesa.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteMesa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteMesa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteMesa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMesa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMesa.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMesa.add(this.jLabelColumnasSelectReporteMesa, this.gridBagConstraintsMesa);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteMesa = new JList<Reporte>();
		this.jListColumnasSelectReporteMesa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteMesa.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteMesa.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteMesa.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteMesa.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteMesa=new JScrollPane(this.jListColumnasSelectReporteMesa);
			
			this.jScrollColumnasSelectReporteMesa.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteMesa.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteMesa.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteMesa.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMesa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMesa.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoMesa.add(this.jListColumnasSelectReporteMesa, this.gridBagConstraintsMesa);
		this.jPanelReporteDinamicoMesa.add(this.jScrollColumnasSelectReporteMesa, this.gridBagConstraintsMesa);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteMesa = new JLabelMe();

		this.jLabelRelacionesSelectReporteMesa.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteMesa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteMesa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteMesa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMesa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMesa.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMesa.add(this.jLabelRelacionesSelectReporteMesa, this.gridBagConstraintsMesa);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteMesa = new JList<Reporte>();
		this.jListRelacionesSelectReporteMesa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteMesa.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteMesa.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteMesa.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteMesa.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteMesa=new JScrollPane(this.jListRelacionesSelectReporteMesa);
			
			this.jScrollRelacionesSelectReporteMesa.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteMesa.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteMesa.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteMesa.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMesa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMesa.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoMesa.add(this.jListRelacionesSelectReporteMesa, this.gridBagConstraintsMesa);
		this.jPanelReporteDinamicoMesa.add(this.jScrollRelacionesSelectReporteMesa, this.gridBagConstraintsMesa);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoMesa = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoMesa = new JComboBoxMe();
		this.jListColumnasValoresGraficoMesa = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoMesa = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoMesa.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoMesa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoMesa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoMesa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoMesa, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoMesa = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoMesa.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoMesa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoMesa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoMesa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoMesa, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoMesa = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoMesa.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoMesa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoMesa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoMesa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMesa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMesa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMesa.add(this.jLabelGenerarExcelReporteDinamicoMesa, this.gridBagConstraintsMesa);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoMesa = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoMesa.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoMesa,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoMesa.setToolTipText("Generar EXCEL"+" "+MesaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsMesa = new GridBagConstraints();
		//this.gridBagConstraintsMesa.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsMesa.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsMesa.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoMesa.add(this.jButtonGenerarExcelReporteDinamicoMesa, this.gridBagConstraintsMesa);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMesa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMesa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMesa.add(this.jComboBoxTiposReportesDinamicoMesa, this.gridBagConstraintsMesa);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoMesa = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoMesa.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoMesa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoMesa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoMesa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMesa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMesa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMesa.add(this.jLabelTiposArchivoReporteDinamicoMesa, this.gridBagConstraintsMesa);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMesa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMesa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMesa.add(this.jComboBoxTiposArchivosReportesDinamicoMesa, this.gridBagConstraintsMesa);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoMesa = new JButtonMe();
		this.jButtonGenerarReporteDinamicoMesa.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoMesa,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoMesa.setToolTipText("Generar"+" "+MesaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMesa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMesa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMesa.add(this.jButtonGenerarReporteDinamicoMesa, this.gridBagConstraintsMesa);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoMesa = new JButtonMe();
		this.jButtonCerrarReporteDinamicoMesa.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoMesa,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoMesa.setToolTipText("Cancelar"+" "+MesaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMesa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMesa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMesa.add(this.jButtonCerrarReporteDinamicoMesa, this.gridBagConstraintsMesa);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalMesa = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoMesa= new JScrollPane(jPanelReporteDinamicoMesa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoMesa.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoMesa.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoMesa.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoMesa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mesas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsMesa.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsMesa.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoMesa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoMesa.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalMesa);
		this.jInternalFrameReporteDinamicoMesa.getContentPane().add(this.jScrollPanelReporteDinamicoMesa, this.gridBagConstraintsMesa);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionMesa() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionMesa = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionMesa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionMesa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionMesa.setName("jPanelImportacionMesa"); 
		
		this.jPanelImportacionMesa.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionMesa.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionMesa.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionMesa.setLayout(gridaBagLayoutImportacionMesa);
		
		
		this.jInternalFrameImportacionMesa= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionMesa= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionMesa = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteMesa= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionMesa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionMesa.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionMesa.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionMesa.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionMesa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionMesa.setResizable(true);
	    this.jInternalFrameImportacionMesa.setClosable(true);
	    this.jInternalFrameImportacionMesa.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionMesa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionMesa.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionMesa.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionMesa.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionMesa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionMesa.setResizable(true);
	    this.jInternalFrameImportacionMesa.setClosable(true);
	    this.jInternalFrameImportacionMesa.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionMesa.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionMesa.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionMesa.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionMesa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mesas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionMesa = new JLabelMe();

		this.jLabelArchivoImportacionMesa.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionMesa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionMesa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionMesa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMesa.gridy = iPosYImportacion;		
		this.gridBagConstraintsMesa.gridx = iPosXImportacion++;
			
		this.jPanelImportacionMesa.add(this.jLabelArchivoImportacionMesa, this.gridBagConstraintsMesa);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionMesa = new JFileChooser();		
		this.jFileChooserImportacionMesa.setToolTipText("ESCOGER ARCHIVO"+" "+MesaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionMesa = new JButtonMe();
		this.jButtonAbrirImportacionMesa.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionMesa,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionMesa.setToolTipText("Generar"+" "+MesaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMesa.gridy = iPosYImportacion;
		this.gridBagConstraintsMesa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMesa.add(this.jButtonAbrirImportacionMesa, this.gridBagConstraintsMesa);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionMesa = new JLabelMe();

		this.jLabelPathArchivoImportacionMesa.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionMesa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionMesa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionMesa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMesa.gridy = iPosYImportacion;		
		this.gridBagConstraintsMesa.gridx = iPosXImportacion++;
			
		this.jPanelImportacionMesa.add(this.jLabelPathArchivoImportacionMesa, this.gridBagConstraintsMesa);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionMesa=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionMesa.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionMesa.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionMesa.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMesa.gridy = iPosYImportacion;
		this.gridBagConstraintsMesa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMesa.add(this.jTextFieldPathArchivoImportacionMesa, this.gridBagConstraintsMesa);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionMesa = new JButtonMe();
		this.jButtonGenerarImportacionMesa.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionMesa,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionMesa.setToolTipText("Generar"+" "+MesaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMesa.gridy = iPosYImportacion;
		this.gridBagConstraintsMesa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMesa.add(this.jButtonGenerarImportacionMesa, this.gridBagConstraintsMesa);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionMesa = new JButtonMe();
		this.jButtonCerrarImportacionMesa.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionMesa,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionMesa.setToolTipText("Cancelar"+" "+MesaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMesa.gridy = iPosYImportacion;
		this.gridBagConstraintsMesa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMesa.add(this.jButtonCerrarImportacionMesa, this.gridBagConstraintsMesa);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalMesa = new GridBagLayout();
		
		this.jScrollPanelImportacionMesa= new JScrollPane(jPanelImportacionMesa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.gridy =iPosYImportacion;
		this.gridBagConstraintsMesa.gridx =iPosXImportacion;
		this.gridBagConstraintsMesa.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionMesa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionMesa.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalMesa);
		this.jInternalFrameImportacionMesa.getContentPane().add(this.jScrollPanelImportacionMesa, this.gridBagConstraintsMesa);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByMesa(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByMesa = new JButtonMe();
			this.jButtonAbrirOrderByMesa.setText("Orden");
			this.jButtonAbrirOrderByMesa.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByMesa,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByMesa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByMesa";
			inputMap = this.jButtonAbrirOrderByMesa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByMesa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByMesa"));
		
		
			GridBagLayout gridaBagLayoutOrderByMesa = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByMesa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByMesa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByMesa.setName("jPanelOrderByMesa"); 
			
			this.jPanelOrderByMesa.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByMesa.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByMesa.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByMesa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByMesa.setLayout(gridaBagLayoutOrderByMesa);
			
			
			this.jTableDatosMesaOrderBy = new JTableMe();        
			this.jTableDatosMesaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosMesaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosMesaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosMesaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosMesaOrderBy.setViewportView(this.jTableDatosMesaOrderBy);
			this.jTableDatosMesaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosMesaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByMesa= new OrderByJInternalFrame();
			this.jInternalFrameOrderByMesa= new OrderByJInternalFrame();
			this.jScrollPanelOrderByMesa = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteMesa= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByMesa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByMesa.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByMesa.setTitle("Orden");
			this.jInternalFrameOrderByMesa.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByMesa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByMesa.setResizable(true);
			this.jInternalFrameOrderByMesa.setClosable(true);
			this.jInternalFrameOrderByMesa.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByMesa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByMesa.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByMesa.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByMesa.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByMesa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByMesa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mesas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsMesa = new GridBagConstraints();
			this.gridBagConstraintsMesa.gridy =iPosYOrderBy++;
			this.gridBagConstraintsMesa.gridx =iPosXOrderBy;
			this.gridBagConstraintsMesa.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsMesa.ipady =150;
				
			this.jPanelOrderByMesa.add(jScrollPanelDatosMesaOrderBy, this.gridBagConstraintsMesa);//this.jTableDatosMesaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByMesa = new JButtonMe();
			this.jButtonCerrarOrderByMesa.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByMesa,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByMesa.setToolTipText("Cancelar"+" "+MesaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByMesa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsMesa = new GridBagConstraints();
			this.gridBagConstraintsMesa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMesa.gridy = iPosYOrderBy++;
			this.gridBagConstraintsMesa.gridx = iPosXOrderBy;
									
			this.jPanelOrderByMesa.add(this.jButtonCerrarOrderByMesa, this.gridBagConstraintsMesa);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalMesa = new GridBagLayout();
			
			this.jScrollPanelOrderByMesa= new JScrollPane(jPanelOrderByMesa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsMesa = new GridBagConstraints();
			this.gridBagConstraintsMesa.gridy =iPosYOrderBy;
			this.gridBagConstraintsMesa.gridx =iPosXOrderBy;
			this.gridBagConstraintsMesa.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByMesa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByMesa.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalMesa);
			
			this.jInternalFrameOrderByMesa.getContentPane().add(this.jScrollPanelOrderByMesa, this.gridBagConstraintsMesa);			
		
		} else {
			this.jButtonAbrirOrderByMesa = new JButtonMe();
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
		int iWidthTableCalculado=0;//1330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=400;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.mesaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosMesa.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosMesa.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosMesa.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosMesa.getRowHeight();//MesaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.mesaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > MesaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaMesa.isSelected()) {
					iHeightTable=MesaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < MesaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=MesaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > MesaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaMesa.isSelected()) {
					iHeightTable=MesaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < MesaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=MesaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosMesa.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosMesa.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosMesa.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosMesa.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosMesa.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosMesa.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByMesa!=null && this.jInternalFrameOrderByMesa.getjTableDatosOrderBy()!=null) {
			//if(!this.mesaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByMesa.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByMesa.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByMesa.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByMesa.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByMesa.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByMesa.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByMesa.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosMesa.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosMesa.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosMesa.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=mesaLogic.getMesas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=mesas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Mesa> TraerMesaBeans(List<Mesa> mesas,ArrayList<Classe> classes)throws Exception {
		try {
			for(Mesa mesa:mesas) {
					
				if(!(MesaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || MesaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					mesa.setsDetalleGeneralEntityReporte(MesaConstantesFunciones.getMesaDescripcion(mesa));
										
						
					
					

					if(mesa.getPedidoPuntoVentas()!=null && Funciones.existeClass(classes,PedidoPuntoVenta.class)) {
						try{mesa.setpedidopuntoventasDescripcionReporte(new JRBeanCollectionDataSource(PedidoPuntoVentaJInternalFrame.TraerPedidoPuntoVentaBeans(mesa.getPedidoPuntoVentas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(mesa.getFacturaPuntoVentas()!=null && Funciones.existeClass(classes,FacturaPuntoVenta.class)) {
						try{mesa.setfacturapuntoventasDescripcionReporte(new JRBeanCollectionDataSource(FacturaPuntoVentaJInternalFrame.TraerFacturaPuntoVentaBeans(mesa.getFacturaPuntoVentas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(mesa.getNotaCreditoPuntoVentas()!=null && Funciones.existeClass(classes,NotaCreditoPuntoVenta.class)) {
						try{mesa.setnotacreditopuntoventasDescripcionReporte(new JRBeanCollectionDataSource(NotaCreditoPuntoVentaJInternalFrame.TraerNotaCreditoPuntoVentaBeans(mesa.getNotaCreditoPuntoVentas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(mesa.getCajeroTurnos()!=null && Funciones.existeClass(classes,CajeroTurno.class)) {
						try{mesa.setcajeroturnosDescripcionReporte(new JRBeanCollectionDataSource(CajeroTurnoJInternalFrame.TraerCajeroTurnoBeans(mesa.getCajeroTurnos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//mesa.setsDetalleGeneralEntityReporte(mesa.getsDetalleGeneralEntityReporte());
										
				}
				
				//mesabeans.add(mesabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return mesas;
    }
	//PARA REPORTES FIN
}
