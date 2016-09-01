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
import com.bydan.erp.inventario.util.MailMensajeCorreoInvenConstantesFunciones;

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
public class MailMensajeCorreoInvenJInternalFrame extends MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarMailMensajeCorreoInven;
	
	protected JMenuBar jmenuBarMailMensajeCorreoInven;
	
	protected JMenu jmenuMailMensajeCorreoInven;
	protected JMenu jmenuDatosMailMensajeCorreoInven;
	protected JMenu jmenuArchivoMailMensajeCorreoInven;
	protected JMenu jmenuAccionesMailMensajeCorreoInven;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosMailMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutMailMensajeCorreoInven;	
	protected GridBagConstraints gridBagConstraintsMailMensajeCorreoInven;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public MailMensajeCorreoInvenDetalleFormJInternalFrame jInternalFrameDetalleFormMailMensajeCorreoInven;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoMailMensajeCorreoInven;	
	protected ImportacionJInternalFrame jInternalFrameImportacionMailMensajeCorreoInven;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected MensajeCorreoInvenBeanSwingJInternalFrame mensajecorreoinvenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mensajecorreoinven="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";
	
	public MailMensajeCorreoInvenSessionBean mailmensajecorreoinvenSessionBean;
		
	
	
	public MensajeCorreoInvenSessionBean mensajecorreoinvenSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ModuloSessionBean moduloSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<MailMensajeCorreoInven> mailmensajecorreoinvens;		
	public List<MailMensajeCorreoInven> mailmensajecorreoinvensEliminados;	
	public List<MailMensajeCorreoInven> mailmensajecorreoinvensAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByMailMensajeCorreoInven;		
	protected JButton jButtonAbrirOrderByMailMensajeCorreoInven;
	
	
	//protected JPanel jPanelOrderByMailMensajeCorreoInven;
	//public JScrollPane jScrollPanelOrderByMailMensajeCorreoInven;	
	//protected JButton jButtonCerrarOrderByMailMensajeCorreoInven;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public MailMensajeCorreoInvenLogic mailmensajecorreoinvenLogic;
	
	
	
	public JScrollPane jScrollPanelDatosMailMensajeCorreoInven;
	public JScrollPane jScrollPanelDatosEdicionMailMensajeCorreoInven;
	public JScrollPane jScrollPanelDatosGeneralMailMensajeCorreoInven;
    
	
	
	//public JScrollPane jScrollPanelDatosMailMensajeCorreoInvenOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoMailMensajeCorreoInven;
	//public JScrollPane jScrollPanelImportacionMailMensajeCorreoInven;
	
	
	
	protected JPanel jPanelAccionesMailMensajeCorreoInven;
	
    protected JPanel jPanelPaginacionMailMensajeCorreoInven;
    protected JPanel jPanelParametrosReportesMailMensajeCorreoInven;
	protected JPanel jPanelParametrosReportesAccionesMailMensajeCorreoInven;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1MailMensajeCorreoInven;
	protected JPanel jPanelParametrosAuxiliar2MailMensajeCorreoInven;
	protected JPanel jPanelParametrosAuxiliar3MailMensajeCorreoInven;
	protected JPanel jPanelParametrosAuxiliar4MailMensajeCorreoInven;
	//protected JPanel jPanelParametrosAuxiliar5MailMensajeCorreoInven;
	
	
	
	//protected JPanel jPanelReporteDinamicoMailMensajeCorreoInven;
	//protected JPanel jPanelImportacionMailMensajeCorreoInven;
	
	
	public JTable jTableDatosMailMensajeCorreoInven;
	
	
	
	//public JTable jTableDatosMailMensajeCorreoInvenOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoMailMensajeCorreoInven;
	protected JButton jButtonDuplicarMailMensajeCorreoInven;
	protected JButton jButtonCopiarMailMensajeCorreoInven;
	protected JButton jButtonVerFormMailMensajeCorreoInven;
	protected JButton jButtonNuevoRelacionesMailMensajeCorreoInven;
	protected JButton jButtonModificarMailMensajeCorreoInven;
	
    protected JButton jButtonGuardarCambiosTablaMailMensajeCorreoInven;
	protected JButton jButtonCerrarMailMensajeCorreoInven;
	
	
	protected JButton jButtonRecargarInformacionMailMensajeCorreoInven;
	protected JButton jButtonProcesarInformacionMailMensajeCorreoInven;
	
	
	protected JButton jButtonAnterioresMailMensajeCorreoInven;
	protected JButton jButtonSiguientesMailMensajeCorreoInven;
	protected JButton jButtonNuevoGuardarCambiosMailMensajeCorreoInven;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoMailMensajeCorreoInven;
	//protected JButton jButtonCerrarReporteDinamicoMailMensajeCorreoInven;
	//protected JButton jButtonGenerarExcelReporteDinamicoMailMensajeCorreoInven;	
	
	
	
	//protected JButton jButtonAbrirImportacionMailMensajeCorreoInven;
	//protected JButton jButtonGenerarImportacionMailMensajeCorreoInven;
	//protected JButton jButtonCerrarImportacionMailMensajeCorreoInven;
	//protected JFileChooser jFileChooserImportacionMailMensajeCorreoInven;
	//protected File fileImportacionMailMensajeCorreoInven;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarMailMensajeCorreoInven;
	protected JButton jButtonDuplicarToolBarMailMensajeCorreoInven;
	protected JButton jButtonNuevoRelacionesToolBarMailMensajeCorreoInven;
	
	
	public JButton jButtonGuardarCambiosToolBarMailMensajeCorreoInven;
	protected JButton jButtonCopiarToolBarMailMensajeCorreoInven;
	protected JButton jButtonVerFormToolBarMailMensajeCorreoInven;
	public JButton jButtonGuardarCambiosTablaToolBarMailMensajeCorreoInven;
	protected JButton jButtonMostrarOcultarTablaToolBarMailMensajeCorreoInven;
	protected JButton jButtonCerrarToolBarMailMensajeCorreoInven;
	
	protected JButton jButtonRecargarInformacionToolBarMailMensajeCorreoInven;
	protected JButton jButtonProcesarInformacionToolBarMailMensajeCorreoInven;
	protected JButton jButtonAnterioresToolBarMailMensajeCorreoInven;
	protected JButton jButtonSiguientesToolBarMailMensajeCorreoInven;
	protected JButton jButtonNuevoGuardarCambiosToolBarMailMensajeCorreoInven;
	protected JButton jButtonAbrirOrderByToolBarMailMensajeCorreoInven;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoMailMensajeCorreoInven;
	protected JMenuItem jMenuItemDuplicarMailMensajeCorreoInven;
	protected JMenuItem jMenuItemNuevoRelacionesMailMensajeCorreoInven;
	
	
	protected JMenuItem jMenuItemGuardarCambiosMailMensajeCorreoInven;
	protected JMenuItem jMenuItemCopiarMailMensajeCorreoInven;
	protected JMenuItem jMenuItemVerFormMailMensajeCorreoInven;
	protected JMenuItem jMenuItemGuardarCambiosTablaMailMensajeCorreoInven;
	protected JMenuItem jMenuItemCerrarMailMensajeCorreoInven;
	protected JMenuItem jMenuItemDetalleCerrarMailMensajeCorreoInven;
	protected JMenuItem jMenuItemDetalleAbrirOrderByMailMensajeCorreoInven;
	protected JMenuItem jMenuItemDetalleMostarOcultarMailMensajeCorreoInven;
	
	protected JMenuItem jMenuItemRecargarInformacionMailMensajeCorreoInven;
	protected JMenuItem jMenuItemProcesarInformacionMailMensajeCorreoInven;
	protected JMenuItem jMenuItemAnterioresMailMensajeCorreoInven;
	protected JMenuItem jMenuItemSiguientesMailMensajeCorreoInven;
	protected JMenuItem jMenuItemNuevoGuardarCambiosMailMensajeCorreoInven;
	protected JMenuItem jMenuItemAbrirOrderByMailMensajeCorreoInven;
	protected JMenuItem jMenuItemMostrarOcultarMailMensajeCorreoInven;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesMailMensajeCorreoInven;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosMailMensajeCorreoInven;
	protected JCheckBox jCheckBoxSeleccionadosMailMensajeCorreoInven;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaMailMensajeCorreoInven;
	protected JCheckBox jCheckBoxConGraficoReporteMailMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesMailMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesMailMensajeCorreoInven;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoMailMensajeCorreoInven;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoMailMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesMailMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionMailMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesMailMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesMailMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarMailMensajeCorreoInven;
	protected JTextField jTextFieldValorCampoGeneralMailMensajeCorreoInven;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteMailMensajeCorreoInven;
	//public JList<Reporte> jListColumnasSelectReporteMailMensajeCorreoInven;
	//public JScrollPane jScrollColumnasSelectReporteMailMensajeCorreoInven;
	
	//public JLabel jLabelRelacionesSelectReporteMailMensajeCorreoInven;
	//public JList<Reporte> jListRelacionesSelectReporteMailMensajeCorreoInven;
	//public JScrollPane jScrollRelacionesSelectReporteMailMensajeCorreoInven;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoMailMensajeCorreoInven;
	//protected JCheckBox jCheckBoxConGraficoDinamicoMailMensajeCorreoInven;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoMailMensajeCorreoInven;
	//public JLabel jLabelTiposArchivoReporteDinamicoMailMensajeCorreoInven;
	
		
	//public JLabel jLabelArchivoImportacionMailMensajeCorreoInven;	
	//public JLabel jLabelPathArchivoImportacionMailMensajeCorreoInven;
	//protected JTextField jTextFieldPathArchivoImportacionMailMensajeCorreoInven;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoMailMensajeCorreoInven;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoMailMensajeCorreoInven;
	
	//public JLabel jLabelColumnaCategoriaValorMailMensajeCorreoInven;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorMailMensajeCorreoInven;
	
	//public JLabel jLabelColumnasValoresGraficoMailMensajeCorreoInven;
	//public JList<Reporte> jListColumnasValoresGraficoMailMensajeCorreoInven;
	//public JScrollPane jScrollColumnasValoresGraficoMailMensajeCorreoInven;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoMailMensajeCorreoInven;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoMailMensajeCorreoInven;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasMailMensajeCorreoInven;
	public JPanel jPanelFK_IdMensajeCorreoInvenMailMensajeCorreoInven;
	public JButton jButtonFK_IdMensajeCorreoInvenMailMensajeCorreoInven;
	
	public JPanel jPanelid_mensaje_correo_invenFK_IdMensajeCorreoInvenMailMensajeCorreoInven;
	public JLabel jLabelid_mensaje_correo_invenFK_IdMensajeCorreoInvenMailMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenMailMensajeCorreoInven;
	public JButton jButtonid_mensaje_correo_invenFK_IdMensajeCorreoInvenMailMensajeCorreoInven= new JButtonMe();
	public JButton jButtonid_mensaje_correo_invenFK_IdMensajeCorreoInvenMailMensajeCorreoInvenUpdate= new JButtonMe();
	public JButton jButtonid_mensaje_correo_invenFK_IdMensajeCorreoInvenMailMensajeCorreoInvenBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public MailMensajeCorreoInvenJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("MailMensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MailMensajeCorreoInvenJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MailMensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MailMensajeCorreoInvenJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MailMensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MailMensajeCorreoInvenJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("MailMensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionMailMensajeCorreoInven)	{
		this.jButtonRecargarInformacionMailMensajeCorreoInven = jButtonRecargarInformacionMailMensajeCorreoInven;
	}
	
	public JButton getjButtonProcesarInformacionMailMensajeCorreoInven() {
		return this.jButtonProcesarInformacionMailMensajeCorreoInven;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionMailMensajeCorreoInven)	{
		this.jButtonProcesarInformacionMailMensajeCorreoInven = jButtonProcesarInformacionMailMensajeCorreoInven;
	}
	
	
	public JButton getjButtonRecargarInformacionMailMensajeCorreoInven() {
		return this.jButtonRecargarInformacionMailMensajeCorreoInven;
	}
	
	
	public List<MailMensajeCorreoInven> getmailmensajecorreoinvens() {
		return this.mailmensajecorreoinvens;
	}

	public void setmailmensajecorreoinvens(List<MailMensajeCorreoInven> mailmensajecorreoinvens) {
		this.mailmensajecorreoinvens = mailmensajecorreoinvens;
	}
	
	public List<MailMensajeCorreoInven> getmailmensajecorreoinvensAux() {
		return this.mailmensajecorreoinvensAux;
	}

	public void setmailmensajecorreoinvensAux(List<MailMensajeCorreoInven> mailmensajecorreoinvensAux) {
		this.mailmensajecorreoinvensAux = mailmensajecorreoinvensAux;
	}
	
	public List<MailMensajeCorreoInven> getmailmensajecorreoinvensEliminados() {
		return this.mailmensajecorreoinvensEliminados;
	}

	public void setMailMensajeCorreoInvensEliminados(List<MailMensajeCorreoInven> mailmensajecorreoinvensEliminados) {
		this.mailmensajecorreoinvensEliminados = mailmensajecorreoinvensEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarMailMensajeCorreoInven() {
		return jComboBoxTiposSeleccionarMailMensajeCorreoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarMailMensajeCorreoInven(
			JComboBox jComboBoxTiposSeleccionarMailMensajeCorreoInven) {
		this.jComboBoxTiposSeleccionarMailMensajeCorreoInven = jComboBoxTiposSeleccionarMailMensajeCorreoInven;
	}
	
	public void setBorderResaltarTiposSeleccionarMailMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarMailMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarMailMensajeCorreoInven .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralMailMensajeCorreoInven() {
		return jTextFieldValorCampoGeneralMailMensajeCorreoInven;
	}

	public void setjTextFieldValorCampoGeneralMailMensajeCorreoInven(
			JTextField jTextFieldValorCampoGeneralMailMensajeCorreoInven) {
		this.jTextFieldValorCampoGeneralMailMensajeCorreoInven = jTextFieldValorCampoGeneralMailMensajeCorreoInven;
	}

	public void setBorderResaltarValorCampoGeneralMailMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMailMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralMailMensajeCorreoInven .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosMailMensajeCorreoInven() {
		return this.jCheckBoxSeleccionarTodosMailMensajeCorreoInven;
	}

	public void setjCheckBoxSeleccionarTodosMailMensajeCorreoInven(
			JCheckBox jCheckBoxSeleccionarTodosMailMensajeCorreoInven) {
		this.jCheckBoxSeleccionarTodosMailMensajeCorreoInven = jCheckBoxSeleccionarTodosMailMensajeCorreoInven;
	}

	public void setBorderResaltarSeleccionarTodosMailMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMailMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosMailMensajeCorreoInven .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosMailMensajeCorreoInven() {
		return this.jCheckBoxSeleccionadosMailMensajeCorreoInven;
	}

	public void setjCheckBoxSeleccionadosMailMensajeCorreoInven(
			JCheckBox jCheckBoxSeleccionadosMailMensajeCorreoInven) {
		this.jCheckBoxSeleccionadosMailMensajeCorreoInven = jCheckBoxSeleccionadosMailMensajeCorreoInven;
	}
	
	public void setBorderResaltarSeleccionadosMailMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMailMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosMailMensajeCorreoInven .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesMailMensajeCorreoInven() {
		return this.jComboBoxTiposArchivosReportesMailMensajeCorreoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesMailMensajeCorreoInven(
			JComboBox jComboBoxTiposArchivosReportesMailMensajeCorreoInven) {
		this.jComboBoxTiposArchivosReportesMailMensajeCorreoInven = jComboBoxTiposArchivosReportesMailMensajeCorreoInven;
	}

	public void setBorderResaltarTiposArchivosReportesMailMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMailMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesMailMensajeCorreoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesMailMensajeCorreoInven() {
		return this.jComboBoxTiposReportesMailMensajeCorreoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesMailMensajeCorreoInven(
			JComboBox jComboBoxTiposReportesMailMensajeCorreoInven) {
		this.jComboBoxTiposReportesMailMensajeCorreoInven = jComboBoxTiposReportesMailMensajeCorreoInven;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoMailMensajeCorreoInven() {
	//	return jComboBoxTiposReportesDinamicoMailMensajeCorreoInven;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoMailMensajeCorreoInven(
	//		JComboBox jComboBoxTiposReportesDinamicoMailMensajeCorreoInven) {
	//	this.jComboBoxTiposReportesDinamicoMailMensajeCorreoInven = jComboBoxTiposReportesDinamicoMailMensajeCorreoInven;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoMailMensajeCorreoInven() {
	//	return jComboBoxTiposArchivosReportesDinamicoMailMensajeCorreoInven;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoMailMensajeCorreoInven(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoMailMensajeCorreoInven) {
	//	this.jComboBoxTiposArchivosReportesDinamicoMailMensajeCorreoInven = jComboBoxTiposArchivosReportesDinamicoMailMensajeCorreoInven;
	//}
	
	public void setBorderResaltarTiposReportesMailMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMailMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesMailMensajeCorreoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesMailMensajeCorreoInven() {
		return this.jComboBoxTiposGraficosReportesMailMensajeCorreoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesMailMensajeCorreoInven(
			JComboBox jComboBoxTiposGraficosReportesMailMensajeCorreoInven) {
		this.jComboBoxTiposGraficosReportesMailMensajeCorreoInven = jComboBoxTiposGraficosReportesMailMensajeCorreoInven;
	}
	
	public void setBorderResaltarTiposGraficosReportesMailMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMailMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesMailMensajeCorreoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionMailMensajeCorreoInven() {
		return this.jComboBoxTiposPaginacionMailMensajeCorreoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionMailMensajeCorreoInven(
			JComboBox jComboBoxTiposPaginacionMailMensajeCorreoInven) {
		this.jComboBoxTiposPaginacionMailMensajeCorreoInven = jComboBoxTiposPaginacionMailMensajeCorreoInven;
	}
	
	public void setBorderResaltarTiposPaginacionMailMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMailMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionMailMensajeCorreoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesMailMensajeCorreoInven() {
		return this.jComboBoxTiposRelacionesMailMensajeCorreoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesMailMensajeCorreoInven() {
		return this.jComboBoxTiposAccionesMailMensajeCorreoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesMailMensajeCorreoInven(
			JComboBox jComboBoxTiposRelacionesMailMensajeCorreoInven) {
		this.jComboBoxTiposRelacionesMailMensajeCorreoInven = jComboBoxTiposRelacionesMailMensajeCorreoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesMailMensajeCorreoInven(
			JComboBox jComboBoxTiposAccionesMailMensajeCorreoInven) {
		this.jComboBoxTiposAccionesMailMensajeCorreoInven = jComboBoxTiposAccionesMailMensajeCorreoInven;
	}
	
	public void setBorderResaltarTiposRelacionesMailMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMailMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesMailMensajeCorreoInven .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesMailMensajeCorreoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMailMensajeCorreoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesMailMensajeCorreoInven .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoMailMensajeCorreoInven() {
	//	return jCheckBoxConGraficoDinamicoMailMensajeCorreoInven;
	//}

	//public void setjCheckBoxConGraficoDinamicoMailMensajeCorreoInven(
	//		JCheckBox jCheckBoxConGraficoDinamicoMailMensajeCorreoInven) {
	//	this.jCheckBoxConGraficoDinamicoMailMensajeCorreoInven = jCheckBoxConGraficoDinamicoMailMensajeCorreoInven;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoMailMensajeCorreoInven() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarMailMensajeCorreoInven.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoMailMensajeCorreoInven .setBorder(borderResaltar);		
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
		this.mailmensajecorreoinvenSessionBean=new MailMensajeCorreoInvenSessionBean();
		
		this.mailmensajecorreoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.mailmensajecorreoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=MailMensajeCorreoInvenJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=MailMensajeCorreoInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		MailMensajeCorreoInvenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		MailMensajeCorreoInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		MailMensajeCorreoInvenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Mail Mensaje Correo Inven MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
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
		
		MailMensajeCorreoInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("MailMensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarMailMensajeCorreoInven= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarMailMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarMailMensajeCorreoInven,this.jTtoolBarMailMensajeCorreoInven,
							"nuevo","nuevo","Nuevo"+" "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarMailMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarMailMensajeCorreoInven,this.jTtoolBarMailMensajeCorreoInven,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarMailMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarMailMensajeCorreoInven,this.jTtoolBarMailMensajeCorreoInven,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarMailMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarMailMensajeCorreoInven,this.jTtoolBarMailMensajeCorreoInven,
							"duplicar","duplicar","Duplicar"+" "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarMailMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarMailMensajeCorreoInven,this.jTtoolBarMailMensajeCorreoInven,
							"copiar","copiar","Copiar"+" "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarMailMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarMailMensajeCorreoInven,this.jTtoolBarMailMensajeCorreoInven,
							"ver_form","ver_form","Ver"+" "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarMailMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMailMensajeCorreoInven,this.jTtoolBarMailMensajeCorreoInven,
							"recargar","recargar","Recargar"+" "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarMailMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMailMensajeCorreoInven,this.jTtoolBarMailMensajeCorreoInven,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarMailMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMailMensajeCorreoInven,this.jTtoolBarMailMensajeCorreoInven,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarMailMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarMailMensajeCorreoInven,this.jTtoolBarMailMensajeCorreoInven,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarMailMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarMailMensajeCorreoInven,this.jTtoolBarMailMensajeCorreoInven,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarMailMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarMailMensajeCorreoInven,this.jTtoolBarMailMensajeCorreoInven,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarMailMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarMailMensajeCorreoInven,this.jTtoolBarMailMensajeCorreoInven,
							"cerrar","cerrar","Salir"+" "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarMailMensajeCorreoInven=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarMailMensajeCorreoInven;
			
				this.jButtonProcesarInformacionToolBarMailMensajeCorreoInven=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarMailMensajeCorreoInven;
				
		//protected JButton jButtonModificarToolBarMailMensajeCorreoInven;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarMailMensajeCorreoInven=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuMailMensajeCorreoInven=new JMenuMe("General");
		this.jmenuArchivoMailMensajeCorreoInven=new JMenuMe("Archivo");
		this.jmenuAccionesMailMensajeCorreoInven=new JMenuMe("Acciones");
		this.jmenuDatosMailMensajeCorreoInven=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoMailMensajeCorreoInven= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoMailMensajeCorreoInven.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoMailMensajeCorreoInven,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarMailMensajeCorreoInven= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarMailMensajeCorreoInven.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarMailMensajeCorreoInven,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesMailMensajeCorreoInven= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesMailMensajeCorreoInven.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesMailMensajeCorreoInven,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosMailMensajeCorreoInven= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosMailMensajeCorreoInven.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosMailMensajeCorreoInven,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarMailMensajeCorreoInven= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarMailMensajeCorreoInven.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarMailMensajeCorreoInven,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormMailMensajeCorreoInven= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormMailMensajeCorreoInven.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormMailMensajeCorreoInven,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaMailMensajeCorreoInven= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaMailMensajeCorreoInven.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaMailMensajeCorreoInven,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarMailMensajeCorreoInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarMailMensajeCorreoInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarMailMensajeCorreoInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionMailMensajeCorreoInven= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionMailMensajeCorreoInven.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionMailMensajeCorreoInven,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionMailMensajeCorreoInven= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionMailMensajeCorreoInven.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionMailMensajeCorreoInven,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresMailMensajeCorreoInven= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresMailMensajeCorreoInven.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresMailMensajeCorreoInven,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesMailMensajeCorreoInven= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesMailMensajeCorreoInven.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesMailMensajeCorreoInven,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByMailMensajeCorreoInven= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByMailMensajeCorreoInven.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByMailMensajeCorreoInven,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarMailMensajeCorreoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarMailMensajeCorreoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarMailMensajeCorreoInven,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByMailMensajeCorreoInven= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByMailMensajeCorreoInven.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByMailMensajeCorreoInven,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarMailMensajeCorreoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarMailMensajeCorreoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarMailMensajeCorreoInven,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosMailMensajeCorreoInven= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosMailMensajeCorreoInven.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosMailMensajeCorreoInven,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoMailMensajeCorreoInven.add(this.jMenuItemCerrarMailMensajeCorreoInven);
			
			this.jmenuAccionesMailMensajeCorreoInven.add(this.jMenuItemNuevoMailMensajeCorreoInven);
			this.jmenuAccionesMailMensajeCorreoInven.add(this.jMenuItemNuevoGuardarCambiosMailMensajeCorreoInven);
			this.jmenuAccionesMailMensajeCorreoInven.add(this.jMenuItemNuevoRelacionesMailMensajeCorreoInven);
			this.jmenuAccionesMailMensajeCorreoInven.add(this.jMenuItemGuardarCambiosTablaMailMensajeCorreoInven);		
			this.jmenuAccionesMailMensajeCorreoInven.add(this.jMenuItemDuplicarMailMensajeCorreoInven);		
			this.jmenuAccionesMailMensajeCorreoInven.add(this.jMenuItemCopiarMailMensajeCorreoInven);		
			this.jmenuAccionesMailMensajeCorreoInven.add(this.jMenuItemVerFormMailMensajeCorreoInven);		
			
			this.jmenuDatosMailMensajeCorreoInven.add(this.jMenuItemRecargarInformacionMailMensajeCorreoInven);				
			this.jmenuDatosMailMensajeCorreoInven.add(this.jMenuItemAnterioresMailMensajeCorreoInven);				
			this.jmenuDatosMailMensajeCorreoInven.add(this.jMenuItemSiguientesMailMensajeCorreoInven);				
			this.jmenuDatosMailMensajeCorreoInven.add(this.jMenuItemAbrirOrderByMailMensajeCorreoInven);				
			this.jmenuDatosMailMensajeCorreoInven.add(this.jMenuItemMostrarOcultarMailMensajeCorreoInven);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesMailMensajeCorreoInven.add(this.jMenuItemGuardarCambiosMailMensajeCorreoInven);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarMailMensajeCorreoInven.add(this.jmenuArchivoMailMensajeCorreoInven);		
			this.jmenuBarMailMensajeCorreoInven.add(this.jmenuAccionesMailMensajeCorreoInven);		
			this.jmenuBarMailMensajeCorreoInven.add(this.jmenuDatosMailMensajeCorreoInven);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarMailMensajeCorreoInven);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasMailMensajeCorreoInven() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdMensajeCorreoInvenMailMensajeCorreoInven=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdMensajeCorreoInvenMailMensajeCorreoInven.setToolTipText("Buscar Por Mensaje Correo Inven ");
		this.jButtonFK_IdMensajeCorreoInvenMailMensajeCorreoInven= new JButtonMe();
		this.jButtonFK_IdMensajeCorreoInvenMailMensajeCorreoInven.setText("Buscar");
		this.jButtonFK_IdMensajeCorreoInvenMailMensajeCorreoInven.setToolTipText("Buscar Por Mensaje Correo Inven ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdMensajeCorreoInvenMailMensajeCorreoInven,"buscar_button","Buscar Por Mensaje Correo Inven ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdMensajeCorreoInvenMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_mensaje_correo_invenFK_IdMensajeCorreoInvenMailMensajeCorreoInven = new JLabelMe();
		jLabelid_mensaje_correo_invenFK_IdMensajeCorreoInvenMailMensajeCorreoInven.setText("Mensaje Correo Inven :");
		jLabelid_mensaje_correo_invenFK_IdMensajeCorreoInvenMailMensajeCorreoInven.setToolTipText("Mensaje Correo Inven");
		jLabelid_mensaje_correo_invenFK_IdMensajeCorreoInvenMailMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_mensaje_correo_invenFK_IdMensajeCorreoInvenMailMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_mensaje_correo_invenFK_IdMensajeCorreoInvenMailMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_mensaje_correo_invenFK_IdMensajeCorreoInvenMailMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenMailMensajeCorreoInven= new JComboBoxMe();
		jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenMailMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenMailMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenMailMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenMailMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasMailMensajeCorreoInven=new JTabbedPane();


		this.jTabbedPaneBusquedasMailMensajeCorreoInven.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasMailMensajeCorreoInven.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasMailMensajeCorreoInven.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasMailMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasMailMensajeCorreoInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasMailMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleMailMensajeCorreoInven = new MailMensajeCorreoInvenDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Mail Mensaje Correo Inven DATOS");
			this.jInternalFrameDetalleFormMailMensajeCorreoInven = new MailMensajeCorreoInvenDetalleFormJInternalFrame(jDesktopPane,this.mailmensajecorreoinvenSessionBean.getConGuardarRelaciones(),this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormMailMensajeCorreoInven = null;//new MailMensajeCorreoInvenDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutMailMensajeCorreoInven= new GridBagLayout();
		
		
		this.jTableDatosMailMensajeCorreoInven = new JTableMe();      
		
		String sToolTipMailMensajeCorreoInven="";
		sToolTipMailMensajeCorreoInven=MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipMailMensajeCorreoInven+="(Inventario.MailMensajeCorreoInven)";
		}
		
		if(!this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipMailMensajeCorreoInven+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosMailMensajeCorreoInven.setToolTipText(sToolTipMailMensajeCorreoInven);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosMailMensajeCorreoInven);
		this.jTableDatosMailMensajeCorreoInven.setAutoCreateRowSorter(true);
		this.jTableDatosMailMensajeCorreoInven.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosMailMensajeCorreoInven.setRowSelectionAllowed(true);
		this.jTableDatosMailMensajeCorreoInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosMailMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoMailMensajeCorreoInven = new JButtonMe();
		this.jButtonDuplicarMailMensajeCorreoInven = new JButtonMe();
		this.jButtonCopiarMailMensajeCorreoInven = new JButtonMe();
		this.jButtonVerFormMailMensajeCorreoInven = new JButtonMe();
		this.jButtonNuevoRelacionesMailMensajeCorreoInven = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaMailMensajeCorreoInven = new JButtonMe();
		this.jButtonCerrarMailMensajeCorreoInven = new JButtonMe();
		
		this.jScrollPanelDatosMailMensajeCorreoInven = new JScrollPane();   
        this.jScrollPanelDatosGeneralMailMensajeCorreoInven = new JScrollPane();
		
				
		
		
		this.jPanelAccionesMailMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Mail Mensaje Correo Inven";
		
		if(!this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosMailMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mail Mensaje Correo Invenes" + this.sPath));
		} else {
			this.jScrollPanelDatosMailMensajeCorreoInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralMailMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesMailMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesMailMensajeCorreoInven.setToolTipText("Acciones");
        this.jPanelAccionesMailMensajeCorreoInven.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoMailMensajeCorreoInven=new ReporteDinamicoJInternalFrame(MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoMailMensajeCorreoInven();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionMailMensajeCorreoInven=new ImportacionJInternalFrame(MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionMailMensajeCorreoInven();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByMailMensajeCorreoInven = new JButtonMe();
		
		this.jButtonAbrirOrderByMailMensajeCorreoInven.setText("Orden");
		this.jButtonAbrirOrderByMailMensajeCorreoInven.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByMailMensajeCorreoInven,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByMailMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByMailMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByMailMensajeCorreoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMailMensajeCorreoInven,false,this);
			
			//this.cargarOrderByMailMensajeCorreoInven(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByMailMensajeCorreoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMailMensajeCorreoInven,true,this);
			
			//this.cargarOrderByMailMensajeCorreoInven(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosMailMensajeCorreoInven.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosMailMensajeCorreoInven.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosMailMensajeCorreoInven.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosMailMensajeCorreoInven.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosMailMensajeCorreoInven.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosMailMensajeCorreoInven.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoMailMensajeCorreoInven.setText("Nuevo");
		this.jButtonDuplicarMailMensajeCorreoInven.setText("Duplicar");
		this.jButtonCopiarMailMensajeCorreoInven.setText("Copiar");
		this.jButtonVerFormMailMensajeCorreoInven.setText("Ver");
		this.jButtonNuevoRelacionesMailMensajeCorreoInven.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaMailMensajeCorreoInven.setText("Guardar");
		this.jButtonCerrarMailMensajeCorreoInven.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoMailMensajeCorreoInven,"nuevo_button","Nuevo",this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarMailMensajeCorreoInven,"duplicar_button","Duplicar",this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarMailMensajeCorreoInven,"copiar_button","Copiar",this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormMailMensajeCorreoInven,"ver_form","Ver",this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesMailMensajeCorreoInven,"nuevorelaciones_button","Nuevo Rel",this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaMailMensajeCorreoInven,"guardarcambiostabla_button","Guardar",this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarMailMensajeCorreoInven,"cerrar_button","Salir",this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoMailMensajeCorreoInven.setToolTipText("Nuevo"+" "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarMailMensajeCorreoInven.setToolTipText("Duplicar"+" "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarMailMensajeCorreoInven.setToolTipText("Copiar"+" "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormMailMensajeCorreoInven.setToolTipText("Ver"+" "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesMailMensajeCorreoInven.setToolTipText("Nuevo Rel"+" "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaMailMensajeCorreoInven.setToolTipText("Guardar"+" "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarMailMensajeCorreoInven.setToolTipText("Salir"+" "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoMailMensajeCorreoInven";
		inputMap = this.jButtonNuevoMailMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoMailMensajeCorreoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoMailMensajeCorreoInven"));
		
		//DUPLICAR
		sMapKey = "DuplicarMailMensajeCorreoInven";
		inputMap = this.jButtonDuplicarMailMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarMailMensajeCorreoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarMailMensajeCorreoInven"));
		
		//COPIAR
		sMapKey = "CopiarMailMensajeCorreoInven";
		inputMap = this.jButtonCopiarMailMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarMailMensajeCorreoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarMailMensajeCorreoInven"));
		
		//VEr FORM
		sMapKey = "VerFormMailMensajeCorreoInven";
		inputMap = this.jButtonVerFormMailMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormMailMensajeCorreoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormMailMensajeCorreoInven"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesMailMensajeCorreoInven";
		inputMap = this.jButtonNuevoRelacionesMailMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesMailMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesMailMensajeCorreoInven"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarMailMensajeCorreoInven";
		inputMap = this.jButtonModificarMailMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarMailMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarMailMensajeCorreoInven"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarMailMensajeCorreoInven";
		inputMap = this.jButtonCerrarMailMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarMailMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarMailMensajeCorreoInven"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaMailMensajeCorreoInven";
		inputMap = this.jButtonGuardarCambiosTablaMailMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaMailMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaMailMensajeCorreoInven"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesMailMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesMailMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionMailMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1MailMensajeCorreoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2MailMensajeCorreoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3MailMensajeCorreoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4MailMensajeCorreoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5MailMensajeCorreoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesMailMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesMailMensajeCorreoInven.setName("jPanelParametrosReportesMailMensajeCorreoInven"); 
		
		this.jPanelParametrosReportesAccionesMailMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesMailMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesMailMensajeCorreoInven.setName("jPanelParametrosReportesAccionesMailMensajeCorreoInven"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionMailMensajeCorreoInven = new JButtonMe();
		this.jButtonRecargarInformacionMailMensajeCorreoInven.setText("Recargar");
		this.jButtonRecargarInformacionMailMensajeCorreoInven.setToolTipText("Recargar"+" "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionMailMensajeCorreoInven,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionMailMensajeCorreoInven = new JButtonMe();
		this.jButtonProcesarInformacionMailMensajeCorreoInven.setText("Procesar");
		this.jButtonProcesarInformacionMailMensajeCorreoInven.setToolTipText("Procesar"+" "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionMailMensajeCorreoInven.setVisible(false);
			
		this.jButtonProcesarInformacionMailMensajeCorreoInven.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionMailMensajeCorreoInven.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionMailMensajeCorreoInven.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesMailMensajeCorreoInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMailMensajeCorreoInven.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesMailMensajeCorreoInven.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesMailMensajeCorreoInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMailMensajeCorreoInven.setText("TIPO");       
		this.jComboBoxTiposReportesMailMensajeCorreoInven.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesMailMensajeCorreoInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMailMensajeCorreoInven.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesMailMensajeCorreoInven.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionMailMensajeCorreoInven = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionMailMensajeCorreoInven.setText("Paginacion");
		this.jComboBoxTiposPaginacionMailMensajeCorreoInven.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesMailMensajeCorreoInven = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesMailMensajeCorreoInven.setText("Accion");
		this.jComboBoxTiposRelacionesMailMensajeCorreoInven.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesMailMensajeCorreoInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesMailMensajeCorreoInven.setText("Accion");
		this.jComboBoxTiposAccionesMailMensajeCorreoInven.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarMailMensajeCorreoInven = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarMailMensajeCorreoInven.setText("Accion");
		this.jComboBoxTiposSeleccionarMailMensajeCorreoInven.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralMailMensajeCorreoInven=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralMailMensajeCorreoInven.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralMailMensajeCorreoInven.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralMailMensajeCorreoInven.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesMailMensajeCorreoInven = new JLabelMe();
		
		this.jLabelAccionesMailMensajeCorreoInven.setText("Acciones");		
		this.jLabelAccionesMailMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMailMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMailMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosMailMensajeCorreoInven = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosMailMensajeCorreoInven.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosMailMensajeCorreoInven.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosMailMensajeCorreoInven = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosMailMensajeCorreoInven.setText("Seleccionados");
		this.jCheckBoxSeleccionadosMailMensajeCorreoInven.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaMailMensajeCorreoInven = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaMailMensajeCorreoInven.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaMailMensajeCorreoInven.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteMailMensajeCorreoInven = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteMailMensajeCorreoInven.setText("Graf.");
		this.jCheckBoxConGraficoReporteMailMensajeCorreoInven.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresMailMensajeCorreoInven = new JButtonMe();
		//this.jButtonAnterioresMailMensajeCorreoInven.setText("<<");
        this.jButtonAnterioresMailMensajeCorreoInven.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresMailMensajeCorreoInven,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesMailMensajeCorreoInven = new JButtonMe();
		//this.jButtonSiguientesMailMensajeCorreoInven.setText(">>");
        this.jButtonSiguientesMailMensajeCorreoInven.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesMailMensajeCorreoInven,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosMailMensajeCorreoInven = new JButtonMe();
		this.jButtonNuevoGuardarCambiosMailMensajeCorreoInven.setText("Nue");
        this.jButtonNuevoGuardarCambiosMailMensajeCorreoInven.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosMailMensajeCorreoInven,"nuevoguardarcambios_button","Nue",this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosMailMensajeCorreoInven";
		inputMap = this.jButtonNuevoGuardarCambiosMailMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosMailMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosMailMensajeCorreoInven"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionMailMensajeCorreoInven";
		inputMap = this.jButtonRecargarInformacionMailMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionMailMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionMailMensajeCorreoInven"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesMailMensajeCorreoInven";
		inputMap = this.jButtonSiguientesMailMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesMailMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesMailMensajeCorreoInven"));
		
		//ANTERIORES		
		sMapKey = "AnterioresMailMensajeCorreoInven";
		inputMap = this.jButtonAnterioresMailMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresMailMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresMailMensajeCorreoInven"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasMailMensajeCorreoInven();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesMailMensajeCorreoInven.setMinimumSize(new Dimension(this.getWidth(),MailMensajeCorreoInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MailMensajeCorreoInvenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesMailMensajeCorreoInven.setMaximumSize(new Dimension(this.getWidth(),MailMensajeCorreoInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MailMensajeCorreoInvenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesMailMensajeCorreoInven.setPreferredSize(new Dimension(this.getWidth(),MailMensajeCorreoInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MailMensajeCorreoInvenBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionMailMensajeCorreoInven = new GridBagLayout();

			this.jPanelPaginacionMailMensajeCorreoInven.setLayout(gridaBagLayoutPaginacionMailMensajeCorreoInven);						
			
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMailMensajeCorreoInven.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMailMensajeCorreoInven.gridy = 0;
			this.gridBagConstraintsMailMensajeCorreoInven.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionMailMensajeCorreoInven.add(this.jButtonAnterioresMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
					
						
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMailMensajeCorreoInven.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsMailMensajeCorreoInven.gridy = 0;
			
			this.jPanelPaginacionMailMensajeCorreoInven.add(this.jButtonNuevoGuardarCambiosMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
						
			
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMailMensajeCorreoInven.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsMailMensajeCorreoInven.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsMailMensajeCorreoInven.gridy = 0;
			this.jPanelPaginacionMailMensajeCorreoInven.add(this.jButtonSiguientesMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMailMensajeCorreoInven.gridy = 1;
			this.gridBagConstraintsMailMensajeCorreoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMailMensajeCorreoInven.add(this.jButtonNuevoMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
						
			
			
			if(!this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
				this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsMailMensajeCorreoInven.gridy = 1;
				this.gridBagConstraintsMailMensajeCorreoInven.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionMailMensajeCorreoInven.add(this.jButtonGuardarCambiosTablaMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
			}
			
			
			
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMailMensajeCorreoInven.gridy = 1;
			this.gridBagConstraintsMailMensajeCorreoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMailMensajeCorreoInven.add(this.jButtonDuplicarMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
			
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMailMensajeCorreoInven.gridy = 1;
			this.gridBagConstraintsMailMensajeCorreoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMailMensajeCorreoInven.add(this.jButtonCopiarMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
		
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMailMensajeCorreoInven.gridy = 1;
			this.gridBagConstraintsMailMensajeCorreoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMailMensajeCorreoInven.add(this.jButtonVerFormMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
		
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMailMensajeCorreoInven.gridy = 1;
			this.gridBagConstraintsMailMensajeCorreoInven.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionMailMensajeCorreoInven.add(this.jButtonCerrarMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
		
		
		
		this.jButtonRecargarInformacionMailMensajeCorreoInven.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionMailMensajeCorreoInven.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionMailMensajeCorreoInven.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesMailMensajeCorreoInven.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesMailMensajeCorreoInven.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesMailMensajeCorreoInven.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesMailMensajeCorreoInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesMailMensajeCorreoInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesMailMensajeCorreoInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesMailMensajeCorreoInven.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesMailMensajeCorreoInven.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesMailMensajeCorreoInven.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionMailMensajeCorreoInven.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionMailMensajeCorreoInven.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionMailMensajeCorreoInven.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesMailMensajeCorreoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesMailMensajeCorreoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesMailMensajeCorreoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesMailMensajeCorreoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMailMensajeCorreoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMailMensajeCorreoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarMailMensajeCorreoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarMailMensajeCorreoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarMailMensajeCorreoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaMailMensajeCorreoInven.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaMailMensajeCorreoInven.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaMailMensajeCorreoInven.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteMailMensajeCorreoInven.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteMailMensajeCorreoInven.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteMailMensajeCorreoInven.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosMailMensajeCorreoInven.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosMailMensajeCorreoInven.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosMailMensajeCorreoInven.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosMailMensajeCorreoInven.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosMailMensajeCorreoInven.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosMailMensajeCorreoInven.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesMailMensajeCorreoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesMailMensajeCorreoInven = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1MailMensajeCorreoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2MailMensajeCorreoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3MailMensajeCorreoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4MailMensajeCorreoInven = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesMailMensajeCorreoInven.setLayout(gridaBagParametrosReportesMailMensajeCorreoInven);
			this.jPanelParametrosReportesAccionesMailMensajeCorreoInven.setLayout(gridaBagParametrosReportesAccionesMailMensajeCorreoInven);
			
			
			this.jPanelParametrosAuxiliar1MailMensajeCorreoInven.setLayout(gridaBagParametrosAuxiliar1MailMensajeCorreoInven);
			this.jPanelParametrosAuxiliar2MailMensajeCorreoInven.setLayout(gridaBagParametrosAuxiliar2MailMensajeCorreoInven);
			this.jPanelParametrosAuxiliar3MailMensajeCorreoInven.setLayout(gridaBagParametrosAuxiliar3MailMensajeCorreoInven);
			this.jPanelParametrosAuxiliar4MailMensajeCorreoInven.setLayout(gridaBagParametrosAuxiliar4MailMensajeCorreoInven);
			//this.jPanelParametrosAuxiliar5MailMensajeCorreoInven.setLayout(gridaBagParametrosAuxiliar2MailMensajeCorreoInven);			
			
			
			
			
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMailMensajeCorreoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMailMensajeCorreoInven.add(this.jButtonRecargarInformacionMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMailMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMailMensajeCorreoInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MailMensajeCorreoInven.add(this.jComboBoxTiposPaginacionMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMailMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMailMensajeCorreoInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MailMensajeCorreoInven.add(this.jCheckBoxConAltoMaximoTablaMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMailMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMailMensajeCorreoInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MailMensajeCorreoInven.add(this.jComboBoxTiposArchivosReportesMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMailMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMailMensajeCorreoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMailMensajeCorreoInven.add(this.jPanelParametrosAuxiliar1MailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMailMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMailMensajeCorreoInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMailMensajeCorreoInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4MailMensajeCorreoInven.add(this.jComboBoxTiposReportesMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMailMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMailMensajeCorreoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMailMensajeCorreoInven.add(this.jPanelParametrosAuxiliar4MailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMailMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsMailMensajeCorreoInven.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMailMensajeCorreoInven.add(this.jComboBoxTiposReportesMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMailMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMailMensajeCorreoInven.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMailMensajeCorreoInven.add(this.jCheckBoxGenerarReporteMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMailMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMailMensajeCorreoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMailMensajeCorreoInven.add(this.jPanelParametrosAuxiliar2MailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMailMensajeCorreoInven.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMailMensajeCorreoInven.add(this.jLabelAccionesMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
				this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsMailMensajeCorreoInven.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesMailMensajeCorreoInven.add(this.jButtonAbrirOrderByMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMailMensajeCorreoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMailMensajeCorreoInven.add(this.jComboBoxTiposSeleccionarMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);			
			
			
			/*
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMailMensajeCorreoInven.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMailMensajeCorreoInven.add(this.jCheckBoxSeleccionarTodosMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMailMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMailMensajeCorreoInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMailMensajeCorreoInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3MailMensajeCorreoInven.add(this.jCheckBoxSeleccionarTodosMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);															
				
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMailMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMailMensajeCorreoInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMailMensajeCorreoInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3MailMensajeCorreoInven.add(this.jCheckBoxSeleccionadosMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMailMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMailMensajeCorreoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMailMensajeCorreoInven.add(this.jPanelParametrosAuxiliar3MailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMailMensajeCorreoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMailMensajeCorreoInven.add(this.jComboBoxTiposAccionesMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
	
				
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMailMensajeCorreoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMailMensajeCorreoInven.add(this.jTextFieldValorCampoGeneralMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosMailMensajeCorreoInven = new GridBagLayout();

			this.jScrollPanelDatosMailMensajeCorreoInven.setLayout(gridaBagLayoutDatosMailMensajeCorreoInven);
			
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMailMensajeCorreoInven.gridy = 0;
			this.gridBagConstraintsMailMensajeCorreoInven.gridx = 0;
			
			this.jScrollPanelDatosMailMensajeCorreoInven.add(this.jTableDatosMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosMailMensajeCorreoInven.setViewportView(this.jTableDatosMailMensajeCorreoInven);
		this.jTableDatosMailMensajeCorreoInven.setFillsViewportHeight(true);
		this.jTableDatosMailMensajeCorreoInven.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesMailMensajeCorreoInven= new GridBagLayout();
		this.jPanelAccionesMailMensajeCorreoInven.setLayout(gridaBagLayoutAccionesMailMensajeCorreoInven);
		
		
		/*	
		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = 0;
			
		this.jPanelAccionesMailMensajeCorreoInven.add(this.jButtonNuevoMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdMensajeCorreoInvenMailMensajeCorreoInven= new GridBagLayout();
		gridaBagLayoutFK_IdMensajeCorreoInvenMailMensajeCorreoInven.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdMensajeCorreoInvenMailMensajeCorreoInven.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdMensajeCorreoInvenMailMensajeCorreoInven.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdMensajeCorreoInvenMailMensajeCorreoInven.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdMensajeCorreoInvenMailMensajeCorreoInven.setLayout(gridaBagLayoutFK_IdMensajeCorreoInvenMailMensajeCorreoInven);

		gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		gridBagConstraintsMailMensajeCorreoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMailMensajeCorreoInven.gridy = 0;
		gridBagConstraintsMailMensajeCorreoInven.gridx = 0;
		jPanelFK_IdMensajeCorreoInvenMailMensajeCorreoInven.add(jLabelid_mensaje_correo_invenFK_IdMensajeCorreoInvenMailMensajeCorreoInven, gridBagConstraintsMailMensajeCorreoInven);

		gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		gridBagConstraintsMailMensajeCorreoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMailMensajeCorreoInven.gridy = 0;
		gridBagConstraintsMailMensajeCorreoInven.gridx = 1;
		jPanelFK_IdMensajeCorreoInvenMailMensajeCorreoInven.add(jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenMailMensajeCorreoInven, gridBagConstraintsMailMensajeCorreoInven);

		gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		gridBagConstraintsMailMensajeCorreoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMailMensajeCorreoInven.gridy = 1;
		gridBagConstraintsMailMensajeCorreoInven.gridx =1;
		jPanelFK_IdMensajeCorreoInvenMailMensajeCorreoInven.add(jButtonFK_IdMensajeCorreoInvenMailMensajeCorreoInven, gridBagConstraintsMailMensajeCorreoInven);

		jTabbedPaneBusquedasMailMensajeCorreoInven.addTab("1.-Por Mensaje Correo Inven ", jPanelFK_IdMensajeCorreoInvenMailMensajeCorreoInven);
		jTabbedPaneBusquedasMailMensajeCorreoInven.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutMailMensajeCorreoInven = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutMailMensajeCorreoInven);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();						
			this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMailMensajeCorreoInven.gridx = 0;		
			//this.gridBagConstraintsMailMensajeCorreoInven.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMailMensajeCorreoInven.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsMailMensajeCorreoInven.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridyPrincipal++;
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = 0;		
		//this.gridBagConstraintsMailMensajeCorreoInven.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMailMensajeCorreoInven.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsMailMensajeCorreoInven.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsMailMensajeCorreoInven);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMailMensajeCorreoInven.gridx = 0;		
			this.gridBagConstraintsMailMensajeCorreoInven.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMailMensajeCorreoInven.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsMailMensajeCorreoInven.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);								
		
		
		/*
		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
		*/		
		
		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMailMensajeCorreoInven.gridy =iGridyPrincipal++;
		this.gridBagConstraintsMailMensajeCorreoInven.gridx =0;
		this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsMailMensajeCorreoInven.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
				
		
		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(MailMensajeCorreoInvenJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosMailMensajeCorreoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosMailMensajeCorreoInven = new GridBagLayout();
			this.jPanelBusquedasParametrosMailMensajeCorreoInven.setLayout(gridaBagLayoutBusquedasParametrosMailMensajeCorreoInven);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralMailMensajeCorreoInven=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralMailMensajeCorreoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMailMensajeCorreoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMailMensajeCorreoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
			
			
		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
		
			
		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMailMensajeCorreoInven.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsMailMensajeCorreoInven.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralMailMensajeCorreoInven;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoMailMensajeCorreoInven() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoMailMensajeCorreoInven = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoMailMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoMailMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoMailMensajeCorreoInven.setName("jPanelReporteDinamicoMailMensajeCorreoInven"); 
		
		this.jPanelReporteDinamicoMailMensajeCorreoInven.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoMailMensajeCorreoInven.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoMailMensajeCorreoInven.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoMailMensajeCorreoInven.setLayout(gridaBagLayoutReporteDinamicoMailMensajeCorreoInven);
		
		
		this.jInternalFrameReporteDinamicoMailMensajeCorreoInven= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoMailMensajeCorreoInven = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteMailMensajeCorreoInven= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.setResizable(true);
	    this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.setClosable(true);
	    this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoMailMensajeCorreoInven.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoMailMensajeCorreoInven.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoMailMensajeCorreoInven.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoMailMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mail Mensaje Correo Invenes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteMailMensajeCorreoInven = new JLabelMe();

		this.jLabelColumnasSelectReporteMailMensajeCorreoInven.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteMailMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteMailMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteMailMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMailMensajeCorreoInven.add(this.jLabelColumnasSelectReporteMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteMailMensajeCorreoInven = new JList<Reporte>();
		this.jListColumnasSelectReporteMailMensajeCorreoInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteMailMensajeCorreoInven.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteMailMensajeCorreoInven.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteMailMensajeCorreoInven.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteMailMensajeCorreoInven.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteMailMensajeCorreoInven=new JScrollPane(this.jListColumnasSelectReporteMailMensajeCorreoInven);
			
			this.jScrollColumnasSelectReporteMailMensajeCorreoInven.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteMailMensajeCorreoInven.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteMailMensajeCorreoInven.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteMailMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoMailMensajeCorreoInven.add(this.jListColumnasSelectReporteMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
		this.jPanelReporteDinamicoMailMensajeCorreoInven.add(this.jScrollColumnasSelectReporteMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteMailMensajeCorreoInven = new JLabelMe();

		this.jLabelRelacionesSelectReporteMailMensajeCorreoInven.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteMailMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteMailMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteMailMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteMailMensajeCorreoInven = new JList<Reporte>();
		this.jListRelacionesSelectReporteMailMensajeCorreoInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteMailMensajeCorreoInven.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteMailMensajeCorreoInven.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteMailMensajeCorreoInven.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteMailMensajeCorreoInven.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteMailMensajeCorreoInven=new JScrollPane(this.jListRelacionesSelectReporteMailMensajeCorreoInven);
			
			this.jScrollRelacionesSelectReporteMailMensajeCorreoInven.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteMailMensajeCorreoInven.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteMailMensajeCorreoInven.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteMailMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoMailMensajeCorreoInven = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoMailMensajeCorreoInven = new JComboBoxMe();
		this.jListColumnasValoresGraficoMailMensajeCorreoInven = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoMailMensajeCorreoInven = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoMailMensajeCorreoInven.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoMailMensajeCorreoInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoMailMensajeCorreoInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoMailMensajeCorreoInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoMailMensajeCorreoInven = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoMailMensajeCorreoInven.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoMailMensajeCorreoInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoMailMensajeCorreoInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoMailMensajeCorreoInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoMailMensajeCorreoInven = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoMailMensajeCorreoInven.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoMailMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoMailMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoMailMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMailMensajeCorreoInven.add(this.jLabelGenerarExcelReporteDinamicoMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoMailMensajeCorreoInven = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoMailMensajeCorreoInven.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoMailMensajeCorreoInven,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoMailMensajeCorreoInven.setToolTipText("Generar EXCEL"+" "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsMailMensajeCorreoInven.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsMailMensajeCorreoInven.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoMailMensajeCorreoInven.add(this.jButtonGenerarExcelReporteDinamicoMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMailMensajeCorreoInven.add(this.jComboBoxTiposReportesDinamicoMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoMailMensajeCorreoInven = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoMailMensajeCorreoInven.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoMailMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoMailMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoMailMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMailMensajeCorreoInven.add(this.jLabelTiposArchivoReporteDinamicoMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMailMensajeCorreoInven.add(this.jComboBoxTiposArchivosReportesDinamicoMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoMailMensajeCorreoInven = new JButtonMe();
		this.jButtonGenerarReporteDinamicoMailMensajeCorreoInven.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoMailMensajeCorreoInven,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoMailMensajeCorreoInven.setToolTipText("Generar"+" "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMailMensajeCorreoInven.add(this.jButtonGenerarReporteDinamicoMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoMailMensajeCorreoInven = new JButtonMe();
		this.jButtonCerrarReporteDinamicoMailMensajeCorreoInven.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoMailMensajeCorreoInven,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoMailMensajeCorreoInven.setToolTipText("Cancelar"+" "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMailMensajeCorreoInven.add(this.jButtonCerrarReporteDinamicoMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalMailMensajeCorreoInven = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoMailMensajeCorreoInven= new JScrollPane(jPanelReporteDinamicoMailMensajeCorreoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoMailMensajeCorreoInven.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoMailMensajeCorreoInven.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoMailMensajeCorreoInven.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoMailMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mail Mensaje Correo Invenes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMailMensajeCorreoInven.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsMailMensajeCorreoInven.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalMailMensajeCorreoInven);
		this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.getContentPane().add(this.jScrollPanelReporteDinamicoMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionMailMensajeCorreoInven() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionMailMensajeCorreoInven = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionMailMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionMailMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionMailMensajeCorreoInven.setName("jPanelImportacionMailMensajeCorreoInven"); 
		
		this.jPanelImportacionMailMensajeCorreoInven.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionMailMensajeCorreoInven.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionMailMensajeCorreoInven.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionMailMensajeCorreoInven.setLayout(gridaBagLayoutImportacionMailMensajeCorreoInven);
		
		
		this.jInternalFrameImportacionMailMensajeCorreoInven= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionMailMensajeCorreoInven= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionMailMensajeCorreoInven = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteMailMensajeCorreoInven= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionMailMensajeCorreoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionMailMensajeCorreoInven.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionMailMensajeCorreoInven.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionMailMensajeCorreoInven.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionMailMensajeCorreoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionMailMensajeCorreoInven.setResizable(true);
	    this.jInternalFrameImportacionMailMensajeCorreoInven.setClosable(true);
	    this.jInternalFrameImportacionMailMensajeCorreoInven.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionMailMensajeCorreoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionMailMensajeCorreoInven.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionMailMensajeCorreoInven.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionMailMensajeCorreoInven.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionMailMensajeCorreoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionMailMensajeCorreoInven.setResizable(true);
	    this.jInternalFrameImportacionMailMensajeCorreoInven.setClosable(true);
	    this.jInternalFrameImportacionMailMensajeCorreoInven.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionMailMensajeCorreoInven.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionMailMensajeCorreoInven.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionMailMensajeCorreoInven.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionMailMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mail Mensaje Correo Invenes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionMailMensajeCorreoInven = new JLabelMe();

		this.jLabelArchivoImportacionMailMensajeCorreoInven.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionMailMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionMailMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionMailMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = iPosYImportacion;		
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = iPosXImportacion++;
			
		this.jPanelImportacionMailMensajeCorreoInven.add(this.jLabelArchivoImportacionMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionMailMensajeCorreoInven = new JFileChooser();		
		this.jFileChooserImportacionMailMensajeCorreoInven.setToolTipText("ESCOGER ARCHIVO"+" "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionMailMensajeCorreoInven = new JButtonMe();
		this.jButtonAbrirImportacionMailMensajeCorreoInven.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionMailMensajeCorreoInven,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionMailMensajeCorreoInven.setToolTipText("Generar"+" "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMailMensajeCorreoInven.add(this.jButtonAbrirImportacionMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionMailMensajeCorreoInven = new JLabelMe();

		this.jLabelPathArchivoImportacionMailMensajeCorreoInven.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionMailMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionMailMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionMailMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = iPosYImportacion;		
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = iPosXImportacion++;
			
		this.jPanelImportacionMailMensajeCorreoInven.add(this.jLabelPathArchivoImportacionMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionMailMensajeCorreoInven=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionMailMensajeCorreoInven.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionMailMensajeCorreoInven.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionMailMensajeCorreoInven.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMailMensajeCorreoInven.add(this.jTextFieldPathArchivoImportacionMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionMailMensajeCorreoInven = new JButtonMe();
		this.jButtonGenerarImportacionMailMensajeCorreoInven.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionMailMensajeCorreoInven,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionMailMensajeCorreoInven.setToolTipText("Generar"+" "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMailMensajeCorreoInven.add(this.jButtonGenerarImportacionMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionMailMensajeCorreoInven = new JButtonMe();
		this.jButtonCerrarImportacionMailMensajeCorreoInven.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionMailMensajeCorreoInven,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionMailMensajeCorreoInven.setToolTipText("Cancelar"+" "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMailMensajeCorreoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsMailMensajeCorreoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMailMensajeCorreoInven.add(this.jButtonCerrarImportacionMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalMailMensajeCorreoInven = new GridBagLayout();
		
		this.jScrollPanelImportacionMailMensajeCorreoInven= new JScrollPane(jPanelImportacionMailMensajeCorreoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsMailMensajeCorreoInven.gridy =iPosYImportacion;
		this.gridBagConstraintsMailMensajeCorreoInven.gridx =iPosXImportacion;
		this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionMailMensajeCorreoInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionMailMensajeCorreoInven.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalMailMensajeCorreoInven);
		this.jInternalFrameImportacionMailMensajeCorreoInven.getContentPane().add(this.jScrollPanelImportacionMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByMailMensajeCorreoInven(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByMailMensajeCorreoInven = new JButtonMe();
			this.jButtonAbrirOrderByMailMensajeCorreoInven.setText("Orden");
			this.jButtonAbrirOrderByMailMensajeCorreoInven.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByMailMensajeCorreoInven,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByMailMensajeCorreoInven";
			inputMap = this.jButtonAbrirOrderByMailMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByMailMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByMailMensajeCorreoInven"));
		
		
			GridBagLayout gridaBagLayoutOrderByMailMensajeCorreoInven = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByMailMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByMailMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByMailMensajeCorreoInven.setName("jPanelOrderByMailMensajeCorreoInven"); 
			
			this.jPanelOrderByMailMensajeCorreoInven.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByMailMensajeCorreoInven.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByMailMensajeCorreoInven.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByMailMensajeCorreoInven.setLayout(gridaBagLayoutOrderByMailMensajeCorreoInven);
			
			
			this.jTableDatosMailMensajeCorreoInvenOrderBy = new JTableMe();        
			this.jTableDatosMailMensajeCorreoInvenOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosMailMensajeCorreoInvenOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosMailMensajeCorreoInvenOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosMailMensajeCorreoInvenOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosMailMensajeCorreoInvenOrderBy.setViewportView(this.jTableDatosMailMensajeCorreoInvenOrderBy);
			this.jTableDatosMailMensajeCorreoInvenOrderBy.setFillsViewportHeight(true);
			this.jTableDatosMailMensajeCorreoInvenOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByMailMensajeCorreoInven= new OrderByJInternalFrame();
			this.jInternalFrameOrderByMailMensajeCorreoInven= new OrderByJInternalFrame();
			this.jScrollPanelOrderByMailMensajeCorreoInven = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteMailMensajeCorreoInven= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByMailMensajeCorreoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByMailMensajeCorreoInven.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByMailMensajeCorreoInven.setTitle("Orden");
			this.jInternalFrameOrderByMailMensajeCorreoInven.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByMailMensajeCorreoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByMailMensajeCorreoInven.setResizable(true);
			this.jInternalFrameOrderByMailMensajeCorreoInven.setClosable(true);
			this.jInternalFrameOrderByMailMensajeCorreoInven.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByMailMensajeCorreoInven.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByMailMensajeCorreoInven.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByMailMensajeCorreoInven.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByMailMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mail Mensaje Correo Invenes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMailMensajeCorreoInven.gridy =iPosYOrderBy++;
			this.gridBagConstraintsMailMensajeCorreoInven.gridx =iPosXOrderBy;
			this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsMailMensajeCorreoInven.ipady =150;
				
			this.jPanelOrderByMailMensajeCorreoInven.add(jScrollPanelDatosMailMensajeCorreoInvenOrderBy, this.gridBagConstraintsMailMensajeCorreoInven);//this.jTableDatosMailMensajeCorreoInvenTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByMailMensajeCorreoInven = new JButtonMe();
			this.jButtonCerrarOrderByMailMensajeCorreoInven.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByMailMensajeCorreoInven,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByMailMensajeCorreoInven.setToolTipText("Cancelar"+" "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByMailMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMailMensajeCorreoInven.gridy = iPosYOrderBy++;
			this.gridBagConstraintsMailMensajeCorreoInven.gridx = iPosXOrderBy;
									
			this.jPanelOrderByMailMensajeCorreoInven.add(this.jButtonCerrarOrderByMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalMailMensajeCorreoInven = new GridBagLayout();
			
			this.jScrollPanelOrderByMailMensajeCorreoInven= new JScrollPane(jPanelOrderByMailMensajeCorreoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsMailMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsMailMensajeCorreoInven.gridy =iPosYOrderBy;
			this.gridBagConstraintsMailMensajeCorreoInven.gridx =iPosXOrderBy;
			this.gridBagConstraintsMailMensajeCorreoInven.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByMailMensajeCorreoInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByMailMensajeCorreoInven.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalMailMensajeCorreoInven);
			
			this.jInternalFrameOrderByMailMensajeCorreoInven.getContentPane().add(this.jScrollPanelOrderByMailMensajeCorreoInven, this.gridBagConstraintsMailMensajeCorreoInven);			
		
		} else {
			this.jButtonAbrirOrderByMailMensajeCorreoInven = new JButtonMe();
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
		int iWidthTableCalculado=0;//1230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.mailmensajecorreoinvenSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosMailMensajeCorreoInven.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosMailMensajeCorreoInven.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosMailMensajeCorreoInven.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosMailMensajeCorreoInven.getRowHeight();//MailMensajeCorreoInvenConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > MailMensajeCorreoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaMailMensajeCorreoInven.isSelected()) {
					iHeightTable=MailMensajeCorreoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < MailMensajeCorreoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=MailMensajeCorreoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > MailMensajeCorreoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaMailMensajeCorreoInven.isSelected()) {
					iHeightTable=MailMensajeCorreoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < MailMensajeCorreoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=MailMensajeCorreoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosMailMensajeCorreoInven.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosMailMensajeCorreoInven.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosMailMensajeCorreoInven.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosMailMensajeCorreoInven.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosMailMensajeCorreoInven.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosMailMensajeCorreoInven.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByMailMensajeCorreoInven!=null && this.jInternalFrameOrderByMailMensajeCorreoInven.getjTableDatosOrderBy()!=null) {
			//if(!this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByMailMensajeCorreoInven.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByMailMensajeCorreoInven.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByMailMensajeCorreoInven.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByMailMensajeCorreoInven.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByMailMensajeCorreoInven.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByMailMensajeCorreoInven.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByMailMensajeCorreoInven.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosMailMensajeCorreoInven.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosMailMensajeCorreoInven.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosMailMensajeCorreoInven.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=mailmensajecorreoinvens.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<MailMensajeCorreoInven> TraerMailMensajeCorreoInvenBeans(List<MailMensajeCorreoInven> mailmensajecorreoinvens,ArrayList<Classe> classes)throws Exception {
		try {
			for(MailMensajeCorreoInven mailmensajecorreoinven:mailmensajecorreoinvens) {
					
				if(!(MailMensajeCorreoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || MailMensajeCorreoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					mailmensajecorreoinven.setsDetalleGeneralEntityReporte(MailMensajeCorreoInvenConstantesFunciones.getMailMensajeCorreoInvenDescripcion(mailmensajecorreoinven));
										
					mailmensajecorreoinven.setesta_activo_descripcion(MailMensajeCorreoInvenConstantesFunciones.getesta_activoDescripcion(mailmensajecorreoinven));	
					
						
					
				} else  {
							
					//mailmensajecorreoinven.setsDetalleGeneralEntityReporte(mailmensajecorreoinven.getsDetalleGeneralEntityReporte());
										
				}
				
				//mailmensajecorreoinvenbeans.add(mailmensajecorreoinvenbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return mailmensajecorreoinvens;
    }
	//PARA REPORTES FIN
}
