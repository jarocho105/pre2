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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;

//import com.bydan.erp.importaciones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.importaciones.util.TipoTerminosImporConstantesFunciones;

import com.bydan.erp.importaciones.business.logic.*;
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
public class TipoTerminosImporJInternalFrame extends TipoTerminosImporBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoTerminosImpor;
	
	protected JMenuBar jmenuBarTipoTerminosImpor;
	
	protected JMenu jmenuTipoTerminosImpor;
	protected JMenu jmenuDatosTipoTerminosImpor;
	protected JMenu jmenuArchivoTipoTerminosImpor;
	protected JMenu jmenuAccionesTipoTerminosImpor;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoTerminosImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoTerminosImpor;	
	protected GridBagConstraints gridBagConstraintsTipoTerminosImpor;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoTerminosImporDetalleFormJInternalFrame jInternalFrameDetalleFormTipoTerminosImpor;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoTerminosImpor;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoTerminosImpor;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoTerminosImporSessionBean tipoterminosimporSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoTerminosImpor> tipoterminosimpors;		
	public List<TipoTerminosImpor> tipoterminosimporsEliminados;	
	public List<TipoTerminosImpor> tipoterminosimporsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoTerminosImpor;		
	protected JButton jButtonAbrirOrderByTipoTerminosImpor;
	
	
	//protected JPanel jPanelOrderByTipoTerminosImpor;
	//public JScrollPane jScrollPanelOrderByTipoTerminosImpor;	
	//protected JButton jButtonCerrarOrderByTipoTerminosImpor;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoTerminosImporLogic tipoterminosimporLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoTerminosImpor;
	public JScrollPane jScrollPanelDatosEdicionTipoTerminosImpor;
	public JScrollPane jScrollPanelDatosGeneralTipoTerminosImpor;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoTerminosImporOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoTerminosImpor;
	//public JScrollPane jScrollPanelImportacionTipoTerminosImpor;
	
	
	
	protected JPanel jPanelAccionesTipoTerminosImpor;
	
    protected JPanel jPanelPaginacionTipoTerminosImpor;
    protected JPanel jPanelParametrosReportesTipoTerminosImpor;
	protected JPanel jPanelParametrosReportesAccionesTipoTerminosImpor;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoTerminosImpor;
	protected JPanel jPanelParametrosAuxiliar2TipoTerminosImpor;
	protected JPanel jPanelParametrosAuxiliar3TipoTerminosImpor;
	protected JPanel jPanelParametrosAuxiliar4TipoTerminosImpor;
	//protected JPanel jPanelParametrosAuxiliar5TipoTerminosImpor;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoTerminosImpor;
	//protected JPanel jPanelImportacionTipoTerminosImpor;
	
	
	public JTable jTableDatosTipoTerminosImpor;
	
	
	
	//public JTable jTableDatosTipoTerminosImporOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoTerminosImpor;
	protected JButton jButtonDuplicarTipoTerminosImpor;
	protected JButton jButtonCopiarTipoTerminosImpor;
	protected JButton jButtonVerFormTipoTerminosImpor;
	protected JButton jButtonNuevoRelacionesTipoTerminosImpor;
	protected JButton jButtonModificarTipoTerminosImpor;
	
    protected JButton jButtonGuardarCambiosTablaTipoTerminosImpor;
	protected JButton jButtonCerrarTipoTerminosImpor;
	
	
	protected JButton jButtonRecargarInformacionTipoTerminosImpor;
	protected JButton jButtonProcesarInformacionTipoTerminosImpor;
	
	
	protected JButton jButtonAnterioresTipoTerminosImpor;
	protected JButton jButtonSiguientesTipoTerminosImpor;
	protected JButton jButtonNuevoGuardarCambiosTipoTerminosImpor;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoTerminosImpor;
	//protected JButton jButtonCerrarReporteDinamicoTipoTerminosImpor;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoTerminosImpor;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoTerminosImpor;
	//protected JButton jButtonGenerarImportacionTipoTerminosImpor;
	//protected JButton jButtonCerrarImportacionTipoTerminosImpor;
	//protected JFileChooser jFileChooserImportacionTipoTerminosImpor;
	//protected File fileImportacionTipoTerminosImpor;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoTerminosImpor;
	protected JButton jButtonDuplicarToolBarTipoTerminosImpor;
	protected JButton jButtonNuevoRelacionesToolBarTipoTerminosImpor;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoTerminosImpor;
	protected JButton jButtonCopiarToolBarTipoTerminosImpor;
	protected JButton jButtonVerFormToolBarTipoTerminosImpor;
	public JButton jButtonGuardarCambiosTablaToolBarTipoTerminosImpor;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoTerminosImpor;
	protected JButton jButtonCerrarToolBarTipoTerminosImpor;
	
	protected JButton jButtonRecargarInformacionToolBarTipoTerminosImpor;
	protected JButton jButtonProcesarInformacionToolBarTipoTerminosImpor;
	protected JButton jButtonAnterioresToolBarTipoTerminosImpor;
	protected JButton jButtonSiguientesToolBarTipoTerminosImpor;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoTerminosImpor;
	protected JButton jButtonAbrirOrderByToolBarTipoTerminosImpor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoTerminosImpor;
	protected JMenuItem jMenuItemDuplicarTipoTerminosImpor;
	protected JMenuItem jMenuItemNuevoRelacionesTipoTerminosImpor;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoTerminosImpor;
	protected JMenuItem jMenuItemCopiarTipoTerminosImpor;
	protected JMenuItem jMenuItemVerFormTipoTerminosImpor;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoTerminosImpor;
	protected JMenuItem jMenuItemCerrarTipoTerminosImpor;
	protected JMenuItem jMenuItemDetalleCerrarTipoTerminosImpor;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoTerminosImpor;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoTerminosImpor;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoTerminosImpor;
	protected JMenuItem jMenuItemProcesarInformacionTipoTerminosImpor;
	protected JMenuItem jMenuItemAnterioresTipoTerminosImpor;
	protected JMenuItem jMenuItemSiguientesTipoTerminosImpor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoTerminosImpor;
	protected JMenuItem jMenuItemAbrirOrderByTipoTerminosImpor;
	protected JMenuItem jMenuItemMostrarOcultarTipoTerminosImpor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoTerminosImpor;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoTerminosImpor;
	protected JCheckBox jCheckBoxSeleccionadosTipoTerminosImpor;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoTerminosImpor;
	protected JCheckBox jCheckBoxConGraficoReporteTipoTerminosImpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoTerminosImpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoTerminosImpor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoTerminosImpor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoTerminosImpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoTerminosImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoTerminosImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoTerminosImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoTerminosImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoTerminosImpor;
	protected JTextField jTextFieldValorCampoGeneralTipoTerminosImpor;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoTerminosImpor;
	//public JList<Reporte> jListColumnasSelectReporteTipoTerminosImpor;
	//public JScrollPane jScrollColumnasSelectReporteTipoTerminosImpor;
	
	//public JLabel jLabelRelacionesSelectReporteTipoTerminosImpor;
	//public JList<Reporte> jListRelacionesSelectReporteTipoTerminosImpor;
	//public JScrollPane jScrollRelacionesSelectReporteTipoTerminosImpor;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoTerminosImpor;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoTerminosImpor;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoTerminosImpor;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoTerminosImpor;
	
		
	//public JLabel jLabelArchivoImportacionTipoTerminosImpor;	
	//public JLabel jLabelPathArchivoImportacionTipoTerminosImpor;
	//protected JTextField jTextFieldPathArchivoImportacionTipoTerminosImpor;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoTerminosImpor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoTerminosImpor;
	
	//public JLabel jLabelColumnaCategoriaValorTipoTerminosImpor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoTerminosImpor;
	
	//public JLabel jLabelColumnasValoresGraficoTipoTerminosImpor;
	//public JList<Reporte> jListColumnasValoresGraficoTipoTerminosImpor;
	//public JScrollPane jScrollColumnasValoresGraficoTipoTerminosImpor;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoTerminosImpor;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoTerminosImpor;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	
	
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
	public TipoTerminosImporJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoTerminosImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTerminosImporJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoTerminosImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTerminosImporJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoTerminosImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTerminosImporJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoTerminosImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoTerminosImpor)	{
		this.jButtonRecargarInformacionTipoTerminosImpor = jButtonRecargarInformacionTipoTerminosImpor;
	}
	
	public JButton getjButtonProcesarInformacionTipoTerminosImpor() {
		return this.jButtonProcesarInformacionTipoTerminosImpor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoTerminosImpor)	{
		this.jButtonProcesarInformacionTipoTerminosImpor = jButtonProcesarInformacionTipoTerminosImpor;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoTerminosImpor() {
		return this.jButtonRecargarInformacionTipoTerminosImpor;
	}
	
	
	public List<TipoTerminosImpor> gettipoterminosimpors() {
		return this.tipoterminosimpors;
	}

	public void settipoterminosimpors(List<TipoTerminosImpor> tipoterminosimpors) {
		this.tipoterminosimpors = tipoterminosimpors;
	}
	
	public List<TipoTerminosImpor> gettipoterminosimporsAux() {
		return this.tipoterminosimporsAux;
	}

	public void settipoterminosimporsAux(List<TipoTerminosImpor> tipoterminosimporsAux) {
		this.tipoterminosimporsAux = tipoterminosimporsAux;
	}
	
	public List<TipoTerminosImpor> gettipoterminosimporsEliminados() {
		return this.tipoterminosimporsEliminados;
	}

	public void setTipoTerminosImporsEliminados(List<TipoTerminosImpor> tipoterminosimporsEliminados) {
		this.tipoterminosimporsEliminados = tipoterminosimporsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoTerminosImpor() {
		return jComboBoxTiposSeleccionarTipoTerminosImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoTerminosImpor(
			JComboBox jComboBoxTiposSeleccionarTipoTerminosImpor) {
		this.jComboBoxTiposSeleccionarTipoTerminosImpor = jComboBoxTiposSeleccionarTipoTerminosImpor;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoTerminosImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoTerminosImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoTerminosImpor .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoTerminosImpor() {
		return jTextFieldValorCampoGeneralTipoTerminosImpor;
	}

	public void setjTextFieldValorCampoGeneralTipoTerminosImpor(
			JTextField jTextFieldValorCampoGeneralTipoTerminosImpor) {
		this.jTextFieldValorCampoGeneralTipoTerminosImpor = jTextFieldValorCampoGeneralTipoTerminosImpor;
	}

	public void setBorderResaltarValorCampoGeneralTipoTerminosImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTerminosImpor.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoTerminosImpor .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoTerminosImpor() {
		return this.jCheckBoxSeleccionarTodosTipoTerminosImpor;
	}

	public void setjCheckBoxSeleccionarTodosTipoTerminosImpor(
			JCheckBox jCheckBoxSeleccionarTodosTipoTerminosImpor) {
		this.jCheckBoxSeleccionarTodosTipoTerminosImpor = jCheckBoxSeleccionarTodosTipoTerminosImpor;
	}

	public void setBorderResaltarSeleccionarTodosTipoTerminosImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTerminosImpor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoTerminosImpor .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoTerminosImpor() {
		return this.jCheckBoxSeleccionadosTipoTerminosImpor;
	}

	public void setjCheckBoxSeleccionadosTipoTerminosImpor(
			JCheckBox jCheckBoxSeleccionadosTipoTerminosImpor) {
		this.jCheckBoxSeleccionadosTipoTerminosImpor = jCheckBoxSeleccionadosTipoTerminosImpor;
	}
	
	public void setBorderResaltarSeleccionadosTipoTerminosImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTerminosImpor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoTerminosImpor .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoTerminosImpor() {
		return this.jComboBoxTiposArchivosReportesTipoTerminosImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoTerminosImpor(
			JComboBox jComboBoxTiposArchivosReportesTipoTerminosImpor) {
		this.jComboBoxTiposArchivosReportesTipoTerminosImpor = jComboBoxTiposArchivosReportesTipoTerminosImpor;
	}

	public void setBorderResaltarTiposArchivosReportesTipoTerminosImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTerminosImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoTerminosImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoTerminosImpor() {
		return this.jComboBoxTiposReportesTipoTerminosImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoTerminosImpor(
			JComboBox jComboBoxTiposReportesTipoTerminosImpor) {
		this.jComboBoxTiposReportesTipoTerminosImpor = jComboBoxTiposReportesTipoTerminosImpor;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoTerminosImpor() {
	//	return jComboBoxTiposReportesDinamicoTipoTerminosImpor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoTerminosImpor(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoTerminosImpor) {
	//	this.jComboBoxTiposReportesDinamicoTipoTerminosImpor = jComboBoxTiposReportesDinamicoTipoTerminosImpor;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoTerminosImpor() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoTerminosImpor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoTerminosImpor(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoTerminosImpor) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoTerminosImpor = jComboBoxTiposArchivosReportesDinamicoTipoTerminosImpor;
	//}
	
	public void setBorderResaltarTiposReportesTipoTerminosImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTerminosImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoTerminosImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoTerminosImpor() {
		return this.jComboBoxTiposGraficosReportesTipoTerminosImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoTerminosImpor(
			JComboBox jComboBoxTiposGraficosReportesTipoTerminosImpor) {
		this.jComboBoxTiposGraficosReportesTipoTerminosImpor = jComboBoxTiposGraficosReportesTipoTerminosImpor;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoTerminosImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTerminosImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoTerminosImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoTerminosImpor() {
		return this.jComboBoxTiposPaginacionTipoTerminosImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoTerminosImpor(
			JComboBox jComboBoxTiposPaginacionTipoTerminosImpor) {
		this.jComboBoxTiposPaginacionTipoTerminosImpor = jComboBoxTiposPaginacionTipoTerminosImpor;
	}
	
	public void setBorderResaltarTiposPaginacionTipoTerminosImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTerminosImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoTerminosImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoTerminosImpor() {
		return this.jComboBoxTiposRelacionesTipoTerminosImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoTerminosImpor() {
		return this.jComboBoxTiposAccionesTipoTerminosImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoTerminosImpor(
			JComboBox jComboBoxTiposRelacionesTipoTerminosImpor) {
		this.jComboBoxTiposRelacionesTipoTerminosImpor = jComboBoxTiposRelacionesTipoTerminosImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoTerminosImpor(
			JComboBox jComboBoxTiposAccionesTipoTerminosImpor) {
		this.jComboBoxTiposAccionesTipoTerminosImpor = jComboBoxTiposAccionesTipoTerminosImpor;
	}
	
	public void setBorderResaltarTiposRelacionesTipoTerminosImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTerminosImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoTerminosImpor .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoTerminosImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTerminosImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoTerminosImpor .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoTerminosImpor() {
	//	return jCheckBoxConGraficoDinamicoTipoTerminosImpor;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoTerminosImpor(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoTerminosImpor) {
	//	this.jCheckBoxConGraficoDinamicoTipoTerminosImpor = jCheckBoxConGraficoDinamicoTipoTerminosImpor;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoTerminosImpor() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoTerminosImpor.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoTerminosImpor .setBorder(borderResaltar);		
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
		this.tipoterminosimporSessionBean=new TipoTerminosImporSessionBean();
		
		this.tipoterminosimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoterminosimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoterminosimporSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoTerminosImporJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoTerminosImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoTerminosImporJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoTerminosImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoTerminosImporJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Terminos MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoTerminosImporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoTerminosImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoTerminosImpor= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoTerminosImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoTerminosImpor,this.jTtoolBarTipoTerminosImpor,
							"nuevo","nuevo","Nuevo"+" "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoTerminosImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoTerminosImpor,this.jTtoolBarTipoTerminosImpor,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoTerminosImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoTerminosImpor,this.jTtoolBarTipoTerminosImpor,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoTerminosImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoTerminosImpor,this.jTtoolBarTipoTerminosImpor,
							"duplicar","duplicar","Duplicar"+" "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoTerminosImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoTerminosImpor,this.jTtoolBarTipoTerminosImpor,
							"copiar","copiar","Copiar"+" "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoTerminosImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoTerminosImpor,this.jTtoolBarTipoTerminosImpor,
							"ver_form","ver_form","Ver"+" "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoTerminosImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoTerminosImpor,this.jTtoolBarTipoTerminosImpor,
							"recargar","recargar","Recargar"+" "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoTerminosImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoTerminosImpor,this.jTtoolBarTipoTerminosImpor,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoTerminosImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoTerminosImpor,this.jTtoolBarTipoTerminosImpor,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoTerminosImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoTerminosImpor,this.jTtoolBarTipoTerminosImpor,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoTerminosImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoTerminosImpor,this.jTtoolBarTipoTerminosImpor,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoTerminosImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoTerminosImpor,this.jTtoolBarTipoTerminosImpor,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoTerminosImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoTerminosImpor,this.jTtoolBarTipoTerminosImpor,
							"cerrar","cerrar","Salir"+" "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoTerminosImpor=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoTerminosImpor;
			
				this.jButtonProcesarInformacionToolBarTipoTerminosImpor=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoTerminosImpor;
				
		//protected JButton jButtonModificarToolBarTipoTerminosImpor;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoTerminosImpor=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoTerminosImpor=new JMenuMe("General");
		this.jmenuArchivoTipoTerminosImpor=new JMenuMe("Archivo");
		this.jmenuAccionesTipoTerminosImpor=new JMenuMe("Acciones");
		this.jmenuDatosTipoTerminosImpor=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoTerminosImpor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoTerminosImpor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoTerminosImpor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoTerminosImpor= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoTerminosImpor.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoTerminosImpor,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoTerminosImpor= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoTerminosImpor.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoTerminosImpor,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoTerminosImpor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoTerminosImpor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoTerminosImpor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoTerminosImpor= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoTerminosImpor.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoTerminosImpor,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoTerminosImpor= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoTerminosImpor.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoTerminosImpor,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoTerminosImpor= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoTerminosImpor.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoTerminosImpor,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoTerminosImpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoTerminosImpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoTerminosImpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoTerminosImpor= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoTerminosImpor.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoTerminosImpor,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoTerminosImpor= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoTerminosImpor.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoTerminosImpor,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoTerminosImpor= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoTerminosImpor.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoTerminosImpor,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoTerminosImpor= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoTerminosImpor.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoTerminosImpor,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoTerminosImpor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoTerminosImpor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoTerminosImpor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoTerminosImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoTerminosImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoTerminosImpor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoTerminosImpor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoTerminosImpor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoTerminosImpor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoTerminosImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoTerminosImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoTerminosImpor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoTerminosImpor= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoTerminosImpor.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoTerminosImpor,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoTerminosImpor.add(this.jMenuItemCerrarTipoTerminosImpor);
			
			this.jmenuAccionesTipoTerminosImpor.add(this.jMenuItemNuevoTipoTerminosImpor);
			this.jmenuAccionesTipoTerminosImpor.add(this.jMenuItemNuevoGuardarCambiosTipoTerminosImpor);
			this.jmenuAccionesTipoTerminosImpor.add(this.jMenuItemNuevoRelacionesTipoTerminosImpor);
			this.jmenuAccionesTipoTerminosImpor.add(this.jMenuItemGuardarCambiosTablaTipoTerminosImpor);		
			this.jmenuAccionesTipoTerminosImpor.add(this.jMenuItemDuplicarTipoTerminosImpor);		
			this.jmenuAccionesTipoTerminosImpor.add(this.jMenuItemCopiarTipoTerminosImpor);		
			this.jmenuAccionesTipoTerminosImpor.add(this.jMenuItemVerFormTipoTerminosImpor);		
			
			this.jmenuDatosTipoTerminosImpor.add(this.jMenuItemRecargarInformacionTipoTerminosImpor);				
			this.jmenuDatosTipoTerminosImpor.add(this.jMenuItemAnterioresTipoTerminosImpor);				
			this.jmenuDatosTipoTerminosImpor.add(this.jMenuItemSiguientesTipoTerminosImpor);				
			this.jmenuDatosTipoTerminosImpor.add(this.jMenuItemAbrirOrderByTipoTerminosImpor);				
			this.jmenuDatosTipoTerminosImpor.add(this.jMenuItemMostrarOcultarTipoTerminosImpor);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoTerminosImpor.add(this.jMenuItemGuardarCambiosTipoTerminosImpor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoTerminosImpor.add(this.jmenuArchivoTipoTerminosImpor);		
			this.jmenuBarTipoTerminosImpor.add(this.jmenuAccionesTipoTerminosImpor);		
			this.jmenuBarTipoTerminosImpor.add(this.jmenuDatosTipoTerminosImpor);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoTerminosImpor);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoTerminosImpor() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
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
			//this.jInternalFrameDetalleTipoTerminosImpor = new TipoTerminosImporDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Terminos DATOS");
			this.jInternalFrameDetalleFormTipoTerminosImpor = new TipoTerminosImporDetalleFormJInternalFrame(jDesktopPane,this.tipoterminosimporSessionBean.getConGuardarRelaciones(),this.tipoterminosimporSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoTerminosImpor = null;//new TipoTerminosImporDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoTerminosImpor= new GridBagLayout();
		
		
		this.jTableDatosTipoTerminosImpor = new JTableMe();      
		
		String sToolTipTipoTerminosImpor="";
		sToolTipTipoTerminosImpor=TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoTerminosImpor+="(Importaciones.TipoTerminosImpor)";
		}
		
		if(!this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoTerminosImpor+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoTerminosImpor.setToolTipText(sToolTipTipoTerminosImpor);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoTerminosImpor);
		this.jTableDatosTipoTerminosImpor.setAutoCreateRowSorter(true);
		this.jTableDatosTipoTerminosImpor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoTerminosImpor.setRowSelectionAllowed(true);
		this.jTableDatosTipoTerminosImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoTerminosImpor,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoTerminosImpor = new JButtonMe();
		this.jButtonDuplicarTipoTerminosImpor = new JButtonMe();
		this.jButtonCopiarTipoTerminosImpor = new JButtonMe();
		this.jButtonVerFormTipoTerminosImpor = new JButtonMe();
		this.jButtonNuevoRelacionesTipoTerminosImpor = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoTerminosImpor = new JButtonMe();
		this.jButtonCerrarTipoTerminosImpor = new JButtonMe();
		
		this.jScrollPanelDatosTipoTerminosImpor = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoTerminosImpor = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoTerminosImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Terminos";
		
		if(!this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoTerminosImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Terminoss" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoTerminosImpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoTerminosImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoTerminosImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoTerminosImpor.setToolTipText("Acciones");
        this.jPanelAccionesTipoTerminosImpor.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoTerminosImpor=new ReporteDinamicoJInternalFrame(TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoTerminosImpor();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoTerminosImpor=new ImportacionJInternalFrame(TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoTerminosImpor();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoTerminosImpor = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoTerminosImpor.setText("Orden");
		this.jButtonAbrirOrderByTipoTerminosImpor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoTerminosImpor,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoTerminosImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoTerminosImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoTerminosImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoTerminosImpor,false,this);
			
			//this.cargarOrderByTipoTerminosImpor(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoTerminosImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoTerminosImpor,true,this);
			
			//this.cargarOrderByTipoTerminosImpor(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoTerminosImpor.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoTerminosImpor.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoTerminosImpor.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoTerminosImpor.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoTerminosImpor.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoTerminosImpor.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoTerminosImpor.setText("Nuevo");
		this.jButtonDuplicarTipoTerminosImpor.setText("Duplicar");
		this.jButtonCopiarTipoTerminosImpor.setText("Copiar");
		this.jButtonVerFormTipoTerminosImpor.setText("Ver");
		this.jButtonNuevoRelacionesTipoTerminosImpor.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoTerminosImpor.setText("Guardar");
		this.jButtonCerrarTipoTerminosImpor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoTerminosImpor,"nuevo_button","Nuevo",this.tipoterminosimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoTerminosImpor,"duplicar_button","Duplicar",this.tipoterminosimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoTerminosImpor,"copiar_button","Copiar",this.tipoterminosimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoTerminosImpor,"ver_form","Ver",this.tipoterminosimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoTerminosImpor,"nuevorelaciones_button","Nuevo Rel",this.tipoterminosimporSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoTerminosImpor,"guardarcambiostabla_button","Guardar",this.tipoterminosimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoTerminosImpor,"cerrar_button","Salir",this.tipoterminosimporSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoTerminosImpor.setToolTipText("Nuevo"+" "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoTerminosImpor.setToolTipText("Duplicar"+" "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoTerminosImpor.setToolTipText("Copiar"+" "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoTerminosImpor.setToolTipText("Ver"+" "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoTerminosImpor.setToolTipText("Nuevo Rel"+" "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoTerminosImpor.setToolTipText("Guardar"+" "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoTerminosImpor.setToolTipText("Salir"+" "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoTerminosImpor";
		inputMap = this.jButtonNuevoTipoTerminosImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoTerminosImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoTerminosImpor"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoTerminosImpor";
		inputMap = this.jButtonDuplicarTipoTerminosImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoTerminosImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoTerminosImpor"));
		
		//COPIAR
		sMapKey = "CopiarTipoTerminosImpor";
		inputMap = this.jButtonCopiarTipoTerminosImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoTerminosImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoTerminosImpor"));
		
		//VEr FORM
		sMapKey = "VerFormTipoTerminosImpor";
		inputMap = this.jButtonVerFormTipoTerminosImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoTerminosImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoTerminosImpor"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoTerminosImpor";
		inputMap = this.jButtonNuevoRelacionesTipoTerminosImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoTerminosImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoTerminosImpor"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoTerminosImpor";
		inputMap = this.jButtonModificarTipoTerminosImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoTerminosImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoTerminosImpor"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoTerminosImpor";
		inputMap = this.jButtonCerrarTipoTerminosImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoTerminosImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoTerminosImpor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoTerminosImpor";
		inputMap = this.jButtonGuardarCambiosTablaTipoTerminosImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoTerminosImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoTerminosImpor"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoTerminosImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoTerminosImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoTerminosImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoTerminosImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoTerminosImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoTerminosImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoTerminosImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoTerminosImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoTerminosImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoTerminosImpor.setName("jPanelParametrosReportesTipoTerminosImpor"); 
		
		this.jPanelParametrosReportesAccionesTipoTerminosImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoTerminosImpor.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoTerminosImpor.setName("jPanelParametrosReportesAccionesTipoTerminosImpor"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoTerminosImpor = new JButtonMe();
		this.jButtonRecargarInformacionTipoTerminosImpor.setText("Recargar");
		this.jButtonRecargarInformacionTipoTerminosImpor.setToolTipText("Recargar"+" "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoTerminosImpor,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoTerminosImpor = new JButtonMe();
		this.jButtonProcesarInformacionTipoTerminosImpor.setText("Procesar");
		this.jButtonProcesarInformacionTipoTerminosImpor.setToolTipText("Procesar"+" "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoTerminosImpor.setVisible(false);
			
		this.jButtonProcesarInformacionTipoTerminosImpor.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoTerminosImpor.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoTerminosImpor.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoTerminosImpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoTerminosImpor.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoTerminosImpor.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoTerminosImpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoTerminosImpor.setText("TIPO");       
		this.jComboBoxTiposReportesTipoTerminosImpor.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoTerminosImpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoTerminosImpor.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoTerminosImpor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoTerminosImpor = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoTerminosImpor.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoTerminosImpor.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoTerminosImpor = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoTerminosImpor.setText("Accion");
		this.jComboBoxTiposRelacionesTipoTerminosImpor.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoTerminosImpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoTerminosImpor.setText("Accion");
		this.jComboBoxTiposAccionesTipoTerminosImpor.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoTerminosImpor = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoTerminosImpor.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoTerminosImpor.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoTerminosImpor=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoTerminosImpor.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoTerminosImpor.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoTerminosImpor.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoTerminosImpor = new JLabelMe();
		
		this.jLabelAccionesTipoTerminosImpor.setText("Acciones");		
		this.jLabelAccionesTipoTerminosImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoTerminosImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoTerminosImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoTerminosImpor = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoTerminosImpor.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoTerminosImpor.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoTerminosImpor = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoTerminosImpor.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoTerminosImpor.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoTerminosImpor = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoTerminosImpor.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoTerminosImpor.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoTerminosImpor = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoTerminosImpor.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoTerminosImpor.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoTerminosImpor = new JButtonMe();
		//this.jButtonAnterioresTipoTerminosImpor.setText("<<");
        this.jButtonAnterioresTipoTerminosImpor.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoTerminosImpor,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoTerminosImpor = new JButtonMe();
		//this.jButtonSiguientesTipoTerminosImpor.setText(">>");
        this.jButtonSiguientesTipoTerminosImpor.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoTerminosImpor,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoTerminosImpor = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoTerminosImpor.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoTerminosImpor.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoTerminosImpor,"nuevoguardarcambios_button","Nue",this.tipoterminosimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoTerminosImpor";
		inputMap = this.jButtonNuevoGuardarCambiosTipoTerminosImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoTerminosImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoTerminosImpor"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoTerminosImpor";
		inputMap = this.jButtonRecargarInformacionTipoTerminosImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoTerminosImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoTerminosImpor"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoTerminosImpor";
		inputMap = this.jButtonSiguientesTipoTerminosImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoTerminosImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoTerminosImpor"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoTerminosImpor";
		inputMap = this.jButtonAnterioresTipoTerminosImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoTerminosImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoTerminosImpor"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoTerminosImpor();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoTerminosImpor.setMinimumSize(new Dimension(this.getWidth(),TipoTerminosImporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoTerminosImporBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoTerminosImpor.setMaximumSize(new Dimension(this.getWidth(),TipoTerminosImporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoTerminosImporBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoTerminosImpor.setPreferredSize(new Dimension(this.getWidth(),TipoTerminosImporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoTerminosImporBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoTerminosImpor = new GridBagLayout();

			this.jPanelPaginacionTipoTerminosImpor.setLayout(gridaBagLayoutPaginacionTipoTerminosImpor);						
			
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoTerminosImpor.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTerminosImpor.gridy = 0;
			this.gridBagConstraintsTipoTerminosImpor.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoTerminosImpor.add(this.jButtonAnterioresTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
					
						
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoTerminosImpor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoTerminosImpor.gridy = 0;
			
			this.jPanelPaginacionTipoTerminosImpor.add(this.jButtonNuevoGuardarCambiosTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
						
			
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoTerminosImpor.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoTerminosImpor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoTerminosImpor.gridy = 0;
			this.jPanelPaginacionTipoTerminosImpor.add(this.jButtonSiguientesTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTerminosImpor.gridy = 1;
			this.gridBagConstraintsTipoTerminosImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoTerminosImpor.add(this.jButtonNuevoTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
						
			
			
			if(!this.tipoterminosimporSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
				this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoTerminosImpor.gridy = 1;
				this.gridBagConstraintsTipoTerminosImpor.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoTerminosImpor.add(this.jButtonGuardarCambiosTablaTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
			}
			
			
			
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTerminosImpor.gridy = 1;
			this.gridBagConstraintsTipoTerminosImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoTerminosImpor.add(this.jButtonDuplicarTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
			
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTerminosImpor.gridy = 1;
			this.gridBagConstraintsTipoTerminosImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoTerminosImpor.add(this.jButtonCopiarTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
		
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTerminosImpor.gridy = 1;
			this.gridBagConstraintsTipoTerminosImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoTerminosImpor.add(this.jButtonVerFormTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
		
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTerminosImpor.gridy = 1;
			this.gridBagConstraintsTipoTerminosImpor.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoTerminosImpor.add(this.jButtonCerrarTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
		
		
		
		this.jButtonRecargarInformacionTipoTerminosImpor.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoTerminosImpor.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoTerminosImpor.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoTerminosImpor.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoTerminosImpor.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoTerminosImpor.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoTerminosImpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoTerminosImpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoTerminosImpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoTerminosImpor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoTerminosImpor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoTerminosImpor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoTerminosImpor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoTerminosImpor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoTerminosImpor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoTerminosImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoTerminosImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoTerminosImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoTerminosImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoTerminosImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoTerminosImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoTerminosImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoTerminosImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoTerminosImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoTerminosImpor.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoTerminosImpor.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoTerminosImpor.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoTerminosImpor.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoTerminosImpor.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoTerminosImpor.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoTerminosImpor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoTerminosImpor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoTerminosImpor.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoTerminosImpor.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoTerminosImpor.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoTerminosImpor.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoTerminosImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoTerminosImpor = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoTerminosImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoTerminosImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoTerminosImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoTerminosImpor = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoTerminosImpor.setLayout(gridaBagParametrosReportesTipoTerminosImpor);
			this.jPanelParametrosReportesAccionesTipoTerminosImpor.setLayout(gridaBagParametrosReportesAccionesTipoTerminosImpor);
			
			
			this.jPanelParametrosAuxiliar1TipoTerminosImpor.setLayout(gridaBagParametrosAuxiliar1TipoTerminosImpor);
			this.jPanelParametrosAuxiliar2TipoTerminosImpor.setLayout(gridaBagParametrosAuxiliar2TipoTerminosImpor);
			this.jPanelParametrosAuxiliar3TipoTerminosImpor.setLayout(gridaBagParametrosAuxiliar3TipoTerminosImpor);
			this.jPanelParametrosAuxiliar4TipoTerminosImpor.setLayout(gridaBagParametrosAuxiliar4TipoTerminosImpor);
			//this.jPanelParametrosAuxiliar5TipoTerminosImpor.setLayout(gridaBagParametrosAuxiliar2TipoTerminosImpor);			
			
			
			
			
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTerminosImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoTerminosImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoTerminosImpor.add(this.jButtonRecargarInformacionTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoTerminosImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTerminosImpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTerminosImpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoTerminosImpor.add(this.jComboBoxTiposPaginacionTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoTerminosImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTerminosImpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTerminosImpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoTerminosImpor.add(this.jCheckBoxConAltoMaximoTablaTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoTerminosImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTerminosImpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTerminosImpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoTerminosImpor.add(this.jComboBoxTiposArchivosReportesTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoTerminosImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTerminosImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTerminosImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTerminosImpor.add(this.jPanelParametrosAuxiliar1TipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoTerminosImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTerminosImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoTerminosImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoTerminosImpor.add(this.jComboBoxTiposReportesTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoTerminosImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTerminosImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTerminosImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTerminosImpor.add(this.jPanelParametrosAuxiliar4TipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoTerminosImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTerminosImpor.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTerminosImpor.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTerminosImpor.add(this.jComboBoxTiposReportesTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoTerminosImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTerminosImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTerminosImpor.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoTerminosImpor.add(this.jCheckBoxGenerarReporteTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoTerminosImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTerminosImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTerminosImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTerminosImpor.add(this.jPanelParametrosAuxiliar2TipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTerminosImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoTerminosImpor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoTerminosImpor.add(this.jLabelAccionesTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
				this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoTerminosImpor.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoTerminosImpor.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoTerminosImpor.add(this.jButtonAbrirOrderByTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoTerminosImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTerminosImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoTerminosImpor.add(this.jComboBoxTiposSeleccionarTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);			
			
			
			/*
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTerminosImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoTerminosImpor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoTerminosImpor.add(this.jCheckBoxSeleccionarTodosTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoTerminosImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTerminosImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoTerminosImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoTerminosImpor.add(this.jCheckBoxSeleccionarTodosTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);															
				
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoTerminosImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTerminosImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoTerminosImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoTerminosImpor.add(this.jCheckBoxSeleccionadosTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoTerminosImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTerminosImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTerminosImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTerminosImpor.add(this.jPanelParametrosAuxiliar3TipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoTerminosImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTerminosImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoTerminosImpor.add(this.jComboBoxTiposRelacionesTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
				
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoTerminosImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTerminosImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoTerminosImpor.add(this.jComboBoxTiposAccionesTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoTerminosImpor = new GridBagLayout();

			this.jScrollPanelDatosTipoTerminosImpor.setLayout(gridaBagLayoutDatosTipoTerminosImpor);
			
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTerminosImpor.gridy = 0;
			this.gridBagConstraintsTipoTerminosImpor.gridx = 0;
			
			this.jScrollPanelDatosTipoTerminosImpor.add(this.jTableDatosTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoTerminosImpor.setViewportView(this.jTableDatosTipoTerminosImpor);
		this.jTableDatosTipoTerminosImpor.setFillsViewportHeight(true);
		this.jTableDatosTipoTerminosImpor.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoTerminosImpor= new GridBagLayout();
		this.jPanelAccionesTipoTerminosImpor.setLayout(gridaBagLayoutAccionesTipoTerminosImpor);
		
		
		/*	
		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTerminosImpor.gridy = 0;
		this.gridBagConstraintsTipoTerminosImpor.gridx = 0;
			
		this.jPanelAccionesTipoTerminosImpor.add(this.jButtonNuevoTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoTerminosImpor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoTerminosImpor);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();						
			this.gridBagConstraintsTipoTerminosImpor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoTerminosImpor.gridx = 0;		
			//this.gridBagConstraintsTipoTerminosImpor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTerminosImpor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoTerminosImpor.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoTerminosImpor.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoTerminosImpor.gridx = 0;		
		//this.gridBagConstraintsTipoTerminosImpor.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTerminosImpor.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoTerminosImpor.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoTerminosImpor);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoTerminosImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTerminosImpor.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);								
		
		
		/*
		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoTerminosImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTerminosImpor.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
		*/		
		
		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoTerminosImpor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoTerminosImpor.gridx =0;
		this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoTerminosImpor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
				
		
		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoTerminosImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTerminosImpor.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoTerminosImporJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoTerminosImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoTerminosImpor = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoTerminosImpor.setLayout(gridaBagLayoutBusquedasParametrosTipoTerminosImpor);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoTerminosImpor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoTerminosImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoTerminosImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoTerminosImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=false;
			
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
		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoTerminosImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTerminosImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
			
			
		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoTerminosImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTerminosImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
		
			
		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoTerminosImpor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoTerminosImpor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoTerminosImpor;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoTerminosImpor() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoTerminosImpor = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoTerminosImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoTerminosImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoTerminosImpor.setName("jPanelReporteDinamicoTipoTerminosImpor"); 
		
		this.jPanelReporteDinamicoTipoTerminosImpor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoTerminosImpor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoTerminosImpor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoTerminosImpor.setLayout(gridaBagLayoutReporteDinamicoTipoTerminosImpor);
		
		
		this.jInternalFrameReporteDinamicoTipoTerminosImpor= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoTerminosImpor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoTerminosImpor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoTerminosImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoTerminosImpor.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoTerminosImpor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoTerminosImpor.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoTerminosImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoTerminosImpor.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoTerminosImpor.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoTerminosImpor.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoTerminosImpor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoTerminosImpor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoTerminosImpor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoTerminosImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Terminoss"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoTerminosImpor = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoTerminosImpor.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoTerminosImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoTerminosImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoTerminosImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTerminosImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTerminosImpor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoTerminosImpor.add(this.jLabelColumnasSelectReporteTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoTerminosImpor = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoTerminosImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoTerminosImpor.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoTerminosImpor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoTerminosImpor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoTerminosImpor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoTerminosImpor=new JScrollPane(this.jListColumnasSelectReporteTipoTerminosImpor);
			
			this.jScrollColumnasSelectReporteTipoTerminosImpor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoTerminosImpor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoTerminosImpor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoTerminosImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTerminosImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTerminosImpor.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoTerminosImpor.add(this.jListColumnasSelectReporteTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
		this.jPanelReporteDinamicoTipoTerminosImpor.add(this.jScrollColumnasSelectReporteTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoTerminosImpor = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoTerminosImpor.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoTerminosImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoTerminosImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoTerminosImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoTerminosImpor = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoTerminosImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoTerminosImpor.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoTerminosImpor.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoTerminosImpor.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoTerminosImpor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoTerminosImpor=new JScrollPane(this.jListRelacionesSelectReporteTipoTerminosImpor);
			
			this.jScrollRelacionesSelectReporteTipoTerminosImpor.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoTerminosImpor.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoTerminosImpor.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoTerminosImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoTerminosImpor = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoTerminosImpor = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoTerminosImpor = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoTerminosImpor = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoTerminosImpor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoTerminosImpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoTerminosImpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoTerminosImpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoTerminosImpor = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoTerminosImpor.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoTerminosImpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoTerminosImpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoTerminosImpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoTerminosImpor = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoTerminosImpor.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoTerminosImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoTerminosImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoTerminosImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTerminosImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTerminosImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoTerminosImpor.add(this.jLabelGenerarExcelReporteDinamicoTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoTerminosImpor = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoTerminosImpor.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoTerminosImpor,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoTerminosImpor.setToolTipText("Generar EXCEL"+" "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		//this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoTerminosImpor.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoTerminosImpor.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoTerminosImpor.add(this.jButtonGenerarExcelReporteDinamicoTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTerminosImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoTerminosImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoTerminosImpor.add(this.jComboBoxTiposReportesDinamicoTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoTerminosImpor = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoTerminosImpor.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoTerminosImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoTerminosImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoTerminosImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTerminosImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTerminosImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoTerminosImpor.add(this.jLabelTiposArchivoReporteDinamicoTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTerminosImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoTerminosImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoTerminosImpor.add(this.jComboBoxTiposArchivosReportesDinamicoTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoTerminosImpor = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoTerminosImpor.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoTerminosImpor,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoTerminosImpor.setToolTipText("Generar"+" "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTerminosImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoTerminosImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoTerminosImpor.add(this.jButtonGenerarReporteDinamicoTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoTerminosImpor = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoTerminosImpor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoTerminosImpor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoTerminosImpor.setToolTipText("Cancelar"+" "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTerminosImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoTerminosImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoTerminosImpor.add(this.jButtonCerrarReporteDinamicoTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoTerminosImpor = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoTerminosImpor= new JScrollPane(jPanelReporteDinamicoTipoTerminosImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoTerminosImpor.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoTerminosImpor.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoTerminosImpor.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoTerminosImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Terminoss"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoTerminosImpor.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoTerminosImpor.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoTerminosImpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoTerminosImpor.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoTerminosImpor);
		this.jInternalFrameReporteDinamicoTipoTerminosImpor.getContentPane().add(this.jScrollPanelReporteDinamicoTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoTerminosImpor() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoTerminosImpor = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoTerminosImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoTerminosImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoTerminosImpor.setName("jPanelImportacionTipoTerminosImpor"); 
		
		this.jPanelImportacionTipoTerminosImpor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoTerminosImpor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoTerminosImpor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoTerminosImpor.setLayout(gridaBagLayoutImportacionTipoTerminosImpor);
		
		
		this.jInternalFrameImportacionTipoTerminosImpor= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoTerminosImpor= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoTerminosImpor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoTerminosImpor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoTerminosImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoTerminosImpor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoTerminosImpor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoTerminosImpor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoTerminosImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoTerminosImpor.setResizable(true);
	    this.jInternalFrameImportacionTipoTerminosImpor.setClosable(true);
	    this.jInternalFrameImportacionTipoTerminosImpor.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoTerminosImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoTerminosImpor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoTerminosImpor.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoTerminosImpor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoTerminosImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoTerminosImpor.setResizable(true);
	    this.jInternalFrameImportacionTipoTerminosImpor.setClosable(true);
	    this.jInternalFrameImportacionTipoTerminosImpor.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoTerminosImpor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoTerminosImpor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoTerminosImpor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoTerminosImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Terminoss"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoTerminosImpor = new JLabelMe();

		this.jLabelArchivoImportacionTipoTerminosImpor.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoTerminosImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoTerminosImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoTerminosImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTerminosImpor.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoTerminosImpor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoTerminosImpor.add(this.jLabelArchivoImportacionTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoTerminosImpor = new JFileChooser();		
		this.jFileChooserImportacionTipoTerminosImpor.setToolTipText("ESCOGER ARCHIVO"+" "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoTerminosImpor = new JButtonMe();
		this.jButtonAbrirImportacionTipoTerminosImpor.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoTerminosImpor,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoTerminosImpor.setToolTipText("Generar"+" "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTerminosImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoTerminosImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoTerminosImpor.add(this.jButtonAbrirImportacionTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoTerminosImpor = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoTerminosImpor.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoTerminosImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoTerminosImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoTerminosImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTerminosImpor.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoTerminosImpor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoTerminosImpor.add(this.jLabelPathArchivoImportacionTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoTerminosImpor=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoTerminosImpor.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoTerminosImpor.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoTerminosImpor.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTerminosImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoTerminosImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoTerminosImpor.add(this.jTextFieldPathArchivoImportacionTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoTerminosImpor = new JButtonMe();
		this.jButtonGenerarImportacionTipoTerminosImpor.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoTerminosImpor,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoTerminosImpor.setToolTipText("Generar"+" "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTerminosImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoTerminosImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoTerminosImpor.add(this.jButtonGenerarImportacionTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoTerminosImpor = new JButtonMe();
		this.jButtonCerrarImportacionTipoTerminosImpor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoTerminosImpor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoTerminosImpor.setToolTipText("Cancelar"+" "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTerminosImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoTerminosImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoTerminosImpor.add(this.jButtonCerrarImportacionTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoTerminosImpor = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoTerminosImpor= new JScrollPane(jPanelImportacionTipoTerminosImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoTerminosImpor.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoTerminosImpor.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoTerminosImpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoTerminosImpor.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoTerminosImpor);
		this.jInternalFrameImportacionTipoTerminosImpor.getContentPane().add(this.jScrollPanelImportacionTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoTerminosImpor(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoTerminosImpor = new JButtonMe();
			this.jButtonAbrirOrderByTipoTerminosImpor.setText("Orden");
			this.jButtonAbrirOrderByTipoTerminosImpor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoTerminosImpor,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoTerminosImpor";
			inputMap = this.jButtonAbrirOrderByTipoTerminosImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoTerminosImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoTerminosImpor"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoTerminosImpor = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoTerminosImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoTerminosImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoTerminosImpor.setName("jPanelOrderByTipoTerminosImpor"); 
			
			this.jPanelOrderByTipoTerminosImpor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoTerminosImpor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoTerminosImpor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoTerminosImpor.setLayout(gridaBagLayoutOrderByTipoTerminosImpor);
			
			
			this.jTableDatosTipoTerminosImporOrderBy = new JTableMe();        
			this.jTableDatosTipoTerminosImporOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoTerminosImporOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoTerminosImporOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoTerminosImporOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoTerminosImporOrderBy.setViewportView(this.jTableDatosTipoTerminosImporOrderBy);
			this.jTableDatosTipoTerminosImporOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoTerminosImporOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoTerminosImpor= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoTerminosImpor= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoTerminosImpor = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoTerminosImpor= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoTerminosImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoTerminosImpor.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoTerminosImpor.setTitle("Orden");
			this.jInternalFrameOrderByTipoTerminosImpor.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoTerminosImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoTerminosImpor.setResizable(true);
			this.jInternalFrameOrderByTipoTerminosImpor.setClosable(true);
			this.jInternalFrameOrderByTipoTerminosImpor.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoTerminosImpor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoTerminosImpor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoTerminosImpor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoTerminosImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Terminoss"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoTerminosImpor.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoTerminosImpor.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoTerminosImpor.ipady =150;
				
			this.jPanelOrderByTipoTerminosImpor.add(jScrollPanelDatosTipoTerminosImporOrderBy, this.gridBagConstraintsTipoTerminosImpor);//this.jTableDatosTipoTerminosImporTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoTerminosImpor = new JButtonMe();
			this.jButtonCerrarOrderByTipoTerminosImpor.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoTerminosImpor,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoTerminosImpor.setToolTipText("Cancelar"+" "+TipoTerminosImporConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoTerminosImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTerminosImpor.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoTerminosImpor.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoTerminosImpor.add(this.jButtonCerrarOrderByTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoTerminosImpor = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoTerminosImpor= new JScrollPane(jPanelOrderByTipoTerminosImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoTerminosImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoTerminosImpor.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoTerminosImpor.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoTerminosImpor.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoTerminosImpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoTerminosImpor.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoTerminosImpor);
			
			this.jInternalFrameOrderByTipoTerminosImpor.getContentPane().add(this.jScrollPanelOrderByTipoTerminosImpor, this.gridBagConstraintsTipoTerminosImpor);			
		
		} else {
			this.jButtonAbrirOrderByTipoTerminosImpor = new JButtonMe();
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
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipoterminosimporSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoTerminosImpor.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoTerminosImpor.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoTerminosImpor.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoTerminosImpor.getRowHeight();//TipoTerminosImporConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoTerminosImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoTerminosImpor.isSelected()) {
					iHeightTable=TipoTerminosImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoTerminosImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoTerminosImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoTerminosImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoTerminosImpor.isSelected()) {
					iHeightTable=TipoTerminosImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoTerminosImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoTerminosImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoTerminosImpor.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoTerminosImpor.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoTerminosImpor.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoTerminosImpor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoTerminosImpor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoTerminosImpor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoTerminosImpor!=null && this.jInternalFrameOrderByTipoTerminosImpor.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoterminosimporSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoTerminosImpor.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoTerminosImpor.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoTerminosImpor.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoTerminosImpor.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoTerminosImpor.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoTerminosImpor.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoTerminosImpor.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoTerminosImpor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoTerminosImpor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoTerminosImpor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoterminosimporLogic.getTipoTerminosImpors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoterminosimpors.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoTerminosImpor> TraerTipoTerminosImporBeans(List<TipoTerminosImpor> tipoterminosimpors,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoTerminosImpor tipoterminosimpor:tipoterminosimpors) {
					
				if(!(TipoTerminosImporConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoTerminosImporConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoterminosimpor.setsDetalleGeneralEntityReporte(TipoTerminosImporConstantesFunciones.getTipoTerminosImporDescripcion(tipoterminosimpor));
										
						
					
						
					
				} else  {
							
					//tipoterminosimpor.setsDetalleGeneralEntityReporte(tipoterminosimpor.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoterminosimporbeans.add(tipoterminosimporbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoterminosimpors;
    }
	//PARA REPORTES FIN
}
