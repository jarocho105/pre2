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

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.facturacion.util.ParametroGeneralConstantesFunciones;

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
public class ParametroGeneralJInternalFrame extends ParametroGeneralBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarParametroGeneral;
	
	protected JMenuBar jmenuBarParametroGeneral;
	
	protected JMenu jmenuParametroGeneral;
	protected JMenu jmenuDatosParametroGeneral;
	protected JMenu jmenuArchivoParametroGeneral;
	protected JMenu jmenuAccionesParametroGeneral;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosParametroGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroGeneral;	
	protected GridBagConstraints gridBagConstraintsParametroGeneral;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ParametroGeneralDetalleFormJInternalFrame jInternalFrameDetalleFormParametroGeneral;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoParametroGeneral;	
	protected ImportacionJInternalFrame jInternalFrameImportacionParametroGeneral;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TipoDocumentoGeneralBeanSwingJInternalFrame tipodocumentogeneralBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumentogeneral="";
	
	public ParametroGeneralSessionBean parametrogeneralSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TipoDocumentoGeneralSessionBean tipodocumentogeneralSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ParametroGeneral> parametrogenerals;		
	public List<ParametroGeneral> parametrogeneralsEliminados;	
	public List<ParametroGeneral> parametrogeneralsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByParametroGeneral;		
	protected JButton jButtonAbrirOrderByParametroGeneral;
	
	
	//protected JPanel jPanelOrderByParametroGeneral;
	//public JScrollPane jScrollPanelOrderByParametroGeneral;	
	//protected JButton jButtonCerrarOrderByParametroGeneral;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ParametroGeneralLogic parametrogeneralLogic;
	
	
	
	public JScrollPane jScrollPanelDatosParametroGeneral;
	public JScrollPane jScrollPanelDatosEdicionParametroGeneral;
	public JScrollPane jScrollPanelDatosGeneralParametroGeneral;
    
	
	
	//public JScrollPane jScrollPanelDatosParametroGeneralOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoParametroGeneral;
	//public JScrollPane jScrollPanelImportacionParametroGeneral;
	
	
	
	protected JPanel jPanelAccionesParametroGeneral;
	
    protected JPanel jPanelPaginacionParametroGeneral;
    protected JPanel jPanelParametrosReportesParametroGeneral;
	protected JPanel jPanelParametrosReportesAccionesParametroGeneral;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ParametroGeneral;
	protected JPanel jPanelParametrosAuxiliar2ParametroGeneral;
	protected JPanel jPanelParametrosAuxiliar3ParametroGeneral;
	protected JPanel jPanelParametrosAuxiliar4ParametroGeneral;
	//protected JPanel jPanelParametrosAuxiliar5ParametroGeneral;
	
	
	
	//protected JPanel jPanelReporteDinamicoParametroGeneral;
	//protected JPanel jPanelImportacionParametroGeneral;
	
	
	public JTable jTableDatosParametroGeneral;
	
	
	
	//public JTable jTableDatosParametroGeneralOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoParametroGeneral;
	protected JButton jButtonDuplicarParametroGeneral;
	protected JButton jButtonCopiarParametroGeneral;
	protected JButton jButtonVerFormParametroGeneral;
	protected JButton jButtonNuevoRelacionesParametroGeneral;
	protected JButton jButtonModificarParametroGeneral;
	
    protected JButton jButtonGuardarCambiosTablaParametroGeneral;
	protected JButton jButtonCerrarParametroGeneral;
	
	
	protected JButton jButtonRecargarInformacionParametroGeneral;
	protected JButton jButtonProcesarInformacionParametroGeneral;
	
	
	protected JButton jButtonAnterioresParametroGeneral;
	protected JButton jButtonSiguientesParametroGeneral;
	protected JButton jButtonNuevoGuardarCambiosParametroGeneral;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoParametroGeneral;
	//protected JButton jButtonCerrarReporteDinamicoParametroGeneral;
	//protected JButton jButtonGenerarExcelReporteDinamicoParametroGeneral;	
	
	
	
	//protected JButton jButtonAbrirImportacionParametroGeneral;
	//protected JButton jButtonGenerarImportacionParametroGeneral;
	//protected JButton jButtonCerrarImportacionParametroGeneral;
	//protected JFileChooser jFileChooserImportacionParametroGeneral;
	//protected File fileImportacionParametroGeneral;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroGeneral;
	protected JButton jButtonDuplicarToolBarParametroGeneral;
	protected JButton jButtonNuevoRelacionesToolBarParametroGeneral;
	
	
	public JButton jButtonGuardarCambiosToolBarParametroGeneral;
	protected JButton jButtonCopiarToolBarParametroGeneral;
	protected JButton jButtonVerFormToolBarParametroGeneral;
	public JButton jButtonGuardarCambiosTablaToolBarParametroGeneral;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroGeneral;
	protected JButton jButtonCerrarToolBarParametroGeneral;
	
	protected JButton jButtonRecargarInformacionToolBarParametroGeneral;
	protected JButton jButtonProcesarInformacionToolBarParametroGeneral;
	protected JButton jButtonAnterioresToolBarParametroGeneral;
	protected JButton jButtonSiguientesToolBarParametroGeneral;
	protected JButton jButtonNuevoGuardarCambiosToolBarParametroGeneral;
	protected JButton jButtonAbrirOrderByToolBarParametroGeneral;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroGeneral;
	protected JMenuItem jMenuItemDuplicarParametroGeneral;
	protected JMenuItem jMenuItemNuevoRelacionesParametroGeneral;
	
	
	protected JMenuItem jMenuItemGuardarCambiosParametroGeneral;
	protected JMenuItem jMenuItemCopiarParametroGeneral;
	protected JMenuItem jMenuItemVerFormParametroGeneral;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroGeneral;
	protected JMenuItem jMenuItemCerrarParametroGeneral;
	protected JMenuItem jMenuItemDetalleCerrarParametroGeneral;
	protected JMenuItem jMenuItemDetalleAbrirOrderByParametroGeneral;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroGeneral;
	
	protected JMenuItem jMenuItemRecargarInformacionParametroGeneral;
	protected JMenuItem jMenuItemProcesarInformacionParametroGeneral;
	protected JMenuItem jMenuItemAnterioresParametroGeneral;
	protected JMenuItem jMenuItemSiguientesParametroGeneral;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroGeneral;
	protected JMenuItem jMenuItemAbrirOrderByParametroGeneral;
	protected JMenuItem jMenuItemMostrarOcultarParametroGeneral;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroGeneral;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosParametroGeneral;
	protected JCheckBox jCheckBoxSeleccionadosParametroGeneral;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaParametroGeneral;
	protected JCheckBox jCheckBoxConGraficoReporteParametroGeneral;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesParametroGeneral;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesParametroGeneral;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoParametroGeneral;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoParametroGeneral;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesParametroGeneral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionParametroGeneral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroGeneral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroGeneral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarParametroGeneral;
	protected JTextField jTextFieldValorCampoGeneralParametroGeneral;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteParametroGeneral;
	//public JList<Reporte> jListColumnasSelectReporteParametroGeneral;
	//public JScrollPane jScrollColumnasSelectReporteParametroGeneral;
	
	//public JLabel jLabelRelacionesSelectReporteParametroGeneral;
	//public JList<Reporte> jListRelacionesSelectReporteParametroGeneral;
	//public JScrollPane jScrollRelacionesSelectReporteParametroGeneral;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoParametroGeneral;
	//protected JCheckBox jCheckBoxConGraficoDinamicoParametroGeneral;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoParametroGeneral;
	//public JLabel jLabelTiposArchivoReporteDinamicoParametroGeneral;
	
		
	//public JLabel jLabelArchivoImportacionParametroGeneral;	
	//public JLabel jLabelPathArchivoImportacionParametroGeneral;
	//protected JTextField jTextFieldPathArchivoImportacionParametroGeneral;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoParametroGeneral;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoParametroGeneral;
	
	//public JLabel jLabelColumnaCategoriaValorParametroGeneral;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorParametroGeneral;
	
	//public JLabel jLabelColumnasValoresGraficoParametroGeneral;
	//public JList<Reporte> jListColumnasValoresGraficoParametroGeneral;
	//public JScrollPane jScrollColumnasValoresGraficoParametroGeneral;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoParametroGeneral;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoParametroGeneral;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasParametroGeneral;
	public JPanel jPanelFK_IdTipoDocumentoGeneralParametroGeneral;
	public JButton jButtonFK_IdTipoDocumentoGeneralParametroGeneral;
	
	public JPanel jPanelid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroGeneral;
	public JLabel jLabelid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroGeneral;
	public JButton jButtonid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroGeneral= new JButtonMe();
	public JButton jButtonid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroGeneralUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroGeneralBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ParametroGeneralJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ParametroGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGeneralJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGeneralJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGeneralJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionParametroGeneral)	{
		this.jButtonRecargarInformacionParametroGeneral = jButtonRecargarInformacionParametroGeneral;
	}
	
	public JButton getjButtonProcesarInformacionParametroGeneral() {
		return this.jButtonProcesarInformacionParametroGeneral;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroGeneral)	{
		this.jButtonProcesarInformacionParametroGeneral = jButtonProcesarInformacionParametroGeneral;
	}
	
	
	public JButton getjButtonRecargarInformacionParametroGeneral() {
		return this.jButtonRecargarInformacionParametroGeneral;
	}
	
	
	public List<ParametroGeneral> getparametrogenerals() {
		return this.parametrogenerals;
	}

	public void setparametrogenerals(List<ParametroGeneral> parametrogenerals) {
		this.parametrogenerals = parametrogenerals;
	}
	
	public List<ParametroGeneral> getparametrogeneralsAux() {
		return this.parametrogeneralsAux;
	}

	public void setparametrogeneralsAux(List<ParametroGeneral> parametrogeneralsAux) {
		this.parametrogeneralsAux = parametrogeneralsAux;
	}
	
	public List<ParametroGeneral> getparametrogeneralsEliminados() {
		return this.parametrogeneralsEliminados;
	}

	public void setParametroGeneralsEliminados(List<ParametroGeneral> parametrogeneralsEliminados) {
		this.parametrogeneralsEliminados = parametrogeneralsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarParametroGeneral() {
		return jComboBoxTiposSeleccionarParametroGeneral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarParametroGeneral(
			JComboBox jComboBoxTiposSeleccionarParametroGeneral) {
		this.jComboBoxTiposSeleccionarParametroGeneral = jComboBoxTiposSeleccionarParametroGeneral;
	}
	
	public void setBorderResaltarTiposSeleccionarParametroGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarParametroGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarParametroGeneral .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralParametroGeneral() {
		return jTextFieldValorCampoGeneralParametroGeneral;
	}

	public void setjTextFieldValorCampoGeneralParametroGeneral(
			JTextField jTextFieldValorCampoGeneralParametroGeneral) {
		this.jTextFieldValorCampoGeneralParametroGeneral = jTextFieldValorCampoGeneralParametroGeneral;
	}

	public void setBorderResaltarValorCampoGeneralParametroGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGeneral.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralParametroGeneral .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosParametroGeneral() {
		return this.jCheckBoxSeleccionarTodosParametroGeneral;
	}

	public void setjCheckBoxSeleccionarTodosParametroGeneral(
			JCheckBox jCheckBoxSeleccionarTodosParametroGeneral) {
		this.jCheckBoxSeleccionarTodosParametroGeneral = jCheckBoxSeleccionarTodosParametroGeneral;
	}

	public void setBorderResaltarSeleccionarTodosParametroGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGeneral.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosParametroGeneral .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosParametroGeneral() {
		return this.jCheckBoxSeleccionadosParametroGeneral;
	}

	public void setjCheckBoxSeleccionadosParametroGeneral(
			JCheckBox jCheckBoxSeleccionadosParametroGeneral) {
		this.jCheckBoxSeleccionadosParametroGeneral = jCheckBoxSeleccionadosParametroGeneral;
	}
	
	public void setBorderResaltarSeleccionadosParametroGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGeneral.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosParametroGeneral .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesParametroGeneral() {
		return this.jComboBoxTiposArchivosReportesParametroGeneral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesParametroGeneral(
			JComboBox jComboBoxTiposArchivosReportesParametroGeneral) {
		this.jComboBoxTiposArchivosReportesParametroGeneral = jComboBoxTiposArchivosReportesParametroGeneral;
	}

	public void setBorderResaltarTiposArchivosReportesParametroGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesParametroGeneral .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesParametroGeneral() {
		return this.jComboBoxTiposReportesParametroGeneral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesParametroGeneral(
			JComboBox jComboBoxTiposReportesParametroGeneral) {
		this.jComboBoxTiposReportesParametroGeneral = jComboBoxTiposReportesParametroGeneral;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoParametroGeneral() {
	//	return jComboBoxTiposReportesDinamicoParametroGeneral;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoParametroGeneral(
	//		JComboBox jComboBoxTiposReportesDinamicoParametroGeneral) {
	//	this.jComboBoxTiposReportesDinamicoParametroGeneral = jComboBoxTiposReportesDinamicoParametroGeneral;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoParametroGeneral() {
	//	return jComboBoxTiposArchivosReportesDinamicoParametroGeneral;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoParametroGeneral(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoParametroGeneral) {
	//	this.jComboBoxTiposArchivosReportesDinamicoParametroGeneral = jComboBoxTiposArchivosReportesDinamicoParametroGeneral;
	//}
	
	public void setBorderResaltarTiposReportesParametroGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesParametroGeneral .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesParametroGeneral() {
		return this.jComboBoxTiposGraficosReportesParametroGeneral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesParametroGeneral(
			JComboBox jComboBoxTiposGraficosReportesParametroGeneral) {
		this.jComboBoxTiposGraficosReportesParametroGeneral = jComboBoxTiposGraficosReportesParametroGeneral;
	}
	
	public void setBorderResaltarTiposGraficosReportesParametroGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesParametroGeneral .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionParametroGeneral() {
		return this.jComboBoxTiposPaginacionParametroGeneral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionParametroGeneral(
			JComboBox jComboBoxTiposPaginacionParametroGeneral) {
		this.jComboBoxTiposPaginacionParametroGeneral = jComboBoxTiposPaginacionParametroGeneral;
	}
	
	public void setBorderResaltarTiposPaginacionParametroGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionParametroGeneral .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesParametroGeneral() {
		return this.jComboBoxTiposRelacionesParametroGeneral;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroGeneral() {
		return this.jComboBoxTiposAccionesParametroGeneral;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroGeneral(
			JComboBox jComboBoxTiposRelacionesParametroGeneral) {
		this.jComboBoxTiposRelacionesParametroGeneral = jComboBoxTiposRelacionesParametroGeneral;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroGeneral(
			JComboBox jComboBoxTiposAccionesParametroGeneral) {
		this.jComboBoxTiposAccionesParametroGeneral = jComboBoxTiposAccionesParametroGeneral;
	}
	
	public void setBorderResaltarTiposRelacionesParametroGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesParametroGeneral .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesParametroGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesParametroGeneral .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoParametroGeneral() {
	//	return jCheckBoxConGraficoDinamicoParametroGeneral;
	//}

	//public void setjCheckBoxConGraficoDinamicoParametroGeneral(
	//		JCheckBox jCheckBoxConGraficoDinamicoParametroGeneral) {
	//	this.jCheckBoxConGraficoDinamicoParametroGeneral = jCheckBoxConGraficoDinamicoParametroGeneral;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoParametroGeneral() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarParametroGeneral.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoParametroGeneral .setBorder(borderResaltar);		
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
		this.parametrogeneralSessionBean=new ParametroGeneralSessionBean();
		
		this.parametrogeneralSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrogeneralSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrogeneralSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ParametroGeneralJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ParametroGeneralJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroGeneralJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroGeneralJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroGeneralJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro General MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {
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
		
		ParametroGeneralJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ParametroGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarParametroGeneral= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarParametroGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarParametroGeneral,this.jTtoolBarParametroGeneral,
							"nuevo","nuevo","Nuevo"+" "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarParametroGeneral,this.jTtoolBarParametroGeneral,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarParametroGeneral,this.jTtoolBarParametroGeneral,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarParametroGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarParametroGeneral,this.jTtoolBarParametroGeneral,
							"duplicar","duplicar","Duplicar"+" "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarParametroGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarParametroGeneral,this.jTtoolBarParametroGeneral,
							"copiar","copiar","Copiar"+" "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarParametroGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarParametroGeneral,this.jTtoolBarParametroGeneral,
							"ver_form","ver_form","Ver"+" "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarParametroGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroGeneral,this.jTtoolBarParametroGeneral,
							"recargar","recargar","Recargar"+" "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarParametroGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroGeneral,this.jTtoolBarParametroGeneral,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarParametroGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroGeneral,this.jTtoolBarParametroGeneral,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarParametroGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarParametroGeneral,this.jTtoolBarParametroGeneral,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarParametroGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarParametroGeneral,this.jTtoolBarParametroGeneral,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarParametroGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarParametroGeneral,this.jTtoolBarParametroGeneral,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarParametroGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarParametroGeneral,this.jTtoolBarParametroGeneral,
							"cerrar","cerrar","Salir"+" "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarParametroGeneral=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarParametroGeneral;
			
				this.jButtonProcesarInformacionToolBarParametroGeneral=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarParametroGeneral;
				
		//protected JButton jButtonModificarToolBarParametroGeneral;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarParametroGeneral=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuParametroGeneral=new JMenuMe("General");
		this.jmenuArchivoParametroGeneral=new JMenuMe("Archivo");
		this.jmenuAccionesParametroGeneral=new JMenuMe("Acciones");
		this.jmenuDatosParametroGeneral=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroGeneral= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroGeneral.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroGeneral,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarParametroGeneral= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarParametroGeneral.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarParametroGeneral,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesParametroGeneral= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesParametroGeneral.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesParametroGeneral,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosParametroGeneral= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroGeneral.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroGeneral,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarParametroGeneral= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarParametroGeneral.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarParametroGeneral,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormParametroGeneral= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormParametroGeneral.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormParametroGeneral,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaParametroGeneral= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaParametroGeneral.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaParametroGeneral,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroGeneral= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroGeneral.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroGeneral,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionParametroGeneral= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionParametroGeneral.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionParametroGeneral,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionParametroGeneral= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionParametroGeneral.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionParametroGeneral,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresParametroGeneral= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresParametroGeneral.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresParametroGeneral,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesParametroGeneral= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesParametroGeneral.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesParametroGeneral,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByParametroGeneral= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByParametroGeneral.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByParametroGeneral,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroGeneral= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroGeneral.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroGeneral,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByParametroGeneral= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByParametroGeneral.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByParametroGeneral,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroGeneral= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroGeneral.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroGeneral,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosParametroGeneral= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosParametroGeneral.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosParametroGeneral,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoParametroGeneral.add(this.jMenuItemCerrarParametroGeneral);
			
			this.jmenuAccionesParametroGeneral.add(this.jMenuItemNuevoParametroGeneral);
			this.jmenuAccionesParametroGeneral.add(this.jMenuItemNuevoGuardarCambiosParametroGeneral);
			this.jmenuAccionesParametroGeneral.add(this.jMenuItemNuevoRelacionesParametroGeneral);
			this.jmenuAccionesParametroGeneral.add(this.jMenuItemGuardarCambiosTablaParametroGeneral);		
			this.jmenuAccionesParametroGeneral.add(this.jMenuItemDuplicarParametroGeneral);		
			this.jmenuAccionesParametroGeneral.add(this.jMenuItemCopiarParametroGeneral);		
			this.jmenuAccionesParametroGeneral.add(this.jMenuItemVerFormParametroGeneral);		
			
			this.jmenuDatosParametroGeneral.add(this.jMenuItemRecargarInformacionParametroGeneral);				
			this.jmenuDatosParametroGeneral.add(this.jMenuItemAnterioresParametroGeneral);				
			this.jmenuDatosParametroGeneral.add(this.jMenuItemSiguientesParametroGeneral);				
			this.jmenuDatosParametroGeneral.add(this.jMenuItemAbrirOrderByParametroGeneral);				
			this.jmenuDatosParametroGeneral.add(this.jMenuItemMostrarOcultarParametroGeneral);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesParametroGeneral.add(this.jMenuItemGuardarCambiosParametroGeneral);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarParametroGeneral.add(this.jmenuArchivoParametroGeneral);		
			this.jmenuBarParametroGeneral.add(this.jmenuAccionesParametroGeneral);		
			this.jmenuBarParametroGeneral.add(this.jmenuDatosParametroGeneral);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarParametroGeneral);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasParametroGeneral() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdTipoDocumentoGeneralParametroGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoDocumentoGeneralParametroGeneral.setToolTipText("Buscar Por Tipo Documento General ");
		this.jButtonFK_IdTipoDocumentoGeneralParametroGeneral= new JButtonMe();
		this.jButtonFK_IdTipoDocumentoGeneralParametroGeneral.setText("Buscar");
		this.jButtonFK_IdTipoDocumentoGeneralParametroGeneral.setToolTipText("Buscar Por Tipo Documento General ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoDocumentoGeneralParametroGeneral,"buscar_button","Buscar Por Tipo Documento General ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoDocumentoGeneralParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroGeneral = new JLabelMe();
		jLabelid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroGeneral.setText("Tipo Documento General :");
		jLabelid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroGeneral.setToolTipText("Tipo Documento General");
		jLabelid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroGeneral,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroGeneral= new JComboBoxMe();
		jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroGeneral,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasParametroGeneral=new JTabbedPane();


		this.jTabbedPaneBusquedasParametroGeneral.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParametroGeneral.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParametroGeneral.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasParametroGeneral.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasParametroGeneral,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleParametroGeneral = new ParametroGeneralDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Parametro General DATOS");
			this.jInternalFrameDetalleFormParametroGeneral = new ParametroGeneralDetalleFormJInternalFrame(jDesktopPane,this.parametrogeneralSessionBean.getConGuardarRelaciones(),this.parametrogeneralSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormParametroGeneral = null;//new ParametroGeneralDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroGeneral= new GridBagLayout();
		
		
		this.jTableDatosParametroGeneral = new JTableMe();      
		
		String sToolTipParametroGeneral="";
		sToolTipParametroGeneral=ParametroGeneralConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroGeneral+="(Facturacion.ParametroGeneral)";
		}
		
		if(!this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroGeneral+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosParametroGeneral.setToolTipText(sToolTipParametroGeneral);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosParametroGeneral);
		this.jTableDatosParametroGeneral.setAutoCreateRowSorter(true);
		this.jTableDatosParametroGeneral.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosParametroGeneral.setRowSelectionAllowed(true);
		this.jTableDatosParametroGeneral.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosParametroGeneral,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoParametroGeneral = new JButtonMe();
		this.jButtonDuplicarParametroGeneral = new JButtonMe();
		this.jButtonCopiarParametroGeneral = new JButtonMe();
		this.jButtonVerFormParametroGeneral = new JButtonMe();
		this.jButtonNuevoRelacionesParametroGeneral = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaParametroGeneral = new JButtonMe();
		this.jButtonCerrarParametroGeneral = new JButtonMe();
		
		this.jScrollPanelDatosParametroGeneral = new JScrollPane();   
        this.jScrollPanelDatosGeneralParametroGeneral = new JScrollPane();
		
				
		
		
		this.jPanelAccionesParametroGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro General";
		
		if(!this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Generals" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroGeneral.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroGeneral.setToolTipText("Acciones");
        this.jPanelAccionesParametroGeneral.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroGeneral, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoParametroGeneral=new ReporteDinamicoJInternalFrame(ParametroGeneralConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoParametroGeneral();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionParametroGeneral=new ImportacionJInternalFrame(ParametroGeneralConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionParametroGeneral();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByParametroGeneral = new JButtonMe();
		
		this.jButtonAbrirOrderByParametroGeneral.setText("Orden");
		this.jButtonAbrirOrderByParametroGeneral.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroGeneral,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByParametroGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroGeneral=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroGeneral,false,this);
			
			//this.cargarOrderByParametroGeneral(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroGeneral=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroGeneral,true,this);
			
			//this.cargarOrderByParametroGeneral(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosParametroGeneral.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosParametroGeneral.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosParametroGeneral.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosParametroGeneral.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroGeneral.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroGeneral.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoParametroGeneral.setText("Nuevo");
		this.jButtonDuplicarParametroGeneral.setText("Duplicar");
		this.jButtonCopiarParametroGeneral.setText("Copiar");
		this.jButtonVerFormParametroGeneral.setText("Ver");
		this.jButtonNuevoRelacionesParametroGeneral.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaParametroGeneral.setText("Guardar");
		this.jButtonCerrarParametroGeneral.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroGeneral,"nuevo_button","Nuevo",this.parametrogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarParametroGeneral,"duplicar_button","Duplicar",this.parametrogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarParametroGeneral,"copiar_button","Copiar",this.parametrogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormParametroGeneral,"ver_form","Ver",this.parametrogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesParametroGeneral,"nuevorelaciones_button","Nuevo Rel",this.parametrogeneralSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroGeneral,"guardarcambiostabla_button","Guardar",this.parametrogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroGeneral,"cerrar_button","Salir",this.parametrogeneralSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoParametroGeneral.setToolTipText("Nuevo"+" "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarParametroGeneral.setToolTipText("Duplicar"+" "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarParametroGeneral.setToolTipText("Copiar"+" "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormParametroGeneral.setToolTipText("Ver"+" "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesParametroGeneral.setToolTipText("Nuevo Rel"+" "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaParametroGeneral.setToolTipText("Guardar"+" "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroGeneral.setToolTipText("Salir"+" "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroGeneral";
		inputMap = this.jButtonNuevoParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroGeneral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroGeneral"));
		
		//DUPLICAR
		sMapKey = "DuplicarParametroGeneral";
		inputMap = this.jButtonDuplicarParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarParametroGeneral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarParametroGeneral"));
		
		//COPIAR
		sMapKey = "CopiarParametroGeneral";
		inputMap = this.jButtonCopiarParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarParametroGeneral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarParametroGeneral"));
		
		//VEr FORM
		sMapKey = "VerFormParametroGeneral";
		inputMap = this.jButtonVerFormParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormParametroGeneral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormParametroGeneral"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesParametroGeneral";
		inputMap = this.jButtonNuevoRelacionesParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesParametroGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesParametroGeneral"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarParametroGeneral";
		inputMap = this.jButtonModificarParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarParametroGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarParametroGeneral"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarParametroGeneral";
		inputMap = this.jButtonCerrarParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroGeneral"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroGeneral";
		inputMap = this.jButtonGuardarCambiosTablaParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroGeneral"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesParametroGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesParametroGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionParametroGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ParametroGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ParametroGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ParametroGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ParametroGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ParametroGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesParametroGeneral.setName("jPanelParametrosReportesParametroGeneral"); 
		
		this.jPanelParametrosReportesAccionesParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesParametroGeneral.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesParametroGeneral.setName("jPanelParametrosReportesAccionesParametroGeneral"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesParametroGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesParametroGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionParametroGeneral = new JButtonMe();
		this.jButtonRecargarInformacionParametroGeneral.setText("Recargar");
		this.jButtonRecargarInformacionParametroGeneral.setToolTipText("Recargar"+" "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionParametroGeneral,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionParametroGeneral = new JButtonMe();
		this.jButtonProcesarInformacionParametroGeneral.setText("Procesar");
		this.jButtonProcesarInformacionParametroGeneral.setToolTipText("Procesar"+" "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionParametroGeneral.setVisible(false);
			
		this.jButtonProcesarInformacionParametroGeneral.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroGeneral.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroGeneral.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesParametroGeneral = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroGeneral.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesParametroGeneral.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesParametroGeneral = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroGeneral.setText("TIPO");       
		this.jComboBoxTiposReportesParametroGeneral.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesParametroGeneral = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroGeneral.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesParametroGeneral.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionParametroGeneral = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionParametroGeneral.setText("Paginacion");
		this.jComboBoxTiposPaginacionParametroGeneral.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesParametroGeneral = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesParametroGeneral.setText("Accion");
		this.jComboBoxTiposRelacionesParametroGeneral.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesParametroGeneral = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroGeneral.setText("Accion");
		this.jComboBoxTiposAccionesParametroGeneral.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarParametroGeneral = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarParametroGeneral.setText("Accion");
		this.jComboBoxTiposSeleccionarParametroGeneral.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralParametroGeneral=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralParametroGeneral.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroGeneral.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroGeneral.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesParametroGeneral = new JLabelMe();
		
		this.jLabelAccionesParametroGeneral.setText("Acciones");		
		this.jLabelAccionesParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosParametroGeneral = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosParametroGeneral.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosParametroGeneral.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosParametroGeneral = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosParametroGeneral.setText("Seleccionados");
		this.jCheckBoxSeleccionadosParametroGeneral.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaParametroGeneral = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaParametroGeneral.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaParametroGeneral.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteParametroGeneral = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteParametroGeneral.setText("Graf.");
		this.jCheckBoxConGraficoReporteParametroGeneral.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresParametroGeneral = new JButtonMe();
		//this.jButtonAnterioresParametroGeneral.setText("<<");
        this.jButtonAnterioresParametroGeneral.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresParametroGeneral,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesParametroGeneral = new JButtonMe();
		//this.jButtonSiguientesParametroGeneral.setText(">>");
        this.jButtonSiguientesParametroGeneral.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesParametroGeneral,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosParametroGeneral = new JButtonMe();
		this.jButtonNuevoGuardarCambiosParametroGeneral.setText("Nue");
        this.jButtonNuevoGuardarCambiosParametroGeneral.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosParametroGeneral,"nuevoguardarcambios_button","Nue",this.parametrogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosParametroGeneral";
		inputMap = this.jButtonNuevoGuardarCambiosParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosParametroGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosParametroGeneral"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionParametroGeneral";
		inputMap = this.jButtonRecargarInformacionParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionParametroGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionParametroGeneral"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesParametroGeneral";
		inputMap = this.jButtonSiguientesParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesParametroGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesParametroGeneral"));
		
		//ANTERIORES		
		sMapKey = "AnterioresParametroGeneral";
		inputMap = this.jButtonAnterioresParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresParametroGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresParametroGeneral"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasParametroGeneral();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesParametroGeneral.setMinimumSize(new Dimension(this.getWidth(),ParametroGeneralBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroGeneralBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroGeneral.setMaximumSize(new Dimension(this.getWidth(),ParametroGeneralBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroGeneralBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroGeneral.setPreferredSize(new Dimension(this.getWidth(),ParametroGeneralBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroGeneralBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionParametroGeneral = new GridBagLayout();

			this.jPanelPaginacionParametroGeneral.setLayout(gridaBagLayoutPaginacionParametroGeneral);						
			
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneral.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneral.gridy = 0;
			this.gridBagConstraintsParametroGeneral.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionParametroGeneral.add(this.jButtonAnterioresParametroGeneral, this.gridBagConstraintsParametroGeneral);
					
						
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneral.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroGeneral.gridy = 0;
			
			this.jPanelPaginacionParametroGeneral.add(this.jButtonNuevoGuardarCambiosParametroGeneral, this.gridBagConstraintsParametroGeneral);
						
			
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneral.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsParametroGeneral.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroGeneral.gridy = 0;
			this.jPanelPaginacionParametroGeneral.add(this.jButtonSiguientesParametroGeneral, this.gridBagConstraintsParametroGeneral);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneral.gridy = 1;
			this.gridBagConstraintsParametroGeneral.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroGeneral.add(this.jButtonNuevoParametroGeneral, this.gridBagConstraintsParametroGeneral);
						
			
			
			if(!this.parametrogeneralSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
				this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsParametroGeneral.gridy = 1;
				this.gridBagConstraintsParametroGeneral.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionParametroGeneral.add(this.jButtonGuardarCambiosTablaParametroGeneral, this.gridBagConstraintsParametroGeneral);
			}
			
			
			
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneral.gridy = 1;
			this.gridBagConstraintsParametroGeneral.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroGeneral.add(this.jButtonDuplicarParametroGeneral, this.gridBagConstraintsParametroGeneral);
			
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneral.gridy = 1;
			this.gridBagConstraintsParametroGeneral.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroGeneral.add(this.jButtonCopiarParametroGeneral, this.gridBagConstraintsParametroGeneral);
		
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneral.gridy = 1;
			this.gridBagConstraintsParametroGeneral.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroGeneral.add(this.jButtonVerFormParametroGeneral, this.gridBagConstraintsParametroGeneral);
		
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneral.gridy = 1;
			this.gridBagConstraintsParametroGeneral.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionParametroGeneral.add(this.jButtonCerrarParametroGeneral, this.gridBagConstraintsParametroGeneral);
		
		
		
		this.jButtonRecargarInformacionParametroGeneral.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroGeneral.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroGeneral.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesParametroGeneral.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroGeneral.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroGeneral.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesParametroGeneral.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroGeneral.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroGeneral.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesParametroGeneral.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroGeneral.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroGeneral.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionParametroGeneral.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroGeneral.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroGeneral.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesParametroGeneral.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroGeneral.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroGeneral.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesParametroGeneral.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroGeneral.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroGeneral.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarParametroGeneral.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroGeneral.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroGeneral.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaParametroGeneral.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroGeneral.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroGeneral.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteParametroGeneral.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroGeneral.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroGeneral.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosParametroGeneral.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroGeneral.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroGeneral.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosParametroGeneral.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroGeneral.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroGeneral.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesParametroGeneral = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesParametroGeneral = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ParametroGeneral = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ParametroGeneral = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ParametroGeneral = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ParametroGeneral = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesParametroGeneral.setLayout(gridaBagParametrosReportesParametroGeneral);
			this.jPanelParametrosReportesAccionesParametroGeneral.setLayout(gridaBagParametrosReportesAccionesParametroGeneral);
			
			
			this.jPanelParametrosAuxiliar1ParametroGeneral.setLayout(gridaBagParametrosAuxiliar1ParametroGeneral);
			this.jPanelParametrosAuxiliar2ParametroGeneral.setLayout(gridaBagParametrosAuxiliar2ParametroGeneral);
			this.jPanelParametrosAuxiliar3ParametroGeneral.setLayout(gridaBagParametrosAuxiliar3ParametroGeneral);
			this.jPanelParametrosAuxiliar4ParametroGeneral.setLayout(gridaBagParametrosAuxiliar4ParametroGeneral);
			//this.jPanelParametrosAuxiliar5ParametroGeneral.setLayout(gridaBagParametrosAuxiliar2ParametroGeneral);			
			
			
			
			
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneral.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroGeneral.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroGeneral.add(this.jButtonRecargarInformacionParametroGeneral, this.gridBagConstraintsParametroGeneral);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneral.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGeneral.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroGeneral.add(this.jComboBoxTiposPaginacionParametroGeneral, this.gridBagConstraintsParametroGeneral);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneral.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGeneral.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroGeneral.add(this.jCheckBoxConAltoMaximoTablaParametroGeneral, this.gridBagConstraintsParametroGeneral);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneral.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGeneral.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroGeneral.add(this.jComboBoxTiposArchivosReportesParametroGeneral, this.gridBagConstraintsParametroGeneral);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGeneral.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroGeneral.add(this.jPanelParametrosAuxiliar1ParametroGeneral, this.gridBagConstraintsParametroGeneral);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneral.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroGeneral.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ParametroGeneral.add(this.jComboBoxTiposReportesParametroGeneral, this.gridBagConstraintsParametroGeneral);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGeneral.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroGeneral.add(this.jPanelParametrosAuxiliar4ParametroGeneral, this.gridBagConstraintsParametroGeneral);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneral.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGeneral.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroGeneral.add(this.jComboBoxTiposReportesParametroGeneral, this.gridBagConstraintsParametroGeneral);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGeneral.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroGeneral.add(this.jCheckBoxGenerarReporteParametroGeneral, this.gridBagConstraintsParametroGeneral);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGeneral.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroGeneral.add(this.jPanelParametrosAuxiliar2ParametroGeneral, this.gridBagConstraintsParametroGeneral);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneral.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroGeneral.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroGeneral.add(this.jLabelAccionesParametroGeneral, this.gridBagConstraintsParametroGeneral);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
				this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsParametroGeneral.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsParametroGeneral.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesParametroGeneral.add(this.jButtonAbrirOrderByParametroGeneral, this.gridBagConstraintsParametroGeneral);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsParametroGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGeneral.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroGeneral.add(this.jComboBoxTiposSeleccionarParametroGeneral, this.gridBagConstraintsParametroGeneral);			
			
			
			/*
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneral.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroGeneral.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroGeneral.add(this.jCheckBoxSeleccionarTodosParametroGeneral, this.gridBagConstraintsParametroGeneral);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneral.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroGeneral.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroGeneral.add(this.jCheckBoxSeleccionarTodosParametroGeneral, this.gridBagConstraintsParametroGeneral);															
				
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneral.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroGeneral.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroGeneral.add(this.jCheckBoxSeleccionadosParametroGeneral, this.gridBagConstraintsParametroGeneral);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGeneral.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroGeneral.add(this.jPanelParametrosAuxiliar3ParametroGeneral, this.gridBagConstraintsParametroGeneral);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGeneral.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroGeneral.add(this.jComboBoxTiposAccionesParametroGeneral, this.gridBagConstraintsParametroGeneral);
	
				
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroGeneral.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroGeneral.add(this.jTextFieldValorCampoGeneralParametroGeneral, this.gridBagConstraintsParametroGeneral);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosParametroGeneral = new GridBagLayout();

			this.jScrollPanelDatosParametroGeneral.setLayout(gridaBagLayoutDatosParametroGeneral);
			
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneral.gridy = 0;
			this.gridBagConstraintsParametroGeneral.gridx = 0;
			
			this.jScrollPanelDatosParametroGeneral.add(this.jTableDatosParametroGeneral, this.gridBagConstraintsParametroGeneral);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosParametroGeneral.setViewportView(this.jTableDatosParametroGeneral);
		this.jTableDatosParametroGeneral.setFillsViewportHeight(true);
		this.jTableDatosParametroGeneral.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesParametroGeneral= new GridBagLayout();
		this.jPanelAccionesParametroGeneral.setLayout(gridaBagLayoutAccionesParametroGeneral);
		
		
		/*	
		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGeneral.gridy = 0;
		this.gridBagConstraintsParametroGeneral.gridx = 0;
			
		this.jPanelAccionesParametroGeneral.add(this.jButtonNuevoParametroGeneral, this.gridBagConstraintsParametroGeneral);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdTipoDocumentoGeneralParametroGeneral= new GridBagLayout();
		gridaBagLayoutFK_IdTipoDocumentoGeneralParametroGeneral.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoDocumentoGeneralParametroGeneral.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoDocumentoGeneralParametroGeneral.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoDocumentoGeneralParametroGeneral.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoDocumentoGeneralParametroGeneral.setLayout(gridaBagLayoutFK_IdTipoDocumentoGeneralParametroGeneral);

		gridBagConstraintsParametroGeneral = new GridBagConstraints();
		gridBagConstraintsParametroGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGeneral.gridy = 0;
		gridBagConstraintsParametroGeneral.gridx = 0;
		jPanelFK_IdTipoDocumentoGeneralParametroGeneral.add(jLabelid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroGeneral, gridBagConstraintsParametroGeneral);

		gridBagConstraintsParametroGeneral = new GridBagConstraints();
		gridBagConstraintsParametroGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGeneral.gridy = 0;
		gridBagConstraintsParametroGeneral.gridx = 1;
		jPanelFK_IdTipoDocumentoGeneralParametroGeneral.add(jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroGeneral, gridBagConstraintsParametroGeneral);

		gridBagConstraintsParametroGeneral = new GridBagConstraints();
		gridBagConstraintsParametroGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroGeneral.gridy = 1;
		gridBagConstraintsParametroGeneral.gridx =1;
		jPanelFK_IdTipoDocumentoGeneralParametroGeneral.add(jButtonFK_IdTipoDocumentoGeneralParametroGeneral, gridBagConstraintsParametroGeneral);

		jTabbedPaneBusquedasParametroGeneral.addTab("1.-Por Tipo Documento General ", jPanelFK_IdTipoDocumentoGeneralParametroGeneral);
		jTabbedPaneBusquedasParametroGeneral.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroGeneral = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroGeneral);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();						
			this.gridBagConstraintsParametroGeneral.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroGeneral.gridx = 0;		
			//this.gridBagConstraintsParametroGeneral.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneral.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroGeneral.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarParametroGeneral, this.gridBagConstraintsParametroGeneral);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneral.gridy = iGridyPrincipal++;
		this.gridBagConstraintsParametroGeneral.gridx = 0;		
		//this.gridBagConstraintsParametroGeneral.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGeneral.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsParametroGeneral.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsParametroGeneral);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsParametroGeneral.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroGeneral.gridx = 0;		
			this.gridBagConstraintsParametroGeneral.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneral.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsParametroGeneral.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasParametroGeneral, this.gridBagConstraintsParametroGeneral);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroGeneral.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesParametroGeneral, this.gridBagConstraintsParametroGeneral);								
		
		
		/*
		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroGeneral.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesParametroGeneral, this.gridBagConstraintsParametroGeneral);
		*/		
		
		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneral.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroGeneral.gridx =0;
		this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroGeneral.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroGeneral, this.gridBagConstraintsParametroGeneral);
				
		
		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroGeneral.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionParametroGeneral, this.gridBagConstraintsParametroGeneral);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ParametroGeneralJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosParametroGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroGeneral = new GridBagLayout();
			this.jPanelBusquedasParametrosParametroGeneral.setLayout(gridaBagLayoutBusquedasParametrosParametroGeneral);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralParametroGeneral=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroGeneral.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroGeneral.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroGeneral.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroGeneral.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroGeneral, this.gridBagConstraintsParametroGeneral);
			
			
		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroGeneral.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroGeneral, this.gridBagConstraintsParametroGeneral);
		
			
		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneral.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroGeneral.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroGeneral, this.gridBagConstraintsParametroGeneral);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralParametroGeneral;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoParametroGeneral() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoParametroGeneral = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoParametroGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoParametroGeneral.setName("jPanelReporteDinamicoParametroGeneral"); 
		
		this.jPanelReporteDinamicoParametroGeneral.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroGeneral.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroGeneral.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoParametroGeneral.setLayout(gridaBagLayoutReporteDinamicoParametroGeneral);
		
		
		this.jInternalFrameReporteDinamicoParametroGeneral= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoParametroGeneral = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroGeneral= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoParametroGeneral.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoParametroGeneral.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoParametroGeneral.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoParametroGeneral.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoParametroGeneral.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoParametroGeneral.setResizable(true);
	    this.jInternalFrameReporteDinamicoParametroGeneral.setClosable(true);
	    this.jInternalFrameReporteDinamicoParametroGeneral.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoParametroGeneral.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroGeneral.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroGeneral.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Generals"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteParametroGeneral = new JLabelMe();

		this.jLabelColumnasSelectReporteParametroGeneral.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGeneral.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroGeneral.add(this.jLabelColumnasSelectReporteParametroGeneral, this.gridBagConstraintsParametroGeneral);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteParametroGeneral = new JList<Reporte>();
		this.jListColumnasSelectReporteParametroGeneral.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteParametroGeneral.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteParametroGeneral.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroGeneral.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroGeneral.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteParametroGeneral=new JScrollPane(this.jListColumnasSelectReporteParametroGeneral);
			
			this.jScrollColumnasSelectReporteParametroGeneral.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroGeneral.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroGeneral.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGeneral.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoParametroGeneral.add(this.jListColumnasSelectReporteParametroGeneral, this.gridBagConstraintsParametroGeneral);
		this.jPanelReporteDinamicoParametroGeneral.add(this.jScrollColumnasSelectReporteParametroGeneral, this.gridBagConstraintsParametroGeneral);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteParametroGeneral = new JLabelMe();

		this.jLabelRelacionesSelectReporteParametroGeneral.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteParametroGeneral = new JList<Reporte>();
		this.jListRelacionesSelectReporteParametroGeneral.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteParametroGeneral.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteParametroGeneral.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroGeneral.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroGeneral.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteParametroGeneral=new JScrollPane(this.jListRelacionesSelectReporteParametroGeneral);
			
			this.jScrollRelacionesSelectReporteParametroGeneral.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroGeneral.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroGeneral.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoParametroGeneral = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoParametroGeneral = new JComboBoxMe();
		this.jListColumnasValoresGraficoParametroGeneral = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoParametroGeneral = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoParametroGeneral.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoParametroGeneral.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroGeneral.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroGeneral.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoParametroGeneral = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoParametroGeneral.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoParametroGeneral.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroGeneral.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroGeneral.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoParametroGeneral = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoParametroGeneral.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGeneral.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroGeneral.add(this.jLabelGenerarExcelReporteDinamicoParametroGeneral, this.gridBagConstraintsParametroGeneral);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoParametroGeneral = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoParametroGeneral.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoParametroGeneral,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoParametroGeneral.setToolTipText("Generar EXCEL"+" "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsParametroGeneral.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsParametroGeneral.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoParametroGeneral.add(this.jButtonGenerarExcelReporteDinamicoParametroGeneral, this.gridBagConstraintsParametroGeneral);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGeneral.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroGeneral.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroGeneral.add(this.jComboBoxTiposReportesDinamicoParametroGeneral, this.gridBagConstraintsParametroGeneral);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoParametroGeneral = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoParametroGeneral.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroGeneral.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroGeneral.add(this.jLabelTiposArchivoReporteDinamicoParametroGeneral, this.gridBagConstraintsParametroGeneral);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGeneral.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroGeneral.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroGeneral.add(this.jComboBoxTiposArchivosReportesDinamicoParametroGeneral, this.gridBagConstraintsParametroGeneral);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoParametroGeneral = new JButtonMe();
		this.jButtonGenerarReporteDinamicoParametroGeneral.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoParametroGeneral,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoParametroGeneral.setToolTipText("Generar"+" "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGeneral.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroGeneral.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroGeneral.add(this.jButtonGenerarReporteDinamicoParametroGeneral, this.gridBagConstraintsParametroGeneral);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoParametroGeneral = new JButtonMe();
		this.jButtonCerrarReporteDinamicoParametroGeneral.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoParametroGeneral,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoParametroGeneral.setToolTipText("Cancelar"+" "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGeneral.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroGeneral.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroGeneral.add(this.jButtonCerrarReporteDinamicoParametroGeneral, this.gridBagConstraintsParametroGeneral);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalParametroGeneral = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoParametroGeneral= new JScrollPane(jPanelReporteDinamicoParametroGeneral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoParametroGeneral.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroGeneral.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroGeneral.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Generals"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneral.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsParametroGeneral.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoParametroGeneral.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoParametroGeneral.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalParametroGeneral);
		this.jInternalFrameReporteDinamicoParametroGeneral.getContentPane().add(this.jScrollPanelReporteDinamicoParametroGeneral, this.gridBagConstraintsParametroGeneral);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionParametroGeneral() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionParametroGeneral = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionParametroGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionParametroGeneral.setName("jPanelImportacionParametroGeneral"); 
		
		this.jPanelImportacionParametroGeneral.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroGeneral.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroGeneral.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionParametroGeneral.setLayout(gridaBagLayoutImportacionParametroGeneral);
		
		
		this.jInternalFrameImportacionParametroGeneral= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionParametroGeneral= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionParametroGeneral = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroGeneral= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionParametroGeneral.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroGeneral.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroGeneral.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionParametroGeneral.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroGeneral.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroGeneral.setResizable(true);
	    this.jInternalFrameImportacionParametroGeneral.setClosable(true);
	    this.jInternalFrameImportacionParametroGeneral.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionParametroGeneral.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroGeneral.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroGeneral.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionParametroGeneral.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroGeneral.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroGeneral.setResizable(true);
	    this.jInternalFrameImportacionParametroGeneral.setClosable(true);
	    this.jInternalFrameImportacionParametroGeneral.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionParametroGeneral.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroGeneral.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroGeneral.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Generals"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionParametroGeneral = new JLabelMe();

		this.jLabelArchivoImportacionParametroGeneral.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneral.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroGeneral.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroGeneral.add(this.jLabelArchivoImportacionParametroGeneral, this.gridBagConstraintsParametroGeneral);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionParametroGeneral = new JFileChooser();		
		this.jFileChooserImportacionParametroGeneral.setToolTipText("ESCOGER ARCHIVO"+" "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionParametroGeneral = new JButtonMe();
		this.jButtonAbrirImportacionParametroGeneral.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionParametroGeneral,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionParametroGeneral.setToolTipText("Generar"+" "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGeneral.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroGeneral.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroGeneral.add(this.jButtonAbrirImportacionParametroGeneral, this.gridBagConstraintsParametroGeneral);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionParametroGeneral = new JLabelMe();

		this.jLabelPathArchivoImportacionParametroGeneral.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneral.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroGeneral.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroGeneral.add(this.jLabelPathArchivoImportacionParametroGeneral, this.gridBagConstraintsParametroGeneral);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionParametroGeneral=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionParametroGeneral.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroGeneral.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroGeneral.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGeneral.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroGeneral.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroGeneral.add(this.jTextFieldPathArchivoImportacionParametroGeneral, this.gridBagConstraintsParametroGeneral);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionParametroGeneral = new JButtonMe();
		this.jButtonGenerarImportacionParametroGeneral.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionParametroGeneral,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionParametroGeneral.setToolTipText("Generar"+" "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGeneral.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroGeneral.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroGeneral.add(this.jButtonGenerarImportacionParametroGeneral, this.gridBagConstraintsParametroGeneral);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionParametroGeneral = new JButtonMe();
		this.jButtonCerrarImportacionParametroGeneral.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionParametroGeneral,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionParametroGeneral.setToolTipText("Cancelar"+" "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGeneral.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroGeneral.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroGeneral.add(this.jButtonCerrarImportacionParametroGeneral, this.gridBagConstraintsParametroGeneral);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalParametroGeneral = new GridBagLayout();
		
		this.jScrollPanelImportacionParametroGeneral= new JScrollPane(jPanelImportacionParametroGeneral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneral.gridy =iPosYImportacion;
		this.gridBagConstraintsParametroGeneral.gridx =iPosXImportacion;
		this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionParametroGeneral.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionParametroGeneral.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalParametroGeneral);
		this.jInternalFrameImportacionParametroGeneral.getContentPane().add(this.jScrollPanelImportacionParametroGeneral, this.gridBagConstraintsParametroGeneral);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByParametroGeneral(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByParametroGeneral = new JButtonMe();
			this.jButtonAbrirOrderByParametroGeneral.setText("Orden");
			this.jButtonAbrirOrderByParametroGeneral.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroGeneral,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByParametroGeneral";
			inputMap = this.jButtonAbrirOrderByParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByParametroGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByParametroGeneral"));
		
		
			GridBagLayout gridaBagLayoutOrderByParametroGeneral = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByParametroGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByParametroGeneral.setName("jPanelOrderByParametroGeneral"); 
			
			this.jPanelOrderByParametroGeneral.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroGeneral.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroGeneral.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByParametroGeneral.setLayout(gridaBagLayoutOrderByParametroGeneral);
			
			
			this.jTableDatosParametroGeneralOrderBy = new JTableMe();        
			this.jTableDatosParametroGeneralOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosParametroGeneralOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosParametroGeneralOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosParametroGeneralOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosParametroGeneralOrderBy.setViewportView(this.jTableDatosParametroGeneralOrderBy);
			this.jTableDatosParametroGeneralOrderBy.setFillsViewportHeight(true);
			this.jTableDatosParametroGeneralOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByParametroGeneral= new OrderByJInternalFrame();
			this.jInternalFrameOrderByParametroGeneral= new OrderByJInternalFrame();
			this.jScrollPanelOrderByParametroGeneral = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteParametroGeneral= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByParametroGeneral.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByParametroGeneral.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByParametroGeneral.setTitle("Orden");
			this.jInternalFrameOrderByParametroGeneral.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByParametroGeneral.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByParametroGeneral.setResizable(true);
			this.jInternalFrameOrderByParametroGeneral.setClosable(true);
			this.jInternalFrameOrderByParametroGeneral.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByParametroGeneral.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroGeneral.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroGeneral.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Generals"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneral.gridy =iPosYOrderBy++;
			this.gridBagConstraintsParametroGeneral.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsParametroGeneral.ipady =150;
				
			this.jPanelOrderByParametroGeneral.add(jScrollPanelDatosParametroGeneralOrderBy, this.gridBagConstraintsParametroGeneral);//this.jTableDatosParametroGeneralTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByParametroGeneral = new JButtonMe();
			this.jButtonCerrarOrderByParametroGeneral.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByParametroGeneral,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByParametroGeneral.setToolTipText("Cancelar"+" "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneral.gridy = iPosYOrderBy++;
			this.gridBagConstraintsParametroGeneral.gridx = iPosXOrderBy;
									
			this.jPanelOrderByParametroGeneral.add(this.jButtonCerrarOrderByParametroGeneral, this.gridBagConstraintsParametroGeneral);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalParametroGeneral = new GridBagLayout();
			
			this.jScrollPanelOrderByParametroGeneral= new JScrollPane(jPanelOrderByParametroGeneral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneral.gridy =iPosYOrderBy;
			this.gridBagConstraintsParametroGeneral.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByParametroGeneral.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByParametroGeneral.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalParametroGeneral);
			
			this.jInternalFrameOrderByParametroGeneral.getContentPane().add(this.jScrollPanelOrderByParametroGeneral, this.gridBagConstraintsParametroGeneral);			
		
		} else {
			this.jButtonAbrirOrderByParametroGeneral = new JButtonMe();
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
		int iWidthTableCalculado=0;//1730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.parametrogeneralSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosParametroGeneral.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosParametroGeneral.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosParametroGeneral.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosParametroGeneral.getRowHeight();//ParametroGeneralConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ParametroGeneralConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroGeneral.isSelected()) {
					iHeightTable=ParametroGeneralConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroGeneralConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroGeneralConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ParametroGeneralConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroGeneral.isSelected()) {
					iHeightTable=ParametroGeneralConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroGeneralConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroGeneralConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosParametroGeneral.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroGeneral.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroGeneral.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosParametroGeneral.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroGeneral.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroGeneral.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByParametroGeneral!=null && this.jInternalFrameOrderByParametroGeneral.getjTableDatosOrderBy()!=null) {
			//if(!this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByParametroGeneral.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByParametroGeneral.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByParametroGeneral.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByParametroGeneral.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByParametroGeneral.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByParametroGeneral.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByParametroGeneral.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosParametroGeneral.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroGeneral.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroGeneral.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=parametrogeneralLogic.getParametroGenerals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrogenerals.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ParametroGeneral> TraerParametroGeneralBeans(List<ParametroGeneral> parametrogenerals,ArrayList<Classe> classes)throws Exception {
		try {
			for(ParametroGeneral parametrogeneral:parametrogenerals) {
					
				if(!(ParametroGeneralConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ParametroGeneralConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					parametrogeneral.setsDetalleGeneralEntityReporte(ParametroGeneralConstantesFunciones.getParametroGeneralDescripcion(parametrogeneral));
										
					parametrogeneral.setesta_activo_descripcion(ParametroGeneralConstantesFunciones.getesta_activoDescripcion(parametrogeneral));	
					
						
					
				} else  {
							
					//parametrogeneral.setsDetalleGeneralEntityReporte(parametrogeneral.getsDetalleGeneralEntityReporte());
										
				}
				
				//parametrogeneralbeans.add(parametrogeneralbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return parametrogenerals;
    }
	//PARA REPORTES FIN
}
