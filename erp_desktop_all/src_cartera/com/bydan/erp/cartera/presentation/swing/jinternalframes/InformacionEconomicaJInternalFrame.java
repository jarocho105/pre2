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



import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;





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
import com.bydan.erp.cartera.util.InformacionEconomicaConstantesFunciones;

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
public class InformacionEconomicaJInternalFrame extends InformacionEconomicaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarInformacionEconomica;
	
	protected JMenuBar jmenuBarInformacionEconomica;
	
	protected JMenu jmenuInformacionEconomica;
	protected JMenu jmenuDatosInformacionEconomica;
	protected JMenu jmenuArchivoInformacionEconomica;
	protected JMenu jmenuAccionesInformacionEconomica;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosInformacionEconomica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutInformacionEconomica;	
	protected GridBagConstraints gridBagConstraintsInformacionEconomica;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public InformacionEconomicaDetalleFormJInternalFrame jInternalFrameDetalleFormInformacionEconomica;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoInformacionEconomica;	
	protected ImportacionJInternalFrame jInternalFrameImportacionInformacionEconomica;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoVinculacionBeanSwingJInternalFrame tipovinculacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipovinculacion="";
	
	public InformacionEconomicaSessionBean informacioneconomicaSessionBean;
		
	
	
	public ClienteSessionBean clienteSessionBean;
	public TipoVinculacionSessionBean tipovinculacionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<InformacionEconomica> informacioneconomicas;		
	public List<InformacionEconomica> informacioneconomicasEliminados;	
	public List<InformacionEconomica> informacioneconomicasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByInformacionEconomica;		
	protected JButton jButtonAbrirOrderByInformacionEconomica;
	
	
	//protected JPanel jPanelOrderByInformacionEconomica;
	//public JScrollPane jScrollPanelOrderByInformacionEconomica;	
	//protected JButton jButtonCerrarOrderByInformacionEconomica;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public InformacionEconomicaLogic informacioneconomicaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosInformacionEconomica;
	public JScrollPane jScrollPanelDatosEdicionInformacionEconomica;
	public JScrollPane jScrollPanelDatosGeneralInformacionEconomica;
    
	
	
	//public JScrollPane jScrollPanelDatosInformacionEconomicaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoInformacionEconomica;
	//public JScrollPane jScrollPanelImportacionInformacionEconomica;
	
	
	
	protected JPanel jPanelAccionesInformacionEconomica;
	
    protected JPanel jPanelPaginacionInformacionEconomica;
    protected JPanel jPanelParametrosReportesInformacionEconomica;
	protected JPanel jPanelParametrosReportesAccionesInformacionEconomica;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1InformacionEconomica;
	protected JPanel jPanelParametrosAuxiliar2InformacionEconomica;
	protected JPanel jPanelParametrosAuxiliar3InformacionEconomica;
	protected JPanel jPanelParametrosAuxiliar4InformacionEconomica;
	//protected JPanel jPanelParametrosAuxiliar5InformacionEconomica;
	
	
	
	//protected JPanel jPanelReporteDinamicoInformacionEconomica;
	//protected JPanel jPanelImportacionInformacionEconomica;
	
	
	public JTable jTableDatosInformacionEconomica;
	
	
	
	//public JTable jTableDatosInformacionEconomicaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoInformacionEconomica;
	protected JButton jButtonDuplicarInformacionEconomica;
	protected JButton jButtonCopiarInformacionEconomica;
	protected JButton jButtonVerFormInformacionEconomica;
	protected JButton jButtonNuevoRelacionesInformacionEconomica;
	protected JButton jButtonModificarInformacionEconomica;
	
    protected JButton jButtonGuardarCambiosTablaInformacionEconomica;
	protected JButton jButtonCerrarInformacionEconomica;
	
	
	protected JButton jButtonRecargarInformacionInformacionEconomica;
	protected JButton jButtonProcesarInformacionInformacionEconomica;
	
	
	protected JButton jButtonAnterioresInformacionEconomica;
	protected JButton jButtonSiguientesInformacionEconomica;
	protected JButton jButtonNuevoGuardarCambiosInformacionEconomica;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoInformacionEconomica;
	//protected JButton jButtonCerrarReporteDinamicoInformacionEconomica;
	//protected JButton jButtonGenerarExcelReporteDinamicoInformacionEconomica;	
	
	
	
	//protected JButton jButtonAbrirImportacionInformacionEconomica;
	//protected JButton jButtonGenerarImportacionInformacionEconomica;
	//protected JButton jButtonCerrarImportacionInformacionEconomica;
	//protected JFileChooser jFileChooserImportacionInformacionEconomica;
	//protected File fileImportacionInformacionEconomica;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarInformacionEconomica;
	protected JButton jButtonDuplicarToolBarInformacionEconomica;
	protected JButton jButtonNuevoRelacionesToolBarInformacionEconomica;
	
	
	public JButton jButtonGuardarCambiosToolBarInformacionEconomica;
	protected JButton jButtonCopiarToolBarInformacionEconomica;
	protected JButton jButtonVerFormToolBarInformacionEconomica;
	public JButton jButtonGuardarCambiosTablaToolBarInformacionEconomica;
	protected JButton jButtonMostrarOcultarTablaToolBarInformacionEconomica;
	protected JButton jButtonCerrarToolBarInformacionEconomica;
	
	protected JButton jButtonRecargarInformacionToolBarInformacionEconomica;
	protected JButton jButtonProcesarInformacionToolBarInformacionEconomica;
	protected JButton jButtonAnterioresToolBarInformacionEconomica;
	protected JButton jButtonSiguientesToolBarInformacionEconomica;
	protected JButton jButtonNuevoGuardarCambiosToolBarInformacionEconomica;
	protected JButton jButtonAbrirOrderByToolBarInformacionEconomica;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoInformacionEconomica;
	protected JMenuItem jMenuItemDuplicarInformacionEconomica;
	protected JMenuItem jMenuItemNuevoRelacionesInformacionEconomica;
	
	
	protected JMenuItem jMenuItemGuardarCambiosInformacionEconomica;
	protected JMenuItem jMenuItemCopiarInformacionEconomica;
	protected JMenuItem jMenuItemVerFormInformacionEconomica;
	protected JMenuItem jMenuItemGuardarCambiosTablaInformacionEconomica;
	protected JMenuItem jMenuItemCerrarInformacionEconomica;
	protected JMenuItem jMenuItemDetalleCerrarInformacionEconomica;
	protected JMenuItem jMenuItemDetalleAbrirOrderByInformacionEconomica;
	protected JMenuItem jMenuItemDetalleMostarOcultarInformacionEconomica;
	
	protected JMenuItem jMenuItemRecargarInformacionInformacionEconomica;
	protected JMenuItem jMenuItemProcesarInformacionInformacionEconomica;
	protected JMenuItem jMenuItemAnterioresInformacionEconomica;
	protected JMenuItem jMenuItemSiguientesInformacionEconomica;
	protected JMenuItem jMenuItemNuevoGuardarCambiosInformacionEconomica;
	protected JMenuItem jMenuItemAbrirOrderByInformacionEconomica;
	protected JMenuItem jMenuItemMostrarOcultarInformacionEconomica;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesInformacionEconomica;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosInformacionEconomica;
	protected JCheckBox jCheckBoxSeleccionadosInformacionEconomica;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaInformacionEconomica;
	protected JCheckBox jCheckBoxConGraficoReporteInformacionEconomica;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesInformacionEconomica;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesInformacionEconomica;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoInformacionEconomica;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoInformacionEconomica;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesInformacionEconomica;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionInformacionEconomica;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesInformacionEconomica;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesInformacionEconomica;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarInformacionEconomica;
	protected JTextField jTextFieldValorCampoGeneralInformacionEconomica;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteInformacionEconomica;
	//public JList<Reporte> jListColumnasSelectReporteInformacionEconomica;
	//public JScrollPane jScrollColumnasSelectReporteInformacionEconomica;
	
	//public JLabel jLabelRelacionesSelectReporteInformacionEconomica;
	//public JList<Reporte> jListRelacionesSelectReporteInformacionEconomica;
	//public JScrollPane jScrollRelacionesSelectReporteInformacionEconomica;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoInformacionEconomica;
	//protected JCheckBox jCheckBoxConGraficoDinamicoInformacionEconomica;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoInformacionEconomica;
	//public JLabel jLabelTiposArchivoReporteDinamicoInformacionEconomica;
	
		
	//public JLabel jLabelArchivoImportacionInformacionEconomica;	
	//public JLabel jLabelPathArchivoImportacionInformacionEconomica;
	//protected JTextField jTextFieldPathArchivoImportacionInformacionEconomica;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoInformacionEconomica;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoInformacionEconomica;
	
	//public JLabel jLabelColumnaCategoriaValorInformacionEconomica;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorInformacionEconomica;
	
	//public JLabel jLabelColumnasValoresGraficoInformacionEconomica;
	//public JList<Reporte> jListColumnasValoresGraficoInformacionEconomica;
	//public JScrollPane jScrollColumnasValoresGraficoInformacionEconomica;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoInformacionEconomica;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoInformacionEconomica;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasInformacionEconomica;
	public JPanel jPanelFK_IdClienteInformacionEconomica;
	public JButton jButtonFK_IdClienteInformacionEconomica;
	public JPanel jPanelFK_IdValorClienteVinculacionInformacionEconomica;
	public JButton jButtonFK_IdValorClienteVinculacionInformacionEconomica;
	
	public JPanel jPanelidclienteFK_IdClienteInformacionEconomica;
	public JLabel jLabelidclienteFK_IdClienteInformacionEconomica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidclienteFK_IdClienteInformacionEconomica;
	public JButton jButtonidclienteFK_IdClienteInformacionEconomica= new JButtonMe();
	public JButton jButtonidclienteFK_IdClienteInformacionEconomicaUpdate= new JButtonMe();
	public JButton jButtonidclienteFK_IdClienteInformacionEconomicaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteidclienteInformacionEconomica;
	
	public JPanel jPanelidvalorclientevinculacionFK_IdValorClienteVinculacionInformacionEconomica;
	public JLabel jLabelidvalorclientevinculacionFK_IdValorClienteVinculacionInformacionEconomica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidvalorclientevinculacionFK_IdValorClienteVinculacionInformacionEconomica;
	public JButton jButtonidvalorclientevinculacionFK_IdValorClienteVinculacionInformacionEconomica= new JButtonMe();
	public JButton jButtonidvalorclientevinculacionFK_IdValorClienteVinculacionInformacionEconomicaUpdate= new JButtonMe();
	public JButton jButtonidvalorclientevinculacionFK_IdValorClienteVinculacionInformacionEconomicaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=946;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public InformacionEconomicaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("InformacionEconomica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public InformacionEconomicaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("InformacionEconomica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public InformacionEconomicaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("InformacionEconomica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public InformacionEconomicaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("InformacionEconomica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionInformacionEconomica)	{
		this.jButtonRecargarInformacionInformacionEconomica = jButtonRecargarInformacionInformacionEconomica;
	}
	
	public JButton getjButtonProcesarInformacionInformacionEconomica() {
		return this.jButtonProcesarInformacionInformacionEconomica;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionInformacionEconomica)	{
		this.jButtonProcesarInformacionInformacionEconomica = jButtonProcesarInformacionInformacionEconomica;
	}
	
	
	public JButton getjButtonRecargarInformacionInformacionEconomica() {
		return this.jButtonRecargarInformacionInformacionEconomica;
	}
	
	
	public List<InformacionEconomica> getinformacioneconomicas() {
		return this.informacioneconomicas;
	}

	public void setinformacioneconomicas(List<InformacionEconomica> informacioneconomicas) {
		this.informacioneconomicas = informacioneconomicas;
	}
	
	public List<InformacionEconomica> getinformacioneconomicasAux() {
		return this.informacioneconomicasAux;
	}

	public void setinformacioneconomicasAux(List<InformacionEconomica> informacioneconomicasAux) {
		this.informacioneconomicasAux = informacioneconomicasAux;
	}
	
	public List<InformacionEconomica> getinformacioneconomicasEliminados() {
		return this.informacioneconomicasEliminados;
	}

	public void setInformacionEconomicasEliminados(List<InformacionEconomica> informacioneconomicasEliminados) {
		this.informacioneconomicasEliminados = informacioneconomicasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarInformacionEconomica() {
		return jComboBoxTiposSeleccionarInformacionEconomica;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarInformacionEconomica(
			JComboBox jComboBoxTiposSeleccionarInformacionEconomica) {
		this.jComboBoxTiposSeleccionarInformacionEconomica = jComboBoxTiposSeleccionarInformacionEconomica;
	}
	
	public void setBorderResaltarTiposSeleccionarInformacionEconomica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarInformacionEconomica.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarInformacionEconomica .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralInformacionEconomica() {
		return jTextFieldValorCampoGeneralInformacionEconomica;
	}

	public void setjTextFieldValorCampoGeneralInformacionEconomica(
			JTextField jTextFieldValorCampoGeneralInformacionEconomica) {
		this.jTextFieldValorCampoGeneralInformacionEconomica = jTextFieldValorCampoGeneralInformacionEconomica;
	}

	public void setBorderResaltarValorCampoGeneralInformacionEconomica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInformacionEconomica.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralInformacionEconomica .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosInformacionEconomica() {
		return this.jCheckBoxSeleccionarTodosInformacionEconomica;
	}

	public void setjCheckBoxSeleccionarTodosInformacionEconomica(
			JCheckBox jCheckBoxSeleccionarTodosInformacionEconomica) {
		this.jCheckBoxSeleccionarTodosInformacionEconomica = jCheckBoxSeleccionarTodosInformacionEconomica;
	}

	public void setBorderResaltarSeleccionarTodosInformacionEconomica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInformacionEconomica.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosInformacionEconomica .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosInformacionEconomica() {
		return this.jCheckBoxSeleccionadosInformacionEconomica;
	}

	public void setjCheckBoxSeleccionadosInformacionEconomica(
			JCheckBox jCheckBoxSeleccionadosInformacionEconomica) {
		this.jCheckBoxSeleccionadosInformacionEconomica = jCheckBoxSeleccionadosInformacionEconomica;
	}
	
	public void setBorderResaltarSeleccionadosInformacionEconomica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInformacionEconomica.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosInformacionEconomica .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesInformacionEconomica() {
		return this.jComboBoxTiposArchivosReportesInformacionEconomica;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesInformacionEconomica(
			JComboBox jComboBoxTiposArchivosReportesInformacionEconomica) {
		this.jComboBoxTiposArchivosReportesInformacionEconomica = jComboBoxTiposArchivosReportesInformacionEconomica;
	}

	public void setBorderResaltarTiposArchivosReportesInformacionEconomica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInformacionEconomica.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesInformacionEconomica .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesInformacionEconomica() {
		return this.jComboBoxTiposReportesInformacionEconomica;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesInformacionEconomica(
			JComboBox jComboBoxTiposReportesInformacionEconomica) {
		this.jComboBoxTiposReportesInformacionEconomica = jComboBoxTiposReportesInformacionEconomica;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoInformacionEconomica() {
	//	return jComboBoxTiposReportesDinamicoInformacionEconomica;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoInformacionEconomica(
	//		JComboBox jComboBoxTiposReportesDinamicoInformacionEconomica) {
	//	this.jComboBoxTiposReportesDinamicoInformacionEconomica = jComboBoxTiposReportesDinamicoInformacionEconomica;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoInformacionEconomica() {
	//	return jComboBoxTiposArchivosReportesDinamicoInformacionEconomica;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoInformacionEconomica(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoInformacionEconomica) {
	//	this.jComboBoxTiposArchivosReportesDinamicoInformacionEconomica = jComboBoxTiposArchivosReportesDinamicoInformacionEconomica;
	//}
	
	public void setBorderResaltarTiposReportesInformacionEconomica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInformacionEconomica.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesInformacionEconomica .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesInformacionEconomica() {
		return this.jComboBoxTiposGraficosReportesInformacionEconomica;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesInformacionEconomica(
			JComboBox jComboBoxTiposGraficosReportesInformacionEconomica) {
		this.jComboBoxTiposGraficosReportesInformacionEconomica = jComboBoxTiposGraficosReportesInformacionEconomica;
	}
	
	public void setBorderResaltarTiposGraficosReportesInformacionEconomica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInformacionEconomica.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesInformacionEconomica .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionInformacionEconomica() {
		return this.jComboBoxTiposPaginacionInformacionEconomica;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionInformacionEconomica(
			JComboBox jComboBoxTiposPaginacionInformacionEconomica) {
		this.jComboBoxTiposPaginacionInformacionEconomica = jComboBoxTiposPaginacionInformacionEconomica;
	}
	
	public void setBorderResaltarTiposPaginacionInformacionEconomica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInformacionEconomica.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionInformacionEconomica .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesInformacionEconomica() {
		return this.jComboBoxTiposRelacionesInformacionEconomica;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesInformacionEconomica() {
		return this.jComboBoxTiposAccionesInformacionEconomica;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesInformacionEconomica(
			JComboBox jComboBoxTiposRelacionesInformacionEconomica) {
		this.jComboBoxTiposRelacionesInformacionEconomica = jComboBoxTiposRelacionesInformacionEconomica;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesInformacionEconomica(
			JComboBox jComboBoxTiposAccionesInformacionEconomica) {
		this.jComboBoxTiposAccionesInformacionEconomica = jComboBoxTiposAccionesInformacionEconomica;
	}
	
	public void setBorderResaltarTiposRelacionesInformacionEconomica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInformacionEconomica.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesInformacionEconomica .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesInformacionEconomica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInformacionEconomica.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesInformacionEconomica .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoInformacionEconomica() {
	//	return jCheckBoxConGraficoDinamicoInformacionEconomica;
	//}

	//public void setjCheckBoxConGraficoDinamicoInformacionEconomica(
	//		JCheckBox jCheckBoxConGraficoDinamicoInformacionEconomica) {
	//	this.jCheckBoxConGraficoDinamicoInformacionEconomica = jCheckBoxConGraficoDinamicoInformacionEconomica;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoInformacionEconomica() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarInformacionEconomica.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoInformacionEconomica .setBorder(borderResaltar);		
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
		this.informacioneconomicaSessionBean=new InformacionEconomicaSessionBean();
		
		this.informacioneconomicaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.informacioneconomicaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.informacioneconomicaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=InformacionEconomicaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=InformacionEconomicaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		InformacionEconomicaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		InformacionEconomicaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		InformacionEconomicaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Informacion Economica MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {
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
		
		InformacionEconomicaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("InformacionEconomica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarInformacionEconomica= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarInformacionEconomica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarInformacionEconomica,this.jTtoolBarInformacionEconomica,
							"nuevo","nuevo","Nuevo"+" "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarInformacionEconomica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarInformacionEconomica,this.jTtoolBarInformacionEconomica,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarInformacionEconomica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarInformacionEconomica,this.jTtoolBarInformacionEconomica,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarInformacionEconomica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarInformacionEconomica,this.jTtoolBarInformacionEconomica,
							"duplicar","duplicar","Duplicar"+" "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarInformacionEconomica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarInformacionEconomica,this.jTtoolBarInformacionEconomica,
							"copiar","copiar","Copiar"+" "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarInformacionEconomica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarInformacionEconomica,this.jTtoolBarInformacionEconomica,
							"ver_form","ver_form","Ver"+" "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarInformacionEconomica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarInformacionEconomica,this.jTtoolBarInformacionEconomica,
							"recargar","recargar","Recargar"+" "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarInformacionEconomica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarInformacionEconomica,this.jTtoolBarInformacionEconomica,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarInformacionEconomica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarInformacionEconomica,this.jTtoolBarInformacionEconomica,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarInformacionEconomica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarInformacionEconomica,this.jTtoolBarInformacionEconomica,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarInformacionEconomica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarInformacionEconomica,this.jTtoolBarInformacionEconomica,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarInformacionEconomica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarInformacionEconomica,this.jTtoolBarInformacionEconomica,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarInformacionEconomica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarInformacionEconomica,this.jTtoolBarInformacionEconomica,
							"cerrar","cerrar","Salir"+" "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarInformacionEconomica=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarInformacionEconomica;
			
				this.jButtonProcesarInformacionToolBarInformacionEconomica=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarInformacionEconomica;
				
		//protected JButton jButtonModificarToolBarInformacionEconomica;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarInformacionEconomica=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuInformacionEconomica=new JMenuMe("General");
		this.jmenuArchivoInformacionEconomica=new JMenuMe("Archivo");
		this.jmenuAccionesInformacionEconomica=new JMenuMe("Acciones");
		this.jmenuDatosInformacionEconomica=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoInformacionEconomica= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoInformacionEconomica.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoInformacionEconomica,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarInformacionEconomica= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarInformacionEconomica.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarInformacionEconomica,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesInformacionEconomica= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesInformacionEconomica.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesInformacionEconomica,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosInformacionEconomica= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosInformacionEconomica.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosInformacionEconomica,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarInformacionEconomica= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarInformacionEconomica.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarInformacionEconomica,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormInformacionEconomica= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormInformacionEconomica.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormInformacionEconomica,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaInformacionEconomica= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaInformacionEconomica.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaInformacionEconomica,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarInformacionEconomica= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarInformacionEconomica.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarInformacionEconomica,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionInformacionEconomica= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionInformacionEconomica.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionInformacionEconomica,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionInformacionEconomica= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionInformacionEconomica.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionInformacionEconomica,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresInformacionEconomica= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresInformacionEconomica.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresInformacionEconomica,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesInformacionEconomica= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesInformacionEconomica.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesInformacionEconomica,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByInformacionEconomica= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByInformacionEconomica.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByInformacionEconomica,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarInformacionEconomica= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarInformacionEconomica.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarInformacionEconomica,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByInformacionEconomica= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByInformacionEconomica.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByInformacionEconomica,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarInformacionEconomica= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarInformacionEconomica.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarInformacionEconomica,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosInformacionEconomica= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosInformacionEconomica.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosInformacionEconomica,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoInformacionEconomica.add(this.jMenuItemCerrarInformacionEconomica);
			
			this.jmenuAccionesInformacionEconomica.add(this.jMenuItemNuevoInformacionEconomica);
			this.jmenuAccionesInformacionEconomica.add(this.jMenuItemNuevoGuardarCambiosInformacionEconomica);
			this.jmenuAccionesInformacionEconomica.add(this.jMenuItemNuevoRelacionesInformacionEconomica);
			this.jmenuAccionesInformacionEconomica.add(this.jMenuItemGuardarCambiosTablaInformacionEconomica);		
			this.jmenuAccionesInformacionEconomica.add(this.jMenuItemDuplicarInformacionEconomica);		
			this.jmenuAccionesInformacionEconomica.add(this.jMenuItemCopiarInformacionEconomica);		
			this.jmenuAccionesInformacionEconomica.add(this.jMenuItemVerFormInformacionEconomica);		
			
			this.jmenuDatosInformacionEconomica.add(this.jMenuItemRecargarInformacionInformacionEconomica);				
			this.jmenuDatosInformacionEconomica.add(this.jMenuItemAnterioresInformacionEconomica);				
			this.jmenuDatosInformacionEconomica.add(this.jMenuItemSiguientesInformacionEconomica);				
			this.jmenuDatosInformacionEconomica.add(this.jMenuItemAbrirOrderByInformacionEconomica);				
			this.jmenuDatosInformacionEconomica.add(this.jMenuItemMostrarOcultarInformacionEconomica);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesInformacionEconomica.add(this.jMenuItemGuardarCambiosInformacionEconomica);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarInformacionEconomica.add(this.jmenuArchivoInformacionEconomica);		
			this.jmenuBarInformacionEconomica.add(this.jmenuAccionesInformacionEconomica);		
			this.jmenuBarInformacionEconomica.add(this.jmenuDatosInformacionEconomica);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarInformacionEconomica);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasInformacionEconomica() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClienteInformacionEconomica=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteInformacionEconomica.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteInformacionEconomica= new JButtonMe();
		this.jButtonFK_IdClienteInformacionEconomica.setText("Buscar");
		this.jButtonFK_IdClienteInformacionEconomica.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteInformacionEconomica,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelidclienteFK_IdClienteInformacionEconomica = new JLabelMe();
		jLabelidclienteFK_IdClienteInformacionEconomica.setText("Cliente :");
		jLabelidclienteFK_IdClienteInformacionEconomica.setToolTipText("Cliente");
		jLabelidclienteFK_IdClienteInformacionEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidclienteFK_IdClienteInformacionEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidclienteFK_IdClienteInformacionEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelidclienteFK_IdClienteInformacionEconomica,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxidclienteFK_IdClienteInformacionEconomica= new JComboBoxMe();
		jComboBoxidclienteFK_IdClienteInformacionEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteFK_IdClienteInformacionEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteFK_IdClienteInformacionEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidclienteFK_IdClienteInformacionEconomica,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteidclienteInformacionEconomica= new JButtonMe();
		this.jButtonBuscarFK_IdClienteidclienteInformacionEconomica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteidclienteInformacionEconomica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteidclienteInformacionEconomica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteidclienteInformacionEconomica.setText("Buscar");
		this.jButtonBuscarFK_IdClienteidclienteInformacionEconomica.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteidclienteInformacionEconomica.setFocusable(false);

		this.jPanelFK_IdValorClienteVinculacionInformacionEconomica=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdValorClienteVinculacionInformacionEconomica.setToolTipText("Buscar Por Tipo Vinculacion ");
		this.jButtonFK_IdValorClienteVinculacionInformacionEconomica= new JButtonMe();
		this.jButtonFK_IdValorClienteVinculacionInformacionEconomica.setText("Buscar");
		this.jButtonFK_IdValorClienteVinculacionInformacionEconomica.setToolTipText("Buscar Por Tipo Vinculacion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdValorClienteVinculacionInformacionEconomica,"buscar_button","Buscar Por Tipo Vinculacion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdValorClienteVinculacionInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelidvalorclientevinculacionFK_IdValorClienteVinculacionInformacionEconomica = new JLabelMe();
		jLabelidvalorclientevinculacionFK_IdValorClienteVinculacionInformacionEconomica.setText("Tipo Vinculacion :");
		jLabelidvalorclientevinculacionFK_IdValorClienteVinculacionInformacionEconomica.setToolTipText("Tipo Vinculacion");
		jLabelidvalorclientevinculacionFK_IdValorClienteVinculacionInformacionEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelidvalorclientevinculacionFK_IdValorClienteVinculacionInformacionEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelidvalorclientevinculacionFK_IdValorClienteVinculacionInformacionEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelidvalorclientevinculacionFK_IdValorClienteVinculacionInformacionEconomica,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxidvalorclientevinculacionFK_IdValorClienteVinculacionInformacionEconomica= new JComboBoxMe();
		jComboBoxidvalorclientevinculacionFK_IdValorClienteVinculacionInformacionEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientevinculacionFK_IdValorClienteVinculacionInformacionEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientevinculacionFK_IdValorClienteVinculacionInformacionEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidvalorclientevinculacionFK_IdValorClienteVinculacionInformacionEconomica,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasInformacionEconomica=new JTabbedPane();


		this.jTabbedPaneBusquedasInformacionEconomica.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasInformacionEconomica.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasInformacionEconomica.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasInformacionEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasInformacionEconomica.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasInformacionEconomica,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleInformacionEconomica = new InformacionEconomicaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Informacion Economica DATOS");
			this.jInternalFrameDetalleFormInformacionEconomica = new InformacionEconomicaDetalleFormJInternalFrame(jDesktopPane,this.informacioneconomicaSessionBean.getConGuardarRelaciones(),this.informacioneconomicaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormInformacionEconomica = null;//new InformacionEconomicaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutInformacionEconomica= new GridBagLayout();
		
		
		this.jTableDatosInformacionEconomica = new JTableMe();      
		
		String sToolTipInformacionEconomica="";
		sToolTipInformacionEconomica=InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipInformacionEconomica+="(Cartera.InformacionEconomica)";
		}
		
		if(!this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {
			sToolTipInformacionEconomica+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosInformacionEconomica.setToolTipText(sToolTipInformacionEconomica);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosInformacionEconomica);
		this.jTableDatosInformacionEconomica.setAutoCreateRowSorter(true);
		this.jTableDatosInformacionEconomica.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosInformacionEconomica.setRowSelectionAllowed(true);
		this.jTableDatosInformacionEconomica.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosInformacionEconomica,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoInformacionEconomica = new JButtonMe();
		this.jButtonDuplicarInformacionEconomica = new JButtonMe();
		this.jButtonCopiarInformacionEconomica = new JButtonMe();
		this.jButtonVerFormInformacionEconomica = new JButtonMe();
		this.jButtonNuevoRelacionesInformacionEconomica = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaInformacionEconomica = new JButtonMe();
		this.jButtonCerrarInformacionEconomica = new JButtonMe();
		
		this.jScrollPanelDatosInformacionEconomica = new JScrollPane();   
        this.jScrollPanelDatosGeneralInformacionEconomica = new JScrollPane();
		
				
		
		
		this.jPanelAccionesInformacionEconomica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Informacion Economica";
		
		if(!this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosInformacionEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Informacion Economicas" + this.sPath));
		} else {
			this.jScrollPanelDatosInformacionEconomica.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralInformacionEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesInformacionEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesInformacionEconomica.setToolTipText("Acciones");
        this.jPanelAccionesInformacionEconomica.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralInformacionEconomica, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosInformacionEconomica, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoInformacionEconomica=new ReporteDinamicoJInternalFrame(InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoInformacionEconomica();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionInformacionEconomica=new ImportacionJInternalFrame(InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionInformacionEconomica();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByInformacionEconomica = new JButtonMe();
		
		this.jButtonAbrirOrderByInformacionEconomica.setText("Orden");
		this.jButtonAbrirOrderByInformacionEconomica.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByInformacionEconomica,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByInformacionEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByInformacionEconomica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByInformacionEconomica=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByInformacionEconomica,false,this);
			
			//this.cargarOrderByInformacionEconomica(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByInformacionEconomica=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByInformacionEconomica,true,this);
			
			//this.cargarOrderByInformacionEconomica(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosInformacionEconomica.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosInformacionEconomica.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosInformacionEconomica.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosInformacionEconomica.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosInformacionEconomica.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosInformacionEconomica.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoInformacionEconomica.setText("Nuevo");
		this.jButtonDuplicarInformacionEconomica.setText("Duplicar");
		this.jButtonCopiarInformacionEconomica.setText("Copiar");
		this.jButtonVerFormInformacionEconomica.setText("Ver");
		this.jButtonNuevoRelacionesInformacionEconomica.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaInformacionEconomica.setText("Guardar");
		this.jButtonCerrarInformacionEconomica.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoInformacionEconomica,"nuevo_button","Nuevo",this.informacioneconomicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarInformacionEconomica,"duplicar_button","Duplicar",this.informacioneconomicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarInformacionEconomica,"copiar_button","Copiar",this.informacioneconomicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormInformacionEconomica,"ver_form","Ver",this.informacioneconomicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesInformacionEconomica,"nuevorelaciones_button","Nuevo Rel",this.informacioneconomicaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaInformacionEconomica,"guardarcambiostabla_button","Guardar",this.informacioneconomicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarInformacionEconomica,"cerrar_button","Salir",this.informacioneconomicaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoInformacionEconomica.setToolTipText("Nuevo"+" "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarInformacionEconomica.setToolTipText("Duplicar"+" "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarInformacionEconomica.setToolTipText("Copiar"+" "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormInformacionEconomica.setToolTipText("Ver"+" "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesInformacionEconomica.setToolTipText("Nuevo Rel"+" "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaInformacionEconomica.setToolTipText("Guardar"+" "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarInformacionEconomica.setToolTipText("Salir"+" "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoInformacionEconomica";
		inputMap = this.jButtonNuevoInformacionEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoInformacionEconomica.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoInformacionEconomica"));
		
		//DUPLICAR
		sMapKey = "DuplicarInformacionEconomica";
		inputMap = this.jButtonDuplicarInformacionEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarInformacionEconomica.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarInformacionEconomica"));
		
		//COPIAR
		sMapKey = "CopiarInformacionEconomica";
		inputMap = this.jButtonCopiarInformacionEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarInformacionEconomica.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarInformacionEconomica"));
		
		//VEr FORM
		sMapKey = "VerFormInformacionEconomica";
		inputMap = this.jButtonVerFormInformacionEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormInformacionEconomica.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormInformacionEconomica"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesInformacionEconomica";
		inputMap = this.jButtonNuevoRelacionesInformacionEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesInformacionEconomica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesInformacionEconomica"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarInformacionEconomica";
		inputMap = this.jButtonModificarInformacionEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarInformacionEconomica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarInformacionEconomica"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarInformacionEconomica";
		inputMap = this.jButtonCerrarInformacionEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarInformacionEconomica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarInformacionEconomica"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaInformacionEconomica";
		inputMap = this.jButtonGuardarCambiosTablaInformacionEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaInformacionEconomica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaInformacionEconomica"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesInformacionEconomica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesInformacionEconomica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionInformacionEconomica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1InformacionEconomica= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2InformacionEconomica= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3InformacionEconomica= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4InformacionEconomica= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5InformacionEconomica= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesInformacionEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesInformacionEconomica.setName("jPanelParametrosReportesInformacionEconomica"); 
		
		this.jPanelParametrosReportesAccionesInformacionEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesInformacionEconomica.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesInformacionEconomica.setName("jPanelParametrosReportesAccionesInformacionEconomica"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesInformacionEconomica, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesInformacionEconomica, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionInformacionEconomica = new JButtonMe();
		this.jButtonRecargarInformacionInformacionEconomica.setText("Recargar");
		this.jButtonRecargarInformacionInformacionEconomica.setToolTipText("Recargar"+" "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionInformacionEconomica,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionInformacionEconomica = new JButtonMe();
		this.jButtonProcesarInformacionInformacionEconomica.setText("Procesar");
		this.jButtonProcesarInformacionInformacionEconomica.setToolTipText("Procesar"+" "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionInformacionEconomica.setVisible(false);
			
		this.jButtonProcesarInformacionInformacionEconomica.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionInformacionEconomica.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionInformacionEconomica.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesInformacionEconomica = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesInformacionEconomica.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesInformacionEconomica.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesInformacionEconomica = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesInformacionEconomica.setText("TIPO");       
		this.jComboBoxTiposReportesInformacionEconomica.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesInformacionEconomica = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesInformacionEconomica.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesInformacionEconomica.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionInformacionEconomica = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionInformacionEconomica.setText("Paginacion");
		this.jComboBoxTiposPaginacionInformacionEconomica.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesInformacionEconomica = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesInformacionEconomica.setText("Accion");
		this.jComboBoxTiposRelacionesInformacionEconomica.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesInformacionEconomica = new JComboBoxMe();
		//this.jComboBoxTiposAccionesInformacionEconomica.setText("Accion");
		this.jComboBoxTiposAccionesInformacionEconomica.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarInformacionEconomica = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarInformacionEconomica.setText("Accion");
		this.jComboBoxTiposSeleccionarInformacionEconomica.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralInformacionEconomica=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralInformacionEconomica.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralInformacionEconomica.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralInformacionEconomica.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesInformacionEconomica = new JLabelMe();
		
		this.jLabelAccionesInformacionEconomica.setText("Acciones");		
		this.jLabelAccionesInformacionEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesInformacionEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesInformacionEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosInformacionEconomica = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosInformacionEconomica.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosInformacionEconomica.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosInformacionEconomica = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosInformacionEconomica.setText("Seleccionados");
		this.jCheckBoxSeleccionadosInformacionEconomica.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaInformacionEconomica = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaInformacionEconomica.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaInformacionEconomica.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteInformacionEconomica = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteInformacionEconomica.setText("Graf.");
		this.jCheckBoxConGraficoReporteInformacionEconomica.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresInformacionEconomica = new JButtonMe();
		//this.jButtonAnterioresInformacionEconomica.setText("<<");
        this.jButtonAnterioresInformacionEconomica.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresInformacionEconomica,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesInformacionEconomica = new JButtonMe();
		//this.jButtonSiguientesInformacionEconomica.setText(">>");
        this.jButtonSiguientesInformacionEconomica.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesInformacionEconomica,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosInformacionEconomica = new JButtonMe();
		this.jButtonNuevoGuardarCambiosInformacionEconomica.setText("Nue");
        this.jButtonNuevoGuardarCambiosInformacionEconomica.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosInformacionEconomica,"nuevoguardarcambios_button","Nue",this.informacioneconomicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosInformacionEconomica";
		inputMap = this.jButtonNuevoGuardarCambiosInformacionEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosInformacionEconomica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosInformacionEconomica"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionInformacionEconomica";
		inputMap = this.jButtonRecargarInformacionInformacionEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionInformacionEconomica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionInformacionEconomica"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesInformacionEconomica";
		inputMap = this.jButtonSiguientesInformacionEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesInformacionEconomica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesInformacionEconomica"));
		
		//ANTERIORES		
		sMapKey = "AnterioresInformacionEconomica";
		inputMap = this.jButtonAnterioresInformacionEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresInformacionEconomica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresInformacionEconomica"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasInformacionEconomica();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesInformacionEconomica.setMinimumSize(new Dimension(this.getWidth(),InformacionEconomicaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(InformacionEconomicaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesInformacionEconomica.setMaximumSize(new Dimension(this.getWidth(),InformacionEconomicaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(InformacionEconomicaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesInformacionEconomica.setPreferredSize(new Dimension(this.getWidth(),InformacionEconomicaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(InformacionEconomicaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionInformacionEconomica = new GridBagLayout();

			this.jPanelPaginacionInformacionEconomica.setLayout(gridaBagLayoutPaginacionInformacionEconomica);						
			
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			this.gridBagConstraintsInformacionEconomica.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionEconomica.gridy = 0;
			this.gridBagConstraintsInformacionEconomica.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionInformacionEconomica.add(this.jButtonAnterioresInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
					
						
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			this.gridBagConstraintsInformacionEconomica.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsInformacionEconomica.gridy = 0;
			
			this.jPanelPaginacionInformacionEconomica.add(this.jButtonNuevoGuardarCambiosInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
						
			
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			this.gridBagConstraintsInformacionEconomica.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsInformacionEconomica.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsInformacionEconomica.gridy = 0;
			this.jPanelPaginacionInformacionEconomica.add(this.jButtonSiguientesInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionEconomica.gridy = 1;
			this.gridBagConstraintsInformacionEconomica.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionInformacionEconomica.add(this.jButtonNuevoInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
						
			
			
			if(!this.informacioneconomicaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
				this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsInformacionEconomica.gridy = 1;
				this.gridBagConstraintsInformacionEconomica.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionInformacionEconomica.add(this.jButtonGuardarCambiosTablaInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
			}
			
			
			
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionEconomica.gridy = 1;
			this.gridBagConstraintsInformacionEconomica.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionInformacionEconomica.add(this.jButtonDuplicarInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
			
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionEconomica.gridy = 1;
			this.gridBagConstraintsInformacionEconomica.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionInformacionEconomica.add(this.jButtonCopiarInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
		
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionEconomica.gridy = 1;
			this.gridBagConstraintsInformacionEconomica.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionInformacionEconomica.add(this.jButtonVerFormInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
		
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionEconomica.gridy = 1;
			this.gridBagConstraintsInformacionEconomica.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionInformacionEconomica.add(this.jButtonCerrarInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
		
		
		
		this.jButtonRecargarInformacionInformacionEconomica.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionInformacionEconomica.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionInformacionEconomica.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesInformacionEconomica.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesInformacionEconomica.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesInformacionEconomica.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesInformacionEconomica.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesInformacionEconomica.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesInformacionEconomica.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesInformacionEconomica.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesInformacionEconomica.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesInformacionEconomica.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionInformacionEconomica.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionInformacionEconomica.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionInformacionEconomica.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesInformacionEconomica.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesInformacionEconomica.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesInformacionEconomica.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesInformacionEconomica.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesInformacionEconomica.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesInformacionEconomica.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarInformacionEconomica.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarInformacionEconomica.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarInformacionEconomica.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaInformacionEconomica.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaInformacionEconomica.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaInformacionEconomica.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteInformacionEconomica.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteInformacionEconomica.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteInformacionEconomica.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosInformacionEconomica.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosInformacionEconomica.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosInformacionEconomica.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosInformacionEconomica.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosInformacionEconomica.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosInformacionEconomica.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesInformacionEconomica = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesInformacionEconomica = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1InformacionEconomica = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2InformacionEconomica = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3InformacionEconomica = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4InformacionEconomica = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesInformacionEconomica.setLayout(gridaBagParametrosReportesInformacionEconomica);
			this.jPanelParametrosReportesAccionesInformacionEconomica.setLayout(gridaBagParametrosReportesAccionesInformacionEconomica);
			
			
			this.jPanelParametrosAuxiliar1InformacionEconomica.setLayout(gridaBagParametrosAuxiliar1InformacionEconomica);
			this.jPanelParametrosAuxiliar2InformacionEconomica.setLayout(gridaBagParametrosAuxiliar2InformacionEconomica);
			this.jPanelParametrosAuxiliar3InformacionEconomica.setLayout(gridaBagParametrosAuxiliar3InformacionEconomica);
			this.jPanelParametrosAuxiliar4InformacionEconomica.setLayout(gridaBagParametrosAuxiliar4InformacionEconomica);
			//this.jPanelParametrosAuxiliar5InformacionEconomica.setLayout(gridaBagParametrosAuxiliar2InformacionEconomica);			
			
			
			
			
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionEconomica.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsInformacionEconomica.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesInformacionEconomica.add(this.jButtonRecargarInformacionInformacionEconomica, this.gridBagConstraintsInformacionEconomica);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			this.gridBagConstraintsInformacionEconomica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionEconomica.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsInformacionEconomica.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1InformacionEconomica.add(this.jComboBoxTiposPaginacionInformacionEconomica, this.gridBagConstraintsInformacionEconomica);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			this.gridBagConstraintsInformacionEconomica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionEconomica.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsInformacionEconomica.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1InformacionEconomica.add(this.jCheckBoxConAltoMaximoTablaInformacionEconomica, this.gridBagConstraintsInformacionEconomica);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			this.gridBagConstraintsInformacionEconomica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionEconomica.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsInformacionEconomica.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1InformacionEconomica.add(this.jComboBoxTiposArchivosReportesInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			this.gridBagConstraintsInformacionEconomica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionEconomica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInformacionEconomica.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesInformacionEconomica.add(this.jPanelParametrosAuxiliar1InformacionEconomica, this.gridBagConstraintsInformacionEconomica);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			this.gridBagConstraintsInformacionEconomica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionEconomica.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsInformacionEconomica.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4InformacionEconomica.add(this.jComboBoxTiposReportesInformacionEconomica, this.gridBagConstraintsInformacionEconomica);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			this.gridBagConstraintsInformacionEconomica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionEconomica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInformacionEconomica.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesInformacionEconomica.add(this.jPanelParametrosAuxiliar4InformacionEconomica, this.gridBagConstraintsInformacionEconomica);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			this.gridBagConstraintsInformacionEconomica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionEconomica.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsInformacionEconomica.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesInformacionEconomica.add(this.jComboBoxTiposReportesInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			this.gridBagConstraintsInformacionEconomica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionEconomica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInformacionEconomica.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesInformacionEconomica.add(this.jCheckBoxGenerarReporteInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			this.gridBagConstraintsInformacionEconomica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionEconomica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInformacionEconomica.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesInformacionEconomica.add(this.jPanelParametrosAuxiliar2InformacionEconomica, this.gridBagConstraintsInformacionEconomica);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionEconomica.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsInformacionEconomica.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesInformacionEconomica.add(this.jLabelAccionesInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
				this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsInformacionEconomica.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsInformacionEconomica.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesInformacionEconomica.add(this.jButtonAbrirOrderByInformacionEconomica, this.gridBagConstraintsInformacionEconomica);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsInformacionEconomica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInformacionEconomica.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesInformacionEconomica.add(this.jComboBoxTiposSeleccionarInformacionEconomica, this.gridBagConstraintsInformacionEconomica);			
			
			
			/*
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionEconomica.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsInformacionEconomica.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesInformacionEconomica.add(this.jCheckBoxSeleccionarTodosInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			this.gridBagConstraintsInformacionEconomica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionEconomica.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsInformacionEconomica.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3InformacionEconomica.add(this.jCheckBoxSeleccionarTodosInformacionEconomica, this.gridBagConstraintsInformacionEconomica);															
				
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			this.gridBagConstraintsInformacionEconomica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionEconomica.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsInformacionEconomica.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3InformacionEconomica.add(this.jCheckBoxSeleccionadosInformacionEconomica, this.gridBagConstraintsInformacionEconomica);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			this.gridBagConstraintsInformacionEconomica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionEconomica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInformacionEconomica.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesInformacionEconomica.add(this.jPanelParametrosAuxiliar3InformacionEconomica, this.gridBagConstraintsInformacionEconomica);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			this.gridBagConstraintsInformacionEconomica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInformacionEconomica.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesInformacionEconomica.add(this.jComboBoxTiposAccionesInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
	
				
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			this.gridBagConstraintsInformacionEconomica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInformacionEconomica.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesInformacionEconomica.add(this.jTextFieldValorCampoGeneralInformacionEconomica, this.gridBagConstraintsInformacionEconomica);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosInformacionEconomica = new GridBagLayout();

			this.jScrollPanelDatosInformacionEconomica.setLayout(gridaBagLayoutDatosInformacionEconomica);
			
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionEconomica.gridy = 0;
			this.gridBagConstraintsInformacionEconomica.gridx = 0;
			
			this.jScrollPanelDatosInformacionEconomica.add(this.jTableDatosInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosInformacionEconomica.setViewportView(this.jTableDatosInformacionEconomica);
		this.jTableDatosInformacionEconomica.setFillsViewportHeight(true);
		this.jTableDatosInformacionEconomica.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesInformacionEconomica= new GridBagLayout();
		this.jPanelAccionesInformacionEconomica.setLayout(gridaBagLayoutAccionesInformacionEconomica);
		
		
		/*	
		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformacionEconomica.gridy = 0;
		this.gridBagConstraintsInformacionEconomica.gridx = 0;
			
		this.jPanelAccionesInformacionEconomica.add(this.jButtonNuevoInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClienteInformacionEconomica= new GridBagLayout();
		gridaBagLayoutFK_IdClienteInformacionEconomica.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteInformacionEconomica.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteInformacionEconomica.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteInformacionEconomica.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteInformacionEconomica.setLayout(gridaBagLayoutFK_IdClienteInformacionEconomica);

		gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		gridBagConstraintsInformacionEconomica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformacionEconomica.gridy = 0;
		gridBagConstraintsInformacionEconomica.gridx = 0;
		jPanelFK_IdClienteInformacionEconomica.add(jLabelidclienteFK_IdClienteInformacionEconomica, gridBagConstraintsInformacionEconomica);

		gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		gridBagConstraintsInformacionEconomica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformacionEconomica.gridy = 0;
		gridBagConstraintsInformacionEconomica.gridx = 1;
		jPanelFK_IdClienteInformacionEconomica.add(jComboBoxidclienteFK_IdClienteInformacionEconomica, gridBagConstraintsInformacionEconomica);


		gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		gridBagConstraintsInformacionEconomica.anchor = GridBagConstraints.EAST;
		gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.NONE;
		gridBagConstraintsInformacionEconomica.gridy = 0;
		gridBagConstraintsInformacionEconomica.gridx = 0;
		jPanelFK_IdClienteInformacionEconomica.add(this.jButtonBuscarFK_IdClienteidclienteInformacionEconomica, gridBagConstraintsInformacionEconomica);

		gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		gridBagConstraintsInformacionEconomica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformacionEconomica.gridy = 1;
		gridBagConstraintsInformacionEconomica.gridx =1;
		jPanelFK_IdClienteInformacionEconomica.add(jButtonFK_IdClienteInformacionEconomica, gridBagConstraintsInformacionEconomica);

		jTabbedPaneBusquedasInformacionEconomica.addTab("1.-Por Cliente ", jPanelFK_IdClienteInformacionEconomica);
		jTabbedPaneBusquedasInformacionEconomica.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdValorClienteVinculacionInformacionEconomica= new GridBagLayout();
		gridaBagLayoutFK_IdValorClienteVinculacionInformacionEconomica.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdValorClienteVinculacionInformacionEconomica.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdValorClienteVinculacionInformacionEconomica.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdValorClienteVinculacionInformacionEconomica.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdValorClienteVinculacionInformacionEconomica.setLayout(gridaBagLayoutFK_IdValorClienteVinculacionInformacionEconomica);

		gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		gridBagConstraintsInformacionEconomica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformacionEconomica.gridy = 0;
		gridBagConstraintsInformacionEconomica.gridx = 0;
		jPanelFK_IdValorClienteVinculacionInformacionEconomica.add(jLabelidvalorclientevinculacionFK_IdValorClienteVinculacionInformacionEconomica, gridBagConstraintsInformacionEconomica);

		gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		gridBagConstraintsInformacionEconomica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformacionEconomica.gridy = 0;
		gridBagConstraintsInformacionEconomica.gridx = 1;
		jPanelFK_IdValorClienteVinculacionInformacionEconomica.add(jComboBoxidvalorclientevinculacionFK_IdValorClienteVinculacionInformacionEconomica, gridBagConstraintsInformacionEconomica);

		gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		gridBagConstraintsInformacionEconomica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformacionEconomica.gridy = 1;
		gridBagConstraintsInformacionEconomica.gridx =1;
		jPanelFK_IdValorClienteVinculacionInformacionEconomica.add(jButtonFK_IdValorClienteVinculacionInformacionEconomica, gridBagConstraintsInformacionEconomica);

		jTabbedPaneBusquedasInformacionEconomica.addTab("2.-Por Tipo Vinculacion ", jPanelFK_IdValorClienteVinculacionInformacionEconomica);
		jTabbedPaneBusquedasInformacionEconomica.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutInformacionEconomica = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutInformacionEconomica);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();						
			this.gridBagConstraintsInformacionEconomica.gridy = iGridyPrincipal++;
			this.gridBagConstraintsInformacionEconomica.gridx = 0;		
			//this.gridBagConstraintsInformacionEconomica.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionEconomica.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsInformacionEconomica.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarInformacionEconomica, this.gridBagConstraintsInformacionEconomica);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		this.gridBagConstraintsInformacionEconomica.gridy = iGridyPrincipal++;
		this.gridBagConstraintsInformacionEconomica.gridx = 0;		
		//this.gridBagConstraintsInformacionEconomica.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformacionEconomica.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsInformacionEconomica.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsInformacionEconomica);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsInformacionEconomica.gridy = iGridyPrincipal++;
			this.gridBagConstraintsInformacionEconomica.gridx = 0;		
			this.gridBagConstraintsInformacionEconomica.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionEconomica.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsInformacionEconomica.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasInformacionEconomica, this.gridBagConstraintsInformacionEconomica);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		this.gridBagConstraintsInformacionEconomica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsInformacionEconomica.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesInformacionEconomica, this.gridBagConstraintsInformacionEconomica);								
		
		
		/*
		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		this.gridBagConstraintsInformacionEconomica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsInformacionEconomica.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
		*/		
		
		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		this.gridBagConstraintsInformacionEconomica.gridy =iGridyPrincipal++;
		this.gridBagConstraintsInformacionEconomica.gridx =0;
		this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsInformacionEconomica.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
				
		
		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		this.gridBagConstraintsInformacionEconomica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsInformacionEconomica.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(InformacionEconomicaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosInformacionEconomica= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosInformacionEconomica = new GridBagLayout();
			this.jPanelBusquedasParametrosInformacionEconomica.setLayout(gridaBagLayoutBusquedasParametrosInformacionEconomica);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralInformacionEconomica=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralInformacionEconomica.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralInformacionEconomica.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralInformacionEconomica.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		this.gridBagConstraintsInformacionEconomica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsInformacionEconomica.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
			
			
		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		this.gridBagConstraintsInformacionEconomica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsInformacionEconomica.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
		
			
		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		this.gridBagConstraintsInformacionEconomica.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsInformacionEconomica.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralInformacionEconomica;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoInformacionEconomica() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoInformacionEconomica = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoInformacionEconomica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoInformacionEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoInformacionEconomica.setName("jPanelReporteDinamicoInformacionEconomica"); 
		
		this.jPanelReporteDinamicoInformacionEconomica.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoInformacionEconomica.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoInformacionEconomica.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoInformacionEconomica.setLayout(gridaBagLayoutReporteDinamicoInformacionEconomica);
		
		
		this.jInternalFrameReporteDinamicoInformacionEconomica= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoInformacionEconomica = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteInformacionEconomica= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoInformacionEconomica.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoInformacionEconomica.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoInformacionEconomica.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoInformacionEconomica.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoInformacionEconomica.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoInformacionEconomica.setResizable(true);
	    this.jInternalFrameReporteDinamicoInformacionEconomica.setClosable(true);
	    this.jInternalFrameReporteDinamicoInformacionEconomica.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoInformacionEconomica.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoInformacionEconomica.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoInformacionEconomica.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoInformacionEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Informacion Economicas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteInformacionEconomica = new JLabelMe();

		this.jLabelColumnasSelectReporteInformacionEconomica.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteInformacionEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteInformacionEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteInformacionEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionEconomica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsInformacionEconomica.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoInformacionEconomica.add(this.jLabelColumnasSelectReporteInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteInformacionEconomica = new JList<Reporte>();
		this.jListColumnasSelectReporteInformacionEconomica.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteInformacionEconomica.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteInformacionEconomica.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteInformacionEconomica.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteInformacionEconomica.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteInformacionEconomica=new JScrollPane(this.jListColumnasSelectReporteInformacionEconomica);
			
			this.jScrollColumnasSelectReporteInformacionEconomica.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteInformacionEconomica.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteInformacionEconomica.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteInformacionEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionEconomica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsInformacionEconomica.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoInformacionEconomica.add(this.jListColumnasSelectReporteInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
		this.jPanelReporteDinamicoInformacionEconomica.add(this.jScrollColumnasSelectReporteInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteInformacionEconomica = new JLabelMe();

		this.jLabelRelacionesSelectReporteInformacionEconomica.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteInformacionEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteInformacionEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteInformacionEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteInformacionEconomica = new JList<Reporte>();
		this.jListRelacionesSelectReporteInformacionEconomica.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteInformacionEconomica.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteInformacionEconomica.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteInformacionEconomica.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteInformacionEconomica.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteInformacionEconomica=new JScrollPane(this.jListRelacionesSelectReporteInformacionEconomica);
			
			this.jScrollRelacionesSelectReporteInformacionEconomica.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteInformacionEconomica.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteInformacionEconomica.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteInformacionEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoInformacionEconomica = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoInformacionEconomica = new JComboBoxMe();
		this.jListColumnasValoresGraficoInformacionEconomica = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoInformacionEconomica = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoInformacionEconomica.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoInformacionEconomica.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoInformacionEconomica.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoInformacionEconomica.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoInformacionEconomica = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoInformacionEconomica.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoInformacionEconomica.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoInformacionEconomica.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoInformacionEconomica.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoInformacionEconomica = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoInformacionEconomica.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoInformacionEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoInformacionEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoInformacionEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionEconomica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsInformacionEconomica.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoInformacionEconomica.add(this.jLabelGenerarExcelReporteDinamicoInformacionEconomica, this.gridBagConstraintsInformacionEconomica);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoInformacionEconomica = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoInformacionEconomica.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoInformacionEconomica,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoInformacionEconomica.setToolTipText("Generar EXCEL"+" "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		//this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsInformacionEconomica.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsInformacionEconomica.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoInformacionEconomica.add(this.jButtonGenerarExcelReporteDinamicoInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformacionEconomica.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsInformacionEconomica.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoInformacionEconomica.add(this.jComboBoxTiposReportesDinamicoInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoInformacionEconomica = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoInformacionEconomica.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoInformacionEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoInformacionEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoInformacionEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionEconomica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsInformacionEconomica.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoInformacionEconomica.add(this.jLabelTiposArchivoReporteDinamicoInformacionEconomica, this.gridBagConstraintsInformacionEconomica);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformacionEconomica.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsInformacionEconomica.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoInformacionEconomica.add(this.jComboBoxTiposArchivosReportesDinamicoInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoInformacionEconomica = new JButtonMe();
		this.jButtonGenerarReporteDinamicoInformacionEconomica.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoInformacionEconomica,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoInformacionEconomica.setToolTipText("Generar"+" "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformacionEconomica.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsInformacionEconomica.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoInformacionEconomica.add(this.jButtonGenerarReporteDinamicoInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoInformacionEconomica = new JButtonMe();
		this.jButtonCerrarReporteDinamicoInformacionEconomica.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoInformacionEconomica,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoInformacionEconomica.setToolTipText("Cancelar"+" "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformacionEconomica.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsInformacionEconomica.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoInformacionEconomica.add(this.jButtonCerrarReporteDinamicoInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalInformacionEconomica = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoInformacionEconomica= new JScrollPane(jPanelReporteDinamicoInformacionEconomica,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoInformacionEconomica.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoInformacionEconomica.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoInformacionEconomica.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoInformacionEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Informacion Economicas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		this.gridBagConstraintsInformacionEconomica.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsInformacionEconomica.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoInformacionEconomica.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoInformacionEconomica.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalInformacionEconomica);
		this.jInternalFrameReporteDinamicoInformacionEconomica.getContentPane().add(this.jScrollPanelReporteDinamicoInformacionEconomica, this.gridBagConstraintsInformacionEconomica);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionInformacionEconomica() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionInformacionEconomica = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionInformacionEconomica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionInformacionEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionInformacionEconomica.setName("jPanelImportacionInformacionEconomica"); 
		
		this.jPanelImportacionInformacionEconomica.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionInformacionEconomica.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionInformacionEconomica.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionInformacionEconomica.setLayout(gridaBagLayoutImportacionInformacionEconomica);
		
		
		this.jInternalFrameImportacionInformacionEconomica= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionInformacionEconomica= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionInformacionEconomica = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteInformacionEconomica= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionInformacionEconomica.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionInformacionEconomica.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionInformacionEconomica.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionInformacionEconomica.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionInformacionEconomica.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionInformacionEconomica.setResizable(true);
	    this.jInternalFrameImportacionInformacionEconomica.setClosable(true);
	    this.jInternalFrameImportacionInformacionEconomica.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionInformacionEconomica.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionInformacionEconomica.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionInformacionEconomica.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionInformacionEconomica.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionInformacionEconomica.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionInformacionEconomica.setResizable(true);
	    this.jInternalFrameImportacionInformacionEconomica.setClosable(true);
	    this.jInternalFrameImportacionInformacionEconomica.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionInformacionEconomica.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionInformacionEconomica.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionInformacionEconomica.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionInformacionEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Informacion Economicas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionInformacionEconomica = new JLabelMe();

		this.jLabelArchivoImportacionInformacionEconomica.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionInformacionEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionInformacionEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionInformacionEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionEconomica.gridy = iPosYImportacion;		
		this.gridBagConstraintsInformacionEconomica.gridx = iPosXImportacion++;
			
		this.jPanelImportacionInformacionEconomica.add(this.jLabelArchivoImportacionInformacionEconomica, this.gridBagConstraintsInformacionEconomica);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionInformacionEconomica = new JFileChooser();		
		this.jFileChooserImportacionInformacionEconomica.setToolTipText("ESCOGER ARCHIVO"+" "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionInformacionEconomica = new JButtonMe();
		this.jButtonAbrirImportacionInformacionEconomica.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionInformacionEconomica,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionInformacionEconomica.setToolTipText("Generar"+" "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformacionEconomica.gridy = iPosYImportacion;
		this.gridBagConstraintsInformacionEconomica.gridx = iPosXImportacion++;
							
		this.jPanelImportacionInformacionEconomica.add(this.jButtonAbrirImportacionInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionInformacionEconomica = new JLabelMe();

		this.jLabelPathArchivoImportacionInformacionEconomica.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionInformacionEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionInformacionEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionInformacionEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionEconomica.gridy = iPosYImportacion;		
		this.gridBagConstraintsInformacionEconomica.gridx = iPosXImportacion++;
			
		this.jPanelImportacionInformacionEconomica.add(this.jLabelPathArchivoImportacionInformacionEconomica, this.gridBagConstraintsInformacionEconomica);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionInformacionEconomica=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionInformacionEconomica.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionInformacionEconomica.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionInformacionEconomica.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformacionEconomica.gridy = iPosYImportacion;
		this.gridBagConstraintsInformacionEconomica.gridx = iPosXImportacion++;
							
		this.jPanelImportacionInformacionEconomica.add(this.jTextFieldPathArchivoImportacionInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionInformacionEconomica = new JButtonMe();
		this.jButtonGenerarImportacionInformacionEconomica.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionInformacionEconomica,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionInformacionEconomica.setToolTipText("Generar"+" "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformacionEconomica.gridy = iPosYImportacion;
		this.gridBagConstraintsInformacionEconomica.gridx = iPosXImportacion++;
							
		this.jPanelImportacionInformacionEconomica.add(this.jButtonGenerarImportacionInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionInformacionEconomica = new JButtonMe();
		this.jButtonCerrarImportacionInformacionEconomica.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionInformacionEconomica,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionInformacionEconomica.setToolTipText("Cancelar"+" "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformacionEconomica.gridy = iPosYImportacion;
		this.gridBagConstraintsInformacionEconomica.gridx = iPosXImportacion++;
							
		this.jPanelImportacionInformacionEconomica.add(this.jButtonCerrarImportacionInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalInformacionEconomica = new GridBagLayout();
		
		this.jScrollPanelImportacionInformacionEconomica= new JScrollPane(jPanelImportacionInformacionEconomica,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		this.gridBagConstraintsInformacionEconomica.gridy =iPosYImportacion;
		this.gridBagConstraintsInformacionEconomica.gridx =iPosXImportacion;
		this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionInformacionEconomica.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionInformacionEconomica.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalInformacionEconomica);
		this.jInternalFrameImportacionInformacionEconomica.getContentPane().add(this.jScrollPanelImportacionInformacionEconomica, this.gridBagConstraintsInformacionEconomica);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByInformacionEconomica(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByInformacionEconomica = new JButtonMe();
			this.jButtonAbrirOrderByInformacionEconomica.setText("Orden");
			this.jButtonAbrirOrderByInformacionEconomica.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByInformacionEconomica,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByInformacionEconomica";
			inputMap = this.jButtonAbrirOrderByInformacionEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByInformacionEconomica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByInformacionEconomica"));
		
		
			GridBagLayout gridaBagLayoutOrderByInformacionEconomica = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByInformacionEconomica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByInformacionEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByInformacionEconomica.setName("jPanelOrderByInformacionEconomica"); 
			
			this.jPanelOrderByInformacionEconomica.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByInformacionEconomica.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByInformacionEconomica.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByInformacionEconomica.setLayout(gridaBagLayoutOrderByInformacionEconomica);
			
			
			this.jTableDatosInformacionEconomicaOrderBy = new JTableMe();        
			this.jTableDatosInformacionEconomicaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosInformacionEconomicaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosInformacionEconomicaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosInformacionEconomicaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosInformacionEconomicaOrderBy.setViewportView(this.jTableDatosInformacionEconomicaOrderBy);
			this.jTableDatosInformacionEconomicaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosInformacionEconomicaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByInformacionEconomica= new OrderByJInternalFrame();
			this.jInternalFrameOrderByInformacionEconomica= new OrderByJInternalFrame();
			this.jScrollPanelOrderByInformacionEconomica = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteInformacionEconomica= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByInformacionEconomica.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByInformacionEconomica.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByInformacionEconomica.setTitle("Orden");
			this.jInternalFrameOrderByInformacionEconomica.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByInformacionEconomica.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByInformacionEconomica.setResizable(true);
			this.jInternalFrameOrderByInformacionEconomica.setClosable(true);
			this.jInternalFrameOrderByInformacionEconomica.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByInformacionEconomica.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByInformacionEconomica.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByInformacionEconomica.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByInformacionEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Informacion Economicas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			this.gridBagConstraintsInformacionEconomica.gridy =iPosYOrderBy++;
			this.gridBagConstraintsInformacionEconomica.gridx =iPosXOrderBy;
			this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsInformacionEconomica.ipady =150;
				
			this.jPanelOrderByInformacionEconomica.add(jScrollPanelDatosInformacionEconomicaOrderBy, this.gridBagConstraintsInformacionEconomica);//this.jTableDatosInformacionEconomicaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByInformacionEconomica = new JButtonMe();
			this.jButtonCerrarOrderByInformacionEconomica.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByInformacionEconomica,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByInformacionEconomica.setToolTipText("Cancelar"+" "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionEconomica.gridy = iPosYOrderBy++;
			this.gridBagConstraintsInformacionEconomica.gridx = iPosXOrderBy;
									
			this.jPanelOrderByInformacionEconomica.add(this.jButtonCerrarOrderByInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalInformacionEconomica = new GridBagLayout();
			
			this.jScrollPanelOrderByInformacionEconomica= new JScrollPane(jPanelOrderByInformacionEconomica,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			this.gridBagConstraintsInformacionEconomica.gridy =iPosYOrderBy;
			this.gridBagConstraintsInformacionEconomica.gridx =iPosXOrderBy;
			this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByInformacionEconomica.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByInformacionEconomica.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalInformacionEconomica);
			
			this.jInternalFrameOrderByInformacionEconomica.getContentPane().add(this.jScrollPanelOrderByInformacionEconomica, this.gridBagConstraintsInformacionEconomica);			
		
		} else {
			this.jButtonAbrirOrderByInformacionEconomica = new JButtonMe();
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
		int iWidthTableCalculado=0;//1930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.informacioneconomicaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosInformacionEconomica.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosInformacionEconomica.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosInformacionEconomica.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosInformacionEconomica.getRowHeight();//InformacionEconomicaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > InformacionEconomicaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaInformacionEconomica.isSelected()) {
					iHeightTable=InformacionEconomicaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < InformacionEconomicaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=InformacionEconomicaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > InformacionEconomicaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaInformacionEconomica.isSelected()) {
					iHeightTable=InformacionEconomicaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < InformacionEconomicaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=InformacionEconomicaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosInformacionEconomica.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosInformacionEconomica.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosInformacionEconomica.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosInformacionEconomica.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosInformacionEconomica.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosInformacionEconomica.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByInformacionEconomica!=null && this.jInternalFrameOrderByInformacionEconomica.getjTableDatosOrderBy()!=null) {
			//if(!this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByInformacionEconomica.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByInformacionEconomica.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByInformacionEconomica.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByInformacionEconomica.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByInformacionEconomica.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByInformacionEconomica.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByInformacionEconomica.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosInformacionEconomica.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosInformacionEconomica.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosInformacionEconomica.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=informacioneconomicaLogic.getInformacionEconomicas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=informacioneconomicas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<InformacionEconomica> TraerInformacionEconomicaBeans(List<InformacionEconomica> informacioneconomicas,ArrayList<Classe> classes)throws Exception {
		try {
			for(InformacionEconomica informacioneconomica:informacioneconomicas) {
					
				if(!(InformacionEconomicaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || InformacionEconomicaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					informacioneconomica.setsDetalleGeneralEntityReporte(InformacionEconomicaConstantesFunciones.getInformacionEconomicaDescripcion(informacioneconomica));
										
					informacioneconomica.setesactivo_descripcion(InformacionEconomicaConstantesFunciones.getesactivoDescripcion(informacioneconomica));	
					
						
					
				} else  {
							
					//informacioneconomica.setsDetalleGeneralEntityReporte(informacioneconomica.getsDetalleGeneralEntityReporte());
										
				}
				
				//informacioneconomicabeans.add(informacioneconomicabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return informacioneconomicas;
    }
	//PARA REPORTES FIN
}
