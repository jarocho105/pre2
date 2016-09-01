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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;



import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.AuditoriaDetalleConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class AuditoriaDetalleJInternalFrame extends AuditoriaDetalleBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarAuditoriaDetalle;
	
	protected JMenuBar jmenuBarAuditoriaDetalle;
	
	protected JMenu jmenuAuditoriaDetalle;
	protected JMenu jmenuDatosAuditoriaDetalle;
	protected JMenu jmenuArchivoAuditoriaDetalle;
	protected JMenu jmenuAccionesAuditoriaDetalle;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosAuditoriaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAuditoriaDetalle;	
	protected GridBagConstraints gridBagConstraintsAuditoriaDetalle;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public AuditoriaDetalleDetalleFormJInternalFrame jInternalFrameDetalleFormAuditoriaDetalle;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoAuditoriaDetalle;	
	protected ImportacionJInternalFrame jInternalFrameImportacionAuditoriaDetalle;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected AuditoriaBeanSwingJInternalFrame auditoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_auditoria="";
	
	public AuditoriaDetalleSessionBean auditoriadetalleSessionBean;
		
	
	
	public AuditoriaSessionBean auditoriaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<AuditoriaDetalle> auditoriadetalles;		
	public List<AuditoriaDetalle> auditoriadetallesEliminados;	
	public List<AuditoriaDetalle> auditoriadetallesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByAuditoriaDetalle;		
	protected JButton jButtonAbrirOrderByAuditoriaDetalle;
	
	
	//protected JPanel jPanelOrderByAuditoriaDetalle;
	//public JScrollPane jScrollPanelOrderByAuditoriaDetalle;	
	//protected JButton jButtonCerrarOrderByAuditoriaDetalle;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public AuditoriaDetalleLogic auditoriadetalleLogic;
	
	
	
	public JScrollPane jScrollPanelDatosAuditoriaDetalle;
	public JScrollPane jScrollPanelDatosEdicionAuditoriaDetalle;
	public JScrollPane jScrollPanelDatosGeneralAuditoriaDetalle;
    
	
	
	//public JScrollPane jScrollPanelDatosAuditoriaDetalleOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoAuditoriaDetalle;
	//public JScrollPane jScrollPanelImportacionAuditoriaDetalle;
	
	
	
	protected JPanel jPanelAccionesAuditoriaDetalle;
	
    protected JPanel jPanelPaginacionAuditoriaDetalle;
    protected JPanel jPanelParametrosReportesAuditoriaDetalle;
	protected JPanel jPanelParametrosReportesAccionesAuditoriaDetalle;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1AuditoriaDetalle;
	protected JPanel jPanelParametrosAuxiliar2AuditoriaDetalle;
	protected JPanel jPanelParametrosAuxiliar3AuditoriaDetalle;
	protected JPanel jPanelParametrosAuxiliar4AuditoriaDetalle;
	//protected JPanel jPanelParametrosAuxiliar5AuditoriaDetalle;
	
	
	
	//protected JPanel jPanelReporteDinamicoAuditoriaDetalle;
	//protected JPanel jPanelImportacionAuditoriaDetalle;
	
	
	public JTable jTableDatosAuditoriaDetalle;
	
	
	
	//public JTable jTableDatosAuditoriaDetalleOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoAuditoriaDetalle;
	protected JButton jButtonDuplicarAuditoriaDetalle;
	protected JButton jButtonCopiarAuditoriaDetalle;
	protected JButton jButtonVerFormAuditoriaDetalle;
	protected JButton jButtonNuevoRelacionesAuditoriaDetalle;
	protected JButton jButtonModificarAuditoriaDetalle;
	
    protected JButton jButtonGuardarCambiosTablaAuditoriaDetalle;
	protected JButton jButtonCerrarAuditoriaDetalle;
	
	
	protected JButton jButtonRecargarInformacionAuditoriaDetalle;
	protected JButton jButtonProcesarInformacionAuditoriaDetalle;
	
	
	protected JButton jButtonAnterioresAuditoriaDetalle;
	protected JButton jButtonSiguientesAuditoriaDetalle;
	protected JButton jButtonNuevoGuardarCambiosAuditoriaDetalle;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoAuditoriaDetalle;
	//protected JButton jButtonCerrarReporteDinamicoAuditoriaDetalle;
	//protected JButton jButtonGenerarExcelReporteDinamicoAuditoriaDetalle;	
	
	
	
	//protected JButton jButtonAbrirImportacionAuditoriaDetalle;
	//protected JButton jButtonGenerarImportacionAuditoriaDetalle;
	//protected JButton jButtonCerrarImportacionAuditoriaDetalle;
	//protected JFileChooser jFileChooserImportacionAuditoriaDetalle;
	//protected File fileImportacionAuditoriaDetalle;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAuditoriaDetalle;
	protected JButton jButtonDuplicarToolBarAuditoriaDetalle;
	protected JButton jButtonNuevoRelacionesToolBarAuditoriaDetalle;
	
	
	public JButton jButtonGuardarCambiosToolBarAuditoriaDetalle;
	protected JButton jButtonCopiarToolBarAuditoriaDetalle;
	protected JButton jButtonVerFormToolBarAuditoriaDetalle;
	public JButton jButtonGuardarCambiosTablaToolBarAuditoriaDetalle;
	protected JButton jButtonMostrarOcultarTablaToolBarAuditoriaDetalle;
	protected JButton jButtonCerrarToolBarAuditoriaDetalle;
	
	protected JButton jButtonRecargarInformacionToolBarAuditoriaDetalle;
	protected JButton jButtonProcesarInformacionToolBarAuditoriaDetalle;
	protected JButton jButtonAnterioresToolBarAuditoriaDetalle;
	protected JButton jButtonSiguientesToolBarAuditoriaDetalle;
	protected JButton jButtonNuevoGuardarCambiosToolBarAuditoriaDetalle;
	protected JButton jButtonAbrirOrderByToolBarAuditoriaDetalle;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAuditoriaDetalle;
	protected JMenuItem jMenuItemDuplicarAuditoriaDetalle;
	protected JMenuItem jMenuItemNuevoRelacionesAuditoriaDetalle;
	
	
	protected JMenuItem jMenuItemGuardarCambiosAuditoriaDetalle;
	protected JMenuItem jMenuItemCopiarAuditoriaDetalle;
	protected JMenuItem jMenuItemVerFormAuditoriaDetalle;
	protected JMenuItem jMenuItemGuardarCambiosTablaAuditoriaDetalle;
	protected JMenuItem jMenuItemCerrarAuditoriaDetalle;
	protected JMenuItem jMenuItemDetalleCerrarAuditoriaDetalle;
	protected JMenuItem jMenuItemDetalleAbrirOrderByAuditoriaDetalle;
	protected JMenuItem jMenuItemDetalleMostarOcultarAuditoriaDetalle;
	
	protected JMenuItem jMenuItemRecargarInformacionAuditoriaDetalle;
	protected JMenuItem jMenuItemProcesarInformacionAuditoriaDetalle;
	protected JMenuItem jMenuItemAnterioresAuditoriaDetalle;
	protected JMenuItem jMenuItemSiguientesAuditoriaDetalle;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAuditoriaDetalle;
	protected JMenuItem jMenuItemAbrirOrderByAuditoriaDetalle;
	protected JMenuItem jMenuItemMostrarOcultarAuditoriaDetalle;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAuditoriaDetalle;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosAuditoriaDetalle;
	protected JCheckBox jCheckBoxSeleccionadosAuditoriaDetalle;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaAuditoriaDetalle;
	protected JCheckBox jCheckBoxConGraficoReporteAuditoriaDetalle;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesAuditoriaDetalle;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesAuditoriaDetalle;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoAuditoriaDetalle;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoAuditoriaDetalle;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesAuditoriaDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionAuditoriaDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAuditoriaDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAuditoriaDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarAuditoriaDetalle;
	protected JTextField jTextFieldValorCampoGeneralAuditoriaDetalle;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteAuditoriaDetalle;
	//public JList<Reporte> jListColumnasSelectReporteAuditoriaDetalle;
	//public JScrollPane jScrollColumnasSelectReporteAuditoriaDetalle;
	
	//public JLabel jLabelRelacionesSelectReporteAuditoriaDetalle;
	//public JList<Reporte> jListRelacionesSelectReporteAuditoriaDetalle;
	//public JScrollPane jScrollRelacionesSelectReporteAuditoriaDetalle;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoAuditoriaDetalle;
	//protected JCheckBox jCheckBoxConGraficoDinamicoAuditoriaDetalle;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoAuditoriaDetalle;
	//public JLabel jLabelTiposArchivoReporteDinamicoAuditoriaDetalle;
	
		
	//public JLabel jLabelArchivoImportacionAuditoriaDetalle;	
	//public JLabel jLabelPathArchivoImportacionAuditoriaDetalle;
	//protected JTextField jTextFieldPathArchivoImportacionAuditoriaDetalle;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoAuditoriaDetalle;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoAuditoriaDetalle;
	
	//public JLabel jLabelColumnaCategoriaValorAuditoriaDetalle;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorAuditoriaDetalle;
	
	//public JLabel jLabelColumnasValoresGraficoAuditoriaDetalle;
	//public JList<Reporte> jListColumnasValoresGraficoAuditoriaDetalle;
	//public JScrollPane jScrollColumnasValoresGraficoAuditoriaDetalle;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoAuditoriaDetalle;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoAuditoriaDetalle;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasAuditoriaDetalle;
	public JPanel jPanelBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle;
	public JButton jButtonBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle;
	public JPanel jPanelFK_IdAuditoriaAuditoriaDetalle;
	public JButton jButtonFK_IdAuditoriaAuditoriaDetalle;
	
	public JPanel jPanelid_auditoriaBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle;
	public JLabel jLabelid_auditoriaBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_auditoriaBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle;
	public JButton jButtonid_auditoriaBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle= new JButtonMe();
	public JButton jButtonid_auditoriaBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalleUpdate= new JButtonMe();
	public JButton jButtonid_auditoriaBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalleBusqueda= new JButtonMe();

	
	public JPanel jPanelnombre_campoBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle;
	public JLabel jLabelnombre_campoBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle;
	public JTextArea jTextAreanombre_campoBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle;
	public JButton jButtonnombre_campoBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalleBusqueda= new JButtonMe();

	
	public JPanel jPanelid_auditoriaFK_IdAuditoriaAuditoriaDetalle;
	public JLabel jLabelid_auditoriaFK_IdAuditoriaAuditoriaDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_auditoriaFK_IdAuditoriaAuditoriaDetalle;
	public JButton jButtonid_auditoriaFK_IdAuditoriaAuditoriaDetalle= new JButtonMe();
	public JButton jButtonid_auditoriaFK_IdAuditoriaAuditoriaDetalleUpdate= new JButtonMe();
	public JButton jButtonid_auditoriaFK_IdAuditoriaAuditoriaDetalleBusqueda= new JButtonMe();

	
	
	
	
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
	public AuditoriaDetalleJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("AuditoriaDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AuditoriaDetalleJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AuditoriaDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AuditoriaDetalleJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AuditoriaDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AuditoriaDetalleJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("AuditoriaDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionAuditoriaDetalle)	{
		this.jButtonRecargarInformacionAuditoriaDetalle = jButtonRecargarInformacionAuditoriaDetalle;
	}
	
	public JButton getjButtonProcesarInformacionAuditoriaDetalle() {
		return this.jButtonProcesarInformacionAuditoriaDetalle;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAuditoriaDetalle)	{
		this.jButtonProcesarInformacionAuditoriaDetalle = jButtonProcesarInformacionAuditoriaDetalle;
	}
	
	
	public JButton getjButtonRecargarInformacionAuditoriaDetalle() {
		return this.jButtonRecargarInformacionAuditoriaDetalle;
	}
	
	
	public List<AuditoriaDetalle> getauditoriadetalles() {
		return this.auditoriadetalles;
	}

	public void setauditoriadetalles(List<AuditoriaDetalle> auditoriadetalles) {
		this.auditoriadetalles = auditoriadetalles;
	}
	
	public List<AuditoriaDetalle> getauditoriadetallesAux() {
		return this.auditoriadetallesAux;
	}

	public void setauditoriadetallesAux(List<AuditoriaDetalle> auditoriadetallesAux) {
		this.auditoriadetallesAux = auditoriadetallesAux;
	}
	
	public List<AuditoriaDetalle> getauditoriadetallesEliminados() {
		return this.auditoriadetallesEliminados;
	}

	public void setAuditoriaDetallesEliminados(List<AuditoriaDetalle> auditoriadetallesEliminados) {
		this.auditoriadetallesEliminados = auditoriadetallesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarAuditoriaDetalle() {
		return jComboBoxTiposSeleccionarAuditoriaDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarAuditoriaDetalle(
			JComboBox jComboBoxTiposSeleccionarAuditoriaDetalle) {
		this.jComboBoxTiposSeleccionarAuditoriaDetalle = jComboBoxTiposSeleccionarAuditoriaDetalle;
	}
	
	public void setBorderResaltarTiposSeleccionarAuditoriaDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarAuditoriaDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarAuditoriaDetalle .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralAuditoriaDetalle() {
		return jTextFieldValorCampoGeneralAuditoriaDetalle;
	}

	public void setjTextFieldValorCampoGeneralAuditoriaDetalle(
			JTextField jTextFieldValorCampoGeneralAuditoriaDetalle) {
		this.jTextFieldValorCampoGeneralAuditoriaDetalle = jTextFieldValorCampoGeneralAuditoriaDetalle;
	}

	public void setBorderResaltarValorCampoGeneralAuditoriaDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAuditoriaDetalle.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralAuditoriaDetalle .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosAuditoriaDetalle() {
		return this.jCheckBoxSeleccionarTodosAuditoriaDetalle;
	}

	public void setjCheckBoxSeleccionarTodosAuditoriaDetalle(
			JCheckBox jCheckBoxSeleccionarTodosAuditoriaDetalle) {
		this.jCheckBoxSeleccionarTodosAuditoriaDetalle = jCheckBoxSeleccionarTodosAuditoriaDetalle;
	}

	public void setBorderResaltarSeleccionarTodosAuditoriaDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAuditoriaDetalle.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosAuditoriaDetalle .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosAuditoriaDetalle() {
		return this.jCheckBoxSeleccionadosAuditoriaDetalle;
	}

	public void setjCheckBoxSeleccionadosAuditoriaDetalle(
			JCheckBox jCheckBoxSeleccionadosAuditoriaDetalle) {
		this.jCheckBoxSeleccionadosAuditoriaDetalle = jCheckBoxSeleccionadosAuditoriaDetalle;
	}
	
	public void setBorderResaltarSeleccionadosAuditoriaDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAuditoriaDetalle.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosAuditoriaDetalle .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesAuditoriaDetalle() {
		return this.jComboBoxTiposArchivosReportesAuditoriaDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesAuditoriaDetalle(
			JComboBox jComboBoxTiposArchivosReportesAuditoriaDetalle) {
		this.jComboBoxTiposArchivosReportesAuditoriaDetalle = jComboBoxTiposArchivosReportesAuditoriaDetalle;
	}

	public void setBorderResaltarTiposArchivosReportesAuditoriaDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAuditoriaDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesAuditoriaDetalle .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesAuditoriaDetalle() {
		return this.jComboBoxTiposReportesAuditoriaDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesAuditoriaDetalle(
			JComboBox jComboBoxTiposReportesAuditoriaDetalle) {
		this.jComboBoxTiposReportesAuditoriaDetalle = jComboBoxTiposReportesAuditoriaDetalle;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoAuditoriaDetalle() {
	//	return jComboBoxTiposReportesDinamicoAuditoriaDetalle;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoAuditoriaDetalle(
	//		JComboBox jComboBoxTiposReportesDinamicoAuditoriaDetalle) {
	//	this.jComboBoxTiposReportesDinamicoAuditoriaDetalle = jComboBoxTiposReportesDinamicoAuditoriaDetalle;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoAuditoriaDetalle() {
	//	return jComboBoxTiposArchivosReportesDinamicoAuditoriaDetalle;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoAuditoriaDetalle(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoAuditoriaDetalle) {
	//	this.jComboBoxTiposArchivosReportesDinamicoAuditoriaDetalle = jComboBoxTiposArchivosReportesDinamicoAuditoriaDetalle;
	//}
	
	public void setBorderResaltarTiposReportesAuditoriaDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAuditoriaDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesAuditoriaDetalle .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesAuditoriaDetalle() {
		return this.jComboBoxTiposGraficosReportesAuditoriaDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesAuditoriaDetalle(
			JComboBox jComboBoxTiposGraficosReportesAuditoriaDetalle) {
		this.jComboBoxTiposGraficosReportesAuditoriaDetalle = jComboBoxTiposGraficosReportesAuditoriaDetalle;
	}
	
	public void setBorderResaltarTiposGraficosReportesAuditoriaDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAuditoriaDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesAuditoriaDetalle .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionAuditoriaDetalle() {
		return this.jComboBoxTiposPaginacionAuditoriaDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionAuditoriaDetalle(
			JComboBox jComboBoxTiposPaginacionAuditoriaDetalle) {
		this.jComboBoxTiposPaginacionAuditoriaDetalle = jComboBoxTiposPaginacionAuditoriaDetalle;
	}
	
	public void setBorderResaltarTiposPaginacionAuditoriaDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAuditoriaDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionAuditoriaDetalle .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesAuditoriaDetalle() {
		return this.jComboBoxTiposRelacionesAuditoriaDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAuditoriaDetalle() {
		return this.jComboBoxTiposAccionesAuditoriaDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAuditoriaDetalle(
			JComboBox jComboBoxTiposRelacionesAuditoriaDetalle) {
		this.jComboBoxTiposRelacionesAuditoriaDetalle = jComboBoxTiposRelacionesAuditoriaDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAuditoriaDetalle(
			JComboBox jComboBoxTiposAccionesAuditoriaDetalle) {
		this.jComboBoxTiposAccionesAuditoriaDetalle = jComboBoxTiposAccionesAuditoriaDetalle;
	}
	
	public void setBorderResaltarTiposRelacionesAuditoriaDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAuditoriaDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesAuditoriaDetalle .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesAuditoriaDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAuditoriaDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesAuditoriaDetalle .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoAuditoriaDetalle() {
	//	return jCheckBoxConGraficoDinamicoAuditoriaDetalle;
	//}

	//public void setjCheckBoxConGraficoDinamicoAuditoriaDetalle(
	//		JCheckBox jCheckBoxConGraficoDinamicoAuditoriaDetalle) {
	//	this.jCheckBoxConGraficoDinamicoAuditoriaDetalle = jCheckBoxConGraficoDinamicoAuditoriaDetalle;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoAuditoriaDetalle() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarAuditoriaDetalle.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoAuditoriaDetalle .setBorder(borderResaltar);		
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
		this.auditoriadetalleSessionBean=new AuditoriaDetalleSessionBean();
		
		this.auditoriadetalleSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.auditoriadetalleSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.auditoriadetalleSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=AuditoriaDetalleJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=AuditoriaDetalleJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AuditoriaDetalleJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AuditoriaDetalleJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AuditoriaDetalleJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Auditoria Detalle MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {
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
		
		AuditoriaDetalleJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("AuditoriaDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarAuditoriaDetalle= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarAuditoriaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarAuditoriaDetalle,this.jTtoolBarAuditoriaDetalle,
							"nuevo","nuevo","Nuevo"+" "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarAuditoriaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarAuditoriaDetalle,this.jTtoolBarAuditoriaDetalle,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarAuditoriaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarAuditoriaDetalle,this.jTtoolBarAuditoriaDetalle,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarAuditoriaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarAuditoriaDetalle,this.jTtoolBarAuditoriaDetalle,
							"duplicar","duplicar","Duplicar"+" "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarAuditoriaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarAuditoriaDetalle,this.jTtoolBarAuditoriaDetalle,
							"copiar","copiar","Copiar"+" "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarAuditoriaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarAuditoriaDetalle,this.jTtoolBarAuditoriaDetalle,
							"ver_form","ver_form","Ver"+" "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarAuditoriaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAuditoriaDetalle,this.jTtoolBarAuditoriaDetalle,
							"recargar","recargar","Recargar"+" "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarAuditoriaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAuditoriaDetalle,this.jTtoolBarAuditoriaDetalle,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarAuditoriaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAuditoriaDetalle,this.jTtoolBarAuditoriaDetalle,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarAuditoriaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarAuditoriaDetalle,this.jTtoolBarAuditoriaDetalle,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarAuditoriaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarAuditoriaDetalle,this.jTtoolBarAuditoriaDetalle,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarAuditoriaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarAuditoriaDetalle,this.jTtoolBarAuditoriaDetalle,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarAuditoriaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarAuditoriaDetalle,this.jTtoolBarAuditoriaDetalle,
							"cerrar","cerrar","Salir"+" "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarAuditoriaDetalle=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarAuditoriaDetalle;
			
				this.jButtonProcesarInformacionToolBarAuditoriaDetalle=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarAuditoriaDetalle;
				
		//protected JButton jButtonModificarToolBarAuditoriaDetalle;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarAuditoriaDetalle=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuAuditoriaDetalle=new JMenuMe("General");
		this.jmenuArchivoAuditoriaDetalle=new JMenuMe("Archivo");
		this.jmenuAccionesAuditoriaDetalle=new JMenuMe("Acciones");
		this.jmenuDatosAuditoriaDetalle=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAuditoriaDetalle= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAuditoriaDetalle.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAuditoriaDetalle,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarAuditoriaDetalle= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarAuditoriaDetalle.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarAuditoriaDetalle,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesAuditoriaDetalle= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesAuditoriaDetalle.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesAuditoriaDetalle,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosAuditoriaDetalle= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAuditoriaDetalle.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAuditoriaDetalle,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarAuditoriaDetalle= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarAuditoriaDetalle.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarAuditoriaDetalle,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormAuditoriaDetalle= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormAuditoriaDetalle.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormAuditoriaDetalle,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaAuditoriaDetalle= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaAuditoriaDetalle.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaAuditoriaDetalle,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAuditoriaDetalle= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAuditoriaDetalle.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAuditoriaDetalle,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionAuditoriaDetalle= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionAuditoriaDetalle.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionAuditoriaDetalle,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionAuditoriaDetalle= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionAuditoriaDetalle.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionAuditoriaDetalle,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresAuditoriaDetalle= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresAuditoriaDetalle.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresAuditoriaDetalle,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesAuditoriaDetalle= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesAuditoriaDetalle.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesAuditoriaDetalle,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByAuditoriaDetalle= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByAuditoriaDetalle.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByAuditoriaDetalle,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAuditoriaDetalle= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAuditoriaDetalle.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAuditoriaDetalle,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByAuditoriaDetalle= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByAuditoriaDetalle.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByAuditoriaDetalle,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAuditoriaDetalle= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAuditoriaDetalle.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAuditoriaDetalle,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosAuditoriaDetalle= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosAuditoriaDetalle.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosAuditoriaDetalle,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoAuditoriaDetalle.add(this.jMenuItemCerrarAuditoriaDetalle);
			
			this.jmenuAccionesAuditoriaDetalle.add(this.jMenuItemNuevoAuditoriaDetalle);
			this.jmenuAccionesAuditoriaDetalle.add(this.jMenuItemNuevoGuardarCambiosAuditoriaDetalle);
			this.jmenuAccionesAuditoriaDetalle.add(this.jMenuItemNuevoRelacionesAuditoriaDetalle);
			this.jmenuAccionesAuditoriaDetalle.add(this.jMenuItemGuardarCambiosTablaAuditoriaDetalle);		
			this.jmenuAccionesAuditoriaDetalle.add(this.jMenuItemDuplicarAuditoriaDetalle);		
			this.jmenuAccionesAuditoriaDetalle.add(this.jMenuItemCopiarAuditoriaDetalle);		
			this.jmenuAccionesAuditoriaDetalle.add(this.jMenuItemVerFormAuditoriaDetalle);		
			
			this.jmenuDatosAuditoriaDetalle.add(this.jMenuItemRecargarInformacionAuditoriaDetalle);				
			this.jmenuDatosAuditoriaDetalle.add(this.jMenuItemAnterioresAuditoriaDetalle);				
			this.jmenuDatosAuditoriaDetalle.add(this.jMenuItemSiguientesAuditoriaDetalle);				
			this.jmenuDatosAuditoriaDetalle.add(this.jMenuItemAbrirOrderByAuditoriaDetalle);				
			this.jmenuDatosAuditoriaDetalle.add(this.jMenuItemMostrarOcultarAuditoriaDetalle);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesAuditoriaDetalle.add(this.jMenuItemGuardarCambiosAuditoriaDetalle);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarAuditoriaDetalle.add(this.jmenuArchivoAuditoriaDetalle);		
			this.jmenuBarAuditoriaDetalle.add(this.jmenuAccionesAuditoriaDetalle);		
			this.jmenuBarAuditoriaDetalle.add(this.jmenuDatosAuditoriaDetalle);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarAuditoriaDetalle);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasAuditoriaDetalle() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.setToolTipText("Buscar Por Auditoria Por Nombre Del Campo ");
		this.jButtonBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle= new JButtonMe();
		this.jButtonBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.setText("Buscar");
		this.jButtonBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.setToolTipText("Buscar Por Auditoria Por Nombre Del Campo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle,"buscar_button","Buscar Por Auditoria Por Nombre Del Campo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_auditoriaBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle = new JLabelMe();
		jLabelid_auditoriaBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.setText("Auditoria :");
		jLabelid_auditoriaBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.setToolTipText("Auditoria");
		jLabelid_auditoriaBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_auditoriaBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_auditoriaBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_auditoriaBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_auditoriaBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle= new JComboBoxMe();
		jComboBoxid_auditoriaBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_auditoriaBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_auditoriaBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_auditoriaBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelnombre_campoBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle = new JLabelMe();
		jLabelnombre_campoBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.setText("Nombre Del Campo :");
		jLabelnombre_campoBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.setToolTipText("Nombre Del Campo");
		jLabelnombre_campoBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelnombre_campoBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelnombre_campoBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelnombre_campoBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombre_campoBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle= new JTextAreaMe();
		jTextAreanombre_campoBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_campoBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_campoBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombre_campoBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdAuditoriaAuditoriaDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAuditoriaAuditoriaDetalle.setToolTipText("Buscar Por Auditoria ");
		this.jButtonFK_IdAuditoriaAuditoriaDetalle= new JButtonMe();
		this.jButtonFK_IdAuditoriaAuditoriaDetalle.setText("Buscar");
		this.jButtonFK_IdAuditoriaAuditoriaDetalle.setToolTipText("Buscar Por Auditoria ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAuditoriaAuditoriaDetalle,"buscar_button","Buscar Por Auditoria ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAuditoriaAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_auditoriaFK_IdAuditoriaAuditoriaDetalle = new JLabelMe();
		jLabelid_auditoriaFK_IdAuditoriaAuditoriaDetalle.setText("Auditoria :");
		jLabelid_auditoriaFK_IdAuditoriaAuditoriaDetalle.setToolTipText("Auditoria");
		jLabelid_auditoriaFK_IdAuditoriaAuditoriaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_auditoriaFK_IdAuditoriaAuditoriaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_auditoriaFK_IdAuditoriaAuditoriaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_auditoriaFK_IdAuditoriaAuditoriaDetalle,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_auditoriaFK_IdAuditoriaAuditoriaDetalle= new JComboBoxMe();
		jComboBoxid_auditoriaFK_IdAuditoriaAuditoriaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_auditoriaFK_IdAuditoriaAuditoriaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_auditoriaFK_IdAuditoriaAuditoriaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_auditoriaFK_IdAuditoriaAuditoriaDetalle,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasAuditoriaDetalle=new JTabbedPane();


		this.jTabbedPaneBusquedasAuditoriaDetalle.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasAuditoriaDetalle.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasAuditoriaDetalle.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasAuditoriaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasAuditoriaDetalle.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasAuditoriaDetalle,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleAuditoriaDetalle = new AuditoriaDetalleDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Auditoria Detalle DATOS");
			this.jInternalFrameDetalleFormAuditoriaDetalle = new AuditoriaDetalleDetalleFormJInternalFrame(jDesktopPane,this.auditoriadetalleSessionBean.getConGuardarRelaciones(),this.auditoriadetalleSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormAuditoriaDetalle = null;//new AuditoriaDetalleDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAuditoriaDetalle= new GridBagLayout();
		
		
		this.jTableDatosAuditoriaDetalle = new JTableMe();      
		
		String sToolTipAuditoriaDetalle="";
		sToolTipAuditoriaDetalle=AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAuditoriaDetalle+="(Seguridad.AuditoriaDetalle)";
		}
		
		if(!this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {
			sToolTipAuditoriaDetalle+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosAuditoriaDetalle.setToolTipText(sToolTipAuditoriaDetalle);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosAuditoriaDetalle);
		this.jTableDatosAuditoriaDetalle.setAutoCreateRowSorter(true);
		this.jTableDatosAuditoriaDetalle.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosAuditoriaDetalle.setRowSelectionAllowed(true);
		this.jTableDatosAuditoriaDetalle.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosAuditoriaDetalle,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoAuditoriaDetalle = new JButtonMe();
		this.jButtonDuplicarAuditoriaDetalle = new JButtonMe();
		this.jButtonCopiarAuditoriaDetalle = new JButtonMe();
		this.jButtonVerFormAuditoriaDetalle = new JButtonMe();
		this.jButtonNuevoRelacionesAuditoriaDetalle = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaAuditoriaDetalle = new JButtonMe();
		this.jButtonCerrarAuditoriaDetalle = new JButtonMe();
		
		this.jScrollPanelDatosAuditoriaDetalle = new JScrollPane();   
        this.jScrollPanelDatosGeneralAuditoriaDetalle = new JScrollPane();
		
				
		
		
		this.jPanelAccionesAuditoriaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Auditoria Detalle";
		
		if(!this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAuditoriaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Auditoria Detalles" + this.sPath));
		} else {
			this.jScrollPanelDatosAuditoriaDetalle.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralAuditoriaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesAuditoriaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAuditoriaDetalle.setToolTipText("Acciones");
        this.jPanelAccionesAuditoriaDetalle.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoAuditoriaDetalle=new ReporteDinamicoJInternalFrame(AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoAuditoriaDetalle();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionAuditoriaDetalle=new ImportacionJInternalFrame(AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionAuditoriaDetalle();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByAuditoriaDetalle = new JButtonMe();
		
		this.jButtonAbrirOrderByAuditoriaDetalle.setText("Orden");
		this.jButtonAbrirOrderByAuditoriaDetalle.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAuditoriaDetalle,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByAuditoriaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByAuditoriaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAuditoriaDetalle=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAuditoriaDetalle,false,this);
			
			//this.cargarOrderByAuditoriaDetalle(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAuditoriaDetalle=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAuditoriaDetalle,true,this);
			
			//this.cargarOrderByAuditoriaDetalle(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosAuditoriaDetalle.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosAuditoriaDetalle.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosAuditoriaDetalle.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosAuditoriaDetalle.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosAuditoriaDetalle.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosAuditoriaDetalle.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoAuditoriaDetalle.setText("Nuevo");
		this.jButtonDuplicarAuditoriaDetalle.setText("Duplicar");
		this.jButtonCopiarAuditoriaDetalle.setText("Copiar");
		this.jButtonVerFormAuditoriaDetalle.setText("Ver");
		this.jButtonNuevoRelacionesAuditoriaDetalle.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaAuditoriaDetalle.setText("Guardar");
		this.jButtonCerrarAuditoriaDetalle.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAuditoriaDetalle,"nuevo_button","Nuevo",this.auditoriadetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarAuditoriaDetalle,"duplicar_button","Duplicar",this.auditoriadetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarAuditoriaDetalle,"copiar_button","Copiar",this.auditoriadetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormAuditoriaDetalle,"ver_form","Ver",this.auditoriadetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesAuditoriaDetalle,"nuevorelaciones_button","Nuevo Rel",this.auditoriadetalleSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAuditoriaDetalle,"guardarcambiostabla_button","Guardar",this.auditoriadetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAuditoriaDetalle,"cerrar_button","Salir",this.auditoriadetalleSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoAuditoriaDetalle.setToolTipText("Nuevo"+" "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarAuditoriaDetalle.setToolTipText("Duplicar"+" "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarAuditoriaDetalle.setToolTipText("Copiar"+" "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormAuditoriaDetalle.setToolTipText("Ver"+" "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesAuditoriaDetalle.setToolTipText("Nuevo Rel"+" "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaAuditoriaDetalle.setToolTipText("Guardar"+" "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAuditoriaDetalle.setToolTipText("Salir"+" "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAuditoriaDetalle";
		inputMap = this.jButtonNuevoAuditoriaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAuditoriaDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAuditoriaDetalle"));
		
		//DUPLICAR
		sMapKey = "DuplicarAuditoriaDetalle";
		inputMap = this.jButtonDuplicarAuditoriaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarAuditoriaDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarAuditoriaDetalle"));
		
		//COPIAR
		sMapKey = "CopiarAuditoriaDetalle";
		inputMap = this.jButtonCopiarAuditoriaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarAuditoriaDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarAuditoriaDetalle"));
		
		//VEr FORM
		sMapKey = "VerFormAuditoriaDetalle";
		inputMap = this.jButtonVerFormAuditoriaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormAuditoriaDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormAuditoriaDetalle"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesAuditoriaDetalle";
		inputMap = this.jButtonNuevoRelacionesAuditoriaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesAuditoriaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesAuditoriaDetalle"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarAuditoriaDetalle";
		inputMap = this.jButtonModificarAuditoriaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarAuditoriaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarAuditoriaDetalle"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarAuditoriaDetalle";
		inputMap = this.jButtonCerrarAuditoriaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAuditoriaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAuditoriaDetalle"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAuditoriaDetalle";
		inputMap = this.jButtonGuardarCambiosTablaAuditoriaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAuditoriaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAuditoriaDetalle"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesAuditoriaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesAuditoriaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionAuditoriaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1AuditoriaDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2AuditoriaDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3AuditoriaDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4AuditoriaDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5AuditoriaDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesAuditoriaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesAuditoriaDetalle.setName("jPanelParametrosReportesAuditoriaDetalle"); 
		
		this.jPanelParametrosReportesAccionesAuditoriaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesAuditoriaDetalle.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesAuditoriaDetalle.setName("jPanelParametrosReportesAccionesAuditoriaDetalle"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionAuditoriaDetalle = new JButtonMe();
		this.jButtonRecargarInformacionAuditoriaDetalle.setText("Recargar");
		this.jButtonRecargarInformacionAuditoriaDetalle.setToolTipText("Recargar"+" "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionAuditoriaDetalle,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionAuditoriaDetalle = new JButtonMe();
		this.jButtonProcesarInformacionAuditoriaDetalle.setText("Procesar");
		this.jButtonProcesarInformacionAuditoriaDetalle.setToolTipText("Procesar"+" "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionAuditoriaDetalle.setVisible(false);
			
		this.jButtonProcesarInformacionAuditoriaDetalle.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAuditoriaDetalle.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAuditoriaDetalle.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesAuditoriaDetalle = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAuditoriaDetalle.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesAuditoriaDetalle.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesAuditoriaDetalle = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAuditoriaDetalle.setText("TIPO");       
		this.jComboBoxTiposReportesAuditoriaDetalle.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesAuditoriaDetalle = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAuditoriaDetalle.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesAuditoriaDetalle.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionAuditoriaDetalle = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionAuditoriaDetalle.setText("Paginacion");
		this.jComboBoxTiposPaginacionAuditoriaDetalle.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesAuditoriaDetalle = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesAuditoriaDetalle.setText("Accion");
		this.jComboBoxTiposRelacionesAuditoriaDetalle.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesAuditoriaDetalle = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAuditoriaDetalle.setText("Accion");
		this.jComboBoxTiposAccionesAuditoriaDetalle.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarAuditoriaDetalle = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarAuditoriaDetalle.setText("Accion");
		this.jComboBoxTiposSeleccionarAuditoriaDetalle.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralAuditoriaDetalle=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralAuditoriaDetalle.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAuditoriaDetalle.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAuditoriaDetalle.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesAuditoriaDetalle = new JLabelMe();
		
		this.jLabelAccionesAuditoriaDetalle.setText("Acciones");		
		this.jLabelAccionesAuditoriaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAuditoriaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAuditoriaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosAuditoriaDetalle = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosAuditoriaDetalle.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosAuditoriaDetalle.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosAuditoriaDetalle = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosAuditoriaDetalle.setText("Seleccionados");
		this.jCheckBoxSeleccionadosAuditoriaDetalle.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaAuditoriaDetalle = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaAuditoriaDetalle.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaAuditoriaDetalle.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteAuditoriaDetalle = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteAuditoriaDetalle.setText("Graf.");
		this.jCheckBoxConGraficoReporteAuditoriaDetalle.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresAuditoriaDetalle = new JButtonMe();
		//this.jButtonAnterioresAuditoriaDetalle.setText("<<");
        this.jButtonAnterioresAuditoriaDetalle.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresAuditoriaDetalle,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesAuditoriaDetalle = new JButtonMe();
		//this.jButtonSiguientesAuditoriaDetalle.setText(">>");
        this.jButtonSiguientesAuditoriaDetalle.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesAuditoriaDetalle,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosAuditoriaDetalle = new JButtonMe();
		this.jButtonNuevoGuardarCambiosAuditoriaDetalle.setText("Nue");
        this.jButtonNuevoGuardarCambiosAuditoriaDetalle.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosAuditoriaDetalle,"nuevoguardarcambios_button","Nue",this.auditoriadetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosAuditoriaDetalle";
		inputMap = this.jButtonNuevoGuardarCambiosAuditoriaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosAuditoriaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosAuditoriaDetalle"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionAuditoriaDetalle";
		inputMap = this.jButtonRecargarInformacionAuditoriaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionAuditoriaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionAuditoriaDetalle"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesAuditoriaDetalle";
		inputMap = this.jButtonSiguientesAuditoriaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesAuditoriaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesAuditoriaDetalle"));
		
		//ANTERIORES		
		sMapKey = "AnterioresAuditoriaDetalle";
		inputMap = this.jButtonAnterioresAuditoriaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresAuditoriaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresAuditoriaDetalle"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasAuditoriaDetalle();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesAuditoriaDetalle.setMinimumSize(new Dimension(this.getWidth(),AuditoriaDetalleBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AuditoriaDetalleBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAuditoriaDetalle.setMaximumSize(new Dimension(this.getWidth(),AuditoriaDetalleBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AuditoriaDetalleBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAuditoriaDetalle.setPreferredSize(new Dimension(this.getWidth(),AuditoriaDetalleBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AuditoriaDetalleBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionAuditoriaDetalle = new GridBagLayout();

			this.jPanelPaginacionAuditoriaDetalle.setLayout(gridaBagLayoutPaginacionAuditoriaDetalle);						
			
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			this.gridBagConstraintsAuditoriaDetalle.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAuditoriaDetalle.gridy = 0;
			this.gridBagConstraintsAuditoriaDetalle.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionAuditoriaDetalle.add(this.jButtonAnterioresAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
					
						
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			this.gridBagConstraintsAuditoriaDetalle.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAuditoriaDetalle.gridy = 0;
			
			this.jPanelPaginacionAuditoriaDetalle.add(this.jButtonNuevoGuardarCambiosAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
						
			
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			this.gridBagConstraintsAuditoriaDetalle.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsAuditoriaDetalle.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAuditoriaDetalle.gridy = 0;
			this.jPanelPaginacionAuditoriaDetalle.add(this.jButtonSiguientesAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAuditoriaDetalle.gridy = 1;
			this.gridBagConstraintsAuditoriaDetalle.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAuditoriaDetalle.add(this.jButtonNuevoAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
						
			
			
			if(!this.auditoriadetalleSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
				this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsAuditoriaDetalle.gridy = 1;
				this.gridBagConstraintsAuditoriaDetalle.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionAuditoriaDetalle.add(this.jButtonGuardarCambiosTablaAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
			}
			
			
			
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAuditoriaDetalle.gridy = 1;
			this.gridBagConstraintsAuditoriaDetalle.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAuditoriaDetalle.add(this.jButtonDuplicarAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
			
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAuditoriaDetalle.gridy = 1;
			this.gridBagConstraintsAuditoriaDetalle.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAuditoriaDetalle.add(this.jButtonCopiarAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
		
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAuditoriaDetalle.gridy = 1;
			this.gridBagConstraintsAuditoriaDetalle.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAuditoriaDetalle.add(this.jButtonVerFormAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
		
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAuditoriaDetalle.gridy = 1;
			this.gridBagConstraintsAuditoriaDetalle.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionAuditoriaDetalle.add(this.jButtonCerrarAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
		
		
		
		this.jButtonRecargarInformacionAuditoriaDetalle.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAuditoriaDetalle.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAuditoriaDetalle.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesAuditoriaDetalle.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAuditoriaDetalle.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAuditoriaDetalle.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesAuditoriaDetalle.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAuditoriaDetalle.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAuditoriaDetalle.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesAuditoriaDetalle.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAuditoriaDetalle.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAuditoriaDetalle.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionAuditoriaDetalle.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAuditoriaDetalle.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAuditoriaDetalle.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesAuditoriaDetalle.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAuditoriaDetalle.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAuditoriaDetalle.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesAuditoriaDetalle.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAuditoriaDetalle.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAuditoriaDetalle.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarAuditoriaDetalle.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAuditoriaDetalle.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAuditoriaDetalle.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaAuditoriaDetalle.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAuditoriaDetalle.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAuditoriaDetalle.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteAuditoriaDetalle.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAuditoriaDetalle.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAuditoriaDetalle.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosAuditoriaDetalle.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAuditoriaDetalle.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAuditoriaDetalle.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosAuditoriaDetalle.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAuditoriaDetalle.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAuditoriaDetalle.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesAuditoriaDetalle = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesAuditoriaDetalle = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1AuditoriaDetalle = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2AuditoriaDetalle = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3AuditoriaDetalle = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4AuditoriaDetalle = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesAuditoriaDetalle.setLayout(gridaBagParametrosReportesAuditoriaDetalle);
			this.jPanelParametrosReportesAccionesAuditoriaDetalle.setLayout(gridaBagParametrosReportesAccionesAuditoriaDetalle);
			
			
			this.jPanelParametrosAuxiliar1AuditoriaDetalle.setLayout(gridaBagParametrosAuxiliar1AuditoriaDetalle);
			this.jPanelParametrosAuxiliar2AuditoriaDetalle.setLayout(gridaBagParametrosAuxiliar2AuditoriaDetalle);
			this.jPanelParametrosAuxiliar3AuditoriaDetalle.setLayout(gridaBagParametrosAuxiliar3AuditoriaDetalle);
			this.jPanelParametrosAuxiliar4AuditoriaDetalle.setLayout(gridaBagParametrosAuxiliar4AuditoriaDetalle);
			//this.jPanelParametrosAuxiliar5AuditoriaDetalle.setLayout(gridaBagParametrosAuxiliar2AuditoriaDetalle);			
			
			
			
			
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAuditoriaDetalle.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAuditoriaDetalle.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAuditoriaDetalle.add(this.jButtonRecargarInformacionAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			this.gridBagConstraintsAuditoriaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAuditoriaDetalle.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAuditoriaDetalle.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AuditoriaDetalle.add(this.jComboBoxTiposPaginacionAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			this.gridBagConstraintsAuditoriaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAuditoriaDetalle.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAuditoriaDetalle.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AuditoriaDetalle.add(this.jCheckBoxConAltoMaximoTablaAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			this.gridBagConstraintsAuditoriaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAuditoriaDetalle.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAuditoriaDetalle.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AuditoriaDetalle.add(this.jComboBoxTiposArchivosReportesAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			this.gridBagConstraintsAuditoriaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAuditoriaDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAuditoriaDetalle.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAuditoriaDetalle.add(this.jPanelParametrosAuxiliar1AuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			this.gridBagConstraintsAuditoriaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAuditoriaDetalle.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAuditoriaDetalle.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4AuditoriaDetalle.add(this.jComboBoxTiposReportesAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			this.gridBagConstraintsAuditoriaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAuditoriaDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAuditoriaDetalle.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAuditoriaDetalle.add(this.jPanelParametrosAuxiliar4AuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			this.gridBagConstraintsAuditoriaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAuditoriaDetalle.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsAuditoriaDetalle.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAuditoriaDetalle.add(this.jComboBoxTiposReportesAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			this.gridBagConstraintsAuditoriaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAuditoriaDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAuditoriaDetalle.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAuditoriaDetalle.add(this.jCheckBoxGenerarReporteAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			this.gridBagConstraintsAuditoriaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAuditoriaDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAuditoriaDetalle.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAuditoriaDetalle.add(this.jPanelParametrosAuxiliar2AuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAuditoriaDetalle.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAuditoriaDetalle.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAuditoriaDetalle.add(this.jLabelAccionesAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
				this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsAuditoriaDetalle.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsAuditoriaDetalle.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesAuditoriaDetalle.add(this.jButtonAbrirOrderByAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsAuditoriaDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAuditoriaDetalle.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAuditoriaDetalle.add(this.jComboBoxTiposSeleccionarAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);			
			
			
			/*
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAuditoriaDetalle.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAuditoriaDetalle.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAuditoriaDetalle.add(this.jCheckBoxSeleccionarTodosAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			this.gridBagConstraintsAuditoriaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAuditoriaDetalle.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAuditoriaDetalle.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AuditoriaDetalle.add(this.jCheckBoxSeleccionarTodosAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);															
				
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			this.gridBagConstraintsAuditoriaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAuditoriaDetalle.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAuditoriaDetalle.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AuditoriaDetalle.add(this.jCheckBoxSeleccionadosAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			this.gridBagConstraintsAuditoriaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAuditoriaDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAuditoriaDetalle.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAuditoriaDetalle.add(this.jPanelParametrosAuxiliar3AuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			this.gridBagConstraintsAuditoriaDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAuditoriaDetalle.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAuditoriaDetalle.add(this.jComboBoxTiposAccionesAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
	
				
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			this.gridBagConstraintsAuditoriaDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAuditoriaDetalle.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAuditoriaDetalle.add(this.jTextFieldValorCampoGeneralAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosAuditoriaDetalle = new GridBagLayout();

			this.jScrollPanelDatosAuditoriaDetalle.setLayout(gridaBagLayoutDatosAuditoriaDetalle);
			
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAuditoriaDetalle.gridy = 0;
			this.gridBagConstraintsAuditoriaDetalle.gridx = 0;
			
			this.jScrollPanelDatosAuditoriaDetalle.add(this.jTableDatosAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosAuditoriaDetalle.setViewportView(this.jTableDatosAuditoriaDetalle);
		this.jTableDatosAuditoriaDetalle.setFillsViewportHeight(true);
		this.jTableDatosAuditoriaDetalle.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesAuditoriaDetalle= new GridBagLayout();
		this.jPanelAccionesAuditoriaDetalle.setLayout(gridaBagLayoutAccionesAuditoriaDetalle);
		
		
		/*	
		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAuditoriaDetalle.gridy = 0;
		this.gridBagConstraintsAuditoriaDetalle.gridx = 0;
			
		this.jPanelAccionesAuditoriaDetalle.add(this.jButtonNuevoAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.setLayout(gridaBagLayoutBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle);

		gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		gridBagConstraintsAuditoriaDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoriaDetalle.gridy = 0;
		gridBagConstraintsAuditoriaDetalle.gridx = 0;
		jPanelBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.add(jLabelid_auditoriaBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle, gridBagConstraintsAuditoriaDetalle);

		gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		gridBagConstraintsAuditoriaDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoriaDetalle.gridy = 0;
		gridBagConstraintsAuditoriaDetalle.gridx = 1;
		jPanelBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.add(jComboBoxid_auditoriaBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle, gridBagConstraintsAuditoriaDetalle);


		gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		gridBagConstraintsAuditoriaDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoriaDetalle.gridy = 1;
		gridBagConstraintsAuditoriaDetalle.gridx = 0;
		jPanelBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.add(jLabelnombre_campoBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle, gridBagConstraintsAuditoriaDetalle);

		gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		gridBagConstraintsAuditoriaDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoriaDetalle.gridy = 1;
		gridBagConstraintsAuditoriaDetalle.gridx = 1;
		jPanelBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.add(jTextAreanombre_campoBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle, gridBagConstraintsAuditoriaDetalle);

		gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		gridBagConstraintsAuditoriaDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoriaDetalle.gridy = 2;
		gridBagConstraintsAuditoriaDetalle.gridx =1;
		jPanelBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.add(jButtonBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle, gridBagConstraintsAuditoriaDetalle);

		jTabbedPaneBusquedasAuditoriaDetalle.addTab("1.-Por Auditoria Por Nombre Del Campo ", jPanelBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle);
		jTabbedPaneBusquedasAuditoriaDetalle.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdAuditoriaAuditoriaDetalle= new GridBagLayout();
		gridaBagLayoutFK_IdAuditoriaAuditoriaDetalle.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAuditoriaAuditoriaDetalle.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAuditoriaAuditoriaDetalle.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAuditoriaAuditoriaDetalle.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAuditoriaAuditoriaDetalle.setLayout(gridaBagLayoutFK_IdAuditoriaAuditoriaDetalle);

		gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		gridBagConstraintsAuditoriaDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoriaDetalle.gridy = 0;
		gridBagConstraintsAuditoriaDetalle.gridx = 0;
		jPanelFK_IdAuditoriaAuditoriaDetalle.add(jLabelid_auditoriaFK_IdAuditoriaAuditoriaDetalle, gridBagConstraintsAuditoriaDetalle);

		gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		gridBagConstraintsAuditoriaDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoriaDetalle.gridy = 0;
		gridBagConstraintsAuditoriaDetalle.gridx = 1;
		jPanelFK_IdAuditoriaAuditoriaDetalle.add(jComboBoxid_auditoriaFK_IdAuditoriaAuditoriaDetalle, gridBagConstraintsAuditoriaDetalle);

		gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		gridBagConstraintsAuditoriaDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAuditoriaDetalle.gridy = 1;
		gridBagConstraintsAuditoriaDetalle.gridx =1;
		jPanelFK_IdAuditoriaAuditoriaDetalle.add(jButtonFK_IdAuditoriaAuditoriaDetalle, gridBagConstraintsAuditoriaDetalle);

		jTabbedPaneBusquedasAuditoriaDetalle.addTab("2.-Por Auditoria ", jPanelFK_IdAuditoriaAuditoriaDetalle);
		jTabbedPaneBusquedasAuditoriaDetalle.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAuditoriaDetalle = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAuditoriaDetalle);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();						
			this.gridBagConstraintsAuditoriaDetalle.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAuditoriaDetalle.gridx = 0;		
			//this.gridBagConstraintsAuditoriaDetalle.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAuditoriaDetalle.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAuditoriaDetalle.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		this.gridBagConstraintsAuditoriaDetalle.gridy = iGridyPrincipal++;
		this.gridBagConstraintsAuditoriaDetalle.gridx = 0;		
		//this.gridBagConstraintsAuditoriaDetalle.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAuditoriaDetalle.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsAuditoriaDetalle.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsAuditoriaDetalle);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsAuditoriaDetalle.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAuditoriaDetalle.gridx = 0;		
			this.gridBagConstraintsAuditoriaDetalle.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAuditoriaDetalle.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsAuditoriaDetalle.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		this.gridBagConstraintsAuditoriaDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAuditoriaDetalle.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);								
		
		
		/*
		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		this.gridBagConstraintsAuditoriaDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAuditoriaDetalle.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
		*/		
		
		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		this.gridBagConstraintsAuditoriaDetalle.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAuditoriaDetalle.gridx =0;
		this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAuditoriaDetalle.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
				
		
		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		this.gridBagConstraintsAuditoriaDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAuditoriaDetalle.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(AuditoriaDetalleJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosAuditoriaDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAuditoriaDetalle = new GridBagLayout();
			this.jPanelBusquedasParametrosAuditoriaDetalle.setLayout(gridaBagLayoutBusquedasParametrosAuditoriaDetalle);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralAuditoriaDetalle=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAuditoriaDetalle.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAuditoriaDetalle.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAuditoriaDetalle.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		this.gridBagConstraintsAuditoriaDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAuditoriaDetalle.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
			
			
		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		this.gridBagConstraintsAuditoriaDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAuditoriaDetalle.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
		
			
		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		this.gridBagConstraintsAuditoriaDetalle.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAuditoriaDetalle.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralAuditoriaDetalle;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoAuditoriaDetalle() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoAuditoriaDetalle = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoAuditoriaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoAuditoriaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoAuditoriaDetalle.setName("jPanelReporteDinamicoAuditoriaDetalle"); 
		
		this.jPanelReporteDinamicoAuditoriaDetalle.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAuditoriaDetalle.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAuditoriaDetalle.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoAuditoriaDetalle.setLayout(gridaBagLayoutReporteDinamicoAuditoriaDetalle);
		
		
		this.jInternalFrameReporteDinamicoAuditoriaDetalle= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoAuditoriaDetalle = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAuditoriaDetalle= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoAuditoriaDetalle.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoAuditoriaDetalle.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoAuditoriaDetalle.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoAuditoriaDetalle.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoAuditoriaDetalle.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoAuditoriaDetalle.setResizable(true);
	    this.jInternalFrameReporteDinamicoAuditoriaDetalle.setClosable(true);
	    this.jInternalFrameReporteDinamicoAuditoriaDetalle.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoAuditoriaDetalle.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAuditoriaDetalle.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAuditoriaDetalle.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoAuditoriaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Auditoria Detalles"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteAuditoriaDetalle = new JLabelMe();

		this.jLabelColumnasSelectReporteAuditoriaDetalle.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteAuditoriaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAuditoriaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAuditoriaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAuditoriaDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAuditoriaDetalle.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAuditoriaDetalle.add(this.jLabelColumnasSelectReporteAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteAuditoriaDetalle = new JList<Reporte>();
		this.jListColumnasSelectReporteAuditoriaDetalle.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteAuditoriaDetalle.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteAuditoriaDetalle.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAuditoriaDetalle.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAuditoriaDetalle.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteAuditoriaDetalle=new JScrollPane(this.jListColumnasSelectReporteAuditoriaDetalle);
			
			this.jScrollColumnasSelectReporteAuditoriaDetalle.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAuditoriaDetalle.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAuditoriaDetalle.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteAuditoriaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAuditoriaDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAuditoriaDetalle.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoAuditoriaDetalle.add(this.jListColumnasSelectReporteAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
		this.jPanelReporteDinamicoAuditoriaDetalle.add(this.jScrollColumnasSelectReporteAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteAuditoriaDetalle = new JLabelMe();

		this.jLabelRelacionesSelectReporteAuditoriaDetalle.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteAuditoriaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAuditoriaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAuditoriaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteAuditoriaDetalle = new JList<Reporte>();
		this.jListRelacionesSelectReporteAuditoriaDetalle.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteAuditoriaDetalle.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteAuditoriaDetalle.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAuditoriaDetalle.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAuditoriaDetalle.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteAuditoriaDetalle=new JScrollPane(this.jListRelacionesSelectReporteAuditoriaDetalle);
			
			this.jScrollRelacionesSelectReporteAuditoriaDetalle.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAuditoriaDetalle.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAuditoriaDetalle.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteAuditoriaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoAuditoriaDetalle = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoAuditoriaDetalle = new JComboBoxMe();
		this.jListColumnasValoresGraficoAuditoriaDetalle = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoAuditoriaDetalle = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoAuditoriaDetalle.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoAuditoriaDetalle.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAuditoriaDetalle.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAuditoriaDetalle.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoAuditoriaDetalle = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoAuditoriaDetalle.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoAuditoriaDetalle.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAuditoriaDetalle.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAuditoriaDetalle.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoAuditoriaDetalle = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoAuditoriaDetalle.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoAuditoriaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAuditoriaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAuditoriaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAuditoriaDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAuditoriaDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAuditoriaDetalle.add(this.jLabelGenerarExcelReporteDinamicoAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoAuditoriaDetalle = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoAuditoriaDetalle.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoAuditoriaDetalle,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoAuditoriaDetalle.setToolTipText("Generar EXCEL"+" "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		//this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsAuditoriaDetalle.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsAuditoriaDetalle.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoAuditoriaDetalle.add(this.jButtonGenerarExcelReporteDinamicoAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAuditoriaDetalle.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAuditoriaDetalle.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAuditoriaDetalle.add(this.jComboBoxTiposReportesDinamicoAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoAuditoriaDetalle = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoAuditoriaDetalle.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoAuditoriaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAuditoriaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAuditoriaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAuditoriaDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAuditoriaDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAuditoriaDetalle.add(this.jLabelTiposArchivoReporteDinamicoAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAuditoriaDetalle.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAuditoriaDetalle.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAuditoriaDetalle.add(this.jComboBoxTiposArchivosReportesDinamicoAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoAuditoriaDetalle = new JButtonMe();
		this.jButtonGenerarReporteDinamicoAuditoriaDetalle.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoAuditoriaDetalle,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoAuditoriaDetalle.setToolTipText("Generar"+" "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAuditoriaDetalle.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAuditoriaDetalle.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAuditoriaDetalle.add(this.jButtonGenerarReporteDinamicoAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoAuditoriaDetalle = new JButtonMe();
		this.jButtonCerrarReporteDinamicoAuditoriaDetalle.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoAuditoriaDetalle,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoAuditoriaDetalle.setToolTipText("Cancelar"+" "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAuditoriaDetalle.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAuditoriaDetalle.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAuditoriaDetalle.add(this.jButtonCerrarReporteDinamicoAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalAuditoriaDetalle = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoAuditoriaDetalle= new JScrollPane(jPanelReporteDinamicoAuditoriaDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoAuditoriaDetalle.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAuditoriaDetalle.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAuditoriaDetalle.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoAuditoriaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Auditoria Detalles"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		this.gridBagConstraintsAuditoriaDetalle.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsAuditoriaDetalle.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoAuditoriaDetalle.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoAuditoriaDetalle.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalAuditoriaDetalle);
		this.jInternalFrameReporteDinamicoAuditoriaDetalle.getContentPane().add(this.jScrollPanelReporteDinamicoAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionAuditoriaDetalle() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionAuditoriaDetalle = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionAuditoriaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionAuditoriaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionAuditoriaDetalle.setName("jPanelImportacionAuditoriaDetalle"); 
		
		this.jPanelImportacionAuditoriaDetalle.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAuditoriaDetalle.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAuditoriaDetalle.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionAuditoriaDetalle.setLayout(gridaBagLayoutImportacionAuditoriaDetalle);
		
		
		this.jInternalFrameImportacionAuditoriaDetalle= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionAuditoriaDetalle= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionAuditoriaDetalle = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAuditoriaDetalle= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionAuditoriaDetalle.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAuditoriaDetalle.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAuditoriaDetalle.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionAuditoriaDetalle.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAuditoriaDetalle.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAuditoriaDetalle.setResizable(true);
	    this.jInternalFrameImportacionAuditoriaDetalle.setClosable(true);
	    this.jInternalFrameImportacionAuditoriaDetalle.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionAuditoriaDetalle.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAuditoriaDetalle.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAuditoriaDetalle.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionAuditoriaDetalle.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAuditoriaDetalle.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAuditoriaDetalle.setResizable(true);
	    this.jInternalFrameImportacionAuditoriaDetalle.setClosable(true);
	    this.jInternalFrameImportacionAuditoriaDetalle.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionAuditoriaDetalle.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAuditoriaDetalle.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAuditoriaDetalle.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionAuditoriaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Auditoria Detalles"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionAuditoriaDetalle = new JLabelMe();

		this.jLabelArchivoImportacionAuditoriaDetalle.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionAuditoriaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAuditoriaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAuditoriaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAuditoriaDetalle.gridy = iPosYImportacion;		
		this.gridBagConstraintsAuditoriaDetalle.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAuditoriaDetalle.add(this.jLabelArchivoImportacionAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionAuditoriaDetalle = new JFileChooser();		
		this.jFileChooserImportacionAuditoriaDetalle.setToolTipText("ESCOGER ARCHIVO"+" "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionAuditoriaDetalle = new JButtonMe();
		this.jButtonAbrirImportacionAuditoriaDetalle.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionAuditoriaDetalle,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionAuditoriaDetalle.setToolTipText("Generar"+" "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAuditoriaDetalle.gridy = iPosYImportacion;
		this.gridBagConstraintsAuditoriaDetalle.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAuditoriaDetalle.add(this.jButtonAbrirImportacionAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionAuditoriaDetalle = new JLabelMe();

		this.jLabelPathArchivoImportacionAuditoriaDetalle.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionAuditoriaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAuditoriaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAuditoriaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAuditoriaDetalle.gridy = iPosYImportacion;		
		this.gridBagConstraintsAuditoriaDetalle.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAuditoriaDetalle.add(this.jLabelPathArchivoImportacionAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionAuditoriaDetalle=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionAuditoriaDetalle.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAuditoriaDetalle.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAuditoriaDetalle.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAuditoriaDetalle.gridy = iPosYImportacion;
		this.gridBagConstraintsAuditoriaDetalle.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAuditoriaDetalle.add(this.jTextFieldPathArchivoImportacionAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionAuditoriaDetalle = new JButtonMe();
		this.jButtonGenerarImportacionAuditoriaDetalle.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionAuditoriaDetalle,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionAuditoriaDetalle.setToolTipText("Generar"+" "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAuditoriaDetalle.gridy = iPosYImportacion;
		this.gridBagConstraintsAuditoriaDetalle.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAuditoriaDetalle.add(this.jButtonGenerarImportacionAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionAuditoriaDetalle = new JButtonMe();
		this.jButtonCerrarImportacionAuditoriaDetalle.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionAuditoriaDetalle,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionAuditoriaDetalle.setToolTipText("Cancelar"+" "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAuditoriaDetalle.gridy = iPosYImportacion;
		this.gridBagConstraintsAuditoriaDetalle.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAuditoriaDetalle.add(this.jButtonCerrarImportacionAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalAuditoriaDetalle = new GridBagLayout();
		
		this.jScrollPanelImportacionAuditoriaDetalle= new JScrollPane(jPanelImportacionAuditoriaDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		this.gridBagConstraintsAuditoriaDetalle.gridy =iPosYImportacion;
		this.gridBagConstraintsAuditoriaDetalle.gridx =iPosXImportacion;
		this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionAuditoriaDetalle.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionAuditoriaDetalle.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalAuditoriaDetalle);
		this.jInternalFrameImportacionAuditoriaDetalle.getContentPane().add(this.jScrollPanelImportacionAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByAuditoriaDetalle(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByAuditoriaDetalle = new JButtonMe();
			this.jButtonAbrirOrderByAuditoriaDetalle.setText("Orden");
			this.jButtonAbrirOrderByAuditoriaDetalle.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAuditoriaDetalle,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByAuditoriaDetalle";
			inputMap = this.jButtonAbrirOrderByAuditoriaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByAuditoriaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByAuditoriaDetalle"));
		
		
			GridBagLayout gridaBagLayoutOrderByAuditoriaDetalle = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByAuditoriaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByAuditoriaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByAuditoriaDetalle.setName("jPanelOrderByAuditoriaDetalle"); 
			
			this.jPanelOrderByAuditoriaDetalle.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAuditoriaDetalle.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAuditoriaDetalle.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByAuditoriaDetalle.setLayout(gridaBagLayoutOrderByAuditoriaDetalle);
			
			
			this.jTableDatosAuditoriaDetalleOrderBy = new JTableMe();        
			this.jTableDatosAuditoriaDetalleOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosAuditoriaDetalleOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosAuditoriaDetalleOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosAuditoriaDetalleOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosAuditoriaDetalleOrderBy.setViewportView(this.jTableDatosAuditoriaDetalleOrderBy);
			this.jTableDatosAuditoriaDetalleOrderBy.setFillsViewportHeight(true);
			this.jTableDatosAuditoriaDetalleOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByAuditoriaDetalle= new OrderByJInternalFrame();
			this.jInternalFrameOrderByAuditoriaDetalle= new OrderByJInternalFrame();
			this.jScrollPanelOrderByAuditoriaDetalle = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteAuditoriaDetalle= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByAuditoriaDetalle.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByAuditoriaDetalle.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByAuditoriaDetalle.setTitle("Orden");
			this.jInternalFrameOrderByAuditoriaDetalle.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByAuditoriaDetalle.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByAuditoriaDetalle.setResizable(true);
			this.jInternalFrameOrderByAuditoriaDetalle.setClosable(true);
			this.jInternalFrameOrderByAuditoriaDetalle.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByAuditoriaDetalle.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAuditoriaDetalle.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAuditoriaDetalle.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByAuditoriaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Auditoria Detalles"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			this.gridBagConstraintsAuditoriaDetalle.gridy =iPosYOrderBy++;
			this.gridBagConstraintsAuditoriaDetalle.gridx =iPosXOrderBy;
			this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsAuditoriaDetalle.ipady =150;
				
			this.jPanelOrderByAuditoriaDetalle.add(jScrollPanelDatosAuditoriaDetalleOrderBy, this.gridBagConstraintsAuditoriaDetalle);//this.jTableDatosAuditoriaDetalleTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByAuditoriaDetalle = new JButtonMe();
			this.jButtonCerrarOrderByAuditoriaDetalle.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByAuditoriaDetalle,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByAuditoriaDetalle.setToolTipText("Cancelar"+" "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAuditoriaDetalle.gridy = iPosYOrderBy++;
			this.gridBagConstraintsAuditoriaDetalle.gridx = iPosXOrderBy;
									
			this.jPanelOrderByAuditoriaDetalle.add(this.jButtonCerrarOrderByAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalAuditoriaDetalle = new GridBagLayout();
			
			this.jScrollPanelOrderByAuditoriaDetalle= new JScrollPane(jPanelOrderByAuditoriaDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			this.gridBagConstraintsAuditoriaDetalle.gridy =iPosYOrderBy;
			this.gridBagConstraintsAuditoriaDetalle.gridx =iPosXOrderBy;
			this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByAuditoriaDetalle.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByAuditoriaDetalle.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalAuditoriaDetalle);
			
			this.jInternalFrameOrderByAuditoriaDetalle.getContentPane().add(this.jScrollPanelOrderByAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);			
		
		} else {
			this.jButtonAbrirOrderByAuditoriaDetalle = new JButtonMe();
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
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.auditoriadetalleSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosAuditoriaDetalle.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosAuditoriaDetalle.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosAuditoriaDetalle.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosAuditoriaDetalle.getRowHeight();//AuditoriaDetalleConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > AuditoriaDetalleConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAuditoriaDetalle.isSelected()) {
					iHeightTable=AuditoriaDetalleConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AuditoriaDetalleConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AuditoriaDetalleConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > AuditoriaDetalleConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAuditoriaDetalle.isSelected()) {
					iHeightTable=AuditoriaDetalleConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AuditoriaDetalleConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AuditoriaDetalleConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosAuditoriaDetalle.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAuditoriaDetalle.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAuditoriaDetalle.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosAuditoriaDetalle.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAuditoriaDetalle.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAuditoriaDetalle.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByAuditoriaDetalle!=null && this.jInternalFrameOrderByAuditoriaDetalle.getjTableDatosOrderBy()!=null) {
			//if(!this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByAuditoriaDetalle.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByAuditoriaDetalle.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByAuditoriaDetalle.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByAuditoriaDetalle.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByAuditoriaDetalle.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByAuditoriaDetalle.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByAuditoriaDetalle.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosAuditoriaDetalle.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAuditoriaDetalle.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAuditoriaDetalle.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=auditoriadetalleLogic.getAuditoriaDetalles().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=auditoriadetalles.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<AuditoriaDetalle> TraerAuditoriaDetalleBeans(List<AuditoriaDetalle> auditoriadetalles,ArrayList<Classe> classes)throws Exception {
		try {
			for(AuditoriaDetalle auditoriadetalle:auditoriadetalles) {
					
				if(!(AuditoriaDetalleConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || AuditoriaDetalleConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					auditoriadetalle.setsDetalleGeneralEntityReporte(AuditoriaDetalleConstantesFunciones.getAuditoriaDetalleDescripcion(auditoriadetalle));
										
						
					
						
					
				} else  {
							
					//auditoriadetalle.setsDetalleGeneralEntityReporte(auditoriadetalle.getsDetalleGeneralEntityReporte());
										
				}
				
				//auditoriadetallebeans.add(auditoriadetallebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return auditoriadetalles;
    }
	//PARA REPORTES FIN
}
