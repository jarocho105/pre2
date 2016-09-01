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
import com.bydan.erp.cartera.util.TipoUbicacionNegocioConstantesFunciones;

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
public class TipoUbicacionNegocioJInternalFrame extends TipoUbicacionNegocioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoUbicacionNegocio;
	
	protected JMenuBar jmenuBarTipoUbicacionNegocio;
	
	protected JMenu jmenuTipoUbicacionNegocio;
	protected JMenu jmenuDatosTipoUbicacionNegocio;
	protected JMenu jmenuArchivoTipoUbicacionNegocio;
	protected JMenu jmenuAccionesTipoUbicacionNegocio;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoUbicacionNegocio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoUbicacionNegocio;	
	protected GridBagConstraints gridBagConstraintsTipoUbicacionNegocio;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoUbicacionNegocioDetalleFormJInternalFrame jInternalFrameDetalleFormTipoUbicacionNegocio;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoUbicacionNegocio;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoUbicacionNegocio;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoUbicacionNegocioSessionBean tipoubicacionnegocioSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoUbicacionNegocio> tipoubicacionnegocios;		
	public List<TipoUbicacionNegocio> tipoubicacionnegociosEliminados;	
	public List<TipoUbicacionNegocio> tipoubicacionnegociosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoUbicacionNegocio;		
	protected JButton jButtonAbrirOrderByTipoUbicacionNegocio;
	
	
	//protected JPanel jPanelOrderByTipoUbicacionNegocio;
	//public JScrollPane jScrollPanelOrderByTipoUbicacionNegocio;	
	//protected JButton jButtonCerrarOrderByTipoUbicacionNegocio;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoUbicacionNegocioLogic tipoubicacionnegocioLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoUbicacionNegocio;
	public JScrollPane jScrollPanelDatosEdicionTipoUbicacionNegocio;
	public JScrollPane jScrollPanelDatosGeneralTipoUbicacionNegocio;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoUbicacionNegocioOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoUbicacionNegocio;
	//public JScrollPane jScrollPanelImportacionTipoUbicacionNegocio;
	
	
	
	protected JPanel jPanelAccionesTipoUbicacionNegocio;
	
    protected JPanel jPanelPaginacionTipoUbicacionNegocio;
    protected JPanel jPanelParametrosReportesTipoUbicacionNegocio;
	protected JPanel jPanelParametrosReportesAccionesTipoUbicacionNegocio;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoUbicacionNegocio;
	protected JPanel jPanelParametrosAuxiliar2TipoUbicacionNegocio;
	protected JPanel jPanelParametrosAuxiliar3TipoUbicacionNegocio;
	protected JPanel jPanelParametrosAuxiliar4TipoUbicacionNegocio;
	//protected JPanel jPanelParametrosAuxiliar5TipoUbicacionNegocio;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoUbicacionNegocio;
	//protected JPanel jPanelImportacionTipoUbicacionNegocio;
	
	
	public JTable jTableDatosTipoUbicacionNegocio;
	
	
	
	//public JTable jTableDatosTipoUbicacionNegocioOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoUbicacionNegocio;
	protected JButton jButtonDuplicarTipoUbicacionNegocio;
	protected JButton jButtonCopiarTipoUbicacionNegocio;
	protected JButton jButtonVerFormTipoUbicacionNegocio;
	protected JButton jButtonNuevoRelacionesTipoUbicacionNegocio;
	protected JButton jButtonModificarTipoUbicacionNegocio;
	
    protected JButton jButtonGuardarCambiosTablaTipoUbicacionNegocio;
	protected JButton jButtonCerrarTipoUbicacionNegocio;
	
	
	protected JButton jButtonRecargarInformacionTipoUbicacionNegocio;
	protected JButton jButtonProcesarInformacionTipoUbicacionNegocio;
	
	
	protected JButton jButtonAnterioresTipoUbicacionNegocio;
	protected JButton jButtonSiguientesTipoUbicacionNegocio;
	protected JButton jButtonNuevoGuardarCambiosTipoUbicacionNegocio;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoUbicacionNegocio;
	//protected JButton jButtonCerrarReporteDinamicoTipoUbicacionNegocio;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoUbicacionNegocio;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoUbicacionNegocio;
	//protected JButton jButtonGenerarImportacionTipoUbicacionNegocio;
	//protected JButton jButtonCerrarImportacionTipoUbicacionNegocio;
	//protected JFileChooser jFileChooserImportacionTipoUbicacionNegocio;
	//protected File fileImportacionTipoUbicacionNegocio;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoUbicacionNegocio;
	protected JButton jButtonDuplicarToolBarTipoUbicacionNegocio;
	protected JButton jButtonNuevoRelacionesToolBarTipoUbicacionNegocio;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoUbicacionNegocio;
	protected JButton jButtonCopiarToolBarTipoUbicacionNegocio;
	protected JButton jButtonVerFormToolBarTipoUbicacionNegocio;
	public JButton jButtonGuardarCambiosTablaToolBarTipoUbicacionNegocio;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoUbicacionNegocio;
	protected JButton jButtonCerrarToolBarTipoUbicacionNegocio;
	
	protected JButton jButtonRecargarInformacionToolBarTipoUbicacionNegocio;
	protected JButton jButtonProcesarInformacionToolBarTipoUbicacionNegocio;
	protected JButton jButtonAnterioresToolBarTipoUbicacionNegocio;
	protected JButton jButtonSiguientesToolBarTipoUbicacionNegocio;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoUbicacionNegocio;
	protected JButton jButtonAbrirOrderByToolBarTipoUbicacionNegocio;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoUbicacionNegocio;
	protected JMenuItem jMenuItemDuplicarTipoUbicacionNegocio;
	protected JMenuItem jMenuItemNuevoRelacionesTipoUbicacionNegocio;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoUbicacionNegocio;
	protected JMenuItem jMenuItemCopiarTipoUbicacionNegocio;
	protected JMenuItem jMenuItemVerFormTipoUbicacionNegocio;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoUbicacionNegocio;
	protected JMenuItem jMenuItemCerrarTipoUbicacionNegocio;
	protected JMenuItem jMenuItemDetalleCerrarTipoUbicacionNegocio;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoUbicacionNegocio;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoUbicacionNegocio;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoUbicacionNegocio;
	protected JMenuItem jMenuItemProcesarInformacionTipoUbicacionNegocio;
	protected JMenuItem jMenuItemAnterioresTipoUbicacionNegocio;
	protected JMenuItem jMenuItemSiguientesTipoUbicacionNegocio;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoUbicacionNegocio;
	protected JMenuItem jMenuItemAbrirOrderByTipoUbicacionNegocio;
	protected JMenuItem jMenuItemMostrarOcultarTipoUbicacionNegocio;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoUbicacionNegocio;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoUbicacionNegocio;
	protected JCheckBox jCheckBoxSeleccionadosTipoUbicacionNegocio;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoUbicacionNegocio;
	protected JCheckBox jCheckBoxConGraficoReporteTipoUbicacionNegocio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoUbicacionNegocio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoUbicacionNegocio;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoUbicacionNegocio;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoUbicacionNegocio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoUbicacionNegocio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoUbicacionNegocio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoUbicacionNegocio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoUbicacionNegocio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoUbicacionNegocio;
	protected JTextField jTextFieldValorCampoGeneralTipoUbicacionNegocio;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoUbicacionNegocio;
	//public JList<Reporte> jListColumnasSelectReporteTipoUbicacionNegocio;
	//public JScrollPane jScrollColumnasSelectReporteTipoUbicacionNegocio;
	
	//public JLabel jLabelRelacionesSelectReporteTipoUbicacionNegocio;
	//public JList<Reporte> jListRelacionesSelectReporteTipoUbicacionNegocio;
	//public JScrollPane jScrollRelacionesSelectReporteTipoUbicacionNegocio;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoUbicacionNegocio;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoUbicacionNegocio;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoUbicacionNegocio;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoUbicacionNegocio;
	
		
	//public JLabel jLabelArchivoImportacionTipoUbicacionNegocio;	
	//public JLabel jLabelPathArchivoImportacionTipoUbicacionNegocio;
	//protected JTextField jTextFieldPathArchivoImportacionTipoUbicacionNegocio;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoUbicacionNegocio;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoUbicacionNegocio;
	
	//public JLabel jLabelColumnaCategoriaValorTipoUbicacionNegocio;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoUbicacionNegocio;
	
	//public JLabel jLabelColumnasValoresGraficoTipoUbicacionNegocio;
	//public JList<Reporte> jListColumnasValoresGraficoTipoUbicacionNegocio;
	//public JScrollPane jScrollColumnasValoresGraficoTipoUbicacionNegocio;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoUbicacionNegocio;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoUbicacionNegocio;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoUbicacionNegocio;
	
	
	
	
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
	public TipoUbicacionNegocioJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoUbicacionNegocio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoUbicacionNegocioJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoUbicacionNegocio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoUbicacionNegocioJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoUbicacionNegocio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoUbicacionNegocioJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoUbicacionNegocio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoUbicacionNegocio)	{
		this.jButtonRecargarInformacionTipoUbicacionNegocio = jButtonRecargarInformacionTipoUbicacionNegocio;
	}
	
	public JButton getjButtonProcesarInformacionTipoUbicacionNegocio() {
		return this.jButtonProcesarInformacionTipoUbicacionNegocio;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoUbicacionNegocio)	{
		this.jButtonProcesarInformacionTipoUbicacionNegocio = jButtonProcesarInformacionTipoUbicacionNegocio;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoUbicacionNegocio() {
		return this.jButtonRecargarInformacionTipoUbicacionNegocio;
	}
	
	
	public List<TipoUbicacionNegocio> gettipoubicacionnegocios() {
		return this.tipoubicacionnegocios;
	}

	public void settipoubicacionnegocios(List<TipoUbicacionNegocio> tipoubicacionnegocios) {
		this.tipoubicacionnegocios = tipoubicacionnegocios;
	}
	
	public List<TipoUbicacionNegocio> gettipoubicacionnegociosAux() {
		return this.tipoubicacionnegociosAux;
	}

	public void settipoubicacionnegociosAux(List<TipoUbicacionNegocio> tipoubicacionnegociosAux) {
		this.tipoubicacionnegociosAux = tipoubicacionnegociosAux;
	}
	
	public List<TipoUbicacionNegocio> gettipoubicacionnegociosEliminados() {
		return this.tipoubicacionnegociosEliminados;
	}

	public void setTipoUbicacionNegociosEliminados(List<TipoUbicacionNegocio> tipoubicacionnegociosEliminados) {
		this.tipoubicacionnegociosEliminados = tipoubicacionnegociosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoUbicacionNegocio() {
		return jComboBoxTiposSeleccionarTipoUbicacionNegocio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoUbicacionNegocio(
			JComboBox jComboBoxTiposSeleccionarTipoUbicacionNegocio) {
		this.jComboBoxTiposSeleccionarTipoUbicacionNegocio = jComboBoxTiposSeleccionarTipoUbicacionNegocio;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoUbicacionNegocio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoUbicacionNegocio.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoUbicacionNegocio .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoUbicacionNegocio() {
		return jTextFieldValorCampoGeneralTipoUbicacionNegocio;
	}

	public void setjTextFieldValorCampoGeneralTipoUbicacionNegocio(
			JTextField jTextFieldValorCampoGeneralTipoUbicacionNegocio) {
		this.jTextFieldValorCampoGeneralTipoUbicacionNegocio = jTextFieldValorCampoGeneralTipoUbicacionNegocio;
	}

	public void setBorderResaltarValorCampoGeneralTipoUbicacionNegocio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoUbicacionNegocio.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoUbicacionNegocio .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoUbicacionNegocio() {
		return this.jCheckBoxSeleccionarTodosTipoUbicacionNegocio;
	}

	public void setjCheckBoxSeleccionarTodosTipoUbicacionNegocio(
			JCheckBox jCheckBoxSeleccionarTodosTipoUbicacionNegocio) {
		this.jCheckBoxSeleccionarTodosTipoUbicacionNegocio = jCheckBoxSeleccionarTodosTipoUbicacionNegocio;
	}

	public void setBorderResaltarSeleccionarTodosTipoUbicacionNegocio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoUbicacionNegocio.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoUbicacionNegocio .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoUbicacionNegocio() {
		return this.jCheckBoxSeleccionadosTipoUbicacionNegocio;
	}

	public void setjCheckBoxSeleccionadosTipoUbicacionNegocio(
			JCheckBox jCheckBoxSeleccionadosTipoUbicacionNegocio) {
		this.jCheckBoxSeleccionadosTipoUbicacionNegocio = jCheckBoxSeleccionadosTipoUbicacionNegocio;
	}
	
	public void setBorderResaltarSeleccionadosTipoUbicacionNegocio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoUbicacionNegocio.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoUbicacionNegocio .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoUbicacionNegocio() {
		return this.jComboBoxTiposArchivosReportesTipoUbicacionNegocio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoUbicacionNegocio(
			JComboBox jComboBoxTiposArchivosReportesTipoUbicacionNegocio) {
		this.jComboBoxTiposArchivosReportesTipoUbicacionNegocio = jComboBoxTiposArchivosReportesTipoUbicacionNegocio;
	}

	public void setBorderResaltarTiposArchivosReportesTipoUbicacionNegocio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoUbicacionNegocio.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoUbicacionNegocio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoUbicacionNegocio() {
		return this.jComboBoxTiposReportesTipoUbicacionNegocio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoUbicacionNegocio(
			JComboBox jComboBoxTiposReportesTipoUbicacionNegocio) {
		this.jComboBoxTiposReportesTipoUbicacionNegocio = jComboBoxTiposReportesTipoUbicacionNegocio;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoUbicacionNegocio() {
	//	return jComboBoxTiposReportesDinamicoTipoUbicacionNegocio;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoUbicacionNegocio(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoUbicacionNegocio) {
	//	this.jComboBoxTiposReportesDinamicoTipoUbicacionNegocio = jComboBoxTiposReportesDinamicoTipoUbicacionNegocio;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoUbicacionNegocio() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoUbicacionNegocio;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoUbicacionNegocio(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoUbicacionNegocio) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoUbicacionNegocio = jComboBoxTiposArchivosReportesDinamicoTipoUbicacionNegocio;
	//}
	
	public void setBorderResaltarTiposReportesTipoUbicacionNegocio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoUbicacionNegocio.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoUbicacionNegocio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoUbicacionNegocio() {
		return this.jComboBoxTiposGraficosReportesTipoUbicacionNegocio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoUbicacionNegocio(
			JComboBox jComboBoxTiposGraficosReportesTipoUbicacionNegocio) {
		this.jComboBoxTiposGraficosReportesTipoUbicacionNegocio = jComboBoxTiposGraficosReportesTipoUbicacionNegocio;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoUbicacionNegocio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoUbicacionNegocio.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoUbicacionNegocio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoUbicacionNegocio() {
		return this.jComboBoxTiposPaginacionTipoUbicacionNegocio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoUbicacionNegocio(
			JComboBox jComboBoxTiposPaginacionTipoUbicacionNegocio) {
		this.jComboBoxTiposPaginacionTipoUbicacionNegocio = jComboBoxTiposPaginacionTipoUbicacionNegocio;
	}
	
	public void setBorderResaltarTiposPaginacionTipoUbicacionNegocio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoUbicacionNegocio.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoUbicacionNegocio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoUbicacionNegocio() {
		return this.jComboBoxTiposRelacionesTipoUbicacionNegocio;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoUbicacionNegocio() {
		return this.jComboBoxTiposAccionesTipoUbicacionNegocio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoUbicacionNegocio(
			JComboBox jComboBoxTiposRelacionesTipoUbicacionNegocio) {
		this.jComboBoxTiposRelacionesTipoUbicacionNegocio = jComboBoxTiposRelacionesTipoUbicacionNegocio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoUbicacionNegocio(
			JComboBox jComboBoxTiposAccionesTipoUbicacionNegocio) {
		this.jComboBoxTiposAccionesTipoUbicacionNegocio = jComboBoxTiposAccionesTipoUbicacionNegocio;
	}
	
	public void setBorderResaltarTiposRelacionesTipoUbicacionNegocio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoUbicacionNegocio.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoUbicacionNegocio .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoUbicacionNegocio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoUbicacionNegocio.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoUbicacionNegocio .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoUbicacionNegocio() {
	//	return jCheckBoxConGraficoDinamicoTipoUbicacionNegocio;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoUbicacionNegocio(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoUbicacionNegocio) {
	//	this.jCheckBoxConGraficoDinamicoTipoUbicacionNegocio = jCheckBoxConGraficoDinamicoTipoUbicacionNegocio;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoUbicacionNegocio() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoUbicacionNegocio.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoUbicacionNegocio .setBorder(borderResaltar);		
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
		this.tipoubicacionnegocioSessionBean=new TipoUbicacionNegocioSessionBean();
		
		this.tipoubicacionnegocioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoubicacionnegocioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoUbicacionNegocioJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoUbicacionNegocioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoUbicacionNegocioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoUbicacionNegocioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoUbicacionNegocioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Ubicacion Negocio MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoUbicacionNegocioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoUbicacionNegocio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoUbicacionNegocio= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoUbicacionNegocio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoUbicacionNegocio,this.jTtoolBarTipoUbicacionNegocio,
							"nuevo","nuevo","Nuevo"+" "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoUbicacionNegocio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoUbicacionNegocio,this.jTtoolBarTipoUbicacionNegocio,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoUbicacionNegocio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoUbicacionNegocio,this.jTtoolBarTipoUbicacionNegocio,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoUbicacionNegocio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoUbicacionNegocio,this.jTtoolBarTipoUbicacionNegocio,
							"duplicar","duplicar","Duplicar"+" "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoUbicacionNegocio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoUbicacionNegocio,this.jTtoolBarTipoUbicacionNegocio,
							"copiar","copiar","Copiar"+" "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoUbicacionNegocio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoUbicacionNegocio,this.jTtoolBarTipoUbicacionNegocio,
							"ver_form","ver_form","Ver"+" "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoUbicacionNegocio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoUbicacionNegocio,this.jTtoolBarTipoUbicacionNegocio,
							"recargar","recargar","Recargar"+" "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoUbicacionNegocio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoUbicacionNegocio,this.jTtoolBarTipoUbicacionNegocio,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoUbicacionNegocio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoUbicacionNegocio,this.jTtoolBarTipoUbicacionNegocio,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoUbicacionNegocio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoUbicacionNegocio,this.jTtoolBarTipoUbicacionNegocio,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoUbicacionNegocio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoUbicacionNegocio,this.jTtoolBarTipoUbicacionNegocio,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoUbicacionNegocio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoUbicacionNegocio,this.jTtoolBarTipoUbicacionNegocio,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoUbicacionNegocio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoUbicacionNegocio,this.jTtoolBarTipoUbicacionNegocio,
							"cerrar","cerrar","Salir"+" "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoUbicacionNegocio=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoUbicacionNegocio;
			
				this.jButtonProcesarInformacionToolBarTipoUbicacionNegocio=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoUbicacionNegocio;
				
		//protected JButton jButtonModificarToolBarTipoUbicacionNegocio;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoUbicacionNegocio=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoUbicacionNegocio=new JMenuMe("General");
		this.jmenuArchivoTipoUbicacionNegocio=new JMenuMe("Archivo");
		this.jmenuAccionesTipoUbicacionNegocio=new JMenuMe("Acciones");
		this.jmenuDatosTipoUbicacionNegocio=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoUbicacionNegocio= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoUbicacionNegocio.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoUbicacionNegocio,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoUbicacionNegocio= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoUbicacionNegocio.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoUbicacionNegocio,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoUbicacionNegocio= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoUbicacionNegocio.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoUbicacionNegocio,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoUbicacionNegocio= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoUbicacionNegocio.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoUbicacionNegocio,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoUbicacionNegocio= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoUbicacionNegocio.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoUbicacionNegocio,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoUbicacionNegocio= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoUbicacionNegocio.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoUbicacionNegocio,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoUbicacionNegocio= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoUbicacionNegocio.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoUbicacionNegocio,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoUbicacionNegocio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoUbicacionNegocio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoUbicacionNegocio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoUbicacionNegocio= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoUbicacionNegocio.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoUbicacionNegocio,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoUbicacionNegocio= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoUbicacionNegocio.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoUbicacionNegocio,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoUbicacionNegocio= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoUbicacionNegocio.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoUbicacionNegocio,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoUbicacionNegocio= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoUbicacionNegocio.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoUbicacionNegocio,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoUbicacionNegocio= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoUbicacionNegocio.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoUbicacionNegocio,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoUbicacionNegocio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoUbicacionNegocio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoUbicacionNegocio,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoUbicacionNegocio= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoUbicacionNegocio.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoUbicacionNegocio,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoUbicacionNegocio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoUbicacionNegocio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoUbicacionNegocio,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoUbicacionNegocio= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoUbicacionNegocio.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoUbicacionNegocio,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoUbicacionNegocio.add(this.jMenuItemCerrarTipoUbicacionNegocio);
			
			this.jmenuAccionesTipoUbicacionNegocio.add(this.jMenuItemNuevoTipoUbicacionNegocio);
			this.jmenuAccionesTipoUbicacionNegocio.add(this.jMenuItemNuevoGuardarCambiosTipoUbicacionNegocio);
			this.jmenuAccionesTipoUbicacionNegocio.add(this.jMenuItemNuevoRelacionesTipoUbicacionNegocio);
			this.jmenuAccionesTipoUbicacionNegocio.add(this.jMenuItemGuardarCambiosTablaTipoUbicacionNegocio);		
			this.jmenuAccionesTipoUbicacionNegocio.add(this.jMenuItemDuplicarTipoUbicacionNegocio);		
			this.jmenuAccionesTipoUbicacionNegocio.add(this.jMenuItemCopiarTipoUbicacionNegocio);		
			this.jmenuAccionesTipoUbicacionNegocio.add(this.jMenuItemVerFormTipoUbicacionNegocio);		
			
			this.jmenuDatosTipoUbicacionNegocio.add(this.jMenuItemRecargarInformacionTipoUbicacionNegocio);				
			this.jmenuDatosTipoUbicacionNegocio.add(this.jMenuItemAnterioresTipoUbicacionNegocio);				
			this.jmenuDatosTipoUbicacionNegocio.add(this.jMenuItemSiguientesTipoUbicacionNegocio);				
			this.jmenuDatosTipoUbicacionNegocio.add(this.jMenuItemAbrirOrderByTipoUbicacionNegocio);				
			this.jmenuDatosTipoUbicacionNegocio.add(this.jMenuItemMostrarOcultarTipoUbicacionNegocio);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoUbicacionNegocio.add(this.jMenuItemGuardarCambiosTipoUbicacionNegocio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoUbicacionNegocio.add(this.jmenuArchivoTipoUbicacionNegocio);		
			this.jmenuBarTipoUbicacionNegocio.add(this.jmenuAccionesTipoUbicacionNegocio);		
			this.jmenuBarTipoUbicacionNegocio.add(this.jmenuDatosTipoUbicacionNegocio);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoUbicacionNegocio);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoUbicacionNegocio() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoUbicacionNegocio=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoUbicacionNegocio.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoUbicacionNegocio.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoUbicacionNegocio.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoUbicacionNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoUbicacionNegocio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoUbicacionNegocio,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoUbicacionNegocio = new TipoUbicacionNegocioDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Ubicacion Negocio DATOS");
			this.jInternalFrameDetalleFormTipoUbicacionNegocio = new TipoUbicacionNegocioDetalleFormJInternalFrame(jDesktopPane,this.tipoubicacionnegocioSessionBean.getConGuardarRelaciones(),this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoUbicacionNegocio = null;//new TipoUbicacionNegocioDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoUbicacionNegocio= new GridBagLayout();
		
		
		this.jTableDatosTipoUbicacionNegocio = new JTableMe();      
		
		String sToolTipTipoUbicacionNegocio="";
		sToolTipTipoUbicacionNegocio=TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoUbicacionNegocio+="(Cartera.TipoUbicacionNegocio)";
		}
		
		if(!this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoUbicacionNegocio+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoUbicacionNegocio.setToolTipText(sToolTipTipoUbicacionNegocio);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoUbicacionNegocio);
		this.jTableDatosTipoUbicacionNegocio.setAutoCreateRowSorter(true);
		this.jTableDatosTipoUbicacionNegocio.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoUbicacionNegocio.setRowSelectionAllowed(true);
		this.jTableDatosTipoUbicacionNegocio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoUbicacionNegocio,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoUbicacionNegocio = new JButtonMe();
		this.jButtonDuplicarTipoUbicacionNegocio = new JButtonMe();
		this.jButtonCopiarTipoUbicacionNegocio = new JButtonMe();
		this.jButtonVerFormTipoUbicacionNegocio = new JButtonMe();
		this.jButtonNuevoRelacionesTipoUbicacionNegocio = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoUbicacionNegocio = new JButtonMe();
		this.jButtonCerrarTipoUbicacionNegocio = new JButtonMe();
		
		this.jScrollPanelDatosTipoUbicacionNegocio = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoUbicacionNegocio = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoUbicacionNegocio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Ubicacion Negocio";
		
		if(!this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoUbicacionNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Ubicacion Negocios" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoUbicacionNegocio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoUbicacionNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoUbicacionNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoUbicacionNegocio.setToolTipText("Acciones");
        this.jPanelAccionesTipoUbicacionNegocio.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoUbicacionNegocio=new ReporteDinamicoJInternalFrame(TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoUbicacionNegocio();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoUbicacionNegocio=new ImportacionJInternalFrame(TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoUbicacionNegocio();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoUbicacionNegocio = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoUbicacionNegocio.setText("Orden");
		this.jButtonAbrirOrderByTipoUbicacionNegocio.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoUbicacionNegocio,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoUbicacionNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoUbicacionNegocio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoUbicacionNegocio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoUbicacionNegocio,false,this);
			
			//this.cargarOrderByTipoUbicacionNegocio(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoUbicacionNegocio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoUbicacionNegocio,true,this);
			
			//this.cargarOrderByTipoUbicacionNegocio(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoUbicacionNegocio.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoUbicacionNegocio.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoUbicacionNegocio.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoUbicacionNegocio.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoUbicacionNegocio.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoUbicacionNegocio.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoUbicacionNegocio.setText("Nuevo");
		this.jButtonDuplicarTipoUbicacionNegocio.setText("Duplicar");
		this.jButtonCopiarTipoUbicacionNegocio.setText("Copiar");
		this.jButtonVerFormTipoUbicacionNegocio.setText("Ver");
		this.jButtonNuevoRelacionesTipoUbicacionNegocio.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoUbicacionNegocio.setText("Guardar");
		this.jButtonCerrarTipoUbicacionNegocio.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoUbicacionNegocio,"nuevo_button","Nuevo",this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoUbicacionNegocio,"duplicar_button","Duplicar",this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoUbicacionNegocio,"copiar_button","Copiar",this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoUbicacionNegocio,"ver_form","Ver",this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoUbicacionNegocio,"nuevorelaciones_button","Nuevo Rel",this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoUbicacionNegocio,"guardarcambiostabla_button","Guardar",this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoUbicacionNegocio,"cerrar_button","Salir",this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoUbicacionNegocio.setToolTipText("Nuevo"+" "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoUbicacionNegocio.setToolTipText("Duplicar"+" "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoUbicacionNegocio.setToolTipText("Copiar"+" "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoUbicacionNegocio.setToolTipText("Ver"+" "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoUbicacionNegocio.setToolTipText("Nuevo Rel"+" "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoUbicacionNegocio.setToolTipText("Guardar"+" "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoUbicacionNegocio.setToolTipText("Salir"+" "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoUbicacionNegocio";
		inputMap = this.jButtonNuevoTipoUbicacionNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoUbicacionNegocio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoUbicacionNegocio"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoUbicacionNegocio";
		inputMap = this.jButtonDuplicarTipoUbicacionNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoUbicacionNegocio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoUbicacionNegocio"));
		
		//COPIAR
		sMapKey = "CopiarTipoUbicacionNegocio";
		inputMap = this.jButtonCopiarTipoUbicacionNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoUbicacionNegocio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoUbicacionNegocio"));
		
		//VEr FORM
		sMapKey = "VerFormTipoUbicacionNegocio";
		inputMap = this.jButtonVerFormTipoUbicacionNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoUbicacionNegocio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoUbicacionNegocio"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoUbicacionNegocio";
		inputMap = this.jButtonNuevoRelacionesTipoUbicacionNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoUbicacionNegocio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoUbicacionNegocio"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoUbicacionNegocio";
		inputMap = this.jButtonModificarTipoUbicacionNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoUbicacionNegocio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoUbicacionNegocio"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoUbicacionNegocio";
		inputMap = this.jButtonCerrarTipoUbicacionNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoUbicacionNegocio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoUbicacionNegocio"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoUbicacionNegocio";
		inputMap = this.jButtonGuardarCambiosTablaTipoUbicacionNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoUbicacionNegocio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoUbicacionNegocio"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoUbicacionNegocio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoUbicacionNegocio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoUbicacionNegocio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoUbicacionNegocio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoUbicacionNegocio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoUbicacionNegocio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoUbicacionNegocio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoUbicacionNegocio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoUbicacionNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoUbicacionNegocio.setName("jPanelParametrosReportesTipoUbicacionNegocio"); 
		
		this.jPanelParametrosReportesAccionesTipoUbicacionNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoUbicacionNegocio.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoUbicacionNegocio.setName("jPanelParametrosReportesAccionesTipoUbicacionNegocio"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoUbicacionNegocio = new JButtonMe();
		this.jButtonRecargarInformacionTipoUbicacionNegocio.setText("Recargar");
		this.jButtonRecargarInformacionTipoUbicacionNegocio.setToolTipText("Recargar"+" "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoUbicacionNegocio,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoUbicacionNegocio = new JButtonMe();
		this.jButtonProcesarInformacionTipoUbicacionNegocio.setText("Procesar");
		this.jButtonProcesarInformacionTipoUbicacionNegocio.setToolTipText("Procesar"+" "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoUbicacionNegocio.setVisible(false);
			
		this.jButtonProcesarInformacionTipoUbicacionNegocio.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoUbicacionNegocio.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoUbicacionNegocio.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoUbicacionNegocio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoUbicacionNegocio.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoUbicacionNegocio.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoUbicacionNegocio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoUbicacionNegocio.setText("TIPO");       
		this.jComboBoxTiposReportesTipoUbicacionNegocio.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoUbicacionNegocio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoUbicacionNegocio.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoUbicacionNegocio.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoUbicacionNegocio = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoUbicacionNegocio.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoUbicacionNegocio.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoUbicacionNegocio = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoUbicacionNegocio.setText("Accion");
		this.jComboBoxTiposRelacionesTipoUbicacionNegocio.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoUbicacionNegocio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoUbicacionNegocio.setText("Accion");
		this.jComboBoxTiposAccionesTipoUbicacionNegocio.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoUbicacionNegocio = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoUbicacionNegocio.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoUbicacionNegocio.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoUbicacionNegocio=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoUbicacionNegocio.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoUbicacionNegocio.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoUbicacionNegocio.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoUbicacionNegocio = new JLabelMe();
		
		this.jLabelAccionesTipoUbicacionNegocio.setText("Acciones");		
		this.jLabelAccionesTipoUbicacionNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoUbicacionNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoUbicacionNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoUbicacionNegocio = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoUbicacionNegocio.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoUbicacionNegocio.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoUbicacionNegocio = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoUbicacionNegocio.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoUbicacionNegocio.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoUbicacionNegocio = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoUbicacionNegocio.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoUbicacionNegocio.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoUbicacionNegocio = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoUbicacionNegocio.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoUbicacionNegocio.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoUbicacionNegocio = new JButtonMe();
		//this.jButtonAnterioresTipoUbicacionNegocio.setText("<<");
        this.jButtonAnterioresTipoUbicacionNegocio.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoUbicacionNegocio,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoUbicacionNegocio = new JButtonMe();
		//this.jButtonSiguientesTipoUbicacionNegocio.setText(">>");
        this.jButtonSiguientesTipoUbicacionNegocio.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoUbicacionNegocio,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoUbicacionNegocio = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoUbicacionNegocio.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoUbicacionNegocio.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoUbicacionNegocio,"nuevoguardarcambios_button","Nue",this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoUbicacionNegocio";
		inputMap = this.jButtonNuevoGuardarCambiosTipoUbicacionNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoUbicacionNegocio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoUbicacionNegocio"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoUbicacionNegocio";
		inputMap = this.jButtonRecargarInformacionTipoUbicacionNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoUbicacionNegocio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoUbicacionNegocio"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoUbicacionNegocio";
		inputMap = this.jButtonSiguientesTipoUbicacionNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoUbicacionNegocio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoUbicacionNegocio"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoUbicacionNegocio";
		inputMap = this.jButtonAnterioresTipoUbicacionNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoUbicacionNegocio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoUbicacionNegocio"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoUbicacionNegocio();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoUbicacionNegocio.setMinimumSize(new Dimension(this.getWidth(),TipoUbicacionNegocioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoUbicacionNegocioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoUbicacionNegocio.setMaximumSize(new Dimension(this.getWidth(),TipoUbicacionNegocioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoUbicacionNegocioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoUbicacionNegocio.setPreferredSize(new Dimension(this.getWidth(),TipoUbicacionNegocioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoUbicacionNegocioBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoUbicacionNegocio = new GridBagLayout();

			this.jPanelPaginacionTipoUbicacionNegocio.setLayout(gridaBagLayoutPaginacionTipoUbicacionNegocio);						
			
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			this.gridBagConstraintsTipoUbicacionNegocio.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoUbicacionNegocio.gridy = 0;
			this.gridBagConstraintsTipoUbicacionNegocio.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoUbicacionNegocio.add(this.jButtonAnterioresTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
					
						
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			this.gridBagConstraintsTipoUbicacionNegocio.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoUbicacionNegocio.gridy = 0;
			
			this.jPanelPaginacionTipoUbicacionNegocio.add(this.jButtonNuevoGuardarCambiosTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
						
			
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			this.gridBagConstraintsTipoUbicacionNegocio.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoUbicacionNegocio.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoUbicacionNegocio.gridy = 0;
			this.jPanelPaginacionTipoUbicacionNegocio.add(this.jButtonSiguientesTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoUbicacionNegocio.gridy = 1;
			this.gridBagConstraintsTipoUbicacionNegocio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoUbicacionNegocio.add(this.jButtonNuevoTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
						
			
			
			if(!this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
				this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoUbicacionNegocio.gridy = 1;
				this.gridBagConstraintsTipoUbicacionNegocio.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoUbicacionNegocio.add(this.jButtonGuardarCambiosTablaTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
			}
			
			
			
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoUbicacionNegocio.gridy = 1;
			this.gridBagConstraintsTipoUbicacionNegocio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoUbicacionNegocio.add(this.jButtonDuplicarTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
			
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoUbicacionNegocio.gridy = 1;
			this.gridBagConstraintsTipoUbicacionNegocio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoUbicacionNegocio.add(this.jButtonCopiarTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
		
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoUbicacionNegocio.gridy = 1;
			this.gridBagConstraintsTipoUbicacionNegocio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoUbicacionNegocio.add(this.jButtonVerFormTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
		
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoUbicacionNegocio.gridy = 1;
			this.gridBagConstraintsTipoUbicacionNegocio.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoUbicacionNegocio.add(this.jButtonCerrarTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
		
		
		
		this.jButtonRecargarInformacionTipoUbicacionNegocio.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoUbicacionNegocio.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoUbicacionNegocio.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoUbicacionNegocio.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoUbicacionNegocio.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoUbicacionNegocio.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoUbicacionNegocio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoUbicacionNegocio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoUbicacionNegocio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoUbicacionNegocio.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoUbicacionNegocio.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoUbicacionNegocio.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoUbicacionNegocio.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoUbicacionNegocio.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoUbicacionNegocio.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoUbicacionNegocio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoUbicacionNegocio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoUbicacionNegocio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoUbicacionNegocio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoUbicacionNegocio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoUbicacionNegocio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoUbicacionNegocio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoUbicacionNegocio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoUbicacionNegocio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoUbicacionNegocio.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoUbicacionNegocio.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoUbicacionNegocio.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoUbicacionNegocio.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoUbicacionNegocio.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoUbicacionNegocio.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoUbicacionNegocio.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoUbicacionNegocio.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoUbicacionNegocio.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoUbicacionNegocio.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoUbicacionNegocio.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoUbicacionNegocio.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoUbicacionNegocio = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoUbicacionNegocio = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoUbicacionNegocio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoUbicacionNegocio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoUbicacionNegocio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoUbicacionNegocio = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoUbicacionNegocio.setLayout(gridaBagParametrosReportesTipoUbicacionNegocio);
			this.jPanelParametrosReportesAccionesTipoUbicacionNegocio.setLayout(gridaBagParametrosReportesAccionesTipoUbicacionNegocio);
			
			
			this.jPanelParametrosAuxiliar1TipoUbicacionNegocio.setLayout(gridaBagParametrosAuxiliar1TipoUbicacionNegocio);
			this.jPanelParametrosAuxiliar2TipoUbicacionNegocio.setLayout(gridaBagParametrosAuxiliar2TipoUbicacionNegocio);
			this.jPanelParametrosAuxiliar3TipoUbicacionNegocio.setLayout(gridaBagParametrosAuxiliar3TipoUbicacionNegocio);
			this.jPanelParametrosAuxiliar4TipoUbicacionNegocio.setLayout(gridaBagParametrosAuxiliar4TipoUbicacionNegocio);
			//this.jPanelParametrosAuxiliar5TipoUbicacionNegocio.setLayout(gridaBagParametrosAuxiliar2TipoUbicacionNegocio);			
			
			
			
			
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoUbicacionNegocio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoUbicacionNegocio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoUbicacionNegocio.add(this.jButtonRecargarInformacionTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			this.gridBagConstraintsTipoUbicacionNegocio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoUbicacionNegocio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoUbicacionNegocio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoUbicacionNegocio.add(this.jComboBoxTiposPaginacionTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			this.gridBagConstraintsTipoUbicacionNegocio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoUbicacionNegocio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoUbicacionNegocio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoUbicacionNegocio.add(this.jCheckBoxConAltoMaximoTablaTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			this.gridBagConstraintsTipoUbicacionNegocio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoUbicacionNegocio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoUbicacionNegocio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoUbicacionNegocio.add(this.jComboBoxTiposArchivosReportesTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			this.gridBagConstraintsTipoUbicacionNegocio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoUbicacionNegocio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoUbicacionNegocio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoUbicacionNegocio.add(this.jPanelParametrosAuxiliar1TipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			this.gridBagConstraintsTipoUbicacionNegocio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoUbicacionNegocio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoUbicacionNegocio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoUbicacionNegocio.add(this.jComboBoxTiposReportesTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			this.gridBagConstraintsTipoUbicacionNegocio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoUbicacionNegocio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoUbicacionNegocio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoUbicacionNegocio.add(this.jPanelParametrosAuxiliar4TipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			this.gridBagConstraintsTipoUbicacionNegocio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoUbicacionNegocio.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoUbicacionNegocio.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoUbicacionNegocio.add(this.jComboBoxTiposReportesTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			this.gridBagConstraintsTipoUbicacionNegocio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoUbicacionNegocio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoUbicacionNegocio.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoUbicacionNegocio.add(this.jCheckBoxGenerarReporteTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			this.gridBagConstraintsTipoUbicacionNegocio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoUbicacionNegocio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoUbicacionNegocio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoUbicacionNegocio.add(this.jPanelParametrosAuxiliar2TipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoUbicacionNegocio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoUbicacionNegocio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoUbicacionNegocio.add(this.jLabelAccionesTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
				this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoUbicacionNegocio.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoUbicacionNegocio.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoUbicacionNegocio.add(this.jButtonAbrirOrderByTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoUbicacionNegocio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoUbicacionNegocio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoUbicacionNegocio.add(this.jComboBoxTiposSeleccionarTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);			
			
			
			/*
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoUbicacionNegocio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoUbicacionNegocio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoUbicacionNegocio.add(this.jCheckBoxSeleccionarTodosTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			this.gridBagConstraintsTipoUbicacionNegocio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoUbicacionNegocio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoUbicacionNegocio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoUbicacionNegocio.add(this.jCheckBoxSeleccionarTodosTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);															
				
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			this.gridBagConstraintsTipoUbicacionNegocio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoUbicacionNegocio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoUbicacionNegocio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoUbicacionNegocio.add(this.jCheckBoxSeleccionadosTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			this.gridBagConstraintsTipoUbicacionNegocio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoUbicacionNegocio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoUbicacionNegocio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoUbicacionNegocio.add(this.jPanelParametrosAuxiliar3TipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			this.gridBagConstraintsTipoUbicacionNegocio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoUbicacionNegocio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoUbicacionNegocio.add(this.jComboBoxTiposRelacionesTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
				
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			this.gridBagConstraintsTipoUbicacionNegocio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoUbicacionNegocio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoUbicacionNegocio.add(this.jComboBoxTiposAccionesTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoUbicacionNegocio = new GridBagLayout();

			this.jScrollPanelDatosTipoUbicacionNegocio.setLayout(gridaBagLayoutDatosTipoUbicacionNegocio);
			
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoUbicacionNegocio.gridy = 0;
			this.gridBagConstraintsTipoUbicacionNegocio.gridx = 0;
			
			this.jScrollPanelDatosTipoUbicacionNegocio.add(this.jTableDatosTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoUbicacionNegocio.setViewportView(this.jTableDatosTipoUbicacionNegocio);
		this.jTableDatosTipoUbicacionNegocio.setFillsViewportHeight(true);
		this.jTableDatosTipoUbicacionNegocio.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoUbicacionNegocio= new GridBagLayout();
		this.jPanelAccionesTipoUbicacionNegocio.setLayout(gridaBagLayoutAccionesTipoUbicacionNegocio);
		
		
		/*	
		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoUbicacionNegocio.gridy = 0;
		this.gridBagConstraintsTipoUbicacionNegocio.gridx = 0;
			
		this.jPanelAccionesTipoUbicacionNegocio.add(this.jButtonNuevoTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoUbicacionNegocio = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoUbicacionNegocio);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();						
			this.gridBagConstraintsTipoUbicacionNegocio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoUbicacionNegocio.gridx = 0;		
			//this.gridBagConstraintsTipoUbicacionNegocio.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoUbicacionNegocio.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoUbicacionNegocio.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		this.gridBagConstraintsTipoUbicacionNegocio.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoUbicacionNegocio.gridx = 0;		
		//this.gridBagConstraintsTipoUbicacionNegocio.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoUbicacionNegocio.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoUbicacionNegocio.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoUbicacionNegocio);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		this.gridBagConstraintsTipoUbicacionNegocio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoUbicacionNegocio.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);								
		
		
		/*
		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		this.gridBagConstraintsTipoUbicacionNegocio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoUbicacionNegocio.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
		*/		
		
		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		this.gridBagConstraintsTipoUbicacionNegocio.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoUbicacionNegocio.gridx =0;
		this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoUbicacionNegocio.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
				
		
		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		this.gridBagConstraintsTipoUbicacionNegocio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoUbicacionNegocio.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoUbicacionNegocioJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoUbicacionNegocio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoUbicacionNegocio = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoUbicacionNegocio.setLayout(gridaBagLayoutBusquedasParametrosTipoUbicacionNegocio);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoUbicacionNegocio=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoUbicacionNegocio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoUbicacionNegocio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoUbicacionNegocio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		this.gridBagConstraintsTipoUbicacionNegocio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoUbicacionNegocio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
			
			
		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		this.gridBagConstraintsTipoUbicacionNegocio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoUbicacionNegocio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
		
			
		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		this.gridBagConstraintsTipoUbicacionNegocio.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoUbicacionNegocio.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoUbicacionNegocio;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoUbicacionNegocio() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoUbicacionNegocio = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoUbicacionNegocio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoUbicacionNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoUbicacionNegocio.setName("jPanelReporteDinamicoTipoUbicacionNegocio"); 
		
		this.jPanelReporteDinamicoTipoUbicacionNegocio.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoUbicacionNegocio.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoUbicacionNegocio.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoUbicacionNegocio.setLayout(gridaBagLayoutReporteDinamicoTipoUbicacionNegocio);
		
		
		this.jInternalFrameReporteDinamicoTipoUbicacionNegocio= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoUbicacionNegocio = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoUbicacionNegocio= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoUbicacionNegocio.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoUbicacionNegocio.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoUbicacionNegocio.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoUbicacionNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Ubicacion Negocios"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoUbicacionNegocio = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoUbicacionNegocio.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoUbicacionNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoUbicacionNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoUbicacionNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoUbicacionNegocio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoUbicacionNegocio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoUbicacionNegocio.add(this.jLabelColumnasSelectReporteTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoUbicacionNegocio = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoUbicacionNegocio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoUbicacionNegocio.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoUbicacionNegocio.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoUbicacionNegocio.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoUbicacionNegocio.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoUbicacionNegocio=new JScrollPane(this.jListColumnasSelectReporteTipoUbicacionNegocio);
			
			this.jScrollColumnasSelectReporteTipoUbicacionNegocio.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoUbicacionNegocio.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoUbicacionNegocio.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoUbicacionNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoUbicacionNegocio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoUbicacionNegocio.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoUbicacionNegocio.add(this.jListColumnasSelectReporteTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
		this.jPanelReporteDinamicoTipoUbicacionNegocio.add(this.jScrollColumnasSelectReporteTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoUbicacionNegocio = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoUbicacionNegocio.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoUbicacionNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoUbicacionNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoUbicacionNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoUbicacionNegocio = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoUbicacionNegocio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoUbicacionNegocio.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoUbicacionNegocio.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoUbicacionNegocio.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoUbicacionNegocio.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoUbicacionNegocio=new JScrollPane(this.jListRelacionesSelectReporteTipoUbicacionNegocio);
			
			this.jScrollRelacionesSelectReporteTipoUbicacionNegocio.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoUbicacionNegocio.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoUbicacionNegocio.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoUbicacionNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoUbicacionNegocio = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoUbicacionNegocio = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoUbicacionNegocio = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoUbicacionNegocio = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoUbicacionNegocio.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoUbicacionNegocio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoUbicacionNegocio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoUbicacionNegocio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoUbicacionNegocio = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoUbicacionNegocio.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoUbicacionNegocio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoUbicacionNegocio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoUbicacionNegocio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoUbicacionNegocio = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoUbicacionNegocio.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoUbicacionNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoUbicacionNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoUbicacionNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoUbicacionNegocio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoUbicacionNegocio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoUbicacionNegocio.add(this.jLabelGenerarExcelReporteDinamicoTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoUbicacionNegocio = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoUbicacionNegocio.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoUbicacionNegocio,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoUbicacionNegocio.setToolTipText("Generar EXCEL"+" "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		//this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoUbicacionNegocio.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoUbicacionNegocio.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoUbicacionNegocio.add(this.jButtonGenerarExcelReporteDinamicoTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoUbicacionNegocio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoUbicacionNegocio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoUbicacionNegocio.add(this.jComboBoxTiposReportesDinamicoTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoUbicacionNegocio = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoUbicacionNegocio.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoUbicacionNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoUbicacionNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoUbicacionNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoUbicacionNegocio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoUbicacionNegocio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoUbicacionNegocio.add(this.jLabelTiposArchivoReporteDinamicoTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoUbicacionNegocio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoUbicacionNegocio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoUbicacionNegocio.add(this.jComboBoxTiposArchivosReportesDinamicoTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoUbicacionNegocio = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoUbicacionNegocio.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoUbicacionNegocio,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoUbicacionNegocio.setToolTipText("Generar"+" "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoUbicacionNegocio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoUbicacionNegocio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoUbicacionNegocio.add(this.jButtonGenerarReporteDinamicoTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoUbicacionNegocio = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoUbicacionNegocio.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoUbicacionNegocio,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoUbicacionNegocio.setToolTipText("Cancelar"+" "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoUbicacionNegocio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoUbicacionNegocio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoUbicacionNegocio.add(this.jButtonCerrarReporteDinamicoTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoUbicacionNegocio = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoUbicacionNegocio= new JScrollPane(jPanelReporteDinamicoTipoUbicacionNegocio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoUbicacionNegocio.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoUbicacionNegocio.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoUbicacionNegocio.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoUbicacionNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Ubicacion Negocios"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		this.gridBagConstraintsTipoUbicacionNegocio.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoUbicacionNegocio.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoUbicacionNegocio);
		this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.getContentPane().add(this.jScrollPanelReporteDinamicoTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoUbicacionNegocio() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoUbicacionNegocio = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoUbicacionNegocio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoUbicacionNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoUbicacionNegocio.setName("jPanelImportacionTipoUbicacionNegocio"); 
		
		this.jPanelImportacionTipoUbicacionNegocio.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoUbicacionNegocio.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoUbicacionNegocio.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoUbicacionNegocio.setLayout(gridaBagLayoutImportacionTipoUbicacionNegocio);
		
		
		this.jInternalFrameImportacionTipoUbicacionNegocio= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoUbicacionNegocio= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoUbicacionNegocio = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoUbicacionNegocio= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoUbicacionNegocio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoUbicacionNegocio.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoUbicacionNegocio.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoUbicacionNegocio.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoUbicacionNegocio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoUbicacionNegocio.setResizable(true);
	    this.jInternalFrameImportacionTipoUbicacionNegocio.setClosable(true);
	    this.jInternalFrameImportacionTipoUbicacionNegocio.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoUbicacionNegocio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoUbicacionNegocio.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoUbicacionNegocio.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoUbicacionNegocio.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoUbicacionNegocio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoUbicacionNegocio.setResizable(true);
	    this.jInternalFrameImportacionTipoUbicacionNegocio.setClosable(true);
	    this.jInternalFrameImportacionTipoUbicacionNegocio.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoUbicacionNegocio.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoUbicacionNegocio.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoUbicacionNegocio.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoUbicacionNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Ubicacion Negocios"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoUbicacionNegocio = new JLabelMe();

		this.jLabelArchivoImportacionTipoUbicacionNegocio.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoUbicacionNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoUbicacionNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoUbicacionNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoUbicacionNegocio.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoUbicacionNegocio.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoUbicacionNegocio.add(this.jLabelArchivoImportacionTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoUbicacionNegocio = new JFileChooser();		
		this.jFileChooserImportacionTipoUbicacionNegocio.setToolTipText("ESCOGER ARCHIVO"+" "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoUbicacionNegocio = new JButtonMe();
		this.jButtonAbrirImportacionTipoUbicacionNegocio.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoUbicacionNegocio,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoUbicacionNegocio.setToolTipText("Generar"+" "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoUbicacionNegocio.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoUbicacionNegocio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoUbicacionNegocio.add(this.jButtonAbrirImportacionTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoUbicacionNegocio = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoUbicacionNegocio.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoUbicacionNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoUbicacionNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoUbicacionNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoUbicacionNegocio.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoUbicacionNegocio.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoUbicacionNegocio.add(this.jLabelPathArchivoImportacionTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoUbicacionNegocio=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoUbicacionNegocio.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoUbicacionNegocio.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoUbicacionNegocio.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoUbicacionNegocio.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoUbicacionNegocio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoUbicacionNegocio.add(this.jTextFieldPathArchivoImportacionTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoUbicacionNegocio = new JButtonMe();
		this.jButtonGenerarImportacionTipoUbicacionNegocio.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoUbicacionNegocio,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoUbicacionNegocio.setToolTipText("Generar"+" "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoUbicacionNegocio.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoUbicacionNegocio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoUbicacionNegocio.add(this.jButtonGenerarImportacionTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoUbicacionNegocio = new JButtonMe();
		this.jButtonCerrarImportacionTipoUbicacionNegocio.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoUbicacionNegocio,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoUbicacionNegocio.setToolTipText("Cancelar"+" "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoUbicacionNegocio.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoUbicacionNegocio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoUbicacionNegocio.add(this.jButtonCerrarImportacionTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoUbicacionNegocio = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoUbicacionNegocio= new JScrollPane(jPanelImportacionTipoUbicacionNegocio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		this.gridBagConstraintsTipoUbicacionNegocio.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoUbicacionNegocio.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoUbicacionNegocio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoUbicacionNegocio.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoUbicacionNegocio);
		this.jInternalFrameImportacionTipoUbicacionNegocio.getContentPane().add(this.jScrollPanelImportacionTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoUbicacionNegocio(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoUbicacionNegocio = new JButtonMe();
			this.jButtonAbrirOrderByTipoUbicacionNegocio.setText("Orden");
			this.jButtonAbrirOrderByTipoUbicacionNegocio.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoUbicacionNegocio,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoUbicacionNegocio";
			inputMap = this.jButtonAbrirOrderByTipoUbicacionNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoUbicacionNegocio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoUbicacionNegocio"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoUbicacionNegocio = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoUbicacionNegocio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoUbicacionNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoUbicacionNegocio.setName("jPanelOrderByTipoUbicacionNegocio"); 
			
			this.jPanelOrderByTipoUbicacionNegocio.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoUbicacionNegocio.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoUbicacionNegocio.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoUbicacionNegocio.setLayout(gridaBagLayoutOrderByTipoUbicacionNegocio);
			
			
			this.jTableDatosTipoUbicacionNegocioOrderBy = new JTableMe();        
			this.jTableDatosTipoUbicacionNegocioOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoUbicacionNegocioOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoUbicacionNegocioOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoUbicacionNegocioOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoUbicacionNegocioOrderBy.setViewportView(this.jTableDatosTipoUbicacionNegocioOrderBy);
			this.jTableDatosTipoUbicacionNegocioOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoUbicacionNegocioOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoUbicacionNegocio= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoUbicacionNegocio= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoUbicacionNegocio = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoUbicacionNegocio= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoUbicacionNegocio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoUbicacionNegocio.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoUbicacionNegocio.setTitle("Orden");
			this.jInternalFrameOrderByTipoUbicacionNegocio.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoUbicacionNegocio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoUbicacionNegocio.setResizable(true);
			this.jInternalFrameOrderByTipoUbicacionNegocio.setClosable(true);
			this.jInternalFrameOrderByTipoUbicacionNegocio.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoUbicacionNegocio.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoUbicacionNegocio.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoUbicacionNegocio.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoUbicacionNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Ubicacion Negocios"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			this.gridBagConstraintsTipoUbicacionNegocio.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoUbicacionNegocio.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoUbicacionNegocio.ipady =150;
				
			this.jPanelOrderByTipoUbicacionNegocio.add(jScrollPanelDatosTipoUbicacionNegocioOrderBy, this.gridBagConstraintsTipoUbicacionNegocio);//this.jTableDatosTipoUbicacionNegocioTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoUbicacionNegocio = new JButtonMe();
			this.jButtonCerrarOrderByTipoUbicacionNegocio.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoUbicacionNegocio,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoUbicacionNegocio.setToolTipText("Cancelar"+" "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoUbicacionNegocio.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoUbicacionNegocio.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoUbicacionNegocio.add(this.jButtonCerrarOrderByTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoUbicacionNegocio = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoUbicacionNegocio= new JScrollPane(jPanelOrderByTipoUbicacionNegocio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			this.gridBagConstraintsTipoUbicacionNegocio.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoUbicacionNegocio.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoUbicacionNegocio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoUbicacionNegocio.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoUbicacionNegocio);
			
			this.jInternalFrameOrderByTipoUbicacionNegocio.getContentPane().add(this.jScrollPanelOrderByTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);			
		
		} else {
			this.jButtonAbrirOrderByTipoUbicacionNegocio = new JButtonMe();
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
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipoubicacionnegocioSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoUbicacionNegocio.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoUbicacionNegocio.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoUbicacionNegocio.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoUbicacionNegocio.getRowHeight();//TipoUbicacionNegocioConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoUbicacionNegocioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoUbicacionNegocio.isSelected()) {
					iHeightTable=TipoUbicacionNegocioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoUbicacionNegocioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoUbicacionNegocioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoUbicacionNegocioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoUbicacionNegocio.isSelected()) {
					iHeightTable=TipoUbicacionNegocioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoUbicacionNegocioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoUbicacionNegocioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoUbicacionNegocio.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoUbicacionNegocio.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoUbicacionNegocio.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoUbicacionNegocio.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoUbicacionNegocio.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoUbicacionNegocio.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoUbicacionNegocio!=null && this.jInternalFrameOrderByTipoUbicacionNegocio.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoUbicacionNegocio.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoUbicacionNegocio.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoUbicacionNegocio.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoUbicacionNegocio.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoUbicacionNegocio.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoUbicacionNegocio.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoUbicacionNegocio.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoUbicacionNegocio.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoUbicacionNegocio.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoUbicacionNegocio.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoubicacionnegocioLogic.getTipoUbicacionNegocios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoubicacionnegocios.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoUbicacionNegocio> TraerTipoUbicacionNegocioBeans(List<TipoUbicacionNegocio> tipoubicacionnegocios,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoUbicacionNegocio tipoubicacionnegocio:tipoubicacionnegocios) {
					
				if(!(TipoUbicacionNegocioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoUbicacionNegocioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoubicacionnegocio.setsDetalleGeneralEntityReporte(TipoUbicacionNegocioConstantesFunciones.getTipoUbicacionNegocioDescripcion(tipoubicacionnegocio));
										
						
					
						
					
				} else  {
							
					//tipoubicacionnegocio.setsDetalleGeneralEntityReporte(tipoubicacionnegocio.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoubicacionnegociobeans.add(tipoubicacionnegociobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoubicacionnegocios;
    }
	//PARA REPORTES FIN
}
