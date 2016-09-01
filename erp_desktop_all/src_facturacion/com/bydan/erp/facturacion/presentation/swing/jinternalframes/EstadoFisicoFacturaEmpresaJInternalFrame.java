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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

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
import com.bydan.erp.facturacion.util.EstadoFisicoFacturaEmpresaConstantesFunciones;

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
public class EstadoFisicoFacturaEmpresaJInternalFrame extends EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoFisicoFacturaEmpresa;
	
	protected JMenuBar jmenuBarEstadoFisicoFacturaEmpresa;
	
	protected JMenu jmenuEstadoFisicoFacturaEmpresa;
	protected JMenu jmenuDatosEstadoFisicoFacturaEmpresa;
	protected JMenu jmenuArchivoEstadoFisicoFacturaEmpresa;
	protected JMenu jmenuAccionesEstadoFisicoFacturaEmpresa;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoFisicoFacturaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoFisicoFacturaEmpresa;	
	protected GridBagConstraints gridBagConstraintsEstadoFisicoFacturaEmpresa;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoFisicoFacturaEmpresaDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoFisicoFacturaEmpresa;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public EstadoFisicoFacturaEmpresaSessionBean estadofisicofacturaempresaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresas;		
	public List<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresasEliminados;	
	public List<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoFisicoFacturaEmpresa;		
	protected JButton jButtonAbrirOrderByEstadoFisicoFacturaEmpresa;
	
	
	//protected JPanel jPanelOrderByEstadoFisicoFacturaEmpresa;
	//public JScrollPane jScrollPanelOrderByEstadoFisicoFacturaEmpresa;	
	//protected JButton jButtonCerrarOrderByEstadoFisicoFacturaEmpresa;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoFisicoFacturaEmpresaLogic estadofisicofacturaempresaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoFisicoFacturaEmpresa;
	public JScrollPane jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa;
	public JScrollPane jScrollPanelDatosGeneralEstadoFisicoFacturaEmpresa;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoFisicoFacturaEmpresaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoFisicoFacturaEmpresa;
	//public JScrollPane jScrollPanelImportacionEstadoFisicoFacturaEmpresa;
	
	
	
	protected JPanel jPanelAccionesEstadoFisicoFacturaEmpresa;
	
    protected JPanel jPanelPaginacionEstadoFisicoFacturaEmpresa;
    protected JPanel jPanelParametrosReportesEstadoFisicoFacturaEmpresa;
	protected JPanel jPanelParametrosReportesAccionesEstadoFisicoFacturaEmpresa;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoFisicoFacturaEmpresa;
	protected JPanel jPanelParametrosAuxiliar2EstadoFisicoFacturaEmpresa;
	protected JPanel jPanelParametrosAuxiliar3EstadoFisicoFacturaEmpresa;
	protected JPanel jPanelParametrosAuxiliar4EstadoFisicoFacturaEmpresa;
	//protected JPanel jPanelParametrosAuxiliar5EstadoFisicoFacturaEmpresa;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoFisicoFacturaEmpresa;
	//protected JPanel jPanelImportacionEstadoFisicoFacturaEmpresa;
	
	
	public JTable jTableDatosEstadoFisicoFacturaEmpresa;
	
	
	
	//public JTable jTableDatosEstadoFisicoFacturaEmpresaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoFisicoFacturaEmpresa;
	protected JButton jButtonDuplicarEstadoFisicoFacturaEmpresa;
	protected JButton jButtonCopiarEstadoFisicoFacturaEmpresa;
	protected JButton jButtonVerFormEstadoFisicoFacturaEmpresa;
	protected JButton jButtonNuevoRelacionesEstadoFisicoFacturaEmpresa;
	protected JButton jButtonModificarEstadoFisicoFacturaEmpresa;
	
    protected JButton jButtonGuardarCambiosTablaEstadoFisicoFacturaEmpresa;
	protected JButton jButtonCerrarEstadoFisicoFacturaEmpresa;
	
	
	protected JButton jButtonRecargarInformacionEstadoFisicoFacturaEmpresa;
	protected JButton jButtonProcesarInformacionEstadoFisicoFacturaEmpresa;
	
	
	protected JButton jButtonAnterioresEstadoFisicoFacturaEmpresa;
	protected JButton jButtonSiguientesEstadoFisicoFacturaEmpresa;
	protected JButton jButtonNuevoGuardarCambiosEstadoFisicoFacturaEmpresa;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoFisicoFacturaEmpresa;
	//protected JButton jButtonCerrarReporteDinamicoEstadoFisicoFacturaEmpresa;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoFisicoFacturaEmpresa;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoFisicoFacturaEmpresa;
	//protected JButton jButtonGenerarImportacionEstadoFisicoFacturaEmpresa;
	//protected JButton jButtonCerrarImportacionEstadoFisicoFacturaEmpresa;
	//protected JFileChooser jFileChooserImportacionEstadoFisicoFacturaEmpresa;
	//protected File fileImportacionEstadoFisicoFacturaEmpresa;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoFisicoFacturaEmpresa;
	protected JButton jButtonDuplicarToolBarEstadoFisicoFacturaEmpresa;
	protected JButton jButtonNuevoRelacionesToolBarEstadoFisicoFacturaEmpresa;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoFisicoFacturaEmpresa;
	protected JButton jButtonCopiarToolBarEstadoFisicoFacturaEmpresa;
	protected JButton jButtonVerFormToolBarEstadoFisicoFacturaEmpresa;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoFisicoFacturaEmpresa;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoFisicoFacturaEmpresa;
	protected JButton jButtonCerrarToolBarEstadoFisicoFacturaEmpresa;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoFisicoFacturaEmpresa;
	protected JButton jButtonProcesarInformacionToolBarEstadoFisicoFacturaEmpresa;
	protected JButton jButtonAnterioresToolBarEstadoFisicoFacturaEmpresa;
	protected JButton jButtonSiguientesToolBarEstadoFisicoFacturaEmpresa;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoFisicoFacturaEmpresa;
	protected JButton jButtonAbrirOrderByToolBarEstadoFisicoFacturaEmpresa;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoFisicoFacturaEmpresa;
	protected JMenuItem jMenuItemDuplicarEstadoFisicoFacturaEmpresa;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoFisicoFacturaEmpresa;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoFisicoFacturaEmpresa;
	protected JMenuItem jMenuItemCopiarEstadoFisicoFacturaEmpresa;
	protected JMenuItem jMenuItemVerFormEstadoFisicoFacturaEmpresa;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoFisicoFacturaEmpresa;
	protected JMenuItem jMenuItemCerrarEstadoFisicoFacturaEmpresa;
	protected JMenuItem jMenuItemDetalleCerrarEstadoFisicoFacturaEmpresa;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoFisicoFacturaEmpresa;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoFisicoFacturaEmpresa;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoFisicoFacturaEmpresa;
	protected JMenuItem jMenuItemProcesarInformacionEstadoFisicoFacturaEmpresa;
	protected JMenuItem jMenuItemAnterioresEstadoFisicoFacturaEmpresa;
	protected JMenuItem jMenuItemSiguientesEstadoFisicoFacturaEmpresa;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoFisicoFacturaEmpresa;
	protected JMenuItem jMenuItemAbrirOrderByEstadoFisicoFacturaEmpresa;
	protected JMenuItem jMenuItemMostrarOcultarEstadoFisicoFacturaEmpresa;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoFisicoFacturaEmpresa;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoFisicoFacturaEmpresa;
	protected JCheckBox jCheckBoxSeleccionadosEstadoFisicoFacturaEmpresa;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoFisicoFacturaEmpresa;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoFisicoFacturaEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoFisicoFacturaEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoFisicoFacturaEmpresa;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoFisicoFacturaEmpresa;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoFisicoFacturaEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoFisicoFacturaEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoFisicoFacturaEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoFisicoFacturaEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoFisicoFacturaEmpresa;
	protected JTextField jTextFieldValorCampoGeneralEstadoFisicoFacturaEmpresa;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoFisicoFacturaEmpresa;
	//public JList<Reporte> jListColumnasSelectReporteEstadoFisicoFacturaEmpresa;
	//public JScrollPane jScrollColumnasSelectReporteEstadoFisicoFacturaEmpresa;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoFisicoFacturaEmpresa;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoFisicoFacturaEmpresa;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoFisicoFacturaEmpresa;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoFisicoFacturaEmpresa;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoFisicoFacturaEmpresa;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoFisicoFacturaEmpresa;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoFisicoFacturaEmpresa;
	
		
	//public JLabel jLabelArchivoImportacionEstadoFisicoFacturaEmpresa;	
	//public JLabel jLabelPathArchivoImportacionEstadoFisicoFacturaEmpresa;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoFisicoFacturaEmpresa;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoFisicoFacturaEmpresa;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoFisicoFacturaEmpresa;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoFisicoFacturaEmpresa;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoFisicoFacturaEmpresa;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoFisicoFacturaEmpresa;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoFisicoFacturaEmpresa;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoFisicoFacturaEmpresa;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoFisicoFacturaEmpresa;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoFisicoFacturaEmpresa;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa;
	
	
	
	
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
	public EstadoFisicoFacturaEmpresaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoFisicoFacturaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoFisicoFacturaEmpresaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoFisicoFacturaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoFisicoFacturaEmpresaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoFisicoFacturaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoFisicoFacturaEmpresaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoFisicoFacturaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoFisicoFacturaEmpresa)	{
		this.jButtonRecargarInformacionEstadoFisicoFacturaEmpresa = jButtonRecargarInformacionEstadoFisicoFacturaEmpresa;
	}
	
	public JButton getjButtonProcesarInformacionEstadoFisicoFacturaEmpresa() {
		return this.jButtonProcesarInformacionEstadoFisicoFacturaEmpresa;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoFisicoFacturaEmpresa)	{
		this.jButtonProcesarInformacionEstadoFisicoFacturaEmpresa = jButtonProcesarInformacionEstadoFisicoFacturaEmpresa;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoFisicoFacturaEmpresa() {
		return this.jButtonRecargarInformacionEstadoFisicoFacturaEmpresa;
	}
	
	
	public List<EstadoFisicoFacturaEmpresa> getestadofisicofacturaempresas() {
		return this.estadofisicofacturaempresas;
	}

	public void setestadofisicofacturaempresas(List<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresas) {
		this.estadofisicofacturaempresas = estadofisicofacturaempresas;
	}
	
	public List<EstadoFisicoFacturaEmpresa> getestadofisicofacturaempresasAux() {
		return this.estadofisicofacturaempresasAux;
	}

	public void setestadofisicofacturaempresasAux(List<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresasAux) {
		this.estadofisicofacturaempresasAux = estadofisicofacturaempresasAux;
	}
	
	public List<EstadoFisicoFacturaEmpresa> getestadofisicofacturaempresasEliminados() {
		return this.estadofisicofacturaempresasEliminados;
	}

	public void setEstadoFisicoFacturaEmpresasEliminados(List<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresasEliminados) {
		this.estadofisicofacturaempresasEliminados = estadofisicofacturaempresasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoFisicoFacturaEmpresa() {
		return jComboBoxTiposSeleccionarEstadoFisicoFacturaEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoFisicoFacturaEmpresa(
			JComboBox jComboBoxTiposSeleccionarEstadoFisicoFacturaEmpresa) {
		this.jComboBoxTiposSeleccionarEstadoFisicoFacturaEmpresa = jComboBoxTiposSeleccionarEstadoFisicoFacturaEmpresa;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoFisicoFacturaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoFisicoFacturaEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoFisicoFacturaEmpresa .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoFisicoFacturaEmpresa() {
		return jTextFieldValorCampoGeneralEstadoFisicoFacturaEmpresa;
	}

	public void setjTextFieldValorCampoGeneralEstadoFisicoFacturaEmpresa(
			JTextField jTextFieldValorCampoGeneralEstadoFisicoFacturaEmpresa) {
		this.jTextFieldValorCampoGeneralEstadoFisicoFacturaEmpresa = jTextFieldValorCampoGeneralEstadoFisicoFacturaEmpresa;
	}

	public void setBorderResaltarValorCampoGeneralEstadoFisicoFacturaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoFisicoFacturaEmpresa.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoFisicoFacturaEmpresa .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoFisicoFacturaEmpresa() {
		return this.jCheckBoxSeleccionarTodosEstadoFisicoFacturaEmpresa;
	}

	public void setjCheckBoxSeleccionarTodosEstadoFisicoFacturaEmpresa(
			JCheckBox jCheckBoxSeleccionarTodosEstadoFisicoFacturaEmpresa) {
		this.jCheckBoxSeleccionarTodosEstadoFisicoFacturaEmpresa = jCheckBoxSeleccionarTodosEstadoFisicoFacturaEmpresa;
	}

	public void setBorderResaltarSeleccionarTodosEstadoFisicoFacturaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoFisicoFacturaEmpresa.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoFisicoFacturaEmpresa .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoFisicoFacturaEmpresa() {
		return this.jCheckBoxSeleccionadosEstadoFisicoFacturaEmpresa;
	}

	public void setjCheckBoxSeleccionadosEstadoFisicoFacturaEmpresa(
			JCheckBox jCheckBoxSeleccionadosEstadoFisicoFacturaEmpresa) {
		this.jCheckBoxSeleccionadosEstadoFisicoFacturaEmpresa = jCheckBoxSeleccionadosEstadoFisicoFacturaEmpresa;
	}
	
	public void setBorderResaltarSeleccionadosEstadoFisicoFacturaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoFisicoFacturaEmpresa.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoFisicoFacturaEmpresa .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoFisicoFacturaEmpresa() {
		return this.jComboBoxTiposArchivosReportesEstadoFisicoFacturaEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoFisicoFacturaEmpresa(
			JComboBox jComboBoxTiposArchivosReportesEstadoFisicoFacturaEmpresa) {
		this.jComboBoxTiposArchivosReportesEstadoFisicoFacturaEmpresa = jComboBoxTiposArchivosReportesEstadoFisicoFacturaEmpresa;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoFisicoFacturaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoFisicoFacturaEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoFisicoFacturaEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoFisicoFacturaEmpresa() {
		return this.jComboBoxTiposReportesEstadoFisicoFacturaEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoFisicoFacturaEmpresa(
			JComboBox jComboBoxTiposReportesEstadoFisicoFacturaEmpresa) {
		this.jComboBoxTiposReportesEstadoFisicoFacturaEmpresa = jComboBoxTiposReportesEstadoFisicoFacturaEmpresa;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoFisicoFacturaEmpresa() {
	//	return jComboBoxTiposReportesDinamicoEstadoFisicoFacturaEmpresa;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoFisicoFacturaEmpresa(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoFisicoFacturaEmpresa) {
	//	this.jComboBoxTiposReportesDinamicoEstadoFisicoFacturaEmpresa = jComboBoxTiposReportesDinamicoEstadoFisicoFacturaEmpresa;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoFisicoFacturaEmpresa() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoFisicoFacturaEmpresa;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoFisicoFacturaEmpresa(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoFisicoFacturaEmpresa) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoFisicoFacturaEmpresa = jComboBoxTiposArchivosReportesDinamicoEstadoFisicoFacturaEmpresa;
	//}
	
	public void setBorderResaltarTiposReportesEstadoFisicoFacturaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoFisicoFacturaEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoFisicoFacturaEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoFisicoFacturaEmpresa() {
		return this.jComboBoxTiposGraficosReportesEstadoFisicoFacturaEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoFisicoFacturaEmpresa(
			JComboBox jComboBoxTiposGraficosReportesEstadoFisicoFacturaEmpresa) {
		this.jComboBoxTiposGraficosReportesEstadoFisicoFacturaEmpresa = jComboBoxTiposGraficosReportesEstadoFisicoFacturaEmpresa;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoFisicoFacturaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoFisicoFacturaEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoFisicoFacturaEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoFisicoFacturaEmpresa() {
		return this.jComboBoxTiposPaginacionEstadoFisicoFacturaEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoFisicoFacturaEmpresa(
			JComboBox jComboBoxTiposPaginacionEstadoFisicoFacturaEmpresa) {
		this.jComboBoxTiposPaginacionEstadoFisicoFacturaEmpresa = jComboBoxTiposPaginacionEstadoFisicoFacturaEmpresa;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoFisicoFacturaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoFisicoFacturaEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoFisicoFacturaEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoFisicoFacturaEmpresa() {
		return this.jComboBoxTiposRelacionesEstadoFisicoFacturaEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoFisicoFacturaEmpresa() {
		return this.jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoFisicoFacturaEmpresa(
			JComboBox jComboBoxTiposRelacionesEstadoFisicoFacturaEmpresa) {
		this.jComboBoxTiposRelacionesEstadoFisicoFacturaEmpresa = jComboBoxTiposRelacionesEstadoFisicoFacturaEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoFisicoFacturaEmpresa(
			JComboBox jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa) {
		this.jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa = jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoFisicoFacturaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoFisicoFacturaEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoFisicoFacturaEmpresa .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoFisicoFacturaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoFisicoFacturaEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoFisicoFacturaEmpresa() {
	//	return jCheckBoxConGraficoDinamicoEstadoFisicoFacturaEmpresa;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoFisicoFacturaEmpresa(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoFisicoFacturaEmpresa) {
	//	this.jCheckBoxConGraficoDinamicoEstadoFisicoFacturaEmpresa = jCheckBoxConGraficoDinamicoEstadoFisicoFacturaEmpresa;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoFisicoFacturaEmpresa() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoFisicoFacturaEmpresa.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoFisicoFacturaEmpresa .setBorder(borderResaltar);		
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
		this.estadofisicofacturaempresaSessionBean=new EstadoFisicoFacturaEmpresaSessionBean();
		
		this.estadofisicofacturaempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadofisicofacturaempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoFisicoFacturaEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoFisicoFacturaEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoFisicoFacturaEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoFisicoFacturaEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoFisicoFacturaEmpresaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Fisico Factura MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoFisicoFacturaEmpresaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoFisicoFacturaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoFisicoFacturaEmpresa= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoFisicoFacturaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoFisicoFacturaEmpresa,this.jTtoolBarEstadoFisicoFacturaEmpresa,
							"nuevo","nuevo","Nuevo"+" "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoFisicoFacturaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoFisicoFacturaEmpresa,this.jTtoolBarEstadoFisicoFacturaEmpresa,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoFisicoFacturaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoFisicoFacturaEmpresa,this.jTtoolBarEstadoFisicoFacturaEmpresa,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoFisicoFacturaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoFisicoFacturaEmpresa,this.jTtoolBarEstadoFisicoFacturaEmpresa,
							"duplicar","duplicar","Duplicar"+" "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoFisicoFacturaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoFisicoFacturaEmpresa,this.jTtoolBarEstadoFisicoFacturaEmpresa,
							"copiar","copiar","Copiar"+" "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoFisicoFacturaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoFisicoFacturaEmpresa,this.jTtoolBarEstadoFisicoFacturaEmpresa,
							"ver_form","ver_form","Ver"+" "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoFisicoFacturaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoFisicoFacturaEmpresa,this.jTtoolBarEstadoFisicoFacturaEmpresa,
							"recargar","recargar","Recargar"+" "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoFisicoFacturaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoFisicoFacturaEmpresa,this.jTtoolBarEstadoFisicoFacturaEmpresa,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoFisicoFacturaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoFisicoFacturaEmpresa,this.jTtoolBarEstadoFisicoFacturaEmpresa,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoFisicoFacturaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoFisicoFacturaEmpresa,this.jTtoolBarEstadoFisicoFacturaEmpresa,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoFisicoFacturaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoFisicoFacturaEmpresa,this.jTtoolBarEstadoFisicoFacturaEmpresa,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoFisicoFacturaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoFisicoFacturaEmpresa,this.jTtoolBarEstadoFisicoFacturaEmpresa,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoFisicoFacturaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoFisicoFacturaEmpresa,this.jTtoolBarEstadoFisicoFacturaEmpresa,
							"cerrar","cerrar","Salir"+" "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoFisicoFacturaEmpresa=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoFisicoFacturaEmpresa;
			
				this.jButtonProcesarInformacionToolBarEstadoFisicoFacturaEmpresa=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoFisicoFacturaEmpresa;
				
		//protected JButton jButtonModificarToolBarEstadoFisicoFacturaEmpresa;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoFisicoFacturaEmpresa=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoFisicoFacturaEmpresa=new JMenuMe("General");
		this.jmenuArchivoEstadoFisicoFacturaEmpresa=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoFisicoFacturaEmpresa=new JMenuMe("Acciones");
		this.jmenuDatosEstadoFisicoFacturaEmpresa=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoFisicoFacturaEmpresa= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoFisicoFacturaEmpresa.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoFisicoFacturaEmpresa,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoFisicoFacturaEmpresa= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoFisicoFacturaEmpresa.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoFisicoFacturaEmpresa,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoFisicoFacturaEmpresa= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoFisicoFacturaEmpresa.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoFisicoFacturaEmpresa,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoFisicoFacturaEmpresa= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoFisicoFacturaEmpresa.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoFisicoFacturaEmpresa,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoFisicoFacturaEmpresa= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoFisicoFacturaEmpresa.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoFisicoFacturaEmpresa,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoFisicoFacturaEmpresa= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoFisicoFacturaEmpresa.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoFisicoFacturaEmpresa,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoFisicoFacturaEmpresa= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoFisicoFacturaEmpresa.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoFisicoFacturaEmpresa,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoFisicoFacturaEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoFisicoFacturaEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoFisicoFacturaEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoFisicoFacturaEmpresa= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoFisicoFacturaEmpresa.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoFisicoFacturaEmpresa,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoFisicoFacturaEmpresa= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoFisicoFacturaEmpresa.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoFisicoFacturaEmpresa,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoFisicoFacturaEmpresa= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoFisicoFacturaEmpresa.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoFisicoFacturaEmpresa,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoFisicoFacturaEmpresa= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoFisicoFacturaEmpresa.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoFisicoFacturaEmpresa,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoFisicoFacturaEmpresa= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoFisicoFacturaEmpresa.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoFisicoFacturaEmpresa,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoFisicoFacturaEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoFisicoFacturaEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoFisicoFacturaEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoFisicoFacturaEmpresa= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoFisicoFacturaEmpresa.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoFisicoFacturaEmpresa,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoFisicoFacturaEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoFisicoFacturaEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoFisicoFacturaEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoFisicoFacturaEmpresa= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoFisicoFacturaEmpresa.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoFisicoFacturaEmpresa,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoFisicoFacturaEmpresa.add(this.jMenuItemCerrarEstadoFisicoFacturaEmpresa);
			
			this.jmenuAccionesEstadoFisicoFacturaEmpresa.add(this.jMenuItemNuevoEstadoFisicoFacturaEmpresa);
			this.jmenuAccionesEstadoFisicoFacturaEmpresa.add(this.jMenuItemNuevoGuardarCambiosEstadoFisicoFacturaEmpresa);
			this.jmenuAccionesEstadoFisicoFacturaEmpresa.add(this.jMenuItemNuevoRelacionesEstadoFisicoFacturaEmpresa);
			this.jmenuAccionesEstadoFisicoFacturaEmpresa.add(this.jMenuItemGuardarCambiosTablaEstadoFisicoFacturaEmpresa);		
			this.jmenuAccionesEstadoFisicoFacturaEmpresa.add(this.jMenuItemDuplicarEstadoFisicoFacturaEmpresa);		
			this.jmenuAccionesEstadoFisicoFacturaEmpresa.add(this.jMenuItemCopiarEstadoFisicoFacturaEmpresa);		
			this.jmenuAccionesEstadoFisicoFacturaEmpresa.add(this.jMenuItemVerFormEstadoFisicoFacturaEmpresa);		
			
			this.jmenuDatosEstadoFisicoFacturaEmpresa.add(this.jMenuItemRecargarInformacionEstadoFisicoFacturaEmpresa);				
			this.jmenuDatosEstadoFisicoFacturaEmpresa.add(this.jMenuItemAnterioresEstadoFisicoFacturaEmpresa);				
			this.jmenuDatosEstadoFisicoFacturaEmpresa.add(this.jMenuItemSiguientesEstadoFisicoFacturaEmpresa);				
			this.jmenuDatosEstadoFisicoFacturaEmpresa.add(this.jMenuItemAbrirOrderByEstadoFisicoFacturaEmpresa);				
			this.jmenuDatosEstadoFisicoFacturaEmpresa.add(this.jMenuItemMostrarOcultarEstadoFisicoFacturaEmpresa);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoFisicoFacturaEmpresa.add(this.jMenuItemGuardarCambiosEstadoFisicoFacturaEmpresa);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoFisicoFacturaEmpresa.add(this.jmenuArchivoEstadoFisicoFacturaEmpresa);		
			this.jmenuBarEstadoFisicoFacturaEmpresa.add(this.jmenuAccionesEstadoFisicoFacturaEmpresa);		
			this.jmenuBarEstadoFisicoFacturaEmpresa.add(this.jmenuDatosEstadoFisicoFacturaEmpresa);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoFisicoFacturaEmpresa);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoFisicoFacturaEmpresa() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa=new JTabbedPane();


		this.jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasEstadoFisicoFacturaEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleEstadoFisicoFacturaEmpresa = new EstadoFisicoFacturaEmpresaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Fisico Factura DATOS");
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa = new EstadoFisicoFacturaEmpresaDetalleFormJInternalFrame(jDesktopPane,this.estadofisicofacturaempresaSessionBean.getConGuardarRelaciones(),this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoFisicoFacturaEmpresa = null;//new EstadoFisicoFacturaEmpresaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoFisicoFacturaEmpresa= new GridBagLayout();
		
		
		this.jTableDatosEstadoFisicoFacturaEmpresa = new JTableMe();      
		
		String sToolTipEstadoFisicoFacturaEmpresa="";
		sToolTipEstadoFisicoFacturaEmpresa=EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoFisicoFacturaEmpresa+="(Facturacion.EstadoFisicoFacturaEmpresa)";
		}
		
		if(!this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoFisicoFacturaEmpresa+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoFisicoFacturaEmpresa.setToolTipText(sToolTipEstadoFisicoFacturaEmpresa);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoFisicoFacturaEmpresa);
		this.jTableDatosEstadoFisicoFacturaEmpresa.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoFisicoFacturaEmpresa.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoFisicoFacturaEmpresa.setRowSelectionAllowed(true);
		this.jTableDatosEstadoFisicoFacturaEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoFisicoFacturaEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoFisicoFacturaEmpresa = new JButtonMe();
		this.jButtonDuplicarEstadoFisicoFacturaEmpresa = new JButtonMe();
		this.jButtonCopiarEstadoFisicoFacturaEmpresa = new JButtonMe();
		this.jButtonVerFormEstadoFisicoFacturaEmpresa = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoFisicoFacturaEmpresa = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoFisicoFacturaEmpresa = new JButtonMe();
		this.jButtonCerrarEstadoFisicoFacturaEmpresa = new JButtonMe();
		
		this.jScrollPanelDatosEstadoFisicoFacturaEmpresa = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoFisicoFacturaEmpresa = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoFisicoFacturaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Fisico Factura";
		
		if(!this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoFisicoFacturaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Fisico Facturas" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoFisicoFacturaEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoFisicoFacturaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoFisicoFacturaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoFisicoFacturaEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesEstadoFisicoFacturaEmpresa.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa=new ReporteDinamicoJInternalFrame(EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoFisicoFacturaEmpresa();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa=new ImportacionJInternalFrame(EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoFisicoFacturaEmpresa();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoFisicoFacturaEmpresa = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoFisicoFacturaEmpresa.setText("Orden");
		this.jButtonAbrirOrderByEstadoFisicoFacturaEmpresa.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoFisicoFacturaEmpresa,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoFisicoFacturaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoFisicoFacturaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoFisicoFacturaEmpresa,false,this);
			
			//this.cargarOrderByEstadoFisicoFacturaEmpresa(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoFisicoFacturaEmpresa,true,this);
			
			//this.cargarOrderByEstadoFisicoFacturaEmpresa(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoFisicoFacturaEmpresa.setText("Nuevo");
		this.jButtonDuplicarEstadoFisicoFacturaEmpresa.setText("Duplicar");
		this.jButtonCopiarEstadoFisicoFacturaEmpresa.setText("Copiar");
		this.jButtonVerFormEstadoFisicoFacturaEmpresa.setText("Ver");
		this.jButtonNuevoRelacionesEstadoFisicoFacturaEmpresa.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoFisicoFacturaEmpresa.setText("Guardar");
		this.jButtonCerrarEstadoFisicoFacturaEmpresa.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoFisicoFacturaEmpresa,"nuevo_button","Nuevo",this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoFisicoFacturaEmpresa,"duplicar_button","Duplicar",this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoFisicoFacturaEmpresa,"copiar_button","Copiar",this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoFisicoFacturaEmpresa,"ver_form","Ver",this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoFisicoFacturaEmpresa,"nuevorelaciones_button","Nuevo Rel",this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoFisicoFacturaEmpresa,"guardarcambiostabla_button","Guardar",this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoFisicoFacturaEmpresa,"cerrar_button","Salir",this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoFisicoFacturaEmpresa.setToolTipText("Nuevo"+" "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoFisicoFacturaEmpresa.setToolTipText("Duplicar"+" "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoFisicoFacturaEmpresa.setToolTipText("Copiar"+" "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoFisicoFacturaEmpresa.setToolTipText("Ver"+" "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoFisicoFacturaEmpresa.setToolTipText("Nuevo Rel"+" "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoFisicoFacturaEmpresa.setToolTipText("Guardar"+" "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoFisicoFacturaEmpresa.setToolTipText("Salir"+" "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoFisicoFacturaEmpresa";
		inputMap = this.jButtonNuevoEstadoFisicoFacturaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoFisicoFacturaEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoFisicoFacturaEmpresa"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoFisicoFacturaEmpresa";
		inputMap = this.jButtonDuplicarEstadoFisicoFacturaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoFisicoFacturaEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoFisicoFacturaEmpresa"));
		
		//COPIAR
		sMapKey = "CopiarEstadoFisicoFacturaEmpresa";
		inputMap = this.jButtonCopiarEstadoFisicoFacturaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoFisicoFacturaEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoFisicoFacturaEmpresa"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoFisicoFacturaEmpresa";
		inputMap = this.jButtonVerFormEstadoFisicoFacturaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoFisicoFacturaEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoFisicoFacturaEmpresa"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoFisicoFacturaEmpresa";
		inputMap = this.jButtonNuevoRelacionesEstadoFisicoFacturaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoFisicoFacturaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoFisicoFacturaEmpresa"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoFisicoFacturaEmpresa";
		inputMap = this.jButtonModificarEstadoFisicoFacturaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoFisicoFacturaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoFisicoFacturaEmpresa"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoFisicoFacturaEmpresa";
		inputMap = this.jButtonCerrarEstadoFisicoFacturaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoFisicoFacturaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoFisicoFacturaEmpresa"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoFisicoFacturaEmpresa";
		inputMap = this.jButtonGuardarCambiosTablaEstadoFisicoFacturaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoFisicoFacturaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoFisicoFacturaEmpresa"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoFisicoFacturaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoFisicoFacturaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoFisicoFacturaEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoFisicoFacturaEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoFisicoFacturaEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoFisicoFacturaEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoFisicoFacturaEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa.setName("jPanelParametrosReportesEstadoFisicoFacturaEmpresa"); 
		
		this.jPanelParametrosReportesAccionesEstadoFisicoFacturaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoFisicoFacturaEmpresa.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoFisicoFacturaEmpresa.setName("jPanelParametrosReportesAccionesEstadoFisicoFacturaEmpresa"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoFisicoFacturaEmpresa = new JButtonMe();
		this.jButtonRecargarInformacionEstadoFisicoFacturaEmpresa.setText("Recargar");
		this.jButtonRecargarInformacionEstadoFisicoFacturaEmpresa.setToolTipText("Recargar"+" "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoFisicoFacturaEmpresa,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoFisicoFacturaEmpresa = new JButtonMe();
		this.jButtonProcesarInformacionEstadoFisicoFacturaEmpresa.setText("Procesar");
		this.jButtonProcesarInformacionEstadoFisicoFacturaEmpresa.setToolTipText("Procesar"+" "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoFisicoFacturaEmpresa.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoFisicoFacturaEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoFisicoFacturaEmpresa.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoFisicoFacturaEmpresa.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoFisicoFacturaEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoFisicoFacturaEmpresa.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoFisicoFacturaEmpresa.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoFisicoFacturaEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoFisicoFacturaEmpresa.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoFisicoFacturaEmpresa.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoFisicoFacturaEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoFisicoFacturaEmpresa.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoFisicoFacturaEmpresa.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoFisicoFacturaEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoFisicoFacturaEmpresa.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoFisicoFacturaEmpresa.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa.setText("Accion");
		this.jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoFisicoFacturaEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoFisicoFacturaEmpresa.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoFisicoFacturaEmpresa.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoFisicoFacturaEmpresa=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoFisicoFacturaEmpresa = new JLabelMe();
		
		this.jLabelAccionesEstadoFisicoFacturaEmpresa.setText("Acciones");		
		this.jLabelAccionesEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoFisicoFacturaEmpresa = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoFisicoFacturaEmpresa.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoFisicoFacturaEmpresa.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoFisicoFacturaEmpresa = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoFisicoFacturaEmpresa.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoFisicoFacturaEmpresa.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoFisicoFacturaEmpresa = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoFisicoFacturaEmpresa.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoFisicoFacturaEmpresa.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoFisicoFacturaEmpresa = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoFisicoFacturaEmpresa.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoFisicoFacturaEmpresa.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoFisicoFacturaEmpresa = new JButtonMe();
		//this.jButtonAnterioresEstadoFisicoFacturaEmpresa.setText("<<");
        this.jButtonAnterioresEstadoFisicoFacturaEmpresa.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoFisicoFacturaEmpresa,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoFisicoFacturaEmpresa = new JButtonMe();
		//this.jButtonSiguientesEstadoFisicoFacturaEmpresa.setText(">>");
        this.jButtonSiguientesEstadoFisicoFacturaEmpresa.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoFisicoFacturaEmpresa,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoFisicoFacturaEmpresa = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoFisicoFacturaEmpresa.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoFisicoFacturaEmpresa.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoFisicoFacturaEmpresa,"nuevoguardarcambios_button","Nue",this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoFisicoFacturaEmpresa";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoFisicoFacturaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoFisicoFacturaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoFisicoFacturaEmpresa"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoFisicoFacturaEmpresa";
		inputMap = this.jButtonRecargarInformacionEstadoFisicoFacturaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoFisicoFacturaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoFisicoFacturaEmpresa"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoFisicoFacturaEmpresa";
		inputMap = this.jButtonSiguientesEstadoFisicoFacturaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoFisicoFacturaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoFisicoFacturaEmpresa"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoFisicoFacturaEmpresa";
		inputMap = this.jButtonAnterioresEstadoFisicoFacturaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoFisicoFacturaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoFisicoFacturaEmpresa"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoFisicoFacturaEmpresa();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(this.getWidth(),EstadoFisicoFacturaEmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoFisicoFacturaEmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(this.getWidth(),EstadoFisicoFacturaEmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoFisicoFacturaEmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(this.getWidth(),EstadoFisicoFacturaEmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoFisicoFacturaEmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoFisicoFacturaEmpresa = new GridBagLayout();

			this.jPanelPaginacionEstadoFisicoFacturaEmpresa.setLayout(gridaBagLayoutPaginacionEstadoFisicoFacturaEmpresa);						
			
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = 0;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoFisicoFacturaEmpresa.add(this.jButtonAnterioresEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
					
						
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = 0;
			
			this.jPanelPaginacionEstadoFisicoFacturaEmpresa.add(this.jButtonNuevoGuardarCambiosEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
						
			
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = 0;
			this.jPanelPaginacionEstadoFisicoFacturaEmpresa.add(this.jButtonSiguientesEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = 1;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoFisicoFacturaEmpresa.add(this.jButtonNuevoEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
				this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = 1;
				this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEstadoFisicoFacturaEmpresa.add(this.jButtonNuevoRelacionesEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
			}
			
			
			if(!this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
				this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = 1;
				this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoFisicoFacturaEmpresa.add(this.jButtonGuardarCambiosTablaEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
			}
			
			
			
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = 1;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoFisicoFacturaEmpresa.add(this.jButtonDuplicarEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
			
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = 1;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoFisicoFacturaEmpresa.add(this.jButtonCopiarEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
		
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = 1;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoFisicoFacturaEmpresa.add(this.jButtonVerFormEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
		
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = 1;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoFisicoFacturaEmpresa.add(this.jButtonCerrarEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
		
		
		
		this.jButtonRecargarInformacionEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoFisicoFacturaEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoFisicoFacturaEmpresa = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoFisicoFacturaEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoFisicoFacturaEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoFisicoFacturaEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoFisicoFacturaEmpresa = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa.setLayout(gridaBagParametrosReportesEstadoFisicoFacturaEmpresa);
			this.jPanelParametrosReportesAccionesEstadoFisicoFacturaEmpresa.setLayout(gridaBagParametrosReportesAccionesEstadoFisicoFacturaEmpresa);
			
			
			this.jPanelParametrosAuxiliar1EstadoFisicoFacturaEmpresa.setLayout(gridaBagParametrosAuxiliar1EstadoFisicoFacturaEmpresa);
			this.jPanelParametrosAuxiliar2EstadoFisicoFacturaEmpresa.setLayout(gridaBagParametrosAuxiliar2EstadoFisicoFacturaEmpresa);
			this.jPanelParametrosAuxiliar3EstadoFisicoFacturaEmpresa.setLayout(gridaBagParametrosAuxiliar3EstadoFisicoFacturaEmpresa);
			this.jPanelParametrosAuxiliar4EstadoFisicoFacturaEmpresa.setLayout(gridaBagParametrosAuxiliar4EstadoFisicoFacturaEmpresa);
			//this.jPanelParametrosAuxiliar5EstadoFisicoFacturaEmpresa.setLayout(gridaBagParametrosAuxiliar2EstadoFisicoFacturaEmpresa);			
			
			
			
			
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa.add(this.jButtonRecargarInformacionEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoFisicoFacturaEmpresa.add(this.jComboBoxTiposPaginacionEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoFisicoFacturaEmpresa.add(this.jCheckBoxConAltoMaximoTablaEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoFisicoFacturaEmpresa.add(this.jComboBoxTiposArchivosReportesEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa.add(this.jPanelParametrosAuxiliar1EstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoFisicoFacturaEmpresa.add(this.jComboBoxTiposReportesEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa.add(this.jPanelParametrosAuxiliar4EstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa.add(this.jComboBoxTiposReportesEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa.add(this.jCheckBoxGenerarReporteEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa.add(this.jPanelParametrosAuxiliar2EstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa.add(this.jLabelAccionesEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
				this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa.add(this.jButtonAbrirOrderByEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa.add(this.jComboBoxTiposSeleccionarEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);			
			
			
			/*
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa.add(this.jCheckBoxSeleccionarTodosEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoFisicoFacturaEmpresa.add(this.jCheckBoxSeleccionarTodosEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);															
				
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoFisicoFacturaEmpresa.add(this.jCheckBoxSeleccionadosEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa.add(this.jPanelParametrosAuxiliar3EstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa.add(this.jComboBoxTiposRelacionesEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
				
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa.add(this.jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
	
				
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa.add(this.jTextFieldValorCampoGeneralEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoFisicoFacturaEmpresa = new GridBagLayout();

			this.jScrollPanelDatosEstadoFisicoFacturaEmpresa.setLayout(gridaBagLayoutDatosEstadoFisicoFacturaEmpresa);
			
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = 0;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = 0;
			
			this.jScrollPanelDatosEstadoFisicoFacturaEmpresa.add(this.jTableDatosEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoFisicoFacturaEmpresa.setViewportView(this.jTableDatosEstadoFisicoFacturaEmpresa);
		this.jTableDatosEstadoFisicoFacturaEmpresa.setFillsViewportHeight(true);
		this.jTableDatosEstadoFisicoFacturaEmpresa.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoFisicoFacturaEmpresa= new GridBagLayout();
		this.jPanelAccionesEstadoFisicoFacturaEmpresa.setLayout(gridaBagLayoutAccionesEstadoFisicoFacturaEmpresa);
		
		
		/*	
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = 0;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = 0;
			
		this.jPanelAccionesEstadoFisicoFacturaEmpresa.add(this.jButtonNuevoEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoFisicoFacturaEmpresa = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoFisicoFacturaEmpresa);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();						
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = 0;		
			//this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = 0;		
		//this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);								
		
		
		/*
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
		*/		
		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx =0;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoFisicoFacturaEmpresa.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
				
		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EstadoFisicoFacturaEmpresaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoFisicoFacturaEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoFisicoFacturaEmpresa = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoFisicoFacturaEmpresa.setLayout(gridaBagLayoutBusquedasParametrosEstadoFisicoFacturaEmpresa);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoFisicoFacturaEmpresa=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
			
			
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
		
			
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoFisicoFacturaEmpresa;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoFisicoFacturaEmpresa() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoFisicoFacturaEmpresa = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoFisicoFacturaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoFisicoFacturaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoFisicoFacturaEmpresa.setName("jPanelReporteDinamicoEstadoFisicoFacturaEmpresa"); 
		
		this.jPanelReporteDinamicoEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoFisicoFacturaEmpresa.setLayout(gridaBagLayoutReporteDinamicoEstadoFisicoFacturaEmpresa);
		
		
		this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoFisicoFacturaEmpresa = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoFisicoFacturaEmpresa= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoFisicoFacturaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Fisico Facturas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoFisicoFacturaEmpresa = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoFisicoFacturaEmpresa.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoFisicoFacturaEmpresa.add(this.jLabelColumnasSelectReporteEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoFisicoFacturaEmpresa = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoFisicoFacturaEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoFisicoFacturaEmpresa.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoFisicoFacturaEmpresa=new JScrollPane(this.jListColumnasSelectReporteEstadoFisicoFacturaEmpresa);
			
			this.jScrollColumnasSelectReporteEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoFisicoFacturaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoFisicoFacturaEmpresa.add(this.jListColumnasSelectReporteEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
		this.jPanelReporteDinamicoEstadoFisicoFacturaEmpresa.add(this.jScrollColumnasSelectReporteEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoFisicoFacturaEmpresa = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoFisicoFacturaEmpresa.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoFisicoFacturaEmpresa.add(this.jLabelRelacionesSelectReporteEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoFisicoFacturaEmpresa = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoFisicoFacturaEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoFisicoFacturaEmpresa.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoFisicoFacturaEmpresa=new JScrollPane(this.jListRelacionesSelectReporteEstadoFisicoFacturaEmpresa);
			
			this.jScrollRelacionesSelectReporteEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoFisicoFacturaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoFisicoFacturaEmpresa.add(this.jListRelacionesSelectReporteEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
		this.jPanelReporteDinamicoEstadoFisicoFacturaEmpresa.add(this.jScrollRelacionesSelectReporteEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEstadoFisicoFacturaEmpresa = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoFisicoFacturaEmpresa = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoFisicoFacturaEmpresa = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoFisicoFacturaEmpresa = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoFisicoFacturaEmpresa.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoFisicoFacturaEmpresa = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoFisicoFacturaEmpresa.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoFisicoFacturaEmpresa = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoFisicoFacturaEmpresa.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoFisicoFacturaEmpresa.add(this.jLabelGenerarExcelReporteDinamicoEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoFisicoFacturaEmpresa = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoFisicoFacturaEmpresa.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoFisicoFacturaEmpresa,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoFisicoFacturaEmpresa.setToolTipText("Generar EXCEL"+" "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoFisicoFacturaEmpresa.add(this.jButtonGenerarExcelReporteDinamicoEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoFisicoFacturaEmpresa.add(this.jComboBoxTiposReportesDinamicoEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoFisicoFacturaEmpresa = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoFisicoFacturaEmpresa.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoFisicoFacturaEmpresa.add(this.jLabelTiposArchivoReporteDinamicoEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoFisicoFacturaEmpresa.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoFisicoFacturaEmpresa = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoFisicoFacturaEmpresa.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoFisicoFacturaEmpresa,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoFisicoFacturaEmpresa.setToolTipText("Generar"+" "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoFisicoFacturaEmpresa.add(this.jButtonGenerarReporteDinamicoEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoFisicoFacturaEmpresa = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoFisicoFacturaEmpresa.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoFisicoFacturaEmpresa,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoFisicoFacturaEmpresa.setToolTipText("Cancelar"+" "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoFisicoFacturaEmpresa.add(this.jButtonCerrarReporteDinamicoEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoFisicoFacturaEmpresa = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoFisicoFacturaEmpresa= new JScrollPane(jPanelReporteDinamicoEstadoFisicoFacturaEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoFisicoFacturaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Fisico Facturas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoFisicoFacturaEmpresa);
		this.jInternalFrameReporteDinamicoEstadoFisicoFacturaEmpresa.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoFisicoFacturaEmpresa() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoFisicoFacturaEmpresa = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoFisicoFacturaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoFisicoFacturaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoFisicoFacturaEmpresa.setName("jPanelImportacionEstadoFisicoFacturaEmpresa"); 
		
		this.jPanelImportacionEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoFisicoFacturaEmpresa.setLayout(gridaBagLayoutImportacionEstadoFisicoFacturaEmpresa);
		
		
		this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoFisicoFacturaEmpresa = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoFisicoFacturaEmpresa= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.setResizable(true);
	    this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.setClosable(true);
	    this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.setResizable(true);
	    this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.setClosable(true);
	    this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoFisicoFacturaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Fisico Facturas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoFisicoFacturaEmpresa = new JLabelMe();

		this.jLabelArchivoImportacionEstadoFisicoFacturaEmpresa.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoFisicoFacturaEmpresa.add(this.jLabelArchivoImportacionEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoFisicoFacturaEmpresa = new JFileChooser();		
		this.jFileChooserImportacionEstadoFisicoFacturaEmpresa.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoFisicoFacturaEmpresa = new JButtonMe();
		this.jButtonAbrirImportacionEstadoFisicoFacturaEmpresa.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoFisicoFacturaEmpresa,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoFisicoFacturaEmpresa.setToolTipText("Generar"+" "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoFisicoFacturaEmpresa.add(this.jButtonAbrirImportacionEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoFisicoFacturaEmpresa = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoFisicoFacturaEmpresa.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoFisicoFacturaEmpresa.add(this.jLabelPathArchivoImportacionEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoFisicoFacturaEmpresa=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoFisicoFacturaEmpresa.add(this.jTextFieldPathArchivoImportacionEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoFisicoFacturaEmpresa = new JButtonMe();
		this.jButtonGenerarImportacionEstadoFisicoFacturaEmpresa.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoFisicoFacturaEmpresa,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoFisicoFacturaEmpresa.setToolTipText("Generar"+" "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoFisicoFacturaEmpresa.add(this.jButtonGenerarImportacionEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoFisicoFacturaEmpresa = new JButtonMe();
		this.jButtonCerrarImportacionEstadoFisicoFacturaEmpresa.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoFisicoFacturaEmpresa,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoFisicoFacturaEmpresa.setToolTipText("Cancelar"+" "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoFisicoFacturaEmpresa.add(this.jButtonCerrarImportacionEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoFisicoFacturaEmpresa = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoFisicoFacturaEmpresa= new JScrollPane(jPanelImportacionEstadoFisicoFacturaEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoFisicoFacturaEmpresa);
		this.jInternalFrameImportacionEstadoFisicoFacturaEmpresa.getContentPane().add(this.jScrollPanelImportacionEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoFisicoFacturaEmpresa(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoFisicoFacturaEmpresa = new JButtonMe();
			this.jButtonAbrirOrderByEstadoFisicoFacturaEmpresa.setText("Orden");
			this.jButtonAbrirOrderByEstadoFisicoFacturaEmpresa.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoFisicoFacturaEmpresa,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoFisicoFacturaEmpresa";
			inputMap = this.jButtonAbrirOrderByEstadoFisicoFacturaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoFisicoFacturaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoFisicoFacturaEmpresa"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoFisicoFacturaEmpresa = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoFisicoFacturaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoFisicoFacturaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoFisicoFacturaEmpresa.setName("jPanelOrderByEstadoFisicoFacturaEmpresa"); 
			
			this.jPanelOrderByEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoFisicoFacturaEmpresa.setLayout(gridaBagLayoutOrderByEstadoFisicoFacturaEmpresa);
			
			
			this.jTableDatosEstadoFisicoFacturaEmpresaOrderBy = new JTableMe();        
			this.jTableDatosEstadoFisicoFacturaEmpresaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoFisicoFacturaEmpresaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoFisicoFacturaEmpresaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoFisicoFacturaEmpresaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoFisicoFacturaEmpresaOrderBy.setViewportView(this.jTableDatosEstadoFisicoFacturaEmpresaOrderBy);
			this.jTableDatosEstadoFisicoFacturaEmpresaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoFisicoFacturaEmpresaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoFisicoFacturaEmpresa = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoFisicoFacturaEmpresa= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.setTitle("Orden");
			this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.setResizable(true);
			this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.setClosable(true);
			this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoFisicoFacturaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Fisico Facturas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoFisicoFacturaEmpresa.ipady =150;
				
			this.jPanelOrderByEstadoFisicoFacturaEmpresa.add(jScrollPanelDatosEstadoFisicoFacturaEmpresaOrderBy, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);//this.jTableDatosEstadoFisicoFacturaEmpresaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoFisicoFacturaEmpresa = new JButtonMe();
			this.jButtonCerrarOrderByEstadoFisicoFacturaEmpresa.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoFisicoFacturaEmpresa,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoFisicoFacturaEmpresa.setToolTipText("Cancelar"+" "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoFisicoFacturaEmpresa.add(this.jButtonCerrarOrderByEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoFisicoFacturaEmpresa = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoFisicoFacturaEmpresa= new JScrollPane(jPanelOrderByEstadoFisicoFacturaEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoFisicoFacturaEmpresa);
			
			this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.getContentPane().add(this.jScrollPanelOrderByEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);			
		
		} else {
			this.jButtonAbrirOrderByEstadoFisicoFacturaEmpresa = new JButtonMe();
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
		int iWidthTableCalculado=0;//1130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.estadofisicofacturaempresaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoFisicoFacturaEmpresa.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoFisicoFacturaEmpresa.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoFisicoFacturaEmpresa.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoFisicoFacturaEmpresa.getRowHeight();//EstadoFisicoFacturaEmpresaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoFisicoFacturaEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoFisicoFacturaEmpresa.isSelected()) {
					iHeightTable=EstadoFisicoFacturaEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoFisicoFacturaEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoFisicoFacturaEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoFisicoFacturaEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoFisicoFacturaEmpresa.isSelected()) {
					iHeightTable=EstadoFisicoFacturaEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoFisicoFacturaEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoFisicoFacturaEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa!=null && this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.getjTableDatosOrderBy()!=null) {
			//if(!this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoFisicoFacturaEmpresa.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadofisicofacturaempresaLogic.getEstadoFisicoFacturaEmpresas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadofisicofacturaempresas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoFisicoFacturaEmpresa> TraerEstadoFisicoFacturaEmpresaBeans(List<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresas,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoFisicoFacturaEmpresa estadofisicofacturaempresa:estadofisicofacturaempresas) {
					
				if(!(EstadoFisicoFacturaEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoFisicoFacturaEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadofisicofacturaempresa.setsDetalleGeneralEntityReporte(EstadoFisicoFacturaEmpresaConstantesFunciones.getEstadoFisicoFacturaEmpresaDescripcion(estadofisicofacturaempresa));
										
					estadofisicofacturaempresa.setes_pendiente_descripcion(EstadoFisicoFacturaEmpresaConstantesFunciones.getes_pendienteDescripcion(estadofisicofacturaempresa));	
					
					

					if(estadofisicofacturaempresa.getFacturas()!=null && Funciones.existeClass(classes,Factura.class)) {
						try{estadofisicofacturaempresa.setfacturasDescripcionReporte(new JRBeanCollectionDataSource(FacturaJInternalFrame.TraerFacturaBeans(estadofisicofacturaempresa.getFacturas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//estadofisicofacturaempresa.setsDetalleGeneralEntityReporte(estadofisicofacturaempresa.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadofisicofacturaempresabeans.add(estadofisicofacturaempresabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadofisicofacturaempresas;
    }
	//PARA REPORTES FIN
}
