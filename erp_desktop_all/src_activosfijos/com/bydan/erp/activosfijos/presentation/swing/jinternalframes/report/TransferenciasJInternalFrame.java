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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.activosfijos.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.report.*;
import com.bydan.erp.activosfijos.util.report.TransferenciasConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.report.*;
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
public class TransferenciasJInternalFrame extends TransferenciasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTransferencias;
	
	protected JMenuBar jmenuBarTransferencias;
	
	protected JMenu jmenuTransferencias;
	protected JMenu jmenuDatosTransferencias;
	protected JMenu jmenuArchivoTransferencias;
	protected JMenu jmenuAccionesTransferencias;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTransferencias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTransferencias;	
	protected GridBagConstraints gridBagConstraintsTransferencias;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TransferenciasDetalleFormJInternalFrame jInternalFrameDetalleFormTransferencias;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTransferencias;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTransferencias;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TransferenciasSessionBean transferenciasSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Transferencias> transferenciass;		
	public List<Transferencias> transferenciassEliminados;	
	public List<Transferencias> transferenciassAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTransferencias;		
	protected JButton jButtonAbrirOrderByTransferencias;
	
	
	//protected JPanel jPanelOrderByTransferencias;
	//public JScrollPane jScrollPanelOrderByTransferencias;	
	//protected JButton jButtonCerrarOrderByTransferencias;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TransferenciasLogic transferenciasLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTransferencias;
	public JScrollPane jScrollPanelDatosEdicionTransferencias;
	public JScrollPane jScrollPanelDatosGeneralTransferencias;
    
	
	
	//public JScrollPane jScrollPanelDatosTransferenciasOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTransferencias;
	//public JScrollPane jScrollPanelImportacionTransferencias;
	
	
	
	protected JPanel jPanelAccionesTransferencias;
	
    protected JPanel jPanelPaginacionTransferencias;
    protected JPanel jPanelParametrosReportesTransferencias;
	protected JPanel jPanelParametrosReportesAccionesTransferencias;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Transferencias;
	protected JPanel jPanelParametrosAuxiliar2Transferencias;
	protected JPanel jPanelParametrosAuxiliar3Transferencias;
	protected JPanel jPanelParametrosAuxiliar4Transferencias;
	//protected JPanel jPanelParametrosAuxiliar5Transferencias;
	
	
	
	//protected JPanel jPanelReporteDinamicoTransferencias;
	//protected JPanel jPanelImportacionTransferencias;
	
	
	public JTable jTableDatosTransferencias;
	
	
	
	//public JTable jTableDatosTransferenciasOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTransferencias;
	protected JButton jButtonDuplicarTransferencias;
	protected JButton jButtonCopiarTransferencias;
	protected JButton jButtonVerFormTransferencias;
	protected JButton jButtonNuevoRelacionesTransferencias;
	protected JButton jButtonModificarTransferencias;
	
    protected JButton jButtonGuardarCambiosTablaTransferencias;
	protected JButton jButtonCerrarTransferencias;
	
	
	protected JButton jButtonRecargarInformacionTransferencias;
	protected JButton jButtonProcesarInformacionTransferencias;
	
	
	protected JButton jButtonAnterioresTransferencias;
	protected JButton jButtonSiguientesTransferencias;
	protected JButton jButtonNuevoGuardarCambiosTransferencias;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTransferencias;
	//protected JButton jButtonCerrarReporteDinamicoTransferencias;
	//protected JButton jButtonGenerarExcelReporteDinamicoTransferencias;	
	
	
	
	//protected JButton jButtonAbrirImportacionTransferencias;
	//protected JButton jButtonGenerarImportacionTransferencias;
	//protected JButton jButtonCerrarImportacionTransferencias;
	//protected JFileChooser jFileChooserImportacionTransferencias;
	//protected File fileImportacionTransferencias;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTransferencias;
	protected JButton jButtonDuplicarToolBarTransferencias;
	protected JButton jButtonNuevoRelacionesToolBarTransferencias;
	
	
	public JButton jButtonGuardarCambiosToolBarTransferencias;
	protected JButton jButtonCopiarToolBarTransferencias;
	protected JButton jButtonVerFormToolBarTransferencias;
	public JButton jButtonGuardarCambiosTablaToolBarTransferencias;
	protected JButton jButtonMostrarOcultarTablaToolBarTransferencias;
	protected JButton jButtonCerrarToolBarTransferencias;
	
	protected JButton jButtonRecargarInformacionToolBarTransferencias;
	protected JButton jButtonProcesarInformacionToolBarTransferencias;
	protected JButton jButtonAnterioresToolBarTransferencias;
	protected JButton jButtonSiguientesToolBarTransferencias;
	protected JButton jButtonNuevoGuardarCambiosToolBarTransferencias;
	protected JButton jButtonAbrirOrderByToolBarTransferencias;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTransferencias;
	protected JMenuItem jMenuItemDuplicarTransferencias;
	protected JMenuItem jMenuItemNuevoRelacionesTransferencias;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTransferencias;
	protected JMenuItem jMenuItemCopiarTransferencias;
	protected JMenuItem jMenuItemVerFormTransferencias;
	protected JMenuItem jMenuItemGuardarCambiosTablaTransferencias;
	protected JMenuItem jMenuItemCerrarTransferencias;
	protected JMenuItem jMenuItemDetalleCerrarTransferencias;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTransferencias;
	protected JMenuItem jMenuItemDetalleMostarOcultarTransferencias;
	
	protected JMenuItem jMenuItemRecargarInformacionTransferencias;
	protected JMenuItem jMenuItemProcesarInformacionTransferencias;
	protected JMenuItem jMenuItemAnterioresTransferencias;
	protected JMenuItem jMenuItemSiguientesTransferencias;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTransferencias;
	protected JMenuItem jMenuItemAbrirOrderByTransferencias;
	protected JMenuItem jMenuItemMostrarOcultarTransferencias;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTransferencias;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTransferencias;
	protected JCheckBox jCheckBoxSeleccionadosTransferencias;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTransferencias;
	protected JCheckBox jCheckBoxConGraficoReporteTransferencias;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTransferencias;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTransferencias;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTransferencias;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTransferencias;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTransferencias;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTransferencias;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTransferencias;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTransferencias;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTransferencias;
	protected JTextField jTextFieldValorCampoGeneralTransferencias;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTransferencias;
	//public JList<Reporte> jListColumnasSelectReporteTransferencias;
	//public JScrollPane jScrollColumnasSelectReporteTransferencias;
	
	//public JLabel jLabelRelacionesSelectReporteTransferencias;
	//public JList<Reporte> jListRelacionesSelectReporteTransferencias;
	//public JScrollPane jScrollRelacionesSelectReporteTransferencias;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTransferencias;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTransferencias;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTransferencias;
	//public JLabel jLabelTiposArchivoReporteDinamicoTransferencias;
	
		
	//public JLabel jLabelArchivoImportacionTransferencias;	
	//public JLabel jLabelPathArchivoImportacionTransferencias;
	//protected JTextField jTextFieldPathArchivoImportacionTransferencias;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTransferencias;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTransferencias;
	
	//public JLabel jLabelColumnaCategoriaValorTransferencias;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTransferencias;
	
	//public JLabel jLabelColumnasValoresGraficoTransferencias;
	//public JList<Reporte> jListColumnasValoresGraficoTransferencias;
	//public JScrollPane jScrollColumnasValoresGraficoTransferencias;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTransferencias;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTransferencias;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTransferencias;
	public JPanel jPanelBusquedaTransferenciasTransferencias;
	public JButton jButtonBusquedaTransferenciasTransferencias;
	
	public JPanel jPanelIdIdBusquedaTransferenciasTransferencias;
	public JLabel jLabelidBusquedaTransferenciasTransferencias;
	public JTextFieldMe jLabelidTransferenciasBusquedaTransferencias;
	public JButton jButtonidBusquedaTransferenciasTransferenciasBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=1232;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TransferenciasJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Transferencias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransferenciasJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Transferencias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransferenciasJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Transferencias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransferenciasJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Transferencias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTransferencias)	{
		this.jButtonRecargarInformacionTransferencias = jButtonRecargarInformacionTransferencias;
	}
	
	public JButton getjButtonProcesarInformacionTransferencias() {
		return this.jButtonProcesarInformacionTransferencias;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTransferencias)	{
		this.jButtonProcesarInformacionTransferencias = jButtonProcesarInformacionTransferencias;
	}
	
	
	public JButton getjButtonRecargarInformacionTransferencias() {
		return this.jButtonRecargarInformacionTransferencias;
	}
	
	
	public List<Transferencias> gettransferenciass() {
		return this.transferenciass;
	}

	public void settransferenciass(List<Transferencias> transferenciass) {
		this.transferenciass = transferenciass;
	}
	
	public List<Transferencias> gettransferenciassAux() {
		return this.transferenciassAux;
	}

	public void settransferenciassAux(List<Transferencias> transferenciassAux) {
		this.transferenciassAux = transferenciassAux;
	}
	
	public List<Transferencias> gettransferenciassEliminados() {
		return this.transferenciassEliminados;
	}

	public void setTransferenciassEliminados(List<Transferencias> transferenciassEliminados) {
		this.transferenciassEliminados = transferenciassEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTransferencias() {
		return jComboBoxTiposSeleccionarTransferencias;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTransferencias(
			JComboBox jComboBoxTiposSeleccionarTransferencias) {
		this.jComboBoxTiposSeleccionarTransferencias = jComboBoxTiposSeleccionarTransferencias;
	}
	
	public void setBorderResaltarTiposSeleccionarTransferencias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTransferencias.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTransferencias .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTransferencias() {
		return jTextFieldValorCampoGeneralTransferencias;
	}

	public void setjTextFieldValorCampoGeneralTransferencias(
			JTextField jTextFieldValorCampoGeneralTransferencias) {
		this.jTextFieldValorCampoGeneralTransferencias = jTextFieldValorCampoGeneralTransferencias;
	}

	public void setBorderResaltarValorCampoGeneralTransferencias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransferencias.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTransferencias .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTransferencias() {
		return this.jCheckBoxSeleccionarTodosTransferencias;
	}

	public void setjCheckBoxSeleccionarTodosTransferencias(
			JCheckBox jCheckBoxSeleccionarTodosTransferencias) {
		this.jCheckBoxSeleccionarTodosTransferencias = jCheckBoxSeleccionarTodosTransferencias;
	}

	public void setBorderResaltarSeleccionarTodosTransferencias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransferencias.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTransferencias .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTransferencias() {
		return this.jCheckBoxSeleccionadosTransferencias;
	}

	public void setjCheckBoxSeleccionadosTransferencias(
			JCheckBox jCheckBoxSeleccionadosTransferencias) {
		this.jCheckBoxSeleccionadosTransferencias = jCheckBoxSeleccionadosTransferencias;
	}
	
	public void setBorderResaltarSeleccionadosTransferencias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransferencias.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTransferencias .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTransferencias() {
		return this.jComboBoxTiposArchivosReportesTransferencias;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTransferencias(
			JComboBox jComboBoxTiposArchivosReportesTransferencias) {
		this.jComboBoxTiposArchivosReportesTransferencias = jComboBoxTiposArchivosReportesTransferencias;
	}

	public void setBorderResaltarTiposArchivosReportesTransferencias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransferencias.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTransferencias .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTransferencias() {
		return this.jComboBoxTiposReportesTransferencias;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTransferencias(
			JComboBox jComboBoxTiposReportesTransferencias) {
		this.jComboBoxTiposReportesTransferencias = jComboBoxTiposReportesTransferencias;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTransferencias() {
	//	return jComboBoxTiposReportesDinamicoTransferencias;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTransferencias(
	//		JComboBox jComboBoxTiposReportesDinamicoTransferencias) {
	//	this.jComboBoxTiposReportesDinamicoTransferencias = jComboBoxTiposReportesDinamicoTransferencias;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTransferencias() {
	//	return jComboBoxTiposArchivosReportesDinamicoTransferencias;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTransferencias(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTransferencias) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTransferencias = jComboBoxTiposArchivosReportesDinamicoTransferencias;
	//}
	
	public void setBorderResaltarTiposReportesTransferencias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransferencias.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTransferencias .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTransferencias() {
		return this.jComboBoxTiposGraficosReportesTransferencias;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTransferencias(
			JComboBox jComboBoxTiposGraficosReportesTransferencias) {
		this.jComboBoxTiposGraficosReportesTransferencias = jComboBoxTiposGraficosReportesTransferencias;
	}
	
	public void setBorderResaltarTiposGraficosReportesTransferencias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransferencias.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTransferencias .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTransferencias() {
		return this.jComboBoxTiposPaginacionTransferencias;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTransferencias(
			JComboBox jComboBoxTiposPaginacionTransferencias) {
		this.jComboBoxTiposPaginacionTransferencias = jComboBoxTiposPaginacionTransferencias;
	}
	
	public void setBorderResaltarTiposPaginacionTransferencias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransferencias.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTransferencias .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTransferencias() {
		return this.jComboBoxTiposRelacionesTransferencias;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTransferencias() {
		return this.jComboBoxTiposAccionesTransferencias;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTransferencias(
			JComboBox jComboBoxTiposRelacionesTransferencias) {
		this.jComboBoxTiposRelacionesTransferencias = jComboBoxTiposRelacionesTransferencias;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTransferencias(
			JComboBox jComboBoxTiposAccionesTransferencias) {
		this.jComboBoxTiposAccionesTransferencias = jComboBoxTiposAccionesTransferencias;
	}
	
	public void setBorderResaltarTiposRelacionesTransferencias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransferencias.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTransferencias .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTransferencias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransferencias.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTransferencias .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTransferencias() {
	//	return jCheckBoxConGraficoDinamicoTransferencias;
	//}

	//public void setjCheckBoxConGraficoDinamicoTransferencias(
	//		JCheckBox jCheckBoxConGraficoDinamicoTransferencias) {
	//	this.jCheckBoxConGraficoDinamicoTransferencias = jCheckBoxConGraficoDinamicoTransferencias;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTransferencias() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTransferencias.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTransferencias .setBorder(borderResaltar);		
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
		this.transferenciasSessionBean=new TransferenciasSessionBean();
		
		this.transferenciasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.transferenciasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.transferenciasSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TransferenciasJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TransferenciasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TransferenciasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TransferenciasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TransferenciasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Transferencias MANTENIMIENTO"));
		
		
		if(iWidth > 2250) {
			iWidth=2250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.transferenciasSessionBean.getEsGuardarRelacionado()) {
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
		
		TransferenciasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Transferencias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTransferencias= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTransferencias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTransferencias,this.jTtoolBarTransferencias,
							"nuevo","nuevo","Nuevo"+" "+TransferenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTransferencias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTransferencias,this.jTtoolBarTransferencias,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTransferencias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTransferencias,this.jTtoolBarTransferencias,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TransferenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTransferencias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTransferencias,this.jTtoolBarTransferencias,
							"duplicar","duplicar","Duplicar"+" "+TransferenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTransferencias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTransferencias,this.jTtoolBarTransferencias,
							"copiar","copiar","Copiar"+" "+TransferenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTransferencias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTransferencias,this.jTtoolBarTransferencias,
							"ver_form","ver_form","Ver"+" "+TransferenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTransferencias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTransferencias,this.jTtoolBarTransferencias,
							"recargar","recargar","Buscar"+" "+TransferenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarTransferencias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTransferencias,this.jTtoolBarTransferencias,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTransferencias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTransferencias,this.jTtoolBarTransferencias,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTransferencias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTransferencias,this.jTtoolBarTransferencias,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTransferencias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTransferencias,this.jTtoolBarTransferencias,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTransferencias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTransferencias,this.jTtoolBarTransferencias,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TransferenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTransferencias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTransferencias,this.jTtoolBarTransferencias,
							"cerrar","cerrar","Salir"+" "+TransferenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTransferencias=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTransferencias;
			
				this.jButtonProcesarInformacionToolBarTransferencias=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTransferencias;
				
		//protected JButton jButtonModificarToolBarTransferencias;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTransferencias=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTransferencias=new JMenuMe("General");
		this.jmenuArchivoTransferencias=new JMenuMe("Archivo");
		this.jmenuAccionesTransferencias=new JMenuMe("Acciones");
		this.jmenuDatosTransferencias=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTransferencias= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTransferencias.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTransferencias,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTransferencias= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTransferencias.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTransferencias,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTransferencias= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTransferencias.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTransferencias,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTransferencias= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTransferencias.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTransferencias,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTransferencias= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTransferencias.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTransferencias,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTransferencias= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTransferencias.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTransferencias,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTransferencias= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTransferencias.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTransferencias,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTransferencias= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTransferencias.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTransferencias,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTransferencias= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTransferencias.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTransferencias,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTransferencias= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTransferencias.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTransferencias,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTransferencias= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTransferencias.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTransferencias,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTransferencias= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTransferencias.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTransferencias,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTransferencias= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTransferencias.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTransferencias,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTransferencias= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTransferencias.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTransferencias,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTransferencias= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTransferencias.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTransferencias,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTransferencias= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTransferencias.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTransferencias,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTransferencias= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTransferencias.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTransferencias,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTransferencias.add(this.jMenuItemCerrarTransferencias);
			
			this.jmenuAccionesTransferencias.add(this.jMenuItemNuevoTransferencias);
			this.jmenuAccionesTransferencias.add(this.jMenuItemNuevoGuardarCambiosTransferencias);
			this.jmenuAccionesTransferencias.add(this.jMenuItemNuevoRelacionesTransferencias);
			this.jmenuAccionesTransferencias.add(this.jMenuItemGuardarCambiosTablaTransferencias);		
			this.jmenuAccionesTransferencias.add(this.jMenuItemDuplicarTransferencias);		
			this.jmenuAccionesTransferencias.add(this.jMenuItemCopiarTransferencias);		
			this.jmenuAccionesTransferencias.add(this.jMenuItemVerFormTransferencias);		
			
			this.jmenuDatosTransferencias.add(this.jMenuItemRecargarInformacionTransferencias);				
			this.jmenuDatosTransferencias.add(this.jMenuItemAnterioresTransferencias);				
			this.jmenuDatosTransferencias.add(this.jMenuItemSiguientesTransferencias);				
			this.jmenuDatosTransferencias.add(this.jMenuItemAbrirOrderByTransferencias);				
			this.jmenuDatosTransferencias.add(this.jMenuItemMostrarOcultarTransferencias);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTransferencias.add(this.jMenuItemGuardarCambiosTransferencias);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTransferencias.add(this.jmenuArchivoTransferencias);		
			this.jmenuBarTransferencias.add(this.jmenuAccionesTransferencias);		
			this.jmenuBarTransferencias.add(this.jmenuDatosTransferencias);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTransferencias);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTransferencias() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaTransferenciasTransferencias=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaTransferenciasTransferencias.setToolTipText("Buscar Por  ");
		this.jButtonBusquedaTransferenciasTransferencias= new JButtonMe();
		this.jButtonBusquedaTransferenciasTransferencias.setText("Buscar");
		this.jButtonBusquedaTransferenciasTransferencias.setToolTipText("Buscar Por  ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaTransferenciasTransferencias,"buscar_button","Buscar Por  ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaTransferenciasTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);;
			jLabelidBusquedaTransferenciasTransferencias = new JLabelMe();
		jLabelidBusquedaTransferenciasTransferencias.setText("Id :");
		jLabelidBusquedaTransferenciasTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-9),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaTransferenciasTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-9),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaTransferenciasTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-9),Constantes.ISWING_ALTO_CONTROL));

		FuncionesSwing.setBoldLabel(jLabelidBusquedaTransferenciasTransferencias,STIPO_TAMANIO_GENERAL,false,true,this);

		jLabelidTransferenciasBusquedaTransferencias= new JTextFieldMe();
		jLabelidTransferenciasBusquedaTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTransferenciasBusquedaTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTransferenciasBusquedaTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));


		//SE OCULTA CAMPO ID AUXILIAR PARA REPORTE
		jLabelidTransferenciasBusquedaTransferencias.setVisible(false);




		this.jTabbedPaneBusquedasTransferencias=new JTabbedPane();


		this.jTabbedPaneBusquedasTransferencias.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasTransferencias.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasTransferencias.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasTransferencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTransferencias.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTransferencias,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTransferencias = new TransferenciasDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Transferencias DATOS");
			this.jInternalFrameDetalleFormTransferencias = new TransferenciasDetalleFormJInternalFrame(jDesktopPane,this.transferenciasSessionBean.getConGuardarRelaciones(),this.transferenciasSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTransferencias = null;//new TransferenciasDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTransferencias= new GridBagLayout();
		
		
		this.jTableDatosTransferencias = new JTableMe();      
		
		String sToolTipTransferencias="";
		sToolTipTransferencias=TransferenciasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTransferencias+="(ActivosFijos.Transferencias)";
		}
		
		if(!this.transferenciasSessionBean.getEsGuardarRelacionado()) {
			sToolTipTransferencias+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTransferencias.setToolTipText(sToolTipTransferencias);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTransferencias);
		this.jTableDatosTransferencias.setAutoCreateRowSorter(true);
		this.jTableDatosTransferencias.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTransferencias.setRowSelectionAllowed(true);
		this.jTableDatosTransferencias.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTransferencias,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTransferencias = new JButtonMe();
		this.jButtonDuplicarTransferencias = new JButtonMe();
		this.jButtonCopiarTransferencias = new JButtonMe();
		this.jButtonVerFormTransferencias = new JButtonMe();
		this.jButtonNuevoRelacionesTransferencias = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTransferencias = new JButtonMe();
		this.jButtonCerrarTransferencias = new JButtonMe();
		
		this.jScrollPanelDatosTransferencias = new JScrollPane();   
        this.jScrollPanelDatosGeneralTransferencias = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTransferencias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Transferencias";
		
		if(!this.transferenciasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTransferencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transferenciases" + this.sPath));
		} else {
			this.jScrollPanelDatosTransferencias.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTransferencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTransferencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTransferencias.setToolTipText("Acciones");
        this.jPanelAccionesTransferencias.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTransferencias, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTransferencias, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTransferencias=new ReporteDinamicoJInternalFrame(TransferenciasConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTransferencias();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTransferencias=new ImportacionJInternalFrame(TransferenciasConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTransferencias();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTransferencias = new JButtonMe();
		
		this.jButtonAbrirOrderByTransferencias.setText("Orden");
		this.jButtonAbrirOrderByTransferencias.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTransferencias,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTransferencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTransferencias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTransferencias=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransferencias,false,this);
			
			//this.cargarOrderByTransferencias(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTransferencias=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransferencias,true,this);
			
			//this.cargarOrderByTransferencias(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTransferencias.setMinimumSize(new Dimension(400,50));//2230
		this.jTableDatosTransferencias.setMaximumSize(new Dimension(400,50));//2230
		this.jTableDatosTransferencias.setPreferredSize(new Dimension(400,50));//2230
		
		this.jScrollPanelDatosTransferencias.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTransferencias.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTransferencias.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTransferencias.setText("Nuevo");
		this.jButtonDuplicarTransferencias.setText("Duplicar");
		this.jButtonCopiarTransferencias.setText("Copiar");
		this.jButtonVerFormTransferencias.setText("Ver");
		this.jButtonNuevoRelacionesTransferencias.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTransferencias.setText("Guardar");
		this.jButtonCerrarTransferencias.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTransferencias,"nuevo_button","Nuevo",this.transferenciasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTransferencias,"duplicar_button","Duplicar",this.transferenciasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTransferencias,"copiar_button","Copiar",this.transferenciasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTransferencias,"ver_form","Ver",this.transferenciasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTransferencias,"nuevorelaciones_button","Nuevo Rel",this.transferenciasSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTransferencias,"guardarcambiostabla_button","Guardar",this.transferenciasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTransferencias,"cerrar_button","Salir",this.transferenciasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTransferencias.setToolTipText("Nuevo"+" "+TransferenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTransferencias.setToolTipText("Duplicar"+" "+TransferenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTransferencias.setToolTipText("Copiar"+" "+TransferenciasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTransferencias.setToolTipText("Ver"+" "+TransferenciasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTransferencias.setToolTipText("Nuevo Rel"+" "+TransferenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTransferencias.setToolTipText("Guardar"+" "+TransferenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTransferencias.setToolTipText("Salir"+" "+TransferenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTransferencias";
		inputMap = this.jButtonNuevoTransferencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTransferencias.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTransferencias"));
		
		//DUPLICAR
		sMapKey = "DuplicarTransferencias";
		inputMap = this.jButtonDuplicarTransferencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTransferencias.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTransferencias"));
		
		//COPIAR
		sMapKey = "CopiarTransferencias";
		inputMap = this.jButtonCopiarTransferencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTransferencias.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTransferencias"));
		
		//VEr FORM
		sMapKey = "VerFormTransferencias";
		inputMap = this.jButtonVerFormTransferencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTransferencias.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTransferencias"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTransferencias";
		inputMap = this.jButtonNuevoRelacionesTransferencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTransferencias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTransferencias"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTransferencias";
		inputMap = this.jButtonModificarTransferencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTransferencias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTransferencias"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTransferencias";
		inputMap = this.jButtonCerrarTransferencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTransferencias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTransferencias"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTransferencias";
		inputMap = this.jButtonGuardarCambiosTablaTransferencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTransferencias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTransferencias"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTransferencias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTransferencias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTransferencias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Transferencias= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Transferencias= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Transferencias= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Transferencias= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Transferencias= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTransferencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTransferencias.setName("jPanelParametrosReportesTransferencias"); 
		
		this.jPanelParametrosReportesAccionesTransferencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTransferencias.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTransferencias.setName("jPanelParametrosReportesAccionesTransferencias"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTransferencias, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTransferencias, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTransferencias = new JButtonMe();
		this.jButtonRecargarInformacionTransferencias.setText("Buscar");
		this.jButtonRecargarInformacionTransferencias.setToolTipText("Buscar"+" "+TransferenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTransferencias,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionTransferencias.setVisible(false);
		
		
		this.jButtonProcesarInformacionTransferencias = new JButtonMe();
		this.jButtonProcesarInformacionTransferencias.setText("Procesar");
		this.jButtonProcesarInformacionTransferencias.setToolTipText("Procesar"+" "+TransferenciasConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTransferencias.setVisible(false);
			
		this.jButtonProcesarInformacionTransferencias.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTransferencias.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTransferencias.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTransferencias = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTransferencias.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTransferencias.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTransferencias = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTransferencias.setText("TIPO");       
		this.jComboBoxTiposReportesTransferencias.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTransferencias = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTransferencias.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTransferencias.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTransferencias = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTransferencias.setText("Paginacion");
		this.jComboBoxTiposPaginacionTransferencias.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTransferencias = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTransferencias.setText("Accion");
		this.jComboBoxTiposRelacionesTransferencias.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTransferencias = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTransferencias.setText("Accion");
		this.jComboBoxTiposAccionesTransferencias.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTransferencias = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTransferencias.setText("Accion");
		this.jComboBoxTiposSeleccionarTransferencias.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTransferencias=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTransferencias.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTransferencias.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTransferencias.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTransferencias = new JLabelMe();
		
		this.jLabelAccionesTransferencias.setText("Acciones");		
		this.jLabelAccionesTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTransferencias = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTransferencias.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTransferencias.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTransferencias = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTransferencias.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTransferencias.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTransferencias = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTransferencias.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTransferencias.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTransferencias = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTransferencias.setText("Graf.");
		this.jCheckBoxConGraficoReporteTransferencias.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTransferencias = new JButtonMe();
		//this.jButtonAnterioresTransferencias.setText("<<");
        this.jButtonAnterioresTransferencias.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTransferencias,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTransferencias = new JButtonMe();
		//this.jButtonSiguientesTransferencias.setText(">>");
        this.jButtonSiguientesTransferencias.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTransferencias,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTransferencias = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTransferencias.setText("Nue");
        this.jButtonNuevoGuardarCambiosTransferencias.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTransferencias,"nuevoguardarcambios_button","Nue",this.transferenciasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTransferencias";
		inputMap = this.jButtonNuevoGuardarCambiosTransferencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTransferencias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTransferencias"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTransferencias";
		inputMap = this.jButtonRecargarInformacionTransferencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTransferencias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTransferencias"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTransferencias";
		inputMap = this.jButtonSiguientesTransferencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTransferencias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTransferencias"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTransferencias";
		inputMap = this.jButtonAnterioresTransferencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTransferencias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTransferencias"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTransferencias();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTransferencias.setMinimumSize(new Dimension(this.getWidth(),TransferenciasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TransferenciasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTransferencias.setMaximumSize(new Dimension(this.getWidth(),TransferenciasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TransferenciasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTransferencias.setPreferredSize(new Dimension(this.getWidth(),TransferenciasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TransferenciasBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTransferencias = new GridBagLayout();

			this.jPanelPaginacionTransferencias.setLayout(gridaBagLayoutPaginacionTransferencias);						
			
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTransferencias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferencias.gridy = 0;
			this.gridBagConstraintsTransferencias.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTransferencias.add(this.jButtonAnterioresTransferencias, this.gridBagConstraintsTransferencias);
					
						
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			this.gridBagConstraintsTransferencias.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTransferencias.gridy = 0;
			
			this.jPanelPaginacionTransferencias.add(this.jButtonNuevoGuardarCambiosTransferencias, this.gridBagConstraintsTransferencias);
						
			
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTransferencias.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTransferencias.gridy = 0;
			this.jPanelPaginacionTransferencias.add(this.jButtonSiguientesTransferencias, this.gridBagConstraintsTransferencias);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			this.gridBagConstraintsTransferencias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferencias.gridy = 1;
			this.gridBagConstraintsTransferencias.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransferencias.add(this.jButtonNuevoTransferencias, this.gridBagConstraintsTransferencias);
						
			
			
			if(!this.transferenciasSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTransferencias = new GridBagConstraints();
				this.gridBagConstraintsTransferencias.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTransferencias.gridy = 1;
				this.gridBagConstraintsTransferencias.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTransferencias.add(this.jButtonGuardarCambiosTablaTransferencias, this.gridBagConstraintsTransferencias);
			}
			
			
			
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			this.gridBagConstraintsTransferencias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferencias.gridy = 1;
			this.gridBagConstraintsTransferencias.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransferencias.add(this.jButtonDuplicarTransferencias, this.gridBagConstraintsTransferencias);
			
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			this.gridBagConstraintsTransferencias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferencias.gridy = 1;
			this.gridBagConstraintsTransferencias.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransferencias.add(this.jButtonCopiarTransferencias, this.gridBagConstraintsTransferencias);
		
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			this.gridBagConstraintsTransferencias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferencias.gridy = 1;
			this.gridBagConstraintsTransferencias.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransferencias.add(this.jButtonVerFormTransferencias, this.gridBagConstraintsTransferencias);
		
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			this.gridBagConstraintsTransferencias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferencias.gridy = 1;
			this.gridBagConstraintsTransferencias.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTransferencias.add(this.jButtonCerrarTransferencias, this.gridBagConstraintsTransferencias);
		
		
		
		this.jButtonRecargarInformacionTransferencias.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTransferencias.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTransferencias.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTransferencias.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTransferencias.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTransferencias.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTransferencias.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTransferencias.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTransferencias.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTransferencias.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTransferencias.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTransferencias.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTransferencias.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTransferencias.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTransferencias.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTransferencias.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTransferencias.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTransferencias.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTransferencias.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransferencias.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransferencias.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTransferencias.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTransferencias.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTransferencias.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTransferencias.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTransferencias.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTransferencias.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTransferencias.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTransferencias.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTransferencias.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTransferencias.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTransferencias.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTransferencias.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTransferencias.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTransferencias.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTransferencias.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTransferencias = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTransferencias = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Transferencias = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Transferencias = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Transferencias = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Transferencias = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTransferencias.setLayout(gridaBagParametrosReportesTransferencias);
			this.jPanelParametrosReportesAccionesTransferencias.setLayout(gridaBagParametrosReportesAccionesTransferencias);
			
			
			this.jPanelParametrosAuxiliar1Transferencias.setLayout(gridaBagParametrosAuxiliar1Transferencias);
			this.jPanelParametrosAuxiliar2Transferencias.setLayout(gridaBagParametrosAuxiliar2Transferencias);
			this.jPanelParametrosAuxiliar3Transferencias.setLayout(gridaBagParametrosAuxiliar3Transferencias);
			this.jPanelParametrosAuxiliar4Transferencias.setLayout(gridaBagParametrosAuxiliar4Transferencias);
			//this.jPanelParametrosAuxiliar5Transferencias.setLayout(gridaBagParametrosAuxiliar2Transferencias);			
			
			
			
			
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			this.gridBagConstraintsTransferencias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferencias.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransferencias.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransferencias.add(this.jButtonRecargarInformacionTransferencias, this.gridBagConstraintsTransferencias);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferencias.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransferencias.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Transferencias.add(this.jComboBoxTiposPaginacionTransferencias, this.gridBagConstraintsTransferencias);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferencias.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransferencias.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Transferencias.add(this.jCheckBoxConAltoMaximoTablaTransferencias, this.gridBagConstraintsTransferencias);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferencias.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransferencias.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Transferencias.add(this.jComboBoxTiposArchivosReportesTransferencias, this.gridBagConstraintsTransferencias);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferencias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransferencias.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransferencias.add(this.jPanelParametrosAuxiliar1Transferencias, this.gridBagConstraintsTransferencias);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferencias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferencias.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransferencias.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Transferencias.add(this.jComboBoxTiposReportesTransferencias, this.gridBagConstraintsTransferencias);																		
			
			
			
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferencias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferencias.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransferencias.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4Transferencias.add(this.jComboBoxTiposGraficosReportesTransferencias, this.gridBagConstraintsTransferencias);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferencias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransferencias.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransferencias.add(this.jPanelParametrosAuxiliar4Transferencias, this.gridBagConstraintsTransferencias);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferencias.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransferencias.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransferencias.add(this.jComboBoxTiposReportesTransferencias, this.gridBagConstraintsTransferencias);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferencias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransferencias.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransferencias.add(this.jCheckBoxGenerarReporteTransferencias, this.gridBagConstraintsTransferencias);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferencias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransferencias.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransferencias.add(this.jPanelParametrosAuxiliar2Transferencias, this.gridBagConstraintsTransferencias);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			this.gridBagConstraintsTransferencias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferencias.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransferencias.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransferencias.add(this.jLabelAccionesTransferencias, this.gridBagConstraintsTransferencias);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTransferencias = new GridBagConstraints();
				this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTransferencias.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTransferencias.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTransferencias.add(this.jButtonAbrirOrderByTransferencias, this.gridBagConstraintsTransferencias);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTransferencias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransferencias.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransferencias.add(this.jComboBoxTiposSeleccionarTransferencias, this.gridBagConstraintsTransferencias);			
			
			
			/*
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			this.gridBagConstraintsTransferencias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferencias.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransferencias.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransferencias.add(this.jCheckBoxSeleccionarTodosTransferencias, this.gridBagConstraintsTransferencias);
			
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			this.gridBagConstraintsTransferencias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferencias.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransferencias.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransferencias.add(this.jCheckBoxConGraficoReporteTransferencias, this.gridBagConstraintsTransferencias);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferencias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferencias.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransferencias.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Transferencias.add(this.jCheckBoxSeleccionarTodosTransferencias, this.gridBagConstraintsTransferencias);															
				
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferencias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferencias.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransferencias.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Transferencias.add(this.jCheckBoxSeleccionadosTransferencias, this.gridBagConstraintsTransferencias);															
			
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferencias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferencias.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransferencias.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Transferencias.add(this.jCheckBoxConGraficoReporteTransferencias, this.gridBagConstraintsTransferencias);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferencias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransferencias.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransferencias.add(this.jPanelParametrosAuxiliar3Transferencias, this.gridBagConstraintsTransferencias);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			this.gridBagConstraintsTransferencias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransferencias.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransferencias.add(this.jComboBoxTiposAccionesTransferencias, this.gridBagConstraintsTransferencias);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTransferencias = new GridBagLayout();

			this.jScrollPanelDatosTransferencias.setLayout(gridaBagLayoutDatosTransferencias);
			
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			this.gridBagConstraintsTransferencias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferencias.gridy = 0;
			this.gridBagConstraintsTransferencias.gridx = 0;
			
			this.jScrollPanelDatosTransferencias.add(this.jTableDatosTransferencias, this.gridBagConstraintsTransferencias);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTransferencias.setViewportView(this.jTableDatosTransferencias);
		this.jTableDatosTransferencias.setFillsViewportHeight(true);
		this.jTableDatosTransferencias.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTransferencias= new GridBagLayout();
		this.jPanelAccionesTransferencias.setLayout(gridaBagLayoutAccionesTransferencias);
		
		
		/*	
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransferencias.gridy = 0;
		this.gridBagConstraintsTransferencias.gridx = 0;
			
		this.jPanelAccionesTransferencias.add(this.jButtonNuevoTransferencias, this.gridBagConstraintsTransferencias);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaTransferenciasTransferencias= new GridBagLayout();
		gridaBagLayoutBusquedaTransferenciasTransferencias.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaTransferenciasTransferencias.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaTransferenciasTransferencias.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaTransferenciasTransferencias.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaTransferenciasTransferencias.setLayout(gridaBagLayoutBusquedaTransferenciasTransferencias);

		gridBagConstraintsTransferencias = new GridBagConstraints();
		gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransferencias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransferencias.gridy = 0;
		gridBagConstraintsTransferencias.gridx = 0;
		jPanelBusquedaTransferenciasTransferencias.add(jLabelidBusquedaTransferenciasTransferencias, gridBagConstraintsTransferencias);

		gridBagConstraintsTransferencias = new GridBagConstraints();
		gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransferencias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransferencias.gridy = 0;
		gridBagConstraintsTransferencias.gridx = 1;
		jPanelBusquedaTransferenciasTransferencias.add(jLabelidTransferenciasBusquedaTransferencias, gridBagConstraintsTransferencias);

		gridBagConstraintsTransferencias = new GridBagConstraints();
		gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransferencias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransferencias.gridy = 1;
		gridBagConstraintsTransferencias.gridx =1;
		jPanelBusquedaTransferenciasTransferencias.add(jButtonBusquedaTransferenciasTransferencias, gridBagConstraintsTransferencias);

		jTabbedPaneBusquedasTransferencias.addTab("1.-Por  ", jPanelBusquedaTransferenciasTransferencias);
		jTabbedPaneBusquedasTransferencias.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTransferencias = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTransferencias);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.transferenciasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTransferencias = new GridBagConstraints();						
			this.gridBagConstraintsTransferencias.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTransferencias.gridx = 0;		
			//this.gridBagConstraintsTransferencias.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTransferencias.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTransferencias, this.gridBagConstraintsTransferencias);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTransferencias.gridx = 0;		
		//this.gridBagConstraintsTransferencias.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTransferencias.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTransferencias);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTransferencias.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTransferencias.gridx = 0;		
			this.gridBagConstraintsTransferencias.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTransferencias.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTransferencias, this.gridBagConstraintsTransferencias);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransferencias.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTransferencias, this.gridBagConstraintsTransferencias);								
		
		
		/*
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransferencias.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTransferencias, this.gridBagConstraintsTransferencias);
		*/		
		
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTransferencias.gridx =0;
		this.gridBagConstraintsTransferencias.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTransferencias.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTransferencias, this.gridBagConstraintsTransferencias);
				
		
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransferencias.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTransferencias, this.gridBagConstraintsTransferencias);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TransferenciasJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTransferencias= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTransferencias = new GridBagLayout();
			this.jPanelBusquedasParametrosTransferencias.setLayout(gridaBagLayoutBusquedasParametrosTransferencias);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTransferencias=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTransferencias.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransferencias.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransferencias.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransferencias.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTransferencias, this.gridBagConstraintsTransferencias);
			
			
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransferencias.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTransferencias, this.gridBagConstraintsTransferencias);
		
			
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTransferencias.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTransferencias, this.gridBagConstraintsTransferencias);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTransferencias;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTransferencias() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTransferencias = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTransferencias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTransferencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTransferencias.setName("jPanelReporteDinamicoTransferencias"); 
		
		this.jPanelReporteDinamicoTransferencias.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTransferencias.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTransferencias.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTransferencias.setLayout(gridaBagLayoutReporteDinamicoTransferencias);
		
		
		this.jInternalFrameReporteDinamicoTransferencias= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTransferencias = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTransferencias= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTransferencias.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTransferencias.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTransferencias.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTransferencias.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTransferencias.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTransferencias.setResizable(true);
	    this.jInternalFrameReporteDinamicoTransferencias.setClosable(true);
	    this.jInternalFrameReporteDinamicoTransferencias.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTransferencias.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTransferencias.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTransferencias.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTransferencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transferenciases"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTransferencias = new JLabelMe();

		this.jLabelColumnasSelectReporteTransferencias.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferencias.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTransferencias.add(this.jLabelColumnasSelectReporteTransferencias, this.gridBagConstraintsTransferencias);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTransferencias = new JList<Reporte>();
		this.jListColumnasSelectReporteTransferencias.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTransferencias.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTransferencias.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTransferencias.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTransferencias.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTransferencias=new JScrollPane(this.jListColumnasSelectReporteTransferencias);
			
			this.jScrollColumnasSelectReporteTransferencias.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTransferencias.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTransferencias.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTransferencias.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferencias.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTransferencias.add(this.jListColumnasSelectReporteTransferencias, this.gridBagConstraintsTransferencias);
		this.jPanelReporteDinamicoTransferencias.add(this.jScrollColumnasSelectReporteTransferencias, this.gridBagConstraintsTransferencias);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTransferencias = new JLabelMe();

		this.jLabelRelacionesSelectReporteTransferencias.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTransferencias = new JList<Reporte>();
		this.jListRelacionesSelectReporteTransferencias.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTransferencias.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTransferencias.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTransferencias.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTransferencias.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTransferencias=new JScrollPane(this.jListRelacionesSelectReporteTransferencias);
			
			this.jScrollRelacionesSelectReporteTransferencias.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTransferencias.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTransferencias.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTransferencias.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTransferencias = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTransferencias = new JComboBoxMe();
		this.jListColumnasValoresGraficoTransferencias = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTransferencias = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTransferencias.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTransferencias.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTransferencias.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTransferencias.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTransferencias = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTransferencias.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTransferencias.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTransferencias.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTransferencias.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoTransferencias = new JLabelMe();

		this.jLabelConGraficoDinamicoTransferencias.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferencias.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTransferencias.add(this.jLabelConGraficoDinamicoTransferencias, this.gridBagConstraintsTransferencias);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoTransferencias = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoTransferencias.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoTransferencias.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoTransferencias.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTransferencias.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTransferencias.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferencias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransferencias.add(this.jCheckBoxConGraficoDinamicoTransferencias, this.gridBagConstraintsTransferencias);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoTransferencias = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoTransferencias.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferencias.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTransferencias.add(this.jLabelColumnaCategoriaGraficoTransferencias, this.gridBagConstraintsTransferencias);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoTransferencias = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTransferencias.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoTransferencias.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoTransferencias.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTransferencias.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTransferencias.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferencias.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoTransferencias.add(this.jComboBoxColumnaCategoriaGraficoTransferencias, this.gridBagConstraintsTransferencias);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorTransferencias = new JLabelMe();

		this.jLabelColumnaCategoriaValorTransferencias.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferencias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransferencias.add(this.jLabelColumnaCategoriaValorTransferencias, this.gridBagConstraintsTransferencias);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorTransferencias = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorTransferencias.setText("Accion");
        this.jComboBoxColumnaCategoriaValorTransferencias.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorTransferencias.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTransferencias.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTransferencias.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferencias.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoTransferencias.add(this.jComboBoxColumnaCategoriaValorTransferencias, this.gridBagConstraintsTransferencias);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoTransferencias = new JLabelMe();

		this.jLabelColumnasValoresGraficoTransferencias.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferencias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransferencias.add(this.jLabelColumnasValoresGraficoTransferencias, this.gridBagConstraintsTransferencias);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoTransferencias = new JList<Reporte>();
		this.jListColumnasValoresGraficoTransferencias.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoTransferencias.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoTransferencias.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTransferencias.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTransferencias.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoTransferencias=new JScrollPane(this.jListColumnasValoresGraficoTransferencias);
			
			this.jScrollColumnasValoresGraficoTransferencias.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTransferencias.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTransferencias.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoTransferencias.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferencias.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoTransferencias.add(this.jListColumnasSelectReporteTransferencias, this.gridBagConstraintsTransferencias);
		this.jPanelReporteDinamicoTransferencias.add(this.jScrollColumnasValoresGraficoTransferencias, this.gridBagConstraintsTransferencias);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoTransferencias = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoTransferencias.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferencias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransferencias.add(this.jLabelTiposGraficosReportesDinamicoTransferencias, this.gridBagConstraintsTransferencias);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoTransferencias = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTransferencias.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoTransferencias.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoTransferencias.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTransferencias.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTransferencias.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferencias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransferencias.add(this.jComboBoxTiposGraficosReportesDinamicoTransferencias, this.gridBagConstraintsTransferencias);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTransferencias = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTransferencias.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferencias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransferencias.add(this.jLabelGenerarExcelReporteDinamicoTransferencias, this.gridBagConstraintsTransferencias);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTransferencias = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTransferencias.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTransferencias,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTransferencias.setToolTipText("Generar EXCEL"+" "+TransferenciasConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTransferencias = new GridBagConstraints();
		//this.gridBagConstraintsTransferencias.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTransferencias.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTransferencias.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTransferencias.add(this.jButtonGenerarExcelReporteDinamicoTransferencias, this.gridBagConstraintsTransferencias);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransferencias.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransferencias.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransferencias.add(this.jComboBoxTiposReportesDinamicoTransferencias, this.gridBagConstraintsTransferencias);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTransferencias = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTransferencias.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferencias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransferencias.add(this.jLabelTiposArchivoReporteDinamicoTransferencias, this.gridBagConstraintsTransferencias);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransferencias.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransferencias.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransferencias.add(this.jComboBoxTiposArchivosReportesDinamicoTransferencias, this.gridBagConstraintsTransferencias);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTransferencias = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTransferencias.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTransferencias,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTransferencias.setToolTipText("Generar"+" "+TransferenciasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransferencias.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransferencias.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransferencias.add(this.jButtonGenerarReporteDinamicoTransferencias, this.gridBagConstraintsTransferencias);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTransferencias = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTransferencias.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTransferencias,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTransferencias.setToolTipText("Cancelar"+" "+TransferenciasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransferencias.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransferencias.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransferencias.add(this.jButtonCerrarReporteDinamicoTransferencias, this.gridBagConstraintsTransferencias);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTransferencias = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTransferencias= new JScrollPane(jPanelReporteDinamicoTransferencias,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTransferencias.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTransferencias.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTransferencias.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTransferencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transferenciases"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTransferencias.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTransferencias.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTransferencias.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTransferencias.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTransferencias);
		this.jInternalFrameReporteDinamicoTransferencias.getContentPane().add(this.jScrollPanelReporteDinamicoTransferencias, this.gridBagConstraintsTransferencias);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTransferencias() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTransferencias = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTransferencias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTransferencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTransferencias.setName("jPanelImportacionTransferencias"); 
		
		this.jPanelImportacionTransferencias.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTransferencias.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTransferencias.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTransferencias.setLayout(gridaBagLayoutImportacionTransferencias);
		
		
		this.jInternalFrameImportacionTransferencias= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTransferencias= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTransferencias = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTransferencias= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTransferencias.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTransferencias.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTransferencias.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTransferencias.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTransferencias.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTransferencias.setResizable(true);
	    this.jInternalFrameImportacionTransferencias.setClosable(true);
	    this.jInternalFrameImportacionTransferencias.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTransferencias.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTransferencias.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTransferencias.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTransferencias.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTransferencias.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTransferencias.setResizable(true);
	    this.jInternalFrameImportacionTransferencias.setClosable(true);
	    this.jInternalFrameImportacionTransferencias.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTransferencias.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTransferencias.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTransferencias.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTransferencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transferenciases"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTransferencias = new JLabelMe();

		this.jLabelArchivoImportacionTransferencias.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = iPosYImportacion;		
		this.gridBagConstraintsTransferencias.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTransferencias.add(this.jLabelArchivoImportacionTransferencias, this.gridBagConstraintsTransferencias);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTransferencias = new JFileChooser();		
		this.jFileChooserImportacionTransferencias.setToolTipText("ESCOGER ARCHIVO"+" "+TransferenciasConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTransferencias = new JButtonMe();
		this.jButtonAbrirImportacionTransferencias.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTransferencias,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTransferencias.setToolTipText("Generar"+" "+TransferenciasConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransferencias.gridy = iPosYImportacion;
		this.gridBagConstraintsTransferencias.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransferencias.add(this.jButtonAbrirImportacionTransferencias, this.gridBagConstraintsTransferencias);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTransferencias = new JLabelMe();

		this.jLabelPathArchivoImportacionTransferencias.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = iPosYImportacion;		
		this.gridBagConstraintsTransferencias.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTransferencias.add(this.jLabelPathArchivoImportacionTransferencias, this.gridBagConstraintsTransferencias);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTransferencias=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTransferencias.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTransferencias.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTransferencias.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransferencias.gridy = iPosYImportacion;
		this.gridBagConstraintsTransferencias.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransferencias.add(this.jTextFieldPathArchivoImportacionTransferencias, this.gridBagConstraintsTransferencias);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTransferencias = new JButtonMe();
		this.jButtonGenerarImportacionTransferencias.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTransferencias,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTransferencias.setToolTipText("Generar"+" "+TransferenciasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransferencias.gridy = iPosYImportacion;
		this.gridBagConstraintsTransferencias.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransferencias.add(this.jButtonGenerarImportacionTransferencias, this.gridBagConstraintsTransferencias);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTransferencias = new JButtonMe();
		this.jButtonCerrarImportacionTransferencias.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTransferencias,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTransferencias.setToolTipText("Cancelar"+" "+TransferenciasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransferencias.gridy = iPosYImportacion;
		this.gridBagConstraintsTransferencias.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransferencias.add(this.jButtonCerrarImportacionTransferencias, this.gridBagConstraintsTransferencias);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTransferencias = new GridBagLayout();
		
		this.jScrollPanelImportacionTransferencias= new JScrollPane(jPanelImportacionTransferencias,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.gridy =iPosYImportacion;
		this.gridBagConstraintsTransferencias.gridx =iPosXImportacion;
		this.gridBagConstraintsTransferencias.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTransferencias.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTransferencias.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTransferencias);
		this.jInternalFrameImportacionTransferencias.getContentPane().add(this.jScrollPanelImportacionTransferencias, this.gridBagConstraintsTransferencias);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTransferencias(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTransferencias = new JButtonMe();
			this.jButtonAbrirOrderByTransferencias.setText("Orden");
			this.jButtonAbrirOrderByTransferencias.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTransferencias,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTransferencias";
			inputMap = this.jButtonAbrirOrderByTransferencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTransferencias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTransferencias"));
		
		
			GridBagLayout gridaBagLayoutOrderByTransferencias = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTransferencias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTransferencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTransferencias.setName("jPanelOrderByTransferencias"); 
			
			this.jPanelOrderByTransferencias.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTransferencias.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTransferencias.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTransferencias.setLayout(gridaBagLayoutOrderByTransferencias);
			
			
			this.jTableDatosTransferenciasOrderBy = new JTableMe();        
			this.jTableDatosTransferenciasOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTransferenciasOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTransferenciasOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTransferenciasOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTransferenciasOrderBy.setViewportView(this.jTableDatosTransferenciasOrderBy);
			this.jTableDatosTransferenciasOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTransferenciasOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTransferencias= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTransferencias= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTransferencias = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTransferencias= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTransferencias.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTransferencias.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTransferencias.setTitle("Orden");
			this.jInternalFrameOrderByTransferencias.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTransferencias.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTransferencias.setResizable(true);
			this.jInternalFrameOrderByTransferencias.setClosable(true);
			this.jInternalFrameOrderByTransferencias.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTransferencias.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTransferencias.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTransferencias.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTransferencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transferenciases"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			this.gridBagConstraintsTransferencias.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTransferencias.gridx =iPosXOrderBy;
			this.gridBagConstraintsTransferencias.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTransferencias.ipady =150;
				
			this.jPanelOrderByTransferencias.add(jScrollPanelDatosTransferenciasOrderBy, this.gridBagConstraintsTransferencias);//this.jTableDatosTransferenciasTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTransferencias = new JButtonMe();
			this.jButtonCerrarOrderByTransferencias.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTransferencias,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTransferencias.setToolTipText("Cancelar"+" "+TransferenciasConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			this.gridBagConstraintsTransferencias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferencias.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTransferencias.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTransferencias.add(this.jButtonCerrarOrderByTransferencias, this.gridBagConstraintsTransferencias);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTransferencias = new GridBagLayout();
			
			this.jScrollPanelOrderByTransferencias= new JScrollPane(jPanelOrderByTransferencias,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			this.gridBagConstraintsTransferencias.gridy =iPosYOrderBy;
			this.gridBagConstraintsTransferencias.gridx =iPosXOrderBy;
			this.gridBagConstraintsTransferencias.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTransferencias.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTransferencias.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTransferencias);
			
			this.jInternalFrameOrderByTransferencias.getContentPane().add(this.jScrollPanelOrderByTransferencias, this.gridBagConstraintsTransferencias);			
		
		} else {
			this.jButtonAbrirOrderByTransferencias = new JButtonMe();
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
		int iWidthTableCalculado=0;//4430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.transferenciasSessionBean.getConGuardarRelaciones()
		//	) {
		//}
		
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
		int iCountColumns=this.jTableDatosTransferencias.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTransferencias.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTransferencias.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosTransferencias.getRowHeight();//TransferenciasConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.transferenciasSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TransferenciasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTransferencias.isSelected()) {
					iHeightTable=TransferenciasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TransferenciasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TransferenciasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TransferenciasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTransferencias.isSelected()) {
					iHeightTable=TransferenciasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TransferenciasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TransferenciasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTransferencias.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTransferencias.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTransferencias.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTransferencias.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTransferencias.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTransferencias.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTransferencias!=null && this.jInternalFrameOrderByTransferencias.getjTableDatosOrderBy()!=null) {
			//if(!this.transferenciasSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTransferencias.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTransferencias.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTransferencias.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTransferencias.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTransferencias.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTransferencias.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTransferencias.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTransferencias.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTransferencias.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTransferencias.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=transferenciasLogic.getTransferenciass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=transferenciass.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Transferencias> TraerTransferenciasBeans(List<Transferencias> transferenciass,ArrayList<Classe> classes)throws Exception {
		try {
			for(Transferencias transferencias:transferenciass) {
					
				if(!(TransferenciasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TransferenciasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					transferencias.setsDetalleGeneralEntityReporte(TransferenciasConstantesFunciones.getTransferenciasDescripcion(transferencias));
										
						
					
						
					
				} else  {
							
					//transferencias.setsDetalleGeneralEntityReporte(transferencias.getsDetalleGeneralEntityReporte());
										
				}
				
				//transferenciasbeans.add(transferenciasbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return transferenciass;
    }
	//PARA REPORTES FIN
}
