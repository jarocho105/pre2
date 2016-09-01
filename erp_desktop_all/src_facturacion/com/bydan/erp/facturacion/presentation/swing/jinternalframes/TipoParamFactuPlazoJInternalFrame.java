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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;



import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.TipoParamFactuPlazoConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class TipoParamFactuPlazoJInternalFrame extends TipoParamFactuPlazoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoParamFactuPlazo;
	
	protected JMenuBar jmenuBarTipoParamFactuPlazo;
	
	protected JMenu jmenuTipoParamFactuPlazo;
	protected JMenu jmenuDatosTipoParamFactuPlazo;
	protected JMenu jmenuArchivoTipoParamFactuPlazo;
	protected JMenu jmenuAccionesTipoParamFactuPlazo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoParamFactuPlazo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoParamFactuPlazo;	
	protected GridBagConstraints gridBagConstraintsTipoParamFactuPlazo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoParamFactuPlazoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoParamFactuPlazo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoParamFactuPlazo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoParamFactuPlazo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoParamFactuPlazoSessionBean tipoparamfactuplazoSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoParamFactuPlazo> tipoparamfactuplazos;		
	public List<TipoParamFactuPlazo> tipoparamfactuplazosEliminados;	
	public List<TipoParamFactuPlazo> tipoparamfactuplazosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoParamFactuPlazo;		
	protected JButton jButtonAbrirOrderByTipoParamFactuPlazo;
	
	
	//protected JPanel jPanelOrderByTipoParamFactuPlazo;
	//public JScrollPane jScrollPanelOrderByTipoParamFactuPlazo;	
	//protected JButton jButtonCerrarOrderByTipoParamFactuPlazo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoParamFactuPlazoLogic tipoparamfactuplazoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoParamFactuPlazo;
	public JScrollPane jScrollPanelDatosEdicionTipoParamFactuPlazo;
	public JScrollPane jScrollPanelDatosGeneralTipoParamFactuPlazo;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoParamFactuPlazoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoParamFactuPlazo;
	//public JScrollPane jScrollPanelImportacionTipoParamFactuPlazo;
	
	
	
	protected JPanel jPanelAccionesTipoParamFactuPlazo;
	
    protected JPanel jPanelPaginacionTipoParamFactuPlazo;
    protected JPanel jPanelParametrosReportesTipoParamFactuPlazo;
	protected JPanel jPanelParametrosReportesAccionesTipoParamFactuPlazo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoParamFactuPlazo;
	protected JPanel jPanelParametrosAuxiliar2TipoParamFactuPlazo;
	protected JPanel jPanelParametrosAuxiliar3TipoParamFactuPlazo;
	protected JPanel jPanelParametrosAuxiliar4TipoParamFactuPlazo;
	//protected JPanel jPanelParametrosAuxiliar5TipoParamFactuPlazo;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoParamFactuPlazo;
	//protected JPanel jPanelImportacionTipoParamFactuPlazo;
	
	
	public JTable jTableDatosTipoParamFactuPlazo;
	
	
	
	//public JTable jTableDatosTipoParamFactuPlazoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoParamFactuPlazo;
	protected JButton jButtonDuplicarTipoParamFactuPlazo;
	protected JButton jButtonCopiarTipoParamFactuPlazo;
	protected JButton jButtonVerFormTipoParamFactuPlazo;
	protected JButton jButtonNuevoRelacionesTipoParamFactuPlazo;
	protected JButton jButtonModificarTipoParamFactuPlazo;
	
    protected JButton jButtonGuardarCambiosTablaTipoParamFactuPlazo;
	protected JButton jButtonCerrarTipoParamFactuPlazo;
	
	
	protected JButton jButtonRecargarInformacionTipoParamFactuPlazo;
	protected JButton jButtonProcesarInformacionTipoParamFactuPlazo;
	
	
	protected JButton jButtonAnterioresTipoParamFactuPlazo;
	protected JButton jButtonSiguientesTipoParamFactuPlazo;
	protected JButton jButtonNuevoGuardarCambiosTipoParamFactuPlazo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoParamFactuPlazo;
	//protected JButton jButtonCerrarReporteDinamicoTipoParamFactuPlazo;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoParamFactuPlazo;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoParamFactuPlazo;
	//protected JButton jButtonGenerarImportacionTipoParamFactuPlazo;
	//protected JButton jButtonCerrarImportacionTipoParamFactuPlazo;
	//protected JFileChooser jFileChooserImportacionTipoParamFactuPlazo;
	//protected File fileImportacionTipoParamFactuPlazo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoParamFactuPlazo;
	protected JButton jButtonDuplicarToolBarTipoParamFactuPlazo;
	protected JButton jButtonNuevoRelacionesToolBarTipoParamFactuPlazo;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoParamFactuPlazo;
	protected JButton jButtonCopiarToolBarTipoParamFactuPlazo;
	protected JButton jButtonVerFormToolBarTipoParamFactuPlazo;
	public JButton jButtonGuardarCambiosTablaToolBarTipoParamFactuPlazo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoParamFactuPlazo;
	protected JButton jButtonCerrarToolBarTipoParamFactuPlazo;
	
	protected JButton jButtonRecargarInformacionToolBarTipoParamFactuPlazo;
	protected JButton jButtonProcesarInformacionToolBarTipoParamFactuPlazo;
	protected JButton jButtonAnterioresToolBarTipoParamFactuPlazo;
	protected JButton jButtonSiguientesToolBarTipoParamFactuPlazo;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoParamFactuPlazo;
	protected JButton jButtonAbrirOrderByToolBarTipoParamFactuPlazo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoParamFactuPlazo;
	protected JMenuItem jMenuItemDuplicarTipoParamFactuPlazo;
	protected JMenuItem jMenuItemNuevoRelacionesTipoParamFactuPlazo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoParamFactuPlazo;
	protected JMenuItem jMenuItemCopiarTipoParamFactuPlazo;
	protected JMenuItem jMenuItemVerFormTipoParamFactuPlazo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoParamFactuPlazo;
	protected JMenuItem jMenuItemCerrarTipoParamFactuPlazo;
	protected JMenuItem jMenuItemDetalleCerrarTipoParamFactuPlazo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoParamFactuPlazo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoParamFactuPlazo;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoParamFactuPlazo;
	protected JMenuItem jMenuItemProcesarInformacionTipoParamFactuPlazo;
	protected JMenuItem jMenuItemAnterioresTipoParamFactuPlazo;
	protected JMenuItem jMenuItemSiguientesTipoParamFactuPlazo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoParamFactuPlazo;
	protected JMenuItem jMenuItemAbrirOrderByTipoParamFactuPlazo;
	protected JMenuItem jMenuItemMostrarOcultarTipoParamFactuPlazo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoParamFactuPlazo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoParamFactuPlazo;
	protected JCheckBox jCheckBoxSeleccionadosTipoParamFactuPlazo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoParamFactuPlazo;
	protected JCheckBox jCheckBoxConGraficoReporteTipoParamFactuPlazo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoParamFactuPlazo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoParamFactuPlazo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoParamFactuPlazo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoParamFactuPlazo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoParamFactuPlazo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoParamFactuPlazo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoParamFactuPlazo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoParamFactuPlazo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoParamFactuPlazo;
	protected JTextField jTextFieldValorCampoGeneralTipoParamFactuPlazo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoParamFactuPlazo;
	//public JList<Reporte> jListColumnasSelectReporteTipoParamFactuPlazo;
	//public JScrollPane jScrollColumnasSelectReporteTipoParamFactuPlazo;
	
	//public JLabel jLabelRelacionesSelectReporteTipoParamFactuPlazo;
	//public JList<Reporte> jListRelacionesSelectReporteTipoParamFactuPlazo;
	//public JScrollPane jScrollRelacionesSelectReporteTipoParamFactuPlazo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoParamFactuPlazo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoParamFactuPlazo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoParamFactuPlazo;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoParamFactuPlazo;
	
		
	//public JLabel jLabelArchivoImportacionTipoParamFactuPlazo;	
	//public JLabel jLabelPathArchivoImportacionTipoParamFactuPlazo;
	//protected JTextField jTextFieldPathArchivoImportacionTipoParamFactuPlazo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoParamFactuPlazo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoParamFactuPlazo;
	
	//public JLabel jLabelColumnaCategoriaValorTipoParamFactuPlazo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoParamFactuPlazo;
	
	//public JLabel jLabelColumnasValoresGraficoTipoParamFactuPlazo;
	//public JList<Reporte> jListColumnasValoresGraficoTipoParamFactuPlazo;
	//public JScrollPane jScrollColumnasValoresGraficoTipoParamFactuPlazo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoParamFactuPlazo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoParamFactuPlazo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoParamFactuPlazo;
	public JPanel jPanelBusquedaPorNombreTipoParamFactuPlazo;
	public JButton jButtonBusquedaPorNombreTipoParamFactuPlazo;
	
	public JPanel jPanelnombreBusquedaPorNombreTipoParamFactuPlazo;
	public JLabel jLabelnombreBusquedaPorNombreTipoParamFactuPlazo;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoParamFactuPlazo;
	public JButton jButtonnombreBusquedaPorNombreTipoParamFactuPlazoBusqueda= new JButtonMe();

	
	
	
	
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
	public TipoParamFactuPlazoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoParamFactuPlazo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParamFactuPlazoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoParamFactuPlazo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParamFactuPlazoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoParamFactuPlazo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParamFactuPlazoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoParamFactuPlazo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoParamFactuPlazo)	{
		this.jButtonRecargarInformacionTipoParamFactuPlazo = jButtonRecargarInformacionTipoParamFactuPlazo;
	}
	
	public JButton getjButtonProcesarInformacionTipoParamFactuPlazo() {
		return this.jButtonProcesarInformacionTipoParamFactuPlazo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoParamFactuPlazo)	{
		this.jButtonProcesarInformacionTipoParamFactuPlazo = jButtonProcesarInformacionTipoParamFactuPlazo;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoParamFactuPlazo() {
		return this.jButtonRecargarInformacionTipoParamFactuPlazo;
	}
	
	
	public List<TipoParamFactuPlazo> gettipoparamfactuplazos() {
		return this.tipoparamfactuplazos;
	}

	public void settipoparamfactuplazos(List<TipoParamFactuPlazo> tipoparamfactuplazos) {
		this.tipoparamfactuplazos = tipoparamfactuplazos;
	}
	
	public List<TipoParamFactuPlazo> gettipoparamfactuplazosAux() {
		return this.tipoparamfactuplazosAux;
	}

	public void settipoparamfactuplazosAux(List<TipoParamFactuPlazo> tipoparamfactuplazosAux) {
		this.tipoparamfactuplazosAux = tipoparamfactuplazosAux;
	}
	
	public List<TipoParamFactuPlazo> gettipoparamfactuplazosEliminados() {
		return this.tipoparamfactuplazosEliminados;
	}

	public void setTipoParamFactuPlazosEliminados(List<TipoParamFactuPlazo> tipoparamfactuplazosEliminados) {
		this.tipoparamfactuplazosEliminados = tipoparamfactuplazosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoParamFactuPlazo() {
		return jComboBoxTiposSeleccionarTipoParamFactuPlazo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoParamFactuPlazo(
			JComboBox jComboBoxTiposSeleccionarTipoParamFactuPlazo) {
		this.jComboBoxTiposSeleccionarTipoParamFactuPlazo = jComboBoxTiposSeleccionarTipoParamFactuPlazo;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoParamFactuPlazo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoParamFactuPlazo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoParamFactuPlazo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoParamFactuPlazo() {
		return jTextFieldValorCampoGeneralTipoParamFactuPlazo;
	}

	public void setjTextFieldValorCampoGeneralTipoParamFactuPlazo(
			JTextField jTextFieldValorCampoGeneralTipoParamFactuPlazo) {
		this.jTextFieldValorCampoGeneralTipoParamFactuPlazo = jTextFieldValorCampoGeneralTipoParamFactuPlazo;
	}

	public void setBorderResaltarValorCampoGeneralTipoParamFactuPlazo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParamFactuPlazo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoParamFactuPlazo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoParamFactuPlazo() {
		return this.jCheckBoxSeleccionarTodosTipoParamFactuPlazo;
	}

	public void setjCheckBoxSeleccionarTodosTipoParamFactuPlazo(
			JCheckBox jCheckBoxSeleccionarTodosTipoParamFactuPlazo) {
		this.jCheckBoxSeleccionarTodosTipoParamFactuPlazo = jCheckBoxSeleccionarTodosTipoParamFactuPlazo;
	}

	public void setBorderResaltarSeleccionarTodosTipoParamFactuPlazo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParamFactuPlazo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoParamFactuPlazo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoParamFactuPlazo() {
		return this.jCheckBoxSeleccionadosTipoParamFactuPlazo;
	}

	public void setjCheckBoxSeleccionadosTipoParamFactuPlazo(
			JCheckBox jCheckBoxSeleccionadosTipoParamFactuPlazo) {
		this.jCheckBoxSeleccionadosTipoParamFactuPlazo = jCheckBoxSeleccionadosTipoParamFactuPlazo;
	}
	
	public void setBorderResaltarSeleccionadosTipoParamFactuPlazo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParamFactuPlazo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoParamFactuPlazo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoParamFactuPlazo() {
		return this.jComboBoxTiposArchivosReportesTipoParamFactuPlazo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoParamFactuPlazo(
			JComboBox jComboBoxTiposArchivosReportesTipoParamFactuPlazo) {
		this.jComboBoxTiposArchivosReportesTipoParamFactuPlazo = jComboBoxTiposArchivosReportesTipoParamFactuPlazo;
	}

	public void setBorderResaltarTiposArchivosReportesTipoParamFactuPlazo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParamFactuPlazo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoParamFactuPlazo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoParamFactuPlazo() {
		return this.jComboBoxTiposReportesTipoParamFactuPlazo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoParamFactuPlazo(
			JComboBox jComboBoxTiposReportesTipoParamFactuPlazo) {
		this.jComboBoxTiposReportesTipoParamFactuPlazo = jComboBoxTiposReportesTipoParamFactuPlazo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoParamFactuPlazo() {
	//	return jComboBoxTiposReportesDinamicoTipoParamFactuPlazo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoParamFactuPlazo(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoParamFactuPlazo) {
	//	this.jComboBoxTiposReportesDinamicoTipoParamFactuPlazo = jComboBoxTiposReportesDinamicoTipoParamFactuPlazo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoParamFactuPlazo() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoParamFactuPlazo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoParamFactuPlazo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoParamFactuPlazo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoParamFactuPlazo = jComboBoxTiposArchivosReportesDinamicoTipoParamFactuPlazo;
	//}
	
	public void setBorderResaltarTiposReportesTipoParamFactuPlazo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParamFactuPlazo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoParamFactuPlazo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoParamFactuPlazo() {
		return this.jComboBoxTiposGraficosReportesTipoParamFactuPlazo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoParamFactuPlazo(
			JComboBox jComboBoxTiposGraficosReportesTipoParamFactuPlazo) {
		this.jComboBoxTiposGraficosReportesTipoParamFactuPlazo = jComboBoxTiposGraficosReportesTipoParamFactuPlazo;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoParamFactuPlazo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParamFactuPlazo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoParamFactuPlazo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoParamFactuPlazo() {
		return this.jComboBoxTiposPaginacionTipoParamFactuPlazo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoParamFactuPlazo(
			JComboBox jComboBoxTiposPaginacionTipoParamFactuPlazo) {
		this.jComboBoxTiposPaginacionTipoParamFactuPlazo = jComboBoxTiposPaginacionTipoParamFactuPlazo;
	}
	
	public void setBorderResaltarTiposPaginacionTipoParamFactuPlazo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParamFactuPlazo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoParamFactuPlazo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoParamFactuPlazo() {
		return this.jComboBoxTiposRelacionesTipoParamFactuPlazo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoParamFactuPlazo() {
		return this.jComboBoxTiposAccionesTipoParamFactuPlazo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoParamFactuPlazo(
			JComboBox jComboBoxTiposRelacionesTipoParamFactuPlazo) {
		this.jComboBoxTiposRelacionesTipoParamFactuPlazo = jComboBoxTiposRelacionesTipoParamFactuPlazo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoParamFactuPlazo(
			JComboBox jComboBoxTiposAccionesTipoParamFactuPlazo) {
		this.jComboBoxTiposAccionesTipoParamFactuPlazo = jComboBoxTiposAccionesTipoParamFactuPlazo;
	}
	
	public void setBorderResaltarTiposRelacionesTipoParamFactuPlazo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParamFactuPlazo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoParamFactuPlazo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoParamFactuPlazo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParamFactuPlazo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoParamFactuPlazo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoParamFactuPlazo() {
	//	return jCheckBoxConGraficoDinamicoTipoParamFactuPlazo;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoParamFactuPlazo(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoParamFactuPlazo) {
	//	this.jCheckBoxConGraficoDinamicoTipoParamFactuPlazo = jCheckBoxConGraficoDinamicoTipoParamFactuPlazo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoParamFactuPlazo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoParamFactuPlazo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoParamFactuPlazo .setBorder(borderResaltar);		
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
		this.tipoparamfactuplazoSessionBean=new TipoParamFactuPlazoSessionBean();
		
		this.tipoparamfactuplazoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoparamfactuplazoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoParamFactuPlazoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoParamFactuPlazoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoParamFactuPlazoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoParamFactuPlazoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoParamFactuPlazoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Plazo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoParamFactuPlazoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoParamFactuPlazo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoParamFactuPlazo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoParamFactuPlazo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoParamFactuPlazo,this.jTtoolBarTipoParamFactuPlazo,
							"nuevo","nuevo","Nuevo"+" "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoParamFactuPlazo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoParamFactuPlazo,this.jTtoolBarTipoParamFactuPlazo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoParamFactuPlazo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoParamFactuPlazo,this.jTtoolBarTipoParamFactuPlazo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoParamFactuPlazo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoParamFactuPlazo,this.jTtoolBarTipoParamFactuPlazo,
							"duplicar","duplicar","Duplicar"+" "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoParamFactuPlazo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoParamFactuPlazo,this.jTtoolBarTipoParamFactuPlazo,
							"copiar","copiar","Copiar"+" "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoParamFactuPlazo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoParamFactuPlazo,this.jTtoolBarTipoParamFactuPlazo,
							"ver_form","ver_form","Ver"+" "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoParamFactuPlazo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoParamFactuPlazo,this.jTtoolBarTipoParamFactuPlazo,
							"recargar","recargar","Recargar"+" "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoParamFactuPlazo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoParamFactuPlazo,this.jTtoolBarTipoParamFactuPlazo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoParamFactuPlazo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoParamFactuPlazo,this.jTtoolBarTipoParamFactuPlazo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoParamFactuPlazo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoParamFactuPlazo,this.jTtoolBarTipoParamFactuPlazo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoParamFactuPlazo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoParamFactuPlazo,this.jTtoolBarTipoParamFactuPlazo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoParamFactuPlazo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoParamFactuPlazo,this.jTtoolBarTipoParamFactuPlazo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoParamFactuPlazo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoParamFactuPlazo,this.jTtoolBarTipoParamFactuPlazo,
							"cerrar","cerrar","Salir"+" "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoParamFactuPlazo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoParamFactuPlazo;
			
				this.jButtonProcesarInformacionToolBarTipoParamFactuPlazo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoParamFactuPlazo;
				
		//protected JButton jButtonModificarToolBarTipoParamFactuPlazo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoParamFactuPlazo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoParamFactuPlazo=new JMenuMe("General");
		this.jmenuArchivoTipoParamFactuPlazo=new JMenuMe("Archivo");
		this.jmenuAccionesTipoParamFactuPlazo=new JMenuMe("Acciones");
		this.jmenuDatosTipoParamFactuPlazo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoParamFactuPlazo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoParamFactuPlazo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoParamFactuPlazo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoParamFactuPlazo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoParamFactuPlazo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoParamFactuPlazo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoParamFactuPlazo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoParamFactuPlazo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoParamFactuPlazo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoParamFactuPlazo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoParamFactuPlazo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoParamFactuPlazo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoParamFactuPlazo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoParamFactuPlazo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoParamFactuPlazo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoParamFactuPlazo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoParamFactuPlazo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoParamFactuPlazo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoParamFactuPlazo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoParamFactuPlazo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoParamFactuPlazo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoParamFactuPlazo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoParamFactuPlazo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoParamFactuPlazo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoParamFactuPlazo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoParamFactuPlazo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoParamFactuPlazo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoParamFactuPlazo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoParamFactuPlazo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoParamFactuPlazo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoParamFactuPlazo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoParamFactuPlazo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoParamFactuPlazo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoParamFactuPlazo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoParamFactuPlazo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoParamFactuPlazo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoParamFactuPlazo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoParamFactuPlazo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoParamFactuPlazo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoParamFactuPlazo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoParamFactuPlazo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoParamFactuPlazo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoParamFactuPlazo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoParamFactuPlazo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoParamFactuPlazo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoParamFactuPlazo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoParamFactuPlazo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoParamFactuPlazo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoParamFactuPlazo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoParamFactuPlazo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoParamFactuPlazo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoParamFactuPlazo.add(this.jMenuItemCerrarTipoParamFactuPlazo);
			
			this.jmenuAccionesTipoParamFactuPlazo.add(this.jMenuItemNuevoTipoParamFactuPlazo);
			this.jmenuAccionesTipoParamFactuPlazo.add(this.jMenuItemNuevoGuardarCambiosTipoParamFactuPlazo);
			this.jmenuAccionesTipoParamFactuPlazo.add(this.jMenuItemNuevoRelacionesTipoParamFactuPlazo);
			this.jmenuAccionesTipoParamFactuPlazo.add(this.jMenuItemGuardarCambiosTablaTipoParamFactuPlazo);		
			this.jmenuAccionesTipoParamFactuPlazo.add(this.jMenuItemDuplicarTipoParamFactuPlazo);		
			this.jmenuAccionesTipoParamFactuPlazo.add(this.jMenuItemCopiarTipoParamFactuPlazo);		
			this.jmenuAccionesTipoParamFactuPlazo.add(this.jMenuItemVerFormTipoParamFactuPlazo);		
			
			this.jmenuDatosTipoParamFactuPlazo.add(this.jMenuItemRecargarInformacionTipoParamFactuPlazo);				
			this.jmenuDatosTipoParamFactuPlazo.add(this.jMenuItemAnterioresTipoParamFactuPlazo);				
			this.jmenuDatosTipoParamFactuPlazo.add(this.jMenuItemSiguientesTipoParamFactuPlazo);				
			this.jmenuDatosTipoParamFactuPlazo.add(this.jMenuItemAbrirOrderByTipoParamFactuPlazo);				
			this.jmenuDatosTipoParamFactuPlazo.add(this.jMenuItemMostrarOcultarTipoParamFactuPlazo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoParamFactuPlazo.add(this.jMenuItemGuardarCambiosTipoParamFactuPlazo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoParamFactuPlazo.add(this.jmenuArchivoTipoParamFactuPlazo);		
			this.jmenuBarTipoParamFactuPlazo.add(this.jmenuAccionesTipoParamFactuPlazo);		
			this.jmenuBarTipoParamFactuPlazo.add(this.jmenuDatosTipoParamFactuPlazo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoParamFactuPlazo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoParamFactuPlazo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombreTipoParamFactuPlazo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoParamFactuPlazo.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoParamFactuPlazo= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoParamFactuPlazo.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoParamFactuPlazo.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoParamFactuPlazo,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoParamFactuPlazo = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoParamFactuPlazo.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoParamFactuPlazo.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoParamFactuPlazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoParamFactuPlazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoParamFactuPlazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoParamFactuPlazo,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoParamFactuPlazo= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoParamFactuPlazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoParamFactuPlazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoParamFactuPlazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoParamFactuPlazo,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoParamFactuPlazo=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoParamFactuPlazo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoParamFactuPlazo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoParamFactuPlazo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoParamFactuPlazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoParamFactuPlazo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoParamFactuPlazo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoParamFactuPlazo = new TipoParamFactuPlazoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Plazo DATOS");
			this.jInternalFrameDetalleFormTipoParamFactuPlazo = new TipoParamFactuPlazoDetalleFormJInternalFrame(jDesktopPane,this.tipoparamfactuplazoSessionBean.getConGuardarRelaciones(),this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoParamFactuPlazo = null;//new TipoParamFactuPlazoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoParamFactuPlazo= new GridBagLayout();
		
		
		this.jTableDatosTipoParamFactuPlazo = new JTableMe();      
		
		String sToolTipTipoParamFactuPlazo="";
		sToolTipTipoParamFactuPlazo=TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoParamFactuPlazo+="(Facturacion.TipoParamFactuPlazo)";
		}
		
		if(!this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoParamFactuPlazo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoParamFactuPlazo.setToolTipText(sToolTipTipoParamFactuPlazo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoParamFactuPlazo);
		this.jTableDatosTipoParamFactuPlazo.setAutoCreateRowSorter(true);
		this.jTableDatosTipoParamFactuPlazo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoParamFactuPlazo.setRowSelectionAllowed(true);
		this.jTableDatosTipoParamFactuPlazo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoParamFactuPlazo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoParamFactuPlazo = new JButtonMe();
		this.jButtonDuplicarTipoParamFactuPlazo = new JButtonMe();
		this.jButtonCopiarTipoParamFactuPlazo = new JButtonMe();
		this.jButtonVerFormTipoParamFactuPlazo = new JButtonMe();
		this.jButtonNuevoRelacionesTipoParamFactuPlazo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoParamFactuPlazo = new JButtonMe();
		this.jButtonCerrarTipoParamFactuPlazo = new JButtonMe();
		
		this.jScrollPanelDatosTipoParamFactuPlazo = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoParamFactuPlazo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoParamFactuPlazo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Plazo";
		
		if(!this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoParamFactuPlazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Plazos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoParamFactuPlazo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoParamFactuPlazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoParamFactuPlazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoParamFactuPlazo.setToolTipText("Acciones");
        this.jPanelAccionesTipoParamFactuPlazo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoParamFactuPlazo=new ReporteDinamicoJInternalFrame(TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoParamFactuPlazo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoParamFactuPlazo=new ImportacionJInternalFrame(TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoParamFactuPlazo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoParamFactuPlazo = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoParamFactuPlazo.setText("Orden");
		this.jButtonAbrirOrderByTipoParamFactuPlazo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoParamFactuPlazo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoParamFactuPlazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoParamFactuPlazo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoParamFactuPlazo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoParamFactuPlazo,false,this);
			
			//this.cargarOrderByTipoParamFactuPlazo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoParamFactuPlazo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoParamFactuPlazo,true,this);
			
			//this.cargarOrderByTipoParamFactuPlazo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoParamFactuPlazo.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosTipoParamFactuPlazo.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosTipoParamFactuPlazo.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosTipoParamFactuPlazo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoParamFactuPlazo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoParamFactuPlazo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoParamFactuPlazo.setText("Nuevo");
		this.jButtonDuplicarTipoParamFactuPlazo.setText("Duplicar");
		this.jButtonCopiarTipoParamFactuPlazo.setText("Copiar");
		this.jButtonVerFormTipoParamFactuPlazo.setText("Ver");
		this.jButtonNuevoRelacionesTipoParamFactuPlazo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoParamFactuPlazo.setText("Guardar");
		this.jButtonCerrarTipoParamFactuPlazo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoParamFactuPlazo,"nuevo_button","Nuevo",this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoParamFactuPlazo,"duplicar_button","Duplicar",this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoParamFactuPlazo,"copiar_button","Copiar",this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoParamFactuPlazo,"ver_form","Ver",this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoParamFactuPlazo,"nuevorelaciones_button","Nuevo Rel",this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoParamFactuPlazo,"guardarcambiostabla_button","Guardar",this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoParamFactuPlazo,"cerrar_button","Salir",this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoParamFactuPlazo.setToolTipText("Nuevo"+" "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoParamFactuPlazo.setToolTipText("Duplicar"+" "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoParamFactuPlazo.setToolTipText("Copiar"+" "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoParamFactuPlazo.setToolTipText("Ver"+" "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoParamFactuPlazo.setToolTipText("Nuevo Rel"+" "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoParamFactuPlazo.setToolTipText("Guardar"+" "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoParamFactuPlazo.setToolTipText("Salir"+" "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoParamFactuPlazo";
		inputMap = this.jButtonNuevoTipoParamFactuPlazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoParamFactuPlazo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoParamFactuPlazo"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoParamFactuPlazo";
		inputMap = this.jButtonDuplicarTipoParamFactuPlazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoParamFactuPlazo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoParamFactuPlazo"));
		
		//COPIAR
		sMapKey = "CopiarTipoParamFactuPlazo";
		inputMap = this.jButtonCopiarTipoParamFactuPlazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoParamFactuPlazo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoParamFactuPlazo"));
		
		//VEr FORM
		sMapKey = "VerFormTipoParamFactuPlazo";
		inputMap = this.jButtonVerFormTipoParamFactuPlazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoParamFactuPlazo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoParamFactuPlazo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoParamFactuPlazo";
		inputMap = this.jButtonNuevoRelacionesTipoParamFactuPlazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoParamFactuPlazo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoParamFactuPlazo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoParamFactuPlazo";
		inputMap = this.jButtonModificarTipoParamFactuPlazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoParamFactuPlazo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoParamFactuPlazo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoParamFactuPlazo";
		inputMap = this.jButtonCerrarTipoParamFactuPlazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoParamFactuPlazo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoParamFactuPlazo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoParamFactuPlazo";
		inputMap = this.jButtonGuardarCambiosTablaTipoParamFactuPlazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoParamFactuPlazo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoParamFactuPlazo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoParamFactuPlazo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoParamFactuPlazo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoParamFactuPlazo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoParamFactuPlazo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoParamFactuPlazo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoParamFactuPlazo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoParamFactuPlazo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoParamFactuPlazo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoParamFactuPlazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoParamFactuPlazo.setName("jPanelParametrosReportesTipoParamFactuPlazo"); 
		
		this.jPanelParametrosReportesAccionesTipoParamFactuPlazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoParamFactuPlazo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoParamFactuPlazo.setName("jPanelParametrosReportesAccionesTipoParamFactuPlazo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoParamFactuPlazo = new JButtonMe();
		this.jButtonRecargarInformacionTipoParamFactuPlazo.setText("Recargar");
		this.jButtonRecargarInformacionTipoParamFactuPlazo.setToolTipText("Recargar"+" "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoParamFactuPlazo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoParamFactuPlazo = new JButtonMe();
		this.jButtonProcesarInformacionTipoParamFactuPlazo.setText("Procesar");
		this.jButtonProcesarInformacionTipoParamFactuPlazo.setToolTipText("Procesar"+" "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoParamFactuPlazo.setVisible(false);
			
		this.jButtonProcesarInformacionTipoParamFactuPlazo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoParamFactuPlazo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoParamFactuPlazo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoParamFactuPlazo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoParamFactuPlazo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoParamFactuPlazo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoParamFactuPlazo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoParamFactuPlazo.setText("TIPO");       
		this.jComboBoxTiposReportesTipoParamFactuPlazo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoParamFactuPlazo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoParamFactuPlazo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoParamFactuPlazo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoParamFactuPlazo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoParamFactuPlazo.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoParamFactuPlazo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoParamFactuPlazo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoParamFactuPlazo.setText("Accion");
		this.jComboBoxTiposRelacionesTipoParamFactuPlazo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoParamFactuPlazo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoParamFactuPlazo.setText("Accion");
		this.jComboBoxTiposAccionesTipoParamFactuPlazo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoParamFactuPlazo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoParamFactuPlazo.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoParamFactuPlazo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoParamFactuPlazo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoParamFactuPlazo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoParamFactuPlazo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoParamFactuPlazo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoParamFactuPlazo = new JLabelMe();
		
		this.jLabelAccionesTipoParamFactuPlazo.setText("Acciones");		
		this.jLabelAccionesTipoParamFactuPlazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoParamFactuPlazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoParamFactuPlazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoParamFactuPlazo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoParamFactuPlazo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoParamFactuPlazo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoParamFactuPlazo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoParamFactuPlazo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoParamFactuPlazo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoParamFactuPlazo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoParamFactuPlazo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoParamFactuPlazo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoParamFactuPlazo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoParamFactuPlazo.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoParamFactuPlazo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoParamFactuPlazo = new JButtonMe();
		//this.jButtonAnterioresTipoParamFactuPlazo.setText("<<");
        this.jButtonAnterioresTipoParamFactuPlazo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoParamFactuPlazo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoParamFactuPlazo = new JButtonMe();
		//this.jButtonSiguientesTipoParamFactuPlazo.setText(">>");
        this.jButtonSiguientesTipoParamFactuPlazo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoParamFactuPlazo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoParamFactuPlazo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoParamFactuPlazo.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoParamFactuPlazo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoParamFactuPlazo,"nuevoguardarcambios_button","Nue",this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoParamFactuPlazo";
		inputMap = this.jButtonNuevoGuardarCambiosTipoParamFactuPlazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoParamFactuPlazo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoParamFactuPlazo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoParamFactuPlazo";
		inputMap = this.jButtonRecargarInformacionTipoParamFactuPlazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoParamFactuPlazo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoParamFactuPlazo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoParamFactuPlazo";
		inputMap = this.jButtonSiguientesTipoParamFactuPlazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoParamFactuPlazo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoParamFactuPlazo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoParamFactuPlazo";
		inputMap = this.jButtonAnterioresTipoParamFactuPlazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoParamFactuPlazo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoParamFactuPlazo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoParamFactuPlazo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoParamFactuPlazo.setMinimumSize(new Dimension(this.getWidth(),TipoParamFactuPlazoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoParamFactuPlazoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoParamFactuPlazo.setMaximumSize(new Dimension(this.getWidth(),TipoParamFactuPlazoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoParamFactuPlazoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoParamFactuPlazo.setPreferredSize(new Dimension(this.getWidth(),TipoParamFactuPlazoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoParamFactuPlazoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoParamFactuPlazo = new GridBagLayout();

			this.jPanelPaginacionTipoParamFactuPlazo.setLayout(gridaBagLayoutPaginacionTipoParamFactuPlazo);						
			
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuPlazo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuPlazo.gridy = 0;
			this.gridBagConstraintsTipoParamFactuPlazo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoParamFactuPlazo.add(this.jButtonAnterioresTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
					
						
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuPlazo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoParamFactuPlazo.gridy = 0;
			
			this.jPanelPaginacionTipoParamFactuPlazo.add(this.jButtonNuevoGuardarCambiosTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
						
			
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuPlazo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoParamFactuPlazo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoParamFactuPlazo.gridy = 0;
			this.jPanelPaginacionTipoParamFactuPlazo.add(this.jButtonSiguientesTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuPlazo.gridy = 1;
			this.gridBagConstraintsTipoParamFactuPlazo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoParamFactuPlazo.add(this.jButtonNuevoTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
						
			
			
			if(!this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
				this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoParamFactuPlazo.gridy = 1;
				this.gridBagConstraintsTipoParamFactuPlazo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoParamFactuPlazo.add(this.jButtonGuardarCambiosTablaTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
			}
			
			
			
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuPlazo.gridy = 1;
			this.gridBagConstraintsTipoParamFactuPlazo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoParamFactuPlazo.add(this.jButtonDuplicarTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
			
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuPlazo.gridy = 1;
			this.gridBagConstraintsTipoParamFactuPlazo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoParamFactuPlazo.add(this.jButtonCopiarTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
		
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuPlazo.gridy = 1;
			this.gridBagConstraintsTipoParamFactuPlazo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoParamFactuPlazo.add(this.jButtonVerFormTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
		
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuPlazo.gridy = 1;
			this.gridBagConstraintsTipoParamFactuPlazo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoParamFactuPlazo.add(this.jButtonCerrarTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
		
		
		
		this.jButtonRecargarInformacionTipoParamFactuPlazo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoParamFactuPlazo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoParamFactuPlazo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoParamFactuPlazo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoParamFactuPlazo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoParamFactuPlazo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoParamFactuPlazo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoParamFactuPlazo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoParamFactuPlazo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoParamFactuPlazo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoParamFactuPlazo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoParamFactuPlazo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoParamFactuPlazo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoParamFactuPlazo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoParamFactuPlazo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoParamFactuPlazo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoParamFactuPlazo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoParamFactuPlazo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoParamFactuPlazo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoParamFactuPlazo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoParamFactuPlazo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoParamFactuPlazo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoParamFactuPlazo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoParamFactuPlazo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoParamFactuPlazo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoParamFactuPlazo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoParamFactuPlazo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoParamFactuPlazo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoParamFactuPlazo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoParamFactuPlazo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoParamFactuPlazo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoParamFactuPlazo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoParamFactuPlazo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoParamFactuPlazo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoParamFactuPlazo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoParamFactuPlazo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoParamFactuPlazo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoParamFactuPlazo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoParamFactuPlazo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoParamFactuPlazo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoParamFactuPlazo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoParamFactuPlazo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoParamFactuPlazo.setLayout(gridaBagParametrosReportesTipoParamFactuPlazo);
			this.jPanelParametrosReportesAccionesTipoParamFactuPlazo.setLayout(gridaBagParametrosReportesAccionesTipoParamFactuPlazo);
			
			
			this.jPanelParametrosAuxiliar1TipoParamFactuPlazo.setLayout(gridaBagParametrosAuxiliar1TipoParamFactuPlazo);
			this.jPanelParametrosAuxiliar2TipoParamFactuPlazo.setLayout(gridaBagParametrosAuxiliar2TipoParamFactuPlazo);
			this.jPanelParametrosAuxiliar3TipoParamFactuPlazo.setLayout(gridaBagParametrosAuxiliar3TipoParamFactuPlazo);
			this.jPanelParametrosAuxiliar4TipoParamFactuPlazo.setLayout(gridaBagParametrosAuxiliar4TipoParamFactuPlazo);
			//this.jPanelParametrosAuxiliar5TipoParamFactuPlazo.setLayout(gridaBagParametrosAuxiliar2TipoParamFactuPlazo);			
			
			
			
			
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoParamFactuPlazo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoParamFactuPlazo.add(this.jButtonRecargarInformacionTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuPlazo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuPlazo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoParamFactuPlazo.add(this.jComboBoxTiposPaginacionTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuPlazo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuPlazo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoParamFactuPlazo.add(this.jCheckBoxConAltoMaximoTablaTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuPlazo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuPlazo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoParamFactuPlazo.add(this.jComboBoxTiposArchivosReportesTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuPlazo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuPlazo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoParamFactuPlazo.add(this.jPanelParametrosAuxiliar1TipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuPlazo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuPlazo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoParamFactuPlazo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoParamFactuPlazo.add(this.jComboBoxTiposReportesTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuPlazo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuPlazo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoParamFactuPlazo.add(this.jPanelParametrosAuxiliar4TipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuPlazo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuPlazo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoParamFactuPlazo.add(this.jComboBoxTiposReportesTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuPlazo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuPlazo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoParamFactuPlazo.add(this.jCheckBoxGenerarReporteTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuPlazo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuPlazo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoParamFactuPlazo.add(this.jPanelParametrosAuxiliar2TipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoParamFactuPlazo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoParamFactuPlazo.add(this.jLabelAccionesTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
				this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoParamFactuPlazo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoParamFactuPlazo.add(this.jButtonAbrirOrderByTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuPlazo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoParamFactuPlazo.add(this.jComboBoxTiposSeleccionarTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);			
			
			
			/*
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoParamFactuPlazo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoParamFactuPlazo.add(this.jCheckBoxSeleccionarTodosTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuPlazo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuPlazo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoParamFactuPlazo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoParamFactuPlazo.add(this.jCheckBoxSeleccionarTodosTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);															
				
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuPlazo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuPlazo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoParamFactuPlazo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoParamFactuPlazo.add(this.jCheckBoxSeleccionadosTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuPlazo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuPlazo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoParamFactuPlazo.add(this.jPanelParametrosAuxiliar3TipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuPlazo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoParamFactuPlazo.add(this.jComboBoxTiposRelacionesTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
				
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuPlazo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoParamFactuPlazo.add(this.jComboBoxTiposAccionesTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
	
				
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuPlazo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoParamFactuPlazo.add(this.jTextFieldValorCampoGeneralTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoParamFactuPlazo = new GridBagLayout();

			this.jScrollPanelDatosTipoParamFactuPlazo.setLayout(gridaBagLayoutDatosTipoParamFactuPlazo);
			
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuPlazo.gridy = 0;
			this.gridBagConstraintsTipoParamFactuPlazo.gridx = 0;
			
			this.jScrollPanelDatosTipoParamFactuPlazo.add(this.jTableDatosTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoParamFactuPlazo.setViewportView(this.jTableDatosTipoParamFactuPlazo);
		this.jTableDatosTipoParamFactuPlazo.setFillsViewportHeight(true);
		this.jTableDatosTipoParamFactuPlazo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoParamFactuPlazo= new GridBagLayout();
		this.jPanelAccionesTipoParamFactuPlazo.setLayout(gridaBagLayoutAccionesTipoParamFactuPlazo);
		
		
		/*	
		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuPlazo.gridy = 0;
		this.gridBagConstraintsTipoParamFactuPlazo.gridx = 0;
			
		this.jPanelAccionesTipoParamFactuPlazo.add(this.jButtonNuevoTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoParamFactuPlazo= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoParamFactuPlazo.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoParamFactuPlazo.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoParamFactuPlazo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoParamFactuPlazo.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoParamFactuPlazo.setLayout(gridaBagLayoutBusquedaPorNombreTipoParamFactuPlazo);

		gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		gridBagConstraintsTipoParamFactuPlazo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoParamFactuPlazo.gridy = 0;
		gridBagConstraintsTipoParamFactuPlazo.gridx = 0;
		jPanelBusquedaPorNombreTipoParamFactuPlazo.add(jLabelnombreBusquedaPorNombreTipoParamFactuPlazo, gridBagConstraintsTipoParamFactuPlazo);

		gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		gridBagConstraintsTipoParamFactuPlazo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoParamFactuPlazo.gridy = 0;
		gridBagConstraintsTipoParamFactuPlazo.gridx = 1;
		jPanelBusquedaPorNombreTipoParamFactuPlazo.add(jTextAreanombreBusquedaPorNombreTipoParamFactuPlazo, gridBagConstraintsTipoParamFactuPlazo);

		gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		gridBagConstraintsTipoParamFactuPlazo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoParamFactuPlazo.gridy = 1;
		gridBagConstraintsTipoParamFactuPlazo.gridx =1;
		jPanelBusquedaPorNombreTipoParamFactuPlazo.add(jButtonBusquedaPorNombreTipoParamFactuPlazo, gridBagConstraintsTipoParamFactuPlazo);

		jTabbedPaneBusquedasTipoParamFactuPlazo.addTab("1.-Por Nombre ", jPanelBusquedaPorNombreTipoParamFactuPlazo);
		jTabbedPaneBusquedasTipoParamFactuPlazo.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoParamFactuPlazo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoParamFactuPlazo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();						
			this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoParamFactuPlazo.gridx = 0;		
			//this.gridBagConstraintsTipoParamFactuPlazo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuPlazo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoParamFactuPlazo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoParamFactuPlazo.gridx = 0;		
		//this.gridBagConstraintsTipoParamFactuPlazo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuPlazo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoParamFactuPlazo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoParamFactuPlazo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoParamFactuPlazo.gridx = 0;		
			this.gridBagConstraintsTipoParamFactuPlazo.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuPlazo.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoParamFactuPlazo.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParamFactuPlazo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);								
		
		
		/*
		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParamFactuPlazo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
		*/		
		
		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuPlazo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoParamFactuPlazo.gridx =0;
		this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoParamFactuPlazo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
				
		
		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParamFactuPlazo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoParamFactuPlazoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoParamFactuPlazo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoParamFactuPlazo = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoParamFactuPlazo.setLayout(gridaBagLayoutBusquedasParametrosTipoParamFactuPlazo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoParamFactuPlazo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoParamFactuPlazo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoParamFactuPlazo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoParamFactuPlazo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParamFactuPlazo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
			
			
		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParamFactuPlazo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
		
			
		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuPlazo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoParamFactuPlazo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoParamFactuPlazo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoParamFactuPlazo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoParamFactuPlazo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoParamFactuPlazo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoParamFactuPlazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoParamFactuPlazo.setName("jPanelReporteDinamicoTipoParamFactuPlazo"); 
		
		this.jPanelReporteDinamicoTipoParamFactuPlazo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoParamFactuPlazo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoParamFactuPlazo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoParamFactuPlazo.setLayout(gridaBagLayoutReporteDinamicoTipoParamFactuPlazo);
		
		
		this.jInternalFrameReporteDinamicoTipoParamFactuPlazo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoParamFactuPlazo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoParamFactuPlazo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoParamFactuPlazo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoParamFactuPlazo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoParamFactuPlazo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoParamFactuPlazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Plazos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoParamFactuPlazo = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoParamFactuPlazo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoParamFactuPlazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoParamFactuPlazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoParamFactuPlazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParamFactuPlazo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoParamFactuPlazo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoParamFactuPlazo.add(this.jLabelColumnasSelectReporteTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoParamFactuPlazo = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoParamFactuPlazo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoParamFactuPlazo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoParamFactuPlazo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoParamFactuPlazo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoParamFactuPlazo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoParamFactuPlazo=new JScrollPane(this.jListColumnasSelectReporteTipoParamFactuPlazo);
			
			this.jScrollColumnasSelectReporteTipoParamFactuPlazo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoParamFactuPlazo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoParamFactuPlazo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoParamFactuPlazo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParamFactuPlazo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoParamFactuPlazo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoParamFactuPlazo.add(this.jListColumnasSelectReporteTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
		this.jPanelReporteDinamicoTipoParamFactuPlazo.add(this.jScrollColumnasSelectReporteTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoParamFactuPlazo = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoParamFactuPlazo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoParamFactuPlazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoParamFactuPlazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoParamFactuPlazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoParamFactuPlazo = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoParamFactuPlazo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoParamFactuPlazo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoParamFactuPlazo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoParamFactuPlazo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoParamFactuPlazo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoParamFactuPlazo=new JScrollPane(this.jListRelacionesSelectReporteTipoParamFactuPlazo);
			
			this.jScrollRelacionesSelectReporteTipoParamFactuPlazo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoParamFactuPlazo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoParamFactuPlazo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoParamFactuPlazo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoParamFactuPlazo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoParamFactuPlazo = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoParamFactuPlazo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoParamFactuPlazo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoParamFactuPlazo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoParamFactuPlazo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoParamFactuPlazo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoParamFactuPlazo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoParamFactuPlazo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoParamFactuPlazo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoParamFactuPlazo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoParamFactuPlazo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoParamFactuPlazo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoParamFactuPlazo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoParamFactuPlazo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoParamFactuPlazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoParamFactuPlazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoParamFactuPlazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParamFactuPlazo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoParamFactuPlazo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoParamFactuPlazo.add(this.jLabelGenerarExcelReporteDinamicoTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoParamFactuPlazo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoParamFactuPlazo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoParamFactuPlazo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoParamFactuPlazo.setToolTipText("Generar EXCEL"+" "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		//this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoParamFactuPlazo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoParamFactuPlazo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoParamFactuPlazo.add(this.jButtonGenerarExcelReporteDinamicoTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuPlazo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoParamFactuPlazo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoParamFactuPlazo.add(this.jComboBoxTiposReportesDinamicoTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoParamFactuPlazo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoParamFactuPlazo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoParamFactuPlazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoParamFactuPlazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoParamFactuPlazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParamFactuPlazo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoParamFactuPlazo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoParamFactuPlazo.add(this.jLabelTiposArchivoReporteDinamicoTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuPlazo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoParamFactuPlazo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoParamFactuPlazo.add(this.jComboBoxTiposArchivosReportesDinamicoTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoParamFactuPlazo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoParamFactuPlazo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoParamFactuPlazo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoParamFactuPlazo.setToolTipText("Generar"+" "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuPlazo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoParamFactuPlazo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoParamFactuPlazo.add(this.jButtonGenerarReporteDinamicoTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoParamFactuPlazo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoParamFactuPlazo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoParamFactuPlazo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoParamFactuPlazo.setToolTipText("Cancelar"+" "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuPlazo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoParamFactuPlazo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoParamFactuPlazo.add(this.jButtonCerrarReporteDinamicoTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoParamFactuPlazo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoParamFactuPlazo= new JScrollPane(jPanelReporteDinamicoTipoParamFactuPlazo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoParamFactuPlazo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoParamFactuPlazo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoParamFactuPlazo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoParamFactuPlazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Plazos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuPlazo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoParamFactuPlazo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoParamFactuPlazo);
		this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.getContentPane().add(this.jScrollPanelReporteDinamicoTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoParamFactuPlazo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoParamFactuPlazo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoParamFactuPlazo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoParamFactuPlazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoParamFactuPlazo.setName("jPanelImportacionTipoParamFactuPlazo"); 
		
		this.jPanelImportacionTipoParamFactuPlazo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoParamFactuPlazo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoParamFactuPlazo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoParamFactuPlazo.setLayout(gridaBagLayoutImportacionTipoParamFactuPlazo);
		
		
		this.jInternalFrameImportacionTipoParamFactuPlazo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoParamFactuPlazo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoParamFactuPlazo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoParamFactuPlazo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoParamFactuPlazo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoParamFactuPlazo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoParamFactuPlazo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoParamFactuPlazo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoParamFactuPlazo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoParamFactuPlazo.setResizable(true);
	    this.jInternalFrameImportacionTipoParamFactuPlazo.setClosable(true);
	    this.jInternalFrameImportacionTipoParamFactuPlazo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoParamFactuPlazo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoParamFactuPlazo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoParamFactuPlazo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoParamFactuPlazo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoParamFactuPlazo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoParamFactuPlazo.setResizable(true);
	    this.jInternalFrameImportacionTipoParamFactuPlazo.setClosable(true);
	    this.jInternalFrameImportacionTipoParamFactuPlazo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoParamFactuPlazo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoParamFactuPlazo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoParamFactuPlazo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoParamFactuPlazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Plazos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoParamFactuPlazo = new JLabelMe();

		this.jLabelArchivoImportacionTipoParamFactuPlazo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoParamFactuPlazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoParamFactuPlazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoParamFactuPlazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParamFactuPlazo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoParamFactuPlazo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoParamFactuPlazo.add(this.jLabelArchivoImportacionTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoParamFactuPlazo = new JFileChooser();		
		this.jFileChooserImportacionTipoParamFactuPlazo.setToolTipText("ESCOGER ARCHIVO"+" "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoParamFactuPlazo = new JButtonMe();
		this.jButtonAbrirImportacionTipoParamFactuPlazo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoParamFactuPlazo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoParamFactuPlazo.setToolTipText("Generar"+" "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuPlazo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoParamFactuPlazo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoParamFactuPlazo.add(this.jButtonAbrirImportacionTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoParamFactuPlazo = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoParamFactuPlazo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoParamFactuPlazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoParamFactuPlazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoParamFactuPlazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParamFactuPlazo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoParamFactuPlazo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoParamFactuPlazo.add(this.jLabelPathArchivoImportacionTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoParamFactuPlazo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoParamFactuPlazo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoParamFactuPlazo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoParamFactuPlazo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuPlazo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoParamFactuPlazo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoParamFactuPlazo.add(this.jTextFieldPathArchivoImportacionTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoParamFactuPlazo = new JButtonMe();
		this.jButtonGenerarImportacionTipoParamFactuPlazo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoParamFactuPlazo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoParamFactuPlazo.setToolTipText("Generar"+" "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuPlazo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoParamFactuPlazo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoParamFactuPlazo.add(this.jButtonGenerarImportacionTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoParamFactuPlazo = new JButtonMe();
		this.jButtonCerrarImportacionTipoParamFactuPlazo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoParamFactuPlazo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoParamFactuPlazo.setToolTipText("Cancelar"+" "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuPlazo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoParamFactuPlazo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoParamFactuPlazo.add(this.jButtonCerrarImportacionTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoParamFactuPlazo = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoParamFactuPlazo= new JScrollPane(jPanelImportacionTipoParamFactuPlazo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuPlazo.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoParamFactuPlazo.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoParamFactuPlazo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoParamFactuPlazo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoParamFactuPlazo);
		this.jInternalFrameImportacionTipoParamFactuPlazo.getContentPane().add(this.jScrollPanelImportacionTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoParamFactuPlazo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoParamFactuPlazo = new JButtonMe();
			this.jButtonAbrirOrderByTipoParamFactuPlazo.setText("Orden");
			this.jButtonAbrirOrderByTipoParamFactuPlazo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoParamFactuPlazo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoParamFactuPlazo";
			inputMap = this.jButtonAbrirOrderByTipoParamFactuPlazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoParamFactuPlazo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoParamFactuPlazo"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoParamFactuPlazo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoParamFactuPlazo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoParamFactuPlazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoParamFactuPlazo.setName("jPanelOrderByTipoParamFactuPlazo"); 
			
			this.jPanelOrderByTipoParamFactuPlazo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoParamFactuPlazo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoParamFactuPlazo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoParamFactuPlazo.setLayout(gridaBagLayoutOrderByTipoParamFactuPlazo);
			
			
			this.jTableDatosTipoParamFactuPlazoOrderBy = new JTableMe();        
			this.jTableDatosTipoParamFactuPlazoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoParamFactuPlazoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoParamFactuPlazoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoParamFactuPlazoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoParamFactuPlazoOrderBy.setViewportView(this.jTableDatosTipoParamFactuPlazoOrderBy);
			this.jTableDatosTipoParamFactuPlazoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoParamFactuPlazoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoParamFactuPlazo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoParamFactuPlazo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoParamFactuPlazo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoParamFactuPlazo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoParamFactuPlazo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoParamFactuPlazo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoParamFactuPlazo.setTitle("Orden");
			this.jInternalFrameOrderByTipoParamFactuPlazo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoParamFactuPlazo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoParamFactuPlazo.setResizable(true);
			this.jInternalFrameOrderByTipoParamFactuPlazo.setClosable(true);
			this.jInternalFrameOrderByTipoParamFactuPlazo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoParamFactuPlazo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoParamFactuPlazo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoParamFactuPlazo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoParamFactuPlazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Plazos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuPlazo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoParamFactuPlazo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoParamFactuPlazo.ipady =150;
				
			this.jPanelOrderByTipoParamFactuPlazo.add(jScrollPanelDatosTipoParamFactuPlazoOrderBy, this.gridBagConstraintsTipoParamFactuPlazo);//this.jTableDatosTipoParamFactuPlazoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoParamFactuPlazo = new JButtonMe();
			this.jButtonCerrarOrderByTipoParamFactuPlazo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoParamFactuPlazo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoParamFactuPlazo.setToolTipText("Cancelar"+" "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuPlazo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoParamFactuPlazo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoParamFactuPlazo.add(this.jButtonCerrarOrderByTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoParamFactuPlazo = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoParamFactuPlazo= new JScrollPane(jPanelOrderByTipoParamFactuPlazo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuPlazo.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoParamFactuPlazo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoParamFactuPlazo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoParamFactuPlazo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoParamFactuPlazo);
			
			this.jInternalFrameOrderByTipoParamFactuPlazo.getContentPane().add(this.jScrollPanelOrderByTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);			
		
		} else {
			this.jButtonAbrirOrderByTipoParamFactuPlazo = new JButtonMe();
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
		int iWidthTableCalculado=0;//530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipoparamfactuplazoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoParamFactuPlazo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoParamFactuPlazo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoParamFactuPlazo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoParamFactuPlazo.getRowHeight();//TipoParamFactuPlazoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoParamFactuPlazoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoParamFactuPlazo.isSelected()) {
					iHeightTable=TipoParamFactuPlazoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoParamFactuPlazoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoParamFactuPlazoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoParamFactuPlazoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoParamFactuPlazo.isSelected()) {
					iHeightTable=TipoParamFactuPlazoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoParamFactuPlazoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoParamFactuPlazoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoParamFactuPlazo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoParamFactuPlazo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoParamFactuPlazo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoParamFactuPlazo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoParamFactuPlazo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoParamFactuPlazo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoParamFactuPlazo!=null && this.jInternalFrameOrderByTipoParamFactuPlazo.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoParamFactuPlazo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoParamFactuPlazo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoParamFactuPlazo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoParamFactuPlazo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoParamFactuPlazo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoParamFactuPlazo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoParamFactuPlazo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoParamFactuPlazo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoParamFactuPlazo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoParamFactuPlazo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoparamfactuplazoLogic.getTipoParamFactuPlazos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoparamfactuplazos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoParamFactuPlazo> TraerTipoParamFactuPlazoBeans(List<TipoParamFactuPlazo> tipoparamfactuplazos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoParamFactuPlazo tipoparamfactuplazo:tipoparamfactuplazos) {
					
				if(!(TipoParamFactuPlazoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoParamFactuPlazoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoparamfactuplazo.setsDetalleGeneralEntityReporte(TipoParamFactuPlazoConstantesFunciones.getTipoParamFactuPlazoDescripcion(tipoparamfactuplazo));
										
						
					
						
					
				} else  {
							
					//tipoparamfactuplazo.setsDetalleGeneralEntityReporte(tipoparamfactuplazo.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoparamfactuplazobeans.add(tipoparamfactuplazobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoparamfactuplazos;
    }
	//PARA REPORTES FIN
}
