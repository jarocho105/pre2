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
package com.bydan.erp.sris.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.sris.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.sris.util.DocumentoAnuladoConstantesFunciones;

import com.bydan.erp.sris.business.logic.*;
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
public class DocumentoAnuladoJInternalFrame extends DocumentoAnuladoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDocumentoAnulado;
	
	protected JMenuBar jmenuBarDocumentoAnulado;
	
	protected JMenu jmenuDocumentoAnulado;
	protected JMenu jmenuDatosDocumentoAnulado;
	protected JMenu jmenuArchivoDocumentoAnulado;
	protected JMenu jmenuAccionesDocumentoAnulado;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDocumentoAnulado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDocumentoAnulado;	
	protected GridBagConstraints gridBagConstraintsDocumentoAnulado;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DocumentoAnuladoDetalleFormJInternalFrame jInternalFrameDetalleFormDocumentoAnulado;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDocumentoAnulado;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDocumentoAnulado;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected PeriodoDeclaraBeanSwingJInternalFrame periododeclaraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periododeclara="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TipoComprobanteBeanSwingJInternalFrame tipocomprobanteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocomprobante="";
	
	public DocumentoAnuladoSessionBean documentoanuladoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public PeriodoDeclaraSessionBean periododeclaraSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TipoComprobanteSessionBean tipocomprobanteSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DocumentoAnulado> documentoanulados;		
	public List<DocumentoAnulado> documentoanuladosEliminados;	
	public List<DocumentoAnulado> documentoanuladosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDocumentoAnulado;		
	protected JButton jButtonAbrirOrderByDocumentoAnulado;
	
	
	//protected JPanel jPanelOrderByDocumentoAnulado;
	//public JScrollPane jScrollPanelOrderByDocumentoAnulado;	
	//protected JButton jButtonCerrarOrderByDocumentoAnulado;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DocumentoAnuladoLogic documentoanuladoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDocumentoAnulado;
	public JScrollPane jScrollPanelDatosEdicionDocumentoAnulado;
	public JScrollPane jScrollPanelDatosGeneralDocumentoAnulado;
    
	
	
	//public JScrollPane jScrollPanelDatosDocumentoAnuladoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDocumentoAnulado;
	//public JScrollPane jScrollPanelImportacionDocumentoAnulado;
	
	
	
	protected JPanel jPanelAccionesDocumentoAnulado;
	
    protected JPanel jPanelPaginacionDocumentoAnulado;
    protected JPanel jPanelParametrosReportesDocumentoAnulado;
	protected JPanel jPanelParametrosReportesAccionesDocumentoAnulado;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DocumentoAnulado;
	protected JPanel jPanelParametrosAuxiliar2DocumentoAnulado;
	protected JPanel jPanelParametrosAuxiliar3DocumentoAnulado;
	protected JPanel jPanelParametrosAuxiliar4DocumentoAnulado;
	//protected JPanel jPanelParametrosAuxiliar5DocumentoAnulado;
	
	
	
	//protected JPanel jPanelReporteDinamicoDocumentoAnulado;
	//protected JPanel jPanelImportacionDocumentoAnulado;
	
	
	public JTable jTableDatosDocumentoAnulado;
	
	
	
	//public JTable jTableDatosDocumentoAnuladoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDocumentoAnulado;
	protected JButton jButtonDuplicarDocumentoAnulado;
	protected JButton jButtonCopiarDocumentoAnulado;
	protected JButton jButtonVerFormDocumentoAnulado;
	protected JButton jButtonNuevoRelacionesDocumentoAnulado;
	protected JButton jButtonModificarDocumentoAnulado;
	
    protected JButton jButtonGuardarCambiosTablaDocumentoAnulado;
	protected JButton jButtonCerrarDocumentoAnulado;
	
	
	protected JButton jButtonRecargarInformacionDocumentoAnulado;
	protected JButton jButtonProcesarInformacionDocumentoAnulado;
	
	
	protected JButton jButtonAnterioresDocumentoAnulado;
	protected JButton jButtonSiguientesDocumentoAnulado;
	protected JButton jButtonNuevoGuardarCambiosDocumentoAnulado;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDocumentoAnulado;
	//protected JButton jButtonCerrarReporteDinamicoDocumentoAnulado;
	//protected JButton jButtonGenerarExcelReporteDinamicoDocumentoAnulado;	
	
	
	
	//protected JButton jButtonAbrirImportacionDocumentoAnulado;
	//protected JButton jButtonGenerarImportacionDocumentoAnulado;
	//protected JButton jButtonCerrarImportacionDocumentoAnulado;
	//protected JFileChooser jFileChooserImportacionDocumentoAnulado;
	//protected File fileImportacionDocumentoAnulado;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDocumentoAnulado;
	protected JButton jButtonDuplicarToolBarDocumentoAnulado;
	protected JButton jButtonNuevoRelacionesToolBarDocumentoAnulado;
	
	
	public JButton jButtonGuardarCambiosToolBarDocumentoAnulado;
	protected JButton jButtonCopiarToolBarDocumentoAnulado;
	protected JButton jButtonVerFormToolBarDocumentoAnulado;
	public JButton jButtonGuardarCambiosTablaToolBarDocumentoAnulado;
	protected JButton jButtonMostrarOcultarTablaToolBarDocumentoAnulado;
	protected JButton jButtonCerrarToolBarDocumentoAnulado;
	
	protected JButton jButtonRecargarInformacionToolBarDocumentoAnulado;
	protected JButton jButtonProcesarInformacionToolBarDocumentoAnulado;
	protected JButton jButtonAnterioresToolBarDocumentoAnulado;
	protected JButton jButtonSiguientesToolBarDocumentoAnulado;
	protected JButton jButtonNuevoGuardarCambiosToolBarDocumentoAnulado;
	protected JButton jButtonAbrirOrderByToolBarDocumentoAnulado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDocumentoAnulado;
	protected JMenuItem jMenuItemDuplicarDocumentoAnulado;
	protected JMenuItem jMenuItemNuevoRelacionesDocumentoAnulado;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDocumentoAnulado;
	protected JMenuItem jMenuItemCopiarDocumentoAnulado;
	protected JMenuItem jMenuItemVerFormDocumentoAnulado;
	protected JMenuItem jMenuItemGuardarCambiosTablaDocumentoAnulado;
	protected JMenuItem jMenuItemCerrarDocumentoAnulado;
	protected JMenuItem jMenuItemDetalleCerrarDocumentoAnulado;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDocumentoAnulado;
	protected JMenuItem jMenuItemDetalleMostarOcultarDocumentoAnulado;
	
	protected JMenuItem jMenuItemRecargarInformacionDocumentoAnulado;
	protected JMenuItem jMenuItemProcesarInformacionDocumentoAnulado;
	protected JMenuItem jMenuItemAnterioresDocumentoAnulado;
	protected JMenuItem jMenuItemSiguientesDocumentoAnulado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDocumentoAnulado;
	protected JMenuItem jMenuItemAbrirOrderByDocumentoAnulado;
	protected JMenuItem jMenuItemMostrarOcultarDocumentoAnulado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDocumentoAnulado;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDocumentoAnulado;
	protected JCheckBox jCheckBoxSeleccionadosDocumentoAnulado;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDocumentoAnulado;
	protected JCheckBox jCheckBoxConGraficoReporteDocumentoAnulado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDocumentoAnulado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDocumentoAnulado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDocumentoAnulado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDocumentoAnulado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDocumentoAnulado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDocumentoAnulado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDocumentoAnulado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDocumentoAnulado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDocumentoAnulado;
	protected JTextField jTextFieldValorCampoGeneralDocumentoAnulado;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDocumentoAnulado;
	//public JList<Reporte> jListColumnasSelectReporteDocumentoAnulado;
	//public JScrollPane jScrollColumnasSelectReporteDocumentoAnulado;
	
	//public JLabel jLabelRelacionesSelectReporteDocumentoAnulado;
	//public JList<Reporte> jListRelacionesSelectReporteDocumentoAnulado;
	//public JScrollPane jScrollRelacionesSelectReporteDocumentoAnulado;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDocumentoAnulado;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDocumentoAnulado;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDocumentoAnulado;
	//public JLabel jLabelTiposArchivoReporteDinamicoDocumentoAnulado;
	
		
	//public JLabel jLabelArchivoImportacionDocumentoAnulado;	
	//public JLabel jLabelPathArchivoImportacionDocumentoAnulado;
	//protected JTextField jTextFieldPathArchivoImportacionDocumentoAnulado;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDocumentoAnulado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDocumentoAnulado;
	
	//public JLabel jLabelColumnaCategoriaValorDocumentoAnulado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDocumentoAnulado;
	
	//public JLabel jLabelColumnasValoresGraficoDocumentoAnulado;
	//public JList<Reporte> jListColumnasValoresGraficoDocumentoAnulado;
	//public JScrollPane jScrollColumnasValoresGraficoDocumentoAnulado;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDocumentoAnulado;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDocumentoAnulado;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDocumentoAnulado;
	public JPanel jPanelFK_IdPeriodoDeclaraDocumentoAnulado;
	public JButton jButtonFK_IdPeriodoDeclaraDocumentoAnulado;
	public JPanel jPanelFK_IdTipoComprobanteDocumentoAnulado;
	public JButton jButtonFK_IdTipoComprobanteDocumentoAnulado;
	
	public JPanel jPanelid_periodo_declaraFK_IdPeriodoDeclaraDocumentoAnulado;
	public JLabel jLabelid_periodo_declaraFK_IdPeriodoDeclaraDocumentoAnulado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraDocumentoAnulado;
	public JButton jButtonid_periodo_declaraFK_IdPeriodoDeclaraDocumentoAnulado= new JButtonMe();
	public JButton jButtonid_periodo_declaraFK_IdPeriodoDeclaraDocumentoAnuladoUpdate= new JButtonMe();
	public JButton jButtonid_periodo_declaraFK_IdPeriodoDeclaraDocumentoAnuladoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_comprobanteFK_IdTipoComprobanteDocumentoAnulado;
	public JLabel jLabelid_tipo_comprobanteFK_IdTipoComprobanteDocumentoAnulado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteDocumentoAnulado;
	public JButton jButtonid_tipo_comprobanteFK_IdTipoComprobanteDocumentoAnulado= new JButtonMe();
	public JButton jButtonid_tipo_comprobanteFK_IdTipoComprobanteDocumentoAnuladoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_comprobanteFK_IdTipoComprobanteDocumentoAnuladoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DocumentoAnuladoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DocumentoAnulado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DocumentoAnuladoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DocumentoAnulado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DocumentoAnuladoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DocumentoAnulado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DocumentoAnuladoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DocumentoAnulado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDocumentoAnulado)	{
		this.jButtonRecargarInformacionDocumentoAnulado = jButtonRecargarInformacionDocumentoAnulado;
	}
	
	public JButton getjButtonProcesarInformacionDocumentoAnulado() {
		return this.jButtonProcesarInformacionDocumentoAnulado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDocumentoAnulado)	{
		this.jButtonProcesarInformacionDocumentoAnulado = jButtonProcesarInformacionDocumentoAnulado;
	}
	
	
	public JButton getjButtonRecargarInformacionDocumentoAnulado() {
		return this.jButtonRecargarInformacionDocumentoAnulado;
	}
	
	
	public List<DocumentoAnulado> getdocumentoanulados() {
		return this.documentoanulados;
	}

	public void setdocumentoanulados(List<DocumentoAnulado> documentoanulados) {
		this.documentoanulados = documentoanulados;
	}
	
	public List<DocumentoAnulado> getdocumentoanuladosAux() {
		return this.documentoanuladosAux;
	}

	public void setdocumentoanuladosAux(List<DocumentoAnulado> documentoanuladosAux) {
		this.documentoanuladosAux = documentoanuladosAux;
	}
	
	public List<DocumentoAnulado> getdocumentoanuladosEliminados() {
		return this.documentoanuladosEliminados;
	}

	public void setDocumentoAnuladosEliminados(List<DocumentoAnulado> documentoanuladosEliminados) {
		this.documentoanuladosEliminados = documentoanuladosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDocumentoAnulado() {
		return jComboBoxTiposSeleccionarDocumentoAnulado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDocumentoAnulado(
			JComboBox jComboBoxTiposSeleccionarDocumentoAnulado) {
		this.jComboBoxTiposSeleccionarDocumentoAnulado = jComboBoxTiposSeleccionarDocumentoAnulado;
	}
	
	public void setBorderResaltarTiposSeleccionarDocumentoAnulado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDocumentoAnulado.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDocumentoAnulado .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDocumentoAnulado() {
		return jTextFieldValorCampoGeneralDocumentoAnulado;
	}

	public void setjTextFieldValorCampoGeneralDocumentoAnulado(
			JTextField jTextFieldValorCampoGeneralDocumentoAnulado) {
		this.jTextFieldValorCampoGeneralDocumentoAnulado = jTextFieldValorCampoGeneralDocumentoAnulado;
	}

	public void setBorderResaltarValorCampoGeneralDocumentoAnulado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDocumentoAnulado.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDocumentoAnulado .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDocumentoAnulado() {
		return this.jCheckBoxSeleccionarTodosDocumentoAnulado;
	}

	public void setjCheckBoxSeleccionarTodosDocumentoAnulado(
			JCheckBox jCheckBoxSeleccionarTodosDocumentoAnulado) {
		this.jCheckBoxSeleccionarTodosDocumentoAnulado = jCheckBoxSeleccionarTodosDocumentoAnulado;
	}

	public void setBorderResaltarSeleccionarTodosDocumentoAnulado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDocumentoAnulado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDocumentoAnulado .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDocumentoAnulado() {
		return this.jCheckBoxSeleccionadosDocumentoAnulado;
	}

	public void setjCheckBoxSeleccionadosDocumentoAnulado(
			JCheckBox jCheckBoxSeleccionadosDocumentoAnulado) {
		this.jCheckBoxSeleccionadosDocumentoAnulado = jCheckBoxSeleccionadosDocumentoAnulado;
	}
	
	public void setBorderResaltarSeleccionadosDocumentoAnulado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDocumentoAnulado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDocumentoAnulado .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDocumentoAnulado() {
		return this.jComboBoxTiposArchivosReportesDocumentoAnulado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDocumentoAnulado(
			JComboBox jComboBoxTiposArchivosReportesDocumentoAnulado) {
		this.jComboBoxTiposArchivosReportesDocumentoAnulado = jComboBoxTiposArchivosReportesDocumentoAnulado;
	}

	public void setBorderResaltarTiposArchivosReportesDocumentoAnulado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDocumentoAnulado.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDocumentoAnulado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDocumentoAnulado() {
		return this.jComboBoxTiposReportesDocumentoAnulado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDocumentoAnulado(
			JComboBox jComboBoxTiposReportesDocumentoAnulado) {
		this.jComboBoxTiposReportesDocumentoAnulado = jComboBoxTiposReportesDocumentoAnulado;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDocumentoAnulado() {
	//	return jComboBoxTiposReportesDinamicoDocumentoAnulado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDocumentoAnulado(
	//		JComboBox jComboBoxTiposReportesDinamicoDocumentoAnulado) {
	//	this.jComboBoxTiposReportesDinamicoDocumentoAnulado = jComboBoxTiposReportesDinamicoDocumentoAnulado;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDocumentoAnulado() {
	//	return jComboBoxTiposArchivosReportesDinamicoDocumentoAnulado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDocumentoAnulado(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDocumentoAnulado) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDocumentoAnulado = jComboBoxTiposArchivosReportesDinamicoDocumentoAnulado;
	//}
	
	public void setBorderResaltarTiposReportesDocumentoAnulado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDocumentoAnulado.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDocumentoAnulado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDocumentoAnulado() {
		return this.jComboBoxTiposGraficosReportesDocumentoAnulado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDocumentoAnulado(
			JComboBox jComboBoxTiposGraficosReportesDocumentoAnulado) {
		this.jComboBoxTiposGraficosReportesDocumentoAnulado = jComboBoxTiposGraficosReportesDocumentoAnulado;
	}
	
	public void setBorderResaltarTiposGraficosReportesDocumentoAnulado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDocumentoAnulado.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDocumentoAnulado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDocumentoAnulado() {
		return this.jComboBoxTiposPaginacionDocumentoAnulado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDocumentoAnulado(
			JComboBox jComboBoxTiposPaginacionDocumentoAnulado) {
		this.jComboBoxTiposPaginacionDocumentoAnulado = jComboBoxTiposPaginacionDocumentoAnulado;
	}
	
	public void setBorderResaltarTiposPaginacionDocumentoAnulado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDocumentoAnulado.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDocumentoAnulado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDocumentoAnulado() {
		return this.jComboBoxTiposRelacionesDocumentoAnulado;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDocumentoAnulado() {
		return this.jComboBoxTiposAccionesDocumentoAnulado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDocumentoAnulado(
			JComboBox jComboBoxTiposRelacionesDocumentoAnulado) {
		this.jComboBoxTiposRelacionesDocumentoAnulado = jComboBoxTiposRelacionesDocumentoAnulado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDocumentoAnulado(
			JComboBox jComboBoxTiposAccionesDocumentoAnulado) {
		this.jComboBoxTiposAccionesDocumentoAnulado = jComboBoxTiposAccionesDocumentoAnulado;
	}
	
	public void setBorderResaltarTiposRelacionesDocumentoAnulado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDocumentoAnulado.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDocumentoAnulado .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDocumentoAnulado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDocumentoAnulado.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDocumentoAnulado .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDocumentoAnulado() {
	//	return jCheckBoxConGraficoDinamicoDocumentoAnulado;
	//}

	//public void setjCheckBoxConGraficoDinamicoDocumentoAnulado(
	//		JCheckBox jCheckBoxConGraficoDinamicoDocumentoAnulado) {
	//	this.jCheckBoxConGraficoDinamicoDocumentoAnulado = jCheckBoxConGraficoDinamicoDocumentoAnulado;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDocumentoAnulado() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDocumentoAnulado.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDocumentoAnulado .setBorder(borderResaltar);		
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
		this.documentoanuladoSessionBean=new DocumentoAnuladoSessionBean();
		
		this.documentoanuladoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.documentoanuladoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.documentoanuladoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DocumentoAnuladoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DocumentoAnuladoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DocumentoAnuladoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DocumentoAnuladoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DocumentoAnuladoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Documento Anulado MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {
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
		
		DocumentoAnuladoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DocumentoAnulado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDocumentoAnulado= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDocumentoAnulado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDocumentoAnulado,this.jTtoolBarDocumentoAnulado,
							"nuevo","nuevo","Nuevo"+" "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDocumentoAnulado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDocumentoAnulado,this.jTtoolBarDocumentoAnulado,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDocumentoAnulado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDocumentoAnulado,this.jTtoolBarDocumentoAnulado,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDocumentoAnulado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDocumentoAnulado,this.jTtoolBarDocumentoAnulado,
							"duplicar","duplicar","Duplicar"+" "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDocumentoAnulado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDocumentoAnulado,this.jTtoolBarDocumentoAnulado,
							"copiar","copiar","Copiar"+" "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDocumentoAnulado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDocumentoAnulado,this.jTtoolBarDocumentoAnulado,
							"ver_form","ver_form","Ver"+" "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDocumentoAnulado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDocumentoAnulado,this.jTtoolBarDocumentoAnulado,
							"recargar","recargar","Recargar"+" "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDocumentoAnulado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDocumentoAnulado,this.jTtoolBarDocumentoAnulado,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDocumentoAnulado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDocumentoAnulado,this.jTtoolBarDocumentoAnulado,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDocumentoAnulado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDocumentoAnulado,this.jTtoolBarDocumentoAnulado,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDocumentoAnulado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDocumentoAnulado,this.jTtoolBarDocumentoAnulado,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDocumentoAnulado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDocumentoAnulado,this.jTtoolBarDocumentoAnulado,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDocumentoAnulado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDocumentoAnulado,this.jTtoolBarDocumentoAnulado,
							"cerrar","cerrar","Salir"+" "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDocumentoAnulado=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDocumentoAnulado;
			
				this.jButtonProcesarInformacionToolBarDocumentoAnulado=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDocumentoAnulado;
				
		//protected JButton jButtonModificarToolBarDocumentoAnulado;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDocumentoAnulado=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDocumentoAnulado=new JMenuMe("General");
		this.jmenuArchivoDocumentoAnulado=new JMenuMe("Archivo");
		this.jmenuAccionesDocumentoAnulado=new JMenuMe("Acciones");
		this.jmenuDatosDocumentoAnulado=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDocumentoAnulado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDocumentoAnulado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDocumentoAnulado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDocumentoAnulado= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDocumentoAnulado.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDocumentoAnulado,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDocumentoAnulado= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDocumentoAnulado.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDocumentoAnulado,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDocumentoAnulado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDocumentoAnulado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDocumentoAnulado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDocumentoAnulado= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDocumentoAnulado.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDocumentoAnulado,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDocumentoAnulado= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDocumentoAnulado.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDocumentoAnulado,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDocumentoAnulado= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDocumentoAnulado.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDocumentoAnulado,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDocumentoAnulado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDocumentoAnulado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDocumentoAnulado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDocumentoAnulado= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDocumentoAnulado.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDocumentoAnulado,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDocumentoAnulado= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDocumentoAnulado.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDocumentoAnulado,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDocumentoAnulado= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDocumentoAnulado.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDocumentoAnulado,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDocumentoAnulado= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDocumentoAnulado.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDocumentoAnulado,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDocumentoAnulado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDocumentoAnulado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDocumentoAnulado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDocumentoAnulado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDocumentoAnulado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDocumentoAnulado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDocumentoAnulado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDocumentoAnulado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDocumentoAnulado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDocumentoAnulado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDocumentoAnulado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDocumentoAnulado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDocumentoAnulado= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDocumentoAnulado.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDocumentoAnulado,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDocumentoAnulado.add(this.jMenuItemCerrarDocumentoAnulado);
			
			this.jmenuAccionesDocumentoAnulado.add(this.jMenuItemNuevoDocumentoAnulado);
			this.jmenuAccionesDocumentoAnulado.add(this.jMenuItemNuevoGuardarCambiosDocumentoAnulado);
			this.jmenuAccionesDocumentoAnulado.add(this.jMenuItemNuevoRelacionesDocumentoAnulado);
			this.jmenuAccionesDocumentoAnulado.add(this.jMenuItemGuardarCambiosTablaDocumentoAnulado);		
			this.jmenuAccionesDocumentoAnulado.add(this.jMenuItemDuplicarDocumentoAnulado);		
			this.jmenuAccionesDocumentoAnulado.add(this.jMenuItemCopiarDocumentoAnulado);		
			this.jmenuAccionesDocumentoAnulado.add(this.jMenuItemVerFormDocumentoAnulado);		
			
			this.jmenuDatosDocumentoAnulado.add(this.jMenuItemRecargarInformacionDocumentoAnulado);				
			this.jmenuDatosDocumentoAnulado.add(this.jMenuItemAnterioresDocumentoAnulado);				
			this.jmenuDatosDocumentoAnulado.add(this.jMenuItemSiguientesDocumentoAnulado);				
			this.jmenuDatosDocumentoAnulado.add(this.jMenuItemAbrirOrderByDocumentoAnulado);				
			this.jmenuDatosDocumentoAnulado.add(this.jMenuItemMostrarOcultarDocumentoAnulado);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDocumentoAnulado.add(this.jMenuItemGuardarCambiosDocumentoAnulado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDocumentoAnulado.add(this.jmenuArchivoDocumentoAnulado);		
			this.jmenuBarDocumentoAnulado.add(this.jmenuAccionesDocumentoAnulado);		
			this.jmenuBarDocumentoAnulado.add(this.jmenuDatosDocumentoAnulado);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDocumentoAnulado);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDocumentoAnulado() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdPeriodoDeclaraDocumentoAnulado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPeriodoDeclaraDocumentoAnulado.setToolTipText("Buscar Por Periodo Declara ");
		this.jButtonFK_IdPeriodoDeclaraDocumentoAnulado= new JButtonMe();
		this.jButtonFK_IdPeriodoDeclaraDocumentoAnulado.setText("Buscar");
		this.jButtonFK_IdPeriodoDeclaraDocumentoAnulado.setToolTipText("Buscar Por Periodo Declara ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPeriodoDeclaraDocumentoAnulado,"buscar_button","Buscar Por Periodo Declara ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPeriodoDeclaraDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_periodo_declaraFK_IdPeriodoDeclaraDocumentoAnulado = new JLabelMe();
		jLabelid_periodo_declaraFK_IdPeriodoDeclaraDocumentoAnulado.setText("Periodo Declara :");
		jLabelid_periodo_declaraFK_IdPeriodoDeclaraDocumentoAnulado.setToolTipText("Periodo Declara");
		jLabelid_periodo_declaraFK_IdPeriodoDeclaraDocumentoAnulado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_periodo_declaraFK_IdPeriodoDeclaraDocumentoAnulado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_periodo_declaraFK_IdPeriodoDeclaraDocumentoAnulado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_periodo_declaraFK_IdPeriodoDeclaraDocumentoAnulado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraDocumentoAnulado= new JComboBoxMe();
		jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraDocumentoAnulado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraDocumentoAnulado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraDocumentoAnulado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraDocumentoAnulado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoComprobanteDocumentoAnulado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoComprobanteDocumentoAnulado.setToolTipText("Buscar Por Tipo Comprobante ");
		this.jButtonFK_IdTipoComprobanteDocumentoAnulado= new JButtonMe();
		this.jButtonFK_IdTipoComprobanteDocumentoAnulado.setText("Buscar");
		this.jButtonFK_IdTipoComprobanteDocumentoAnulado.setToolTipText("Buscar Por Tipo Comprobante ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoComprobanteDocumentoAnulado,"buscar_button","Buscar Por Tipo Comprobante ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoComprobanteDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_comprobanteFK_IdTipoComprobanteDocumentoAnulado = new JLabelMe();
		jLabelid_tipo_comprobanteFK_IdTipoComprobanteDocumentoAnulado.setText("Tipo Comprobante :");
		jLabelid_tipo_comprobanteFK_IdTipoComprobanteDocumentoAnulado.setToolTipText("Tipo Comprobante");
		jLabelid_tipo_comprobanteFK_IdTipoComprobanteDocumentoAnulado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_comprobanteFK_IdTipoComprobanteDocumentoAnulado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_comprobanteFK_IdTipoComprobanteDocumentoAnulado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_comprobanteFK_IdTipoComprobanteDocumentoAnulado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteDocumentoAnulado= new JComboBoxMe();
		jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteDocumentoAnulado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteDocumentoAnulado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteDocumentoAnulado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteDocumentoAnulado,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDocumentoAnulado=new JTabbedPane();


		this.jTabbedPaneBusquedasDocumentoAnulado.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDocumentoAnulado.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDocumentoAnulado.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDocumentoAnulado.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDocumentoAnulado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDocumentoAnulado,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDocumentoAnulado = new DocumentoAnuladoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Documento Anulado DATOS");
			this.jInternalFrameDetalleFormDocumentoAnulado = new DocumentoAnuladoDetalleFormJInternalFrame(jDesktopPane,this.documentoanuladoSessionBean.getConGuardarRelaciones(),this.documentoanuladoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDocumentoAnulado = null;//new DocumentoAnuladoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDocumentoAnulado= new GridBagLayout();
		
		
		this.jTableDatosDocumentoAnulado = new JTableMe();      
		
		String sToolTipDocumentoAnulado="";
		sToolTipDocumentoAnulado=DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDocumentoAnulado+="(Sris.DocumentoAnulado)";
		}
		
		if(!this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {
			sToolTipDocumentoAnulado+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDocumentoAnulado.setToolTipText(sToolTipDocumentoAnulado);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDocumentoAnulado);
		this.jTableDatosDocumentoAnulado.setAutoCreateRowSorter(true);
		this.jTableDatosDocumentoAnulado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDocumentoAnulado.setRowSelectionAllowed(true);
		this.jTableDatosDocumentoAnulado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDocumentoAnulado,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDocumentoAnulado = new JButtonMe();
		this.jButtonDuplicarDocumentoAnulado = new JButtonMe();
		this.jButtonCopiarDocumentoAnulado = new JButtonMe();
		this.jButtonVerFormDocumentoAnulado = new JButtonMe();
		this.jButtonNuevoRelacionesDocumentoAnulado = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDocumentoAnulado = new JButtonMe();
		this.jButtonCerrarDocumentoAnulado = new JButtonMe();
		
		this.jScrollPanelDatosDocumentoAnulado = new JScrollPane();   
        this.jScrollPanelDatosGeneralDocumentoAnulado = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDocumentoAnulado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Documento Anulado";
		
		if(!this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDocumentoAnulado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Documento Anulados" + this.sPath));
		} else {
			this.jScrollPanelDatosDocumentoAnulado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDocumentoAnulado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDocumentoAnulado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDocumentoAnulado.setToolTipText("Acciones");
        this.jPanelAccionesDocumentoAnulado.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDocumentoAnulado=new ReporteDinamicoJInternalFrame(DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDocumentoAnulado();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDocumentoAnulado=new ImportacionJInternalFrame(DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDocumentoAnulado();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDocumentoAnulado = new JButtonMe();
		
		this.jButtonAbrirOrderByDocumentoAnulado.setText("Orden");
		this.jButtonAbrirOrderByDocumentoAnulado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDocumentoAnulado,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDocumentoAnulado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDocumentoAnulado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDocumentoAnulado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDocumentoAnulado,false,this);
			
			//this.cargarOrderByDocumentoAnulado(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDocumentoAnulado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDocumentoAnulado,true,this);
			
			//this.cargarOrderByDocumentoAnulado(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDocumentoAnulado.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosDocumentoAnulado.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosDocumentoAnulado.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosDocumentoAnulado.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDocumentoAnulado.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDocumentoAnulado.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDocumentoAnulado.setText("Nuevo");
		this.jButtonDuplicarDocumentoAnulado.setText("Duplicar");
		this.jButtonCopiarDocumentoAnulado.setText("Copiar");
		this.jButtonVerFormDocumentoAnulado.setText("Ver");
		this.jButtonNuevoRelacionesDocumentoAnulado.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDocumentoAnulado.setText("Guardar");
		this.jButtonCerrarDocumentoAnulado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDocumentoAnulado,"nuevo_button","Nuevo",this.documentoanuladoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDocumentoAnulado,"duplicar_button","Duplicar",this.documentoanuladoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDocumentoAnulado,"copiar_button","Copiar",this.documentoanuladoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDocumentoAnulado,"ver_form","Ver",this.documentoanuladoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDocumentoAnulado,"nuevorelaciones_button","Nuevo Rel",this.documentoanuladoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDocumentoAnulado,"guardarcambiostabla_button","Guardar",this.documentoanuladoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDocumentoAnulado,"cerrar_button","Salir",this.documentoanuladoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDocumentoAnulado.setToolTipText("Nuevo"+" "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDocumentoAnulado.setToolTipText("Duplicar"+" "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDocumentoAnulado.setToolTipText("Copiar"+" "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDocumentoAnulado.setToolTipText("Ver"+" "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDocumentoAnulado.setToolTipText("Nuevo Rel"+" "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDocumentoAnulado.setToolTipText("Guardar"+" "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDocumentoAnulado.setToolTipText("Salir"+" "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDocumentoAnulado";
		inputMap = this.jButtonNuevoDocumentoAnulado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDocumentoAnulado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDocumentoAnulado"));
		
		//DUPLICAR
		sMapKey = "DuplicarDocumentoAnulado";
		inputMap = this.jButtonDuplicarDocumentoAnulado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDocumentoAnulado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDocumentoAnulado"));
		
		//COPIAR
		sMapKey = "CopiarDocumentoAnulado";
		inputMap = this.jButtonCopiarDocumentoAnulado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDocumentoAnulado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDocumentoAnulado"));
		
		//VEr FORM
		sMapKey = "VerFormDocumentoAnulado";
		inputMap = this.jButtonVerFormDocumentoAnulado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDocumentoAnulado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDocumentoAnulado"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDocumentoAnulado";
		inputMap = this.jButtonNuevoRelacionesDocumentoAnulado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDocumentoAnulado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDocumentoAnulado"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDocumentoAnulado";
		inputMap = this.jButtonModificarDocumentoAnulado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDocumentoAnulado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDocumentoAnulado"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDocumentoAnulado";
		inputMap = this.jButtonCerrarDocumentoAnulado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDocumentoAnulado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDocumentoAnulado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDocumentoAnulado";
		inputMap = this.jButtonGuardarCambiosTablaDocumentoAnulado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDocumentoAnulado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDocumentoAnulado"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDocumentoAnulado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDocumentoAnulado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDocumentoAnulado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DocumentoAnulado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DocumentoAnulado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DocumentoAnulado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DocumentoAnulado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DocumentoAnulado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDocumentoAnulado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDocumentoAnulado.setName("jPanelParametrosReportesDocumentoAnulado"); 
		
		this.jPanelParametrosReportesAccionesDocumentoAnulado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDocumentoAnulado.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDocumentoAnulado.setName("jPanelParametrosReportesAccionesDocumentoAnulado"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDocumentoAnulado = new JButtonMe();
		this.jButtonRecargarInformacionDocumentoAnulado.setText("Recargar");
		this.jButtonRecargarInformacionDocumentoAnulado.setToolTipText("Recargar"+" "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDocumentoAnulado,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDocumentoAnulado = new JButtonMe();
		this.jButtonProcesarInformacionDocumentoAnulado.setText("Procesar");
		this.jButtonProcesarInformacionDocumentoAnulado.setToolTipText("Procesar"+" "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDocumentoAnulado.setVisible(false);
			
		this.jButtonProcesarInformacionDocumentoAnulado.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDocumentoAnulado.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDocumentoAnulado.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDocumentoAnulado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDocumentoAnulado.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDocumentoAnulado.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDocumentoAnulado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDocumentoAnulado.setText("TIPO");       
		this.jComboBoxTiposReportesDocumentoAnulado.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDocumentoAnulado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDocumentoAnulado.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDocumentoAnulado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDocumentoAnulado = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDocumentoAnulado.setText("Paginacion");
		this.jComboBoxTiposPaginacionDocumentoAnulado.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDocumentoAnulado = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDocumentoAnulado.setText("Accion");
		this.jComboBoxTiposRelacionesDocumentoAnulado.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDocumentoAnulado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDocumentoAnulado.setText("Accion");
		this.jComboBoxTiposAccionesDocumentoAnulado.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDocumentoAnulado = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDocumentoAnulado.setText("Accion");
		this.jComboBoxTiposSeleccionarDocumentoAnulado.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDocumentoAnulado=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDocumentoAnulado.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDocumentoAnulado.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDocumentoAnulado.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDocumentoAnulado = new JLabelMe();
		
		this.jLabelAccionesDocumentoAnulado.setText("Acciones");		
		this.jLabelAccionesDocumentoAnulado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDocumentoAnulado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDocumentoAnulado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDocumentoAnulado = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDocumentoAnulado.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDocumentoAnulado.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDocumentoAnulado = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDocumentoAnulado.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDocumentoAnulado.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDocumentoAnulado = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDocumentoAnulado.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDocumentoAnulado.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDocumentoAnulado = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDocumentoAnulado.setText("Graf.");
		this.jCheckBoxConGraficoReporteDocumentoAnulado.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDocumentoAnulado = new JButtonMe();
		//this.jButtonAnterioresDocumentoAnulado.setText("<<");
        this.jButtonAnterioresDocumentoAnulado.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDocumentoAnulado,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDocumentoAnulado = new JButtonMe();
		//this.jButtonSiguientesDocumentoAnulado.setText(">>");
        this.jButtonSiguientesDocumentoAnulado.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDocumentoAnulado,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDocumentoAnulado = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDocumentoAnulado.setText("Nue");
        this.jButtonNuevoGuardarCambiosDocumentoAnulado.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDocumentoAnulado,"nuevoguardarcambios_button","Nue",this.documentoanuladoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDocumentoAnulado";
		inputMap = this.jButtonNuevoGuardarCambiosDocumentoAnulado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDocumentoAnulado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDocumentoAnulado"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDocumentoAnulado";
		inputMap = this.jButtonRecargarInformacionDocumentoAnulado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDocumentoAnulado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDocumentoAnulado"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDocumentoAnulado";
		inputMap = this.jButtonSiguientesDocumentoAnulado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDocumentoAnulado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDocumentoAnulado"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDocumentoAnulado";
		inputMap = this.jButtonAnterioresDocumentoAnulado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDocumentoAnulado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDocumentoAnulado"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDocumentoAnulado();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDocumentoAnulado.setMinimumSize(new Dimension(this.getWidth(),DocumentoAnuladoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DocumentoAnuladoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDocumentoAnulado.setMaximumSize(new Dimension(this.getWidth(),DocumentoAnuladoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DocumentoAnuladoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDocumentoAnulado.setPreferredSize(new Dimension(this.getWidth(),DocumentoAnuladoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DocumentoAnuladoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDocumentoAnulado = new GridBagLayout();

			this.jPanelPaginacionDocumentoAnulado.setLayout(gridaBagLayoutPaginacionDocumentoAnulado);						
			
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			this.gridBagConstraintsDocumentoAnulado.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDocumentoAnulado.gridy = 0;
			this.gridBagConstraintsDocumentoAnulado.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDocumentoAnulado.add(this.jButtonAnterioresDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
					
						
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			this.gridBagConstraintsDocumentoAnulado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDocumentoAnulado.gridy = 0;
			
			this.jPanelPaginacionDocumentoAnulado.add(this.jButtonNuevoGuardarCambiosDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
						
			
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			this.gridBagConstraintsDocumentoAnulado.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDocumentoAnulado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDocumentoAnulado.gridy = 0;
			this.jPanelPaginacionDocumentoAnulado.add(this.jButtonSiguientesDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDocumentoAnulado.gridy = 1;
			this.gridBagConstraintsDocumentoAnulado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDocumentoAnulado.add(this.jButtonNuevoDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
						
			
			
			if(!this.documentoanuladoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
				this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDocumentoAnulado.gridy = 1;
				this.gridBagConstraintsDocumentoAnulado.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDocumentoAnulado.add(this.jButtonGuardarCambiosTablaDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
			}
			
			
			
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDocumentoAnulado.gridy = 1;
			this.gridBagConstraintsDocumentoAnulado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDocumentoAnulado.add(this.jButtonDuplicarDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
			
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDocumentoAnulado.gridy = 1;
			this.gridBagConstraintsDocumentoAnulado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDocumentoAnulado.add(this.jButtonCopiarDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
		
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDocumentoAnulado.gridy = 1;
			this.gridBagConstraintsDocumentoAnulado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDocumentoAnulado.add(this.jButtonVerFormDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
		
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDocumentoAnulado.gridy = 1;
			this.gridBagConstraintsDocumentoAnulado.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDocumentoAnulado.add(this.jButtonCerrarDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
		
		
		
		this.jButtonRecargarInformacionDocumentoAnulado.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDocumentoAnulado.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDocumentoAnulado.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDocumentoAnulado.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDocumentoAnulado.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDocumentoAnulado.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDocumentoAnulado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDocumentoAnulado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDocumentoAnulado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDocumentoAnulado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDocumentoAnulado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDocumentoAnulado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDocumentoAnulado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDocumentoAnulado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDocumentoAnulado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDocumentoAnulado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDocumentoAnulado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDocumentoAnulado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDocumentoAnulado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDocumentoAnulado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDocumentoAnulado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDocumentoAnulado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDocumentoAnulado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDocumentoAnulado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDocumentoAnulado.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDocumentoAnulado.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDocumentoAnulado.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDocumentoAnulado.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDocumentoAnulado.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDocumentoAnulado.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDocumentoAnulado.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDocumentoAnulado.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDocumentoAnulado.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDocumentoAnulado.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDocumentoAnulado.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDocumentoAnulado.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDocumentoAnulado = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDocumentoAnulado = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DocumentoAnulado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DocumentoAnulado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DocumentoAnulado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DocumentoAnulado = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDocumentoAnulado.setLayout(gridaBagParametrosReportesDocumentoAnulado);
			this.jPanelParametrosReportesAccionesDocumentoAnulado.setLayout(gridaBagParametrosReportesAccionesDocumentoAnulado);
			
			
			this.jPanelParametrosAuxiliar1DocumentoAnulado.setLayout(gridaBagParametrosAuxiliar1DocumentoAnulado);
			this.jPanelParametrosAuxiliar2DocumentoAnulado.setLayout(gridaBagParametrosAuxiliar2DocumentoAnulado);
			this.jPanelParametrosAuxiliar3DocumentoAnulado.setLayout(gridaBagParametrosAuxiliar3DocumentoAnulado);
			this.jPanelParametrosAuxiliar4DocumentoAnulado.setLayout(gridaBagParametrosAuxiliar4DocumentoAnulado);
			//this.jPanelParametrosAuxiliar5DocumentoAnulado.setLayout(gridaBagParametrosAuxiliar2DocumentoAnulado);			
			
			
			
			
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDocumentoAnulado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDocumentoAnulado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDocumentoAnulado.add(this.jButtonRecargarInformacionDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			this.gridBagConstraintsDocumentoAnulado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDocumentoAnulado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDocumentoAnulado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DocumentoAnulado.add(this.jComboBoxTiposPaginacionDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			this.gridBagConstraintsDocumentoAnulado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDocumentoAnulado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDocumentoAnulado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DocumentoAnulado.add(this.jCheckBoxConAltoMaximoTablaDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			this.gridBagConstraintsDocumentoAnulado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDocumentoAnulado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDocumentoAnulado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DocumentoAnulado.add(this.jComboBoxTiposArchivosReportesDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			this.gridBagConstraintsDocumentoAnulado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDocumentoAnulado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDocumentoAnulado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDocumentoAnulado.add(this.jPanelParametrosAuxiliar1DocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			this.gridBagConstraintsDocumentoAnulado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDocumentoAnulado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDocumentoAnulado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DocumentoAnulado.add(this.jComboBoxTiposReportesDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			this.gridBagConstraintsDocumentoAnulado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDocumentoAnulado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDocumentoAnulado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDocumentoAnulado.add(this.jPanelParametrosAuxiliar4DocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			this.gridBagConstraintsDocumentoAnulado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDocumentoAnulado.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDocumentoAnulado.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDocumentoAnulado.add(this.jComboBoxTiposReportesDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			this.gridBagConstraintsDocumentoAnulado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDocumentoAnulado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDocumentoAnulado.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDocumentoAnulado.add(this.jCheckBoxGenerarReporteDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			this.gridBagConstraintsDocumentoAnulado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDocumentoAnulado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDocumentoAnulado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDocumentoAnulado.add(this.jPanelParametrosAuxiliar2DocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDocumentoAnulado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDocumentoAnulado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDocumentoAnulado.add(this.jLabelAccionesDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
				this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDocumentoAnulado.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDocumentoAnulado.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDocumentoAnulado.add(this.jButtonAbrirOrderByDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDocumentoAnulado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDocumentoAnulado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDocumentoAnulado.add(this.jComboBoxTiposSeleccionarDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);			
			
			
			/*
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDocumentoAnulado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDocumentoAnulado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDocumentoAnulado.add(this.jCheckBoxSeleccionarTodosDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			this.gridBagConstraintsDocumentoAnulado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDocumentoAnulado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDocumentoAnulado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DocumentoAnulado.add(this.jCheckBoxSeleccionarTodosDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);															
				
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			this.gridBagConstraintsDocumentoAnulado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDocumentoAnulado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDocumentoAnulado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DocumentoAnulado.add(this.jCheckBoxSeleccionadosDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			this.gridBagConstraintsDocumentoAnulado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDocumentoAnulado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDocumentoAnulado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDocumentoAnulado.add(this.jPanelParametrosAuxiliar3DocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			this.gridBagConstraintsDocumentoAnulado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDocumentoAnulado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDocumentoAnulado.add(this.jComboBoxTiposAccionesDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
	
				
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			this.gridBagConstraintsDocumentoAnulado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDocumentoAnulado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDocumentoAnulado.add(this.jTextFieldValorCampoGeneralDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDocumentoAnulado = new GridBagLayout();

			this.jScrollPanelDatosDocumentoAnulado.setLayout(gridaBagLayoutDatosDocumentoAnulado);
			
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDocumentoAnulado.gridy = 0;
			this.gridBagConstraintsDocumentoAnulado.gridx = 0;
			
			this.jScrollPanelDatosDocumentoAnulado.add(this.jTableDatosDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDocumentoAnulado.setViewportView(this.jTableDatosDocumentoAnulado);
		this.jTableDatosDocumentoAnulado.setFillsViewportHeight(true);
		this.jTableDatosDocumentoAnulado.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDocumentoAnulado= new GridBagLayout();
		this.jPanelAccionesDocumentoAnulado.setLayout(gridaBagLayoutAccionesDocumentoAnulado);
		
		
		/*	
		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDocumentoAnulado.gridy = 0;
		this.gridBagConstraintsDocumentoAnulado.gridx = 0;
			
		this.jPanelAccionesDocumentoAnulado.add(this.jButtonNuevoDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdPeriodoDeclaraDocumentoAnulado= new GridBagLayout();
		gridaBagLayoutFK_IdPeriodoDeclaraDocumentoAnulado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPeriodoDeclaraDocumentoAnulado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPeriodoDeclaraDocumentoAnulado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPeriodoDeclaraDocumentoAnulado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPeriodoDeclaraDocumentoAnulado.setLayout(gridaBagLayoutFK_IdPeriodoDeclaraDocumentoAnulado);

		gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		gridBagConstraintsDocumentoAnulado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDocumentoAnulado.gridy = 0;
		gridBagConstraintsDocumentoAnulado.gridx = 0;
		jPanelFK_IdPeriodoDeclaraDocumentoAnulado.add(jLabelid_periodo_declaraFK_IdPeriodoDeclaraDocumentoAnulado, gridBagConstraintsDocumentoAnulado);

		gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		gridBagConstraintsDocumentoAnulado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDocumentoAnulado.gridy = 0;
		gridBagConstraintsDocumentoAnulado.gridx = 1;
		jPanelFK_IdPeriodoDeclaraDocumentoAnulado.add(jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraDocumentoAnulado, gridBagConstraintsDocumentoAnulado);

		gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		gridBagConstraintsDocumentoAnulado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDocumentoAnulado.gridy = 1;
		gridBagConstraintsDocumentoAnulado.gridx =1;
		jPanelFK_IdPeriodoDeclaraDocumentoAnulado.add(jButtonFK_IdPeriodoDeclaraDocumentoAnulado, gridBagConstraintsDocumentoAnulado);

		jTabbedPaneBusquedasDocumentoAnulado.addTab("1.-Por Periodo Declara ", jPanelFK_IdPeriodoDeclaraDocumentoAnulado);
		jTabbedPaneBusquedasDocumentoAnulado.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdTipoComprobanteDocumentoAnulado= new GridBagLayout();
		gridaBagLayoutFK_IdTipoComprobanteDocumentoAnulado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoComprobanteDocumentoAnulado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoComprobanteDocumentoAnulado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoComprobanteDocumentoAnulado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoComprobanteDocumentoAnulado.setLayout(gridaBagLayoutFK_IdTipoComprobanteDocumentoAnulado);

		gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		gridBagConstraintsDocumentoAnulado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDocumentoAnulado.gridy = 0;
		gridBagConstraintsDocumentoAnulado.gridx = 0;
		jPanelFK_IdTipoComprobanteDocumentoAnulado.add(jLabelid_tipo_comprobanteFK_IdTipoComprobanteDocumentoAnulado, gridBagConstraintsDocumentoAnulado);

		gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		gridBagConstraintsDocumentoAnulado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDocumentoAnulado.gridy = 0;
		gridBagConstraintsDocumentoAnulado.gridx = 1;
		jPanelFK_IdTipoComprobanteDocumentoAnulado.add(jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteDocumentoAnulado, gridBagConstraintsDocumentoAnulado);

		gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		gridBagConstraintsDocumentoAnulado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDocumentoAnulado.gridy = 1;
		gridBagConstraintsDocumentoAnulado.gridx =1;
		jPanelFK_IdTipoComprobanteDocumentoAnulado.add(jButtonFK_IdTipoComprobanteDocumentoAnulado, gridBagConstraintsDocumentoAnulado);

		jTabbedPaneBusquedasDocumentoAnulado.addTab("2.-Por Tipo Comprobante ", jPanelFK_IdTipoComprobanteDocumentoAnulado);
		jTabbedPaneBusquedasDocumentoAnulado.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDocumentoAnulado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDocumentoAnulado);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();						
			this.gridBagConstraintsDocumentoAnulado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDocumentoAnulado.gridx = 0;		
			//this.gridBagConstraintsDocumentoAnulado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDocumentoAnulado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDocumentoAnulado.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		this.gridBagConstraintsDocumentoAnulado.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDocumentoAnulado.gridx = 0;		
		//this.gridBagConstraintsDocumentoAnulado.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDocumentoAnulado.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDocumentoAnulado.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDocumentoAnulado);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDocumentoAnulado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDocumentoAnulado.gridx = 0;		
			this.gridBagConstraintsDocumentoAnulado.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDocumentoAnulado.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDocumentoAnulado.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		this.gridBagConstraintsDocumentoAnulado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDocumentoAnulado.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);								
		
		
		/*
		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		this.gridBagConstraintsDocumentoAnulado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDocumentoAnulado.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
		*/		
		
		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		this.gridBagConstraintsDocumentoAnulado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDocumentoAnulado.gridx =0;
		this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDocumentoAnulado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
				
		
		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		this.gridBagConstraintsDocumentoAnulado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDocumentoAnulado.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DocumentoAnuladoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDocumentoAnulado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDocumentoAnulado = new GridBagLayout();
			this.jPanelBusquedasParametrosDocumentoAnulado.setLayout(gridaBagLayoutBusquedasParametrosDocumentoAnulado);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDocumentoAnulado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDocumentoAnulado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDocumentoAnulado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDocumentoAnulado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		this.gridBagConstraintsDocumentoAnulado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDocumentoAnulado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
			
			
		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		this.gridBagConstraintsDocumentoAnulado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDocumentoAnulado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
		
			
		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		this.gridBagConstraintsDocumentoAnulado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDocumentoAnulado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDocumentoAnulado;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDocumentoAnulado() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDocumentoAnulado = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDocumentoAnulado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDocumentoAnulado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDocumentoAnulado.setName("jPanelReporteDinamicoDocumentoAnulado"); 
		
		this.jPanelReporteDinamicoDocumentoAnulado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDocumentoAnulado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDocumentoAnulado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDocumentoAnulado.setLayout(gridaBagLayoutReporteDinamicoDocumentoAnulado);
		
		
		this.jInternalFrameReporteDinamicoDocumentoAnulado= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDocumentoAnulado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDocumentoAnulado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDocumentoAnulado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDocumentoAnulado.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDocumentoAnulado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDocumentoAnulado.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDocumentoAnulado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDocumentoAnulado.setResizable(true);
	    this.jInternalFrameReporteDinamicoDocumentoAnulado.setClosable(true);
	    this.jInternalFrameReporteDinamicoDocumentoAnulado.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDocumentoAnulado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDocumentoAnulado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDocumentoAnulado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDocumentoAnulado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Documento Anulados"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDocumentoAnulado = new JLabelMe();

		this.jLabelColumnasSelectReporteDocumentoAnulado.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDocumentoAnulado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDocumentoAnulado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDocumentoAnulado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDocumentoAnulado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDocumentoAnulado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDocumentoAnulado.add(this.jLabelColumnasSelectReporteDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDocumentoAnulado = new JList<Reporte>();
		this.jListColumnasSelectReporteDocumentoAnulado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDocumentoAnulado.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDocumentoAnulado.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDocumentoAnulado.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDocumentoAnulado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDocumentoAnulado=new JScrollPane(this.jListColumnasSelectReporteDocumentoAnulado);
			
			this.jScrollColumnasSelectReporteDocumentoAnulado.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDocumentoAnulado.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDocumentoAnulado.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDocumentoAnulado.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDocumentoAnulado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDocumentoAnulado.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDocumentoAnulado.add(this.jListColumnasSelectReporteDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
		this.jPanelReporteDinamicoDocumentoAnulado.add(this.jScrollColumnasSelectReporteDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDocumentoAnulado = new JLabelMe();

		this.jLabelRelacionesSelectReporteDocumentoAnulado.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDocumentoAnulado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDocumentoAnulado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDocumentoAnulado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDocumentoAnulado = new JList<Reporte>();
		this.jListRelacionesSelectReporteDocumentoAnulado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDocumentoAnulado.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDocumentoAnulado.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDocumentoAnulado.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDocumentoAnulado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDocumentoAnulado=new JScrollPane(this.jListRelacionesSelectReporteDocumentoAnulado);
			
			this.jScrollRelacionesSelectReporteDocumentoAnulado.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDocumentoAnulado.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDocumentoAnulado.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDocumentoAnulado.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDocumentoAnulado = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDocumentoAnulado = new JComboBoxMe();
		this.jListColumnasValoresGraficoDocumentoAnulado = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDocumentoAnulado = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDocumentoAnulado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDocumentoAnulado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDocumentoAnulado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDocumentoAnulado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDocumentoAnulado = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDocumentoAnulado.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDocumentoAnulado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDocumentoAnulado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDocumentoAnulado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDocumentoAnulado = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDocumentoAnulado.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDocumentoAnulado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDocumentoAnulado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDocumentoAnulado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDocumentoAnulado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDocumentoAnulado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDocumentoAnulado.add(this.jLabelGenerarExcelReporteDinamicoDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDocumentoAnulado = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDocumentoAnulado.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDocumentoAnulado,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDocumentoAnulado.setToolTipText("Generar EXCEL"+" "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		//this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDocumentoAnulado.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDocumentoAnulado.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDocumentoAnulado.add(this.jButtonGenerarExcelReporteDinamicoDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDocumentoAnulado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDocumentoAnulado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDocumentoAnulado.add(this.jComboBoxTiposReportesDinamicoDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDocumentoAnulado = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDocumentoAnulado.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDocumentoAnulado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDocumentoAnulado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDocumentoAnulado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDocumentoAnulado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDocumentoAnulado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDocumentoAnulado.add(this.jLabelTiposArchivoReporteDinamicoDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDocumentoAnulado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDocumentoAnulado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDocumentoAnulado.add(this.jComboBoxTiposArchivosReportesDinamicoDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDocumentoAnulado = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDocumentoAnulado.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDocumentoAnulado,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDocumentoAnulado.setToolTipText("Generar"+" "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDocumentoAnulado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDocumentoAnulado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDocumentoAnulado.add(this.jButtonGenerarReporteDinamicoDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDocumentoAnulado = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDocumentoAnulado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDocumentoAnulado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDocumentoAnulado.setToolTipText("Cancelar"+" "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDocumentoAnulado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDocumentoAnulado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDocumentoAnulado.add(this.jButtonCerrarReporteDinamicoDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDocumentoAnulado = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDocumentoAnulado= new JScrollPane(jPanelReporteDinamicoDocumentoAnulado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDocumentoAnulado.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDocumentoAnulado.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDocumentoAnulado.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDocumentoAnulado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Documento Anulados"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		this.gridBagConstraintsDocumentoAnulado.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDocumentoAnulado.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDocumentoAnulado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDocumentoAnulado.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDocumentoAnulado);
		this.jInternalFrameReporteDinamicoDocumentoAnulado.getContentPane().add(this.jScrollPanelReporteDinamicoDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDocumentoAnulado() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDocumentoAnulado = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDocumentoAnulado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDocumentoAnulado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDocumentoAnulado.setName("jPanelImportacionDocumentoAnulado"); 
		
		this.jPanelImportacionDocumentoAnulado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDocumentoAnulado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDocumentoAnulado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDocumentoAnulado.setLayout(gridaBagLayoutImportacionDocumentoAnulado);
		
		
		this.jInternalFrameImportacionDocumentoAnulado= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDocumentoAnulado= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDocumentoAnulado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDocumentoAnulado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDocumentoAnulado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDocumentoAnulado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDocumentoAnulado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDocumentoAnulado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDocumentoAnulado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDocumentoAnulado.setResizable(true);
	    this.jInternalFrameImportacionDocumentoAnulado.setClosable(true);
	    this.jInternalFrameImportacionDocumentoAnulado.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDocumentoAnulado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDocumentoAnulado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDocumentoAnulado.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDocumentoAnulado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDocumentoAnulado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDocumentoAnulado.setResizable(true);
	    this.jInternalFrameImportacionDocumentoAnulado.setClosable(true);
	    this.jInternalFrameImportacionDocumentoAnulado.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDocumentoAnulado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDocumentoAnulado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDocumentoAnulado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDocumentoAnulado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Documento Anulados"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDocumentoAnulado = new JLabelMe();

		this.jLabelArchivoImportacionDocumentoAnulado.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDocumentoAnulado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDocumentoAnulado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDocumentoAnulado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDocumentoAnulado.gridy = iPosYImportacion;		
		this.gridBagConstraintsDocumentoAnulado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDocumentoAnulado.add(this.jLabelArchivoImportacionDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDocumentoAnulado = new JFileChooser();		
		this.jFileChooserImportacionDocumentoAnulado.setToolTipText("ESCOGER ARCHIVO"+" "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDocumentoAnulado = new JButtonMe();
		this.jButtonAbrirImportacionDocumentoAnulado.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDocumentoAnulado,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDocumentoAnulado.setToolTipText("Generar"+" "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDocumentoAnulado.gridy = iPosYImportacion;
		this.gridBagConstraintsDocumentoAnulado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDocumentoAnulado.add(this.jButtonAbrirImportacionDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDocumentoAnulado = new JLabelMe();

		this.jLabelPathArchivoImportacionDocumentoAnulado.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDocumentoAnulado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDocumentoAnulado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDocumentoAnulado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDocumentoAnulado.gridy = iPosYImportacion;		
		this.gridBagConstraintsDocumentoAnulado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDocumentoAnulado.add(this.jLabelPathArchivoImportacionDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDocumentoAnulado=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDocumentoAnulado.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDocumentoAnulado.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDocumentoAnulado.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDocumentoAnulado.gridy = iPosYImportacion;
		this.gridBagConstraintsDocumentoAnulado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDocumentoAnulado.add(this.jTextFieldPathArchivoImportacionDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDocumentoAnulado = new JButtonMe();
		this.jButtonGenerarImportacionDocumentoAnulado.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDocumentoAnulado,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDocumentoAnulado.setToolTipText("Generar"+" "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDocumentoAnulado.gridy = iPosYImportacion;
		this.gridBagConstraintsDocumentoAnulado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDocumentoAnulado.add(this.jButtonGenerarImportacionDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDocumentoAnulado = new JButtonMe();
		this.jButtonCerrarImportacionDocumentoAnulado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDocumentoAnulado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDocumentoAnulado.setToolTipText("Cancelar"+" "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDocumentoAnulado.gridy = iPosYImportacion;
		this.gridBagConstraintsDocumentoAnulado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDocumentoAnulado.add(this.jButtonCerrarImportacionDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDocumentoAnulado = new GridBagLayout();
		
		this.jScrollPanelImportacionDocumentoAnulado= new JScrollPane(jPanelImportacionDocumentoAnulado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		this.gridBagConstraintsDocumentoAnulado.gridy =iPosYImportacion;
		this.gridBagConstraintsDocumentoAnulado.gridx =iPosXImportacion;
		this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDocumentoAnulado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDocumentoAnulado.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDocumentoAnulado);
		this.jInternalFrameImportacionDocumentoAnulado.getContentPane().add(this.jScrollPanelImportacionDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDocumentoAnulado(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDocumentoAnulado = new JButtonMe();
			this.jButtonAbrirOrderByDocumentoAnulado.setText("Orden");
			this.jButtonAbrirOrderByDocumentoAnulado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDocumentoAnulado,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDocumentoAnulado";
			inputMap = this.jButtonAbrirOrderByDocumentoAnulado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDocumentoAnulado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDocumentoAnulado"));
		
		
			GridBagLayout gridaBagLayoutOrderByDocumentoAnulado = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDocumentoAnulado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDocumentoAnulado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDocumentoAnulado.setName("jPanelOrderByDocumentoAnulado"); 
			
			this.jPanelOrderByDocumentoAnulado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDocumentoAnulado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDocumentoAnulado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDocumentoAnulado.setLayout(gridaBagLayoutOrderByDocumentoAnulado);
			
			
			this.jTableDatosDocumentoAnuladoOrderBy = new JTableMe();        
			this.jTableDatosDocumentoAnuladoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDocumentoAnuladoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDocumentoAnuladoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDocumentoAnuladoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDocumentoAnuladoOrderBy.setViewportView(this.jTableDatosDocumentoAnuladoOrderBy);
			this.jTableDatosDocumentoAnuladoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDocumentoAnuladoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDocumentoAnulado= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDocumentoAnulado= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDocumentoAnulado = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDocumentoAnulado= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDocumentoAnulado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDocumentoAnulado.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDocumentoAnulado.setTitle("Orden");
			this.jInternalFrameOrderByDocumentoAnulado.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDocumentoAnulado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDocumentoAnulado.setResizable(true);
			this.jInternalFrameOrderByDocumentoAnulado.setClosable(true);
			this.jInternalFrameOrderByDocumentoAnulado.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDocumentoAnulado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDocumentoAnulado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDocumentoAnulado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDocumentoAnulado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Documento Anulados"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			this.gridBagConstraintsDocumentoAnulado.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDocumentoAnulado.gridx =iPosXOrderBy;
			this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDocumentoAnulado.ipady =150;
				
			this.jPanelOrderByDocumentoAnulado.add(jScrollPanelDatosDocumentoAnuladoOrderBy, this.gridBagConstraintsDocumentoAnulado);//this.jTableDatosDocumentoAnuladoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDocumentoAnulado = new JButtonMe();
			this.jButtonCerrarOrderByDocumentoAnulado.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDocumentoAnulado,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDocumentoAnulado.setToolTipText("Cancelar"+" "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDocumentoAnulado.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDocumentoAnulado.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDocumentoAnulado.add(this.jButtonCerrarOrderByDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDocumentoAnulado = new GridBagLayout();
			
			this.jScrollPanelOrderByDocumentoAnulado= new JScrollPane(jPanelOrderByDocumentoAnulado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			this.gridBagConstraintsDocumentoAnulado.gridy =iPosYOrderBy;
			this.gridBagConstraintsDocumentoAnulado.gridx =iPosXOrderBy;
			this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDocumentoAnulado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDocumentoAnulado.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDocumentoAnulado);
			
			this.jInternalFrameOrderByDocumentoAnulado.getContentPane().add(this.jScrollPanelOrderByDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);			
		
		} else {
			this.jButtonAbrirOrderByDocumentoAnulado = new JButtonMe();
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
			&& this.documentoanuladoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDocumentoAnulado.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDocumentoAnulado.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDocumentoAnulado.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDocumentoAnulado.getRowHeight();//DocumentoAnuladoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DocumentoAnuladoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDocumentoAnulado.isSelected()) {
					iHeightTable=DocumentoAnuladoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DocumentoAnuladoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DocumentoAnuladoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DocumentoAnuladoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDocumentoAnulado.isSelected()) {
					iHeightTable=DocumentoAnuladoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DocumentoAnuladoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DocumentoAnuladoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDocumentoAnulado.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDocumentoAnulado.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDocumentoAnulado.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDocumentoAnulado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDocumentoAnulado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDocumentoAnulado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDocumentoAnulado!=null && this.jInternalFrameOrderByDocumentoAnulado.getjTableDatosOrderBy()!=null) {
			//if(!this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDocumentoAnulado.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDocumentoAnulado.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDocumentoAnulado.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDocumentoAnulado.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDocumentoAnulado.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDocumentoAnulado.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDocumentoAnulado.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDocumentoAnulado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDocumentoAnulado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDocumentoAnulado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=documentoanuladoLogic.getDocumentoAnulados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=documentoanulados.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DocumentoAnulado> TraerDocumentoAnuladoBeans(List<DocumentoAnulado> documentoanulados,ArrayList<Classe> classes)throws Exception {
		try {
			for(DocumentoAnulado documentoanulado:documentoanulados) {
					
				if(!(DocumentoAnuladoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DocumentoAnuladoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					documentoanulado.setsDetalleGeneralEntityReporte(DocumentoAnuladoConstantesFunciones.getDocumentoAnuladoDescripcion(documentoanulado));
										
						
					
						
					
				} else  {
							
					//documentoanulado.setsDetalleGeneralEntityReporte(documentoanulado.getsDetalleGeneralEntityReporte());
										
				}
				
				//documentoanuladobeans.add(documentoanuladobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return documentoanulados;
    }
	//PARA REPORTES FIN
}
