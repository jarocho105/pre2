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

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

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
import com.bydan.erp.facturacion.util.TerminoProformaConstantesFunciones;

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
public class TerminoProformaJInternalFrame extends TerminoProformaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTerminoProforma;
	
	protected JMenuBar jmenuBarTerminoProforma;
	
	protected JMenu jmenuTerminoProforma;
	protected JMenu jmenuDatosTerminoProforma;
	protected JMenu jmenuArchivoTerminoProforma;
	protected JMenu jmenuAccionesTerminoProforma;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTerminoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTerminoProforma;	
	protected GridBagConstraints gridBagConstraintsTerminoProforma;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TerminoProformaDetalleFormJInternalFrame jInternalFrameDetalleFormTerminoProforma;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTerminoProforma;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTerminoProforma;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected ProformaBeanSwingJInternalFrame proformaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_proforma="";
	
	public TerminoProformaSessionBean terminoproformaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public ProformaSessionBean proformaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TerminoProforma> terminoproformas;		
	public List<TerminoProforma> terminoproformasEliminados;	
	public List<TerminoProforma> terminoproformasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTerminoProforma;		
	protected JButton jButtonAbrirOrderByTerminoProforma;
	
	
	//protected JPanel jPanelOrderByTerminoProforma;
	//public JScrollPane jScrollPanelOrderByTerminoProforma;	
	//protected JButton jButtonCerrarOrderByTerminoProforma;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TerminoProformaLogic terminoproformaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTerminoProforma;
	public JScrollPane jScrollPanelDatosEdicionTerminoProforma;
	public JScrollPane jScrollPanelDatosGeneralTerminoProforma;
    
	
	
	//public JScrollPane jScrollPanelDatosTerminoProformaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTerminoProforma;
	//public JScrollPane jScrollPanelImportacionTerminoProforma;
	
	
	
	protected JPanel jPanelAccionesTerminoProforma;
	
    protected JPanel jPanelPaginacionTerminoProforma;
    protected JPanel jPanelParametrosReportesTerminoProforma;
	protected JPanel jPanelParametrosReportesAccionesTerminoProforma;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TerminoProforma;
	protected JPanel jPanelParametrosAuxiliar2TerminoProforma;
	protected JPanel jPanelParametrosAuxiliar3TerminoProforma;
	protected JPanel jPanelParametrosAuxiliar4TerminoProforma;
	//protected JPanel jPanelParametrosAuxiliar5TerminoProforma;
	
	
	
	//protected JPanel jPanelReporteDinamicoTerminoProforma;
	//protected JPanel jPanelImportacionTerminoProforma;
	
	
	public JTable jTableDatosTerminoProforma;
	
	
	
	//public JTable jTableDatosTerminoProformaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTerminoProforma;
	protected JButton jButtonDuplicarTerminoProforma;
	protected JButton jButtonCopiarTerminoProforma;
	protected JButton jButtonVerFormTerminoProforma;
	protected JButton jButtonNuevoRelacionesTerminoProforma;
	protected JButton jButtonModificarTerminoProforma;
	
    protected JButton jButtonGuardarCambiosTablaTerminoProforma;
	protected JButton jButtonCerrarTerminoProforma;
	
	
	protected JButton jButtonRecargarInformacionTerminoProforma;
	protected JButton jButtonProcesarInformacionTerminoProforma;
	
	
	protected JButton jButtonAnterioresTerminoProforma;
	protected JButton jButtonSiguientesTerminoProforma;
	protected JButton jButtonNuevoGuardarCambiosTerminoProforma;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTerminoProforma;
	//protected JButton jButtonCerrarReporteDinamicoTerminoProforma;
	//protected JButton jButtonGenerarExcelReporteDinamicoTerminoProforma;	
	
	
	
	//protected JButton jButtonAbrirImportacionTerminoProforma;
	//protected JButton jButtonGenerarImportacionTerminoProforma;
	//protected JButton jButtonCerrarImportacionTerminoProforma;
	//protected JFileChooser jFileChooserImportacionTerminoProforma;
	//protected File fileImportacionTerminoProforma;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTerminoProforma;
	protected JButton jButtonDuplicarToolBarTerminoProforma;
	protected JButton jButtonNuevoRelacionesToolBarTerminoProforma;
	
	
	public JButton jButtonGuardarCambiosToolBarTerminoProforma;
	protected JButton jButtonCopiarToolBarTerminoProforma;
	protected JButton jButtonVerFormToolBarTerminoProforma;
	public JButton jButtonGuardarCambiosTablaToolBarTerminoProforma;
	protected JButton jButtonMostrarOcultarTablaToolBarTerminoProforma;
	protected JButton jButtonCerrarToolBarTerminoProforma;
	
	protected JButton jButtonRecargarInformacionToolBarTerminoProforma;
	protected JButton jButtonProcesarInformacionToolBarTerminoProforma;
	protected JButton jButtonAnterioresToolBarTerminoProforma;
	protected JButton jButtonSiguientesToolBarTerminoProforma;
	protected JButton jButtonNuevoGuardarCambiosToolBarTerminoProforma;
	protected JButton jButtonAbrirOrderByToolBarTerminoProforma;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTerminoProforma;
	protected JMenuItem jMenuItemDuplicarTerminoProforma;
	protected JMenuItem jMenuItemNuevoRelacionesTerminoProforma;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTerminoProforma;
	protected JMenuItem jMenuItemCopiarTerminoProforma;
	protected JMenuItem jMenuItemVerFormTerminoProforma;
	protected JMenuItem jMenuItemGuardarCambiosTablaTerminoProforma;
	protected JMenuItem jMenuItemCerrarTerminoProforma;
	protected JMenuItem jMenuItemDetalleCerrarTerminoProforma;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTerminoProforma;
	protected JMenuItem jMenuItemDetalleMostarOcultarTerminoProforma;
	
	protected JMenuItem jMenuItemRecargarInformacionTerminoProforma;
	protected JMenuItem jMenuItemProcesarInformacionTerminoProforma;
	protected JMenuItem jMenuItemAnterioresTerminoProforma;
	protected JMenuItem jMenuItemSiguientesTerminoProforma;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTerminoProforma;
	protected JMenuItem jMenuItemAbrirOrderByTerminoProforma;
	protected JMenuItem jMenuItemMostrarOcultarTerminoProforma;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTerminoProforma;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTerminoProforma;
	protected JCheckBox jCheckBoxSeleccionadosTerminoProforma;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTerminoProforma;
	protected JCheckBox jCheckBoxConGraficoReporteTerminoProforma;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTerminoProforma;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTerminoProforma;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTerminoProforma;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTerminoProforma;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTerminoProforma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTerminoProforma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTerminoProforma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTerminoProforma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTerminoProforma;
	protected JTextField jTextFieldValorCampoGeneralTerminoProforma;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTerminoProforma;
	//public JList<Reporte> jListColumnasSelectReporteTerminoProforma;
	//public JScrollPane jScrollColumnasSelectReporteTerminoProforma;
	
	//public JLabel jLabelRelacionesSelectReporteTerminoProforma;
	//public JList<Reporte> jListRelacionesSelectReporteTerminoProforma;
	//public JScrollPane jScrollRelacionesSelectReporteTerminoProforma;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTerminoProforma;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTerminoProforma;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTerminoProforma;
	//public JLabel jLabelTiposArchivoReporteDinamicoTerminoProforma;
	
		
	//public JLabel jLabelArchivoImportacionTerminoProforma;	
	//public JLabel jLabelPathArchivoImportacionTerminoProforma;
	//protected JTextField jTextFieldPathArchivoImportacionTerminoProforma;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTerminoProforma;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTerminoProforma;
	
	//public JLabel jLabelColumnaCategoriaValorTerminoProforma;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTerminoProforma;
	
	//public JLabel jLabelColumnasValoresGraficoTerminoProforma;
	//public JList<Reporte> jListColumnasValoresGraficoTerminoProforma;
	//public JScrollPane jScrollColumnasValoresGraficoTerminoProforma;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTerminoProforma;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTerminoProforma;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTerminoProforma;
	public JPanel jPanelFK_IdProformaTerminoProforma;
	public JButton jButtonFK_IdProformaTerminoProforma;
	
	public JPanel jPanelid_proformaFK_IdProformaTerminoProforma;
	public JLabel jLabelid_proformaFK_IdProformaTerminoProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_proformaFK_IdProformaTerminoProforma;
	public JButton jButtonid_proformaFK_IdProformaTerminoProforma= new JButtonMe();
	public JButton jButtonid_proformaFK_IdProformaTerminoProformaUpdate= new JButtonMe();
	public JButton jButtonid_proformaFK_IdProformaTerminoProformaBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=1034;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TerminoProformaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TerminoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TerminoProformaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TerminoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TerminoProformaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TerminoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TerminoProformaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TerminoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//OBLIGA VALIDA CON GUARDAR RELACIONES, TAMBIEN EN SWING
			conGuardarRelaciones=true;
			
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTerminoProforma)	{
		this.jButtonRecargarInformacionTerminoProforma = jButtonRecargarInformacionTerminoProforma;
	}
	
	public JButton getjButtonProcesarInformacionTerminoProforma() {
		return this.jButtonProcesarInformacionTerminoProforma;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTerminoProforma)	{
		this.jButtonProcesarInformacionTerminoProforma = jButtonProcesarInformacionTerminoProforma;
	}
	
	
	public JButton getjButtonRecargarInformacionTerminoProforma() {
		return this.jButtonRecargarInformacionTerminoProforma;
	}
	
	
	public List<TerminoProforma> getterminoproformas() {
		return this.terminoproformas;
	}

	public void setterminoproformas(List<TerminoProforma> terminoproformas) {
		this.terminoproformas = terminoproformas;
	}
	
	public List<TerminoProforma> getterminoproformasAux() {
		return this.terminoproformasAux;
	}

	public void setterminoproformasAux(List<TerminoProforma> terminoproformasAux) {
		this.terminoproformasAux = terminoproformasAux;
	}
	
	public List<TerminoProforma> getterminoproformasEliminados() {
		return this.terminoproformasEliminados;
	}

	public void setTerminoProformasEliminados(List<TerminoProforma> terminoproformasEliminados) {
		this.terminoproformasEliminados = terminoproformasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTerminoProforma() {
		return jComboBoxTiposSeleccionarTerminoProforma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTerminoProforma(
			JComboBox jComboBoxTiposSeleccionarTerminoProforma) {
		this.jComboBoxTiposSeleccionarTerminoProforma = jComboBoxTiposSeleccionarTerminoProforma;
	}
	
	public void setBorderResaltarTiposSeleccionarTerminoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTerminoProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTerminoProforma .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTerminoProforma() {
		return jTextFieldValorCampoGeneralTerminoProforma;
	}

	public void setjTextFieldValorCampoGeneralTerminoProforma(
			JTextField jTextFieldValorCampoGeneralTerminoProforma) {
		this.jTextFieldValorCampoGeneralTerminoProforma = jTextFieldValorCampoGeneralTerminoProforma;
	}

	public void setBorderResaltarValorCampoGeneralTerminoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTerminoProforma.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTerminoProforma .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTerminoProforma() {
		return this.jCheckBoxSeleccionarTodosTerminoProforma;
	}

	public void setjCheckBoxSeleccionarTodosTerminoProforma(
			JCheckBox jCheckBoxSeleccionarTodosTerminoProforma) {
		this.jCheckBoxSeleccionarTodosTerminoProforma = jCheckBoxSeleccionarTodosTerminoProforma;
	}

	public void setBorderResaltarSeleccionarTodosTerminoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTerminoProforma.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTerminoProforma .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTerminoProforma() {
		return this.jCheckBoxSeleccionadosTerminoProforma;
	}

	public void setjCheckBoxSeleccionadosTerminoProforma(
			JCheckBox jCheckBoxSeleccionadosTerminoProforma) {
		this.jCheckBoxSeleccionadosTerminoProforma = jCheckBoxSeleccionadosTerminoProforma;
	}
	
	public void setBorderResaltarSeleccionadosTerminoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTerminoProforma.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTerminoProforma .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTerminoProforma() {
		return this.jComboBoxTiposArchivosReportesTerminoProforma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTerminoProforma(
			JComboBox jComboBoxTiposArchivosReportesTerminoProforma) {
		this.jComboBoxTiposArchivosReportesTerminoProforma = jComboBoxTiposArchivosReportesTerminoProforma;
	}

	public void setBorderResaltarTiposArchivosReportesTerminoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTerminoProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTerminoProforma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTerminoProforma() {
		return this.jComboBoxTiposReportesTerminoProforma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTerminoProforma(
			JComboBox jComboBoxTiposReportesTerminoProforma) {
		this.jComboBoxTiposReportesTerminoProforma = jComboBoxTiposReportesTerminoProforma;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTerminoProforma() {
	//	return jComboBoxTiposReportesDinamicoTerminoProforma;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTerminoProforma(
	//		JComboBox jComboBoxTiposReportesDinamicoTerminoProforma) {
	//	this.jComboBoxTiposReportesDinamicoTerminoProforma = jComboBoxTiposReportesDinamicoTerminoProforma;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTerminoProforma() {
	//	return jComboBoxTiposArchivosReportesDinamicoTerminoProforma;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTerminoProforma(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTerminoProforma) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTerminoProforma = jComboBoxTiposArchivosReportesDinamicoTerminoProforma;
	//}
	
	public void setBorderResaltarTiposReportesTerminoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTerminoProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTerminoProforma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTerminoProforma() {
		return this.jComboBoxTiposGraficosReportesTerminoProforma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTerminoProforma(
			JComboBox jComboBoxTiposGraficosReportesTerminoProforma) {
		this.jComboBoxTiposGraficosReportesTerminoProforma = jComboBoxTiposGraficosReportesTerminoProforma;
	}
	
	public void setBorderResaltarTiposGraficosReportesTerminoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTerminoProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTerminoProforma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTerminoProforma() {
		return this.jComboBoxTiposPaginacionTerminoProforma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTerminoProforma(
			JComboBox jComboBoxTiposPaginacionTerminoProforma) {
		this.jComboBoxTiposPaginacionTerminoProforma = jComboBoxTiposPaginacionTerminoProforma;
	}
	
	public void setBorderResaltarTiposPaginacionTerminoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTerminoProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTerminoProforma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTerminoProforma() {
		return this.jComboBoxTiposRelacionesTerminoProforma;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTerminoProforma() {
		return this.jComboBoxTiposAccionesTerminoProforma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTerminoProforma(
			JComboBox jComboBoxTiposRelacionesTerminoProforma) {
		this.jComboBoxTiposRelacionesTerminoProforma = jComboBoxTiposRelacionesTerminoProforma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTerminoProforma(
			JComboBox jComboBoxTiposAccionesTerminoProforma) {
		this.jComboBoxTiposAccionesTerminoProforma = jComboBoxTiposAccionesTerminoProforma;
	}
	
	public void setBorderResaltarTiposRelacionesTerminoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTerminoProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTerminoProforma .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTerminoProforma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTerminoProforma.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTerminoProforma .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTerminoProforma() {
	//	return jCheckBoxConGraficoDinamicoTerminoProforma;
	//}

	//public void setjCheckBoxConGraficoDinamicoTerminoProforma(
	//		JCheckBox jCheckBoxConGraficoDinamicoTerminoProforma) {
	//	this.jCheckBoxConGraficoDinamicoTerminoProforma = jCheckBoxConGraficoDinamicoTerminoProforma;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTerminoProforma() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTerminoProforma.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTerminoProforma .setBorder(borderResaltar);		
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
		this.terminoproformaSessionBean=new TerminoProformaSessionBean();
		
		this.terminoproformaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.terminoproformaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.terminoproformaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TerminoProformaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TerminoProformaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TerminoProformaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TerminoProformaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TerminoProformaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Termino Proforma MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.terminoproformaSessionBean.getEsGuardarRelacionado()) {
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
		
		TerminoProformaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TerminoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTerminoProforma= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTerminoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTerminoProforma,this.jTtoolBarTerminoProforma,
							"nuevo","nuevo","Nuevo"+" "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTerminoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTerminoProforma,this.jTtoolBarTerminoProforma,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTerminoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTerminoProforma,this.jTtoolBarTerminoProforma,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTerminoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTerminoProforma,this.jTtoolBarTerminoProforma,
							"duplicar","duplicar","Duplicar"+" "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTerminoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTerminoProforma,this.jTtoolBarTerminoProforma,
							"copiar","copiar","Copiar"+" "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTerminoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTerminoProforma,this.jTtoolBarTerminoProforma,
							"ver_form","ver_form","Ver"+" "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTerminoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTerminoProforma,this.jTtoolBarTerminoProforma,
							"recargar","recargar","Recargar"+" "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTerminoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTerminoProforma,this.jTtoolBarTerminoProforma,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTerminoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTerminoProforma,this.jTtoolBarTerminoProforma,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTerminoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTerminoProforma,this.jTtoolBarTerminoProforma,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTerminoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTerminoProforma,this.jTtoolBarTerminoProforma,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTerminoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTerminoProforma,this.jTtoolBarTerminoProforma,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTerminoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTerminoProforma,this.jTtoolBarTerminoProforma,
							"cerrar","cerrar","Salir"+" "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTerminoProforma=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTerminoProforma;
			
				this.jButtonProcesarInformacionToolBarTerminoProforma=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTerminoProforma;
				
		//protected JButton jButtonModificarToolBarTerminoProforma;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTerminoProforma=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTerminoProforma=new JMenuMe("General");
		this.jmenuArchivoTerminoProforma=new JMenuMe("Archivo");
		this.jmenuAccionesTerminoProforma=new JMenuMe("Acciones");
		this.jmenuDatosTerminoProforma=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTerminoProforma= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTerminoProforma.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTerminoProforma,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTerminoProforma= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTerminoProforma.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTerminoProforma,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTerminoProforma= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTerminoProforma.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTerminoProforma,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTerminoProforma= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTerminoProforma.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTerminoProforma,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTerminoProforma= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTerminoProforma.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTerminoProforma,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTerminoProforma= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTerminoProforma.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTerminoProforma,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTerminoProforma= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTerminoProforma.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTerminoProforma,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTerminoProforma= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTerminoProforma.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTerminoProforma,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTerminoProforma= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTerminoProforma.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTerminoProforma,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTerminoProforma= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTerminoProforma.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTerminoProforma,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTerminoProforma= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTerminoProforma.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTerminoProforma,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTerminoProforma= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTerminoProforma.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTerminoProforma,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTerminoProforma= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTerminoProforma.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTerminoProforma,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTerminoProforma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTerminoProforma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTerminoProforma,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTerminoProforma= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTerminoProforma.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTerminoProforma,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTerminoProforma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTerminoProforma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTerminoProforma,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTerminoProforma= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTerminoProforma.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTerminoProforma,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTerminoProforma.add(this.jMenuItemCerrarTerminoProforma);
			
			this.jmenuAccionesTerminoProforma.add(this.jMenuItemNuevoTerminoProforma);
			this.jmenuAccionesTerminoProforma.add(this.jMenuItemNuevoGuardarCambiosTerminoProforma);
			this.jmenuAccionesTerminoProforma.add(this.jMenuItemNuevoRelacionesTerminoProforma);
			this.jmenuAccionesTerminoProforma.add(this.jMenuItemGuardarCambiosTablaTerminoProforma);		
			this.jmenuAccionesTerminoProforma.add(this.jMenuItemDuplicarTerminoProforma);		
			this.jmenuAccionesTerminoProforma.add(this.jMenuItemCopiarTerminoProforma);		
			this.jmenuAccionesTerminoProforma.add(this.jMenuItemVerFormTerminoProforma);		
			
			this.jmenuDatosTerminoProforma.add(this.jMenuItemRecargarInformacionTerminoProforma);				
			this.jmenuDatosTerminoProforma.add(this.jMenuItemAnterioresTerminoProforma);				
			this.jmenuDatosTerminoProforma.add(this.jMenuItemSiguientesTerminoProforma);				
			this.jmenuDatosTerminoProforma.add(this.jMenuItemAbrirOrderByTerminoProforma);				
			this.jmenuDatosTerminoProforma.add(this.jMenuItemMostrarOcultarTerminoProforma);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTerminoProforma.add(this.jMenuItemGuardarCambiosTerminoProforma);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTerminoProforma.add(this.jmenuArchivoTerminoProforma);		
			this.jmenuBarTerminoProforma.add(this.jmenuAccionesTerminoProforma);		
			this.jmenuBarTerminoProforma.add(this.jmenuDatosTerminoProforma);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTerminoProforma);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTerminoProforma() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdProformaTerminoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProformaTerminoProforma.setToolTipText("Buscar Por Proforma ");
		this.jButtonFK_IdProformaTerminoProforma= new JButtonMe();
		this.jButtonFK_IdProformaTerminoProforma.setText("Buscar");
		this.jButtonFK_IdProformaTerminoProforma.setToolTipText("Buscar Por Proforma ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProformaTerminoProforma,"buscar_button","Buscar Por Proforma ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProformaTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_proformaFK_IdProformaTerminoProforma = new JLabelMe();
		jLabelid_proformaFK_IdProformaTerminoProforma.setText("Proforma :");
		jLabelid_proformaFK_IdProformaTerminoProforma.setToolTipText("Proforma");
		jLabelid_proformaFK_IdProformaTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_proformaFK_IdProformaTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_proformaFK_IdProformaTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_proformaFK_IdProformaTerminoProforma,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_proformaFK_IdProformaTerminoProforma= new JComboBoxMe();
		jComboBoxid_proformaFK_IdProformaTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_proformaFK_IdProformaTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_proformaFK_IdProformaTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_proformaFK_IdProformaTerminoProforma,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTerminoProforma=new JTabbedPane();


		this.jTabbedPaneBusquedasTerminoProforma.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTerminoProforma.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTerminoProforma.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTerminoProforma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTerminoProforma,STIPO_TAMANIO_GENERAL,false,true,this);

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
		
		//INDEPENDIENTE DEL PARAMETRO TIENE LA FUNCIONALIDAD DE GUARDAR RELACIONES
		this.conFuncionalidadRelaciones=true;	
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		
		if(this.conCargarFormDetalle) { //true) {
			//this.jInternalFrameDetalleTerminoProforma = new TerminoProformaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Termino Proforma DATOS");
			this.jInternalFrameDetalleFormTerminoProforma = new TerminoProformaDetalleFormJInternalFrame(jDesktopPane,this.terminoproformaSessionBean.getConGuardarRelaciones(),this.terminoproformaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTerminoProforma = null;//new TerminoProformaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTerminoProforma= new GridBagLayout();
		
		
		this.jTableDatosTerminoProforma = new JTableMe();      
		
		String sToolTipTerminoProforma="";
		sToolTipTerminoProforma=TerminoProformaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTerminoProforma+="(Facturacion.TerminoProforma)";
		}
		
		if(!this.terminoproformaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTerminoProforma+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTerminoProforma.setToolTipText(sToolTipTerminoProforma);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTerminoProforma);
		this.jTableDatosTerminoProforma.setAutoCreateRowSorter(true);
		this.jTableDatosTerminoProforma.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTerminoProforma.setRowSelectionAllowed(true);
		this.jTableDatosTerminoProforma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTerminoProforma,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTerminoProforma = new JButtonMe();
		this.jButtonDuplicarTerminoProforma = new JButtonMe();
		this.jButtonCopiarTerminoProforma = new JButtonMe();
		this.jButtonVerFormTerminoProforma = new JButtonMe();
		this.jButtonNuevoRelacionesTerminoProforma = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTerminoProforma = new JButtonMe();
		this.jButtonCerrarTerminoProforma = new JButtonMe();
		
		this.jScrollPanelDatosTerminoProforma = new JScrollPane();   
        this.jScrollPanelDatosGeneralTerminoProforma = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTerminoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Termino Proforma";
		
		if(!this.terminoproformaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Termino Proformas" + this.sPath));
		} else {
			this.jScrollPanelDatosTerminoProforma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTerminoProforma.setToolTipText("Acciones");
        this.jPanelAccionesTerminoProforma.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTerminoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTerminoProforma, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTerminoProforma=new ReporteDinamicoJInternalFrame(TerminoProformaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTerminoProforma();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTerminoProforma=new ImportacionJInternalFrame(TerminoProformaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTerminoProforma();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTerminoProforma = new JButtonMe();
		
		this.jButtonAbrirOrderByTerminoProforma.setText("Orden");
		this.jButtonAbrirOrderByTerminoProforma.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTerminoProforma,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTerminoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTerminoProforma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTerminoProforma,false,this);
			
			//this.cargarOrderByTerminoProforma(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTerminoProforma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTerminoProforma,true,this);
			
			//this.cargarOrderByTerminoProforma(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTerminoProforma.setMinimumSize(new Dimension(400,50));//1730
		this.jTableDatosTerminoProforma.setMaximumSize(new Dimension(400,50));//1730
		this.jTableDatosTerminoProforma.setPreferredSize(new Dimension(400,50));//1730
		
		this.jScrollPanelDatosTerminoProforma.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTerminoProforma.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTerminoProforma.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTerminoProforma.setText("Nuevo");
		this.jButtonDuplicarTerminoProforma.setText("Duplicar");
		this.jButtonCopiarTerminoProforma.setText("Copiar");
		this.jButtonVerFormTerminoProforma.setText("Ver");
		this.jButtonNuevoRelacionesTerminoProforma.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTerminoProforma.setText("Guardar");
		this.jButtonCerrarTerminoProforma.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTerminoProforma,"nuevo_button","Nuevo",this.terminoproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTerminoProforma,"duplicar_button","Duplicar",this.terminoproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTerminoProforma,"copiar_button","Copiar",this.terminoproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTerminoProforma,"ver_form","Ver",this.terminoproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTerminoProforma,"nuevorelaciones_button","Nuevo Rel",this.terminoproformaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTerminoProforma,"guardarcambiostabla_button","Guardar",this.terminoproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTerminoProforma,"cerrar_button","Salir",this.terminoproformaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTerminoProforma.setToolTipText("Nuevo"+" "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTerminoProforma.setToolTipText("Duplicar"+" "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTerminoProforma.setToolTipText("Copiar"+" "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTerminoProforma.setToolTipText("Ver"+" "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTerminoProforma.setToolTipText("Nuevo Rel"+" "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTerminoProforma.setToolTipText("Guardar"+" "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTerminoProforma.setToolTipText("Salir"+" "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTerminoProforma";
		inputMap = this.jButtonNuevoTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTerminoProforma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTerminoProforma"));
		
		//DUPLICAR
		sMapKey = "DuplicarTerminoProforma";
		inputMap = this.jButtonDuplicarTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTerminoProforma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTerminoProforma"));
		
		//COPIAR
		sMapKey = "CopiarTerminoProforma";
		inputMap = this.jButtonCopiarTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTerminoProforma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTerminoProforma"));
		
		//VEr FORM
		sMapKey = "VerFormTerminoProforma";
		inputMap = this.jButtonVerFormTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTerminoProforma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTerminoProforma"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTerminoProforma";
		inputMap = this.jButtonNuevoRelacionesTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTerminoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTerminoProforma"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTerminoProforma";
		inputMap = this.jButtonModificarTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTerminoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTerminoProforma"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTerminoProforma";
		inputMap = this.jButtonCerrarTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTerminoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTerminoProforma"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTerminoProforma";
		inputMap = this.jButtonGuardarCambiosTablaTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTerminoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTerminoProforma"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTerminoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTerminoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTerminoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TerminoProforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TerminoProforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TerminoProforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TerminoProforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TerminoProforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTerminoProforma.setName("jPanelParametrosReportesTerminoProforma"); 
		
		this.jPanelParametrosReportesAccionesTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTerminoProforma.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTerminoProforma.setName("jPanelParametrosReportesAccionesTerminoProforma"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTerminoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTerminoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTerminoProforma = new JButtonMe();
		this.jButtonRecargarInformacionTerminoProforma.setText("Recargar");
		this.jButtonRecargarInformacionTerminoProforma.setToolTipText("Recargar"+" "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTerminoProforma,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTerminoProforma = new JButtonMe();
		this.jButtonProcesarInformacionTerminoProforma.setText("Procesar");
		this.jButtonProcesarInformacionTerminoProforma.setToolTipText("Procesar"+" "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTerminoProforma.setVisible(false);
			
		this.jButtonProcesarInformacionTerminoProforma.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTerminoProforma.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTerminoProforma.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTerminoProforma = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTerminoProforma.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTerminoProforma.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTerminoProforma = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTerminoProforma.setText("TIPO");       
		this.jComboBoxTiposReportesTerminoProforma.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTerminoProforma = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTerminoProforma.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTerminoProforma.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTerminoProforma = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTerminoProforma.setText("Paginacion");
		this.jComboBoxTiposPaginacionTerminoProforma.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTerminoProforma = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTerminoProforma.setText("Accion");
		this.jComboBoxTiposRelacionesTerminoProforma.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTerminoProforma = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTerminoProforma.setText("Accion");
		this.jComboBoxTiposAccionesTerminoProforma.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTerminoProforma = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTerminoProforma.setText("Accion");
		this.jComboBoxTiposSeleccionarTerminoProforma.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTerminoProforma=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTerminoProforma.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTerminoProforma.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTerminoProforma.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTerminoProforma = new JLabelMe();
		
		this.jLabelAccionesTerminoProforma.setText("Acciones");		
		this.jLabelAccionesTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTerminoProforma = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTerminoProforma.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTerminoProforma.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTerminoProforma = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTerminoProforma.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTerminoProforma.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTerminoProforma = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTerminoProforma.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTerminoProforma.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTerminoProforma = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTerminoProforma.setText("Graf.");
		this.jCheckBoxConGraficoReporteTerminoProforma.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTerminoProforma = new JButtonMe();
		//this.jButtonAnterioresTerminoProforma.setText("<<");
        this.jButtonAnterioresTerminoProforma.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTerminoProforma,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTerminoProforma = new JButtonMe();
		//this.jButtonSiguientesTerminoProforma.setText(">>");
        this.jButtonSiguientesTerminoProforma.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTerminoProforma,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTerminoProforma = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTerminoProforma.setText("Nue");
        this.jButtonNuevoGuardarCambiosTerminoProforma.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTerminoProforma,"nuevoguardarcambios_button","Nue",this.terminoproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTerminoProforma";
		inputMap = this.jButtonNuevoGuardarCambiosTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTerminoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTerminoProforma"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTerminoProforma";
		inputMap = this.jButtonRecargarInformacionTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTerminoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTerminoProforma"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTerminoProforma";
		inputMap = this.jButtonSiguientesTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTerminoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTerminoProforma"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTerminoProforma";
		inputMap = this.jButtonAnterioresTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTerminoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTerminoProforma"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTerminoProforma();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTerminoProforma.setMinimumSize(new Dimension(this.getWidth(),TerminoProformaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TerminoProformaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTerminoProforma.setMaximumSize(new Dimension(this.getWidth(),TerminoProformaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TerminoProformaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTerminoProforma.setPreferredSize(new Dimension(this.getWidth(),TerminoProformaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TerminoProformaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTerminoProforma = new GridBagLayout();

			this.jPanelPaginacionTerminoProforma.setLayout(gridaBagLayoutPaginacionTerminoProforma);						
			
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTerminoProforma.gridy = 0;
			this.gridBagConstraintsTerminoProforma.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTerminoProforma.add(this.jButtonAnterioresTerminoProforma, this.gridBagConstraintsTerminoProforma);
					
						
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();//
			this.gridBagConstraintsTerminoProforma.gridx = iPosXAccionPaginacion++;//
			this.gridBagConstraintsTerminoProforma.gridy = 0;//
			
			this.jPanelPaginacionTerminoProforma.add(this.jButtonNuevoGuardarCambiosTerminoProforma, this.gridBagConstraintsTerminoProforma);//
						
			
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTerminoProforma.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTerminoProforma.gridy = 0;
			this.jPanelPaginacionTerminoProforma.add(this.jButtonSiguientesTerminoProforma, this.gridBagConstraintsTerminoProforma);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();//
			this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsTerminoProforma.gridy = 1;//
			this.gridBagConstraintsTerminoProforma.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionTerminoProforma.add(this.jButtonNuevoTerminoProforma, this.gridBagConstraintsTerminoProforma);//
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
				this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTerminoProforma.gridy = 1;
				this.gridBagConstraintsTerminoProforma.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTerminoProforma.add(this.jButtonNuevoRelacionesTerminoProforma, this.gridBagConstraintsTerminoProforma);
			}
			
			
			if(!this.terminoproformaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTerminoProforma = new GridBagConstraints();//
				this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.VERTICAL;//
				this.gridBagConstraintsTerminoProforma.gridy = 1;//
				this.gridBagConstraintsTerminoProforma.gridx = iPosXAccionPaginacion++;//
						
				this.jPanelPaginacionTerminoProforma.add(this.jButtonGuardarCambiosTablaTerminoProforma, this.gridBagConstraintsTerminoProforma);//
			}
			
			
			
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();//
			this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsTerminoProforma.gridy = 1;//
			this.gridBagConstraintsTerminoProforma.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionTerminoProforma.add(this.jButtonDuplicarTerminoProforma, this.gridBagConstraintsTerminoProforma);//
			
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();//
			this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsTerminoProforma.gridy = 1;//
			this.gridBagConstraintsTerminoProforma.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionTerminoProforma.add(this.jButtonCopiarTerminoProforma, this.gridBagConstraintsTerminoProforma);//
		
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();//
			this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsTerminoProforma.gridy = 1;//
			this.gridBagConstraintsTerminoProforma.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionTerminoProforma.add(this.jButtonVerFormTerminoProforma, this.gridBagConstraintsTerminoProforma);//
		
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTerminoProforma.gridy = 1;
			this.gridBagConstraintsTerminoProforma.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTerminoProforma.add(this.jButtonCerrarTerminoProforma, this.gridBagConstraintsTerminoProforma);
		
		
		
		this.jButtonRecargarInformacionTerminoProforma.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTerminoProforma.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTerminoProforma.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTerminoProforma.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTerminoProforma.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTerminoProforma.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTerminoProforma.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTerminoProforma.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTerminoProforma.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTerminoProforma.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTerminoProforma.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTerminoProforma.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTerminoProforma.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTerminoProforma.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTerminoProforma.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTerminoProforma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTerminoProforma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTerminoProforma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTerminoProforma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTerminoProforma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTerminoProforma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTerminoProforma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTerminoProforma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTerminoProforma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTerminoProforma.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTerminoProforma.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTerminoProforma.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTerminoProforma.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTerminoProforma.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTerminoProforma.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTerminoProforma.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTerminoProforma.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTerminoProforma.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTerminoProforma.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTerminoProforma.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTerminoProforma.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTerminoProforma = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTerminoProforma = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TerminoProforma = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TerminoProforma = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TerminoProforma = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TerminoProforma = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTerminoProforma.setLayout(gridaBagParametrosReportesTerminoProforma);
			this.jPanelParametrosReportesAccionesTerminoProforma.setLayout(gridaBagParametrosReportesAccionesTerminoProforma);
			
			
			this.jPanelParametrosAuxiliar1TerminoProforma.setLayout(gridaBagParametrosAuxiliar1TerminoProforma);
			this.jPanelParametrosAuxiliar2TerminoProforma.setLayout(gridaBagParametrosAuxiliar2TerminoProforma);
			this.jPanelParametrosAuxiliar3TerminoProforma.setLayout(gridaBagParametrosAuxiliar3TerminoProforma);
			this.jPanelParametrosAuxiliar4TerminoProforma.setLayout(gridaBagParametrosAuxiliar4TerminoProforma);
			//this.jPanelParametrosAuxiliar5TerminoProforma.setLayout(gridaBagParametrosAuxiliar2TerminoProforma);			
			
			
			
			
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTerminoProforma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTerminoProforma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTerminoProforma.add(this.jButtonRecargarInformacionTerminoProforma, this.gridBagConstraintsTerminoProforma);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTerminoProforma.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTerminoProforma.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TerminoProforma.add(this.jComboBoxTiposPaginacionTerminoProforma, this.gridBagConstraintsTerminoProforma);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTerminoProforma.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTerminoProforma.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TerminoProforma.add(this.jCheckBoxConAltoMaximoTablaTerminoProforma, this.gridBagConstraintsTerminoProforma);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTerminoProforma.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTerminoProforma.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TerminoProforma.add(this.jComboBoxTiposArchivosReportesTerminoProforma, this.gridBagConstraintsTerminoProforma);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTerminoProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTerminoProforma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTerminoProforma.add(this.jPanelParametrosAuxiliar1TerminoProforma, this.gridBagConstraintsTerminoProforma);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTerminoProforma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTerminoProforma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TerminoProforma.add(this.jComboBoxTiposReportesTerminoProforma, this.gridBagConstraintsTerminoProforma);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTerminoProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTerminoProforma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTerminoProforma.add(this.jPanelParametrosAuxiliar4TerminoProforma, this.gridBagConstraintsTerminoProforma);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTerminoProforma.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTerminoProforma.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTerminoProforma.add(this.jComboBoxTiposReportesTerminoProforma, this.gridBagConstraintsTerminoProforma);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTerminoProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTerminoProforma.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTerminoProforma.add(this.jCheckBoxGenerarReporteTerminoProforma, this.gridBagConstraintsTerminoProforma);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTerminoProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTerminoProforma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTerminoProforma.add(this.jPanelParametrosAuxiliar2TerminoProforma, this.gridBagConstraintsTerminoProforma);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTerminoProforma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTerminoProforma.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTerminoProforma.add(this.jLabelAccionesTerminoProforma, this.gridBagConstraintsTerminoProforma);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
				this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTerminoProforma.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTerminoProforma.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTerminoProforma.add(this.jButtonAbrirOrderByTerminoProforma, this.gridBagConstraintsTerminoProforma);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTerminoProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTerminoProforma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTerminoProforma.add(this.jComboBoxTiposSeleccionarTerminoProforma, this.gridBagConstraintsTerminoProforma);			
			
			
			/*
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTerminoProforma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTerminoProforma.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTerminoProforma.add(this.jCheckBoxSeleccionarTodosTerminoProforma, this.gridBagConstraintsTerminoProforma);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTerminoProforma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTerminoProforma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TerminoProforma.add(this.jCheckBoxSeleccionarTodosTerminoProforma, this.gridBagConstraintsTerminoProforma);															
				
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTerminoProforma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTerminoProforma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TerminoProforma.add(this.jCheckBoxSeleccionadosTerminoProforma, this.gridBagConstraintsTerminoProforma);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTerminoProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTerminoProforma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTerminoProforma.add(this.jPanelParametrosAuxiliar3TerminoProforma, this.gridBagConstraintsTerminoProforma);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsTerminoProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTerminoProforma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTerminoProforma.add(this.jComboBoxTiposRelacionesTerminoProforma, this.gridBagConstraintsTerminoProforma);
				
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsTerminoProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTerminoProforma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTerminoProforma.add(this.jComboBoxTiposAccionesTerminoProforma, this.gridBagConstraintsTerminoProforma);
	
				
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsTerminoProforma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTerminoProforma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTerminoProforma.add(this.jTextFieldValorCampoGeneralTerminoProforma, this.gridBagConstraintsTerminoProforma);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTerminoProforma = new GridBagLayout();

			this.jScrollPanelDatosTerminoProforma.setLayout(gridaBagLayoutDatosTerminoProforma);
			
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTerminoProforma.gridy = 0;
			this.gridBagConstraintsTerminoProforma.gridx = 0;
			
			this.jScrollPanelDatosTerminoProforma.add(this.jTableDatosTerminoProforma, this.gridBagConstraintsTerminoProforma);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTerminoProforma.setViewportView(this.jTableDatosTerminoProforma);
		this.jTableDatosTerminoProforma.setFillsViewportHeight(true);
		this.jTableDatosTerminoProforma.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTerminoProforma= new GridBagLayout();
		this.jPanelAccionesTerminoProforma.setLayout(gridaBagLayoutAccionesTerminoProforma);
		
		
		/*	
		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTerminoProforma.gridy = 0;
		this.gridBagConstraintsTerminoProforma.gridx = 0;
			
		this.jPanelAccionesTerminoProforma.add(this.jButtonNuevoTerminoProforma, this.gridBagConstraintsTerminoProforma);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdProformaTerminoProforma= new GridBagLayout();
		gridaBagLayoutFK_IdProformaTerminoProforma.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProformaTerminoProforma.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProformaTerminoProforma.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProformaTerminoProforma.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProformaTerminoProforma.setLayout(gridaBagLayoutFK_IdProformaTerminoProforma);

		gridBagConstraintsTerminoProforma = new GridBagConstraints();
		gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTerminoProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTerminoProforma.gridy = 0;
		gridBagConstraintsTerminoProforma.gridx = 0;
		jPanelFK_IdProformaTerminoProforma.add(jLabelid_proformaFK_IdProformaTerminoProforma, gridBagConstraintsTerminoProforma);

		gridBagConstraintsTerminoProforma = new GridBagConstraints();
		gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTerminoProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTerminoProforma.gridy = 0;
		gridBagConstraintsTerminoProforma.gridx = 1;
		jPanelFK_IdProformaTerminoProforma.add(jComboBoxid_proformaFK_IdProformaTerminoProforma, gridBagConstraintsTerminoProforma);

		gridBagConstraintsTerminoProforma = new GridBagConstraints();
		gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTerminoProforma.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTerminoProforma.gridy = 1;
		gridBagConstraintsTerminoProforma.gridx =1;
		jPanelFK_IdProformaTerminoProforma.add(jButtonFK_IdProformaTerminoProforma, gridBagConstraintsTerminoProforma);

		jTabbedPaneBusquedasTerminoProforma.addTab("1.-Por Proforma ", jPanelFK_IdProformaTerminoProforma);
		jTabbedPaneBusquedasTerminoProforma.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTerminoProforma = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTerminoProforma);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.terminoproformaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();						
			this.gridBagConstraintsTerminoProforma.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTerminoProforma.gridx = 0;		
			//this.gridBagConstraintsTerminoProforma.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTerminoProforma.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTerminoProforma, this.gridBagConstraintsTerminoProforma);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTerminoProforma.gridx = 0;		
		//this.gridBagConstraintsTerminoProforma.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTerminoProforma.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTerminoProforma);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTerminoProforma.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTerminoProforma.gridx = 0;		
			this.gridBagConstraintsTerminoProforma.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTerminoProforma.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTerminoProforma, this.gridBagConstraintsTerminoProforma);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTerminoProforma.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTerminoProforma, this.gridBagConstraintsTerminoProforma);								
		
		
		/*
		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTerminoProforma.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTerminoProforma, this.gridBagConstraintsTerminoProforma);
		*/		
		
		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTerminoProforma.gridx =0;
		this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTerminoProforma.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTerminoProforma, this.gridBagConstraintsTerminoProforma);
				
		
		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTerminoProforma.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTerminoProforma, this.gridBagConstraintsTerminoProforma);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TerminoProformaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTerminoProforma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTerminoProforma = new GridBagLayout();
			this.jPanelBusquedasParametrosTerminoProforma.setLayout(gridaBagLayoutBusquedasParametrosTerminoProforma);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTerminoProforma=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTerminoProforma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTerminoProforma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTerminoProforma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsTerminoProforma.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsTerminoProforma.anchor = GridBagConstraints.WEST;
			
			
			
			
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
		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTerminoProforma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTerminoProforma, this.gridBagConstraintsTerminoProforma);
			
			
		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTerminoProforma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTerminoProforma, this.gridBagConstraintsTerminoProforma);
		
			
		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTerminoProforma.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTerminoProforma, this.gridBagConstraintsTerminoProforma);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTerminoProforma;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTerminoProforma() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTerminoProforma = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTerminoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTerminoProforma.setName("jPanelReporteDinamicoTerminoProforma"); 
		
		this.jPanelReporteDinamicoTerminoProforma.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTerminoProforma.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTerminoProforma.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTerminoProforma.setLayout(gridaBagLayoutReporteDinamicoTerminoProforma);
		
		
		this.jInternalFrameReporteDinamicoTerminoProforma= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTerminoProforma = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTerminoProforma= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTerminoProforma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTerminoProforma.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTerminoProforma.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTerminoProforma.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTerminoProforma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTerminoProforma.setResizable(true);
	    this.jInternalFrameReporteDinamicoTerminoProforma.setClosable(true);
	    this.jInternalFrameReporteDinamicoTerminoProforma.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTerminoProforma.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTerminoProforma.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTerminoProforma.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Termino Proformas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTerminoProforma = new JLabelMe();

		this.jLabelColumnasSelectReporteTerminoProforma.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTerminoProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTerminoProforma.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTerminoProforma.add(this.jLabelColumnasSelectReporteTerminoProforma, this.gridBagConstraintsTerminoProforma);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTerminoProforma = new JList<Reporte>();
		this.jListColumnasSelectReporteTerminoProforma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTerminoProforma.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTerminoProforma.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTerminoProforma.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTerminoProforma.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTerminoProforma=new JScrollPane(this.jListColumnasSelectReporteTerminoProforma);
			
			this.jScrollColumnasSelectReporteTerminoProforma.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTerminoProforma.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTerminoProforma.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTerminoProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTerminoProforma.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTerminoProforma.add(this.jListColumnasSelectReporteTerminoProforma, this.gridBagConstraintsTerminoProforma);
		this.jPanelReporteDinamicoTerminoProforma.add(this.jScrollColumnasSelectReporteTerminoProforma, this.gridBagConstraintsTerminoProforma);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTerminoProforma = new JLabelMe();

		this.jLabelRelacionesSelectReporteTerminoProforma.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTerminoProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTerminoProforma.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTerminoProforma.add(this.jLabelRelacionesSelectReporteTerminoProforma, this.gridBagConstraintsTerminoProforma);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTerminoProforma = new JList<Reporte>();
		this.jListRelacionesSelectReporteTerminoProforma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTerminoProforma.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTerminoProforma.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTerminoProforma.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTerminoProforma.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTerminoProforma=new JScrollPane(this.jListRelacionesSelectReporteTerminoProforma);
			
			this.jScrollRelacionesSelectReporteTerminoProforma.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTerminoProforma.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTerminoProforma.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTerminoProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTerminoProforma.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTerminoProforma.add(this.jListRelacionesSelectReporteTerminoProforma, this.gridBagConstraintsTerminoProforma);
		this.jPanelReporteDinamicoTerminoProforma.add(this.jScrollRelacionesSelectReporteTerminoProforma, this.gridBagConstraintsTerminoProforma);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTerminoProforma = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTerminoProforma = new JComboBoxMe();
		this.jListColumnasValoresGraficoTerminoProforma = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTerminoProforma = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTerminoProforma.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTerminoProforma.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTerminoProforma.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTerminoProforma.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTerminoProforma = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTerminoProforma.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTerminoProforma.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTerminoProforma.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTerminoProforma.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTerminoProforma = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTerminoProforma.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTerminoProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTerminoProforma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTerminoProforma.add(this.jLabelGenerarExcelReporteDinamicoTerminoProforma, this.gridBagConstraintsTerminoProforma);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTerminoProforma = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTerminoProforma.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTerminoProforma,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTerminoProforma.setToolTipText("Generar EXCEL"+" "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		//this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTerminoProforma.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTerminoProforma.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTerminoProforma.add(this.jButtonGenerarExcelReporteDinamicoTerminoProforma, this.gridBagConstraintsTerminoProforma);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTerminoProforma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTerminoProforma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTerminoProforma.add(this.jComboBoxTiposReportesDinamicoTerminoProforma, this.gridBagConstraintsTerminoProforma);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTerminoProforma = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTerminoProforma.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTerminoProforma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTerminoProforma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTerminoProforma.add(this.jLabelTiposArchivoReporteDinamicoTerminoProforma, this.gridBagConstraintsTerminoProforma);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTerminoProforma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTerminoProforma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTerminoProforma.add(this.jComboBoxTiposArchivosReportesDinamicoTerminoProforma, this.gridBagConstraintsTerminoProforma);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTerminoProforma = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTerminoProforma.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTerminoProforma,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTerminoProforma.setToolTipText("Generar"+" "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTerminoProforma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTerminoProforma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTerminoProforma.add(this.jButtonGenerarReporteDinamicoTerminoProforma, this.gridBagConstraintsTerminoProforma);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTerminoProforma = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTerminoProforma.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTerminoProforma,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTerminoProforma.setToolTipText("Cancelar"+" "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTerminoProforma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTerminoProforma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTerminoProforma.add(this.jButtonCerrarReporteDinamicoTerminoProforma, this.gridBagConstraintsTerminoProforma);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTerminoProforma = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTerminoProforma= new JScrollPane(jPanelReporteDinamicoTerminoProforma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTerminoProforma.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTerminoProforma.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTerminoProforma.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Termino Proformas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTerminoProforma.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTerminoProforma.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTerminoProforma.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTerminoProforma);
		this.jInternalFrameReporteDinamicoTerminoProforma.getContentPane().add(this.jScrollPanelReporteDinamicoTerminoProforma, this.gridBagConstraintsTerminoProforma);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTerminoProforma() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTerminoProforma = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTerminoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTerminoProforma.setName("jPanelImportacionTerminoProforma"); 
		
		this.jPanelImportacionTerminoProforma.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTerminoProforma.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTerminoProforma.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTerminoProforma.setLayout(gridaBagLayoutImportacionTerminoProforma);
		
		
		this.jInternalFrameImportacionTerminoProforma= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTerminoProforma= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTerminoProforma = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTerminoProforma= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTerminoProforma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTerminoProforma.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTerminoProforma.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTerminoProforma.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTerminoProforma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTerminoProforma.setResizable(true);
	    this.jInternalFrameImportacionTerminoProforma.setClosable(true);
	    this.jInternalFrameImportacionTerminoProforma.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTerminoProforma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTerminoProforma.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTerminoProforma.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTerminoProforma.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTerminoProforma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTerminoProforma.setResizable(true);
	    this.jInternalFrameImportacionTerminoProforma.setClosable(true);
	    this.jInternalFrameImportacionTerminoProforma.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTerminoProforma.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTerminoProforma.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTerminoProforma.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Termino Proformas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTerminoProforma = new JLabelMe();

		this.jLabelArchivoImportacionTerminoProforma.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTerminoProforma.gridy = iPosYImportacion;		
		this.gridBagConstraintsTerminoProforma.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTerminoProforma.add(this.jLabelArchivoImportacionTerminoProforma, this.gridBagConstraintsTerminoProforma);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTerminoProforma = new JFileChooser();		
		this.jFileChooserImportacionTerminoProforma.setToolTipText("ESCOGER ARCHIVO"+" "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTerminoProforma = new JButtonMe();
		this.jButtonAbrirImportacionTerminoProforma.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTerminoProforma,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTerminoProforma.setToolTipText("Generar"+" "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTerminoProforma.gridy = iPosYImportacion;
		this.gridBagConstraintsTerminoProforma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTerminoProforma.add(this.jButtonAbrirImportacionTerminoProforma, this.gridBagConstraintsTerminoProforma);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTerminoProforma = new JLabelMe();

		this.jLabelPathArchivoImportacionTerminoProforma.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTerminoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTerminoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTerminoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTerminoProforma.gridy = iPosYImportacion;		
		this.gridBagConstraintsTerminoProforma.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTerminoProforma.add(this.jLabelPathArchivoImportacionTerminoProforma, this.gridBagConstraintsTerminoProforma);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTerminoProforma=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTerminoProforma.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTerminoProforma.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTerminoProforma.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTerminoProforma.gridy = iPosYImportacion;
		this.gridBagConstraintsTerminoProforma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTerminoProforma.add(this.jTextFieldPathArchivoImportacionTerminoProforma, this.gridBagConstraintsTerminoProforma);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTerminoProforma = new JButtonMe();
		this.jButtonGenerarImportacionTerminoProforma.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTerminoProforma,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTerminoProforma.setToolTipText("Generar"+" "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTerminoProforma.gridy = iPosYImportacion;
		this.gridBagConstraintsTerminoProforma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTerminoProforma.add(this.jButtonGenerarImportacionTerminoProforma, this.gridBagConstraintsTerminoProforma);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTerminoProforma = new JButtonMe();
		this.jButtonCerrarImportacionTerminoProforma.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTerminoProforma,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTerminoProforma.setToolTipText("Cancelar"+" "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTerminoProforma.gridy = iPosYImportacion;
		this.gridBagConstraintsTerminoProforma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTerminoProforma.add(this.jButtonCerrarImportacionTerminoProforma, this.gridBagConstraintsTerminoProforma);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTerminoProforma = new GridBagLayout();
		
		this.jScrollPanelImportacionTerminoProforma= new JScrollPane(jPanelImportacionTerminoProforma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
		this.gridBagConstraintsTerminoProforma.gridy =iPosYImportacion;
		this.gridBagConstraintsTerminoProforma.gridx =iPosXImportacion;
		this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTerminoProforma.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTerminoProforma.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTerminoProforma);
		this.jInternalFrameImportacionTerminoProforma.getContentPane().add(this.jScrollPanelImportacionTerminoProforma, this.gridBagConstraintsTerminoProforma);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTerminoProforma(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTerminoProforma = new JButtonMe();
			this.jButtonAbrirOrderByTerminoProforma.setText("Orden");
			this.jButtonAbrirOrderByTerminoProforma.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTerminoProforma,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTerminoProforma";
			inputMap = this.jButtonAbrirOrderByTerminoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTerminoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTerminoProforma"));
		
		
			GridBagLayout gridaBagLayoutOrderByTerminoProforma = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTerminoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTerminoProforma.setName("jPanelOrderByTerminoProforma"); 
			
			this.jPanelOrderByTerminoProforma.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTerminoProforma.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTerminoProforma.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTerminoProforma.setLayout(gridaBagLayoutOrderByTerminoProforma);
			
			
			this.jTableDatosTerminoProformaOrderBy = new JTableMe();        
			this.jTableDatosTerminoProformaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTerminoProformaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTerminoProformaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTerminoProformaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTerminoProformaOrderBy.setViewportView(this.jTableDatosTerminoProformaOrderBy);
			this.jTableDatosTerminoProformaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTerminoProformaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTerminoProforma= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTerminoProforma= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTerminoProforma = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTerminoProforma= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTerminoProforma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTerminoProforma.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTerminoProforma.setTitle("Orden");
			this.jInternalFrameOrderByTerminoProforma.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTerminoProforma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTerminoProforma.setResizable(true);
			this.jInternalFrameOrderByTerminoProforma.setClosable(true);
			this.jInternalFrameOrderByTerminoProforma.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTerminoProforma.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTerminoProforma.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTerminoProforma.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTerminoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Termino Proformas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsTerminoProforma.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTerminoProforma.gridx =iPosXOrderBy;
			this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTerminoProforma.ipady =150;
				
			this.jPanelOrderByTerminoProforma.add(jScrollPanelDatosTerminoProformaOrderBy, this.gridBagConstraintsTerminoProforma);//this.jTableDatosTerminoProformaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTerminoProforma = new JButtonMe();
			this.jButtonCerrarOrderByTerminoProforma.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTerminoProforma,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTerminoProforma.setToolTipText("Cancelar"+" "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTerminoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTerminoProforma.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTerminoProforma.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTerminoProforma.add(this.jButtonCerrarOrderByTerminoProforma, this.gridBagConstraintsTerminoProforma);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTerminoProforma = new GridBagLayout();
			
			this.jScrollPanelOrderByTerminoProforma= new JScrollPane(jPanelOrderByTerminoProforma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTerminoProforma = new GridBagConstraints();
			this.gridBagConstraintsTerminoProforma.gridy =iPosYOrderBy;
			this.gridBagConstraintsTerminoProforma.gridx =iPosXOrderBy;
			this.gridBagConstraintsTerminoProforma.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTerminoProforma.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTerminoProforma.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTerminoProforma);
			
			this.jInternalFrameOrderByTerminoProforma.getContentPane().add(this.jScrollPanelOrderByTerminoProforma, this.gridBagConstraintsTerminoProforma);			
		
		} else {
			this.jButtonAbrirOrderByTerminoProforma = new JButtonMe();
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
		int iWidthTableCalculado=0;//3630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.terminoproformaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTerminoProforma.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTerminoProforma.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTerminoProforma.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTerminoProforma.getRowHeight();//TerminoProformaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.terminoproformaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TerminoProformaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTerminoProforma.isSelected()) {
					iHeightTable=TerminoProformaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TerminoProformaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TerminoProformaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TerminoProformaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTerminoProforma.isSelected()) {
					iHeightTable=TerminoProformaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TerminoProformaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TerminoProformaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTerminoProforma.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTerminoProforma.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTerminoProforma.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTerminoProforma.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTerminoProforma.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTerminoProforma.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTerminoProforma!=null && this.jInternalFrameOrderByTerminoProforma.getjTableDatosOrderBy()!=null) {
			//if(!this.terminoproformaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTerminoProforma.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTerminoProforma.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTerminoProforma.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTerminoProforma.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTerminoProforma.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTerminoProforma.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTerminoProforma.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTerminoProforma.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTerminoProforma.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTerminoProforma.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=terminoproformaLogic.getTerminoProformas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=terminoproformas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	/*
	PARA MANEJAR EL TAB RELACIONES CON TABLA DE DATOS SE DEBE MODIFICAR Y VERIFICAR LOS VALORES CONTANTES:	
		final public static Integer ISWING_TAMANIOMAXIMO_TABLADATOSREL=240;//230;350;		
		final public static Integer ISWING_TAMANIOMINIMO_TABLADATOSREL=240;//230;260
		
		final public static Integer ISWING_ALTO_TABPANE=375;//375;400;260;
	CASO CONTRARIO, ESTOS VALORES SERIAN PARA CADA CASO (NO CONSTANTES)
	
	NOTA:
	* LA ALINEACION HORIZONTAL,FALTA
	*/
	
	//PARA REPORTES
	public static List<TerminoProforma> TraerTerminoProformaBeans(List<TerminoProforma> terminoproformas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TerminoProforma terminoproforma:terminoproformas) {
					
				if(!(TerminoProformaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TerminoProformaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					terminoproforma.setsDetalleGeneralEntityReporte(TerminoProformaConstantesFunciones.getTerminoProformaDescripcion(terminoproforma));
										
						
					
					

					if(terminoproforma.getDetalleTerminoProformas()!=null && Funciones.existeClass(classes,DetalleTerminoProforma.class)) {
						try{terminoproforma.setdetalleterminoproformasDescripcionReporte(new JRBeanCollectionDataSource(DetalleTerminoProformaJInternalFrame.TraerDetalleTerminoProformaBeans(terminoproforma.getDetalleTerminoProformas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//terminoproforma.setsDetalleGeneralEntityReporte(terminoproforma.getsDetalleGeneralEntityReporte());
										
				}
				
				//terminoproformabeans.add(terminoproformabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return terminoproformas;
    }
	//PARA REPORTES FIN
}
