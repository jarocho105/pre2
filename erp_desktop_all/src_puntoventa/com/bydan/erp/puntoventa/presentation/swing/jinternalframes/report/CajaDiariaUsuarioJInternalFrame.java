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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;

//import com.bydan.erp.puntoventa.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.report.*;
import com.bydan.erp.puntoventa.util.report.CajaDiariaUsuarioConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.report.*;
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
public class CajaDiariaUsuarioJInternalFrame extends CajaDiariaUsuarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCajaDiariaUsuario;
	
	protected JMenuBar jmenuBarCajaDiariaUsuario;
	
	protected JMenu jmenuCajaDiariaUsuario;
	protected JMenu jmenuDatosCajaDiariaUsuario;
	protected JMenu jmenuArchivoCajaDiariaUsuario;
	protected JMenu jmenuAccionesCajaDiariaUsuario;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCajaDiariaUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCajaDiariaUsuario;	
	protected GridBagConstraints gridBagConstraintsCajaDiariaUsuario;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CajaDiariaUsuarioDetalleFormJInternalFrame jInternalFrameDetalleFormCajaDiariaUsuario;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCajaDiariaUsuario;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCajaDiariaUsuario;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_caja="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";
	
	public CajaDiariaUsuarioSessionBean cajadiariausuarioSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public CajaSessionBean cajaSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CajaDiariaUsuario> cajadiariausuarios;		
	public List<CajaDiariaUsuario> cajadiariausuariosEliminados;	
	public List<CajaDiariaUsuario> cajadiariausuariosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCajaDiariaUsuario;		
	protected JButton jButtonAbrirOrderByCajaDiariaUsuario;
	
	
	//protected JPanel jPanelOrderByCajaDiariaUsuario;
	//public JScrollPane jScrollPanelOrderByCajaDiariaUsuario;	
	//protected JButton jButtonCerrarOrderByCajaDiariaUsuario;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CajaDiariaUsuarioLogic cajadiariausuarioLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCajaDiariaUsuario;
	public JScrollPane jScrollPanelDatosEdicionCajaDiariaUsuario;
	public JScrollPane jScrollPanelDatosGeneralCajaDiariaUsuario;
    
	
	
	//public JScrollPane jScrollPanelDatosCajaDiariaUsuarioOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCajaDiariaUsuario;
	//public JScrollPane jScrollPanelImportacionCajaDiariaUsuario;
	
	
	
	protected JPanel jPanelAccionesCajaDiariaUsuario;
	
    protected JPanel jPanelPaginacionCajaDiariaUsuario;
    protected JPanel jPanelParametrosReportesCajaDiariaUsuario;
	protected JPanel jPanelParametrosReportesAccionesCajaDiariaUsuario;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CajaDiariaUsuario;
	protected JPanel jPanelParametrosAuxiliar2CajaDiariaUsuario;
	protected JPanel jPanelParametrosAuxiliar3CajaDiariaUsuario;
	protected JPanel jPanelParametrosAuxiliar4CajaDiariaUsuario;
	//protected JPanel jPanelParametrosAuxiliar5CajaDiariaUsuario;
	
	
	
	//protected JPanel jPanelReporteDinamicoCajaDiariaUsuario;
	//protected JPanel jPanelImportacionCajaDiariaUsuario;
	
	
	public JTable jTableDatosCajaDiariaUsuario;
	
	
	
	//public JTable jTableDatosCajaDiariaUsuarioOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCajaDiariaUsuario;
	protected JButton jButtonDuplicarCajaDiariaUsuario;
	protected JButton jButtonCopiarCajaDiariaUsuario;
	protected JButton jButtonVerFormCajaDiariaUsuario;
	protected JButton jButtonNuevoRelacionesCajaDiariaUsuario;
	protected JButton jButtonModificarCajaDiariaUsuario;
	
    protected JButton jButtonGuardarCambiosTablaCajaDiariaUsuario;
	protected JButton jButtonCerrarCajaDiariaUsuario;
	
	
	protected JButton jButtonRecargarInformacionCajaDiariaUsuario;
	protected JButton jButtonProcesarInformacionCajaDiariaUsuario;
	
	
	protected JButton jButtonAnterioresCajaDiariaUsuario;
	protected JButton jButtonSiguientesCajaDiariaUsuario;
	protected JButton jButtonNuevoGuardarCambiosCajaDiariaUsuario;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCajaDiariaUsuario;
	//protected JButton jButtonCerrarReporteDinamicoCajaDiariaUsuario;
	//protected JButton jButtonGenerarExcelReporteDinamicoCajaDiariaUsuario;	
	
	
	
	//protected JButton jButtonAbrirImportacionCajaDiariaUsuario;
	//protected JButton jButtonGenerarImportacionCajaDiariaUsuario;
	//protected JButton jButtonCerrarImportacionCajaDiariaUsuario;
	//protected JFileChooser jFileChooserImportacionCajaDiariaUsuario;
	//protected File fileImportacionCajaDiariaUsuario;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCajaDiariaUsuario;
	protected JButton jButtonDuplicarToolBarCajaDiariaUsuario;
	protected JButton jButtonNuevoRelacionesToolBarCajaDiariaUsuario;
	
	
	public JButton jButtonGuardarCambiosToolBarCajaDiariaUsuario;
	protected JButton jButtonCopiarToolBarCajaDiariaUsuario;
	protected JButton jButtonVerFormToolBarCajaDiariaUsuario;
	public JButton jButtonGuardarCambiosTablaToolBarCajaDiariaUsuario;
	protected JButton jButtonMostrarOcultarTablaToolBarCajaDiariaUsuario;
	protected JButton jButtonCerrarToolBarCajaDiariaUsuario;
	
	protected JButton jButtonRecargarInformacionToolBarCajaDiariaUsuario;
	protected JButton jButtonProcesarInformacionToolBarCajaDiariaUsuario;
	protected JButton jButtonAnterioresToolBarCajaDiariaUsuario;
	protected JButton jButtonSiguientesToolBarCajaDiariaUsuario;
	protected JButton jButtonNuevoGuardarCambiosToolBarCajaDiariaUsuario;
	protected JButton jButtonAbrirOrderByToolBarCajaDiariaUsuario;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCajaDiariaUsuario;
	protected JMenuItem jMenuItemDuplicarCajaDiariaUsuario;
	protected JMenuItem jMenuItemNuevoRelacionesCajaDiariaUsuario;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCajaDiariaUsuario;
	protected JMenuItem jMenuItemCopiarCajaDiariaUsuario;
	protected JMenuItem jMenuItemVerFormCajaDiariaUsuario;
	protected JMenuItem jMenuItemGuardarCambiosTablaCajaDiariaUsuario;
	protected JMenuItem jMenuItemCerrarCajaDiariaUsuario;
	protected JMenuItem jMenuItemDetalleCerrarCajaDiariaUsuario;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCajaDiariaUsuario;
	protected JMenuItem jMenuItemDetalleMostarOcultarCajaDiariaUsuario;
	
	protected JMenuItem jMenuItemRecargarInformacionCajaDiariaUsuario;
	protected JMenuItem jMenuItemProcesarInformacionCajaDiariaUsuario;
	protected JMenuItem jMenuItemAnterioresCajaDiariaUsuario;
	protected JMenuItem jMenuItemSiguientesCajaDiariaUsuario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCajaDiariaUsuario;
	protected JMenuItem jMenuItemAbrirOrderByCajaDiariaUsuario;
	protected JMenuItem jMenuItemMostrarOcultarCajaDiariaUsuario;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCajaDiariaUsuario;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCajaDiariaUsuario;
	protected JCheckBox jCheckBoxSeleccionadosCajaDiariaUsuario;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCajaDiariaUsuario;
	protected JCheckBox jCheckBoxConGraficoReporteCajaDiariaUsuario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCajaDiariaUsuario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCajaDiariaUsuario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCajaDiariaUsuario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCajaDiariaUsuario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCajaDiariaUsuario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCajaDiariaUsuario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCajaDiariaUsuario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCajaDiariaUsuario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCajaDiariaUsuario;
	protected JTextField jTextFieldValorCampoGeneralCajaDiariaUsuario;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCajaDiariaUsuario;
	//public JList<Reporte> jListColumnasSelectReporteCajaDiariaUsuario;
	//public JScrollPane jScrollColumnasSelectReporteCajaDiariaUsuario;
	
	//public JLabel jLabelRelacionesSelectReporteCajaDiariaUsuario;
	//public JList<Reporte> jListRelacionesSelectReporteCajaDiariaUsuario;
	//public JScrollPane jScrollRelacionesSelectReporteCajaDiariaUsuario;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCajaDiariaUsuario;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCajaDiariaUsuario;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCajaDiariaUsuario;
	//public JLabel jLabelTiposArchivoReporteDinamicoCajaDiariaUsuario;
	
		
	//public JLabel jLabelArchivoImportacionCajaDiariaUsuario;	
	//public JLabel jLabelPathArchivoImportacionCajaDiariaUsuario;
	//protected JTextField jTextFieldPathArchivoImportacionCajaDiariaUsuario;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCajaDiariaUsuario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCajaDiariaUsuario;
	
	//public JLabel jLabelColumnaCategoriaValorCajaDiariaUsuario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCajaDiariaUsuario;
	
	//public JLabel jLabelColumnasValoresGraficoCajaDiariaUsuario;
	//public JList<Reporte> jListColumnasValoresGraficoCajaDiariaUsuario;
	//public JScrollPane jScrollColumnasValoresGraficoCajaDiariaUsuario;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCajaDiariaUsuario;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCajaDiariaUsuario;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCajaDiariaUsuario;
	public JPanel jPanelBusquedaCajaDiariaUsuarioCajaDiariaUsuario;
	public JButton jButtonBusquedaCajaDiariaUsuarioCajaDiariaUsuario;
	
	public JPanel jPanelid_usuarioBusquedaCajaDiariaUsuarioCajaDiariaUsuario;
	public JLabel jLabelid_usuarioBusquedaCajaDiariaUsuarioCajaDiariaUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioBusquedaCajaDiariaUsuarioCajaDiariaUsuario;
	public JButton jButtonid_usuarioBusquedaCajaDiariaUsuarioCajaDiariaUsuario= new JButtonMe();
	public JButton jButtonid_usuarioBusquedaCajaDiariaUsuarioCajaDiariaUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_usuarioBusquedaCajaDiariaUsuarioCajaDiariaUsuarioBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_inicioBusquedaCajaDiariaUsuarioCajaDiariaUsuario;
	public JLabel jLabelfecha_inicioBusquedaCajaDiariaUsuarioCajaDiariaUsuario;
	//public JFormattedTextField jDateChooserfecha_inicioBusquedaCajaDiariaUsuarioCajaDiariaUsuario;

	public JDateChooser jDateChooserfecha_inicioBusquedaCajaDiariaUsuarioCajaDiariaUsuario;
	public JButton jButtonfecha_inicioBusquedaCajaDiariaUsuarioCajaDiariaUsuarioBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_finBusquedaCajaDiariaUsuarioCajaDiariaUsuario;
	public JLabel jLabelfecha_finBusquedaCajaDiariaUsuarioCajaDiariaUsuario;
	//public JFormattedTextField jDateChooserfecha_finBusquedaCajaDiariaUsuarioCajaDiariaUsuario;

	public JDateChooser jDateChooserfecha_finBusquedaCajaDiariaUsuarioCajaDiariaUsuario;
	public JButton jButtonfecha_finBusquedaCajaDiariaUsuarioCajaDiariaUsuarioBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=660;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CajaDiariaUsuarioJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CajaDiariaUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaDiariaUsuarioJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CajaDiariaUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaDiariaUsuarioJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CajaDiariaUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaDiariaUsuarioJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CajaDiariaUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCajaDiariaUsuario)	{
		this.jButtonRecargarInformacionCajaDiariaUsuario = jButtonRecargarInformacionCajaDiariaUsuario;
	}
	
	public JButton getjButtonProcesarInformacionCajaDiariaUsuario() {
		return this.jButtonProcesarInformacionCajaDiariaUsuario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCajaDiariaUsuario)	{
		this.jButtonProcesarInformacionCajaDiariaUsuario = jButtonProcesarInformacionCajaDiariaUsuario;
	}
	
	
	public JButton getjButtonRecargarInformacionCajaDiariaUsuario() {
		return this.jButtonRecargarInformacionCajaDiariaUsuario;
	}
	
	
	public List<CajaDiariaUsuario> getcajadiariausuarios() {
		return this.cajadiariausuarios;
	}

	public void setcajadiariausuarios(List<CajaDiariaUsuario> cajadiariausuarios) {
		this.cajadiariausuarios = cajadiariausuarios;
	}
	
	public List<CajaDiariaUsuario> getcajadiariausuariosAux() {
		return this.cajadiariausuariosAux;
	}

	public void setcajadiariausuariosAux(List<CajaDiariaUsuario> cajadiariausuariosAux) {
		this.cajadiariausuariosAux = cajadiariausuariosAux;
	}
	
	public List<CajaDiariaUsuario> getcajadiariausuariosEliminados() {
		return this.cajadiariausuariosEliminados;
	}

	public void setCajaDiariaUsuariosEliminados(List<CajaDiariaUsuario> cajadiariausuariosEliminados) {
		this.cajadiariausuariosEliminados = cajadiariausuariosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCajaDiariaUsuario() {
		return jComboBoxTiposSeleccionarCajaDiariaUsuario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCajaDiariaUsuario(
			JComboBox jComboBoxTiposSeleccionarCajaDiariaUsuario) {
		this.jComboBoxTiposSeleccionarCajaDiariaUsuario = jComboBoxTiposSeleccionarCajaDiariaUsuario;
	}
	
	public void setBorderResaltarTiposSeleccionarCajaDiariaUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCajaDiariaUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCajaDiariaUsuario .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCajaDiariaUsuario() {
		return jTextFieldValorCampoGeneralCajaDiariaUsuario;
	}

	public void setjTextFieldValorCampoGeneralCajaDiariaUsuario(
			JTextField jTextFieldValorCampoGeneralCajaDiariaUsuario) {
		this.jTextFieldValorCampoGeneralCajaDiariaUsuario = jTextFieldValorCampoGeneralCajaDiariaUsuario;
	}

	public void setBorderResaltarValorCampoGeneralCajaDiariaUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaDiariaUsuario.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCajaDiariaUsuario .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCajaDiariaUsuario() {
		return this.jCheckBoxSeleccionarTodosCajaDiariaUsuario;
	}

	public void setjCheckBoxSeleccionarTodosCajaDiariaUsuario(
			JCheckBox jCheckBoxSeleccionarTodosCajaDiariaUsuario) {
		this.jCheckBoxSeleccionarTodosCajaDiariaUsuario = jCheckBoxSeleccionarTodosCajaDiariaUsuario;
	}

	public void setBorderResaltarSeleccionarTodosCajaDiariaUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaDiariaUsuario.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCajaDiariaUsuario .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCajaDiariaUsuario() {
		return this.jCheckBoxSeleccionadosCajaDiariaUsuario;
	}

	public void setjCheckBoxSeleccionadosCajaDiariaUsuario(
			JCheckBox jCheckBoxSeleccionadosCajaDiariaUsuario) {
		this.jCheckBoxSeleccionadosCajaDiariaUsuario = jCheckBoxSeleccionadosCajaDiariaUsuario;
	}
	
	public void setBorderResaltarSeleccionadosCajaDiariaUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaDiariaUsuario.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCajaDiariaUsuario .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCajaDiariaUsuario() {
		return this.jComboBoxTiposArchivosReportesCajaDiariaUsuario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCajaDiariaUsuario(
			JComboBox jComboBoxTiposArchivosReportesCajaDiariaUsuario) {
		this.jComboBoxTiposArchivosReportesCajaDiariaUsuario = jComboBoxTiposArchivosReportesCajaDiariaUsuario;
	}

	public void setBorderResaltarTiposArchivosReportesCajaDiariaUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaDiariaUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCajaDiariaUsuario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCajaDiariaUsuario() {
		return this.jComboBoxTiposReportesCajaDiariaUsuario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCajaDiariaUsuario(
			JComboBox jComboBoxTiposReportesCajaDiariaUsuario) {
		this.jComboBoxTiposReportesCajaDiariaUsuario = jComboBoxTiposReportesCajaDiariaUsuario;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCajaDiariaUsuario() {
	//	return jComboBoxTiposReportesDinamicoCajaDiariaUsuario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCajaDiariaUsuario(
	//		JComboBox jComboBoxTiposReportesDinamicoCajaDiariaUsuario) {
	//	this.jComboBoxTiposReportesDinamicoCajaDiariaUsuario = jComboBoxTiposReportesDinamicoCajaDiariaUsuario;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCajaDiariaUsuario() {
	//	return jComboBoxTiposArchivosReportesDinamicoCajaDiariaUsuario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCajaDiariaUsuario(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCajaDiariaUsuario) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCajaDiariaUsuario = jComboBoxTiposArchivosReportesDinamicoCajaDiariaUsuario;
	//}
	
	public void setBorderResaltarTiposReportesCajaDiariaUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaDiariaUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCajaDiariaUsuario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCajaDiariaUsuario() {
		return this.jComboBoxTiposGraficosReportesCajaDiariaUsuario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCajaDiariaUsuario(
			JComboBox jComboBoxTiposGraficosReportesCajaDiariaUsuario) {
		this.jComboBoxTiposGraficosReportesCajaDiariaUsuario = jComboBoxTiposGraficosReportesCajaDiariaUsuario;
	}
	
	public void setBorderResaltarTiposGraficosReportesCajaDiariaUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaDiariaUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCajaDiariaUsuario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCajaDiariaUsuario() {
		return this.jComboBoxTiposPaginacionCajaDiariaUsuario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCajaDiariaUsuario(
			JComboBox jComboBoxTiposPaginacionCajaDiariaUsuario) {
		this.jComboBoxTiposPaginacionCajaDiariaUsuario = jComboBoxTiposPaginacionCajaDiariaUsuario;
	}
	
	public void setBorderResaltarTiposPaginacionCajaDiariaUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaDiariaUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCajaDiariaUsuario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCajaDiariaUsuario() {
		return this.jComboBoxTiposRelacionesCajaDiariaUsuario;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCajaDiariaUsuario() {
		return this.jComboBoxTiposAccionesCajaDiariaUsuario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCajaDiariaUsuario(
			JComboBox jComboBoxTiposRelacionesCajaDiariaUsuario) {
		this.jComboBoxTiposRelacionesCajaDiariaUsuario = jComboBoxTiposRelacionesCajaDiariaUsuario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCajaDiariaUsuario(
			JComboBox jComboBoxTiposAccionesCajaDiariaUsuario) {
		this.jComboBoxTiposAccionesCajaDiariaUsuario = jComboBoxTiposAccionesCajaDiariaUsuario;
	}
	
	public void setBorderResaltarTiposRelacionesCajaDiariaUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaDiariaUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCajaDiariaUsuario .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCajaDiariaUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaDiariaUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCajaDiariaUsuario .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCajaDiariaUsuario() {
	//	return jCheckBoxConGraficoDinamicoCajaDiariaUsuario;
	//}

	//public void setjCheckBoxConGraficoDinamicoCajaDiariaUsuario(
	//		JCheckBox jCheckBoxConGraficoDinamicoCajaDiariaUsuario) {
	//	this.jCheckBoxConGraficoDinamicoCajaDiariaUsuario = jCheckBoxConGraficoDinamicoCajaDiariaUsuario;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCajaDiariaUsuario() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCajaDiariaUsuario.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCajaDiariaUsuario .setBorder(borderResaltar);		
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
		this.cajadiariausuarioSessionBean=new CajaDiariaUsuarioSessionBean();
		
		this.cajadiariausuarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cajadiariausuarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cajadiariausuarioSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CajaDiariaUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CajaDiariaUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CajaDiariaUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CajaDiariaUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CajaDiariaUsuarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Caja Diaria Usuario MANTENIMIENTO"));
		
		
		if(iWidth > 1650) {
			iWidth=1650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {
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
		
		CajaDiariaUsuarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CajaDiariaUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCajaDiariaUsuario= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCajaDiariaUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCajaDiariaUsuario,this.jTtoolBarCajaDiariaUsuario,
							"nuevo","nuevo","Nuevo"+" "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCajaDiariaUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCajaDiariaUsuario,this.jTtoolBarCajaDiariaUsuario,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCajaDiariaUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCajaDiariaUsuario,this.jTtoolBarCajaDiariaUsuario,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCajaDiariaUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCajaDiariaUsuario,this.jTtoolBarCajaDiariaUsuario,
							"duplicar","duplicar","Duplicar"+" "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCajaDiariaUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCajaDiariaUsuario,this.jTtoolBarCajaDiariaUsuario,
							"copiar","copiar","Copiar"+" "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCajaDiariaUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCajaDiariaUsuario,this.jTtoolBarCajaDiariaUsuario,
							"ver_form","ver_form","Ver"+" "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCajaDiariaUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCajaDiariaUsuario,this.jTtoolBarCajaDiariaUsuario,
							"recargar","recargar","Buscar"+" "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarCajaDiariaUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCajaDiariaUsuario,this.jTtoolBarCajaDiariaUsuario,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCajaDiariaUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCajaDiariaUsuario,this.jTtoolBarCajaDiariaUsuario,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCajaDiariaUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCajaDiariaUsuario,this.jTtoolBarCajaDiariaUsuario,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCajaDiariaUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCajaDiariaUsuario,this.jTtoolBarCajaDiariaUsuario,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCajaDiariaUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCajaDiariaUsuario,this.jTtoolBarCajaDiariaUsuario,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCajaDiariaUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCajaDiariaUsuario,this.jTtoolBarCajaDiariaUsuario,
							"cerrar","cerrar","Salir"+" "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCajaDiariaUsuario=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCajaDiariaUsuario;
			
				this.jButtonProcesarInformacionToolBarCajaDiariaUsuario=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCajaDiariaUsuario;
				
		//protected JButton jButtonModificarToolBarCajaDiariaUsuario;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCajaDiariaUsuario=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCajaDiariaUsuario=new JMenuMe("General");
		this.jmenuArchivoCajaDiariaUsuario=new JMenuMe("Archivo");
		this.jmenuAccionesCajaDiariaUsuario=new JMenuMe("Acciones");
		this.jmenuDatosCajaDiariaUsuario=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCajaDiariaUsuario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCajaDiariaUsuario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCajaDiariaUsuario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCajaDiariaUsuario= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCajaDiariaUsuario.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCajaDiariaUsuario,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCajaDiariaUsuario= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCajaDiariaUsuario.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCajaDiariaUsuario,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCajaDiariaUsuario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCajaDiariaUsuario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCajaDiariaUsuario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCajaDiariaUsuario= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCajaDiariaUsuario.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCajaDiariaUsuario,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCajaDiariaUsuario= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCajaDiariaUsuario.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCajaDiariaUsuario,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCajaDiariaUsuario= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCajaDiariaUsuario.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCajaDiariaUsuario,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCajaDiariaUsuario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCajaDiariaUsuario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCajaDiariaUsuario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCajaDiariaUsuario= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCajaDiariaUsuario.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCajaDiariaUsuario,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCajaDiariaUsuario= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCajaDiariaUsuario.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCajaDiariaUsuario,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCajaDiariaUsuario= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCajaDiariaUsuario.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCajaDiariaUsuario,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCajaDiariaUsuario= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCajaDiariaUsuario.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCajaDiariaUsuario,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCajaDiariaUsuario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCajaDiariaUsuario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCajaDiariaUsuario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCajaDiariaUsuario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCajaDiariaUsuario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCajaDiariaUsuario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCajaDiariaUsuario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCajaDiariaUsuario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCajaDiariaUsuario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCajaDiariaUsuario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCajaDiariaUsuario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCajaDiariaUsuario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCajaDiariaUsuario= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCajaDiariaUsuario.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCajaDiariaUsuario,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCajaDiariaUsuario.add(this.jMenuItemCerrarCajaDiariaUsuario);
			
			this.jmenuAccionesCajaDiariaUsuario.add(this.jMenuItemNuevoCajaDiariaUsuario);
			this.jmenuAccionesCajaDiariaUsuario.add(this.jMenuItemNuevoGuardarCambiosCajaDiariaUsuario);
			this.jmenuAccionesCajaDiariaUsuario.add(this.jMenuItemNuevoRelacionesCajaDiariaUsuario);
			this.jmenuAccionesCajaDiariaUsuario.add(this.jMenuItemGuardarCambiosTablaCajaDiariaUsuario);		
			this.jmenuAccionesCajaDiariaUsuario.add(this.jMenuItemDuplicarCajaDiariaUsuario);		
			this.jmenuAccionesCajaDiariaUsuario.add(this.jMenuItemCopiarCajaDiariaUsuario);		
			this.jmenuAccionesCajaDiariaUsuario.add(this.jMenuItemVerFormCajaDiariaUsuario);		
			
			this.jmenuDatosCajaDiariaUsuario.add(this.jMenuItemRecargarInformacionCajaDiariaUsuario);				
			this.jmenuDatosCajaDiariaUsuario.add(this.jMenuItemAnterioresCajaDiariaUsuario);				
			this.jmenuDatosCajaDiariaUsuario.add(this.jMenuItemSiguientesCajaDiariaUsuario);				
			this.jmenuDatosCajaDiariaUsuario.add(this.jMenuItemAbrirOrderByCajaDiariaUsuario);				
			this.jmenuDatosCajaDiariaUsuario.add(this.jMenuItemMostrarOcultarCajaDiariaUsuario);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCajaDiariaUsuario.add(this.jMenuItemGuardarCambiosCajaDiariaUsuario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCajaDiariaUsuario.add(this.jmenuArchivoCajaDiariaUsuario);		
			this.jmenuBarCajaDiariaUsuario.add(this.jmenuAccionesCajaDiariaUsuario);		
			this.jmenuBarCajaDiariaUsuario.add(this.jmenuDatosCajaDiariaUsuario);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCajaDiariaUsuario);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCajaDiariaUsuario() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaCajaDiariaUsuarioCajaDiariaUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setToolTipText("Buscar Por Usuario Por Fecha Inicio Por Fecha Fin ");
		this.jButtonBusquedaCajaDiariaUsuarioCajaDiariaUsuario= new JButtonMe();
		this.jButtonBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setText("Buscar");
		this.jButtonBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setToolTipText("Buscar Por Usuario Por Fecha Inicio Por Fecha Fin ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaCajaDiariaUsuarioCajaDiariaUsuario,"buscar_button","Buscar Por Usuario Por Fecha Inicio Por Fecha Fin ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaCajaDiariaUsuarioCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_usuarioBusquedaCajaDiariaUsuarioCajaDiariaUsuario = new JLabelMe();
		jLabelid_usuarioBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setText("Usuario :");
		jLabelid_usuarioBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setToolTipText("Usuario");
		jLabelid_usuarioBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_usuarioBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_usuarioBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioBusquedaCajaDiariaUsuarioCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_usuarioBusquedaCajaDiariaUsuarioCajaDiariaUsuario= new JComboBoxMe();
		jComboBoxid_usuarioBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioBusquedaCajaDiariaUsuarioCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_inicioBusquedaCajaDiariaUsuarioCajaDiariaUsuario = new JLabelMe();
		jLabelfecha_inicioBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setText("Fecha Inicio :");
		jLabelfecha_inicioBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setToolTipText("Fecha Inicio");
		jLabelfecha_inicioBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_inicioBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_inicioBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioBusquedaCajaDiariaUsuarioCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_inicioBusquedaCajaDiariaUsuarioCajaDiariaUsuario= new JDateChooser();
		jDateChooserfecha_inicioBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioBusquedaCajaDiariaUsuarioCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_inicioBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setDate(new Date());
		jDateChooserfecha_inicioBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_inicioBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_finBusquedaCajaDiariaUsuarioCajaDiariaUsuario = new JLabelMe();
		jLabelfecha_finBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setText("Fecha Fin :");
		jLabelfecha_finBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setToolTipText("Fecha Fin");
		jLabelfecha_finBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_finBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_finBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_finBusquedaCajaDiariaUsuarioCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_finBusquedaCajaDiariaUsuarioCajaDiariaUsuario= new JDateChooser();
		jDateChooserfecha_finBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finBusquedaCajaDiariaUsuarioCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_finBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setDate(new Date());
		jDateChooserfecha_finBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_finBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasCajaDiariaUsuario=new JTabbedPane();


		this.jTabbedPaneBusquedasCajaDiariaUsuario.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasCajaDiariaUsuario.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasCajaDiariaUsuario.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasCajaDiariaUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCajaDiariaUsuario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCajaDiariaUsuario = new CajaDiariaUsuarioDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Caja Diaria Usuario DATOS");
			this.jInternalFrameDetalleFormCajaDiariaUsuario = new CajaDiariaUsuarioDetalleFormJInternalFrame(jDesktopPane,this.cajadiariausuarioSessionBean.getConGuardarRelaciones(),this.cajadiariausuarioSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCajaDiariaUsuario = null;//new CajaDiariaUsuarioDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCajaDiariaUsuario= new GridBagLayout();
		
		
		this.jTableDatosCajaDiariaUsuario = new JTableMe();      
		
		String sToolTipCajaDiariaUsuario="";
		sToolTipCajaDiariaUsuario=CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCajaDiariaUsuario+="(PuntoVenta.CajaDiariaUsuario)";
		}
		
		if(!this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipCajaDiariaUsuario+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCajaDiariaUsuario.setToolTipText(sToolTipCajaDiariaUsuario);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCajaDiariaUsuario);
		this.jTableDatosCajaDiariaUsuario.setAutoCreateRowSorter(true);
		this.jTableDatosCajaDiariaUsuario.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCajaDiariaUsuario.setRowSelectionAllowed(true);
		this.jTableDatosCajaDiariaUsuario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCajaDiariaUsuario,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCajaDiariaUsuario = new JButtonMe();
		this.jButtonDuplicarCajaDiariaUsuario = new JButtonMe();
		this.jButtonCopiarCajaDiariaUsuario = new JButtonMe();
		this.jButtonVerFormCajaDiariaUsuario = new JButtonMe();
		this.jButtonNuevoRelacionesCajaDiariaUsuario = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCajaDiariaUsuario = new JButtonMe();
		this.jButtonCerrarCajaDiariaUsuario = new JButtonMe();
		
		this.jScrollPanelDatosCajaDiariaUsuario = new JScrollPane();   
        this.jScrollPanelDatosGeneralCajaDiariaUsuario = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCajaDiariaUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Caja Diaria Usuario";
		
		if(!this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCajaDiariaUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Diaria Usuarios" + this.sPath));
		} else {
			this.jScrollPanelDatosCajaDiariaUsuario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCajaDiariaUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCajaDiariaUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCajaDiariaUsuario.setToolTipText("Acciones");
        this.jPanelAccionesCajaDiariaUsuario.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCajaDiariaUsuario=new ReporteDinamicoJInternalFrame(CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCajaDiariaUsuario();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCajaDiariaUsuario=new ImportacionJInternalFrame(CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCajaDiariaUsuario();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCajaDiariaUsuario = new JButtonMe();
		
		this.jButtonAbrirOrderByCajaDiariaUsuario.setText("Orden");
		this.jButtonAbrirOrderByCajaDiariaUsuario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCajaDiariaUsuario,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCajaDiariaUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCajaDiariaUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCajaDiariaUsuario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCajaDiariaUsuario,false,this);
			
			//this.cargarOrderByCajaDiariaUsuario(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCajaDiariaUsuario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCajaDiariaUsuario,true,this);
			
			//this.cargarOrderByCajaDiariaUsuario(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCajaDiariaUsuario.setMinimumSize(new Dimension(400,50));//1430
		this.jTableDatosCajaDiariaUsuario.setMaximumSize(new Dimension(400,50));//1430
		this.jTableDatosCajaDiariaUsuario.setPreferredSize(new Dimension(400,50));//1430
		
		this.jScrollPanelDatosCajaDiariaUsuario.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCajaDiariaUsuario.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCajaDiariaUsuario.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCajaDiariaUsuario.setText("Nuevo");
		this.jButtonDuplicarCajaDiariaUsuario.setText("Duplicar");
		this.jButtonCopiarCajaDiariaUsuario.setText("Copiar");
		this.jButtonVerFormCajaDiariaUsuario.setText("Ver");
		this.jButtonNuevoRelacionesCajaDiariaUsuario.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCajaDiariaUsuario.setText("Guardar");
		this.jButtonCerrarCajaDiariaUsuario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCajaDiariaUsuario,"nuevo_button","Nuevo",this.cajadiariausuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCajaDiariaUsuario,"duplicar_button","Duplicar",this.cajadiariausuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCajaDiariaUsuario,"copiar_button","Copiar",this.cajadiariausuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCajaDiariaUsuario,"ver_form","Ver",this.cajadiariausuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCajaDiariaUsuario,"nuevorelaciones_button","Nuevo Rel",this.cajadiariausuarioSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCajaDiariaUsuario,"guardarcambiostabla_button","Guardar",this.cajadiariausuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCajaDiariaUsuario,"cerrar_button","Salir",this.cajadiariausuarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCajaDiariaUsuario.setToolTipText("Nuevo"+" "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCajaDiariaUsuario.setToolTipText("Duplicar"+" "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCajaDiariaUsuario.setToolTipText("Copiar"+" "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCajaDiariaUsuario.setToolTipText("Ver"+" "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCajaDiariaUsuario.setToolTipText("Nuevo Rel"+" "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCajaDiariaUsuario.setToolTipText("Guardar"+" "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCajaDiariaUsuario.setToolTipText("Salir"+" "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCajaDiariaUsuario";
		inputMap = this.jButtonNuevoCajaDiariaUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCajaDiariaUsuario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCajaDiariaUsuario"));
		
		//DUPLICAR
		sMapKey = "DuplicarCajaDiariaUsuario";
		inputMap = this.jButtonDuplicarCajaDiariaUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCajaDiariaUsuario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCajaDiariaUsuario"));
		
		//COPIAR
		sMapKey = "CopiarCajaDiariaUsuario";
		inputMap = this.jButtonCopiarCajaDiariaUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCajaDiariaUsuario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCajaDiariaUsuario"));
		
		//VEr FORM
		sMapKey = "VerFormCajaDiariaUsuario";
		inputMap = this.jButtonVerFormCajaDiariaUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCajaDiariaUsuario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCajaDiariaUsuario"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCajaDiariaUsuario";
		inputMap = this.jButtonNuevoRelacionesCajaDiariaUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCajaDiariaUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCajaDiariaUsuario"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCajaDiariaUsuario";
		inputMap = this.jButtonModificarCajaDiariaUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCajaDiariaUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCajaDiariaUsuario"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCajaDiariaUsuario";
		inputMap = this.jButtonCerrarCajaDiariaUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCajaDiariaUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCajaDiariaUsuario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCajaDiariaUsuario";
		inputMap = this.jButtonGuardarCambiosTablaCajaDiariaUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCajaDiariaUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCajaDiariaUsuario"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCajaDiariaUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCajaDiariaUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCajaDiariaUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CajaDiariaUsuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CajaDiariaUsuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CajaDiariaUsuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CajaDiariaUsuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CajaDiariaUsuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCajaDiariaUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCajaDiariaUsuario.setName("jPanelParametrosReportesCajaDiariaUsuario"); 
		
		this.jPanelParametrosReportesAccionesCajaDiariaUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCajaDiariaUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCajaDiariaUsuario.setName("jPanelParametrosReportesAccionesCajaDiariaUsuario"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCajaDiariaUsuario = new JButtonMe();
		this.jButtonRecargarInformacionCajaDiariaUsuario.setText("Buscar");
		this.jButtonRecargarInformacionCajaDiariaUsuario.setToolTipText("Buscar"+" "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCajaDiariaUsuario,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionCajaDiariaUsuario.setVisible(false);
		
		
		this.jButtonProcesarInformacionCajaDiariaUsuario = new JButtonMe();
		this.jButtonProcesarInformacionCajaDiariaUsuario.setText("Procesar");
		this.jButtonProcesarInformacionCajaDiariaUsuario.setToolTipText("Procesar"+" "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCajaDiariaUsuario.setVisible(false);
			
		this.jButtonProcesarInformacionCajaDiariaUsuario.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCajaDiariaUsuario.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCajaDiariaUsuario.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCajaDiariaUsuario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCajaDiariaUsuario.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCajaDiariaUsuario.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCajaDiariaUsuario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCajaDiariaUsuario.setText("TIPO");       
		this.jComboBoxTiposReportesCajaDiariaUsuario.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCajaDiariaUsuario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCajaDiariaUsuario.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCajaDiariaUsuario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCajaDiariaUsuario = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCajaDiariaUsuario.setText("Paginacion");
		this.jComboBoxTiposPaginacionCajaDiariaUsuario.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCajaDiariaUsuario = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCajaDiariaUsuario.setText("Accion");
		this.jComboBoxTiposRelacionesCajaDiariaUsuario.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCajaDiariaUsuario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCajaDiariaUsuario.setText("Accion");
		this.jComboBoxTiposAccionesCajaDiariaUsuario.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCajaDiariaUsuario = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCajaDiariaUsuario.setText("Accion");
		this.jComboBoxTiposSeleccionarCajaDiariaUsuario.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCajaDiariaUsuario=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCajaDiariaUsuario.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCajaDiariaUsuario.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCajaDiariaUsuario.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCajaDiariaUsuario = new JLabelMe();
		
		this.jLabelAccionesCajaDiariaUsuario.setText("Acciones");		
		this.jLabelAccionesCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCajaDiariaUsuario = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCajaDiariaUsuario.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCajaDiariaUsuario.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCajaDiariaUsuario = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCajaDiariaUsuario.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCajaDiariaUsuario.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCajaDiariaUsuario = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCajaDiariaUsuario.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCajaDiariaUsuario.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCajaDiariaUsuario = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCajaDiariaUsuario.setText("Graf.");
		this.jCheckBoxConGraficoReporteCajaDiariaUsuario.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCajaDiariaUsuario = new JButtonMe();
		//this.jButtonAnterioresCajaDiariaUsuario.setText("<<");
        this.jButtonAnterioresCajaDiariaUsuario.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCajaDiariaUsuario,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCajaDiariaUsuario = new JButtonMe();
		//this.jButtonSiguientesCajaDiariaUsuario.setText(">>");
        this.jButtonSiguientesCajaDiariaUsuario.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCajaDiariaUsuario,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCajaDiariaUsuario = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCajaDiariaUsuario.setText("Nue");
        this.jButtonNuevoGuardarCambiosCajaDiariaUsuario.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCajaDiariaUsuario,"nuevoguardarcambios_button","Nue",this.cajadiariausuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCajaDiariaUsuario";
		inputMap = this.jButtonNuevoGuardarCambiosCajaDiariaUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCajaDiariaUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCajaDiariaUsuario"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCajaDiariaUsuario";
		inputMap = this.jButtonRecargarInformacionCajaDiariaUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCajaDiariaUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCajaDiariaUsuario"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCajaDiariaUsuario";
		inputMap = this.jButtonSiguientesCajaDiariaUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCajaDiariaUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCajaDiariaUsuario"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCajaDiariaUsuario";
		inputMap = this.jButtonAnterioresCajaDiariaUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCajaDiariaUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCajaDiariaUsuario"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCajaDiariaUsuario();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCajaDiariaUsuario.setMinimumSize(new Dimension(this.getWidth(),CajaDiariaUsuarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CajaDiariaUsuarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCajaDiariaUsuario.setMaximumSize(new Dimension(this.getWidth(),CajaDiariaUsuarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CajaDiariaUsuarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCajaDiariaUsuario.setPreferredSize(new Dimension(this.getWidth(),CajaDiariaUsuarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CajaDiariaUsuarioBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCajaDiariaUsuario = new GridBagLayout();

			this.jPanelPaginacionCajaDiariaUsuario.setLayout(gridaBagLayoutPaginacionCajaDiariaUsuario);						
			
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
			this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCajaDiariaUsuario.add(this.jButtonAnterioresCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
					
						
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
			
			this.jPanelPaginacionCajaDiariaUsuario.add(this.jButtonNuevoGuardarCambiosCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
						
			
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
			this.jPanelPaginacionCajaDiariaUsuario.add(this.jButtonSiguientesCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaUsuario.gridy = 1;
			this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCajaDiariaUsuario.add(this.jButtonNuevoCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
						
			
			
			if(!this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
				this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCajaDiariaUsuario.gridy = 1;
				this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCajaDiariaUsuario.add(this.jButtonGuardarCambiosTablaCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
			}
			
			
			
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaUsuario.gridy = 1;
			this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCajaDiariaUsuario.add(this.jButtonDuplicarCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
			
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaUsuario.gridy = 1;
			this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCajaDiariaUsuario.add(this.jButtonCopiarCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
		
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaUsuario.gridy = 1;
			this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCajaDiariaUsuario.add(this.jButtonVerFormCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
		
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaUsuario.gridy = 1;
			this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCajaDiariaUsuario.add(this.jButtonCerrarCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
		
		
		
		this.jButtonRecargarInformacionCajaDiariaUsuario.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCajaDiariaUsuario.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCajaDiariaUsuario.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCajaDiariaUsuario.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCajaDiariaUsuario.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCajaDiariaUsuario.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCajaDiariaUsuario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCajaDiariaUsuario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCajaDiariaUsuario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCajaDiariaUsuario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCajaDiariaUsuario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCajaDiariaUsuario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCajaDiariaUsuario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCajaDiariaUsuario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCajaDiariaUsuario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCajaDiariaUsuario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCajaDiariaUsuario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCajaDiariaUsuario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCajaDiariaUsuario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCajaDiariaUsuario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCajaDiariaUsuario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCajaDiariaUsuario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCajaDiariaUsuario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCajaDiariaUsuario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCajaDiariaUsuario.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCajaDiariaUsuario.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCajaDiariaUsuario.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCajaDiariaUsuario.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCajaDiariaUsuario.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCajaDiariaUsuario.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCajaDiariaUsuario.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCajaDiariaUsuario.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCajaDiariaUsuario.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCajaDiariaUsuario.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCajaDiariaUsuario.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCajaDiariaUsuario.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCajaDiariaUsuario = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCajaDiariaUsuario = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CajaDiariaUsuario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CajaDiariaUsuario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CajaDiariaUsuario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CajaDiariaUsuario = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCajaDiariaUsuario.setLayout(gridaBagParametrosReportesCajaDiariaUsuario);
			this.jPanelParametrosReportesAccionesCajaDiariaUsuario.setLayout(gridaBagParametrosReportesAccionesCajaDiariaUsuario);
			
			
			this.jPanelParametrosAuxiliar1CajaDiariaUsuario.setLayout(gridaBagParametrosAuxiliar1CajaDiariaUsuario);
			this.jPanelParametrosAuxiliar2CajaDiariaUsuario.setLayout(gridaBagParametrosAuxiliar2CajaDiariaUsuario);
			this.jPanelParametrosAuxiliar3CajaDiariaUsuario.setLayout(gridaBagParametrosAuxiliar3CajaDiariaUsuario);
			this.jPanelParametrosAuxiliar4CajaDiariaUsuario.setLayout(gridaBagParametrosAuxiliar4CajaDiariaUsuario);
			//this.jPanelParametrosAuxiliar5CajaDiariaUsuario.setLayout(gridaBagParametrosAuxiliar2CajaDiariaUsuario);			
			
			
			
			
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaUsuario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCajaDiariaUsuario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCajaDiariaUsuario.add(this.jButtonRecargarInformacionCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaDiariaUsuario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCajaDiariaUsuario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CajaDiariaUsuario.add(this.jComboBoxTiposPaginacionCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaDiariaUsuario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCajaDiariaUsuario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CajaDiariaUsuario.add(this.jCheckBoxConAltoMaximoTablaCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaDiariaUsuario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCajaDiariaUsuario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CajaDiariaUsuario.add(this.jComboBoxTiposArchivosReportesCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaDiariaUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaDiariaUsuario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajaDiariaUsuario.add(this.jPanelParametrosAuxiliar1CajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaUsuario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajaDiariaUsuario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CajaDiariaUsuario.add(this.jComboBoxTiposReportesCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);																		
			
			
			
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaUsuario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajaDiariaUsuario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4CajaDiariaUsuario.add(this.jComboBoxTiposGraficosReportesCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaDiariaUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaDiariaUsuario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajaDiariaUsuario.add(this.jPanelParametrosAuxiliar4CajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaDiariaUsuario.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCajaDiariaUsuario.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajaDiariaUsuario.add(this.jComboBoxTiposReportesCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaDiariaUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaDiariaUsuario.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCajaDiariaUsuario.add(this.jCheckBoxGenerarReporteCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaDiariaUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaDiariaUsuario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajaDiariaUsuario.add(this.jPanelParametrosAuxiliar2CajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaUsuario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCajaDiariaUsuario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCajaDiariaUsuario.add(this.jLabelAccionesCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
				this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCajaDiariaUsuario.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCajaDiariaUsuario.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCajaDiariaUsuario.add(this.jButtonAbrirOrderByCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCajaDiariaUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaDiariaUsuario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCajaDiariaUsuario.add(this.jComboBoxTiposSeleccionarCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);			
			
			
			/*
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaUsuario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCajaDiariaUsuario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCajaDiariaUsuario.add(this.jCheckBoxSeleccionarTodosCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
			
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaUsuario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCajaDiariaUsuario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCajaDiariaUsuario.add(this.jCheckBoxConGraficoReporteCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaUsuario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajaDiariaUsuario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CajaDiariaUsuario.add(this.jCheckBoxSeleccionarTodosCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);															
				
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaUsuario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajaDiariaUsuario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CajaDiariaUsuario.add(this.jCheckBoxSeleccionadosCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);															
			
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaUsuario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajaDiariaUsuario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CajaDiariaUsuario.add(this.jCheckBoxConGraficoReporteCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaDiariaUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaDiariaUsuario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajaDiariaUsuario.add(this.jPanelParametrosAuxiliar3CajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaDiariaUsuario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCajaDiariaUsuario.add(this.jComboBoxTiposAccionesCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCajaDiariaUsuario = new GridBagLayout();

			this.jScrollPanelDatosCajaDiariaUsuario.setLayout(gridaBagLayoutDatosCajaDiariaUsuario);
			
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
			this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;
			
			this.jScrollPanelDatosCajaDiariaUsuario.add(this.jTableDatosCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCajaDiariaUsuario.setViewportView(this.jTableDatosCajaDiariaUsuario);
		this.jTableDatosCajaDiariaUsuario.setFillsViewportHeight(true);
		this.jTableDatosCajaDiariaUsuario.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCajaDiariaUsuario= new GridBagLayout();
		this.jPanelAccionesCajaDiariaUsuario.setLayout(gridaBagLayoutAccionesCajaDiariaUsuario);
		
		
		/*	
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = 0;
		this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;
			
		this.jPanelAccionesCajaDiariaUsuario.add(this.jButtonNuevoCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaCajaDiariaUsuarioCajaDiariaUsuario= new GridBagLayout();
		gridaBagLayoutBusquedaCajaDiariaUsuarioCajaDiariaUsuario.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaCajaDiariaUsuarioCajaDiariaUsuario.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaCajaDiariaUsuarioCajaDiariaUsuario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaCajaDiariaUsuarioCajaDiariaUsuario.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setLayout(gridaBagLayoutBusquedaCajaDiariaUsuarioCajaDiariaUsuario);

		gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaDiariaUsuario.gridy = 0;
		gridBagConstraintsCajaDiariaUsuario.gridx = 0;
		jPanelBusquedaCajaDiariaUsuarioCajaDiariaUsuario.add(jLabelid_usuarioBusquedaCajaDiariaUsuarioCajaDiariaUsuario, gridBagConstraintsCajaDiariaUsuario);

		gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaDiariaUsuario.gridy = 0;
		gridBagConstraintsCajaDiariaUsuario.gridx = 1;
		jPanelBusquedaCajaDiariaUsuarioCajaDiariaUsuario.add(jComboBoxid_usuarioBusquedaCajaDiariaUsuarioCajaDiariaUsuario, gridBagConstraintsCajaDiariaUsuario);


		gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaDiariaUsuario.gridy = 1;
		gridBagConstraintsCajaDiariaUsuario.gridx = 0;
		jPanelBusquedaCajaDiariaUsuarioCajaDiariaUsuario.add(jLabelfecha_inicioBusquedaCajaDiariaUsuarioCajaDiariaUsuario, gridBagConstraintsCajaDiariaUsuario);

		gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaDiariaUsuario.gridy = 1;
		gridBagConstraintsCajaDiariaUsuario.gridx = 1;
		jPanelBusquedaCajaDiariaUsuarioCajaDiariaUsuario.add(jDateChooserfecha_inicioBusquedaCajaDiariaUsuarioCajaDiariaUsuario, gridBagConstraintsCajaDiariaUsuario);


		gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaDiariaUsuario.gridy = 2;
		gridBagConstraintsCajaDiariaUsuario.gridx = 0;
		jPanelBusquedaCajaDiariaUsuarioCajaDiariaUsuario.add(jLabelfecha_finBusquedaCajaDiariaUsuarioCajaDiariaUsuario, gridBagConstraintsCajaDiariaUsuario);

		gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaDiariaUsuario.gridy = 2;
		gridBagConstraintsCajaDiariaUsuario.gridx = 1;
		jPanelBusquedaCajaDiariaUsuarioCajaDiariaUsuario.add(jDateChooserfecha_finBusquedaCajaDiariaUsuarioCajaDiariaUsuario, gridBagConstraintsCajaDiariaUsuario);

		gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaDiariaUsuario.gridy = 3;
		gridBagConstraintsCajaDiariaUsuario.gridx =1;
		jPanelBusquedaCajaDiariaUsuarioCajaDiariaUsuario.add(jButtonBusquedaCajaDiariaUsuarioCajaDiariaUsuario, gridBagConstraintsCajaDiariaUsuario);

		jTabbedPaneBusquedasCajaDiariaUsuario.addTab("1.-Por Usuario Por Fecha Inicio Por Fecha Fin ", jPanelBusquedaCajaDiariaUsuarioCajaDiariaUsuario);
		jTabbedPaneBusquedasCajaDiariaUsuario.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCajaDiariaUsuario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCajaDiariaUsuario);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();						
			this.gridBagConstraintsCajaDiariaUsuario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;		
			//this.gridBagConstraintsCajaDiariaUsuario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCajaDiariaUsuario.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;		
		//this.gridBagConstraintsCajaDiariaUsuario.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCajaDiariaUsuario.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCajaDiariaUsuario);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCajaDiariaUsuario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;		
			this.gridBagConstraintsCajaDiariaUsuario.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaUsuario.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCajaDiariaUsuario.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);								
		
		
		/*
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
		*/		
		
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCajaDiariaUsuario.gridx =0;
		this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCajaDiariaUsuario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
				
		
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CajaDiariaUsuarioJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCajaDiariaUsuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCajaDiariaUsuario = new GridBagLayout();
			this.jPanelBusquedasParametrosCajaDiariaUsuario.setLayout(gridaBagLayoutBusquedasParametrosCajaDiariaUsuario);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCajaDiariaUsuario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCajaDiariaUsuario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCajaDiariaUsuario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCajaDiariaUsuario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
			
			
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaDiariaUsuario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
		
			
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCajaDiariaUsuario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCajaDiariaUsuario;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCajaDiariaUsuario() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCajaDiariaUsuario = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCajaDiariaUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCajaDiariaUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCajaDiariaUsuario.setName("jPanelReporteDinamicoCajaDiariaUsuario"); 
		
		this.jPanelReporteDinamicoCajaDiariaUsuario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCajaDiariaUsuario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCajaDiariaUsuario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCajaDiariaUsuario.setLayout(gridaBagLayoutReporteDinamicoCajaDiariaUsuario);
		
		
		this.jInternalFrameReporteDinamicoCajaDiariaUsuario= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCajaDiariaUsuario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCajaDiariaUsuario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCajaDiariaUsuario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCajaDiariaUsuario.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCajaDiariaUsuario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCajaDiariaUsuario.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCajaDiariaUsuario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCajaDiariaUsuario.setResizable(true);
	    this.jInternalFrameReporteDinamicoCajaDiariaUsuario.setClosable(true);
	    this.jInternalFrameReporteDinamicoCajaDiariaUsuario.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCajaDiariaUsuario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCajaDiariaUsuario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCajaDiariaUsuario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCajaDiariaUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Diaria Usuarios"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCajaDiariaUsuario = new JLabelMe();

		this.jLabelColumnasSelectReporteCajaDiariaUsuario.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCajaDiariaUsuario.add(this.jLabelColumnasSelectReporteCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCajaDiariaUsuario = new JList<Reporte>();
		this.jListColumnasSelectReporteCajaDiariaUsuario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCajaDiariaUsuario.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCajaDiariaUsuario.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCajaDiariaUsuario.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCajaDiariaUsuario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCajaDiariaUsuario=new JScrollPane(this.jListColumnasSelectReporteCajaDiariaUsuario);
			
			this.jScrollColumnasSelectReporteCajaDiariaUsuario.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCajaDiariaUsuario.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCajaDiariaUsuario.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCajaDiariaUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCajaDiariaUsuario.add(this.jListColumnasSelectReporteCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
		this.jPanelReporteDinamicoCajaDiariaUsuario.add(this.jScrollColumnasSelectReporteCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCajaDiariaUsuario = new JLabelMe();

		this.jLabelRelacionesSelectReporteCajaDiariaUsuario.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCajaDiariaUsuario = new JList<Reporte>();
		this.jListRelacionesSelectReporteCajaDiariaUsuario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCajaDiariaUsuario.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCajaDiariaUsuario.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCajaDiariaUsuario.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCajaDiariaUsuario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCajaDiariaUsuario=new JScrollPane(this.jListRelacionesSelectReporteCajaDiariaUsuario);
			
			this.jScrollRelacionesSelectReporteCajaDiariaUsuario.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCajaDiariaUsuario.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCajaDiariaUsuario.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCajaDiariaUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCajaDiariaUsuario = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCajaDiariaUsuario = new JComboBoxMe();
		this.jListColumnasValoresGraficoCajaDiariaUsuario = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCajaDiariaUsuario = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCajaDiariaUsuario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCajaDiariaUsuario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCajaDiariaUsuario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCajaDiariaUsuario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCajaDiariaUsuario = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCajaDiariaUsuario.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCajaDiariaUsuario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCajaDiariaUsuario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCajaDiariaUsuario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoCajaDiariaUsuario = new JLabelMe();

		this.jLabelConGraficoDinamicoCajaDiariaUsuario.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCajaDiariaUsuario.add(this.jLabelConGraficoDinamicoCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoCajaDiariaUsuario = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoCajaDiariaUsuario.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoCajaDiariaUsuario.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoCajaDiariaUsuario.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCajaDiariaUsuario.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCajaDiariaUsuario.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaDiariaUsuario.add(this.jCheckBoxConGraficoDinamicoCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoCajaDiariaUsuario = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoCajaDiariaUsuario.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCajaDiariaUsuario.add(this.jLabelColumnaCategoriaGraficoCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoCajaDiariaUsuario = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCajaDiariaUsuario.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoCajaDiariaUsuario.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoCajaDiariaUsuario.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCajaDiariaUsuario.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCajaDiariaUsuario.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoCajaDiariaUsuario.add(this.jComboBoxColumnaCategoriaGraficoCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorCajaDiariaUsuario = new JLabelMe();

		this.jLabelColumnaCategoriaValorCajaDiariaUsuario.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaDiariaUsuario.add(this.jLabelColumnaCategoriaValorCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorCajaDiariaUsuario = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorCajaDiariaUsuario.setText("Accion");
        this.jComboBoxColumnaCategoriaValorCajaDiariaUsuario.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorCajaDiariaUsuario.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCajaDiariaUsuario.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCajaDiariaUsuario.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoCajaDiariaUsuario.add(this.jComboBoxColumnaCategoriaValorCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoCajaDiariaUsuario = new JLabelMe();

		this.jLabelColumnasValoresGraficoCajaDiariaUsuario.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaDiariaUsuario.add(this.jLabelColumnasValoresGraficoCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoCajaDiariaUsuario = new JList<Reporte>();
		this.jListColumnasValoresGraficoCajaDiariaUsuario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoCajaDiariaUsuario.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoCajaDiariaUsuario.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCajaDiariaUsuario.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCajaDiariaUsuario.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoCajaDiariaUsuario=new JScrollPane(this.jListColumnasValoresGraficoCajaDiariaUsuario);
			
			this.jScrollColumnasValoresGraficoCajaDiariaUsuario.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCajaDiariaUsuario.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCajaDiariaUsuario.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoCajaDiariaUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoCajaDiariaUsuario.add(this.jListColumnasSelectReporteCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
		this.jPanelReporteDinamicoCajaDiariaUsuario.add(this.jScrollColumnasValoresGraficoCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoCajaDiariaUsuario = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoCajaDiariaUsuario.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaDiariaUsuario.add(this.jLabelTiposGraficosReportesDinamicoCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoCajaDiariaUsuario = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCajaDiariaUsuario.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoCajaDiariaUsuario.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoCajaDiariaUsuario.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCajaDiariaUsuario.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCajaDiariaUsuario.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaDiariaUsuario.add(this.jComboBoxTiposGraficosReportesDinamicoCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCajaDiariaUsuario = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCajaDiariaUsuario.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaDiariaUsuario.add(this.jLabelGenerarExcelReporteDinamicoCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCajaDiariaUsuario = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCajaDiariaUsuario.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCajaDiariaUsuario,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCajaDiariaUsuario.setToolTipText("Generar EXCEL"+" "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		//this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCajaDiariaUsuario.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCajaDiariaUsuario.add(this.jButtonGenerarExcelReporteDinamicoCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCajaDiariaUsuario.add(this.jComboBoxTiposReportesDinamicoCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCajaDiariaUsuario = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCajaDiariaUsuario.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaDiariaUsuario.add(this.jLabelTiposArchivoReporteDinamicoCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCajaDiariaUsuario.add(this.jComboBoxTiposArchivosReportesDinamicoCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCajaDiariaUsuario = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCajaDiariaUsuario.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCajaDiariaUsuario,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCajaDiariaUsuario.setToolTipText("Generar"+" "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCajaDiariaUsuario.add(this.jButtonGenerarReporteDinamicoCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCajaDiariaUsuario = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCajaDiariaUsuario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCajaDiariaUsuario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCajaDiariaUsuario.setToolTipText("Cancelar"+" "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCajaDiariaUsuario.add(this.jButtonCerrarReporteDinamicoCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCajaDiariaUsuario = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCajaDiariaUsuario= new JScrollPane(jPanelReporteDinamicoCajaDiariaUsuario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCajaDiariaUsuario.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCajaDiariaUsuario.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCajaDiariaUsuario.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCajaDiariaUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Diaria Usuarios"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCajaDiariaUsuario.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCajaDiariaUsuario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCajaDiariaUsuario);
		this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getContentPane().add(this.jScrollPanelReporteDinamicoCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCajaDiariaUsuario() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCajaDiariaUsuario = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCajaDiariaUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCajaDiariaUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCajaDiariaUsuario.setName("jPanelImportacionCajaDiariaUsuario"); 
		
		this.jPanelImportacionCajaDiariaUsuario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCajaDiariaUsuario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCajaDiariaUsuario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCajaDiariaUsuario.setLayout(gridaBagLayoutImportacionCajaDiariaUsuario);
		
		
		this.jInternalFrameImportacionCajaDiariaUsuario= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCajaDiariaUsuario= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCajaDiariaUsuario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCajaDiariaUsuario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCajaDiariaUsuario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCajaDiariaUsuario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCajaDiariaUsuario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCajaDiariaUsuario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCajaDiariaUsuario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCajaDiariaUsuario.setResizable(true);
	    this.jInternalFrameImportacionCajaDiariaUsuario.setClosable(true);
	    this.jInternalFrameImportacionCajaDiariaUsuario.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCajaDiariaUsuario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCajaDiariaUsuario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCajaDiariaUsuario.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCajaDiariaUsuario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCajaDiariaUsuario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCajaDiariaUsuario.setResizable(true);
	    this.jInternalFrameImportacionCajaDiariaUsuario.setClosable(true);
	    this.jInternalFrameImportacionCajaDiariaUsuario.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCajaDiariaUsuario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCajaDiariaUsuario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCajaDiariaUsuario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCajaDiariaUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Diaria Usuarios"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCajaDiariaUsuario = new JLabelMe();

		this.jLabelArchivoImportacionCajaDiariaUsuario.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = iPosYImportacion;		
		this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCajaDiariaUsuario.add(this.jLabelArchivoImportacionCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCajaDiariaUsuario = new JFileChooser();		
		this.jFileChooserImportacionCajaDiariaUsuario.setToolTipText("ESCOGER ARCHIVO"+" "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCajaDiariaUsuario = new JButtonMe();
		this.jButtonAbrirImportacionCajaDiariaUsuario.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCajaDiariaUsuario,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCajaDiariaUsuario.setToolTipText("Generar"+" "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = iPosYImportacion;
		this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCajaDiariaUsuario.add(this.jButtonAbrirImportacionCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCajaDiariaUsuario = new JLabelMe();

		this.jLabelPathArchivoImportacionCajaDiariaUsuario.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCajaDiariaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCajaDiariaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCajaDiariaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = iPosYImportacion;		
		this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCajaDiariaUsuario.add(this.jLabelPathArchivoImportacionCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCajaDiariaUsuario=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCajaDiariaUsuario.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCajaDiariaUsuario.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCajaDiariaUsuario.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = iPosYImportacion;
		this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCajaDiariaUsuario.add(this.jTextFieldPathArchivoImportacionCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCajaDiariaUsuario = new JButtonMe();
		this.jButtonGenerarImportacionCajaDiariaUsuario.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCajaDiariaUsuario,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCajaDiariaUsuario.setToolTipText("Generar"+" "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = iPosYImportacion;
		this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCajaDiariaUsuario.add(this.jButtonGenerarImportacionCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCajaDiariaUsuario = new JButtonMe();
		this.jButtonCerrarImportacionCajaDiariaUsuario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCajaDiariaUsuario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCajaDiariaUsuario.setToolTipText("Cancelar"+" "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaDiariaUsuario.gridy = iPosYImportacion;
		this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCajaDiariaUsuario.add(this.jButtonCerrarImportacionCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCajaDiariaUsuario = new GridBagLayout();
		
		this.jScrollPanelImportacionCajaDiariaUsuario= new JScrollPane(jPanelImportacionCajaDiariaUsuario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
		this.gridBagConstraintsCajaDiariaUsuario.gridy =iPosYImportacion;
		this.gridBagConstraintsCajaDiariaUsuario.gridx =iPosXImportacion;
		this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCajaDiariaUsuario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCajaDiariaUsuario.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCajaDiariaUsuario);
		this.jInternalFrameImportacionCajaDiariaUsuario.getContentPane().add(this.jScrollPanelImportacionCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCajaDiariaUsuario(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCajaDiariaUsuario = new JButtonMe();
			this.jButtonAbrirOrderByCajaDiariaUsuario.setText("Orden");
			this.jButtonAbrirOrderByCajaDiariaUsuario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCajaDiariaUsuario,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCajaDiariaUsuario";
			inputMap = this.jButtonAbrirOrderByCajaDiariaUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCajaDiariaUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCajaDiariaUsuario"));
		
		
			GridBagLayout gridaBagLayoutOrderByCajaDiariaUsuario = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCajaDiariaUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCajaDiariaUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCajaDiariaUsuario.setName("jPanelOrderByCajaDiariaUsuario"); 
			
			this.jPanelOrderByCajaDiariaUsuario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCajaDiariaUsuario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCajaDiariaUsuario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCajaDiariaUsuario.setLayout(gridaBagLayoutOrderByCajaDiariaUsuario);
			
			
			this.jTableDatosCajaDiariaUsuarioOrderBy = new JTableMe();        
			this.jTableDatosCajaDiariaUsuarioOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCajaDiariaUsuarioOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCajaDiariaUsuarioOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCajaDiariaUsuarioOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCajaDiariaUsuarioOrderBy.setViewportView(this.jTableDatosCajaDiariaUsuarioOrderBy);
			this.jTableDatosCajaDiariaUsuarioOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCajaDiariaUsuarioOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCajaDiariaUsuario= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCajaDiariaUsuario= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCajaDiariaUsuario = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCajaDiariaUsuario= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCajaDiariaUsuario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCajaDiariaUsuario.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCajaDiariaUsuario.setTitle("Orden");
			this.jInternalFrameOrderByCajaDiariaUsuario.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCajaDiariaUsuario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCajaDiariaUsuario.setResizable(true);
			this.jInternalFrameOrderByCajaDiariaUsuario.setClosable(true);
			this.jInternalFrameOrderByCajaDiariaUsuario.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCajaDiariaUsuario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCajaDiariaUsuario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCajaDiariaUsuario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCajaDiariaUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Diaria Usuarios"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaUsuario.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCajaDiariaUsuario.gridx =iPosXOrderBy;
			this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCajaDiariaUsuario.ipady =150;
				
			this.jPanelOrderByCajaDiariaUsuario.add(jScrollPanelDatosCajaDiariaUsuarioOrderBy, this.gridBagConstraintsCajaDiariaUsuario);//this.jTableDatosCajaDiariaUsuarioTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCajaDiariaUsuario = new JButtonMe();
			this.jButtonCerrarOrderByCajaDiariaUsuario.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCajaDiariaUsuario,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCajaDiariaUsuario.setToolTipText("Cancelar"+" "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCajaDiariaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaDiariaUsuario.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCajaDiariaUsuario.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCajaDiariaUsuario.add(this.jButtonCerrarOrderByCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCajaDiariaUsuario = new GridBagLayout();
			
			this.jScrollPanelOrderByCajaDiariaUsuario= new JScrollPane(jPanelOrderByCajaDiariaUsuario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCajaDiariaUsuario = new GridBagConstraints();
			this.gridBagConstraintsCajaDiariaUsuario.gridy =iPosYOrderBy;
			this.gridBagConstraintsCajaDiariaUsuario.gridx =iPosXOrderBy;
			this.gridBagConstraintsCajaDiariaUsuario.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCajaDiariaUsuario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCajaDiariaUsuario.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCajaDiariaUsuario);
			
			this.jInternalFrameOrderByCajaDiariaUsuario.getContentPane().add(this.jScrollPanelOrderByCajaDiariaUsuario, this.gridBagConstraintsCajaDiariaUsuario);			
		
		} else {
			this.jButtonAbrirOrderByCajaDiariaUsuario = new JButtonMe();
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
		int iWidthTableCalculado=0;//3330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.cajadiariausuarioSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCajaDiariaUsuario.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCajaDiariaUsuario.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCajaDiariaUsuario.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosCajaDiariaUsuario.getRowHeight();//CajaDiariaUsuarioConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CajaDiariaUsuarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCajaDiariaUsuario.isSelected()) {
					iHeightTable=CajaDiariaUsuarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CajaDiariaUsuarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CajaDiariaUsuarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CajaDiariaUsuarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCajaDiariaUsuario.isSelected()) {
					iHeightTable=CajaDiariaUsuarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CajaDiariaUsuarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CajaDiariaUsuarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCajaDiariaUsuario.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCajaDiariaUsuario.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCajaDiariaUsuario.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCajaDiariaUsuario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCajaDiariaUsuario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCajaDiariaUsuario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCajaDiariaUsuario!=null && this.jInternalFrameOrderByCajaDiariaUsuario.getjTableDatosOrderBy()!=null) {
			//if(!this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCajaDiariaUsuario.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCajaDiariaUsuario.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCajaDiariaUsuario.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCajaDiariaUsuario.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCajaDiariaUsuario.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCajaDiariaUsuario.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCajaDiariaUsuario.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCajaDiariaUsuario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCajaDiariaUsuario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCajaDiariaUsuario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=cajadiariausuarioLogic.getCajaDiariaUsuarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cajadiariausuarios.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CajaDiariaUsuario> TraerCajaDiariaUsuarioBeans(List<CajaDiariaUsuario> cajadiariausuarios,ArrayList<Classe> classes)throws Exception {
		try {
			for(CajaDiariaUsuario cajadiariausuario:cajadiariausuarios) {
					
				if(!(CajaDiariaUsuarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CajaDiariaUsuarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cajadiariausuario.setsDetalleGeneralEntityReporte(CajaDiariaUsuarioConstantesFunciones.getCajaDiariaUsuarioDescripcion(cajadiariausuario));
										
						
					
						
					
				} else  {
							
					//cajadiariausuario.setsDetalleGeneralEntityReporte(cajadiariausuario.getsDetalleGeneralEntityReporte());
										
				}
				
				//cajadiariausuariobeans.add(cajadiariausuariobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cajadiariausuarios;
    }
	//PARA REPORTES FIN
}
