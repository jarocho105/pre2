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
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

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
import com.bydan.erp.contabilidad.util.TipoTributarioConstantesFunciones;

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
public class TipoTributarioJInternalFrame extends TipoTributarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoTributario;
	
	protected JMenuBar jmenuBarTipoTributario;
	
	protected JMenu jmenuTipoTributario;
	protected JMenu jmenuDatosTipoTributario;
	protected JMenu jmenuArchivoTipoTributario;
	protected JMenu jmenuAccionesTipoTributario;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoTributario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoTributario;	
	protected GridBagConstraints gridBagConstraintsTipoTributario;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoTributarioDetalleFormJInternalFrame jInternalFrameDetalleFormTipoTributario;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoTributario;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoTributario;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public TipoTributarioSessionBean tipotributarioSessionBean;
		
	
	
	public PaisSessionBean paisSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoTributario> tipotributarios;		
	public List<TipoTributario> tipotributariosEliminados;	
	public List<TipoTributario> tipotributariosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoTributario;		
	protected JButton jButtonAbrirOrderByTipoTributario;
	
	
	//protected JPanel jPanelOrderByTipoTributario;
	//public JScrollPane jScrollPanelOrderByTipoTributario;	
	//protected JButton jButtonCerrarOrderByTipoTributario;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoTributarioLogic tipotributarioLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoTributario;
	public JScrollPane jScrollPanelDatosEdicionTipoTributario;
	public JScrollPane jScrollPanelDatosGeneralTipoTributario;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoTributarioOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoTributario;
	//public JScrollPane jScrollPanelImportacionTipoTributario;
	
	
	
	protected JPanel jPanelAccionesTipoTributario;
	
    protected JPanel jPanelPaginacionTipoTributario;
    protected JPanel jPanelParametrosReportesTipoTributario;
	protected JPanel jPanelParametrosReportesAccionesTipoTributario;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoTributario;
	protected JPanel jPanelParametrosAuxiliar2TipoTributario;
	protected JPanel jPanelParametrosAuxiliar3TipoTributario;
	protected JPanel jPanelParametrosAuxiliar4TipoTributario;
	//protected JPanel jPanelParametrosAuxiliar5TipoTributario;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoTributario;
	//protected JPanel jPanelImportacionTipoTributario;
	
	
	public JTable jTableDatosTipoTributario;
	
	
	
	//public JTable jTableDatosTipoTributarioOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoTributario;
	protected JButton jButtonDuplicarTipoTributario;
	protected JButton jButtonCopiarTipoTributario;
	protected JButton jButtonVerFormTipoTributario;
	protected JButton jButtonNuevoRelacionesTipoTributario;
	protected JButton jButtonModificarTipoTributario;
	
    protected JButton jButtonGuardarCambiosTablaTipoTributario;
	protected JButton jButtonCerrarTipoTributario;
	
	
	protected JButton jButtonRecargarInformacionTipoTributario;
	protected JButton jButtonProcesarInformacionTipoTributario;
	
	
	protected JButton jButtonAnterioresTipoTributario;
	protected JButton jButtonSiguientesTipoTributario;
	protected JButton jButtonNuevoGuardarCambiosTipoTributario;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoTributario;
	//protected JButton jButtonCerrarReporteDinamicoTipoTributario;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoTributario;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoTributario;
	//protected JButton jButtonGenerarImportacionTipoTributario;
	//protected JButton jButtonCerrarImportacionTipoTributario;
	//protected JFileChooser jFileChooserImportacionTipoTributario;
	//protected File fileImportacionTipoTributario;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoTributario;
	protected JButton jButtonDuplicarToolBarTipoTributario;
	protected JButton jButtonNuevoRelacionesToolBarTipoTributario;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoTributario;
	protected JButton jButtonCopiarToolBarTipoTributario;
	protected JButton jButtonVerFormToolBarTipoTributario;
	public JButton jButtonGuardarCambiosTablaToolBarTipoTributario;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoTributario;
	protected JButton jButtonCerrarToolBarTipoTributario;
	
	protected JButton jButtonRecargarInformacionToolBarTipoTributario;
	protected JButton jButtonProcesarInformacionToolBarTipoTributario;
	protected JButton jButtonAnterioresToolBarTipoTributario;
	protected JButton jButtonSiguientesToolBarTipoTributario;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoTributario;
	protected JButton jButtonAbrirOrderByToolBarTipoTributario;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoTributario;
	protected JMenuItem jMenuItemDuplicarTipoTributario;
	protected JMenuItem jMenuItemNuevoRelacionesTipoTributario;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoTributario;
	protected JMenuItem jMenuItemCopiarTipoTributario;
	protected JMenuItem jMenuItemVerFormTipoTributario;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoTributario;
	protected JMenuItem jMenuItemCerrarTipoTributario;
	protected JMenuItem jMenuItemDetalleCerrarTipoTributario;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoTributario;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoTributario;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoTributario;
	protected JMenuItem jMenuItemProcesarInformacionTipoTributario;
	protected JMenuItem jMenuItemAnterioresTipoTributario;
	protected JMenuItem jMenuItemSiguientesTipoTributario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoTributario;
	protected JMenuItem jMenuItemAbrirOrderByTipoTributario;
	protected JMenuItem jMenuItemMostrarOcultarTipoTributario;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoTributario;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoTributario;
	protected JCheckBox jCheckBoxSeleccionadosTipoTributario;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoTributario;
	protected JCheckBox jCheckBoxConGraficoReporteTipoTributario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoTributario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoTributario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoTributario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoTributario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoTributario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoTributario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoTributario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoTributario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoTributario;
	protected JTextField jTextFieldValorCampoGeneralTipoTributario;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoTributario;
	//public JList<Reporte> jListColumnasSelectReporteTipoTributario;
	//public JScrollPane jScrollColumnasSelectReporteTipoTributario;
	
	//public JLabel jLabelRelacionesSelectReporteTipoTributario;
	//public JList<Reporte> jListRelacionesSelectReporteTipoTributario;
	//public JScrollPane jScrollRelacionesSelectReporteTipoTributario;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoTributario;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoTributario;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoTributario;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoTributario;
	
		
	//public JLabel jLabelArchivoImportacionTipoTributario;	
	//public JLabel jLabelPathArchivoImportacionTipoTributario;
	//protected JTextField jTextFieldPathArchivoImportacionTipoTributario;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoTributario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoTributario;
	
	//public JLabel jLabelColumnaCategoriaValorTipoTributario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoTributario;
	
	//public JLabel jLabelColumnasValoresGraficoTipoTributario;
	//public JList<Reporte> jListColumnasValoresGraficoTipoTributario;
	//public JScrollPane jScrollColumnasValoresGraficoTipoTributario;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoTributario;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoTributario;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoTributario;
	public JPanel jPanelBusquedaPorCodigoTipoTributario;
	public JButton jButtonBusquedaPorCodigoTipoTributario;
	public JPanel jPanelBusquedaPorIdTipoTributario;
	public JButton jButtonBusquedaPorIdTipoTributario;
	public JPanel jPanelBusquedaPorNombreTipoTributario;
	public JButton jButtonBusquedaPorNombreTipoTributario;
	public JPanel jPanelFK_IdPaisTipoTributario;
	public JButton jButtonFK_IdPaisTipoTributario;
	
	public JPanel jPanelcodigoBusquedaPorCodigoTipoTributario;
	public JLabel jLabelcodigoBusquedaPorCodigoTipoTributario;
	public JTextArea jTextAreacodigoBusquedaPorCodigoTipoTributario;
	public JButton jButtoncodigoBusquedaPorCodigoTipoTributarioBusqueda= new JButtonMe();

	
	public JPanel jPanelIdIdBusquedaPorIdTipoTributario;
	public JLabel jLabelidBusquedaPorIdTipoTributario;
	public JTextFieldMe jLabelidTipoTributarioBusquedaPorId;
	public JButton jButtonidBusquedaPorIdTipoTributarioBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTipoTributario;
	public JLabel jLabelnombreBusquedaPorNombreTipoTributario;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoTributario;
	public JButton jButtonnombreBusquedaPorNombreTipoTributarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisFK_IdPaisTipoTributario;
	public JLabel jLabelid_paisFK_IdPaisTipoTributario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisTipoTributario;
	public JButton jButtonid_paisFK_IdPaisTipoTributario= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisTipoTributarioUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisTipoTributarioBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoTributarioJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoTributario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTributarioJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoTributario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTributarioJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoTributario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTributarioJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoTributario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoTributario)	{
		this.jButtonRecargarInformacionTipoTributario = jButtonRecargarInformacionTipoTributario;
	}
	
	public JButton getjButtonProcesarInformacionTipoTributario() {
		return this.jButtonProcesarInformacionTipoTributario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoTributario)	{
		this.jButtonProcesarInformacionTipoTributario = jButtonProcesarInformacionTipoTributario;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoTributario() {
		return this.jButtonRecargarInformacionTipoTributario;
	}
	
	
	public List<TipoTributario> gettipotributarios() {
		return this.tipotributarios;
	}

	public void settipotributarios(List<TipoTributario> tipotributarios) {
		this.tipotributarios = tipotributarios;
	}
	
	public List<TipoTributario> gettipotributariosAux() {
		return this.tipotributariosAux;
	}

	public void settipotributariosAux(List<TipoTributario> tipotributariosAux) {
		this.tipotributariosAux = tipotributariosAux;
	}
	
	public List<TipoTributario> gettipotributariosEliminados() {
		return this.tipotributariosEliminados;
	}

	public void setTipoTributariosEliminados(List<TipoTributario> tipotributariosEliminados) {
		this.tipotributariosEliminados = tipotributariosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoTributario() {
		return jComboBoxTiposSeleccionarTipoTributario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoTributario(
			JComboBox jComboBoxTiposSeleccionarTipoTributario) {
		this.jComboBoxTiposSeleccionarTipoTributario = jComboBoxTiposSeleccionarTipoTributario;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoTributario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoTributario.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoTributario .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoTributario() {
		return jTextFieldValorCampoGeneralTipoTributario;
	}

	public void setjTextFieldValorCampoGeneralTipoTributario(
			JTextField jTextFieldValorCampoGeneralTipoTributario) {
		this.jTextFieldValorCampoGeneralTipoTributario = jTextFieldValorCampoGeneralTipoTributario;
	}

	public void setBorderResaltarValorCampoGeneralTipoTributario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTributario.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoTributario .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoTributario() {
		return this.jCheckBoxSeleccionarTodosTipoTributario;
	}

	public void setjCheckBoxSeleccionarTodosTipoTributario(
			JCheckBox jCheckBoxSeleccionarTodosTipoTributario) {
		this.jCheckBoxSeleccionarTodosTipoTributario = jCheckBoxSeleccionarTodosTipoTributario;
	}

	public void setBorderResaltarSeleccionarTodosTipoTributario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTributario.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoTributario .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoTributario() {
		return this.jCheckBoxSeleccionadosTipoTributario;
	}

	public void setjCheckBoxSeleccionadosTipoTributario(
			JCheckBox jCheckBoxSeleccionadosTipoTributario) {
		this.jCheckBoxSeleccionadosTipoTributario = jCheckBoxSeleccionadosTipoTributario;
	}
	
	public void setBorderResaltarSeleccionadosTipoTributario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTributario.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoTributario .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoTributario() {
		return this.jComboBoxTiposArchivosReportesTipoTributario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoTributario(
			JComboBox jComboBoxTiposArchivosReportesTipoTributario) {
		this.jComboBoxTiposArchivosReportesTipoTributario = jComboBoxTiposArchivosReportesTipoTributario;
	}

	public void setBorderResaltarTiposArchivosReportesTipoTributario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTributario.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoTributario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoTributario() {
		return this.jComboBoxTiposReportesTipoTributario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoTributario(
			JComboBox jComboBoxTiposReportesTipoTributario) {
		this.jComboBoxTiposReportesTipoTributario = jComboBoxTiposReportesTipoTributario;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoTributario() {
	//	return jComboBoxTiposReportesDinamicoTipoTributario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoTributario(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoTributario) {
	//	this.jComboBoxTiposReportesDinamicoTipoTributario = jComboBoxTiposReportesDinamicoTipoTributario;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoTributario() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoTributario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoTributario(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoTributario) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoTributario = jComboBoxTiposArchivosReportesDinamicoTipoTributario;
	//}
	
	public void setBorderResaltarTiposReportesTipoTributario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTributario.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoTributario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoTributario() {
		return this.jComboBoxTiposGraficosReportesTipoTributario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoTributario(
			JComboBox jComboBoxTiposGraficosReportesTipoTributario) {
		this.jComboBoxTiposGraficosReportesTipoTributario = jComboBoxTiposGraficosReportesTipoTributario;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoTributario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTributario.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoTributario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoTributario() {
		return this.jComboBoxTiposPaginacionTipoTributario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoTributario(
			JComboBox jComboBoxTiposPaginacionTipoTributario) {
		this.jComboBoxTiposPaginacionTipoTributario = jComboBoxTiposPaginacionTipoTributario;
	}
	
	public void setBorderResaltarTiposPaginacionTipoTributario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTributario.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoTributario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoTributario() {
		return this.jComboBoxTiposRelacionesTipoTributario;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoTributario() {
		return this.jComboBoxTiposAccionesTipoTributario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoTributario(
			JComboBox jComboBoxTiposRelacionesTipoTributario) {
		this.jComboBoxTiposRelacionesTipoTributario = jComboBoxTiposRelacionesTipoTributario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoTributario(
			JComboBox jComboBoxTiposAccionesTipoTributario) {
		this.jComboBoxTiposAccionesTipoTributario = jComboBoxTiposAccionesTipoTributario;
	}
	
	public void setBorderResaltarTiposRelacionesTipoTributario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTributario.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoTributario .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoTributario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTributario.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoTributario .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoTributario() {
	//	return jCheckBoxConGraficoDinamicoTipoTributario;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoTributario(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoTributario) {
	//	this.jCheckBoxConGraficoDinamicoTipoTributario = jCheckBoxConGraficoDinamicoTipoTributario;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoTributario() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoTributario.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoTributario .setBorder(borderResaltar);		
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
		this.tipotributarioSessionBean=new TipoTributarioSessionBean();
		
		this.tipotributarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipotributarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipotributarioSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoTributarioJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoTributarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoTributarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoTributarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoTributarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Tributario MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipotributarioSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoTributarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoTributario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoTributario= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoTributario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoTributario,this.jTtoolBarTipoTributario,
							"nuevo","nuevo","Nuevo"+" "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoTributario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoTributario,this.jTtoolBarTipoTributario,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoTributario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoTributario,this.jTtoolBarTipoTributario,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoTributario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoTributario,this.jTtoolBarTipoTributario,
							"duplicar","duplicar","Duplicar"+" "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoTributario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoTributario,this.jTtoolBarTipoTributario,
							"copiar","copiar","Copiar"+" "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoTributario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoTributario,this.jTtoolBarTipoTributario,
							"ver_form","ver_form","Ver"+" "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoTributario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoTributario,this.jTtoolBarTipoTributario,
							"recargar","recargar","Recargar"+" "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoTributario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoTributario,this.jTtoolBarTipoTributario,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoTributario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoTributario,this.jTtoolBarTipoTributario,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoTributario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoTributario,this.jTtoolBarTipoTributario,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoTributario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoTributario,this.jTtoolBarTipoTributario,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoTributario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoTributario,this.jTtoolBarTipoTributario,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoTributario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoTributario,this.jTtoolBarTipoTributario,
							"cerrar","cerrar","Salir"+" "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoTributario=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoTributario;
			
				this.jButtonProcesarInformacionToolBarTipoTributario=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoTributario;
				
		//protected JButton jButtonModificarToolBarTipoTributario;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoTributario=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoTributario=new JMenuMe("General");
		this.jmenuArchivoTipoTributario=new JMenuMe("Archivo");
		this.jmenuAccionesTipoTributario=new JMenuMe("Acciones");
		this.jmenuDatosTipoTributario=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoTributario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoTributario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoTributario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoTributario= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoTributario.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoTributario,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoTributario= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoTributario.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoTributario,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoTributario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoTributario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoTributario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoTributario= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoTributario.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoTributario,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoTributario= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoTributario.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoTributario,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoTributario= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoTributario.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoTributario,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoTributario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoTributario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoTributario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoTributario= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoTributario.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoTributario,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoTributario= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoTributario.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoTributario,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoTributario= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoTributario.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoTributario,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoTributario= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoTributario.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoTributario,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoTributario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoTributario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoTributario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoTributario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoTributario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoTributario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoTributario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoTributario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoTributario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoTributario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoTributario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoTributario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoTributario= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoTributario.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoTributario,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoTributario.add(this.jMenuItemCerrarTipoTributario);
			
			this.jmenuAccionesTipoTributario.add(this.jMenuItemNuevoTipoTributario);
			this.jmenuAccionesTipoTributario.add(this.jMenuItemNuevoGuardarCambiosTipoTributario);
			this.jmenuAccionesTipoTributario.add(this.jMenuItemNuevoRelacionesTipoTributario);
			this.jmenuAccionesTipoTributario.add(this.jMenuItemGuardarCambiosTablaTipoTributario);		
			this.jmenuAccionesTipoTributario.add(this.jMenuItemDuplicarTipoTributario);		
			this.jmenuAccionesTipoTributario.add(this.jMenuItemCopiarTipoTributario);		
			this.jmenuAccionesTipoTributario.add(this.jMenuItemVerFormTipoTributario);		
			
			this.jmenuDatosTipoTributario.add(this.jMenuItemRecargarInformacionTipoTributario);				
			this.jmenuDatosTipoTributario.add(this.jMenuItemAnterioresTipoTributario);				
			this.jmenuDatosTipoTributario.add(this.jMenuItemSiguientesTipoTributario);				
			this.jmenuDatosTipoTributario.add(this.jMenuItemAbrirOrderByTipoTributario);				
			this.jmenuDatosTipoTributario.add(this.jMenuItemMostrarOcultarTipoTributario);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoTributario.add(this.jMenuItemGuardarCambiosTipoTributario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoTributario.add(this.jmenuArchivoTipoTributario);		
			this.jmenuBarTipoTributario.add(this.jmenuAccionesTipoTributario);		
			this.jmenuBarTipoTributario.add(this.jmenuDatosTipoTributario);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoTributario);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoTributario() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoTipoTributario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoTipoTributario.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoTipoTributario= new JButtonMe();
		this.jButtonBusquedaPorCodigoTipoTributario.setText("Buscar");
		this.jButtonBusquedaPorCodigoTipoTributario.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoTipoTributario,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoTipoTributario = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoTipoTributario.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoTipoTributario.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoTipoTributario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoTributario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoTributario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoTipoTributario,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreacodigoBusquedaPorCodigoTipoTributario= new JTextAreaMe();
		jTextAreacodigoBusquedaPorCodigoTipoTributario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoBusquedaPorCodigoTipoTributario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoBusquedaPorCodigoTipoTributario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreacodigoBusquedaPorCodigoTipoTributario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorIdTipoTributario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdTipoTributario.setToolTipText("Buscar Por Id ");
		this.jButtonBusquedaPorIdTipoTributario= new JButtonMe();
		this.jButtonBusquedaPorIdTipoTributario.setText("Buscar");
		this.jButtonBusquedaPorIdTipoTributario.setToolTipText("Buscar Por Id ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdTipoTributario,"buscar_button","Buscar Por Id ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);;
			jLabelidBusquedaPorIdTipoTributario = new JLabelMe();
		jLabelidBusquedaPorIdTipoTributario.setText("Id :");
		jLabelidBusquedaPorIdTipoTributario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaPorIdTipoTributario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaPorIdTipoTributario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));

		FuncionesSwing.setBoldLabel(jLabelidBusquedaPorIdTipoTributario,STIPO_TAMANIO_GENERAL,false,true,this);

		jLabelidTipoTributarioBusquedaPorId= new JTextFieldMe();
		jLabelidTipoTributarioBusquedaPorId.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoTributarioBusquedaPorId.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoTributarioBusquedaPorId.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



		this.jPanelBusquedaPorNombreTipoTributario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoTributario.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoTributario= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoTributario.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoTributario.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoTributario,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoTributario = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoTributario.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoTributario.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoTributario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoTributario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoTributario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoTributario,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoTributario= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoTributario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoTributario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoTributario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoTributario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPaisTipoTributario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisTipoTributario.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisTipoTributario= new JButtonMe();
		this.jButtonFK_IdPaisTipoTributario.setText("Buscar");
		this.jButtonFK_IdPaisTipoTributario.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisTipoTributario,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisTipoTributario = new JLabelMe();
		jLabelid_paisFK_IdPaisTipoTributario.setText("Pais :");
		jLabelid_paisFK_IdPaisTipoTributario.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisTipoTributario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisTipoTributario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisTipoTributario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisTipoTributario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisTipoTributario= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisTipoTributario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisTipoTributario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisTipoTributario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisTipoTributario,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoTributario=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoTributario.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoTributario.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoTributario.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoTributario.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoTributario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoTributario,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoTributario = new TipoTributarioDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Tributario DATOS");
			this.jInternalFrameDetalleFormTipoTributario = new TipoTributarioDetalleFormJInternalFrame(jDesktopPane,this.tipotributarioSessionBean.getConGuardarRelaciones(),this.tipotributarioSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoTributario = null;//new TipoTributarioDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoTributario= new GridBagLayout();
		
		
		this.jTableDatosTipoTributario = new JTableMe();      
		
		String sToolTipTipoTributario="";
		sToolTipTipoTributario=TipoTributarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoTributario+="(Contabilidad.TipoTributario)";
		}
		
		if(!this.tipotributarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoTributario+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoTributario.setToolTipText(sToolTipTipoTributario);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoTributario);
		this.jTableDatosTipoTributario.setAutoCreateRowSorter(true);
		this.jTableDatosTipoTributario.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoTributario.setRowSelectionAllowed(true);
		this.jTableDatosTipoTributario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoTributario,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoTributario = new JButtonMe();
		this.jButtonDuplicarTipoTributario = new JButtonMe();
		this.jButtonCopiarTipoTributario = new JButtonMe();
		this.jButtonVerFormTipoTributario = new JButtonMe();
		this.jButtonNuevoRelacionesTipoTributario = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoTributario = new JButtonMe();
		this.jButtonCerrarTipoTributario = new JButtonMe();
		
		this.jScrollPanelDatosTipoTributario = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoTributario = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoTributario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Tributario";
		
		if(!this.tipotributarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoTributario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Tributarios" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoTributario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoTributario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoTributario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoTributario.setToolTipText("Acciones");
        this.jPanelAccionesTipoTributario.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoTributario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoTributario, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoTributario=new ReporteDinamicoJInternalFrame(TipoTributarioConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoTributario();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoTributario=new ImportacionJInternalFrame(TipoTributarioConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoTributario();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoTributario = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoTributario.setText("Orden");
		this.jButtonAbrirOrderByTipoTributario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoTributario,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoTributario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoTributario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoTributario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoTributario,false,this);
			
			//this.cargarOrderByTipoTributario(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoTributario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoTributario,true,this);
			
			//this.cargarOrderByTipoTributario(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoTributario.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosTipoTributario.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosTipoTributario.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosTipoTributario.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoTributario.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoTributario.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoTributario.setText("Nuevo");
		this.jButtonDuplicarTipoTributario.setText("Duplicar");
		this.jButtonCopiarTipoTributario.setText("Copiar");
		this.jButtonVerFormTipoTributario.setText("Ver");
		this.jButtonNuevoRelacionesTipoTributario.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoTributario.setText("Guardar");
		this.jButtonCerrarTipoTributario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoTributario,"nuevo_button","Nuevo",this.tipotributarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoTributario,"duplicar_button","Duplicar",this.tipotributarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoTributario,"copiar_button","Copiar",this.tipotributarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoTributario,"ver_form","Ver",this.tipotributarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoTributario,"nuevorelaciones_button","Nuevo Rel",this.tipotributarioSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoTributario,"guardarcambiostabla_button","Guardar",this.tipotributarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoTributario,"cerrar_button","Salir",this.tipotributarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoTributario.setToolTipText("Nuevo"+" "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoTributario.setToolTipText("Duplicar"+" "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoTributario.setToolTipText("Copiar"+" "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoTributario.setToolTipText("Ver"+" "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoTributario.setToolTipText("Nuevo Rel"+" "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoTributario.setToolTipText("Guardar"+" "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoTributario.setToolTipText("Salir"+" "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoTributario";
		inputMap = this.jButtonNuevoTipoTributario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoTributario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoTributario"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoTributario";
		inputMap = this.jButtonDuplicarTipoTributario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoTributario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoTributario"));
		
		//COPIAR
		sMapKey = "CopiarTipoTributario";
		inputMap = this.jButtonCopiarTipoTributario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoTributario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoTributario"));
		
		//VEr FORM
		sMapKey = "VerFormTipoTributario";
		inputMap = this.jButtonVerFormTipoTributario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoTributario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoTributario"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoTributario";
		inputMap = this.jButtonNuevoRelacionesTipoTributario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoTributario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoTributario"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoTributario";
		inputMap = this.jButtonModificarTipoTributario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoTributario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoTributario"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoTributario";
		inputMap = this.jButtonCerrarTipoTributario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoTributario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoTributario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoTributario";
		inputMap = this.jButtonGuardarCambiosTablaTipoTributario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoTributario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoTributario"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoTributario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoTributario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoTributario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoTributario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoTributario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoTributario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoTributario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoTributario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoTributario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoTributario.setName("jPanelParametrosReportesTipoTributario"); 
		
		this.jPanelParametrosReportesAccionesTipoTributario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoTributario.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoTributario.setName("jPanelParametrosReportesAccionesTipoTributario"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoTributario, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoTributario, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoTributario = new JButtonMe();
		this.jButtonRecargarInformacionTipoTributario.setText("Recargar");
		this.jButtonRecargarInformacionTipoTributario.setToolTipText("Recargar"+" "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoTributario,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoTributario = new JButtonMe();
		this.jButtonProcesarInformacionTipoTributario.setText("Procesar");
		this.jButtonProcesarInformacionTipoTributario.setToolTipText("Procesar"+" "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoTributario.setVisible(false);
			
		this.jButtonProcesarInformacionTipoTributario.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoTributario.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoTributario.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoTributario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoTributario.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoTributario.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoTributario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoTributario.setText("TIPO");       
		this.jComboBoxTiposReportesTipoTributario.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoTributario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoTributario.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoTributario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoTributario = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoTributario.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoTributario.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoTributario = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoTributario.setText("Accion");
		this.jComboBoxTiposRelacionesTipoTributario.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoTributario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoTributario.setText("Accion");
		this.jComboBoxTiposAccionesTipoTributario.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoTributario = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoTributario.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoTributario.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoTributario=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoTributario.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoTributario.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoTributario.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoTributario = new JLabelMe();
		
		this.jLabelAccionesTipoTributario.setText("Acciones");		
		this.jLabelAccionesTipoTributario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoTributario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoTributario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoTributario = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoTributario.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoTributario.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoTributario = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoTributario.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoTributario.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoTributario = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoTributario.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoTributario.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoTributario = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoTributario.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoTributario.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoTributario = new JButtonMe();
		//this.jButtonAnterioresTipoTributario.setText("<<");
        this.jButtonAnterioresTipoTributario.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoTributario,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoTributario = new JButtonMe();
		//this.jButtonSiguientesTipoTributario.setText(">>");
        this.jButtonSiguientesTipoTributario.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoTributario,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoTributario = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoTributario.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoTributario.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoTributario,"nuevoguardarcambios_button","Nue",this.tipotributarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoTributario";
		inputMap = this.jButtonNuevoGuardarCambiosTipoTributario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoTributario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoTributario"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoTributario";
		inputMap = this.jButtonRecargarInformacionTipoTributario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoTributario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoTributario"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoTributario";
		inputMap = this.jButtonSiguientesTipoTributario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoTributario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoTributario"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoTributario";
		inputMap = this.jButtonAnterioresTipoTributario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoTributario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoTributario"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoTributario();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoTributario.setMinimumSize(new Dimension(this.getWidth(),TipoTributarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoTributarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoTributario.setMaximumSize(new Dimension(this.getWidth(),TipoTributarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoTributarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoTributario.setPreferredSize(new Dimension(this.getWidth(),TipoTributarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoTributarioBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoTributario = new GridBagLayout();

			this.jPanelPaginacionTipoTributario.setLayout(gridaBagLayoutPaginacionTipoTributario);						
			
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			this.gridBagConstraintsTipoTributario.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTributario.gridy = 0;
			this.gridBagConstraintsTipoTributario.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoTributario.add(this.jButtonAnterioresTipoTributario, this.gridBagConstraintsTipoTributario);
					
						
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			this.gridBagConstraintsTipoTributario.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoTributario.gridy = 0;
			
			this.jPanelPaginacionTipoTributario.add(this.jButtonNuevoGuardarCambiosTipoTributario, this.gridBagConstraintsTipoTributario);
						
			
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			this.gridBagConstraintsTipoTributario.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoTributario.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoTributario.gridy = 0;
			this.jPanelPaginacionTipoTributario.add(this.jButtonSiguientesTipoTributario, this.gridBagConstraintsTipoTributario);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTributario.gridy = 1;
			this.gridBagConstraintsTipoTributario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoTributario.add(this.jButtonNuevoTipoTributario, this.gridBagConstraintsTipoTributario);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoTributario = new GridBagConstraints();
				this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoTributario.gridy = 1;
				this.gridBagConstraintsTipoTributario.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoTributario.add(this.jButtonNuevoRelacionesTipoTributario, this.gridBagConstraintsTipoTributario);
			}
			
			
			if(!this.tipotributarioSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoTributario = new GridBagConstraints();
				this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoTributario.gridy = 1;
				this.gridBagConstraintsTipoTributario.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoTributario.add(this.jButtonGuardarCambiosTablaTipoTributario, this.gridBagConstraintsTipoTributario);
			}
			
			
			
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTributario.gridy = 1;
			this.gridBagConstraintsTipoTributario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoTributario.add(this.jButtonDuplicarTipoTributario, this.gridBagConstraintsTipoTributario);
			
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTributario.gridy = 1;
			this.gridBagConstraintsTipoTributario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoTributario.add(this.jButtonCopiarTipoTributario, this.gridBagConstraintsTipoTributario);
		
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTributario.gridy = 1;
			this.gridBagConstraintsTipoTributario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoTributario.add(this.jButtonVerFormTipoTributario, this.gridBagConstraintsTipoTributario);
		
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTributario.gridy = 1;
			this.gridBagConstraintsTipoTributario.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoTributario.add(this.jButtonCerrarTipoTributario, this.gridBagConstraintsTipoTributario);
		
		
		
		this.jButtonRecargarInformacionTipoTributario.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoTributario.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoTributario.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoTributario.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoTributario.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoTributario.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoTributario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoTributario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoTributario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoTributario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoTributario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoTributario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoTributario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoTributario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoTributario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoTributario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoTributario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoTributario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoTributario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoTributario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoTributario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoTributario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoTributario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoTributario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoTributario.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoTributario.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoTributario.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoTributario.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoTributario.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoTributario.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoTributario.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoTributario.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoTributario.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoTributario.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoTributario.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoTributario.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoTributario = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoTributario = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoTributario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoTributario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoTributario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoTributario = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoTributario.setLayout(gridaBagParametrosReportesTipoTributario);
			this.jPanelParametrosReportesAccionesTipoTributario.setLayout(gridaBagParametrosReportesAccionesTipoTributario);
			
			
			this.jPanelParametrosAuxiliar1TipoTributario.setLayout(gridaBagParametrosAuxiliar1TipoTributario);
			this.jPanelParametrosAuxiliar2TipoTributario.setLayout(gridaBagParametrosAuxiliar2TipoTributario);
			this.jPanelParametrosAuxiliar3TipoTributario.setLayout(gridaBagParametrosAuxiliar3TipoTributario);
			this.jPanelParametrosAuxiliar4TipoTributario.setLayout(gridaBagParametrosAuxiliar4TipoTributario);
			//this.jPanelParametrosAuxiliar5TipoTributario.setLayout(gridaBagParametrosAuxiliar2TipoTributario);			
			
			
			
			
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTributario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoTributario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoTributario.add(this.jButtonRecargarInformacionTipoTributario, this.gridBagConstraintsTipoTributario);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			this.gridBagConstraintsTipoTributario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTributario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTributario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoTributario.add(this.jComboBoxTiposPaginacionTipoTributario, this.gridBagConstraintsTipoTributario);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			this.gridBagConstraintsTipoTributario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTributario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTributario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoTributario.add(this.jCheckBoxConAltoMaximoTablaTipoTributario, this.gridBagConstraintsTipoTributario);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			this.gridBagConstraintsTipoTributario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTributario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTributario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoTributario.add(this.jComboBoxTiposArchivosReportesTipoTributario, this.gridBagConstraintsTipoTributario);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			this.gridBagConstraintsTipoTributario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTributario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTributario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTributario.add(this.jPanelParametrosAuxiliar1TipoTributario, this.gridBagConstraintsTipoTributario);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			this.gridBagConstraintsTipoTributario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTributario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoTributario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoTributario.add(this.jComboBoxTiposReportesTipoTributario, this.gridBagConstraintsTipoTributario);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			this.gridBagConstraintsTipoTributario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTributario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTributario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTributario.add(this.jPanelParametrosAuxiliar4TipoTributario, this.gridBagConstraintsTipoTributario);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			this.gridBagConstraintsTipoTributario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTributario.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTributario.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTributario.add(this.jComboBoxTiposReportesTipoTributario, this.gridBagConstraintsTipoTributario);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			this.gridBagConstraintsTipoTributario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTributario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTributario.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoTributario.add(this.jCheckBoxGenerarReporteTipoTributario, this.gridBagConstraintsTipoTributario);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			this.gridBagConstraintsTipoTributario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTributario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTributario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTributario.add(this.jPanelParametrosAuxiliar2TipoTributario, this.gridBagConstraintsTipoTributario);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTributario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoTributario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoTributario.add(this.jLabelAccionesTipoTributario, this.gridBagConstraintsTipoTributario);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoTributario = new GridBagConstraints();
				this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoTributario.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoTributario.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoTributario.add(this.jButtonAbrirOrderByTipoTributario, this.gridBagConstraintsTipoTributario);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoTributario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTributario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoTributario.add(this.jComboBoxTiposSeleccionarTipoTributario, this.gridBagConstraintsTipoTributario);			
			
			
			/*
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTributario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoTributario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoTributario.add(this.jCheckBoxSeleccionarTodosTipoTributario, this.gridBagConstraintsTipoTributario);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			this.gridBagConstraintsTipoTributario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTributario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoTributario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoTributario.add(this.jCheckBoxSeleccionarTodosTipoTributario, this.gridBagConstraintsTipoTributario);															
				
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			this.gridBagConstraintsTipoTributario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTributario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoTributario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoTributario.add(this.jCheckBoxSeleccionadosTipoTributario, this.gridBagConstraintsTipoTributario);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			this.gridBagConstraintsTipoTributario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTributario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTributario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTributario.add(this.jPanelParametrosAuxiliar3TipoTributario, this.gridBagConstraintsTipoTributario);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			this.gridBagConstraintsTipoTributario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTributario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoTributario.add(this.jComboBoxTiposRelacionesTipoTributario, this.gridBagConstraintsTipoTributario);
				
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			this.gridBagConstraintsTipoTributario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTributario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoTributario.add(this.jComboBoxTiposAccionesTipoTributario, this.gridBagConstraintsTipoTributario);
	
				
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			this.gridBagConstraintsTipoTributario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTributario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoTributario.add(this.jTextFieldValorCampoGeneralTipoTributario, this.gridBagConstraintsTipoTributario);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoTributario = new GridBagLayout();

			this.jScrollPanelDatosTipoTributario.setLayout(gridaBagLayoutDatosTipoTributario);
			
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTributario.gridy = 0;
			this.gridBagConstraintsTipoTributario.gridx = 0;
			
			this.jScrollPanelDatosTipoTributario.add(this.jTableDatosTipoTributario, this.gridBagConstraintsTipoTributario);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoTributario.setViewportView(this.jTableDatosTipoTributario);
		this.jTableDatosTipoTributario.setFillsViewportHeight(true);
		this.jTableDatosTipoTributario.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoTributario= new GridBagLayout();
		this.jPanelAccionesTipoTributario.setLayout(gridaBagLayoutAccionesTipoTributario);
		
		
		/*	
		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTributario.gridy = 0;
		this.gridBagConstraintsTipoTributario.gridx = 0;
			
		this.jPanelAccionesTipoTributario.add(this.jButtonNuevoTipoTributario, this.gridBagConstraintsTipoTributario);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoTipoTributario= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoTipoTributario.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoTributario.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoTributario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoTipoTributario.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoTipoTributario.setLayout(gridaBagLayoutBusquedaPorCodigoTipoTributario);

		gridBagConstraintsTipoTributario = new GridBagConstraints();
		gridBagConstraintsTipoTributario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoTributario.gridy = 0;
		gridBagConstraintsTipoTributario.gridx = 0;
		jPanelBusquedaPorCodigoTipoTributario.add(jLabelcodigoBusquedaPorCodigoTipoTributario, gridBagConstraintsTipoTributario);

		gridBagConstraintsTipoTributario = new GridBagConstraints();
		gridBagConstraintsTipoTributario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoTributario.gridy = 0;
		gridBagConstraintsTipoTributario.gridx = 1;
		jPanelBusquedaPorCodigoTipoTributario.add(jTextAreacodigoBusquedaPorCodigoTipoTributario, gridBagConstraintsTipoTributario);

		gridBagConstraintsTipoTributario = new GridBagConstraints();
		gridBagConstraintsTipoTributario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoTributario.gridy = 1;
		gridBagConstraintsTipoTributario.gridx =1;
		jPanelBusquedaPorCodigoTipoTributario.add(jButtonBusquedaPorCodigoTipoTributario, gridBagConstraintsTipoTributario);

		jTabbedPaneBusquedasTipoTributario.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoTipoTributario);
		jTabbedPaneBusquedasTipoTributario.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorIdTipoTributario= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdTipoTributario.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdTipoTributario.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdTipoTributario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdTipoTributario.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdTipoTributario.setLayout(gridaBagLayoutBusquedaPorIdTipoTributario);

		gridBagConstraintsTipoTributario = new GridBagConstraints();
		gridBagConstraintsTipoTributario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoTributario.gridy = 0;
		gridBagConstraintsTipoTributario.gridx = 0;
		jPanelBusquedaPorIdTipoTributario.add(jLabelidBusquedaPorIdTipoTributario, gridBagConstraintsTipoTributario);

		gridBagConstraintsTipoTributario = new GridBagConstraints();
		gridBagConstraintsTipoTributario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoTributario.gridy = 0;
		gridBagConstraintsTipoTributario.gridx = 1;
		jPanelBusquedaPorIdTipoTributario.add(jLabelidTipoTributarioBusquedaPorId, gridBagConstraintsTipoTributario);

		gridBagConstraintsTipoTributario = new GridBagConstraints();
		gridBagConstraintsTipoTributario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoTributario.gridy = 1;
		gridBagConstraintsTipoTributario.gridx =1;
		jPanelBusquedaPorIdTipoTributario.add(jButtonBusquedaPorIdTipoTributario, gridBagConstraintsTipoTributario);

		jTabbedPaneBusquedasTipoTributario.addTab("2.-Por Id ", jPanelBusquedaPorIdTipoTributario);
		jTabbedPaneBusquedasTipoTributario.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoTributario= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoTributario.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoTributario.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoTributario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoTributario.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoTributario.setLayout(gridaBagLayoutBusquedaPorNombreTipoTributario);

		gridBagConstraintsTipoTributario = new GridBagConstraints();
		gridBagConstraintsTipoTributario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoTributario.gridy = 0;
		gridBagConstraintsTipoTributario.gridx = 0;
		jPanelBusquedaPorNombreTipoTributario.add(jLabelnombreBusquedaPorNombreTipoTributario, gridBagConstraintsTipoTributario);

		gridBagConstraintsTipoTributario = new GridBagConstraints();
		gridBagConstraintsTipoTributario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoTributario.gridy = 0;
		gridBagConstraintsTipoTributario.gridx = 1;
		jPanelBusquedaPorNombreTipoTributario.add(jTextAreanombreBusquedaPorNombreTipoTributario, gridBagConstraintsTipoTributario);

		gridBagConstraintsTipoTributario = new GridBagConstraints();
		gridBagConstraintsTipoTributario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoTributario.gridy = 1;
		gridBagConstraintsTipoTributario.gridx =1;
		jPanelBusquedaPorNombreTipoTributario.add(jButtonBusquedaPorNombreTipoTributario, gridBagConstraintsTipoTributario);

		jTabbedPaneBusquedasTipoTributario.addTab("3.-Por Nombre ", jPanelBusquedaPorNombreTipoTributario);
		jTabbedPaneBusquedasTipoTributario.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdPaisTipoTributario= new GridBagLayout();
		gridaBagLayoutFK_IdPaisTipoTributario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisTipoTributario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisTipoTributario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisTipoTributario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisTipoTributario.setLayout(gridaBagLayoutFK_IdPaisTipoTributario);

		gridBagConstraintsTipoTributario = new GridBagConstraints();
		gridBagConstraintsTipoTributario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoTributario.gridy = 0;
		gridBagConstraintsTipoTributario.gridx = 0;
		jPanelFK_IdPaisTipoTributario.add(jLabelid_paisFK_IdPaisTipoTributario, gridBagConstraintsTipoTributario);

		gridBagConstraintsTipoTributario = new GridBagConstraints();
		gridBagConstraintsTipoTributario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoTributario.gridy = 0;
		gridBagConstraintsTipoTributario.gridx = 1;
		jPanelFK_IdPaisTipoTributario.add(jComboBoxid_paisFK_IdPaisTipoTributario, gridBagConstraintsTipoTributario);

		gridBagConstraintsTipoTributario = new GridBagConstraints();
		gridBagConstraintsTipoTributario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoTributario.gridy = 1;
		gridBagConstraintsTipoTributario.gridx =1;
		jPanelFK_IdPaisTipoTributario.add(jButtonFK_IdPaisTipoTributario, gridBagConstraintsTipoTributario);

		jTabbedPaneBusquedasTipoTributario.addTab("4.-Por Pais ", jPanelFK_IdPaisTipoTributario);
		jTabbedPaneBusquedasTipoTributario.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoTributario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoTributario);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipotributarioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();						
			this.gridBagConstraintsTipoTributario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoTributario.gridx = 0;		
			//this.gridBagConstraintsTipoTributario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTributario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoTributario.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoTributario, this.gridBagConstraintsTipoTributario);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoTributario.gridx = 0;		
		//this.gridBagConstraintsTipoTributario.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTributario.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoTributario.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoTributario);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoTributario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoTributario.gridx = 0;		
			this.gridBagConstraintsTipoTributario.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTributario.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoTributario.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoTributario, this.gridBagConstraintsTipoTributario);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTributario.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoTributario, this.gridBagConstraintsTipoTributario);								
		
		
		/*
		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTributario.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoTributario, this.gridBagConstraintsTipoTributario);
		*/		
		
		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoTributario.gridx =0;
		this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoTributario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoTributario, this.gridBagConstraintsTipoTributario);
				
		
		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTributario.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoTributario, this.gridBagConstraintsTipoTributario);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoTributarioJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoTributario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoTributario = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoTributario.setLayout(gridaBagLayoutBusquedasParametrosTipoTributario);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoTributario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoTributario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoTributario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoTributario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTributario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoTributario, this.gridBagConstraintsTipoTributario);
			
			
		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTributario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoTributario, this.gridBagConstraintsTipoTributario);
		
			
		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoTributario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoTributario, this.gridBagConstraintsTipoTributario);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoTributario;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoTributario() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoTributario = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoTributario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoTributario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoTributario.setName("jPanelReporteDinamicoTipoTributario"); 
		
		this.jPanelReporteDinamicoTipoTributario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoTributario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoTributario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoTributario.setLayout(gridaBagLayoutReporteDinamicoTipoTributario);
		
		
		this.jInternalFrameReporteDinamicoTipoTributario= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoTributario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoTributario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoTributario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoTributario.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoTributario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoTributario.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoTributario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoTributario.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoTributario.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoTributario.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoTributario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoTributario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoTributario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoTributario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Tributarios"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoTributario = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoTributario.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoTributario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoTributario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoTributario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTributario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTributario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoTributario.add(this.jLabelColumnasSelectReporteTipoTributario, this.gridBagConstraintsTipoTributario);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoTributario = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoTributario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoTributario.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoTributario.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoTributario.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoTributario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoTributario=new JScrollPane(this.jListColumnasSelectReporteTipoTributario);
			
			this.jScrollColumnasSelectReporteTipoTributario.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoTributario.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoTributario.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoTributario.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTributario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTributario.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoTributario.add(this.jListColumnasSelectReporteTipoTributario, this.gridBagConstraintsTipoTributario);
		this.jPanelReporteDinamicoTipoTributario.add(this.jScrollColumnasSelectReporteTipoTributario, this.gridBagConstraintsTipoTributario);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoTributario = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoTributario.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoTributario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoTributario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoTributario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTributario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTributario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoTributario.add(this.jLabelRelacionesSelectReporteTipoTributario, this.gridBagConstraintsTipoTributario);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoTributario = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoTributario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoTributario.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoTributario.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoTributario.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoTributario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoTributario=new JScrollPane(this.jListRelacionesSelectReporteTipoTributario);
			
			this.jScrollRelacionesSelectReporteTipoTributario.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoTributario.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoTributario.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoTributario.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTributario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTributario.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoTributario.add(this.jListRelacionesSelectReporteTipoTributario, this.gridBagConstraintsTipoTributario);
		this.jPanelReporteDinamicoTipoTributario.add(this.jScrollRelacionesSelectReporteTipoTributario, this.gridBagConstraintsTipoTributario);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoTributario = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoTributario = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoTributario = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoTributario = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoTributario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoTributario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoTributario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoTributario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoTributario = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoTributario.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoTributario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoTributario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoTributario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoTributario = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoTributario.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoTributario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoTributario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoTributario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTributario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTributario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoTributario.add(this.jLabelGenerarExcelReporteDinamicoTipoTributario, this.gridBagConstraintsTipoTributario);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoTributario = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoTributario.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoTributario,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoTributario.setToolTipText("Generar EXCEL"+" "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		//this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoTributario.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoTributario.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoTributario.add(this.jButtonGenerarExcelReporteDinamicoTipoTributario, this.gridBagConstraintsTipoTributario);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTributario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoTributario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoTributario.add(this.jComboBoxTiposReportesDinamicoTipoTributario, this.gridBagConstraintsTipoTributario);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoTributario = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoTributario.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoTributario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoTributario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoTributario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTributario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTributario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoTributario.add(this.jLabelTiposArchivoReporteDinamicoTipoTributario, this.gridBagConstraintsTipoTributario);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTributario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoTributario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoTributario.add(this.jComboBoxTiposArchivosReportesDinamicoTipoTributario, this.gridBagConstraintsTipoTributario);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoTributario = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoTributario.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoTributario,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoTributario.setToolTipText("Generar"+" "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTributario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoTributario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoTributario.add(this.jButtonGenerarReporteDinamicoTipoTributario, this.gridBagConstraintsTipoTributario);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoTributario = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoTributario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoTributario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoTributario.setToolTipText("Cancelar"+" "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTributario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoTributario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoTributario.add(this.jButtonCerrarReporteDinamicoTipoTributario, this.gridBagConstraintsTipoTributario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoTributario = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoTributario= new JScrollPane(jPanelReporteDinamicoTipoTributario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoTributario.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoTributario.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoTributario.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoTributario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Tributarios"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoTributario.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoTributario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoTributario.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoTributario);
		this.jInternalFrameReporteDinamicoTipoTributario.getContentPane().add(this.jScrollPanelReporteDinamicoTipoTributario, this.gridBagConstraintsTipoTributario);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoTributario() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoTributario = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoTributario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoTributario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoTributario.setName("jPanelImportacionTipoTributario"); 
		
		this.jPanelImportacionTipoTributario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoTributario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoTributario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoTributario.setLayout(gridaBagLayoutImportacionTipoTributario);
		
		
		this.jInternalFrameImportacionTipoTributario= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoTributario= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoTributario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoTributario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoTributario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoTributario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoTributario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoTributario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoTributario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoTributario.setResizable(true);
	    this.jInternalFrameImportacionTipoTributario.setClosable(true);
	    this.jInternalFrameImportacionTipoTributario.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoTributario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoTributario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoTributario.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoTributario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoTributario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoTributario.setResizable(true);
	    this.jInternalFrameImportacionTipoTributario.setClosable(true);
	    this.jInternalFrameImportacionTipoTributario.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoTributario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoTributario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoTributario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoTributario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Tributarios"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoTributario = new JLabelMe();

		this.jLabelArchivoImportacionTipoTributario.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoTributario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoTributario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoTributario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTributario.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoTributario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoTributario.add(this.jLabelArchivoImportacionTipoTributario, this.gridBagConstraintsTipoTributario);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoTributario = new JFileChooser();		
		this.jFileChooserImportacionTipoTributario.setToolTipText("ESCOGER ARCHIVO"+" "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoTributario = new JButtonMe();
		this.jButtonAbrirImportacionTipoTributario.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoTributario,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoTributario.setToolTipText("Generar"+" "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTributario.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoTributario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoTributario.add(this.jButtonAbrirImportacionTipoTributario, this.gridBagConstraintsTipoTributario);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoTributario = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoTributario.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoTributario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoTributario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoTributario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTributario.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoTributario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoTributario.add(this.jLabelPathArchivoImportacionTipoTributario, this.gridBagConstraintsTipoTributario);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoTributario=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoTributario.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoTributario.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoTributario.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTributario.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoTributario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoTributario.add(this.jTextFieldPathArchivoImportacionTipoTributario, this.gridBagConstraintsTipoTributario);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoTributario = new JButtonMe();
		this.jButtonGenerarImportacionTipoTributario.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoTributario,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoTributario.setToolTipText("Generar"+" "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTributario.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoTributario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoTributario.add(this.jButtonGenerarImportacionTipoTributario, this.gridBagConstraintsTipoTributario);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoTributario = new JButtonMe();
		this.jButtonCerrarImportacionTipoTributario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoTributario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoTributario.setToolTipText("Cancelar"+" "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTributario.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoTributario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoTributario.add(this.jButtonCerrarImportacionTipoTributario, this.gridBagConstraintsTipoTributario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoTributario = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoTributario= new JScrollPane(jPanelImportacionTipoTributario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoTributario.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoTributario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoTributario.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoTributario);
		this.jInternalFrameImportacionTipoTributario.getContentPane().add(this.jScrollPanelImportacionTipoTributario, this.gridBagConstraintsTipoTributario);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoTributario(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoTributario = new JButtonMe();
			this.jButtonAbrirOrderByTipoTributario.setText("Orden");
			this.jButtonAbrirOrderByTipoTributario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoTributario,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoTributario";
			inputMap = this.jButtonAbrirOrderByTipoTributario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoTributario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoTributario"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoTributario = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoTributario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoTributario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoTributario.setName("jPanelOrderByTipoTributario"); 
			
			this.jPanelOrderByTipoTributario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoTributario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoTributario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoTributario.setLayout(gridaBagLayoutOrderByTipoTributario);
			
			
			this.jTableDatosTipoTributarioOrderBy = new JTableMe();        
			this.jTableDatosTipoTributarioOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoTributarioOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoTributarioOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoTributarioOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoTributarioOrderBy.setViewportView(this.jTableDatosTipoTributarioOrderBy);
			this.jTableDatosTipoTributarioOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoTributarioOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoTributario= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoTributario= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoTributario = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoTributario= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoTributario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoTributario.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoTributario.setTitle("Orden");
			this.jInternalFrameOrderByTipoTributario.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoTributario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoTributario.setResizable(true);
			this.jInternalFrameOrderByTipoTributario.setClosable(true);
			this.jInternalFrameOrderByTipoTributario.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoTributario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoTributario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoTributario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoTributario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Tributarios"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			this.gridBagConstraintsTipoTributario.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoTributario.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoTributario.ipady =150;
				
			this.jPanelOrderByTipoTributario.add(jScrollPanelDatosTipoTributarioOrderBy, this.gridBagConstraintsTipoTributario);//this.jTableDatosTipoTributarioTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoTributario = new JButtonMe();
			this.jButtonCerrarOrderByTipoTributario.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoTributario,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoTributario.setToolTipText("Cancelar"+" "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTributario.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoTributario.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoTributario.add(this.jButtonCerrarOrderByTipoTributario, this.gridBagConstraintsTipoTributario);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoTributario = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoTributario= new JScrollPane(jPanelOrderByTipoTributario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			this.gridBagConstraintsTipoTributario.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoTributario.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoTributario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoTributario.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoTributario);
			
			this.jInternalFrameOrderByTipoTributario.getContentPane().add(this.jScrollPanelOrderByTipoTributario, this.gridBagConstraintsTipoTributario);			
		
		} else {
			this.jButtonAbrirOrderByTipoTributario = new JButtonMe();
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
		int iWidthTableCalculado=0;//1230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=300;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipotributarioSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoTributario.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoTributario.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoTributario.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoTributario.getRowHeight();//TipoTributarioConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipotributarioSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoTributarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoTributario.isSelected()) {
					iHeightTable=TipoTributarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoTributarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoTributarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoTributarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoTributario.isSelected()) {
					iHeightTable=TipoTributarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoTributarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoTributarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoTributario.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoTributario.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoTributario.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoTributario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoTributario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoTributario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoTributario!=null && this.jInternalFrameOrderByTipoTributario.getjTableDatosOrderBy()!=null) {
			//if(!this.tipotributarioSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoTributario.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoTributario.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoTributario.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoTributario.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoTributario.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoTributario.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoTributario.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoTributario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoTributario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoTributario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipotributarioLogic.getTipoTributarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipotributarios.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoTributario> TraerTipoTributarioBeans(List<TipoTributario> tipotributarios,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoTributario tipotributario:tipotributarios) {
					
				if(!(TipoTributarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoTributarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipotributario.setsDetalleGeneralEntityReporte(TipoTributarioConstantesFunciones.getTipoTributarioDescripcion(tipotributario));
										
						
					
					

					if(tipotributario.getTransaccionLocals()!=null && Funciones.existeClass(classes,TransaccionLocal.class)) {
						try{tipotributario.settransaccionlocalsDescripcionReporte(new JRBeanCollectionDataSource(TransaccionLocalJInternalFrame.TraerTransaccionLocalBeans(tipotributario.getTransaccionLocals(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipotributario.getFacturaProveedorServicios()!=null && Funciones.existeClass(classes,FacturaProveedorServicio.class)) {
						try{tipotributario.setfacturaproveedorserviciosDescripcionReporte(new JRBeanCollectionDataSource(FacturaProveedorServicioJInternalFrame.TraerFacturaProveedorServicioBeans(tipotributario.getFacturaProveedorServicios(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipotributario.getDefinicions()!=null && Funciones.existeClass(classes,Definicion.class)) {
						try{tipotributario.setdefinicionsDescripcionReporte(new JRBeanCollectionDataSource(DefinicionJInternalFrame.TraerDefinicionBeans(tipotributario.getDefinicions(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipotributario.setsDetalleGeneralEntityReporte(tipotributario.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipotributariobeans.add(tipotributariobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipotributarios;
    }
	//PARA REPORTES FIN
}
