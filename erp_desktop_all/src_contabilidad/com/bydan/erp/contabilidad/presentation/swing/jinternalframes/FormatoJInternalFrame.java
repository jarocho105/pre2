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
import com.bydan.erp.contabilidad.util.FormatoConstantesFunciones;

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
public class FormatoJInternalFrame extends FormatoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarFormato;
	
	protected JMenuBar jmenuBarFormato;
	
	protected JMenu jmenuFormato;
	protected JMenu jmenuDatosFormato;
	protected JMenu jmenuArchivoFormato;
	protected JMenu jmenuAccionesFormato;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosFormato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFormato;	
	protected GridBagConstraints gridBagConstraintsFormato;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public FormatoDetalleFormJInternalFrame jInternalFrameDetalleFormFormato;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoFormato;	
	protected ImportacionJInternalFrame jInternalFrameImportacionFormato;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";

	protected TipoFormatoBeanSwingJInternalFrame tipoformatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoformato="";
	
	public FormatoSessionBean formatoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;
	public TipoFormatoSessionBean tipoformatoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Formato> formatos;		
	public List<Formato> formatosEliminados;	
	public List<Formato> formatosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByFormato;		
	protected JButton jButtonAbrirOrderByFormato;
	
	
	//protected JPanel jPanelOrderByFormato;
	//public JScrollPane jScrollPanelOrderByFormato;	
	//protected JButton jButtonCerrarOrderByFormato;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public FormatoLogic formatoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosFormato;
	public JScrollPane jScrollPanelDatosEdicionFormato;
	public JScrollPane jScrollPanelDatosGeneralFormato;
    
	
	
	//public JScrollPane jScrollPanelDatosFormatoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoFormato;
	//public JScrollPane jScrollPanelImportacionFormato;
	
	
	
	protected JPanel jPanelAccionesFormato;
	
    protected JPanel jPanelPaginacionFormato;
    protected JPanel jPanelParametrosReportesFormato;
	protected JPanel jPanelParametrosReportesAccionesFormato;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Formato;
	protected JPanel jPanelParametrosAuxiliar2Formato;
	protected JPanel jPanelParametrosAuxiliar3Formato;
	protected JPanel jPanelParametrosAuxiliar4Formato;
	//protected JPanel jPanelParametrosAuxiliar5Formato;
	
	
	
	//protected JPanel jPanelReporteDinamicoFormato;
	//protected JPanel jPanelImportacionFormato;
	
	
	public JTable jTableDatosFormato;
	
	
	
	//public JTable jTableDatosFormatoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoFormato;
	protected JButton jButtonDuplicarFormato;
	protected JButton jButtonCopiarFormato;
	protected JButton jButtonVerFormFormato;
	protected JButton jButtonNuevoRelacionesFormato;
	protected JButton jButtonModificarFormato;
	
    protected JButton jButtonGuardarCambiosTablaFormato;
	protected JButton jButtonCerrarFormato;
	
	
	protected JButton jButtonRecargarInformacionFormato;
	protected JButton jButtonProcesarInformacionFormato;
	
	
	protected JButton jButtonAnterioresFormato;
	protected JButton jButtonSiguientesFormato;
	protected JButton jButtonNuevoGuardarCambiosFormato;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoFormato;
	//protected JButton jButtonCerrarReporteDinamicoFormato;
	//protected JButton jButtonGenerarExcelReporteDinamicoFormato;	
	
	
	
	//protected JButton jButtonAbrirImportacionFormato;
	//protected JButton jButtonGenerarImportacionFormato;
	//protected JButton jButtonCerrarImportacionFormato;
	//protected JFileChooser jFileChooserImportacionFormato;
	//protected File fileImportacionFormato;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFormato;
	protected JButton jButtonDuplicarToolBarFormato;
	protected JButton jButtonNuevoRelacionesToolBarFormato;
	
	
	public JButton jButtonGuardarCambiosToolBarFormato;
	protected JButton jButtonCopiarToolBarFormato;
	protected JButton jButtonVerFormToolBarFormato;
	public JButton jButtonGuardarCambiosTablaToolBarFormato;
	protected JButton jButtonMostrarOcultarTablaToolBarFormato;
	protected JButton jButtonCerrarToolBarFormato;
	
	protected JButton jButtonRecargarInformacionToolBarFormato;
	protected JButton jButtonProcesarInformacionToolBarFormato;
	protected JButton jButtonAnterioresToolBarFormato;
	protected JButton jButtonSiguientesToolBarFormato;
	protected JButton jButtonNuevoGuardarCambiosToolBarFormato;
	protected JButton jButtonAbrirOrderByToolBarFormato;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFormato;
	protected JMenuItem jMenuItemDuplicarFormato;
	protected JMenuItem jMenuItemNuevoRelacionesFormato;
	
	
	protected JMenuItem jMenuItemGuardarCambiosFormato;
	protected JMenuItem jMenuItemCopiarFormato;
	protected JMenuItem jMenuItemVerFormFormato;
	protected JMenuItem jMenuItemGuardarCambiosTablaFormato;
	protected JMenuItem jMenuItemCerrarFormato;
	protected JMenuItem jMenuItemDetalleCerrarFormato;
	protected JMenuItem jMenuItemDetalleAbrirOrderByFormato;
	protected JMenuItem jMenuItemDetalleMostarOcultarFormato;
	
	protected JMenuItem jMenuItemRecargarInformacionFormato;
	protected JMenuItem jMenuItemProcesarInformacionFormato;
	protected JMenuItem jMenuItemAnterioresFormato;
	protected JMenuItem jMenuItemSiguientesFormato;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFormato;
	protected JMenuItem jMenuItemAbrirOrderByFormato;
	protected JMenuItem jMenuItemMostrarOcultarFormato;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFormato;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosFormato;
	protected JCheckBox jCheckBoxSeleccionadosFormato;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaFormato;
	protected JCheckBox jCheckBoxConGraficoReporteFormato;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesFormato;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesFormato;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoFormato;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoFormato;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesFormato;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionFormato;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFormato;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFormato;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarFormato;
	protected JTextField jTextFieldValorCampoGeneralFormato;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteFormato;
	//public JList<Reporte> jListColumnasSelectReporteFormato;
	//public JScrollPane jScrollColumnasSelectReporteFormato;
	
	//public JLabel jLabelRelacionesSelectReporteFormato;
	//public JList<Reporte> jListRelacionesSelectReporteFormato;
	//public JScrollPane jScrollRelacionesSelectReporteFormato;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoFormato;
	//protected JCheckBox jCheckBoxConGraficoDinamicoFormato;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoFormato;
	//public JLabel jLabelTiposArchivoReporteDinamicoFormato;
	
		
	//public JLabel jLabelArchivoImportacionFormato;	
	//public JLabel jLabelPathArchivoImportacionFormato;
	//protected JTextField jTextFieldPathArchivoImportacionFormato;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoFormato;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoFormato;
	
	//public JLabel jLabelColumnaCategoriaValorFormato;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorFormato;
	
	//public JLabel jLabelColumnasValoresGraficoFormato;
	//public JList<Reporte> jListColumnasValoresGraficoFormato;
	//public JScrollPane jScrollColumnasValoresGraficoFormato;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoFormato;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoFormato;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasFormato;
	public JPanel jPanelBusquedaPorNombreFormato;
	public JButton jButtonBusquedaPorNombreFormato;
	public JPanel jPanelFK_IdModuloFormato;
	public JButton jButtonFK_IdModuloFormato;
	public JPanel jPanelFK_IdTipoFormatoFormato;
	public JButton jButtonFK_IdTipoFormatoFormato;
	public JPanel jPanelFK_IdTipoMovimientoFormato;
	public JButton jButtonFK_IdTipoMovimientoFormato;
	
	public JPanel jPanelnombreBusquedaPorNombreFormato;
	public JLabel jLabelnombreBusquedaPorNombreFormato;
	public JTextField jTextFieldnombreBusquedaPorNombreFormato;
	public JButton jButtonnombreBusquedaPorNombreFormatoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_moduloFK_IdModuloFormato;
	public JLabel jLabelid_moduloFK_IdModuloFormato;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloFK_IdModuloFormato;
	public JButton jButtonid_moduloFK_IdModuloFormato= new JButtonMe();
	public JButton jButtonid_moduloFK_IdModuloFormatoUpdate= new JButtonMe();
	public JButton jButtonid_moduloFK_IdModuloFormatoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_formatoFK_IdTipoFormatoFormato;
	public JLabel jLabelid_tipo_formatoFK_IdTipoFormatoFormato;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_formatoFK_IdTipoFormatoFormato;
	public JButton jButtonid_tipo_formatoFK_IdTipoFormatoFormato= new JButtonMe();
	public JButton jButtonid_tipo_formatoFK_IdTipoFormatoFormatoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_formatoFK_IdTipoFormatoFormatoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_movimientoFK_IdTipoMovimientoFormato;
	public JLabel jLabelid_tipo_movimientoFK_IdTipoMovimientoFormato;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimientoFK_IdTipoMovimientoFormato;
	public JButton jButtonid_tipo_movimientoFK_IdTipoMovimientoFormato= new JButtonMe();
	public JButton jButtonid_tipo_movimientoFK_IdTipoMovimientoFormatoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimientoFK_IdTipoMovimientoFormatoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public FormatoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Formato No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormatoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Formato No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormatoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Formato No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormatoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Formato No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionFormato)	{
		this.jButtonRecargarInformacionFormato = jButtonRecargarInformacionFormato;
	}
	
	public JButton getjButtonProcesarInformacionFormato() {
		return this.jButtonProcesarInformacionFormato;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFormato)	{
		this.jButtonProcesarInformacionFormato = jButtonProcesarInformacionFormato;
	}
	
	
	public JButton getjButtonRecargarInformacionFormato() {
		return this.jButtonRecargarInformacionFormato;
	}
	
	
	public List<Formato> getformatos() {
		return this.formatos;
	}

	public void setformatos(List<Formato> formatos) {
		this.formatos = formatos;
	}
	
	public List<Formato> getformatosAux() {
		return this.formatosAux;
	}

	public void setformatosAux(List<Formato> formatosAux) {
		this.formatosAux = formatosAux;
	}
	
	public List<Formato> getformatosEliminados() {
		return this.formatosEliminados;
	}

	public void setFormatosEliminados(List<Formato> formatosEliminados) {
		this.formatosEliminados = formatosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarFormato() {
		return jComboBoxTiposSeleccionarFormato;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarFormato(
			JComboBox jComboBoxTiposSeleccionarFormato) {
		this.jComboBoxTiposSeleccionarFormato = jComboBoxTiposSeleccionarFormato;
	}
	
	public void setBorderResaltarTiposSeleccionarFormato() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarFormato.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarFormato .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralFormato() {
		return jTextFieldValorCampoGeneralFormato;
	}

	public void setjTextFieldValorCampoGeneralFormato(
			JTextField jTextFieldValorCampoGeneralFormato) {
		this.jTextFieldValorCampoGeneralFormato = jTextFieldValorCampoGeneralFormato;
	}

	public void setBorderResaltarValorCampoGeneralFormato() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormato.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralFormato .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosFormato() {
		return this.jCheckBoxSeleccionarTodosFormato;
	}

	public void setjCheckBoxSeleccionarTodosFormato(
			JCheckBox jCheckBoxSeleccionarTodosFormato) {
		this.jCheckBoxSeleccionarTodosFormato = jCheckBoxSeleccionarTodosFormato;
	}

	public void setBorderResaltarSeleccionarTodosFormato() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormato.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosFormato .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosFormato() {
		return this.jCheckBoxSeleccionadosFormato;
	}

	public void setjCheckBoxSeleccionadosFormato(
			JCheckBox jCheckBoxSeleccionadosFormato) {
		this.jCheckBoxSeleccionadosFormato = jCheckBoxSeleccionadosFormato;
	}
	
	public void setBorderResaltarSeleccionadosFormato() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormato.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosFormato .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesFormato() {
		return this.jComboBoxTiposArchivosReportesFormato;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesFormato(
			JComboBox jComboBoxTiposArchivosReportesFormato) {
		this.jComboBoxTiposArchivosReportesFormato = jComboBoxTiposArchivosReportesFormato;
	}

	public void setBorderResaltarTiposArchivosReportesFormato() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormato.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesFormato .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesFormato() {
		return this.jComboBoxTiposReportesFormato;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesFormato(
			JComboBox jComboBoxTiposReportesFormato) {
		this.jComboBoxTiposReportesFormato = jComboBoxTiposReportesFormato;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoFormato() {
	//	return jComboBoxTiposReportesDinamicoFormato;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoFormato(
	//		JComboBox jComboBoxTiposReportesDinamicoFormato) {
	//	this.jComboBoxTiposReportesDinamicoFormato = jComboBoxTiposReportesDinamicoFormato;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoFormato() {
	//	return jComboBoxTiposArchivosReportesDinamicoFormato;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoFormato(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoFormato) {
	//	this.jComboBoxTiposArchivosReportesDinamicoFormato = jComboBoxTiposArchivosReportesDinamicoFormato;
	//}
	
	public void setBorderResaltarTiposReportesFormato() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormato.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesFormato .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesFormato() {
		return this.jComboBoxTiposGraficosReportesFormato;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesFormato(
			JComboBox jComboBoxTiposGraficosReportesFormato) {
		this.jComboBoxTiposGraficosReportesFormato = jComboBoxTiposGraficosReportesFormato;
	}
	
	public void setBorderResaltarTiposGraficosReportesFormato() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormato.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesFormato .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionFormato() {
		return this.jComboBoxTiposPaginacionFormato;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionFormato(
			JComboBox jComboBoxTiposPaginacionFormato) {
		this.jComboBoxTiposPaginacionFormato = jComboBoxTiposPaginacionFormato;
	}
	
	public void setBorderResaltarTiposPaginacionFormato() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormato.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionFormato .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesFormato() {
		return this.jComboBoxTiposRelacionesFormato;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormato() {
		return this.jComboBoxTiposAccionesFormato;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFormato(
			JComboBox jComboBoxTiposRelacionesFormato) {
		this.jComboBoxTiposRelacionesFormato = jComboBoxTiposRelacionesFormato;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormato(
			JComboBox jComboBoxTiposAccionesFormato) {
		this.jComboBoxTiposAccionesFormato = jComboBoxTiposAccionesFormato;
	}
	
	public void setBorderResaltarTiposRelacionesFormato() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormato.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesFormato .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesFormato() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormato.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesFormato .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoFormato() {
	//	return jCheckBoxConGraficoDinamicoFormato;
	//}

	//public void setjCheckBoxConGraficoDinamicoFormato(
	//		JCheckBox jCheckBoxConGraficoDinamicoFormato) {
	//	this.jCheckBoxConGraficoDinamicoFormato = jCheckBoxConGraficoDinamicoFormato;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoFormato() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarFormato.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoFormato .setBorder(borderResaltar);		
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
		this.formatoSessionBean=new FormatoSessionBean();
		
		this.formatoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.formatoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.formatoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=FormatoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=FormatoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FormatoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FormatoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FormatoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Formato MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.formatoSessionBean.getEsGuardarRelacionado()) {
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
		
		FormatoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Formato No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarFormato= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarFormato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarFormato,this.jTtoolBarFormato,
							"nuevo","nuevo","Nuevo"+" "+FormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarFormato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarFormato,this.jTtoolBarFormato,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarFormato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarFormato,this.jTtoolBarFormato,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+FormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarFormato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarFormato,this.jTtoolBarFormato,
							"duplicar","duplicar","Duplicar"+" "+FormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarFormato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarFormato,this.jTtoolBarFormato,
							"copiar","copiar","Copiar"+" "+FormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarFormato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarFormato,this.jTtoolBarFormato,
							"ver_form","ver_form","Ver"+" "+FormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarFormato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormato,this.jTtoolBarFormato,
							"recargar","recargar","Recargar"+" "+FormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarFormato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormato,this.jTtoolBarFormato,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarFormato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormato,this.jTtoolBarFormato,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarFormato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarFormato,this.jTtoolBarFormato,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarFormato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarFormato,this.jTtoolBarFormato,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarFormato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarFormato,this.jTtoolBarFormato,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+FormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarFormato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarFormato,this.jTtoolBarFormato,
							"cerrar","cerrar","Salir"+" "+FormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarFormato=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarFormato;
			
				this.jButtonProcesarInformacionToolBarFormato=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarFormato;
				
		//protected JButton jButtonModificarToolBarFormato;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarFormato=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuFormato=new JMenuMe("General");
		this.jmenuArchivoFormato=new JMenuMe("Archivo");
		this.jmenuAccionesFormato=new JMenuMe("Acciones");
		this.jmenuDatosFormato=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFormato= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFormato.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFormato,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarFormato= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarFormato.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarFormato,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesFormato= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesFormato.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesFormato,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosFormato= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFormato.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFormato,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarFormato= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarFormato.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarFormato,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormFormato= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormFormato.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormFormato,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaFormato= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaFormato.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaFormato,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFormato= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFormato.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFormato,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionFormato= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionFormato.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionFormato,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionFormato= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionFormato.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionFormato,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresFormato= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresFormato.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresFormato,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesFormato= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesFormato.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesFormato,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByFormato= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByFormato.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByFormato,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFormato= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFormato.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFormato,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByFormato= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByFormato.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByFormato,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFormato= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFormato.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFormato,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFormato, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosFormato= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosFormato.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosFormato,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoFormato.add(this.jMenuItemCerrarFormato);
			
			this.jmenuAccionesFormato.add(this.jMenuItemNuevoFormato);
			this.jmenuAccionesFormato.add(this.jMenuItemNuevoGuardarCambiosFormato);
			this.jmenuAccionesFormato.add(this.jMenuItemNuevoRelacionesFormato);
			this.jmenuAccionesFormato.add(this.jMenuItemGuardarCambiosTablaFormato);		
			this.jmenuAccionesFormato.add(this.jMenuItemDuplicarFormato);		
			this.jmenuAccionesFormato.add(this.jMenuItemCopiarFormato);		
			this.jmenuAccionesFormato.add(this.jMenuItemVerFormFormato);		
			
			this.jmenuDatosFormato.add(this.jMenuItemRecargarInformacionFormato);				
			this.jmenuDatosFormato.add(this.jMenuItemAnterioresFormato);				
			this.jmenuDatosFormato.add(this.jMenuItemSiguientesFormato);				
			this.jmenuDatosFormato.add(this.jMenuItemAbrirOrderByFormato);				
			this.jmenuDatosFormato.add(this.jMenuItemMostrarOcultarFormato);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesFormato.add(this.jMenuItemGuardarCambiosFormato);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesFormato, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosFormato, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarFormato.add(this.jmenuArchivoFormato);		
			this.jmenuBarFormato.add(this.jmenuAccionesFormato);		
			this.jmenuBarFormato.add(this.jmenuDatosFormato);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarFormato);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasFormato() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombreFormato=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreFormato.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreFormato= new JButtonMe();
		this.jButtonBusquedaPorNombreFormato.setText("Buscar");
		this.jButtonBusquedaPorNombreFormato.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreFormato,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreFormato = new JLabelMe();
		jLabelnombreBusquedaPorNombreFormato.setText("Nombre :");
		jLabelnombreBusquedaPorNombreFormato.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreFormato,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldnombreBusquedaPorNombreFormato= new JTextFieldMe();
		jTextFieldnombreBusquedaPorNombreFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorNombreFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorNombreFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreBusquedaPorNombreFormato,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdModuloFormato=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdModuloFormato.setToolTipText("Buscar Por Modulo ");
		this.jButtonFK_IdModuloFormato= new JButtonMe();
		this.jButtonFK_IdModuloFormato.setText("Buscar");
		this.jButtonFK_IdModuloFormato.setToolTipText("Buscar Por Modulo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdModuloFormato,"buscar_button","Buscar Por Modulo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdModuloFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_moduloFK_IdModuloFormato = new JLabelMe();
		jLabelid_moduloFK_IdModuloFormato.setText("Modulo :");
		jLabelid_moduloFK_IdModuloFormato.setToolTipText("Modulo");
		jLabelid_moduloFK_IdModuloFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloFK_IdModuloFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloFK_IdModuloFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_moduloFK_IdModuloFormato,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_moduloFK_IdModuloFormato= new JComboBoxMe();
		jComboBoxid_moduloFK_IdModuloFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloFK_IdModuloFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloFK_IdModuloFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloFK_IdModuloFormato,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoFormatoFormato=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoFormatoFormato.setToolTipText("Buscar Por Tipo Formato ");
		this.jButtonFK_IdTipoFormatoFormato= new JButtonMe();
		this.jButtonFK_IdTipoFormatoFormato.setText("Buscar");
		this.jButtonFK_IdTipoFormatoFormato.setToolTipText("Buscar Por Tipo Formato ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoFormatoFormato,"buscar_button","Buscar Por Tipo Formato ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoFormatoFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_formatoFK_IdTipoFormatoFormato = new JLabelMe();
		jLabelid_tipo_formatoFK_IdTipoFormatoFormato.setText("Tipo Formato :");
		jLabelid_tipo_formatoFK_IdTipoFormatoFormato.setToolTipText("Tipo Formato");
		jLabelid_tipo_formatoFK_IdTipoFormatoFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_formatoFK_IdTipoFormatoFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_formatoFK_IdTipoFormatoFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_formatoFK_IdTipoFormatoFormato,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_formatoFK_IdTipoFormatoFormato= new JComboBoxMe();
		jComboBoxid_tipo_formatoFK_IdTipoFormatoFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_formatoFK_IdTipoFormatoFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_formatoFK_IdTipoFormatoFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_formatoFK_IdTipoFormatoFormato,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoMovimientoFormato=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoMovimientoFormato.setToolTipText("Buscar Por Tipo Movimiento ");
		this.jButtonFK_IdTipoMovimientoFormato= new JButtonMe();
		this.jButtonFK_IdTipoMovimientoFormato.setText("Buscar");
		this.jButtonFK_IdTipoMovimientoFormato.setToolTipText("Buscar Por Tipo Movimiento ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoMovimientoFormato,"buscar_button","Buscar Por Tipo Movimiento ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoMovimientoFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_movimientoFK_IdTipoMovimientoFormato = new JLabelMe();
		jLabelid_tipo_movimientoFK_IdTipoMovimientoFormato.setText("Tipo Movimiento :");
		jLabelid_tipo_movimientoFK_IdTipoMovimientoFormato.setToolTipText("Tipo Movimiento");
		jLabelid_tipo_movimientoFK_IdTipoMovimientoFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_movimientoFK_IdTipoMovimientoFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_movimientoFK_IdTipoMovimientoFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimientoFK_IdTipoMovimientoFormato,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_movimientoFK_IdTipoMovimientoFormato= new JComboBoxMe();
		jComboBoxid_tipo_movimientoFK_IdTipoMovimientoFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoFK_IdTipoMovimientoFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoFK_IdTipoMovimientoFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimientoFK_IdTipoMovimientoFormato,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasFormato=new JTabbedPane();


		this.jTabbedPaneBusquedasFormato.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFormato.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFormato.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasFormato.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasFormato,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleFormato = new FormatoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Formato DATOS");
			this.jInternalFrameDetalleFormFormato = new FormatoDetalleFormJInternalFrame(jDesktopPane,this.formatoSessionBean.getConGuardarRelaciones(),this.formatoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormFormato = null;//new FormatoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFormato= new GridBagLayout();
		
		
		this.jTableDatosFormato = new JTableMe();      
		
		String sToolTipFormato="";
		sToolTipFormato=FormatoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFormato+="(Contabilidad.Formato)";
		}
		
		if(!this.formatoSessionBean.getEsGuardarRelacionado()) {
			sToolTipFormato+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosFormato.setToolTipText(sToolTipFormato);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosFormato);
		this.jTableDatosFormato.setAutoCreateRowSorter(true);
		this.jTableDatosFormato.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosFormato.setRowSelectionAllowed(true);
		this.jTableDatosFormato.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosFormato,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoFormato = new JButtonMe();
		this.jButtonDuplicarFormato = new JButtonMe();
		this.jButtonCopiarFormato = new JButtonMe();
		this.jButtonVerFormFormato = new JButtonMe();
		this.jButtonNuevoRelacionesFormato = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaFormato = new JButtonMe();
		this.jButtonCerrarFormato = new JButtonMe();
		
		this.jScrollPanelDatosFormato = new JScrollPane();   
        this.jScrollPanelDatosGeneralFormato = new JScrollPane();
		
				
		
		
		this.jPanelAccionesFormato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Formato";
		
		if(!this.formatoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formatoes" + this.sPath));
		} else {
			this.jScrollPanelDatosFormato.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFormato.setToolTipText("Acciones");
        this.jPanelAccionesFormato.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFormato, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFormato, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoFormato=new ReporteDinamicoJInternalFrame(FormatoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoFormato();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionFormato=new ImportacionJInternalFrame(FormatoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionFormato();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByFormato = new JButtonMe();
		
		this.jButtonAbrirOrderByFormato.setText("Orden");
		this.jButtonAbrirOrderByFormato.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFormato,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByFormato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFormato=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormato,false,this);
			
			//this.cargarOrderByFormato(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFormato=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormato,true,this);
			
			//this.cargarOrderByFormato(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosFormato.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosFormato.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosFormato.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosFormato.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosFormato.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosFormato.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoFormato.setText("Nuevo");
		this.jButtonDuplicarFormato.setText("Duplicar");
		this.jButtonCopiarFormato.setText("Copiar");
		this.jButtonVerFormFormato.setText("Ver");
		this.jButtonNuevoRelacionesFormato.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaFormato.setText("Guardar");
		this.jButtonCerrarFormato.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFormato,"nuevo_button","Nuevo",this.formatoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarFormato,"duplicar_button","Duplicar",this.formatoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarFormato,"copiar_button","Copiar",this.formatoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormFormato,"ver_form","Ver",this.formatoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesFormato,"nuevorelaciones_button","Nuevo Rel",this.formatoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFormato,"guardarcambiostabla_button","Guardar",this.formatoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFormato,"cerrar_button","Salir",this.formatoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesFormato, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoFormato.setToolTipText("Nuevo"+" "+FormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarFormato.setToolTipText("Duplicar"+" "+FormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarFormato.setToolTipText("Copiar"+" "+FormatoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormFormato.setToolTipText("Ver"+" "+FormatoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesFormato.setToolTipText("Nuevo Rel"+" "+FormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaFormato.setToolTipText("Guardar"+" "+FormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFormato.setToolTipText("Salir"+" "+FormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFormato";
		inputMap = this.jButtonNuevoFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFormato.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFormato"));
		
		//DUPLICAR
		sMapKey = "DuplicarFormato";
		inputMap = this.jButtonDuplicarFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarFormato.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarFormato"));
		
		//COPIAR
		sMapKey = "CopiarFormato";
		inputMap = this.jButtonCopiarFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarFormato.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarFormato"));
		
		//VEr FORM
		sMapKey = "VerFormFormato";
		inputMap = this.jButtonVerFormFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormFormato.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormFormato"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesFormato";
		inputMap = this.jButtonNuevoRelacionesFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesFormato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesFormato"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarFormato";
		inputMap = this.jButtonModificarFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarFormato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarFormato"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarFormato";
		inputMap = this.jButtonCerrarFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFormato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFormato"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFormato";
		inputMap = this.jButtonGuardarCambiosTablaFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFormato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFormato"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesFormato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesFormato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionFormato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Formato= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Formato= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Formato= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Formato= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Formato= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesFormato.setName("jPanelParametrosReportesFormato"); 
		
		this.jPanelParametrosReportesAccionesFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesFormato.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesFormato.setName("jPanelParametrosReportesAccionesFormato"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesFormato, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesFormato, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionFormato = new JButtonMe();
		this.jButtonRecargarInformacionFormato.setText("Recargar");
		this.jButtonRecargarInformacionFormato.setToolTipText("Recargar"+" "+FormatoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionFormato,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionFormato = new JButtonMe();
		this.jButtonProcesarInformacionFormato.setText("Procesar");
		this.jButtonProcesarInformacionFormato.setToolTipText("Procesar"+" "+FormatoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionFormato.setVisible(false);
			
		this.jButtonProcesarInformacionFormato.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFormato.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFormato.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesFormato = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormato.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesFormato.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesFormato = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormato.setText("TIPO");       
		this.jComboBoxTiposReportesFormato.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesFormato = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormato.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesFormato.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionFormato = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionFormato.setText("Paginacion");
		this.jComboBoxTiposPaginacionFormato.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesFormato = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesFormato.setText("Accion");
		this.jComboBoxTiposRelacionesFormato.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesFormato = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormato.setText("Accion");
		this.jComboBoxTiposAccionesFormato.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarFormato = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarFormato.setText("Accion");
		this.jComboBoxTiposSeleccionarFormato.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralFormato=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralFormato.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFormato.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFormato.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesFormato = new JLabelMe();
		
		this.jLabelAccionesFormato.setText("Acciones");		
		this.jLabelAccionesFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosFormato = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosFormato.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosFormato.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosFormato = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosFormato.setText("Seleccionados");
		this.jCheckBoxSeleccionadosFormato.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaFormato = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaFormato.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaFormato.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteFormato = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteFormato.setText("Graf.");
		this.jCheckBoxConGraficoReporteFormato.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresFormato = new JButtonMe();
		//this.jButtonAnterioresFormato.setText("<<");
        this.jButtonAnterioresFormato.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresFormato,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesFormato = new JButtonMe();
		//this.jButtonSiguientesFormato.setText(">>");
        this.jButtonSiguientesFormato.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesFormato,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosFormato = new JButtonMe();
		this.jButtonNuevoGuardarCambiosFormato.setText("Nue");
        this.jButtonNuevoGuardarCambiosFormato.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosFormato,"nuevoguardarcambios_button","Nue",this.formatoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosFormato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosFormato";
		inputMap = this.jButtonNuevoGuardarCambiosFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosFormato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosFormato"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionFormato";
		inputMap = this.jButtonRecargarInformacionFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionFormato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionFormato"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesFormato";
		inputMap = this.jButtonSiguientesFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesFormato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesFormato"));
		
		//ANTERIORES		
		sMapKey = "AnterioresFormato";
		inputMap = this.jButtonAnterioresFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresFormato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresFormato"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasFormato();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesFormato.setMinimumSize(new Dimension(this.getWidth(),FormatoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormatoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFormato.setMaximumSize(new Dimension(this.getWidth(),FormatoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormatoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFormato.setPreferredSize(new Dimension(this.getWidth(),FormatoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormatoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionFormato = new GridBagLayout();

			this.jPanelPaginacionFormato.setLayout(gridaBagLayoutPaginacionFormato);						
			
			this.gridBagConstraintsFormato = new GridBagConstraints();
			this.gridBagConstraintsFormato.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormato.gridy = 0;
			this.gridBagConstraintsFormato.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionFormato.add(this.jButtonAnterioresFormato, this.gridBagConstraintsFormato);
					
						
			this.gridBagConstraintsFormato = new GridBagConstraints();
			this.gridBagConstraintsFormato.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFormato.gridy = 0;
			
			this.jPanelPaginacionFormato.add(this.jButtonNuevoGuardarCambiosFormato, this.gridBagConstraintsFormato);
						
			
			this.gridBagConstraintsFormato = new GridBagConstraints();
			this.gridBagConstraintsFormato.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsFormato.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFormato.gridy = 0;
			this.jPanelPaginacionFormato.add(this.jButtonSiguientesFormato, this.gridBagConstraintsFormato);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsFormato = new GridBagConstraints();
			this.gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormato.gridy = 1;
			this.gridBagConstraintsFormato.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormato.add(this.jButtonNuevoFormato, this.gridBagConstraintsFormato);
						
			
			
			if(!this.formatoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsFormato = new GridBagConstraints();
				this.gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFormato.gridy = 1;
				this.gridBagConstraintsFormato.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionFormato.add(this.jButtonGuardarCambiosTablaFormato, this.gridBagConstraintsFormato);
			}
			
			
			
			this.gridBagConstraintsFormato = new GridBagConstraints();
			this.gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormato.gridy = 1;
			this.gridBagConstraintsFormato.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormato.add(this.jButtonDuplicarFormato, this.gridBagConstraintsFormato);
			
			this.gridBagConstraintsFormato = new GridBagConstraints();
			this.gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormato.gridy = 1;
			this.gridBagConstraintsFormato.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormato.add(this.jButtonCopiarFormato, this.gridBagConstraintsFormato);
		
			this.gridBagConstraintsFormato = new GridBagConstraints();
			this.gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormato.gridy = 1;
			this.gridBagConstraintsFormato.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormato.add(this.jButtonVerFormFormato, this.gridBagConstraintsFormato);
		
			this.gridBagConstraintsFormato = new GridBagConstraints();
			this.gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormato.gridy = 1;
			this.gridBagConstraintsFormato.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionFormato.add(this.jButtonCerrarFormato, this.gridBagConstraintsFormato);
		
		
		
		this.jButtonRecargarInformacionFormato.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFormato.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFormato.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionFormato, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesFormato.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFormato.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFormato.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesFormato.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFormato.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFormato.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesFormato.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFormato.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFormato.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionFormato.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFormato.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFormato.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesFormato.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFormato.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFormato.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesFormato.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormato.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormato.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarFormato.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFormato.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFormato.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaFormato.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFormato.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFormato.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteFormato.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFormato.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFormato.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteFormato, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosFormato.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFormato.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFormato.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosFormato.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFormato.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFormato.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesFormato = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesFormato = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Formato = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Formato = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Formato = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Formato = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesFormato.setLayout(gridaBagParametrosReportesFormato);
			this.jPanelParametrosReportesAccionesFormato.setLayout(gridaBagParametrosReportesAccionesFormato);
			
			
			this.jPanelParametrosAuxiliar1Formato.setLayout(gridaBagParametrosAuxiliar1Formato);
			this.jPanelParametrosAuxiliar2Formato.setLayout(gridaBagParametrosAuxiliar2Formato);
			this.jPanelParametrosAuxiliar3Formato.setLayout(gridaBagParametrosAuxiliar3Formato);
			this.jPanelParametrosAuxiliar4Formato.setLayout(gridaBagParametrosAuxiliar4Formato);
			//this.jPanelParametrosAuxiliar5Formato.setLayout(gridaBagParametrosAuxiliar2Formato);			
			
			
			
			
			this.gridBagConstraintsFormato = new GridBagConstraints();
			this.gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormato.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormato.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormato.add(this.jButtonRecargarInformacionFormato, this.gridBagConstraintsFormato);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsFormato = new GridBagConstraints();
			this.gridBagConstraintsFormato.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormato.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormato.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Formato.add(this.jComboBoxTiposPaginacionFormato, this.gridBagConstraintsFormato);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsFormato = new GridBagConstraints();
			this.gridBagConstraintsFormato.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormato.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormato.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Formato.add(this.jCheckBoxConAltoMaximoTablaFormato, this.gridBagConstraintsFormato);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsFormato = new GridBagConstraints();
			this.gridBagConstraintsFormato.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormato.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormato.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Formato.add(this.jComboBoxTiposArchivosReportesFormato, this.gridBagConstraintsFormato);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsFormato = new GridBagConstraints();
			this.gridBagConstraintsFormato.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormato.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormato.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormato.add(this.jPanelParametrosAuxiliar1Formato, this.gridBagConstraintsFormato);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsFormato = new GridBagConstraints();
			this.gridBagConstraintsFormato.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormato.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormato.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Formato.add(this.jComboBoxTiposReportesFormato, this.gridBagConstraintsFormato);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsFormato = new GridBagConstraints();
			this.gridBagConstraintsFormato.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormato.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormato.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormato.add(this.jPanelParametrosAuxiliar4Formato, this.gridBagConstraintsFormato);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsFormato = new GridBagConstraints();
			this.gridBagConstraintsFormato.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormato.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormato.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormato.add(this.jComboBoxTiposReportesFormato, this.gridBagConstraintsFormato);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsFormato = new GridBagConstraints();
			this.gridBagConstraintsFormato.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormato.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormato.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormato.add(this.jCheckBoxGenerarReporteFormato, this.gridBagConstraintsFormato);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsFormato = new GridBagConstraints();
			this.gridBagConstraintsFormato.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormato.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormato.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormato.add(this.jPanelParametrosAuxiliar2Formato, this.gridBagConstraintsFormato);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsFormato = new GridBagConstraints();
			this.gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormato.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormato.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormato.add(this.jLabelAccionesFormato, this.gridBagConstraintsFormato);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsFormato = new GridBagConstraints();
				this.gridBagConstraintsFormato.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsFormato.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsFormato.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesFormato.add(this.jButtonAbrirOrderByFormato, this.gridBagConstraintsFormato);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsFormato = new GridBagConstraints();
			this.gridBagConstraintsFormato.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsFormato.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormato.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormato.add(this.jComboBoxTiposSeleccionarFormato, this.gridBagConstraintsFormato);			
			
			
			/*
			this.gridBagConstraintsFormato = new GridBagConstraints();
			this.gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormato.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormato.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormato.add(this.jCheckBoxSeleccionarTodosFormato, this.gridBagConstraintsFormato);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsFormato = new GridBagConstraints();
			this.gridBagConstraintsFormato.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormato.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormato.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Formato.add(this.jCheckBoxSeleccionarTodosFormato, this.gridBagConstraintsFormato);															
				
			this.gridBagConstraintsFormato = new GridBagConstraints();
			this.gridBagConstraintsFormato.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormato.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormato.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Formato.add(this.jCheckBoxSeleccionadosFormato, this.gridBagConstraintsFormato);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsFormato = new GridBagConstraints();
			this.gridBagConstraintsFormato.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormato.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormato.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormato.add(this.jPanelParametrosAuxiliar3Formato, this.gridBagConstraintsFormato);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsFormato = new GridBagConstraints();
			this.gridBagConstraintsFormato.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormato.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormato.add(this.jComboBoxTiposRelacionesFormato, this.gridBagConstraintsFormato);
				
			this.gridBagConstraintsFormato = new GridBagConstraints();
			this.gridBagConstraintsFormato.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormato.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormato.add(this.jComboBoxTiposAccionesFormato, this.gridBagConstraintsFormato);
	
				
			this.gridBagConstraintsFormato = new GridBagConstraints();
			this.gridBagConstraintsFormato.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormato.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormato.add(this.jTextFieldValorCampoGeneralFormato, this.gridBagConstraintsFormato);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosFormato = new GridBagLayout();

			this.jScrollPanelDatosFormato.setLayout(gridaBagLayoutDatosFormato);
			
			this.gridBagConstraintsFormato = new GridBagConstraints();
			this.gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormato.gridy = 0;
			this.gridBagConstraintsFormato.gridx = 0;
			
			this.jScrollPanelDatosFormato.add(this.jTableDatosFormato, this.gridBagConstraintsFormato);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosFormato.setViewportView(this.jTableDatosFormato);
		this.jTableDatosFormato.setFillsViewportHeight(true);
		this.jTableDatosFormato.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesFormato= new GridBagLayout();
		this.jPanelAccionesFormato.setLayout(gridaBagLayoutAccionesFormato);
		
		
		/*	
		this.gridBagConstraintsFormato = new GridBagConstraints();
		this.gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormato.gridy = 0;
		this.gridBagConstraintsFormato.gridx = 0;
			
		this.jPanelAccionesFormato.add(this.jButtonNuevoFormato, this.gridBagConstraintsFormato);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombreFormato= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreFormato.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreFormato.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreFormato.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreFormato.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreFormato.setLayout(gridaBagLayoutBusquedaPorNombreFormato);

		gridBagConstraintsFormato = new GridBagConstraints();
		gridBagConstraintsFormato.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormato.gridy = 0;
		gridBagConstraintsFormato.gridx = 0;
		jPanelBusquedaPorNombreFormato.add(jLabelnombreBusquedaPorNombreFormato, gridBagConstraintsFormato);

		gridBagConstraintsFormato = new GridBagConstraints();
		gridBagConstraintsFormato.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormato.gridy = 0;
		gridBagConstraintsFormato.gridx = 1;
		jPanelBusquedaPorNombreFormato.add(jTextFieldnombreBusquedaPorNombreFormato, gridBagConstraintsFormato);

		gridBagConstraintsFormato = new GridBagConstraints();
		gridBagConstraintsFormato.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormato.gridy = 1;
		gridBagConstraintsFormato.gridx =1;
		jPanelBusquedaPorNombreFormato.add(jButtonBusquedaPorNombreFormato, gridBagConstraintsFormato);

		jTabbedPaneBusquedasFormato.addTab("1.-Por Nombre ", jPanelBusquedaPorNombreFormato);
		jTabbedPaneBusquedasFormato.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdModuloFormato= new GridBagLayout();
		gridaBagLayoutFK_IdModuloFormato.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdModuloFormato.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdModuloFormato.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdModuloFormato.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdModuloFormato.setLayout(gridaBagLayoutFK_IdModuloFormato);

		gridBagConstraintsFormato = new GridBagConstraints();
		gridBagConstraintsFormato.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormato.gridy = 0;
		gridBagConstraintsFormato.gridx = 0;
		jPanelFK_IdModuloFormato.add(jLabelid_moduloFK_IdModuloFormato, gridBagConstraintsFormato);

		gridBagConstraintsFormato = new GridBagConstraints();
		gridBagConstraintsFormato.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormato.gridy = 0;
		gridBagConstraintsFormato.gridx = 1;
		jPanelFK_IdModuloFormato.add(jComboBoxid_moduloFK_IdModuloFormato, gridBagConstraintsFormato);

		gridBagConstraintsFormato = new GridBagConstraints();
		gridBagConstraintsFormato.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormato.gridy = 1;
		gridBagConstraintsFormato.gridx =1;
		jPanelFK_IdModuloFormato.add(jButtonFK_IdModuloFormato, gridBagConstraintsFormato);

		jTabbedPaneBusquedasFormato.addTab("2.-Por Modulo ", jPanelFK_IdModuloFormato);
		jTabbedPaneBusquedasFormato.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoFormatoFormato= new GridBagLayout();
		gridaBagLayoutFK_IdTipoFormatoFormato.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoFormatoFormato.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoFormatoFormato.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoFormatoFormato.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoFormatoFormato.setLayout(gridaBagLayoutFK_IdTipoFormatoFormato);

		gridBagConstraintsFormato = new GridBagConstraints();
		gridBagConstraintsFormato.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormato.gridy = 0;
		gridBagConstraintsFormato.gridx = 0;
		jPanelFK_IdTipoFormatoFormato.add(jLabelid_tipo_formatoFK_IdTipoFormatoFormato, gridBagConstraintsFormato);

		gridBagConstraintsFormato = new GridBagConstraints();
		gridBagConstraintsFormato.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormato.gridy = 0;
		gridBagConstraintsFormato.gridx = 1;
		jPanelFK_IdTipoFormatoFormato.add(jComboBoxid_tipo_formatoFK_IdTipoFormatoFormato, gridBagConstraintsFormato);

		gridBagConstraintsFormato = new GridBagConstraints();
		gridBagConstraintsFormato.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormato.gridy = 1;
		gridBagConstraintsFormato.gridx =1;
		jPanelFK_IdTipoFormatoFormato.add(jButtonFK_IdTipoFormatoFormato, gridBagConstraintsFormato);

		jTabbedPaneBusquedasFormato.addTab("3.-Por Tipo Formato ", jPanelFK_IdTipoFormatoFormato);
		jTabbedPaneBusquedasFormato.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdTipoMovimientoFormato= new GridBagLayout();
		gridaBagLayoutFK_IdTipoMovimientoFormato.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoMovimientoFormato.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoMovimientoFormato.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoMovimientoFormato.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoMovimientoFormato.setLayout(gridaBagLayoutFK_IdTipoMovimientoFormato);

		gridBagConstraintsFormato = new GridBagConstraints();
		gridBagConstraintsFormato.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormato.gridy = 0;
		gridBagConstraintsFormato.gridx = 0;
		jPanelFK_IdTipoMovimientoFormato.add(jLabelid_tipo_movimientoFK_IdTipoMovimientoFormato, gridBagConstraintsFormato);

		gridBagConstraintsFormato = new GridBagConstraints();
		gridBagConstraintsFormato.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormato.gridy = 0;
		gridBagConstraintsFormato.gridx = 1;
		jPanelFK_IdTipoMovimientoFormato.add(jComboBoxid_tipo_movimientoFK_IdTipoMovimientoFormato, gridBagConstraintsFormato);

		gridBagConstraintsFormato = new GridBagConstraints();
		gridBagConstraintsFormato.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormato.gridy = 1;
		gridBagConstraintsFormato.gridx =1;
		jPanelFK_IdTipoMovimientoFormato.add(jButtonFK_IdTipoMovimientoFormato, gridBagConstraintsFormato);

		jTabbedPaneBusquedasFormato.addTab("4.-Por Tipo Movimiento ", jPanelFK_IdTipoMovimientoFormato);
		jTabbedPaneBusquedasFormato.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFormato = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFormato);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.formatoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFormato = new GridBagConstraints();						
			this.gridBagConstraintsFormato.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormato.gridx = 0;		
			//this.gridBagConstraintsFormato.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormato.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFormato.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarFormato, this.gridBagConstraintsFormato);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsFormato = new GridBagConstraints();
		this.gridBagConstraintsFormato.gridy = iGridyPrincipal++;
		this.gridBagConstraintsFormato.gridx = 0;		
		//this.gridBagConstraintsFormato.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormato.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsFormato.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsFormato);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsFormato = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsFormato.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormato.gridx = 0;		
			this.gridBagConstraintsFormato.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormato.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsFormato.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasFormato, this.gridBagConstraintsFormato);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsFormato = new GridBagConstraints();
		this.gridBagConstraintsFormato.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormato.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesFormato, this.gridBagConstraintsFormato);								
		
		
		/*
		this.gridBagConstraintsFormato = new GridBagConstraints();
		this.gridBagConstraintsFormato.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormato.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesFormato, this.gridBagConstraintsFormato);
		*/		
		
		this.gridBagConstraintsFormato = new GridBagConstraints();
		this.gridBagConstraintsFormato.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFormato.gridx =0;
		this.gridBagConstraintsFormato.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFormato.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFormato, this.gridBagConstraintsFormato);
				
		
		this.gridBagConstraintsFormato = new GridBagConstraints();
		this.gridBagConstraintsFormato.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormato.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionFormato, this.gridBagConstraintsFormato);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(FormatoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosFormato= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFormato = new GridBagLayout();
			this.jPanelBusquedasParametrosFormato.setLayout(gridaBagLayoutBusquedasParametrosFormato);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralFormato=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFormato.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormato.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormato.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFormato = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsFormato = new GridBagConstraints();
		this.gridBagConstraintsFormato.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormato.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFormato, this.gridBagConstraintsFormato);
			
			
		this.gridBagConstraintsFormato = new GridBagConstraints();
		this.gridBagConstraintsFormato.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormato.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFormato, this.gridBagConstraintsFormato);
		
			
		this.gridBagConstraintsFormato = new GridBagConstraints();
		this.gridBagConstraintsFormato.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFormato.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFormato, this.gridBagConstraintsFormato);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralFormato;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoFormato() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoFormato = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoFormato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoFormato.setName("jPanelReporteDinamicoFormato"); 
		
		this.jPanelReporteDinamicoFormato.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFormato.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFormato.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoFormato.setLayout(gridaBagLayoutReporteDinamicoFormato);
		
		
		this.jInternalFrameReporteDinamicoFormato= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoFormato = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFormato= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoFormato.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoFormato.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoFormato.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoFormato.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoFormato.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoFormato.setResizable(true);
	    this.jInternalFrameReporteDinamicoFormato.setClosable(true);
	    this.jInternalFrameReporteDinamicoFormato.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoFormato.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFormato.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFormato.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formatoes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteFormato = new JLabelMe();

		this.jLabelColumnasSelectReporteFormato.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFormato = new GridBagConstraints();
		this.gridBagConstraintsFormato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormato.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormato.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFormato.add(this.jLabelColumnasSelectReporteFormato, this.gridBagConstraintsFormato);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteFormato = new JList<Reporte>();
		this.jListColumnasSelectReporteFormato.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteFormato.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteFormato.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFormato.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFormato.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteFormato=new JScrollPane(this.jListColumnasSelectReporteFormato);
			
			this.jScrollColumnasSelectReporteFormato.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFormato.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFormato.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFormato = new GridBagConstraints();
		this.gridBagConstraintsFormato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormato.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormato.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFormato.add(this.jListColumnasSelectReporteFormato, this.gridBagConstraintsFormato);
		this.jPanelReporteDinamicoFormato.add(this.jScrollColumnasSelectReporteFormato, this.gridBagConstraintsFormato);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteFormato = new JLabelMe();

		this.jLabelRelacionesSelectReporteFormato.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteFormato = new JList<Reporte>();
		this.jListRelacionesSelectReporteFormato.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteFormato.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteFormato.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFormato.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFormato.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteFormato=new JScrollPane(this.jListRelacionesSelectReporteFormato);
			
			this.jScrollRelacionesSelectReporteFormato.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFormato.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFormato.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoFormato = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoFormato = new JComboBoxMe();
		this.jListColumnasValoresGraficoFormato = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoFormato = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoFormato.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoFormato.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFormato.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFormato.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoFormato = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoFormato.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoFormato.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFormato.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFormato.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoFormato = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoFormato.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFormato = new GridBagConstraints();
		this.gridBagConstraintsFormato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormato.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormato.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormato.add(this.jLabelGenerarExcelReporteDinamicoFormato, this.gridBagConstraintsFormato);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoFormato = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoFormato.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoFormato,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoFormato.setToolTipText("Generar EXCEL"+" "+FormatoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsFormato = new GridBagConstraints();
		//this.gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsFormato.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsFormato.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoFormato.add(this.jButtonGenerarExcelReporteDinamicoFormato, this.gridBagConstraintsFormato);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsFormato = new GridBagConstraints();
		this.gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormato.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormato.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormato.add(this.jComboBoxTiposReportesDinamicoFormato, this.gridBagConstraintsFormato);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoFormato = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoFormato.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFormato = new GridBagConstraints();
		this.gridBagConstraintsFormato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormato.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormato.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormato.add(this.jLabelTiposArchivoReporteDinamicoFormato, this.gridBagConstraintsFormato);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsFormato = new GridBagConstraints();
		this.gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormato.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormato.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormato.add(this.jComboBoxTiposArchivosReportesDinamicoFormato, this.gridBagConstraintsFormato);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoFormato = new JButtonMe();
		this.jButtonGenerarReporteDinamicoFormato.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoFormato,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoFormato.setToolTipText("Generar"+" "+FormatoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsFormato = new GridBagConstraints();
		this.gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormato.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormato.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormato.add(this.jButtonGenerarReporteDinamicoFormato, this.gridBagConstraintsFormato);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoFormato = new JButtonMe();
		this.jButtonCerrarReporteDinamicoFormato.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoFormato,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoFormato.setToolTipText("Cancelar"+" "+FormatoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFormato = new GridBagConstraints();
		this.gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormato.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormato.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormato.add(this.jButtonCerrarReporteDinamicoFormato, this.gridBagConstraintsFormato);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalFormato = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoFormato= new JScrollPane(jPanelReporteDinamicoFormato,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoFormato.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFormato.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFormato.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formatoes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFormato = new GridBagConstraints();
		this.gridBagConstraintsFormato.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsFormato.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsFormato.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoFormato.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoFormato.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalFormato);
		this.jInternalFrameReporteDinamicoFormato.getContentPane().add(this.jScrollPanelReporteDinamicoFormato, this.gridBagConstraintsFormato);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionFormato() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionFormato = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionFormato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionFormato.setName("jPanelImportacionFormato"); 
		
		this.jPanelImportacionFormato.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFormato.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFormato.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionFormato.setLayout(gridaBagLayoutImportacionFormato);
		
		
		this.jInternalFrameImportacionFormato= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionFormato= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionFormato = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFormato= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionFormato.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFormato.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFormato.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionFormato.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFormato.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFormato.setResizable(true);
	    this.jInternalFrameImportacionFormato.setClosable(true);
	    this.jInternalFrameImportacionFormato.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionFormato.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFormato.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFormato.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionFormato.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFormato.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFormato.setResizable(true);
	    this.jInternalFrameImportacionFormato.setClosable(true);
	    this.jInternalFrameImportacionFormato.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionFormato.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFormato.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFormato.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formatoes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionFormato = new JLabelMe();

		this.jLabelArchivoImportacionFormato.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFormato = new GridBagConstraints();
		this.gridBagConstraintsFormato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormato.gridy = iPosYImportacion;		
		this.gridBagConstraintsFormato.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFormato.add(this.jLabelArchivoImportacionFormato, this.gridBagConstraintsFormato);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionFormato = new JFileChooser();		
		this.jFileChooserImportacionFormato.setToolTipText("ESCOGER ARCHIVO"+" "+FormatoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionFormato = new JButtonMe();
		this.jButtonAbrirImportacionFormato.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionFormato,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionFormato.setToolTipText("Generar"+" "+FormatoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsFormato = new GridBagConstraints();
		this.gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormato.gridy = iPosYImportacion;
		this.gridBagConstraintsFormato.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormato.add(this.jButtonAbrirImportacionFormato, this.gridBagConstraintsFormato);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionFormato = new JLabelMe();

		this.jLabelPathArchivoImportacionFormato.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionFormato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFormato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFormato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFormato = new GridBagConstraints();
		this.gridBagConstraintsFormato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormato.gridy = iPosYImportacion;		
		this.gridBagConstraintsFormato.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFormato.add(this.jLabelPathArchivoImportacionFormato, this.gridBagConstraintsFormato);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionFormato=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionFormato.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFormato.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFormato.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsFormato = new GridBagConstraints();
		this.gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormato.gridy = iPosYImportacion;
		this.gridBagConstraintsFormato.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormato.add(this.jTextFieldPathArchivoImportacionFormato, this.gridBagConstraintsFormato);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionFormato = new JButtonMe();
		this.jButtonGenerarImportacionFormato.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionFormato,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionFormato.setToolTipText("Generar"+" "+FormatoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsFormato = new GridBagConstraints();
		this.gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormato.gridy = iPosYImportacion;
		this.gridBagConstraintsFormato.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormato.add(this.jButtonGenerarImportacionFormato, this.gridBagConstraintsFormato);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionFormato = new JButtonMe();
		this.jButtonCerrarImportacionFormato.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionFormato,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionFormato.setToolTipText("Cancelar"+" "+FormatoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFormato = new GridBagConstraints();
		this.gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormato.gridy = iPosYImportacion;
		this.gridBagConstraintsFormato.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormato.add(this.jButtonCerrarImportacionFormato, this.gridBagConstraintsFormato);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalFormato = new GridBagLayout();
		
		this.jScrollPanelImportacionFormato= new JScrollPane(jPanelImportacionFormato,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsFormato = new GridBagConstraints();
		this.gridBagConstraintsFormato.gridy =iPosYImportacion;
		this.gridBagConstraintsFormato.gridx =iPosXImportacion;
		this.gridBagConstraintsFormato.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionFormato.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionFormato.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalFormato);
		this.jInternalFrameImportacionFormato.getContentPane().add(this.jScrollPanelImportacionFormato, this.gridBagConstraintsFormato);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByFormato(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByFormato = new JButtonMe();
			this.jButtonAbrirOrderByFormato.setText("Orden");
			this.jButtonAbrirOrderByFormato.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFormato,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByFormato";
			inputMap = this.jButtonAbrirOrderByFormato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByFormato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByFormato"));
		
		
			GridBagLayout gridaBagLayoutOrderByFormato = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByFormato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByFormato.setName("jPanelOrderByFormato"); 
			
			this.jPanelOrderByFormato.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFormato.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFormato.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByFormato.setLayout(gridaBagLayoutOrderByFormato);
			
			
			this.jTableDatosFormatoOrderBy = new JTableMe();        
			this.jTableDatosFormatoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosFormatoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosFormatoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosFormatoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosFormatoOrderBy.setViewportView(this.jTableDatosFormatoOrderBy);
			this.jTableDatosFormatoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosFormatoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByFormato= new OrderByJInternalFrame();
			this.jInternalFrameOrderByFormato= new OrderByJInternalFrame();
			this.jScrollPanelOrderByFormato = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteFormato= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByFormato.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByFormato.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByFormato.setTitle("Orden");
			this.jInternalFrameOrderByFormato.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByFormato.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByFormato.setResizable(true);
			this.jInternalFrameOrderByFormato.setClosable(true);
			this.jInternalFrameOrderByFormato.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByFormato.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFormato.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFormato.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByFormato.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formatoes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsFormato = new GridBagConstraints();
			this.gridBagConstraintsFormato.gridy =iPosYOrderBy++;
			this.gridBagConstraintsFormato.gridx =iPosXOrderBy;
			this.gridBagConstraintsFormato.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsFormato.ipady =150;
				
			this.jPanelOrderByFormato.add(jScrollPanelDatosFormatoOrderBy, this.gridBagConstraintsFormato);//this.jTableDatosFormatoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByFormato = new JButtonMe();
			this.jButtonCerrarOrderByFormato.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByFormato,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByFormato.setToolTipText("Cancelar"+" "+FormatoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByFormato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsFormato = new GridBagConstraints();
			this.gridBagConstraintsFormato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormato.gridy = iPosYOrderBy++;
			this.gridBagConstraintsFormato.gridx = iPosXOrderBy;
									
			this.jPanelOrderByFormato.add(this.jButtonCerrarOrderByFormato, this.gridBagConstraintsFormato);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalFormato = new GridBagLayout();
			
			this.jScrollPanelOrderByFormato= new JScrollPane(jPanelOrderByFormato,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsFormato = new GridBagConstraints();
			this.gridBagConstraintsFormato.gridy =iPosYOrderBy;
			this.gridBagConstraintsFormato.gridx =iPosXOrderBy;
			this.gridBagConstraintsFormato.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByFormato.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByFormato.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalFormato);
			
			this.jInternalFrameOrderByFormato.getContentPane().add(this.jScrollPanelOrderByFormato, this.gridBagConstraintsFormato);			
		
		} else {
			this.jButtonAbrirOrderByFormato = new JButtonMe();
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
		int iWidthTableCalculado=0;//1430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.formatoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosFormato.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosFormato.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosFormato.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosFormato.getRowHeight();//FormatoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.formatoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > FormatoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFormato.isSelected()) {
					iHeightTable=FormatoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FormatoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FormatoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > FormatoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFormato.isSelected()) {
					iHeightTable=FormatoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FormatoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FormatoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosFormato.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFormato.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFormato.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosFormato.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFormato.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFormato.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByFormato!=null && this.jInternalFrameOrderByFormato.getjTableDatosOrderBy()!=null) {
			//if(!this.formatoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByFormato.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByFormato.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByFormato.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByFormato.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByFormato.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByFormato.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByFormato.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosFormato.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFormato.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFormato.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=formatoLogic.getFormatos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=formatos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Formato> TraerFormatoBeans(List<Formato> formatos,ArrayList<Classe> classes)throws Exception {
		try {
			for(Formato formato:formatos) {
					
				if(!(FormatoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || FormatoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					formato.setsDetalleGeneralEntityReporte(FormatoConstantesFunciones.getFormatoDescripcion(formato));
										
						
					
						
					
				} else  {
							
					//formato.setsDetalleGeneralEntityReporte(formato.getsDetalleGeneralEntityReporte());
										
				}
				
				//formatobeans.add(formatobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return formatos;
    }
	//PARA REPORTES FIN
}
