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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;

//import com.bydan.erp.activosfijos.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.util.EstadoActivoFijoConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.*;
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
public class EstadoActivoFijoJInternalFrame extends EstadoActivoFijoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoActivoFijo;
	
	protected JMenuBar jmenuBarEstadoActivoFijo;
	
	protected JMenu jmenuEstadoActivoFijo;
	protected JMenu jmenuDatosEstadoActivoFijo;
	protected JMenu jmenuArchivoEstadoActivoFijo;
	protected JMenu jmenuAccionesEstadoActivoFijo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoActivoFijo;	
	protected GridBagConstraints gridBagConstraintsEstadoActivoFijo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoActivoFijoDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoActivoFijo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoActivoFijo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoActivoFijo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public EstadoActivoFijoSessionBean estadoactivofijoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoActivoFijo> estadoactivofijos;		
	public List<EstadoActivoFijo> estadoactivofijosEliminados;	
	public List<EstadoActivoFijo> estadoactivofijosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoActivoFijo;		
	protected JButton jButtonAbrirOrderByEstadoActivoFijo;
	
	
	//protected JPanel jPanelOrderByEstadoActivoFijo;
	//public JScrollPane jScrollPanelOrderByEstadoActivoFijo;	
	//protected JButton jButtonCerrarOrderByEstadoActivoFijo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoActivoFijoLogic estadoactivofijoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoActivoFijo;
	public JScrollPane jScrollPanelDatosEdicionEstadoActivoFijo;
	public JScrollPane jScrollPanelDatosGeneralEstadoActivoFijo;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoActivoFijoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoActivoFijo;
	//public JScrollPane jScrollPanelImportacionEstadoActivoFijo;
	
	
	
	protected JPanel jPanelAccionesEstadoActivoFijo;
	
    protected JPanel jPanelPaginacionEstadoActivoFijo;
    protected JPanel jPanelParametrosReportesEstadoActivoFijo;
	protected JPanel jPanelParametrosReportesAccionesEstadoActivoFijo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoActivoFijo;
	protected JPanel jPanelParametrosAuxiliar2EstadoActivoFijo;
	protected JPanel jPanelParametrosAuxiliar3EstadoActivoFijo;
	protected JPanel jPanelParametrosAuxiliar4EstadoActivoFijo;
	//protected JPanel jPanelParametrosAuxiliar5EstadoActivoFijo;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoActivoFijo;
	//protected JPanel jPanelImportacionEstadoActivoFijo;
	
	
	public JTable jTableDatosEstadoActivoFijo;
	
	
	
	//public JTable jTableDatosEstadoActivoFijoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoActivoFijo;
	protected JButton jButtonDuplicarEstadoActivoFijo;
	protected JButton jButtonCopiarEstadoActivoFijo;
	protected JButton jButtonVerFormEstadoActivoFijo;
	protected JButton jButtonNuevoRelacionesEstadoActivoFijo;
	protected JButton jButtonModificarEstadoActivoFijo;
	
    protected JButton jButtonGuardarCambiosTablaEstadoActivoFijo;
	protected JButton jButtonCerrarEstadoActivoFijo;
	
	
	protected JButton jButtonRecargarInformacionEstadoActivoFijo;
	protected JButton jButtonProcesarInformacionEstadoActivoFijo;
	
	
	protected JButton jButtonAnterioresEstadoActivoFijo;
	protected JButton jButtonSiguientesEstadoActivoFijo;
	protected JButton jButtonNuevoGuardarCambiosEstadoActivoFijo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoActivoFijo;
	//protected JButton jButtonCerrarReporteDinamicoEstadoActivoFijo;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoActivoFijo;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoActivoFijo;
	//protected JButton jButtonGenerarImportacionEstadoActivoFijo;
	//protected JButton jButtonCerrarImportacionEstadoActivoFijo;
	//protected JFileChooser jFileChooserImportacionEstadoActivoFijo;
	//protected File fileImportacionEstadoActivoFijo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoActivoFijo;
	protected JButton jButtonDuplicarToolBarEstadoActivoFijo;
	protected JButton jButtonNuevoRelacionesToolBarEstadoActivoFijo;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoActivoFijo;
	protected JButton jButtonCopiarToolBarEstadoActivoFijo;
	protected JButton jButtonVerFormToolBarEstadoActivoFijo;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoActivoFijo;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoActivoFijo;
	protected JButton jButtonCerrarToolBarEstadoActivoFijo;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoActivoFijo;
	protected JButton jButtonProcesarInformacionToolBarEstadoActivoFijo;
	protected JButton jButtonAnterioresToolBarEstadoActivoFijo;
	protected JButton jButtonSiguientesToolBarEstadoActivoFijo;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoActivoFijo;
	protected JButton jButtonAbrirOrderByToolBarEstadoActivoFijo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoActivoFijo;
	protected JMenuItem jMenuItemDuplicarEstadoActivoFijo;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoActivoFijo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoActivoFijo;
	protected JMenuItem jMenuItemCopiarEstadoActivoFijo;
	protected JMenuItem jMenuItemVerFormEstadoActivoFijo;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoActivoFijo;
	protected JMenuItem jMenuItemCerrarEstadoActivoFijo;
	protected JMenuItem jMenuItemDetalleCerrarEstadoActivoFijo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoActivoFijo;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoActivoFijo;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoActivoFijo;
	protected JMenuItem jMenuItemProcesarInformacionEstadoActivoFijo;
	protected JMenuItem jMenuItemAnterioresEstadoActivoFijo;
	protected JMenuItem jMenuItemSiguientesEstadoActivoFijo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoActivoFijo;
	protected JMenuItem jMenuItemAbrirOrderByEstadoActivoFijo;
	protected JMenuItem jMenuItemMostrarOcultarEstadoActivoFijo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoActivoFijo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoActivoFijo;
	protected JCheckBox jCheckBoxSeleccionadosEstadoActivoFijo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoActivoFijo;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoActivoFijo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoActivoFijo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoActivoFijo;
	protected JTextField jTextFieldValorCampoGeneralEstadoActivoFijo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoActivoFijo;
	//public JList<Reporte> jListColumnasSelectReporteEstadoActivoFijo;
	//public JScrollPane jScrollColumnasSelectReporteEstadoActivoFijo;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoActivoFijo;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoActivoFijo;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoActivoFijo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoActivoFijo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoActivoFijo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoActivoFijo;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoActivoFijo;
	
		
	//public JLabel jLabelArchivoImportacionEstadoActivoFijo;	
	//public JLabel jLabelPathArchivoImportacionEstadoActivoFijo;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoActivoFijo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoActivoFijo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoActivoFijo;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoActivoFijo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoActivoFijo;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoActivoFijo;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoActivoFijo;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoActivoFijo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoActivoFijo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoActivoFijo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasEstadoActivoFijo;
	
	
	
	
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
	public EstadoActivoFijoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoActivoFijoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoActivoFijoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoActivoFijoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoActivoFijo)	{
		this.jButtonRecargarInformacionEstadoActivoFijo = jButtonRecargarInformacionEstadoActivoFijo;
	}
	
	public JButton getjButtonProcesarInformacionEstadoActivoFijo() {
		return this.jButtonProcesarInformacionEstadoActivoFijo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoActivoFijo)	{
		this.jButtonProcesarInformacionEstadoActivoFijo = jButtonProcesarInformacionEstadoActivoFijo;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoActivoFijo() {
		return this.jButtonRecargarInformacionEstadoActivoFijo;
	}
	
	
	public List<EstadoActivoFijo> getestadoactivofijos() {
		return this.estadoactivofijos;
	}

	public void setestadoactivofijos(List<EstadoActivoFijo> estadoactivofijos) {
		this.estadoactivofijos = estadoactivofijos;
	}
	
	public List<EstadoActivoFijo> getestadoactivofijosAux() {
		return this.estadoactivofijosAux;
	}

	public void setestadoactivofijosAux(List<EstadoActivoFijo> estadoactivofijosAux) {
		this.estadoactivofijosAux = estadoactivofijosAux;
	}
	
	public List<EstadoActivoFijo> getestadoactivofijosEliminados() {
		return this.estadoactivofijosEliminados;
	}

	public void setEstadoActivoFijosEliminados(List<EstadoActivoFijo> estadoactivofijosEliminados) {
		this.estadoactivofijosEliminados = estadoactivofijosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoActivoFijo() {
		return jComboBoxTiposSeleccionarEstadoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoActivoFijo(
			JComboBox jComboBoxTiposSeleccionarEstadoActivoFijo) {
		this.jComboBoxTiposSeleccionarEstadoActivoFijo = jComboBoxTiposSeleccionarEstadoActivoFijo;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoActivoFijo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoActivoFijo() {
		return jTextFieldValorCampoGeneralEstadoActivoFijo;
	}

	public void setjTextFieldValorCampoGeneralEstadoActivoFijo(
			JTextField jTextFieldValorCampoGeneralEstadoActivoFijo) {
		this.jTextFieldValorCampoGeneralEstadoActivoFijo = jTextFieldValorCampoGeneralEstadoActivoFijo;
	}

	public void setBorderResaltarValorCampoGeneralEstadoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoActivoFijo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoActivoFijo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoActivoFijo() {
		return this.jCheckBoxSeleccionarTodosEstadoActivoFijo;
	}

	public void setjCheckBoxSeleccionarTodosEstadoActivoFijo(
			JCheckBox jCheckBoxSeleccionarTodosEstadoActivoFijo) {
		this.jCheckBoxSeleccionarTodosEstadoActivoFijo = jCheckBoxSeleccionarTodosEstadoActivoFijo;
	}

	public void setBorderResaltarSeleccionarTodosEstadoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoActivoFijo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoActivoFijo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoActivoFijo() {
		return this.jCheckBoxSeleccionadosEstadoActivoFijo;
	}

	public void setjCheckBoxSeleccionadosEstadoActivoFijo(
			JCheckBox jCheckBoxSeleccionadosEstadoActivoFijo) {
		this.jCheckBoxSeleccionadosEstadoActivoFijo = jCheckBoxSeleccionadosEstadoActivoFijo;
	}
	
	public void setBorderResaltarSeleccionadosEstadoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoActivoFijo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoActivoFijo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoActivoFijo() {
		return this.jComboBoxTiposArchivosReportesEstadoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoActivoFijo(
			JComboBox jComboBoxTiposArchivosReportesEstadoActivoFijo) {
		this.jComboBoxTiposArchivosReportesEstadoActivoFijo = jComboBoxTiposArchivosReportesEstadoActivoFijo;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoActivoFijo() {
		return this.jComboBoxTiposReportesEstadoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoActivoFijo(
			JComboBox jComboBoxTiposReportesEstadoActivoFijo) {
		this.jComboBoxTiposReportesEstadoActivoFijo = jComboBoxTiposReportesEstadoActivoFijo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoActivoFijo() {
	//	return jComboBoxTiposReportesDinamicoEstadoActivoFijo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoActivoFijo(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoActivoFijo) {
	//	this.jComboBoxTiposReportesDinamicoEstadoActivoFijo = jComboBoxTiposReportesDinamicoEstadoActivoFijo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoActivoFijo() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoActivoFijo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoActivoFijo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoActivoFijo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoActivoFijo = jComboBoxTiposArchivosReportesDinamicoEstadoActivoFijo;
	//}
	
	public void setBorderResaltarTiposReportesEstadoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoActivoFijo() {
		return this.jComboBoxTiposGraficosReportesEstadoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoActivoFijo(
			JComboBox jComboBoxTiposGraficosReportesEstadoActivoFijo) {
		this.jComboBoxTiposGraficosReportesEstadoActivoFijo = jComboBoxTiposGraficosReportesEstadoActivoFijo;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoActivoFijo() {
		return this.jComboBoxTiposPaginacionEstadoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoActivoFijo(
			JComboBox jComboBoxTiposPaginacionEstadoActivoFijo) {
		this.jComboBoxTiposPaginacionEstadoActivoFijo = jComboBoxTiposPaginacionEstadoActivoFijo;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoActivoFijo() {
		return this.jComboBoxTiposRelacionesEstadoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoActivoFijo() {
		return this.jComboBoxTiposAccionesEstadoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoActivoFijo(
			JComboBox jComboBoxTiposRelacionesEstadoActivoFijo) {
		this.jComboBoxTiposRelacionesEstadoActivoFijo = jComboBoxTiposRelacionesEstadoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoActivoFijo(
			JComboBox jComboBoxTiposAccionesEstadoActivoFijo) {
		this.jComboBoxTiposAccionesEstadoActivoFijo = jComboBoxTiposAccionesEstadoActivoFijo;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoActivoFijo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoActivoFijo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoActivoFijo() {
	//	return jCheckBoxConGraficoDinamicoEstadoActivoFijo;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoActivoFijo(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoActivoFijo) {
	//	this.jCheckBoxConGraficoDinamicoEstadoActivoFijo = jCheckBoxConGraficoDinamicoEstadoActivoFijo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoActivoFijo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoActivoFijo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoActivoFijo .setBorder(borderResaltar);		
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
		this.estadoactivofijoSessionBean=new EstadoActivoFijoSessionBean();
		
		this.estadoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadoactivofijoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoActivoFijoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Activo Fijo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoActivoFijo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoActivoFijo,this.jTtoolBarEstadoActivoFijo,
							"nuevo","nuevo","Nuevo"+" "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoActivoFijo,this.jTtoolBarEstadoActivoFijo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoActivoFijo,this.jTtoolBarEstadoActivoFijo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoActivoFijo,this.jTtoolBarEstadoActivoFijo,
							"duplicar","duplicar","Duplicar"+" "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoActivoFijo,this.jTtoolBarEstadoActivoFijo,
							"copiar","copiar","Copiar"+" "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoActivoFijo,this.jTtoolBarEstadoActivoFijo,
							"ver_form","ver_form","Ver"+" "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoActivoFijo,this.jTtoolBarEstadoActivoFijo,
							"recargar","recargar","Recargar"+" "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoActivoFijo,this.jTtoolBarEstadoActivoFijo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoActivoFijo,this.jTtoolBarEstadoActivoFijo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoActivoFijo,this.jTtoolBarEstadoActivoFijo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoActivoFijo,this.jTtoolBarEstadoActivoFijo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoActivoFijo,this.jTtoolBarEstadoActivoFijo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoActivoFijo,this.jTtoolBarEstadoActivoFijo,
							"cerrar","cerrar","Salir"+" "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoActivoFijo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoActivoFijo;
			
				this.jButtonProcesarInformacionToolBarEstadoActivoFijo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoActivoFijo;
				
		//protected JButton jButtonModificarToolBarEstadoActivoFijo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoActivoFijo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoActivoFijo=new JMenuMe("General");
		this.jmenuArchivoEstadoActivoFijo=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoActivoFijo=new JMenuMe("Acciones");
		this.jmenuDatosEstadoActivoFijo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoActivoFijo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoActivoFijo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoActivoFijo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoActivoFijo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoActivoFijo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoActivoFijo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoActivoFijo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoActivoFijo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoActivoFijo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoActivoFijo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoActivoFijo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoActivoFijo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoActivoFijo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoActivoFijo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoActivoFijo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoActivoFijo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoActivoFijo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoActivoFijo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoActivoFijo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoActivoFijo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoActivoFijo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoActivoFijo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoActivoFijo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoActivoFijo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoActivoFijo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoActivoFijo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoActivoFijo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoActivoFijo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoActivoFijo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoActivoFijo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoActivoFijo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoActivoFijo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoActivoFijo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoActivoFijo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoActivoFijo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoActivoFijo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoActivoFijo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoActivoFijo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoActivoFijo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoActivoFijo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoActivoFijo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoActivoFijo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoActivoFijo.add(this.jMenuItemCerrarEstadoActivoFijo);
			
			this.jmenuAccionesEstadoActivoFijo.add(this.jMenuItemNuevoEstadoActivoFijo);
			this.jmenuAccionesEstadoActivoFijo.add(this.jMenuItemNuevoGuardarCambiosEstadoActivoFijo);
			this.jmenuAccionesEstadoActivoFijo.add(this.jMenuItemNuevoRelacionesEstadoActivoFijo);
			this.jmenuAccionesEstadoActivoFijo.add(this.jMenuItemGuardarCambiosTablaEstadoActivoFijo);		
			this.jmenuAccionesEstadoActivoFijo.add(this.jMenuItemDuplicarEstadoActivoFijo);		
			this.jmenuAccionesEstadoActivoFijo.add(this.jMenuItemCopiarEstadoActivoFijo);		
			this.jmenuAccionesEstadoActivoFijo.add(this.jMenuItemVerFormEstadoActivoFijo);		
			
			this.jmenuDatosEstadoActivoFijo.add(this.jMenuItemRecargarInformacionEstadoActivoFijo);				
			this.jmenuDatosEstadoActivoFijo.add(this.jMenuItemAnterioresEstadoActivoFijo);				
			this.jmenuDatosEstadoActivoFijo.add(this.jMenuItemSiguientesEstadoActivoFijo);				
			this.jmenuDatosEstadoActivoFijo.add(this.jMenuItemAbrirOrderByEstadoActivoFijo);				
			this.jmenuDatosEstadoActivoFijo.add(this.jMenuItemMostrarOcultarEstadoActivoFijo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoActivoFijo.add(this.jMenuItemGuardarCambiosEstadoActivoFijo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoActivoFijo.add(this.jmenuArchivoEstadoActivoFijo);		
			this.jmenuBarEstadoActivoFijo.add(this.jmenuAccionesEstadoActivoFijo);		
			this.jmenuBarEstadoActivoFijo.add(this.jmenuDatosEstadoActivoFijo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoActivoFijo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoActivoFijo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasEstadoActivoFijo=new JTabbedPane();


		this.jTabbedPaneBusquedasEstadoActivoFijo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasEstadoActivoFijo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasEstadoActivoFijo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasEstadoActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasEstadoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleEstadoActivoFijo = new EstadoActivoFijoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Activo Fijo DATOS");
			this.jInternalFrameDetalleFormEstadoActivoFijo = new EstadoActivoFijoDetalleFormJInternalFrame(jDesktopPane,this.estadoactivofijoSessionBean.getConGuardarRelaciones(),this.estadoactivofijoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoActivoFijo = null;//new EstadoActivoFijoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoActivoFijo= new GridBagLayout();
		
		
		this.jTableDatosEstadoActivoFijo = new JTableMe();      
		
		String sToolTipEstadoActivoFijo="";
		sToolTipEstadoActivoFijo=EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoActivoFijo+="(ActivosFijos.EstadoActivoFijo)";
		}
		
		if(!this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoActivoFijo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoActivoFijo.setToolTipText(sToolTipEstadoActivoFijo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoActivoFijo);
		this.jTableDatosEstadoActivoFijo.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoActivoFijo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoActivoFijo.setRowSelectionAllowed(true);
		this.jTableDatosEstadoActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoActivoFijo = new JButtonMe();
		this.jButtonDuplicarEstadoActivoFijo = new JButtonMe();
		this.jButtonCopiarEstadoActivoFijo = new JButtonMe();
		this.jButtonVerFormEstadoActivoFijo = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoActivoFijo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoActivoFijo = new JButtonMe();
		this.jButtonCerrarEstadoActivoFijo = new JButtonMe();
		
		this.jScrollPanelDatosEstadoActivoFijo = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoActivoFijo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Activo Fijo";
		
		if(!this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Activo Fijos" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesEstadoActivoFijo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoActivoFijo=new ReporteDinamicoJInternalFrame(EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoActivoFijo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoActivoFijo=new ImportacionJInternalFrame(EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoActivoFijo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoActivoFijo = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoActivoFijo.setText("Orden");
		this.jButtonAbrirOrderByEstadoActivoFijo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoActivoFijo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoActivoFijo,false,this);
			
			//this.cargarOrderByEstadoActivoFijo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoActivoFijo,true,this);
			
			//this.cargarOrderByEstadoActivoFijo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoActivoFijo.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoActivoFijo.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoActivoFijo.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosEstadoActivoFijo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoActivoFijo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoActivoFijo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoActivoFijo.setText("Nuevo");
		this.jButtonDuplicarEstadoActivoFijo.setText("Duplicar");
		this.jButtonCopiarEstadoActivoFijo.setText("Copiar");
		this.jButtonVerFormEstadoActivoFijo.setText("Ver");
		this.jButtonNuevoRelacionesEstadoActivoFijo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoActivoFijo.setText("Guardar");
		this.jButtonCerrarEstadoActivoFijo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoActivoFijo,"nuevo_button","Nuevo",this.estadoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoActivoFijo,"duplicar_button","Duplicar",this.estadoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoActivoFijo,"copiar_button","Copiar",this.estadoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoActivoFijo,"ver_form","Ver",this.estadoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoActivoFijo,"nuevorelaciones_button","Nuevo Rel",this.estadoactivofijoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoActivoFijo,"guardarcambiostabla_button","Guardar",this.estadoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoActivoFijo,"cerrar_button","Salir",this.estadoactivofijoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoActivoFijo.setToolTipText("Nuevo"+" "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoActivoFijo.setToolTipText("Duplicar"+" "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoActivoFijo.setToolTipText("Copiar"+" "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoActivoFijo.setToolTipText("Ver"+" "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoActivoFijo.setToolTipText("Nuevo Rel"+" "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoActivoFijo.setToolTipText("Guardar"+" "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoActivoFijo.setToolTipText("Salir"+" "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoActivoFijo";
		inputMap = this.jButtonNuevoEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoActivoFijo"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoActivoFijo";
		inputMap = this.jButtonDuplicarEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoActivoFijo"));
		
		//COPIAR
		sMapKey = "CopiarEstadoActivoFijo";
		inputMap = this.jButtonCopiarEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoActivoFijo"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoActivoFijo";
		inputMap = this.jButtonVerFormEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoActivoFijo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoActivoFijo";
		inputMap = this.jButtonNuevoRelacionesEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoActivoFijo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoActivoFijo";
		inputMap = this.jButtonModificarEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoActivoFijo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoActivoFijo";
		inputMap = this.jButtonCerrarEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoActivoFijo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoActivoFijo";
		inputMap = this.jButtonGuardarCambiosTablaEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoActivoFijo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoActivoFijo.setName("jPanelParametrosReportesEstadoActivoFijo"); 
		
		this.jPanelParametrosReportesAccionesEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoActivoFijo.setName("jPanelParametrosReportesAccionesEstadoActivoFijo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoActivoFijo = new JButtonMe();
		this.jButtonRecargarInformacionEstadoActivoFijo.setText("Recargar");
		this.jButtonRecargarInformacionEstadoActivoFijo.setToolTipText("Recargar"+" "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoActivoFijo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoActivoFijo = new JButtonMe();
		this.jButtonProcesarInformacionEstadoActivoFijo.setText("Procesar");
		this.jButtonProcesarInformacionEstadoActivoFijo.setToolTipText("Procesar"+" "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoActivoFijo.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoActivoFijo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoActivoFijo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoActivoFijo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoActivoFijo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoActivoFijo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoActivoFijo.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoActivoFijo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoActivoFijo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoActivoFijo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoActivoFijo.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoActivoFijo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoActivoFijo.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoActivoFijo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoActivoFijo.setText("Accion");
		this.jComboBoxTiposAccionesEstadoActivoFijo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoActivoFijo.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoActivoFijo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoActivoFijo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoActivoFijo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoActivoFijo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoActivoFijo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoActivoFijo = new JLabelMe();
		
		this.jLabelAccionesEstadoActivoFijo.setText("Acciones");		
		this.jLabelAccionesEstadoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoActivoFijo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoActivoFijo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoActivoFijo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoActivoFijo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoActivoFijo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoActivoFijo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoActivoFijo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoActivoFijo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoActivoFijo.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoActivoFijo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoActivoFijo = new JButtonMe();
		//this.jButtonAnterioresEstadoActivoFijo.setText("<<");
        this.jButtonAnterioresEstadoActivoFijo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoActivoFijo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoActivoFijo = new JButtonMe();
		//this.jButtonSiguientesEstadoActivoFijo.setText(">>");
        this.jButtonSiguientesEstadoActivoFijo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoActivoFijo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoActivoFijo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoActivoFijo.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoActivoFijo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoActivoFijo,"nuevoguardarcambios_button","Nue",this.estadoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoActivoFijo";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoActivoFijo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoActivoFijo";
		inputMap = this.jButtonRecargarInformacionEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoActivoFijo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoActivoFijo";
		inputMap = this.jButtonSiguientesEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoActivoFijo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoActivoFijo";
		inputMap = this.jButtonAnterioresEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoActivoFijo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoActivoFijo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoActivoFijo.setMinimumSize(new Dimension(this.getWidth(),EstadoActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoActivoFijo.setMaximumSize(new Dimension(this.getWidth(),EstadoActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoActivoFijo.setPreferredSize(new Dimension(this.getWidth(),EstadoActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoActivoFijo = new GridBagLayout();

			this.jPanelPaginacionEstadoActivoFijo.setLayout(gridaBagLayoutPaginacionEstadoActivoFijo);						
			
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsEstadoActivoFijo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoActivoFijo.gridy = 0;
			this.gridBagConstraintsEstadoActivoFijo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoActivoFijo.add(this.jButtonAnterioresEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
					
						
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsEstadoActivoFijo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoActivoFijo.gridy = 0;
			
			this.jPanelPaginacionEstadoActivoFijo.add(this.jButtonNuevoGuardarCambiosEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
						
			
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsEstadoActivoFijo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoActivoFijo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoActivoFijo.gridy = 0;
			this.jPanelPaginacionEstadoActivoFijo.add(this.jButtonSiguientesEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoActivoFijo.gridy = 1;
			this.gridBagConstraintsEstadoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoActivoFijo.add(this.jButtonNuevoEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoActivoFijo.gridy = 1;
				this.gridBagConstraintsEstadoActivoFijo.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEstadoActivoFijo.add(this.jButtonNuevoRelacionesEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
			}
			
			
			if(!this.estadoactivofijoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoActivoFijo.gridy = 1;
				this.gridBagConstraintsEstadoActivoFijo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoActivoFijo.add(this.jButtonGuardarCambiosTablaEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
			}
			
			
			
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoActivoFijo.gridy = 1;
			this.gridBagConstraintsEstadoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoActivoFijo.add(this.jButtonDuplicarEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
			
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoActivoFijo.gridy = 1;
			this.gridBagConstraintsEstadoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoActivoFijo.add(this.jButtonCopiarEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
		
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoActivoFijo.gridy = 1;
			this.gridBagConstraintsEstadoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoActivoFijo.add(this.jButtonVerFormEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
		
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoActivoFijo.gridy = 1;
			this.gridBagConstraintsEstadoActivoFijo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoActivoFijo.add(this.jButtonCerrarEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
		
		
		
		this.jButtonRecargarInformacionEstadoActivoFijo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoActivoFijo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoActivoFijo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoActivoFijo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoActivoFijo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoActivoFijo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoActivoFijo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoActivoFijo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoActivoFijo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoActivoFijo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoActivoFijo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoActivoFijo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoActivoFijo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoActivoFijo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoActivoFijo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoActivoFijo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoActivoFijo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoActivoFijo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoActivoFijo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoActivoFijo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoActivoFijo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoActivoFijo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoActivoFijo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoActivoFijo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoActivoFijo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoActivoFijo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoActivoFijo.setLayout(gridaBagParametrosReportesEstadoActivoFijo);
			this.jPanelParametrosReportesAccionesEstadoActivoFijo.setLayout(gridaBagParametrosReportesAccionesEstadoActivoFijo);
			
			
			this.jPanelParametrosAuxiliar1EstadoActivoFijo.setLayout(gridaBagParametrosAuxiliar1EstadoActivoFijo);
			this.jPanelParametrosAuxiliar2EstadoActivoFijo.setLayout(gridaBagParametrosAuxiliar2EstadoActivoFijo);
			this.jPanelParametrosAuxiliar3EstadoActivoFijo.setLayout(gridaBagParametrosAuxiliar3EstadoActivoFijo);
			this.jPanelParametrosAuxiliar4EstadoActivoFijo.setLayout(gridaBagParametrosAuxiliar4EstadoActivoFijo);
			//this.jPanelParametrosAuxiliar5EstadoActivoFijo.setLayout(gridaBagParametrosAuxiliar2EstadoActivoFijo);			
			
			
			
			
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoActivoFijo.add(this.jButtonRecargarInformacionEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsEstadoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoActivoFijo.add(this.jComboBoxTiposPaginacionEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsEstadoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoActivoFijo.add(this.jCheckBoxConAltoMaximoTablaEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsEstadoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoActivoFijo.add(this.jComboBoxTiposArchivosReportesEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsEstadoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoActivoFijo.add(this.jPanelParametrosAuxiliar1EstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsEstadoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoActivoFijo.add(this.jComboBoxTiposReportesEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsEstadoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoActivoFijo.add(this.jPanelParametrosAuxiliar4EstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsEstadoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoActivoFijo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoActivoFijo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoActivoFijo.add(this.jComboBoxTiposReportesEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsEstadoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoActivoFijo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoActivoFijo.add(this.jCheckBoxGenerarReporteEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsEstadoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoActivoFijo.add(this.jPanelParametrosAuxiliar2EstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoActivoFijo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoActivoFijo.add(this.jLabelAccionesEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoActivoFijo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoActivoFijo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoActivoFijo.add(this.jButtonAbrirOrderByEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoActivoFijo.add(this.jComboBoxTiposSeleccionarEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);			
			
			
			/*
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoActivoFijo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoActivoFijo.add(this.jCheckBoxSeleccionarTodosEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsEstadoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoActivoFijo.add(this.jCheckBoxSeleccionarTodosEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);															
				
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsEstadoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoActivoFijo.add(this.jCheckBoxSeleccionadosEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsEstadoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoActivoFijo.add(this.jPanelParametrosAuxiliar3EstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsEstadoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoActivoFijo.add(this.jComboBoxTiposRelacionesEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
				
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsEstadoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoActivoFijo.add(this.jComboBoxTiposAccionesEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoActivoFijo = new GridBagLayout();

			this.jScrollPanelDatosEstadoActivoFijo.setLayout(gridaBagLayoutDatosEstadoActivoFijo);
			
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoActivoFijo.gridy = 0;
			this.gridBagConstraintsEstadoActivoFijo.gridx = 0;
			
			this.jScrollPanelDatosEstadoActivoFijo.add(this.jTableDatosEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoActivoFijo.setViewportView(this.jTableDatosEstadoActivoFijo);
		this.jTableDatosEstadoActivoFijo.setFillsViewportHeight(true);
		this.jTableDatosEstadoActivoFijo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoActivoFijo= new GridBagLayout();
		this.jPanelAccionesEstadoActivoFijo.setLayout(gridaBagLayoutAccionesEstadoActivoFijo);
		
		
		/*	
		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoActivoFijo.gridy = 0;
		this.gridBagConstraintsEstadoActivoFijo.gridx = 0;
			
		this.jPanelAccionesEstadoActivoFijo.add(this.jButtonNuevoEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoActivoFijo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoActivoFijo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();						
			this.gridBagConstraintsEstadoActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoActivoFijo.gridx = 0;		
			//this.gridBagConstraintsEstadoActivoFijo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoActivoFijo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoActivoFijo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoActivoFijo.gridx = 0;		
		//this.gridBagConstraintsEstadoActivoFijo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoActivoFijo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoActivoFijo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoActivoFijo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoActivoFijo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);								
		
		
		/*
		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoActivoFijo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
		*/		
		
		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoActivoFijo.gridx =0;
		this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoActivoFijo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
				
		
		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoActivoFijo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EstadoActivoFijoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoActivoFijo = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoActivoFijo.setLayout(gridaBagLayoutBusquedasParametrosEstadoActivoFijo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoActivoFijo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
			
			
		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
		
			
		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoActivoFijo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoActivoFijo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoActivoFijo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoActivoFijo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoActivoFijo.setName("jPanelReporteDinamicoEstadoActivoFijo"); 
		
		this.jPanelReporteDinamicoEstadoActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoActivoFijo.setLayout(gridaBagLayoutReporteDinamicoEstadoActivoFijo);
		
		
		this.jInternalFrameReporteDinamicoEstadoActivoFijo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoActivoFijo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoActivoFijo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoActivoFijo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoActivoFijo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoActivoFijo.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoActivoFijo.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoActivoFijo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Activo Fijos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoActivoFijo = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoActivoFijo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoActivoFijo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoActivoFijo.add(this.jLabelColumnasSelectReporteEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoActivoFijo = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoActivoFijo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoActivoFijo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoActivoFijo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoActivoFijo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoActivoFijo=new JScrollPane(this.jListColumnasSelectReporteEstadoActivoFijo);
			
			this.jScrollColumnasSelectReporteEstadoActivoFijo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoActivoFijo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoActivoFijo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoActivoFijo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoActivoFijo.add(this.jListColumnasSelectReporteEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
		this.jPanelReporteDinamicoEstadoActivoFijo.add(this.jScrollColumnasSelectReporteEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoActivoFijo = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoActivoFijo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoActivoFijo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoActivoFijo.add(this.jLabelRelacionesSelectReporteEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoActivoFijo = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoActivoFijo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoActivoFijo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoActivoFijo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoActivoFijo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoActivoFijo=new JScrollPane(this.jListRelacionesSelectReporteEstadoActivoFijo);
			
			this.jScrollRelacionesSelectReporteEstadoActivoFijo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoActivoFijo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoActivoFijo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoActivoFijo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoActivoFijo.add(this.jListRelacionesSelectReporteEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
		this.jPanelReporteDinamicoEstadoActivoFijo.add(this.jScrollRelacionesSelectReporteEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEstadoActivoFijo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoActivoFijo = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoActivoFijo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoActivoFijo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoActivoFijo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoActivoFijo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoActivoFijo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoActivoFijo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoActivoFijo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoActivoFijo.add(this.jLabelGenerarExcelReporteDinamicoEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoActivoFijo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoActivoFijo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoActivoFijo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoActivoFijo.setToolTipText("Generar EXCEL"+" "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoActivoFijo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoActivoFijo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoActivoFijo.add(this.jButtonGenerarExcelReporteDinamicoEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoActivoFijo.add(this.jComboBoxTiposReportesDinamicoEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoActivoFijo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoActivoFijo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoActivoFijo.add(this.jLabelTiposArchivoReporteDinamicoEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoActivoFijo.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoActivoFijo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoActivoFijo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoActivoFijo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoActivoFijo.setToolTipText("Generar"+" "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoActivoFijo.add(this.jButtonGenerarReporteDinamicoEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoActivoFijo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoActivoFijo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoActivoFijo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoActivoFijo.setToolTipText("Cancelar"+" "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoActivoFijo.add(this.jButtonCerrarReporteDinamicoEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoActivoFijo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoActivoFijo= new JScrollPane(jPanelReporteDinamicoEstadoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Activo Fijos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoActivoFijo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoActivoFijo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoActivoFijo);
		this.jInternalFrameReporteDinamicoEstadoActivoFijo.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoActivoFijo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoActivoFijo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoActivoFijo.setName("jPanelImportacionEstadoActivoFijo"); 
		
		this.jPanelImportacionEstadoActivoFijo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoActivoFijo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoActivoFijo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoActivoFijo.setLayout(gridaBagLayoutImportacionEstadoActivoFijo);
		
		
		this.jInternalFrameImportacionEstadoActivoFijo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoActivoFijo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoActivoFijo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoActivoFijo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoActivoFijo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoActivoFijo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoActivoFijo.setResizable(true);
	    this.jInternalFrameImportacionEstadoActivoFijo.setClosable(true);
	    this.jInternalFrameImportacionEstadoActivoFijo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoActivoFijo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoActivoFijo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoActivoFijo.setResizable(true);
	    this.jInternalFrameImportacionEstadoActivoFijo.setClosable(true);
	    this.jInternalFrameImportacionEstadoActivoFijo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoActivoFijo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoActivoFijo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoActivoFijo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Activo Fijos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoActivoFijo = new JLabelMe();

		this.jLabelArchivoImportacionEstadoActivoFijo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoActivoFijo.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoActivoFijo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoActivoFijo.add(this.jLabelArchivoImportacionEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoActivoFijo = new JFileChooser();		
		this.jFileChooserImportacionEstadoActivoFijo.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoActivoFijo = new JButtonMe();
		this.jButtonAbrirImportacionEstadoActivoFijo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoActivoFijo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoActivoFijo.setToolTipText("Generar"+" "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoActivoFijo.add(this.jButtonAbrirImportacionEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoActivoFijo = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoActivoFijo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoActivoFijo.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoActivoFijo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoActivoFijo.add(this.jLabelPathArchivoImportacionEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoActivoFijo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoActivoFijo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoActivoFijo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoActivoFijo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoActivoFijo.add(this.jTextFieldPathArchivoImportacionEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoActivoFijo = new JButtonMe();
		this.jButtonGenerarImportacionEstadoActivoFijo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoActivoFijo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoActivoFijo.setToolTipText("Generar"+" "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoActivoFijo.add(this.jButtonGenerarImportacionEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoActivoFijo = new JButtonMe();
		this.jButtonCerrarImportacionEstadoActivoFijo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoActivoFijo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoActivoFijo.setToolTipText("Cancelar"+" "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoActivoFijo.add(this.jButtonCerrarImportacionEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoActivoFijo = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoActivoFijo= new JScrollPane(jPanelImportacionEstadoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoActivoFijo.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoActivoFijo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoActivoFijo);
		this.jInternalFrameImportacionEstadoActivoFijo.getContentPane().add(this.jScrollPanelImportacionEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoActivoFijo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoActivoFijo = new JButtonMe();
			this.jButtonAbrirOrderByEstadoActivoFijo.setText("Orden");
			this.jButtonAbrirOrderByEstadoActivoFijo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoActivoFijo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoActivoFijo";
			inputMap = this.jButtonAbrirOrderByEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoActivoFijo"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoActivoFijo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoActivoFijo.setName("jPanelOrderByEstadoActivoFijo"); 
			
			this.jPanelOrderByEstadoActivoFijo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoActivoFijo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoActivoFijo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoActivoFijo.setLayout(gridaBagLayoutOrderByEstadoActivoFijo);
			
			
			this.jTableDatosEstadoActivoFijoOrderBy = new JTableMe();        
			this.jTableDatosEstadoActivoFijoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoActivoFijoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoActivoFijoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoActivoFijoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoActivoFijoOrderBy.setViewportView(this.jTableDatosEstadoActivoFijoOrderBy);
			this.jTableDatosEstadoActivoFijoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoActivoFijoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoActivoFijo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoActivoFijo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoActivoFijo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoActivoFijo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoActivoFijo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoActivoFijo.setTitle("Orden");
			this.jInternalFrameOrderByEstadoActivoFijo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoActivoFijo.setResizable(true);
			this.jInternalFrameOrderByEstadoActivoFijo.setClosable(true);
			this.jInternalFrameOrderByEstadoActivoFijo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoActivoFijo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoActivoFijo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoActivoFijo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Activo Fijos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsEstadoActivoFijo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoActivoFijo.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoActivoFijo.ipady =150;
				
			this.jPanelOrderByEstadoActivoFijo.add(jScrollPanelDatosEstadoActivoFijoOrderBy, this.gridBagConstraintsEstadoActivoFijo);//this.jTableDatosEstadoActivoFijoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoActivoFijo = new JButtonMe();
			this.jButtonCerrarOrderByEstadoActivoFijo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoActivoFijo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoActivoFijo.setToolTipText("Cancelar"+" "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoActivoFijo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoActivoFijo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoActivoFijo.add(this.jButtonCerrarOrderByEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoActivoFijo = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoActivoFijo= new JScrollPane(jPanelOrderByEstadoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsEstadoActivoFijo.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoActivoFijo.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoActivoFijo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoActivoFijo);
			
			this.jInternalFrameOrderByEstadoActivoFijo.getContentPane().add(this.jScrollPanelOrderByEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);			
		
		} else {
			this.jButtonAbrirOrderByEstadoActivoFijo = new JButtonMe();
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
		int iWidthTableCalculado=0;//1030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.estadoactivofijoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoActivoFijo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoActivoFijo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoActivoFijo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoActivoFijo.getRowHeight();//EstadoActivoFijoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoActivoFijo.isSelected()) {
					iHeightTable=EstadoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoActivoFijo.isSelected()) {
					iHeightTable=EstadoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoActivoFijo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoActivoFijo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoActivoFijo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoActivoFijo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoActivoFijo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoActivoFijo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoActivoFijo!=null && this.jInternalFrameOrderByEstadoActivoFijo.getjTableDatosOrderBy()!=null) {
			//if(!this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoActivoFijo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoActivoFijo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoActivoFijo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoActivoFijo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoActivoFijo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoActivoFijo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoActivoFijo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoActivoFijo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoActivoFijo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoActivoFijo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadoactivofijoLogic.getEstadoActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoactivofijos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoActivoFijo> TraerEstadoActivoFijoBeans(List<EstadoActivoFijo> estadoactivofijos,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoActivoFijo estadoactivofijo:estadoactivofijos) {
					
				if(!(EstadoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadoactivofijo.setsDetalleGeneralEntityReporte(EstadoActivoFijoConstantesFunciones.getEstadoActivoFijoDescripcion(estadoactivofijo));
										
						
					
					

					if(estadoactivofijo.getDetalleActivoFijos()!=null && Funciones.existeClass(classes,DetalleActivoFijo.class)) {
						try{estadoactivofijo.setdetalleactivofijosDescripcionReporte(new JRBeanCollectionDataSource(DetalleActivoFijoJInternalFrame.TraerDetalleActivoFijoBeans(estadoactivofijo.getDetalleActivoFijos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estadoactivofijo.getParteActivoFijos()!=null && Funciones.existeClass(classes,ParteActivoFijo.class)) {
						try{estadoactivofijo.setparteactivofijosDescripcionReporte(new JRBeanCollectionDataSource(ParteActivoFijoJInternalFrame.TraerParteActivoFijoBeans(estadoactivofijo.getParteActivoFijos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//estadoactivofijo.setsDetalleGeneralEntityReporte(estadoactivofijo.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadoactivofijobeans.add(estadoactivofijobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadoactivofijos;
    }
	//PARA REPORTES FIN
}
