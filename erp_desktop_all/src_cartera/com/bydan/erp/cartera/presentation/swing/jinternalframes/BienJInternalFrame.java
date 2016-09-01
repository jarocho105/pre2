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
import com.bydan.erp.cartera.util.BienConstantesFunciones;

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
public class BienJInternalFrame extends BienBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarBien;
	
	protected JMenuBar jmenuBarBien;
	
	protected JMenu jmenuBien;
	protected JMenu jmenuDatosBien;
	protected JMenu jmenuArchivoBien;
	protected JMenu jmenuAccionesBien;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosBien = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutBien;	
	protected GridBagConstraints gridBagConstraintsBien;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public BienDetalleFormJInternalFrame jInternalFrameDetalleFormBien;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoBien;	
	protected ImportacionJInternalFrame jInternalFrameImportacionBien;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoBienBeanSwingJInternalFrame tipobienBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipobien="";
	
	public BienSessionBean bienSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoBienSessionBean tipobienSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Bien> biens;		
	public List<Bien> biensEliminados;	
	public List<Bien> biensAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByBien;		
	protected JButton jButtonAbrirOrderByBien;
	
	
	//protected JPanel jPanelOrderByBien;
	//public JScrollPane jScrollPanelOrderByBien;	
	//protected JButton jButtonCerrarOrderByBien;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public BienLogic bienLogic;
	
	
	
	public JScrollPane jScrollPanelDatosBien;
	public JScrollPane jScrollPanelDatosEdicionBien;
	public JScrollPane jScrollPanelDatosGeneralBien;
    
	
	
	//public JScrollPane jScrollPanelDatosBienOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoBien;
	//public JScrollPane jScrollPanelImportacionBien;
	
	
	
	protected JPanel jPanelAccionesBien;
	
    protected JPanel jPanelPaginacionBien;
    protected JPanel jPanelParametrosReportesBien;
	protected JPanel jPanelParametrosReportesAccionesBien;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Bien;
	protected JPanel jPanelParametrosAuxiliar2Bien;
	protected JPanel jPanelParametrosAuxiliar3Bien;
	protected JPanel jPanelParametrosAuxiliar4Bien;
	//protected JPanel jPanelParametrosAuxiliar5Bien;
	
	
	
	//protected JPanel jPanelReporteDinamicoBien;
	//protected JPanel jPanelImportacionBien;
	
	
	public JTable jTableDatosBien;
	
	
	
	//public JTable jTableDatosBienOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoBien;
	protected JButton jButtonDuplicarBien;
	protected JButton jButtonCopiarBien;
	protected JButton jButtonVerFormBien;
	protected JButton jButtonNuevoRelacionesBien;
	protected JButton jButtonModificarBien;
	
    protected JButton jButtonGuardarCambiosTablaBien;
	protected JButton jButtonCerrarBien;
	
	
	protected JButton jButtonRecargarInformacionBien;
	protected JButton jButtonProcesarInformacionBien;
	
	
	protected JButton jButtonAnterioresBien;
	protected JButton jButtonSiguientesBien;
	protected JButton jButtonNuevoGuardarCambiosBien;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoBien;
	//protected JButton jButtonCerrarReporteDinamicoBien;
	//protected JButton jButtonGenerarExcelReporteDinamicoBien;	
	
	
	
	//protected JButton jButtonAbrirImportacionBien;
	//protected JButton jButtonGenerarImportacionBien;
	//protected JButton jButtonCerrarImportacionBien;
	//protected JFileChooser jFileChooserImportacionBien;
	//protected File fileImportacionBien;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarBien;
	protected JButton jButtonDuplicarToolBarBien;
	protected JButton jButtonNuevoRelacionesToolBarBien;
	
	
	public JButton jButtonGuardarCambiosToolBarBien;
	protected JButton jButtonCopiarToolBarBien;
	protected JButton jButtonVerFormToolBarBien;
	public JButton jButtonGuardarCambiosTablaToolBarBien;
	protected JButton jButtonMostrarOcultarTablaToolBarBien;
	protected JButton jButtonCerrarToolBarBien;
	
	protected JButton jButtonRecargarInformacionToolBarBien;
	protected JButton jButtonProcesarInformacionToolBarBien;
	protected JButton jButtonAnterioresToolBarBien;
	protected JButton jButtonSiguientesToolBarBien;
	protected JButton jButtonNuevoGuardarCambiosToolBarBien;
	protected JButton jButtonAbrirOrderByToolBarBien;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoBien;
	protected JMenuItem jMenuItemDuplicarBien;
	protected JMenuItem jMenuItemNuevoRelacionesBien;
	
	
	protected JMenuItem jMenuItemGuardarCambiosBien;
	protected JMenuItem jMenuItemCopiarBien;
	protected JMenuItem jMenuItemVerFormBien;
	protected JMenuItem jMenuItemGuardarCambiosTablaBien;
	protected JMenuItem jMenuItemCerrarBien;
	protected JMenuItem jMenuItemDetalleCerrarBien;
	protected JMenuItem jMenuItemDetalleAbrirOrderByBien;
	protected JMenuItem jMenuItemDetalleMostarOcultarBien;
	
	protected JMenuItem jMenuItemRecargarInformacionBien;
	protected JMenuItem jMenuItemProcesarInformacionBien;
	protected JMenuItem jMenuItemAnterioresBien;
	protected JMenuItem jMenuItemSiguientesBien;
	protected JMenuItem jMenuItemNuevoGuardarCambiosBien;
	protected JMenuItem jMenuItemAbrirOrderByBien;
	protected JMenuItem jMenuItemMostrarOcultarBien;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesBien;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosBien;
	protected JCheckBox jCheckBoxSeleccionadosBien;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaBien;
	protected JCheckBox jCheckBoxConGraficoReporteBien;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesBien;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesBien;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoBien;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoBien;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesBien;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionBien;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesBien;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesBien;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarBien;
	protected JTextField jTextFieldValorCampoGeneralBien;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteBien;
	//public JList<Reporte> jListColumnasSelectReporteBien;
	//public JScrollPane jScrollColumnasSelectReporteBien;
	
	//public JLabel jLabelRelacionesSelectReporteBien;
	//public JList<Reporte> jListRelacionesSelectReporteBien;
	//public JScrollPane jScrollRelacionesSelectReporteBien;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoBien;
	//protected JCheckBox jCheckBoxConGraficoDinamicoBien;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoBien;
	//public JLabel jLabelTiposArchivoReporteDinamicoBien;
	
		
	//public JLabel jLabelArchivoImportacionBien;	
	//public JLabel jLabelPathArchivoImportacionBien;
	//protected JTextField jTextFieldPathArchivoImportacionBien;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoBien;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoBien;
	
	//public JLabel jLabelColumnaCategoriaValorBien;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorBien;
	
	//public JLabel jLabelColumnasValoresGraficoBien;
	//public JList<Reporte> jListColumnasValoresGraficoBien;
	//public JScrollPane jScrollColumnasValoresGraficoBien;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoBien;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoBien;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasBien;
	public JPanel jPanelFK_IdClienteBien;
	public JButton jButtonFK_IdClienteBien;
	public JPanel jPanelFK_IdValorClienteTipoBienBien;
	public JButton jButtonFK_IdValorClienteTipoBienBien;
	
	public JPanel jPanelid_clienteFK_IdClienteBien;
	public JLabel jLabelid_clienteFK_IdClienteBien;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteBien;
	public JButton jButtonid_clienteFK_IdClienteBien= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteBienUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteBienBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteBien;
	
	public JPanel jPanelid_tipobienFK_IdValorClienteTipoBienBien;
	public JLabel jLabelid_tipobienFK_IdValorClienteTipoBienBien;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipobienFK_IdValorClienteTipoBienBien;
	public JButton jButtonid_tipobienFK_IdValorClienteTipoBienBien= new JButtonMe();
	public JButton jButtonid_tipobienFK_IdValorClienteTipoBienBienUpdate= new JButtonMe();
	public JButton jButtonid_tipobienFK_IdValorClienteTipoBienBienBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public BienJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Bien No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BienJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Bien No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BienJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Bien No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BienJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Bien No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionBien)	{
		this.jButtonRecargarInformacionBien = jButtonRecargarInformacionBien;
	}
	
	public JButton getjButtonProcesarInformacionBien() {
		return this.jButtonProcesarInformacionBien;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionBien)	{
		this.jButtonProcesarInformacionBien = jButtonProcesarInformacionBien;
	}
	
	
	public JButton getjButtonRecargarInformacionBien() {
		return this.jButtonRecargarInformacionBien;
	}
	
	
	public List<Bien> getbiens() {
		return this.biens;
	}

	public void setbiens(List<Bien> biens) {
		this.biens = biens;
	}
	
	public List<Bien> getbiensAux() {
		return this.biensAux;
	}

	public void setbiensAux(List<Bien> biensAux) {
		this.biensAux = biensAux;
	}
	
	public List<Bien> getbiensEliminados() {
		return this.biensEliminados;
	}

	public void setBiensEliminados(List<Bien> biensEliminados) {
		this.biensEliminados = biensEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarBien() {
		return jComboBoxTiposSeleccionarBien;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarBien(
			JComboBox jComboBoxTiposSeleccionarBien) {
		this.jComboBoxTiposSeleccionarBien = jComboBoxTiposSeleccionarBien;
	}
	
	public void setBorderResaltarTiposSeleccionarBien() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarBien.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarBien .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralBien() {
		return jTextFieldValorCampoGeneralBien;
	}

	public void setjTextFieldValorCampoGeneralBien(
			JTextField jTextFieldValorCampoGeneralBien) {
		this.jTextFieldValorCampoGeneralBien = jTextFieldValorCampoGeneralBien;
	}

	public void setBorderResaltarValorCampoGeneralBien() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBien.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralBien .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosBien() {
		return this.jCheckBoxSeleccionarTodosBien;
	}

	public void setjCheckBoxSeleccionarTodosBien(
			JCheckBox jCheckBoxSeleccionarTodosBien) {
		this.jCheckBoxSeleccionarTodosBien = jCheckBoxSeleccionarTodosBien;
	}

	public void setBorderResaltarSeleccionarTodosBien() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBien.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosBien .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosBien() {
		return this.jCheckBoxSeleccionadosBien;
	}

	public void setjCheckBoxSeleccionadosBien(
			JCheckBox jCheckBoxSeleccionadosBien) {
		this.jCheckBoxSeleccionadosBien = jCheckBoxSeleccionadosBien;
	}
	
	public void setBorderResaltarSeleccionadosBien() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBien.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosBien .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesBien() {
		return this.jComboBoxTiposArchivosReportesBien;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesBien(
			JComboBox jComboBoxTiposArchivosReportesBien) {
		this.jComboBoxTiposArchivosReportesBien = jComboBoxTiposArchivosReportesBien;
	}

	public void setBorderResaltarTiposArchivosReportesBien() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBien.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesBien .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesBien() {
		return this.jComboBoxTiposReportesBien;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesBien(
			JComboBox jComboBoxTiposReportesBien) {
		this.jComboBoxTiposReportesBien = jComboBoxTiposReportesBien;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoBien() {
	//	return jComboBoxTiposReportesDinamicoBien;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoBien(
	//		JComboBox jComboBoxTiposReportesDinamicoBien) {
	//	this.jComboBoxTiposReportesDinamicoBien = jComboBoxTiposReportesDinamicoBien;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoBien() {
	//	return jComboBoxTiposArchivosReportesDinamicoBien;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoBien(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoBien) {
	//	this.jComboBoxTiposArchivosReportesDinamicoBien = jComboBoxTiposArchivosReportesDinamicoBien;
	//}
	
	public void setBorderResaltarTiposReportesBien() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBien.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesBien .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesBien() {
		return this.jComboBoxTiposGraficosReportesBien;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesBien(
			JComboBox jComboBoxTiposGraficosReportesBien) {
		this.jComboBoxTiposGraficosReportesBien = jComboBoxTiposGraficosReportesBien;
	}
	
	public void setBorderResaltarTiposGraficosReportesBien() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBien.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesBien .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionBien() {
		return this.jComboBoxTiposPaginacionBien;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionBien(
			JComboBox jComboBoxTiposPaginacionBien) {
		this.jComboBoxTiposPaginacionBien = jComboBoxTiposPaginacionBien;
	}
	
	public void setBorderResaltarTiposPaginacionBien() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBien.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionBien .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesBien() {
		return this.jComboBoxTiposRelacionesBien;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesBien() {
		return this.jComboBoxTiposAccionesBien;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesBien(
			JComboBox jComboBoxTiposRelacionesBien) {
		this.jComboBoxTiposRelacionesBien = jComboBoxTiposRelacionesBien;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesBien(
			JComboBox jComboBoxTiposAccionesBien) {
		this.jComboBoxTiposAccionesBien = jComboBoxTiposAccionesBien;
	}
	
	public void setBorderResaltarTiposRelacionesBien() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBien.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesBien .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesBien() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBien.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesBien .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoBien() {
	//	return jCheckBoxConGraficoDinamicoBien;
	//}

	//public void setjCheckBoxConGraficoDinamicoBien(
	//		JCheckBox jCheckBoxConGraficoDinamicoBien) {
	//	this.jCheckBoxConGraficoDinamicoBien = jCheckBoxConGraficoDinamicoBien;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoBien() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarBien.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoBien .setBorder(borderResaltar);		
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
		this.bienSessionBean=new BienSessionBean();
		
		this.bienSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.bienSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.bienSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=BienJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=BienJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		BienJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		BienJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		BienJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Bien MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.bienSessionBean.getEsGuardarRelacionado()) {
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
		
		BienJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Bien No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarBien= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarBien=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarBien,this.jTtoolBarBien,
							"nuevo","nuevo","Nuevo"+" "+BienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarBien=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarBien,this.jTtoolBarBien,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarBien=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarBien,this.jTtoolBarBien,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+BienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarBien=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarBien,this.jTtoolBarBien,
							"duplicar","duplicar","Duplicar"+" "+BienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarBien=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarBien,this.jTtoolBarBien,
							"copiar","copiar","Copiar"+" "+BienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarBien=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarBien,this.jTtoolBarBien,
							"ver_form","ver_form","Ver"+" "+BienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarBien=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBien,this.jTtoolBarBien,
							"recargar","recargar","Recargar"+" "+BienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarBien=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBien,this.jTtoolBarBien,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarBien=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBien,this.jTtoolBarBien,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarBien=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarBien,this.jTtoolBarBien,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarBien=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarBien,this.jTtoolBarBien,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarBien=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarBien,this.jTtoolBarBien,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+BienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarBien=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarBien,this.jTtoolBarBien,
							"cerrar","cerrar","Salir"+" "+BienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarBien=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarBien;
			
				this.jButtonProcesarInformacionToolBarBien=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarBien;
				
		//protected JButton jButtonModificarToolBarBien;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarBien=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuBien=new JMenuMe("General");
		this.jmenuArchivoBien=new JMenuMe("Archivo");
		this.jmenuAccionesBien=new JMenuMe("Acciones");
		this.jmenuDatosBien=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoBien= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoBien.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoBien,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarBien= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarBien.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarBien,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesBien= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesBien.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesBien,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosBien= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosBien.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosBien,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarBien= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarBien.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarBien,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormBien= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormBien.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormBien,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaBien= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaBien.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaBien,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarBien= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarBien.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarBien,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionBien= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionBien.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionBien,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionBien= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionBien.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionBien,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresBien= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresBien.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresBien,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesBien= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesBien.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesBien,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByBien= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByBien.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByBien,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarBien= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarBien.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarBien,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByBien= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByBien.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByBien,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarBien= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarBien.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarBien,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarBien, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosBien= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosBien.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosBien,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoBien.add(this.jMenuItemCerrarBien);
			
			this.jmenuAccionesBien.add(this.jMenuItemNuevoBien);
			this.jmenuAccionesBien.add(this.jMenuItemNuevoGuardarCambiosBien);
			this.jmenuAccionesBien.add(this.jMenuItemNuevoRelacionesBien);
			this.jmenuAccionesBien.add(this.jMenuItemGuardarCambiosTablaBien);		
			this.jmenuAccionesBien.add(this.jMenuItemDuplicarBien);		
			this.jmenuAccionesBien.add(this.jMenuItemCopiarBien);		
			this.jmenuAccionesBien.add(this.jMenuItemVerFormBien);		
			
			this.jmenuDatosBien.add(this.jMenuItemRecargarInformacionBien);				
			this.jmenuDatosBien.add(this.jMenuItemAnterioresBien);				
			this.jmenuDatosBien.add(this.jMenuItemSiguientesBien);				
			this.jmenuDatosBien.add(this.jMenuItemAbrirOrderByBien);				
			this.jmenuDatosBien.add(this.jMenuItemMostrarOcultarBien);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesBien.add(this.jMenuItemGuardarCambiosBien);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoBien, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesBien, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosBien, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarBien.add(this.jmenuArchivoBien);		
			this.jmenuBarBien.add(this.jmenuAccionesBien);		
			this.jmenuBarBien.add(this.jmenuDatosBien);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarBien);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasBien() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClienteBien=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteBien.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteBien= new JButtonMe();
		this.jButtonFK_IdClienteBien.setText("Buscar");
		this.jButtonFK_IdClienteBien.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteBien,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteBien, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteBien = new JLabelMe();
		jLabelid_clienteFK_IdClienteBien.setText("Cliente :");
		jLabelid_clienteFK_IdClienteBien.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteBien,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteBien= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteBien,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteBien= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteBien.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteBien.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteBien.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteBien.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteBien.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteBien.setFocusable(false);

		this.jPanelFK_IdValorClienteTipoBienBien=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdValorClienteTipoBienBien.setToolTipText("Buscar Por Tipo Bien ");
		this.jButtonFK_IdValorClienteTipoBienBien= new JButtonMe();
		this.jButtonFK_IdValorClienteTipoBienBien.setText("Buscar");
		this.jButtonFK_IdValorClienteTipoBienBien.setToolTipText("Buscar Por Tipo Bien ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdValorClienteTipoBienBien,"buscar_button","Buscar Por Tipo Bien ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdValorClienteTipoBienBien, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipobienFK_IdValorClienteTipoBienBien = new JLabelMe();
		jLabelid_tipobienFK_IdValorClienteTipoBienBien.setText("Tipo Bien :");
		jLabelid_tipobienFK_IdValorClienteTipoBienBien.setToolTipText("Tipo Bien");
		jLabelid_tipobienFK_IdValorClienteTipoBienBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipobienFK_IdValorClienteTipoBienBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipobienFK_IdValorClienteTipoBienBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipobienFK_IdValorClienteTipoBienBien,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipobienFK_IdValorClienteTipoBienBien= new JComboBoxMe();
		jComboBoxid_tipobienFK_IdValorClienteTipoBienBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipobienFK_IdValorClienteTipoBienBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipobienFK_IdValorClienteTipoBienBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipobienFK_IdValorClienteTipoBienBien,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasBien=new JTabbedPane();


		this.jTabbedPaneBusquedasBien.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasBien.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasBien.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasBien.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasBien,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleBien = new BienDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Bien DATOS");
			this.jInternalFrameDetalleFormBien = new BienDetalleFormJInternalFrame(jDesktopPane,this.bienSessionBean.getConGuardarRelaciones(),this.bienSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormBien = null;//new BienDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutBien= new GridBagLayout();
		
		
		this.jTableDatosBien = new JTableMe();      
		
		String sToolTipBien="";
		sToolTipBien=BienConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipBien+="(Cartera.Bien)";
		}
		
		if(!this.bienSessionBean.getEsGuardarRelacionado()) {
			sToolTipBien+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosBien.setToolTipText(sToolTipBien);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosBien);
		this.jTableDatosBien.setAutoCreateRowSorter(true);
		this.jTableDatosBien.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosBien.setRowSelectionAllowed(true);
		this.jTableDatosBien.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosBien,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoBien = new JButtonMe();
		this.jButtonDuplicarBien = new JButtonMe();
		this.jButtonCopiarBien = new JButtonMe();
		this.jButtonVerFormBien = new JButtonMe();
		this.jButtonNuevoRelacionesBien = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaBien = new JButtonMe();
		this.jButtonCerrarBien = new JButtonMe();
		
		this.jScrollPanelDatosBien = new JScrollPane();   
        this.jScrollPanelDatosGeneralBien = new JScrollPane();
		
				
		
		
		this.jPanelAccionesBien = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Bien";
		
		if(!this.bienSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bienes" + this.sPath));
		} else {
			this.jScrollPanelDatosBien.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesBien.setToolTipText("Acciones");
        this.jPanelAccionesBien.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralBien, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosBien, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoBien=new ReporteDinamicoJInternalFrame(BienConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoBien();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionBien=new ImportacionJInternalFrame(BienConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionBien();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByBien = new JButtonMe();
		
		this.jButtonAbrirOrderByBien.setText("Orden");
		this.jButtonAbrirOrderByBien.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByBien,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByBien, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByBien.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByBien=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBien,false,this);
			
			//this.cargarOrderByBien(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByBien=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBien,true,this);
			
			//this.cargarOrderByBien(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosBien.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosBien.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosBien.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosBien.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosBien.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosBien.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoBien.setText("Nuevo");
		this.jButtonDuplicarBien.setText("Duplicar");
		this.jButtonCopiarBien.setText("Copiar");
		this.jButtonVerFormBien.setText("Ver");
		this.jButtonNuevoRelacionesBien.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaBien.setText("Guardar");
		this.jButtonCerrarBien.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoBien,"nuevo_button","Nuevo",this.bienSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarBien,"duplicar_button","Duplicar",this.bienSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarBien,"copiar_button","Copiar",this.bienSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormBien,"ver_form","Ver",this.bienSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesBien,"nuevorelaciones_button","Nuevo Rel",this.bienSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaBien,"guardarcambiostabla_button","Guardar",this.bienSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarBien,"cerrar_button","Salir",this.bienSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarBien, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarBien, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormBien, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesBien, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaBien, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoBien.setToolTipText("Nuevo"+" "+BienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarBien.setToolTipText("Duplicar"+" "+BienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarBien.setToolTipText("Copiar"+" "+BienConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormBien.setToolTipText("Ver"+" "+BienConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesBien.setToolTipText("Nuevo Rel"+" "+BienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaBien.setToolTipText("Guardar"+" "+BienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarBien.setToolTipText("Salir"+" "+BienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoBien";
		inputMap = this.jButtonNuevoBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoBien.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoBien"));
		
		//DUPLICAR
		sMapKey = "DuplicarBien";
		inputMap = this.jButtonDuplicarBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarBien.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarBien"));
		
		//COPIAR
		sMapKey = "CopiarBien";
		inputMap = this.jButtonCopiarBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarBien.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarBien"));
		
		//VEr FORM
		sMapKey = "VerFormBien";
		inputMap = this.jButtonVerFormBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormBien.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormBien"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesBien";
		inputMap = this.jButtonNuevoRelacionesBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesBien.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesBien"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarBien";
		inputMap = this.jButtonModificarBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarBien.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarBien"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarBien";
		inputMap = this.jButtonCerrarBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarBien.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarBien"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaBien";
		inputMap = this.jButtonGuardarCambiosTablaBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaBien.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaBien"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesBien = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesBien = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionBien = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Bien= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Bien= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Bien= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Bien= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Bien= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesBien.setName("jPanelParametrosReportesBien"); 
		
		this.jPanelParametrosReportesAccionesBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesBien.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesBien.setName("jPanelParametrosReportesAccionesBien"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesBien, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesBien, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionBien = new JButtonMe();
		this.jButtonRecargarInformacionBien.setText("Recargar");
		this.jButtonRecargarInformacionBien.setToolTipText("Recargar"+" "+BienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionBien,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionBien = new JButtonMe();
		this.jButtonProcesarInformacionBien.setText("Procesar");
		this.jButtonProcesarInformacionBien.setToolTipText("Procesar"+" "+BienConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionBien.setVisible(false);
			
		this.jButtonProcesarInformacionBien.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionBien.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionBien.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesBien = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBien.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesBien.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesBien = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBien.setText("TIPO");       
		this.jComboBoxTiposReportesBien.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesBien = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBien.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesBien.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionBien = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionBien.setText("Paginacion");
		this.jComboBoxTiposPaginacionBien.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesBien = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesBien.setText("Accion");
		this.jComboBoxTiposRelacionesBien.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesBien = new JComboBoxMe();
		//this.jComboBoxTiposAccionesBien.setText("Accion");
		this.jComboBoxTiposAccionesBien.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarBien = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarBien.setText("Accion");
		this.jComboBoxTiposSeleccionarBien.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralBien=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralBien.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralBien.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralBien.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesBien = new JLabelMe();
		
		this.jLabelAccionesBien.setText("Acciones");		
		this.jLabelAccionesBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosBien = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosBien.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosBien.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosBien = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosBien.setText("Seleccionados");
		this.jCheckBoxSeleccionadosBien.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaBien = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaBien.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaBien.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteBien = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteBien.setText("Graf.");
		this.jCheckBoxConGraficoReporteBien.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresBien = new JButtonMe();
		//this.jButtonAnterioresBien.setText("<<");
        this.jButtonAnterioresBien.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresBien,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesBien = new JButtonMe();
		//this.jButtonSiguientesBien.setText(">>");
        this.jButtonSiguientesBien.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesBien,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosBien = new JButtonMe();
		this.jButtonNuevoGuardarCambiosBien.setText("Nue");
        this.jButtonNuevoGuardarCambiosBien.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosBien,"nuevoguardarcambios_button","Nue",this.bienSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosBien";
		inputMap = this.jButtonNuevoGuardarCambiosBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosBien.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosBien"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionBien";
		inputMap = this.jButtonRecargarInformacionBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionBien.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionBien"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesBien";
		inputMap = this.jButtonSiguientesBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesBien.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesBien"));
		
		//ANTERIORES		
		sMapKey = "AnterioresBien";
		inputMap = this.jButtonAnterioresBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresBien.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresBien"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasBien();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesBien.setMinimumSize(new Dimension(this.getWidth(),BienBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BienBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesBien.setMaximumSize(new Dimension(this.getWidth(),BienBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BienBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesBien.setPreferredSize(new Dimension(this.getWidth(),BienBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BienBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionBien = new GridBagLayout();

			this.jPanelPaginacionBien.setLayout(gridaBagLayoutPaginacionBien);						
			
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsBien.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBien.gridy = 0;
			this.gridBagConstraintsBien.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionBien.add(this.jButtonAnterioresBien, this.gridBagConstraintsBien);
					
						
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsBien.gridy = 0;
			
			this.jPanelPaginacionBien.add(this.jButtonNuevoGuardarCambiosBien, this.gridBagConstraintsBien);
						
			
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsBien.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsBien.gridy = 0;
			this.jPanelPaginacionBien.add(this.jButtonSiguientesBien, this.gridBagConstraintsBien);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBien.gridy = 1;
			this.gridBagConstraintsBien.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBien.add(this.jButtonNuevoBien, this.gridBagConstraintsBien);
						
			
			
			if(!this.bienSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsBien = new GridBagConstraints();
				this.gridBagConstraintsBien.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsBien.gridy = 1;
				this.gridBagConstraintsBien.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionBien.add(this.jButtonGuardarCambiosTablaBien, this.gridBagConstraintsBien);
			}
			
			
			
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBien.gridy = 1;
			this.gridBagConstraintsBien.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBien.add(this.jButtonDuplicarBien, this.gridBagConstraintsBien);
			
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBien.gridy = 1;
			this.gridBagConstraintsBien.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBien.add(this.jButtonCopiarBien, this.gridBagConstraintsBien);
		
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBien.gridy = 1;
			this.gridBagConstraintsBien.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBien.add(this.jButtonVerFormBien, this.gridBagConstraintsBien);
		
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBien.gridy = 1;
			this.gridBagConstraintsBien.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionBien.add(this.jButtonCerrarBien, this.gridBagConstraintsBien);
		
		
		
		this.jButtonRecargarInformacionBien.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionBien.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionBien.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionBien, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesBien.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesBien.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesBien.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesBien, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesBien.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesBien.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesBien.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesBien, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesBien.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesBien.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesBien.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesBien, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionBien.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionBien.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionBien.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionBien, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesBien.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesBien.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesBien.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesBien, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesBien.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBien.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBien.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesBien, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarBien.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarBien.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarBien.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarBien, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaBien.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaBien.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaBien.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaBien, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteBien.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteBien.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteBien.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteBien, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosBien.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosBien.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosBien.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosBien, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosBien.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosBien.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosBien.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosBien, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesBien = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesBien = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Bien = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Bien = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Bien = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Bien = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesBien.setLayout(gridaBagParametrosReportesBien);
			this.jPanelParametrosReportesAccionesBien.setLayout(gridaBagParametrosReportesAccionesBien);
			
			
			this.jPanelParametrosAuxiliar1Bien.setLayout(gridaBagParametrosAuxiliar1Bien);
			this.jPanelParametrosAuxiliar2Bien.setLayout(gridaBagParametrosAuxiliar2Bien);
			this.jPanelParametrosAuxiliar3Bien.setLayout(gridaBagParametrosAuxiliar3Bien);
			this.jPanelParametrosAuxiliar4Bien.setLayout(gridaBagParametrosAuxiliar4Bien);
			//this.jPanelParametrosAuxiliar5Bien.setLayout(gridaBagParametrosAuxiliar2Bien);			
			
			
			
			
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBien.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBien.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBien.add(this.jButtonRecargarInformacionBien, this.gridBagConstraintsBien);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBien.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBien.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Bien.add(this.jComboBoxTiposPaginacionBien, this.gridBagConstraintsBien);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBien.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBien.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Bien.add(this.jCheckBoxConAltoMaximoTablaBien, this.gridBagConstraintsBien);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBien.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBien.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Bien.add(this.jComboBoxTiposArchivosReportesBien, this.gridBagConstraintsBien);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBien.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBien.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBien.add(this.jPanelParametrosAuxiliar1Bien, this.gridBagConstraintsBien);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBien.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBien.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBien.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Bien.add(this.jComboBoxTiposReportesBien, this.gridBagConstraintsBien);																		
			
			
			
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBien.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBien.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBien.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4Bien.add(this.jComboBoxTiposGraficosReportesBien, this.gridBagConstraintsBien);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBien.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBien.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBien.add(this.jPanelParametrosAuxiliar4Bien, this.gridBagConstraintsBien);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBien.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsBien.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBien.add(this.jComboBoxTiposReportesBien, this.gridBagConstraintsBien);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBien.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBien.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBien.add(this.jCheckBoxGenerarReporteBien, this.gridBagConstraintsBien);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBien.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBien.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBien.add(this.jPanelParametrosAuxiliar2Bien, this.gridBagConstraintsBien);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBien.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBien.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBien.add(this.jLabelAccionesBien, this.gridBagConstraintsBien);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsBien = new GridBagConstraints();
				this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsBien.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsBien.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesBien.add(this.jButtonAbrirOrderByBien, this.gridBagConstraintsBien);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsBien.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBien.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBien.add(this.jComboBoxTiposSeleccionarBien, this.gridBagConstraintsBien);			
			
			
			/*
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBien.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBien.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBien.add(this.jCheckBoxSeleccionarTodosBien, this.gridBagConstraintsBien);
			
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBien.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBien.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBien.add(this.jCheckBoxConGraficoReporteBien, this.gridBagConstraintsBien);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBien.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBien.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBien.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Bien.add(this.jCheckBoxSeleccionarTodosBien, this.gridBagConstraintsBien);															
				
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBien.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBien.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBien.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Bien.add(this.jCheckBoxSeleccionadosBien, this.gridBagConstraintsBien);															
			
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBien.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBien.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBien.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Bien.add(this.jCheckBoxConGraficoReporteBien, this.gridBagConstraintsBien);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBien.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBien.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBien.add(this.jPanelParametrosAuxiliar3Bien, this.gridBagConstraintsBien);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBien.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBien.add(this.jComboBoxTiposAccionesBien, this.gridBagConstraintsBien);
	
				
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBien.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBien.add(this.jTextFieldValorCampoGeneralBien, this.gridBagConstraintsBien);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosBien = new GridBagLayout();

			this.jScrollPanelDatosBien.setLayout(gridaBagLayoutDatosBien);
			
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBien.gridy = 0;
			this.gridBagConstraintsBien.gridx = 0;
			
			this.jScrollPanelDatosBien.add(this.jTableDatosBien, this.gridBagConstraintsBien);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosBien.setViewportView(this.jTableDatosBien);
		this.jTableDatosBien.setFillsViewportHeight(true);
		this.jTableDatosBien.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesBien= new GridBagLayout();
		this.jPanelAccionesBien.setLayout(gridaBagLayoutAccionesBien);
		
		
		/*	
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBien.gridy = 0;
		this.gridBagConstraintsBien.gridx = 0;
			
		this.jPanelAccionesBien.add(this.jButtonNuevoBien, this.gridBagConstraintsBien);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClienteBien= new GridBagLayout();
		gridaBagLayoutFK_IdClienteBien.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteBien.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteBien.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteBien.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteBien.setLayout(gridaBagLayoutFK_IdClienteBien);

		gridBagConstraintsBien = new GridBagConstraints();
		gridBagConstraintsBien.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBien.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBien.gridy = 0;
		gridBagConstraintsBien.gridx = 0;
		jPanelFK_IdClienteBien.add(jLabelid_clienteFK_IdClienteBien, gridBagConstraintsBien);

		gridBagConstraintsBien = new GridBagConstraints();
		gridBagConstraintsBien.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBien.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBien.gridy = 0;
		gridBagConstraintsBien.gridx = 1;
		jPanelFK_IdClienteBien.add(jComboBoxid_clienteFK_IdClienteBien, gridBagConstraintsBien);


		gridBagConstraintsBien = new GridBagConstraints();
		gridBagConstraintsBien.anchor = GridBagConstraints.EAST;
		gridBagConstraintsBien.fill = GridBagConstraints.NONE;
		gridBagConstraintsBien.gridy = 0;
		gridBagConstraintsBien.gridx = 0;
		jPanelFK_IdClienteBien.add(this.jButtonBuscarFK_IdClienteid_clienteBien, gridBagConstraintsBien);

		gridBagConstraintsBien = new GridBagConstraints();
		gridBagConstraintsBien.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBien.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBien.gridy = 1;
		gridBagConstraintsBien.gridx =1;
		jPanelFK_IdClienteBien.add(jButtonFK_IdClienteBien, gridBagConstraintsBien);

		jTabbedPaneBusquedasBien.addTab("1.-Por Cliente ", jPanelFK_IdClienteBien);
		jTabbedPaneBusquedasBien.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdValorClienteTipoBienBien= new GridBagLayout();
		gridaBagLayoutFK_IdValorClienteTipoBienBien.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdValorClienteTipoBienBien.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdValorClienteTipoBienBien.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdValorClienteTipoBienBien.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdValorClienteTipoBienBien.setLayout(gridaBagLayoutFK_IdValorClienteTipoBienBien);

		gridBagConstraintsBien = new GridBagConstraints();
		gridBagConstraintsBien.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBien.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBien.gridy = 0;
		gridBagConstraintsBien.gridx = 0;
		jPanelFK_IdValorClienteTipoBienBien.add(jLabelid_tipobienFK_IdValorClienteTipoBienBien, gridBagConstraintsBien);

		gridBagConstraintsBien = new GridBagConstraints();
		gridBagConstraintsBien.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBien.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBien.gridy = 0;
		gridBagConstraintsBien.gridx = 1;
		jPanelFK_IdValorClienteTipoBienBien.add(jComboBoxid_tipobienFK_IdValorClienteTipoBienBien, gridBagConstraintsBien);

		gridBagConstraintsBien = new GridBagConstraints();
		gridBagConstraintsBien.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBien.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBien.gridy = 1;
		gridBagConstraintsBien.gridx =1;
		jPanelFK_IdValorClienteTipoBienBien.add(jButtonFK_IdValorClienteTipoBienBien, gridBagConstraintsBien);

		jTabbedPaneBusquedasBien.addTab("2.-Por Tipo Bien ", jPanelFK_IdValorClienteTipoBienBien);
		jTabbedPaneBusquedasBien.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutBien = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutBien);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.bienSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsBien = new GridBagConstraints();						
			this.gridBagConstraintsBien.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBien.gridx = 0;		
			//this.gridBagConstraintsBien.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBien.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsBien.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarBien, this.gridBagConstraintsBien);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.gridy = iGridyPrincipal++;
		this.gridBagConstraintsBien.gridx = 0;		
		//this.gridBagConstraintsBien.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBien.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsBien.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsBien);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsBien = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsBien.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBien.gridx = 0;		
			this.gridBagConstraintsBien.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBien.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsBien.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasBien, this.gridBagConstraintsBien);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBien.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesBien, this.gridBagConstraintsBien);								
		
		
		/*
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBien.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesBien, this.gridBagConstraintsBien);
		*/		
		
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.gridy =iGridyPrincipal++;
		this.gridBagConstraintsBien.gridx =0;
		this.gridBagConstraintsBien.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsBien.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosBien, this.gridBagConstraintsBien);
				
		
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBien.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionBien, this.gridBagConstraintsBien);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(BienJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosBien= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosBien = new GridBagLayout();
			this.jPanelBusquedasParametrosBien.setLayout(gridaBagLayoutBusquedasParametrosBien);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralBien=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralBien.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBien.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBien.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsBien = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBien.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposBien, this.gridBagConstraintsBien);
			
			
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBien.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosBien, this.gridBagConstraintsBien);
		
			
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsBien.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesBien, this.gridBagConstraintsBien);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralBien;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoBien() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoBien = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoBien = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoBien.setName("jPanelReporteDinamicoBien"); 
		
		this.jPanelReporteDinamicoBien.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoBien.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoBien.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoBien.setLayout(gridaBagLayoutReporteDinamicoBien);
		
		
		this.jInternalFrameReporteDinamicoBien= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoBien = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteBien= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoBien.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoBien.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoBien.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoBien.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoBien.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoBien.setResizable(true);
	    this.jInternalFrameReporteDinamicoBien.setClosable(true);
	    this.jInternalFrameReporteDinamicoBien.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoBien.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoBien.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoBien.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bienes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteBien = new JLabelMe();

		this.jLabelColumnasSelectReporteBien.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBien.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBien.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoBien.add(this.jLabelColumnasSelectReporteBien, this.gridBagConstraintsBien);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteBien = new JList<Reporte>();
		this.jListColumnasSelectReporteBien.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteBien.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteBien.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteBien.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteBien.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteBien=new JScrollPane(this.jListColumnasSelectReporteBien);
			
			this.jScrollColumnasSelectReporteBien.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteBien.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteBien.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteBien.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBien.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBien.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoBien.add(this.jListColumnasSelectReporteBien, this.gridBagConstraintsBien);
		this.jPanelReporteDinamicoBien.add(this.jScrollColumnasSelectReporteBien, this.gridBagConstraintsBien);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteBien = new JLabelMe();

		this.jLabelRelacionesSelectReporteBien.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteBien = new JList<Reporte>();
		this.jListRelacionesSelectReporteBien.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteBien.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteBien.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteBien.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteBien.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteBien=new JScrollPane(this.jListRelacionesSelectReporteBien);
			
			this.jScrollRelacionesSelectReporteBien.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteBien.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteBien.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteBien.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoBien = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoBien = new JComboBoxMe();
		this.jListColumnasValoresGraficoBien = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoBien = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoBien.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoBien.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoBien.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoBien.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoBien, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoBien = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoBien.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoBien.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoBien.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoBien.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoBien, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoBien = new JLabelMe();

		this.jLabelConGraficoDinamicoBien.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBien.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBien.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoBien.add(this.jLabelConGraficoDinamicoBien, this.gridBagConstraintsBien);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoBien = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoBien.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoBien.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoBien.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoBien.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoBien.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBien.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBien.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBien.add(this.jCheckBoxConGraficoDinamicoBien, this.gridBagConstraintsBien);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoBien = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoBien.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBien.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBien.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoBien.add(this.jLabelColumnaCategoriaGraficoBien, this.gridBagConstraintsBien);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoBien = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoBien.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoBien.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoBien.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoBien.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoBien.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBien.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBien.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoBien.add(this.jComboBoxColumnaCategoriaGraficoBien, this.gridBagConstraintsBien);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorBien = new JLabelMe();

		this.jLabelColumnaCategoriaValorBien.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBien.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBien.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBien.add(this.jLabelColumnaCategoriaValorBien, this.gridBagConstraintsBien);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorBien = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorBien.setText("Accion");
        this.jComboBoxColumnaCategoriaValorBien.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorBien.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorBien.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorBien.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBien.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBien.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoBien.add(this.jComboBoxColumnaCategoriaValorBien, this.gridBagConstraintsBien);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoBien = new JLabelMe();

		this.jLabelColumnasValoresGraficoBien.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBien.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBien.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBien.add(this.jLabelColumnasValoresGraficoBien, this.gridBagConstraintsBien);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoBien = new JList<Reporte>();
		this.jListColumnasValoresGraficoBien.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoBien.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoBien.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoBien.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoBien.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoBien=new JScrollPane(this.jListColumnasValoresGraficoBien);
			
			this.jScrollColumnasValoresGraficoBien.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoBien.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoBien.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoBien.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBien.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBien.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoBien.add(this.jListColumnasSelectReporteBien, this.gridBagConstraintsBien);
		this.jPanelReporteDinamicoBien.add(this.jScrollColumnasValoresGraficoBien, this.gridBagConstraintsBien);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoBien = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoBien.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBien.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBien.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBien.add(this.jLabelTiposGraficosReportesDinamicoBien, this.gridBagConstraintsBien);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoBien = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoBien.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoBien.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoBien.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoBien.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoBien.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBien.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBien.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBien.add(this.jComboBoxTiposGraficosReportesDinamicoBien, this.gridBagConstraintsBien);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoBien = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoBien.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBien.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBien.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBien.add(this.jLabelGenerarExcelReporteDinamicoBien, this.gridBagConstraintsBien);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoBien = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoBien.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoBien,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoBien.setToolTipText("Generar EXCEL"+" "+BienConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsBien = new GridBagConstraints();
		//this.gridBagConstraintsBien.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsBien.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsBien.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoBien.add(this.jButtonGenerarExcelReporteDinamicoBien, this.gridBagConstraintsBien);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBien.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBien.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBien.add(this.jComboBoxTiposReportesDinamicoBien, this.gridBagConstraintsBien);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoBien = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoBien.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBien.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBien.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBien.add(this.jLabelTiposArchivoReporteDinamicoBien, this.gridBagConstraintsBien);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBien.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBien.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBien.add(this.jComboBoxTiposArchivosReportesDinamicoBien, this.gridBagConstraintsBien);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoBien = new JButtonMe();
		this.jButtonGenerarReporteDinamicoBien.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoBien,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoBien.setToolTipText("Generar"+" "+BienConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBien.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBien.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBien.add(this.jButtonGenerarReporteDinamicoBien, this.gridBagConstraintsBien);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoBien = new JButtonMe();
		this.jButtonCerrarReporteDinamicoBien.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoBien,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoBien.setToolTipText("Cancelar"+" "+BienConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBien.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBien.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBien.add(this.jButtonCerrarReporteDinamicoBien, this.gridBagConstraintsBien);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalBien = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoBien= new JScrollPane(jPanelReporteDinamicoBien,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoBien.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoBien.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoBien.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bienes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsBien.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsBien.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoBien.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoBien.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalBien);
		this.jInternalFrameReporteDinamicoBien.getContentPane().add(this.jScrollPanelReporteDinamicoBien, this.gridBagConstraintsBien);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionBien() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionBien = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionBien = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionBien.setName("jPanelImportacionBien"); 
		
		this.jPanelImportacionBien.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionBien.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionBien.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionBien.setLayout(gridaBagLayoutImportacionBien);
		
		
		this.jInternalFrameImportacionBien= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionBien= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionBien = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteBien= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionBien.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionBien.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionBien.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionBien.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionBien.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionBien.setResizable(true);
	    this.jInternalFrameImportacionBien.setClosable(true);
	    this.jInternalFrameImportacionBien.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionBien.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionBien.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionBien.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionBien.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionBien.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionBien.setResizable(true);
	    this.jInternalFrameImportacionBien.setClosable(true);
	    this.jInternalFrameImportacionBien.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionBien.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionBien.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionBien.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bienes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionBien = new JLabelMe();

		this.jLabelArchivoImportacionBien.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBien.gridy = iPosYImportacion;		
		this.gridBagConstraintsBien.gridx = iPosXImportacion++;
			
		this.jPanelImportacionBien.add(this.jLabelArchivoImportacionBien, this.gridBagConstraintsBien);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionBien = new JFileChooser();		
		this.jFileChooserImportacionBien.setToolTipText("ESCOGER ARCHIVO"+" "+BienConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionBien = new JButtonMe();
		this.jButtonAbrirImportacionBien.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionBien,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionBien.setToolTipText("Generar"+" "+BienConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBien.gridy = iPosYImportacion;
		this.gridBagConstraintsBien.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBien.add(this.jButtonAbrirImportacionBien, this.gridBagConstraintsBien);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionBien = new JLabelMe();

		this.jLabelPathArchivoImportacionBien.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBien.gridy = iPosYImportacion;		
		this.gridBagConstraintsBien.gridx = iPosXImportacion++;
			
		this.jPanelImportacionBien.add(this.jLabelPathArchivoImportacionBien, this.gridBagConstraintsBien);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionBien=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionBien.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionBien.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionBien.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBien.gridy = iPosYImportacion;
		this.gridBagConstraintsBien.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBien.add(this.jTextFieldPathArchivoImportacionBien, this.gridBagConstraintsBien);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionBien = new JButtonMe();
		this.jButtonGenerarImportacionBien.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionBien,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionBien.setToolTipText("Generar"+" "+BienConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBien.gridy = iPosYImportacion;
		this.gridBagConstraintsBien.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBien.add(this.jButtonGenerarImportacionBien, this.gridBagConstraintsBien);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionBien = new JButtonMe();
		this.jButtonCerrarImportacionBien.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionBien,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionBien.setToolTipText("Cancelar"+" "+BienConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBien.gridy = iPosYImportacion;
		this.gridBagConstraintsBien.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBien.add(this.jButtonCerrarImportacionBien, this.gridBagConstraintsBien);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalBien = new GridBagLayout();
		
		this.jScrollPanelImportacionBien= new JScrollPane(jPanelImportacionBien,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.gridy =iPosYImportacion;
		this.gridBagConstraintsBien.gridx =iPosXImportacion;
		this.gridBagConstraintsBien.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionBien.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionBien.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalBien);
		this.jInternalFrameImportacionBien.getContentPane().add(this.jScrollPanelImportacionBien, this.gridBagConstraintsBien);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByBien(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByBien = new JButtonMe();
			this.jButtonAbrirOrderByBien.setText("Orden");
			this.jButtonAbrirOrderByBien.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByBien,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByBien, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByBien";
			inputMap = this.jButtonAbrirOrderByBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByBien.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByBien"));
		
		
			GridBagLayout gridaBagLayoutOrderByBien = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByBien = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByBien.setName("jPanelOrderByBien"); 
			
			this.jPanelOrderByBien.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByBien.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByBien.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByBien, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByBien.setLayout(gridaBagLayoutOrderByBien);
			
			
			this.jTableDatosBienOrderBy = new JTableMe();        
			this.jTableDatosBienOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosBienOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosBienOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosBienOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosBienOrderBy.setViewportView(this.jTableDatosBienOrderBy);
			this.jTableDatosBienOrderBy.setFillsViewportHeight(true);
			this.jTableDatosBienOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByBien= new OrderByJInternalFrame();
			this.jInternalFrameOrderByBien= new OrderByJInternalFrame();
			this.jScrollPanelOrderByBien = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteBien= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByBien.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByBien.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByBien.setTitle("Orden");
			this.jInternalFrameOrderByBien.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByBien.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByBien.setResizable(true);
			this.jInternalFrameOrderByBien.setClosable(true);
			this.jInternalFrameOrderByBien.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByBien, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByBien.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByBien.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByBien.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByBien, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bienes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.gridy =iPosYOrderBy++;
			this.gridBagConstraintsBien.gridx =iPosXOrderBy;
			this.gridBagConstraintsBien.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsBien.ipady =150;
				
			this.jPanelOrderByBien.add(jScrollPanelDatosBienOrderBy, this.gridBagConstraintsBien);//this.jTableDatosBienTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByBien = new JButtonMe();
			this.jButtonCerrarOrderByBien.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByBien,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByBien.setToolTipText("Cancelar"+" "+BienConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByBien, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBien.gridy = iPosYOrderBy++;
			this.gridBagConstraintsBien.gridx = iPosXOrderBy;
									
			this.jPanelOrderByBien.add(this.jButtonCerrarOrderByBien, this.gridBagConstraintsBien);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalBien = new GridBagLayout();
			
			this.jScrollPanelOrderByBien= new JScrollPane(jPanelOrderByBien,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.gridy =iPosYOrderBy;
			this.gridBagConstraintsBien.gridx =iPosXOrderBy;
			this.gridBagConstraintsBien.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByBien.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByBien.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalBien);
			
			this.jInternalFrameOrderByBien.getContentPane().add(this.jScrollPanelOrderByBien, this.gridBagConstraintsBien);			
		
		} else {
			this.jButtonAbrirOrderByBien = new JButtonMe();
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
		int iWidthTableCalculado=0;//1830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.bienSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosBien.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosBien.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosBien.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosBien.getRowHeight();//BienConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.bienSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > BienConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaBien.isSelected()) {
					iHeightTable=BienConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < BienConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=BienConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > BienConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaBien.isSelected()) {
					iHeightTable=BienConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < BienConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=BienConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosBien.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosBien.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosBien.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosBien.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosBien.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosBien.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByBien!=null && this.jInternalFrameOrderByBien.getjTableDatosOrderBy()!=null) {
			//if(!this.bienSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByBien.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByBien.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByBien.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByBien.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByBien.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByBien.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByBien.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosBien.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosBien.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosBien.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=bienLogic.getBiens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=biens.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Bien> TraerBienBeans(List<Bien> biens,ArrayList<Classe> classes)throws Exception {
		try {
			for(Bien bien:biens) {
					
				if(!(BienConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || BienConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					bien.setsDetalleGeneralEntityReporte(BienConstantesFunciones.getBienDescripcion(bien));
										
					bien.setes_activo_descripcion(BienConstantesFunciones.getes_activoDescripcion(bien));	
					
						
					
				} else  {
							
					//bien.setsDetalleGeneralEntityReporte(bien.getsDetalleGeneralEntityReporte());
										
				}
				
				//bienbeans.add(bienbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return biens;
    }
	//PARA REPORTES FIN
}
