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
import com.bydan.erp.cartera.util.TipoTelefoConstantesFunciones;

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
public class TipoTelefoJInternalFrame extends TipoTelefoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoTelefo;
	
	protected JMenuBar jmenuBarTipoTelefo;
	
	protected JMenu jmenuTipoTelefo;
	protected JMenu jmenuDatosTipoTelefo;
	protected JMenu jmenuArchivoTipoTelefo;
	protected JMenu jmenuAccionesTipoTelefo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoTelefo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoTelefo;	
	protected GridBagConstraints gridBagConstraintsTipoTelefo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoTelefoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoTelefo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoTelefo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoTelefo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoTelefoSessionBean tipotelefoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoTelefo> tipotelefos;		
	public List<TipoTelefo> tipotelefosEliminados;	
	public List<TipoTelefo> tipotelefosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoTelefo;		
	protected JButton jButtonAbrirOrderByTipoTelefo;
	
	
	//protected JPanel jPanelOrderByTipoTelefo;
	//public JScrollPane jScrollPanelOrderByTipoTelefo;	
	//protected JButton jButtonCerrarOrderByTipoTelefo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoTelefoLogic tipotelefoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoTelefo;
	public JScrollPane jScrollPanelDatosEdicionTipoTelefo;
	public JScrollPane jScrollPanelDatosGeneralTipoTelefo;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoTelefoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoTelefo;
	//public JScrollPane jScrollPanelImportacionTipoTelefo;
	
	
	
	protected JPanel jPanelAccionesTipoTelefo;
	
    protected JPanel jPanelPaginacionTipoTelefo;
    protected JPanel jPanelParametrosReportesTipoTelefo;
	protected JPanel jPanelParametrosReportesAccionesTipoTelefo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoTelefo;
	protected JPanel jPanelParametrosAuxiliar2TipoTelefo;
	protected JPanel jPanelParametrosAuxiliar3TipoTelefo;
	protected JPanel jPanelParametrosAuxiliar4TipoTelefo;
	//protected JPanel jPanelParametrosAuxiliar5TipoTelefo;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoTelefo;
	//protected JPanel jPanelImportacionTipoTelefo;
	
	
	public JTable jTableDatosTipoTelefo;
	
	
	
	//public JTable jTableDatosTipoTelefoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoTelefo;
	protected JButton jButtonDuplicarTipoTelefo;
	protected JButton jButtonCopiarTipoTelefo;
	protected JButton jButtonVerFormTipoTelefo;
	protected JButton jButtonNuevoRelacionesTipoTelefo;
	protected JButton jButtonModificarTipoTelefo;
	
    protected JButton jButtonGuardarCambiosTablaTipoTelefo;
	protected JButton jButtonCerrarTipoTelefo;
	
	
	protected JButton jButtonRecargarInformacionTipoTelefo;
	protected JButton jButtonProcesarInformacionTipoTelefo;
	
	
	protected JButton jButtonAnterioresTipoTelefo;
	protected JButton jButtonSiguientesTipoTelefo;
	protected JButton jButtonNuevoGuardarCambiosTipoTelefo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoTelefo;
	//protected JButton jButtonCerrarReporteDinamicoTipoTelefo;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoTelefo;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoTelefo;
	//protected JButton jButtonGenerarImportacionTipoTelefo;
	//protected JButton jButtonCerrarImportacionTipoTelefo;
	//protected JFileChooser jFileChooserImportacionTipoTelefo;
	//protected File fileImportacionTipoTelefo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoTelefo;
	protected JButton jButtonDuplicarToolBarTipoTelefo;
	protected JButton jButtonNuevoRelacionesToolBarTipoTelefo;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoTelefo;
	protected JButton jButtonCopiarToolBarTipoTelefo;
	protected JButton jButtonVerFormToolBarTipoTelefo;
	public JButton jButtonGuardarCambiosTablaToolBarTipoTelefo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoTelefo;
	protected JButton jButtonCerrarToolBarTipoTelefo;
	
	protected JButton jButtonRecargarInformacionToolBarTipoTelefo;
	protected JButton jButtonProcesarInformacionToolBarTipoTelefo;
	protected JButton jButtonAnterioresToolBarTipoTelefo;
	protected JButton jButtonSiguientesToolBarTipoTelefo;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoTelefo;
	protected JButton jButtonAbrirOrderByToolBarTipoTelefo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoTelefo;
	protected JMenuItem jMenuItemDuplicarTipoTelefo;
	protected JMenuItem jMenuItemNuevoRelacionesTipoTelefo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoTelefo;
	protected JMenuItem jMenuItemCopiarTipoTelefo;
	protected JMenuItem jMenuItemVerFormTipoTelefo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoTelefo;
	protected JMenuItem jMenuItemCerrarTipoTelefo;
	protected JMenuItem jMenuItemDetalleCerrarTipoTelefo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoTelefo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoTelefo;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoTelefo;
	protected JMenuItem jMenuItemProcesarInformacionTipoTelefo;
	protected JMenuItem jMenuItemAnterioresTipoTelefo;
	protected JMenuItem jMenuItemSiguientesTipoTelefo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoTelefo;
	protected JMenuItem jMenuItemAbrirOrderByTipoTelefo;
	protected JMenuItem jMenuItemMostrarOcultarTipoTelefo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoTelefo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoTelefo;
	protected JCheckBox jCheckBoxSeleccionadosTipoTelefo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoTelefo;
	protected JCheckBox jCheckBoxConGraficoReporteTipoTelefo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoTelefo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoTelefo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoTelefo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoTelefo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoTelefo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoTelefo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoTelefo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoTelefo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoTelefo;
	protected JTextField jTextFieldValorCampoGeneralTipoTelefo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoTelefo;
	//public JList<Reporte> jListColumnasSelectReporteTipoTelefo;
	//public JScrollPane jScrollColumnasSelectReporteTipoTelefo;
	
	//public JLabel jLabelRelacionesSelectReporteTipoTelefo;
	//public JList<Reporte> jListRelacionesSelectReporteTipoTelefo;
	//public JScrollPane jScrollRelacionesSelectReporteTipoTelefo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoTelefo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoTelefo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoTelefo;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoTelefo;
	
		
	//public JLabel jLabelArchivoImportacionTipoTelefo;	
	//public JLabel jLabelPathArchivoImportacionTipoTelefo;
	//protected JTextField jTextFieldPathArchivoImportacionTipoTelefo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoTelefo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoTelefo;
	
	//public JLabel jLabelColumnaCategoriaValorTipoTelefo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoTelefo;
	
	//public JLabel jLabelColumnasValoresGraficoTipoTelefo;
	//public JList<Reporte> jListColumnasValoresGraficoTipoTelefo;
	//public JScrollPane jScrollColumnasValoresGraficoTipoTelefo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoTelefo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoTelefo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoTelefo;
	
	
	
	
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
	public TipoTelefoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoTelefo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTelefoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoTelefo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTelefoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoTelefo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTelefoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoTelefo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoTelefo)	{
		this.jButtonRecargarInformacionTipoTelefo = jButtonRecargarInformacionTipoTelefo;
	}
	
	public JButton getjButtonProcesarInformacionTipoTelefo() {
		return this.jButtonProcesarInformacionTipoTelefo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoTelefo)	{
		this.jButtonProcesarInformacionTipoTelefo = jButtonProcesarInformacionTipoTelefo;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoTelefo() {
		return this.jButtonRecargarInformacionTipoTelefo;
	}
	
	
	public List<TipoTelefo> gettipotelefos() {
		return this.tipotelefos;
	}

	public void settipotelefos(List<TipoTelefo> tipotelefos) {
		this.tipotelefos = tipotelefos;
	}
	
	public List<TipoTelefo> gettipotelefosAux() {
		return this.tipotelefosAux;
	}

	public void settipotelefosAux(List<TipoTelefo> tipotelefosAux) {
		this.tipotelefosAux = tipotelefosAux;
	}
	
	public List<TipoTelefo> gettipotelefosEliminados() {
		return this.tipotelefosEliminados;
	}

	public void setTipoTelefosEliminados(List<TipoTelefo> tipotelefosEliminados) {
		this.tipotelefosEliminados = tipotelefosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoTelefo() {
		return jComboBoxTiposSeleccionarTipoTelefo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoTelefo(
			JComboBox jComboBoxTiposSeleccionarTipoTelefo) {
		this.jComboBoxTiposSeleccionarTipoTelefo = jComboBoxTiposSeleccionarTipoTelefo;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoTelefo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoTelefo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoTelefo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoTelefo() {
		return jTextFieldValorCampoGeneralTipoTelefo;
	}

	public void setjTextFieldValorCampoGeneralTipoTelefo(
			JTextField jTextFieldValorCampoGeneralTipoTelefo) {
		this.jTextFieldValorCampoGeneralTipoTelefo = jTextFieldValorCampoGeneralTipoTelefo;
	}

	public void setBorderResaltarValorCampoGeneralTipoTelefo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTelefo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoTelefo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoTelefo() {
		return this.jCheckBoxSeleccionarTodosTipoTelefo;
	}

	public void setjCheckBoxSeleccionarTodosTipoTelefo(
			JCheckBox jCheckBoxSeleccionarTodosTipoTelefo) {
		this.jCheckBoxSeleccionarTodosTipoTelefo = jCheckBoxSeleccionarTodosTipoTelefo;
	}

	public void setBorderResaltarSeleccionarTodosTipoTelefo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTelefo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoTelefo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoTelefo() {
		return this.jCheckBoxSeleccionadosTipoTelefo;
	}

	public void setjCheckBoxSeleccionadosTipoTelefo(
			JCheckBox jCheckBoxSeleccionadosTipoTelefo) {
		this.jCheckBoxSeleccionadosTipoTelefo = jCheckBoxSeleccionadosTipoTelefo;
	}
	
	public void setBorderResaltarSeleccionadosTipoTelefo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTelefo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoTelefo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoTelefo() {
		return this.jComboBoxTiposArchivosReportesTipoTelefo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoTelefo(
			JComboBox jComboBoxTiposArchivosReportesTipoTelefo) {
		this.jComboBoxTiposArchivosReportesTipoTelefo = jComboBoxTiposArchivosReportesTipoTelefo;
	}

	public void setBorderResaltarTiposArchivosReportesTipoTelefo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTelefo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoTelefo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoTelefo() {
		return this.jComboBoxTiposReportesTipoTelefo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoTelefo(
			JComboBox jComboBoxTiposReportesTipoTelefo) {
		this.jComboBoxTiposReportesTipoTelefo = jComboBoxTiposReportesTipoTelefo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoTelefo() {
	//	return jComboBoxTiposReportesDinamicoTipoTelefo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoTelefo(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoTelefo) {
	//	this.jComboBoxTiposReportesDinamicoTipoTelefo = jComboBoxTiposReportesDinamicoTipoTelefo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoTelefo() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoTelefo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoTelefo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoTelefo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoTelefo = jComboBoxTiposArchivosReportesDinamicoTipoTelefo;
	//}
	
	public void setBorderResaltarTiposReportesTipoTelefo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTelefo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoTelefo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoTelefo() {
		return this.jComboBoxTiposGraficosReportesTipoTelefo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoTelefo(
			JComboBox jComboBoxTiposGraficosReportesTipoTelefo) {
		this.jComboBoxTiposGraficosReportesTipoTelefo = jComboBoxTiposGraficosReportesTipoTelefo;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoTelefo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTelefo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoTelefo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoTelefo() {
		return this.jComboBoxTiposPaginacionTipoTelefo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoTelefo(
			JComboBox jComboBoxTiposPaginacionTipoTelefo) {
		this.jComboBoxTiposPaginacionTipoTelefo = jComboBoxTiposPaginacionTipoTelefo;
	}
	
	public void setBorderResaltarTiposPaginacionTipoTelefo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTelefo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoTelefo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoTelefo() {
		return this.jComboBoxTiposRelacionesTipoTelefo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoTelefo() {
		return this.jComboBoxTiposAccionesTipoTelefo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoTelefo(
			JComboBox jComboBoxTiposRelacionesTipoTelefo) {
		this.jComboBoxTiposRelacionesTipoTelefo = jComboBoxTiposRelacionesTipoTelefo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoTelefo(
			JComboBox jComboBoxTiposAccionesTipoTelefo) {
		this.jComboBoxTiposAccionesTipoTelefo = jComboBoxTiposAccionesTipoTelefo;
	}
	
	public void setBorderResaltarTiposRelacionesTipoTelefo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTelefo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoTelefo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoTelefo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTelefo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoTelefo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoTelefo() {
	//	return jCheckBoxConGraficoDinamicoTipoTelefo;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoTelefo(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoTelefo) {
	//	this.jCheckBoxConGraficoDinamicoTipoTelefo = jCheckBoxConGraficoDinamicoTipoTelefo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoTelefo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoTelefo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoTelefo .setBorder(borderResaltar);		
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
		this.tipotelefoSessionBean=new TipoTelefoSessionBean();
		
		this.tipotelefoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipotelefoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipotelefoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoTelefoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoTelefoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoTelefoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoTelefoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoTelefoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Telefo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipotelefoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoTelefoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoTelefo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoTelefo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoTelefo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoTelefo,this.jTtoolBarTipoTelefo,
							"nuevo","nuevo","Nuevo"+" "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoTelefo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoTelefo,this.jTtoolBarTipoTelefo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoTelefo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoTelefo,this.jTtoolBarTipoTelefo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoTelefo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoTelefo,this.jTtoolBarTipoTelefo,
							"duplicar","duplicar","Duplicar"+" "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoTelefo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoTelefo,this.jTtoolBarTipoTelefo,
							"copiar","copiar","Copiar"+" "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoTelefo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoTelefo,this.jTtoolBarTipoTelefo,
							"ver_form","ver_form","Ver"+" "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoTelefo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoTelefo,this.jTtoolBarTipoTelefo,
							"recargar","recargar","Recargar"+" "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoTelefo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoTelefo,this.jTtoolBarTipoTelefo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoTelefo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoTelefo,this.jTtoolBarTipoTelefo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoTelefo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoTelefo,this.jTtoolBarTipoTelefo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoTelefo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoTelefo,this.jTtoolBarTipoTelefo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoTelefo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoTelefo,this.jTtoolBarTipoTelefo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoTelefo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoTelefo,this.jTtoolBarTipoTelefo,
							"cerrar","cerrar","Salir"+" "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoTelefo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoTelefo;
			
				this.jButtonProcesarInformacionToolBarTipoTelefo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoTelefo;
				
		//protected JButton jButtonModificarToolBarTipoTelefo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoTelefo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoTelefo=new JMenuMe("General");
		this.jmenuArchivoTipoTelefo=new JMenuMe("Archivo");
		this.jmenuAccionesTipoTelefo=new JMenuMe("Acciones");
		this.jmenuDatosTipoTelefo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoTelefo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoTelefo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoTelefo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoTelefo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoTelefo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoTelefo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoTelefo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoTelefo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoTelefo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoTelefo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoTelefo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoTelefo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoTelefo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoTelefo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoTelefo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoTelefo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoTelefo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoTelefo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoTelefo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoTelefo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoTelefo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoTelefo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoTelefo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoTelefo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoTelefo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoTelefo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoTelefo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoTelefo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoTelefo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoTelefo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoTelefo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoTelefo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoTelefo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoTelefo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoTelefo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoTelefo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoTelefo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoTelefo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoTelefo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoTelefo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoTelefo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoTelefo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoTelefo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoTelefo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoTelefo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoTelefo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoTelefo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoTelefo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoTelefo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoTelefo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoTelefo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoTelefo.add(this.jMenuItemCerrarTipoTelefo);
			
			this.jmenuAccionesTipoTelefo.add(this.jMenuItemNuevoTipoTelefo);
			this.jmenuAccionesTipoTelefo.add(this.jMenuItemNuevoGuardarCambiosTipoTelefo);
			this.jmenuAccionesTipoTelefo.add(this.jMenuItemNuevoRelacionesTipoTelefo);
			this.jmenuAccionesTipoTelefo.add(this.jMenuItemGuardarCambiosTablaTipoTelefo);		
			this.jmenuAccionesTipoTelefo.add(this.jMenuItemDuplicarTipoTelefo);		
			this.jmenuAccionesTipoTelefo.add(this.jMenuItemCopiarTipoTelefo);		
			this.jmenuAccionesTipoTelefo.add(this.jMenuItemVerFormTipoTelefo);		
			
			this.jmenuDatosTipoTelefo.add(this.jMenuItemRecargarInformacionTipoTelefo);				
			this.jmenuDatosTipoTelefo.add(this.jMenuItemAnterioresTipoTelefo);				
			this.jmenuDatosTipoTelefo.add(this.jMenuItemSiguientesTipoTelefo);				
			this.jmenuDatosTipoTelefo.add(this.jMenuItemAbrirOrderByTipoTelefo);				
			this.jmenuDatosTipoTelefo.add(this.jMenuItemMostrarOcultarTipoTelefo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoTelefo.add(this.jMenuItemGuardarCambiosTipoTelefo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoTelefo.add(this.jmenuArchivoTipoTelefo);		
			this.jmenuBarTipoTelefo.add(this.jmenuAccionesTipoTelefo);		
			this.jmenuBarTipoTelefo.add(this.jmenuDatosTipoTelefo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoTelefo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoTelefo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoTelefo=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoTelefo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoTelefo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoTelefo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoTelefo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoTelefo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoTelefo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoTelefo = new TipoTelefoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Telefo DATOS");
			this.jInternalFrameDetalleFormTipoTelefo = new TipoTelefoDetalleFormJInternalFrame(jDesktopPane,this.tipotelefoSessionBean.getConGuardarRelaciones(),this.tipotelefoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoTelefo = null;//new TipoTelefoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoTelefo= new GridBagLayout();
		
		
		this.jTableDatosTipoTelefo = new JTableMe();      
		
		String sToolTipTipoTelefo="";
		sToolTipTipoTelefo=TipoTelefoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoTelefo+="(Cartera.TipoTelefo)";
		}
		
		if(!this.tipotelefoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoTelefo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoTelefo.setToolTipText(sToolTipTipoTelefo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoTelefo);
		this.jTableDatosTipoTelefo.setAutoCreateRowSorter(true);
		this.jTableDatosTipoTelefo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoTelefo.setRowSelectionAllowed(true);
		this.jTableDatosTipoTelefo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoTelefo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoTelefo = new JButtonMe();
		this.jButtonDuplicarTipoTelefo = new JButtonMe();
		this.jButtonCopiarTipoTelefo = new JButtonMe();
		this.jButtonVerFormTipoTelefo = new JButtonMe();
		this.jButtonNuevoRelacionesTipoTelefo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoTelefo = new JButtonMe();
		this.jButtonCerrarTipoTelefo = new JButtonMe();
		
		this.jScrollPanelDatosTipoTelefo = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoTelefo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoTelefo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Telefo";
		
		if(!this.tipotelefoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoTelefo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Telefos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoTelefo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoTelefo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoTelefo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoTelefo.setToolTipText("Acciones");
        this.jPanelAccionesTipoTelefo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoTelefo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoTelefo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoTelefo=new ReporteDinamicoJInternalFrame(TipoTelefoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoTelefo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoTelefo=new ImportacionJInternalFrame(TipoTelefoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoTelefo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoTelefo = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoTelefo.setText("Orden");
		this.jButtonAbrirOrderByTipoTelefo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoTelefo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoTelefo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoTelefo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoTelefo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoTelefo,false,this);
			
			//this.cargarOrderByTipoTelefo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoTelefo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoTelefo,true,this);
			
			//this.cargarOrderByTipoTelefo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoTelefo.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoTelefo.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoTelefo.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoTelefo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoTelefo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoTelefo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoTelefo.setText("Nuevo");
		this.jButtonDuplicarTipoTelefo.setText("Duplicar");
		this.jButtonCopiarTipoTelefo.setText("Copiar");
		this.jButtonVerFormTipoTelefo.setText("Ver");
		this.jButtonNuevoRelacionesTipoTelefo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoTelefo.setText("Guardar");
		this.jButtonCerrarTipoTelefo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoTelefo,"nuevo_button","Nuevo",this.tipotelefoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoTelefo,"duplicar_button","Duplicar",this.tipotelefoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoTelefo,"copiar_button","Copiar",this.tipotelefoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoTelefo,"ver_form","Ver",this.tipotelefoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoTelefo,"nuevorelaciones_button","Nuevo Rel",this.tipotelefoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoTelefo,"guardarcambiostabla_button","Guardar",this.tipotelefoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoTelefo,"cerrar_button","Salir",this.tipotelefoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoTelefo.setToolTipText("Nuevo"+" "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoTelefo.setToolTipText("Duplicar"+" "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoTelefo.setToolTipText("Copiar"+" "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoTelefo.setToolTipText("Ver"+" "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoTelefo.setToolTipText("Nuevo Rel"+" "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoTelefo.setToolTipText("Guardar"+" "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoTelefo.setToolTipText("Salir"+" "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoTelefo";
		inputMap = this.jButtonNuevoTipoTelefo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoTelefo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoTelefo"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoTelefo";
		inputMap = this.jButtonDuplicarTipoTelefo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoTelefo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoTelefo"));
		
		//COPIAR
		sMapKey = "CopiarTipoTelefo";
		inputMap = this.jButtonCopiarTipoTelefo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoTelefo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoTelefo"));
		
		//VEr FORM
		sMapKey = "VerFormTipoTelefo";
		inputMap = this.jButtonVerFormTipoTelefo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoTelefo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoTelefo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoTelefo";
		inputMap = this.jButtonNuevoRelacionesTipoTelefo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoTelefo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoTelefo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoTelefo";
		inputMap = this.jButtonModificarTipoTelefo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoTelefo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoTelefo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoTelefo";
		inputMap = this.jButtonCerrarTipoTelefo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoTelefo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoTelefo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoTelefo";
		inputMap = this.jButtonGuardarCambiosTablaTipoTelefo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoTelefo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoTelefo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoTelefo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoTelefo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoTelefo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoTelefo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoTelefo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoTelefo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoTelefo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoTelefo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoTelefo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoTelefo.setName("jPanelParametrosReportesTipoTelefo"); 
		
		this.jPanelParametrosReportesAccionesTipoTelefo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoTelefo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoTelefo.setName("jPanelParametrosReportesAccionesTipoTelefo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoTelefo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoTelefo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoTelefo = new JButtonMe();
		this.jButtonRecargarInformacionTipoTelefo.setText("Recargar");
		this.jButtonRecargarInformacionTipoTelefo.setToolTipText("Recargar"+" "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoTelefo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoTelefo = new JButtonMe();
		this.jButtonProcesarInformacionTipoTelefo.setText("Procesar");
		this.jButtonProcesarInformacionTipoTelefo.setToolTipText("Procesar"+" "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoTelefo.setVisible(false);
			
		this.jButtonProcesarInformacionTipoTelefo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoTelefo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoTelefo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoTelefo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoTelefo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoTelefo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoTelefo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoTelefo.setText("TIPO");       
		this.jComboBoxTiposReportesTipoTelefo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoTelefo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoTelefo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoTelefo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoTelefo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoTelefo.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoTelefo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoTelefo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoTelefo.setText("Accion");
		this.jComboBoxTiposRelacionesTipoTelefo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoTelefo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoTelefo.setText("Accion");
		this.jComboBoxTiposAccionesTipoTelefo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoTelefo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoTelefo.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoTelefo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoTelefo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoTelefo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoTelefo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoTelefo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoTelefo = new JLabelMe();
		
		this.jLabelAccionesTipoTelefo.setText("Acciones");		
		this.jLabelAccionesTipoTelefo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoTelefo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoTelefo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoTelefo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoTelefo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoTelefo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoTelefo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoTelefo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoTelefo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoTelefo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoTelefo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoTelefo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoTelefo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoTelefo.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoTelefo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoTelefo = new JButtonMe();
		//this.jButtonAnterioresTipoTelefo.setText("<<");
        this.jButtonAnterioresTipoTelefo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoTelefo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoTelefo = new JButtonMe();
		//this.jButtonSiguientesTipoTelefo.setText(">>");
        this.jButtonSiguientesTipoTelefo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoTelefo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoTelefo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoTelefo.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoTelefo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoTelefo,"nuevoguardarcambios_button","Nue",this.tipotelefoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoTelefo";
		inputMap = this.jButtonNuevoGuardarCambiosTipoTelefo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoTelefo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoTelefo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoTelefo";
		inputMap = this.jButtonRecargarInformacionTipoTelefo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoTelefo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoTelefo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoTelefo";
		inputMap = this.jButtonSiguientesTipoTelefo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoTelefo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoTelefo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoTelefo";
		inputMap = this.jButtonAnterioresTipoTelefo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoTelefo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoTelefo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoTelefo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoTelefo.setMinimumSize(new Dimension(this.getWidth(),TipoTelefoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoTelefoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoTelefo.setMaximumSize(new Dimension(this.getWidth(),TipoTelefoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoTelefoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoTelefo.setPreferredSize(new Dimension(this.getWidth(),TipoTelefoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoTelefoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoTelefo = new GridBagLayout();

			this.jPanelPaginacionTipoTelefo.setLayout(gridaBagLayoutPaginacionTipoTelefo);						
			
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			this.gridBagConstraintsTipoTelefo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTelefo.gridy = 0;
			this.gridBagConstraintsTipoTelefo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoTelefo.add(this.jButtonAnterioresTipoTelefo, this.gridBagConstraintsTipoTelefo);
					
						
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			this.gridBagConstraintsTipoTelefo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoTelefo.gridy = 0;
			
			this.jPanelPaginacionTipoTelefo.add(this.jButtonNuevoGuardarCambiosTipoTelefo, this.gridBagConstraintsTipoTelefo);
						
			
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			this.gridBagConstraintsTipoTelefo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoTelefo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoTelefo.gridy = 0;
			this.jPanelPaginacionTipoTelefo.add(this.jButtonSiguientesTipoTelefo, this.gridBagConstraintsTipoTelefo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTelefo.gridy = 1;
			this.gridBagConstraintsTipoTelefo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoTelefo.add(this.jButtonNuevoTipoTelefo, this.gridBagConstraintsTipoTelefo);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
				this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoTelefo.gridy = 1;
				this.gridBagConstraintsTipoTelefo.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoTelefo.add(this.jButtonNuevoRelacionesTipoTelefo, this.gridBagConstraintsTipoTelefo);
			}
			
			
			if(!this.tipotelefoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
				this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoTelefo.gridy = 1;
				this.gridBagConstraintsTipoTelefo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoTelefo.add(this.jButtonGuardarCambiosTablaTipoTelefo, this.gridBagConstraintsTipoTelefo);
			}
			
			
			
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTelefo.gridy = 1;
			this.gridBagConstraintsTipoTelefo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoTelefo.add(this.jButtonDuplicarTipoTelefo, this.gridBagConstraintsTipoTelefo);
			
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTelefo.gridy = 1;
			this.gridBagConstraintsTipoTelefo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoTelefo.add(this.jButtonCopiarTipoTelefo, this.gridBagConstraintsTipoTelefo);
		
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTelefo.gridy = 1;
			this.gridBagConstraintsTipoTelefo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoTelefo.add(this.jButtonVerFormTipoTelefo, this.gridBagConstraintsTipoTelefo);
		
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTelefo.gridy = 1;
			this.gridBagConstraintsTipoTelefo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoTelefo.add(this.jButtonCerrarTipoTelefo, this.gridBagConstraintsTipoTelefo);
		
		
		
		this.jButtonRecargarInformacionTipoTelefo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoTelefo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoTelefo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoTelefo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoTelefo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoTelefo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoTelefo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoTelefo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoTelefo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoTelefo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoTelefo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoTelefo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoTelefo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoTelefo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoTelefo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoTelefo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoTelefo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoTelefo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoTelefo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoTelefo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoTelefo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoTelefo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoTelefo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoTelefo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoTelefo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoTelefo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoTelefo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoTelefo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoTelefo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoTelefo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoTelefo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoTelefo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoTelefo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoTelefo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoTelefo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoTelefo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoTelefo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoTelefo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoTelefo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoTelefo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoTelefo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoTelefo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoTelefo.setLayout(gridaBagParametrosReportesTipoTelefo);
			this.jPanelParametrosReportesAccionesTipoTelefo.setLayout(gridaBagParametrosReportesAccionesTipoTelefo);
			
			
			this.jPanelParametrosAuxiliar1TipoTelefo.setLayout(gridaBagParametrosAuxiliar1TipoTelefo);
			this.jPanelParametrosAuxiliar2TipoTelefo.setLayout(gridaBagParametrosAuxiliar2TipoTelefo);
			this.jPanelParametrosAuxiliar3TipoTelefo.setLayout(gridaBagParametrosAuxiliar3TipoTelefo);
			this.jPanelParametrosAuxiliar4TipoTelefo.setLayout(gridaBagParametrosAuxiliar4TipoTelefo);
			//this.jPanelParametrosAuxiliar5TipoTelefo.setLayout(gridaBagParametrosAuxiliar2TipoTelefo);			
			
			
			
			
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTelefo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoTelefo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoTelefo.add(this.jButtonRecargarInformacionTipoTelefo, this.gridBagConstraintsTipoTelefo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			this.gridBagConstraintsTipoTelefo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTelefo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTelefo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoTelefo.add(this.jComboBoxTiposPaginacionTipoTelefo, this.gridBagConstraintsTipoTelefo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			this.gridBagConstraintsTipoTelefo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTelefo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTelefo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoTelefo.add(this.jCheckBoxConAltoMaximoTablaTipoTelefo, this.gridBagConstraintsTipoTelefo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			this.gridBagConstraintsTipoTelefo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTelefo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTelefo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoTelefo.add(this.jComboBoxTiposArchivosReportesTipoTelefo, this.gridBagConstraintsTipoTelefo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			this.gridBagConstraintsTipoTelefo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTelefo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTelefo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTelefo.add(this.jPanelParametrosAuxiliar1TipoTelefo, this.gridBagConstraintsTipoTelefo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			this.gridBagConstraintsTipoTelefo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTelefo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoTelefo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoTelefo.add(this.jComboBoxTiposReportesTipoTelefo, this.gridBagConstraintsTipoTelefo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			this.gridBagConstraintsTipoTelefo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTelefo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTelefo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTelefo.add(this.jPanelParametrosAuxiliar4TipoTelefo, this.gridBagConstraintsTipoTelefo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			this.gridBagConstraintsTipoTelefo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTelefo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTelefo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTelefo.add(this.jComboBoxTiposReportesTipoTelefo, this.gridBagConstraintsTipoTelefo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			this.gridBagConstraintsTipoTelefo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTelefo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTelefo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoTelefo.add(this.jCheckBoxGenerarReporteTipoTelefo, this.gridBagConstraintsTipoTelefo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			this.gridBagConstraintsTipoTelefo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTelefo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTelefo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTelefo.add(this.jPanelParametrosAuxiliar2TipoTelefo, this.gridBagConstraintsTipoTelefo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTelefo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoTelefo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoTelefo.add(this.jLabelAccionesTipoTelefo, this.gridBagConstraintsTipoTelefo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
				this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoTelefo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoTelefo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoTelefo.add(this.jButtonAbrirOrderByTipoTelefo, this.gridBagConstraintsTipoTelefo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoTelefo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTelefo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoTelefo.add(this.jComboBoxTiposSeleccionarTipoTelefo, this.gridBagConstraintsTipoTelefo);			
			
			
			/*
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTelefo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoTelefo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoTelefo.add(this.jCheckBoxSeleccionarTodosTipoTelefo, this.gridBagConstraintsTipoTelefo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			this.gridBagConstraintsTipoTelefo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTelefo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoTelefo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoTelefo.add(this.jCheckBoxSeleccionarTodosTipoTelefo, this.gridBagConstraintsTipoTelefo);															
				
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			this.gridBagConstraintsTipoTelefo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTelefo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoTelefo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoTelefo.add(this.jCheckBoxSeleccionadosTipoTelefo, this.gridBagConstraintsTipoTelefo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			this.gridBagConstraintsTipoTelefo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTelefo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTelefo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTelefo.add(this.jPanelParametrosAuxiliar3TipoTelefo, this.gridBagConstraintsTipoTelefo);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			this.gridBagConstraintsTipoTelefo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTelefo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoTelefo.add(this.jComboBoxTiposRelacionesTipoTelefo, this.gridBagConstraintsTipoTelefo);
				
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			this.gridBagConstraintsTipoTelefo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTelefo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoTelefo.add(this.jComboBoxTiposAccionesTipoTelefo, this.gridBagConstraintsTipoTelefo);
	
				
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			this.gridBagConstraintsTipoTelefo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTelefo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoTelefo.add(this.jTextFieldValorCampoGeneralTipoTelefo, this.gridBagConstraintsTipoTelefo);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoTelefo = new GridBagLayout();

			this.jScrollPanelDatosTipoTelefo.setLayout(gridaBagLayoutDatosTipoTelefo);
			
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTelefo.gridy = 0;
			this.gridBagConstraintsTipoTelefo.gridx = 0;
			
			this.jScrollPanelDatosTipoTelefo.add(this.jTableDatosTipoTelefo, this.gridBagConstraintsTipoTelefo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoTelefo.setViewportView(this.jTableDatosTipoTelefo);
		this.jTableDatosTipoTelefo.setFillsViewportHeight(true);
		this.jTableDatosTipoTelefo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoTelefo= new GridBagLayout();
		this.jPanelAccionesTipoTelefo.setLayout(gridaBagLayoutAccionesTipoTelefo);
		
		
		/*	
		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTelefo.gridy = 0;
		this.gridBagConstraintsTipoTelefo.gridx = 0;
			
		this.jPanelAccionesTipoTelefo.add(this.jButtonNuevoTipoTelefo, this.gridBagConstraintsTipoTelefo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoTelefo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoTelefo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipotelefoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();						
			this.gridBagConstraintsTipoTelefo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoTelefo.gridx = 0;		
			//this.gridBagConstraintsTipoTelefo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTelefo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoTelefo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoTelefo, this.gridBagConstraintsTipoTelefo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoTelefo.gridx = 0;		
		//this.gridBagConstraintsTipoTelefo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTelefo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoTelefo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoTelefo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTelefo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoTelefo, this.gridBagConstraintsTipoTelefo);								
		
		
		/*
		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTelefo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoTelefo, this.gridBagConstraintsTipoTelefo);
		*/		
		
		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoTelefo.gridx =0;
		this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoTelefo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoTelefo, this.gridBagConstraintsTipoTelefo);
				
		
		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTelefo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoTelefo, this.gridBagConstraintsTipoTelefo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoTelefoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoTelefo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoTelefo = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoTelefo.setLayout(gridaBagLayoutBusquedasParametrosTipoTelefo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoTelefo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoTelefo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoTelefo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoTelefo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTelefo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoTelefo, this.gridBagConstraintsTipoTelefo);
			
			
		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTelefo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoTelefo, this.gridBagConstraintsTipoTelefo);
		
			
		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoTelefo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoTelefo, this.gridBagConstraintsTipoTelefo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoTelefo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoTelefo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoTelefo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoTelefo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoTelefo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoTelefo.setName("jPanelReporteDinamicoTipoTelefo"); 
		
		this.jPanelReporteDinamicoTipoTelefo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoTelefo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoTelefo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoTelefo.setLayout(gridaBagLayoutReporteDinamicoTipoTelefo);
		
		
		this.jInternalFrameReporteDinamicoTipoTelefo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoTelefo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoTelefo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoTelefo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoTelefo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoTelefo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoTelefo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoTelefo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoTelefo.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoTelefo.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoTelefo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoTelefo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoTelefo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoTelefo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoTelefo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Telefos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoTelefo = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoTelefo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoTelefo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoTelefo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoTelefo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTelefo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTelefo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoTelefo.add(this.jLabelColumnasSelectReporteTipoTelefo, this.gridBagConstraintsTipoTelefo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoTelefo = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoTelefo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoTelefo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoTelefo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoTelefo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoTelefo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoTelefo=new JScrollPane(this.jListColumnasSelectReporteTipoTelefo);
			
			this.jScrollColumnasSelectReporteTipoTelefo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoTelefo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoTelefo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoTelefo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTelefo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTelefo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoTelefo.add(this.jListColumnasSelectReporteTipoTelefo, this.gridBagConstraintsTipoTelefo);
		this.jPanelReporteDinamicoTipoTelefo.add(this.jScrollColumnasSelectReporteTipoTelefo, this.gridBagConstraintsTipoTelefo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoTelefo = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoTelefo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoTelefo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoTelefo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoTelefo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTelefo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTelefo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoTelefo.add(this.jLabelRelacionesSelectReporteTipoTelefo, this.gridBagConstraintsTipoTelefo);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoTelefo = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoTelefo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoTelefo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoTelefo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoTelefo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoTelefo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoTelefo=new JScrollPane(this.jListRelacionesSelectReporteTipoTelefo);
			
			this.jScrollRelacionesSelectReporteTipoTelefo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoTelefo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoTelefo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoTelefo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTelefo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTelefo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoTelefo.add(this.jListRelacionesSelectReporteTipoTelefo, this.gridBagConstraintsTipoTelefo);
		this.jPanelReporteDinamicoTipoTelefo.add(this.jScrollRelacionesSelectReporteTipoTelefo, this.gridBagConstraintsTipoTelefo);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoTelefo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoTelefo = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoTelefo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoTelefo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoTelefo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoTelefo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoTelefo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoTelefo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoTelefo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoTelefo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoTelefo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoTelefo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoTelefo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoTelefo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoTelefo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoTelefo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoTelefo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoTelefo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTelefo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTelefo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoTelefo.add(this.jLabelGenerarExcelReporteDinamicoTipoTelefo, this.gridBagConstraintsTipoTelefo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoTelefo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoTelefo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoTelefo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoTelefo.setToolTipText("Generar EXCEL"+" "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		//this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoTelefo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoTelefo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoTelefo.add(this.jButtonGenerarExcelReporteDinamicoTipoTelefo, this.gridBagConstraintsTipoTelefo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTelefo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoTelefo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoTelefo.add(this.jComboBoxTiposReportesDinamicoTipoTelefo, this.gridBagConstraintsTipoTelefo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoTelefo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoTelefo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoTelefo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoTelefo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoTelefo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTelefo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTelefo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoTelefo.add(this.jLabelTiposArchivoReporteDinamicoTipoTelefo, this.gridBagConstraintsTipoTelefo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTelefo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoTelefo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoTelefo.add(this.jComboBoxTiposArchivosReportesDinamicoTipoTelefo, this.gridBagConstraintsTipoTelefo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoTelefo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoTelefo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoTelefo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoTelefo.setToolTipText("Generar"+" "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTelefo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoTelefo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoTelefo.add(this.jButtonGenerarReporteDinamicoTipoTelefo, this.gridBagConstraintsTipoTelefo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoTelefo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoTelefo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoTelefo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoTelefo.setToolTipText("Cancelar"+" "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTelefo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoTelefo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoTelefo.add(this.jButtonCerrarReporteDinamicoTipoTelefo, this.gridBagConstraintsTipoTelefo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoTelefo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoTelefo= new JScrollPane(jPanelReporteDinamicoTipoTelefo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoTelefo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoTelefo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoTelefo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoTelefo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Telefos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoTelefo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoTelefo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoTelefo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoTelefo);
		this.jInternalFrameReporteDinamicoTipoTelefo.getContentPane().add(this.jScrollPanelReporteDinamicoTipoTelefo, this.gridBagConstraintsTipoTelefo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoTelefo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoTelefo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoTelefo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoTelefo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoTelefo.setName("jPanelImportacionTipoTelefo"); 
		
		this.jPanelImportacionTipoTelefo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoTelefo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoTelefo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoTelefo.setLayout(gridaBagLayoutImportacionTipoTelefo);
		
		
		this.jInternalFrameImportacionTipoTelefo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoTelefo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoTelefo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoTelefo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoTelefo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoTelefo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoTelefo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoTelefo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoTelefo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoTelefo.setResizable(true);
	    this.jInternalFrameImportacionTipoTelefo.setClosable(true);
	    this.jInternalFrameImportacionTipoTelefo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoTelefo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoTelefo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoTelefo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoTelefo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoTelefo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoTelefo.setResizable(true);
	    this.jInternalFrameImportacionTipoTelefo.setClosable(true);
	    this.jInternalFrameImportacionTipoTelefo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoTelefo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoTelefo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoTelefo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoTelefo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Telefos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoTelefo = new JLabelMe();

		this.jLabelArchivoImportacionTipoTelefo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoTelefo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoTelefo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoTelefo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTelefo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoTelefo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoTelefo.add(this.jLabelArchivoImportacionTipoTelefo, this.gridBagConstraintsTipoTelefo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoTelefo = new JFileChooser();		
		this.jFileChooserImportacionTipoTelefo.setToolTipText("ESCOGER ARCHIVO"+" "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoTelefo = new JButtonMe();
		this.jButtonAbrirImportacionTipoTelefo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoTelefo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoTelefo.setToolTipText("Generar"+" "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTelefo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoTelefo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoTelefo.add(this.jButtonAbrirImportacionTipoTelefo, this.gridBagConstraintsTipoTelefo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoTelefo = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoTelefo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoTelefo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoTelefo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoTelefo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTelefo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoTelefo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoTelefo.add(this.jLabelPathArchivoImportacionTipoTelefo, this.gridBagConstraintsTipoTelefo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoTelefo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoTelefo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoTelefo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoTelefo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTelefo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoTelefo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoTelefo.add(this.jTextFieldPathArchivoImportacionTipoTelefo, this.gridBagConstraintsTipoTelefo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoTelefo = new JButtonMe();
		this.jButtonGenerarImportacionTipoTelefo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoTelefo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoTelefo.setToolTipText("Generar"+" "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTelefo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoTelefo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoTelefo.add(this.jButtonGenerarImportacionTipoTelefo, this.gridBagConstraintsTipoTelefo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoTelefo = new JButtonMe();
		this.jButtonCerrarImportacionTipoTelefo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoTelefo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoTelefo.setToolTipText("Cancelar"+" "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTelefo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoTelefo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoTelefo.add(this.jButtonCerrarImportacionTipoTelefo, this.gridBagConstraintsTipoTelefo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoTelefo = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoTelefo= new JScrollPane(jPanelImportacionTipoTelefo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
		this.gridBagConstraintsTipoTelefo.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoTelefo.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoTelefo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoTelefo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoTelefo);
		this.jInternalFrameImportacionTipoTelefo.getContentPane().add(this.jScrollPanelImportacionTipoTelefo, this.gridBagConstraintsTipoTelefo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoTelefo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoTelefo = new JButtonMe();
			this.jButtonAbrirOrderByTipoTelefo.setText("Orden");
			this.jButtonAbrirOrderByTipoTelefo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoTelefo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoTelefo";
			inputMap = this.jButtonAbrirOrderByTipoTelefo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoTelefo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoTelefo"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoTelefo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoTelefo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoTelefo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoTelefo.setName("jPanelOrderByTipoTelefo"); 
			
			this.jPanelOrderByTipoTelefo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoTelefo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoTelefo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoTelefo.setLayout(gridaBagLayoutOrderByTipoTelefo);
			
			
			this.jTableDatosTipoTelefoOrderBy = new JTableMe();        
			this.jTableDatosTipoTelefoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoTelefoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoTelefoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoTelefoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoTelefoOrderBy.setViewportView(this.jTableDatosTipoTelefoOrderBy);
			this.jTableDatosTipoTelefoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoTelefoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoTelefo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoTelefo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoTelefo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoTelefo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoTelefo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoTelefo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoTelefo.setTitle("Orden");
			this.jInternalFrameOrderByTipoTelefo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoTelefo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoTelefo.setResizable(true);
			this.jInternalFrameOrderByTipoTelefo.setClosable(true);
			this.jInternalFrameOrderByTipoTelefo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoTelefo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoTelefo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoTelefo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoTelefo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Telefos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			this.gridBagConstraintsTipoTelefo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoTelefo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoTelefo.ipady =150;
				
			this.jPanelOrderByTipoTelefo.add(jScrollPanelDatosTipoTelefoOrderBy, this.gridBagConstraintsTipoTelefo);//this.jTableDatosTipoTelefoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoTelefo = new JButtonMe();
			this.jButtonCerrarOrderByTipoTelefo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoTelefo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoTelefo.setToolTipText("Cancelar"+" "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoTelefo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTelefo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoTelefo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoTelefo.add(this.jButtonCerrarOrderByTipoTelefo, this.gridBagConstraintsTipoTelefo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoTelefo = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoTelefo= new JScrollPane(jPanelOrderByTipoTelefo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoTelefo = new GridBagConstraints();
			this.gridBagConstraintsTipoTelefo.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoTelefo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoTelefo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoTelefo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoTelefo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoTelefo);
			
			this.jInternalFrameOrderByTipoTelefo.getContentPane().add(this.jScrollPanelOrderByTipoTelefo, this.gridBagConstraintsTipoTelefo);			
		
		} else {
			this.jButtonAbrirOrderByTipoTelefo = new JButtonMe();
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
		int iWidthTableCalculado=0;//930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipotelefoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoTelefo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoTelefo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoTelefo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoTelefo.getRowHeight();//TipoTelefoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipotelefoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoTelefoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoTelefo.isSelected()) {
					iHeightTable=TipoTelefoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoTelefoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoTelefoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoTelefoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoTelefo.isSelected()) {
					iHeightTable=TipoTelefoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoTelefoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoTelefoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoTelefo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoTelefo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoTelefo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoTelefo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoTelefo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoTelefo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoTelefo!=null && this.jInternalFrameOrderByTipoTelefo.getjTableDatosOrderBy()!=null) {
			//if(!this.tipotelefoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoTelefo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoTelefo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoTelefo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoTelefo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoTelefo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoTelefo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoTelefo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoTelefo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoTelefo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoTelefo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipotelefoLogic.getTipoTelefos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipotelefos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoTelefo> TraerTipoTelefoBeans(List<TipoTelefo> tipotelefos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoTelefo tipotelefo:tipotelefos) {
					
				if(!(TipoTelefoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoTelefoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipotelefo.setsDetalleGeneralEntityReporte(TipoTelefoConstantesFunciones.getTipoTelefoDescripcion(tipotelefo));
										
						
					
					

					if(tipotelefo.getTelefonos()!=null && Funciones.existeClass(classes,Telefono.class)) {
						try{tipotelefo.settelefonosDescripcionReporte(new JRBeanCollectionDataSource(TelefonoJInternalFrame.TraerTelefonoBeans(tipotelefo.getTelefonos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipotelefo.setsDetalleGeneralEntityReporte(tipotelefo.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipotelefobeans.add(tipotelefobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipotelefos;
    }
	//PARA REPORTES FIN
}
