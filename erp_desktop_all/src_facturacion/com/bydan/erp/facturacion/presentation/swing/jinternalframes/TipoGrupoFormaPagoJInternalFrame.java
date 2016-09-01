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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;

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
import com.bydan.erp.facturacion.util.TipoGrupoFormaPagoConstantesFunciones;

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
public class TipoGrupoFormaPagoJInternalFrame extends TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoGrupoFormaPago;
	
	protected JMenuBar jmenuBarTipoGrupoFormaPago;
	
	protected JMenu jmenuTipoGrupoFormaPago;
	protected JMenu jmenuDatosTipoGrupoFormaPago;
	protected JMenu jmenuArchivoTipoGrupoFormaPago;
	protected JMenu jmenuAccionesTipoGrupoFormaPago;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoGrupoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoGrupoFormaPago;	
	protected GridBagConstraints gridBagConstraintsTipoGrupoFormaPago;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoGrupoFormaPagoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoGrupoFormaPago;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoGrupoFormaPago;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoGrupoFormaPago;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoGrupoFormaPagoSessionBean tipogrupoformapagoSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoGrupoFormaPago> tipogrupoformapagos;		
	public List<TipoGrupoFormaPago> tipogrupoformapagosEliminados;	
	public List<TipoGrupoFormaPago> tipogrupoformapagosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoGrupoFormaPago;		
	protected JButton jButtonAbrirOrderByTipoGrupoFormaPago;
	
	
	//protected JPanel jPanelOrderByTipoGrupoFormaPago;
	//public JScrollPane jScrollPanelOrderByTipoGrupoFormaPago;	
	//protected JButton jButtonCerrarOrderByTipoGrupoFormaPago;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoGrupoFormaPagoLogic tipogrupoformapagoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoGrupoFormaPago;
	public JScrollPane jScrollPanelDatosEdicionTipoGrupoFormaPago;
	public JScrollPane jScrollPanelDatosGeneralTipoGrupoFormaPago;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoGrupoFormaPagoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoGrupoFormaPago;
	//public JScrollPane jScrollPanelImportacionTipoGrupoFormaPago;
	
	
	
	protected JPanel jPanelAccionesTipoGrupoFormaPago;
	
    protected JPanel jPanelPaginacionTipoGrupoFormaPago;
    protected JPanel jPanelParametrosReportesTipoGrupoFormaPago;
	protected JPanel jPanelParametrosReportesAccionesTipoGrupoFormaPago;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoGrupoFormaPago;
	protected JPanel jPanelParametrosAuxiliar2TipoGrupoFormaPago;
	protected JPanel jPanelParametrosAuxiliar3TipoGrupoFormaPago;
	protected JPanel jPanelParametrosAuxiliar4TipoGrupoFormaPago;
	//protected JPanel jPanelParametrosAuxiliar5TipoGrupoFormaPago;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoGrupoFormaPago;
	//protected JPanel jPanelImportacionTipoGrupoFormaPago;
	
	
	public JTable jTableDatosTipoGrupoFormaPago;
	
	
	
	//public JTable jTableDatosTipoGrupoFormaPagoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoGrupoFormaPago;
	protected JButton jButtonDuplicarTipoGrupoFormaPago;
	protected JButton jButtonCopiarTipoGrupoFormaPago;
	protected JButton jButtonVerFormTipoGrupoFormaPago;
	protected JButton jButtonNuevoRelacionesTipoGrupoFormaPago;
	protected JButton jButtonModificarTipoGrupoFormaPago;
	
    protected JButton jButtonGuardarCambiosTablaTipoGrupoFormaPago;
	protected JButton jButtonCerrarTipoGrupoFormaPago;
	
	
	protected JButton jButtonRecargarInformacionTipoGrupoFormaPago;
	protected JButton jButtonProcesarInformacionTipoGrupoFormaPago;
	
	
	protected JButton jButtonAnterioresTipoGrupoFormaPago;
	protected JButton jButtonSiguientesTipoGrupoFormaPago;
	protected JButton jButtonNuevoGuardarCambiosTipoGrupoFormaPago;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoGrupoFormaPago;
	//protected JButton jButtonCerrarReporteDinamicoTipoGrupoFormaPago;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoGrupoFormaPago;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoGrupoFormaPago;
	//protected JButton jButtonGenerarImportacionTipoGrupoFormaPago;
	//protected JButton jButtonCerrarImportacionTipoGrupoFormaPago;
	//protected JFileChooser jFileChooserImportacionTipoGrupoFormaPago;
	//protected File fileImportacionTipoGrupoFormaPago;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoGrupoFormaPago;
	protected JButton jButtonDuplicarToolBarTipoGrupoFormaPago;
	protected JButton jButtonNuevoRelacionesToolBarTipoGrupoFormaPago;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoGrupoFormaPago;
	protected JButton jButtonCopiarToolBarTipoGrupoFormaPago;
	protected JButton jButtonVerFormToolBarTipoGrupoFormaPago;
	public JButton jButtonGuardarCambiosTablaToolBarTipoGrupoFormaPago;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoGrupoFormaPago;
	protected JButton jButtonCerrarToolBarTipoGrupoFormaPago;
	
	protected JButton jButtonRecargarInformacionToolBarTipoGrupoFormaPago;
	protected JButton jButtonProcesarInformacionToolBarTipoGrupoFormaPago;
	protected JButton jButtonAnterioresToolBarTipoGrupoFormaPago;
	protected JButton jButtonSiguientesToolBarTipoGrupoFormaPago;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoGrupoFormaPago;
	protected JButton jButtonAbrirOrderByToolBarTipoGrupoFormaPago;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoGrupoFormaPago;
	protected JMenuItem jMenuItemDuplicarTipoGrupoFormaPago;
	protected JMenuItem jMenuItemNuevoRelacionesTipoGrupoFormaPago;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoGrupoFormaPago;
	protected JMenuItem jMenuItemCopiarTipoGrupoFormaPago;
	protected JMenuItem jMenuItemVerFormTipoGrupoFormaPago;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoGrupoFormaPago;
	protected JMenuItem jMenuItemCerrarTipoGrupoFormaPago;
	protected JMenuItem jMenuItemDetalleCerrarTipoGrupoFormaPago;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoGrupoFormaPago;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoGrupoFormaPago;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoGrupoFormaPago;
	protected JMenuItem jMenuItemProcesarInformacionTipoGrupoFormaPago;
	protected JMenuItem jMenuItemAnterioresTipoGrupoFormaPago;
	protected JMenuItem jMenuItemSiguientesTipoGrupoFormaPago;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoGrupoFormaPago;
	protected JMenuItem jMenuItemAbrirOrderByTipoGrupoFormaPago;
	protected JMenuItem jMenuItemMostrarOcultarTipoGrupoFormaPago;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoGrupoFormaPago;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoGrupoFormaPago;
	protected JCheckBox jCheckBoxSeleccionadosTipoGrupoFormaPago;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoGrupoFormaPago;
	protected JCheckBox jCheckBoxConGraficoReporteTipoGrupoFormaPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoGrupoFormaPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoGrupoFormaPago;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoGrupoFormaPago;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoGrupoFormaPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoGrupoFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoGrupoFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoGrupoFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoGrupoFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoGrupoFormaPago;
	protected JTextField jTextFieldValorCampoGeneralTipoGrupoFormaPago;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoGrupoFormaPago;
	//public JList<Reporte> jListColumnasSelectReporteTipoGrupoFormaPago;
	//public JScrollPane jScrollColumnasSelectReporteTipoGrupoFormaPago;
	
	//public JLabel jLabelRelacionesSelectReporteTipoGrupoFormaPago;
	//public JList<Reporte> jListRelacionesSelectReporteTipoGrupoFormaPago;
	//public JScrollPane jScrollRelacionesSelectReporteTipoGrupoFormaPago;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoGrupoFormaPago;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoGrupoFormaPago;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoGrupoFormaPago;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoGrupoFormaPago;
	
		
	//public JLabel jLabelArchivoImportacionTipoGrupoFormaPago;	
	//public JLabel jLabelPathArchivoImportacionTipoGrupoFormaPago;
	//protected JTextField jTextFieldPathArchivoImportacionTipoGrupoFormaPago;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoGrupoFormaPago;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoGrupoFormaPago;
	
	//public JLabel jLabelColumnaCategoriaValorTipoGrupoFormaPago;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoGrupoFormaPago;
	
	//public JLabel jLabelColumnasValoresGraficoTipoGrupoFormaPago;
	//public JList<Reporte> jListColumnasValoresGraficoTipoGrupoFormaPago;
	//public JScrollPane jScrollColumnasValoresGraficoTipoGrupoFormaPago;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoGrupoFormaPago;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoGrupoFormaPago;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoGrupoFormaPago;
	public JPanel jPanelBusquedaPorIdTipoGrupoFormaPago;
	public JButton jButtonBusquedaPorIdTipoGrupoFormaPago;
	public JPanel jPanelBusquedaPorNombreTipoGrupoFormaPago;
	public JButton jButtonBusquedaPorNombreTipoGrupoFormaPago;
	
	public JPanel jPanelIdIdBusquedaPorIdTipoGrupoFormaPago;
	public JLabel jLabelidBusquedaPorIdTipoGrupoFormaPago;
	public JTextFieldMe jTextFieldidTipoGrupoFormaPagoBusquedaPorId;
	public JButton jButtonidBusquedaPorIdTipoGrupoFormaPagoBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTipoGrupoFormaPago;
	public JLabel jLabelnombreBusquedaPorNombreTipoGrupoFormaPago;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoGrupoFormaPago;
	public JButton jButtonnombreBusquedaPorNombreTipoGrupoFormaPagoBusqueda= new JButtonMe();

	
	
	
	
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
	public TipoGrupoFormaPagoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoGrupoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGrupoFormaPagoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGrupoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGrupoFormaPagoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGrupoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGrupoFormaPagoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoGrupoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoGrupoFormaPago)	{
		this.jButtonRecargarInformacionTipoGrupoFormaPago = jButtonRecargarInformacionTipoGrupoFormaPago;
	}
	
	public JButton getjButtonProcesarInformacionTipoGrupoFormaPago() {
		return this.jButtonProcesarInformacionTipoGrupoFormaPago;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoGrupoFormaPago)	{
		this.jButtonProcesarInformacionTipoGrupoFormaPago = jButtonProcesarInformacionTipoGrupoFormaPago;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoGrupoFormaPago() {
		return this.jButtonRecargarInformacionTipoGrupoFormaPago;
	}
	
	
	public List<TipoGrupoFormaPago> gettipogrupoformapagos() {
		return this.tipogrupoformapagos;
	}

	public void settipogrupoformapagos(List<TipoGrupoFormaPago> tipogrupoformapagos) {
		this.tipogrupoformapagos = tipogrupoformapagos;
	}
	
	public List<TipoGrupoFormaPago> gettipogrupoformapagosAux() {
		return this.tipogrupoformapagosAux;
	}

	public void settipogrupoformapagosAux(List<TipoGrupoFormaPago> tipogrupoformapagosAux) {
		this.tipogrupoformapagosAux = tipogrupoformapagosAux;
	}
	
	public List<TipoGrupoFormaPago> gettipogrupoformapagosEliminados() {
		return this.tipogrupoformapagosEliminados;
	}

	public void setTipoGrupoFormaPagosEliminados(List<TipoGrupoFormaPago> tipogrupoformapagosEliminados) {
		this.tipogrupoformapagosEliminados = tipogrupoformapagosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoGrupoFormaPago() {
		return jComboBoxTiposSeleccionarTipoGrupoFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoGrupoFormaPago(
			JComboBox jComboBoxTiposSeleccionarTipoGrupoFormaPago) {
		this.jComboBoxTiposSeleccionarTipoGrupoFormaPago = jComboBoxTiposSeleccionarTipoGrupoFormaPago;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoGrupoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoGrupoFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoGrupoFormaPago .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoGrupoFormaPago() {
		return jTextFieldValorCampoGeneralTipoGrupoFormaPago;
	}

	public void setjTextFieldValorCampoGeneralTipoGrupoFormaPago(
			JTextField jTextFieldValorCampoGeneralTipoGrupoFormaPago) {
		this.jTextFieldValorCampoGeneralTipoGrupoFormaPago = jTextFieldValorCampoGeneralTipoGrupoFormaPago;
	}

	public void setBorderResaltarValorCampoGeneralTipoGrupoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGrupoFormaPago.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoGrupoFormaPago .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoGrupoFormaPago() {
		return this.jCheckBoxSeleccionarTodosTipoGrupoFormaPago;
	}

	public void setjCheckBoxSeleccionarTodosTipoGrupoFormaPago(
			JCheckBox jCheckBoxSeleccionarTodosTipoGrupoFormaPago) {
		this.jCheckBoxSeleccionarTodosTipoGrupoFormaPago = jCheckBoxSeleccionarTodosTipoGrupoFormaPago;
	}

	public void setBorderResaltarSeleccionarTodosTipoGrupoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGrupoFormaPago.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoGrupoFormaPago .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoGrupoFormaPago() {
		return this.jCheckBoxSeleccionadosTipoGrupoFormaPago;
	}

	public void setjCheckBoxSeleccionadosTipoGrupoFormaPago(
			JCheckBox jCheckBoxSeleccionadosTipoGrupoFormaPago) {
		this.jCheckBoxSeleccionadosTipoGrupoFormaPago = jCheckBoxSeleccionadosTipoGrupoFormaPago;
	}
	
	public void setBorderResaltarSeleccionadosTipoGrupoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGrupoFormaPago.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoGrupoFormaPago .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoGrupoFormaPago() {
		return this.jComboBoxTiposArchivosReportesTipoGrupoFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoGrupoFormaPago(
			JComboBox jComboBoxTiposArchivosReportesTipoGrupoFormaPago) {
		this.jComboBoxTiposArchivosReportesTipoGrupoFormaPago = jComboBoxTiposArchivosReportesTipoGrupoFormaPago;
	}

	public void setBorderResaltarTiposArchivosReportesTipoGrupoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGrupoFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoGrupoFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoGrupoFormaPago() {
		return this.jComboBoxTiposReportesTipoGrupoFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoGrupoFormaPago(
			JComboBox jComboBoxTiposReportesTipoGrupoFormaPago) {
		this.jComboBoxTiposReportesTipoGrupoFormaPago = jComboBoxTiposReportesTipoGrupoFormaPago;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoGrupoFormaPago() {
	//	return jComboBoxTiposReportesDinamicoTipoGrupoFormaPago;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoGrupoFormaPago(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoGrupoFormaPago) {
	//	this.jComboBoxTiposReportesDinamicoTipoGrupoFormaPago = jComboBoxTiposReportesDinamicoTipoGrupoFormaPago;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoGrupoFormaPago() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoGrupoFormaPago;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoGrupoFormaPago(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoGrupoFormaPago) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoGrupoFormaPago = jComboBoxTiposArchivosReportesDinamicoTipoGrupoFormaPago;
	//}
	
	public void setBorderResaltarTiposReportesTipoGrupoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGrupoFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoGrupoFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoGrupoFormaPago() {
		return this.jComboBoxTiposGraficosReportesTipoGrupoFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoGrupoFormaPago(
			JComboBox jComboBoxTiposGraficosReportesTipoGrupoFormaPago) {
		this.jComboBoxTiposGraficosReportesTipoGrupoFormaPago = jComboBoxTiposGraficosReportesTipoGrupoFormaPago;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoGrupoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGrupoFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoGrupoFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoGrupoFormaPago() {
		return this.jComboBoxTiposPaginacionTipoGrupoFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoGrupoFormaPago(
			JComboBox jComboBoxTiposPaginacionTipoGrupoFormaPago) {
		this.jComboBoxTiposPaginacionTipoGrupoFormaPago = jComboBoxTiposPaginacionTipoGrupoFormaPago;
	}
	
	public void setBorderResaltarTiposPaginacionTipoGrupoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGrupoFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoGrupoFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoGrupoFormaPago() {
		return this.jComboBoxTiposRelacionesTipoGrupoFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoGrupoFormaPago() {
		return this.jComboBoxTiposAccionesTipoGrupoFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoGrupoFormaPago(
			JComboBox jComboBoxTiposRelacionesTipoGrupoFormaPago) {
		this.jComboBoxTiposRelacionesTipoGrupoFormaPago = jComboBoxTiposRelacionesTipoGrupoFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoGrupoFormaPago(
			JComboBox jComboBoxTiposAccionesTipoGrupoFormaPago) {
		this.jComboBoxTiposAccionesTipoGrupoFormaPago = jComboBoxTiposAccionesTipoGrupoFormaPago;
	}
	
	public void setBorderResaltarTiposRelacionesTipoGrupoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGrupoFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoGrupoFormaPago .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoGrupoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGrupoFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoGrupoFormaPago .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoGrupoFormaPago() {
	//	return jCheckBoxConGraficoDinamicoTipoGrupoFormaPago;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoGrupoFormaPago(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoGrupoFormaPago) {
	//	this.jCheckBoxConGraficoDinamicoTipoGrupoFormaPago = jCheckBoxConGraficoDinamicoTipoGrupoFormaPago;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoGrupoFormaPago() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoGrupoFormaPago.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoGrupoFormaPago .setBorder(borderResaltar);		
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
		this.tipogrupoformapagoSessionBean=new TipoGrupoFormaPagoSessionBean();
		
		this.tipogrupoformapagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipogrupoformapagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoGrupoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoGrupoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoGrupoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoGrupoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoGrupoFormaPagoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Grupo Forma Pago MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoGrupoFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoGrupoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoGrupoFormaPago= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoGrupoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoGrupoFormaPago,this.jTtoolBarTipoGrupoFormaPago,
							"nuevo","nuevo","Nuevo"+" "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoGrupoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoGrupoFormaPago,this.jTtoolBarTipoGrupoFormaPago,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoGrupoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoGrupoFormaPago,this.jTtoolBarTipoGrupoFormaPago,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoGrupoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoGrupoFormaPago,this.jTtoolBarTipoGrupoFormaPago,
							"duplicar","duplicar","Duplicar"+" "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoGrupoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoGrupoFormaPago,this.jTtoolBarTipoGrupoFormaPago,
							"copiar","copiar","Copiar"+" "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoGrupoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoGrupoFormaPago,this.jTtoolBarTipoGrupoFormaPago,
							"ver_form","ver_form","Ver"+" "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoGrupoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoGrupoFormaPago,this.jTtoolBarTipoGrupoFormaPago,
							"recargar","recargar","Recargar"+" "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoGrupoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoGrupoFormaPago,this.jTtoolBarTipoGrupoFormaPago,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoGrupoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoGrupoFormaPago,this.jTtoolBarTipoGrupoFormaPago,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoGrupoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoGrupoFormaPago,this.jTtoolBarTipoGrupoFormaPago,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoGrupoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoGrupoFormaPago,this.jTtoolBarTipoGrupoFormaPago,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoGrupoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoGrupoFormaPago,this.jTtoolBarTipoGrupoFormaPago,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoGrupoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoGrupoFormaPago,this.jTtoolBarTipoGrupoFormaPago,
							"cerrar","cerrar","Salir"+" "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoGrupoFormaPago=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoGrupoFormaPago;
			
				this.jButtonProcesarInformacionToolBarTipoGrupoFormaPago=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoGrupoFormaPago;
				
		//protected JButton jButtonModificarToolBarTipoGrupoFormaPago;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoGrupoFormaPago=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoGrupoFormaPago=new JMenuMe("General");
		this.jmenuArchivoTipoGrupoFormaPago=new JMenuMe("Archivo");
		this.jmenuAccionesTipoGrupoFormaPago=new JMenuMe("Acciones");
		this.jmenuDatosTipoGrupoFormaPago=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoGrupoFormaPago= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoGrupoFormaPago.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoGrupoFormaPago,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoGrupoFormaPago= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoGrupoFormaPago.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoGrupoFormaPago,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoGrupoFormaPago= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoGrupoFormaPago.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoGrupoFormaPago,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoGrupoFormaPago= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoGrupoFormaPago.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoGrupoFormaPago,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoGrupoFormaPago= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoGrupoFormaPago.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoGrupoFormaPago,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoGrupoFormaPago= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoGrupoFormaPago.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoGrupoFormaPago,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoGrupoFormaPago= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoGrupoFormaPago.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoGrupoFormaPago,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoGrupoFormaPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoGrupoFormaPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoGrupoFormaPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoGrupoFormaPago= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoGrupoFormaPago.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoGrupoFormaPago,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoGrupoFormaPago= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoGrupoFormaPago.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoGrupoFormaPago,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoGrupoFormaPago= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoGrupoFormaPago.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoGrupoFormaPago,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoGrupoFormaPago= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoGrupoFormaPago.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoGrupoFormaPago,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoGrupoFormaPago= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoGrupoFormaPago.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoGrupoFormaPago,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoGrupoFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoGrupoFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoGrupoFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoGrupoFormaPago= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoGrupoFormaPago.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoGrupoFormaPago,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoGrupoFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoGrupoFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoGrupoFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoGrupoFormaPago= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoGrupoFormaPago.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoGrupoFormaPago,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoGrupoFormaPago.add(this.jMenuItemCerrarTipoGrupoFormaPago);
			
			this.jmenuAccionesTipoGrupoFormaPago.add(this.jMenuItemNuevoTipoGrupoFormaPago);
			this.jmenuAccionesTipoGrupoFormaPago.add(this.jMenuItemNuevoGuardarCambiosTipoGrupoFormaPago);
			this.jmenuAccionesTipoGrupoFormaPago.add(this.jMenuItemNuevoRelacionesTipoGrupoFormaPago);
			this.jmenuAccionesTipoGrupoFormaPago.add(this.jMenuItemGuardarCambiosTablaTipoGrupoFormaPago);		
			this.jmenuAccionesTipoGrupoFormaPago.add(this.jMenuItemDuplicarTipoGrupoFormaPago);		
			this.jmenuAccionesTipoGrupoFormaPago.add(this.jMenuItemCopiarTipoGrupoFormaPago);		
			this.jmenuAccionesTipoGrupoFormaPago.add(this.jMenuItemVerFormTipoGrupoFormaPago);		
			
			this.jmenuDatosTipoGrupoFormaPago.add(this.jMenuItemRecargarInformacionTipoGrupoFormaPago);				
			this.jmenuDatosTipoGrupoFormaPago.add(this.jMenuItemAnterioresTipoGrupoFormaPago);				
			this.jmenuDatosTipoGrupoFormaPago.add(this.jMenuItemSiguientesTipoGrupoFormaPago);				
			this.jmenuDatosTipoGrupoFormaPago.add(this.jMenuItemAbrirOrderByTipoGrupoFormaPago);				
			this.jmenuDatosTipoGrupoFormaPago.add(this.jMenuItemMostrarOcultarTipoGrupoFormaPago);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoGrupoFormaPago.add(this.jMenuItemGuardarCambiosTipoGrupoFormaPago);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoGrupoFormaPago.add(this.jmenuArchivoTipoGrupoFormaPago);		
			this.jmenuBarTipoGrupoFormaPago.add(this.jmenuAccionesTipoGrupoFormaPago);		
			this.jmenuBarTipoGrupoFormaPago.add(this.jmenuDatosTipoGrupoFormaPago);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoGrupoFormaPago);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoGrupoFormaPago() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorIdTipoGrupoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdTipoGrupoFormaPago.setToolTipText("Buscar Por Id ");
		this.jButtonBusquedaPorIdTipoGrupoFormaPago= new JButtonMe();
		this.jButtonBusquedaPorIdTipoGrupoFormaPago.setText("Buscar");
		this.jButtonBusquedaPorIdTipoGrupoFormaPago.setToolTipText("Buscar Por Id ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdTipoGrupoFormaPago,"buscar_button","Buscar Por Id ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			jLabelidBusquedaPorIdTipoGrupoFormaPago = new JLabelMe();
		jLabelidBusquedaPorIdTipoGrupoFormaPago.setText("Id :");
		jLabelidBusquedaPorIdTipoGrupoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaPorIdTipoGrupoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaPorIdTipoGrupoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));

		FuncionesSwing.setBoldLabel(jLabelidBusquedaPorIdTipoGrupoFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldidTipoGrupoFormaPagoBusquedaPorId= new JTextFieldMe();
		jTextFieldidTipoGrupoFormaPagoBusquedaPorId.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoGrupoFormaPagoBusquedaPorId.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoGrupoFormaPagoBusquedaPorId.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



		this.jPanelBusquedaPorNombreTipoGrupoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoGrupoFormaPago.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoGrupoFormaPago= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoGrupoFormaPago.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoGrupoFormaPago.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoGrupoFormaPago,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoGrupoFormaPago = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoGrupoFormaPago.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoGrupoFormaPago.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoGrupoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoGrupoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoGrupoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoGrupoFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoGrupoFormaPago= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoGrupoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoGrupoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoGrupoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoGrupoFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoGrupoFormaPago=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoGrupoFormaPago.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoGrupoFormaPago.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoGrupoFormaPago.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoGrupoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoGrupoFormaPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoGrupoFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoGrupoFormaPago = new TipoGrupoFormaPagoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Grupo Forma Pago DATOS");
			this.jInternalFrameDetalleFormTipoGrupoFormaPago = new TipoGrupoFormaPagoDetalleFormJInternalFrame(jDesktopPane,this.tipogrupoformapagoSessionBean.getConGuardarRelaciones(),this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoGrupoFormaPago = null;//new TipoGrupoFormaPagoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoGrupoFormaPago= new GridBagLayout();
		
		
		this.jTableDatosTipoGrupoFormaPago = new JTableMe();      
		
		String sToolTipTipoGrupoFormaPago="";
		sToolTipTipoGrupoFormaPago=TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoGrupoFormaPago+="(Facturacion.TipoGrupoFormaPago)";
		}
		
		if(!this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoGrupoFormaPago+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoGrupoFormaPago.setToolTipText(sToolTipTipoGrupoFormaPago);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoGrupoFormaPago);
		this.jTableDatosTipoGrupoFormaPago.setAutoCreateRowSorter(true);
		this.jTableDatosTipoGrupoFormaPago.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoGrupoFormaPago.setRowSelectionAllowed(true);
		this.jTableDatosTipoGrupoFormaPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoGrupoFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoGrupoFormaPago = new JButtonMe();
		this.jButtonDuplicarTipoGrupoFormaPago = new JButtonMe();
		this.jButtonCopiarTipoGrupoFormaPago = new JButtonMe();
		this.jButtonVerFormTipoGrupoFormaPago = new JButtonMe();
		this.jButtonNuevoRelacionesTipoGrupoFormaPago = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoGrupoFormaPago = new JButtonMe();
		this.jButtonCerrarTipoGrupoFormaPago = new JButtonMe();
		
		this.jScrollPanelDatosTipoGrupoFormaPago = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoGrupoFormaPago = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoGrupoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Grupo Forma Pago";
		
		if(!this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoGrupoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Grupo Forma Pagos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoGrupoFormaPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoGrupoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoGrupoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoGrupoFormaPago.setToolTipText("Acciones");
        this.jPanelAccionesTipoGrupoFormaPago.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoGrupoFormaPago=new ReporteDinamicoJInternalFrame(TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoGrupoFormaPago();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoGrupoFormaPago=new ImportacionJInternalFrame(TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoGrupoFormaPago();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoGrupoFormaPago = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoGrupoFormaPago.setText("Orden");
		this.jButtonAbrirOrderByTipoGrupoFormaPago.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoGrupoFormaPago,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoGrupoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoGrupoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoGrupoFormaPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGrupoFormaPago,false,this);
			
			//this.cargarOrderByTipoGrupoFormaPago(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoGrupoFormaPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGrupoFormaPago,true,this);
			
			//this.cargarOrderByTipoGrupoFormaPago(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoGrupoFormaPago.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosTipoGrupoFormaPago.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosTipoGrupoFormaPago.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosTipoGrupoFormaPago.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoGrupoFormaPago.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoGrupoFormaPago.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoGrupoFormaPago.setText("Nuevo");
		this.jButtonDuplicarTipoGrupoFormaPago.setText("Duplicar");
		this.jButtonCopiarTipoGrupoFormaPago.setText("Copiar");
		this.jButtonVerFormTipoGrupoFormaPago.setText("Ver");
		this.jButtonNuevoRelacionesTipoGrupoFormaPago.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoGrupoFormaPago.setText("Guardar");
		this.jButtonCerrarTipoGrupoFormaPago.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoGrupoFormaPago,"nuevo_button","Nuevo",this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoGrupoFormaPago,"duplicar_button","Duplicar",this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoGrupoFormaPago,"copiar_button","Copiar",this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoGrupoFormaPago,"ver_form","Ver",this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoGrupoFormaPago,"nuevorelaciones_button","Nuevo Rel",this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoGrupoFormaPago,"guardarcambiostabla_button","Guardar",this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoGrupoFormaPago,"cerrar_button","Salir",this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoGrupoFormaPago.setToolTipText("Nuevo"+" "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoGrupoFormaPago.setToolTipText("Duplicar"+" "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoGrupoFormaPago.setToolTipText("Copiar"+" "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoGrupoFormaPago.setToolTipText("Ver"+" "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoGrupoFormaPago.setToolTipText("Nuevo Rel"+" "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoGrupoFormaPago.setToolTipText("Guardar"+" "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoGrupoFormaPago.setToolTipText("Salir"+" "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoGrupoFormaPago";
		inputMap = this.jButtonNuevoTipoGrupoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoGrupoFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoGrupoFormaPago"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoGrupoFormaPago";
		inputMap = this.jButtonDuplicarTipoGrupoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoGrupoFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoGrupoFormaPago"));
		
		//COPIAR
		sMapKey = "CopiarTipoGrupoFormaPago";
		inputMap = this.jButtonCopiarTipoGrupoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoGrupoFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoGrupoFormaPago"));
		
		//VEr FORM
		sMapKey = "VerFormTipoGrupoFormaPago";
		inputMap = this.jButtonVerFormTipoGrupoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoGrupoFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoGrupoFormaPago"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoGrupoFormaPago";
		inputMap = this.jButtonNuevoRelacionesTipoGrupoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoGrupoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoGrupoFormaPago"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoGrupoFormaPago";
		inputMap = this.jButtonModificarTipoGrupoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoGrupoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoGrupoFormaPago"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoGrupoFormaPago";
		inputMap = this.jButtonCerrarTipoGrupoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoGrupoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoGrupoFormaPago"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoGrupoFormaPago";
		inputMap = this.jButtonGuardarCambiosTablaTipoGrupoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoGrupoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoGrupoFormaPago"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoGrupoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoGrupoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoGrupoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoGrupoFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoGrupoFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoGrupoFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoGrupoFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoGrupoFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoGrupoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoGrupoFormaPago.setName("jPanelParametrosReportesTipoGrupoFormaPago"); 
		
		this.jPanelParametrosReportesAccionesTipoGrupoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoGrupoFormaPago.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoGrupoFormaPago.setName("jPanelParametrosReportesAccionesTipoGrupoFormaPago"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoGrupoFormaPago = new JButtonMe();
		this.jButtonRecargarInformacionTipoGrupoFormaPago.setText("Recargar");
		this.jButtonRecargarInformacionTipoGrupoFormaPago.setToolTipText("Recargar"+" "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoGrupoFormaPago,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoGrupoFormaPago = new JButtonMe();
		this.jButtonProcesarInformacionTipoGrupoFormaPago.setText("Procesar");
		this.jButtonProcesarInformacionTipoGrupoFormaPago.setToolTipText("Procesar"+" "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoGrupoFormaPago.setVisible(false);
			
		this.jButtonProcesarInformacionTipoGrupoFormaPago.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoGrupoFormaPago.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoGrupoFormaPago.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoGrupoFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoGrupoFormaPago.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoGrupoFormaPago.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoGrupoFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoGrupoFormaPago.setText("TIPO");       
		this.jComboBoxTiposReportesTipoGrupoFormaPago.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoGrupoFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoGrupoFormaPago.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoGrupoFormaPago.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoGrupoFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoGrupoFormaPago.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoGrupoFormaPago.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoGrupoFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoGrupoFormaPago.setText("Accion");
		this.jComboBoxTiposRelacionesTipoGrupoFormaPago.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoGrupoFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoGrupoFormaPago.setText("Accion");
		this.jComboBoxTiposAccionesTipoGrupoFormaPago.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoGrupoFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoGrupoFormaPago.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoGrupoFormaPago.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoGrupoFormaPago=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoGrupoFormaPago.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoGrupoFormaPago.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoGrupoFormaPago.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoGrupoFormaPago = new JLabelMe();
		
		this.jLabelAccionesTipoGrupoFormaPago.setText("Acciones");		
		this.jLabelAccionesTipoGrupoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGrupoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGrupoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoGrupoFormaPago = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoGrupoFormaPago.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoGrupoFormaPago.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoGrupoFormaPago = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoGrupoFormaPago.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoGrupoFormaPago.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoGrupoFormaPago = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoGrupoFormaPago.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoGrupoFormaPago.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoGrupoFormaPago = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoGrupoFormaPago.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoGrupoFormaPago.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoGrupoFormaPago = new JButtonMe();
		//this.jButtonAnterioresTipoGrupoFormaPago.setText("<<");
        this.jButtonAnterioresTipoGrupoFormaPago.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoGrupoFormaPago,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoGrupoFormaPago = new JButtonMe();
		//this.jButtonSiguientesTipoGrupoFormaPago.setText(">>");
        this.jButtonSiguientesTipoGrupoFormaPago.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoGrupoFormaPago,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoGrupoFormaPago = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoGrupoFormaPago.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoGrupoFormaPago.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoGrupoFormaPago,"nuevoguardarcambios_button","Nue",this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoGrupoFormaPago";
		inputMap = this.jButtonNuevoGuardarCambiosTipoGrupoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoGrupoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoGrupoFormaPago"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoGrupoFormaPago";
		inputMap = this.jButtonRecargarInformacionTipoGrupoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoGrupoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoGrupoFormaPago"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoGrupoFormaPago";
		inputMap = this.jButtonSiguientesTipoGrupoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoGrupoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoGrupoFormaPago"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoGrupoFormaPago";
		inputMap = this.jButtonAnterioresTipoGrupoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoGrupoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoGrupoFormaPago"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoGrupoFormaPago();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoGrupoFormaPago.setMinimumSize(new Dimension(this.getWidth(),TipoGrupoFormaPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoGrupoFormaPagoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoGrupoFormaPago.setMaximumSize(new Dimension(this.getWidth(),TipoGrupoFormaPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoGrupoFormaPagoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoGrupoFormaPago.setPreferredSize(new Dimension(this.getWidth(),TipoGrupoFormaPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoGrupoFormaPagoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoGrupoFormaPago = new GridBagLayout();

			this.jPanelPaginacionTipoGrupoFormaPago.setLayout(gridaBagLayoutPaginacionTipoGrupoFormaPago);						
			
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFormaPago.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoFormaPago.gridy = 0;
			this.gridBagConstraintsTipoGrupoFormaPago.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoGrupoFormaPago.add(this.jButtonAnterioresTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
					
						
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFormaPago.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoGrupoFormaPago.gridy = 0;
			
			this.jPanelPaginacionTipoGrupoFormaPago.add(this.jButtonNuevoGuardarCambiosTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
						
			
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFormaPago.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoGrupoFormaPago.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoGrupoFormaPago.gridy = 0;
			this.jPanelPaginacionTipoGrupoFormaPago.add(this.jButtonSiguientesTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoFormaPago.gridy = 1;
			this.gridBagConstraintsTipoGrupoFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGrupoFormaPago.add(this.jButtonNuevoTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
				this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoGrupoFormaPago.gridy = 1;
				this.gridBagConstraintsTipoGrupoFormaPago.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoGrupoFormaPago.add(this.jButtonNuevoRelacionesTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
			}
			
			
			if(!this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
				this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoGrupoFormaPago.gridy = 1;
				this.gridBagConstraintsTipoGrupoFormaPago.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoGrupoFormaPago.add(this.jButtonGuardarCambiosTablaTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
			}
			
			
			
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoFormaPago.gridy = 1;
			this.gridBagConstraintsTipoGrupoFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGrupoFormaPago.add(this.jButtonDuplicarTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
			
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoFormaPago.gridy = 1;
			this.gridBagConstraintsTipoGrupoFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGrupoFormaPago.add(this.jButtonCopiarTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
		
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoFormaPago.gridy = 1;
			this.gridBagConstraintsTipoGrupoFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGrupoFormaPago.add(this.jButtonVerFormTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
		
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoFormaPago.gridy = 1;
			this.gridBagConstraintsTipoGrupoFormaPago.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoGrupoFormaPago.add(this.jButtonCerrarTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
		
		
		
		this.jButtonRecargarInformacionTipoGrupoFormaPago.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoGrupoFormaPago.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoGrupoFormaPago.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoGrupoFormaPago.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoGrupoFormaPago.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoGrupoFormaPago.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoGrupoFormaPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoGrupoFormaPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoGrupoFormaPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoGrupoFormaPago.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoGrupoFormaPago.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoGrupoFormaPago.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoGrupoFormaPago.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoGrupoFormaPago.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoGrupoFormaPago.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoGrupoFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoGrupoFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoGrupoFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoGrupoFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGrupoFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGrupoFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoGrupoFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoGrupoFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoGrupoFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoGrupoFormaPago.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoGrupoFormaPago.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoGrupoFormaPago.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoGrupoFormaPago.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoGrupoFormaPago.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoGrupoFormaPago.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoGrupoFormaPago.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoGrupoFormaPago.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoGrupoFormaPago.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoGrupoFormaPago.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoGrupoFormaPago.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoGrupoFormaPago.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoGrupoFormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoGrupoFormaPago = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoGrupoFormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoGrupoFormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoGrupoFormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoGrupoFormaPago = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoGrupoFormaPago.setLayout(gridaBagParametrosReportesTipoGrupoFormaPago);
			this.jPanelParametrosReportesAccionesTipoGrupoFormaPago.setLayout(gridaBagParametrosReportesAccionesTipoGrupoFormaPago);
			
			
			this.jPanelParametrosAuxiliar1TipoGrupoFormaPago.setLayout(gridaBagParametrosAuxiliar1TipoGrupoFormaPago);
			this.jPanelParametrosAuxiliar2TipoGrupoFormaPago.setLayout(gridaBagParametrosAuxiliar2TipoGrupoFormaPago);
			this.jPanelParametrosAuxiliar3TipoGrupoFormaPago.setLayout(gridaBagParametrosAuxiliar3TipoGrupoFormaPago);
			this.jPanelParametrosAuxiliar4TipoGrupoFormaPago.setLayout(gridaBagParametrosAuxiliar4TipoGrupoFormaPago);
			//this.jPanelParametrosAuxiliar5TipoGrupoFormaPago.setLayout(gridaBagParametrosAuxiliar2TipoGrupoFormaPago);			
			
			
			
			
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoGrupoFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGrupoFormaPago.add(this.jButtonRecargarInformacionTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoFormaPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoGrupoFormaPago.add(this.jComboBoxTiposPaginacionTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoFormaPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoGrupoFormaPago.add(this.jCheckBoxConAltoMaximoTablaTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoFormaPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoGrupoFormaPago.add(this.jComboBoxTiposArchivosReportesTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGrupoFormaPago.add(this.jPanelParametrosAuxiliar1TipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoGrupoFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoGrupoFormaPago.add(this.jComboBoxTiposReportesTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGrupoFormaPago.add(this.jPanelParametrosAuxiliar4TipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoFormaPago.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGrupoFormaPago.add(this.jComboBoxTiposReportesTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoFormaPago.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoGrupoFormaPago.add(this.jCheckBoxGenerarReporteTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGrupoFormaPago.add(this.jPanelParametrosAuxiliar2TipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoGrupoFormaPago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoGrupoFormaPago.add(this.jLabelAccionesTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
				this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoGrupoFormaPago.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoGrupoFormaPago.add(this.jButtonAbrirOrderByTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGrupoFormaPago.add(this.jComboBoxTiposSeleccionarTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);			
			
			
			/*
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoGrupoFormaPago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoGrupoFormaPago.add(this.jCheckBoxSeleccionarTodosTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoGrupoFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoGrupoFormaPago.add(this.jCheckBoxSeleccionarTodosTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);															
				
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoGrupoFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoGrupoFormaPago.add(this.jCheckBoxSeleccionadosTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGrupoFormaPago.add(this.jPanelParametrosAuxiliar3TipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGrupoFormaPago.add(this.jComboBoxTiposRelacionesTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
				
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGrupoFormaPago.add(this.jComboBoxTiposAccionesTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
	
				
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGrupoFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGrupoFormaPago.add(this.jTextFieldValorCampoGeneralTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoGrupoFormaPago = new GridBagLayout();

			this.jScrollPanelDatosTipoGrupoFormaPago.setLayout(gridaBagLayoutDatosTipoGrupoFormaPago);
			
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoFormaPago.gridy = 0;
			this.gridBagConstraintsTipoGrupoFormaPago.gridx = 0;
			
			this.jScrollPanelDatosTipoGrupoFormaPago.add(this.jTableDatosTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoGrupoFormaPago.setViewportView(this.jTableDatosTipoGrupoFormaPago);
		this.jTableDatosTipoGrupoFormaPago.setFillsViewportHeight(true);
		this.jTableDatosTipoGrupoFormaPago.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoGrupoFormaPago= new GridBagLayout();
		this.jPanelAccionesTipoGrupoFormaPago.setLayout(gridaBagLayoutAccionesTipoGrupoFormaPago);
		
		
		/*	
		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoFormaPago.gridy = 0;
		this.gridBagConstraintsTipoGrupoFormaPago.gridx = 0;
			
		this.jPanelAccionesTipoGrupoFormaPago.add(this.jButtonNuevoTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorIdTipoGrupoFormaPago= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdTipoGrupoFormaPago.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdTipoGrupoFormaPago.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdTipoGrupoFormaPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdTipoGrupoFormaPago.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdTipoGrupoFormaPago.setLayout(gridaBagLayoutBusquedaPorIdTipoGrupoFormaPago);

		gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		gridBagConstraintsTipoGrupoFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGrupoFormaPago.gridy = 0;
		gridBagConstraintsTipoGrupoFormaPago.gridx = 0;
		jPanelBusquedaPorIdTipoGrupoFormaPago.add(jLabelidBusquedaPorIdTipoGrupoFormaPago, gridBagConstraintsTipoGrupoFormaPago);

		gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		gridBagConstraintsTipoGrupoFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGrupoFormaPago.gridy = 0;
		gridBagConstraintsTipoGrupoFormaPago.gridx = 1;
		jPanelBusquedaPorIdTipoGrupoFormaPago.add(jTextFieldidTipoGrupoFormaPagoBusquedaPorId, gridBagConstraintsTipoGrupoFormaPago);

		gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		gridBagConstraintsTipoGrupoFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGrupoFormaPago.gridy = 1;
		gridBagConstraintsTipoGrupoFormaPago.gridx =1;
		jPanelBusquedaPorIdTipoGrupoFormaPago.add(jButtonBusquedaPorIdTipoGrupoFormaPago, gridBagConstraintsTipoGrupoFormaPago);

		jTabbedPaneBusquedasTipoGrupoFormaPago.addTab("1.-Por Id ", jPanelBusquedaPorIdTipoGrupoFormaPago);
		jTabbedPaneBusquedasTipoGrupoFormaPago.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoGrupoFormaPago= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoGrupoFormaPago.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoGrupoFormaPago.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoGrupoFormaPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoGrupoFormaPago.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoGrupoFormaPago.setLayout(gridaBagLayoutBusquedaPorNombreTipoGrupoFormaPago);

		gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		gridBagConstraintsTipoGrupoFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGrupoFormaPago.gridy = 0;
		gridBagConstraintsTipoGrupoFormaPago.gridx = 0;
		jPanelBusquedaPorNombreTipoGrupoFormaPago.add(jLabelnombreBusquedaPorNombreTipoGrupoFormaPago, gridBagConstraintsTipoGrupoFormaPago);

		gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		gridBagConstraintsTipoGrupoFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGrupoFormaPago.gridy = 0;
		gridBagConstraintsTipoGrupoFormaPago.gridx = 1;
		jPanelBusquedaPorNombreTipoGrupoFormaPago.add(jTextAreanombreBusquedaPorNombreTipoGrupoFormaPago, gridBagConstraintsTipoGrupoFormaPago);

		gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		gridBagConstraintsTipoGrupoFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGrupoFormaPago.gridy = 1;
		gridBagConstraintsTipoGrupoFormaPago.gridx =1;
		jPanelBusquedaPorNombreTipoGrupoFormaPago.add(jButtonBusquedaPorNombreTipoGrupoFormaPago, gridBagConstraintsTipoGrupoFormaPago);

		jTabbedPaneBusquedasTipoGrupoFormaPago.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreTipoGrupoFormaPago);
		jTabbedPaneBusquedasTipoGrupoFormaPago.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoGrupoFormaPago = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoGrupoFormaPago);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();						
			this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoGrupoFormaPago.gridx = 0;		
			//this.gridBagConstraintsTipoGrupoFormaPago.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoFormaPago.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoGrupoFormaPago.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoGrupoFormaPago.gridx = 0;		
		//this.gridBagConstraintsTipoGrupoFormaPago.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoFormaPago.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoGrupoFormaPago.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoGrupoFormaPago);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoGrupoFormaPago.gridx = 0;		
			this.gridBagConstraintsTipoGrupoFormaPago.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoFormaPago.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoGrupoFormaPago.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGrupoFormaPago.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);								
		
		
		/*
		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGrupoFormaPago.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
		*/		
		
		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoGrupoFormaPago.gridx =0;
		this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoGrupoFormaPago.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
				
		
		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGrupoFormaPago.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoGrupoFormaPagoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoGrupoFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoGrupoFormaPago = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoGrupoFormaPago.setLayout(gridaBagLayoutBusquedasParametrosTipoGrupoFormaPago);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoGrupoFormaPago=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoGrupoFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGrupoFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGrupoFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGrupoFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
			
			
		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGrupoFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
		
			
		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoGrupoFormaPago.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoGrupoFormaPago;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoGrupoFormaPago() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoGrupoFormaPago = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoGrupoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoGrupoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoGrupoFormaPago.setName("jPanelReporteDinamicoTipoGrupoFormaPago"); 
		
		this.jPanelReporteDinamicoTipoGrupoFormaPago.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoGrupoFormaPago.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoGrupoFormaPago.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoGrupoFormaPago.setLayout(gridaBagLayoutReporteDinamicoTipoGrupoFormaPago);
		
		
		this.jInternalFrameReporteDinamicoTipoGrupoFormaPago= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoGrupoFormaPago = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoGrupoFormaPago= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoGrupoFormaPago.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoGrupoFormaPago.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoGrupoFormaPago.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoGrupoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Grupo Forma Pagos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoGrupoFormaPago = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoGrupoFormaPago.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoGrupoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoGrupoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoGrupoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGrupoFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGrupoFormaPago.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoGrupoFormaPago.add(this.jLabelColumnasSelectReporteTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoGrupoFormaPago = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoGrupoFormaPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoGrupoFormaPago.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoGrupoFormaPago.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoGrupoFormaPago.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoGrupoFormaPago.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoGrupoFormaPago=new JScrollPane(this.jListColumnasSelectReporteTipoGrupoFormaPago);
			
			this.jScrollColumnasSelectReporteTipoGrupoFormaPago.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoGrupoFormaPago.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoGrupoFormaPago.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoGrupoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGrupoFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGrupoFormaPago.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoGrupoFormaPago.add(this.jListColumnasSelectReporteTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
		this.jPanelReporteDinamicoTipoGrupoFormaPago.add(this.jScrollColumnasSelectReporteTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoGrupoFormaPago = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoGrupoFormaPago.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoGrupoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoGrupoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoGrupoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGrupoFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGrupoFormaPago.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoGrupoFormaPago.add(this.jLabelRelacionesSelectReporteTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoGrupoFormaPago = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoGrupoFormaPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoGrupoFormaPago.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoGrupoFormaPago.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoGrupoFormaPago.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoGrupoFormaPago.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoGrupoFormaPago=new JScrollPane(this.jListRelacionesSelectReporteTipoGrupoFormaPago);
			
			this.jScrollRelacionesSelectReporteTipoGrupoFormaPago.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoGrupoFormaPago.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoGrupoFormaPago.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoGrupoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGrupoFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGrupoFormaPago.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoGrupoFormaPago.add(this.jListRelacionesSelectReporteTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
		this.jPanelReporteDinamicoTipoGrupoFormaPago.add(this.jScrollRelacionesSelectReporteTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoGrupoFormaPago = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoGrupoFormaPago = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoGrupoFormaPago = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoGrupoFormaPago = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoGrupoFormaPago.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoGrupoFormaPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoGrupoFormaPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoGrupoFormaPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoGrupoFormaPago = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoGrupoFormaPago.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoGrupoFormaPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoGrupoFormaPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoGrupoFormaPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoGrupoFormaPago = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoGrupoFormaPago.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoGrupoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoGrupoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoGrupoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGrupoFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGrupoFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoGrupoFormaPago.add(this.jLabelGenerarExcelReporteDinamicoTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoGrupoFormaPago = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoGrupoFormaPago.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoGrupoFormaPago,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoGrupoFormaPago.setToolTipText("Generar EXCEL"+" "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoGrupoFormaPago.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoGrupoFormaPago.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoGrupoFormaPago.add(this.jButtonGenerarExcelReporteDinamicoTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGrupoFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGrupoFormaPago.add(this.jComboBoxTiposReportesDinamicoTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoGrupoFormaPago = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoGrupoFormaPago.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoGrupoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoGrupoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoGrupoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGrupoFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGrupoFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoGrupoFormaPago.add(this.jLabelTiposArchivoReporteDinamicoTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGrupoFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGrupoFormaPago.add(this.jComboBoxTiposArchivosReportesDinamicoTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoGrupoFormaPago = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoGrupoFormaPago.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoGrupoFormaPago,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoGrupoFormaPago.setToolTipText("Generar"+" "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGrupoFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGrupoFormaPago.add(this.jButtonGenerarReporteDinamicoTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoGrupoFormaPago = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoGrupoFormaPago.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoGrupoFormaPago,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoGrupoFormaPago.setToolTipText("Cancelar"+" "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGrupoFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGrupoFormaPago.add(this.jButtonCerrarReporteDinamicoTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoGrupoFormaPago = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoGrupoFormaPago= new JScrollPane(jPanelReporteDinamicoTipoGrupoFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoGrupoFormaPago.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoGrupoFormaPago.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoGrupoFormaPago.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoGrupoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Grupo Forma Pagos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoGrupoFormaPago.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoGrupoFormaPago);
		this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.getContentPane().add(this.jScrollPanelReporteDinamicoTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoGrupoFormaPago() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoGrupoFormaPago = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoGrupoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoGrupoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoGrupoFormaPago.setName("jPanelImportacionTipoGrupoFormaPago"); 
		
		this.jPanelImportacionTipoGrupoFormaPago.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoGrupoFormaPago.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoGrupoFormaPago.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoGrupoFormaPago.setLayout(gridaBagLayoutImportacionTipoGrupoFormaPago);
		
		
		this.jInternalFrameImportacionTipoGrupoFormaPago= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoGrupoFormaPago= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoGrupoFormaPago = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoGrupoFormaPago= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoGrupoFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoGrupoFormaPago.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoGrupoFormaPago.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoGrupoFormaPago.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoGrupoFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoGrupoFormaPago.setResizable(true);
	    this.jInternalFrameImportacionTipoGrupoFormaPago.setClosable(true);
	    this.jInternalFrameImportacionTipoGrupoFormaPago.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoGrupoFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoGrupoFormaPago.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoGrupoFormaPago.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoGrupoFormaPago.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoGrupoFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoGrupoFormaPago.setResizable(true);
	    this.jInternalFrameImportacionTipoGrupoFormaPago.setClosable(true);
	    this.jInternalFrameImportacionTipoGrupoFormaPago.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoGrupoFormaPago.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoGrupoFormaPago.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoGrupoFormaPago.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoGrupoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Grupo Forma Pagos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoGrupoFormaPago = new JLabelMe();

		this.jLabelArchivoImportacionTipoGrupoFormaPago.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoGrupoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoGrupoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoGrupoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGrupoFormaPago.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoGrupoFormaPago.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoGrupoFormaPago.add(this.jLabelArchivoImportacionTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoGrupoFormaPago = new JFileChooser();		
		this.jFileChooserImportacionTipoGrupoFormaPago.setToolTipText("ESCOGER ARCHIVO"+" "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoGrupoFormaPago = new JButtonMe();
		this.jButtonAbrirImportacionTipoGrupoFormaPago.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoGrupoFormaPago,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoGrupoFormaPago.setToolTipText("Generar"+" "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGrupoFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGrupoFormaPago.add(this.jButtonAbrirImportacionTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoGrupoFormaPago = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoGrupoFormaPago.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoGrupoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoGrupoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoGrupoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGrupoFormaPago.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoGrupoFormaPago.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoGrupoFormaPago.add(this.jLabelPathArchivoImportacionTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoGrupoFormaPago=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoGrupoFormaPago.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoGrupoFormaPago.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoGrupoFormaPago.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGrupoFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGrupoFormaPago.add(this.jTextFieldPathArchivoImportacionTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoGrupoFormaPago = new JButtonMe();
		this.jButtonGenerarImportacionTipoGrupoFormaPago.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoGrupoFormaPago,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoGrupoFormaPago.setToolTipText("Generar"+" "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGrupoFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGrupoFormaPago.add(this.jButtonGenerarImportacionTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoGrupoFormaPago = new JButtonMe();
		this.jButtonCerrarImportacionTipoGrupoFormaPago.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoGrupoFormaPago,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoGrupoFormaPago.setToolTipText("Cancelar"+" "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGrupoFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGrupoFormaPago.add(this.jButtonCerrarImportacionTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoGrupoFormaPago = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoGrupoFormaPago= new JScrollPane(jPanelImportacionTipoGrupoFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoGrupoFormaPago.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoGrupoFormaPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoGrupoFormaPago.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoGrupoFormaPago);
		this.jInternalFrameImportacionTipoGrupoFormaPago.getContentPane().add(this.jScrollPanelImportacionTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoGrupoFormaPago(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoGrupoFormaPago = new JButtonMe();
			this.jButtonAbrirOrderByTipoGrupoFormaPago.setText("Orden");
			this.jButtonAbrirOrderByTipoGrupoFormaPago.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoGrupoFormaPago,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoGrupoFormaPago";
			inputMap = this.jButtonAbrirOrderByTipoGrupoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoGrupoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoGrupoFormaPago"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoGrupoFormaPago = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoGrupoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoGrupoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoGrupoFormaPago.setName("jPanelOrderByTipoGrupoFormaPago"); 
			
			this.jPanelOrderByTipoGrupoFormaPago.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoGrupoFormaPago.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoGrupoFormaPago.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoGrupoFormaPago.setLayout(gridaBagLayoutOrderByTipoGrupoFormaPago);
			
			
			this.jTableDatosTipoGrupoFormaPagoOrderBy = new JTableMe();        
			this.jTableDatosTipoGrupoFormaPagoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoGrupoFormaPagoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoGrupoFormaPagoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoGrupoFormaPagoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoGrupoFormaPagoOrderBy.setViewportView(this.jTableDatosTipoGrupoFormaPagoOrderBy);
			this.jTableDatosTipoGrupoFormaPagoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoGrupoFormaPagoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoGrupoFormaPago= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoGrupoFormaPago= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoGrupoFormaPago = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoGrupoFormaPago= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoGrupoFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoGrupoFormaPago.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoGrupoFormaPago.setTitle("Orden");
			this.jInternalFrameOrderByTipoGrupoFormaPago.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoGrupoFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoGrupoFormaPago.setResizable(true);
			this.jInternalFrameOrderByTipoGrupoFormaPago.setClosable(true);
			this.jInternalFrameOrderByTipoGrupoFormaPago.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoGrupoFormaPago.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoGrupoFormaPago.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoGrupoFormaPago.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoGrupoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Grupo Forma Pagos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFormaPago.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoGrupoFormaPago.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoGrupoFormaPago.ipady =150;
				
			this.jPanelOrderByTipoGrupoFormaPago.add(jScrollPanelDatosTipoGrupoFormaPagoOrderBy, this.gridBagConstraintsTipoGrupoFormaPago);//this.jTableDatosTipoGrupoFormaPagoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoGrupoFormaPago = new JButtonMe();
			this.jButtonCerrarOrderByTipoGrupoFormaPago.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoGrupoFormaPago,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoGrupoFormaPago.setToolTipText("Cancelar"+" "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoFormaPago.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoGrupoFormaPago.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoGrupoFormaPago.add(this.jButtonCerrarOrderByTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoGrupoFormaPago = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoGrupoFormaPago= new JScrollPane(jPanelOrderByTipoGrupoFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFormaPago.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoGrupoFormaPago.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoGrupoFormaPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoGrupoFormaPago.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoGrupoFormaPago);
			
			this.jInternalFrameOrderByTipoGrupoFormaPago.getContentPane().add(this.jScrollPanelOrderByTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);			
		
		} else {
			this.jButtonAbrirOrderByTipoGrupoFormaPago = new JButtonMe();
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
			iWidthTableCalculado+=200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=300;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipogrupoformapagoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoGrupoFormaPago.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoGrupoFormaPago.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoGrupoFormaPago.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoGrupoFormaPago.getRowHeight();//TipoGrupoFormaPagoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoGrupoFormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoGrupoFormaPago.isSelected()) {
					iHeightTable=TipoGrupoFormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoGrupoFormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoGrupoFormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoGrupoFormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoGrupoFormaPago.isSelected()) {
					iHeightTable=TipoGrupoFormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoGrupoFormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoGrupoFormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoGrupoFormaPago.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoGrupoFormaPago.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoGrupoFormaPago.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoGrupoFormaPago.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoGrupoFormaPago.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoGrupoFormaPago.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoGrupoFormaPago!=null && this.jInternalFrameOrderByTipoGrupoFormaPago.getjTableDatosOrderBy()!=null) {
			//if(!this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoGrupoFormaPago.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoGrupoFormaPago.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoGrupoFormaPago.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoGrupoFormaPago.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoGrupoFormaPago.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoGrupoFormaPago.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoGrupoFormaPago.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoGrupoFormaPago.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoGrupoFormaPago.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoGrupoFormaPago.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipogrupoformapagoLogic.getTipoGrupoFormaPagos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipogrupoformapagos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoGrupoFormaPago> TraerTipoGrupoFormaPagoBeans(List<TipoGrupoFormaPago> tipogrupoformapagos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoGrupoFormaPago tipogrupoformapago:tipogrupoformapagos) {
					
				if(!(TipoGrupoFormaPagoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoGrupoFormaPagoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipogrupoformapago.setsDetalleGeneralEntityReporte(TipoGrupoFormaPagoConstantesFunciones.getTipoGrupoFormaPagoDescripcion(tipogrupoformapago));
										
						
					
					

					if(tipogrupoformapago.getTipoFormaPagos()!=null && Funciones.existeClass(classes,TipoFormaPago.class)) {
						try{tipogrupoformapago.settipoformapagosDescripcionReporte(new JRBeanCollectionDataSource(TipoFormaPagoJInternalFrame.TraerTipoFormaPagoBeans(tipogrupoformapago.getTipoFormaPagos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipogrupoformapago.getDatoGeneralEmpleados()!=null && Funciones.existeClass(classes,DatoGeneralEmpleado.class)) {
						try{tipogrupoformapago.setdatogeneralempleadosDescripcionReporte(new JRBeanCollectionDataSource(DatoGeneralEmpleadoJInternalFrame.TraerDatoGeneralEmpleadoBeans(tipogrupoformapago.getDatoGeneralEmpleados(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipogrupoformapago.getAnticipoClientes()!=null && Funciones.existeClass(classes,AnticipoCliente.class)) {
						try{tipogrupoformapago.setanticipoclientesDescripcionReporte(new JRBeanCollectionDataSource(AnticipoClienteJInternalFrame.TraerAnticipoClienteBeans(tipogrupoformapago.getAnticipoClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipogrupoformapago.setsDetalleGeneralEntityReporte(tipogrupoformapago.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipogrupoformapagobeans.add(tipogrupoformapagobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipogrupoformapagos;
    }
	//PARA REPORTES FIN
}
