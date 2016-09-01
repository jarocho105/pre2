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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;

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
import com.bydan.erp.cartera.util.TipoCargoLaboConstantesFunciones;

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
public class TipoCargoLaboJInternalFrame extends TipoCargoLaboBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoCargoLabo;
	
	protected JMenuBar jmenuBarTipoCargoLabo;
	
	protected JMenu jmenuTipoCargoLabo;
	protected JMenu jmenuDatosTipoCargoLabo;
	protected JMenu jmenuArchivoTipoCargoLabo;
	protected JMenu jmenuAccionesTipoCargoLabo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoCargoLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCargoLabo;	
	protected GridBagConstraints gridBagConstraintsTipoCargoLabo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoCargoLaboDetalleFormJInternalFrame jInternalFrameDetalleFormTipoCargoLabo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoCargoLabo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoCargoLabo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoCargoLaboSessionBean tipocargolaboSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoCargoLabo> tipocargolabos;		
	public List<TipoCargoLabo> tipocargolabosEliminados;	
	public List<TipoCargoLabo> tipocargolabosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoCargoLabo;		
	protected JButton jButtonAbrirOrderByTipoCargoLabo;
	
	
	//protected JPanel jPanelOrderByTipoCargoLabo;
	//public JScrollPane jScrollPanelOrderByTipoCargoLabo;	
	//protected JButton jButtonCerrarOrderByTipoCargoLabo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoCargoLaboLogic tipocargolaboLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoCargoLabo;
	public JScrollPane jScrollPanelDatosEdicionTipoCargoLabo;
	public JScrollPane jScrollPanelDatosGeneralTipoCargoLabo;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoCargoLaboOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoCargoLabo;
	//public JScrollPane jScrollPanelImportacionTipoCargoLabo;
	
	
	
	protected JPanel jPanelAccionesTipoCargoLabo;
	
    protected JPanel jPanelPaginacionTipoCargoLabo;
    protected JPanel jPanelParametrosReportesTipoCargoLabo;
	protected JPanel jPanelParametrosReportesAccionesTipoCargoLabo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoCargoLabo;
	protected JPanel jPanelParametrosAuxiliar2TipoCargoLabo;
	protected JPanel jPanelParametrosAuxiliar3TipoCargoLabo;
	protected JPanel jPanelParametrosAuxiliar4TipoCargoLabo;
	//protected JPanel jPanelParametrosAuxiliar5TipoCargoLabo;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoCargoLabo;
	//protected JPanel jPanelImportacionTipoCargoLabo;
	
	
	public JTable jTableDatosTipoCargoLabo;
	
	
	
	//public JTable jTableDatosTipoCargoLaboOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoCargoLabo;
	protected JButton jButtonDuplicarTipoCargoLabo;
	protected JButton jButtonCopiarTipoCargoLabo;
	protected JButton jButtonVerFormTipoCargoLabo;
	protected JButton jButtonNuevoRelacionesTipoCargoLabo;
	protected JButton jButtonModificarTipoCargoLabo;
	
    protected JButton jButtonGuardarCambiosTablaTipoCargoLabo;
	protected JButton jButtonCerrarTipoCargoLabo;
	
	
	protected JButton jButtonRecargarInformacionTipoCargoLabo;
	protected JButton jButtonProcesarInformacionTipoCargoLabo;
	
	
	protected JButton jButtonAnterioresTipoCargoLabo;
	protected JButton jButtonSiguientesTipoCargoLabo;
	protected JButton jButtonNuevoGuardarCambiosTipoCargoLabo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoCargoLabo;
	//protected JButton jButtonCerrarReporteDinamicoTipoCargoLabo;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoCargoLabo;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoCargoLabo;
	//protected JButton jButtonGenerarImportacionTipoCargoLabo;
	//protected JButton jButtonCerrarImportacionTipoCargoLabo;
	//protected JFileChooser jFileChooserImportacionTipoCargoLabo;
	//protected File fileImportacionTipoCargoLabo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCargoLabo;
	protected JButton jButtonDuplicarToolBarTipoCargoLabo;
	protected JButton jButtonNuevoRelacionesToolBarTipoCargoLabo;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoCargoLabo;
	protected JButton jButtonCopiarToolBarTipoCargoLabo;
	protected JButton jButtonVerFormToolBarTipoCargoLabo;
	public JButton jButtonGuardarCambiosTablaToolBarTipoCargoLabo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCargoLabo;
	protected JButton jButtonCerrarToolBarTipoCargoLabo;
	
	protected JButton jButtonRecargarInformacionToolBarTipoCargoLabo;
	protected JButton jButtonProcesarInformacionToolBarTipoCargoLabo;
	protected JButton jButtonAnterioresToolBarTipoCargoLabo;
	protected JButton jButtonSiguientesToolBarTipoCargoLabo;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoCargoLabo;
	protected JButton jButtonAbrirOrderByToolBarTipoCargoLabo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCargoLabo;
	protected JMenuItem jMenuItemDuplicarTipoCargoLabo;
	protected JMenuItem jMenuItemNuevoRelacionesTipoCargoLabo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoCargoLabo;
	protected JMenuItem jMenuItemCopiarTipoCargoLabo;
	protected JMenuItem jMenuItemVerFormTipoCargoLabo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCargoLabo;
	protected JMenuItem jMenuItemCerrarTipoCargoLabo;
	protected JMenuItem jMenuItemDetalleCerrarTipoCargoLabo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoCargoLabo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCargoLabo;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoCargoLabo;
	protected JMenuItem jMenuItemProcesarInformacionTipoCargoLabo;
	protected JMenuItem jMenuItemAnterioresTipoCargoLabo;
	protected JMenuItem jMenuItemSiguientesTipoCargoLabo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCargoLabo;
	protected JMenuItem jMenuItemAbrirOrderByTipoCargoLabo;
	protected JMenuItem jMenuItemMostrarOcultarTipoCargoLabo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCargoLabo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoCargoLabo;
	protected JCheckBox jCheckBoxSeleccionadosTipoCargoLabo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoCargoLabo;
	protected JCheckBox jCheckBoxConGraficoReporteTipoCargoLabo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoCargoLabo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoCargoLabo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCargoLabo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoCargoLabo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoCargoLabo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoCargoLabo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCargoLabo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCargoLabo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoCargoLabo;
	protected JTextField jTextFieldValorCampoGeneralTipoCargoLabo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoCargoLabo;
	//public JList<Reporte> jListColumnasSelectReporteTipoCargoLabo;
	//public JScrollPane jScrollColumnasSelectReporteTipoCargoLabo;
	
	//public JLabel jLabelRelacionesSelectReporteTipoCargoLabo;
	//public JList<Reporte> jListRelacionesSelectReporteTipoCargoLabo;
	//public JScrollPane jScrollRelacionesSelectReporteTipoCargoLabo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoCargoLabo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoCargoLabo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoCargoLabo;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoCargoLabo;
	
		
	//public JLabel jLabelArchivoImportacionTipoCargoLabo;	
	//public JLabel jLabelPathArchivoImportacionTipoCargoLabo;
	//protected JTextField jTextFieldPathArchivoImportacionTipoCargoLabo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoCargoLabo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoCargoLabo;
	
	//public JLabel jLabelColumnaCategoriaValorTipoCargoLabo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoCargoLabo;
	
	//public JLabel jLabelColumnasValoresGraficoTipoCargoLabo;
	//public JList<Reporte> jListColumnasValoresGraficoTipoCargoLabo;
	//public JScrollPane jScrollColumnasValoresGraficoTipoCargoLabo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoCargoLabo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoCargoLabo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoCargoLabo;
	public JPanel jPanelBusquedaPorCodigoTipoCargoLabo;
	public JButton jButtonBusquedaPorCodigoTipoCargoLabo;
	public JPanel jPanelBusquedaPorNombreTipoCargoLabo;
	public JButton jButtonBusquedaPorNombreTipoCargoLabo;
	
	public JPanel jPanelcodigoBusquedaPorCodigoTipoCargoLabo;
	public JLabel jLabelcodigoBusquedaPorCodigoTipoCargoLabo;
	public JTextField jTextFieldcodigoBusquedaPorCodigoTipoCargoLabo;
	public JButton jButtoncodigoBusquedaPorCodigoTipoCargoLaboBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTipoCargoLabo;
	public JLabel jLabelnombreBusquedaPorNombreTipoCargoLabo;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoCargoLabo;
	public JButton jButtonnombreBusquedaPorNombreTipoCargoLaboBusqueda= new JButtonMe();

	
	
	
	
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
	public TipoCargoLaboJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoCargoLabo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCargoLaboJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCargoLabo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCargoLaboJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCargoLabo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCargoLaboJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCargoLabo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoCargoLabo)	{
		this.jButtonRecargarInformacionTipoCargoLabo = jButtonRecargarInformacionTipoCargoLabo;
	}
	
	public JButton getjButtonProcesarInformacionTipoCargoLabo() {
		return this.jButtonProcesarInformacionTipoCargoLabo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCargoLabo)	{
		this.jButtonProcesarInformacionTipoCargoLabo = jButtonProcesarInformacionTipoCargoLabo;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoCargoLabo() {
		return this.jButtonRecargarInformacionTipoCargoLabo;
	}
	
	
	public List<TipoCargoLabo> gettipocargolabos() {
		return this.tipocargolabos;
	}

	public void settipocargolabos(List<TipoCargoLabo> tipocargolabos) {
		this.tipocargolabos = tipocargolabos;
	}
	
	public List<TipoCargoLabo> gettipocargolabosAux() {
		return this.tipocargolabosAux;
	}

	public void settipocargolabosAux(List<TipoCargoLabo> tipocargolabosAux) {
		this.tipocargolabosAux = tipocargolabosAux;
	}
	
	public List<TipoCargoLabo> gettipocargolabosEliminados() {
		return this.tipocargolabosEliminados;
	}

	public void setTipoCargoLabosEliminados(List<TipoCargoLabo> tipocargolabosEliminados) {
		this.tipocargolabosEliminados = tipocargolabosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoCargoLabo() {
		return jComboBoxTiposSeleccionarTipoCargoLabo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoCargoLabo(
			JComboBox jComboBoxTiposSeleccionarTipoCargoLabo) {
		this.jComboBoxTiposSeleccionarTipoCargoLabo = jComboBoxTiposSeleccionarTipoCargoLabo;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoCargoLabo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoCargoLabo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoCargoLabo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoCargoLabo() {
		return jTextFieldValorCampoGeneralTipoCargoLabo;
	}

	public void setjTextFieldValorCampoGeneralTipoCargoLabo(
			JTextField jTextFieldValorCampoGeneralTipoCargoLabo) {
		this.jTextFieldValorCampoGeneralTipoCargoLabo = jTextFieldValorCampoGeneralTipoCargoLabo;
	}

	public void setBorderResaltarValorCampoGeneralTipoCargoLabo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCargoLabo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoCargoLabo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoCargoLabo() {
		return this.jCheckBoxSeleccionarTodosTipoCargoLabo;
	}

	public void setjCheckBoxSeleccionarTodosTipoCargoLabo(
			JCheckBox jCheckBoxSeleccionarTodosTipoCargoLabo) {
		this.jCheckBoxSeleccionarTodosTipoCargoLabo = jCheckBoxSeleccionarTodosTipoCargoLabo;
	}

	public void setBorderResaltarSeleccionarTodosTipoCargoLabo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCargoLabo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoCargoLabo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoCargoLabo() {
		return this.jCheckBoxSeleccionadosTipoCargoLabo;
	}

	public void setjCheckBoxSeleccionadosTipoCargoLabo(
			JCheckBox jCheckBoxSeleccionadosTipoCargoLabo) {
		this.jCheckBoxSeleccionadosTipoCargoLabo = jCheckBoxSeleccionadosTipoCargoLabo;
	}
	
	public void setBorderResaltarSeleccionadosTipoCargoLabo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCargoLabo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoCargoLabo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoCargoLabo() {
		return this.jComboBoxTiposArchivosReportesTipoCargoLabo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoCargoLabo(
			JComboBox jComboBoxTiposArchivosReportesTipoCargoLabo) {
		this.jComboBoxTiposArchivosReportesTipoCargoLabo = jComboBoxTiposArchivosReportesTipoCargoLabo;
	}

	public void setBorderResaltarTiposArchivosReportesTipoCargoLabo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCargoLabo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoCargoLabo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoCargoLabo() {
		return this.jComboBoxTiposReportesTipoCargoLabo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoCargoLabo(
			JComboBox jComboBoxTiposReportesTipoCargoLabo) {
		this.jComboBoxTiposReportesTipoCargoLabo = jComboBoxTiposReportesTipoCargoLabo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoCargoLabo() {
	//	return jComboBoxTiposReportesDinamicoTipoCargoLabo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoCargoLabo(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoCargoLabo) {
	//	this.jComboBoxTiposReportesDinamicoTipoCargoLabo = jComboBoxTiposReportesDinamicoTipoCargoLabo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoCargoLabo() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoCargoLabo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoCargoLabo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCargoLabo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoCargoLabo = jComboBoxTiposArchivosReportesDinamicoTipoCargoLabo;
	//}
	
	public void setBorderResaltarTiposReportesTipoCargoLabo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCargoLabo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoCargoLabo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoCargoLabo() {
		return this.jComboBoxTiposGraficosReportesTipoCargoLabo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoCargoLabo(
			JComboBox jComboBoxTiposGraficosReportesTipoCargoLabo) {
		this.jComboBoxTiposGraficosReportesTipoCargoLabo = jComboBoxTiposGraficosReportesTipoCargoLabo;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoCargoLabo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCargoLabo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoCargoLabo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoCargoLabo() {
		return this.jComboBoxTiposPaginacionTipoCargoLabo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoCargoLabo(
			JComboBox jComboBoxTiposPaginacionTipoCargoLabo) {
		this.jComboBoxTiposPaginacionTipoCargoLabo = jComboBoxTiposPaginacionTipoCargoLabo;
	}
	
	public void setBorderResaltarTiposPaginacionTipoCargoLabo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCargoLabo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoCargoLabo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoCargoLabo() {
		return this.jComboBoxTiposRelacionesTipoCargoLabo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCargoLabo() {
		return this.jComboBoxTiposAccionesTipoCargoLabo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCargoLabo(
			JComboBox jComboBoxTiposRelacionesTipoCargoLabo) {
		this.jComboBoxTiposRelacionesTipoCargoLabo = jComboBoxTiposRelacionesTipoCargoLabo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCargoLabo(
			JComboBox jComboBoxTiposAccionesTipoCargoLabo) {
		this.jComboBoxTiposAccionesTipoCargoLabo = jComboBoxTiposAccionesTipoCargoLabo;
	}
	
	public void setBorderResaltarTiposRelacionesTipoCargoLabo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCargoLabo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoCargoLabo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoCargoLabo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCargoLabo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoCargoLabo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoCargoLabo() {
	//	return jCheckBoxConGraficoDinamicoTipoCargoLabo;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoCargoLabo(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoCargoLabo) {
	//	this.jCheckBoxConGraficoDinamicoTipoCargoLabo = jCheckBoxConGraficoDinamicoTipoCargoLabo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoCargoLabo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoCargoLabo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoCargoLabo .setBorder(borderResaltar);		
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
		this.tipocargolaboSessionBean=new TipoCargoLaboSessionBean();
		
		this.tipocargolaboSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocargolaboSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocargolaboSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoCargoLaboJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoCargoLaboJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCargoLaboJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCargoLaboJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCargoLaboJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Cargo Laboral MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoCargoLaboJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoCargoLabo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoCargoLabo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoCargoLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoCargoLabo,this.jTtoolBarTipoCargoLabo,
							"nuevo","nuevo","Nuevo"+" "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCargoLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoCargoLabo,this.jTtoolBarTipoCargoLabo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCargoLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoCargoLabo,this.jTtoolBarTipoCargoLabo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoCargoLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoCargoLabo,this.jTtoolBarTipoCargoLabo,
							"duplicar","duplicar","Duplicar"+" "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoCargoLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoCargoLabo,this.jTtoolBarTipoCargoLabo,
							"copiar","copiar","Copiar"+" "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoCargoLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoCargoLabo,this.jTtoolBarTipoCargoLabo,
							"ver_form","ver_form","Ver"+" "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoCargoLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCargoLabo,this.jTtoolBarTipoCargoLabo,
							"recargar","recargar","Recargar"+" "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoCargoLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCargoLabo,this.jTtoolBarTipoCargoLabo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoCargoLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCargoLabo,this.jTtoolBarTipoCargoLabo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoCargoLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoCargoLabo,this.jTtoolBarTipoCargoLabo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoCargoLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoCargoLabo,this.jTtoolBarTipoCargoLabo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoCargoLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoCargoLabo,this.jTtoolBarTipoCargoLabo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoCargoLabo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoCargoLabo,this.jTtoolBarTipoCargoLabo,
							"cerrar","cerrar","Salir"+" "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoCargoLabo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoCargoLabo;
			
				this.jButtonProcesarInformacionToolBarTipoCargoLabo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoCargoLabo;
				
		//protected JButton jButtonModificarToolBarTipoCargoLabo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoCargoLabo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoCargoLabo=new JMenuMe("General");
		this.jmenuArchivoTipoCargoLabo=new JMenuMe("Archivo");
		this.jmenuAccionesTipoCargoLabo=new JMenuMe("Acciones");
		this.jmenuDatosTipoCargoLabo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCargoLabo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCargoLabo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCargoLabo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoCargoLabo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoCargoLabo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoCargoLabo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoCargoLabo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoCargoLabo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoCargoLabo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoCargoLabo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCargoLabo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCargoLabo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoCargoLabo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoCargoLabo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoCargoLabo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoCargoLabo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoCargoLabo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoCargoLabo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoCargoLabo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoCargoLabo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoCargoLabo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCargoLabo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCargoLabo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCargoLabo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoCargoLabo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoCargoLabo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoCargoLabo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoCargoLabo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoCargoLabo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoCargoLabo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoCargoLabo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoCargoLabo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoCargoLabo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoCargoLabo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoCargoLabo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoCargoLabo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoCargoLabo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoCargoLabo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoCargoLabo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCargoLabo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCargoLabo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCargoLabo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoCargoLabo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoCargoLabo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoCargoLabo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCargoLabo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCargoLabo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCargoLabo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoCargoLabo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoCargoLabo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoCargoLabo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoCargoLabo.add(this.jMenuItemCerrarTipoCargoLabo);
			
			this.jmenuAccionesTipoCargoLabo.add(this.jMenuItemNuevoTipoCargoLabo);
			this.jmenuAccionesTipoCargoLabo.add(this.jMenuItemNuevoGuardarCambiosTipoCargoLabo);
			this.jmenuAccionesTipoCargoLabo.add(this.jMenuItemNuevoRelacionesTipoCargoLabo);
			this.jmenuAccionesTipoCargoLabo.add(this.jMenuItemGuardarCambiosTablaTipoCargoLabo);		
			this.jmenuAccionesTipoCargoLabo.add(this.jMenuItemDuplicarTipoCargoLabo);		
			this.jmenuAccionesTipoCargoLabo.add(this.jMenuItemCopiarTipoCargoLabo);		
			this.jmenuAccionesTipoCargoLabo.add(this.jMenuItemVerFormTipoCargoLabo);		
			
			this.jmenuDatosTipoCargoLabo.add(this.jMenuItemRecargarInformacionTipoCargoLabo);				
			this.jmenuDatosTipoCargoLabo.add(this.jMenuItemAnterioresTipoCargoLabo);				
			this.jmenuDatosTipoCargoLabo.add(this.jMenuItemSiguientesTipoCargoLabo);				
			this.jmenuDatosTipoCargoLabo.add(this.jMenuItemAbrirOrderByTipoCargoLabo);				
			this.jmenuDatosTipoCargoLabo.add(this.jMenuItemMostrarOcultarTipoCargoLabo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoCargoLabo.add(this.jMenuItemGuardarCambiosTipoCargoLabo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoCargoLabo.add(this.jmenuArchivoTipoCargoLabo);		
			this.jmenuBarTipoCargoLabo.add(this.jmenuAccionesTipoCargoLabo);		
			this.jmenuBarTipoCargoLabo.add(this.jmenuDatosTipoCargoLabo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoCargoLabo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoCargoLabo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoTipoCargoLabo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoTipoCargoLabo.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoTipoCargoLabo= new JButtonMe();
		this.jButtonBusquedaPorCodigoTipoCargoLabo.setText("Buscar");
		this.jButtonBusquedaPorCodigoTipoCargoLabo.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoTipoCargoLabo,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoTipoCargoLabo = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoTipoCargoLabo.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoTipoCargoLabo.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoTipoCargoLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoCargoLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoCargoLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoTipoCargoLabo,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoTipoCargoLabo= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoTipoCargoLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoCargoLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoCargoLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoTipoCargoLabo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreTipoCargoLabo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoCargoLabo.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoCargoLabo= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoCargoLabo.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoCargoLabo.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoCargoLabo,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoCargoLabo = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoCargoLabo.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoCargoLabo.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoCargoLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoCargoLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoCargoLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoCargoLabo,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoCargoLabo= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoCargoLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoCargoLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoCargoLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoCargoLabo,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoCargoLabo=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoCargoLabo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoCargoLabo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoCargoLabo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoCargoLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoCargoLabo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoCargoLabo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoCargoLabo = new TipoCargoLaboDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Cargo Laboral DATOS");
			this.jInternalFrameDetalleFormTipoCargoLabo = new TipoCargoLaboDetalleFormJInternalFrame(jDesktopPane,this.tipocargolaboSessionBean.getConGuardarRelaciones(),this.tipocargolaboSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoCargoLabo = null;//new TipoCargoLaboDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCargoLabo= new GridBagLayout();
		
		
		this.jTableDatosTipoCargoLabo = new JTableMe();      
		
		String sToolTipTipoCargoLabo="";
		sToolTipTipoCargoLabo=TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCargoLabo+="(Cartera.TipoCargoLabo)";
		}
		
		if(!this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCargoLabo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoCargoLabo.setToolTipText(sToolTipTipoCargoLabo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoCargoLabo);
		this.jTableDatosTipoCargoLabo.setAutoCreateRowSorter(true);
		this.jTableDatosTipoCargoLabo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoCargoLabo.setRowSelectionAllowed(true);
		this.jTableDatosTipoCargoLabo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoCargoLabo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoCargoLabo = new JButtonMe();
		this.jButtonDuplicarTipoCargoLabo = new JButtonMe();
		this.jButtonCopiarTipoCargoLabo = new JButtonMe();
		this.jButtonVerFormTipoCargoLabo = new JButtonMe();
		this.jButtonNuevoRelacionesTipoCargoLabo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoCargoLabo = new JButtonMe();
		this.jButtonCerrarTipoCargoLabo = new JButtonMe();
		
		this.jScrollPanelDatosTipoCargoLabo = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoCargoLabo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoCargoLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Cargo Laboral";
		
		if(!this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCargoLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cargo Laborals" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCargoLabo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoCargoLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoCargoLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCargoLabo.setToolTipText("Acciones");
        this.jPanelAccionesTipoCargoLabo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoCargoLabo=new ReporteDinamicoJInternalFrame(TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoCargoLabo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoCargoLabo=new ImportacionJInternalFrame(TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoCargoLabo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoCargoLabo = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoCargoLabo.setText("Orden");
		this.jButtonAbrirOrderByTipoCargoLabo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCargoLabo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoCargoLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoCargoLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCargoLabo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCargoLabo,false,this);
			
			//this.cargarOrderByTipoCargoLabo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCargoLabo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCargoLabo,true,this);
			
			//this.cargarOrderByTipoCargoLabo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoCargoLabo.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoCargoLabo.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoCargoLabo.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoCargoLabo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCargoLabo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCargoLabo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoCargoLabo.setText("Nuevo");
		this.jButtonDuplicarTipoCargoLabo.setText("Duplicar");
		this.jButtonCopiarTipoCargoLabo.setText("Copiar");
		this.jButtonVerFormTipoCargoLabo.setText("Ver");
		this.jButtonNuevoRelacionesTipoCargoLabo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoCargoLabo.setText("Guardar");
		this.jButtonCerrarTipoCargoLabo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCargoLabo,"nuevo_button","Nuevo",this.tipocargolaboSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoCargoLabo,"duplicar_button","Duplicar",this.tipocargolaboSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoCargoLabo,"copiar_button","Copiar",this.tipocargolaboSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoCargoLabo,"ver_form","Ver",this.tipocargolaboSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoCargoLabo,"nuevorelaciones_button","Nuevo Rel",this.tipocargolaboSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCargoLabo,"guardarcambiostabla_button","Guardar",this.tipocargolaboSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCargoLabo,"cerrar_button","Salir",this.tipocargolaboSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoCargoLabo.setToolTipText("Nuevo"+" "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoCargoLabo.setToolTipText("Duplicar"+" "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoCargoLabo.setToolTipText("Copiar"+" "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoCargoLabo.setToolTipText("Ver"+" "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoCargoLabo.setToolTipText("Nuevo Rel"+" "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoCargoLabo.setToolTipText("Guardar"+" "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCargoLabo.setToolTipText("Salir"+" "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCargoLabo";
		inputMap = this.jButtonNuevoTipoCargoLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCargoLabo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCargoLabo"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoCargoLabo";
		inputMap = this.jButtonDuplicarTipoCargoLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoCargoLabo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoCargoLabo"));
		
		//COPIAR
		sMapKey = "CopiarTipoCargoLabo";
		inputMap = this.jButtonCopiarTipoCargoLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoCargoLabo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoCargoLabo"));
		
		//VEr FORM
		sMapKey = "VerFormTipoCargoLabo";
		inputMap = this.jButtonVerFormTipoCargoLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoCargoLabo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoCargoLabo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoCargoLabo";
		inputMap = this.jButtonNuevoRelacionesTipoCargoLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoCargoLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoCargoLabo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoCargoLabo";
		inputMap = this.jButtonModificarTipoCargoLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoCargoLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoCargoLabo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoCargoLabo";
		inputMap = this.jButtonCerrarTipoCargoLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCargoLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCargoLabo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCargoLabo";
		inputMap = this.jButtonGuardarCambiosTablaTipoCargoLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCargoLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCargoLabo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoCargoLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoCargoLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoCargoLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoCargoLabo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoCargoLabo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoCargoLabo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoCargoLabo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoCargoLabo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoCargoLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoCargoLabo.setName("jPanelParametrosReportesTipoCargoLabo"); 
		
		this.jPanelParametrosReportesAccionesTipoCargoLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoCargoLabo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoCargoLabo.setName("jPanelParametrosReportesAccionesTipoCargoLabo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoCargoLabo = new JButtonMe();
		this.jButtonRecargarInformacionTipoCargoLabo.setText("Recargar");
		this.jButtonRecargarInformacionTipoCargoLabo.setToolTipText("Recargar"+" "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoCargoLabo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoCargoLabo = new JButtonMe();
		this.jButtonProcesarInformacionTipoCargoLabo.setText("Procesar");
		this.jButtonProcesarInformacionTipoCargoLabo.setToolTipText("Procesar"+" "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoCargoLabo.setVisible(false);
			
		this.jButtonProcesarInformacionTipoCargoLabo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCargoLabo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCargoLabo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoCargoLabo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCargoLabo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoCargoLabo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoCargoLabo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCargoLabo.setText("TIPO");       
		this.jComboBoxTiposReportesTipoCargoLabo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoCargoLabo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCargoLabo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoCargoLabo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoCargoLabo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoCargoLabo.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoCargoLabo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoCargoLabo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoCargoLabo.setText("Accion");
		this.jComboBoxTiposRelacionesTipoCargoLabo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoCargoLabo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCargoLabo.setText("Accion");
		this.jComboBoxTiposAccionesTipoCargoLabo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoCargoLabo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoCargoLabo.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoCargoLabo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoCargoLabo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoCargoLabo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCargoLabo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCargoLabo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoCargoLabo = new JLabelMe();
		
		this.jLabelAccionesTipoCargoLabo.setText("Acciones");		
		this.jLabelAccionesTipoCargoLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCargoLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCargoLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoCargoLabo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoCargoLabo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoCargoLabo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoCargoLabo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoCargoLabo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoCargoLabo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoCargoLabo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoCargoLabo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoCargoLabo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoCargoLabo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoCargoLabo.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoCargoLabo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoCargoLabo = new JButtonMe();
		//this.jButtonAnterioresTipoCargoLabo.setText("<<");
        this.jButtonAnterioresTipoCargoLabo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoCargoLabo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoCargoLabo = new JButtonMe();
		//this.jButtonSiguientesTipoCargoLabo.setText(">>");
        this.jButtonSiguientesTipoCargoLabo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoCargoLabo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoCargoLabo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoCargoLabo.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoCargoLabo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoCargoLabo,"nuevoguardarcambios_button","Nue",this.tipocargolaboSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoCargoLabo";
		inputMap = this.jButtonNuevoGuardarCambiosTipoCargoLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoCargoLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoCargoLabo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoCargoLabo";
		inputMap = this.jButtonRecargarInformacionTipoCargoLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoCargoLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoCargoLabo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoCargoLabo";
		inputMap = this.jButtonSiguientesTipoCargoLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoCargoLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoCargoLabo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoCargoLabo";
		inputMap = this.jButtonAnterioresTipoCargoLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoCargoLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoCargoLabo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoCargoLabo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoCargoLabo.setMinimumSize(new Dimension(this.getWidth(),TipoCargoLaboBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCargoLaboBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCargoLabo.setMaximumSize(new Dimension(this.getWidth(),TipoCargoLaboBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCargoLaboBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCargoLabo.setPreferredSize(new Dimension(this.getWidth(),TipoCargoLaboBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCargoLaboBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoCargoLabo = new GridBagLayout();

			this.jPanelPaginacionTipoCargoLabo.setLayout(gridaBagLayoutPaginacionTipoCargoLabo);						
			
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoCargoLabo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCargoLabo.gridy = 0;
			this.gridBagConstraintsTipoCargoLabo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoCargoLabo.add(this.jButtonAnterioresTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
					
						
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoCargoLabo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCargoLabo.gridy = 0;
			
			this.jPanelPaginacionTipoCargoLabo.add(this.jButtonNuevoGuardarCambiosTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
						
			
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoCargoLabo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoCargoLabo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCargoLabo.gridy = 0;
			this.jPanelPaginacionTipoCargoLabo.add(this.jButtonSiguientesTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCargoLabo.gridy = 1;
			this.gridBagConstraintsTipoCargoLabo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCargoLabo.add(this.jButtonNuevoTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
				this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoCargoLabo.gridy = 1;
				this.gridBagConstraintsTipoCargoLabo.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoCargoLabo.add(this.jButtonNuevoRelacionesTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
			}
			
			
			if(!this.tipocargolaboSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
				this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoCargoLabo.gridy = 1;
				this.gridBagConstraintsTipoCargoLabo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoCargoLabo.add(this.jButtonGuardarCambiosTablaTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
			}
			
			
			
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCargoLabo.gridy = 1;
			this.gridBagConstraintsTipoCargoLabo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCargoLabo.add(this.jButtonDuplicarTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
			
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCargoLabo.gridy = 1;
			this.gridBagConstraintsTipoCargoLabo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCargoLabo.add(this.jButtonCopiarTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
		
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCargoLabo.gridy = 1;
			this.gridBagConstraintsTipoCargoLabo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCargoLabo.add(this.jButtonVerFormTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
		
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCargoLabo.gridy = 1;
			this.gridBagConstraintsTipoCargoLabo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoCargoLabo.add(this.jButtonCerrarTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
		
		
		
		this.jButtonRecargarInformacionTipoCargoLabo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCargoLabo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCargoLabo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoCargoLabo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCargoLabo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCargoLabo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoCargoLabo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCargoLabo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCargoLabo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoCargoLabo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCargoLabo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCargoLabo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoCargoLabo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCargoLabo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCargoLabo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoCargoLabo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCargoLabo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCargoLabo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoCargoLabo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCargoLabo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCargoLabo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoCargoLabo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCargoLabo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCargoLabo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoCargoLabo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCargoLabo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCargoLabo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoCargoLabo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCargoLabo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCargoLabo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoCargoLabo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCargoLabo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCargoLabo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoCargoLabo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCargoLabo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCargoLabo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoCargoLabo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoCargoLabo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoCargoLabo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoCargoLabo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoCargoLabo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoCargoLabo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoCargoLabo.setLayout(gridaBagParametrosReportesTipoCargoLabo);
			this.jPanelParametrosReportesAccionesTipoCargoLabo.setLayout(gridaBagParametrosReportesAccionesTipoCargoLabo);
			
			
			this.jPanelParametrosAuxiliar1TipoCargoLabo.setLayout(gridaBagParametrosAuxiliar1TipoCargoLabo);
			this.jPanelParametrosAuxiliar2TipoCargoLabo.setLayout(gridaBagParametrosAuxiliar2TipoCargoLabo);
			this.jPanelParametrosAuxiliar3TipoCargoLabo.setLayout(gridaBagParametrosAuxiliar3TipoCargoLabo);
			this.jPanelParametrosAuxiliar4TipoCargoLabo.setLayout(gridaBagParametrosAuxiliar4TipoCargoLabo);
			//this.jPanelParametrosAuxiliar5TipoCargoLabo.setLayout(gridaBagParametrosAuxiliar2TipoCargoLabo);			
			
			
			
			
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCargoLabo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCargoLabo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCargoLabo.add(this.jButtonRecargarInformacionTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoCargoLabo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCargoLabo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCargoLabo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCargoLabo.add(this.jComboBoxTiposPaginacionTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoCargoLabo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCargoLabo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCargoLabo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCargoLabo.add(this.jCheckBoxConAltoMaximoTablaTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoCargoLabo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCargoLabo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCargoLabo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCargoLabo.add(this.jComboBoxTiposArchivosReportesTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoCargoLabo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCargoLabo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCargoLabo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCargoLabo.add(this.jPanelParametrosAuxiliar1TipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoCargoLabo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCargoLabo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCargoLabo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoCargoLabo.add(this.jComboBoxTiposReportesTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoCargoLabo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCargoLabo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCargoLabo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCargoLabo.add(this.jPanelParametrosAuxiliar4TipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoCargoLabo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCargoLabo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCargoLabo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCargoLabo.add(this.jComboBoxTiposReportesTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoCargoLabo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCargoLabo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCargoLabo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCargoLabo.add(this.jCheckBoxGenerarReporteTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoCargoLabo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCargoLabo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCargoLabo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCargoLabo.add(this.jPanelParametrosAuxiliar2TipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCargoLabo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCargoLabo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCargoLabo.add(this.jLabelAccionesTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
				this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoCargoLabo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoCargoLabo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoCargoLabo.add(this.jButtonAbrirOrderByTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoCargoLabo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCargoLabo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCargoLabo.add(this.jComboBoxTiposSeleccionarTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);			
			
			
			/*
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCargoLabo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCargoLabo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCargoLabo.add(this.jCheckBoxSeleccionarTodosTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoCargoLabo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCargoLabo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCargoLabo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCargoLabo.add(this.jCheckBoxSeleccionarTodosTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);															
				
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoCargoLabo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCargoLabo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCargoLabo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCargoLabo.add(this.jCheckBoxSeleccionadosTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoCargoLabo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCargoLabo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCargoLabo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCargoLabo.add(this.jPanelParametrosAuxiliar3TipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoCargoLabo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCargoLabo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCargoLabo.add(this.jComboBoxTiposRelacionesTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
				
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoCargoLabo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCargoLabo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCargoLabo.add(this.jComboBoxTiposAccionesTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoCargoLabo = new GridBagLayout();

			this.jScrollPanelDatosTipoCargoLabo.setLayout(gridaBagLayoutDatosTipoCargoLabo);
			
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCargoLabo.gridy = 0;
			this.gridBagConstraintsTipoCargoLabo.gridx = 0;
			
			this.jScrollPanelDatosTipoCargoLabo.add(this.jTableDatosTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoCargoLabo.setViewportView(this.jTableDatosTipoCargoLabo);
		this.jTableDatosTipoCargoLabo.setFillsViewportHeight(true);
		this.jTableDatosTipoCargoLabo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoCargoLabo= new GridBagLayout();
		this.jPanelAccionesTipoCargoLabo.setLayout(gridaBagLayoutAccionesTipoCargoLabo);
		
		
		/*	
		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCargoLabo.gridy = 0;
		this.gridBagConstraintsTipoCargoLabo.gridx = 0;
			
		this.jPanelAccionesTipoCargoLabo.add(this.jButtonNuevoTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoTipoCargoLabo= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoTipoCargoLabo.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoCargoLabo.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoCargoLabo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoTipoCargoLabo.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoTipoCargoLabo.setLayout(gridaBagLayoutBusquedaPorCodigoTipoCargoLabo);

		gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		gridBagConstraintsTipoCargoLabo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCargoLabo.gridy = 0;
		gridBagConstraintsTipoCargoLabo.gridx = 0;
		jPanelBusquedaPorCodigoTipoCargoLabo.add(jLabelcodigoBusquedaPorCodigoTipoCargoLabo, gridBagConstraintsTipoCargoLabo);

		gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		gridBagConstraintsTipoCargoLabo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCargoLabo.gridy = 0;
		gridBagConstraintsTipoCargoLabo.gridx = 1;
		jPanelBusquedaPorCodigoTipoCargoLabo.add(jTextFieldcodigoBusquedaPorCodigoTipoCargoLabo, gridBagConstraintsTipoCargoLabo);

		gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		gridBagConstraintsTipoCargoLabo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCargoLabo.gridy = 1;
		gridBagConstraintsTipoCargoLabo.gridx =1;
		jPanelBusquedaPorCodigoTipoCargoLabo.add(jButtonBusquedaPorCodigoTipoCargoLabo, gridBagConstraintsTipoCargoLabo);

		jTabbedPaneBusquedasTipoCargoLabo.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoTipoCargoLabo);
		jTabbedPaneBusquedasTipoCargoLabo.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoCargoLabo= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoCargoLabo.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoCargoLabo.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoCargoLabo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoCargoLabo.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoCargoLabo.setLayout(gridaBagLayoutBusquedaPorNombreTipoCargoLabo);

		gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		gridBagConstraintsTipoCargoLabo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCargoLabo.gridy = 0;
		gridBagConstraintsTipoCargoLabo.gridx = 0;
		jPanelBusquedaPorNombreTipoCargoLabo.add(jLabelnombreBusquedaPorNombreTipoCargoLabo, gridBagConstraintsTipoCargoLabo);

		gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		gridBagConstraintsTipoCargoLabo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCargoLabo.gridy = 0;
		gridBagConstraintsTipoCargoLabo.gridx = 1;
		jPanelBusquedaPorNombreTipoCargoLabo.add(jTextAreanombreBusquedaPorNombreTipoCargoLabo, gridBagConstraintsTipoCargoLabo);

		gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		gridBagConstraintsTipoCargoLabo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCargoLabo.gridy = 1;
		gridBagConstraintsTipoCargoLabo.gridx =1;
		jPanelBusquedaPorNombreTipoCargoLabo.add(jButtonBusquedaPorNombreTipoCargoLabo, gridBagConstraintsTipoCargoLabo);

		jTabbedPaneBusquedasTipoCargoLabo.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreTipoCargoLabo);
		jTabbedPaneBusquedasTipoCargoLabo.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCargoLabo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCargoLabo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();						
			this.gridBagConstraintsTipoCargoLabo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCargoLabo.gridx = 0;		
			//this.gridBagConstraintsTipoCargoLabo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCargoLabo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCargoLabo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoCargoLabo.gridx = 0;		
		//this.gridBagConstraintsTipoCargoLabo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCargoLabo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoCargoLabo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoCargoLabo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoCargoLabo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCargoLabo.gridx = 0;		
			this.gridBagConstraintsTipoCargoLabo.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCargoLabo.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoCargoLabo.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCargoLabo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);								
		
		
		/*
		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCargoLabo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
		*/		
		
		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCargoLabo.gridx =0;
		this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCargoLabo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
				
		
		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCargoLabo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoCargoLaboJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoCargoLabo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCargoLabo = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoCargoLabo.setLayout(gridaBagLayoutBusquedasParametrosTipoCargoLabo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoCargoLabo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCargoLabo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCargoLabo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCargoLabo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCargoLabo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
			
			
		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCargoLabo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
		
			
		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCargoLabo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoCargoLabo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoCargoLabo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoCargoLabo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoCargoLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoCargoLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoCargoLabo.setName("jPanelReporteDinamicoTipoCargoLabo"); 
		
		this.jPanelReporteDinamicoTipoCargoLabo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCargoLabo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCargoLabo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoCargoLabo.setLayout(gridaBagLayoutReporteDinamicoTipoCargoLabo);
		
		
		this.jInternalFrameReporteDinamicoTipoCargoLabo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoCargoLabo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCargoLabo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoCargoLabo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoCargoLabo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoCargoLabo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoCargoLabo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoCargoLabo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoCargoLabo.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoCargoLabo.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoCargoLabo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoCargoLabo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCargoLabo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCargoLabo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoCargoLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cargo Laborals"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoCargoLabo = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoCargoLabo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoCargoLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCargoLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCargoLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCargoLabo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCargoLabo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoCargoLabo.add(this.jLabelColumnasSelectReporteTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoCargoLabo = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoCargoLabo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoCargoLabo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoCargoLabo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCargoLabo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCargoLabo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoCargoLabo=new JScrollPane(this.jListColumnasSelectReporteTipoCargoLabo);
			
			this.jScrollColumnasSelectReporteTipoCargoLabo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCargoLabo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCargoLabo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoCargoLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCargoLabo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCargoLabo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoCargoLabo.add(this.jListColumnasSelectReporteTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
		this.jPanelReporteDinamicoTipoCargoLabo.add(this.jScrollColumnasSelectReporteTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoCargoLabo = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoCargoLabo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoCargoLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCargoLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCargoLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCargoLabo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCargoLabo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoCargoLabo.add(this.jLabelRelacionesSelectReporteTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoCargoLabo = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoCargoLabo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoCargoLabo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoCargoLabo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCargoLabo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCargoLabo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoCargoLabo=new JScrollPane(this.jListRelacionesSelectReporteTipoCargoLabo);
			
			this.jScrollRelacionesSelectReporteTipoCargoLabo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCargoLabo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCargoLabo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoCargoLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCargoLabo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCargoLabo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoCargoLabo.add(this.jListRelacionesSelectReporteTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
		this.jPanelReporteDinamicoTipoCargoLabo.add(this.jScrollRelacionesSelectReporteTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoCargoLabo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoCargoLabo = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoCargoLabo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoCargoLabo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoCargoLabo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoCargoLabo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCargoLabo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCargoLabo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoCargoLabo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCargoLabo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCargoLabo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCargoLabo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCargoLabo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoCargoLabo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoCargoLabo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoCargoLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCargoLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCargoLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCargoLabo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCargoLabo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCargoLabo.add(this.jLabelGenerarExcelReporteDinamicoTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoCargoLabo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoCargoLabo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoCargoLabo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoCargoLabo.setToolTipText("Generar EXCEL"+" "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		//this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoCargoLabo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoCargoLabo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoCargoLabo.add(this.jButtonGenerarExcelReporteDinamicoTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCargoLabo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCargoLabo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCargoLabo.add(this.jComboBoxTiposReportesDinamicoTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoCargoLabo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoCargoLabo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoCargoLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCargoLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCargoLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCargoLabo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCargoLabo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCargoLabo.add(this.jLabelTiposArchivoReporteDinamicoTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCargoLabo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCargoLabo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCargoLabo.add(this.jComboBoxTiposArchivosReportesDinamicoTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoCargoLabo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoCargoLabo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoCargoLabo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoCargoLabo.setToolTipText("Generar"+" "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCargoLabo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCargoLabo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCargoLabo.add(this.jButtonGenerarReporteDinamicoTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoCargoLabo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoCargoLabo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoCargoLabo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoCargoLabo.setToolTipText("Cancelar"+" "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCargoLabo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCargoLabo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCargoLabo.add(this.jButtonCerrarReporteDinamicoTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoCargoLabo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoCargoLabo= new JScrollPane(jPanelReporteDinamicoTipoCargoLabo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoCargoLabo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCargoLabo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCargoLabo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoCargoLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cargo Laborals"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoCargoLabo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoCargoLabo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoCargoLabo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoCargoLabo);
		this.jInternalFrameReporteDinamicoTipoCargoLabo.getContentPane().add(this.jScrollPanelReporteDinamicoTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoCargoLabo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoCargoLabo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoCargoLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoCargoLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoCargoLabo.setName("jPanelImportacionTipoCargoLabo"); 
		
		this.jPanelImportacionTipoCargoLabo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCargoLabo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCargoLabo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoCargoLabo.setLayout(gridaBagLayoutImportacionTipoCargoLabo);
		
		
		this.jInternalFrameImportacionTipoCargoLabo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoCargoLabo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoCargoLabo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCargoLabo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoCargoLabo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCargoLabo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCargoLabo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoCargoLabo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCargoLabo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCargoLabo.setResizable(true);
	    this.jInternalFrameImportacionTipoCargoLabo.setClosable(true);
	    this.jInternalFrameImportacionTipoCargoLabo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoCargoLabo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCargoLabo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCargoLabo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoCargoLabo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCargoLabo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCargoLabo.setResizable(true);
	    this.jInternalFrameImportacionTipoCargoLabo.setClosable(true);
	    this.jInternalFrameImportacionTipoCargoLabo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoCargoLabo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCargoLabo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCargoLabo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoCargoLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cargo Laborals"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoCargoLabo = new JLabelMe();

		this.jLabelArchivoImportacionTipoCargoLabo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoCargoLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCargoLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCargoLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCargoLabo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCargoLabo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCargoLabo.add(this.jLabelArchivoImportacionTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoCargoLabo = new JFileChooser();		
		this.jFileChooserImportacionTipoCargoLabo.setToolTipText("ESCOGER ARCHIVO"+" "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoCargoLabo = new JButtonMe();
		this.jButtonAbrirImportacionTipoCargoLabo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoCargoLabo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoCargoLabo.setToolTipText("Generar"+" "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCargoLabo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCargoLabo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCargoLabo.add(this.jButtonAbrirImportacionTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoCargoLabo = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoCargoLabo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoCargoLabo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCargoLabo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCargoLabo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCargoLabo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCargoLabo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCargoLabo.add(this.jLabelPathArchivoImportacionTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoCargoLabo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoCargoLabo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCargoLabo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCargoLabo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCargoLabo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCargoLabo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCargoLabo.add(this.jTextFieldPathArchivoImportacionTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoCargoLabo = new JButtonMe();
		this.jButtonGenerarImportacionTipoCargoLabo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoCargoLabo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoCargoLabo.setToolTipText("Generar"+" "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCargoLabo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCargoLabo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCargoLabo.add(this.jButtonGenerarImportacionTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoCargoLabo = new JButtonMe();
		this.jButtonCerrarImportacionTipoCargoLabo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoCargoLabo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoCargoLabo.setToolTipText("Cancelar"+" "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCargoLabo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCargoLabo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCargoLabo.add(this.jButtonCerrarImportacionTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoCargoLabo = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoCargoLabo= new JScrollPane(jPanelImportacionTipoCargoLabo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
		this.gridBagConstraintsTipoCargoLabo.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoCargoLabo.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoCargoLabo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoCargoLabo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoCargoLabo);
		this.jInternalFrameImportacionTipoCargoLabo.getContentPane().add(this.jScrollPanelImportacionTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoCargoLabo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoCargoLabo = new JButtonMe();
			this.jButtonAbrirOrderByTipoCargoLabo.setText("Orden");
			this.jButtonAbrirOrderByTipoCargoLabo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCargoLabo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoCargoLabo";
			inputMap = this.jButtonAbrirOrderByTipoCargoLabo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoCargoLabo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoCargoLabo"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoCargoLabo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoCargoLabo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoCargoLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoCargoLabo.setName("jPanelOrderByTipoCargoLabo"); 
			
			this.jPanelOrderByTipoCargoLabo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCargoLabo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCargoLabo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoCargoLabo.setLayout(gridaBagLayoutOrderByTipoCargoLabo);
			
			
			this.jTableDatosTipoCargoLaboOrderBy = new JTableMe();        
			this.jTableDatosTipoCargoLaboOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoCargoLaboOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoCargoLaboOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoCargoLaboOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoCargoLaboOrderBy.setViewportView(this.jTableDatosTipoCargoLaboOrderBy);
			this.jTableDatosTipoCargoLaboOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoCargoLaboOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoCargoLabo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoCargoLabo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoCargoLabo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoCargoLabo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoCargoLabo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoCargoLabo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoCargoLabo.setTitle("Orden");
			this.jInternalFrameOrderByTipoCargoLabo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoCargoLabo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoCargoLabo.setResizable(true);
			this.jInternalFrameOrderByTipoCargoLabo.setClosable(true);
			this.jInternalFrameOrderByTipoCargoLabo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoCargoLabo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCargoLabo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCargoLabo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoCargoLabo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cargo Laborals"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoCargoLabo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoCargoLabo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoCargoLabo.ipady =150;
				
			this.jPanelOrderByTipoCargoLabo.add(jScrollPanelDatosTipoCargoLaboOrderBy, this.gridBagConstraintsTipoCargoLabo);//this.jTableDatosTipoCargoLaboTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoCargoLabo = new JButtonMe();
			this.jButtonCerrarOrderByTipoCargoLabo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoCargoLabo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoCargoLabo.setToolTipText("Cancelar"+" "+TipoCargoLaboConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoCargoLabo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCargoLabo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoCargoLabo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoCargoLabo.add(this.jButtonCerrarOrderByTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoCargoLabo = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoCargoLabo= new JScrollPane(jPanelOrderByTipoCargoLabo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoCargoLabo = new GridBagConstraints();
			this.gridBagConstraintsTipoCargoLabo.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoCargoLabo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCargoLabo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoCargoLabo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoCargoLabo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoCargoLabo);
			
			this.jInternalFrameOrderByTipoCargoLabo.getContentPane().add(this.jScrollPanelOrderByTipoCargoLabo, this.gridBagConstraintsTipoCargoLabo);			
		
		} else {
			this.jButtonAbrirOrderByTipoCargoLabo = new JButtonMe();
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
			&& this.tipocargolaboSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoCargoLabo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoCargoLabo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoCargoLabo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoCargoLabo.getRowHeight();//TipoCargoLaboConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoCargoLaboConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCargoLabo.isSelected()) {
					iHeightTable=TipoCargoLaboConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCargoLaboConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCargoLaboConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoCargoLaboConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCargoLabo.isSelected()) {
					iHeightTable=TipoCargoLaboConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCargoLaboConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCargoLaboConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoCargoLabo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCargoLabo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCargoLabo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoCargoLabo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCargoLabo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCargoLabo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoCargoLabo!=null && this.jInternalFrameOrderByTipoCargoLabo.getjTableDatosOrderBy()!=null) {
			//if(!this.tipocargolaboSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoCargoLabo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoCargoLabo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoCargoLabo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoCargoLabo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoCargoLabo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoCargoLabo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoCargoLabo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoCargoLabo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCargoLabo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCargoLabo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipocargolaboLogic.getTipoCargoLabos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocargolabos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoCargoLabo> TraerTipoCargoLaboBeans(List<TipoCargoLabo> tipocargolabos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoCargoLabo tipocargolabo:tipocargolabos) {
					
				if(!(TipoCargoLaboConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoCargoLaboConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipocargolabo.setsDetalleGeneralEntityReporte(TipoCargoLaboConstantesFunciones.getTipoCargoLaboDescripcion(tipocargolabo));
										
						
					
					

					if(tipocargolabo.getClientes()!=null && Funciones.existeClass(classes,Cliente.class)) {
						try{tipocargolabo.setclientesDescripcionReporte(new JRBeanCollectionDataSource(ClienteJInternalFrame.TraerClienteBeans(tipocargolabo.getClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipocargolabo.setsDetalleGeneralEntityReporte(tipocargolabo.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipocargolabobeans.add(tipocargolabobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipocargolabos;
    }
	//PARA REPORTES FIN
}
