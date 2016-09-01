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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;

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
import com.bydan.erp.inventario.util.AutoriConsepConstantesFunciones;

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
public class AutoriConsepJInternalFrame extends AutoriConsepBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarAutoriConsep;
	
	protected JMenuBar jmenuBarAutoriConsep;
	
	protected JMenu jmenuAutoriConsep;
	protected JMenu jmenuDatosAutoriConsep;
	protected JMenu jmenuArchivoAutoriConsep;
	protected JMenu jmenuAccionesAutoriConsep;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAutoriConsep;	
	protected GridBagConstraints gridBagConstraintsAutoriConsep;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public AutoriConsepDetalleFormJInternalFrame jInternalFrameDetalleFormAutoriConsep;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoAutoriConsep;	
	protected ImportacionJInternalFrame jInternalFrameImportacionAutoriConsep;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoAutoriConsepBeanSwingJInternalFrame tipoautoriconsepBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoautoriconsep="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";
	
	public AutoriConsepSessionBean autoriconsepSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoAutoriConsepSessionBean tipoautoriconsepSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<AutoriConsep> autoriconseps;		
	public List<AutoriConsep> autoriconsepsEliminados;	
	public List<AutoriConsep> autoriconsepsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByAutoriConsep;		
	protected JButton jButtonAbrirOrderByAutoriConsep;
	
	
	//protected JPanel jPanelOrderByAutoriConsep;
	//public JScrollPane jScrollPanelOrderByAutoriConsep;	
	//protected JButton jButtonCerrarOrderByAutoriConsep;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public AutoriConsepLogic autoriconsepLogic;
	
	
	
	public JScrollPane jScrollPanelDatosAutoriConsep;
	public JScrollPane jScrollPanelDatosEdicionAutoriConsep;
	public JScrollPane jScrollPanelDatosGeneralAutoriConsep;
    
	
	
	//public JScrollPane jScrollPanelDatosAutoriConsepOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoAutoriConsep;
	//public JScrollPane jScrollPanelImportacionAutoriConsep;
	
	
	
	protected JPanel jPanelAccionesAutoriConsep;
	
    protected JPanel jPanelPaginacionAutoriConsep;
    protected JPanel jPanelParametrosReportesAutoriConsep;
	protected JPanel jPanelParametrosReportesAccionesAutoriConsep;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1AutoriConsep;
	protected JPanel jPanelParametrosAuxiliar2AutoriConsep;
	protected JPanel jPanelParametrosAuxiliar3AutoriConsep;
	protected JPanel jPanelParametrosAuxiliar4AutoriConsep;
	//protected JPanel jPanelParametrosAuxiliar5AutoriConsep;
	
	
	
	//protected JPanel jPanelReporteDinamicoAutoriConsep;
	//protected JPanel jPanelImportacionAutoriConsep;
	
	
	public JTable jTableDatosAutoriConsep;
	
	
	
	//public JTable jTableDatosAutoriConsepOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoAutoriConsep;
	protected JButton jButtonDuplicarAutoriConsep;
	protected JButton jButtonCopiarAutoriConsep;
	protected JButton jButtonVerFormAutoriConsep;
	protected JButton jButtonNuevoRelacionesAutoriConsep;
	protected JButton jButtonModificarAutoriConsep;
	
    protected JButton jButtonGuardarCambiosTablaAutoriConsep;
	protected JButton jButtonCerrarAutoriConsep;
	
	
	protected JButton jButtonRecargarInformacionAutoriConsep;
	protected JButton jButtonProcesarInformacionAutoriConsep;
	
	
	protected JButton jButtonAnterioresAutoriConsep;
	protected JButton jButtonSiguientesAutoriConsep;
	protected JButton jButtonNuevoGuardarCambiosAutoriConsep;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoAutoriConsep;
	//protected JButton jButtonCerrarReporteDinamicoAutoriConsep;
	//protected JButton jButtonGenerarExcelReporteDinamicoAutoriConsep;	
	
	
	
	//protected JButton jButtonAbrirImportacionAutoriConsep;
	//protected JButton jButtonGenerarImportacionAutoriConsep;
	//protected JButton jButtonCerrarImportacionAutoriConsep;
	//protected JFileChooser jFileChooserImportacionAutoriConsep;
	//protected File fileImportacionAutoriConsep;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAutoriConsep;
	protected JButton jButtonDuplicarToolBarAutoriConsep;
	protected JButton jButtonNuevoRelacionesToolBarAutoriConsep;
	
	
	public JButton jButtonGuardarCambiosToolBarAutoriConsep;
	protected JButton jButtonCopiarToolBarAutoriConsep;
	protected JButton jButtonVerFormToolBarAutoriConsep;
	public JButton jButtonGuardarCambiosTablaToolBarAutoriConsep;
	protected JButton jButtonMostrarOcultarTablaToolBarAutoriConsep;
	protected JButton jButtonCerrarToolBarAutoriConsep;
	
	protected JButton jButtonRecargarInformacionToolBarAutoriConsep;
	protected JButton jButtonProcesarInformacionToolBarAutoriConsep;
	protected JButton jButtonAnterioresToolBarAutoriConsep;
	protected JButton jButtonSiguientesToolBarAutoriConsep;
	protected JButton jButtonNuevoGuardarCambiosToolBarAutoriConsep;
	protected JButton jButtonAbrirOrderByToolBarAutoriConsep;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAutoriConsep;
	protected JMenuItem jMenuItemDuplicarAutoriConsep;
	protected JMenuItem jMenuItemNuevoRelacionesAutoriConsep;
	
	
	protected JMenuItem jMenuItemGuardarCambiosAutoriConsep;
	protected JMenuItem jMenuItemCopiarAutoriConsep;
	protected JMenuItem jMenuItemVerFormAutoriConsep;
	protected JMenuItem jMenuItemGuardarCambiosTablaAutoriConsep;
	protected JMenuItem jMenuItemCerrarAutoriConsep;
	protected JMenuItem jMenuItemDetalleCerrarAutoriConsep;
	protected JMenuItem jMenuItemDetalleAbrirOrderByAutoriConsep;
	protected JMenuItem jMenuItemDetalleMostarOcultarAutoriConsep;
	
	protected JMenuItem jMenuItemRecargarInformacionAutoriConsep;
	protected JMenuItem jMenuItemProcesarInformacionAutoriConsep;
	protected JMenuItem jMenuItemAnterioresAutoriConsep;
	protected JMenuItem jMenuItemSiguientesAutoriConsep;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAutoriConsep;
	protected JMenuItem jMenuItemAbrirOrderByAutoriConsep;
	protected JMenuItem jMenuItemMostrarOcultarAutoriConsep;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAutoriConsep;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosAutoriConsep;
	protected JCheckBox jCheckBoxSeleccionadosAutoriConsep;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaAutoriConsep;
	protected JCheckBox jCheckBoxConGraficoReporteAutoriConsep;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesAutoriConsep;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesAutoriConsep;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoAutoriConsep;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoAutoriConsep;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesAutoriConsep;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionAutoriConsep;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAutoriConsep;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAutoriConsep;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarAutoriConsep;
	protected JTextField jTextFieldValorCampoGeneralAutoriConsep;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteAutoriConsep;
	//public JList<Reporte> jListColumnasSelectReporteAutoriConsep;
	//public JScrollPane jScrollColumnasSelectReporteAutoriConsep;
	
	//public JLabel jLabelRelacionesSelectReporteAutoriConsep;
	//public JList<Reporte> jListRelacionesSelectReporteAutoriConsep;
	//public JScrollPane jScrollRelacionesSelectReporteAutoriConsep;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoAutoriConsep;
	//protected JCheckBox jCheckBoxConGraficoDinamicoAutoriConsep;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoAutoriConsep;
	//public JLabel jLabelTiposArchivoReporteDinamicoAutoriConsep;
	
		
	//public JLabel jLabelArchivoImportacionAutoriConsep;	
	//public JLabel jLabelPathArchivoImportacionAutoriConsep;
	//protected JTextField jTextFieldPathArchivoImportacionAutoriConsep;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoAutoriConsep;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoAutoriConsep;
	
	//public JLabel jLabelColumnaCategoriaValorAutoriConsep;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorAutoriConsep;
	
	//public JLabel jLabelColumnasValoresGraficoAutoriConsep;
	//public JList<Reporte> jListColumnasValoresGraficoAutoriConsep;
	//public JScrollPane jScrollColumnasValoresGraficoAutoriConsep;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoAutoriConsep;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoAutoriConsep;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasAutoriConsep;
	public JPanel jPanelBusquedaPorNumeroAutorizacionAutoriConsep;
	public JButton jButtonBusquedaPorNumeroAutorizacionAutoriConsep;
	public JPanel jPanelFK_IdClienteAutoriConsep;
	public JButton jButtonFK_IdClienteAutoriConsep;
	public JPanel jPanelFK_IdEmpleadoAutoriConsep;
	public JButton jButtonFK_IdEmpleadoAutoriConsep;
	public JPanel jPanelFK_IdTipoAutoriConsepAutoriConsep;
	public JButton jButtonFK_IdTipoAutoriConsepAutoriConsep;
	
	public JPanel jPanelnumero_autorizacionBusquedaPorNumeroAutorizacionAutoriConsep;
	public JLabel jLabelnumero_autorizacionBusquedaPorNumeroAutorizacionAutoriConsep;
	public JTextField jTextFieldnumero_autorizacionBusquedaPorNumeroAutorizacionAutoriConsep;
	public JButton jButtonnumero_autorizacionBusquedaPorNumeroAutorizacionAutoriConsepBusqueda= new JButtonMe();

	
	public JPanel jPanelid_clienteFK_IdClienteAutoriConsep;
	public JLabel jLabelid_clienteFK_IdClienteAutoriConsep;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteAutoriConsep;
	public JButton jButtonid_clienteFK_IdClienteAutoriConsep= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteAutoriConsepUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteAutoriConsepBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteAutoriConsep;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoAutoriConsep;
	public JLabel jLabelid_empleadoFK_IdEmpleadoAutoriConsep;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoAutoriConsep;
	public JButton jButtonid_empleadoFK_IdEmpleadoAutoriConsep= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoAutoriConsepUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoAutoriConsepBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoAutoriConsep;
	
	public JPanel jPanelid_tipo_autori_consepFK_IdTipoAutoriConsepAutoriConsep;
	public JLabel jLabelid_tipo_autori_consepFK_IdTipoAutoriConsepAutoriConsep;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_autori_consepFK_IdTipoAutoriConsepAutoriConsep;
	public JButton jButtonid_tipo_autori_consepFK_IdTipoAutoriConsepAutoriConsep= new JButtonMe();
	public JButton jButtonid_tipo_autori_consepFK_IdTipoAutoriConsepAutoriConsepUpdate= new JButtonMe();
	public JButton jButtonid_tipo_autori_consepFK_IdTipoAutoriConsepAutoriConsepBusqueda= new JButtonMe();

	
	
	
	
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
	public static String STIPO_TAMANIO_GENERAL="MEDIO";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=1050;//(screenSize.width-screenSize.width/2)+(250*2);
	//public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public AutoriConsepJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("AutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutoriConsepJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutoriConsepJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutoriConsepJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("AutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionAutoriConsep)	{
		this.jButtonRecargarInformacionAutoriConsep = jButtonRecargarInformacionAutoriConsep;
	}
	
	public JButton getjButtonProcesarInformacionAutoriConsep() {
		return this.jButtonProcesarInformacionAutoriConsep;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAutoriConsep)	{
		this.jButtonProcesarInformacionAutoriConsep = jButtonProcesarInformacionAutoriConsep;
	}
	
	
	public JButton getjButtonRecargarInformacionAutoriConsep() {
		return this.jButtonRecargarInformacionAutoriConsep;
	}
	
	
	public List<AutoriConsep> getautoriconseps() {
		return this.autoriconseps;
	}

	public void setautoriconseps(List<AutoriConsep> autoriconseps) {
		this.autoriconseps = autoriconseps;
	}
	
	public List<AutoriConsep> getautoriconsepsAux() {
		return this.autoriconsepsAux;
	}

	public void setautoriconsepsAux(List<AutoriConsep> autoriconsepsAux) {
		this.autoriconsepsAux = autoriconsepsAux;
	}
	
	public List<AutoriConsep> getautoriconsepsEliminados() {
		return this.autoriconsepsEliminados;
	}

	public void setAutoriConsepsEliminados(List<AutoriConsep> autoriconsepsEliminados) {
		this.autoriconsepsEliminados = autoriconsepsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarAutoriConsep() {
		return jComboBoxTiposSeleccionarAutoriConsep;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarAutoriConsep(
			JComboBox jComboBoxTiposSeleccionarAutoriConsep) {
		this.jComboBoxTiposSeleccionarAutoriConsep = jComboBoxTiposSeleccionarAutoriConsep;
	}
	
	public void setBorderResaltarTiposSeleccionarAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarAutoriConsep.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarAutoriConsep .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralAutoriConsep() {
		return jTextFieldValorCampoGeneralAutoriConsep;
	}

	public void setjTextFieldValorCampoGeneralAutoriConsep(
			JTextField jTextFieldValorCampoGeneralAutoriConsep) {
		this.jTextFieldValorCampoGeneralAutoriConsep = jTextFieldValorCampoGeneralAutoriConsep;
	}

	public void setBorderResaltarValorCampoGeneralAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriConsep.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralAutoriConsep .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosAutoriConsep() {
		return this.jCheckBoxSeleccionarTodosAutoriConsep;
	}

	public void setjCheckBoxSeleccionarTodosAutoriConsep(
			JCheckBox jCheckBoxSeleccionarTodosAutoriConsep) {
		this.jCheckBoxSeleccionarTodosAutoriConsep = jCheckBoxSeleccionarTodosAutoriConsep;
	}

	public void setBorderResaltarSeleccionarTodosAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriConsep.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosAutoriConsep .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosAutoriConsep() {
		return this.jCheckBoxSeleccionadosAutoriConsep;
	}

	public void setjCheckBoxSeleccionadosAutoriConsep(
			JCheckBox jCheckBoxSeleccionadosAutoriConsep) {
		this.jCheckBoxSeleccionadosAutoriConsep = jCheckBoxSeleccionadosAutoriConsep;
	}
	
	public void setBorderResaltarSeleccionadosAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriConsep.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosAutoriConsep .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesAutoriConsep() {
		return this.jComboBoxTiposArchivosReportesAutoriConsep;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesAutoriConsep(
			JComboBox jComboBoxTiposArchivosReportesAutoriConsep) {
		this.jComboBoxTiposArchivosReportesAutoriConsep = jComboBoxTiposArchivosReportesAutoriConsep;
	}

	public void setBorderResaltarTiposArchivosReportesAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriConsep.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesAutoriConsep .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesAutoriConsep() {
		return this.jComboBoxTiposReportesAutoriConsep;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesAutoriConsep(
			JComboBox jComboBoxTiposReportesAutoriConsep) {
		this.jComboBoxTiposReportesAutoriConsep = jComboBoxTiposReportesAutoriConsep;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoAutoriConsep() {
	//	return jComboBoxTiposReportesDinamicoAutoriConsep;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoAutoriConsep(
	//		JComboBox jComboBoxTiposReportesDinamicoAutoriConsep) {
	//	this.jComboBoxTiposReportesDinamicoAutoriConsep = jComboBoxTiposReportesDinamicoAutoriConsep;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoAutoriConsep() {
	//	return jComboBoxTiposArchivosReportesDinamicoAutoriConsep;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoAutoriConsep(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoAutoriConsep) {
	//	this.jComboBoxTiposArchivosReportesDinamicoAutoriConsep = jComboBoxTiposArchivosReportesDinamicoAutoriConsep;
	//}
	
	public void setBorderResaltarTiposReportesAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriConsep.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesAutoriConsep .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesAutoriConsep() {
		return this.jComboBoxTiposGraficosReportesAutoriConsep;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesAutoriConsep(
			JComboBox jComboBoxTiposGraficosReportesAutoriConsep) {
		this.jComboBoxTiposGraficosReportesAutoriConsep = jComboBoxTiposGraficosReportesAutoriConsep;
	}
	
	public void setBorderResaltarTiposGraficosReportesAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriConsep.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesAutoriConsep .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionAutoriConsep() {
		return this.jComboBoxTiposPaginacionAutoriConsep;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionAutoriConsep(
			JComboBox jComboBoxTiposPaginacionAutoriConsep) {
		this.jComboBoxTiposPaginacionAutoriConsep = jComboBoxTiposPaginacionAutoriConsep;
	}
	
	public void setBorderResaltarTiposPaginacionAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriConsep.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionAutoriConsep .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesAutoriConsep() {
		return this.jComboBoxTiposRelacionesAutoriConsep;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAutoriConsep() {
		return this.jComboBoxTiposAccionesAutoriConsep;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAutoriConsep(
			JComboBox jComboBoxTiposRelacionesAutoriConsep) {
		this.jComboBoxTiposRelacionesAutoriConsep = jComboBoxTiposRelacionesAutoriConsep;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAutoriConsep(
			JComboBox jComboBoxTiposAccionesAutoriConsep) {
		this.jComboBoxTiposAccionesAutoriConsep = jComboBoxTiposAccionesAutoriConsep;
	}
	
	public void setBorderResaltarTiposRelacionesAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriConsep.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesAutoriConsep .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesAutoriConsep() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriConsep.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesAutoriConsep .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoAutoriConsep() {
	//	return jCheckBoxConGraficoDinamicoAutoriConsep;
	//}

	//public void setjCheckBoxConGraficoDinamicoAutoriConsep(
	//		JCheckBox jCheckBoxConGraficoDinamicoAutoriConsep) {
	//	this.jCheckBoxConGraficoDinamicoAutoriConsep = jCheckBoxConGraficoDinamicoAutoriConsep;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoAutoriConsep() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarAutoriConsep.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoAutoriConsep .setBorder(borderResaltar);		
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
		this.autoriconsepSessionBean=new AutoriConsepSessionBean();
		
		this.autoriconsepSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.autoriconsepSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.autoriconsepSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=AutoriConsepJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=AutoriConsepJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AutoriConsepJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AutoriConsepJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AutoriConsepJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Autorizaciones Consep MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.autoriconsepSessionBean.getEsGuardarRelacionado()) {
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
		
		AutoriConsepJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("AutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarAutoriConsep= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarAutoriConsep,this.jTtoolBarAutoriConsep,
							"nuevo","nuevo","Nuevo"+" "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarAutoriConsep,this.jTtoolBarAutoriConsep,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarAutoriConsep,this.jTtoolBarAutoriConsep,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarAutoriConsep,this.jTtoolBarAutoriConsep,
							"duplicar","duplicar","Duplicar"+" "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarAutoriConsep,this.jTtoolBarAutoriConsep,
							"copiar","copiar","Copiar"+" "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarAutoriConsep,this.jTtoolBarAutoriConsep,
							"ver_form","ver_form","Ver"+" "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAutoriConsep,this.jTtoolBarAutoriConsep,
							"recargar","recargar","Recargar"+" "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAutoriConsep,this.jTtoolBarAutoriConsep,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAutoriConsep,this.jTtoolBarAutoriConsep,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarAutoriConsep,this.jTtoolBarAutoriConsep,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarAutoriConsep,this.jTtoolBarAutoriConsep,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarAutoriConsep,this.jTtoolBarAutoriConsep,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarAutoriConsep,this.jTtoolBarAutoriConsep,
							"cerrar","cerrar","Salir"+" "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarAutoriConsep=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarAutoriConsep;
			
				this.jButtonProcesarInformacionToolBarAutoriConsep=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarAutoriConsep;
				
		//protected JButton jButtonModificarToolBarAutoriConsep;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarAutoriConsep=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuAutoriConsep=new JMenuMe("General");
		this.jmenuArchivoAutoriConsep=new JMenuMe("Archivo");
		this.jmenuAccionesAutoriConsep=new JMenuMe("Acciones");
		this.jmenuDatosAutoriConsep=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAutoriConsep= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAutoriConsep.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAutoriConsep,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarAutoriConsep= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarAutoriConsep.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarAutoriConsep,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesAutoriConsep= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesAutoriConsep.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesAutoriConsep,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosAutoriConsep= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAutoriConsep.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAutoriConsep,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarAutoriConsep= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarAutoriConsep.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarAutoriConsep,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormAutoriConsep= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormAutoriConsep.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormAutoriConsep,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaAutoriConsep= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaAutoriConsep.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaAutoriConsep,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAutoriConsep= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAutoriConsep.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAutoriConsep,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionAutoriConsep= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionAutoriConsep.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionAutoriConsep,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionAutoriConsep= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionAutoriConsep.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionAutoriConsep,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresAutoriConsep= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresAutoriConsep.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresAutoriConsep,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesAutoriConsep= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesAutoriConsep.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesAutoriConsep,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByAutoriConsep= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByAutoriConsep.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByAutoriConsep,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAutoriConsep= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAutoriConsep.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAutoriConsep,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByAutoriConsep= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByAutoriConsep.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByAutoriConsep,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAutoriConsep= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAutoriConsep.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAutoriConsep,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosAutoriConsep= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosAutoriConsep.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosAutoriConsep,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoAutoriConsep.add(this.jMenuItemCerrarAutoriConsep);
			
			this.jmenuAccionesAutoriConsep.add(this.jMenuItemNuevoAutoriConsep);
			this.jmenuAccionesAutoriConsep.add(this.jMenuItemNuevoGuardarCambiosAutoriConsep);
			this.jmenuAccionesAutoriConsep.add(this.jMenuItemNuevoRelacionesAutoriConsep);
			this.jmenuAccionesAutoriConsep.add(this.jMenuItemGuardarCambiosTablaAutoriConsep);		
			this.jmenuAccionesAutoriConsep.add(this.jMenuItemDuplicarAutoriConsep);		
			this.jmenuAccionesAutoriConsep.add(this.jMenuItemCopiarAutoriConsep);		
			this.jmenuAccionesAutoriConsep.add(this.jMenuItemVerFormAutoriConsep);		
			
			this.jmenuDatosAutoriConsep.add(this.jMenuItemRecargarInformacionAutoriConsep);				
			this.jmenuDatosAutoriConsep.add(this.jMenuItemAnterioresAutoriConsep);				
			this.jmenuDatosAutoriConsep.add(this.jMenuItemSiguientesAutoriConsep);				
			this.jmenuDatosAutoriConsep.add(this.jMenuItemAbrirOrderByAutoriConsep);				
			this.jmenuDatosAutoriConsep.add(this.jMenuItemMostrarOcultarAutoriConsep);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesAutoriConsep.add(this.jMenuItemGuardarCambiosAutoriConsep);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarAutoriConsep.add(this.jmenuArchivoAutoriConsep);		
			this.jmenuBarAutoriConsep.add(this.jmenuAccionesAutoriConsep);		
			this.jmenuBarAutoriConsep.add(this.jmenuDatosAutoriConsep);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarAutoriConsep);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasAutoriConsep() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNumeroAutorizacionAutoriConsep=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNumeroAutorizacionAutoriConsep.setToolTipText("Buscar Por Nro Autorizacion ");
		this.jButtonBusquedaPorNumeroAutorizacionAutoriConsep= new JButtonMe();
		this.jButtonBusquedaPorNumeroAutorizacionAutoriConsep.setText("Buscar");
		this.jButtonBusquedaPorNumeroAutorizacionAutoriConsep.setToolTipText("Buscar Por Nro Autorizacion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNumeroAutorizacionAutoriConsep,"buscar_button","Buscar Por Nro Autorizacion ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNumeroAutorizacionAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnumero_autorizacionBusquedaPorNumeroAutorizacionAutoriConsep = new JLabelMe();
		jLabelnumero_autorizacionBusquedaPorNumeroAutorizacionAutoriConsep.setText("Nro Autorizacion :");
		jLabelnumero_autorizacionBusquedaPorNumeroAutorizacionAutoriConsep.setToolTipText("Nro Autorizacion");
		jLabelnumero_autorizacionBusquedaPorNumeroAutorizacionAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelnumero_autorizacionBusquedaPorNumeroAutorizacionAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelnumero_autorizacionBusquedaPorNumeroAutorizacionAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelnumero_autorizacionBusquedaPorNumeroAutorizacionAutoriConsep,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldnumero_autorizacionBusquedaPorNumeroAutorizacionAutoriConsep= new JTextFieldMe();
		jTextFieldnumero_autorizacionBusquedaPorNumeroAutorizacionAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_autorizacionBusquedaPorNumeroAutorizacionAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_autorizacionBusquedaPorNumeroAutorizacionAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_autorizacionBusquedaPorNumeroAutorizacionAutoriConsep,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdClienteAutoriConsep=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteAutoriConsep.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteAutoriConsep= new JButtonMe();
		this.jButtonFK_IdClienteAutoriConsep.setText("Buscar");
		this.jButtonFK_IdClienteAutoriConsep.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteAutoriConsep,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteAutoriConsep = new JLabelMe();
		jLabelid_clienteFK_IdClienteAutoriConsep.setText("Cliente :");
		jLabelid_clienteFK_IdClienteAutoriConsep.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteAutoriConsep,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteAutoriConsep= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteAutoriConsep,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteAutoriConsep= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteAutoriConsep.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteAutoriConsep.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteAutoriConsep.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteAutoriConsep.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteAutoriConsep.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteAutoriConsep.setFocusable(false);

		this.jPanelFK_IdEmpleadoAutoriConsep=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoAutoriConsep.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoAutoriConsep= new JButtonMe();
		this.jButtonFK_IdEmpleadoAutoriConsep.setText("Buscar");
		this.jButtonFK_IdEmpleadoAutoriConsep.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoAutoriConsep,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoAutoriConsep = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoAutoriConsep.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoAutoriConsep.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoAutoriConsep,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoAutoriConsep= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoAutoriConsep,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoAutoriConsep= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoAutoriConsep.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoAutoriConsep.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoAutoriConsep.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoAutoriConsep.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoAutoriConsep.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoAutoriConsep.setFocusable(false);

		this.jPanelFK_IdTipoAutoriConsepAutoriConsep=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoAutoriConsepAutoriConsep.setToolTipText("Buscar Por Tipo ");
		this.jButtonFK_IdTipoAutoriConsepAutoriConsep= new JButtonMe();
		this.jButtonFK_IdTipoAutoriConsepAutoriConsep.setText("Buscar");
		this.jButtonFK_IdTipoAutoriConsepAutoriConsep.setToolTipText("Buscar Por Tipo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoAutoriConsepAutoriConsep,"buscar_button","Buscar Por Tipo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoAutoriConsepAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_autori_consepFK_IdTipoAutoriConsepAutoriConsep = new JLabelMe();
		jLabelid_tipo_autori_consepFK_IdTipoAutoriConsepAutoriConsep.setText("Tipo :");
		jLabelid_tipo_autori_consepFK_IdTipoAutoriConsepAutoriConsep.setToolTipText("Tipo");
		jLabelid_tipo_autori_consepFK_IdTipoAutoriConsepAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_autori_consepFK_IdTipoAutoriConsepAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_autori_consepFK_IdTipoAutoriConsepAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_autori_consepFK_IdTipoAutoriConsepAutoriConsep,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_autori_consepFK_IdTipoAutoriConsepAutoriConsep= new JComboBoxMe();
		jComboBoxid_tipo_autori_consepFK_IdTipoAutoriConsepAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_autori_consepFK_IdTipoAutoriConsepAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_autori_consepFK_IdTipoAutoriConsepAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_autori_consepFK_IdTipoAutoriConsepAutoriConsep,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasAutoriConsep=new JTabbedPane();


		this.jTabbedPaneBusquedasAutoriConsep.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasAutoriConsep.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasAutoriConsep.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasAutoriConsep.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasAutoriConsep,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleAutoriConsep = new AutoriConsepDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Autorizaciones Consep DATOS");
			this.jInternalFrameDetalleFormAutoriConsep = new AutoriConsepDetalleFormJInternalFrame(jDesktopPane,this.autoriconsepSessionBean.getConGuardarRelaciones(),this.autoriconsepSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormAutoriConsep = null;//new AutoriConsepDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAutoriConsep= new GridBagLayout();
		
		
		this.jTableDatosAutoriConsep = new JTableMe();      
		
		String sToolTipAutoriConsep="";
		sToolTipAutoriConsep=AutoriConsepConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAutoriConsep+="(Inventario.AutoriConsep)";
		}
		
		if(!this.autoriconsepSessionBean.getEsGuardarRelacionado()) {
			sToolTipAutoriConsep+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosAutoriConsep.setToolTipText(sToolTipAutoriConsep);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosAutoriConsep);
		this.jTableDatosAutoriConsep.setAutoCreateRowSorter(true);
		this.jTableDatosAutoriConsep.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosAutoriConsep.setRowSelectionAllowed(true);
		this.jTableDatosAutoriConsep.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosAutoriConsep,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoAutoriConsep = new JButtonMe();
		this.jButtonDuplicarAutoriConsep = new JButtonMe();
		this.jButtonCopiarAutoriConsep = new JButtonMe();
		this.jButtonVerFormAutoriConsep = new JButtonMe();
		this.jButtonNuevoRelacionesAutoriConsep = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaAutoriConsep = new JButtonMe();
		this.jButtonCerrarAutoriConsep = new JButtonMe();
		
		this.jScrollPanelDatosAutoriConsep = new JScrollPane();   
        this.jScrollPanelDatosGeneralAutoriConsep = new JScrollPane();
		
				
		
		
		this.jPanelAccionesAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Autorizaciones Consep";
		
		if(!this.autoriconsepSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Autorizaciones Consepes" + this.sPath));
		} else {
			this.jScrollPanelDatosAutoriConsep.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAutoriConsep.setToolTipText("Acciones");
        this.jPanelAccionesAutoriConsep.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoAutoriConsep=new ReporteDinamicoJInternalFrame(AutoriConsepConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoAutoriConsep();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionAutoriConsep=new ImportacionJInternalFrame(AutoriConsepConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionAutoriConsep();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByAutoriConsep = new JButtonMe();
		
		this.jButtonAbrirOrderByAutoriConsep.setText("Orden");
		this.jButtonAbrirOrderByAutoriConsep.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAutoriConsep,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAutoriConsep=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAutoriConsep,false,this);
			
			//this.cargarOrderByAutoriConsep(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAutoriConsep=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAutoriConsep,true,this);
			
			//this.cargarOrderByAutoriConsep(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosAutoriConsep.setMinimumSize(new Dimension(400,50));//1230
		this.jTableDatosAutoriConsep.setMaximumSize(new Dimension(400,50));//1230
		this.jTableDatosAutoriConsep.setPreferredSize(new Dimension(400,50));//1230
		
		this.jScrollPanelDatosAutoriConsep.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosAutoriConsep.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosAutoriConsep.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoAutoriConsep.setText("Nuevo");
		this.jButtonDuplicarAutoriConsep.setText("Duplicar");
		this.jButtonCopiarAutoriConsep.setText("Copiar");
		this.jButtonVerFormAutoriConsep.setText("Ver");
		this.jButtonNuevoRelacionesAutoriConsep.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaAutoriConsep.setText("Guardar");
		this.jButtonCerrarAutoriConsep.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAutoriConsep,"nuevo_button","Nuevo",this.autoriconsepSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarAutoriConsep,"duplicar_button","Duplicar",this.autoriconsepSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarAutoriConsep,"copiar_button","Copiar",this.autoriconsepSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormAutoriConsep,"ver_form","Ver",this.autoriconsepSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesAutoriConsep,"nuevorelaciones_button","Nuevo Rel",this.autoriconsepSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAutoriConsep,"guardarcambiostabla_button","Guardar",this.autoriconsepSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAutoriConsep,"cerrar_button","Salir",this.autoriconsepSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoAutoriConsep.setToolTipText("Nuevo"+" "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarAutoriConsep.setToolTipText("Duplicar"+" "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarAutoriConsep.setToolTipText("Copiar"+" "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormAutoriConsep.setToolTipText("Ver"+" "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesAutoriConsep.setToolTipText("Nuevo Rel"+" "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaAutoriConsep.setToolTipText("Guardar"+" "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAutoriConsep.setToolTipText("Salir"+" "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAutoriConsep";
		inputMap = this.jButtonNuevoAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAutoriConsep.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAutoriConsep"));
		
		//DUPLICAR
		sMapKey = "DuplicarAutoriConsep";
		inputMap = this.jButtonDuplicarAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarAutoriConsep.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarAutoriConsep"));
		
		//COPIAR
		sMapKey = "CopiarAutoriConsep";
		inputMap = this.jButtonCopiarAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarAutoriConsep.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarAutoriConsep"));
		
		//VEr FORM
		sMapKey = "VerFormAutoriConsep";
		inputMap = this.jButtonVerFormAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormAutoriConsep.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormAutoriConsep"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesAutoriConsep";
		inputMap = this.jButtonNuevoRelacionesAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesAutoriConsep"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarAutoriConsep";
		inputMap = this.jButtonModificarAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarAutoriConsep"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarAutoriConsep";
		inputMap = this.jButtonCerrarAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAutoriConsep"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAutoriConsep";
		inputMap = this.jButtonGuardarCambiosTablaAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAutoriConsep"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1AutoriConsep= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2AutoriConsep= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3AutoriConsep= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4AutoriConsep= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5AutoriConsep= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesAutoriConsep.setName("jPanelParametrosReportesAutoriConsep"); 
		
		this.jPanelParametrosReportesAccionesAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesAutoriConsep.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesAutoriConsep.setName("jPanelParametrosReportesAccionesAutoriConsep"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionAutoriConsep = new JButtonMe();
		this.jButtonRecargarInformacionAutoriConsep.setText("Recargar");
		this.jButtonRecargarInformacionAutoriConsep.setToolTipText("Recargar"+" "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionAutoriConsep,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionAutoriConsep = new JButtonMe();
		this.jButtonProcesarInformacionAutoriConsep.setText("Procesar");
		this.jButtonProcesarInformacionAutoriConsep.setToolTipText("Procesar"+" "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionAutoriConsep.setVisible(false);
			
		this.jButtonProcesarInformacionAutoriConsep.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAutoriConsep.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAutoriConsep.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesAutoriConsep = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAutoriConsep.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesAutoriConsep.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesAutoriConsep = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAutoriConsep.setText("TIPO");       
		this.jComboBoxTiposReportesAutoriConsep.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesAutoriConsep = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAutoriConsep.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesAutoriConsep.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionAutoriConsep = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionAutoriConsep.setText("Paginacion");
		this.jComboBoxTiposPaginacionAutoriConsep.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesAutoriConsep = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesAutoriConsep.setText("Accion");
		this.jComboBoxTiposRelacionesAutoriConsep.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesAutoriConsep = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAutoriConsep.setText("Accion");
		this.jComboBoxTiposAccionesAutoriConsep.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarAutoriConsep = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarAutoriConsep.setText("Accion");
		this.jComboBoxTiposSeleccionarAutoriConsep.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralAutoriConsep=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralAutoriConsep.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAutoriConsep.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAutoriConsep.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesAutoriConsep = new JLabelMe();
		
		this.jLabelAccionesAutoriConsep.setText("Acciones");		
		this.jLabelAccionesAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosAutoriConsep = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosAutoriConsep.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosAutoriConsep.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosAutoriConsep = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosAutoriConsep.setText("Seleccionados");
		this.jCheckBoxSeleccionadosAutoriConsep.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaAutoriConsep = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaAutoriConsep.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaAutoriConsep.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteAutoriConsep = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteAutoriConsep.setText("Graf.");
		this.jCheckBoxConGraficoReporteAutoriConsep.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresAutoriConsep = new JButtonMe();
		//this.jButtonAnterioresAutoriConsep.setText("<<");
        this.jButtonAnterioresAutoriConsep.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresAutoriConsep,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesAutoriConsep = new JButtonMe();
		//this.jButtonSiguientesAutoriConsep.setText(">>");
        this.jButtonSiguientesAutoriConsep.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesAutoriConsep,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosAutoriConsep = new JButtonMe();
		this.jButtonNuevoGuardarCambiosAutoriConsep.setText("Nue");
        this.jButtonNuevoGuardarCambiosAutoriConsep.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosAutoriConsep,"nuevoguardarcambios_button","Nue",this.autoriconsepSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosAutoriConsep";
		inputMap = this.jButtonNuevoGuardarCambiosAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosAutoriConsep"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionAutoriConsep";
		inputMap = this.jButtonRecargarInformacionAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionAutoriConsep"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesAutoriConsep";
		inputMap = this.jButtonSiguientesAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesAutoriConsep"));
		
		//ANTERIORES		
		sMapKey = "AnterioresAutoriConsep";
		inputMap = this.jButtonAnterioresAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresAutoriConsep"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasAutoriConsep();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesAutoriConsep.setMinimumSize(new Dimension(this.getWidth(),AutoriConsepBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AutoriConsepBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAutoriConsep.setMaximumSize(new Dimension(this.getWidth(),AutoriConsepBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AutoriConsepBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAutoriConsep.setPreferredSize(new Dimension(this.getWidth(),AutoriConsepBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AutoriConsepBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionAutoriConsep = new GridBagLayout();

			this.jPanelPaginacionAutoriConsep.setLayout(gridaBagLayoutPaginacionAutoriConsep);						
			
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriConsep.gridy = 0;
			this.gridBagConstraintsAutoriConsep.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionAutoriConsep.add(this.jButtonAnterioresAutoriConsep, this.gridBagConstraintsAutoriConsep);
					
						
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();//
			this.gridBagConstraintsAutoriConsep.gridx = iPosXAccionPaginacion++;//
			this.gridBagConstraintsAutoriConsep.gridy = 0;//
			
			this.jPanelPaginacionAutoriConsep.add(this.jButtonNuevoGuardarCambiosAutoriConsep, this.gridBagConstraintsAutoriConsep);//
						
			
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsAutoriConsep.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAutoriConsep.gridy = 0;
			this.jPanelPaginacionAutoriConsep.add(this.jButtonSiguientesAutoriConsep, this.gridBagConstraintsAutoriConsep);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();//
			this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsAutoriConsep.gridy = 1;//
			this.gridBagConstraintsAutoriConsep.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionAutoriConsep.add(this.jButtonNuevoAutoriConsep, this.gridBagConstraintsAutoriConsep);//
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
				this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsAutoriConsep.gridy = 1;
				this.gridBagConstraintsAutoriConsep.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionAutoriConsep.add(this.jButtonNuevoRelacionesAutoriConsep, this.gridBagConstraintsAutoriConsep);
			}
			
			
			if(!this.autoriconsepSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsAutoriConsep = new GridBagConstraints();//
				this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;//
				this.gridBagConstraintsAutoriConsep.gridy = 1;//
				this.gridBagConstraintsAutoriConsep.gridx = iPosXAccionPaginacion++;//
						
				this.jPanelPaginacionAutoriConsep.add(this.jButtonGuardarCambiosTablaAutoriConsep, this.gridBagConstraintsAutoriConsep);//
			}
			
			
			
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();//
			this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsAutoriConsep.gridy = 1;//
			this.gridBagConstraintsAutoriConsep.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionAutoriConsep.add(this.jButtonDuplicarAutoriConsep, this.gridBagConstraintsAutoriConsep);//
			
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();//
			this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsAutoriConsep.gridy = 1;//
			this.gridBagConstraintsAutoriConsep.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionAutoriConsep.add(this.jButtonCopiarAutoriConsep, this.gridBagConstraintsAutoriConsep);//
		
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();//
			this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsAutoriConsep.gridy = 1;//
			this.gridBagConstraintsAutoriConsep.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionAutoriConsep.add(this.jButtonVerFormAutoriConsep, this.gridBagConstraintsAutoriConsep);//
		
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriConsep.gridy = 1;
			this.gridBagConstraintsAutoriConsep.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionAutoriConsep.add(this.jButtonCerrarAutoriConsep, this.gridBagConstraintsAutoriConsep);
		
		
		
		this.jButtonRecargarInformacionAutoriConsep.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAutoriConsep.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAutoriConsep.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesAutoriConsep.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAutoriConsep.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAutoriConsep.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesAutoriConsep.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAutoriConsep.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAutoriConsep.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesAutoriConsep.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAutoriConsep.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAutoriConsep.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionAutoriConsep.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAutoriConsep.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAutoriConsep.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesAutoriConsep.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAutoriConsep.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAutoriConsep.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesAutoriConsep.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAutoriConsep.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAutoriConsep.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarAutoriConsep.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAutoriConsep.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAutoriConsep.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaAutoriConsep.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAutoriConsep.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAutoriConsep.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteAutoriConsep.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAutoriConsep.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAutoriConsep.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosAutoriConsep.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAutoriConsep.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAutoriConsep.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosAutoriConsep.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAutoriConsep.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAutoriConsep.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesAutoriConsep = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesAutoriConsep = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1AutoriConsep = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2AutoriConsep = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3AutoriConsep = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4AutoriConsep = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesAutoriConsep.setLayout(gridaBagParametrosReportesAutoriConsep);
			this.jPanelParametrosReportesAccionesAutoriConsep.setLayout(gridaBagParametrosReportesAccionesAutoriConsep);
			
			
			this.jPanelParametrosAuxiliar1AutoriConsep.setLayout(gridaBagParametrosAuxiliar1AutoriConsep);
			this.jPanelParametrosAuxiliar2AutoriConsep.setLayout(gridaBagParametrosAuxiliar2AutoriConsep);
			this.jPanelParametrosAuxiliar3AutoriConsep.setLayout(gridaBagParametrosAuxiliar3AutoriConsep);
			this.jPanelParametrosAuxiliar4AutoriConsep.setLayout(gridaBagParametrosAuxiliar4AutoriConsep);
			//this.jPanelParametrosAuxiliar5AutoriConsep.setLayout(gridaBagParametrosAuxiliar2AutoriConsep);			
			
			
			
			
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriConsep.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAutoriConsep.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAutoriConsep.add(this.jButtonRecargarInformacionAutoriConsep, this.gridBagConstraintsAutoriConsep);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriConsep.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriConsep.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AutoriConsep.add(this.jComboBoxTiposPaginacionAutoriConsep, this.gridBagConstraintsAutoriConsep);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriConsep.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriConsep.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AutoriConsep.add(this.jCheckBoxConAltoMaximoTablaAutoriConsep, this.gridBagConstraintsAutoriConsep);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriConsep.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriConsep.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AutoriConsep.add(this.jComboBoxTiposArchivosReportesAutoriConsep, this.gridBagConstraintsAutoriConsep);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriConsep.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriConsep.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAutoriConsep.add(this.jPanelParametrosAuxiliar1AutoriConsep, this.gridBagConstraintsAutoriConsep);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriConsep.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAutoriConsep.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4AutoriConsep.add(this.jComboBoxTiposReportesAutoriConsep, this.gridBagConstraintsAutoriConsep);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriConsep.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriConsep.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAutoriConsep.add(this.jPanelParametrosAuxiliar4AutoriConsep, this.gridBagConstraintsAutoriConsep);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriConsep.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriConsep.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAutoriConsep.add(this.jComboBoxTiposReportesAutoriConsep, this.gridBagConstraintsAutoriConsep);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriConsep.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriConsep.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAutoriConsep.add(this.jCheckBoxGenerarReporteAutoriConsep, this.gridBagConstraintsAutoriConsep);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriConsep.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriConsep.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAutoriConsep.add(this.jPanelParametrosAuxiliar2AutoriConsep, this.gridBagConstraintsAutoriConsep);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriConsep.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAutoriConsep.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAutoriConsep.add(this.jLabelAccionesAutoriConsep, this.gridBagConstraintsAutoriConsep);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
				this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsAutoriConsep.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsAutoriConsep.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesAutoriConsep.add(this.jButtonAbrirOrderByAutoriConsep, this.gridBagConstraintsAutoriConsep);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsAutoriConsep.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriConsep.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAutoriConsep.add(this.jComboBoxTiposSeleccionarAutoriConsep, this.gridBagConstraintsAutoriConsep);			
			
			
			/*
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriConsep.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAutoriConsep.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAutoriConsep.add(this.jCheckBoxSeleccionarTodosAutoriConsep, this.gridBagConstraintsAutoriConsep);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriConsep.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAutoriConsep.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AutoriConsep.add(this.jCheckBoxSeleccionarTodosAutoriConsep, this.gridBagConstraintsAutoriConsep);															
				
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriConsep.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAutoriConsep.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AutoriConsep.add(this.jCheckBoxSeleccionadosAutoriConsep, this.gridBagConstraintsAutoriConsep);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriConsep.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriConsep.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAutoriConsep.add(this.jPanelParametrosAuxiliar3AutoriConsep, this.gridBagConstraintsAutoriConsep);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsAutoriConsep.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriConsep.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAutoriConsep.add(this.jComboBoxTiposRelacionesAutoriConsep, this.gridBagConstraintsAutoriConsep);
				
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsAutoriConsep.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriConsep.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAutoriConsep.add(this.jComboBoxTiposAccionesAutoriConsep, this.gridBagConstraintsAutoriConsep);
	
				
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsAutoriConsep.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriConsep.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAutoriConsep.add(this.jTextFieldValorCampoGeneralAutoriConsep, this.gridBagConstraintsAutoriConsep);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosAutoriConsep = new GridBagLayout();

			this.jScrollPanelDatosAutoriConsep.setLayout(gridaBagLayoutDatosAutoriConsep);
			
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriConsep.gridy = 0;
			this.gridBagConstraintsAutoriConsep.gridx = 0;
			
			this.jScrollPanelDatosAutoriConsep.add(this.jTableDatosAutoriConsep, this.gridBagConstraintsAutoriConsep);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosAutoriConsep.setViewportView(this.jTableDatosAutoriConsep);
		this.jTableDatosAutoriConsep.setFillsViewportHeight(true);
		this.jTableDatosAutoriConsep.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesAutoriConsep= new GridBagLayout();
		this.jPanelAccionesAutoriConsep.setLayout(gridaBagLayoutAccionesAutoriConsep);
		
		
		/*	
		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriConsep.gridy = 0;
		this.gridBagConstraintsAutoriConsep.gridx = 0;
			
		this.jPanelAccionesAutoriConsep.add(this.jButtonNuevoAutoriConsep, this.gridBagConstraintsAutoriConsep);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNumeroAutorizacionAutoriConsep= new GridBagLayout();
		gridaBagLayoutBusquedaPorNumeroAutorizacionAutoriConsep.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNumeroAutorizacionAutoriConsep.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNumeroAutorizacionAutoriConsep.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNumeroAutorizacionAutoriConsep.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNumeroAutorizacionAutoriConsep.setLayout(gridaBagLayoutBusquedaPorNumeroAutorizacionAutoriConsep);

		gridBagConstraintsAutoriConsep = new GridBagConstraints();
		gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriConsep.gridy = 0;
		gridBagConstraintsAutoriConsep.gridx = 0;
		jPanelBusquedaPorNumeroAutorizacionAutoriConsep.add(jLabelnumero_autorizacionBusquedaPorNumeroAutorizacionAutoriConsep, gridBagConstraintsAutoriConsep);

		gridBagConstraintsAutoriConsep = new GridBagConstraints();
		gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriConsep.gridy = 0;
		gridBagConstraintsAutoriConsep.gridx = 1;
		jPanelBusquedaPorNumeroAutorizacionAutoriConsep.add(jTextFieldnumero_autorizacionBusquedaPorNumeroAutorizacionAutoriConsep, gridBagConstraintsAutoriConsep);

		gridBagConstraintsAutoriConsep = new GridBagConstraints();
		gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriConsep.gridy = 1;
		gridBagConstraintsAutoriConsep.gridx =1;
		jPanelBusquedaPorNumeroAutorizacionAutoriConsep.add(jButtonBusquedaPorNumeroAutorizacionAutoriConsep, gridBagConstraintsAutoriConsep);

		jTabbedPaneBusquedasAutoriConsep.addTab("1.-Por Nro Autorizacion ", jPanelBusquedaPorNumeroAutorizacionAutoriConsep);
		jTabbedPaneBusquedasAutoriConsep.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdClienteAutoriConsep= new GridBagLayout();
		gridaBagLayoutFK_IdClienteAutoriConsep.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteAutoriConsep.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteAutoriConsep.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteAutoriConsep.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteAutoriConsep.setLayout(gridaBagLayoutFK_IdClienteAutoriConsep);

		gridBagConstraintsAutoriConsep = new GridBagConstraints();
		gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriConsep.gridy = 0;
		gridBagConstraintsAutoriConsep.gridx = 0;
		jPanelFK_IdClienteAutoriConsep.add(jLabelid_clienteFK_IdClienteAutoriConsep, gridBagConstraintsAutoriConsep);

		gridBagConstraintsAutoriConsep = new GridBagConstraints();
		gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriConsep.gridy = 0;
		gridBagConstraintsAutoriConsep.gridx = 1;
		jPanelFK_IdClienteAutoriConsep.add(jComboBoxid_clienteFK_IdClienteAutoriConsep, gridBagConstraintsAutoriConsep);


		gridBagConstraintsAutoriConsep = new GridBagConstraints();
		gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.EAST;
		gridBagConstraintsAutoriConsep.fill = GridBagConstraints.NONE;
		gridBagConstraintsAutoriConsep.gridy = 0;
		gridBagConstraintsAutoriConsep.gridx = 0;
		jPanelFK_IdClienteAutoriConsep.add(this.jButtonBuscarFK_IdClienteid_clienteAutoriConsep, gridBagConstraintsAutoriConsep);

		gridBagConstraintsAutoriConsep = new GridBagConstraints();
		gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriConsep.gridy = 1;
		gridBagConstraintsAutoriConsep.gridx =1;
		jPanelFK_IdClienteAutoriConsep.add(jButtonFK_IdClienteAutoriConsep, gridBagConstraintsAutoriConsep);

		jTabbedPaneBusquedasAutoriConsep.addTab("2.-Por Cliente ", jPanelFK_IdClienteAutoriConsep);
		jTabbedPaneBusquedasAutoriConsep.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoAutoriConsep= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoAutoriConsep.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoAutoriConsep.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoAutoriConsep.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoAutoriConsep.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoAutoriConsep.setLayout(gridaBagLayoutFK_IdEmpleadoAutoriConsep);

		gridBagConstraintsAutoriConsep = new GridBagConstraints();
		gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriConsep.gridy = 0;
		gridBagConstraintsAutoriConsep.gridx = 0;
		jPanelFK_IdEmpleadoAutoriConsep.add(jLabelid_empleadoFK_IdEmpleadoAutoriConsep, gridBagConstraintsAutoriConsep);

		gridBagConstraintsAutoriConsep = new GridBagConstraints();
		gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriConsep.gridy = 0;
		gridBagConstraintsAutoriConsep.gridx = 1;
		jPanelFK_IdEmpleadoAutoriConsep.add(jComboBoxid_empleadoFK_IdEmpleadoAutoriConsep, gridBagConstraintsAutoriConsep);


		gridBagConstraintsAutoriConsep = new GridBagConstraints();
		gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.EAST;
		gridBagConstraintsAutoriConsep.fill = GridBagConstraints.NONE;
		gridBagConstraintsAutoriConsep.gridy = 0;
		gridBagConstraintsAutoriConsep.gridx = 0;
		jPanelFK_IdEmpleadoAutoriConsep.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoAutoriConsep, gridBagConstraintsAutoriConsep);

		gridBagConstraintsAutoriConsep = new GridBagConstraints();
		gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriConsep.gridy = 1;
		gridBagConstraintsAutoriConsep.gridx =1;
		jPanelFK_IdEmpleadoAutoriConsep.add(jButtonFK_IdEmpleadoAutoriConsep, gridBagConstraintsAutoriConsep);

		jTabbedPaneBusquedasAutoriConsep.addTab("3.-Por Empleado ", jPanelFK_IdEmpleadoAutoriConsep);
		jTabbedPaneBusquedasAutoriConsep.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdTipoAutoriConsepAutoriConsep= new GridBagLayout();
		gridaBagLayoutFK_IdTipoAutoriConsepAutoriConsep.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoAutoriConsepAutoriConsep.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoAutoriConsepAutoriConsep.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoAutoriConsepAutoriConsep.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoAutoriConsepAutoriConsep.setLayout(gridaBagLayoutFK_IdTipoAutoriConsepAutoriConsep);

		gridBagConstraintsAutoriConsep = new GridBagConstraints();
		gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriConsep.gridy = 0;
		gridBagConstraintsAutoriConsep.gridx = 0;
		jPanelFK_IdTipoAutoriConsepAutoriConsep.add(jLabelid_tipo_autori_consepFK_IdTipoAutoriConsepAutoriConsep, gridBagConstraintsAutoriConsep);

		gridBagConstraintsAutoriConsep = new GridBagConstraints();
		gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriConsep.gridy = 0;
		gridBagConstraintsAutoriConsep.gridx = 1;
		jPanelFK_IdTipoAutoriConsepAutoriConsep.add(jComboBoxid_tipo_autori_consepFK_IdTipoAutoriConsepAutoriConsep, gridBagConstraintsAutoriConsep);

		gridBagConstraintsAutoriConsep = new GridBagConstraints();
		gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriConsep.gridy = 1;
		gridBagConstraintsAutoriConsep.gridx =1;
		jPanelFK_IdTipoAutoriConsepAutoriConsep.add(jButtonFK_IdTipoAutoriConsepAutoriConsep, gridBagConstraintsAutoriConsep);

		jTabbedPaneBusquedasAutoriConsep.addTab("4.-Por Tipo ", jPanelFK_IdTipoAutoriConsepAutoriConsep);
		jTabbedPaneBusquedasAutoriConsep.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAutoriConsep = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAutoriConsep);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.autoriconsepSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();						
			this.gridBagConstraintsAutoriConsep.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAutoriConsep.gridx = 0;		
			//this.gridBagConstraintsAutoriConsep.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAutoriConsep.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarAutoriConsep, this.gridBagConstraintsAutoriConsep);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.gridy = iGridyPrincipal++;
		this.gridBagConstraintsAutoriConsep.gridx = 0;		
		//this.gridBagConstraintsAutoriConsep.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsAutoriConsep.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsAutoriConsep);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsAutoriConsep.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAutoriConsep.gridx = 0;		
			this.gridBagConstraintsAutoriConsep.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsAutoriConsep.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasAutoriConsep, this.gridBagConstraintsAutoriConsep);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutoriConsep.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesAutoriConsep, this.gridBagConstraintsAutoriConsep);								
		
		
		/*
		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutoriConsep.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesAutoriConsep, this.gridBagConstraintsAutoriConsep);
		*/		
		
		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAutoriConsep.gridx =0;
		this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAutoriConsep.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAutoriConsep, this.gridBagConstraintsAutoriConsep);
				
		
		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutoriConsep.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionAutoriConsep, this.gridBagConstraintsAutoriConsep);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(AutoriConsepJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosAutoriConsep= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAutoriConsep = new GridBagLayout();
			this.jPanelBusquedasParametrosAutoriConsep.setLayout(gridaBagLayoutBusquedasParametrosAutoriConsep);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralAutoriConsep=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAutoriConsep.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAutoriConsep.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAutoriConsep.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsAutoriConsep.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsAutoriConsep.anchor = GridBagConstraints.WEST;
			
			
			
			
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
		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutoriConsep.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAutoriConsep, this.gridBagConstraintsAutoriConsep);
			
			
		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutoriConsep.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAutoriConsep, this.gridBagConstraintsAutoriConsep);
		
			
		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAutoriConsep.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAutoriConsep, this.gridBagConstraintsAutoriConsep);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralAutoriConsep;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoAutoriConsep() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoAutoriConsep = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoAutoriConsep.setName("jPanelReporteDinamicoAutoriConsep"); 
		
		this.jPanelReporteDinamicoAutoriConsep.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAutoriConsep.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAutoriConsep.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoAutoriConsep.setLayout(gridaBagLayoutReporteDinamicoAutoriConsep);
		
		
		this.jInternalFrameReporteDinamicoAutoriConsep= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoAutoriConsep = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAutoriConsep= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoAutoriConsep.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoAutoriConsep.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoAutoriConsep.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoAutoriConsep.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoAutoriConsep.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoAutoriConsep.setResizable(true);
	    this.jInternalFrameReporteDinamicoAutoriConsep.setClosable(true);
	    this.jInternalFrameReporteDinamicoAutoriConsep.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoAutoriConsep.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAutoriConsep.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAutoriConsep.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Autorizaciones Consepes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteAutoriConsep = new JLabelMe();

		this.jLabelColumnasSelectReporteAutoriConsep.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriConsep.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriConsep.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAutoriConsep.add(this.jLabelColumnasSelectReporteAutoriConsep, this.gridBagConstraintsAutoriConsep);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteAutoriConsep = new JList<Reporte>();
		this.jListColumnasSelectReporteAutoriConsep.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteAutoriConsep.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteAutoriConsep.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAutoriConsep.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAutoriConsep.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteAutoriConsep=new JScrollPane(this.jListColumnasSelectReporteAutoriConsep);
			
			this.jScrollColumnasSelectReporteAutoriConsep.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAutoriConsep.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAutoriConsep.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriConsep.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriConsep.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoAutoriConsep.add(this.jListColumnasSelectReporteAutoriConsep, this.gridBagConstraintsAutoriConsep);
		this.jPanelReporteDinamicoAutoriConsep.add(this.jScrollColumnasSelectReporteAutoriConsep, this.gridBagConstraintsAutoriConsep);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteAutoriConsep = new JLabelMe();

		this.jLabelRelacionesSelectReporteAutoriConsep.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriConsep.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriConsep.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAutoriConsep.add(this.jLabelRelacionesSelectReporteAutoriConsep, this.gridBagConstraintsAutoriConsep);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteAutoriConsep = new JList<Reporte>();
		this.jListRelacionesSelectReporteAutoriConsep.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteAutoriConsep.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteAutoriConsep.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAutoriConsep.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAutoriConsep.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteAutoriConsep=new JScrollPane(this.jListRelacionesSelectReporteAutoriConsep);
			
			this.jScrollRelacionesSelectReporteAutoriConsep.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAutoriConsep.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAutoriConsep.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriConsep.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriConsep.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoAutoriConsep.add(this.jListRelacionesSelectReporteAutoriConsep, this.gridBagConstraintsAutoriConsep);
		this.jPanelReporteDinamicoAutoriConsep.add(this.jScrollRelacionesSelectReporteAutoriConsep, this.gridBagConstraintsAutoriConsep);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoAutoriConsep = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoAutoriConsep = new JComboBoxMe();
		this.jListColumnasValoresGraficoAutoriConsep = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoAutoriConsep = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoAutoriConsep.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoAutoriConsep.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAutoriConsep.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAutoriConsep.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoAutoriConsep = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoAutoriConsep.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoAutoriConsep.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAutoriConsep.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAutoriConsep.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoAutoriConsep = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoAutoriConsep.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriConsep.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriConsep.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAutoriConsep.add(this.jLabelGenerarExcelReporteDinamicoAutoriConsep, this.gridBagConstraintsAutoriConsep);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoAutoriConsep = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoAutoriConsep.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoAutoriConsep,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoAutoriConsep.setToolTipText("Generar EXCEL"+" "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsAutoriConsep.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsAutoriConsep.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoAutoriConsep.add(this.jButtonGenerarExcelReporteDinamicoAutoriConsep, this.gridBagConstraintsAutoriConsep);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriConsep.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAutoriConsep.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAutoriConsep.add(this.jComboBoxTiposReportesDinamicoAutoriConsep, this.gridBagConstraintsAutoriConsep);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoAutoriConsep = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoAutoriConsep.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriConsep.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriConsep.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAutoriConsep.add(this.jLabelTiposArchivoReporteDinamicoAutoriConsep, this.gridBagConstraintsAutoriConsep);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriConsep.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAutoriConsep.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAutoriConsep.add(this.jComboBoxTiposArchivosReportesDinamicoAutoriConsep, this.gridBagConstraintsAutoriConsep);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoAutoriConsep = new JButtonMe();
		this.jButtonGenerarReporteDinamicoAutoriConsep.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoAutoriConsep,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoAutoriConsep.setToolTipText("Generar"+" "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriConsep.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAutoriConsep.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAutoriConsep.add(this.jButtonGenerarReporteDinamicoAutoriConsep, this.gridBagConstraintsAutoriConsep);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoAutoriConsep = new JButtonMe();
		this.jButtonCerrarReporteDinamicoAutoriConsep.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoAutoriConsep,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoAutoriConsep.setToolTipText("Cancelar"+" "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriConsep.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAutoriConsep.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAutoriConsep.add(this.jButtonCerrarReporteDinamicoAutoriConsep, this.gridBagConstraintsAutoriConsep);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalAutoriConsep = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoAutoriConsep= new JScrollPane(jPanelReporteDinamicoAutoriConsep,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoAutoriConsep.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAutoriConsep.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAutoriConsep.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Autorizaciones Consepes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsAutoriConsep.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoAutoriConsep.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoAutoriConsep.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalAutoriConsep);
		this.jInternalFrameReporteDinamicoAutoriConsep.getContentPane().add(this.jScrollPanelReporteDinamicoAutoriConsep, this.gridBagConstraintsAutoriConsep);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionAutoriConsep() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionAutoriConsep = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionAutoriConsep.setName("jPanelImportacionAutoriConsep"); 
		
		this.jPanelImportacionAutoriConsep.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAutoriConsep.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAutoriConsep.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionAutoriConsep.setLayout(gridaBagLayoutImportacionAutoriConsep);
		
		
		this.jInternalFrameImportacionAutoriConsep= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionAutoriConsep= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionAutoriConsep = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAutoriConsep= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionAutoriConsep.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAutoriConsep.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAutoriConsep.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionAutoriConsep.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAutoriConsep.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAutoriConsep.setResizable(true);
	    this.jInternalFrameImportacionAutoriConsep.setClosable(true);
	    this.jInternalFrameImportacionAutoriConsep.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionAutoriConsep.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAutoriConsep.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAutoriConsep.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionAutoriConsep.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAutoriConsep.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAutoriConsep.setResizable(true);
	    this.jInternalFrameImportacionAutoriConsep.setClosable(true);
	    this.jInternalFrameImportacionAutoriConsep.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionAutoriConsep.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAutoriConsep.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAutoriConsep.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Autorizaciones Consepes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionAutoriConsep = new JLabelMe();

		this.jLabelArchivoImportacionAutoriConsep.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriConsep.gridy = iPosYImportacion;		
		this.gridBagConstraintsAutoriConsep.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAutoriConsep.add(this.jLabelArchivoImportacionAutoriConsep, this.gridBagConstraintsAutoriConsep);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionAutoriConsep = new JFileChooser();		
		this.jFileChooserImportacionAutoriConsep.setToolTipText("ESCOGER ARCHIVO"+" "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionAutoriConsep = new JButtonMe();
		this.jButtonAbrirImportacionAutoriConsep.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionAutoriConsep,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionAutoriConsep.setToolTipText("Generar"+" "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriConsep.gridy = iPosYImportacion;
		this.gridBagConstraintsAutoriConsep.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAutoriConsep.add(this.jButtonAbrirImportacionAutoriConsep, this.gridBagConstraintsAutoriConsep);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionAutoriConsep = new JLabelMe();

		this.jLabelPathArchivoImportacionAutoriConsep.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriConsep.gridy = iPosYImportacion;		
		this.gridBagConstraintsAutoriConsep.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAutoriConsep.add(this.jLabelPathArchivoImportacionAutoriConsep, this.gridBagConstraintsAutoriConsep);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionAutoriConsep=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionAutoriConsep.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAutoriConsep.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAutoriConsep.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriConsep.gridy = iPosYImportacion;
		this.gridBagConstraintsAutoriConsep.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAutoriConsep.add(this.jTextFieldPathArchivoImportacionAutoriConsep, this.gridBagConstraintsAutoriConsep);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionAutoriConsep = new JButtonMe();
		this.jButtonGenerarImportacionAutoriConsep.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionAutoriConsep,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionAutoriConsep.setToolTipText("Generar"+" "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriConsep.gridy = iPosYImportacion;
		this.gridBagConstraintsAutoriConsep.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAutoriConsep.add(this.jButtonGenerarImportacionAutoriConsep, this.gridBagConstraintsAutoriConsep);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionAutoriConsep = new JButtonMe();
		this.jButtonCerrarImportacionAutoriConsep.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionAutoriConsep,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionAutoriConsep.setToolTipText("Cancelar"+" "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriConsep.gridy = iPosYImportacion;
		this.gridBagConstraintsAutoriConsep.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAutoriConsep.add(this.jButtonCerrarImportacionAutoriConsep, this.gridBagConstraintsAutoriConsep);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalAutoriConsep = new GridBagLayout();
		
		this.jScrollPanelImportacionAutoriConsep= new JScrollPane(jPanelImportacionAutoriConsep,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsAutoriConsep.gridy =iPosYImportacion;
		this.gridBagConstraintsAutoriConsep.gridx =iPosXImportacion;
		this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionAutoriConsep.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionAutoriConsep.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalAutoriConsep);
		this.jInternalFrameImportacionAutoriConsep.getContentPane().add(this.jScrollPanelImportacionAutoriConsep, this.gridBagConstraintsAutoriConsep);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByAutoriConsep(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByAutoriConsep = new JButtonMe();
			this.jButtonAbrirOrderByAutoriConsep.setText("Orden");
			this.jButtonAbrirOrderByAutoriConsep.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAutoriConsep,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByAutoriConsep";
			inputMap = this.jButtonAbrirOrderByAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByAutoriConsep"));
		
		
			GridBagLayout gridaBagLayoutOrderByAutoriConsep = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByAutoriConsep.setName("jPanelOrderByAutoriConsep"); 
			
			this.jPanelOrderByAutoriConsep.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAutoriConsep.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAutoriConsep.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByAutoriConsep.setLayout(gridaBagLayoutOrderByAutoriConsep);
			
			
			this.jTableDatosAutoriConsepOrderBy = new JTableMe();        
			this.jTableDatosAutoriConsepOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosAutoriConsepOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosAutoriConsepOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosAutoriConsepOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosAutoriConsepOrderBy.setViewportView(this.jTableDatosAutoriConsepOrderBy);
			this.jTableDatosAutoriConsepOrderBy.setFillsViewportHeight(true);
			this.jTableDatosAutoriConsepOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByAutoriConsep= new OrderByJInternalFrame();
			this.jInternalFrameOrderByAutoriConsep= new OrderByJInternalFrame();
			this.jScrollPanelOrderByAutoriConsep = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteAutoriConsep= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByAutoriConsep.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByAutoriConsep.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByAutoriConsep.setTitle("Orden");
			this.jInternalFrameOrderByAutoriConsep.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByAutoriConsep.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByAutoriConsep.setResizable(true);
			this.jInternalFrameOrderByAutoriConsep.setClosable(true);
			this.jInternalFrameOrderByAutoriConsep.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByAutoriConsep.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAutoriConsep.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAutoriConsep.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Autorizaciones Consepes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsAutoriConsep.gridy =iPosYOrderBy++;
			this.gridBagConstraintsAutoriConsep.gridx =iPosXOrderBy;
			this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsAutoriConsep.ipady =150;
				
			this.jPanelOrderByAutoriConsep.add(jScrollPanelDatosAutoriConsepOrderBy, this.gridBagConstraintsAutoriConsep);//this.jTableDatosAutoriConsepTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByAutoriConsep = new JButtonMe();
			this.jButtonCerrarOrderByAutoriConsep.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByAutoriConsep,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByAutoriConsep.setToolTipText("Cancelar"+" "+AutoriConsepConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriConsep.gridy = iPosYOrderBy++;
			this.gridBagConstraintsAutoriConsep.gridx = iPosXOrderBy;
									
			this.jPanelOrderByAutoriConsep.add(this.jButtonCerrarOrderByAutoriConsep, this.gridBagConstraintsAutoriConsep);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalAutoriConsep = new GridBagLayout();
			
			this.jScrollPanelOrderByAutoriConsep= new JScrollPane(jPanelOrderByAutoriConsep,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsAutoriConsep.gridy =iPosYOrderBy;
			this.gridBagConstraintsAutoriConsep.gridx =iPosXOrderBy;
			this.gridBagConstraintsAutoriConsep.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByAutoriConsep.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByAutoriConsep.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalAutoriConsep);
			
			this.jInternalFrameOrderByAutoriConsep.getContentPane().add(this.jScrollPanelOrderByAutoriConsep, this.gridBagConstraintsAutoriConsep);			
		
		} else {
			this.jButtonAbrirOrderByAutoriConsep = new JButtonMe();
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
		int iWidthTableCalculado=0;//2730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.autoriconsepSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosAutoriConsep.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosAutoriConsep.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosAutoriConsep.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosAutoriConsep.getRowHeight();//AutoriConsepConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.autoriconsepSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > AutoriConsepConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAutoriConsep.isSelected()) {
					iHeightTable=AutoriConsepConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AutoriConsepConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AutoriConsepConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > AutoriConsepConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAutoriConsep.isSelected()) {
					iHeightTable=AutoriConsepConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AutoriConsepConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AutoriConsepConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosAutoriConsep.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAutoriConsep.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAutoriConsep.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosAutoriConsep.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAutoriConsep.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAutoriConsep.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByAutoriConsep!=null && this.jInternalFrameOrderByAutoriConsep.getjTableDatosOrderBy()!=null) {
			//if(!this.autoriconsepSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByAutoriConsep.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByAutoriConsep.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByAutoriConsep.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByAutoriConsep.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByAutoriConsep.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByAutoriConsep.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByAutoriConsep.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosAutoriConsep.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAutoriConsep.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAutoriConsep.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=autoriconsepLogic.getAutoriConseps().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=autoriconseps.size();
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
	public static List<AutoriConsep> TraerAutoriConsepBeans(List<AutoriConsep> autoriconseps,ArrayList<Classe> classes)throws Exception {
		try {
			for(AutoriConsep autoriconsep:autoriconseps) {
					
				if(!(AutoriConsepConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || AutoriConsepConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					autoriconsep.setsDetalleGeneralEntityReporte(AutoriConsepConstantesFunciones.getAutoriConsepDescripcion(autoriconsep));
										
					autoriconsep.setes_empresa_descripcion(AutoriConsepConstantesFunciones.getes_empresaDescripcion(autoriconsep));	
					
					

					if(autoriconsep.getDetalleAutoriConseps()!=null && Funciones.existeClass(classes,DetalleAutoriConsep.class)) {
						try{autoriconsep.setdetalleautoriconsepsDescripcionReporte(new JRBeanCollectionDataSource(DetalleAutoriConsepJInternalFrame.TraerDetalleAutoriConsepBeans(autoriconsep.getDetalleAutoriConseps(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//autoriconsep.setsDetalleGeneralEntityReporte(autoriconsep.getsDetalleGeneralEntityReporte());
										
				}
				
				//autoriconsepbeans.add(autoriconsepbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return autoriconseps;
    }
	//PARA REPORTES FIN
}
