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
import com.bydan.erp.contabilidad.util.TipoFlujoEfectivoConstantesFunciones;

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
public class TipoFlujoEfectivoJInternalFrame extends TipoFlujoEfectivoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoFlujoEfectivo;
	
	protected JMenuBar jmenuBarTipoFlujoEfectivo;
	
	protected JMenu jmenuTipoFlujoEfectivo;
	protected JMenu jmenuDatosTipoFlujoEfectivo;
	protected JMenu jmenuArchivoTipoFlujoEfectivo;
	protected JMenu jmenuAccionesTipoFlujoEfectivo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoFlujoEfectivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoFlujoEfectivo;	
	protected GridBagConstraints gridBagConstraintsTipoFlujoEfectivo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoFlujoEfectivoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoFlujoEfectivo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoFlujoEfectivo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoFlujoEfectivo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoFlujoEfectivoSessionBean tipoflujoefectivoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoFlujoEfectivo> tipoflujoefectivos;		
	public List<TipoFlujoEfectivo> tipoflujoefectivosEliminados;	
	public List<TipoFlujoEfectivo> tipoflujoefectivosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoFlujoEfectivo;		
	protected JButton jButtonAbrirOrderByTipoFlujoEfectivo;
	
	
	//protected JPanel jPanelOrderByTipoFlujoEfectivo;
	//public JScrollPane jScrollPanelOrderByTipoFlujoEfectivo;	
	//protected JButton jButtonCerrarOrderByTipoFlujoEfectivo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoFlujoEfectivoLogic tipoflujoefectivoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoFlujoEfectivo;
	public JScrollPane jScrollPanelDatosEdicionTipoFlujoEfectivo;
	public JScrollPane jScrollPanelDatosGeneralTipoFlujoEfectivo;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoFlujoEfectivoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoFlujoEfectivo;
	//public JScrollPane jScrollPanelImportacionTipoFlujoEfectivo;
	
	
	
	protected JPanel jPanelAccionesTipoFlujoEfectivo;
	
    protected JPanel jPanelPaginacionTipoFlujoEfectivo;
    protected JPanel jPanelParametrosReportesTipoFlujoEfectivo;
	protected JPanel jPanelParametrosReportesAccionesTipoFlujoEfectivo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoFlujoEfectivo;
	protected JPanel jPanelParametrosAuxiliar2TipoFlujoEfectivo;
	protected JPanel jPanelParametrosAuxiliar3TipoFlujoEfectivo;
	protected JPanel jPanelParametrosAuxiliar4TipoFlujoEfectivo;
	//protected JPanel jPanelParametrosAuxiliar5TipoFlujoEfectivo;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoFlujoEfectivo;
	//protected JPanel jPanelImportacionTipoFlujoEfectivo;
	
	
	public JTable jTableDatosTipoFlujoEfectivo;
	
	
	
	//public JTable jTableDatosTipoFlujoEfectivoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoFlujoEfectivo;
	protected JButton jButtonDuplicarTipoFlujoEfectivo;
	protected JButton jButtonCopiarTipoFlujoEfectivo;
	protected JButton jButtonVerFormTipoFlujoEfectivo;
	protected JButton jButtonNuevoRelacionesTipoFlujoEfectivo;
	protected JButton jButtonModificarTipoFlujoEfectivo;
	
    protected JButton jButtonGuardarCambiosTablaTipoFlujoEfectivo;
	protected JButton jButtonCerrarTipoFlujoEfectivo;
	
	
	protected JButton jButtonRecargarInformacionTipoFlujoEfectivo;
	protected JButton jButtonProcesarInformacionTipoFlujoEfectivo;
	
	
	protected JButton jButtonAnterioresTipoFlujoEfectivo;
	protected JButton jButtonSiguientesTipoFlujoEfectivo;
	protected JButton jButtonNuevoGuardarCambiosTipoFlujoEfectivo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoFlujoEfectivo;
	//protected JButton jButtonCerrarReporteDinamicoTipoFlujoEfectivo;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoFlujoEfectivo;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoFlujoEfectivo;
	//protected JButton jButtonGenerarImportacionTipoFlujoEfectivo;
	//protected JButton jButtonCerrarImportacionTipoFlujoEfectivo;
	//protected JFileChooser jFileChooserImportacionTipoFlujoEfectivo;
	//protected File fileImportacionTipoFlujoEfectivo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoFlujoEfectivo;
	protected JButton jButtonDuplicarToolBarTipoFlujoEfectivo;
	protected JButton jButtonNuevoRelacionesToolBarTipoFlujoEfectivo;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoFlujoEfectivo;
	protected JButton jButtonCopiarToolBarTipoFlujoEfectivo;
	protected JButton jButtonVerFormToolBarTipoFlujoEfectivo;
	public JButton jButtonGuardarCambiosTablaToolBarTipoFlujoEfectivo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoFlujoEfectivo;
	protected JButton jButtonCerrarToolBarTipoFlujoEfectivo;
	
	protected JButton jButtonRecargarInformacionToolBarTipoFlujoEfectivo;
	protected JButton jButtonProcesarInformacionToolBarTipoFlujoEfectivo;
	protected JButton jButtonAnterioresToolBarTipoFlujoEfectivo;
	protected JButton jButtonSiguientesToolBarTipoFlujoEfectivo;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoFlujoEfectivo;
	protected JButton jButtonAbrirOrderByToolBarTipoFlujoEfectivo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoFlujoEfectivo;
	protected JMenuItem jMenuItemDuplicarTipoFlujoEfectivo;
	protected JMenuItem jMenuItemNuevoRelacionesTipoFlujoEfectivo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoFlujoEfectivo;
	protected JMenuItem jMenuItemCopiarTipoFlujoEfectivo;
	protected JMenuItem jMenuItemVerFormTipoFlujoEfectivo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoFlujoEfectivo;
	protected JMenuItem jMenuItemCerrarTipoFlujoEfectivo;
	protected JMenuItem jMenuItemDetalleCerrarTipoFlujoEfectivo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoFlujoEfectivo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoFlujoEfectivo;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoFlujoEfectivo;
	protected JMenuItem jMenuItemProcesarInformacionTipoFlujoEfectivo;
	protected JMenuItem jMenuItemAnterioresTipoFlujoEfectivo;
	protected JMenuItem jMenuItemSiguientesTipoFlujoEfectivo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoFlujoEfectivo;
	protected JMenuItem jMenuItemAbrirOrderByTipoFlujoEfectivo;
	protected JMenuItem jMenuItemMostrarOcultarTipoFlujoEfectivo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoFlujoEfectivo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoFlujoEfectivo;
	protected JCheckBox jCheckBoxSeleccionadosTipoFlujoEfectivo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoFlujoEfectivo;
	protected JCheckBox jCheckBoxConGraficoReporteTipoFlujoEfectivo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoFlujoEfectivo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoFlujoEfectivo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoFlujoEfectivo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoFlujoEfectivo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoFlujoEfectivo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoFlujoEfectivo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoFlujoEfectivo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoFlujoEfectivo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoFlujoEfectivo;
	protected JTextField jTextFieldValorCampoGeneralTipoFlujoEfectivo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoFlujoEfectivo;
	//public JList<Reporte> jListColumnasSelectReporteTipoFlujoEfectivo;
	//public JScrollPane jScrollColumnasSelectReporteTipoFlujoEfectivo;
	
	//public JLabel jLabelRelacionesSelectReporteTipoFlujoEfectivo;
	//public JList<Reporte> jListRelacionesSelectReporteTipoFlujoEfectivo;
	//public JScrollPane jScrollRelacionesSelectReporteTipoFlujoEfectivo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoFlujoEfectivo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoFlujoEfectivo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoFlujoEfectivo;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoFlujoEfectivo;
	
		
	//public JLabel jLabelArchivoImportacionTipoFlujoEfectivo;	
	//public JLabel jLabelPathArchivoImportacionTipoFlujoEfectivo;
	//protected JTextField jTextFieldPathArchivoImportacionTipoFlujoEfectivo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoFlujoEfectivo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoFlujoEfectivo;
	
	//public JLabel jLabelColumnaCategoriaValorTipoFlujoEfectivo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoFlujoEfectivo;
	
	//public JLabel jLabelColumnasValoresGraficoTipoFlujoEfectivo;
	//public JList<Reporte> jListColumnasValoresGraficoTipoFlujoEfectivo;
	//public JScrollPane jScrollColumnasValoresGraficoTipoFlujoEfectivo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoFlujoEfectivo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoFlujoEfectivo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoFlujoEfectivo;
	public JPanel jPanelBusquedaPorNombreTipoFlujoEfectivo;
	public JButton jButtonBusquedaPorNombreTipoFlujoEfectivo;
	
	public JPanel jPanelnombreBusquedaPorNombreTipoFlujoEfectivo;
	public JLabel jLabelnombreBusquedaPorNombreTipoFlujoEfectivo;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoFlujoEfectivo;
	public JButton jButtonnombreBusquedaPorNombreTipoFlujoEfectivoBusqueda= new JButtonMe();

	
	
	
	
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
	public TipoFlujoEfectivoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoFlujoEfectivo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFlujoEfectivoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFlujoEfectivo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFlujoEfectivoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFlujoEfectivo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFlujoEfectivoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoFlujoEfectivo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoFlujoEfectivo)	{
		this.jButtonRecargarInformacionTipoFlujoEfectivo = jButtonRecargarInformacionTipoFlujoEfectivo;
	}
	
	public JButton getjButtonProcesarInformacionTipoFlujoEfectivo() {
		return this.jButtonProcesarInformacionTipoFlujoEfectivo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoFlujoEfectivo)	{
		this.jButtonProcesarInformacionTipoFlujoEfectivo = jButtonProcesarInformacionTipoFlujoEfectivo;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoFlujoEfectivo() {
		return this.jButtonRecargarInformacionTipoFlujoEfectivo;
	}
	
	
	public List<TipoFlujoEfectivo> gettipoflujoefectivos() {
		return this.tipoflujoefectivos;
	}

	public void settipoflujoefectivos(List<TipoFlujoEfectivo> tipoflujoefectivos) {
		this.tipoflujoefectivos = tipoflujoefectivos;
	}
	
	public List<TipoFlujoEfectivo> gettipoflujoefectivosAux() {
		return this.tipoflujoefectivosAux;
	}

	public void settipoflujoefectivosAux(List<TipoFlujoEfectivo> tipoflujoefectivosAux) {
		this.tipoflujoefectivosAux = tipoflujoefectivosAux;
	}
	
	public List<TipoFlujoEfectivo> gettipoflujoefectivosEliminados() {
		return this.tipoflujoefectivosEliminados;
	}

	public void setTipoFlujoEfectivosEliminados(List<TipoFlujoEfectivo> tipoflujoefectivosEliminados) {
		this.tipoflujoefectivosEliminados = tipoflujoefectivosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoFlujoEfectivo() {
		return jComboBoxTiposSeleccionarTipoFlujoEfectivo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoFlujoEfectivo(
			JComboBox jComboBoxTiposSeleccionarTipoFlujoEfectivo) {
		this.jComboBoxTiposSeleccionarTipoFlujoEfectivo = jComboBoxTiposSeleccionarTipoFlujoEfectivo;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoFlujoEfectivo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoFlujoEfectivo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoFlujoEfectivo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoFlujoEfectivo() {
		return jTextFieldValorCampoGeneralTipoFlujoEfectivo;
	}

	public void setjTextFieldValorCampoGeneralTipoFlujoEfectivo(
			JTextField jTextFieldValorCampoGeneralTipoFlujoEfectivo) {
		this.jTextFieldValorCampoGeneralTipoFlujoEfectivo = jTextFieldValorCampoGeneralTipoFlujoEfectivo;
	}

	public void setBorderResaltarValorCampoGeneralTipoFlujoEfectivo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFlujoEfectivo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoFlujoEfectivo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoFlujoEfectivo() {
		return this.jCheckBoxSeleccionarTodosTipoFlujoEfectivo;
	}

	public void setjCheckBoxSeleccionarTodosTipoFlujoEfectivo(
			JCheckBox jCheckBoxSeleccionarTodosTipoFlujoEfectivo) {
		this.jCheckBoxSeleccionarTodosTipoFlujoEfectivo = jCheckBoxSeleccionarTodosTipoFlujoEfectivo;
	}

	public void setBorderResaltarSeleccionarTodosTipoFlujoEfectivo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFlujoEfectivo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoFlujoEfectivo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoFlujoEfectivo() {
		return this.jCheckBoxSeleccionadosTipoFlujoEfectivo;
	}

	public void setjCheckBoxSeleccionadosTipoFlujoEfectivo(
			JCheckBox jCheckBoxSeleccionadosTipoFlujoEfectivo) {
		this.jCheckBoxSeleccionadosTipoFlujoEfectivo = jCheckBoxSeleccionadosTipoFlujoEfectivo;
	}
	
	public void setBorderResaltarSeleccionadosTipoFlujoEfectivo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFlujoEfectivo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoFlujoEfectivo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoFlujoEfectivo() {
		return this.jComboBoxTiposArchivosReportesTipoFlujoEfectivo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoFlujoEfectivo(
			JComboBox jComboBoxTiposArchivosReportesTipoFlujoEfectivo) {
		this.jComboBoxTiposArchivosReportesTipoFlujoEfectivo = jComboBoxTiposArchivosReportesTipoFlujoEfectivo;
	}

	public void setBorderResaltarTiposArchivosReportesTipoFlujoEfectivo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFlujoEfectivo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoFlujoEfectivo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoFlujoEfectivo() {
		return this.jComboBoxTiposReportesTipoFlujoEfectivo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoFlujoEfectivo(
			JComboBox jComboBoxTiposReportesTipoFlujoEfectivo) {
		this.jComboBoxTiposReportesTipoFlujoEfectivo = jComboBoxTiposReportesTipoFlujoEfectivo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoFlujoEfectivo() {
	//	return jComboBoxTiposReportesDinamicoTipoFlujoEfectivo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoFlujoEfectivo(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoFlujoEfectivo) {
	//	this.jComboBoxTiposReportesDinamicoTipoFlujoEfectivo = jComboBoxTiposReportesDinamicoTipoFlujoEfectivo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoFlujoEfectivo() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoFlujoEfectivo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoFlujoEfectivo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoFlujoEfectivo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoFlujoEfectivo = jComboBoxTiposArchivosReportesDinamicoTipoFlujoEfectivo;
	//}
	
	public void setBorderResaltarTiposReportesTipoFlujoEfectivo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFlujoEfectivo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoFlujoEfectivo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoFlujoEfectivo() {
		return this.jComboBoxTiposGraficosReportesTipoFlujoEfectivo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoFlujoEfectivo(
			JComboBox jComboBoxTiposGraficosReportesTipoFlujoEfectivo) {
		this.jComboBoxTiposGraficosReportesTipoFlujoEfectivo = jComboBoxTiposGraficosReportesTipoFlujoEfectivo;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoFlujoEfectivo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFlujoEfectivo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoFlujoEfectivo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoFlujoEfectivo() {
		return this.jComboBoxTiposPaginacionTipoFlujoEfectivo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoFlujoEfectivo(
			JComboBox jComboBoxTiposPaginacionTipoFlujoEfectivo) {
		this.jComboBoxTiposPaginacionTipoFlujoEfectivo = jComboBoxTiposPaginacionTipoFlujoEfectivo;
	}
	
	public void setBorderResaltarTiposPaginacionTipoFlujoEfectivo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFlujoEfectivo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoFlujoEfectivo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoFlujoEfectivo() {
		return this.jComboBoxTiposRelacionesTipoFlujoEfectivo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoFlujoEfectivo() {
		return this.jComboBoxTiposAccionesTipoFlujoEfectivo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoFlujoEfectivo(
			JComboBox jComboBoxTiposRelacionesTipoFlujoEfectivo) {
		this.jComboBoxTiposRelacionesTipoFlujoEfectivo = jComboBoxTiposRelacionesTipoFlujoEfectivo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoFlujoEfectivo(
			JComboBox jComboBoxTiposAccionesTipoFlujoEfectivo) {
		this.jComboBoxTiposAccionesTipoFlujoEfectivo = jComboBoxTiposAccionesTipoFlujoEfectivo;
	}
	
	public void setBorderResaltarTiposRelacionesTipoFlujoEfectivo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFlujoEfectivo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoFlujoEfectivo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoFlujoEfectivo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFlujoEfectivo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoFlujoEfectivo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoFlujoEfectivo() {
	//	return jCheckBoxConGraficoDinamicoTipoFlujoEfectivo;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoFlujoEfectivo(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoFlujoEfectivo) {
	//	this.jCheckBoxConGraficoDinamicoTipoFlujoEfectivo = jCheckBoxConGraficoDinamicoTipoFlujoEfectivo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoFlujoEfectivo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoFlujoEfectivo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoFlujoEfectivo .setBorder(borderResaltar);		
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
		this.tipoflujoefectivoSessionBean=new TipoFlujoEfectivoSessionBean();
		
		this.tipoflujoefectivoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoflujoefectivoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoFlujoEfectivoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoFlujoEfectivoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoFlujoEfectivoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoFlujoEfectivoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoFlujoEfectivoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Flujo Efectivo  MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoFlujoEfectivoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoFlujoEfectivo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoFlujoEfectivo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoFlujoEfectivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoFlujoEfectivo,this.jTtoolBarTipoFlujoEfectivo,
							"nuevo","nuevo","Nuevo"+" "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoFlujoEfectivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoFlujoEfectivo,this.jTtoolBarTipoFlujoEfectivo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoFlujoEfectivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoFlujoEfectivo,this.jTtoolBarTipoFlujoEfectivo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoFlujoEfectivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoFlujoEfectivo,this.jTtoolBarTipoFlujoEfectivo,
							"duplicar","duplicar","Duplicar"+" "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoFlujoEfectivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoFlujoEfectivo,this.jTtoolBarTipoFlujoEfectivo,
							"copiar","copiar","Copiar"+" "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoFlujoEfectivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoFlujoEfectivo,this.jTtoolBarTipoFlujoEfectivo,
							"ver_form","ver_form","Ver"+" "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoFlujoEfectivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoFlujoEfectivo,this.jTtoolBarTipoFlujoEfectivo,
							"recargar","recargar","Recargar"+" "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoFlujoEfectivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoFlujoEfectivo,this.jTtoolBarTipoFlujoEfectivo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoFlujoEfectivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoFlujoEfectivo,this.jTtoolBarTipoFlujoEfectivo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoFlujoEfectivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoFlujoEfectivo,this.jTtoolBarTipoFlujoEfectivo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoFlujoEfectivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoFlujoEfectivo,this.jTtoolBarTipoFlujoEfectivo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoFlujoEfectivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoFlujoEfectivo,this.jTtoolBarTipoFlujoEfectivo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoFlujoEfectivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoFlujoEfectivo,this.jTtoolBarTipoFlujoEfectivo,
							"cerrar","cerrar","Salir"+" "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoFlujoEfectivo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoFlujoEfectivo;
			
				this.jButtonProcesarInformacionToolBarTipoFlujoEfectivo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoFlujoEfectivo;
				
		//protected JButton jButtonModificarToolBarTipoFlujoEfectivo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoFlujoEfectivo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoFlujoEfectivo=new JMenuMe("General");
		this.jmenuArchivoTipoFlujoEfectivo=new JMenuMe("Archivo");
		this.jmenuAccionesTipoFlujoEfectivo=new JMenuMe("Acciones");
		this.jmenuDatosTipoFlujoEfectivo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoFlujoEfectivo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoFlujoEfectivo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoFlujoEfectivo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoFlujoEfectivo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoFlujoEfectivo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoFlujoEfectivo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoFlujoEfectivo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoFlujoEfectivo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoFlujoEfectivo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoFlujoEfectivo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoFlujoEfectivo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoFlujoEfectivo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoFlujoEfectivo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoFlujoEfectivo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoFlujoEfectivo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoFlujoEfectivo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoFlujoEfectivo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoFlujoEfectivo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoFlujoEfectivo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoFlujoEfectivo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoFlujoEfectivo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoFlujoEfectivo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoFlujoEfectivo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoFlujoEfectivo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoFlujoEfectivo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoFlujoEfectivo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoFlujoEfectivo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoFlujoEfectivo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoFlujoEfectivo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoFlujoEfectivo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoFlujoEfectivo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoFlujoEfectivo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoFlujoEfectivo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoFlujoEfectivo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoFlujoEfectivo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoFlujoEfectivo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoFlujoEfectivo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoFlujoEfectivo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoFlujoEfectivo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoFlujoEfectivo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoFlujoEfectivo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoFlujoEfectivo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoFlujoEfectivo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoFlujoEfectivo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoFlujoEfectivo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoFlujoEfectivo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoFlujoEfectivo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoFlujoEfectivo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoFlujoEfectivo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoFlujoEfectivo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoFlujoEfectivo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoFlujoEfectivo.add(this.jMenuItemCerrarTipoFlujoEfectivo);
			
			this.jmenuAccionesTipoFlujoEfectivo.add(this.jMenuItemNuevoTipoFlujoEfectivo);
			this.jmenuAccionesTipoFlujoEfectivo.add(this.jMenuItemNuevoGuardarCambiosTipoFlujoEfectivo);
			this.jmenuAccionesTipoFlujoEfectivo.add(this.jMenuItemNuevoRelacionesTipoFlujoEfectivo);
			this.jmenuAccionesTipoFlujoEfectivo.add(this.jMenuItemGuardarCambiosTablaTipoFlujoEfectivo);		
			this.jmenuAccionesTipoFlujoEfectivo.add(this.jMenuItemDuplicarTipoFlujoEfectivo);		
			this.jmenuAccionesTipoFlujoEfectivo.add(this.jMenuItemCopiarTipoFlujoEfectivo);		
			this.jmenuAccionesTipoFlujoEfectivo.add(this.jMenuItemVerFormTipoFlujoEfectivo);		
			
			this.jmenuDatosTipoFlujoEfectivo.add(this.jMenuItemRecargarInformacionTipoFlujoEfectivo);				
			this.jmenuDatosTipoFlujoEfectivo.add(this.jMenuItemAnterioresTipoFlujoEfectivo);				
			this.jmenuDatosTipoFlujoEfectivo.add(this.jMenuItemSiguientesTipoFlujoEfectivo);				
			this.jmenuDatosTipoFlujoEfectivo.add(this.jMenuItemAbrirOrderByTipoFlujoEfectivo);				
			this.jmenuDatosTipoFlujoEfectivo.add(this.jMenuItemMostrarOcultarTipoFlujoEfectivo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoFlujoEfectivo.add(this.jMenuItemGuardarCambiosTipoFlujoEfectivo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoFlujoEfectivo.add(this.jmenuArchivoTipoFlujoEfectivo);		
			this.jmenuBarTipoFlujoEfectivo.add(this.jmenuAccionesTipoFlujoEfectivo);		
			this.jmenuBarTipoFlujoEfectivo.add(this.jmenuDatosTipoFlujoEfectivo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoFlujoEfectivo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoFlujoEfectivo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombreTipoFlujoEfectivo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoFlujoEfectivo.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoFlujoEfectivo= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoFlujoEfectivo.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoFlujoEfectivo.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoFlujoEfectivo,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoFlujoEfectivo = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoFlujoEfectivo.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoFlujoEfectivo.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoFlujoEfectivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoFlujoEfectivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoFlujoEfectivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoFlujoEfectivo,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoFlujoEfectivo= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoFlujoEfectivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoFlujoEfectivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoFlujoEfectivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoFlujoEfectivo,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoFlujoEfectivo=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoFlujoEfectivo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoFlujoEfectivo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoFlujoEfectivo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoFlujoEfectivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoFlujoEfectivo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoFlujoEfectivo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoFlujoEfectivo = new TipoFlujoEfectivoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Flujo Efectivo  DATOS");
			this.jInternalFrameDetalleFormTipoFlujoEfectivo = new TipoFlujoEfectivoDetalleFormJInternalFrame(jDesktopPane,this.tipoflujoefectivoSessionBean.getConGuardarRelaciones(),this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoFlujoEfectivo = null;//new TipoFlujoEfectivoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoFlujoEfectivo= new GridBagLayout();
		
		
		this.jTableDatosTipoFlujoEfectivo = new JTableMe();      
		
		String sToolTipTipoFlujoEfectivo="";
		sToolTipTipoFlujoEfectivo=TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoFlujoEfectivo+="(Contabilidad.TipoFlujoEfectivo)";
		}
		
		if(!this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoFlujoEfectivo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoFlujoEfectivo.setToolTipText(sToolTipTipoFlujoEfectivo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoFlujoEfectivo);
		this.jTableDatosTipoFlujoEfectivo.setAutoCreateRowSorter(true);
		this.jTableDatosTipoFlujoEfectivo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoFlujoEfectivo.setRowSelectionAllowed(true);
		this.jTableDatosTipoFlujoEfectivo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoFlujoEfectivo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoFlujoEfectivo = new JButtonMe();
		this.jButtonDuplicarTipoFlujoEfectivo = new JButtonMe();
		this.jButtonCopiarTipoFlujoEfectivo = new JButtonMe();
		this.jButtonVerFormTipoFlujoEfectivo = new JButtonMe();
		this.jButtonNuevoRelacionesTipoFlujoEfectivo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoFlujoEfectivo = new JButtonMe();
		this.jButtonCerrarTipoFlujoEfectivo = new JButtonMe();
		
		this.jScrollPanelDatosTipoFlujoEfectivo = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoFlujoEfectivo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoFlujoEfectivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Flujo Efectivo ";
		
		if(!this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoFlujoEfectivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Flujo Efectivo s" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoFlujoEfectivo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoFlujoEfectivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoFlujoEfectivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoFlujoEfectivo.setToolTipText("Acciones");
        this.jPanelAccionesTipoFlujoEfectivo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoFlujoEfectivo=new ReporteDinamicoJInternalFrame(TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoFlujoEfectivo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoFlujoEfectivo=new ImportacionJInternalFrame(TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoFlujoEfectivo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoFlujoEfectivo = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoFlujoEfectivo.setText("Orden");
		this.jButtonAbrirOrderByTipoFlujoEfectivo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoFlujoEfectivo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoFlujoEfectivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoFlujoEfectivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoFlujoEfectivo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFlujoEfectivo,false,this);
			
			//this.cargarOrderByTipoFlujoEfectivo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoFlujoEfectivo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFlujoEfectivo,true,this);
			
			//this.cargarOrderByTipoFlujoEfectivo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoFlujoEfectivo.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosTipoFlujoEfectivo.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosTipoFlujoEfectivo.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosTipoFlujoEfectivo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoFlujoEfectivo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoFlujoEfectivo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoFlujoEfectivo.setText("Nuevo");
		this.jButtonDuplicarTipoFlujoEfectivo.setText("Duplicar");
		this.jButtonCopiarTipoFlujoEfectivo.setText("Copiar");
		this.jButtonVerFormTipoFlujoEfectivo.setText("Ver");
		this.jButtonNuevoRelacionesTipoFlujoEfectivo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoFlujoEfectivo.setText("Guardar");
		this.jButtonCerrarTipoFlujoEfectivo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoFlujoEfectivo,"nuevo_button","Nuevo",this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoFlujoEfectivo,"duplicar_button","Duplicar",this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoFlujoEfectivo,"copiar_button","Copiar",this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoFlujoEfectivo,"ver_form","Ver",this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoFlujoEfectivo,"nuevorelaciones_button","Nuevo Rel",this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoFlujoEfectivo,"guardarcambiostabla_button","Guardar",this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoFlujoEfectivo,"cerrar_button","Salir",this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoFlujoEfectivo.setToolTipText("Nuevo"+" "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoFlujoEfectivo.setToolTipText("Duplicar"+" "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoFlujoEfectivo.setToolTipText("Copiar"+" "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoFlujoEfectivo.setToolTipText("Ver"+" "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoFlujoEfectivo.setToolTipText("Nuevo Rel"+" "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoFlujoEfectivo.setToolTipText("Guardar"+" "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoFlujoEfectivo.setToolTipText("Salir"+" "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoFlujoEfectivo";
		inputMap = this.jButtonNuevoTipoFlujoEfectivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoFlujoEfectivo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoFlujoEfectivo"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoFlujoEfectivo";
		inputMap = this.jButtonDuplicarTipoFlujoEfectivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoFlujoEfectivo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoFlujoEfectivo"));
		
		//COPIAR
		sMapKey = "CopiarTipoFlujoEfectivo";
		inputMap = this.jButtonCopiarTipoFlujoEfectivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoFlujoEfectivo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoFlujoEfectivo"));
		
		//VEr FORM
		sMapKey = "VerFormTipoFlujoEfectivo";
		inputMap = this.jButtonVerFormTipoFlujoEfectivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoFlujoEfectivo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoFlujoEfectivo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoFlujoEfectivo";
		inputMap = this.jButtonNuevoRelacionesTipoFlujoEfectivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoFlujoEfectivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoFlujoEfectivo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoFlujoEfectivo";
		inputMap = this.jButtonModificarTipoFlujoEfectivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoFlujoEfectivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoFlujoEfectivo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoFlujoEfectivo";
		inputMap = this.jButtonCerrarTipoFlujoEfectivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoFlujoEfectivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoFlujoEfectivo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoFlujoEfectivo";
		inputMap = this.jButtonGuardarCambiosTablaTipoFlujoEfectivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoFlujoEfectivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoFlujoEfectivo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoFlujoEfectivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoFlujoEfectivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoFlujoEfectivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoFlujoEfectivo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoFlujoEfectivo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoFlujoEfectivo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoFlujoEfectivo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoFlujoEfectivo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoFlujoEfectivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoFlujoEfectivo.setName("jPanelParametrosReportesTipoFlujoEfectivo"); 
		
		this.jPanelParametrosReportesAccionesTipoFlujoEfectivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoFlujoEfectivo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoFlujoEfectivo.setName("jPanelParametrosReportesAccionesTipoFlujoEfectivo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoFlujoEfectivo = new JButtonMe();
		this.jButtonRecargarInformacionTipoFlujoEfectivo.setText("Recargar");
		this.jButtonRecargarInformacionTipoFlujoEfectivo.setToolTipText("Recargar"+" "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoFlujoEfectivo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoFlujoEfectivo = new JButtonMe();
		this.jButtonProcesarInformacionTipoFlujoEfectivo.setText("Procesar");
		this.jButtonProcesarInformacionTipoFlujoEfectivo.setToolTipText("Procesar"+" "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoFlujoEfectivo.setVisible(false);
			
		this.jButtonProcesarInformacionTipoFlujoEfectivo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoFlujoEfectivo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoFlujoEfectivo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoFlujoEfectivo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoFlujoEfectivo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoFlujoEfectivo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoFlujoEfectivo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoFlujoEfectivo.setText("TIPO");       
		this.jComboBoxTiposReportesTipoFlujoEfectivo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoFlujoEfectivo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoFlujoEfectivo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoFlujoEfectivo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoFlujoEfectivo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoFlujoEfectivo.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoFlujoEfectivo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoFlujoEfectivo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoFlujoEfectivo.setText("Accion");
		this.jComboBoxTiposRelacionesTipoFlujoEfectivo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoFlujoEfectivo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoFlujoEfectivo.setText("Accion");
		this.jComboBoxTiposAccionesTipoFlujoEfectivo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoFlujoEfectivo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoFlujoEfectivo.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoFlujoEfectivo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoFlujoEfectivo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoFlujoEfectivo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoFlujoEfectivo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoFlujoEfectivo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoFlujoEfectivo = new JLabelMe();
		
		this.jLabelAccionesTipoFlujoEfectivo.setText("Acciones");		
		this.jLabelAccionesTipoFlujoEfectivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFlujoEfectivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFlujoEfectivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoFlujoEfectivo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoFlujoEfectivo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoFlujoEfectivo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoFlujoEfectivo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoFlujoEfectivo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoFlujoEfectivo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoFlujoEfectivo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoFlujoEfectivo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoFlujoEfectivo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoFlujoEfectivo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoFlujoEfectivo.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoFlujoEfectivo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoFlujoEfectivo = new JButtonMe();
		//this.jButtonAnterioresTipoFlujoEfectivo.setText("<<");
        this.jButtonAnterioresTipoFlujoEfectivo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoFlujoEfectivo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoFlujoEfectivo = new JButtonMe();
		//this.jButtonSiguientesTipoFlujoEfectivo.setText(">>");
        this.jButtonSiguientesTipoFlujoEfectivo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoFlujoEfectivo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoFlujoEfectivo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoFlujoEfectivo.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoFlujoEfectivo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoFlujoEfectivo,"nuevoguardarcambios_button","Nue",this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoFlujoEfectivo";
		inputMap = this.jButtonNuevoGuardarCambiosTipoFlujoEfectivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoFlujoEfectivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoFlujoEfectivo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoFlujoEfectivo";
		inputMap = this.jButtonRecargarInformacionTipoFlujoEfectivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoFlujoEfectivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoFlujoEfectivo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoFlujoEfectivo";
		inputMap = this.jButtonSiguientesTipoFlujoEfectivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoFlujoEfectivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoFlujoEfectivo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoFlujoEfectivo";
		inputMap = this.jButtonAnterioresTipoFlujoEfectivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoFlujoEfectivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoFlujoEfectivo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoFlujoEfectivo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoFlujoEfectivo.setMinimumSize(new Dimension(this.getWidth(),TipoFlujoEfectivoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoFlujoEfectivoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoFlujoEfectivo.setMaximumSize(new Dimension(this.getWidth(),TipoFlujoEfectivoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoFlujoEfectivoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoFlujoEfectivo.setPreferredSize(new Dimension(this.getWidth(),TipoFlujoEfectivoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoFlujoEfectivoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoFlujoEfectivo = new GridBagLayout();

			this.jPanelPaginacionTipoFlujoEfectivo.setLayout(gridaBagLayoutPaginacionTipoFlujoEfectivo);						
			
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			this.gridBagConstraintsTipoFlujoEfectivo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFlujoEfectivo.gridy = 0;
			this.gridBagConstraintsTipoFlujoEfectivo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoFlujoEfectivo.add(this.jButtonAnterioresTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
					
						
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			this.gridBagConstraintsTipoFlujoEfectivo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoFlujoEfectivo.gridy = 0;
			
			this.jPanelPaginacionTipoFlujoEfectivo.add(this.jButtonNuevoGuardarCambiosTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
						
			
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			this.gridBagConstraintsTipoFlujoEfectivo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoFlujoEfectivo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoFlujoEfectivo.gridy = 0;
			this.jPanelPaginacionTipoFlujoEfectivo.add(this.jButtonSiguientesTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFlujoEfectivo.gridy = 1;
			this.gridBagConstraintsTipoFlujoEfectivo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFlujoEfectivo.add(this.jButtonNuevoTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
				this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoFlujoEfectivo.gridy = 1;
				this.gridBagConstraintsTipoFlujoEfectivo.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoFlujoEfectivo.add(this.jButtonNuevoRelacionesTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
			}
			
			
			if(!this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
				this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoFlujoEfectivo.gridy = 1;
				this.gridBagConstraintsTipoFlujoEfectivo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoFlujoEfectivo.add(this.jButtonGuardarCambiosTablaTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
			}
			
			
			
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFlujoEfectivo.gridy = 1;
			this.gridBagConstraintsTipoFlujoEfectivo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFlujoEfectivo.add(this.jButtonDuplicarTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
			
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFlujoEfectivo.gridy = 1;
			this.gridBagConstraintsTipoFlujoEfectivo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFlujoEfectivo.add(this.jButtonCopiarTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
		
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFlujoEfectivo.gridy = 1;
			this.gridBagConstraintsTipoFlujoEfectivo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFlujoEfectivo.add(this.jButtonVerFormTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
		
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFlujoEfectivo.gridy = 1;
			this.gridBagConstraintsTipoFlujoEfectivo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoFlujoEfectivo.add(this.jButtonCerrarTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
		
		
		
		this.jButtonRecargarInformacionTipoFlujoEfectivo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoFlujoEfectivo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoFlujoEfectivo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoFlujoEfectivo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoFlujoEfectivo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoFlujoEfectivo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoFlujoEfectivo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoFlujoEfectivo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoFlujoEfectivo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoFlujoEfectivo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoFlujoEfectivo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoFlujoEfectivo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoFlujoEfectivo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoFlujoEfectivo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoFlujoEfectivo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoFlujoEfectivo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoFlujoEfectivo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoFlujoEfectivo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoFlujoEfectivo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFlujoEfectivo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFlujoEfectivo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoFlujoEfectivo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoFlujoEfectivo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoFlujoEfectivo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoFlujoEfectivo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoFlujoEfectivo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoFlujoEfectivo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoFlujoEfectivo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoFlujoEfectivo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoFlujoEfectivo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoFlujoEfectivo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoFlujoEfectivo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoFlujoEfectivo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoFlujoEfectivo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoFlujoEfectivo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoFlujoEfectivo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoFlujoEfectivo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoFlujoEfectivo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoFlujoEfectivo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoFlujoEfectivo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoFlujoEfectivo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoFlujoEfectivo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoFlujoEfectivo.setLayout(gridaBagParametrosReportesTipoFlujoEfectivo);
			this.jPanelParametrosReportesAccionesTipoFlujoEfectivo.setLayout(gridaBagParametrosReportesAccionesTipoFlujoEfectivo);
			
			
			this.jPanelParametrosAuxiliar1TipoFlujoEfectivo.setLayout(gridaBagParametrosAuxiliar1TipoFlujoEfectivo);
			this.jPanelParametrosAuxiliar2TipoFlujoEfectivo.setLayout(gridaBagParametrosAuxiliar2TipoFlujoEfectivo);
			this.jPanelParametrosAuxiliar3TipoFlujoEfectivo.setLayout(gridaBagParametrosAuxiliar3TipoFlujoEfectivo);
			this.jPanelParametrosAuxiliar4TipoFlujoEfectivo.setLayout(gridaBagParametrosAuxiliar4TipoFlujoEfectivo);
			//this.jPanelParametrosAuxiliar5TipoFlujoEfectivo.setLayout(gridaBagParametrosAuxiliar2TipoFlujoEfectivo);			
			
			
			
			
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoFlujoEfectivo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFlujoEfectivo.add(this.jButtonRecargarInformacionTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			this.gridBagConstraintsTipoFlujoEfectivo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFlujoEfectivo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoFlujoEfectivo.add(this.jComboBoxTiposPaginacionTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			this.gridBagConstraintsTipoFlujoEfectivo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFlujoEfectivo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoFlujoEfectivo.add(this.jCheckBoxConAltoMaximoTablaTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			this.gridBagConstraintsTipoFlujoEfectivo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFlujoEfectivo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoFlujoEfectivo.add(this.jComboBoxTiposArchivosReportesTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			this.gridBagConstraintsTipoFlujoEfectivo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFlujoEfectivo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFlujoEfectivo.add(this.jPanelParametrosAuxiliar1TipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			this.gridBagConstraintsTipoFlujoEfectivo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFlujoEfectivo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoFlujoEfectivo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoFlujoEfectivo.add(this.jComboBoxTiposReportesTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			this.gridBagConstraintsTipoFlujoEfectivo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFlujoEfectivo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFlujoEfectivo.add(this.jPanelParametrosAuxiliar4TipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			this.gridBagConstraintsTipoFlujoEfectivo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFlujoEfectivo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFlujoEfectivo.add(this.jComboBoxTiposReportesTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			this.gridBagConstraintsTipoFlujoEfectivo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFlujoEfectivo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoFlujoEfectivo.add(this.jCheckBoxGenerarReporteTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			this.gridBagConstraintsTipoFlujoEfectivo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFlujoEfectivo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFlujoEfectivo.add(this.jPanelParametrosAuxiliar2TipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoFlujoEfectivo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoFlujoEfectivo.add(this.jLabelAccionesTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
				this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoFlujoEfectivo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoFlujoEfectivo.add(this.jButtonAbrirOrderByTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFlujoEfectivo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFlujoEfectivo.add(this.jComboBoxTiposSeleccionarTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);			
			
			
			/*
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoFlujoEfectivo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoFlujoEfectivo.add(this.jCheckBoxSeleccionarTodosTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			this.gridBagConstraintsTipoFlujoEfectivo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFlujoEfectivo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoFlujoEfectivo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoFlujoEfectivo.add(this.jCheckBoxSeleccionarTodosTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);															
				
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			this.gridBagConstraintsTipoFlujoEfectivo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFlujoEfectivo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoFlujoEfectivo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoFlujoEfectivo.add(this.jCheckBoxSeleccionadosTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			this.gridBagConstraintsTipoFlujoEfectivo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFlujoEfectivo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFlujoEfectivo.add(this.jPanelParametrosAuxiliar3TipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFlujoEfectivo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFlujoEfectivo.add(this.jComboBoxTiposRelacionesTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
				
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFlujoEfectivo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFlujoEfectivo.add(this.jComboBoxTiposAccionesTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
	
				
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFlujoEfectivo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFlujoEfectivo.add(this.jTextFieldValorCampoGeneralTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoFlujoEfectivo = new GridBagLayout();

			this.jScrollPanelDatosTipoFlujoEfectivo.setLayout(gridaBagLayoutDatosTipoFlujoEfectivo);
			
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFlujoEfectivo.gridy = 0;
			this.gridBagConstraintsTipoFlujoEfectivo.gridx = 0;
			
			this.jScrollPanelDatosTipoFlujoEfectivo.add(this.jTableDatosTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoFlujoEfectivo.setViewportView(this.jTableDatosTipoFlujoEfectivo);
		this.jTableDatosTipoFlujoEfectivo.setFillsViewportHeight(true);
		this.jTableDatosTipoFlujoEfectivo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoFlujoEfectivo= new GridBagLayout();
		this.jPanelAccionesTipoFlujoEfectivo.setLayout(gridaBagLayoutAccionesTipoFlujoEfectivo);
		
		
		/*	
		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFlujoEfectivo.gridy = 0;
		this.gridBagConstraintsTipoFlujoEfectivo.gridx = 0;
			
		this.jPanelAccionesTipoFlujoEfectivo.add(this.jButtonNuevoTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoFlujoEfectivo= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoFlujoEfectivo.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoFlujoEfectivo.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoFlujoEfectivo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoFlujoEfectivo.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoFlujoEfectivo.setLayout(gridaBagLayoutBusquedaPorNombreTipoFlujoEfectivo);

		gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		gridBagConstraintsTipoFlujoEfectivo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoFlujoEfectivo.gridy = 0;
		gridBagConstraintsTipoFlujoEfectivo.gridx = 0;
		jPanelBusquedaPorNombreTipoFlujoEfectivo.add(jLabelnombreBusquedaPorNombreTipoFlujoEfectivo, gridBagConstraintsTipoFlujoEfectivo);

		gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		gridBagConstraintsTipoFlujoEfectivo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoFlujoEfectivo.gridy = 0;
		gridBagConstraintsTipoFlujoEfectivo.gridx = 1;
		jPanelBusquedaPorNombreTipoFlujoEfectivo.add(jTextAreanombreBusquedaPorNombreTipoFlujoEfectivo, gridBagConstraintsTipoFlujoEfectivo);

		gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		gridBagConstraintsTipoFlujoEfectivo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoFlujoEfectivo.gridy = 1;
		gridBagConstraintsTipoFlujoEfectivo.gridx =1;
		jPanelBusquedaPorNombreTipoFlujoEfectivo.add(jButtonBusquedaPorNombreTipoFlujoEfectivo, gridBagConstraintsTipoFlujoEfectivo);

		jTabbedPaneBusquedasTipoFlujoEfectivo.addTab("1.-Por Nombre ", jPanelBusquedaPorNombreTipoFlujoEfectivo);
		jTabbedPaneBusquedasTipoFlujoEfectivo.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoFlujoEfectivo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoFlujoEfectivo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();						
			this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoFlujoEfectivo.gridx = 0;		
			//this.gridBagConstraintsTipoFlujoEfectivo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFlujoEfectivo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoFlujoEfectivo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoFlujoEfectivo.gridx = 0;		
		//this.gridBagConstraintsTipoFlujoEfectivo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFlujoEfectivo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoFlujoEfectivo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoFlujoEfectivo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoFlujoEfectivo.gridx = 0;		
			this.gridBagConstraintsTipoFlujoEfectivo.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFlujoEfectivo.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoFlujoEfectivo.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFlujoEfectivo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);								
		
		
		/*
		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFlujoEfectivo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
		*/		
		
		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoFlujoEfectivo.gridx =0;
		this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoFlujoEfectivo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
				
		
		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFlujoEfectivo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoFlujoEfectivoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoFlujoEfectivo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoFlujoEfectivo = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoFlujoEfectivo.setLayout(gridaBagLayoutBusquedasParametrosTipoFlujoEfectivo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoFlujoEfectivo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoFlujoEfectivo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFlujoEfectivo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFlujoEfectivo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFlujoEfectivo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
			
			
		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFlujoEfectivo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
		
			
		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoFlujoEfectivo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoFlujoEfectivo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoFlujoEfectivo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoFlujoEfectivo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoFlujoEfectivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoFlujoEfectivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoFlujoEfectivo.setName("jPanelReporteDinamicoTipoFlujoEfectivo"); 
		
		this.jPanelReporteDinamicoTipoFlujoEfectivo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoFlujoEfectivo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoFlujoEfectivo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoFlujoEfectivo.setLayout(gridaBagLayoutReporteDinamicoTipoFlujoEfectivo);
		
		
		this.jInternalFrameReporteDinamicoTipoFlujoEfectivo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoFlujoEfectivo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoFlujoEfectivo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoFlujoEfectivo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoFlujoEfectivo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoFlujoEfectivo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoFlujoEfectivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Flujo Efectivo s"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoFlujoEfectivo = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoFlujoEfectivo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoFlujoEfectivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoFlujoEfectivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoFlujoEfectivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFlujoEfectivo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFlujoEfectivo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoFlujoEfectivo.add(this.jLabelColumnasSelectReporteTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoFlujoEfectivo = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoFlujoEfectivo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoFlujoEfectivo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoFlujoEfectivo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoFlujoEfectivo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoFlujoEfectivo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoFlujoEfectivo=new JScrollPane(this.jListColumnasSelectReporteTipoFlujoEfectivo);
			
			this.jScrollColumnasSelectReporteTipoFlujoEfectivo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoFlujoEfectivo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoFlujoEfectivo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoFlujoEfectivo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFlujoEfectivo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFlujoEfectivo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoFlujoEfectivo.add(this.jListColumnasSelectReporteTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
		this.jPanelReporteDinamicoTipoFlujoEfectivo.add(this.jScrollColumnasSelectReporteTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoFlujoEfectivo = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoFlujoEfectivo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoFlujoEfectivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoFlujoEfectivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoFlujoEfectivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFlujoEfectivo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFlujoEfectivo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoFlujoEfectivo.add(this.jLabelRelacionesSelectReporteTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoFlujoEfectivo = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoFlujoEfectivo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoFlujoEfectivo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoFlujoEfectivo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoFlujoEfectivo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoFlujoEfectivo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoFlujoEfectivo=new JScrollPane(this.jListRelacionesSelectReporteTipoFlujoEfectivo);
			
			this.jScrollRelacionesSelectReporteTipoFlujoEfectivo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoFlujoEfectivo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoFlujoEfectivo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoFlujoEfectivo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFlujoEfectivo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFlujoEfectivo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoFlujoEfectivo.add(this.jListRelacionesSelectReporteTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
		this.jPanelReporteDinamicoTipoFlujoEfectivo.add(this.jScrollRelacionesSelectReporteTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoFlujoEfectivo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoFlujoEfectivo = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoFlujoEfectivo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoFlujoEfectivo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoFlujoEfectivo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoFlujoEfectivo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoFlujoEfectivo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoFlujoEfectivo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoFlujoEfectivo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoFlujoEfectivo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoFlujoEfectivo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoFlujoEfectivo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoFlujoEfectivo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoFlujoEfectivo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoFlujoEfectivo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoFlujoEfectivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoFlujoEfectivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoFlujoEfectivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFlujoEfectivo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFlujoEfectivo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoFlujoEfectivo.add(this.jLabelGenerarExcelReporteDinamicoTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoFlujoEfectivo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoFlujoEfectivo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoFlujoEfectivo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoFlujoEfectivo.setToolTipText("Generar EXCEL"+" "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		//this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoFlujoEfectivo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoFlujoEfectivo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoFlujoEfectivo.add(this.jButtonGenerarExcelReporteDinamicoTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFlujoEfectivo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFlujoEfectivo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFlujoEfectivo.add(this.jComboBoxTiposReportesDinamicoTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoFlujoEfectivo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoFlujoEfectivo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoFlujoEfectivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoFlujoEfectivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoFlujoEfectivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFlujoEfectivo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFlujoEfectivo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoFlujoEfectivo.add(this.jLabelTiposArchivoReporteDinamicoTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFlujoEfectivo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFlujoEfectivo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFlujoEfectivo.add(this.jComboBoxTiposArchivosReportesDinamicoTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoFlujoEfectivo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoFlujoEfectivo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoFlujoEfectivo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoFlujoEfectivo.setToolTipText("Generar"+" "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFlujoEfectivo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFlujoEfectivo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFlujoEfectivo.add(this.jButtonGenerarReporteDinamicoTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoFlujoEfectivo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoFlujoEfectivo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoFlujoEfectivo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoFlujoEfectivo.setToolTipText("Cancelar"+" "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFlujoEfectivo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFlujoEfectivo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFlujoEfectivo.add(this.jButtonCerrarReporteDinamicoTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoFlujoEfectivo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoFlujoEfectivo= new JScrollPane(jPanelReporteDinamicoTipoFlujoEfectivo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoFlujoEfectivo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoFlujoEfectivo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoFlujoEfectivo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoFlujoEfectivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Flujo Efectivo s"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoFlujoEfectivo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoFlujoEfectivo);
		this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.getContentPane().add(this.jScrollPanelReporteDinamicoTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoFlujoEfectivo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoFlujoEfectivo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoFlujoEfectivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoFlujoEfectivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoFlujoEfectivo.setName("jPanelImportacionTipoFlujoEfectivo"); 
		
		this.jPanelImportacionTipoFlujoEfectivo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoFlujoEfectivo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoFlujoEfectivo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoFlujoEfectivo.setLayout(gridaBagLayoutImportacionTipoFlujoEfectivo);
		
		
		this.jInternalFrameImportacionTipoFlujoEfectivo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoFlujoEfectivo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoFlujoEfectivo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoFlujoEfectivo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoFlujoEfectivo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoFlujoEfectivo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoFlujoEfectivo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoFlujoEfectivo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoFlujoEfectivo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoFlujoEfectivo.setResizable(true);
	    this.jInternalFrameImportacionTipoFlujoEfectivo.setClosable(true);
	    this.jInternalFrameImportacionTipoFlujoEfectivo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoFlujoEfectivo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoFlujoEfectivo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoFlujoEfectivo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoFlujoEfectivo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoFlujoEfectivo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoFlujoEfectivo.setResizable(true);
	    this.jInternalFrameImportacionTipoFlujoEfectivo.setClosable(true);
	    this.jInternalFrameImportacionTipoFlujoEfectivo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoFlujoEfectivo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoFlujoEfectivo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoFlujoEfectivo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoFlujoEfectivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Flujo Efectivo s"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoFlujoEfectivo = new JLabelMe();

		this.jLabelArchivoImportacionTipoFlujoEfectivo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoFlujoEfectivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoFlujoEfectivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoFlujoEfectivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFlujoEfectivo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoFlujoEfectivo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoFlujoEfectivo.add(this.jLabelArchivoImportacionTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoFlujoEfectivo = new JFileChooser();		
		this.jFileChooserImportacionTipoFlujoEfectivo.setToolTipText("ESCOGER ARCHIVO"+" "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoFlujoEfectivo = new JButtonMe();
		this.jButtonAbrirImportacionTipoFlujoEfectivo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoFlujoEfectivo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoFlujoEfectivo.setToolTipText("Generar"+" "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFlujoEfectivo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFlujoEfectivo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFlujoEfectivo.add(this.jButtonAbrirImportacionTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoFlujoEfectivo = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoFlujoEfectivo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoFlujoEfectivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoFlujoEfectivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoFlujoEfectivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFlujoEfectivo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoFlujoEfectivo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoFlujoEfectivo.add(this.jLabelPathArchivoImportacionTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoFlujoEfectivo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoFlujoEfectivo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoFlujoEfectivo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoFlujoEfectivo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFlujoEfectivo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFlujoEfectivo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFlujoEfectivo.add(this.jTextFieldPathArchivoImportacionTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoFlujoEfectivo = new JButtonMe();
		this.jButtonGenerarImportacionTipoFlujoEfectivo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoFlujoEfectivo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoFlujoEfectivo.setToolTipText("Generar"+" "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFlujoEfectivo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFlujoEfectivo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFlujoEfectivo.add(this.jButtonGenerarImportacionTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoFlujoEfectivo = new JButtonMe();
		this.jButtonCerrarImportacionTipoFlujoEfectivo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoFlujoEfectivo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoFlujoEfectivo.setToolTipText("Cancelar"+" "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFlujoEfectivo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFlujoEfectivo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFlujoEfectivo.add(this.jButtonCerrarImportacionTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoFlujoEfectivo = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoFlujoEfectivo= new JScrollPane(jPanelImportacionTipoFlujoEfectivo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoFlujoEfectivo.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoFlujoEfectivo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoFlujoEfectivo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoFlujoEfectivo);
		this.jInternalFrameImportacionTipoFlujoEfectivo.getContentPane().add(this.jScrollPanelImportacionTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoFlujoEfectivo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoFlujoEfectivo = new JButtonMe();
			this.jButtonAbrirOrderByTipoFlujoEfectivo.setText("Orden");
			this.jButtonAbrirOrderByTipoFlujoEfectivo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoFlujoEfectivo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoFlujoEfectivo";
			inputMap = this.jButtonAbrirOrderByTipoFlujoEfectivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoFlujoEfectivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoFlujoEfectivo"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoFlujoEfectivo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoFlujoEfectivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoFlujoEfectivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoFlujoEfectivo.setName("jPanelOrderByTipoFlujoEfectivo"); 
			
			this.jPanelOrderByTipoFlujoEfectivo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoFlujoEfectivo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoFlujoEfectivo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoFlujoEfectivo.setLayout(gridaBagLayoutOrderByTipoFlujoEfectivo);
			
			
			this.jTableDatosTipoFlujoEfectivoOrderBy = new JTableMe();        
			this.jTableDatosTipoFlujoEfectivoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoFlujoEfectivoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoFlujoEfectivoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoFlujoEfectivoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoFlujoEfectivoOrderBy.setViewportView(this.jTableDatosTipoFlujoEfectivoOrderBy);
			this.jTableDatosTipoFlujoEfectivoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoFlujoEfectivoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoFlujoEfectivo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoFlujoEfectivo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoFlujoEfectivo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoFlujoEfectivo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoFlujoEfectivo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoFlujoEfectivo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoFlujoEfectivo.setTitle("Orden");
			this.jInternalFrameOrderByTipoFlujoEfectivo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoFlujoEfectivo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoFlujoEfectivo.setResizable(true);
			this.jInternalFrameOrderByTipoFlujoEfectivo.setClosable(true);
			this.jInternalFrameOrderByTipoFlujoEfectivo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoFlujoEfectivo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoFlujoEfectivo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoFlujoEfectivo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoFlujoEfectivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Flujo Efectivo s"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			this.gridBagConstraintsTipoFlujoEfectivo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoFlujoEfectivo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoFlujoEfectivo.ipady =150;
				
			this.jPanelOrderByTipoFlujoEfectivo.add(jScrollPanelDatosTipoFlujoEfectivoOrderBy, this.gridBagConstraintsTipoFlujoEfectivo);//this.jTableDatosTipoFlujoEfectivoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoFlujoEfectivo = new JButtonMe();
			this.jButtonCerrarOrderByTipoFlujoEfectivo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoFlujoEfectivo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoFlujoEfectivo.setToolTipText("Cancelar"+" "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFlujoEfectivo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoFlujoEfectivo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoFlujoEfectivo.add(this.jButtonCerrarOrderByTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoFlujoEfectivo = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoFlujoEfectivo= new JScrollPane(jPanelOrderByTipoFlujoEfectivo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			this.gridBagConstraintsTipoFlujoEfectivo.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoFlujoEfectivo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoFlujoEfectivo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoFlujoEfectivo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoFlujoEfectivo);
			
			this.jInternalFrameOrderByTipoFlujoEfectivo.getContentPane().add(this.jScrollPanelOrderByTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);			
		
		} else {
			this.jButtonAbrirOrderByTipoFlujoEfectivo = new JButtonMe();
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
		int iWidthTableCalculado=0;//730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipoflujoefectivoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoFlujoEfectivo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoFlujoEfectivo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoFlujoEfectivo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoFlujoEfectivo.getRowHeight();//TipoFlujoEfectivoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoFlujoEfectivoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoFlujoEfectivo.isSelected()) {
					iHeightTable=TipoFlujoEfectivoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoFlujoEfectivoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoFlujoEfectivoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoFlujoEfectivoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoFlujoEfectivo.isSelected()) {
					iHeightTable=TipoFlujoEfectivoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoFlujoEfectivoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoFlujoEfectivoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoFlujoEfectivo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoFlujoEfectivo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoFlujoEfectivo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoFlujoEfectivo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoFlujoEfectivo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoFlujoEfectivo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoFlujoEfectivo!=null && this.jInternalFrameOrderByTipoFlujoEfectivo.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoFlujoEfectivo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoFlujoEfectivo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoFlujoEfectivo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoFlujoEfectivo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoFlujoEfectivo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoFlujoEfectivo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoFlujoEfectivo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoFlujoEfectivo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoFlujoEfectivo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoFlujoEfectivo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoflujoefectivoLogic.getTipoFlujoEfectivos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoflujoefectivos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoFlujoEfectivo> TraerTipoFlujoEfectivoBeans(List<TipoFlujoEfectivo> tipoflujoefectivos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoFlujoEfectivo tipoflujoefectivo:tipoflujoefectivos) {
					
				if(!(TipoFlujoEfectivoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoFlujoEfectivoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoflujoefectivo.setsDetalleGeneralEntityReporte(TipoFlujoEfectivoConstantesFunciones.getTipoFlujoEfectivoDescripcion(tipoflujoefectivo));
										
						
					
					

					if(tipoflujoefectivo.getCuentaContables()!=null && Funciones.existeClass(classes,CuentaContable.class)) {
						try{tipoflujoefectivo.setcuentacontablesDescripcionReporte(new JRBeanCollectionDataSource(CuentaContableJInternalFrame.TraerCuentaContableBeans(tipoflujoefectivo.getCuentaContables(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipoflujoefectivo.setsDetalleGeneralEntityReporte(tipoflujoefectivo.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoflujoefectivobeans.add(tipoflujoefectivobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoflujoefectivos;
    }
	//PARA REPORTES FIN
}
