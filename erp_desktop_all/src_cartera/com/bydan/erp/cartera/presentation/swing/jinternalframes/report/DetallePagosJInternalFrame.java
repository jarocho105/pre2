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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.report.*;
import com.bydan.erp.cartera.util.report.DetallePagosConstantesFunciones;

import com.bydan.erp.cartera.business.logic.report.*;
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
public class DetallePagosJInternalFrame extends DetallePagosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetallePagos;
	
	protected JMenuBar jmenuBarDetallePagos;
	
	protected JMenu jmenuDetallePagos;
	protected JMenu jmenuDatosDetallePagos;
	protected JMenu jmenuArchivoDetallePagos;
	protected JMenu jmenuAccionesDetallePagos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetallePagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetallePagos;	
	protected GridBagConstraints gridBagConstraintsDetallePagos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetallePagosDetalleFormJInternalFrame jInternalFrameDetalleFormDetallePagos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetallePagos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetallePagos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected GrupoClienteBeanSwingJInternalFrame grupoclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupocliente="";

	protected ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_zona="";
	
	public DetallePagosSessionBean detallepagosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public GrupoClienteSessionBean grupoclienteSessionBean;
	public ZonaSessionBean zonaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetallePagos> detallepagoss;		
	public List<DetallePagos> detallepagossEliminados;	
	public List<DetallePagos> detallepagossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetallePagos;		
	protected JButton jButtonAbrirOrderByDetallePagos;
	
	
	//protected JPanel jPanelOrderByDetallePagos;
	//public JScrollPane jScrollPanelOrderByDetallePagos;	
	//protected JButton jButtonCerrarOrderByDetallePagos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetallePagosLogic detallepagosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetallePagos;
	public JScrollPane jScrollPanelDatosEdicionDetallePagos;
	public JScrollPane jScrollPanelDatosGeneralDetallePagos;
    
	
	
	//public JScrollPane jScrollPanelDatosDetallePagosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetallePagos;
	//public JScrollPane jScrollPanelImportacionDetallePagos;
	
	
	
	protected JPanel jPanelAccionesDetallePagos;
	
    protected JPanel jPanelPaginacionDetallePagos;
    protected JPanel jPanelParametrosReportesDetallePagos;
	protected JPanel jPanelParametrosReportesAccionesDetallePagos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetallePagos;
	protected JPanel jPanelParametrosAuxiliar2DetallePagos;
	protected JPanel jPanelParametrosAuxiliar3DetallePagos;
	protected JPanel jPanelParametrosAuxiliar4DetallePagos;
	//protected JPanel jPanelParametrosAuxiliar5DetallePagos;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetallePagos;
	//protected JPanel jPanelImportacionDetallePagos;
	
	
	public JTable jTableDatosDetallePagos;
	
	
	
	//public JTable jTableDatosDetallePagosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetallePagos;
	protected JButton jButtonDuplicarDetallePagos;
	protected JButton jButtonCopiarDetallePagos;
	protected JButton jButtonVerFormDetallePagos;
	protected JButton jButtonNuevoRelacionesDetallePagos;
	protected JButton jButtonModificarDetallePagos;
	
    protected JButton jButtonGuardarCambiosTablaDetallePagos;
	protected JButton jButtonCerrarDetallePagos;
	
	
	protected JButton jButtonRecargarInformacionDetallePagos;
	protected JButton jButtonProcesarInformacionDetallePagos;
	
	
	protected JButton jButtonAnterioresDetallePagos;
	protected JButton jButtonSiguientesDetallePagos;
	protected JButton jButtonNuevoGuardarCambiosDetallePagos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetallePagos;
	//protected JButton jButtonCerrarReporteDinamicoDetallePagos;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetallePagos;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetallePagos;
	//protected JButton jButtonGenerarImportacionDetallePagos;
	//protected JButton jButtonCerrarImportacionDetallePagos;
	//protected JFileChooser jFileChooserImportacionDetallePagos;
	//protected File fileImportacionDetallePagos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetallePagos;
	protected JButton jButtonDuplicarToolBarDetallePagos;
	protected JButton jButtonNuevoRelacionesToolBarDetallePagos;
	
	
	public JButton jButtonGuardarCambiosToolBarDetallePagos;
	protected JButton jButtonCopiarToolBarDetallePagos;
	protected JButton jButtonVerFormToolBarDetallePagos;
	public JButton jButtonGuardarCambiosTablaToolBarDetallePagos;
	protected JButton jButtonMostrarOcultarTablaToolBarDetallePagos;
	protected JButton jButtonCerrarToolBarDetallePagos;
	
	protected JButton jButtonRecargarInformacionToolBarDetallePagos;
	protected JButton jButtonProcesarInformacionToolBarDetallePagos;
	protected JButton jButtonAnterioresToolBarDetallePagos;
	protected JButton jButtonSiguientesToolBarDetallePagos;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetallePagos;
	protected JButton jButtonAbrirOrderByToolBarDetallePagos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetallePagos;
	protected JMenuItem jMenuItemDuplicarDetallePagos;
	protected JMenuItem jMenuItemNuevoRelacionesDetallePagos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetallePagos;
	protected JMenuItem jMenuItemCopiarDetallePagos;
	protected JMenuItem jMenuItemVerFormDetallePagos;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetallePagos;
	protected JMenuItem jMenuItemCerrarDetallePagos;
	protected JMenuItem jMenuItemDetalleCerrarDetallePagos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetallePagos;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetallePagos;
	
	protected JMenuItem jMenuItemRecargarInformacionDetallePagos;
	protected JMenuItem jMenuItemProcesarInformacionDetallePagos;
	protected JMenuItem jMenuItemAnterioresDetallePagos;
	protected JMenuItem jMenuItemSiguientesDetallePagos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetallePagos;
	protected JMenuItem jMenuItemAbrirOrderByDetallePagos;
	protected JMenuItem jMenuItemMostrarOcultarDetallePagos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetallePagos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetallePagos;
	protected JCheckBox jCheckBoxSeleccionadosDetallePagos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetallePagos;
	protected JCheckBox jCheckBoxConGraficoReporteDetallePagos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetallePagos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetallePagos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetallePagos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetallePagos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetallePagos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetallePagos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetallePagos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetallePagos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetallePagos;
	protected JTextField jTextFieldValorCampoGeneralDetallePagos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetallePagos;
	//public JList<Reporte> jListColumnasSelectReporteDetallePagos;
	//public JScrollPane jScrollColumnasSelectReporteDetallePagos;
	
	//public JLabel jLabelRelacionesSelectReporteDetallePagos;
	//public JList<Reporte> jListRelacionesSelectReporteDetallePagos;
	//public JScrollPane jScrollRelacionesSelectReporteDetallePagos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetallePagos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetallePagos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetallePagos;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetallePagos;
	
		
	//public JLabel jLabelArchivoImportacionDetallePagos;	
	//public JLabel jLabelPathArchivoImportacionDetallePagos;
	//protected JTextField jTextFieldPathArchivoImportacionDetallePagos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetallePagos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetallePagos;
	
	//public JLabel jLabelColumnaCategoriaValorDetallePagos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetallePagos;
	
	//public JLabel jLabelColumnasValoresGraficoDetallePagos;
	//public JList<Reporte> jListColumnasValoresGraficoDetallePagos;
	//public JScrollPane jScrollColumnasValoresGraficoDetallePagos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetallePagos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetallePagos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetallePagos;
	public JPanel jPanelBusquedaDetallePagosDetallePagos;
	public JButton jButtonBusquedaDetallePagosDetallePagos;
	
	public JPanel jPanelid_grupo_clienteBusquedaDetallePagosDetallePagos;
	public JLabel jLabelid_grupo_clienteBusquedaDetallePagosDetallePagos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_clienteBusquedaDetallePagosDetallePagos;
	public JButton jButtonid_grupo_clienteBusquedaDetallePagosDetallePagos= new JButtonMe();
	public JButton jButtonid_grupo_clienteBusquedaDetallePagosDetallePagosUpdate= new JButtonMe();
	public JButton jButtonid_grupo_clienteBusquedaDetallePagosDetallePagosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_zonaBusquedaDetallePagosDetallePagos;
	public JLabel jLabelid_zonaBusquedaDetallePagosDetallePagos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_zonaBusquedaDetallePagosDetallePagos;
	public JButton jButtonid_zonaBusquedaDetallePagosDetallePagos= new JButtonMe();
	public JButton jButtonid_zonaBusquedaDetallePagosDetallePagosUpdate= new JButtonMe();
	public JButton jButtonid_zonaBusquedaDetallePagosDetallePagosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_desdeBusquedaDetallePagosDetallePagos;
	public JLabel jLabelfecha_emision_desdeBusquedaDetallePagosDetallePagos;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBusquedaDetallePagosDetallePagos;

	public JDateChooser jDateChooserfecha_emision_desdeBusquedaDetallePagosDetallePagos;
	public JButton jButtonfecha_emision_desdeBusquedaDetallePagosDetallePagosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaDetallePagosDetallePagos;
	public JLabel jLabelfecha_emision_hastaBusquedaDetallePagosDetallePagos;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaDetallePagosDetallePagos;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaDetallePagosDetallePagos;
	public JButton jButtonfecha_emision_hastaBusquedaDetallePagosDetallePagosBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
	//public int iHeightFormulario=528;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetallePagosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetallePagos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePagosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallePagos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePagosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallePagos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePagosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetallePagos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetallePagos)	{
		this.jButtonRecargarInformacionDetallePagos = jButtonRecargarInformacionDetallePagos;
	}
	
	public JButton getjButtonProcesarInformacionDetallePagos() {
		return this.jButtonProcesarInformacionDetallePagos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetallePagos)	{
		this.jButtonProcesarInformacionDetallePagos = jButtonProcesarInformacionDetallePagos;
	}
	
	
	public JButton getjButtonRecargarInformacionDetallePagos() {
		return this.jButtonRecargarInformacionDetallePagos;
	}
	
	
	public List<DetallePagos> getdetallepagoss() {
		return this.detallepagoss;
	}

	public void setdetallepagoss(List<DetallePagos> detallepagoss) {
		this.detallepagoss = detallepagoss;
	}
	
	public List<DetallePagos> getdetallepagossAux() {
		return this.detallepagossAux;
	}

	public void setdetallepagossAux(List<DetallePagos> detallepagossAux) {
		this.detallepagossAux = detallepagossAux;
	}
	
	public List<DetallePagos> getdetallepagossEliminados() {
		return this.detallepagossEliminados;
	}

	public void setDetallePagossEliminados(List<DetallePagos> detallepagossEliminados) {
		this.detallepagossEliminados = detallepagossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetallePagos() {
		return jComboBoxTiposSeleccionarDetallePagos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetallePagos(
			JComboBox jComboBoxTiposSeleccionarDetallePagos) {
		this.jComboBoxTiposSeleccionarDetallePagos = jComboBoxTiposSeleccionarDetallePagos;
	}
	
	public void setBorderResaltarTiposSeleccionarDetallePagos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetallePagos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetallePagos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetallePagos() {
		return jTextFieldValorCampoGeneralDetallePagos;
	}

	public void setjTextFieldValorCampoGeneralDetallePagos(
			JTextField jTextFieldValorCampoGeneralDetallePagos) {
		this.jTextFieldValorCampoGeneralDetallePagos = jTextFieldValorCampoGeneralDetallePagos;
	}

	public void setBorderResaltarValorCampoGeneralDetallePagos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePagos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetallePagos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetallePagos() {
		return this.jCheckBoxSeleccionarTodosDetallePagos;
	}

	public void setjCheckBoxSeleccionarTodosDetallePagos(
			JCheckBox jCheckBoxSeleccionarTodosDetallePagos) {
		this.jCheckBoxSeleccionarTodosDetallePagos = jCheckBoxSeleccionarTodosDetallePagos;
	}

	public void setBorderResaltarSeleccionarTodosDetallePagos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePagos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetallePagos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetallePagos() {
		return this.jCheckBoxSeleccionadosDetallePagos;
	}

	public void setjCheckBoxSeleccionadosDetallePagos(
			JCheckBox jCheckBoxSeleccionadosDetallePagos) {
		this.jCheckBoxSeleccionadosDetallePagos = jCheckBoxSeleccionadosDetallePagos;
	}
	
	public void setBorderResaltarSeleccionadosDetallePagos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePagos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetallePagos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetallePagos() {
		return this.jComboBoxTiposArchivosReportesDetallePagos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetallePagos(
			JComboBox jComboBoxTiposArchivosReportesDetallePagos) {
		this.jComboBoxTiposArchivosReportesDetallePagos = jComboBoxTiposArchivosReportesDetallePagos;
	}

	public void setBorderResaltarTiposArchivosReportesDetallePagos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePagos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetallePagos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetallePagos() {
		return this.jComboBoxTiposReportesDetallePagos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetallePagos(
			JComboBox jComboBoxTiposReportesDetallePagos) {
		this.jComboBoxTiposReportesDetallePagos = jComboBoxTiposReportesDetallePagos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetallePagos() {
	//	return jComboBoxTiposReportesDinamicoDetallePagos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetallePagos(
	//		JComboBox jComboBoxTiposReportesDinamicoDetallePagos) {
	//	this.jComboBoxTiposReportesDinamicoDetallePagos = jComboBoxTiposReportesDinamicoDetallePagos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetallePagos() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetallePagos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetallePagos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetallePagos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetallePagos = jComboBoxTiposArchivosReportesDinamicoDetallePagos;
	//}
	
	public void setBorderResaltarTiposReportesDetallePagos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePagos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetallePagos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetallePagos() {
		return this.jComboBoxTiposGraficosReportesDetallePagos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetallePagos(
			JComboBox jComboBoxTiposGraficosReportesDetallePagos) {
		this.jComboBoxTiposGraficosReportesDetallePagos = jComboBoxTiposGraficosReportesDetallePagos;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetallePagos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePagos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetallePagos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetallePagos() {
		return this.jComboBoxTiposPaginacionDetallePagos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetallePagos(
			JComboBox jComboBoxTiposPaginacionDetallePagos) {
		this.jComboBoxTiposPaginacionDetallePagos = jComboBoxTiposPaginacionDetallePagos;
	}
	
	public void setBorderResaltarTiposPaginacionDetallePagos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePagos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetallePagos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetallePagos() {
		return this.jComboBoxTiposRelacionesDetallePagos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetallePagos() {
		return this.jComboBoxTiposAccionesDetallePagos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetallePagos(
			JComboBox jComboBoxTiposRelacionesDetallePagos) {
		this.jComboBoxTiposRelacionesDetallePagos = jComboBoxTiposRelacionesDetallePagos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetallePagos(
			JComboBox jComboBoxTiposAccionesDetallePagos) {
		this.jComboBoxTiposAccionesDetallePagos = jComboBoxTiposAccionesDetallePagos;
	}
	
	public void setBorderResaltarTiposRelacionesDetallePagos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePagos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetallePagos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetallePagos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePagos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetallePagos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetallePagos() {
	//	return jCheckBoxConGraficoDinamicoDetallePagos;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetallePagos(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetallePagos) {
	//	this.jCheckBoxConGraficoDinamicoDetallePagos = jCheckBoxConGraficoDinamicoDetallePagos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetallePagos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetallePagos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetallePagos .setBorder(borderResaltar);		
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
		this.detallepagosSessionBean=new DetallePagosSessionBean();
		
		this.detallepagosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallepagosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallepagosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetallePagosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetallePagosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetallePagosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetallePagosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetallePagosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Pagos MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detallepagosSessionBean.getEsGuardarRelacionado()) {
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
		
		DetallePagosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetallePagos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePagos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetallePagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetallePagos,this.jTtoolBarDetallePagos,
							"nuevo","nuevo","Nuevo"+" "+DetallePagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetallePagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetallePagos,this.jTtoolBarDetallePagos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetallePagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetallePagos,this.jTtoolBarDetallePagos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetallePagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetallePagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetallePagos,this.jTtoolBarDetallePagos,
							"duplicar","duplicar","Duplicar"+" "+DetallePagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetallePagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetallePagos,this.jTtoolBarDetallePagos,
							"copiar","copiar","Copiar"+" "+DetallePagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetallePagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetallePagos,this.jTtoolBarDetallePagos,
							"ver_form","ver_form","Ver"+" "+DetallePagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetallePagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetallePagos,this.jTtoolBarDetallePagos,
							"recargar","recargar","Buscar"+" "+DetallePagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarDetallePagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetallePagos,this.jTtoolBarDetallePagos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetallePagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetallePagos,this.jTtoolBarDetallePagos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetallePagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetallePagos,this.jTtoolBarDetallePagos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetallePagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetallePagos,this.jTtoolBarDetallePagos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetallePagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetallePagos,this.jTtoolBarDetallePagos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetallePagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetallePagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetallePagos,this.jTtoolBarDetallePagos,
							"cerrar","cerrar","Salir"+" "+DetallePagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetallePagos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetallePagos;
			
				this.jButtonProcesarInformacionToolBarDetallePagos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetallePagos;
				
		//protected JButton jButtonModificarToolBarDetallePagos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetallePagos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetallePagos=new JMenuMe("General");
		this.jmenuArchivoDetallePagos=new JMenuMe("Archivo");
		this.jmenuAccionesDetallePagos=new JMenuMe("Acciones");
		this.jmenuDatosDetallePagos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetallePagos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetallePagos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetallePagos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetallePagos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetallePagos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetallePagos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetallePagos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetallePagos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetallePagos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetallePagos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetallePagos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetallePagos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetallePagos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetallePagos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetallePagos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetallePagos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetallePagos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetallePagos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetallePagos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetallePagos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetallePagos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetallePagos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetallePagos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetallePagos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetallePagos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetallePagos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetallePagos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetallePagos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetallePagos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetallePagos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetallePagos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetallePagos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetallePagos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetallePagos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetallePagos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetallePagos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetallePagos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetallePagos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetallePagos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetallePagos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetallePagos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetallePagos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetallePagos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetallePagos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetallePagos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetallePagos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetallePagos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetallePagos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetallePagos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetallePagos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetallePagos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetallePagos.add(this.jMenuItemCerrarDetallePagos);
			
			this.jmenuAccionesDetallePagos.add(this.jMenuItemNuevoDetallePagos);
			this.jmenuAccionesDetallePagos.add(this.jMenuItemNuevoGuardarCambiosDetallePagos);
			this.jmenuAccionesDetallePagos.add(this.jMenuItemNuevoRelacionesDetallePagos);
			this.jmenuAccionesDetallePagos.add(this.jMenuItemGuardarCambiosTablaDetallePagos);		
			this.jmenuAccionesDetallePagos.add(this.jMenuItemDuplicarDetallePagos);		
			this.jmenuAccionesDetallePagos.add(this.jMenuItemCopiarDetallePagos);		
			this.jmenuAccionesDetallePagos.add(this.jMenuItemVerFormDetallePagos);		
			
			this.jmenuDatosDetallePagos.add(this.jMenuItemRecargarInformacionDetallePagos);				
			this.jmenuDatosDetallePagos.add(this.jMenuItemAnterioresDetallePagos);				
			this.jmenuDatosDetallePagos.add(this.jMenuItemSiguientesDetallePagos);				
			this.jmenuDatosDetallePagos.add(this.jMenuItemAbrirOrderByDetallePagos);				
			this.jmenuDatosDetallePagos.add(this.jMenuItemMostrarOcultarDetallePagos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetallePagos.add(this.jMenuItemGuardarCambiosDetallePagos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetallePagos.add(this.jmenuArchivoDetallePagos);		
			this.jmenuBarDetallePagos.add(this.jmenuAccionesDetallePagos);		
			this.jmenuBarDetallePagos.add(this.jmenuDatosDetallePagos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetallePagos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetallePagos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaDetallePagosDetallePagos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaDetallePagosDetallePagos.setToolTipText("Buscar Por Grupo Cliente Por Zona Por Fecha Emision Desde Por Fecha Emision Hasta ");
		this.jButtonBusquedaDetallePagosDetallePagos= new JButtonMe();
		this.jButtonBusquedaDetallePagosDetallePagos.setText("Buscar");
		this.jButtonBusquedaDetallePagosDetallePagos.setToolTipText("Buscar Por Grupo Cliente Por Zona Por Fecha Emision Desde Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaDetallePagosDetallePagos,"buscar_button","Buscar Por Grupo Cliente Por Zona Por Fecha Emision Desde Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaDetallePagosDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_grupo_clienteBusquedaDetallePagosDetallePagos = new JLabelMe();
		jLabelid_grupo_clienteBusquedaDetallePagosDetallePagos.setText("Grupo Cliente :");
		jLabelid_grupo_clienteBusquedaDetallePagosDetallePagos.setToolTipText("Grupo Cliente");
		jLabelid_grupo_clienteBusquedaDetallePagosDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_clienteBusquedaDetallePagosDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_clienteBusquedaDetallePagosDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_clienteBusquedaDetallePagosDetallePagos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_grupo_clienteBusquedaDetallePagosDetallePagos= new JComboBoxMe();
		jComboBoxid_grupo_clienteBusquedaDetallePagosDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteBusquedaDetallePagosDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteBusquedaDetallePagosDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_clienteBusquedaDetallePagosDetallePagos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_zonaBusquedaDetallePagosDetallePagos = new JLabelMe();
		jLabelid_zonaBusquedaDetallePagosDetallePagos.setText("Zona :");
		jLabelid_zonaBusquedaDetallePagosDetallePagos.setToolTipText("Zona");
		jLabelid_zonaBusquedaDetallePagosDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_zonaBusquedaDetallePagosDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_zonaBusquedaDetallePagosDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_zonaBusquedaDetallePagosDetallePagos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_zonaBusquedaDetallePagosDetallePagos= new JComboBoxMe();
		jComboBoxid_zonaBusquedaDetallePagosDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaBusquedaDetallePagosDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaBusquedaDetallePagosDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_zonaBusquedaDetallePagosDetallePagos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_emision_desdeBusquedaDetallePagosDetallePagos = new JLabelMe();
		jLabelfecha_emision_desdeBusquedaDetallePagosDetallePagos.setText("Fecha Emision Desde :");
		jLabelfecha_emision_desdeBusquedaDetallePagosDetallePagos.setToolTipText("Fecha Emision Desde");
		jLabelfecha_emision_desdeBusquedaDetallePagosDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaDetallePagosDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaDetallePagosDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBusquedaDetallePagosDetallePagos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_desdeBusquedaDetallePagosDetallePagos= new JDateChooser();
		jDateChooserfecha_emision_desdeBusquedaDetallePagosDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaDetallePagosDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaDetallePagosDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBusquedaDetallePagosDetallePagos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_desdeBusquedaDetallePagosDetallePagos.setDate(new Date());
		jDateChooserfecha_emision_desdeBusquedaDetallePagosDetallePagos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_desdeBusquedaDetallePagosDetallePagos.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaDetallePagosDetallePagos = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaDetallePagosDetallePagos.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaDetallePagosDetallePagos.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaDetallePagosDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaDetallePagosDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaDetallePagosDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaDetallePagosDetallePagos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaDetallePagosDetallePagos= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaDetallePagosDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaDetallePagosDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaDetallePagosDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaDetallePagosDetallePagos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaDetallePagosDetallePagos.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaDetallePagosDetallePagos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaDetallePagosDetallePagos.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasDetallePagos=new JTabbedPane();


		this.jTabbedPaneBusquedasDetallePagos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasDetallePagos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasDetallePagos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));

		//this.jTabbedPaneBusquedasDetallePagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetallePagos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetallePagos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetallePagos = new DetallePagosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Pagos DATOS");
			this.jInternalFrameDetalleFormDetallePagos = new DetallePagosDetalleFormJInternalFrame(jDesktopPane,this.detallepagosSessionBean.getConGuardarRelaciones(),this.detallepagosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetallePagos = null;//new DetallePagosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetallePagos= new GridBagLayout();
		
		
		this.jTableDatosDetallePagos = new JTableMe();      
		
		String sToolTipDetallePagos="";
		sToolTipDetallePagos=DetallePagosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetallePagos+="(Cartera.DetallePagos)";
		}
		
		if(!this.detallepagosSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetallePagos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetallePagos.setToolTipText(sToolTipDetallePagos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetallePagos);
		this.jTableDatosDetallePagos.setAutoCreateRowSorter(true);
		this.jTableDatosDetallePagos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetallePagos.setRowSelectionAllowed(true);
		this.jTableDatosDetallePagos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetallePagos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetallePagos = new JButtonMe();
		this.jButtonDuplicarDetallePagos = new JButtonMe();
		this.jButtonCopiarDetallePagos = new JButtonMe();
		this.jButtonVerFormDetallePagos = new JButtonMe();
		this.jButtonNuevoRelacionesDetallePagos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetallePagos = new JButtonMe();
		this.jButtonCerrarDetallePagos = new JButtonMe();
		
		this.jScrollPanelDatosDetallePagos = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetallePagos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetallePagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Pagos";
		
		if(!this.detallepagosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetallePagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pagoses" + this.sPath));
		} else {
			this.jScrollPanelDatosDetallePagos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetallePagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetallePagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetallePagos.setToolTipText("Acciones");
        this.jPanelAccionesDetallePagos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetallePagos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetallePagos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetallePagos=new ReporteDinamicoJInternalFrame(DetallePagosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetallePagos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetallePagos=new ImportacionJInternalFrame(DetallePagosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetallePagos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetallePagos = new JButtonMe();
		
		this.jButtonAbrirOrderByDetallePagos.setText("Orden");
		this.jButtonAbrirOrderByDetallePagos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetallePagos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetallePagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetallePagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetallePagos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetallePagos,false,this);
			
			//this.cargarOrderByDetallePagos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetallePagos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetallePagos,true,this);
			
			//this.cargarOrderByDetallePagos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetallePagos.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosDetallePagos.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosDetallePagos.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosDetallePagos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetallePagos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetallePagos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetallePagos.setText("Nuevo");
		this.jButtonDuplicarDetallePagos.setText("Duplicar");
		this.jButtonCopiarDetallePagos.setText("Copiar");
		this.jButtonVerFormDetallePagos.setText("Ver");
		this.jButtonNuevoRelacionesDetallePagos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetallePagos.setText("Guardar");
		this.jButtonCerrarDetallePagos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetallePagos,"nuevo_button","Nuevo",this.detallepagosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetallePagos,"duplicar_button","Duplicar",this.detallepagosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetallePagos,"copiar_button","Copiar",this.detallepagosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetallePagos,"ver_form","Ver",this.detallepagosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetallePagos,"nuevorelaciones_button","Nuevo Rel",this.detallepagosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetallePagos,"guardarcambiostabla_button","Guardar",this.detallepagosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetallePagos,"cerrar_button","Salir",this.detallepagosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetallePagos.setToolTipText("Nuevo"+" "+DetallePagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetallePagos.setToolTipText("Duplicar"+" "+DetallePagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetallePagos.setToolTipText("Copiar"+" "+DetallePagosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetallePagos.setToolTipText("Ver"+" "+DetallePagosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetallePagos.setToolTipText("Nuevo Rel"+" "+DetallePagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetallePagos.setToolTipText("Guardar"+" "+DetallePagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetallePagos.setToolTipText("Salir"+" "+DetallePagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetallePagos";
		inputMap = this.jButtonNuevoDetallePagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetallePagos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetallePagos"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetallePagos";
		inputMap = this.jButtonDuplicarDetallePagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetallePagos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetallePagos"));
		
		//COPIAR
		sMapKey = "CopiarDetallePagos";
		inputMap = this.jButtonCopiarDetallePagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetallePagos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetallePagos"));
		
		//VEr FORM
		sMapKey = "VerFormDetallePagos";
		inputMap = this.jButtonVerFormDetallePagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetallePagos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetallePagos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetallePagos";
		inputMap = this.jButtonNuevoRelacionesDetallePagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetallePagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetallePagos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetallePagos";
		inputMap = this.jButtonModificarDetallePagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetallePagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetallePagos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetallePagos";
		inputMap = this.jButtonCerrarDetallePagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetallePagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetallePagos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetallePagos";
		inputMap = this.jButtonGuardarCambiosTablaDetallePagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetallePagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetallePagos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetallePagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetallePagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetallePagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetallePagos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetallePagos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetallePagos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetallePagos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetallePagos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetallePagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetallePagos.setName("jPanelParametrosReportesDetallePagos"); 
		
		this.jPanelParametrosReportesAccionesDetallePagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetallePagos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetallePagos.setName("jPanelParametrosReportesAccionesDetallePagos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetallePagos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetallePagos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetallePagos = new JButtonMe();
		this.jButtonRecargarInformacionDetallePagos.setText("Buscar");
		this.jButtonRecargarInformacionDetallePagos.setToolTipText("Buscar"+" "+DetallePagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetallePagos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionDetallePagos.setVisible(false);
		
		
		this.jButtonProcesarInformacionDetallePagos = new JButtonMe();
		this.jButtonProcesarInformacionDetallePagos.setText("Procesar");
		this.jButtonProcesarInformacionDetallePagos.setToolTipText("Procesar"+" "+DetallePagosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetallePagos.setVisible(false);
			
		this.jButtonProcesarInformacionDetallePagos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetallePagos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetallePagos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetallePagos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetallePagos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetallePagos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetallePagos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetallePagos.setText("TIPO");       
		this.jComboBoxTiposReportesDetallePagos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetallePagos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetallePagos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetallePagos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetallePagos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetallePagos.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetallePagos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetallePagos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetallePagos.setText("Accion");
		this.jComboBoxTiposRelacionesDetallePagos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetallePagos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetallePagos.setText("Accion");
		this.jComboBoxTiposAccionesDetallePagos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetallePagos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetallePagos.setText("Accion");
		this.jComboBoxTiposSeleccionarDetallePagos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetallePagos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetallePagos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetallePagos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetallePagos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetallePagos = new JLabelMe();
		
		this.jLabelAccionesDetallePagos.setText("Acciones");		
		this.jLabelAccionesDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetallePagos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetallePagos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetallePagos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetallePagos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetallePagos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetallePagos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetallePagos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetallePagos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetallePagos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetallePagos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetallePagos.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetallePagos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetallePagos = new JButtonMe();
		//this.jButtonAnterioresDetallePagos.setText("<<");
        this.jButtonAnterioresDetallePagos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetallePagos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetallePagos = new JButtonMe();
		//this.jButtonSiguientesDetallePagos.setText(">>");
        this.jButtonSiguientesDetallePagos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetallePagos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetallePagos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetallePagos.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetallePagos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetallePagos,"nuevoguardarcambios_button","Nue",this.detallepagosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetallePagos";
		inputMap = this.jButtonNuevoGuardarCambiosDetallePagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetallePagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetallePagos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetallePagos";
		inputMap = this.jButtonRecargarInformacionDetallePagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetallePagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetallePagos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetallePagos";
		inputMap = this.jButtonSiguientesDetallePagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetallePagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetallePagos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetallePagos";
		inputMap = this.jButtonAnterioresDetallePagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetallePagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetallePagos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetallePagos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetallePagos.setMinimumSize(new Dimension(this.getWidth(),DetallePagosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetallePagosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetallePagos.setMaximumSize(new Dimension(this.getWidth(),DetallePagosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetallePagosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetallePagos.setPreferredSize(new Dimension(this.getWidth(),DetallePagosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetallePagosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetallePagos = new GridBagLayout();

			this.jPanelPaginacionDetallePagos.setLayout(gridaBagLayoutPaginacionDetallePagos);						
			
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			this.gridBagConstraintsDetallePagos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagos.gridy = 0;
			this.gridBagConstraintsDetallePagos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetallePagos.add(this.jButtonAnterioresDetallePagos, this.gridBagConstraintsDetallePagos);
					
						
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			this.gridBagConstraintsDetallePagos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetallePagos.gridy = 0;
			
			this.jPanelPaginacionDetallePagos.add(this.jButtonNuevoGuardarCambiosDetallePagos, this.gridBagConstraintsDetallePagos);
						
			
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			this.gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetallePagos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetallePagos.gridy = 0;
			this.jPanelPaginacionDetallePagos.add(this.jButtonSiguientesDetallePagos, this.gridBagConstraintsDetallePagos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagos.gridy = 1;
			this.gridBagConstraintsDetallePagos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallePagos.add(this.jButtonNuevoDetallePagos, this.gridBagConstraintsDetallePagos);
						
			
			
			if(!this.detallepagosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetallePagos = new GridBagConstraints();
				this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetallePagos.gridy = 1;
				this.gridBagConstraintsDetallePagos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetallePagos.add(this.jButtonGuardarCambiosTablaDetallePagos, this.gridBagConstraintsDetallePagos);
			}
			
			
			
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagos.gridy = 1;
			this.gridBagConstraintsDetallePagos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallePagos.add(this.jButtonDuplicarDetallePagos, this.gridBagConstraintsDetallePagos);
			
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagos.gridy = 1;
			this.gridBagConstraintsDetallePagos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallePagos.add(this.jButtonCopiarDetallePagos, this.gridBagConstraintsDetallePagos);
		
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagos.gridy = 1;
			this.gridBagConstraintsDetallePagos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallePagos.add(this.jButtonVerFormDetallePagos, this.gridBagConstraintsDetallePagos);
		
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagos.gridy = 1;
			this.gridBagConstraintsDetallePagos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetallePagos.add(this.jButtonCerrarDetallePagos, this.gridBagConstraintsDetallePagos);
		
		
		
		this.jButtonRecargarInformacionDetallePagos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetallePagos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetallePagos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetallePagos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetallePagos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetallePagos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetallePagos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetallePagos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetallePagos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetallePagos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetallePagos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetallePagos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetallePagos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetallePagos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetallePagos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetallePagos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetallePagos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetallePagos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetallePagos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallePagos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallePagos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetallePagos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetallePagos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetallePagos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetallePagos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetallePagos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetallePagos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetallePagos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetallePagos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetallePagos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetallePagos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetallePagos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetallePagos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetallePagos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetallePagos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetallePagos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetallePagos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetallePagos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetallePagos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetallePagos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetallePagos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetallePagos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetallePagos.setLayout(gridaBagParametrosReportesDetallePagos);
			this.jPanelParametrosReportesAccionesDetallePagos.setLayout(gridaBagParametrosReportesAccionesDetallePagos);
			
			
			this.jPanelParametrosAuxiliar1DetallePagos.setLayout(gridaBagParametrosAuxiliar1DetallePagos);
			this.jPanelParametrosAuxiliar2DetallePagos.setLayout(gridaBagParametrosAuxiliar2DetallePagos);
			this.jPanelParametrosAuxiliar3DetallePagos.setLayout(gridaBagParametrosAuxiliar3DetallePagos);
			this.jPanelParametrosAuxiliar4DetallePagos.setLayout(gridaBagParametrosAuxiliar4DetallePagos);
			//this.jPanelParametrosAuxiliar5DetallePagos.setLayout(gridaBagParametrosAuxiliar2DetallePagos);			
			
			
			
			
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallePagos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallePagos.add(this.jButtonRecargarInformacionDetallePagos, this.gridBagConstraintsDetallePagos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			this.gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePagos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePagos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetallePagos.add(this.jComboBoxTiposPaginacionDetallePagos, this.gridBagConstraintsDetallePagos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			this.gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePagos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePagos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetallePagos.add(this.jCheckBoxConAltoMaximoTablaDetallePagos, this.gridBagConstraintsDetallePagos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			this.gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePagos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePagos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetallePagos.add(this.jComboBoxTiposArchivosReportesDetallePagos, this.gridBagConstraintsDetallePagos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			this.gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePagos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePagos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePagos.add(this.jPanelParametrosAuxiliar1DetallePagos, this.gridBagConstraintsDetallePagos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			this.gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePagos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetallePagos.add(this.jComboBoxTiposReportesDetallePagos, this.gridBagConstraintsDetallePagos);																		
			
			
			
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			this.gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePagos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetallePagos.add(this.jComboBoxTiposGraficosReportesDetallePagos, this.gridBagConstraintsDetallePagos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			this.gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePagos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePagos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePagos.add(this.jPanelParametrosAuxiliar4DetallePagos, this.gridBagConstraintsDetallePagos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			this.gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePagos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePagos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePagos.add(this.jComboBoxTiposReportesDetallePagos, this.gridBagConstraintsDetallePagos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			this.gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePagos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePagos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallePagos.add(this.jCheckBoxGenerarReporteDetallePagos, this.gridBagConstraintsDetallePagos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			this.gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePagos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePagos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePagos.add(this.jPanelParametrosAuxiliar2DetallePagos, this.gridBagConstraintsDetallePagos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallePagos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallePagos.add(this.jLabelAccionesDetallePagos, this.gridBagConstraintsDetallePagos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetallePagos = new GridBagConstraints();
				this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetallePagos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetallePagos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetallePagos.add(this.jButtonAbrirOrderByDetallePagos, this.gridBagConstraintsDetallePagos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetallePagos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePagos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallePagos.add(this.jComboBoxTiposSeleccionarDetallePagos, this.gridBagConstraintsDetallePagos);			
			
			
			/*
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallePagos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallePagos.add(this.jCheckBoxSeleccionarTodosDetallePagos, this.gridBagConstraintsDetallePagos);
			
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallePagos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallePagos.add(this.jCheckBoxConGraficoReporteDetallePagos, this.gridBagConstraintsDetallePagos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			this.gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePagos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetallePagos.add(this.jCheckBoxSeleccionarTodosDetallePagos, this.gridBagConstraintsDetallePagos);															
				
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			this.gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePagos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetallePagos.add(this.jCheckBoxSeleccionadosDetallePagos, this.gridBagConstraintsDetallePagos);															
			
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			this.gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePagos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetallePagos.add(this.jCheckBoxConGraficoReporteDetallePagos, this.gridBagConstraintsDetallePagos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			this.gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePagos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePagos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePagos.add(this.jPanelParametrosAuxiliar3DetallePagos, this.gridBagConstraintsDetallePagos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			this.gridBagConstraintsDetallePagos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePagos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallePagos.add(this.jComboBoxTiposAccionesDetallePagos, this.gridBagConstraintsDetallePagos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetallePagos = new GridBagLayout();

			this.jScrollPanelDatosDetallePagos.setLayout(gridaBagLayoutDatosDetallePagos);
			
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagos.gridy = 0;
			this.gridBagConstraintsDetallePagos.gridx = 0;
			
			this.jScrollPanelDatosDetallePagos.add(this.jTableDatosDetallePagos, this.gridBagConstraintsDetallePagos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetallePagos.setViewportView(this.jTableDatosDetallePagos);
		this.jTableDatosDetallePagos.setFillsViewportHeight(true);
		this.jTableDatosDetallePagos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetallePagos= new GridBagLayout();
		this.jPanelAccionesDetallePagos.setLayout(gridaBagLayoutAccionesDetallePagos);
		
		
		/*	
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePagos.gridy = 0;
		this.gridBagConstraintsDetallePagos.gridx = 0;
			
		this.jPanelAccionesDetallePagos.add(this.jButtonNuevoDetallePagos, this.gridBagConstraintsDetallePagos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaDetallePagosDetallePagos= new GridBagLayout();
		gridaBagLayoutBusquedaDetallePagosDetallePagos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaDetallePagosDetallePagos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaDetallePagosDetallePagos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaDetallePagosDetallePagos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaDetallePagosDetallePagos.setLayout(gridaBagLayoutBusquedaDetallePagosDetallePagos);

		gridBagConstraintsDetallePagos = new GridBagConstraints();
		gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePagos.gridy = 0;
		gridBagConstraintsDetallePagos.gridx = 0;
		jPanelBusquedaDetallePagosDetallePagos.add(jLabelid_grupo_clienteBusquedaDetallePagosDetallePagos, gridBagConstraintsDetallePagos);

		gridBagConstraintsDetallePagos = new GridBagConstraints();
		gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePagos.gridy = 0;
		gridBagConstraintsDetallePagos.gridx = 1;
		jPanelBusquedaDetallePagosDetallePagos.add(jComboBoxid_grupo_clienteBusquedaDetallePagosDetallePagos, gridBagConstraintsDetallePagos);


		gridBagConstraintsDetallePagos = new GridBagConstraints();
		gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePagos.gridy = 1;
		gridBagConstraintsDetallePagos.gridx = 0;
		jPanelBusquedaDetallePagosDetallePagos.add(jLabelid_zonaBusquedaDetallePagosDetallePagos, gridBagConstraintsDetallePagos);

		gridBagConstraintsDetallePagos = new GridBagConstraints();
		gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePagos.gridy = 1;
		gridBagConstraintsDetallePagos.gridx = 1;
		jPanelBusquedaDetallePagosDetallePagos.add(jComboBoxid_zonaBusquedaDetallePagosDetallePagos, gridBagConstraintsDetallePagos);


		gridBagConstraintsDetallePagos = new GridBagConstraints();
		gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePagos.gridy = 2;
		gridBagConstraintsDetallePagos.gridx = 0;
		jPanelBusquedaDetallePagosDetallePagos.add(jLabelfecha_emision_desdeBusquedaDetallePagosDetallePagos, gridBagConstraintsDetallePagos);

		gridBagConstraintsDetallePagos = new GridBagConstraints();
		gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePagos.gridy = 2;
		gridBagConstraintsDetallePagos.gridx = 1;
		jPanelBusquedaDetallePagosDetallePagos.add(jDateChooserfecha_emision_desdeBusquedaDetallePagosDetallePagos, gridBagConstraintsDetallePagos);


		gridBagConstraintsDetallePagos = new GridBagConstraints();
		gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePagos.gridy = 3;
		gridBagConstraintsDetallePagos.gridx = 0;
		jPanelBusquedaDetallePagosDetallePagos.add(jLabelfecha_emision_hastaBusquedaDetallePagosDetallePagos, gridBagConstraintsDetallePagos);

		gridBagConstraintsDetallePagos = new GridBagConstraints();
		gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePagos.gridy = 3;
		gridBagConstraintsDetallePagos.gridx = 1;
		jPanelBusquedaDetallePagosDetallePagos.add(jDateChooserfecha_emision_hastaBusquedaDetallePagosDetallePagos, gridBagConstraintsDetallePagos);

		gridBagConstraintsDetallePagos = new GridBagConstraints();
		gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePagos.gridy = 4;
		gridBagConstraintsDetallePagos.gridx =1;
		jPanelBusquedaDetallePagosDetallePagos.add(jButtonBusquedaDetallePagosDetallePagos, gridBagConstraintsDetallePagos);

		jTabbedPaneBusquedasDetallePagos.addTab("1.-Por Grupo Cliente Por Zona Por Fecha Emision Desde Por Fecha Emision Hasta ", jPanelBusquedaDetallePagosDetallePagos);
		jTabbedPaneBusquedasDetallePagos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetallePagos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetallePagos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallepagosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();						
			this.gridBagConstraintsDetallePagos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetallePagos.gridx = 0;		
			//this.gridBagConstraintsDetallePagos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetallePagos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetallePagos, this.gridBagConstraintsDetallePagos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetallePagos.gridx = 0;		
		//this.gridBagConstraintsDetallePagos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePagos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetallePagos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetallePagos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetallePagos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetallePagos.gridx = 0;		
			this.gridBagConstraintsDetallePagos.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetallePagos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetallePagos, this.gridBagConstraintsDetallePagos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePagos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetallePagos, this.gridBagConstraintsDetallePagos);								
		
		
		/*
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePagos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetallePagos, this.gridBagConstraintsDetallePagos);
		*/		
		
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetallePagos.gridx =0;
		this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetallePagos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetallePagos, this.gridBagConstraintsDetallePagos);
				
		
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePagos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetallePagos, this.gridBagConstraintsDetallePagos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetallePagosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetallePagos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetallePagos = new GridBagLayout();
			this.jPanelBusquedasParametrosDetallePagos.setLayout(gridaBagLayoutBusquedasParametrosDetallePagos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetallePagos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetallePagos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallePagos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallePagos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePagos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetallePagos, this.gridBagConstraintsDetallePagos);
			
			
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePagos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetallePagos, this.gridBagConstraintsDetallePagos);
		
			
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetallePagos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetallePagos, this.gridBagConstraintsDetallePagos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetallePagos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetallePagos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetallePagos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetallePagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetallePagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetallePagos.setName("jPanelReporteDinamicoDetallePagos"); 
		
		this.jPanelReporteDinamicoDetallePagos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetallePagos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetallePagos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetallePagos.setLayout(gridaBagLayoutReporteDinamicoDetallePagos);
		
		
		this.jInternalFrameReporteDinamicoDetallePagos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetallePagos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetallePagos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetallePagos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetallePagos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetallePagos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetallePagos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetallePagos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetallePagos.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetallePagos.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetallePagos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetallePagos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetallePagos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetallePagos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetallePagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pagoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetallePagos = new JLabelMe();

		this.jLabelColumnasSelectReporteDetallePagos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePagos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetallePagos.add(this.jLabelColumnasSelectReporteDetallePagos, this.gridBagConstraintsDetallePagos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetallePagos = new JList<Reporte>();
		this.jListColumnasSelectReporteDetallePagos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetallePagos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetallePagos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetallePagos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetallePagos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetallePagos=new JScrollPane(this.jListColumnasSelectReporteDetallePagos);
			
			this.jScrollColumnasSelectReporteDetallePagos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetallePagos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetallePagos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetallePagos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePagos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetallePagos.add(this.jListColumnasSelectReporteDetallePagos, this.gridBagConstraintsDetallePagos);
		this.jPanelReporteDinamicoDetallePagos.add(this.jScrollColumnasSelectReporteDetallePagos, this.gridBagConstraintsDetallePagos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetallePagos = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetallePagos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetallePagos = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetallePagos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetallePagos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetallePagos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetallePagos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetallePagos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetallePagos=new JScrollPane(this.jListRelacionesSelectReporteDetallePagos);
			
			this.jScrollRelacionesSelectReporteDetallePagos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetallePagos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetallePagos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetallePagos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetallePagos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetallePagos = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetallePagos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetallePagos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetallePagos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetallePagos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetallePagos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetallePagos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetallePagos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetallePagos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetallePagos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetallePagos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetallePagos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetallePagos = new JLabelMe();

		this.jLabelConGraficoDinamicoDetallePagos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePagos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetallePagos.add(this.jLabelConGraficoDinamicoDetallePagos, this.gridBagConstraintsDetallePagos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetallePagos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetallePagos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetallePagos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetallePagos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetallePagos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetallePagos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePagos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePagos.add(this.jCheckBoxConGraficoDinamicoDetallePagos, this.gridBagConstraintsDetallePagos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetallePagos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetallePagos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePagos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetallePagos.add(this.jLabelColumnaCategoriaGraficoDetallePagos, this.gridBagConstraintsDetallePagos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetallePagos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetallePagos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetallePagos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetallePagos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetallePagos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetallePagos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePagos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetallePagos.add(this.jComboBoxColumnaCategoriaGraficoDetallePagos, this.gridBagConstraintsDetallePagos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetallePagos = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetallePagos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePagos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePagos.add(this.jLabelColumnaCategoriaValorDetallePagos, this.gridBagConstraintsDetallePagos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetallePagos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetallePagos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetallePagos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetallePagos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetallePagos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetallePagos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePagos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetallePagos.add(this.jComboBoxColumnaCategoriaValorDetallePagos, this.gridBagConstraintsDetallePagos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetallePagos = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetallePagos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePagos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePagos.add(this.jLabelColumnasValoresGraficoDetallePagos, this.gridBagConstraintsDetallePagos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetallePagos = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetallePagos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetallePagos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetallePagos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetallePagos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetallePagos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetallePagos=new JScrollPane(this.jListColumnasValoresGraficoDetallePagos);
			
			this.jScrollColumnasValoresGraficoDetallePagos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetallePagos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetallePagos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetallePagos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePagos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetallePagos.add(this.jListColumnasSelectReporteDetallePagos, this.gridBagConstraintsDetallePagos);
		this.jPanelReporteDinamicoDetallePagos.add(this.jScrollColumnasValoresGraficoDetallePagos, this.gridBagConstraintsDetallePagos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetallePagos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetallePagos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePagos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePagos.add(this.jLabelTiposGraficosReportesDinamicoDetallePagos, this.gridBagConstraintsDetallePagos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetallePagos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetallePagos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetallePagos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetallePagos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetallePagos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetallePagos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePagos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePagos.add(this.jComboBoxTiposGraficosReportesDinamicoDetallePagos, this.gridBagConstraintsDetallePagos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetallePagos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetallePagos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePagos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePagos.add(this.jLabelGenerarExcelReporteDinamicoDetallePagos, this.gridBagConstraintsDetallePagos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetallePagos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetallePagos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetallePagos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetallePagos.setToolTipText("Generar EXCEL"+" "+DetallePagosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		//this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetallePagos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetallePagos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetallePagos.add(this.jButtonGenerarExcelReporteDinamicoDetallePagos, this.gridBagConstraintsDetallePagos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePagos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallePagos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallePagos.add(this.jComboBoxTiposReportesDinamicoDetallePagos, this.gridBagConstraintsDetallePagos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetallePagos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetallePagos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePagos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePagos.add(this.jLabelTiposArchivoReporteDinamicoDetallePagos, this.gridBagConstraintsDetallePagos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePagos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallePagos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallePagos.add(this.jComboBoxTiposArchivosReportesDinamicoDetallePagos, this.gridBagConstraintsDetallePagos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetallePagos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetallePagos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetallePagos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetallePagos.setToolTipText("Generar"+" "+DetallePagosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePagos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallePagos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallePagos.add(this.jButtonGenerarReporteDinamicoDetallePagos, this.gridBagConstraintsDetallePagos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetallePagos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetallePagos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetallePagos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetallePagos.setToolTipText("Cancelar"+" "+DetallePagosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePagos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallePagos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallePagos.add(this.jButtonCerrarReporteDinamicoDetallePagos, this.gridBagConstraintsDetallePagos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetallePagos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetallePagos= new JScrollPane(jPanelReporteDinamicoDetallePagos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetallePagos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetallePagos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetallePagos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetallePagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pagoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetallePagos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetallePagos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetallePagos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetallePagos);
		this.jInternalFrameReporteDinamicoDetallePagos.getContentPane().add(this.jScrollPanelReporteDinamicoDetallePagos, this.gridBagConstraintsDetallePagos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetallePagos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetallePagos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetallePagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetallePagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetallePagos.setName("jPanelImportacionDetallePagos"); 
		
		this.jPanelImportacionDetallePagos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetallePagos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetallePagos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetallePagos.setLayout(gridaBagLayoutImportacionDetallePagos);
		
		
		this.jInternalFrameImportacionDetallePagos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetallePagos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetallePagos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetallePagos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetallePagos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetallePagos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetallePagos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetallePagos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetallePagos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetallePagos.setResizable(true);
	    this.jInternalFrameImportacionDetallePagos.setClosable(true);
	    this.jInternalFrameImportacionDetallePagos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetallePagos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetallePagos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetallePagos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetallePagos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetallePagos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetallePagos.setResizable(true);
	    this.jInternalFrameImportacionDetallePagos.setClosable(true);
	    this.jInternalFrameImportacionDetallePagos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetallePagos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetallePagos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetallePagos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetallePagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pagoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetallePagos = new JLabelMe();

		this.jLabelArchivoImportacionDetallePagos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagos.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetallePagos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetallePagos.add(this.jLabelArchivoImportacionDetallePagos, this.gridBagConstraintsDetallePagos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetallePagos = new JFileChooser();		
		this.jFileChooserImportacionDetallePagos.setToolTipText("ESCOGER ARCHIVO"+" "+DetallePagosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetallePagos = new JButtonMe();
		this.jButtonAbrirImportacionDetallePagos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetallePagos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetallePagos.setToolTipText("Generar"+" "+DetallePagosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePagos.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallePagos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallePagos.add(this.jButtonAbrirImportacionDetallePagos, this.gridBagConstraintsDetallePagos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetallePagos = new JLabelMe();

		this.jLabelPathArchivoImportacionDetallePagos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagos.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetallePagos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetallePagos.add(this.jLabelPathArchivoImportacionDetallePagos, this.gridBagConstraintsDetallePagos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetallePagos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetallePagos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetallePagos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetallePagos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePagos.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallePagos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallePagos.add(this.jTextFieldPathArchivoImportacionDetallePagos, this.gridBagConstraintsDetallePagos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetallePagos = new JButtonMe();
		this.jButtonGenerarImportacionDetallePagos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetallePagos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetallePagos.setToolTipText("Generar"+" "+DetallePagosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePagos.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallePagos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallePagos.add(this.jButtonGenerarImportacionDetallePagos, this.gridBagConstraintsDetallePagos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetallePagos = new JButtonMe();
		this.jButtonCerrarImportacionDetallePagos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetallePagos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetallePagos.setToolTipText("Cancelar"+" "+DetallePagosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePagos.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallePagos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallePagos.add(this.jButtonCerrarImportacionDetallePagos, this.gridBagConstraintsDetallePagos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetallePagos = new GridBagLayout();
		
		this.jScrollPanelImportacionDetallePagos= new JScrollPane(jPanelImportacionDetallePagos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.gridy =iPosYImportacion;
		this.gridBagConstraintsDetallePagos.gridx =iPosXImportacion;
		this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetallePagos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetallePagos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetallePagos);
		this.jInternalFrameImportacionDetallePagos.getContentPane().add(this.jScrollPanelImportacionDetallePagos, this.gridBagConstraintsDetallePagos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetallePagos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetallePagos = new JButtonMe();
			this.jButtonAbrirOrderByDetallePagos.setText("Orden");
			this.jButtonAbrirOrderByDetallePagos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetallePagos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetallePagos";
			inputMap = this.jButtonAbrirOrderByDetallePagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetallePagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetallePagos"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetallePagos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetallePagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetallePagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetallePagos.setName("jPanelOrderByDetallePagos"); 
			
			this.jPanelOrderByDetallePagos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetallePagos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetallePagos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetallePagos.setLayout(gridaBagLayoutOrderByDetallePagos);
			
			
			this.jTableDatosDetallePagosOrderBy = new JTableMe();        
			this.jTableDatosDetallePagosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetallePagosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetallePagosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetallePagosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetallePagosOrderBy.setViewportView(this.jTableDatosDetallePagosOrderBy);
			this.jTableDatosDetallePagosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetallePagosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetallePagos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetallePagos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetallePagos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetallePagos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetallePagos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetallePagos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetallePagos.setTitle("Orden");
			this.jInternalFrameOrderByDetallePagos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetallePagos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetallePagos.setResizable(true);
			this.jInternalFrameOrderByDetallePagos.setClosable(true);
			this.jInternalFrameOrderByDetallePagos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetallePagos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetallePagos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetallePagos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetallePagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pagoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			this.gridBagConstraintsDetallePagos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetallePagos.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetallePagos.ipady =150;
				
			this.jPanelOrderByDetallePagos.add(jScrollPanelDatosDetallePagosOrderBy, this.gridBagConstraintsDetallePagos);//this.jTableDatosDetallePagosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetallePagos = new JButtonMe();
			this.jButtonCerrarOrderByDetallePagos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetallePagos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetallePagos.setToolTipText("Cancelar"+" "+DetallePagosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetallePagos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetallePagos.add(this.jButtonCerrarOrderByDetallePagos, this.gridBagConstraintsDetallePagos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetallePagos = new GridBagLayout();
			
			this.jScrollPanelOrderByDetallePagos= new JScrollPane(jPanelOrderByDetallePagos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			this.gridBagConstraintsDetallePagos.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetallePagos.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetallePagos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetallePagos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetallePagos);
			
			this.jInternalFrameOrderByDetallePagos.getContentPane().add(this.jScrollPanelOrderByDetallePagos, this.gridBagConstraintsDetallePagos);			
		
		} else {
			this.jButtonAbrirOrderByDetallePagos = new JButtonMe();
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
		int iWidthTableCalculado=0;//2430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.detallepagosSessionBean.getConGuardarRelaciones()
		//	) {
		//}
		
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
		int iCountColumns=this.jTableDatosDetallePagos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetallePagos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetallePagos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosDetallePagos.getRowHeight();//DetallePagosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detallepagosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetallePagosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetallePagos.isSelected()) {
					iHeightTable=DetallePagosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetallePagosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetallePagosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetallePagosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetallePagos.isSelected()) {
					iHeightTable=DetallePagosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetallePagosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetallePagosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetallePagos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetallePagos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetallePagos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetallePagos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetallePagos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetallePagos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetallePagos!=null && this.jInternalFrameOrderByDetallePagos.getjTableDatosOrderBy()!=null) {
			//if(!this.detallepagosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetallePagos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetallePagos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetallePagos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetallePagos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetallePagos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetallePagos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetallePagos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetallePagos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetallePagos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetallePagos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=detallepagosLogic.getDetallePagoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallepagoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetallePagos> TraerDetallePagosBeans(List<DetallePagos> detallepagoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetallePagos detallepagos:detallepagoss) {
					
				if(!(DetallePagosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetallePagosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detallepagos.setsDetalleGeneralEntityReporte(DetallePagosConstantesFunciones.getDetallePagosDescripcion(detallepagos));
										
						
					
						
					
				} else  {
							
					//detallepagos.setsDetalleGeneralEntityReporte(detallepagos.getsDetalleGeneralEntityReporte());
										
				}
				
				//detallepagosbeans.add(detallepagosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detallepagoss;
    }
	//PARA REPORTES FIN
}
