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


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;

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
import com.bydan.erp.seguridad.util.PaisConstantesFunciones;

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
public class PaisJInternalFrame extends PaisBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPais;
	
	protected JMenuBar jmenuBarPais;
	
	protected JMenu jmenuPais;
	protected JMenu jmenuDatosPais;
	protected JMenu jmenuArchivoPais;
	protected JMenu jmenuAccionesPais;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPais = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPais;	
	protected GridBagConstraints gridBagConstraintsPais;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PaisDetalleFormJInternalFrame jInternalFrameDetalleFormPais;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPais;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPais;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ContinenteBeanSwingJInternalFrame continenteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_continente="";
	
	public PaisSessionBean paisSessionBean;
		
	
	
	public ContinenteSessionBean continenteSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Pais> paiss;		
	public List<Pais> paissEliminados;	
	public List<Pais> paissAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPais;		
	protected JButton jButtonAbrirOrderByPais;
	
	
	//protected JPanel jPanelOrderByPais;
	//public JScrollPane jScrollPanelOrderByPais;	
	//protected JButton jButtonCerrarOrderByPais;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PaisLogic paisLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPais;
	public JScrollPane jScrollPanelDatosEdicionPais;
	public JScrollPane jScrollPanelDatosGeneralPais;
    
	
	
	//public JScrollPane jScrollPanelDatosPaisOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPais;
	//public JScrollPane jScrollPanelImportacionPais;
	
	
	
	protected JPanel jPanelAccionesPais;
	
    protected JPanel jPanelPaginacionPais;
    protected JPanel jPanelParametrosReportesPais;
	protected JPanel jPanelParametrosReportesAccionesPais;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Pais;
	protected JPanel jPanelParametrosAuxiliar2Pais;
	protected JPanel jPanelParametrosAuxiliar3Pais;
	protected JPanel jPanelParametrosAuxiliar4Pais;
	//protected JPanel jPanelParametrosAuxiliar5Pais;
	
	
	
	//protected JPanel jPanelReporteDinamicoPais;
	//protected JPanel jPanelImportacionPais;
	
	
	public JTable jTableDatosPais;
	
	
	
	//public JTable jTableDatosPaisOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPais;
	protected JButton jButtonDuplicarPais;
	protected JButton jButtonCopiarPais;
	protected JButton jButtonVerFormPais;
	protected JButton jButtonNuevoRelacionesPais;
	protected JButton jButtonModificarPais;
	
    protected JButton jButtonGuardarCambiosTablaPais;
	protected JButton jButtonCerrarPais;
	
	
	protected JButton jButtonRecargarInformacionPais;
	protected JButton jButtonProcesarInformacionPais;
	
	
	protected JButton jButtonAnterioresPais;
	protected JButton jButtonSiguientesPais;
	protected JButton jButtonNuevoGuardarCambiosPais;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPais;
	//protected JButton jButtonCerrarReporteDinamicoPais;
	//protected JButton jButtonGenerarExcelReporteDinamicoPais;	
	
	
	
	//protected JButton jButtonAbrirImportacionPais;
	//protected JButton jButtonGenerarImportacionPais;
	//protected JButton jButtonCerrarImportacionPais;
	//protected JFileChooser jFileChooserImportacionPais;
	//protected File fileImportacionPais;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPais;
	protected JButton jButtonDuplicarToolBarPais;
	protected JButton jButtonNuevoRelacionesToolBarPais;
	
	
	public JButton jButtonGuardarCambiosToolBarPais;
	protected JButton jButtonCopiarToolBarPais;
	protected JButton jButtonVerFormToolBarPais;
	public JButton jButtonGuardarCambiosTablaToolBarPais;
	protected JButton jButtonMostrarOcultarTablaToolBarPais;
	protected JButton jButtonCerrarToolBarPais;
	
	protected JButton jButtonRecargarInformacionToolBarPais;
	protected JButton jButtonProcesarInformacionToolBarPais;
	protected JButton jButtonAnterioresToolBarPais;
	protected JButton jButtonSiguientesToolBarPais;
	protected JButton jButtonNuevoGuardarCambiosToolBarPais;
	protected JButton jButtonAbrirOrderByToolBarPais;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPais;
	protected JMenuItem jMenuItemDuplicarPais;
	protected JMenuItem jMenuItemNuevoRelacionesPais;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPais;
	protected JMenuItem jMenuItemCopiarPais;
	protected JMenuItem jMenuItemVerFormPais;
	protected JMenuItem jMenuItemGuardarCambiosTablaPais;
	protected JMenuItem jMenuItemCerrarPais;
	protected JMenuItem jMenuItemDetalleCerrarPais;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPais;
	protected JMenuItem jMenuItemDetalleMostarOcultarPais;
	
	protected JMenuItem jMenuItemRecargarInformacionPais;
	protected JMenuItem jMenuItemProcesarInformacionPais;
	protected JMenuItem jMenuItemAnterioresPais;
	protected JMenuItem jMenuItemSiguientesPais;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPais;
	protected JMenuItem jMenuItemAbrirOrderByPais;
	protected JMenuItem jMenuItemMostrarOcultarPais;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPais;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPais;
	protected JCheckBox jCheckBoxSeleccionadosPais;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPais;
	protected JCheckBox jCheckBoxConGraficoReportePais;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPais;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPais;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPais;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPais;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPais;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPais;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPais;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPais;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPais;
	protected JTextField jTextFieldValorCampoGeneralPais;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePais;
	//public JList<Reporte> jListColumnasSelectReportePais;
	//public JScrollPane jScrollColumnasSelectReportePais;
	
	//public JLabel jLabelRelacionesSelectReportePais;
	//public JList<Reporte> jListRelacionesSelectReportePais;
	//public JScrollPane jScrollRelacionesSelectReportePais;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPais;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPais;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPais;
	//public JLabel jLabelTiposArchivoReporteDinamicoPais;
	
		
	//public JLabel jLabelArchivoImportacionPais;	
	//public JLabel jLabelPathArchivoImportacionPais;
	//protected JTextField jTextFieldPathArchivoImportacionPais;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPais;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPais;
	
	//public JLabel jLabelColumnaCategoriaValorPais;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPais;
	
	//public JLabel jLabelColumnasValoresGraficoPais;
	//public JList<Reporte> jListColumnasValoresGraficoPais;
	//public JScrollPane jScrollColumnasValoresGraficoPais;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPais;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPais;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPais;
	public JPanel jPanelBusquedaPorIdContinentePorNombrePais;
	public JButton jButtonBusquedaPorIdContinentePorNombrePais;
	public JPanel jPanelFK_IdContinentePais;
	public JButton jButtonFK_IdContinentePais;
	
	public JPanel jPanelid_continenteBusquedaPorIdContinentePorNombrePais;
	public JLabel jLabelid_continenteBusquedaPorIdContinentePorNombrePais;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_continenteBusquedaPorIdContinentePorNombrePais;
	public JButton jButtonid_continenteBusquedaPorIdContinentePorNombrePais= new JButtonMe();
	public JButton jButtonid_continenteBusquedaPorIdContinentePorNombrePaisUpdate= new JButtonMe();
	public JButton jButtonid_continenteBusquedaPorIdContinentePorNombrePaisBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorIdContinentePorNombrePais;
	public JLabel jLabelnombreBusquedaPorIdContinentePorNombrePais;
	public JTextArea jTextAreanombreBusquedaPorIdContinentePorNombrePais;
	public JButton jButtonnombreBusquedaPorIdContinentePorNombrePaisBusqueda= new JButtonMe();

	
	public JPanel jPanelid_continenteFK_IdContinentePais;
	public JLabel jLabelid_continenteFK_IdContinentePais;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_continenteFK_IdContinentePais;
	public JButton jButtonid_continenteFK_IdContinentePais= new JButtonMe();
	public JButton jButtonid_continenteFK_IdContinentePaisUpdate= new JButtonMe();
	public JButton jButtonid_continenteFK_IdContinentePaisBusqueda= new JButtonMe();

	
	
	
	
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
	public PaisJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Pais No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PaisJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Pais No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PaisJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Pais No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PaisJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Pais No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPais)	{
		this.jButtonRecargarInformacionPais = jButtonRecargarInformacionPais;
	}
	
	public JButton getjButtonProcesarInformacionPais() {
		return this.jButtonProcesarInformacionPais;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPais)	{
		this.jButtonProcesarInformacionPais = jButtonProcesarInformacionPais;
	}
	
	
	public JButton getjButtonRecargarInformacionPais() {
		return this.jButtonRecargarInformacionPais;
	}
	
	
	public List<Pais> getpaiss() {
		return this.paiss;
	}

	public void setpaiss(List<Pais> paiss) {
		this.paiss = paiss;
	}
	
	public List<Pais> getpaissAux() {
		return this.paissAux;
	}

	public void setpaissAux(List<Pais> paissAux) {
		this.paissAux = paissAux;
	}
	
	public List<Pais> getpaissEliminados() {
		return this.paissEliminados;
	}

	public void setPaissEliminados(List<Pais> paissEliminados) {
		this.paissEliminados = paissEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPais() {
		return jComboBoxTiposSeleccionarPais;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPais(
			JComboBox jComboBoxTiposSeleccionarPais) {
		this.jComboBoxTiposSeleccionarPais = jComboBoxTiposSeleccionarPais;
	}
	
	public void setBorderResaltarTiposSeleccionarPais() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPais.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPais .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPais() {
		return jTextFieldValorCampoGeneralPais;
	}

	public void setjTextFieldValorCampoGeneralPais(
			JTextField jTextFieldValorCampoGeneralPais) {
		this.jTextFieldValorCampoGeneralPais = jTextFieldValorCampoGeneralPais;
	}

	public void setBorderResaltarValorCampoGeneralPais() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPais.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPais .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPais() {
		return this.jCheckBoxSeleccionarTodosPais;
	}

	public void setjCheckBoxSeleccionarTodosPais(
			JCheckBox jCheckBoxSeleccionarTodosPais) {
		this.jCheckBoxSeleccionarTodosPais = jCheckBoxSeleccionarTodosPais;
	}

	public void setBorderResaltarSeleccionarTodosPais() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPais.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPais .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPais() {
		return this.jCheckBoxSeleccionadosPais;
	}

	public void setjCheckBoxSeleccionadosPais(
			JCheckBox jCheckBoxSeleccionadosPais) {
		this.jCheckBoxSeleccionadosPais = jCheckBoxSeleccionadosPais;
	}
	
	public void setBorderResaltarSeleccionadosPais() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPais.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPais .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPais() {
		return this.jComboBoxTiposArchivosReportesPais;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPais(
			JComboBox jComboBoxTiposArchivosReportesPais) {
		this.jComboBoxTiposArchivosReportesPais = jComboBoxTiposArchivosReportesPais;
	}

	public void setBorderResaltarTiposArchivosReportesPais() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPais.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPais .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPais() {
		return this.jComboBoxTiposReportesPais;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPais(
			JComboBox jComboBoxTiposReportesPais) {
		this.jComboBoxTiposReportesPais = jComboBoxTiposReportesPais;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPais() {
	//	return jComboBoxTiposReportesDinamicoPais;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPais(
	//		JComboBox jComboBoxTiposReportesDinamicoPais) {
	//	this.jComboBoxTiposReportesDinamicoPais = jComboBoxTiposReportesDinamicoPais;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPais() {
	//	return jComboBoxTiposArchivosReportesDinamicoPais;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPais(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPais) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPais = jComboBoxTiposArchivosReportesDinamicoPais;
	//}
	
	public void setBorderResaltarTiposReportesPais() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPais.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPais .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPais() {
		return this.jComboBoxTiposGraficosReportesPais;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPais(
			JComboBox jComboBoxTiposGraficosReportesPais) {
		this.jComboBoxTiposGraficosReportesPais = jComboBoxTiposGraficosReportesPais;
	}
	
	public void setBorderResaltarTiposGraficosReportesPais() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPais.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPais .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPais() {
		return this.jComboBoxTiposPaginacionPais;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPais(
			JComboBox jComboBoxTiposPaginacionPais) {
		this.jComboBoxTiposPaginacionPais = jComboBoxTiposPaginacionPais;
	}
	
	public void setBorderResaltarTiposPaginacionPais() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPais.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPais .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPais() {
		return this.jComboBoxTiposRelacionesPais;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPais() {
		return this.jComboBoxTiposAccionesPais;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPais(
			JComboBox jComboBoxTiposRelacionesPais) {
		this.jComboBoxTiposRelacionesPais = jComboBoxTiposRelacionesPais;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPais(
			JComboBox jComboBoxTiposAccionesPais) {
		this.jComboBoxTiposAccionesPais = jComboBoxTiposAccionesPais;
	}
	
	public void setBorderResaltarTiposRelacionesPais() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPais.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPais .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPais() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPais.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPais .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPais() {
	//	return jCheckBoxConGraficoDinamicoPais;
	//}

	//public void setjCheckBoxConGraficoDinamicoPais(
	//		JCheckBox jCheckBoxConGraficoDinamicoPais) {
	//	this.jCheckBoxConGraficoDinamicoPais = jCheckBoxConGraficoDinamicoPais;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPais() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPais.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPais .setBorder(borderResaltar);		
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
		this.paisSessionBean=new PaisSessionBean();
		
		this.paisSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.paisSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.paisSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PaisJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PaisJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PaisJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PaisJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PaisJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Pais MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.paisSessionBean.getEsGuardarRelacionado()) {
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
		
		PaisJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Pais No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPais= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPais=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPais,this.jTtoolBarPais,
							"nuevo","nuevo","Nuevo"+" "+PaisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPais=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPais,this.jTtoolBarPais,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPais=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPais,this.jTtoolBarPais,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PaisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPais=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPais,this.jTtoolBarPais,
							"duplicar","duplicar","Duplicar"+" "+PaisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPais=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPais,this.jTtoolBarPais,
							"copiar","copiar","Copiar"+" "+PaisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPais=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPais,this.jTtoolBarPais,
							"ver_form","ver_form","Ver"+" "+PaisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPais=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPais,this.jTtoolBarPais,
							"recargar","recargar","Recargar"+" "+PaisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPais=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPais,this.jTtoolBarPais,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPais=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPais,this.jTtoolBarPais,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPais=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPais,this.jTtoolBarPais,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPais=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPais,this.jTtoolBarPais,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPais=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPais,this.jTtoolBarPais,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PaisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPais=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPais,this.jTtoolBarPais,
							"cerrar","cerrar","Salir"+" "+PaisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPais=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPais;
			
				this.jButtonProcesarInformacionToolBarPais=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPais;
				
		//protected JButton jButtonModificarToolBarPais;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPais=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPais=new JMenuMe("General");
		this.jmenuArchivoPais=new JMenuMe("Archivo");
		this.jmenuAccionesPais=new JMenuMe("Acciones");
		this.jmenuDatosPais=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPais= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPais.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPais,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPais, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPais= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPais.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPais,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPais, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPais= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPais.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPais,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPais, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPais= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPais.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPais,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPais, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPais= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPais.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPais,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPais, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPais= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPais.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPais,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPais, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPais= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPais.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPais,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPais, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPais= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPais.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPais,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPais, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPais= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPais.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPais,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPais, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPais= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPais.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPais,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPais= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPais.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPais,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPais, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPais= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPais.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPais,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPais, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPais= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPais.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPais,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPais, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPais= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPais.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPais,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPais, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPais= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPais.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPais,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPais, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPais= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPais.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPais,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPais, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPais= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPais.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPais,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPais, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPais.add(this.jMenuItemCerrarPais);
			
			this.jmenuAccionesPais.add(this.jMenuItemNuevoPais);
			this.jmenuAccionesPais.add(this.jMenuItemNuevoGuardarCambiosPais);
			this.jmenuAccionesPais.add(this.jMenuItemNuevoRelacionesPais);
			this.jmenuAccionesPais.add(this.jMenuItemGuardarCambiosTablaPais);		
			this.jmenuAccionesPais.add(this.jMenuItemDuplicarPais);		
			this.jmenuAccionesPais.add(this.jMenuItemCopiarPais);		
			this.jmenuAccionesPais.add(this.jMenuItemVerFormPais);		
			
			this.jmenuDatosPais.add(this.jMenuItemRecargarInformacionPais);				
			this.jmenuDatosPais.add(this.jMenuItemAnterioresPais);				
			this.jmenuDatosPais.add(this.jMenuItemSiguientesPais);				
			this.jmenuDatosPais.add(this.jMenuItemAbrirOrderByPais);				
			this.jmenuDatosPais.add(this.jMenuItemMostrarOcultarPais);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPais.add(this.jMenuItemGuardarCambiosPais);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPais, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPais, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPais, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPais.add(this.jmenuArchivoPais);		
			this.jmenuBarPais.add(this.jmenuAccionesPais);		
			this.jmenuBarPais.add(this.jmenuDatosPais);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPais);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPais() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorIdContinentePorNombrePais=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdContinentePorNombrePais.setToolTipText("Buscar Por Continente Por Nombre ");
		this.jButtonBusquedaPorIdContinentePorNombrePais= new JButtonMe();
		this.jButtonBusquedaPorIdContinentePorNombrePais.setText("Buscar");
		this.jButtonBusquedaPorIdContinentePorNombrePais.setToolTipText("Buscar Por Continente Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdContinentePorNombrePais,"buscar_button","Buscar Por Continente Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdContinentePorNombrePais, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_continenteBusquedaPorIdContinentePorNombrePais = new JLabelMe();
		jLabelid_continenteBusquedaPorIdContinentePorNombrePais.setText("Continente :");
		jLabelid_continenteBusquedaPorIdContinentePorNombrePais.setToolTipText("Continente");
		jLabelid_continenteBusquedaPorIdContinentePorNombrePais.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_continenteBusquedaPorIdContinentePorNombrePais.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_continenteBusquedaPorIdContinentePorNombrePais.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_continenteBusquedaPorIdContinentePorNombrePais,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_continenteBusquedaPorIdContinentePorNombrePais= new JComboBoxMe();
		jComboBoxid_continenteBusquedaPorIdContinentePorNombrePais.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_continenteBusquedaPorIdContinentePorNombrePais.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_continenteBusquedaPorIdContinentePorNombrePais.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_continenteBusquedaPorIdContinentePorNombrePais,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelnombreBusquedaPorIdContinentePorNombrePais = new JLabelMe();
		jLabelnombreBusquedaPorIdContinentePorNombrePais.setText("Nombre :");
		jLabelnombreBusquedaPorIdContinentePorNombrePais.setToolTipText("Nombre");
		jLabelnombreBusquedaPorIdContinentePorNombrePais.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorIdContinentePorNombrePais.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorIdContinentePorNombrePais.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorIdContinentePorNombrePais,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorIdContinentePorNombrePais= new JTextAreaMe();
		jTextAreanombreBusquedaPorIdContinentePorNombrePais.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorIdContinentePorNombrePais.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorIdContinentePorNombrePais.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorIdContinentePorNombrePais,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdContinentePais=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdContinentePais.setToolTipText("Buscar Por Continente ");
		this.jButtonFK_IdContinentePais= new JButtonMe();
		this.jButtonFK_IdContinentePais.setText("Buscar");
		this.jButtonFK_IdContinentePais.setToolTipText("Buscar Por Continente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdContinentePais,"buscar_button","Buscar Por Continente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdContinentePais, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_continenteFK_IdContinentePais = new JLabelMe();
		jLabelid_continenteFK_IdContinentePais.setText("Continente :");
		jLabelid_continenteFK_IdContinentePais.setToolTipText("Continente");
		jLabelid_continenteFK_IdContinentePais.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_continenteFK_IdContinentePais.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_continenteFK_IdContinentePais.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_continenteFK_IdContinentePais,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_continenteFK_IdContinentePais= new JComboBoxMe();
		jComboBoxid_continenteFK_IdContinentePais.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_continenteFK_IdContinentePais.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_continenteFK_IdContinentePais.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_continenteFK_IdContinentePais,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPais=new JTabbedPane();


		this.jTabbedPaneBusquedasPais.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPais.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPais.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPais.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPais.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPais,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePais = new PaisDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Pais DATOS");
			this.jInternalFrameDetalleFormPais = new PaisDetalleFormJInternalFrame(jDesktopPane,this.paisSessionBean.getConGuardarRelaciones(),this.paisSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPais = null;//new PaisDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPais= new GridBagLayout();
		
		
		this.jTableDatosPais = new JTableMe();      
		
		String sToolTipPais="";
		sToolTipPais=PaisConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPais+="(Seguridad.Pais)";
		}
		
		if(!this.paisSessionBean.getEsGuardarRelacionado()) {
			sToolTipPais+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPais.setToolTipText(sToolTipPais);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPais);
		this.jTableDatosPais.setAutoCreateRowSorter(true);
		this.jTableDatosPais.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPais.setRowSelectionAllowed(true);
		this.jTableDatosPais.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPais,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPais = new JButtonMe();
		this.jButtonDuplicarPais = new JButtonMe();
		this.jButtonCopiarPais = new JButtonMe();
		this.jButtonVerFormPais = new JButtonMe();
		this.jButtonNuevoRelacionesPais = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPais = new JButtonMe();
		this.jButtonCerrarPais = new JButtonMe();
		
		this.jScrollPanelDatosPais = new JScrollPane();   
        this.jScrollPanelDatosGeneralPais = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPais = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Pais";
		
		if(!this.paisSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPais.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Paises" + this.sPath));
		} else {
			this.jScrollPanelDatosPais.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPais.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPais.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPais.setToolTipText("Acciones");
        this.jPanelAccionesPais.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPais, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPais, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPais=new ReporteDinamicoJInternalFrame(PaisConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPais();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPais=new ImportacionJInternalFrame(PaisConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPais();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPais = new JButtonMe();
		
		this.jButtonAbrirOrderByPais.setText("Orden");
		this.jButtonAbrirOrderByPais.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPais,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPais, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPais.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPais.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPais=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPais,false,this);
			
			//this.cargarOrderByPais(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPais=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPais,true,this);
			
			//this.cargarOrderByPais(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPais.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosPais.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosPais.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosPais.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPais.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPais.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPais.setText("Nuevo");
		this.jButtonDuplicarPais.setText("Duplicar");
		this.jButtonCopiarPais.setText("Copiar");
		this.jButtonVerFormPais.setText("Ver");
		this.jButtonNuevoRelacionesPais.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPais.setText("Guardar");
		this.jButtonCerrarPais.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPais,"nuevo_button","Nuevo",this.paisSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPais,"duplicar_button","Duplicar",this.paisSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPais,"copiar_button","Copiar",this.paisSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPais,"ver_form","Ver",this.paisSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPais,"nuevorelaciones_button","Nuevo Rel",this.paisSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPais,"guardarcambiostabla_button","Guardar",this.paisSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPais,"cerrar_button","Salir",this.paisSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPais, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPais, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPais, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPais, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPais, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPais, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPais, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPais.setToolTipText("Nuevo"+" "+PaisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPais.setToolTipText("Duplicar"+" "+PaisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPais.setToolTipText("Copiar"+" "+PaisConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPais.setToolTipText("Ver"+" "+PaisConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPais.setToolTipText("Nuevo Rel"+" "+PaisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPais.setToolTipText("Guardar"+" "+PaisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPais.setToolTipText("Salir"+" "+PaisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPais";
		inputMap = this.jButtonNuevoPais.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPais.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPais"));
		
		//DUPLICAR
		sMapKey = "DuplicarPais";
		inputMap = this.jButtonDuplicarPais.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPais.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPais"));
		
		//COPIAR
		sMapKey = "CopiarPais";
		inputMap = this.jButtonCopiarPais.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPais.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPais"));
		
		//VEr FORM
		sMapKey = "VerFormPais";
		inputMap = this.jButtonVerFormPais.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPais.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPais"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPais";
		inputMap = this.jButtonNuevoRelacionesPais.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPais.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPais"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPais";
		inputMap = this.jButtonModificarPais.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPais.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPais"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPais";
		inputMap = this.jButtonCerrarPais.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPais.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPais"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPais";
		inputMap = this.jButtonGuardarCambiosTablaPais.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPais.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPais"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPais = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPais = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPais = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Pais= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Pais= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Pais= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Pais= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Pais= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPais.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPais.setName("jPanelParametrosReportesPais"); 
		
		this.jPanelParametrosReportesAccionesPais.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPais.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPais.setName("jPanelParametrosReportesAccionesPais"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPais, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPais, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPais = new JButtonMe();
		this.jButtonRecargarInformacionPais.setText("Recargar");
		this.jButtonRecargarInformacionPais.setToolTipText("Recargar"+" "+PaisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPais,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPais = new JButtonMe();
		this.jButtonProcesarInformacionPais.setText("Procesar");
		this.jButtonProcesarInformacionPais.setToolTipText("Procesar"+" "+PaisConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPais.setVisible(false);
			
		this.jButtonProcesarInformacionPais.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPais.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPais.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPais = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPais.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPais.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPais = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPais.setText("TIPO");       
		this.jComboBoxTiposReportesPais.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPais = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPais.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPais.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPais = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPais.setText("Paginacion");
		this.jComboBoxTiposPaginacionPais.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPais = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPais.setText("Accion");
		this.jComboBoxTiposRelacionesPais.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPais = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPais.setText("Accion");
		this.jComboBoxTiposAccionesPais.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPais = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPais.setText("Accion");
		this.jComboBoxTiposSeleccionarPais.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPais=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPais.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPais.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPais.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPais = new JLabelMe();
		
		this.jLabelAccionesPais.setText("Acciones");		
		this.jLabelAccionesPais.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPais.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPais.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPais = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPais.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPais.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPais = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPais.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPais.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPais = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPais.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPais.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePais = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePais.setText("Graf.");
		this.jCheckBoxConGraficoReportePais.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPais = new JButtonMe();
		//this.jButtonAnterioresPais.setText("<<");
        this.jButtonAnterioresPais.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPais,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPais, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPais = new JButtonMe();
		//this.jButtonSiguientesPais.setText(">>");
        this.jButtonSiguientesPais.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPais,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPais, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPais = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPais.setText("Nue");
        this.jButtonNuevoGuardarCambiosPais.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPais,"nuevoguardarcambios_button","Nue",this.paisSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPais, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPais";
		inputMap = this.jButtonNuevoGuardarCambiosPais.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPais.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPais"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPais";
		inputMap = this.jButtonRecargarInformacionPais.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPais.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPais"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPais";
		inputMap = this.jButtonSiguientesPais.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPais.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPais"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPais";
		inputMap = this.jButtonAnterioresPais.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPais.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPais"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPais();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPais.setMinimumSize(new Dimension(this.getWidth(),PaisBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PaisBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPais.setMaximumSize(new Dimension(this.getWidth(),PaisBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PaisBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPais.setPreferredSize(new Dimension(this.getWidth(),PaisBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PaisBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPais = new GridBagLayout();

			this.jPanelPaginacionPais.setLayout(gridaBagLayoutPaginacionPais);						
			
			this.gridBagConstraintsPais = new GridBagConstraints();
			this.gridBagConstraintsPais.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPais.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPais.gridy = 0;
			this.gridBagConstraintsPais.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPais.add(this.jButtonAnterioresPais, this.gridBagConstraintsPais);
					
						
			this.gridBagConstraintsPais = new GridBagConstraints();
			this.gridBagConstraintsPais.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPais.gridy = 0;
			
			this.jPanelPaginacionPais.add(this.jButtonNuevoGuardarCambiosPais, this.gridBagConstraintsPais);
						
			
			this.gridBagConstraintsPais = new GridBagConstraints();
			this.gridBagConstraintsPais.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPais.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPais.gridy = 0;
			this.jPanelPaginacionPais.add(this.jButtonSiguientesPais, this.gridBagConstraintsPais);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPais = new GridBagConstraints();
			this.gridBagConstraintsPais.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPais.gridy = 1;
			this.gridBagConstraintsPais.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPais.add(this.jButtonNuevoPais, this.gridBagConstraintsPais);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsPais = new GridBagConstraints();
				this.gridBagConstraintsPais.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPais.gridy = 1;
				this.gridBagConstraintsPais.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionPais.add(this.jButtonNuevoRelacionesPais, this.gridBagConstraintsPais);
			}
			
			
			if(!this.paisSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPais = new GridBagConstraints();
				this.gridBagConstraintsPais.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPais.gridy = 1;
				this.gridBagConstraintsPais.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPais.add(this.jButtonGuardarCambiosTablaPais, this.gridBagConstraintsPais);
			}
			
			
			
			this.gridBagConstraintsPais = new GridBagConstraints();
			this.gridBagConstraintsPais.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPais.gridy = 1;
			this.gridBagConstraintsPais.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPais.add(this.jButtonDuplicarPais, this.gridBagConstraintsPais);
			
			this.gridBagConstraintsPais = new GridBagConstraints();
			this.gridBagConstraintsPais.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPais.gridy = 1;
			this.gridBagConstraintsPais.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPais.add(this.jButtonCopiarPais, this.gridBagConstraintsPais);
		
			this.gridBagConstraintsPais = new GridBagConstraints();
			this.gridBagConstraintsPais.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPais.gridy = 1;
			this.gridBagConstraintsPais.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPais.add(this.jButtonVerFormPais, this.gridBagConstraintsPais);
		
			this.gridBagConstraintsPais = new GridBagConstraints();
			this.gridBagConstraintsPais.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPais.gridy = 1;
			this.gridBagConstraintsPais.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPais.add(this.jButtonCerrarPais, this.gridBagConstraintsPais);
		
		
		
		this.jButtonRecargarInformacionPais.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPais.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPais.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPais, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPais.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPais.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPais.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPais, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPais.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPais.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPais.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPais, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPais.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPais.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPais.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPais, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPais.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPais.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPais.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPais, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPais.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPais.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPais.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPais, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPais.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPais.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPais.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPais, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPais.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPais.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPais.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPais, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPais.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPais.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPais.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPais, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePais.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePais.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePais.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePais, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPais.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPais.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPais.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPais, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPais.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPais.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPais.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPais, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPais = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPais = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Pais = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Pais = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Pais = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Pais = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPais.setLayout(gridaBagParametrosReportesPais);
			this.jPanelParametrosReportesAccionesPais.setLayout(gridaBagParametrosReportesAccionesPais);
			
			
			this.jPanelParametrosAuxiliar1Pais.setLayout(gridaBagParametrosAuxiliar1Pais);
			this.jPanelParametrosAuxiliar2Pais.setLayout(gridaBagParametrosAuxiliar2Pais);
			this.jPanelParametrosAuxiliar3Pais.setLayout(gridaBagParametrosAuxiliar3Pais);
			this.jPanelParametrosAuxiliar4Pais.setLayout(gridaBagParametrosAuxiliar4Pais);
			//this.jPanelParametrosAuxiliar5Pais.setLayout(gridaBagParametrosAuxiliar2Pais);			
			
			
			
			
			this.gridBagConstraintsPais = new GridBagConstraints();
			this.gridBagConstraintsPais.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPais.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPais.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPais.add(this.jButtonRecargarInformacionPais, this.gridBagConstraintsPais);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPais = new GridBagConstraints();
			this.gridBagConstraintsPais.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPais.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPais.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Pais.add(this.jComboBoxTiposPaginacionPais, this.gridBagConstraintsPais);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPais = new GridBagConstraints();
			this.gridBagConstraintsPais.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPais.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPais.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Pais.add(this.jCheckBoxConAltoMaximoTablaPais, this.gridBagConstraintsPais);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPais = new GridBagConstraints();
			this.gridBagConstraintsPais.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPais.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPais.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Pais.add(this.jComboBoxTiposArchivosReportesPais, this.gridBagConstraintsPais);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPais = new GridBagConstraints();
			this.gridBagConstraintsPais.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPais.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPais.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPais.add(this.jPanelParametrosAuxiliar1Pais, this.gridBagConstraintsPais);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPais = new GridBagConstraints();
			this.gridBagConstraintsPais.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPais.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPais.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPais.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Pais.add(this.jComboBoxTiposReportesPais, this.gridBagConstraintsPais);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPais = new GridBagConstraints();
			this.gridBagConstraintsPais.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPais.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPais.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPais.add(this.jPanelParametrosAuxiliar4Pais, this.gridBagConstraintsPais);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPais = new GridBagConstraints();
			this.gridBagConstraintsPais.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPais.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPais.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPais.add(this.jComboBoxTiposReportesPais, this.gridBagConstraintsPais);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPais = new GridBagConstraints();
			this.gridBagConstraintsPais.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPais.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPais.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPais.add(this.jCheckBoxGenerarReportePais, this.gridBagConstraintsPais);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPais = new GridBagConstraints();
			this.gridBagConstraintsPais.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPais.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPais.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPais.add(this.jPanelParametrosAuxiliar2Pais, this.gridBagConstraintsPais);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPais = new GridBagConstraints();
			this.gridBagConstraintsPais.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPais.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPais.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPais.add(this.jLabelAccionesPais, this.gridBagConstraintsPais);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPais = new GridBagConstraints();
				this.gridBagConstraintsPais.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPais.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPais.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPais.add(this.jButtonAbrirOrderByPais, this.gridBagConstraintsPais);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPais = new GridBagConstraints();
			this.gridBagConstraintsPais.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPais.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPais.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPais.add(this.jComboBoxTiposSeleccionarPais, this.gridBagConstraintsPais);			
			
			
			/*
			this.gridBagConstraintsPais = new GridBagConstraints();
			this.gridBagConstraintsPais.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPais.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPais.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPais.add(this.jCheckBoxSeleccionarTodosPais, this.gridBagConstraintsPais);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPais = new GridBagConstraints();
			this.gridBagConstraintsPais.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPais.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPais.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPais.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Pais.add(this.jCheckBoxSeleccionarTodosPais, this.gridBagConstraintsPais);															
				
			this.gridBagConstraintsPais = new GridBagConstraints();
			this.gridBagConstraintsPais.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPais.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPais.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPais.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Pais.add(this.jCheckBoxSeleccionadosPais, this.gridBagConstraintsPais);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPais = new GridBagConstraints();
			this.gridBagConstraintsPais.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPais.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPais.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPais.add(this.jPanelParametrosAuxiliar3Pais, this.gridBagConstraintsPais);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsPais = new GridBagConstraints();
			this.gridBagConstraintsPais.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPais.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPais.add(this.jComboBoxTiposRelacionesPais, this.gridBagConstraintsPais);
				
			this.gridBagConstraintsPais = new GridBagConstraints();
			this.gridBagConstraintsPais.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPais.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPais.add(this.jComboBoxTiposAccionesPais, this.gridBagConstraintsPais);
	
				
			this.gridBagConstraintsPais = new GridBagConstraints();
			this.gridBagConstraintsPais.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPais.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPais.add(this.jTextFieldValorCampoGeneralPais, this.gridBagConstraintsPais);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPais = new GridBagLayout();

			this.jScrollPanelDatosPais.setLayout(gridaBagLayoutDatosPais);
			
			this.gridBagConstraintsPais = new GridBagConstraints();
			this.gridBagConstraintsPais.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPais.gridy = 0;
			this.gridBagConstraintsPais.gridx = 0;
			
			this.jScrollPanelDatosPais.add(this.jTableDatosPais, this.gridBagConstraintsPais);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPais.setViewportView(this.jTableDatosPais);
		this.jTableDatosPais.setFillsViewportHeight(true);
		this.jTableDatosPais.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPais= new GridBagLayout();
		this.jPanelAccionesPais.setLayout(gridaBagLayoutAccionesPais);
		
		
		/*	
		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPais.gridy = 0;
		this.gridBagConstraintsPais.gridx = 0;
			
		this.jPanelAccionesPais.add(this.jButtonNuevoPais, this.gridBagConstraintsPais);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorIdContinentePorNombrePais= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdContinentePorNombrePais.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdContinentePorNombrePais.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdContinentePorNombrePais.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdContinentePorNombrePais.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdContinentePorNombrePais.setLayout(gridaBagLayoutBusquedaPorIdContinentePorNombrePais);

		gridBagConstraintsPais = new GridBagConstraints();
		gridBagConstraintsPais.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPais.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPais.gridy = 0;
		gridBagConstraintsPais.gridx = 0;
		jPanelBusquedaPorIdContinentePorNombrePais.add(jLabelid_continenteBusquedaPorIdContinentePorNombrePais, gridBagConstraintsPais);

		gridBagConstraintsPais = new GridBagConstraints();
		gridBagConstraintsPais.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPais.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPais.gridy = 0;
		gridBagConstraintsPais.gridx = 1;
		jPanelBusquedaPorIdContinentePorNombrePais.add(jComboBoxid_continenteBusquedaPorIdContinentePorNombrePais, gridBagConstraintsPais);


		gridBagConstraintsPais = new GridBagConstraints();
		gridBagConstraintsPais.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPais.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPais.gridy = 1;
		gridBagConstraintsPais.gridx = 0;
		jPanelBusquedaPorIdContinentePorNombrePais.add(jLabelnombreBusquedaPorIdContinentePorNombrePais, gridBagConstraintsPais);

		gridBagConstraintsPais = new GridBagConstraints();
		gridBagConstraintsPais.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPais.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPais.gridy = 1;
		gridBagConstraintsPais.gridx = 1;
		jPanelBusquedaPorIdContinentePorNombrePais.add(jTextAreanombreBusquedaPorIdContinentePorNombrePais, gridBagConstraintsPais);

		gridBagConstraintsPais = new GridBagConstraints();
		gridBagConstraintsPais.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPais.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPais.gridy = 2;
		gridBagConstraintsPais.gridx =1;
		jPanelBusquedaPorIdContinentePorNombrePais.add(jButtonBusquedaPorIdContinentePorNombrePais, gridBagConstraintsPais);

		jTabbedPaneBusquedasPais.addTab("1.-Por Continente Por Nombre ", jPanelBusquedaPorIdContinentePorNombrePais);
		jTabbedPaneBusquedasPais.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdContinentePais= new GridBagLayout();
		gridaBagLayoutFK_IdContinentePais.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdContinentePais.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdContinentePais.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdContinentePais.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdContinentePais.setLayout(gridaBagLayoutFK_IdContinentePais);

		gridBagConstraintsPais = new GridBagConstraints();
		gridBagConstraintsPais.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPais.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPais.gridy = 0;
		gridBagConstraintsPais.gridx = 0;
		jPanelFK_IdContinentePais.add(jLabelid_continenteFK_IdContinentePais, gridBagConstraintsPais);

		gridBagConstraintsPais = new GridBagConstraints();
		gridBagConstraintsPais.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPais.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPais.gridy = 0;
		gridBagConstraintsPais.gridx = 1;
		jPanelFK_IdContinentePais.add(jComboBoxid_continenteFK_IdContinentePais, gridBagConstraintsPais);

		gridBagConstraintsPais = new GridBagConstraints();
		gridBagConstraintsPais.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPais.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPais.gridy = 1;
		gridBagConstraintsPais.gridx =1;
		jPanelFK_IdContinentePais.add(jButtonFK_IdContinentePais, gridBagConstraintsPais);

		jTabbedPaneBusquedasPais.addTab("2.-Por Continente ", jPanelFK_IdContinentePais);
		jTabbedPaneBusquedasPais.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPais = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPais);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.paisSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPais = new GridBagConstraints();						
			this.gridBagConstraintsPais.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPais.gridx = 0;		
			//this.gridBagConstraintsPais.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPais.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPais.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPais, this.gridBagConstraintsPais);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPais.gridx = 0;		
		//this.gridBagConstraintsPais.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPais.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPais.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPais);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPais = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPais.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPais.gridx = 0;		
			this.gridBagConstraintsPais.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPais.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPais.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPais, this.gridBagConstraintsPais);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPais.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPais, this.gridBagConstraintsPais);								
		
		
		/*
		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPais.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPais, this.gridBagConstraintsPais);
		*/		
		
		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPais.gridx =0;
		this.gridBagConstraintsPais.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPais.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPais, this.gridBagConstraintsPais);
				
		
		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPais.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPais, this.gridBagConstraintsPais);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(PaisJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPais= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPais = new GridBagLayout();
			this.jPanelBusquedasParametrosPais.setLayout(gridaBagLayoutBusquedasParametrosPais);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPais=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPais.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPais.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPais.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPais = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}
			
			
			Boolean tieneColumnasOcultas=false;
			
			
			
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
		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPais.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPais, this.gridBagConstraintsPais);
			
			
		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPais.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPais, this.gridBagConstraintsPais);
		
			
		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPais.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPais, this.gridBagConstraintsPais);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPais;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPais() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPais = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPais = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPais.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPais.setName("jPanelReporteDinamicoPais"); 
		
		this.jPanelReporteDinamicoPais.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPais.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPais.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPais.setLayout(gridaBagLayoutReporteDinamicoPais);
		
		
		this.jInternalFrameReporteDinamicoPais= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPais = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePais= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPais.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPais.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPais.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPais.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPais.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPais.setResizable(true);
	    this.jInternalFrameReporteDinamicoPais.setClosable(true);
	    this.jInternalFrameReporteDinamicoPais.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPais.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPais.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPais.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPais.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Paises"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePais = new JLabelMe();

		this.jLabelColumnasSelectReportePais.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePais.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePais.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePais.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPais.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPais.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPais.add(this.jLabelColumnasSelectReportePais, this.gridBagConstraintsPais);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePais = new JList<Reporte>();
		this.jListColumnasSelectReportePais.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePais.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePais.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePais.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePais.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePais=new JScrollPane(this.jListColumnasSelectReportePais);
			
			this.jScrollColumnasSelectReportePais.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePais.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePais.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePais.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPais.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPais.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPais.add(this.jListColumnasSelectReportePais, this.gridBagConstraintsPais);
		this.jPanelReporteDinamicoPais.add(this.jScrollColumnasSelectReportePais, this.gridBagConstraintsPais);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePais = new JLabelMe();

		this.jLabelRelacionesSelectReportePais.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePais.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePais.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePais.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPais.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPais.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPais.add(this.jLabelRelacionesSelectReportePais, this.gridBagConstraintsPais);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePais = new JList<Reporte>();
		this.jListRelacionesSelectReportePais.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePais.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePais.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePais.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePais.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePais=new JScrollPane(this.jListRelacionesSelectReportePais);
			
			this.jScrollRelacionesSelectReportePais.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePais.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePais.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePais.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPais.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPais.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPais.add(this.jListRelacionesSelectReportePais, this.gridBagConstraintsPais);
		this.jPanelReporteDinamicoPais.add(this.jScrollRelacionesSelectReportePais, this.gridBagConstraintsPais);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoPais = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPais = new JComboBoxMe();
		this.jListColumnasValoresGraficoPais = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPais = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPais.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPais.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPais.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPais.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPais, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPais = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPais.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPais.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPais.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPais.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPais, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPais = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPais.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPais.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPais.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPais.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPais.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPais.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPais.add(this.jLabelGenerarExcelReporteDinamicoPais, this.gridBagConstraintsPais);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPais = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPais.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPais,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPais.setToolTipText("Generar EXCEL"+" "+PaisConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPais = new GridBagConstraints();
		//this.gridBagConstraintsPais.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPais.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPais.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPais.add(this.jButtonGenerarExcelReporteDinamicoPais, this.gridBagConstraintsPais);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPais.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPais.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPais.add(this.jComboBoxTiposReportesDinamicoPais, this.gridBagConstraintsPais);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPais = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPais.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPais.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPais.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPais.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPais.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPais.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPais.add(this.jLabelTiposArchivoReporteDinamicoPais, this.gridBagConstraintsPais);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPais.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPais.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPais.add(this.jComboBoxTiposArchivosReportesDinamicoPais, this.gridBagConstraintsPais);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPais = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPais.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPais,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPais.setToolTipText("Generar"+" "+PaisConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPais.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPais.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPais.add(this.jButtonGenerarReporteDinamicoPais, this.gridBagConstraintsPais);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPais = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPais.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPais,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPais.setToolTipText("Cancelar"+" "+PaisConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPais.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPais.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPais.add(this.jButtonCerrarReporteDinamicoPais, this.gridBagConstraintsPais);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPais = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPais= new JScrollPane(jPanelReporteDinamicoPais,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPais.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPais.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPais.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPais.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Paises"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPais.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPais.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPais.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPais.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPais);
		this.jInternalFrameReporteDinamicoPais.getContentPane().add(this.jScrollPanelReporteDinamicoPais, this.gridBagConstraintsPais);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPais() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPais = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPais = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPais.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPais.setName("jPanelImportacionPais"); 
		
		this.jPanelImportacionPais.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPais.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPais.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPais.setLayout(gridaBagLayoutImportacionPais);
		
		
		this.jInternalFrameImportacionPais= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPais= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPais = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePais= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPais.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPais.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPais.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPais.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPais.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPais.setResizable(true);
	    this.jInternalFrameImportacionPais.setClosable(true);
	    this.jInternalFrameImportacionPais.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPais.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPais.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPais.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPais.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPais.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPais.setResizable(true);
	    this.jInternalFrameImportacionPais.setClosable(true);
	    this.jInternalFrameImportacionPais.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPais.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPais.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPais.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPais.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Paises"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPais = new JLabelMe();

		this.jLabelArchivoImportacionPais.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPais.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPais.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPais.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPais.gridy = iPosYImportacion;		
		this.gridBagConstraintsPais.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPais.add(this.jLabelArchivoImportacionPais, this.gridBagConstraintsPais);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPais = new JFileChooser();		
		this.jFileChooserImportacionPais.setToolTipText("ESCOGER ARCHIVO"+" "+PaisConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPais = new JButtonMe();
		this.jButtonAbrirImportacionPais.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPais,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPais.setToolTipText("Generar"+" "+PaisConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPais.gridy = iPosYImportacion;
		this.gridBagConstraintsPais.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPais.add(this.jButtonAbrirImportacionPais, this.gridBagConstraintsPais);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPais = new JLabelMe();

		this.jLabelPathArchivoImportacionPais.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPais.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPais.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPais.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPais.gridy = iPosYImportacion;		
		this.gridBagConstraintsPais.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPais.add(this.jLabelPathArchivoImportacionPais, this.gridBagConstraintsPais);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPais=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPais.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPais.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPais.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPais.gridy = iPosYImportacion;
		this.gridBagConstraintsPais.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPais.add(this.jTextFieldPathArchivoImportacionPais, this.gridBagConstraintsPais);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPais = new JButtonMe();
		this.jButtonGenerarImportacionPais.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPais,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPais.setToolTipText("Generar"+" "+PaisConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPais.gridy = iPosYImportacion;
		this.gridBagConstraintsPais.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPais.add(this.jButtonGenerarImportacionPais, this.gridBagConstraintsPais);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPais = new JButtonMe();
		this.jButtonCerrarImportacionPais.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPais,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPais.setToolTipText("Cancelar"+" "+PaisConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPais.gridy = iPosYImportacion;
		this.gridBagConstraintsPais.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPais.add(this.jButtonCerrarImportacionPais, this.gridBagConstraintsPais);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPais = new GridBagLayout();
		
		this.jScrollPanelImportacionPais= new JScrollPane(jPanelImportacionPais,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.gridy =iPosYImportacion;
		this.gridBagConstraintsPais.gridx =iPosXImportacion;
		this.gridBagConstraintsPais.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPais.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPais.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPais);
		this.jInternalFrameImportacionPais.getContentPane().add(this.jScrollPanelImportacionPais, this.gridBagConstraintsPais);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPais(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPais = new JButtonMe();
			this.jButtonAbrirOrderByPais.setText("Orden");
			this.jButtonAbrirOrderByPais.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPais,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPais, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPais";
			inputMap = this.jButtonAbrirOrderByPais.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPais.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPais"));
		
		
			GridBagLayout gridaBagLayoutOrderByPais = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPais = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPais.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPais.setName("jPanelOrderByPais"); 
			
			this.jPanelOrderByPais.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPais.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPais.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPais, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPais.setLayout(gridaBagLayoutOrderByPais);
			
			
			this.jTableDatosPaisOrderBy = new JTableMe();        
			this.jTableDatosPaisOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPaisOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPaisOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPaisOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPaisOrderBy.setViewportView(this.jTableDatosPaisOrderBy);
			this.jTableDatosPaisOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPaisOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPais= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPais= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPais = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePais= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPais.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPais.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPais.setTitle("Orden");
			this.jInternalFrameOrderByPais.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPais.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPais.setResizable(true);
			this.jInternalFrameOrderByPais.setClosable(true);
			this.jInternalFrameOrderByPais.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPais, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPais.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPais.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPais.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPais, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPais.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Paises"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPais = new GridBagConstraints();
			this.gridBagConstraintsPais.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPais.gridx =iPosXOrderBy;
			this.gridBagConstraintsPais.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPais.ipady =150;
				
			this.jPanelOrderByPais.add(jScrollPanelDatosPaisOrderBy, this.gridBagConstraintsPais);//this.jTableDatosPaisTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPais = new JButtonMe();
			this.jButtonCerrarOrderByPais.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPais,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPais.setToolTipText("Cancelar"+" "+PaisConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPais, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPais = new GridBagConstraints();
			this.gridBagConstraintsPais.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPais.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPais.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPais.add(this.jButtonCerrarOrderByPais, this.gridBagConstraintsPais);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPais = new GridBagLayout();
			
			this.jScrollPanelOrderByPais= new JScrollPane(jPanelOrderByPais,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPais = new GridBagConstraints();
			this.gridBagConstraintsPais.gridy =iPosYOrderBy;
			this.gridBagConstraintsPais.gridx =iPosXOrderBy;
			this.gridBagConstraintsPais.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPais.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPais.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPais);
			
			this.jInternalFrameOrderByPais.getContentPane().add(this.jScrollPanelOrderByPais, this.gridBagConstraintsPais);			
		
		} else {
			this.jButtonAbrirOrderByPais = new JButtonMe();
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
		int iWidthTableCalculado=0;//1430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=300;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.paisSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPais.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPais.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPais.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPais.getRowHeight();//PaisConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.paisSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PaisConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPais.isSelected()) {
					iHeightTable=PaisConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PaisConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PaisConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PaisConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPais.isSelected()) {
					iHeightTable=PaisConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PaisConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PaisConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPais.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPais.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPais.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPais.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPais.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPais.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPais!=null && this.jInternalFrameOrderByPais.getjTableDatosOrderBy()!=null) {
			//if(!this.paisSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPais.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPais.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPais.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPais.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPais.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPais.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPais.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPais.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPais.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPais.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=paisLogic.getPaiss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=paiss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Pais> TraerPaisBeans(List<Pais> paiss,ArrayList<Classe> classes)throws Exception {
		try {
			for(Pais pais:paiss) {
					
				if(!(PaisConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PaisConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					pais.setsDetalleGeneralEntityReporte(PaisConstantesFunciones.getPaisDescripcion(pais));
										
						
					
					

					if(pais.getCiudads()!=null && Funciones.existeClass(classes,Ciudad.class)) {
						try{pais.setciudadsDescripcionReporte(new JRBeanCollectionDataSource(CiudadJInternalFrame.TraerCiudadBeans(pais.getCiudads(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(pais.getProvincias()!=null && Funciones.existeClass(classes,Provincia.class)) {
						try{pais.setprovinciasDescripcionReporte(new JRBeanCollectionDataSource(ProvinciaJInternalFrame.TraerProvinciaBeans(pais.getProvincias(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(pais.getRegions()!=null && Funciones.existeClass(classes,Region.class)) {
						try{pais.setregionsDescripcionReporte(new JRBeanCollectionDataSource(RegionJInternalFrame.TraerRegionBeans(pais.getRegions(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//pais.setsDetalleGeneralEntityReporte(pais.getsDetalleGeneralEntityReporte());
										
				}
				
				//paisbeans.add(paisbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return paiss;
    }
	//PARA REPORTES FIN
}
