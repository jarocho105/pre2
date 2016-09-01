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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.MensajeCorreoInvenConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class MensajeCorreoInvenJInternalFrame extends MensajeCorreoInvenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarMensajeCorreoInven;
	
	protected JMenuBar jmenuBarMensajeCorreoInven;
	
	protected JMenu jmenuMensajeCorreoInven;
	protected JMenu jmenuDatosMensajeCorreoInven;
	protected JMenu jmenuArchivoMensajeCorreoInven;
	protected JMenu jmenuAccionesMensajeCorreoInven;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutMensajeCorreoInven;	
	protected GridBagConstraints gridBagConstraintsMensajeCorreoInven;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public MensajeCorreoInvenDetalleFormJInternalFrame jInternalFrameDetalleFormMensajeCorreoInven;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoMensajeCorreoInven;	
	protected ImportacionJInternalFrame jInternalFrameImportacionMensajeCorreoInven;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TipoMensajeCorreoInvenBeanSwingJInternalFrame tipomensajecorreoinvenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomensajecorreoinven="";
	
	public MensajeCorreoInvenSessionBean mensajecorreoinvenSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TipoMensajeCorreoInvenSessionBean tipomensajecorreoinvenSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<MensajeCorreoInven> mensajecorreoinvens;		
	public List<MensajeCorreoInven> mensajecorreoinvensEliminados;	
	public List<MensajeCorreoInven> mensajecorreoinvensAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByMensajeCorreoInven;		
	protected JButton jButtonAbrirOrderByMensajeCorreoInven;
	
	
	//protected JPanel jPanelOrderByMensajeCorreoInven;
	//public JScrollPane jScrollPanelOrderByMensajeCorreoInven;	
	//protected JButton jButtonCerrarOrderByMensajeCorreoInven;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public MensajeCorreoInvenLogic mensajecorreoinvenLogic;
	
	
	
	public JScrollPane jScrollPanelDatosMensajeCorreoInven;
	public JScrollPane jScrollPanelDatosEdicionMensajeCorreoInven;
	public JScrollPane jScrollPanelDatosGeneralMensajeCorreoInven;
    
	
	
	//public JScrollPane jScrollPanelDatosMensajeCorreoInvenOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoMensajeCorreoInven;
	//public JScrollPane jScrollPanelImportacionMensajeCorreoInven;
	
	
	
	protected JPanel jPanelAccionesMensajeCorreoInven;
	
    protected JPanel jPanelPaginacionMensajeCorreoInven;
    protected JPanel jPanelParametrosReportesMensajeCorreoInven;
	protected JPanel jPanelParametrosReportesAccionesMensajeCorreoInven;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1MensajeCorreoInven;
	protected JPanel jPanelParametrosAuxiliar2MensajeCorreoInven;
	protected JPanel jPanelParametrosAuxiliar3MensajeCorreoInven;
	protected JPanel jPanelParametrosAuxiliar4MensajeCorreoInven;
	//protected JPanel jPanelParametrosAuxiliar5MensajeCorreoInven;
	
	
	
	//protected JPanel jPanelReporteDinamicoMensajeCorreoInven;
	//protected JPanel jPanelImportacionMensajeCorreoInven;
	
	
	public JTable jTableDatosMensajeCorreoInven;
	
	
	
	//public JTable jTableDatosMensajeCorreoInvenOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoMensajeCorreoInven;
	protected JButton jButtonDuplicarMensajeCorreoInven;
	protected JButton jButtonCopiarMensajeCorreoInven;
	protected JButton jButtonVerFormMensajeCorreoInven;
	protected JButton jButtonNuevoRelacionesMensajeCorreoInven;
	protected JButton jButtonModificarMensajeCorreoInven;
	
    protected JButton jButtonGuardarCambiosTablaMensajeCorreoInven;
	protected JButton jButtonCerrarMensajeCorreoInven;
	
	
	protected JButton jButtonRecargarInformacionMensajeCorreoInven;
	protected JButton jButtonProcesarInformacionMensajeCorreoInven;
	
	
	protected JButton jButtonAnterioresMensajeCorreoInven;
	protected JButton jButtonSiguientesMensajeCorreoInven;
	protected JButton jButtonNuevoGuardarCambiosMensajeCorreoInven;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoMensajeCorreoInven;
	//protected JButton jButtonCerrarReporteDinamicoMensajeCorreoInven;
	//protected JButton jButtonGenerarExcelReporteDinamicoMensajeCorreoInven;	
	
	
	
	//protected JButton jButtonAbrirImportacionMensajeCorreoInven;
	//protected JButton jButtonGenerarImportacionMensajeCorreoInven;
	//protected JButton jButtonCerrarImportacionMensajeCorreoInven;
	//protected JFileChooser jFileChooserImportacionMensajeCorreoInven;
	//protected File fileImportacionMensajeCorreoInven;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarMensajeCorreoInven;
	protected JButton jButtonDuplicarToolBarMensajeCorreoInven;
	protected JButton jButtonNuevoRelacionesToolBarMensajeCorreoInven;
	
	
	public JButton jButtonGuardarCambiosToolBarMensajeCorreoInven;
	protected JButton jButtonCopiarToolBarMensajeCorreoInven;
	protected JButton jButtonVerFormToolBarMensajeCorreoInven;
	public JButton jButtonGuardarCambiosTablaToolBarMensajeCorreoInven;
	protected JButton jButtonMostrarOcultarTablaToolBarMensajeCorreoInven;
	protected JButton jButtonCerrarToolBarMensajeCorreoInven;
	
	protected JButton jButtonRecargarInformacionToolBarMensajeCorreoInven;
	protected JButton jButtonProcesarInformacionToolBarMensajeCorreoInven;
	protected JButton jButtonAnterioresToolBarMensajeCorreoInven;
	protected JButton jButtonSiguientesToolBarMensajeCorreoInven;
	protected JButton jButtonNuevoGuardarCambiosToolBarMensajeCorreoInven;
	protected JButton jButtonAbrirOrderByToolBarMensajeCorreoInven;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoMensajeCorreoInven;
	protected JMenuItem jMenuItemDuplicarMensajeCorreoInven;
	protected JMenuItem jMenuItemNuevoRelacionesMensajeCorreoInven;
	
	
	protected JMenuItem jMenuItemGuardarCambiosMensajeCorreoInven;
	protected JMenuItem jMenuItemCopiarMensajeCorreoInven;
	protected JMenuItem jMenuItemVerFormMensajeCorreoInven;
	protected JMenuItem jMenuItemGuardarCambiosTablaMensajeCorreoInven;
	protected JMenuItem jMenuItemCerrarMensajeCorreoInven;
	protected JMenuItem jMenuItemDetalleCerrarMensajeCorreoInven;
	protected JMenuItem jMenuItemDetalleAbrirOrderByMensajeCorreoInven;
	protected JMenuItem jMenuItemDetalleMostarOcultarMensajeCorreoInven;
	
	protected JMenuItem jMenuItemRecargarInformacionMensajeCorreoInven;
	protected JMenuItem jMenuItemProcesarInformacionMensajeCorreoInven;
	protected JMenuItem jMenuItemAnterioresMensajeCorreoInven;
	protected JMenuItem jMenuItemSiguientesMensajeCorreoInven;
	protected JMenuItem jMenuItemNuevoGuardarCambiosMensajeCorreoInven;
	protected JMenuItem jMenuItemAbrirOrderByMensajeCorreoInven;
	protected JMenuItem jMenuItemMostrarOcultarMensajeCorreoInven;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesMensajeCorreoInven;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosMensajeCorreoInven;
	protected JCheckBox jCheckBoxSeleccionadosMensajeCorreoInven;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaMensajeCorreoInven;
	protected JCheckBox jCheckBoxConGraficoReporteMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesMensajeCorreoInven;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoMensajeCorreoInven;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarMensajeCorreoInven;
	protected JTextField jTextFieldValorCampoGeneralMensajeCorreoInven;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteMensajeCorreoInven;
	//public JList<Reporte> jListColumnasSelectReporteMensajeCorreoInven;
	//public JScrollPane jScrollColumnasSelectReporteMensajeCorreoInven;
	
	//public JLabel jLabelRelacionesSelectReporteMensajeCorreoInven;
	//public JList<Reporte> jListRelacionesSelectReporteMensajeCorreoInven;
	//public JScrollPane jScrollRelacionesSelectReporteMensajeCorreoInven;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoMensajeCorreoInven;
	//protected JCheckBox jCheckBoxConGraficoDinamicoMensajeCorreoInven;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoMensajeCorreoInven;
	//public JLabel jLabelTiposArchivoReporteDinamicoMensajeCorreoInven;
	
		
	//public JLabel jLabelArchivoImportacionMensajeCorreoInven;	
	//public JLabel jLabelPathArchivoImportacionMensajeCorreoInven;
	//protected JTextField jTextFieldPathArchivoImportacionMensajeCorreoInven;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoMensajeCorreoInven;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoMensajeCorreoInven;
	
	//public JLabel jLabelColumnaCategoriaValorMensajeCorreoInven;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorMensajeCorreoInven;
	
	//public JLabel jLabelColumnasValoresGraficoMensajeCorreoInven;
	//public JList<Reporte> jListColumnasValoresGraficoMensajeCorreoInven;
	//public JScrollPane jScrollColumnasValoresGraficoMensajeCorreoInven;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoMensajeCorreoInven;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoMensajeCorreoInven;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasMensajeCorreoInven;
	public JPanel jPanelFK_IdTipoMensajeCorreoInvenMensajeCorreoInven;
	public JButton jButtonFK_IdTipoMensajeCorreoInvenMensajeCorreoInven;
	
	public JPanel jPanelid_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInvenMensajeCorreoInven;
	public JLabel jLabelid_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInvenMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInvenMensajeCorreoInven;
	public JButton jButtonid_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInvenMensajeCorreoInven= new JButtonMe();
	public JButton jButtonid_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInvenMensajeCorreoInvenUpdate= new JButtonMe();
	public JButton jButtonid_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInvenMensajeCorreoInvenBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public MensajeCorreoInvenJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("MensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MensajeCorreoInvenJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MensajeCorreoInvenJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MensajeCorreoInvenJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("MensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionMensajeCorreoInven)	{
		this.jButtonRecargarInformacionMensajeCorreoInven = jButtonRecargarInformacionMensajeCorreoInven;
	}
	
	public JButton getjButtonProcesarInformacionMensajeCorreoInven() {
		return this.jButtonProcesarInformacionMensajeCorreoInven;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionMensajeCorreoInven)	{
		this.jButtonProcesarInformacionMensajeCorreoInven = jButtonProcesarInformacionMensajeCorreoInven;
	}
	
	
	public JButton getjButtonRecargarInformacionMensajeCorreoInven() {
		return this.jButtonRecargarInformacionMensajeCorreoInven;
	}
	
	
	public List<MensajeCorreoInven> getmensajecorreoinvens() {
		return this.mensajecorreoinvens;
	}

	public void setmensajecorreoinvens(List<MensajeCorreoInven> mensajecorreoinvens) {
		this.mensajecorreoinvens = mensajecorreoinvens;
	}
	
	public List<MensajeCorreoInven> getmensajecorreoinvensAux() {
		return this.mensajecorreoinvensAux;
	}

	public void setmensajecorreoinvensAux(List<MensajeCorreoInven> mensajecorreoinvensAux) {
		this.mensajecorreoinvensAux = mensajecorreoinvensAux;
	}
	
	public List<MensajeCorreoInven> getmensajecorreoinvensEliminados() {
		return this.mensajecorreoinvensEliminados;
	}

	public void setMensajeCorreoInvensEliminados(List<MensajeCorreoInven> mensajecorreoinvensEliminados) {
		this.mensajecorreoinvensEliminados = mensajecorreoinvensEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarMensajeCorreoInven() {
		return jComboBoxTiposSeleccionarMensajeCorreoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarMensajeCorreoInven(
			JComboBox jComboBoxTiposSeleccionarMensajeCorreoInven) {
		this.jComboBoxTiposSeleccionarMensajeCorreoInven = jComboBoxTiposSeleccionarMensajeCorreoInven;
	}
	
	public void setBorderResaltarTiposSeleccionarMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarMensajeCorreoInven .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralMensajeCorreoInven() {
		return jTextFieldValorCampoGeneralMensajeCorreoInven;
	}

	public void setjTextFieldValorCampoGeneralMensajeCorreoInven(
			JTextField jTextFieldValorCampoGeneralMensajeCorreoInven) {
		this.jTextFieldValorCampoGeneralMensajeCorreoInven = jTextFieldValorCampoGeneralMensajeCorreoInven;
	}

	public void setBorderResaltarValorCampoGeneralMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralMensajeCorreoInven .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosMensajeCorreoInven() {
		return this.jCheckBoxSeleccionarTodosMensajeCorreoInven;
	}

	public void setjCheckBoxSeleccionarTodosMensajeCorreoInven(
			JCheckBox jCheckBoxSeleccionarTodosMensajeCorreoInven) {
		this.jCheckBoxSeleccionarTodosMensajeCorreoInven = jCheckBoxSeleccionarTodosMensajeCorreoInven;
	}

	public void setBorderResaltarSeleccionarTodosMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosMensajeCorreoInven .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosMensajeCorreoInven() {
		return this.jCheckBoxSeleccionadosMensajeCorreoInven;
	}

	public void setjCheckBoxSeleccionadosMensajeCorreoInven(
			JCheckBox jCheckBoxSeleccionadosMensajeCorreoInven) {
		this.jCheckBoxSeleccionadosMensajeCorreoInven = jCheckBoxSeleccionadosMensajeCorreoInven;
	}
	
	public void setBorderResaltarSeleccionadosMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosMensajeCorreoInven .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesMensajeCorreoInven() {
		return this.jComboBoxTiposArchivosReportesMensajeCorreoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesMensajeCorreoInven(
			JComboBox jComboBoxTiposArchivosReportesMensajeCorreoInven) {
		this.jComboBoxTiposArchivosReportesMensajeCorreoInven = jComboBoxTiposArchivosReportesMensajeCorreoInven;
	}

	public void setBorderResaltarTiposArchivosReportesMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesMensajeCorreoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesMensajeCorreoInven() {
		return this.jComboBoxTiposReportesMensajeCorreoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesMensajeCorreoInven(
			JComboBox jComboBoxTiposReportesMensajeCorreoInven) {
		this.jComboBoxTiposReportesMensajeCorreoInven = jComboBoxTiposReportesMensajeCorreoInven;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoMensajeCorreoInven() {
	//	return jComboBoxTiposReportesDinamicoMensajeCorreoInven;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoMensajeCorreoInven(
	//		JComboBox jComboBoxTiposReportesDinamicoMensajeCorreoInven) {
	//	this.jComboBoxTiposReportesDinamicoMensajeCorreoInven = jComboBoxTiposReportesDinamicoMensajeCorreoInven;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoMensajeCorreoInven() {
	//	return jComboBoxTiposArchivosReportesDinamicoMensajeCorreoInven;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoMensajeCorreoInven(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoMensajeCorreoInven) {
	//	this.jComboBoxTiposArchivosReportesDinamicoMensajeCorreoInven = jComboBoxTiposArchivosReportesDinamicoMensajeCorreoInven;
	//}
	
	public void setBorderResaltarTiposReportesMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesMensajeCorreoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesMensajeCorreoInven() {
		return this.jComboBoxTiposGraficosReportesMensajeCorreoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesMensajeCorreoInven(
			JComboBox jComboBoxTiposGraficosReportesMensajeCorreoInven) {
		this.jComboBoxTiposGraficosReportesMensajeCorreoInven = jComboBoxTiposGraficosReportesMensajeCorreoInven;
	}
	
	public void setBorderResaltarTiposGraficosReportesMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesMensajeCorreoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionMensajeCorreoInven() {
		return this.jComboBoxTiposPaginacionMensajeCorreoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionMensajeCorreoInven(
			JComboBox jComboBoxTiposPaginacionMensajeCorreoInven) {
		this.jComboBoxTiposPaginacionMensajeCorreoInven = jComboBoxTiposPaginacionMensajeCorreoInven;
	}
	
	public void setBorderResaltarTiposPaginacionMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionMensajeCorreoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesMensajeCorreoInven() {
		return this.jComboBoxTiposRelacionesMensajeCorreoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesMensajeCorreoInven() {
		return this.jComboBoxTiposAccionesMensajeCorreoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesMensajeCorreoInven(
			JComboBox jComboBoxTiposRelacionesMensajeCorreoInven) {
		this.jComboBoxTiposRelacionesMensajeCorreoInven = jComboBoxTiposRelacionesMensajeCorreoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesMensajeCorreoInven(
			JComboBox jComboBoxTiposAccionesMensajeCorreoInven) {
		this.jComboBoxTiposAccionesMensajeCorreoInven = jComboBoxTiposAccionesMensajeCorreoInven;
	}
	
	public void setBorderResaltarTiposRelacionesMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesMensajeCorreoInven .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesMensajeCorreoInven .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoMensajeCorreoInven() {
	//	return jCheckBoxConGraficoDinamicoMensajeCorreoInven;
	//}

	//public void setjCheckBoxConGraficoDinamicoMensajeCorreoInven(
	//		JCheckBox jCheckBoxConGraficoDinamicoMensajeCorreoInven) {
	//	this.jCheckBoxConGraficoDinamicoMensajeCorreoInven = jCheckBoxConGraficoDinamicoMensajeCorreoInven;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoMensajeCorreoInven() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarMensajeCorreoInven.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoMensajeCorreoInven .setBorder(borderResaltar);		
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
		this.mensajecorreoinvenSessionBean=new MensajeCorreoInvenSessionBean();
		
		this.mensajecorreoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.mensajecorreoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=MensajeCorreoInvenJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=MensajeCorreoInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		MensajeCorreoInvenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		MensajeCorreoInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		MensajeCorreoInvenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Mensaje Correo MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
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
		
		MensajeCorreoInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("MensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarMensajeCorreoInven= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarMensajeCorreoInven,this.jTtoolBarMensajeCorreoInven,
							"nuevo","nuevo","Nuevo"+" "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarMensajeCorreoInven,this.jTtoolBarMensajeCorreoInven,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarMensajeCorreoInven,this.jTtoolBarMensajeCorreoInven,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarMensajeCorreoInven,this.jTtoolBarMensajeCorreoInven,
							"duplicar","duplicar","Duplicar"+" "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarMensajeCorreoInven,this.jTtoolBarMensajeCorreoInven,
							"copiar","copiar","Copiar"+" "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarMensajeCorreoInven,this.jTtoolBarMensajeCorreoInven,
							"ver_form","ver_form","Ver"+" "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMensajeCorreoInven,this.jTtoolBarMensajeCorreoInven,
							"recargar","recargar","Recargar"+" "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMensajeCorreoInven,this.jTtoolBarMensajeCorreoInven,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMensajeCorreoInven,this.jTtoolBarMensajeCorreoInven,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarMensajeCorreoInven,this.jTtoolBarMensajeCorreoInven,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarMensajeCorreoInven,this.jTtoolBarMensajeCorreoInven,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarMensajeCorreoInven,this.jTtoolBarMensajeCorreoInven,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarMensajeCorreoInven,this.jTtoolBarMensajeCorreoInven,
							"cerrar","cerrar","Salir"+" "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarMensajeCorreoInven=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarMensajeCorreoInven;
			
				this.jButtonProcesarInformacionToolBarMensajeCorreoInven=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarMensajeCorreoInven;
				
		//protected JButton jButtonModificarToolBarMensajeCorreoInven;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarMensajeCorreoInven=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuMensajeCorreoInven=new JMenuMe("General");
		this.jmenuArchivoMensajeCorreoInven=new JMenuMe("Archivo");
		this.jmenuAccionesMensajeCorreoInven=new JMenuMe("Acciones");
		this.jmenuDatosMensajeCorreoInven=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoMensajeCorreoInven= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoMensajeCorreoInven.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoMensajeCorreoInven,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarMensajeCorreoInven= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarMensajeCorreoInven.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarMensajeCorreoInven,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesMensajeCorreoInven= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesMensajeCorreoInven.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesMensajeCorreoInven,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosMensajeCorreoInven= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosMensajeCorreoInven.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosMensajeCorreoInven,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarMensajeCorreoInven= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarMensajeCorreoInven.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarMensajeCorreoInven,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormMensajeCorreoInven= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormMensajeCorreoInven.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormMensajeCorreoInven,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaMensajeCorreoInven= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaMensajeCorreoInven.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaMensajeCorreoInven,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarMensajeCorreoInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarMensajeCorreoInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarMensajeCorreoInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionMensajeCorreoInven= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionMensajeCorreoInven.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionMensajeCorreoInven,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionMensajeCorreoInven= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionMensajeCorreoInven.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionMensajeCorreoInven,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresMensajeCorreoInven= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresMensajeCorreoInven.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresMensajeCorreoInven,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesMensajeCorreoInven= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesMensajeCorreoInven.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesMensajeCorreoInven,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByMensajeCorreoInven= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByMensajeCorreoInven.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByMensajeCorreoInven,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarMensajeCorreoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarMensajeCorreoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarMensajeCorreoInven,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByMensajeCorreoInven= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByMensajeCorreoInven.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByMensajeCorreoInven,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarMensajeCorreoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarMensajeCorreoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarMensajeCorreoInven,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosMensajeCorreoInven= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosMensajeCorreoInven.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosMensajeCorreoInven,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoMensajeCorreoInven.add(this.jMenuItemCerrarMensajeCorreoInven);
			
			this.jmenuAccionesMensajeCorreoInven.add(this.jMenuItemNuevoMensajeCorreoInven);
			this.jmenuAccionesMensajeCorreoInven.add(this.jMenuItemNuevoGuardarCambiosMensajeCorreoInven);
			this.jmenuAccionesMensajeCorreoInven.add(this.jMenuItemNuevoRelacionesMensajeCorreoInven);
			this.jmenuAccionesMensajeCorreoInven.add(this.jMenuItemGuardarCambiosTablaMensajeCorreoInven);		
			this.jmenuAccionesMensajeCorreoInven.add(this.jMenuItemDuplicarMensajeCorreoInven);		
			this.jmenuAccionesMensajeCorreoInven.add(this.jMenuItemCopiarMensajeCorreoInven);		
			this.jmenuAccionesMensajeCorreoInven.add(this.jMenuItemVerFormMensajeCorreoInven);		
			
			this.jmenuDatosMensajeCorreoInven.add(this.jMenuItemRecargarInformacionMensajeCorreoInven);				
			this.jmenuDatosMensajeCorreoInven.add(this.jMenuItemAnterioresMensajeCorreoInven);				
			this.jmenuDatosMensajeCorreoInven.add(this.jMenuItemSiguientesMensajeCorreoInven);				
			this.jmenuDatosMensajeCorreoInven.add(this.jMenuItemAbrirOrderByMensajeCorreoInven);				
			this.jmenuDatosMensajeCorreoInven.add(this.jMenuItemMostrarOcultarMensajeCorreoInven);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesMensajeCorreoInven.add(this.jMenuItemGuardarCambiosMensajeCorreoInven);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarMensajeCorreoInven.add(this.jmenuArchivoMensajeCorreoInven);		
			this.jmenuBarMensajeCorreoInven.add(this.jmenuAccionesMensajeCorreoInven);		
			this.jmenuBarMensajeCorreoInven.add(this.jmenuDatosMensajeCorreoInven);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarMensajeCorreoInven);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasMensajeCorreoInven() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdTipoMensajeCorreoInvenMensajeCorreoInven=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoMensajeCorreoInvenMensajeCorreoInven.setToolTipText("Buscar Por T. Mensaje Correo ");
		this.jButtonFK_IdTipoMensajeCorreoInvenMensajeCorreoInven= new JButtonMe();
		this.jButtonFK_IdTipoMensajeCorreoInvenMensajeCorreoInven.setText("Buscar");
		this.jButtonFK_IdTipoMensajeCorreoInvenMensajeCorreoInven.setToolTipText("Buscar Por T. Mensaje Correo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoMensajeCorreoInvenMensajeCorreoInven,"buscar_button","Buscar Por T. Mensaje Correo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoMensajeCorreoInvenMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInvenMensajeCorreoInven = new JLabelMe();
		jLabelid_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInvenMensajeCorreoInven.setText("T. Mensaje Correo :");
		jLabelid_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInvenMensajeCorreoInven.setToolTipText("T. Mensaje Correo");
		jLabelid_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInvenMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInvenMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInvenMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInvenMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInvenMensajeCorreoInven= new JComboBoxMe();
		jComboBoxid_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInvenMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInvenMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInvenMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInvenMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasMensajeCorreoInven=new JTabbedPane();


		this.jTabbedPaneBusquedasMensajeCorreoInven.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasMensajeCorreoInven.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasMensajeCorreoInven.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasMensajeCorreoInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleMensajeCorreoInven = new MensajeCorreoInvenDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Mensaje Correo DATOS");
			this.jInternalFrameDetalleFormMensajeCorreoInven = new MensajeCorreoInvenDetalleFormJInternalFrame(jDesktopPane,this.mensajecorreoinvenSessionBean.getConGuardarRelaciones(),this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormMensajeCorreoInven = null;//new MensajeCorreoInvenDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutMensajeCorreoInven= new GridBagLayout();
		
		
		this.jTableDatosMensajeCorreoInven = new JTableMe();      
		
		String sToolTipMensajeCorreoInven="";
		sToolTipMensajeCorreoInven=MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipMensajeCorreoInven+="(Inventario.MensajeCorreoInven)";
		}
		
		if(!this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipMensajeCorreoInven+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosMensajeCorreoInven.setToolTipText(sToolTipMensajeCorreoInven);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosMensajeCorreoInven);
		this.jTableDatosMensajeCorreoInven.setAutoCreateRowSorter(true);
		this.jTableDatosMensajeCorreoInven.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosMensajeCorreoInven.setRowSelectionAllowed(true);
		this.jTableDatosMensajeCorreoInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoMensajeCorreoInven = new JButtonMe();
		this.jButtonDuplicarMensajeCorreoInven = new JButtonMe();
		this.jButtonCopiarMensajeCorreoInven = new JButtonMe();
		this.jButtonVerFormMensajeCorreoInven = new JButtonMe();
		this.jButtonNuevoRelacionesMensajeCorreoInven = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaMensajeCorreoInven = new JButtonMe();
		this.jButtonCerrarMensajeCorreoInven = new JButtonMe();
		
		this.jScrollPanelDatosMensajeCorreoInven = new JScrollPane();   
        this.jScrollPanelDatosGeneralMensajeCorreoInven = new JScrollPane();
		
				
		
		
		this.jPanelAccionesMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Mensaje Correo";
		
		if(!this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mensaje Correoes" + this.sPath));
		} else {
			this.jScrollPanelDatosMensajeCorreoInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesMensajeCorreoInven.setToolTipText("Acciones");
        this.jPanelAccionesMensajeCorreoInven.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoMensajeCorreoInven=new ReporteDinamicoJInternalFrame(MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoMensajeCorreoInven();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionMensajeCorreoInven=new ImportacionJInternalFrame(MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionMensajeCorreoInven();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByMensajeCorreoInven = new JButtonMe();
		
		this.jButtonAbrirOrderByMensajeCorreoInven.setText("Orden");
		this.jButtonAbrirOrderByMensajeCorreoInven.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByMensajeCorreoInven,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByMensajeCorreoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMensajeCorreoInven,false,this);
			
			//this.cargarOrderByMensajeCorreoInven(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByMensajeCorreoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMensajeCorreoInven,true,this);
			
			//this.cargarOrderByMensajeCorreoInven(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosMensajeCorreoInven.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosMensajeCorreoInven.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosMensajeCorreoInven.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosMensajeCorreoInven.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosMensajeCorreoInven.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosMensajeCorreoInven.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoMensajeCorreoInven.setText("Nuevo");
		this.jButtonDuplicarMensajeCorreoInven.setText("Duplicar");
		this.jButtonCopiarMensajeCorreoInven.setText("Copiar");
		this.jButtonVerFormMensajeCorreoInven.setText("Ver");
		this.jButtonNuevoRelacionesMensajeCorreoInven.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaMensajeCorreoInven.setText("Guardar");
		this.jButtonCerrarMensajeCorreoInven.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoMensajeCorreoInven,"nuevo_button","Nuevo",this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarMensajeCorreoInven,"duplicar_button","Duplicar",this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarMensajeCorreoInven,"copiar_button","Copiar",this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormMensajeCorreoInven,"ver_form","Ver",this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesMensajeCorreoInven,"nuevorelaciones_button","Nuevo Rel",this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaMensajeCorreoInven,"guardarcambiostabla_button","Guardar",this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarMensajeCorreoInven,"cerrar_button","Salir",this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoMensajeCorreoInven.setToolTipText("Nuevo"+" "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarMensajeCorreoInven.setToolTipText("Duplicar"+" "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarMensajeCorreoInven.setToolTipText("Copiar"+" "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormMensajeCorreoInven.setToolTipText("Ver"+" "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesMensajeCorreoInven.setToolTipText("Nuevo Rel"+" "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaMensajeCorreoInven.setToolTipText("Guardar"+" "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarMensajeCorreoInven.setToolTipText("Salir"+" "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoMensajeCorreoInven";
		inputMap = this.jButtonNuevoMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoMensajeCorreoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoMensajeCorreoInven"));
		
		//DUPLICAR
		sMapKey = "DuplicarMensajeCorreoInven";
		inputMap = this.jButtonDuplicarMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarMensajeCorreoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarMensajeCorreoInven"));
		
		//COPIAR
		sMapKey = "CopiarMensajeCorreoInven";
		inputMap = this.jButtonCopiarMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarMensajeCorreoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarMensajeCorreoInven"));
		
		//VEr FORM
		sMapKey = "VerFormMensajeCorreoInven";
		inputMap = this.jButtonVerFormMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormMensajeCorreoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormMensajeCorreoInven"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesMensajeCorreoInven";
		inputMap = this.jButtonNuevoRelacionesMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesMensajeCorreoInven"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarMensajeCorreoInven";
		inputMap = this.jButtonModificarMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarMensajeCorreoInven"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarMensajeCorreoInven";
		inputMap = this.jButtonCerrarMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarMensajeCorreoInven"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaMensajeCorreoInven";
		inputMap = this.jButtonGuardarCambiosTablaMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaMensajeCorreoInven"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1MensajeCorreoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2MensajeCorreoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3MensajeCorreoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4MensajeCorreoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5MensajeCorreoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesMensajeCorreoInven.setName("jPanelParametrosReportesMensajeCorreoInven"); 
		
		this.jPanelParametrosReportesAccionesMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesMensajeCorreoInven.setName("jPanelParametrosReportesAccionesMensajeCorreoInven"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionMensajeCorreoInven = new JButtonMe();
		this.jButtonRecargarInformacionMensajeCorreoInven.setText("Recargar");
		this.jButtonRecargarInformacionMensajeCorreoInven.setToolTipText("Recargar"+" "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionMensajeCorreoInven,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionMensajeCorreoInven = new JButtonMe();
		this.jButtonProcesarInformacionMensajeCorreoInven.setText("Procesar");
		this.jButtonProcesarInformacionMensajeCorreoInven.setToolTipText("Procesar"+" "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionMensajeCorreoInven.setVisible(false);
			
		this.jButtonProcesarInformacionMensajeCorreoInven.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionMensajeCorreoInven.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionMensajeCorreoInven.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesMensajeCorreoInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMensajeCorreoInven.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesMensajeCorreoInven.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesMensajeCorreoInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMensajeCorreoInven.setText("TIPO");       
		this.jComboBoxTiposReportesMensajeCorreoInven.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesMensajeCorreoInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMensajeCorreoInven.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesMensajeCorreoInven.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionMensajeCorreoInven = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionMensajeCorreoInven.setText("Paginacion");
		this.jComboBoxTiposPaginacionMensajeCorreoInven.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesMensajeCorreoInven = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesMensajeCorreoInven.setText("Accion");
		this.jComboBoxTiposRelacionesMensajeCorreoInven.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesMensajeCorreoInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesMensajeCorreoInven.setText("Accion");
		this.jComboBoxTiposAccionesMensajeCorreoInven.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarMensajeCorreoInven = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarMensajeCorreoInven.setText("Accion");
		this.jComboBoxTiposSeleccionarMensajeCorreoInven.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralMensajeCorreoInven=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralMensajeCorreoInven.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralMensajeCorreoInven.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralMensajeCorreoInven.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesMensajeCorreoInven = new JLabelMe();
		
		this.jLabelAccionesMensajeCorreoInven.setText("Acciones");		
		this.jLabelAccionesMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosMensajeCorreoInven = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosMensajeCorreoInven.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosMensajeCorreoInven.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosMensajeCorreoInven = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosMensajeCorreoInven.setText("Seleccionados");
		this.jCheckBoxSeleccionadosMensajeCorreoInven.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaMensajeCorreoInven = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaMensajeCorreoInven.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaMensajeCorreoInven.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteMensajeCorreoInven = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteMensajeCorreoInven.setText("Graf.");
		this.jCheckBoxConGraficoReporteMensajeCorreoInven.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresMensajeCorreoInven = new JButtonMe();
		//this.jButtonAnterioresMensajeCorreoInven.setText("<<");
        this.jButtonAnterioresMensajeCorreoInven.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresMensajeCorreoInven,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesMensajeCorreoInven = new JButtonMe();
		//this.jButtonSiguientesMensajeCorreoInven.setText(">>");
        this.jButtonSiguientesMensajeCorreoInven.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesMensajeCorreoInven,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosMensajeCorreoInven = new JButtonMe();
		this.jButtonNuevoGuardarCambiosMensajeCorreoInven.setText("Nue");
        this.jButtonNuevoGuardarCambiosMensajeCorreoInven.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosMensajeCorreoInven,"nuevoguardarcambios_button","Nue",this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosMensajeCorreoInven";
		inputMap = this.jButtonNuevoGuardarCambiosMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosMensajeCorreoInven"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionMensajeCorreoInven";
		inputMap = this.jButtonRecargarInformacionMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionMensajeCorreoInven"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesMensajeCorreoInven";
		inputMap = this.jButtonSiguientesMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesMensajeCorreoInven"));
		
		//ANTERIORES		
		sMapKey = "AnterioresMensajeCorreoInven";
		inputMap = this.jButtonAnterioresMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresMensajeCorreoInven"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasMensajeCorreoInven();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesMensajeCorreoInven.setMinimumSize(new Dimension(this.getWidth(),MensajeCorreoInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MensajeCorreoInvenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesMensajeCorreoInven.setMaximumSize(new Dimension(this.getWidth(),MensajeCorreoInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MensajeCorreoInvenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesMensajeCorreoInven.setPreferredSize(new Dimension(this.getWidth(),MensajeCorreoInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MensajeCorreoInvenBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionMensajeCorreoInven = new GridBagLayout();

			this.jPanelPaginacionMensajeCorreoInven.setLayout(gridaBagLayoutPaginacionMensajeCorreoInven);						
			
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMensajeCorreoInven.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMensajeCorreoInven.gridy = 0;
			this.gridBagConstraintsMensajeCorreoInven.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionMensajeCorreoInven.add(this.jButtonAnterioresMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
					
						
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMensajeCorreoInven.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsMensajeCorreoInven.gridy = 0;
			
			this.jPanelPaginacionMensajeCorreoInven.add(this.jButtonNuevoGuardarCambiosMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
						
			
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMensajeCorreoInven.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsMensajeCorreoInven.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsMensajeCorreoInven.gridy = 0;
			this.jPanelPaginacionMensajeCorreoInven.add(this.jButtonSiguientesMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMensajeCorreoInven.gridy = 1;
			this.gridBagConstraintsMensajeCorreoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMensajeCorreoInven.add(this.jButtonNuevoMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
				this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsMensajeCorreoInven.gridy = 1;
				this.gridBagConstraintsMensajeCorreoInven.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionMensajeCorreoInven.add(this.jButtonNuevoRelacionesMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
			}
			
			
			if(!this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
				this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsMensajeCorreoInven.gridy = 1;
				this.gridBagConstraintsMensajeCorreoInven.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionMensajeCorreoInven.add(this.jButtonGuardarCambiosTablaMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
			}
			
			
			
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMensajeCorreoInven.gridy = 1;
			this.gridBagConstraintsMensajeCorreoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMensajeCorreoInven.add(this.jButtonDuplicarMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
			
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMensajeCorreoInven.gridy = 1;
			this.gridBagConstraintsMensajeCorreoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMensajeCorreoInven.add(this.jButtonCopiarMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
		
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMensajeCorreoInven.gridy = 1;
			this.gridBagConstraintsMensajeCorreoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMensajeCorreoInven.add(this.jButtonVerFormMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
		
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMensajeCorreoInven.gridy = 1;
			this.gridBagConstraintsMensajeCorreoInven.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionMensajeCorreoInven.add(this.jButtonCerrarMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
		
		
		
		this.jButtonRecargarInformacionMensajeCorreoInven.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionMensajeCorreoInven.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionMensajeCorreoInven.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesMensajeCorreoInven.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesMensajeCorreoInven.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesMensajeCorreoInven.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesMensajeCorreoInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesMensajeCorreoInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesMensajeCorreoInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesMensajeCorreoInven.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesMensajeCorreoInven.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesMensajeCorreoInven.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionMensajeCorreoInven.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionMensajeCorreoInven.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionMensajeCorreoInven.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesMensajeCorreoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesMensajeCorreoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesMensajeCorreoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesMensajeCorreoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMensajeCorreoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMensajeCorreoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarMensajeCorreoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarMensajeCorreoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarMensajeCorreoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaMensajeCorreoInven.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaMensajeCorreoInven.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaMensajeCorreoInven.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteMensajeCorreoInven.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteMensajeCorreoInven.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteMensajeCorreoInven.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosMensajeCorreoInven.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosMensajeCorreoInven.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosMensajeCorreoInven.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosMensajeCorreoInven.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosMensajeCorreoInven.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosMensajeCorreoInven.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesMensajeCorreoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesMensajeCorreoInven = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1MensajeCorreoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2MensajeCorreoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3MensajeCorreoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4MensajeCorreoInven = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesMensajeCorreoInven.setLayout(gridaBagParametrosReportesMensajeCorreoInven);
			this.jPanelParametrosReportesAccionesMensajeCorreoInven.setLayout(gridaBagParametrosReportesAccionesMensajeCorreoInven);
			
			
			this.jPanelParametrosAuxiliar1MensajeCorreoInven.setLayout(gridaBagParametrosAuxiliar1MensajeCorreoInven);
			this.jPanelParametrosAuxiliar2MensajeCorreoInven.setLayout(gridaBagParametrosAuxiliar2MensajeCorreoInven);
			this.jPanelParametrosAuxiliar3MensajeCorreoInven.setLayout(gridaBagParametrosAuxiliar3MensajeCorreoInven);
			this.jPanelParametrosAuxiliar4MensajeCorreoInven.setLayout(gridaBagParametrosAuxiliar4MensajeCorreoInven);
			//this.jPanelParametrosAuxiliar5MensajeCorreoInven.setLayout(gridaBagParametrosAuxiliar2MensajeCorreoInven);			
			
			
			
			
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMensajeCorreoInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMensajeCorreoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMensajeCorreoInven.add(this.jButtonRecargarInformacionMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMensajeCorreoInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMensajeCorreoInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MensajeCorreoInven.add(this.jComboBoxTiposPaginacionMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMensajeCorreoInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMensajeCorreoInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MensajeCorreoInven.add(this.jCheckBoxConAltoMaximoTablaMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMensajeCorreoInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMensajeCorreoInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MensajeCorreoInven.add(this.jComboBoxTiposArchivosReportesMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMensajeCorreoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMensajeCorreoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMensajeCorreoInven.add(this.jPanelParametrosAuxiliar1MensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMensajeCorreoInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMensajeCorreoInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4MensajeCorreoInven.add(this.jComboBoxTiposReportesMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMensajeCorreoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMensajeCorreoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMensajeCorreoInven.add(this.jPanelParametrosAuxiliar4MensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMensajeCorreoInven.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsMensajeCorreoInven.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMensajeCorreoInven.add(this.jComboBoxTiposReportesMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMensajeCorreoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMensajeCorreoInven.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMensajeCorreoInven.add(this.jCheckBoxGenerarReporteMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMensajeCorreoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMensajeCorreoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMensajeCorreoInven.add(this.jPanelParametrosAuxiliar2MensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMensajeCorreoInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMensajeCorreoInven.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMensajeCorreoInven.add(this.jLabelAccionesMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
				this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsMensajeCorreoInven.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsMensajeCorreoInven.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesMensajeCorreoInven.add(this.jButtonAbrirOrderByMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsMensajeCorreoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMensajeCorreoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMensajeCorreoInven.add(this.jComboBoxTiposSeleccionarMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);			
			
			
			/*
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMensajeCorreoInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMensajeCorreoInven.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMensajeCorreoInven.add(this.jCheckBoxSeleccionarTodosMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMensajeCorreoInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMensajeCorreoInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3MensajeCorreoInven.add(this.jCheckBoxSeleccionarTodosMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);															
				
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMensajeCorreoInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMensajeCorreoInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3MensajeCorreoInven.add(this.jCheckBoxSeleccionadosMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMensajeCorreoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMensajeCorreoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMensajeCorreoInven.add(this.jPanelParametrosAuxiliar3MensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMensajeCorreoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMensajeCorreoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMensajeCorreoInven.add(this.jComboBoxTiposRelacionesMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
				
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMensajeCorreoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMensajeCorreoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMensajeCorreoInven.add(this.jComboBoxTiposAccionesMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
	
				
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMensajeCorreoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMensajeCorreoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMensajeCorreoInven.add(this.jTextFieldValorCampoGeneralMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosMensajeCorreoInven = new GridBagLayout();

			this.jScrollPanelDatosMensajeCorreoInven.setLayout(gridaBagLayoutDatosMensajeCorreoInven);
			
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMensajeCorreoInven.gridy = 0;
			this.gridBagConstraintsMensajeCorreoInven.gridx = 0;
			
			this.jScrollPanelDatosMensajeCorreoInven.add(this.jTableDatosMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosMensajeCorreoInven.setViewportView(this.jTableDatosMensajeCorreoInven);
		this.jTableDatosMensajeCorreoInven.setFillsViewportHeight(true);
		this.jTableDatosMensajeCorreoInven.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesMensajeCorreoInven= new GridBagLayout();
		this.jPanelAccionesMensajeCorreoInven.setLayout(gridaBagLayoutAccionesMensajeCorreoInven);
		
		
		/*	
		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsMensajeCorreoInven.gridx = 0;
			
		this.jPanelAccionesMensajeCorreoInven.add(this.jButtonNuevoMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdTipoMensajeCorreoInvenMensajeCorreoInven= new GridBagLayout();
		gridaBagLayoutFK_IdTipoMensajeCorreoInvenMensajeCorreoInven.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoMensajeCorreoInvenMensajeCorreoInven.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoMensajeCorreoInvenMensajeCorreoInven.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoMensajeCorreoInvenMensajeCorreoInven.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoMensajeCorreoInvenMensajeCorreoInven.setLayout(gridaBagLayoutFK_IdTipoMensajeCorreoInvenMensajeCorreoInven);

		gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		gridBagConstraintsMensajeCorreoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMensajeCorreoInven.gridy = 0;
		gridBagConstraintsMensajeCorreoInven.gridx = 0;
		jPanelFK_IdTipoMensajeCorreoInvenMensajeCorreoInven.add(jLabelid_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInvenMensajeCorreoInven, gridBagConstraintsMensajeCorreoInven);

		gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		gridBagConstraintsMensajeCorreoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMensajeCorreoInven.gridy = 0;
		gridBagConstraintsMensajeCorreoInven.gridx = 1;
		jPanelFK_IdTipoMensajeCorreoInvenMensajeCorreoInven.add(jComboBoxid_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInvenMensajeCorreoInven, gridBagConstraintsMensajeCorreoInven);

		gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		gridBagConstraintsMensajeCorreoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMensajeCorreoInven.gridy = 1;
		gridBagConstraintsMensajeCorreoInven.gridx =1;
		jPanelFK_IdTipoMensajeCorreoInvenMensajeCorreoInven.add(jButtonFK_IdTipoMensajeCorreoInvenMensajeCorreoInven, gridBagConstraintsMensajeCorreoInven);

		jTabbedPaneBusquedasMensajeCorreoInven.addTab("1.-Por T. Mensaje Correo ", jPanelFK_IdTipoMensajeCorreoInvenMensajeCorreoInven);
		jTabbedPaneBusquedasMensajeCorreoInven.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutMensajeCorreoInven = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutMensajeCorreoInven);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();						
			this.gridBagConstraintsMensajeCorreoInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMensajeCorreoInven.gridx = 0;		
			//this.gridBagConstraintsMensajeCorreoInven.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMensajeCorreoInven.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsMensajeCorreoInven.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.gridy = iGridyPrincipal++;
		this.gridBagConstraintsMensajeCorreoInven.gridx = 0;		
		//this.gridBagConstraintsMensajeCorreoInven.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMensajeCorreoInven.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsMensajeCorreoInven.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsMensajeCorreoInven);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsMensajeCorreoInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMensajeCorreoInven.gridx = 0;		
			this.gridBagConstraintsMensajeCorreoInven.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMensajeCorreoInven.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsMensajeCorreoInven.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMensajeCorreoInven.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);								
		
		
		/*
		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMensajeCorreoInven.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
		*/		
		
		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.gridy =iGridyPrincipal++;
		this.gridBagConstraintsMensajeCorreoInven.gridx =0;
		this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsMensajeCorreoInven.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
				
		
		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMensajeCorreoInven.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(MensajeCorreoInvenJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosMensajeCorreoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosMensajeCorreoInven = new GridBagLayout();
			this.jPanelBusquedasParametrosMensajeCorreoInven.setLayout(gridaBagLayoutBusquedasParametrosMensajeCorreoInven);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralMensajeCorreoInven=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralMensajeCorreoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMensajeCorreoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMensajeCorreoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMensajeCorreoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
			
			
		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMensajeCorreoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
		
			
		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsMensajeCorreoInven.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralMensajeCorreoInven;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoMensajeCorreoInven() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoMensajeCorreoInven = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoMensajeCorreoInven.setName("jPanelReporteDinamicoMensajeCorreoInven"); 
		
		this.jPanelReporteDinamicoMensajeCorreoInven.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoMensajeCorreoInven.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoMensajeCorreoInven.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoMensajeCorreoInven.setLayout(gridaBagLayoutReporteDinamicoMensajeCorreoInven);
		
		
		this.jInternalFrameReporteDinamicoMensajeCorreoInven= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoMensajeCorreoInven = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteMensajeCorreoInven= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoMensajeCorreoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoMensajeCorreoInven.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoMensajeCorreoInven.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoMensajeCorreoInven.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoMensajeCorreoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoMensajeCorreoInven.setResizable(true);
	    this.jInternalFrameReporteDinamicoMensajeCorreoInven.setClosable(true);
	    this.jInternalFrameReporteDinamicoMensajeCorreoInven.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoMensajeCorreoInven.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoMensajeCorreoInven.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoMensajeCorreoInven.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mensaje Correoes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteMensajeCorreoInven = new JLabelMe();

		this.jLabelColumnasSelectReporteMensajeCorreoInven.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMensajeCorreoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMensajeCorreoInven.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMensajeCorreoInven.add(this.jLabelColumnasSelectReporteMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteMensajeCorreoInven = new JList<Reporte>();
		this.jListColumnasSelectReporteMensajeCorreoInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteMensajeCorreoInven.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteMensajeCorreoInven.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteMensajeCorreoInven.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteMensajeCorreoInven.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteMensajeCorreoInven=new JScrollPane(this.jListColumnasSelectReporteMensajeCorreoInven);
			
			this.jScrollColumnasSelectReporteMensajeCorreoInven.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteMensajeCorreoInven.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteMensajeCorreoInven.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMensajeCorreoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMensajeCorreoInven.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoMensajeCorreoInven.add(this.jListColumnasSelectReporteMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
		this.jPanelReporteDinamicoMensajeCorreoInven.add(this.jScrollColumnasSelectReporteMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteMensajeCorreoInven = new JLabelMe();

		this.jLabelRelacionesSelectReporteMensajeCorreoInven.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMensajeCorreoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMensajeCorreoInven.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMensajeCorreoInven.add(this.jLabelRelacionesSelectReporteMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteMensajeCorreoInven = new JList<Reporte>();
		this.jListRelacionesSelectReporteMensajeCorreoInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteMensajeCorreoInven.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteMensajeCorreoInven.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteMensajeCorreoInven.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteMensajeCorreoInven.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteMensajeCorreoInven=new JScrollPane(this.jListRelacionesSelectReporteMensajeCorreoInven);
			
			this.jScrollRelacionesSelectReporteMensajeCorreoInven.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteMensajeCorreoInven.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteMensajeCorreoInven.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMensajeCorreoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMensajeCorreoInven.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoMensajeCorreoInven.add(this.jListRelacionesSelectReporteMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
		this.jPanelReporteDinamicoMensajeCorreoInven.add(this.jScrollRelacionesSelectReporteMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoMensajeCorreoInven = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoMensajeCorreoInven = new JComboBoxMe();
		this.jListColumnasValoresGraficoMensajeCorreoInven = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoMensajeCorreoInven = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoMensajeCorreoInven.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoMensajeCorreoInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoMensajeCorreoInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoMensajeCorreoInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoMensajeCorreoInven = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoMensajeCorreoInven.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoMensajeCorreoInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoMensajeCorreoInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoMensajeCorreoInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoMensajeCorreoInven = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoMensajeCorreoInven.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMensajeCorreoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMensajeCorreoInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMensajeCorreoInven.add(this.jLabelGenerarExcelReporteDinamicoMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoMensajeCorreoInven = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoMensajeCorreoInven.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoMensajeCorreoInven,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoMensajeCorreoInven.setToolTipText("Generar EXCEL"+" "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsMensajeCorreoInven.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsMensajeCorreoInven.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoMensajeCorreoInven.add(this.jButtonGenerarExcelReporteDinamicoMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMensajeCorreoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMensajeCorreoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMensajeCorreoInven.add(this.jComboBoxTiposReportesDinamicoMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoMensajeCorreoInven = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoMensajeCorreoInven.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMensajeCorreoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMensajeCorreoInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMensajeCorreoInven.add(this.jLabelTiposArchivoReporteDinamicoMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMensajeCorreoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMensajeCorreoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMensajeCorreoInven.add(this.jComboBoxTiposArchivosReportesDinamicoMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoMensajeCorreoInven = new JButtonMe();
		this.jButtonGenerarReporteDinamicoMensajeCorreoInven.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoMensajeCorreoInven,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoMensajeCorreoInven.setToolTipText("Generar"+" "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMensajeCorreoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMensajeCorreoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMensajeCorreoInven.add(this.jButtonGenerarReporteDinamicoMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoMensajeCorreoInven = new JButtonMe();
		this.jButtonCerrarReporteDinamicoMensajeCorreoInven.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoMensajeCorreoInven,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoMensajeCorreoInven.setToolTipText("Cancelar"+" "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMensajeCorreoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMensajeCorreoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMensajeCorreoInven.add(this.jButtonCerrarReporteDinamicoMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalMensajeCorreoInven = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoMensajeCorreoInven= new JScrollPane(jPanelReporteDinamicoMensajeCorreoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoMensajeCorreoInven.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoMensajeCorreoInven.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoMensajeCorreoInven.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mensaje Correoes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsMensajeCorreoInven.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoMensajeCorreoInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoMensajeCorreoInven.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalMensajeCorreoInven);
		this.jInternalFrameReporteDinamicoMensajeCorreoInven.getContentPane().add(this.jScrollPanelReporteDinamicoMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionMensajeCorreoInven() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionMensajeCorreoInven = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionMensajeCorreoInven.setName("jPanelImportacionMensajeCorreoInven"); 
		
		this.jPanelImportacionMensajeCorreoInven.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionMensajeCorreoInven.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionMensajeCorreoInven.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionMensajeCorreoInven.setLayout(gridaBagLayoutImportacionMensajeCorreoInven);
		
		
		this.jInternalFrameImportacionMensajeCorreoInven= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionMensajeCorreoInven= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionMensajeCorreoInven = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteMensajeCorreoInven= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionMensajeCorreoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionMensajeCorreoInven.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionMensajeCorreoInven.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionMensajeCorreoInven.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionMensajeCorreoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionMensajeCorreoInven.setResizable(true);
	    this.jInternalFrameImportacionMensajeCorreoInven.setClosable(true);
	    this.jInternalFrameImportacionMensajeCorreoInven.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionMensajeCorreoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionMensajeCorreoInven.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionMensajeCorreoInven.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionMensajeCorreoInven.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionMensajeCorreoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionMensajeCorreoInven.setResizable(true);
	    this.jInternalFrameImportacionMensajeCorreoInven.setClosable(true);
	    this.jInternalFrameImportacionMensajeCorreoInven.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionMensajeCorreoInven.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionMensajeCorreoInven.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionMensajeCorreoInven.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mensaje Correoes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionMensajeCorreoInven = new JLabelMe();

		this.jLabelArchivoImportacionMensajeCorreoInven.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMensajeCorreoInven.gridy = iPosYImportacion;		
		this.gridBagConstraintsMensajeCorreoInven.gridx = iPosXImportacion++;
			
		this.jPanelImportacionMensajeCorreoInven.add(this.jLabelArchivoImportacionMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionMensajeCorreoInven = new JFileChooser();		
		this.jFileChooserImportacionMensajeCorreoInven.setToolTipText("ESCOGER ARCHIVO"+" "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionMensajeCorreoInven = new JButtonMe();
		this.jButtonAbrirImportacionMensajeCorreoInven.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionMensajeCorreoInven,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionMensajeCorreoInven.setToolTipText("Generar"+" "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMensajeCorreoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsMensajeCorreoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMensajeCorreoInven.add(this.jButtonAbrirImportacionMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionMensajeCorreoInven = new JLabelMe();

		this.jLabelPathArchivoImportacionMensajeCorreoInven.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMensajeCorreoInven.gridy = iPosYImportacion;		
		this.gridBagConstraintsMensajeCorreoInven.gridx = iPosXImportacion++;
			
		this.jPanelImportacionMensajeCorreoInven.add(this.jLabelPathArchivoImportacionMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionMensajeCorreoInven=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionMensajeCorreoInven.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionMensajeCorreoInven.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionMensajeCorreoInven.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMensajeCorreoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsMensajeCorreoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMensajeCorreoInven.add(this.jTextFieldPathArchivoImportacionMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionMensajeCorreoInven = new JButtonMe();
		this.jButtonGenerarImportacionMensajeCorreoInven.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionMensajeCorreoInven,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionMensajeCorreoInven.setToolTipText("Generar"+" "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMensajeCorreoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsMensajeCorreoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMensajeCorreoInven.add(this.jButtonGenerarImportacionMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionMensajeCorreoInven = new JButtonMe();
		this.jButtonCerrarImportacionMensajeCorreoInven.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionMensajeCorreoInven,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionMensajeCorreoInven.setToolTipText("Cancelar"+" "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMensajeCorreoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsMensajeCorreoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMensajeCorreoInven.add(this.jButtonCerrarImportacionMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalMensajeCorreoInven = new GridBagLayout();
		
		this.jScrollPanelImportacionMensajeCorreoInven= new JScrollPane(jPanelImportacionMensajeCorreoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMensajeCorreoInven.gridy =iPosYImportacion;
		this.gridBagConstraintsMensajeCorreoInven.gridx =iPosXImportacion;
		this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionMensajeCorreoInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionMensajeCorreoInven.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalMensajeCorreoInven);
		this.jInternalFrameImportacionMensajeCorreoInven.getContentPane().add(this.jScrollPanelImportacionMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByMensajeCorreoInven(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByMensajeCorreoInven = new JButtonMe();
			this.jButtonAbrirOrderByMensajeCorreoInven.setText("Orden");
			this.jButtonAbrirOrderByMensajeCorreoInven.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByMensajeCorreoInven,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByMensajeCorreoInven";
			inputMap = this.jButtonAbrirOrderByMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByMensajeCorreoInven"));
		
		
			GridBagLayout gridaBagLayoutOrderByMensajeCorreoInven = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByMensajeCorreoInven.setName("jPanelOrderByMensajeCorreoInven"); 
			
			this.jPanelOrderByMensajeCorreoInven.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByMensajeCorreoInven.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByMensajeCorreoInven.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByMensajeCorreoInven.setLayout(gridaBagLayoutOrderByMensajeCorreoInven);
			
			
			this.jTableDatosMensajeCorreoInvenOrderBy = new JTableMe();        
			this.jTableDatosMensajeCorreoInvenOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosMensajeCorreoInvenOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosMensajeCorreoInvenOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosMensajeCorreoInvenOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosMensajeCorreoInvenOrderBy.setViewportView(this.jTableDatosMensajeCorreoInvenOrderBy);
			this.jTableDatosMensajeCorreoInvenOrderBy.setFillsViewportHeight(true);
			this.jTableDatosMensajeCorreoInvenOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByMensajeCorreoInven= new OrderByJInternalFrame();
			this.jInternalFrameOrderByMensajeCorreoInven= new OrderByJInternalFrame();
			this.jScrollPanelOrderByMensajeCorreoInven = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteMensajeCorreoInven= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByMensajeCorreoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByMensajeCorreoInven.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByMensajeCorreoInven.setTitle("Orden");
			this.jInternalFrameOrderByMensajeCorreoInven.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByMensajeCorreoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByMensajeCorreoInven.setResizable(true);
			this.jInternalFrameOrderByMensajeCorreoInven.setClosable(true);
			this.jInternalFrameOrderByMensajeCorreoInven.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByMensajeCorreoInven.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByMensajeCorreoInven.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByMensajeCorreoInven.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mensaje Correoes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMensajeCorreoInven.gridy =iPosYOrderBy++;
			this.gridBagConstraintsMensajeCorreoInven.gridx =iPosXOrderBy;
			this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsMensajeCorreoInven.ipady =150;
				
			this.jPanelOrderByMensajeCorreoInven.add(jScrollPanelDatosMensajeCorreoInvenOrderBy, this.gridBagConstraintsMensajeCorreoInven);//this.jTableDatosMensajeCorreoInvenTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByMensajeCorreoInven = new JButtonMe();
			this.jButtonCerrarOrderByMensajeCorreoInven.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByMensajeCorreoInven,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByMensajeCorreoInven.setToolTipText("Cancelar"+" "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMensajeCorreoInven.gridy = iPosYOrderBy++;
			this.gridBagConstraintsMensajeCorreoInven.gridx = iPosXOrderBy;
									
			this.jPanelOrderByMensajeCorreoInven.add(this.jButtonCerrarOrderByMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalMensajeCorreoInven = new GridBagLayout();
			
			this.jScrollPanelOrderByMensajeCorreoInven= new JScrollPane(jPanelOrderByMensajeCorreoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMensajeCorreoInven.gridy =iPosYOrderBy;
			this.gridBagConstraintsMensajeCorreoInven.gridx =iPosXOrderBy;
			this.gridBagConstraintsMensajeCorreoInven.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByMensajeCorreoInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByMensajeCorreoInven.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalMensajeCorreoInven);
			
			this.jInternalFrameOrderByMensajeCorreoInven.getContentPane().add(this.jScrollPanelOrderByMensajeCorreoInven, this.gridBagConstraintsMensajeCorreoInven);			
		
		} else {
			this.jButtonAbrirOrderByMensajeCorreoInven = new JButtonMe();
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
		int iWidthTableCalculado=0;//1830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.mensajecorreoinvenSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosMensajeCorreoInven.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosMensajeCorreoInven.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosMensajeCorreoInven.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosMensajeCorreoInven.getRowHeight();//MensajeCorreoInvenConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > MensajeCorreoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaMensajeCorreoInven.isSelected()) {
					iHeightTable=MensajeCorreoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < MensajeCorreoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=MensajeCorreoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > MensajeCorreoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaMensajeCorreoInven.isSelected()) {
					iHeightTable=MensajeCorreoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < MensajeCorreoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=MensajeCorreoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosMensajeCorreoInven.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosMensajeCorreoInven.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosMensajeCorreoInven.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosMensajeCorreoInven.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosMensajeCorreoInven.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosMensajeCorreoInven.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByMensajeCorreoInven!=null && this.jInternalFrameOrderByMensajeCorreoInven.getjTableDatosOrderBy()!=null) {
			//if(!this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByMensajeCorreoInven.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByMensajeCorreoInven.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByMensajeCorreoInven.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByMensajeCorreoInven.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByMensajeCorreoInven.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByMensajeCorreoInven.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByMensajeCorreoInven.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosMensajeCorreoInven.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosMensajeCorreoInven.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosMensajeCorreoInven.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=mensajecorreoinvenLogic.getMensajeCorreoInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=mensajecorreoinvens.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<MensajeCorreoInven> TraerMensajeCorreoInvenBeans(List<MensajeCorreoInven> mensajecorreoinvens,ArrayList<Classe> classes)throws Exception {
		try {
			for(MensajeCorreoInven mensajecorreoinven:mensajecorreoinvens) {
					
				if(!(MensajeCorreoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || MensajeCorreoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					mensajecorreoinven.setsDetalleGeneralEntityReporte(MensajeCorreoInvenConstantesFunciones.getMensajeCorreoInvenDescripcion(mensajecorreoinven));
										
					mensajecorreoinven.setesta_activo_descripcion(MensajeCorreoInvenConstantesFunciones.getesta_activoDescripcion(mensajecorreoinven));	
					
					

					if(mensajecorreoinven.getDetalleMensajeCorreoInvens()!=null && Funciones.existeClass(classes,DetalleMensajeCorreoInven.class)) {
						try{mensajecorreoinven.setdetallemensajecorreoinvensDescripcionReporte(new JRBeanCollectionDataSource(DetalleMensajeCorreoInvenJInternalFrame.TraerDetalleMensajeCorreoInvenBeans(mensajecorreoinven.getDetalleMensajeCorreoInvens(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(mensajecorreoinven.getMailMensajeCorreoInvens()!=null && Funciones.existeClass(classes,MailMensajeCorreoInven.class)) {
						try{mensajecorreoinven.setmailmensajecorreoinvensDescripcionReporte(new JRBeanCollectionDataSource(MailMensajeCorreoInvenJInternalFrame.TraerMailMensajeCorreoInvenBeans(mensajecorreoinven.getMailMensajeCorreoInvens(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//mensajecorreoinven.setsDetalleGeneralEntityReporte(mensajecorreoinven.getsDetalleGeneralEntityReporte());
										
				}
				
				//mensajecorreoinvenbeans.add(mensajecorreoinvenbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return mensajecorreoinvens;
    }
	//PARA REPORTES FIN
}
