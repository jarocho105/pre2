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
import com.bydan.erp.cartera.util.TipoAreaLaboConstantesFunciones;

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
public class TipoAreaLaboJInternalFrame extends TipoAreaLaboBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoAreaLabo;
	
	protected JMenuBar jmenuBarTipoAreaLabo;
	
	protected JMenu jmenuTipoAreaLabo;
	protected JMenu jmenuDatosTipoAreaLabo;
	protected JMenu jmenuArchivoTipoAreaLabo;
	protected JMenu jmenuAccionesTipoAreaLabo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoAreaLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoAreaLabo;	
	protected GridBagConstraints gridBagConstraintsTipoAreaLabo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoAreaLaboDetalleFormJInternalFrame jInternalFrameDetalleFormTipoAreaLabo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoAreaLabo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoAreaLabo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoAreaLaboSessionBean tipoarealaboSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoAreaLabo> tipoarealabos;		
	public List<TipoAreaLabo> tipoarealabosEliminados;	
	public List<TipoAreaLabo> tipoarealabosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoAreaLabo;		
	protected JButton jButtonAbrirOrderByTipoAreaLabo;
	
	
	//protected JPanel jPanelOrderByTipoAreaLabo;
	//public JScrollPane jScrollPanelOrderByTipoAreaLabo;	
	//protected JButton jButtonCerrarOrderByTipoAreaLabo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoAreaLaboLogic tipoarealaboLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoAreaLabo;
	public JScrollPane jScrollPanelDatosEdicionTipoAreaLabo;
	public JScrollPane jScrollPanelDatosGeneralTipoAreaLabo;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoAreaLaboOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoAreaLabo;
	//public JScrollPane jScrollPanelImportacionTipoAreaLabo;
	
	
	
	protected JPanel jPanelAccionesTipoAreaLabo;
	
    protected JPanel jPanelPaginacionTipoAreaLabo;
    protected JPanel jPanelParametrosReportesTipoAreaLabo;
	protected JPanel jPanelParametrosReportesAccionesTipoAreaLabo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoAreaLabo;
	protected JPanel jPanelParametrosAuxiliar2TipoAreaLabo;
	protected JPanel jPanelParametrosAuxiliar3TipoAreaLabo;
	protected JPanel jPanelParametrosAuxiliar4TipoAreaLabo;
	//protected JPanel jPanelParametrosAuxiliar5TipoAreaLabo;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoAreaLabo;
	//protected JPanel jPanelImportacionTipoAreaLabo;
	
	
	public JTable jTableDatosTipoAreaLabo;
	
	
	
	//public JTable jTableDatosTipoAreaLaboOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoAreaLabo;
	protected JButton jButtonDuplicarTipoAreaLabo;
	protected JButton jButtonCopiarTipoAreaLabo;
	protected JButton jButtonVerFormTipoAreaLabo;
	protected JButton jButtonNuevoRelacionesTipoAreaLabo;
	protected JButton jButtonModificarTipoAreaLabo;
	
    protected JButton jButtonGuardarCambiosTablaTipoAreaLabo;
	protected JButton jButtonCerrarTipoAreaLabo;
	
	
	protected JButton jButtonRecargarInformacionTipoAreaLabo;
	protected JButton jButtonProcesarInformacionTipoAreaLabo;
	
	
	protected JButton jButtonAnterioresTipoAreaLabo;
	protected JButton jButtonSiguientesTipoAreaLabo;
	protected JButton jButtonNuevoGuardarCambiosTipoAreaLabo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoAreaLabo;
	//protected JButton jButtonCerrarReporteDinamicoTipoAreaLabo;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoAreaLabo;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoAreaLabo;
	//protected JButton jButtonGenerarImportacionTipoAreaLabo;
	//protected JButton jButtonCerrarImportacionTipoAreaLabo;
	//protected JFileChooser jFileChooserImportacionTipoAreaLabo;
	//protected File fileImportacionTipoAreaLabo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoAreaLabo;
	protected JButton jButtonDuplicarToolBarTipoAreaLabo;
	protected JButton jButtonNuevoRelacionesToolBarTipoAreaLabo;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoAreaLabo;
	protected JButton jButtonCopiarToolBarTipoAreaLabo;
	protected JButton jButtonVerFormToolBarTipoAreaLabo;
	public JButton jButtonGuardarCambiosTablaToolBarTipoAreaLabo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoAreaLabo;
	protected JButton jButtonCerrarToolBarTipoAreaLabo;
	
	protected JButton jButtonRecargarInformacionToolBarTipoAreaLabo;
	protected JButton jButtonProcesarInformacionToolBarTipoAreaLabo;
	protected JButton jButtonAnterioresToolBarTipoAreaLabo;
	protected JButton jButtonSiguientesToolBarTipoAreaLabo;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoAreaLabo;
	protected JButton jButtonAbrirOrderByToolBarTipoAreaLabo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoAreaLabo;
	protected JMenuItem jMenuItemDuplicarTipoAreaLabo;
	protected JMenuItem jMenuItemNuevoRelacionesTipoAreaLabo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoAreaLabo;
	protected JMenuItem jMenuItemCopiarTipoAreaLabo;
	protected JMenuItem jMenuItemVerFormTipoAreaLabo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoAreaLabo;
	protected JMenuItem jMenuItemCerrarTipoAreaLabo;
	protected JMenuItem jMenuItemDetalleCerrarTipoAreaLabo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoAreaLabo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoAreaLabo;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoAreaLabo;
	protected JMenuItem jMenuItemProcesarInformacionTipoAreaLabo;
	protected JMenuItem jMenuItemAnterioresTipoAreaLabo;
	protected JMenuItem jMenuItemSiguientesTipoAreaLabo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoAreaLabo;
	protected JMenuItem jMenuItemAbrirOrderByTipoAreaLabo;
	protected JMenuItem jMenuItemMostrarOcultarTipoAreaLabo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoAreaLabo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoAreaLabo;
	protected JCheckBox jCheckBoxSeleccionadosTipoAreaLabo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoAreaLabo;
	protected JCheckBox jCheckBoxConGraficoReporteTipoAreaLabo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoAreaLabo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoAreaLabo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoAreaLabo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoAreaLabo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoAreaLabo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoAreaLabo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoAreaLabo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoAreaLabo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoAreaLabo;
	protected JTextField jTextFieldValorCampoGeneralTipoAreaLabo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoAreaLabo;
	//public JList<Reporte> jListColumnasSelectReporteTipoAreaLabo;
	//public JScrollPane jScrollColumnasSelectReporteTipoAreaLabo;
	
	//public JLabel jLabelRelacionesSelectReporteTipoAreaLabo;
	//public JList<Reporte> jListRelacionesSelectReporteTipoAreaLabo;
	//public JScrollPane jScrollRelacionesSelectReporteTipoAreaLabo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoAreaLabo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoAreaLabo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoAreaLabo;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoAreaLabo;
	
		
	//public JLabel jLabelArchivoImportacionTipoAreaLabo;	
	//public JLabel jLabelPathArchivoImportacionTipoAreaLabo;
	//protected JTextField jTextFieldPathArchivoImportacionTipoAreaLabo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoAreaLabo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoAreaLabo;
	
	//public JLabel jLabelColumnaCategoriaValorTipoAreaLabo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoAreaLabo;
	
	//public JLabel jLabelColumnasValoresGraficoTipoAreaLabo;
	//public JList<Reporte> jListColumnasValoresGraficoTipoAreaLabo;
	//public JScrollPane jScrollColumnasValoresGraficoTipoAreaLabo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoAreaLabo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoAreaLabo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoAreaLabo;
	
	
	
	
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
	public TipoAreaLaboJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoAreaLabo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAreaLaboJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoAreaLabo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAreaLaboJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoAreaLabo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAreaLaboJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoAreaLabo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoAreaLabo)	{
		this.jButtonRecargarInformacionTipoAreaLabo = jButtonRecargarInformacionTipoAreaLabo;
	}
	
	public JButton getjButtonProcesarInformacionTipoAreaLabo() {
		return this.jButtonProcesarInformacionTipoAreaLabo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoAreaLabo)	{
		this.jButtonProcesarInformacionTipoAreaLabo = jButtonProcesarInformacionTipoAreaLabo;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoAreaLabo() {
		return this.jButtonRecargarInformacionTipoAreaLabo;
	}
	
	
	public List<TipoAreaLabo> gettipoarealabos() {
		return this.tipoarealabos;
	}

	public void settipoarealabos(List<TipoAreaLabo> tipoarealabos) {
		this.tipoarealabos = tipoarealabos;
	}
	
	public List<TipoAreaLabo> gettipoarealabosAux() {
		return this.tipoarealabosAux;
	}

	public void settipoarealabosAux(List<TipoAreaLabo> tipoarealabosAux) {
		this.tipoarealabosAux = tipoarealabosAux;
	}
	
	public List<TipoAreaLabo> gettipoarealabosEliminados() {
		return this.tipoarealabosEliminados;
	}

	public void setTipoAreaLabosEliminados(List<TipoAreaLabo> tipoarealabosEliminados) {
		this.tipoarealabosEliminados = tipoarealabosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoAreaLabo() {
		return jComboBoxTiposSeleccionarTipoAreaLabo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoAreaLabo(
			JComboBox jComboBoxTiposSeleccionarTipoAreaLabo) {
		this.jComboBoxTiposSeleccionarTipoAreaLabo = jComboBoxTiposSeleccionarTipoAreaLabo;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoAreaLabo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoAreaLabo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoAreaLabo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoAreaLabo() {
		return jTextFieldValorCampoGeneralTipoAreaLabo;
	}

	public void setjTextFieldValorCampoGeneralTipoAreaLabo(
			JTextField jTextFieldValorCampoGeneralTipoAreaLabo) {
		this.jTextFieldValorCampoGeneralTipoAreaLabo = jTextFieldValorCampoGeneralTipoAreaLabo;
	}

	public void setBorderResaltarValorCampoGeneralTipoAreaLabo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAreaLabo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoAreaLabo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoAreaLabo() {
		return this.jCheckBoxSeleccionarTodosTipoAreaLabo;
	}

	public void setjCheckBoxSeleccionarTodosTipoAreaLabo(
			JCheckBox jCheckBoxSeleccionarTodosTipoAreaLabo) {
		this.jCheckBoxSeleccionarTodosTipoAreaLabo = jCheckBoxSeleccionarTodosTipoAreaLabo;
	}

	public void setBorderResaltarSeleccionarTodosTipoAreaLabo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAreaLabo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoAreaLabo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoAreaLabo() {
		return this.jCheckBoxSeleccionadosTipoAreaLabo;
	}

	public void setjCheckBoxSeleccionadosTipoAreaLabo(
			JCheckBox jCheckBoxSeleccionadosTipoAreaLabo) {
		this.jCheckBoxSeleccionadosTipoAreaLabo = jCheckBoxSeleccionadosTipoAreaLabo;
	}
	
	public void setBorderResaltarSeleccionadosTipoAreaLabo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAreaLabo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoAreaLabo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoAreaLabo() {
		return this.jComboBoxTiposArchivosReportesTipoAreaLabo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoAreaLabo(
			JComboBox jComboBoxTiposArchivosReportesTipoAreaLabo) {
		this.jComboBoxTiposArchivosReportesTipoAreaLabo = jComboBoxTiposArchivosReportesTipoAreaLabo;
	}

	public void setBorderResaltarTiposArchivosReportesTipoAreaLabo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAreaLabo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoAreaLabo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoAreaLabo() {
		return this.jComboBoxTiposReportesTipoAreaLabo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoAreaLabo(
			JComboBox jComboBoxTiposReportesTipoAreaLabo) {
		this.jComboBoxTiposReportesTipoAreaLabo = jComboBoxTiposReportesTipoAreaLabo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoAreaLabo() {
	//	return jComboBoxTiposReportesDinamicoTipoAreaLabo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoAreaLabo(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoAreaLabo) {
	//	this.jComboBoxTiposReportesDinamicoTipoAreaLabo = jComboBoxTiposReportesDinamicoTipoAreaLabo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoAreaLabo() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoAreaLabo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoAreaLabo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoAreaLabo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoAreaLabo = jComboBoxTiposArchivosReportesDinamicoTipoAreaLabo;
	//}
	
	public void setBorderResaltarTiposReportesTipoAreaLabo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAreaLabo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoAreaLabo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoAreaLabo() {
		return this.jComboBoxTiposGraficosReportesTipoAreaLabo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoAreaLabo(
			JComboBox jComboBoxTiposGraficosReportesTipoAreaLabo) {
		this.jComboBoxTiposGraficosReportesTipoAreaLabo = jComboBoxTiposGraficosReportesTipoAreaLabo;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoAreaLabo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAreaLabo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoAreaLabo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoAreaLabo() {
		return this.jComboBoxTiposPaginacionTipoAreaLabo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoAreaLabo(
			JComboBox jComboBoxTiposPaginacionTipoAreaLabo) {
		this.jComboBoxTiposPaginacionTipoAreaLabo = jComboBoxTiposPaginacionTipoAreaLabo;
	}
	
	public void setBorderResaltarTiposPaginacionTipoAreaLabo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAreaLabo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoAreaLabo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoAreaLabo() {
		return this.jComboBoxTiposRelacionesTipoAreaLabo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoAreaLabo() {
		return this.jComboBoxTiposAccionesTipoAreaLabo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoAreaLabo(
			JComboBox jComboBoxTiposRelacionesTipoAreaLabo) {
		this.jComboBoxTiposRelacionesTipoAreaLabo = jComboBoxTiposRelacionesTipoAreaLabo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoAreaLabo(
			JComboBox jComboBoxTiposAccionesTipoAreaLabo) {
		this.jComboBoxTiposAccionesTipoAreaLabo = jComboBoxTiposAccionesTipoAreaLabo;
	}
	
	public void setBorderResaltarTiposRelacionesTipoAreaLabo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAreaLabo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoAreaLabo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoAreaLabo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAreaLabo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoAreaLabo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoAreaLabo() {
	//	return jCheckBoxConGraficoDinamicoTipoAreaLabo;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoAreaLabo(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoAreaLabo) {
	//	this.jCheckBoxConGraficoDinamicoTipoAreaLabo = jCheckBoxConGraficoDinamicoTipoAreaLabo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoAreaLabo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoAreaLabo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoAreaLabo .setBorder(borderResaltar);		
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
		this.tipoarealaboSessionBean=new TipoAreaLaboSessionBean();
		
		this.tipoarealaboSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoarealaboSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoarealaboSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoAreaLaboJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoAreaLaboJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoAreaLaboJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoAreaLaboJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoAreaLaboJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Area Labo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoAreaLaboJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoAreaLabo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoAreaLabo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoAreaLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoAreaLabo,this.jTtoolBarTipoAreaLabo,
							"nuevo","nuevo","Nuevo"+" "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoAreaLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoAreaLabo,this.jTtoolBarTipoAreaLabo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoAreaLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoAreaLabo,this.jTtoolBarTipoAreaLabo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoAreaLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoAreaLabo,this.jTtoolBarTipoAreaLabo,
							"duplicar","duplicar","Duplicar"+" "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoAreaLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoAreaLabo,this.jTtoolBarTipoAreaLabo,
							"copiar","copiar","Copiar"+" "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoAreaLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoAreaLabo,this.jTtoolBarTipoAreaLabo,
							"ver_form","ver_form","Ver"+" "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoAreaLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoAreaLabo,this.jTtoolBarTipoAreaLabo,
							"recargar","recargar","Recargar"+" "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoAreaLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoAreaLabo,this.jTtoolBarTipoAreaLabo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoAreaLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoAreaLabo,this.jTtoolBarTipoAreaLabo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoAreaLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoAreaLabo,this.jTtoolBarTipoAreaLabo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoAreaLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoAreaLabo,this.jTtoolBarTipoAreaLabo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoAreaLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoAreaLabo,this.jTtoolBarTipoAreaLabo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoAreaLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoAreaLabo,this.jTtoolBarTipoAreaLabo,
							"cerrar","cerrar","Salir"+" "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoAreaLabo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoAreaLabo;
			
				this.jButtonProcesarInformacionToolBarTipoAreaLabo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoAreaLabo;
				
		//protected JButton jButtonModificarToolBarTipoAreaLabo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoAreaLabo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoAreaLabo=new JMenuMe("General");
		this.jmenuArchivoTipoAreaLabo=new JMenuMe("Archivo");
		this.jmenuAccionesTipoAreaLabo=new JMenuMe("Acciones");
		this.jmenuDatosTipoAreaLabo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoAreaLabo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoAreaLabo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoAreaLabo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoAreaLabo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoAreaLabo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoAreaLabo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoAreaLabo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoAreaLabo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoAreaLabo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoAreaLabo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoAreaLabo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoAreaLabo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoAreaLabo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoAreaLabo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoAreaLabo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoAreaLabo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoAreaLabo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoAreaLabo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoAreaLabo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoAreaLabo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoAreaLabo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoAreaLabo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoAreaLabo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoAreaLabo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoAreaLabo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoAreaLabo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoAreaLabo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoAreaLabo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoAreaLabo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoAreaLabo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoAreaLabo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoAreaLabo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoAreaLabo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoAreaLabo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoAreaLabo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoAreaLabo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoAreaLabo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoAreaLabo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoAreaLabo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoAreaLabo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoAreaLabo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoAreaLabo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoAreaLabo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoAreaLabo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoAreaLabo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoAreaLabo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoAreaLabo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoAreaLabo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoAreaLabo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoAreaLabo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoAreaLabo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoAreaLabo.add(this.jMenuItemCerrarTipoAreaLabo);
			
			this.jmenuAccionesTipoAreaLabo.add(this.jMenuItemNuevoTipoAreaLabo);
			this.jmenuAccionesTipoAreaLabo.add(this.jMenuItemNuevoGuardarCambiosTipoAreaLabo);
			this.jmenuAccionesTipoAreaLabo.add(this.jMenuItemNuevoRelacionesTipoAreaLabo);
			this.jmenuAccionesTipoAreaLabo.add(this.jMenuItemGuardarCambiosTablaTipoAreaLabo);		
			this.jmenuAccionesTipoAreaLabo.add(this.jMenuItemDuplicarTipoAreaLabo);		
			this.jmenuAccionesTipoAreaLabo.add(this.jMenuItemCopiarTipoAreaLabo);		
			this.jmenuAccionesTipoAreaLabo.add(this.jMenuItemVerFormTipoAreaLabo);		
			
			this.jmenuDatosTipoAreaLabo.add(this.jMenuItemRecargarInformacionTipoAreaLabo);				
			this.jmenuDatosTipoAreaLabo.add(this.jMenuItemAnterioresTipoAreaLabo);				
			this.jmenuDatosTipoAreaLabo.add(this.jMenuItemSiguientesTipoAreaLabo);				
			this.jmenuDatosTipoAreaLabo.add(this.jMenuItemAbrirOrderByTipoAreaLabo);				
			this.jmenuDatosTipoAreaLabo.add(this.jMenuItemMostrarOcultarTipoAreaLabo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoAreaLabo.add(this.jMenuItemGuardarCambiosTipoAreaLabo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoAreaLabo.add(this.jmenuArchivoTipoAreaLabo);		
			this.jmenuBarTipoAreaLabo.add(this.jmenuAccionesTipoAreaLabo);		
			this.jmenuBarTipoAreaLabo.add(this.jmenuDatosTipoAreaLabo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoAreaLabo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoAreaLabo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoAreaLabo=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoAreaLabo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoAreaLabo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoAreaLabo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoAreaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoAreaLabo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoAreaLabo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoAreaLabo = new TipoAreaLaboDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Area Labo DATOS");
			this.jInternalFrameDetalleFormTipoAreaLabo = new TipoAreaLaboDetalleFormJInternalFrame(jDesktopPane,this.tipoarealaboSessionBean.getConGuardarRelaciones(),this.tipoarealaboSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoAreaLabo = null;//new TipoAreaLaboDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoAreaLabo= new GridBagLayout();
		
		
		this.jTableDatosTipoAreaLabo = new JTableMe();      
		
		String sToolTipTipoAreaLabo="";
		sToolTipTipoAreaLabo=TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoAreaLabo+="(Cartera.TipoAreaLabo)";
		}
		
		if(!this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoAreaLabo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoAreaLabo.setToolTipText(sToolTipTipoAreaLabo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoAreaLabo);
		this.jTableDatosTipoAreaLabo.setAutoCreateRowSorter(true);
		this.jTableDatosTipoAreaLabo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoAreaLabo.setRowSelectionAllowed(true);
		this.jTableDatosTipoAreaLabo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoAreaLabo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoAreaLabo = new JButtonMe();
		this.jButtonDuplicarTipoAreaLabo = new JButtonMe();
		this.jButtonCopiarTipoAreaLabo = new JButtonMe();
		this.jButtonVerFormTipoAreaLabo = new JButtonMe();
		this.jButtonNuevoRelacionesTipoAreaLabo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoAreaLabo = new JButtonMe();
		this.jButtonCerrarTipoAreaLabo = new JButtonMe();
		
		this.jScrollPanelDatosTipoAreaLabo = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoAreaLabo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoAreaLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Area Labo";
		
		if(!this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoAreaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Area Labos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoAreaLabo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoAreaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoAreaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoAreaLabo.setToolTipText("Acciones");
        this.jPanelAccionesTipoAreaLabo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoAreaLabo=new ReporteDinamicoJInternalFrame(TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoAreaLabo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoAreaLabo=new ImportacionJInternalFrame(TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoAreaLabo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoAreaLabo = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoAreaLabo.setText("Orden");
		this.jButtonAbrirOrderByTipoAreaLabo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoAreaLabo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoAreaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoAreaLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoAreaLabo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoAreaLabo,false,this);
			
			//this.cargarOrderByTipoAreaLabo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoAreaLabo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoAreaLabo,true,this);
			
			//this.cargarOrderByTipoAreaLabo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoAreaLabo.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoAreaLabo.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoAreaLabo.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoAreaLabo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoAreaLabo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoAreaLabo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoAreaLabo.setText("Nuevo");
		this.jButtonDuplicarTipoAreaLabo.setText("Duplicar");
		this.jButtonCopiarTipoAreaLabo.setText("Copiar");
		this.jButtonVerFormTipoAreaLabo.setText("Ver");
		this.jButtonNuevoRelacionesTipoAreaLabo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoAreaLabo.setText("Guardar");
		this.jButtonCerrarTipoAreaLabo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoAreaLabo,"nuevo_button","Nuevo",this.tipoarealaboSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoAreaLabo,"duplicar_button","Duplicar",this.tipoarealaboSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoAreaLabo,"copiar_button","Copiar",this.tipoarealaboSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoAreaLabo,"ver_form","Ver",this.tipoarealaboSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoAreaLabo,"nuevorelaciones_button","Nuevo Rel",this.tipoarealaboSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoAreaLabo,"guardarcambiostabla_button","Guardar",this.tipoarealaboSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoAreaLabo,"cerrar_button","Salir",this.tipoarealaboSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoAreaLabo.setToolTipText("Nuevo"+" "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoAreaLabo.setToolTipText("Duplicar"+" "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoAreaLabo.setToolTipText("Copiar"+" "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoAreaLabo.setToolTipText("Ver"+" "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoAreaLabo.setToolTipText("Nuevo Rel"+" "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoAreaLabo.setToolTipText("Guardar"+" "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoAreaLabo.setToolTipText("Salir"+" "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoAreaLabo";
		inputMap = this.jButtonNuevoTipoAreaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoAreaLabo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoAreaLabo"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoAreaLabo";
		inputMap = this.jButtonDuplicarTipoAreaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoAreaLabo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoAreaLabo"));
		
		//COPIAR
		sMapKey = "CopiarTipoAreaLabo";
		inputMap = this.jButtonCopiarTipoAreaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoAreaLabo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoAreaLabo"));
		
		//VEr FORM
		sMapKey = "VerFormTipoAreaLabo";
		inputMap = this.jButtonVerFormTipoAreaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoAreaLabo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoAreaLabo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoAreaLabo";
		inputMap = this.jButtonNuevoRelacionesTipoAreaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoAreaLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoAreaLabo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoAreaLabo";
		inputMap = this.jButtonModificarTipoAreaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoAreaLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoAreaLabo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoAreaLabo";
		inputMap = this.jButtonCerrarTipoAreaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoAreaLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoAreaLabo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoAreaLabo";
		inputMap = this.jButtonGuardarCambiosTablaTipoAreaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoAreaLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoAreaLabo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoAreaLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoAreaLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoAreaLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoAreaLabo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoAreaLabo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoAreaLabo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoAreaLabo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoAreaLabo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoAreaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoAreaLabo.setName("jPanelParametrosReportesTipoAreaLabo"); 
		
		this.jPanelParametrosReportesAccionesTipoAreaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoAreaLabo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoAreaLabo.setName("jPanelParametrosReportesAccionesTipoAreaLabo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoAreaLabo = new JButtonMe();
		this.jButtonRecargarInformacionTipoAreaLabo.setText("Recargar");
		this.jButtonRecargarInformacionTipoAreaLabo.setToolTipText("Recargar"+" "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoAreaLabo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoAreaLabo = new JButtonMe();
		this.jButtonProcesarInformacionTipoAreaLabo.setText("Procesar");
		this.jButtonProcesarInformacionTipoAreaLabo.setToolTipText("Procesar"+" "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoAreaLabo.setVisible(false);
			
		this.jButtonProcesarInformacionTipoAreaLabo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoAreaLabo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoAreaLabo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoAreaLabo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoAreaLabo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoAreaLabo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoAreaLabo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoAreaLabo.setText("TIPO");       
		this.jComboBoxTiposReportesTipoAreaLabo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoAreaLabo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoAreaLabo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoAreaLabo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoAreaLabo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoAreaLabo.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoAreaLabo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoAreaLabo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoAreaLabo.setText("Accion");
		this.jComboBoxTiposRelacionesTipoAreaLabo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoAreaLabo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoAreaLabo.setText("Accion");
		this.jComboBoxTiposAccionesTipoAreaLabo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoAreaLabo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoAreaLabo.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoAreaLabo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoAreaLabo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoAreaLabo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoAreaLabo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoAreaLabo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoAreaLabo = new JLabelMe();
		
		this.jLabelAccionesTipoAreaLabo.setText("Acciones");		
		this.jLabelAccionesTipoAreaLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoAreaLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoAreaLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoAreaLabo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoAreaLabo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoAreaLabo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoAreaLabo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoAreaLabo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoAreaLabo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoAreaLabo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoAreaLabo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoAreaLabo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoAreaLabo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoAreaLabo.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoAreaLabo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoAreaLabo = new JButtonMe();
		//this.jButtonAnterioresTipoAreaLabo.setText("<<");
        this.jButtonAnterioresTipoAreaLabo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoAreaLabo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoAreaLabo = new JButtonMe();
		//this.jButtonSiguientesTipoAreaLabo.setText(">>");
        this.jButtonSiguientesTipoAreaLabo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoAreaLabo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoAreaLabo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoAreaLabo.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoAreaLabo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoAreaLabo,"nuevoguardarcambios_button","Nue",this.tipoarealaboSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoAreaLabo";
		inputMap = this.jButtonNuevoGuardarCambiosTipoAreaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoAreaLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoAreaLabo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoAreaLabo";
		inputMap = this.jButtonRecargarInformacionTipoAreaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoAreaLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoAreaLabo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoAreaLabo";
		inputMap = this.jButtonSiguientesTipoAreaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoAreaLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoAreaLabo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoAreaLabo";
		inputMap = this.jButtonAnterioresTipoAreaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoAreaLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoAreaLabo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoAreaLabo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoAreaLabo.setMinimumSize(new Dimension(this.getWidth(),TipoAreaLaboBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoAreaLaboBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoAreaLabo.setMaximumSize(new Dimension(this.getWidth(),TipoAreaLaboBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoAreaLaboBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoAreaLabo.setPreferredSize(new Dimension(this.getWidth(),TipoAreaLaboBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoAreaLaboBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoAreaLabo = new GridBagLayout();

			this.jPanelPaginacionTipoAreaLabo.setLayout(gridaBagLayoutPaginacionTipoAreaLabo);						
			
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaLabo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAreaLabo.gridy = 0;
			this.gridBagConstraintsTipoAreaLabo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoAreaLabo.add(this.jButtonAnterioresTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
					
						
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaLabo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoAreaLabo.gridy = 0;
			
			this.jPanelPaginacionTipoAreaLabo.add(this.jButtonNuevoGuardarCambiosTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
						
			
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaLabo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoAreaLabo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoAreaLabo.gridy = 0;
			this.jPanelPaginacionTipoAreaLabo.add(this.jButtonSiguientesTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAreaLabo.gridy = 1;
			this.gridBagConstraintsTipoAreaLabo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoAreaLabo.add(this.jButtonNuevoTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
				this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoAreaLabo.gridy = 1;
				this.gridBagConstraintsTipoAreaLabo.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoAreaLabo.add(this.jButtonNuevoRelacionesTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
			}
			
			
			if(!this.tipoarealaboSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
				this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoAreaLabo.gridy = 1;
				this.gridBagConstraintsTipoAreaLabo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoAreaLabo.add(this.jButtonGuardarCambiosTablaTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
			}
			
			
			
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAreaLabo.gridy = 1;
			this.gridBagConstraintsTipoAreaLabo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoAreaLabo.add(this.jButtonDuplicarTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
			
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAreaLabo.gridy = 1;
			this.gridBagConstraintsTipoAreaLabo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoAreaLabo.add(this.jButtonCopiarTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
		
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAreaLabo.gridy = 1;
			this.gridBagConstraintsTipoAreaLabo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoAreaLabo.add(this.jButtonVerFormTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
		
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAreaLabo.gridy = 1;
			this.gridBagConstraintsTipoAreaLabo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoAreaLabo.add(this.jButtonCerrarTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
		
		
		
		this.jButtonRecargarInformacionTipoAreaLabo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoAreaLabo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoAreaLabo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoAreaLabo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoAreaLabo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoAreaLabo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoAreaLabo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoAreaLabo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoAreaLabo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoAreaLabo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoAreaLabo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoAreaLabo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoAreaLabo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoAreaLabo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoAreaLabo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoAreaLabo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoAreaLabo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoAreaLabo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoAreaLabo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoAreaLabo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoAreaLabo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoAreaLabo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoAreaLabo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoAreaLabo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoAreaLabo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoAreaLabo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoAreaLabo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoAreaLabo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoAreaLabo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoAreaLabo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoAreaLabo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoAreaLabo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoAreaLabo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoAreaLabo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoAreaLabo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoAreaLabo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoAreaLabo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoAreaLabo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoAreaLabo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoAreaLabo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoAreaLabo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoAreaLabo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoAreaLabo.setLayout(gridaBagParametrosReportesTipoAreaLabo);
			this.jPanelParametrosReportesAccionesTipoAreaLabo.setLayout(gridaBagParametrosReportesAccionesTipoAreaLabo);
			
			
			this.jPanelParametrosAuxiliar1TipoAreaLabo.setLayout(gridaBagParametrosAuxiliar1TipoAreaLabo);
			this.jPanelParametrosAuxiliar2TipoAreaLabo.setLayout(gridaBagParametrosAuxiliar2TipoAreaLabo);
			this.jPanelParametrosAuxiliar3TipoAreaLabo.setLayout(gridaBagParametrosAuxiliar3TipoAreaLabo);
			this.jPanelParametrosAuxiliar4TipoAreaLabo.setLayout(gridaBagParametrosAuxiliar4TipoAreaLabo);
			//this.jPanelParametrosAuxiliar5TipoAreaLabo.setLayout(gridaBagParametrosAuxiliar2TipoAreaLabo);			
			
			
			
			
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAreaLabo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoAreaLabo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoAreaLabo.add(this.jButtonRecargarInformacionTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaLabo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAreaLabo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAreaLabo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoAreaLabo.add(this.jComboBoxTiposPaginacionTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaLabo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAreaLabo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAreaLabo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoAreaLabo.add(this.jCheckBoxConAltoMaximoTablaTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaLabo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAreaLabo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAreaLabo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoAreaLabo.add(this.jComboBoxTiposArchivosReportesTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaLabo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAreaLabo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAreaLabo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoAreaLabo.add(this.jPanelParametrosAuxiliar1TipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaLabo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAreaLabo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoAreaLabo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoAreaLabo.add(this.jComboBoxTiposReportesTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaLabo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAreaLabo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAreaLabo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoAreaLabo.add(this.jPanelParametrosAuxiliar4TipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaLabo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAreaLabo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAreaLabo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoAreaLabo.add(this.jComboBoxTiposReportesTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaLabo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAreaLabo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAreaLabo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoAreaLabo.add(this.jCheckBoxGenerarReporteTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaLabo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAreaLabo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAreaLabo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoAreaLabo.add(this.jPanelParametrosAuxiliar2TipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAreaLabo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoAreaLabo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoAreaLabo.add(this.jLabelAccionesTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
				this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoAreaLabo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoAreaLabo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoAreaLabo.add(this.jButtonAbrirOrderByTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoAreaLabo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAreaLabo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoAreaLabo.add(this.jComboBoxTiposSeleccionarTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);			
			
			
			/*
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAreaLabo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoAreaLabo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoAreaLabo.add(this.jCheckBoxSeleccionarTodosTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaLabo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAreaLabo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoAreaLabo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoAreaLabo.add(this.jCheckBoxSeleccionarTodosTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);															
				
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaLabo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAreaLabo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoAreaLabo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoAreaLabo.add(this.jCheckBoxSeleccionadosTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaLabo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAreaLabo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAreaLabo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoAreaLabo.add(this.jPanelParametrosAuxiliar3TipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaLabo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAreaLabo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoAreaLabo.add(this.jComboBoxTiposRelacionesTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
				
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaLabo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAreaLabo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoAreaLabo.add(this.jComboBoxTiposAccionesTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
	
				
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaLabo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAreaLabo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoAreaLabo.add(this.jTextFieldValorCampoGeneralTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoAreaLabo = new GridBagLayout();

			this.jScrollPanelDatosTipoAreaLabo.setLayout(gridaBagLayoutDatosTipoAreaLabo);
			
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAreaLabo.gridy = 0;
			this.gridBagConstraintsTipoAreaLabo.gridx = 0;
			
			this.jScrollPanelDatosTipoAreaLabo.add(this.jTableDatosTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoAreaLabo.setViewportView(this.jTableDatosTipoAreaLabo);
		this.jTableDatosTipoAreaLabo.setFillsViewportHeight(true);
		this.jTableDatosTipoAreaLabo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoAreaLabo= new GridBagLayout();
		this.jPanelAccionesTipoAreaLabo.setLayout(gridaBagLayoutAccionesTipoAreaLabo);
		
		
		/*	
		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAreaLabo.gridy = 0;
		this.gridBagConstraintsTipoAreaLabo.gridx = 0;
			
		this.jPanelAccionesTipoAreaLabo.add(this.jButtonNuevoTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoAreaLabo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoAreaLabo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();						
			this.gridBagConstraintsTipoAreaLabo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoAreaLabo.gridx = 0;		
			//this.gridBagConstraintsTipoAreaLabo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAreaLabo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoAreaLabo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoAreaLabo.gridx = 0;		
		//this.gridBagConstraintsTipoAreaLabo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAreaLabo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoAreaLabo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoAreaLabo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAreaLabo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);								
		
		
		/*
		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAreaLabo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
		*/		
		
		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoAreaLabo.gridx =0;
		this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoAreaLabo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
				
		
		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAreaLabo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoAreaLaboJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoAreaLabo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoAreaLabo = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoAreaLabo.setLayout(gridaBagLayoutBusquedasParametrosTipoAreaLabo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoAreaLabo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoAreaLabo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoAreaLabo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoAreaLabo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAreaLabo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
			
			
		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAreaLabo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
		
			
		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoAreaLabo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoAreaLabo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoAreaLabo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoAreaLabo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoAreaLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoAreaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoAreaLabo.setName("jPanelReporteDinamicoTipoAreaLabo"); 
		
		this.jPanelReporteDinamicoTipoAreaLabo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoAreaLabo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoAreaLabo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoAreaLabo.setLayout(gridaBagLayoutReporteDinamicoTipoAreaLabo);
		
		
		this.jInternalFrameReporteDinamicoTipoAreaLabo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoAreaLabo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoAreaLabo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoAreaLabo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoAreaLabo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoAreaLabo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoAreaLabo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoAreaLabo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoAreaLabo.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoAreaLabo.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoAreaLabo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoAreaLabo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoAreaLabo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoAreaLabo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoAreaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Area Labos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoAreaLabo = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoAreaLabo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoAreaLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoAreaLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoAreaLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAreaLabo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAreaLabo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoAreaLabo.add(this.jLabelColumnasSelectReporteTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoAreaLabo = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoAreaLabo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoAreaLabo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoAreaLabo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoAreaLabo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoAreaLabo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoAreaLabo=new JScrollPane(this.jListColumnasSelectReporteTipoAreaLabo);
			
			this.jScrollColumnasSelectReporteTipoAreaLabo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoAreaLabo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoAreaLabo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoAreaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAreaLabo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAreaLabo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoAreaLabo.add(this.jListColumnasSelectReporteTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
		this.jPanelReporteDinamicoTipoAreaLabo.add(this.jScrollColumnasSelectReporteTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoAreaLabo = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoAreaLabo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoAreaLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoAreaLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoAreaLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAreaLabo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAreaLabo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoAreaLabo.add(this.jLabelRelacionesSelectReporteTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoAreaLabo = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoAreaLabo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoAreaLabo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoAreaLabo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoAreaLabo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoAreaLabo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoAreaLabo=new JScrollPane(this.jListRelacionesSelectReporteTipoAreaLabo);
			
			this.jScrollRelacionesSelectReporteTipoAreaLabo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoAreaLabo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoAreaLabo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoAreaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAreaLabo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAreaLabo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoAreaLabo.add(this.jListRelacionesSelectReporteTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
		this.jPanelReporteDinamicoTipoAreaLabo.add(this.jScrollRelacionesSelectReporteTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoAreaLabo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoAreaLabo = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoAreaLabo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoAreaLabo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoAreaLabo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoAreaLabo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoAreaLabo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoAreaLabo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoAreaLabo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoAreaLabo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoAreaLabo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoAreaLabo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoAreaLabo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoAreaLabo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoAreaLabo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoAreaLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoAreaLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoAreaLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAreaLabo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAreaLabo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoAreaLabo.add(this.jLabelGenerarExcelReporteDinamicoTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoAreaLabo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoAreaLabo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoAreaLabo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoAreaLabo.setToolTipText("Generar EXCEL"+" "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		//this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoAreaLabo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoAreaLabo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoAreaLabo.add(this.jButtonGenerarExcelReporteDinamicoTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAreaLabo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoAreaLabo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoAreaLabo.add(this.jComboBoxTiposReportesDinamicoTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoAreaLabo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoAreaLabo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoAreaLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoAreaLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoAreaLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAreaLabo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAreaLabo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoAreaLabo.add(this.jLabelTiposArchivoReporteDinamicoTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAreaLabo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoAreaLabo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoAreaLabo.add(this.jComboBoxTiposArchivosReportesDinamicoTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoAreaLabo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoAreaLabo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoAreaLabo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoAreaLabo.setToolTipText("Generar"+" "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAreaLabo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoAreaLabo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoAreaLabo.add(this.jButtonGenerarReporteDinamicoTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoAreaLabo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoAreaLabo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoAreaLabo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoAreaLabo.setToolTipText("Cancelar"+" "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAreaLabo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoAreaLabo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoAreaLabo.add(this.jButtonCerrarReporteDinamicoTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoAreaLabo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoAreaLabo= new JScrollPane(jPanelReporteDinamicoTipoAreaLabo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoAreaLabo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoAreaLabo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoAreaLabo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoAreaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Area Labos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoAreaLabo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoAreaLabo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoAreaLabo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoAreaLabo);
		this.jInternalFrameReporteDinamicoTipoAreaLabo.getContentPane().add(this.jScrollPanelReporteDinamicoTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoAreaLabo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoAreaLabo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoAreaLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoAreaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoAreaLabo.setName("jPanelImportacionTipoAreaLabo"); 
		
		this.jPanelImportacionTipoAreaLabo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoAreaLabo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoAreaLabo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoAreaLabo.setLayout(gridaBagLayoutImportacionTipoAreaLabo);
		
		
		this.jInternalFrameImportacionTipoAreaLabo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoAreaLabo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoAreaLabo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoAreaLabo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoAreaLabo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoAreaLabo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoAreaLabo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoAreaLabo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoAreaLabo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoAreaLabo.setResizable(true);
	    this.jInternalFrameImportacionTipoAreaLabo.setClosable(true);
	    this.jInternalFrameImportacionTipoAreaLabo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoAreaLabo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoAreaLabo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoAreaLabo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoAreaLabo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoAreaLabo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoAreaLabo.setResizable(true);
	    this.jInternalFrameImportacionTipoAreaLabo.setClosable(true);
	    this.jInternalFrameImportacionTipoAreaLabo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoAreaLabo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoAreaLabo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoAreaLabo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoAreaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Area Labos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoAreaLabo = new JLabelMe();

		this.jLabelArchivoImportacionTipoAreaLabo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoAreaLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoAreaLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoAreaLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAreaLabo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoAreaLabo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoAreaLabo.add(this.jLabelArchivoImportacionTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoAreaLabo = new JFileChooser();		
		this.jFileChooserImportacionTipoAreaLabo.setToolTipText("ESCOGER ARCHIVO"+" "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoAreaLabo = new JButtonMe();
		this.jButtonAbrirImportacionTipoAreaLabo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoAreaLabo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoAreaLabo.setToolTipText("Generar"+" "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAreaLabo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoAreaLabo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoAreaLabo.add(this.jButtonAbrirImportacionTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoAreaLabo = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoAreaLabo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoAreaLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoAreaLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoAreaLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAreaLabo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoAreaLabo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoAreaLabo.add(this.jLabelPathArchivoImportacionTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoAreaLabo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoAreaLabo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoAreaLabo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoAreaLabo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAreaLabo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoAreaLabo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoAreaLabo.add(this.jTextFieldPathArchivoImportacionTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoAreaLabo = new JButtonMe();
		this.jButtonGenerarImportacionTipoAreaLabo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoAreaLabo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoAreaLabo.setToolTipText("Generar"+" "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAreaLabo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoAreaLabo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoAreaLabo.add(this.jButtonGenerarImportacionTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoAreaLabo = new JButtonMe();
		this.jButtonCerrarImportacionTipoAreaLabo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoAreaLabo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoAreaLabo.setToolTipText("Cancelar"+" "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAreaLabo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoAreaLabo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoAreaLabo.add(this.jButtonCerrarImportacionTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoAreaLabo = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoAreaLabo= new JScrollPane(jPanelImportacionTipoAreaLabo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaLabo.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoAreaLabo.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoAreaLabo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoAreaLabo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoAreaLabo);
		this.jInternalFrameImportacionTipoAreaLabo.getContentPane().add(this.jScrollPanelImportacionTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoAreaLabo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoAreaLabo = new JButtonMe();
			this.jButtonAbrirOrderByTipoAreaLabo.setText("Orden");
			this.jButtonAbrirOrderByTipoAreaLabo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoAreaLabo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoAreaLabo";
			inputMap = this.jButtonAbrirOrderByTipoAreaLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoAreaLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoAreaLabo"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoAreaLabo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoAreaLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoAreaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoAreaLabo.setName("jPanelOrderByTipoAreaLabo"); 
			
			this.jPanelOrderByTipoAreaLabo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoAreaLabo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoAreaLabo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoAreaLabo.setLayout(gridaBagLayoutOrderByTipoAreaLabo);
			
			
			this.jTableDatosTipoAreaLaboOrderBy = new JTableMe();        
			this.jTableDatosTipoAreaLaboOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoAreaLaboOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoAreaLaboOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoAreaLaboOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoAreaLaboOrderBy.setViewportView(this.jTableDatosTipoAreaLaboOrderBy);
			this.jTableDatosTipoAreaLaboOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoAreaLaboOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoAreaLabo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoAreaLabo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoAreaLabo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoAreaLabo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoAreaLabo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoAreaLabo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoAreaLabo.setTitle("Orden");
			this.jInternalFrameOrderByTipoAreaLabo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoAreaLabo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoAreaLabo.setResizable(true);
			this.jInternalFrameOrderByTipoAreaLabo.setClosable(true);
			this.jInternalFrameOrderByTipoAreaLabo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoAreaLabo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoAreaLabo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoAreaLabo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoAreaLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Area Labos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaLabo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoAreaLabo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoAreaLabo.ipady =150;
				
			this.jPanelOrderByTipoAreaLabo.add(jScrollPanelDatosTipoAreaLaboOrderBy, this.gridBagConstraintsTipoAreaLabo);//this.jTableDatosTipoAreaLaboTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoAreaLabo = new JButtonMe();
			this.jButtonCerrarOrderByTipoAreaLabo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoAreaLabo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoAreaLabo.setToolTipText("Cancelar"+" "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoAreaLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAreaLabo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoAreaLabo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoAreaLabo.add(this.jButtonCerrarOrderByTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoAreaLabo = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoAreaLabo= new JScrollPane(jPanelOrderByTipoAreaLabo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoAreaLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaLabo.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoAreaLabo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoAreaLabo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoAreaLabo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoAreaLabo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoAreaLabo);
			
			this.jInternalFrameOrderByTipoAreaLabo.getContentPane().add(this.jScrollPanelOrderByTipoAreaLabo, this.gridBagConstraintsTipoAreaLabo);			
		
		} else {
			this.jButtonAbrirOrderByTipoAreaLabo = new JButtonMe();
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
			&& this.tipoarealaboSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoAreaLabo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoAreaLabo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoAreaLabo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoAreaLabo.getRowHeight();//TipoAreaLaboConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoAreaLaboConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoAreaLabo.isSelected()) {
					iHeightTable=TipoAreaLaboConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoAreaLaboConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoAreaLaboConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoAreaLaboConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoAreaLabo.isSelected()) {
					iHeightTable=TipoAreaLaboConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoAreaLaboConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoAreaLaboConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoAreaLabo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoAreaLabo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoAreaLabo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoAreaLabo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoAreaLabo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoAreaLabo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoAreaLabo!=null && this.jInternalFrameOrderByTipoAreaLabo.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoAreaLabo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoAreaLabo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoAreaLabo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoAreaLabo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoAreaLabo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoAreaLabo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoAreaLabo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoAreaLabo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoAreaLabo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoAreaLabo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoarealaboLogic.getTipoAreaLabos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoarealabos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoAreaLabo> TraerTipoAreaLaboBeans(List<TipoAreaLabo> tipoarealabos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoAreaLabo tipoarealabo:tipoarealabos) {
					
				if(!(TipoAreaLaboConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoAreaLaboConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoarealabo.setsDetalleGeneralEntityReporte(TipoAreaLaboConstantesFunciones.getTipoAreaLaboDescripcion(tipoarealabo));
										
						
					
					

					if(tipoarealabo.getInformacionLaborals()!=null && Funciones.existeClass(classes,InformacionLaboral.class)) {
						try{tipoarealabo.setinformacionlaboralsDescripcionReporte(new JRBeanCollectionDataSource(InformacionLaboralJInternalFrame.TraerInformacionLaboralBeans(tipoarealabo.getInformacionLaborals(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipoarealabo.setsDetalleGeneralEntityReporte(tipoarealabo.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoarealabobeans.add(tipoarealabobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoarealabos;
    }
	//PARA REPORTES FIN
}
