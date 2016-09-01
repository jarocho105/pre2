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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.TipoContratoConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class TipoContratoJInternalFrame extends TipoContratoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoContrato;
	
	protected JMenuBar jmenuBarTipoContrato;
	
	protected JMenu jmenuTipoContrato;
	protected JMenu jmenuDatosTipoContrato;
	protected JMenu jmenuArchivoTipoContrato;
	protected JMenu jmenuAccionesTipoContrato;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoContrato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoContrato;	
	protected GridBagConstraints gridBagConstraintsTipoContrato;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoContratoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoContrato;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoContrato;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoContrato;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";
	
	public TipoContratoSessionBean tipocontratoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public FormatoSessionBean formatoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoContrato> tipocontratos;		
	public List<TipoContrato> tipocontratosEliminados;	
	public List<TipoContrato> tipocontratosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoContrato;		
	protected JButton jButtonAbrirOrderByTipoContrato;
	
	
	//protected JPanel jPanelOrderByTipoContrato;
	//public JScrollPane jScrollPanelOrderByTipoContrato;	
	//protected JButton jButtonCerrarOrderByTipoContrato;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoContratoLogic tipocontratoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoContrato;
	public JScrollPane jScrollPanelDatosEdicionTipoContrato;
	public JScrollPane jScrollPanelDatosGeneralTipoContrato;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoContratoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoContrato;
	//public JScrollPane jScrollPanelImportacionTipoContrato;
	
	
	
	protected JPanel jPanelAccionesTipoContrato;
	
    protected JPanel jPanelPaginacionTipoContrato;
    protected JPanel jPanelParametrosReportesTipoContrato;
	protected JPanel jPanelParametrosReportesAccionesTipoContrato;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoContrato;
	protected JPanel jPanelParametrosAuxiliar2TipoContrato;
	protected JPanel jPanelParametrosAuxiliar3TipoContrato;
	protected JPanel jPanelParametrosAuxiliar4TipoContrato;
	//protected JPanel jPanelParametrosAuxiliar5TipoContrato;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoContrato;
	//protected JPanel jPanelImportacionTipoContrato;
	
	
	public JTable jTableDatosTipoContrato;
	
	
	
	//public JTable jTableDatosTipoContratoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoContrato;
	protected JButton jButtonDuplicarTipoContrato;
	protected JButton jButtonCopiarTipoContrato;
	protected JButton jButtonVerFormTipoContrato;
	protected JButton jButtonNuevoRelacionesTipoContrato;
	protected JButton jButtonModificarTipoContrato;
	
    protected JButton jButtonGuardarCambiosTablaTipoContrato;
	protected JButton jButtonCerrarTipoContrato;
	
	
	protected JButton jButtonRecargarInformacionTipoContrato;
	protected JButton jButtonProcesarInformacionTipoContrato;
	
	
	protected JButton jButtonAnterioresTipoContrato;
	protected JButton jButtonSiguientesTipoContrato;
	protected JButton jButtonNuevoGuardarCambiosTipoContrato;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoContrato;
	//protected JButton jButtonCerrarReporteDinamicoTipoContrato;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoContrato;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoContrato;
	//protected JButton jButtonGenerarImportacionTipoContrato;
	//protected JButton jButtonCerrarImportacionTipoContrato;
	//protected JFileChooser jFileChooserImportacionTipoContrato;
	//protected File fileImportacionTipoContrato;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoContrato;
	protected JButton jButtonDuplicarToolBarTipoContrato;
	protected JButton jButtonNuevoRelacionesToolBarTipoContrato;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoContrato;
	protected JButton jButtonCopiarToolBarTipoContrato;
	protected JButton jButtonVerFormToolBarTipoContrato;
	public JButton jButtonGuardarCambiosTablaToolBarTipoContrato;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoContrato;
	protected JButton jButtonCerrarToolBarTipoContrato;
	
	protected JButton jButtonRecargarInformacionToolBarTipoContrato;
	protected JButton jButtonProcesarInformacionToolBarTipoContrato;
	protected JButton jButtonAnterioresToolBarTipoContrato;
	protected JButton jButtonSiguientesToolBarTipoContrato;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoContrato;
	protected JButton jButtonAbrirOrderByToolBarTipoContrato;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoContrato;
	protected JMenuItem jMenuItemDuplicarTipoContrato;
	protected JMenuItem jMenuItemNuevoRelacionesTipoContrato;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoContrato;
	protected JMenuItem jMenuItemCopiarTipoContrato;
	protected JMenuItem jMenuItemVerFormTipoContrato;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoContrato;
	protected JMenuItem jMenuItemCerrarTipoContrato;
	protected JMenuItem jMenuItemDetalleCerrarTipoContrato;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoContrato;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoContrato;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoContrato;
	protected JMenuItem jMenuItemProcesarInformacionTipoContrato;
	protected JMenuItem jMenuItemAnterioresTipoContrato;
	protected JMenuItem jMenuItemSiguientesTipoContrato;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoContrato;
	protected JMenuItem jMenuItemAbrirOrderByTipoContrato;
	protected JMenuItem jMenuItemMostrarOcultarTipoContrato;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoContrato;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoContrato;
	protected JCheckBox jCheckBoxSeleccionadosTipoContrato;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoContrato;
	protected JCheckBox jCheckBoxConGraficoReporteTipoContrato;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoContrato;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoContrato;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoContrato;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoContrato;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoContrato;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoContrato;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoContrato;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoContrato;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoContrato;
	protected JTextField jTextFieldValorCampoGeneralTipoContrato;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoContrato;
	//public JList<Reporte> jListColumnasSelectReporteTipoContrato;
	//public JScrollPane jScrollColumnasSelectReporteTipoContrato;
	
	//public JLabel jLabelRelacionesSelectReporteTipoContrato;
	//public JList<Reporte> jListRelacionesSelectReporteTipoContrato;
	//public JScrollPane jScrollRelacionesSelectReporteTipoContrato;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoContrato;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoContrato;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoContrato;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoContrato;
	
		
	//public JLabel jLabelArchivoImportacionTipoContrato;	
	//public JLabel jLabelPathArchivoImportacionTipoContrato;
	//protected JTextField jTextFieldPathArchivoImportacionTipoContrato;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoContrato;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoContrato;
	
	//public JLabel jLabelColumnaCategoriaValorTipoContrato;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoContrato;
	
	//public JLabel jLabelColumnasValoresGraficoTipoContrato;
	//public JList<Reporte> jListColumnasValoresGraficoTipoContrato;
	//public JScrollPane jScrollColumnasValoresGraficoTipoContrato;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoContrato;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoContrato;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoContrato;
	public JPanel jPanelFK_IdTipoContratoTipoContrato;
	public JButton jButtonFK_IdTipoContratoTipoContrato;
	
	public JPanel jPanelid_formatoFK_IdTipoContratoTipoContrato;
	public JLabel jLabelid_formatoFK_IdTipoContratoTipoContrato;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoFK_IdTipoContratoTipoContrato;
	public JButton jButtonid_formatoFK_IdTipoContratoTipoContrato= new JButtonMe();
	public JButton jButtonid_formatoFK_IdTipoContratoTipoContratoUpdate= new JButtonMe();
	public JButton jButtonid_formatoFK_IdTipoContratoTipoContratoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoContratoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoContrato No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoContratoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoContrato No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoContratoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoContrato No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoContratoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoContrato No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoContrato)	{
		this.jButtonRecargarInformacionTipoContrato = jButtonRecargarInformacionTipoContrato;
	}
	
	public JButton getjButtonProcesarInformacionTipoContrato() {
		return this.jButtonProcesarInformacionTipoContrato;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoContrato)	{
		this.jButtonProcesarInformacionTipoContrato = jButtonProcesarInformacionTipoContrato;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoContrato() {
		return this.jButtonRecargarInformacionTipoContrato;
	}
	
	
	public List<TipoContrato> gettipocontratos() {
		return this.tipocontratos;
	}

	public void settipocontratos(List<TipoContrato> tipocontratos) {
		this.tipocontratos = tipocontratos;
	}
	
	public List<TipoContrato> gettipocontratosAux() {
		return this.tipocontratosAux;
	}

	public void settipocontratosAux(List<TipoContrato> tipocontratosAux) {
		this.tipocontratosAux = tipocontratosAux;
	}
	
	public List<TipoContrato> gettipocontratosEliminados() {
		return this.tipocontratosEliminados;
	}

	public void setTipoContratosEliminados(List<TipoContrato> tipocontratosEliminados) {
		this.tipocontratosEliminados = tipocontratosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoContrato() {
		return jComboBoxTiposSeleccionarTipoContrato;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoContrato(
			JComboBox jComboBoxTiposSeleccionarTipoContrato) {
		this.jComboBoxTiposSeleccionarTipoContrato = jComboBoxTiposSeleccionarTipoContrato;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoContrato() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoContrato.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoContrato .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoContrato() {
		return jTextFieldValorCampoGeneralTipoContrato;
	}

	public void setjTextFieldValorCampoGeneralTipoContrato(
			JTextField jTextFieldValorCampoGeneralTipoContrato) {
		this.jTextFieldValorCampoGeneralTipoContrato = jTextFieldValorCampoGeneralTipoContrato;
	}

	public void setBorderResaltarValorCampoGeneralTipoContrato() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoContrato.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoContrato .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoContrato() {
		return this.jCheckBoxSeleccionarTodosTipoContrato;
	}

	public void setjCheckBoxSeleccionarTodosTipoContrato(
			JCheckBox jCheckBoxSeleccionarTodosTipoContrato) {
		this.jCheckBoxSeleccionarTodosTipoContrato = jCheckBoxSeleccionarTodosTipoContrato;
	}

	public void setBorderResaltarSeleccionarTodosTipoContrato() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoContrato.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoContrato .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoContrato() {
		return this.jCheckBoxSeleccionadosTipoContrato;
	}

	public void setjCheckBoxSeleccionadosTipoContrato(
			JCheckBox jCheckBoxSeleccionadosTipoContrato) {
		this.jCheckBoxSeleccionadosTipoContrato = jCheckBoxSeleccionadosTipoContrato;
	}
	
	public void setBorderResaltarSeleccionadosTipoContrato() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoContrato.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoContrato .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoContrato() {
		return this.jComboBoxTiposArchivosReportesTipoContrato;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoContrato(
			JComboBox jComboBoxTiposArchivosReportesTipoContrato) {
		this.jComboBoxTiposArchivosReportesTipoContrato = jComboBoxTiposArchivosReportesTipoContrato;
	}

	public void setBorderResaltarTiposArchivosReportesTipoContrato() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoContrato.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoContrato .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoContrato() {
		return this.jComboBoxTiposReportesTipoContrato;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoContrato(
			JComboBox jComboBoxTiposReportesTipoContrato) {
		this.jComboBoxTiposReportesTipoContrato = jComboBoxTiposReportesTipoContrato;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoContrato() {
	//	return jComboBoxTiposReportesDinamicoTipoContrato;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoContrato(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoContrato) {
	//	this.jComboBoxTiposReportesDinamicoTipoContrato = jComboBoxTiposReportesDinamicoTipoContrato;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoContrato() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoContrato;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoContrato(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoContrato) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoContrato = jComboBoxTiposArchivosReportesDinamicoTipoContrato;
	//}
	
	public void setBorderResaltarTiposReportesTipoContrato() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoContrato.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoContrato .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoContrato() {
		return this.jComboBoxTiposGraficosReportesTipoContrato;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoContrato(
			JComboBox jComboBoxTiposGraficosReportesTipoContrato) {
		this.jComboBoxTiposGraficosReportesTipoContrato = jComboBoxTiposGraficosReportesTipoContrato;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoContrato() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoContrato.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoContrato .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoContrato() {
		return this.jComboBoxTiposPaginacionTipoContrato;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoContrato(
			JComboBox jComboBoxTiposPaginacionTipoContrato) {
		this.jComboBoxTiposPaginacionTipoContrato = jComboBoxTiposPaginacionTipoContrato;
	}
	
	public void setBorderResaltarTiposPaginacionTipoContrato() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoContrato.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoContrato .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoContrato() {
		return this.jComboBoxTiposRelacionesTipoContrato;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoContrato() {
		return this.jComboBoxTiposAccionesTipoContrato;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoContrato(
			JComboBox jComboBoxTiposRelacionesTipoContrato) {
		this.jComboBoxTiposRelacionesTipoContrato = jComboBoxTiposRelacionesTipoContrato;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoContrato(
			JComboBox jComboBoxTiposAccionesTipoContrato) {
		this.jComboBoxTiposAccionesTipoContrato = jComboBoxTiposAccionesTipoContrato;
	}
	
	public void setBorderResaltarTiposRelacionesTipoContrato() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoContrato.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoContrato .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoContrato() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoContrato.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoContrato .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoContrato() {
	//	return jCheckBoxConGraficoDinamicoTipoContrato;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoContrato(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoContrato) {
	//	this.jCheckBoxConGraficoDinamicoTipoContrato = jCheckBoxConGraficoDinamicoTipoContrato;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoContrato() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoContrato.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoContrato .setBorder(borderResaltar);		
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
		this.tipocontratoSessionBean=new TipoContratoSessionBean();
		
		this.tipocontratoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocontratoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocontratoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoContratoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoContratoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoContratoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoContratoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoContratoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Contrato MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipocontratoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoContratoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoContrato No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoContrato= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoContrato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoContrato,this.jTtoolBarTipoContrato,
							"nuevo","nuevo","Nuevo"+" "+TipoContratoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoContrato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoContrato,this.jTtoolBarTipoContrato,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoContrato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoContrato,this.jTtoolBarTipoContrato,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoContratoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoContrato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoContrato,this.jTtoolBarTipoContrato,
							"duplicar","duplicar","Duplicar"+" "+TipoContratoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoContrato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoContrato,this.jTtoolBarTipoContrato,
							"copiar","copiar","Copiar"+" "+TipoContratoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoContrato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoContrato,this.jTtoolBarTipoContrato,
							"ver_form","ver_form","Ver"+" "+TipoContratoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoContrato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoContrato,this.jTtoolBarTipoContrato,
							"recargar","recargar","Recargar"+" "+TipoContratoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoContrato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoContrato,this.jTtoolBarTipoContrato,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoContrato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoContrato,this.jTtoolBarTipoContrato,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoContrato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoContrato,this.jTtoolBarTipoContrato,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoContrato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoContrato,this.jTtoolBarTipoContrato,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoContrato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoContrato,this.jTtoolBarTipoContrato,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoContratoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoContrato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoContrato,this.jTtoolBarTipoContrato,
							"cerrar","cerrar","Salir"+" "+TipoContratoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoContrato=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoContrato;
			
				this.jButtonProcesarInformacionToolBarTipoContrato=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoContrato;
				
		//protected JButton jButtonModificarToolBarTipoContrato;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoContrato=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoContrato=new JMenuMe("General");
		this.jmenuArchivoTipoContrato=new JMenuMe("Archivo");
		this.jmenuAccionesTipoContrato=new JMenuMe("Acciones");
		this.jmenuDatosTipoContrato=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoContrato= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoContrato.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoContrato,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoContrato= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoContrato.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoContrato,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoContrato= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoContrato.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoContrato,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoContrato= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoContrato.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoContrato,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoContrato= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoContrato.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoContrato,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoContrato= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoContrato.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoContrato,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoContrato= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoContrato.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoContrato,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoContrato= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoContrato.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoContrato,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoContrato= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoContrato.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoContrato,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoContrato= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoContrato.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoContrato,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoContrato= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoContrato.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoContrato,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoContrato= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoContrato.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoContrato,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoContrato= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoContrato.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoContrato,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoContrato= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoContrato.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoContrato,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoContrato= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoContrato.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoContrato,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoContrato= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoContrato.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoContrato,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoContrato= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoContrato.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoContrato,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoContrato.add(this.jMenuItemCerrarTipoContrato);
			
			this.jmenuAccionesTipoContrato.add(this.jMenuItemNuevoTipoContrato);
			this.jmenuAccionesTipoContrato.add(this.jMenuItemNuevoGuardarCambiosTipoContrato);
			this.jmenuAccionesTipoContrato.add(this.jMenuItemNuevoRelacionesTipoContrato);
			this.jmenuAccionesTipoContrato.add(this.jMenuItemGuardarCambiosTablaTipoContrato);		
			this.jmenuAccionesTipoContrato.add(this.jMenuItemDuplicarTipoContrato);		
			this.jmenuAccionesTipoContrato.add(this.jMenuItemCopiarTipoContrato);		
			this.jmenuAccionesTipoContrato.add(this.jMenuItemVerFormTipoContrato);		
			
			this.jmenuDatosTipoContrato.add(this.jMenuItemRecargarInformacionTipoContrato);				
			this.jmenuDatosTipoContrato.add(this.jMenuItemAnterioresTipoContrato);				
			this.jmenuDatosTipoContrato.add(this.jMenuItemSiguientesTipoContrato);				
			this.jmenuDatosTipoContrato.add(this.jMenuItemAbrirOrderByTipoContrato);				
			this.jmenuDatosTipoContrato.add(this.jMenuItemMostrarOcultarTipoContrato);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoContrato.add(this.jMenuItemGuardarCambiosTipoContrato);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoContrato.add(this.jmenuArchivoTipoContrato);		
			this.jmenuBarTipoContrato.add(this.jmenuAccionesTipoContrato);		
			this.jmenuBarTipoContrato.add(this.jmenuDatosTipoContrato);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoContrato);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoContrato() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdTipoContratoTipoContrato=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoContratoTipoContrato.setToolTipText("Buscar Por Formato ");
		this.jButtonFK_IdTipoContratoTipoContrato= new JButtonMe();
		this.jButtonFK_IdTipoContratoTipoContrato.setText("Buscar");
		this.jButtonFK_IdTipoContratoTipoContrato.setToolTipText("Buscar Por Formato ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoContratoTipoContrato,"buscar_button","Buscar Por Formato ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoContratoTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formatoFK_IdTipoContratoTipoContrato = new JLabelMe();
		jLabelid_formatoFK_IdTipoContratoTipoContrato.setText("Formato :");
		jLabelid_formatoFK_IdTipoContratoTipoContrato.setToolTipText("Formato");
		jLabelid_formatoFK_IdTipoContratoTipoContrato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formatoFK_IdTipoContratoTipoContrato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formatoFK_IdTipoContratoTipoContrato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_formatoFK_IdTipoContratoTipoContrato,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formatoFK_IdTipoContratoTipoContrato= new JComboBoxMe();
		jComboBoxid_formatoFK_IdTipoContratoTipoContrato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoFK_IdTipoContratoTipoContrato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoFK_IdTipoContratoTipoContrato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoFK_IdTipoContratoTipoContrato,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoContrato=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoContrato.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoContrato.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoContrato.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoContrato.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoContrato.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoContrato,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoContrato = new TipoContratoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Contrato DATOS");
			this.jInternalFrameDetalleFormTipoContrato = new TipoContratoDetalleFormJInternalFrame(jDesktopPane,this.tipocontratoSessionBean.getConGuardarRelaciones(),this.tipocontratoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoContrato = null;//new TipoContratoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoContrato= new GridBagLayout();
		
		
		this.jTableDatosTipoContrato = new JTableMe();      
		
		String sToolTipTipoContrato="";
		sToolTipTipoContrato=TipoContratoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoContrato+="(Nomina.TipoContrato)";
		}
		
		if(!this.tipocontratoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoContrato+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoContrato.setToolTipText(sToolTipTipoContrato);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoContrato);
		this.jTableDatosTipoContrato.setAutoCreateRowSorter(true);
		this.jTableDatosTipoContrato.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoContrato.setRowSelectionAllowed(true);
		this.jTableDatosTipoContrato.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoContrato,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoContrato = new JButtonMe();
		this.jButtonDuplicarTipoContrato = new JButtonMe();
		this.jButtonCopiarTipoContrato = new JButtonMe();
		this.jButtonVerFormTipoContrato = new JButtonMe();
		this.jButtonNuevoRelacionesTipoContrato = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoContrato = new JButtonMe();
		this.jButtonCerrarTipoContrato = new JButtonMe();
		
		this.jScrollPanelDatosTipoContrato = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoContrato = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoContrato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Contrato";
		
		if(!this.tipocontratoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoContrato.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Contratos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoContrato.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoContrato.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoContrato.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoContrato.setToolTipText("Acciones");
        this.jPanelAccionesTipoContrato.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoContrato, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoContrato, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoContrato=new ReporteDinamicoJInternalFrame(TipoContratoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoContrato();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoContrato=new ImportacionJInternalFrame(TipoContratoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoContrato();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoContrato = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoContrato.setText("Orden");
		this.jButtonAbrirOrderByTipoContrato.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoContrato,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoContrato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoContrato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoContrato=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoContrato,false,this);
			
			//this.cargarOrderByTipoContrato(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoContrato=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoContrato,true,this);
			
			//this.cargarOrderByTipoContrato(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoContrato.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosTipoContrato.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosTipoContrato.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosTipoContrato.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoContrato.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoContrato.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoContrato.setText("Nuevo");
		this.jButtonDuplicarTipoContrato.setText("Duplicar");
		this.jButtonCopiarTipoContrato.setText("Copiar");
		this.jButtonVerFormTipoContrato.setText("Ver");
		this.jButtonNuevoRelacionesTipoContrato.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoContrato.setText("Guardar");
		this.jButtonCerrarTipoContrato.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoContrato,"nuevo_button","Nuevo",this.tipocontratoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoContrato,"duplicar_button","Duplicar",this.tipocontratoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoContrato,"copiar_button","Copiar",this.tipocontratoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoContrato,"ver_form","Ver",this.tipocontratoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoContrato,"nuevorelaciones_button","Nuevo Rel",this.tipocontratoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoContrato,"guardarcambiostabla_button","Guardar",this.tipocontratoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoContrato,"cerrar_button","Salir",this.tipocontratoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoContrato.setToolTipText("Nuevo"+" "+TipoContratoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoContrato.setToolTipText("Duplicar"+" "+TipoContratoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoContrato.setToolTipText("Copiar"+" "+TipoContratoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoContrato.setToolTipText("Ver"+" "+TipoContratoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoContrato.setToolTipText("Nuevo Rel"+" "+TipoContratoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoContrato.setToolTipText("Guardar"+" "+TipoContratoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoContrato.setToolTipText("Salir"+" "+TipoContratoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoContrato";
		inputMap = this.jButtonNuevoTipoContrato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoContrato.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoContrato"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoContrato";
		inputMap = this.jButtonDuplicarTipoContrato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoContrato.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoContrato"));
		
		//COPIAR
		sMapKey = "CopiarTipoContrato";
		inputMap = this.jButtonCopiarTipoContrato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoContrato.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoContrato"));
		
		//VEr FORM
		sMapKey = "VerFormTipoContrato";
		inputMap = this.jButtonVerFormTipoContrato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoContrato.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoContrato"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoContrato";
		inputMap = this.jButtonNuevoRelacionesTipoContrato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoContrato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoContrato"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoContrato";
		inputMap = this.jButtonModificarTipoContrato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoContrato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoContrato"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoContrato";
		inputMap = this.jButtonCerrarTipoContrato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoContrato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoContrato"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoContrato";
		inputMap = this.jButtonGuardarCambiosTablaTipoContrato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoContrato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoContrato"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoContrato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoContrato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoContrato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoContrato= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoContrato= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoContrato= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoContrato= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoContrato= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoContrato.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoContrato.setName("jPanelParametrosReportesTipoContrato"); 
		
		this.jPanelParametrosReportesAccionesTipoContrato.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoContrato.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoContrato.setName("jPanelParametrosReportesAccionesTipoContrato"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoContrato, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoContrato, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoContrato = new JButtonMe();
		this.jButtonRecargarInformacionTipoContrato.setText("Recargar");
		this.jButtonRecargarInformacionTipoContrato.setToolTipText("Recargar"+" "+TipoContratoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoContrato,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoContrato = new JButtonMe();
		this.jButtonProcesarInformacionTipoContrato.setText("Procesar");
		this.jButtonProcesarInformacionTipoContrato.setToolTipText("Procesar"+" "+TipoContratoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoContrato.setVisible(false);
			
		this.jButtonProcesarInformacionTipoContrato.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoContrato.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoContrato.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoContrato = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoContrato.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoContrato.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoContrato = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoContrato.setText("TIPO");       
		this.jComboBoxTiposReportesTipoContrato.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoContrato = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoContrato.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoContrato.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoContrato = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoContrato.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoContrato.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoContrato = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoContrato.setText("Accion");
		this.jComboBoxTiposRelacionesTipoContrato.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoContrato = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoContrato.setText("Accion");
		this.jComboBoxTiposAccionesTipoContrato.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoContrato = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoContrato.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoContrato.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoContrato=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoContrato.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoContrato.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoContrato.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoContrato = new JLabelMe();
		
		this.jLabelAccionesTipoContrato.setText("Acciones");		
		this.jLabelAccionesTipoContrato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoContrato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoContrato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoContrato = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoContrato.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoContrato.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoContrato = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoContrato.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoContrato.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoContrato = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoContrato.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoContrato.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoContrato = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoContrato.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoContrato.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoContrato = new JButtonMe();
		//this.jButtonAnterioresTipoContrato.setText("<<");
        this.jButtonAnterioresTipoContrato.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoContrato,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoContrato = new JButtonMe();
		//this.jButtonSiguientesTipoContrato.setText(">>");
        this.jButtonSiguientesTipoContrato.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoContrato,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoContrato = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoContrato.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoContrato.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoContrato,"nuevoguardarcambios_button","Nue",this.tipocontratoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoContrato";
		inputMap = this.jButtonNuevoGuardarCambiosTipoContrato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoContrato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoContrato"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoContrato";
		inputMap = this.jButtonRecargarInformacionTipoContrato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoContrato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoContrato"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoContrato";
		inputMap = this.jButtonSiguientesTipoContrato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoContrato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoContrato"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoContrato";
		inputMap = this.jButtonAnterioresTipoContrato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoContrato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoContrato"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoContrato();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoContrato.setMinimumSize(new Dimension(this.getWidth(),TipoContratoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoContratoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoContrato.setMaximumSize(new Dimension(this.getWidth(),TipoContratoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoContratoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoContrato.setPreferredSize(new Dimension(this.getWidth(),TipoContratoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoContratoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoContrato = new GridBagLayout();

			this.jPanelPaginacionTipoContrato.setLayout(gridaBagLayoutPaginacionTipoContrato);						
			
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			this.gridBagConstraintsTipoContrato.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoContrato.gridy = 0;
			this.gridBagConstraintsTipoContrato.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoContrato.add(this.jButtonAnterioresTipoContrato, this.gridBagConstraintsTipoContrato);
					
						
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			this.gridBagConstraintsTipoContrato.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoContrato.gridy = 0;
			
			this.jPanelPaginacionTipoContrato.add(this.jButtonNuevoGuardarCambiosTipoContrato, this.gridBagConstraintsTipoContrato);
						
			
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			this.gridBagConstraintsTipoContrato.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoContrato.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoContrato.gridy = 0;
			this.jPanelPaginacionTipoContrato.add(this.jButtonSiguientesTipoContrato, this.gridBagConstraintsTipoContrato);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoContrato.gridy = 1;
			this.gridBagConstraintsTipoContrato.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoContrato.add(this.jButtonNuevoTipoContrato, this.gridBagConstraintsTipoContrato);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoContrato = new GridBagConstraints();
				this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoContrato.gridy = 1;
				this.gridBagConstraintsTipoContrato.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoContrato.add(this.jButtonNuevoRelacionesTipoContrato, this.gridBagConstraintsTipoContrato);
			}
			
			
			if(!this.tipocontratoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoContrato = new GridBagConstraints();
				this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoContrato.gridy = 1;
				this.gridBagConstraintsTipoContrato.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoContrato.add(this.jButtonGuardarCambiosTablaTipoContrato, this.gridBagConstraintsTipoContrato);
			}
			
			
			
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoContrato.gridy = 1;
			this.gridBagConstraintsTipoContrato.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoContrato.add(this.jButtonDuplicarTipoContrato, this.gridBagConstraintsTipoContrato);
			
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoContrato.gridy = 1;
			this.gridBagConstraintsTipoContrato.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoContrato.add(this.jButtonCopiarTipoContrato, this.gridBagConstraintsTipoContrato);
		
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoContrato.gridy = 1;
			this.gridBagConstraintsTipoContrato.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoContrato.add(this.jButtonVerFormTipoContrato, this.gridBagConstraintsTipoContrato);
		
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoContrato.gridy = 1;
			this.gridBagConstraintsTipoContrato.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoContrato.add(this.jButtonCerrarTipoContrato, this.gridBagConstraintsTipoContrato);
		
		
		
		this.jButtonRecargarInformacionTipoContrato.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoContrato.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoContrato.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoContrato.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoContrato.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoContrato.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoContrato.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoContrato.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoContrato.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoContrato.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoContrato.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoContrato.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoContrato.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoContrato.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoContrato.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoContrato.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoContrato.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoContrato.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoContrato.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoContrato.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoContrato.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoContrato.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoContrato.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoContrato.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoContrato.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoContrato.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoContrato.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoContrato.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoContrato.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoContrato.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoContrato.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoContrato.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoContrato.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoContrato.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoContrato.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoContrato.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoContrato = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoContrato = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoContrato = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoContrato = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoContrato = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoContrato = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoContrato.setLayout(gridaBagParametrosReportesTipoContrato);
			this.jPanelParametrosReportesAccionesTipoContrato.setLayout(gridaBagParametrosReportesAccionesTipoContrato);
			
			
			this.jPanelParametrosAuxiliar1TipoContrato.setLayout(gridaBagParametrosAuxiliar1TipoContrato);
			this.jPanelParametrosAuxiliar2TipoContrato.setLayout(gridaBagParametrosAuxiliar2TipoContrato);
			this.jPanelParametrosAuxiliar3TipoContrato.setLayout(gridaBagParametrosAuxiliar3TipoContrato);
			this.jPanelParametrosAuxiliar4TipoContrato.setLayout(gridaBagParametrosAuxiliar4TipoContrato);
			//this.jPanelParametrosAuxiliar5TipoContrato.setLayout(gridaBagParametrosAuxiliar2TipoContrato);			
			
			
			
			
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoContrato.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoContrato.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoContrato.add(this.jButtonRecargarInformacionTipoContrato, this.gridBagConstraintsTipoContrato);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			this.gridBagConstraintsTipoContrato.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoContrato.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoContrato.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoContrato.add(this.jComboBoxTiposPaginacionTipoContrato, this.gridBagConstraintsTipoContrato);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			this.gridBagConstraintsTipoContrato.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoContrato.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoContrato.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoContrato.add(this.jCheckBoxConAltoMaximoTablaTipoContrato, this.gridBagConstraintsTipoContrato);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			this.gridBagConstraintsTipoContrato.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoContrato.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoContrato.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoContrato.add(this.jComboBoxTiposArchivosReportesTipoContrato, this.gridBagConstraintsTipoContrato);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			this.gridBagConstraintsTipoContrato.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoContrato.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoContrato.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoContrato.add(this.jPanelParametrosAuxiliar1TipoContrato, this.gridBagConstraintsTipoContrato);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			this.gridBagConstraintsTipoContrato.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoContrato.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoContrato.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoContrato.add(this.jComboBoxTiposReportesTipoContrato, this.gridBagConstraintsTipoContrato);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			this.gridBagConstraintsTipoContrato.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoContrato.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoContrato.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoContrato.add(this.jPanelParametrosAuxiliar4TipoContrato, this.gridBagConstraintsTipoContrato);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			this.gridBagConstraintsTipoContrato.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoContrato.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoContrato.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoContrato.add(this.jComboBoxTiposReportesTipoContrato, this.gridBagConstraintsTipoContrato);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			this.gridBagConstraintsTipoContrato.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoContrato.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoContrato.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoContrato.add(this.jCheckBoxGenerarReporteTipoContrato, this.gridBagConstraintsTipoContrato);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			this.gridBagConstraintsTipoContrato.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoContrato.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoContrato.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoContrato.add(this.jPanelParametrosAuxiliar2TipoContrato, this.gridBagConstraintsTipoContrato);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoContrato.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoContrato.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoContrato.add(this.jLabelAccionesTipoContrato, this.gridBagConstraintsTipoContrato);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoContrato = new GridBagConstraints();
				this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoContrato.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoContrato.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoContrato.add(this.jButtonAbrirOrderByTipoContrato, this.gridBagConstraintsTipoContrato);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoContrato.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoContrato.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoContrato.add(this.jComboBoxTiposSeleccionarTipoContrato, this.gridBagConstraintsTipoContrato);			
			
			
			/*
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoContrato.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoContrato.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoContrato.add(this.jCheckBoxSeleccionarTodosTipoContrato, this.gridBagConstraintsTipoContrato);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			this.gridBagConstraintsTipoContrato.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoContrato.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoContrato.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoContrato.add(this.jCheckBoxSeleccionarTodosTipoContrato, this.gridBagConstraintsTipoContrato);															
				
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			this.gridBagConstraintsTipoContrato.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoContrato.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoContrato.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoContrato.add(this.jCheckBoxSeleccionadosTipoContrato, this.gridBagConstraintsTipoContrato);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			this.gridBagConstraintsTipoContrato.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoContrato.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoContrato.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoContrato.add(this.jPanelParametrosAuxiliar3TipoContrato, this.gridBagConstraintsTipoContrato);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			this.gridBagConstraintsTipoContrato.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoContrato.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoContrato.add(this.jComboBoxTiposRelacionesTipoContrato, this.gridBagConstraintsTipoContrato);
				
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			this.gridBagConstraintsTipoContrato.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoContrato.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoContrato.add(this.jComboBoxTiposAccionesTipoContrato, this.gridBagConstraintsTipoContrato);
	
				
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			this.gridBagConstraintsTipoContrato.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoContrato.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoContrato.add(this.jTextFieldValorCampoGeneralTipoContrato, this.gridBagConstraintsTipoContrato);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoContrato = new GridBagLayout();

			this.jScrollPanelDatosTipoContrato.setLayout(gridaBagLayoutDatosTipoContrato);
			
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoContrato.gridy = 0;
			this.gridBagConstraintsTipoContrato.gridx = 0;
			
			this.jScrollPanelDatosTipoContrato.add(this.jTableDatosTipoContrato, this.gridBagConstraintsTipoContrato);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoContrato.setViewportView(this.jTableDatosTipoContrato);
		this.jTableDatosTipoContrato.setFillsViewportHeight(true);
		this.jTableDatosTipoContrato.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoContrato= new GridBagLayout();
		this.jPanelAccionesTipoContrato.setLayout(gridaBagLayoutAccionesTipoContrato);
		
		
		/*	
		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoContrato.gridy = 0;
		this.gridBagConstraintsTipoContrato.gridx = 0;
			
		this.jPanelAccionesTipoContrato.add(this.jButtonNuevoTipoContrato, this.gridBagConstraintsTipoContrato);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdTipoContratoTipoContrato= new GridBagLayout();
		gridaBagLayoutFK_IdTipoContratoTipoContrato.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoContratoTipoContrato.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoContratoTipoContrato.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoContratoTipoContrato.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoContratoTipoContrato.setLayout(gridaBagLayoutFK_IdTipoContratoTipoContrato);

		gridBagConstraintsTipoContrato = new GridBagConstraints();
		gridBagConstraintsTipoContrato.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoContrato.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoContrato.gridy = 0;
		gridBagConstraintsTipoContrato.gridx = 0;
		jPanelFK_IdTipoContratoTipoContrato.add(jLabelid_formatoFK_IdTipoContratoTipoContrato, gridBagConstraintsTipoContrato);

		gridBagConstraintsTipoContrato = new GridBagConstraints();
		gridBagConstraintsTipoContrato.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoContrato.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoContrato.gridy = 0;
		gridBagConstraintsTipoContrato.gridx = 1;
		jPanelFK_IdTipoContratoTipoContrato.add(jComboBoxid_formatoFK_IdTipoContratoTipoContrato, gridBagConstraintsTipoContrato);

		gridBagConstraintsTipoContrato = new GridBagConstraints();
		gridBagConstraintsTipoContrato.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoContrato.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoContrato.gridy = 1;
		gridBagConstraintsTipoContrato.gridx =1;
		jPanelFK_IdTipoContratoTipoContrato.add(jButtonFK_IdTipoContratoTipoContrato, gridBagConstraintsTipoContrato);

		jTabbedPaneBusquedasTipoContrato.addTab("1.-Por Formato ", jPanelFK_IdTipoContratoTipoContrato);
		jTabbedPaneBusquedasTipoContrato.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoContrato = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoContrato);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocontratoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();						
			this.gridBagConstraintsTipoContrato.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoContrato.gridx = 0;		
			//this.gridBagConstraintsTipoContrato.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoContrato.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoContrato.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoContrato, this.gridBagConstraintsTipoContrato);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoContrato.gridx = 0;		
		//this.gridBagConstraintsTipoContrato.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoContrato.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoContrato.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoContrato);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoContrato.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoContrato.gridx = 0;		
			this.gridBagConstraintsTipoContrato.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoContrato.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoContrato.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoContrato, this.gridBagConstraintsTipoContrato);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoContrato.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoContrato, this.gridBagConstraintsTipoContrato);								
		
		
		/*
		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoContrato.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoContrato, this.gridBagConstraintsTipoContrato);
		*/		
		
		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoContrato.gridx =0;
		this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoContrato.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoContrato, this.gridBagConstraintsTipoContrato);
				
		
		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoContrato.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoContrato, this.gridBagConstraintsTipoContrato);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoContratoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoContrato= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoContrato = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoContrato.setLayout(gridaBagLayoutBusquedasParametrosTipoContrato);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoContrato=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoContrato.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoContrato.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoContrato.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoContrato.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoContrato, this.gridBagConstraintsTipoContrato);
			
			
		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoContrato.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoContrato, this.gridBagConstraintsTipoContrato);
		
			
		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoContrato.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoContrato, this.gridBagConstraintsTipoContrato);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoContrato;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoContrato() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoContrato = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoContrato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoContrato.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoContrato.setName("jPanelReporteDinamicoTipoContrato"); 
		
		this.jPanelReporteDinamicoTipoContrato.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoContrato.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoContrato.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoContrato.setLayout(gridaBagLayoutReporteDinamicoTipoContrato);
		
		
		this.jInternalFrameReporteDinamicoTipoContrato= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoContrato = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoContrato= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoContrato.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoContrato.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoContrato.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoContrato.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoContrato.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoContrato.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoContrato.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoContrato.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoContrato.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoContrato.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoContrato.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoContrato.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Contratos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoContrato = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoContrato.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoContrato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoContrato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoContrato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoContrato.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoContrato.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoContrato.add(this.jLabelColumnasSelectReporteTipoContrato, this.gridBagConstraintsTipoContrato);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoContrato = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoContrato.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoContrato.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoContrato.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoContrato.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoContrato.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoContrato=new JScrollPane(this.jListColumnasSelectReporteTipoContrato);
			
			this.jScrollColumnasSelectReporteTipoContrato.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoContrato.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoContrato.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoContrato.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoContrato.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoContrato.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoContrato.add(this.jListColumnasSelectReporteTipoContrato, this.gridBagConstraintsTipoContrato);
		this.jPanelReporteDinamicoTipoContrato.add(this.jScrollColumnasSelectReporteTipoContrato, this.gridBagConstraintsTipoContrato);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoContrato = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoContrato.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoContrato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoContrato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoContrato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoContrato.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoContrato.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoContrato.add(this.jLabelRelacionesSelectReporteTipoContrato, this.gridBagConstraintsTipoContrato);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoContrato = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoContrato.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoContrato.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoContrato.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoContrato.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoContrato.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoContrato=new JScrollPane(this.jListRelacionesSelectReporteTipoContrato);
			
			this.jScrollRelacionesSelectReporteTipoContrato.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoContrato.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoContrato.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoContrato.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoContrato.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoContrato.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoContrato.add(this.jListRelacionesSelectReporteTipoContrato, this.gridBagConstraintsTipoContrato);
		this.jPanelReporteDinamicoTipoContrato.add(this.jScrollRelacionesSelectReporteTipoContrato, this.gridBagConstraintsTipoContrato);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoContrato = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoContrato = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoContrato = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoContrato = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoContrato.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoContrato.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoContrato.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoContrato.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoContrato = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoContrato.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoContrato.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoContrato.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoContrato.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoContrato = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoContrato.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoContrato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoContrato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoContrato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoContrato.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoContrato.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoContrato.add(this.jLabelGenerarExcelReporteDinamicoTipoContrato, this.gridBagConstraintsTipoContrato);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoContrato = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoContrato.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoContrato,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoContrato.setToolTipText("Generar EXCEL"+" "+TipoContratoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		//this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoContrato.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoContrato.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoContrato.add(this.jButtonGenerarExcelReporteDinamicoTipoContrato, this.gridBagConstraintsTipoContrato);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoContrato.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoContrato.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoContrato.add(this.jComboBoxTiposReportesDinamicoTipoContrato, this.gridBagConstraintsTipoContrato);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoContrato = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoContrato.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoContrato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoContrato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoContrato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoContrato.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoContrato.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoContrato.add(this.jLabelTiposArchivoReporteDinamicoTipoContrato, this.gridBagConstraintsTipoContrato);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoContrato.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoContrato.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoContrato.add(this.jComboBoxTiposArchivosReportesDinamicoTipoContrato, this.gridBagConstraintsTipoContrato);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoContrato = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoContrato.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoContrato,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoContrato.setToolTipText("Generar"+" "+TipoContratoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoContrato.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoContrato.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoContrato.add(this.jButtonGenerarReporteDinamicoTipoContrato, this.gridBagConstraintsTipoContrato);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoContrato = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoContrato.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoContrato,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoContrato.setToolTipText("Cancelar"+" "+TipoContratoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoContrato.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoContrato.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoContrato.add(this.jButtonCerrarReporteDinamicoTipoContrato, this.gridBagConstraintsTipoContrato);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoContrato = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoContrato= new JScrollPane(jPanelReporteDinamicoTipoContrato,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoContrato.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoContrato.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoContrato.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoContrato.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Contratos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoContrato.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoContrato.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoContrato.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoContrato);
		this.jInternalFrameReporteDinamicoTipoContrato.getContentPane().add(this.jScrollPanelReporteDinamicoTipoContrato, this.gridBagConstraintsTipoContrato);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoContrato() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoContrato = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoContrato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoContrato.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoContrato.setName("jPanelImportacionTipoContrato"); 
		
		this.jPanelImportacionTipoContrato.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoContrato.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoContrato.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoContrato.setLayout(gridaBagLayoutImportacionTipoContrato);
		
		
		this.jInternalFrameImportacionTipoContrato= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoContrato= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoContrato = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoContrato= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoContrato.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoContrato.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoContrato.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoContrato.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoContrato.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoContrato.setResizable(true);
	    this.jInternalFrameImportacionTipoContrato.setClosable(true);
	    this.jInternalFrameImportacionTipoContrato.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoContrato.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoContrato.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoContrato.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoContrato.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoContrato.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoContrato.setResizable(true);
	    this.jInternalFrameImportacionTipoContrato.setClosable(true);
	    this.jInternalFrameImportacionTipoContrato.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoContrato.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoContrato.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoContrato.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoContrato.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Contratos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoContrato = new JLabelMe();

		this.jLabelArchivoImportacionTipoContrato.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoContrato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoContrato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoContrato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoContrato.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoContrato.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoContrato.add(this.jLabelArchivoImportacionTipoContrato, this.gridBagConstraintsTipoContrato);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoContrato = new JFileChooser();		
		this.jFileChooserImportacionTipoContrato.setToolTipText("ESCOGER ARCHIVO"+" "+TipoContratoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoContrato = new JButtonMe();
		this.jButtonAbrirImportacionTipoContrato.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoContrato,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoContrato.setToolTipText("Generar"+" "+TipoContratoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoContrato.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoContrato.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoContrato.add(this.jButtonAbrirImportacionTipoContrato, this.gridBagConstraintsTipoContrato);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoContrato = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoContrato.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoContrato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoContrato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoContrato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoContrato.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoContrato.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoContrato.add(this.jLabelPathArchivoImportacionTipoContrato, this.gridBagConstraintsTipoContrato);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoContrato=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoContrato.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoContrato.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoContrato.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoContrato.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoContrato.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoContrato.add(this.jTextFieldPathArchivoImportacionTipoContrato, this.gridBagConstraintsTipoContrato);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoContrato = new JButtonMe();
		this.jButtonGenerarImportacionTipoContrato.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoContrato,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoContrato.setToolTipText("Generar"+" "+TipoContratoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoContrato.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoContrato.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoContrato.add(this.jButtonGenerarImportacionTipoContrato, this.gridBagConstraintsTipoContrato);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoContrato = new JButtonMe();
		this.jButtonCerrarImportacionTipoContrato.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoContrato,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoContrato.setToolTipText("Cancelar"+" "+TipoContratoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoContrato.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoContrato.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoContrato.add(this.jButtonCerrarImportacionTipoContrato, this.gridBagConstraintsTipoContrato);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoContrato = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoContrato= new JScrollPane(jPanelImportacionTipoContrato,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoContrato.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoContrato.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoContrato.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoContrato);
		this.jInternalFrameImportacionTipoContrato.getContentPane().add(this.jScrollPanelImportacionTipoContrato, this.gridBagConstraintsTipoContrato);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoContrato(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoContrato = new JButtonMe();
			this.jButtonAbrirOrderByTipoContrato.setText("Orden");
			this.jButtonAbrirOrderByTipoContrato.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoContrato,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoContrato";
			inputMap = this.jButtonAbrirOrderByTipoContrato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoContrato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoContrato"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoContrato = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoContrato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoContrato.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoContrato.setName("jPanelOrderByTipoContrato"); 
			
			this.jPanelOrderByTipoContrato.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoContrato.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoContrato.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoContrato.setLayout(gridaBagLayoutOrderByTipoContrato);
			
			
			this.jTableDatosTipoContratoOrderBy = new JTableMe();        
			this.jTableDatosTipoContratoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoContratoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoContratoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoContratoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoContratoOrderBy.setViewportView(this.jTableDatosTipoContratoOrderBy);
			this.jTableDatosTipoContratoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoContratoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoContrato= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoContrato= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoContrato = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoContrato= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoContrato.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoContrato.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoContrato.setTitle("Orden");
			this.jInternalFrameOrderByTipoContrato.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoContrato.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoContrato.setResizable(true);
			this.jInternalFrameOrderByTipoContrato.setClosable(true);
			this.jInternalFrameOrderByTipoContrato.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoContrato.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoContrato.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoContrato.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoContrato.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Contratos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			this.gridBagConstraintsTipoContrato.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoContrato.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoContrato.ipady =150;
				
			this.jPanelOrderByTipoContrato.add(jScrollPanelDatosTipoContratoOrderBy, this.gridBagConstraintsTipoContrato);//this.jTableDatosTipoContratoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoContrato = new JButtonMe();
			this.jButtonCerrarOrderByTipoContrato.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoContrato,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoContrato.setToolTipText("Cancelar"+" "+TipoContratoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoContrato.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoContrato.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoContrato.add(this.jButtonCerrarOrderByTipoContrato, this.gridBagConstraintsTipoContrato);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoContrato = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoContrato= new JScrollPane(jPanelOrderByTipoContrato,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			this.gridBagConstraintsTipoContrato.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoContrato.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoContrato.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoContrato.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoContrato);
			
			this.jInternalFrameOrderByTipoContrato.getContentPane().add(this.jScrollPanelOrderByTipoContrato, this.gridBagConstraintsTipoContrato);			
		
		} else {
			this.jButtonAbrirOrderByTipoContrato = new JButtonMe();
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
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipocontratoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoContrato.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoContrato.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoContrato.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoContrato.getRowHeight();//TipoContratoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipocontratoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoContratoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoContrato.isSelected()) {
					iHeightTable=TipoContratoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoContratoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoContratoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoContratoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoContrato.isSelected()) {
					iHeightTable=TipoContratoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoContratoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoContratoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoContrato.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoContrato.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoContrato.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoContrato.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoContrato.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoContrato.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoContrato!=null && this.jInternalFrameOrderByTipoContrato.getjTableDatosOrderBy()!=null) {
			//if(!this.tipocontratoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoContrato.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoContrato.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoContrato.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoContrato.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoContrato.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoContrato.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoContrato.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoContrato.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoContrato.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoContrato.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipocontratoLogic.getTipoContratos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocontratos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoContrato> TraerTipoContratoBeans(List<TipoContrato> tipocontratos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoContrato tipocontrato:tipocontratos) {
					
				if(!(TipoContratoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoContratoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipocontrato.setsDetalleGeneralEntityReporte(TipoContratoConstantesFunciones.getTipoContratoDescripcion(tipocontrato));
										
						
					
					

					if(tipocontrato.getDatoGeneralEmpleados()!=null && Funciones.existeClass(classes,DatoGeneralEmpleado.class)) {
						try{tipocontrato.setdatogeneralempleadosDescripcionReporte(new JRBeanCollectionDataSource(DatoGeneralEmpleadoJInternalFrame.TraerDatoGeneralEmpleadoBeans(tipocontrato.getDatoGeneralEmpleados(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipocontrato.getEmpleados()!=null && Funciones.existeClass(classes,Empleado.class)) {
						try{tipocontrato.setempleadosDescripcionReporte(new JRBeanCollectionDataSource(EmpleadoJInternalFrame.TraerEmpleadoBeans(tipocontrato.getEmpleados(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipocontrato.setsDetalleGeneralEntityReporte(tipocontrato.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipocontratobeans.add(tipocontratobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipocontratos;
    }
	//PARA REPORTES FIN
}
