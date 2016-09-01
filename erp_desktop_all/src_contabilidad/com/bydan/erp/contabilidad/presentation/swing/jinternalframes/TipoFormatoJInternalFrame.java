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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;

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
import com.bydan.erp.contabilidad.util.TipoFormatoConstantesFunciones;

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
public class TipoFormatoJInternalFrame extends TipoFormatoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoFormato;
	
	protected JMenuBar jmenuBarTipoFormato;
	
	protected JMenu jmenuTipoFormato;
	protected JMenu jmenuDatosTipoFormato;
	protected JMenu jmenuArchivoTipoFormato;
	protected JMenu jmenuAccionesTipoFormato;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoFormato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoFormato;	
	protected GridBagConstraints gridBagConstraintsTipoFormato;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoFormatoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoFormato;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoFormato;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoFormato;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoFormatoSessionBean tipoformatoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoFormato> tipoformatos;		
	public List<TipoFormato> tipoformatosEliminados;	
	public List<TipoFormato> tipoformatosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoFormato;		
	protected JButton jButtonAbrirOrderByTipoFormato;
	
	
	//protected JPanel jPanelOrderByTipoFormato;
	//public JScrollPane jScrollPanelOrderByTipoFormato;	
	//protected JButton jButtonCerrarOrderByTipoFormato;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoFormatoLogic tipoformatoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoFormato;
	public JScrollPane jScrollPanelDatosEdicionTipoFormato;
	public JScrollPane jScrollPanelDatosGeneralTipoFormato;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoFormatoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoFormato;
	//public JScrollPane jScrollPanelImportacionTipoFormato;
	
	
	
	protected JPanel jPanelAccionesTipoFormato;
	
    protected JPanel jPanelPaginacionTipoFormato;
    protected JPanel jPanelParametrosReportesTipoFormato;
	protected JPanel jPanelParametrosReportesAccionesTipoFormato;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoFormato;
	protected JPanel jPanelParametrosAuxiliar2TipoFormato;
	protected JPanel jPanelParametrosAuxiliar3TipoFormato;
	protected JPanel jPanelParametrosAuxiliar4TipoFormato;
	//protected JPanel jPanelParametrosAuxiliar5TipoFormato;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoFormato;
	//protected JPanel jPanelImportacionTipoFormato;
	
	
	public JTable jTableDatosTipoFormato;
	
	
	
	//public JTable jTableDatosTipoFormatoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoFormato;
	protected JButton jButtonDuplicarTipoFormato;
	protected JButton jButtonCopiarTipoFormato;
	protected JButton jButtonVerFormTipoFormato;
	protected JButton jButtonNuevoRelacionesTipoFormato;
	protected JButton jButtonModificarTipoFormato;
	
    protected JButton jButtonGuardarCambiosTablaTipoFormato;
	protected JButton jButtonCerrarTipoFormato;
	
	
	protected JButton jButtonRecargarInformacionTipoFormato;
	protected JButton jButtonProcesarInformacionTipoFormato;
	
	
	protected JButton jButtonAnterioresTipoFormato;
	protected JButton jButtonSiguientesTipoFormato;
	protected JButton jButtonNuevoGuardarCambiosTipoFormato;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoFormato;
	//protected JButton jButtonCerrarReporteDinamicoTipoFormato;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoFormato;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoFormato;
	//protected JButton jButtonGenerarImportacionTipoFormato;
	//protected JButton jButtonCerrarImportacionTipoFormato;
	//protected JFileChooser jFileChooserImportacionTipoFormato;
	//protected File fileImportacionTipoFormato;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoFormato;
	protected JButton jButtonDuplicarToolBarTipoFormato;
	protected JButton jButtonNuevoRelacionesToolBarTipoFormato;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoFormato;
	protected JButton jButtonCopiarToolBarTipoFormato;
	protected JButton jButtonVerFormToolBarTipoFormato;
	public JButton jButtonGuardarCambiosTablaToolBarTipoFormato;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoFormato;
	protected JButton jButtonCerrarToolBarTipoFormato;
	
	protected JButton jButtonRecargarInformacionToolBarTipoFormato;
	protected JButton jButtonProcesarInformacionToolBarTipoFormato;
	protected JButton jButtonAnterioresToolBarTipoFormato;
	protected JButton jButtonSiguientesToolBarTipoFormato;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoFormato;
	protected JButton jButtonAbrirOrderByToolBarTipoFormato;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoFormato;
	protected JMenuItem jMenuItemDuplicarTipoFormato;
	protected JMenuItem jMenuItemNuevoRelacionesTipoFormato;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoFormato;
	protected JMenuItem jMenuItemCopiarTipoFormato;
	protected JMenuItem jMenuItemVerFormTipoFormato;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoFormato;
	protected JMenuItem jMenuItemCerrarTipoFormato;
	protected JMenuItem jMenuItemDetalleCerrarTipoFormato;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoFormato;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoFormato;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoFormato;
	protected JMenuItem jMenuItemProcesarInformacionTipoFormato;
	protected JMenuItem jMenuItemAnterioresTipoFormato;
	protected JMenuItem jMenuItemSiguientesTipoFormato;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoFormato;
	protected JMenuItem jMenuItemAbrirOrderByTipoFormato;
	protected JMenuItem jMenuItemMostrarOcultarTipoFormato;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoFormato;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoFormato;
	protected JCheckBox jCheckBoxSeleccionadosTipoFormato;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoFormato;
	protected JCheckBox jCheckBoxConGraficoReporteTipoFormato;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoFormato;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoFormato;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoFormato;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoFormato;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoFormato;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoFormato;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoFormato;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoFormato;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoFormato;
	protected JTextField jTextFieldValorCampoGeneralTipoFormato;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoFormato;
	//public JList<Reporte> jListColumnasSelectReporteTipoFormato;
	//public JScrollPane jScrollColumnasSelectReporteTipoFormato;
	
	//public JLabel jLabelRelacionesSelectReporteTipoFormato;
	//public JList<Reporte> jListRelacionesSelectReporteTipoFormato;
	//public JScrollPane jScrollRelacionesSelectReporteTipoFormato;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoFormato;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoFormato;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoFormato;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoFormato;
	
		
	//public JLabel jLabelArchivoImportacionTipoFormato;	
	//public JLabel jLabelPathArchivoImportacionTipoFormato;
	//protected JTextField jTextFieldPathArchivoImportacionTipoFormato;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoFormato;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoFormato;
	
	//public JLabel jLabelColumnaCategoriaValorTipoFormato;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoFormato;
	
	//public JLabel jLabelColumnasValoresGraficoTipoFormato;
	//public JList<Reporte> jListColumnasValoresGraficoTipoFormato;
	//public JScrollPane jScrollColumnasValoresGraficoTipoFormato;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoFormato;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoFormato;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoFormato;
	public JPanel jPanelBusquedaPorIdTipoFormato;
	public JButton jButtonBusquedaPorIdTipoFormato;
	public JPanel jPanelBusquedaPorNombreTipoFormato;
	public JButton jButtonBusquedaPorNombreTipoFormato;
	
	public JPanel jPanelIdIdBusquedaPorIdTipoFormato;
	public JLabel jLabelidBusquedaPorIdTipoFormato;
	public JTextFieldMe jLabelidTipoFormatoBusquedaPorId;
	public JButton jButtonidBusquedaPorIdTipoFormatoBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTipoFormato;
	public JLabel jLabelnombreBusquedaPorNombreTipoFormato;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoFormato;
	public JButton jButtonnombreBusquedaPorNombreTipoFormatoBusqueda= new JButtonMe();

	
	
	
	
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
	public TipoFormatoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoFormato No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFormatoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFormato No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFormatoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFormato No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFormatoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoFormato No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoFormato)	{
		this.jButtonRecargarInformacionTipoFormato = jButtonRecargarInformacionTipoFormato;
	}
	
	public JButton getjButtonProcesarInformacionTipoFormato() {
		return this.jButtonProcesarInformacionTipoFormato;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoFormato)	{
		this.jButtonProcesarInformacionTipoFormato = jButtonProcesarInformacionTipoFormato;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoFormato() {
		return this.jButtonRecargarInformacionTipoFormato;
	}
	
	
	public List<TipoFormato> gettipoformatos() {
		return this.tipoformatos;
	}

	public void settipoformatos(List<TipoFormato> tipoformatos) {
		this.tipoformatos = tipoformatos;
	}
	
	public List<TipoFormato> gettipoformatosAux() {
		return this.tipoformatosAux;
	}

	public void settipoformatosAux(List<TipoFormato> tipoformatosAux) {
		this.tipoformatosAux = tipoformatosAux;
	}
	
	public List<TipoFormato> gettipoformatosEliminados() {
		return this.tipoformatosEliminados;
	}

	public void setTipoFormatosEliminados(List<TipoFormato> tipoformatosEliminados) {
		this.tipoformatosEliminados = tipoformatosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoFormato() {
		return jComboBoxTiposSeleccionarTipoFormato;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoFormato(
			JComboBox jComboBoxTiposSeleccionarTipoFormato) {
		this.jComboBoxTiposSeleccionarTipoFormato = jComboBoxTiposSeleccionarTipoFormato;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoFormato() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoFormato.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoFormato .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoFormato() {
		return jTextFieldValorCampoGeneralTipoFormato;
	}

	public void setjTextFieldValorCampoGeneralTipoFormato(
			JTextField jTextFieldValorCampoGeneralTipoFormato) {
		this.jTextFieldValorCampoGeneralTipoFormato = jTextFieldValorCampoGeneralTipoFormato;
	}

	public void setBorderResaltarValorCampoGeneralTipoFormato() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFormato.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoFormato .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoFormato() {
		return this.jCheckBoxSeleccionarTodosTipoFormato;
	}

	public void setjCheckBoxSeleccionarTodosTipoFormato(
			JCheckBox jCheckBoxSeleccionarTodosTipoFormato) {
		this.jCheckBoxSeleccionarTodosTipoFormato = jCheckBoxSeleccionarTodosTipoFormato;
	}

	public void setBorderResaltarSeleccionarTodosTipoFormato() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFormato.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoFormato .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoFormato() {
		return this.jCheckBoxSeleccionadosTipoFormato;
	}

	public void setjCheckBoxSeleccionadosTipoFormato(
			JCheckBox jCheckBoxSeleccionadosTipoFormato) {
		this.jCheckBoxSeleccionadosTipoFormato = jCheckBoxSeleccionadosTipoFormato;
	}
	
	public void setBorderResaltarSeleccionadosTipoFormato() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFormato.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoFormato .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoFormato() {
		return this.jComboBoxTiposArchivosReportesTipoFormato;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoFormato(
			JComboBox jComboBoxTiposArchivosReportesTipoFormato) {
		this.jComboBoxTiposArchivosReportesTipoFormato = jComboBoxTiposArchivosReportesTipoFormato;
	}

	public void setBorderResaltarTiposArchivosReportesTipoFormato() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFormato.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoFormato .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoFormato() {
		return this.jComboBoxTiposReportesTipoFormato;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoFormato(
			JComboBox jComboBoxTiposReportesTipoFormato) {
		this.jComboBoxTiposReportesTipoFormato = jComboBoxTiposReportesTipoFormato;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoFormato() {
	//	return jComboBoxTiposReportesDinamicoTipoFormato;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoFormato(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoFormato) {
	//	this.jComboBoxTiposReportesDinamicoTipoFormato = jComboBoxTiposReportesDinamicoTipoFormato;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoFormato() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoFormato;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoFormato(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoFormato) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoFormato = jComboBoxTiposArchivosReportesDinamicoTipoFormato;
	//}
	
	public void setBorderResaltarTiposReportesTipoFormato() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFormato.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoFormato .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoFormato() {
		return this.jComboBoxTiposGraficosReportesTipoFormato;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoFormato(
			JComboBox jComboBoxTiposGraficosReportesTipoFormato) {
		this.jComboBoxTiposGraficosReportesTipoFormato = jComboBoxTiposGraficosReportesTipoFormato;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoFormato() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFormato.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoFormato .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoFormato() {
		return this.jComboBoxTiposPaginacionTipoFormato;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoFormato(
			JComboBox jComboBoxTiposPaginacionTipoFormato) {
		this.jComboBoxTiposPaginacionTipoFormato = jComboBoxTiposPaginacionTipoFormato;
	}
	
	public void setBorderResaltarTiposPaginacionTipoFormato() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFormato.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoFormato .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoFormato() {
		return this.jComboBoxTiposRelacionesTipoFormato;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoFormato() {
		return this.jComboBoxTiposAccionesTipoFormato;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoFormato(
			JComboBox jComboBoxTiposRelacionesTipoFormato) {
		this.jComboBoxTiposRelacionesTipoFormato = jComboBoxTiposRelacionesTipoFormato;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoFormato(
			JComboBox jComboBoxTiposAccionesTipoFormato) {
		this.jComboBoxTiposAccionesTipoFormato = jComboBoxTiposAccionesTipoFormato;
	}
	
	public void setBorderResaltarTiposRelacionesTipoFormato() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFormato.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoFormato .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoFormato() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFormato.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoFormato .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoFormato() {
	//	return jCheckBoxConGraficoDinamicoTipoFormato;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoFormato(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoFormato) {
	//	this.jCheckBoxConGraficoDinamicoTipoFormato = jCheckBoxConGraficoDinamicoTipoFormato;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoFormato() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoFormato.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoFormato .setBorder(borderResaltar);		
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
		this.tipoformatoSessionBean=new TipoFormatoSessionBean();
		
		this.tipoformatoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoformatoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoformatoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoFormatoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoFormatoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoFormatoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoFormatoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoFormatoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Formato  MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoformatoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoFormatoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoFormato No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoFormato= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoFormato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoFormato,this.jTtoolBarTipoFormato,
							"nuevo","nuevo","Nuevo"+" "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoFormato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoFormato,this.jTtoolBarTipoFormato,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoFormato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoFormato,this.jTtoolBarTipoFormato,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoFormato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoFormato,this.jTtoolBarTipoFormato,
							"duplicar","duplicar","Duplicar"+" "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoFormato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoFormato,this.jTtoolBarTipoFormato,
							"copiar","copiar","Copiar"+" "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoFormato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoFormato,this.jTtoolBarTipoFormato,
							"ver_form","ver_form","Ver"+" "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoFormato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoFormato,this.jTtoolBarTipoFormato,
							"recargar","recargar","Recargar"+" "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoFormato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoFormato,this.jTtoolBarTipoFormato,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoFormato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoFormato,this.jTtoolBarTipoFormato,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoFormato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoFormato,this.jTtoolBarTipoFormato,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoFormato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoFormato,this.jTtoolBarTipoFormato,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoFormato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoFormato,this.jTtoolBarTipoFormato,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoFormato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoFormato,this.jTtoolBarTipoFormato,
							"cerrar","cerrar","Salir"+" "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoFormato=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoFormato;
			
				this.jButtonProcesarInformacionToolBarTipoFormato=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoFormato;
				
		//protected JButton jButtonModificarToolBarTipoFormato;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoFormato=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoFormato=new JMenuMe("General");
		this.jmenuArchivoTipoFormato=new JMenuMe("Archivo");
		this.jmenuAccionesTipoFormato=new JMenuMe("Acciones");
		this.jmenuDatosTipoFormato=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoFormato= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoFormato.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoFormato,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoFormato= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoFormato.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoFormato,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoFormato= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoFormato.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoFormato,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoFormato= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoFormato.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoFormato,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoFormato= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoFormato.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoFormato,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoFormato= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoFormato.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoFormato,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoFormato= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoFormato.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoFormato,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoFormato= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoFormato.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoFormato,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoFormato= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoFormato.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoFormato,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoFormato= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoFormato.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoFormato,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoFormato= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoFormato.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoFormato,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoFormato= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoFormato.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoFormato,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoFormato= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoFormato.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoFormato,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoFormato= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoFormato.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoFormato,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoFormato= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoFormato.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoFormato,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoFormato= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoFormato.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoFormato,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoFormato= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoFormato.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoFormato,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoFormato.add(this.jMenuItemCerrarTipoFormato);
			
			this.jmenuAccionesTipoFormato.add(this.jMenuItemNuevoTipoFormato);
			this.jmenuAccionesTipoFormato.add(this.jMenuItemNuevoGuardarCambiosTipoFormato);
			this.jmenuAccionesTipoFormato.add(this.jMenuItemNuevoRelacionesTipoFormato);
			this.jmenuAccionesTipoFormato.add(this.jMenuItemGuardarCambiosTablaTipoFormato);		
			this.jmenuAccionesTipoFormato.add(this.jMenuItemDuplicarTipoFormato);		
			this.jmenuAccionesTipoFormato.add(this.jMenuItemCopiarTipoFormato);		
			this.jmenuAccionesTipoFormato.add(this.jMenuItemVerFormTipoFormato);		
			
			this.jmenuDatosTipoFormato.add(this.jMenuItemRecargarInformacionTipoFormato);				
			this.jmenuDatosTipoFormato.add(this.jMenuItemAnterioresTipoFormato);				
			this.jmenuDatosTipoFormato.add(this.jMenuItemSiguientesTipoFormato);				
			this.jmenuDatosTipoFormato.add(this.jMenuItemAbrirOrderByTipoFormato);				
			this.jmenuDatosTipoFormato.add(this.jMenuItemMostrarOcultarTipoFormato);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoFormato.add(this.jMenuItemGuardarCambiosTipoFormato);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoFormato.add(this.jmenuArchivoTipoFormato);		
			this.jmenuBarTipoFormato.add(this.jmenuAccionesTipoFormato);		
			this.jmenuBarTipoFormato.add(this.jmenuDatosTipoFormato);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoFormato);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoFormato() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorIdTipoFormato=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdTipoFormato.setToolTipText("Buscar Por Id ");
		this.jButtonBusquedaPorIdTipoFormato= new JButtonMe();
		this.jButtonBusquedaPorIdTipoFormato.setText("Buscar");
		this.jButtonBusquedaPorIdTipoFormato.setToolTipText("Buscar Por Id ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdTipoFormato,"buscar_button","Buscar Por Id ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
			jLabelidBusquedaPorIdTipoFormato = new JLabelMe();
		jLabelidBusquedaPorIdTipoFormato.setText("Id :");
		jLabelidBusquedaPorIdTipoFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaPorIdTipoFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaPorIdTipoFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));

		FuncionesSwing.setBoldLabel(jLabelidBusquedaPorIdTipoFormato,STIPO_TAMANIO_GENERAL,false,true,this);

		jLabelidTipoFormatoBusquedaPorId= new JTextFieldMe();
		jLabelidTipoFormatoBusquedaPorId.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoFormatoBusquedaPorId.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoFormatoBusquedaPorId.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



		this.jPanelBusquedaPorNombreTipoFormato=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoFormato.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoFormato= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoFormato.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoFormato.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoFormato,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoFormato = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoFormato.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoFormato.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoFormato,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoFormato= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoFormato,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoFormato=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoFormato.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoFormato.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoFormato.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoFormato.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoFormato,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoFormato = new TipoFormatoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Formato  DATOS");
			this.jInternalFrameDetalleFormTipoFormato = new TipoFormatoDetalleFormJInternalFrame(jDesktopPane,this.tipoformatoSessionBean.getConGuardarRelaciones(),this.tipoformatoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoFormato = null;//new TipoFormatoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoFormato= new GridBagLayout();
		
		
		this.jTableDatosTipoFormato = new JTableMe();      
		
		String sToolTipTipoFormato="";
		sToolTipTipoFormato=TipoFormatoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoFormato+="(Contabilidad.TipoFormato)";
		}
		
		if(!this.tipoformatoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoFormato+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoFormato.setToolTipText(sToolTipTipoFormato);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoFormato);
		this.jTableDatosTipoFormato.setAutoCreateRowSorter(true);
		this.jTableDatosTipoFormato.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoFormato.setRowSelectionAllowed(true);
		this.jTableDatosTipoFormato.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoFormato,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoFormato = new JButtonMe();
		this.jButtonDuplicarTipoFormato = new JButtonMe();
		this.jButtonCopiarTipoFormato = new JButtonMe();
		this.jButtonVerFormTipoFormato = new JButtonMe();
		this.jButtonNuevoRelacionesTipoFormato = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoFormato = new JButtonMe();
		this.jButtonCerrarTipoFormato = new JButtonMe();
		
		this.jScrollPanelDatosTipoFormato = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoFormato = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoFormato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Formato ";
		
		if(!this.tipoformatoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Formato s" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoFormato.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoFormato.setToolTipText("Acciones");
        this.jPanelAccionesTipoFormato.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoFormato, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoFormato, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoFormato=new ReporteDinamicoJInternalFrame(TipoFormatoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoFormato();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoFormato=new ImportacionJInternalFrame(TipoFormatoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoFormato();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoFormato = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoFormato.setText("Orden");
		this.jButtonAbrirOrderByTipoFormato.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoFormato,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoFormato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoFormato=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFormato,false,this);
			
			//this.cargarOrderByTipoFormato(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoFormato=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFormato,true,this);
			
			//this.cargarOrderByTipoFormato(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoFormato.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosTipoFormato.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosTipoFormato.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosTipoFormato.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoFormato.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoFormato.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoFormato.setText("Nuevo");
		this.jButtonDuplicarTipoFormato.setText("Duplicar");
		this.jButtonCopiarTipoFormato.setText("Copiar");
		this.jButtonVerFormTipoFormato.setText("Ver");
		this.jButtonNuevoRelacionesTipoFormato.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoFormato.setText("Guardar");
		this.jButtonCerrarTipoFormato.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoFormato,"nuevo_button","Nuevo",this.tipoformatoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoFormato,"duplicar_button","Duplicar",this.tipoformatoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoFormato,"copiar_button","Copiar",this.tipoformatoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoFormato,"ver_form","Ver",this.tipoformatoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoFormato,"nuevorelaciones_button","Nuevo Rel",this.tipoformatoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoFormato,"guardarcambiostabla_button","Guardar",this.tipoformatoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoFormato,"cerrar_button","Salir",this.tipoformatoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoFormato.setToolTipText("Nuevo"+" "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoFormato.setToolTipText("Duplicar"+" "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoFormato.setToolTipText("Copiar"+" "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoFormato.setToolTipText("Ver"+" "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoFormato.setToolTipText("Nuevo Rel"+" "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoFormato.setToolTipText("Guardar"+" "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoFormato.setToolTipText("Salir"+" "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoFormato";
		inputMap = this.jButtonNuevoTipoFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoFormato.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoFormato"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoFormato";
		inputMap = this.jButtonDuplicarTipoFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoFormato.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoFormato"));
		
		//COPIAR
		sMapKey = "CopiarTipoFormato";
		inputMap = this.jButtonCopiarTipoFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoFormato.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoFormato"));
		
		//VEr FORM
		sMapKey = "VerFormTipoFormato";
		inputMap = this.jButtonVerFormTipoFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoFormato.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoFormato"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoFormato";
		inputMap = this.jButtonNuevoRelacionesTipoFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoFormato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoFormato"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoFormato";
		inputMap = this.jButtonModificarTipoFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoFormato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoFormato"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoFormato";
		inputMap = this.jButtonCerrarTipoFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoFormato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoFormato"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoFormato";
		inputMap = this.jButtonGuardarCambiosTablaTipoFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoFormato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoFormato"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoFormato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoFormato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoFormato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoFormato= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoFormato= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoFormato= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoFormato= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoFormato= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoFormato.setName("jPanelParametrosReportesTipoFormato"); 
		
		this.jPanelParametrosReportesAccionesTipoFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoFormato.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoFormato.setName("jPanelParametrosReportesAccionesTipoFormato"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoFormato, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoFormato, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoFormato = new JButtonMe();
		this.jButtonRecargarInformacionTipoFormato.setText("Recargar");
		this.jButtonRecargarInformacionTipoFormato.setToolTipText("Recargar"+" "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoFormato,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoFormato = new JButtonMe();
		this.jButtonProcesarInformacionTipoFormato.setText("Procesar");
		this.jButtonProcesarInformacionTipoFormato.setToolTipText("Procesar"+" "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoFormato.setVisible(false);
			
		this.jButtonProcesarInformacionTipoFormato.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoFormato.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoFormato.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoFormato = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoFormato.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoFormato.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoFormato = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoFormato.setText("TIPO");       
		this.jComboBoxTiposReportesTipoFormato.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoFormato = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoFormato.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoFormato.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoFormato = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoFormato.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoFormato.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoFormato = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoFormato.setText("Accion");
		this.jComboBoxTiposRelacionesTipoFormato.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoFormato = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoFormato.setText("Accion");
		this.jComboBoxTiposAccionesTipoFormato.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoFormato = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoFormato.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoFormato.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoFormato=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoFormato.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoFormato.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoFormato.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoFormato = new JLabelMe();
		
		this.jLabelAccionesTipoFormato.setText("Acciones");		
		this.jLabelAccionesTipoFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoFormato = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoFormato.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoFormato.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoFormato = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoFormato.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoFormato.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoFormato = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoFormato.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoFormato.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoFormato = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoFormato.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoFormato.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoFormato = new JButtonMe();
		//this.jButtonAnterioresTipoFormato.setText("<<");
        this.jButtonAnterioresTipoFormato.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoFormato,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoFormato = new JButtonMe();
		//this.jButtonSiguientesTipoFormato.setText(">>");
        this.jButtonSiguientesTipoFormato.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoFormato,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoFormato = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoFormato.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoFormato.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoFormato,"nuevoguardarcambios_button","Nue",this.tipoformatoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoFormato";
		inputMap = this.jButtonNuevoGuardarCambiosTipoFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoFormato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoFormato"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoFormato";
		inputMap = this.jButtonRecargarInformacionTipoFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoFormato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoFormato"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoFormato";
		inputMap = this.jButtonSiguientesTipoFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoFormato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoFormato"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoFormato";
		inputMap = this.jButtonAnterioresTipoFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoFormato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoFormato"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoFormato();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoFormato.setMinimumSize(new Dimension(this.getWidth(),TipoFormatoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoFormatoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoFormato.setMaximumSize(new Dimension(this.getWidth(),TipoFormatoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoFormatoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoFormato.setPreferredSize(new Dimension(this.getWidth(),TipoFormatoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoFormatoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoFormato = new GridBagLayout();

			this.jPanelPaginacionTipoFormato.setLayout(gridaBagLayoutPaginacionTipoFormato);						
			
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			this.gridBagConstraintsTipoFormato.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormato.gridy = 0;
			this.gridBagConstraintsTipoFormato.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoFormato.add(this.jButtonAnterioresTipoFormato, this.gridBagConstraintsTipoFormato);
					
						
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			this.gridBagConstraintsTipoFormato.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoFormato.gridy = 0;
			
			this.jPanelPaginacionTipoFormato.add(this.jButtonNuevoGuardarCambiosTipoFormato, this.gridBagConstraintsTipoFormato);
						
			
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			this.gridBagConstraintsTipoFormato.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoFormato.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoFormato.gridy = 0;
			this.jPanelPaginacionTipoFormato.add(this.jButtonSiguientesTipoFormato, this.gridBagConstraintsTipoFormato);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormato.gridy = 1;
			this.gridBagConstraintsTipoFormato.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFormato.add(this.jButtonNuevoTipoFormato, this.gridBagConstraintsTipoFormato);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoFormato = new GridBagConstraints();
				this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoFormato.gridy = 1;
				this.gridBagConstraintsTipoFormato.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoFormato.add(this.jButtonNuevoRelacionesTipoFormato, this.gridBagConstraintsTipoFormato);
			}
			
			
			if(!this.tipoformatoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoFormato = new GridBagConstraints();
				this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoFormato.gridy = 1;
				this.gridBagConstraintsTipoFormato.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoFormato.add(this.jButtonGuardarCambiosTablaTipoFormato, this.gridBagConstraintsTipoFormato);
			}
			
			
			
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormato.gridy = 1;
			this.gridBagConstraintsTipoFormato.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFormato.add(this.jButtonDuplicarTipoFormato, this.gridBagConstraintsTipoFormato);
			
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormato.gridy = 1;
			this.gridBagConstraintsTipoFormato.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFormato.add(this.jButtonCopiarTipoFormato, this.gridBagConstraintsTipoFormato);
		
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormato.gridy = 1;
			this.gridBagConstraintsTipoFormato.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFormato.add(this.jButtonVerFormTipoFormato, this.gridBagConstraintsTipoFormato);
		
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormato.gridy = 1;
			this.gridBagConstraintsTipoFormato.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoFormato.add(this.jButtonCerrarTipoFormato, this.gridBagConstraintsTipoFormato);
		
		
		
		this.jButtonRecargarInformacionTipoFormato.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoFormato.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoFormato.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoFormato.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoFormato.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoFormato.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoFormato.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoFormato.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoFormato.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoFormato.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoFormato.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoFormato.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoFormato.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoFormato.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoFormato.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoFormato.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoFormato.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoFormato.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoFormato.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFormato.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFormato.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoFormato.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoFormato.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoFormato.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoFormato.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoFormato.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoFormato.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoFormato.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoFormato.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoFormato.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoFormato.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoFormato.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoFormato.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoFormato.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoFormato.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoFormato.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoFormato = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoFormato = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoFormato = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoFormato = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoFormato = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoFormato = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoFormato.setLayout(gridaBagParametrosReportesTipoFormato);
			this.jPanelParametrosReportesAccionesTipoFormato.setLayout(gridaBagParametrosReportesAccionesTipoFormato);
			
			
			this.jPanelParametrosAuxiliar1TipoFormato.setLayout(gridaBagParametrosAuxiliar1TipoFormato);
			this.jPanelParametrosAuxiliar2TipoFormato.setLayout(gridaBagParametrosAuxiliar2TipoFormato);
			this.jPanelParametrosAuxiliar3TipoFormato.setLayout(gridaBagParametrosAuxiliar3TipoFormato);
			this.jPanelParametrosAuxiliar4TipoFormato.setLayout(gridaBagParametrosAuxiliar4TipoFormato);
			//this.jPanelParametrosAuxiliar5TipoFormato.setLayout(gridaBagParametrosAuxiliar2TipoFormato);			
			
			
			
			
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormato.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoFormato.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFormato.add(this.jButtonRecargarInformacionTipoFormato, this.gridBagConstraintsTipoFormato);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			this.gridBagConstraintsTipoFormato.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormato.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormato.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoFormato.add(this.jComboBoxTiposPaginacionTipoFormato, this.gridBagConstraintsTipoFormato);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			this.gridBagConstraintsTipoFormato.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormato.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormato.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoFormato.add(this.jCheckBoxConAltoMaximoTablaTipoFormato, this.gridBagConstraintsTipoFormato);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			this.gridBagConstraintsTipoFormato.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormato.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormato.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoFormato.add(this.jComboBoxTiposArchivosReportesTipoFormato, this.gridBagConstraintsTipoFormato);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			this.gridBagConstraintsTipoFormato.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormato.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormato.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFormato.add(this.jPanelParametrosAuxiliar1TipoFormato, this.gridBagConstraintsTipoFormato);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			this.gridBagConstraintsTipoFormato.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormato.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoFormato.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoFormato.add(this.jComboBoxTiposReportesTipoFormato, this.gridBagConstraintsTipoFormato);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			this.gridBagConstraintsTipoFormato.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormato.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormato.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFormato.add(this.jPanelParametrosAuxiliar4TipoFormato, this.gridBagConstraintsTipoFormato);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			this.gridBagConstraintsTipoFormato.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormato.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormato.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFormato.add(this.jComboBoxTiposReportesTipoFormato, this.gridBagConstraintsTipoFormato);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			this.gridBagConstraintsTipoFormato.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormato.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormato.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoFormato.add(this.jCheckBoxGenerarReporteTipoFormato, this.gridBagConstraintsTipoFormato);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			this.gridBagConstraintsTipoFormato.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormato.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormato.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFormato.add(this.jPanelParametrosAuxiliar2TipoFormato, this.gridBagConstraintsTipoFormato);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormato.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoFormato.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoFormato.add(this.jLabelAccionesTipoFormato, this.gridBagConstraintsTipoFormato);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoFormato = new GridBagConstraints();
				this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoFormato.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoFormato.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoFormato.add(this.jButtonAbrirOrderByTipoFormato, this.gridBagConstraintsTipoFormato);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoFormato.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormato.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFormato.add(this.jComboBoxTiposSeleccionarTipoFormato, this.gridBagConstraintsTipoFormato);			
			
			
			/*
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormato.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoFormato.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoFormato.add(this.jCheckBoxSeleccionarTodosTipoFormato, this.gridBagConstraintsTipoFormato);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			this.gridBagConstraintsTipoFormato.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormato.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoFormato.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoFormato.add(this.jCheckBoxSeleccionarTodosTipoFormato, this.gridBagConstraintsTipoFormato);															
				
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			this.gridBagConstraintsTipoFormato.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormato.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoFormato.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoFormato.add(this.jCheckBoxSeleccionadosTipoFormato, this.gridBagConstraintsTipoFormato);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			this.gridBagConstraintsTipoFormato.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormato.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormato.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFormato.add(this.jPanelParametrosAuxiliar3TipoFormato, this.gridBagConstraintsTipoFormato);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			this.gridBagConstraintsTipoFormato.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormato.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFormato.add(this.jComboBoxTiposRelacionesTipoFormato, this.gridBagConstraintsTipoFormato);
				
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			this.gridBagConstraintsTipoFormato.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormato.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFormato.add(this.jComboBoxTiposAccionesTipoFormato, this.gridBagConstraintsTipoFormato);
	
				
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			this.gridBagConstraintsTipoFormato.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormato.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFormato.add(this.jTextFieldValorCampoGeneralTipoFormato, this.gridBagConstraintsTipoFormato);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoFormato = new GridBagLayout();

			this.jScrollPanelDatosTipoFormato.setLayout(gridaBagLayoutDatosTipoFormato);
			
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormato.gridy = 0;
			this.gridBagConstraintsTipoFormato.gridx = 0;
			
			this.jScrollPanelDatosTipoFormato.add(this.jTableDatosTipoFormato, this.gridBagConstraintsTipoFormato);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoFormato.setViewportView(this.jTableDatosTipoFormato);
		this.jTableDatosTipoFormato.setFillsViewportHeight(true);
		this.jTableDatosTipoFormato.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoFormato= new GridBagLayout();
		this.jPanelAccionesTipoFormato.setLayout(gridaBagLayoutAccionesTipoFormato);
		
		
		/*	
		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormato.gridy = 0;
		this.gridBagConstraintsTipoFormato.gridx = 0;
			
		this.jPanelAccionesTipoFormato.add(this.jButtonNuevoTipoFormato, this.gridBagConstraintsTipoFormato);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorIdTipoFormato= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdTipoFormato.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdTipoFormato.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdTipoFormato.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdTipoFormato.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdTipoFormato.setLayout(gridaBagLayoutBusquedaPorIdTipoFormato);

		gridBagConstraintsTipoFormato = new GridBagConstraints();
		gridBagConstraintsTipoFormato.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoFormato.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoFormato.gridy = 0;
		gridBagConstraintsTipoFormato.gridx = 0;
		jPanelBusquedaPorIdTipoFormato.add(jLabelidBusquedaPorIdTipoFormato, gridBagConstraintsTipoFormato);

		gridBagConstraintsTipoFormato = new GridBagConstraints();
		gridBagConstraintsTipoFormato.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoFormato.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoFormato.gridy = 0;
		gridBagConstraintsTipoFormato.gridx = 1;
		jPanelBusquedaPorIdTipoFormato.add(jLabelidTipoFormatoBusquedaPorId, gridBagConstraintsTipoFormato);

		gridBagConstraintsTipoFormato = new GridBagConstraints();
		gridBagConstraintsTipoFormato.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoFormato.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoFormato.gridy = 1;
		gridBagConstraintsTipoFormato.gridx =1;
		jPanelBusquedaPorIdTipoFormato.add(jButtonBusquedaPorIdTipoFormato, gridBagConstraintsTipoFormato);

		jTabbedPaneBusquedasTipoFormato.addTab("1.-Por Id ", jPanelBusquedaPorIdTipoFormato);
		jTabbedPaneBusquedasTipoFormato.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoFormato= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoFormato.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoFormato.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoFormato.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoFormato.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoFormato.setLayout(gridaBagLayoutBusquedaPorNombreTipoFormato);

		gridBagConstraintsTipoFormato = new GridBagConstraints();
		gridBagConstraintsTipoFormato.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoFormato.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoFormato.gridy = 0;
		gridBagConstraintsTipoFormato.gridx = 0;
		jPanelBusquedaPorNombreTipoFormato.add(jLabelnombreBusquedaPorNombreTipoFormato, gridBagConstraintsTipoFormato);

		gridBagConstraintsTipoFormato = new GridBagConstraints();
		gridBagConstraintsTipoFormato.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoFormato.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoFormato.gridy = 0;
		gridBagConstraintsTipoFormato.gridx = 1;
		jPanelBusquedaPorNombreTipoFormato.add(jTextAreanombreBusquedaPorNombreTipoFormato, gridBagConstraintsTipoFormato);

		gridBagConstraintsTipoFormato = new GridBagConstraints();
		gridBagConstraintsTipoFormato.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoFormato.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoFormato.gridy = 1;
		gridBagConstraintsTipoFormato.gridx =1;
		jPanelBusquedaPorNombreTipoFormato.add(jButtonBusquedaPorNombreTipoFormato, gridBagConstraintsTipoFormato);

		jTabbedPaneBusquedasTipoFormato.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreTipoFormato);
		jTabbedPaneBusquedasTipoFormato.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoFormato = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoFormato);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoformatoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();						
			this.gridBagConstraintsTipoFormato.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoFormato.gridx = 0;		
			//this.gridBagConstraintsTipoFormato.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormato.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoFormato.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoFormato, this.gridBagConstraintsTipoFormato);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoFormato.gridx = 0;		
		//this.gridBagConstraintsTipoFormato.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormato.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoFormato.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoFormato);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoFormato.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoFormato.gridx = 0;		
			this.gridBagConstraintsTipoFormato.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormato.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoFormato.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoFormato, this.gridBagConstraintsTipoFormato);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFormato.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoFormato, this.gridBagConstraintsTipoFormato);								
		
		
		/*
		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFormato.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoFormato, this.gridBagConstraintsTipoFormato);
		*/		
		
		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoFormato.gridx =0;
		this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoFormato.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoFormato, this.gridBagConstraintsTipoFormato);
				
		
		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFormato.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoFormato, this.gridBagConstraintsTipoFormato);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoFormatoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoFormato= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoFormato = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoFormato.setLayout(gridaBagLayoutBusquedasParametrosTipoFormato);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoFormato=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoFormato.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFormato.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFormato.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFormato.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoFormato, this.gridBagConstraintsTipoFormato);
			
			
		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFormato.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoFormato, this.gridBagConstraintsTipoFormato);
		
			
		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoFormato.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoFormato, this.gridBagConstraintsTipoFormato);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoFormato;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoFormato() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoFormato = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoFormato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoFormato.setName("jPanelReporteDinamicoTipoFormato"); 
		
		this.jPanelReporteDinamicoTipoFormato.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoFormato.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoFormato.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoFormato.setLayout(gridaBagLayoutReporteDinamicoTipoFormato);
		
		
		this.jInternalFrameReporteDinamicoTipoFormato= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoFormato = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoFormato= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoFormato.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoFormato.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoFormato.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoFormato.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoFormato.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoFormato.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoFormato.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoFormato.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoFormato.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoFormato.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoFormato.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Formato s"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoFormato = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoFormato.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormato.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFormato.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoFormato.add(this.jLabelColumnasSelectReporteTipoFormato, this.gridBagConstraintsTipoFormato);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoFormato = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoFormato.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoFormato.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoFormato.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoFormato.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoFormato.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoFormato=new JScrollPane(this.jListColumnasSelectReporteTipoFormato);
			
			this.jScrollColumnasSelectReporteTipoFormato.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoFormato.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoFormato.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormato.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFormato.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoFormato.add(this.jListColumnasSelectReporteTipoFormato, this.gridBagConstraintsTipoFormato);
		this.jPanelReporteDinamicoTipoFormato.add(this.jScrollColumnasSelectReporteTipoFormato, this.gridBagConstraintsTipoFormato);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoFormato = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoFormato.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormato.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFormato.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoFormato.add(this.jLabelRelacionesSelectReporteTipoFormato, this.gridBagConstraintsTipoFormato);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoFormato = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoFormato.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoFormato.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoFormato.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoFormato.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoFormato.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoFormato=new JScrollPane(this.jListRelacionesSelectReporteTipoFormato);
			
			this.jScrollRelacionesSelectReporteTipoFormato.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoFormato.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoFormato.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormato.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFormato.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoFormato.add(this.jListRelacionesSelectReporteTipoFormato, this.gridBagConstraintsTipoFormato);
		this.jPanelReporteDinamicoTipoFormato.add(this.jScrollRelacionesSelectReporteTipoFormato, this.gridBagConstraintsTipoFormato);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoFormato = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoFormato = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoFormato = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoFormato = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoFormato.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoFormato.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoFormato.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoFormato.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoFormato = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoFormato.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoFormato.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoFormato.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoFormato.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoFormato = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoFormato.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormato.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFormato.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoFormato.add(this.jLabelGenerarExcelReporteDinamicoTipoFormato, this.gridBagConstraintsTipoFormato);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoFormato = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoFormato.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoFormato,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoFormato.setToolTipText("Generar EXCEL"+" "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		//this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoFormato.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoFormato.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoFormato.add(this.jButtonGenerarExcelReporteDinamicoTipoFormato, this.gridBagConstraintsTipoFormato);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormato.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFormato.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFormato.add(this.jComboBoxTiposReportesDinamicoTipoFormato, this.gridBagConstraintsTipoFormato);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoFormato = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoFormato.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormato.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFormato.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoFormato.add(this.jLabelTiposArchivoReporteDinamicoTipoFormato, this.gridBagConstraintsTipoFormato);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormato.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFormato.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFormato.add(this.jComboBoxTiposArchivosReportesDinamicoTipoFormato, this.gridBagConstraintsTipoFormato);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoFormato = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoFormato.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoFormato,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoFormato.setToolTipText("Generar"+" "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormato.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFormato.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFormato.add(this.jButtonGenerarReporteDinamicoTipoFormato, this.gridBagConstraintsTipoFormato);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoFormato = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoFormato.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoFormato,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoFormato.setToolTipText("Cancelar"+" "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormato.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFormato.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFormato.add(this.jButtonCerrarReporteDinamicoTipoFormato, this.gridBagConstraintsTipoFormato);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoFormato = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoFormato= new JScrollPane(jPanelReporteDinamicoTipoFormato,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoFormato.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoFormato.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoFormato.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Formato s"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoFormato.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoFormato.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoFormato.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoFormato);
		this.jInternalFrameReporteDinamicoTipoFormato.getContentPane().add(this.jScrollPanelReporteDinamicoTipoFormato, this.gridBagConstraintsTipoFormato);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoFormato() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoFormato = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoFormato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoFormato.setName("jPanelImportacionTipoFormato"); 
		
		this.jPanelImportacionTipoFormato.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoFormato.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoFormato.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoFormato.setLayout(gridaBagLayoutImportacionTipoFormato);
		
		
		this.jInternalFrameImportacionTipoFormato= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoFormato= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoFormato = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoFormato= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoFormato.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoFormato.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoFormato.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoFormato.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoFormato.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoFormato.setResizable(true);
	    this.jInternalFrameImportacionTipoFormato.setClosable(true);
	    this.jInternalFrameImportacionTipoFormato.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoFormato.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoFormato.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoFormato.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoFormato.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoFormato.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoFormato.setResizable(true);
	    this.jInternalFrameImportacionTipoFormato.setClosable(true);
	    this.jInternalFrameImportacionTipoFormato.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoFormato.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoFormato.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoFormato.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Formato s"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoFormato = new JLabelMe();

		this.jLabelArchivoImportacionTipoFormato.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormato.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoFormato.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoFormato.add(this.jLabelArchivoImportacionTipoFormato, this.gridBagConstraintsTipoFormato);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoFormato = new JFileChooser();		
		this.jFileChooserImportacionTipoFormato.setToolTipText("ESCOGER ARCHIVO"+" "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoFormato = new JButtonMe();
		this.jButtonAbrirImportacionTipoFormato.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoFormato,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoFormato.setToolTipText("Generar"+" "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormato.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFormato.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFormato.add(this.jButtonAbrirImportacionTipoFormato, this.gridBagConstraintsTipoFormato);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoFormato = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoFormato.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormato.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoFormato.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoFormato.add(this.jLabelPathArchivoImportacionTipoFormato, this.gridBagConstraintsTipoFormato);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoFormato=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoFormato.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoFormato.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoFormato.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormato.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFormato.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFormato.add(this.jTextFieldPathArchivoImportacionTipoFormato, this.gridBagConstraintsTipoFormato);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoFormato = new JButtonMe();
		this.jButtonGenerarImportacionTipoFormato.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoFormato,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoFormato.setToolTipText("Generar"+" "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormato.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFormato.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFormato.add(this.jButtonGenerarImportacionTipoFormato, this.gridBagConstraintsTipoFormato);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoFormato = new JButtonMe();
		this.jButtonCerrarImportacionTipoFormato.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoFormato,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoFormato.setToolTipText("Cancelar"+" "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormato.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFormato.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFormato.add(this.jButtonCerrarImportacionTipoFormato, this.gridBagConstraintsTipoFormato);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoFormato = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoFormato= new JScrollPane(jPanelImportacionTipoFormato,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoFormato = new GridBagConstraints();
		this.gridBagConstraintsTipoFormato.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoFormato.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoFormato.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoFormato.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoFormato);
		this.jInternalFrameImportacionTipoFormato.getContentPane().add(this.jScrollPanelImportacionTipoFormato, this.gridBagConstraintsTipoFormato);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoFormato(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoFormato = new JButtonMe();
			this.jButtonAbrirOrderByTipoFormato.setText("Orden");
			this.jButtonAbrirOrderByTipoFormato.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoFormato,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoFormato";
			inputMap = this.jButtonAbrirOrderByTipoFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoFormato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoFormato"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoFormato = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoFormato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoFormato.setName("jPanelOrderByTipoFormato"); 
			
			this.jPanelOrderByTipoFormato.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoFormato.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoFormato.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoFormato.setLayout(gridaBagLayoutOrderByTipoFormato);
			
			
			this.jTableDatosTipoFormatoOrderBy = new JTableMe();        
			this.jTableDatosTipoFormatoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoFormatoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoFormatoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoFormatoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoFormatoOrderBy.setViewportView(this.jTableDatosTipoFormatoOrderBy);
			this.jTableDatosTipoFormatoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoFormatoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoFormato= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoFormato= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoFormato = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoFormato= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoFormato.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoFormato.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoFormato.setTitle("Orden");
			this.jInternalFrameOrderByTipoFormato.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoFormato.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoFormato.setResizable(true);
			this.jInternalFrameOrderByTipoFormato.setClosable(true);
			this.jInternalFrameOrderByTipoFormato.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoFormato.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoFormato.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoFormato.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Formato s"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			this.gridBagConstraintsTipoFormato.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoFormato.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoFormato.ipady =150;
				
			this.jPanelOrderByTipoFormato.add(jScrollPanelDatosTipoFormatoOrderBy, this.gridBagConstraintsTipoFormato);//this.jTableDatosTipoFormatoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoFormato = new JButtonMe();
			this.jButtonCerrarOrderByTipoFormato.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoFormato,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoFormato.setToolTipText("Cancelar"+" "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormato.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoFormato.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoFormato.add(this.jButtonCerrarOrderByTipoFormato, this.gridBagConstraintsTipoFormato);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoFormato = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoFormato= new JScrollPane(jPanelOrderByTipoFormato,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoFormato = new GridBagConstraints();
			this.gridBagConstraintsTipoFormato.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoFormato.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoFormato.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoFormato.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoFormato.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoFormato);
			
			this.jInternalFrameOrderByTipoFormato.getContentPane().add(this.jScrollPanelOrderByTipoFormato, this.gridBagConstraintsTipoFormato);			
		
		} else {
			this.jButtonAbrirOrderByTipoFormato = new JButtonMe();
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
			&& this.tipoformatoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoFormato.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoFormato.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoFormato.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoFormato.getRowHeight();//TipoFormatoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoformatoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoFormatoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoFormato.isSelected()) {
					iHeightTable=TipoFormatoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoFormatoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoFormatoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoFormatoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoFormato.isSelected()) {
					iHeightTable=TipoFormatoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoFormatoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoFormatoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoFormato.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoFormato.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoFormato.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoFormato.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoFormato.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoFormato.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoFormato!=null && this.jInternalFrameOrderByTipoFormato.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoformatoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoFormato.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoFormato.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoFormato.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoFormato.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoFormato.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoFormato.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoFormato.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoFormato.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoFormato.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoFormato.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoformatoLogic.getTipoFormatos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoformatos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoFormato> TraerTipoFormatoBeans(List<TipoFormato> tipoformatos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoFormato tipoformato:tipoformatos) {
					
				if(!(TipoFormatoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoFormatoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoformato.setsDetalleGeneralEntityReporte(TipoFormatoConstantesFunciones.getTipoFormatoDescripcion(tipoformato));
										
						
					
					

					if(tipoformato.getFormatos()!=null && Funciones.existeClass(classes,Formato.class)) {
						try{tipoformato.setformatosDescripcionReporte(new JRBeanCollectionDataSource(FormatoJInternalFrame.TraerFormatoBeans(tipoformato.getFormatos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipoformato.setsDetalleGeneralEntityReporte(tipoformato.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoformatobeans.add(tipoformatobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoformatos;
    }
	//PARA REPORTES FIN
}
