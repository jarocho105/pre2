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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.GrupoParametroFormularioIvaConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class GrupoParametroFormularioIvaJInternalFrame extends GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarGrupoParametroFormularioIva;
	
	protected JMenuBar jmenuBarGrupoParametroFormularioIva;
	
	protected JMenu jmenuGrupoParametroFormularioIva;
	protected JMenu jmenuDatosGrupoParametroFormularioIva;
	protected JMenu jmenuArchivoGrupoParametroFormularioIva;
	protected JMenu jmenuAccionesGrupoParametroFormularioIva;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosGrupoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutGrupoParametroFormularioIva;	
	protected GridBagConstraints gridBagConstraintsGrupoParametroFormularioIva;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public GrupoParametroFormularioIvaDetalleFormJInternalFrame jInternalFrameDetalleFormGrupoParametroFormularioIva;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoGrupoParametroFormularioIva;	
	protected ImportacionJInternalFrame jInternalFrameImportacionGrupoParametroFormularioIva;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public GrupoParametroFormularioIvaSessionBean grupoparametroformularioivaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<GrupoParametroFormularioIva> grupoparametroformularioivas;		
	public List<GrupoParametroFormularioIva> grupoparametroformularioivasEliminados;	
	public List<GrupoParametroFormularioIva> grupoparametroformularioivasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByGrupoParametroFormularioIva;		
	protected JButton jButtonAbrirOrderByGrupoParametroFormularioIva;
	
	
	//protected JPanel jPanelOrderByGrupoParametroFormularioIva;
	//public JScrollPane jScrollPanelOrderByGrupoParametroFormularioIva;	
	//protected JButton jButtonCerrarOrderByGrupoParametroFormularioIva;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public GrupoParametroFormularioIvaLogic grupoparametroformularioivaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosGrupoParametroFormularioIva;
	public JScrollPane jScrollPanelDatosEdicionGrupoParametroFormularioIva;
	public JScrollPane jScrollPanelDatosGeneralGrupoParametroFormularioIva;
    
	
	
	//public JScrollPane jScrollPanelDatosGrupoParametroFormularioIvaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoGrupoParametroFormularioIva;
	//public JScrollPane jScrollPanelImportacionGrupoParametroFormularioIva;
	
	
	
	protected JPanel jPanelAccionesGrupoParametroFormularioIva;
	
    protected JPanel jPanelPaginacionGrupoParametroFormularioIva;
    protected JPanel jPanelParametrosReportesGrupoParametroFormularioIva;
	protected JPanel jPanelParametrosReportesAccionesGrupoParametroFormularioIva;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1GrupoParametroFormularioIva;
	protected JPanel jPanelParametrosAuxiliar2GrupoParametroFormularioIva;
	protected JPanel jPanelParametrosAuxiliar3GrupoParametroFormularioIva;
	protected JPanel jPanelParametrosAuxiliar4GrupoParametroFormularioIva;
	//protected JPanel jPanelParametrosAuxiliar5GrupoParametroFormularioIva;
	
	
	
	//protected JPanel jPanelReporteDinamicoGrupoParametroFormularioIva;
	//protected JPanel jPanelImportacionGrupoParametroFormularioIva;
	
	
	public JTable jTableDatosGrupoParametroFormularioIva;
	
	
	
	//public JTable jTableDatosGrupoParametroFormularioIvaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoGrupoParametroFormularioIva;
	protected JButton jButtonDuplicarGrupoParametroFormularioIva;
	protected JButton jButtonCopiarGrupoParametroFormularioIva;
	protected JButton jButtonVerFormGrupoParametroFormularioIva;
	protected JButton jButtonNuevoRelacionesGrupoParametroFormularioIva;
	protected JButton jButtonModificarGrupoParametroFormularioIva;
	
    protected JButton jButtonGuardarCambiosTablaGrupoParametroFormularioIva;
	protected JButton jButtonCerrarGrupoParametroFormularioIva;
	
	
	protected JButton jButtonRecargarInformacionGrupoParametroFormularioIva;
	protected JButton jButtonProcesarInformacionGrupoParametroFormularioIva;
	
	
	protected JButton jButtonAnterioresGrupoParametroFormularioIva;
	protected JButton jButtonSiguientesGrupoParametroFormularioIva;
	protected JButton jButtonNuevoGuardarCambiosGrupoParametroFormularioIva;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoGrupoParametroFormularioIva;
	//protected JButton jButtonCerrarReporteDinamicoGrupoParametroFormularioIva;
	//protected JButton jButtonGenerarExcelReporteDinamicoGrupoParametroFormularioIva;	
	
	
	
	//protected JButton jButtonAbrirImportacionGrupoParametroFormularioIva;
	//protected JButton jButtonGenerarImportacionGrupoParametroFormularioIva;
	//protected JButton jButtonCerrarImportacionGrupoParametroFormularioIva;
	//protected JFileChooser jFileChooserImportacionGrupoParametroFormularioIva;
	//protected File fileImportacionGrupoParametroFormularioIva;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarGrupoParametroFormularioIva;
	protected JButton jButtonDuplicarToolBarGrupoParametroFormularioIva;
	protected JButton jButtonNuevoRelacionesToolBarGrupoParametroFormularioIva;
	
	
	public JButton jButtonGuardarCambiosToolBarGrupoParametroFormularioIva;
	protected JButton jButtonCopiarToolBarGrupoParametroFormularioIva;
	protected JButton jButtonVerFormToolBarGrupoParametroFormularioIva;
	public JButton jButtonGuardarCambiosTablaToolBarGrupoParametroFormularioIva;
	protected JButton jButtonMostrarOcultarTablaToolBarGrupoParametroFormularioIva;
	protected JButton jButtonCerrarToolBarGrupoParametroFormularioIva;
	
	protected JButton jButtonRecargarInformacionToolBarGrupoParametroFormularioIva;
	protected JButton jButtonProcesarInformacionToolBarGrupoParametroFormularioIva;
	protected JButton jButtonAnterioresToolBarGrupoParametroFormularioIva;
	protected JButton jButtonSiguientesToolBarGrupoParametroFormularioIva;
	protected JButton jButtonNuevoGuardarCambiosToolBarGrupoParametroFormularioIva;
	protected JButton jButtonAbrirOrderByToolBarGrupoParametroFormularioIva;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemDuplicarGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemNuevoRelacionesGrupoParametroFormularioIva;
	
	
	protected JMenuItem jMenuItemGuardarCambiosGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemCopiarGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemVerFormGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemGuardarCambiosTablaGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemCerrarGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemDetalleCerrarGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemDetalleAbrirOrderByGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemDetalleMostarOcultarGrupoParametroFormularioIva;
	
	protected JMenuItem jMenuItemRecargarInformacionGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemProcesarInformacionGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemAnterioresGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemSiguientesGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemNuevoGuardarCambiosGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemAbrirOrderByGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemMostrarOcultarGrupoParametroFormularioIva;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesGrupoParametroFormularioIva;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosGrupoParametroFormularioIva;
	protected JCheckBox jCheckBoxSeleccionadosGrupoParametroFormularioIva;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaGrupoParametroFormularioIva;
	protected JCheckBox jCheckBoxConGraficoReporteGrupoParametroFormularioIva;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesGrupoParametroFormularioIva;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesGrupoParametroFormularioIva;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoGrupoParametroFormularioIva;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoGrupoParametroFormularioIva;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesGrupoParametroFormularioIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionGrupoParametroFormularioIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesGrupoParametroFormularioIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesGrupoParametroFormularioIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarGrupoParametroFormularioIva;
	protected JTextField jTextFieldValorCampoGeneralGrupoParametroFormularioIva;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteGrupoParametroFormularioIva;
	//public JList<Reporte> jListColumnasSelectReporteGrupoParametroFormularioIva;
	//public JScrollPane jScrollColumnasSelectReporteGrupoParametroFormularioIva;
	
	//public JLabel jLabelRelacionesSelectReporteGrupoParametroFormularioIva;
	//public JList<Reporte> jListRelacionesSelectReporteGrupoParametroFormularioIva;
	//public JScrollPane jScrollRelacionesSelectReporteGrupoParametroFormularioIva;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoGrupoParametroFormularioIva;
	//protected JCheckBox jCheckBoxConGraficoDinamicoGrupoParametroFormularioIva;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoGrupoParametroFormularioIva;
	//public JLabel jLabelTiposArchivoReporteDinamicoGrupoParametroFormularioIva;
	
		
	//public JLabel jLabelArchivoImportacionGrupoParametroFormularioIva;	
	//public JLabel jLabelPathArchivoImportacionGrupoParametroFormularioIva;
	//protected JTextField jTextFieldPathArchivoImportacionGrupoParametroFormularioIva;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoGrupoParametroFormularioIva;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoGrupoParametroFormularioIva;
	
	//public JLabel jLabelColumnaCategoriaValorGrupoParametroFormularioIva;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorGrupoParametroFormularioIva;
	
	//public JLabel jLabelColumnasValoresGraficoGrupoParametroFormularioIva;
	//public JList<Reporte> jListColumnasValoresGraficoGrupoParametroFormularioIva;
	//public JScrollPane jScrollColumnasValoresGraficoGrupoParametroFormularioIva;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoGrupoParametroFormularioIva;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoGrupoParametroFormularioIva;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasGrupoParametroFormularioIva;
	public JPanel jPanelBusquedaPorIdGrupoParametroFormularioIva;
	public JButton jButtonBusquedaPorIdGrupoParametroFormularioIva;
	public JPanel jPanelBusquedaPorNombreGrupoParametroFormularioIva;
	public JButton jButtonBusquedaPorNombreGrupoParametroFormularioIva;
	
	public JPanel jPanelIdIdBusquedaPorIdGrupoParametroFormularioIva;
	public JLabel jLabelidBusquedaPorIdGrupoParametroFormularioIva;
	public JTextFieldMe jLabelidGrupoParametroFormularioIvaBusquedaPorId;
	public JButton jButtonidBusquedaPorIdGrupoParametroFormularioIvaBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreGrupoParametroFormularioIva;
	public JLabel jLabelnombreBusquedaPorNombreGrupoParametroFormularioIva;
	public JTextArea jTextAreanombreBusquedaPorNombreGrupoParametroFormularioIva;
	public JButton jButtonnombreBusquedaPorNombreGrupoParametroFormularioIvaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public GrupoParametroFormularioIvaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("GrupoParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoParametroFormularioIvaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GrupoParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoParametroFormularioIvaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GrupoParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoParametroFormularioIvaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("GrupoParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionGrupoParametroFormularioIva)	{
		this.jButtonRecargarInformacionGrupoParametroFormularioIva = jButtonRecargarInformacionGrupoParametroFormularioIva;
	}
	
	public JButton getjButtonProcesarInformacionGrupoParametroFormularioIva() {
		return this.jButtonProcesarInformacionGrupoParametroFormularioIva;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionGrupoParametroFormularioIva)	{
		this.jButtonProcesarInformacionGrupoParametroFormularioIva = jButtonProcesarInformacionGrupoParametroFormularioIva;
	}
	
	
	public JButton getjButtonRecargarInformacionGrupoParametroFormularioIva() {
		return this.jButtonRecargarInformacionGrupoParametroFormularioIva;
	}
	
	
	public List<GrupoParametroFormularioIva> getgrupoparametroformularioivas() {
		return this.grupoparametroformularioivas;
	}

	public void setgrupoparametroformularioivas(List<GrupoParametroFormularioIva> grupoparametroformularioivas) {
		this.grupoparametroformularioivas = grupoparametroformularioivas;
	}
	
	public List<GrupoParametroFormularioIva> getgrupoparametroformularioivasAux() {
		return this.grupoparametroformularioivasAux;
	}

	public void setgrupoparametroformularioivasAux(List<GrupoParametroFormularioIva> grupoparametroformularioivasAux) {
		this.grupoparametroformularioivasAux = grupoparametroformularioivasAux;
	}
	
	public List<GrupoParametroFormularioIva> getgrupoparametroformularioivasEliminados() {
		return this.grupoparametroformularioivasEliminados;
	}

	public void setGrupoParametroFormularioIvasEliminados(List<GrupoParametroFormularioIva> grupoparametroformularioivasEliminados) {
		this.grupoparametroformularioivasEliminados = grupoparametroformularioivasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarGrupoParametroFormularioIva() {
		return jComboBoxTiposSeleccionarGrupoParametroFormularioIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarGrupoParametroFormularioIva(
			JComboBox jComboBoxTiposSeleccionarGrupoParametroFormularioIva) {
		this.jComboBoxTiposSeleccionarGrupoParametroFormularioIva = jComboBoxTiposSeleccionarGrupoParametroFormularioIva;
	}
	
	public void setBorderResaltarTiposSeleccionarGrupoParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarGrupoParametroFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarGrupoParametroFormularioIva .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralGrupoParametroFormularioIva() {
		return jTextFieldValorCampoGeneralGrupoParametroFormularioIva;
	}

	public void setjTextFieldValorCampoGeneralGrupoParametroFormularioIva(
			JTextField jTextFieldValorCampoGeneralGrupoParametroFormularioIva) {
		this.jTextFieldValorCampoGeneralGrupoParametroFormularioIva = jTextFieldValorCampoGeneralGrupoParametroFormularioIva;
	}

	public void setBorderResaltarValorCampoGeneralGrupoParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoParametroFormularioIva.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralGrupoParametroFormularioIva .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosGrupoParametroFormularioIva() {
		return this.jCheckBoxSeleccionarTodosGrupoParametroFormularioIva;
	}

	public void setjCheckBoxSeleccionarTodosGrupoParametroFormularioIva(
			JCheckBox jCheckBoxSeleccionarTodosGrupoParametroFormularioIva) {
		this.jCheckBoxSeleccionarTodosGrupoParametroFormularioIva = jCheckBoxSeleccionarTodosGrupoParametroFormularioIva;
	}

	public void setBorderResaltarSeleccionarTodosGrupoParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoParametroFormularioIva.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosGrupoParametroFormularioIva .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosGrupoParametroFormularioIva() {
		return this.jCheckBoxSeleccionadosGrupoParametroFormularioIva;
	}

	public void setjCheckBoxSeleccionadosGrupoParametroFormularioIva(
			JCheckBox jCheckBoxSeleccionadosGrupoParametroFormularioIva) {
		this.jCheckBoxSeleccionadosGrupoParametroFormularioIva = jCheckBoxSeleccionadosGrupoParametroFormularioIva;
	}
	
	public void setBorderResaltarSeleccionadosGrupoParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoParametroFormularioIva.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosGrupoParametroFormularioIva .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesGrupoParametroFormularioIva() {
		return this.jComboBoxTiposArchivosReportesGrupoParametroFormularioIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesGrupoParametroFormularioIva(
			JComboBox jComboBoxTiposArchivosReportesGrupoParametroFormularioIva) {
		this.jComboBoxTiposArchivosReportesGrupoParametroFormularioIva = jComboBoxTiposArchivosReportesGrupoParametroFormularioIva;
	}

	public void setBorderResaltarTiposArchivosReportesGrupoParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoParametroFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesGrupoParametroFormularioIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesGrupoParametroFormularioIva() {
		return this.jComboBoxTiposReportesGrupoParametroFormularioIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesGrupoParametroFormularioIva(
			JComboBox jComboBoxTiposReportesGrupoParametroFormularioIva) {
		this.jComboBoxTiposReportesGrupoParametroFormularioIva = jComboBoxTiposReportesGrupoParametroFormularioIva;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoGrupoParametroFormularioIva() {
	//	return jComboBoxTiposReportesDinamicoGrupoParametroFormularioIva;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoGrupoParametroFormularioIva(
	//		JComboBox jComboBoxTiposReportesDinamicoGrupoParametroFormularioIva) {
	//	this.jComboBoxTiposReportesDinamicoGrupoParametroFormularioIva = jComboBoxTiposReportesDinamicoGrupoParametroFormularioIva;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoGrupoParametroFormularioIva() {
	//	return jComboBoxTiposArchivosReportesDinamicoGrupoParametroFormularioIva;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoGrupoParametroFormularioIva(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoGrupoParametroFormularioIva) {
	//	this.jComboBoxTiposArchivosReportesDinamicoGrupoParametroFormularioIva = jComboBoxTiposArchivosReportesDinamicoGrupoParametroFormularioIva;
	//}
	
	public void setBorderResaltarTiposReportesGrupoParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoParametroFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesGrupoParametroFormularioIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesGrupoParametroFormularioIva() {
		return this.jComboBoxTiposGraficosReportesGrupoParametroFormularioIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesGrupoParametroFormularioIva(
			JComboBox jComboBoxTiposGraficosReportesGrupoParametroFormularioIva) {
		this.jComboBoxTiposGraficosReportesGrupoParametroFormularioIva = jComboBoxTiposGraficosReportesGrupoParametroFormularioIva;
	}
	
	public void setBorderResaltarTiposGraficosReportesGrupoParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoParametroFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesGrupoParametroFormularioIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionGrupoParametroFormularioIva() {
		return this.jComboBoxTiposPaginacionGrupoParametroFormularioIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionGrupoParametroFormularioIva(
			JComboBox jComboBoxTiposPaginacionGrupoParametroFormularioIva) {
		this.jComboBoxTiposPaginacionGrupoParametroFormularioIva = jComboBoxTiposPaginacionGrupoParametroFormularioIva;
	}
	
	public void setBorderResaltarTiposPaginacionGrupoParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoParametroFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionGrupoParametroFormularioIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesGrupoParametroFormularioIva() {
		return this.jComboBoxTiposRelacionesGrupoParametroFormularioIva;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesGrupoParametroFormularioIva() {
		return this.jComboBoxTiposAccionesGrupoParametroFormularioIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesGrupoParametroFormularioIva(
			JComboBox jComboBoxTiposRelacionesGrupoParametroFormularioIva) {
		this.jComboBoxTiposRelacionesGrupoParametroFormularioIva = jComboBoxTiposRelacionesGrupoParametroFormularioIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesGrupoParametroFormularioIva(
			JComboBox jComboBoxTiposAccionesGrupoParametroFormularioIva) {
		this.jComboBoxTiposAccionesGrupoParametroFormularioIva = jComboBoxTiposAccionesGrupoParametroFormularioIva;
	}
	
	public void setBorderResaltarTiposRelacionesGrupoParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoParametroFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesGrupoParametroFormularioIva .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesGrupoParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoParametroFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesGrupoParametroFormularioIva .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoGrupoParametroFormularioIva() {
	//	return jCheckBoxConGraficoDinamicoGrupoParametroFormularioIva;
	//}

	//public void setjCheckBoxConGraficoDinamicoGrupoParametroFormularioIva(
	//		JCheckBox jCheckBoxConGraficoDinamicoGrupoParametroFormularioIva) {
	//	this.jCheckBoxConGraficoDinamicoGrupoParametroFormularioIva = jCheckBoxConGraficoDinamicoGrupoParametroFormularioIva;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoGrupoParametroFormularioIva() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarGrupoParametroFormularioIva.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoGrupoParametroFormularioIva .setBorder(borderResaltar);		
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
		this.grupoparametroformularioivaSessionBean=new GrupoParametroFormularioIvaSessionBean();
		
		this.grupoparametroformularioivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.grupoparametroformularioivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=GrupoParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=GrupoParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		GrupoParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		GrupoParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		GrupoParametroFormularioIvaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Grupo Parametro Formulario Iva MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
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
		
		GrupoParametroFormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("GrupoParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarGrupoParametroFormularioIva= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarGrupoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarGrupoParametroFormularioIva,this.jTtoolBarGrupoParametroFormularioIva,
							"nuevo","nuevo","Nuevo"+" "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarGrupoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarGrupoParametroFormularioIva,this.jTtoolBarGrupoParametroFormularioIva,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarGrupoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarGrupoParametroFormularioIva,this.jTtoolBarGrupoParametroFormularioIva,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarGrupoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarGrupoParametroFormularioIva,this.jTtoolBarGrupoParametroFormularioIva,
							"duplicar","duplicar","Duplicar"+" "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarGrupoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarGrupoParametroFormularioIva,this.jTtoolBarGrupoParametroFormularioIva,
							"copiar","copiar","Copiar"+" "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarGrupoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarGrupoParametroFormularioIva,this.jTtoolBarGrupoParametroFormularioIva,
							"ver_form","ver_form","Ver"+" "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarGrupoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGrupoParametroFormularioIva,this.jTtoolBarGrupoParametroFormularioIva,
							"recargar","recargar","Recargar"+" "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarGrupoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGrupoParametroFormularioIva,this.jTtoolBarGrupoParametroFormularioIva,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarGrupoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGrupoParametroFormularioIva,this.jTtoolBarGrupoParametroFormularioIva,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarGrupoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarGrupoParametroFormularioIva,this.jTtoolBarGrupoParametroFormularioIva,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarGrupoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarGrupoParametroFormularioIva,this.jTtoolBarGrupoParametroFormularioIva,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarGrupoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarGrupoParametroFormularioIva,this.jTtoolBarGrupoParametroFormularioIva,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarGrupoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarGrupoParametroFormularioIva,this.jTtoolBarGrupoParametroFormularioIva,
							"cerrar","cerrar","Salir"+" "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarGrupoParametroFormularioIva=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarGrupoParametroFormularioIva;
			
				this.jButtonProcesarInformacionToolBarGrupoParametroFormularioIva=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarGrupoParametroFormularioIva;
				
		//protected JButton jButtonModificarToolBarGrupoParametroFormularioIva;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarGrupoParametroFormularioIva=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuGrupoParametroFormularioIva=new JMenuMe("General");
		this.jmenuArchivoGrupoParametroFormularioIva=new JMenuMe("Archivo");
		this.jmenuAccionesGrupoParametroFormularioIva=new JMenuMe("Acciones");
		this.jmenuDatosGrupoParametroFormularioIva=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoGrupoParametroFormularioIva= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoGrupoParametroFormularioIva.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGrupoParametroFormularioIva,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarGrupoParametroFormularioIva= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarGrupoParametroFormularioIva.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarGrupoParametroFormularioIva,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesGrupoParametroFormularioIva= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesGrupoParametroFormularioIva.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesGrupoParametroFormularioIva,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosGrupoParametroFormularioIva= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosGrupoParametroFormularioIva.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosGrupoParametroFormularioIva,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarGrupoParametroFormularioIva= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarGrupoParametroFormularioIva.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarGrupoParametroFormularioIva,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormGrupoParametroFormularioIva= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormGrupoParametroFormularioIva.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormGrupoParametroFormularioIva,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaGrupoParametroFormularioIva= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaGrupoParametroFormularioIva.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaGrupoParametroFormularioIva,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarGrupoParametroFormularioIva= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarGrupoParametroFormularioIva.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarGrupoParametroFormularioIva,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionGrupoParametroFormularioIva= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionGrupoParametroFormularioIva.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionGrupoParametroFormularioIva,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionGrupoParametroFormularioIva= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionGrupoParametroFormularioIva.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionGrupoParametroFormularioIva,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresGrupoParametroFormularioIva= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresGrupoParametroFormularioIva.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresGrupoParametroFormularioIva,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesGrupoParametroFormularioIva= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesGrupoParametroFormularioIva.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesGrupoParametroFormularioIva,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByGrupoParametroFormularioIva= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByGrupoParametroFormularioIva.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByGrupoParametroFormularioIva,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarGrupoParametroFormularioIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarGrupoParametroFormularioIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarGrupoParametroFormularioIva,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByGrupoParametroFormularioIva= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByGrupoParametroFormularioIva.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByGrupoParametroFormularioIva,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarGrupoParametroFormularioIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarGrupoParametroFormularioIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarGrupoParametroFormularioIva,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosGrupoParametroFormularioIva= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosGrupoParametroFormularioIva.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosGrupoParametroFormularioIva,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoGrupoParametroFormularioIva.add(this.jMenuItemCerrarGrupoParametroFormularioIva);
			
			this.jmenuAccionesGrupoParametroFormularioIva.add(this.jMenuItemNuevoGrupoParametroFormularioIva);
			this.jmenuAccionesGrupoParametroFormularioIva.add(this.jMenuItemNuevoGuardarCambiosGrupoParametroFormularioIva);
			this.jmenuAccionesGrupoParametroFormularioIva.add(this.jMenuItemNuevoRelacionesGrupoParametroFormularioIva);
			this.jmenuAccionesGrupoParametroFormularioIva.add(this.jMenuItemGuardarCambiosTablaGrupoParametroFormularioIva);		
			this.jmenuAccionesGrupoParametroFormularioIva.add(this.jMenuItemDuplicarGrupoParametroFormularioIva);		
			this.jmenuAccionesGrupoParametroFormularioIva.add(this.jMenuItemCopiarGrupoParametroFormularioIva);		
			this.jmenuAccionesGrupoParametroFormularioIva.add(this.jMenuItemVerFormGrupoParametroFormularioIva);		
			
			this.jmenuDatosGrupoParametroFormularioIva.add(this.jMenuItemRecargarInformacionGrupoParametroFormularioIva);				
			this.jmenuDatosGrupoParametroFormularioIva.add(this.jMenuItemAnterioresGrupoParametroFormularioIva);				
			this.jmenuDatosGrupoParametroFormularioIva.add(this.jMenuItemSiguientesGrupoParametroFormularioIva);				
			this.jmenuDatosGrupoParametroFormularioIva.add(this.jMenuItemAbrirOrderByGrupoParametroFormularioIva);				
			this.jmenuDatosGrupoParametroFormularioIva.add(this.jMenuItemMostrarOcultarGrupoParametroFormularioIva);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesGrupoParametroFormularioIva.add(this.jMenuItemGuardarCambiosGrupoParametroFormularioIva);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarGrupoParametroFormularioIva.add(this.jmenuArchivoGrupoParametroFormularioIva);		
			this.jmenuBarGrupoParametroFormularioIva.add(this.jmenuAccionesGrupoParametroFormularioIva);		
			this.jmenuBarGrupoParametroFormularioIva.add(this.jmenuDatosGrupoParametroFormularioIva);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarGrupoParametroFormularioIva);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasGrupoParametroFormularioIva() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorIdGrupoParametroFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdGrupoParametroFormularioIva.setToolTipText("Buscar Por Id ");
		this.jButtonBusquedaPorIdGrupoParametroFormularioIva= new JButtonMe();
		this.jButtonBusquedaPorIdGrupoParametroFormularioIva.setText("Buscar");
		this.jButtonBusquedaPorIdGrupoParametroFormularioIva.setToolTipText("Buscar Por Id ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdGrupoParametroFormularioIva,"buscar_button","Buscar Por Id ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			jLabelidBusquedaPorIdGrupoParametroFormularioIva = new JLabelMe();
		jLabelidBusquedaPorIdGrupoParametroFormularioIva.setText("Id :");
		jLabelidBusquedaPorIdGrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaPorIdGrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaPorIdGrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));

		FuncionesSwing.setBoldLabel(jLabelidBusquedaPorIdGrupoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);

		jLabelidGrupoParametroFormularioIvaBusquedaPorId= new JTextFieldMe();
		jLabelidGrupoParametroFormularioIvaBusquedaPorId.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidGrupoParametroFormularioIvaBusquedaPorId.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidGrupoParametroFormularioIvaBusquedaPorId.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



		this.jPanelBusquedaPorNombreGrupoParametroFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreGrupoParametroFormularioIva.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreGrupoParametroFormularioIva= new JButtonMe();
		this.jButtonBusquedaPorNombreGrupoParametroFormularioIva.setText("Buscar");
		this.jButtonBusquedaPorNombreGrupoParametroFormularioIva.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreGrupoParametroFormularioIva,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreGrupoParametroFormularioIva = new JLabelMe();
		jLabelnombreBusquedaPorNombreGrupoParametroFormularioIva.setText("Nombre :");
		jLabelnombreBusquedaPorNombreGrupoParametroFormularioIva.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreGrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreGrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreGrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreGrupoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreGrupoParametroFormularioIva= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreGrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreGrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreGrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreGrupoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasGrupoParametroFormularioIva=new JTabbedPane();


		this.jTabbedPaneBusquedasGrupoParametroFormularioIva.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasGrupoParametroFormularioIva.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasGrupoParametroFormularioIva.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasGrupoParametroFormularioIva.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasGrupoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleGrupoParametroFormularioIva = new GrupoParametroFormularioIvaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Grupo Parametro Formulario Iva DATOS");
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva = new GrupoParametroFormularioIvaDetalleFormJInternalFrame(jDesktopPane,this.grupoparametroformularioivaSessionBean.getConGuardarRelaciones(),this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva = null;//new GrupoParametroFormularioIvaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutGrupoParametroFormularioIva= new GridBagLayout();
		
		
		this.jTableDatosGrupoParametroFormularioIva = new JTableMe();      
		
		String sToolTipGrupoParametroFormularioIva="";
		sToolTipGrupoParametroFormularioIva=GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipGrupoParametroFormularioIva+="(Contabilidad.GrupoParametroFormularioIva)";
		}
		
		if(!this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
			sToolTipGrupoParametroFormularioIva+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosGrupoParametroFormularioIva.setToolTipText(sToolTipGrupoParametroFormularioIva);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosGrupoParametroFormularioIva);
		this.jTableDatosGrupoParametroFormularioIva.setAutoCreateRowSorter(true);
		this.jTableDatosGrupoParametroFormularioIva.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosGrupoParametroFormularioIva.setRowSelectionAllowed(true);
		this.jTableDatosGrupoParametroFormularioIva.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosGrupoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoGrupoParametroFormularioIva = new JButtonMe();
		this.jButtonDuplicarGrupoParametroFormularioIva = new JButtonMe();
		this.jButtonCopiarGrupoParametroFormularioIva = new JButtonMe();
		this.jButtonVerFormGrupoParametroFormularioIva = new JButtonMe();
		this.jButtonNuevoRelacionesGrupoParametroFormularioIva = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaGrupoParametroFormularioIva = new JButtonMe();
		this.jButtonCerrarGrupoParametroFormularioIva = new JButtonMe();
		
		this.jScrollPanelDatosGrupoParametroFormularioIva = new JScrollPane();   
        this.jScrollPanelDatosGeneralGrupoParametroFormularioIva = new JScrollPane();
		
				
		
		
		this.jPanelAccionesGrupoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Grupo Parametro Formulario Iva";
		
		if(!this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Grupo Parametro Formulario Ivas" + this.sPath));
		} else {
			this.jScrollPanelDatosGrupoParametroFormularioIva.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesGrupoParametroFormularioIva.setToolTipText("Acciones");
        this.jPanelAccionesGrupoParametroFormularioIva.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva=new ReporteDinamicoJInternalFrame(GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoGrupoParametroFormularioIva();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionGrupoParametroFormularioIva=new ImportacionJInternalFrame(GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionGrupoParametroFormularioIva();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByGrupoParametroFormularioIva = new JButtonMe();
		
		this.jButtonAbrirOrderByGrupoParametroFormularioIva.setText("Orden");
		this.jButtonAbrirOrderByGrupoParametroFormularioIva.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByGrupoParametroFormularioIva,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByGrupoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByGrupoParametroFormularioIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGrupoParametroFormularioIva,false,this);
			
			//this.cargarOrderByGrupoParametroFormularioIva(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByGrupoParametroFormularioIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGrupoParametroFormularioIva,true,this);
			
			//this.cargarOrderByGrupoParametroFormularioIva(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosGrupoParametroFormularioIva.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosGrupoParametroFormularioIva.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosGrupoParametroFormularioIva.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosGrupoParametroFormularioIva.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosGrupoParametroFormularioIva.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosGrupoParametroFormularioIva.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoGrupoParametroFormularioIva.setText("Nuevo");
		this.jButtonDuplicarGrupoParametroFormularioIva.setText("Duplicar");
		this.jButtonCopiarGrupoParametroFormularioIva.setText("Copiar");
		this.jButtonVerFormGrupoParametroFormularioIva.setText("Ver");
		this.jButtonNuevoRelacionesGrupoParametroFormularioIva.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaGrupoParametroFormularioIva.setText("Guardar");
		this.jButtonCerrarGrupoParametroFormularioIva.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGrupoParametroFormularioIva,"nuevo_button","Nuevo",this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarGrupoParametroFormularioIva,"duplicar_button","Duplicar",this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarGrupoParametroFormularioIva,"copiar_button","Copiar",this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormGrupoParametroFormularioIva,"ver_form","Ver",this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesGrupoParametroFormularioIva,"nuevorelaciones_button","Nuevo Rel",this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaGrupoParametroFormularioIva,"guardarcambiostabla_button","Guardar",this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarGrupoParametroFormularioIva,"cerrar_button","Salir",this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoGrupoParametroFormularioIva.setToolTipText("Nuevo"+" "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarGrupoParametroFormularioIva.setToolTipText("Duplicar"+" "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarGrupoParametroFormularioIva.setToolTipText("Copiar"+" "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormGrupoParametroFormularioIva.setToolTipText("Ver"+" "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesGrupoParametroFormularioIva.setToolTipText("Nuevo Rel"+" "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaGrupoParametroFormularioIva.setToolTipText("Guardar"+" "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarGrupoParametroFormularioIva.setToolTipText("Salir"+" "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoGrupoParametroFormularioIva";
		inputMap = this.jButtonNuevoGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoGrupoParametroFormularioIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoGrupoParametroFormularioIva"));
		
		//DUPLICAR
		sMapKey = "DuplicarGrupoParametroFormularioIva";
		inputMap = this.jButtonDuplicarGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarGrupoParametroFormularioIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarGrupoParametroFormularioIva"));
		
		//COPIAR
		sMapKey = "CopiarGrupoParametroFormularioIva";
		inputMap = this.jButtonCopiarGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarGrupoParametroFormularioIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarGrupoParametroFormularioIva"));
		
		//VEr FORM
		sMapKey = "VerFormGrupoParametroFormularioIva";
		inputMap = this.jButtonVerFormGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormGrupoParametroFormularioIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormGrupoParametroFormularioIva"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesGrupoParametroFormularioIva";
		inputMap = this.jButtonNuevoRelacionesGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesGrupoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesGrupoParametroFormularioIva"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarGrupoParametroFormularioIva";
		inputMap = this.jButtonModificarGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarGrupoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarGrupoParametroFormularioIva"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarGrupoParametroFormularioIva";
		inputMap = this.jButtonCerrarGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarGrupoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarGrupoParametroFormularioIva"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaGrupoParametroFormularioIva";
		inputMap = this.jButtonGuardarCambiosTablaGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaGrupoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaGrupoParametroFormularioIva"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesGrupoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesGrupoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionGrupoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1GrupoParametroFormularioIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2GrupoParametroFormularioIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3GrupoParametroFormularioIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4GrupoParametroFormularioIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5GrupoParametroFormularioIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesGrupoParametroFormularioIva.setName("jPanelParametrosReportesGrupoParametroFormularioIva"); 
		
		this.jPanelParametrosReportesAccionesGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesGrupoParametroFormularioIva.setName("jPanelParametrosReportesAccionesGrupoParametroFormularioIva"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionGrupoParametroFormularioIva = new JButtonMe();
		this.jButtonRecargarInformacionGrupoParametroFormularioIva.setText("Recargar");
		this.jButtonRecargarInformacionGrupoParametroFormularioIva.setToolTipText("Recargar"+" "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionGrupoParametroFormularioIva,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionGrupoParametroFormularioIva = new JButtonMe();
		this.jButtonProcesarInformacionGrupoParametroFormularioIva.setText("Procesar");
		this.jButtonProcesarInformacionGrupoParametroFormularioIva.setToolTipText("Procesar"+" "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionGrupoParametroFormularioIva.setVisible(false);
			
		this.jButtonProcesarInformacionGrupoParametroFormularioIva.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionGrupoParametroFormularioIva.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionGrupoParametroFormularioIva.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesGrupoParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGrupoParametroFormularioIva.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesGrupoParametroFormularioIva.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesGrupoParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGrupoParametroFormularioIva.setText("TIPO");       
		this.jComboBoxTiposReportesGrupoParametroFormularioIva.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesGrupoParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGrupoParametroFormularioIva.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesGrupoParametroFormularioIva.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionGrupoParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionGrupoParametroFormularioIva.setText("Paginacion");
		this.jComboBoxTiposPaginacionGrupoParametroFormularioIva.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesGrupoParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesGrupoParametroFormularioIva.setText("Accion");
		this.jComboBoxTiposRelacionesGrupoParametroFormularioIva.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesGrupoParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposAccionesGrupoParametroFormularioIva.setText("Accion");
		this.jComboBoxTiposAccionesGrupoParametroFormularioIva.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarGrupoParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarGrupoParametroFormularioIva.setText("Accion");
		this.jComboBoxTiposSeleccionarGrupoParametroFormularioIva.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralGrupoParametroFormularioIva=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralGrupoParametroFormularioIva.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralGrupoParametroFormularioIva.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralGrupoParametroFormularioIva.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesGrupoParametroFormularioIva = new JLabelMe();
		
		this.jLabelAccionesGrupoParametroFormularioIva.setText("Acciones");		
		this.jLabelAccionesGrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosGrupoParametroFormularioIva = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosGrupoParametroFormularioIva.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosGrupoParametroFormularioIva.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosGrupoParametroFormularioIva = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosGrupoParametroFormularioIva.setText("Seleccionados");
		this.jCheckBoxSeleccionadosGrupoParametroFormularioIva.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaGrupoParametroFormularioIva = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaGrupoParametroFormularioIva.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaGrupoParametroFormularioIva.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteGrupoParametroFormularioIva = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteGrupoParametroFormularioIva.setText("Graf.");
		this.jCheckBoxConGraficoReporteGrupoParametroFormularioIva.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresGrupoParametroFormularioIva = new JButtonMe();
		//this.jButtonAnterioresGrupoParametroFormularioIva.setText("<<");
        this.jButtonAnterioresGrupoParametroFormularioIva.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresGrupoParametroFormularioIva,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesGrupoParametroFormularioIva = new JButtonMe();
		//this.jButtonSiguientesGrupoParametroFormularioIva.setText(">>");
        this.jButtonSiguientesGrupoParametroFormularioIva.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesGrupoParametroFormularioIva,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosGrupoParametroFormularioIva = new JButtonMe();
		this.jButtonNuevoGuardarCambiosGrupoParametroFormularioIva.setText("Nue");
        this.jButtonNuevoGuardarCambiosGrupoParametroFormularioIva.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosGrupoParametroFormularioIva,"nuevoguardarcambios_button","Nue",this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosGrupoParametroFormularioIva";
		inputMap = this.jButtonNuevoGuardarCambiosGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosGrupoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosGrupoParametroFormularioIva"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionGrupoParametroFormularioIva";
		inputMap = this.jButtonRecargarInformacionGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionGrupoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionGrupoParametroFormularioIva"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesGrupoParametroFormularioIva";
		inputMap = this.jButtonSiguientesGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesGrupoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesGrupoParametroFormularioIva"));
		
		//ANTERIORES		
		sMapKey = "AnterioresGrupoParametroFormularioIva";
		inputMap = this.jButtonAnterioresGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresGrupoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresGrupoParametroFormularioIva"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasGrupoParametroFormularioIva();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesGrupoParametroFormularioIva.setMinimumSize(new Dimension(this.getWidth(),GrupoParametroFormularioIvaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GrupoParametroFormularioIvaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesGrupoParametroFormularioIva.setMaximumSize(new Dimension(this.getWidth(),GrupoParametroFormularioIvaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GrupoParametroFormularioIvaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesGrupoParametroFormularioIva.setPreferredSize(new Dimension(this.getWidth(),GrupoParametroFormularioIvaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GrupoParametroFormularioIvaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionGrupoParametroFormularioIva = new GridBagLayout();

			this.jPanelPaginacionGrupoParametroFormularioIva.setLayout(gridaBagLayoutPaginacionGrupoParametroFormularioIva);						
			
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsGrupoParametroFormularioIva.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy = 0;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionGrupoParametroFormularioIva.add(this.jButtonAnterioresGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
					
						
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy = 0;
			
			this.jPanelPaginacionGrupoParametroFormularioIva.add(this.jButtonNuevoGuardarCambiosGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
						
			
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy = 0;
			this.jPanelPaginacionGrupoParametroFormularioIva.add(this.jButtonSiguientesGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy = 1;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGrupoParametroFormularioIva.add(this.jButtonNuevoGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
				this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsGrupoParametroFormularioIva.gridy = 1;
				this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionGrupoParametroFormularioIva.add(this.jButtonNuevoRelacionesGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
			}
			
			
			if(!this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
				this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsGrupoParametroFormularioIva.gridy = 1;
				this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionGrupoParametroFormularioIva.add(this.jButtonGuardarCambiosTablaGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
			}
			
			
			
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy = 1;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGrupoParametroFormularioIva.add(this.jButtonDuplicarGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
			
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy = 1;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGrupoParametroFormularioIva.add(this.jButtonCopiarGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
		
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy = 1;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGrupoParametroFormularioIva.add(this.jButtonVerFormGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
		
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy = 1;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionGrupoParametroFormularioIva.add(this.jButtonCerrarGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
		
		
		
		this.jButtonRecargarInformacionGrupoParametroFormularioIva.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionGrupoParametroFormularioIva.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionGrupoParametroFormularioIva.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesGrupoParametroFormularioIva.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesGrupoParametroFormularioIva.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesGrupoParametroFormularioIva.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesGrupoParametroFormularioIva.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesGrupoParametroFormularioIva.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesGrupoParametroFormularioIva.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesGrupoParametroFormularioIva.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesGrupoParametroFormularioIva.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesGrupoParametroFormularioIva.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionGrupoParametroFormularioIva.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionGrupoParametroFormularioIva.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionGrupoParametroFormularioIva.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesGrupoParametroFormularioIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesGrupoParametroFormularioIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesGrupoParametroFormularioIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesGrupoParametroFormularioIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGrupoParametroFormularioIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGrupoParametroFormularioIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarGrupoParametroFormularioIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarGrupoParametroFormularioIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarGrupoParametroFormularioIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaGrupoParametroFormularioIva.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaGrupoParametroFormularioIva.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaGrupoParametroFormularioIva.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteGrupoParametroFormularioIva.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteGrupoParametroFormularioIva.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteGrupoParametroFormularioIva.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosGrupoParametroFormularioIva.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosGrupoParametroFormularioIva.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosGrupoParametroFormularioIva.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosGrupoParametroFormularioIva.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosGrupoParametroFormularioIva.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosGrupoParametroFormularioIva.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesGrupoParametroFormularioIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesGrupoParametroFormularioIva = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1GrupoParametroFormularioIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2GrupoParametroFormularioIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3GrupoParametroFormularioIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4GrupoParametroFormularioIva = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesGrupoParametroFormularioIva.setLayout(gridaBagParametrosReportesGrupoParametroFormularioIva);
			this.jPanelParametrosReportesAccionesGrupoParametroFormularioIva.setLayout(gridaBagParametrosReportesAccionesGrupoParametroFormularioIva);
			
			
			this.jPanelParametrosAuxiliar1GrupoParametroFormularioIva.setLayout(gridaBagParametrosAuxiliar1GrupoParametroFormularioIva);
			this.jPanelParametrosAuxiliar2GrupoParametroFormularioIva.setLayout(gridaBagParametrosAuxiliar2GrupoParametroFormularioIva);
			this.jPanelParametrosAuxiliar3GrupoParametroFormularioIva.setLayout(gridaBagParametrosAuxiliar3GrupoParametroFormularioIva);
			this.jPanelParametrosAuxiliar4GrupoParametroFormularioIva.setLayout(gridaBagParametrosAuxiliar4GrupoParametroFormularioIva);
			//this.jPanelParametrosAuxiliar5GrupoParametroFormularioIva.setLayout(gridaBagParametrosAuxiliar2GrupoParametroFormularioIva);			
			
			
			
			
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGrupoParametroFormularioIva.add(this.jButtonRecargarInformacionGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GrupoParametroFormularioIva.add(this.jComboBoxTiposPaginacionGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GrupoParametroFormularioIva.add(this.jCheckBoxConAltoMaximoTablaGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GrupoParametroFormularioIva.add(this.jComboBoxTiposArchivosReportesGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGrupoParametroFormularioIva.add(this.jPanelParametrosAuxiliar1GrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4GrupoParametroFormularioIva.add(this.jComboBoxTiposReportesGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGrupoParametroFormularioIva.add(this.jPanelParametrosAuxiliar4GrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGrupoParametroFormularioIva.add(this.jComboBoxTiposReportesGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGrupoParametroFormularioIva.add(this.jCheckBoxGenerarReporteGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGrupoParametroFormularioIva.add(this.jPanelParametrosAuxiliar2GrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGrupoParametroFormularioIva.add(this.jLabelAccionesGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
				this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesGrupoParametroFormularioIva.add(this.jButtonAbrirOrderByGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGrupoParametroFormularioIva.add(this.jComboBoxTiposSeleccionarGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);			
			
			
			/*
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGrupoParametroFormularioIva.add(this.jCheckBoxSeleccionarTodosGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3GrupoParametroFormularioIva.add(this.jCheckBoxSeleccionarTodosGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);															
				
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3GrupoParametroFormularioIva.add(this.jCheckBoxSeleccionadosGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGrupoParametroFormularioIva.add(this.jPanelParametrosAuxiliar3GrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGrupoParametroFormularioIva.add(this.jComboBoxTiposRelacionesGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
				
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGrupoParametroFormularioIva.add(this.jComboBoxTiposAccionesGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosGrupoParametroFormularioIva = new GridBagLayout();

			this.jScrollPanelDatosGrupoParametroFormularioIva.setLayout(gridaBagLayoutDatosGrupoParametroFormularioIva);
			
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy = 0;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx = 0;
			
			this.jScrollPanelDatosGrupoParametroFormularioIva.add(this.jTableDatosGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosGrupoParametroFormularioIva.setViewportView(this.jTableDatosGrupoParametroFormularioIva);
		this.jTableDatosGrupoParametroFormularioIva.setFillsViewportHeight(true);
		this.jTableDatosGrupoParametroFormularioIva.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesGrupoParametroFormularioIva= new GridBagLayout();
		this.jPanelAccionesGrupoParametroFormularioIva.setLayout(gridaBagLayoutAccionesGrupoParametroFormularioIva);
		
		
		/*	
		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx = 0;
			
		this.jPanelAccionesGrupoParametroFormularioIva.add(this.jButtonNuevoGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorIdGrupoParametroFormularioIva= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdGrupoParametroFormularioIva.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdGrupoParametroFormularioIva.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdGrupoParametroFormularioIva.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdGrupoParametroFormularioIva.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdGrupoParametroFormularioIva.setLayout(gridaBagLayoutBusquedaPorIdGrupoParametroFormularioIva);

		gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		gridBagConstraintsGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoParametroFormularioIva.gridy = 0;
		gridBagConstraintsGrupoParametroFormularioIva.gridx = 0;
		jPanelBusquedaPorIdGrupoParametroFormularioIva.add(jLabelidBusquedaPorIdGrupoParametroFormularioIva, gridBagConstraintsGrupoParametroFormularioIva);

		gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		gridBagConstraintsGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoParametroFormularioIva.gridy = 0;
		gridBagConstraintsGrupoParametroFormularioIva.gridx = 1;
		jPanelBusquedaPorIdGrupoParametroFormularioIva.add(jLabelidGrupoParametroFormularioIvaBusquedaPorId, gridBagConstraintsGrupoParametroFormularioIva);

		gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		gridBagConstraintsGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoParametroFormularioIva.gridy = 1;
		gridBagConstraintsGrupoParametroFormularioIva.gridx =1;
		jPanelBusquedaPorIdGrupoParametroFormularioIva.add(jButtonBusquedaPorIdGrupoParametroFormularioIva, gridBagConstraintsGrupoParametroFormularioIva);

		jTabbedPaneBusquedasGrupoParametroFormularioIva.addTab("1.-Por Id ", jPanelBusquedaPorIdGrupoParametroFormularioIva);
		jTabbedPaneBusquedasGrupoParametroFormularioIva.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreGrupoParametroFormularioIva= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreGrupoParametroFormularioIva.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreGrupoParametroFormularioIva.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreGrupoParametroFormularioIva.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreGrupoParametroFormularioIva.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreGrupoParametroFormularioIva.setLayout(gridaBagLayoutBusquedaPorNombreGrupoParametroFormularioIva);

		gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		gridBagConstraintsGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoParametroFormularioIva.gridy = 0;
		gridBagConstraintsGrupoParametroFormularioIva.gridx = 0;
		jPanelBusquedaPorNombreGrupoParametroFormularioIva.add(jLabelnombreBusquedaPorNombreGrupoParametroFormularioIva, gridBagConstraintsGrupoParametroFormularioIva);

		gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		gridBagConstraintsGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoParametroFormularioIva.gridy = 0;
		gridBagConstraintsGrupoParametroFormularioIva.gridx = 1;
		jPanelBusquedaPorNombreGrupoParametroFormularioIva.add(jTextAreanombreBusquedaPorNombreGrupoParametroFormularioIva, gridBagConstraintsGrupoParametroFormularioIva);

		gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		gridBagConstraintsGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoParametroFormularioIva.gridy = 1;
		gridBagConstraintsGrupoParametroFormularioIva.gridx =1;
		jPanelBusquedaPorNombreGrupoParametroFormularioIva.add(jButtonBusquedaPorNombreGrupoParametroFormularioIva, gridBagConstraintsGrupoParametroFormularioIva);

		jTabbedPaneBusquedasGrupoParametroFormularioIva.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreGrupoParametroFormularioIva);
		jTabbedPaneBusquedasGrupoParametroFormularioIva.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutGrupoParametroFormularioIva = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutGrupoParametroFormularioIva);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();						
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx = 0;		
			//this.gridBagConstraintsGrupoParametroFormularioIva.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoParametroFormularioIva.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsGrupoParametroFormularioIva.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridyPrincipal++;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx = 0;		
		//this.gridBagConstraintsGrupoParametroFormularioIva.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoParametroFormularioIva.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsGrupoParametroFormularioIva.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsGrupoParametroFormularioIva);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx = 0;		
			this.gridBagConstraintsGrupoParametroFormularioIva.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoParametroFormularioIva.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsGrupoParametroFormularioIva.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);								
		
		
		/*
		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
		*/		
		
		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy =iGridyPrincipal++;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx =0;
		this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsGrupoParametroFormularioIva.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
				
		
		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(GrupoParametroFormularioIvaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosGrupoParametroFormularioIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosGrupoParametroFormularioIva = new GridBagLayout();
			this.jPanelBusquedasParametrosGrupoParametroFormularioIva.setLayout(gridaBagLayoutBusquedasParametrosGrupoParametroFormularioIva);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralGrupoParametroFormularioIva=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralGrupoParametroFormularioIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGrupoParametroFormularioIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGrupoParametroFormularioIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
			
			
		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
		
			
		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralGrupoParametroFormularioIva;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoGrupoParametroFormularioIva() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoGrupoParametroFormularioIva = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoGrupoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoGrupoParametroFormularioIva.setName("jPanelReporteDinamicoGrupoParametroFormularioIva"); 
		
		this.jPanelReporteDinamicoGrupoParametroFormularioIva.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoGrupoParametroFormularioIva.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoGrupoParametroFormularioIva.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoGrupoParametroFormularioIva.setLayout(gridaBagLayoutReporteDinamicoGrupoParametroFormularioIva);
		
		
		this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoGrupoParametroFormularioIva = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteGrupoParametroFormularioIva= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.setResizable(true);
	    this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.setClosable(true);
	    this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoGrupoParametroFormularioIva.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoGrupoParametroFormularioIva.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoGrupoParametroFormularioIva.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Grupo Parametro Formulario Ivas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteGrupoParametroFormularioIva = new JLabelMe();

		this.jLabelColumnasSelectReporteGrupoParametroFormularioIva.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteGrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteGrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteGrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoGrupoParametroFormularioIva.add(this.jLabelColumnasSelectReporteGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteGrupoParametroFormularioIva = new JList<Reporte>();
		this.jListColumnasSelectReporteGrupoParametroFormularioIva.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteGrupoParametroFormularioIva.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteGrupoParametroFormularioIva.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteGrupoParametroFormularioIva.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteGrupoParametroFormularioIva.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteGrupoParametroFormularioIva=new JScrollPane(this.jListColumnasSelectReporteGrupoParametroFormularioIva);
			
			this.jScrollColumnasSelectReporteGrupoParametroFormularioIva.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteGrupoParametroFormularioIva.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteGrupoParametroFormularioIva.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoGrupoParametroFormularioIva.add(this.jListColumnasSelectReporteGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
		this.jPanelReporteDinamicoGrupoParametroFormularioIva.add(this.jScrollColumnasSelectReporteGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteGrupoParametroFormularioIva = new JLabelMe();

		this.jLabelRelacionesSelectReporteGrupoParametroFormularioIva.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteGrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteGrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteGrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoGrupoParametroFormularioIva.add(this.jLabelRelacionesSelectReporteGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteGrupoParametroFormularioIva = new JList<Reporte>();
		this.jListRelacionesSelectReporteGrupoParametroFormularioIva.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteGrupoParametroFormularioIva.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteGrupoParametroFormularioIva.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteGrupoParametroFormularioIva.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteGrupoParametroFormularioIva.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteGrupoParametroFormularioIva=new JScrollPane(this.jListRelacionesSelectReporteGrupoParametroFormularioIva);
			
			this.jScrollRelacionesSelectReporteGrupoParametroFormularioIva.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteGrupoParametroFormularioIva.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteGrupoParametroFormularioIva.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoGrupoParametroFormularioIva.add(this.jListRelacionesSelectReporteGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
		this.jPanelReporteDinamicoGrupoParametroFormularioIva.add(this.jScrollRelacionesSelectReporteGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoGrupoParametroFormularioIva = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoGrupoParametroFormularioIva = new JComboBoxMe();
		this.jListColumnasValoresGraficoGrupoParametroFormularioIva = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoGrupoParametroFormularioIva = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoGrupoParametroFormularioIva.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoGrupoParametroFormularioIva.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoGrupoParametroFormularioIva.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoGrupoParametroFormularioIva.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoGrupoParametroFormularioIva = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoGrupoParametroFormularioIva.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoGrupoParametroFormularioIva.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoGrupoParametroFormularioIva.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoGrupoParametroFormularioIva.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoGrupoParametroFormularioIva = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoGrupoParametroFormularioIva.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoGrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoGrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoGrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGrupoParametroFormularioIva.add(this.jLabelGenerarExcelReporteDinamicoGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoGrupoParametroFormularioIva = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoGrupoParametroFormularioIva.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoGrupoParametroFormularioIva,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoGrupoParametroFormularioIva.setToolTipText("Generar EXCEL"+" "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoGrupoParametroFormularioIva.add(this.jButtonGenerarExcelReporteDinamicoGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGrupoParametroFormularioIva.add(this.jComboBoxTiposReportesDinamicoGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoGrupoParametroFormularioIva = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoGrupoParametroFormularioIva.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoGrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoGrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoGrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGrupoParametroFormularioIva.add(this.jLabelTiposArchivoReporteDinamicoGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGrupoParametroFormularioIva.add(this.jComboBoxTiposArchivosReportesDinamicoGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoGrupoParametroFormularioIva = new JButtonMe();
		this.jButtonGenerarReporteDinamicoGrupoParametroFormularioIva.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoGrupoParametroFormularioIva,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoGrupoParametroFormularioIva.setToolTipText("Generar"+" "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGrupoParametroFormularioIva.add(this.jButtonGenerarReporteDinamicoGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoGrupoParametroFormularioIva = new JButtonMe();
		this.jButtonCerrarReporteDinamicoGrupoParametroFormularioIva.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoGrupoParametroFormularioIva,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoGrupoParametroFormularioIva.setToolTipText("Cancelar"+" "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGrupoParametroFormularioIva.add(this.jButtonCerrarReporteDinamicoGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalGrupoParametroFormularioIva = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoGrupoParametroFormularioIva= new JScrollPane(jPanelReporteDinamicoGrupoParametroFormularioIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoGrupoParametroFormularioIva.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoGrupoParametroFormularioIva.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoGrupoParametroFormularioIva.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Grupo Parametro Formulario Ivas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalGrupoParametroFormularioIva);
		this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.getContentPane().add(this.jScrollPanelReporteDinamicoGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionGrupoParametroFormularioIva() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionGrupoParametroFormularioIva = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionGrupoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionGrupoParametroFormularioIva.setName("jPanelImportacionGrupoParametroFormularioIva"); 
		
		this.jPanelImportacionGrupoParametroFormularioIva.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionGrupoParametroFormularioIva.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionGrupoParametroFormularioIva.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionGrupoParametroFormularioIva.setLayout(gridaBagLayoutImportacionGrupoParametroFormularioIva);
		
		
		this.jInternalFrameImportacionGrupoParametroFormularioIva= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionGrupoParametroFormularioIva= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionGrupoParametroFormularioIva = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteGrupoParametroFormularioIva= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionGrupoParametroFormularioIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionGrupoParametroFormularioIva.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionGrupoParametroFormularioIva.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionGrupoParametroFormularioIva.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionGrupoParametroFormularioIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionGrupoParametroFormularioIva.setResizable(true);
	    this.jInternalFrameImportacionGrupoParametroFormularioIva.setClosable(true);
	    this.jInternalFrameImportacionGrupoParametroFormularioIva.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionGrupoParametroFormularioIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionGrupoParametroFormularioIva.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionGrupoParametroFormularioIva.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionGrupoParametroFormularioIva.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionGrupoParametroFormularioIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionGrupoParametroFormularioIva.setResizable(true);
	    this.jInternalFrameImportacionGrupoParametroFormularioIva.setClosable(true);
	    this.jInternalFrameImportacionGrupoParametroFormularioIva.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionGrupoParametroFormularioIva.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionGrupoParametroFormularioIva.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionGrupoParametroFormularioIva.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Grupo Parametro Formulario Ivas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionGrupoParametroFormularioIva = new JLabelMe();

		this.jLabelArchivoImportacionGrupoParametroFormularioIva.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionGrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionGrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionGrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iPosYImportacion;		
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iPosXImportacion++;
			
		this.jPanelImportacionGrupoParametroFormularioIva.add(this.jLabelArchivoImportacionGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionGrupoParametroFormularioIva = new JFileChooser();		
		this.jFileChooserImportacionGrupoParametroFormularioIva.setToolTipText("ESCOGER ARCHIVO"+" "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionGrupoParametroFormularioIva = new JButtonMe();
		this.jButtonAbrirImportacionGrupoParametroFormularioIva.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionGrupoParametroFormularioIva,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionGrupoParametroFormularioIva.setToolTipText("Generar"+" "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iPosYImportacion;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGrupoParametroFormularioIva.add(this.jButtonAbrirImportacionGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionGrupoParametroFormularioIva = new JLabelMe();

		this.jLabelPathArchivoImportacionGrupoParametroFormularioIva.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionGrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionGrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionGrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iPosYImportacion;		
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iPosXImportacion++;
			
		this.jPanelImportacionGrupoParametroFormularioIva.add(this.jLabelPathArchivoImportacionGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionGrupoParametroFormularioIva=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionGrupoParametroFormularioIva.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionGrupoParametroFormularioIva.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionGrupoParametroFormularioIva.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iPosYImportacion;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGrupoParametroFormularioIva.add(this.jTextFieldPathArchivoImportacionGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionGrupoParametroFormularioIva = new JButtonMe();
		this.jButtonGenerarImportacionGrupoParametroFormularioIva.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionGrupoParametroFormularioIva,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionGrupoParametroFormularioIva.setToolTipText("Generar"+" "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iPosYImportacion;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGrupoParametroFormularioIva.add(this.jButtonGenerarImportacionGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionGrupoParametroFormularioIva = new JButtonMe();
		this.jButtonCerrarImportacionGrupoParametroFormularioIva.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionGrupoParametroFormularioIva,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionGrupoParametroFormularioIva.setToolTipText("Cancelar"+" "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iPosYImportacion;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGrupoParametroFormularioIva.add(this.jButtonCerrarImportacionGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalGrupoParametroFormularioIva = new GridBagLayout();
		
		this.jScrollPanelImportacionGrupoParametroFormularioIva= new JScrollPane(jPanelImportacionGrupoParametroFormularioIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy =iPosYImportacion;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx =iPosXImportacion;
		this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionGrupoParametroFormularioIva.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionGrupoParametroFormularioIva.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalGrupoParametroFormularioIva);
		this.jInternalFrameImportacionGrupoParametroFormularioIva.getContentPane().add(this.jScrollPanelImportacionGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByGrupoParametroFormularioIva(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByGrupoParametroFormularioIva = new JButtonMe();
			this.jButtonAbrirOrderByGrupoParametroFormularioIva.setText("Orden");
			this.jButtonAbrirOrderByGrupoParametroFormularioIva.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByGrupoParametroFormularioIva,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByGrupoParametroFormularioIva";
			inputMap = this.jButtonAbrirOrderByGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByGrupoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByGrupoParametroFormularioIva"));
		
		
			GridBagLayout gridaBagLayoutOrderByGrupoParametroFormularioIva = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByGrupoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByGrupoParametroFormularioIva.setName("jPanelOrderByGrupoParametroFormularioIva"); 
			
			this.jPanelOrderByGrupoParametroFormularioIva.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByGrupoParametroFormularioIva.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByGrupoParametroFormularioIva.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByGrupoParametroFormularioIva.setLayout(gridaBagLayoutOrderByGrupoParametroFormularioIva);
			
			
			this.jTableDatosGrupoParametroFormularioIvaOrderBy = new JTableMe();        
			this.jTableDatosGrupoParametroFormularioIvaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosGrupoParametroFormularioIvaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosGrupoParametroFormularioIvaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosGrupoParametroFormularioIvaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosGrupoParametroFormularioIvaOrderBy.setViewportView(this.jTableDatosGrupoParametroFormularioIvaOrderBy);
			this.jTableDatosGrupoParametroFormularioIvaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosGrupoParametroFormularioIvaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByGrupoParametroFormularioIva= new OrderByJInternalFrame();
			this.jInternalFrameOrderByGrupoParametroFormularioIva= new OrderByJInternalFrame();
			this.jScrollPanelOrderByGrupoParametroFormularioIva = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteGrupoParametroFormularioIva= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByGrupoParametroFormularioIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByGrupoParametroFormularioIva.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByGrupoParametroFormularioIva.setTitle("Orden");
			this.jInternalFrameOrderByGrupoParametroFormularioIva.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByGrupoParametroFormularioIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByGrupoParametroFormularioIva.setResizable(true);
			this.jInternalFrameOrderByGrupoParametroFormularioIva.setClosable(true);
			this.jInternalFrameOrderByGrupoParametroFormularioIva.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByGrupoParametroFormularioIva.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByGrupoParametroFormularioIva.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByGrupoParametroFormularioIva.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Grupo Parametro Formulario Ivas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy =iPosYOrderBy++;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx =iPosXOrderBy;
			this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsGrupoParametroFormularioIva.ipady =150;
				
			this.jPanelOrderByGrupoParametroFormularioIva.add(jScrollPanelDatosGrupoParametroFormularioIvaOrderBy, this.gridBagConstraintsGrupoParametroFormularioIva);//this.jTableDatosGrupoParametroFormularioIvaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByGrupoParametroFormularioIva = new JButtonMe();
			this.jButtonCerrarOrderByGrupoParametroFormularioIva.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByGrupoParametroFormularioIva,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByGrupoParametroFormularioIva.setToolTipText("Cancelar"+" "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iPosYOrderBy++;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iPosXOrderBy;
									
			this.jPanelOrderByGrupoParametroFormularioIva.add(this.jButtonCerrarOrderByGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalGrupoParametroFormularioIva = new GridBagLayout();
			
			this.jScrollPanelOrderByGrupoParametroFormularioIva= new JScrollPane(jPanelOrderByGrupoParametroFormularioIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy =iPosYOrderBy;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx =iPosXOrderBy;
			this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByGrupoParametroFormularioIva.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByGrupoParametroFormularioIva.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalGrupoParametroFormularioIva);
			
			this.jInternalFrameOrderByGrupoParametroFormularioIva.getContentPane().add(this.jScrollPanelOrderByGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);			
		
		} else {
			this.jButtonAbrirOrderByGrupoParametroFormularioIva = new JButtonMe();
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
		int iWidthTableCalculado=0;//830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.grupoparametroformularioivaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosGrupoParametroFormularioIva.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosGrupoParametroFormularioIva.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosGrupoParametroFormularioIva.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosGrupoParametroFormularioIva.getRowHeight();//GrupoParametroFormularioIvaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > GrupoParametroFormularioIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaGrupoParametroFormularioIva.isSelected()) {
					iHeightTable=GrupoParametroFormularioIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < GrupoParametroFormularioIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=GrupoParametroFormularioIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > GrupoParametroFormularioIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaGrupoParametroFormularioIva.isSelected()) {
					iHeightTable=GrupoParametroFormularioIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < GrupoParametroFormularioIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=GrupoParametroFormularioIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosGrupoParametroFormularioIva.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosGrupoParametroFormularioIva.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosGrupoParametroFormularioIva.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosGrupoParametroFormularioIva.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosGrupoParametroFormularioIva.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosGrupoParametroFormularioIva.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByGrupoParametroFormularioIva!=null && this.jInternalFrameOrderByGrupoParametroFormularioIva.getjTableDatosOrderBy()!=null) {
			//if(!this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByGrupoParametroFormularioIva.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByGrupoParametroFormularioIva.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByGrupoParametroFormularioIva.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByGrupoParametroFormularioIva.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByGrupoParametroFormularioIva.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByGrupoParametroFormularioIva.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByGrupoParametroFormularioIva.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosGrupoParametroFormularioIva.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosGrupoParametroFormularioIva.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosGrupoParametroFormularioIva.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=grupoparametroformularioivas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<GrupoParametroFormularioIva> TraerGrupoParametroFormularioIvaBeans(List<GrupoParametroFormularioIva> grupoparametroformularioivas,ArrayList<Classe> classes)throws Exception {
		try {
			for(GrupoParametroFormularioIva grupoparametroformularioiva:grupoparametroformularioivas) {
					
				if(!(GrupoParametroFormularioIvaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || GrupoParametroFormularioIvaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					grupoparametroformularioiva.setsDetalleGeneralEntityReporte(GrupoParametroFormularioIvaConstantesFunciones.getGrupoParametroFormularioIvaDescripcion(grupoparametroformularioiva));
										
						
					
					

					if(grupoparametroformularioiva.getParametroFormularioIvas()!=null && Funciones.existeClass(classes,ParametroFormularioIva.class)) {
						try{grupoparametroformularioiva.setparametroformularioivasDescripcionReporte(new JRBeanCollectionDataSource(ParametroFormularioIvaJInternalFrame.TraerParametroFormularioIvaBeans(grupoparametroformularioiva.getParametroFormularioIvas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(grupoparametroformularioiva.getFormularioIvas()!=null && Funciones.existeClass(classes,FormularioIva.class)) {
						try{grupoparametroformularioiva.setformularioivasDescripcionReporte(new JRBeanCollectionDataSource(FormularioIvaJInternalFrame.TraerFormularioIvaBeans(grupoparametroformularioiva.getFormularioIvas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//grupoparametroformularioiva.setsDetalleGeneralEntityReporte(grupoparametroformularioiva.getsDetalleGeneralEntityReporte());
										
				}
				
				//grupoparametroformularioivabeans.add(grupoparametroformularioivabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return grupoparametroformularioivas;
    }
	//PARA REPORTES FIN
}
