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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.ResponsableFondoConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class ResponsableFondoJInternalFrame extends ResponsableFondoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarResponsableFondo;
	
	protected JMenuBar jmenuBarResponsableFondo;
	
	protected JMenu jmenuResponsableFondo;
	protected JMenu jmenuDatosResponsableFondo;
	protected JMenu jmenuArchivoResponsableFondo;
	protected JMenu jmenuAccionesResponsableFondo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosResponsableFondo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutResponsableFondo;	
	protected GridBagConstraints gridBagConstraintsResponsableFondo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ResponsableFondoDetalleFormJInternalFrame jInternalFrameDetalleFormResponsableFondo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoResponsableFondo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionResponsableFondo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";
	
	public ResponsableFondoSessionBean responsablefondoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ResponsableFondo> responsablefondos;		
	public List<ResponsableFondo> responsablefondosEliminados;	
	public List<ResponsableFondo> responsablefondosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByResponsableFondo;		
	protected JButton jButtonAbrirOrderByResponsableFondo;
	
	
	//protected JPanel jPanelOrderByResponsableFondo;
	//public JScrollPane jScrollPanelOrderByResponsableFondo;	
	//protected JButton jButtonCerrarOrderByResponsableFondo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ResponsableFondoLogic responsablefondoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosResponsableFondo;
	public JScrollPane jScrollPanelDatosEdicionResponsableFondo;
	public JScrollPane jScrollPanelDatosGeneralResponsableFondo;
    
	
	
	//public JScrollPane jScrollPanelDatosResponsableFondoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoResponsableFondo;
	//public JScrollPane jScrollPanelImportacionResponsableFondo;
	
	
	
	protected JPanel jPanelAccionesResponsableFondo;
	
    protected JPanel jPanelPaginacionResponsableFondo;
    protected JPanel jPanelParametrosReportesResponsableFondo;
	protected JPanel jPanelParametrosReportesAccionesResponsableFondo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ResponsableFondo;
	protected JPanel jPanelParametrosAuxiliar2ResponsableFondo;
	protected JPanel jPanelParametrosAuxiliar3ResponsableFondo;
	protected JPanel jPanelParametrosAuxiliar4ResponsableFondo;
	//protected JPanel jPanelParametrosAuxiliar5ResponsableFondo;
	
	
	
	//protected JPanel jPanelReporteDinamicoResponsableFondo;
	//protected JPanel jPanelImportacionResponsableFondo;
	
	
	public JTable jTableDatosResponsableFondo;
	
	
	
	//public JTable jTableDatosResponsableFondoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoResponsableFondo;
	protected JButton jButtonDuplicarResponsableFondo;
	protected JButton jButtonCopiarResponsableFondo;
	protected JButton jButtonVerFormResponsableFondo;
	protected JButton jButtonNuevoRelacionesResponsableFondo;
	protected JButton jButtonModificarResponsableFondo;
	
    protected JButton jButtonGuardarCambiosTablaResponsableFondo;
	protected JButton jButtonCerrarResponsableFondo;
	
	
	protected JButton jButtonRecargarInformacionResponsableFondo;
	protected JButton jButtonProcesarInformacionResponsableFondo;
	
	
	protected JButton jButtonAnterioresResponsableFondo;
	protected JButton jButtonSiguientesResponsableFondo;
	protected JButton jButtonNuevoGuardarCambiosResponsableFondo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoResponsableFondo;
	//protected JButton jButtonCerrarReporteDinamicoResponsableFondo;
	//protected JButton jButtonGenerarExcelReporteDinamicoResponsableFondo;	
	
	
	
	//protected JButton jButtonAbrirImportacionResponsableFondo;
	//protected JButton jButtonGenerarImportacionResponsableFondo;
	//protected JButton jButtonCerrarImportacionResponsableFondo;
	//protected JFileChooser jFileChooserImportacionResponsableFondo;
	//protected File fileImportacionResponsableFondo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarResponsableFondo;
	protected JButton jButtonDuplicarToolBarResponsableFondo;
	protected JButton jButtonNuevoRelacionesToolBarResponsableFondo;
	
	
	public JButton jButtonGuardarCambiosToolBarResponsableFondo;
	protected JButton jButtonCopiarToolBarResponsableFondo;
	protected JButton jButtonVerFormToolBarResponsableFondo;
	public JButton jButtonGuardarCambiosTablaToolBarResponsableFondo;
	protected JButton jButtonMostrarOcultarTablaToolBarResponsableFondo;
	protected JButton jButtonCerrarToolBarResponsableFondo;
	
	protected JButton jButtonRecargarInformacionToolBarResponsableFondo;
	protected JButton jButtonProcesarInformacionToolBarResponsableFondo;
	protected JButton jButtonAnterioresToolBarResponsableFondo;
	protected JButton jButtonSiguientesToolBarResponsableFondo;
	protected JButton jButtonNuevoGuardarCambiosToolBarResponsableFondo;
	protected JButton jButtonAbrirOrderByToolBarResponsableFondo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoResponsableFondo;
	protected JMenuItem jMenuItemDuplicarResponsableFondo;
	protected JMenuItem jMenuItemNuevoRelacionesResponsableFondo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosResponsableFondo;
	protected JMenuItem jMenuItemCopiarResponsableFondo;
	protected JMenuItem jMenuItemVerFormResponsableFondo;
	protected JMenuItem jMenuItemGuardarCambiosTablaResponsableFondo;
	protected JMenuItem jMenuItemCerrarResponsableFondo;
	protected JMenuItem jMenuItemDetalleCerrarResponsableFondo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByResponsableFondo;
	protected JMenuItem jMenuItemDetalleMostarOcultarResponsableFondo;
	
	protected JMenuItem jMenuItemRecargarInformacionResponsableFondo;
	protected JMenuItem jMenuItemProcesarInformacionResponsableFondo;
	protected JMenuItem jMenuItemAnterioresResponsableFondo;
	protected JMenuItem jMenuItemSiguientesResponsableFondo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosResponsableFondo;
	protected JMenuItem jMenuItemAbrirOrderByResponsableFondo;
	protected JMenuItem jMenuItemMostrarOcultarResponsableFondo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesResponsableFondo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosResponsableFondo;
	protected JCheckBox jCheckBoxSeleccionadosResponsableFondo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaResponsableFondo;
	protected JCheckBox jCheckBoxConGraficoReporteResponsableFondo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesResponsableFondo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesResponsableFondo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoResponsableFondo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoResponsableFondo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesResponsableFondo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionResponsableFondo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesResponsableFondo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesResponsableFondo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarResponsableFondo;
	protected JTextField jTextFieldValorCampoGeneralResponsableFondo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteResponsableFondo;
	//public JList<Reporte> jListColumnasSelectReporteResponsableFondo;
	//public JScrollPane jScrollColumnasSelectReporteResponsableFondo;
	
	//public JLabel jLabelRelacionesSelectReporteResponsableFondo;
	//public JList<Reporte> jListRelacionesSelectReporteResponsableFondo;
	//public JScrollPane jScrollRelacionesSelectReporteResponsableFondo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoResponsableFondo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoResponsableFondo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoResponsableFondo;
	//public JLabel jLabelTiposArchivoReporteDinamicoResponsableFondo;
	
		
	//public JLabel jLabelArchivoImportacionResponsableFondo;	
	//public JLabel jLabelPathArchivoImportacionResponsableFondo;
	//protected JTextField jTextFieldPathArchivoImportacionResponsableFondo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoResponsableFondo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoResponsableFondo;
	
	//public JLabel jLabelColumnaCategoriaValorResponsableFondo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorResponsableFondo;
	
	//public JLabel jLabelColumnasValoresGraficoResponsableFondo;
	//public JList<Reporte> jListColumnasValoresGraficoResponsableFondo;
	//public JScrollPane jScrollColumnasValoresGraficoResponsableFondo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoResponsableFondo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoResponsableFondo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasResponsableFondo;
	public JPanel jPanelFK_IdEmpleadoResponsableFondo;
	public JButton jButtonFK_IdEmpleadoResponsableFondo;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoResponsableFondo;
	public JLabel jLabelid_empleadoFK_IdEmpleadoResponsableFondo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoResponsableFondo;
	public JButton jButtonid_empleadoFK_IdEmpleadoResponsableFondo= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoResponsableFondoUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoResponsableFondoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoResponsableFondo;
	
	
	
	
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
	//public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ResponsableFondoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ResponsableFondo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResponsableFondoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ResponsableFondo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResponsableFondoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ResponsableFondo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResponsableFondoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ResponsableFondo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionResponsableFondo)	{
		this.jButtonRecargarInformacionResponsableFondo = jButtonRecargarInformacionResponsableFondo;
	}
	
	public JButton getjButtonProcesarInformacionResponsableFondo() {
		return this.jButtonProcesarInformacionResponsableFondo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionResponsableFondo)	{
		this.jButtonProcesarInformacionResponsableFondo = jButtonProcesarInformacionResponsableFondo;
	}
	
	
	public JButton getjButtonRecargarInformacionResponsableFondo() {
		return this.jButtonRecargarInformacionResponsableFondo;
	}
	
	
	public List<ResponsableFondo> getresponsablefondos() {
		return this.responsablefondos;
	}

	public void setresponsablefondos(List<ResponsableFondo> responsablefondos) {
		this.responsablefondos = responsablefondos;
	}
	
	public List<ResponsableFondo> getresponsablefondosAux() {
		return this.responsablefondosAux;
	}

	public void setresponsablefondosAux(List<ResponsableFondo> responsablefondosAux) {
		this.responsablefondosAux = responsablefondosAux;
	}
	
	public List<ResponsableFondo> getresponsablefondosEliminados() {
		return this.responsablefondosEliminados;
	}

	public void setResponsableFondosEliminados(List<ResponsableFondo> responsablefondosEliminados) {
		this.responsablefondosEliminados = responsablefondosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarResponsableFondo() {
		return jComboBoxTiposSeleccionarResponsableFondo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarResponsableFondo(
			JComboBox jComboBoxTiposSeleccionarResponsableFondo) {
		this.jComboBoxTiposSeleccionarResponsableFondo = jComboBoxTiposSeleccionarResponsableFondo;
	}
	
	public void setBorderResaltarTiposSeleccionarResponsableFondo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarResponsableFondo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarResponsableFondo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralResponsableFondo() {
		return jTextFieldValorCampoGeneralResponsableFondo;
	}

	public void setjTextFieldValorCampoGeneralResponsableFondo(
			JTextField jTextFieldValorCampoGeneralResponsableFondo) {
		this.jTextFieldValorCampoGeneralResponsableFondo = jTextFieldValorCampoGeneralResponsableFondo;
	}

	public void setBorderResaltarValorCampoGeneralResponsableFondo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResponsableFondo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralResponsableFondo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosResponsableFondo() {
		return this.jCheckBoxSeleccionarTodosResponsableFondo;
	}

	public void setjCheckBoxSeleccionarTodosResponsableFondo(
			JCheckBox jCheckBoxSeleccionarTodosResponsableFondo) {
		this.jCheckBoxSeleccionarTodosResponsableFondo = jCheckBoxSeleccionarTodosResponsableFondo;
	}

	public void setBorderResaltarSeleccionarTodosResponsableFondo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResponsableFondo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosResponsableFondo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosResponsableFondo() {
		return this.jCheckBoxSeleccionadosResponsableFondo;
	}

	public void setjCheckBoxSeleccionadosResponsableFondo(
			JCheckBox jCheckBoxSeleccionadosResponsableFondo) {
		this.jCheckBoxSeleccionadosResponsableFondo = jCheckBoxSeleccionadosResponsableFondo;
	}
	
	public void setBorderResaltarSeleccionadosResponsableFondo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResponsableFondo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosResponsableFondo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesResponsableFondo() {
		return this.jComboBoxTiposArchivosReportesResponsableFondo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesResponsableFondo(
			JComboBox jComboBoxTiposArchivosReportesResponsableFondo) {
		this.jComboBoxTiposArchivosReportesResponsableFondo = jComboBoxTiposArchivosReportesResponsableFondo;
	}

	public void setBorderResaltarTiposArchivosReportesResponsableFondo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResponsableFondo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesResponsableFondo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesResponsableFondo() {
		return this.jComboBoxTiposReportesResponsableFondo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesResponsableFondo(
			JComboBox jComboBoxTiposReportesResponsableFondo) {
		this.jComboBoxTiposReportesResponsableFondo = jComboBoxTiposReportesResponsableFondo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoResponsableFondo() {
	//	return jComboBoxTiposReportesDinamicoResponsableFondo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoResponsableFondo(
	//		JComboBox jComboBoxTiposReportesDinamicoResponsableFondo) {
	//	this.jComboBoxTiposReportesDinamicoResponsableFondo = jComboBoxTiposReportesDinamicoResponsableFondo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoResponsableFondo() {
	//	return jComboBoxTiposArchivosReportesDinamicoResponsableFondo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoResponsableFondo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoResponsableFondo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoResponsableFondo = jComboBoxTiposArchivosReportesDinamicoResponsableFondo;
	//}
	
	public void setBorderResaltarTiposReportesResponsableFondo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResponsableFondo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesResponsableFondo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesResponsableFondo() {
		return this.jComboBoxTiposGraficosReportesResponsableFondo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesResponsableFondo(
			JComboBox jComboBoxTiposGraficosReportesResponsableFondo) {
		this.jComboBoxTiposGraficosReportesResponsableFondo = jComboBoxTiposGraficosReportesResponsableFondo;
	}
	
	public void setBorderResaltarTiposGraficosReportesResponsableFondo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResponsableFondo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesResponsableFondo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionResponsableFondo() {
		return this.jComboBoxTiposPaginacionResponsableFondo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionResponsableFondo(
			JComboBox jComboBoxTiposPaginacionResponsableFondo) {
		this.jComboBoxTiposPaginacionResponsableFondo = jComboBoxTiposPaginacionResponsableFondo;
	}
	
	public void setBorderResaltarTiposPaginacionResponsableFondo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResponsableFondo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionResponsableFondo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesResponsableFondo() {
		return this.jComboBoxTiposRelacionesResponsableFondo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesResponsableFondo() {
		return this.jComboBoxTiposAccionesResponsableFondo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesResponsableFondo(
			JComboBox jComboBoxTiposRelacionesResponsableFondo) {
		this.jComboBoxTiposRelacionesResponsableFondo = jComboBoxTiposRelacionesResponsableFondo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesResponsableFondo(
			JComboBox jComboBoxTiposAccionesResponsableFondo) {
		this.jComboBoxTiposAccionesResponsableFondo = jComboBoxTiposAccionesResponsableFondo;
	}
	
	public void setBorderResaltarTiposRelacionesResponsableFondo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResponsableFondo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesResponsableFondo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesResponsableFondo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResponsableFondo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesResponsableFondo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoResponsableFondo() {
	//	return jCheckBoxConGraficoDinamicoResponsableFondo;
	//}

	//public void setjCheckBoxConGraficoDinamicoResponsableFondo(
	//		JCheckBox jCheckBoxConGraficoDinamicoResponsableFondo) {
	//	this.jCheckBoxConGraficoDinamicoResponsableFondo = jCheckBoxConGraficoDinamicoResponsableFondo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoResponsableFondo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarResponsableFondo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoResponsableFondo .setBorder(borderResaltar);		
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
		this.responsablefondoSessionBean=new ResponsableFondoSessionBean();
		
		this.responsablefondoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.responsablefondoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.responsablefondoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ResponsableFondoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ResponsableFondoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ResponsableFondoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ResponsableFondoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ResponsableFondoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Responsable Fondo Rotativo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.responsablefondoSessionBean.getEsGuardarRelacionado()) {
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
		
		ResponsableFondoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ResponsableFondo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarResponsableFondo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarResponsableFondo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarResponsableFondo,this.jTtoolBarResponsableFondo,
							"nuevo","nuevo","Nuevo"+" "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarResponsableFondo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarResponsableFondo,this.jTtoolBarResponsableFondo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarResponsableFondo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarResponsableFondo,this.jTtoolBarResponsableFondo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarResponsableFondo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarResponsableFondo,this.jTtoolBarResponsableFondo,
							"duplicar","duplicar","Duplicar"+" "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarResponsableFondo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarResponsableFondo,this.jTtoolBarResponsableFondo,
							"copiar","copiar","Copiar"+" "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarResponsableFondo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarResponsableFondo,this.jTtoolBarResponsableFondo,
							"ver_form","ver_form","Ver"+" "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarResponsableFondo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarResponsableFondo,this.jTtoolBarResponsableFondo,
							"recargar","recargar","Recargar"+" "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarResponsableFondo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarResponsableFondo,this.jTtoolBarResponsableFondo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarResponsableFondo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarResponsableFondo,this.jTtoolBarResponsableFondo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarResponsableFondo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarResponsableFondo,this.jTtoolBarResponsableFondo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarResponsableFondo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarResponsableFondo,this.jTtoolBarResponsableFondo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarResponsableFondo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarResponsableFondo,this.jTtoolBarResponsableFondo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarResponsableFondo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarResponsableFondo,this.jTtoolBarResponsableFondo,
							"cerrar","cerrar","Salir"+" "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarResponsableFondo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarResponsableFondo;
			
				this.jButtonProcesarInformacionToolBarResponsableFondo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarResponsableFondo;
				
		//protected JButton jButtonModificarToolBarResponsableFondo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarResponsableFondo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuResponsableFondo=new JMenuMe("General");
		this.jmenuArchivoResponsableFondo=new JMenuMe("Archivo");
		this.jmenuAccionesResponsableFondo=new JMenuMe("Acciones");
		this.jmenuDatosResponsableFondo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoResponsableFondo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoResponsableFondo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoResponsableFondo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarResponsableFondo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarResponsableFondo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarResponsableFondo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesResponsableFondo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesResponsableFondo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesResponsableFondo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosResponsableFondo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosResponsableFondo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosResponsableFondo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarResponsableFondo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarResponsableFondo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarResponsableFondo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormResponsableFondo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormResponsableFondo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormResponsableFondo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaResponsableFondo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaResponsableFondo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaResponsableFondo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarResponsableFondo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarResponsableFondo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarResponsableFondo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionResponsableFondo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionResponsableFondo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionResponsableFondo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionResponsableFondo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionResponsableFondo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionResponsableFondo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresResponsableFondo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresResponsableFondo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresResponsableFondo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesResponsableFondo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesResponsableFondo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesResponsableFondo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByResponsableFondo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByResponsableFondo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByResponsableFondo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarResponsableFondo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarResponsableFondo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarResponsableFondo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByResponsableFondo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByResponsableFondo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByResponsableFondo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarResponsableFondo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarResponsableFondo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarResponsableFondo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosResponsableFondo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosResponsableFondo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosResponsableFondo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoResponsableFondo.add(this.jMenuItemCerrarResponsableFondo);
			
			this.jmenuAccionesResponsableFondo.add(this.jMenuItemNuevoResponsableFondo);
			this.jmenuAccionesResponsableFondo.add(this.jMenuItemNuevoGuardarCambiosResponsableFondo);
			this.jmenuAccionesResponsableFondo.add(this.jMenuItemNuevoRelacionesResponsableFondo);
			this.jmenuAccionesResponsableFondo.add(this.jMenuItemGuardarCambiosTablaResponsableFondo);		
			this.jmenuAccionesResponsableFondo.add(this.jMenuItemDuplicarResponsableFondo);		
			this.jmenuAccionesResponsableFondo.add(this.jMenuItemCopiarResponsableFondo);		
			this.jmenuAccionesResponsableFondo.add(this.jMenuItemVerFormResponsableFondo);		
			
			this.jmenuDatosResponsableFondo.add(this.jMenuItemRecargarInformacionResponsableFondo);				
			this.jmenuDatosResponsableFondo.add(this.jMenuItemAnterioresResponsableFondo);				
			this.jmenuDatosResponsableFondo.add(this.jMenuItemSiguientesResponsableFondo);				
			this.jmenuDatosResponsableFondo.add(this.jMenuItemAbrirOrderByResponsableFondo);				
			this.jmenuDatosResponsableFondo.add(this.jMenuItemMostrarOcultarResponsableFondo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesResponsableFondo.add(this.jMenuItemGuardarCambiosResponsableFondo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarResponsableFondo.add(this.jmenuArchivoResponsableFondo);		
			this.jmenuBarResponsableFondo.add(this.jmenuAccionesResponsableFondo);		
			this.jmenuBarResponsableFondo.add(this.jmenuDatosResponsableFondo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarResponsableFondo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasResponsableFondo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEmpleadoResponsableFondo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoResponsableFondo.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoResponsableFondo= new JButtonMe();
		this.jButtonFK_IdEmpleadoResponsableFondo.setText("Buscar");
		this.jButtonFK_IdEmpleadoResponsableFondo.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoResponsableFondo,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoResponsableFondo = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoResponsableFondo.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoResponsableFondo.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoResponsableFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoResponsableFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoResponsableFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoResponsableFondo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoResponsableFondo= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoResponsableFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoResponsableFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoResponsableFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoResponsableFondo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoResponsableFondo= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoResponsableFondo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoResponsableFondo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoResponsableFondo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoResponsableFondo.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoResponsableFondo.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoResponsableFondo.setFocusable(false);


		this.jTabbedPaneBusquedasResponsableFondo=new JTabbedPane();


		this.jTabbedPaneBusquedasResponsableFondo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasResponsableFondo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasResponsableFondo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasResponsableFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasResponsableFondo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasResponsableFondo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleResponsableFondo = new ResponsableFondoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Responsable Fondo Rotativo DATOS");
			this.jInternalFrameDetalleFormResponsableFondo = new ResponsableFondoDetalleFormJInternalFrame(jDesktopPane,this.responsablefondoSessionBean.getConGuardarRelaciones(),this.responsablefondoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormResponsableFondo = null;//new ResponsableFondoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutResponsableFondo= new GridBagLayout();
		
		
		this.jTableDatosResponsableFondo = new JTableMe();      
		
		String sToolTipResponsableFondo="";
		sToolTipResponsableFondo=ResponsableFondoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipResponsableFondo+="(Contabilidad.ResponsableFondo)";
		}
		
		if(!this.responsablefondoSessionBean.getEsGuardarRelacionado()) {
			sToolTipResponsableFondo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosResponsableFondo.setToolTipText(sToolTipResponsableFondo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosResponsableFondo);
		this.jTableDatosResponsableFondo.setAutoCreateRowSorter(true);
		this.jTableDatosResponsableFondo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosResponsableFondo.setRowSelectionAllowed(true);
		this.jTableDatosResponsableFondo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosResponsableFondo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoResponsableFondo = new JButtonMe();
		this.jButtonDuplicarResponsableFondo = new JButtonMe();
		this.jButtonCopiarResponsableFondo = new JButtonMe();
		this.jButtonVerFormResponsableFondo = new JButtonMe();
		this.jButtonNuevoRelacionesResponsableFondo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaResponsableFondo = new JButtonMe();
		this.jButtonCerrarResponsableFondo = new JButtonMe();
		
		this.jScrollPanelDatosResponsableFondo = new JScrollPane();   
        this.jScrollPanelDatosGeneralResponsableFondo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesResponsableFondo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Responsable Fondo Rotativo";
		
		if(!this.responsablefondoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosResponsableFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Responsable Fondo Rotativos" + this.sPath));
		} else {
			this.jScrollPanelDatosResponsableFondo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralResponsableFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesResponsableFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesResponsableFondo.setToolTipText("Acciones");
        this.jPanelAccionesResponsableFondo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralResponsableFondo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosResponsableFondo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoResponsableFondo=new ReporteDinamicoJInternalFrame(ResponsableFondoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoResponsableFondo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionResponsableFondo=new ImportacionJInternalFrame(ResponsableFondoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionResponsableFondo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByResponsableFondo = new JButtonMe();
		
		this.jButtonAbrirOrderByResponsableFondo.setText("Orden");
		this.jButtonAbrirOrderByResponsableFondo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByResponsableFondo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByResponsableFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByResponsableFondo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByResponsableFondo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByResponsableFondo,false,this);
			
			//this.cargarOrderByResponsableFondo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByResponsableFondo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByResponsableFondo,true,this);
			
			//this.cargarOrderByResponsableFondo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosResponsableFondo.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosResponsableFondo.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosResponsableFondo.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosResponsableFondo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosResponsableFondo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosResponsableFondo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoResponsableFondo.setText("Nuevo");
		this.jButtonDuplicarResponsableFondo.setText("Duplicar");
		this.jButtonCopiarResponsableFondo.setText("Copiar");
		this.jButtonVerFormResponsableFondo.setText("Ver");
		this.jButtonNuevoRelacionesResponsableFondo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaResponsableFondo.setText("Guardar");
		this.jButtonCerrarResponsableFondo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoResponsableFondo,"nuevo_button","Nuevo",this.responsablefondoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarResponsableFondo,"duplicar_button","Duplicar",this.responsablefondoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarResponsableFondo,"copiar_button","Copiar",this.responsablefondoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormResponsableFondo,"ver_form","Ver",this.responsablefondoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesResponsableFondo,"nuevorelaciones_button","Nuevo Rel",this.responsablefondoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaResponsableFondo,"guardarcambiostabla_button","Guardar",this.responsablefondoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarResponsableFondo,"cerrar_button","Salir",this.responsablefondoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoResponsableFondo.setToolTipText("Nuevo"+" "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarResponsableFondo.setToolTipText("Duplicar"+" "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarResponsableFondo.setToolTipText("Copiar"+" "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormResponsableFondo.setToolTipText("Ver"+" "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesResponsableFondo.setToolTipText("Nuevo Rel"+" "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaResponsableFondo.setToolTipText("Guardar"+" "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarResponsableFondo.setToolTipText("Salir"+" "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoResponsableFondo";
		inputMap = this.jButtonNuevoResponsableFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoResponsableFondo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoResponsableFondo"));
		
		//DUPLICAR
		sMapKey = "DuplicarResponsableFondo";
		inputMap = this.jButtonDuplicarResponsableFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarResponsableFondo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarResponsableFondo"));
		
		//COPIAR
		sMapKey = "CopiarResponsableFondo";
		inputMap = this.jButtonCopiarResponsableFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarResponsableFondo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarResponsableFondo"));
		
		//VEr FORM
		sMapKey = "VerFormResponsableFondo";
		inputMap = this.jButtonVerFormResponsableFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormResponsableFondo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormResponsableFondo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesResponsableFondo";
		inputMap = this.jButtonNuevoRelacionesResponsableFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesResponsableFondo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesResponsableFondo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarResponsableFondo";
		inputMap = this.jButtonModificarResponsableFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarResponsableFondo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarResponsableFondo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarResponsableFondo";
		inputMap = this.jButtonCerrarResponsableFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarResponsableFondo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarResponsableFondo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaResponsableFondo";
		inputMap = this.jButtonGuardarCambiosTablaResponsableFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaResponsableFondo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaResponsableFondo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesResponsableFondo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesResponsableFondo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionResponsableFondo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ResponsableFondo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ResponsableFondo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ResponsableFondo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ResponsableFondo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ResponsableFondo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesResponsableFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesResponsableFondo.setName("jPanelParametrosReportesResponsableFondo"); 
		
		this.jPanelParametrosReportesAccionesResponsableFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesResponsableFondo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesResponsableFondo.setName("jPanelParametrosReportesAccionesResponsableFondo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesResponsableFondo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesResponsableFondo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionResponsableFondo = new JButtonMe();
		this.jButtonRecargarInformacionResponsableFondo.setText("Recargar");
		this.jButtonRecargarInformacionResponsableFondo.setToolTipText("Recargar"+" "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionResponsableFondo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionResponsableFondo = new JButtonMe();
		this.jButtonProcesarInformacionResponsableFondo.setText("Procesar");
		this.jButtonProcesarInformacionResponsableFondo.setToolTipText("Procesar"+" "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionResponsableFondo.setVisible(false);
			
		this.jButtonProcesarInformacionResponsableFondo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionResponsableFondo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionResponsableFondo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesResponsableFondo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesResponsableFondo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesResponsableFondo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesResponsableFondo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesResponsableFondo.setText("TIPO");       
		this.jComboBoxTiposReportesResponsableFondo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesResponsableFondo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesResponsableFondo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesResponsableFondo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionResponsableFondo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionResponsableFondo.setText("Paginacion");
		this.jComboBoxTiposPaginacionResponsableFondo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesResponsableFondo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesResponsableFondo.setText("Accion");
		this.jComboBoxTiposRelacionesResponsableFondo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesResponsableFondo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesResponsableFondo.setText("Accion");
		this.jComboBoxTiposAccionesResponsableFondo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarResponsableFondo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarResponsableFondo.setText("Accion");
		this.jComboBoxTiposSeleccionarResponsableFondo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralResponsableFondo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralResponsableFondo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralResponsableFondo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralResponsableFondo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesResponsableFondo = new JLabelMe();
		
		this.jLabelAccionesResponsableFondo.setText("Acciones");		
		this.jLabelAccionesResponsableFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesResponsableFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesResponsableFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosResponsableFondo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosResponsableFondo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosResponsableFondo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosResponsableFondo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosResponsableFondo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosResponsableFondo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaResponsableFondo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaResponsableFondo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaResponsableFondo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteResponsableFondo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteResponsableFondo.setText("Graf.");
		this.jCheckBoxConGraficoReporteResponsableFondo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresResponsableFondo = new JButtonMe();
		//this.jButtonAnterioresResponsableFondo.setText("<<");
        this.jButtonAnterioresResponsableFondo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresResponsableFondo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesResponsableFondo = new JButtonMe();
		//this.jButtonSiguientesResponsableFondo.setText(">>");
        this.jButtonSiguientesResponsableFondo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesResponsableFondo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosResponsableFondo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosResponsableFondo.setText("Nue");
        this.jButtonNuevoGuardarCambiosResponsableFondo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosResponsableFondo,"nuevoguardarcambios_button","Nue",this.responsablefondoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosResponsableFondo";
		inputMap = this.jButtonNuevoGuardarCambiosResponsableFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosResponsableFondo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosResponsableFondo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionResponsableFondo";
		inputMap = this.jButtonRecargarInformacionResponsableFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionResponsableFondo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionResponsableFondo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesResponsableFondo";
		inputMap = this.jButtonSiguientesResponsableFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesResponsableFondo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesResponsableFondo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresResponsableFondo";
		inputMap = this.jButtonAnterioresResponsableFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresResponsableFondo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresResponsableFondo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasResponsableFondo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesResponsableFondo.setMinimumSize(new Dimension(this.getWidth(),ResponsableFondoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ResponsableFondoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesResponsableFondo.setMaximumSize(new Dimension(this.getWidth(),ResponsableFondoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ResponsableFondoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesResponsableFondo.setPreferredSize(new Dimension(this.getWidth(),ResponsableFondoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ResponsableFondoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionResponsableFondo = new GridBagLayout();

			this.jPanelPaginacionResponsableFondo.setLayout(gridaBagLayoutPaginacionResponsableFondo);						
			
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsableFondo.gridy = 0;
			this.gridBagConstraintsResponsableFondo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionResponsableFondo.add(this.jButtonAnterioresResponsableFondo, this.gridBagConstraintsResponsableFondo);
					
						
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsResponsableFondo.gridy = 0;
			
			this.jPanelPaginacionResponsableFondo.add(this.jButtonNuevoGuardarCambiosResponsableFondo, this.gridBagConstraintsResponsableFondo);
						
			
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsResponsableFondo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsResponsableFondo.gridy = 0;
			this.jPanelPaginacionResponsableFondo.add(this.jButtonSiguientesResponsableFondo, this.gridBagConstraintsResponsableFondo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsableFondo.gridy = 1;
			this.gridBagConstraintsResponsableFondo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionResponsableFondo.add(this.jButtonNuevoResponsableFondo, this.gridBagConstraintsResponsableFondo);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
				this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsResponsableFondo.gridy = 1;
				this.gridBagConstraintsResponsableFondo.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionResponsableFondo.add(this.jButtonNuevoRelacionesResponsableFondo, this.gridBagConstraintsResponsableFondo);
			}
			
			
			if(!this.responsablefondoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
				this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsResponsableFondo.gridy = 1;
				this.gridBagConstraintsResponsableFondo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionResponsableFondo.add(this.jButtonGuardarCambiosTablaResponsableFondo, this.gridBagConstraintsResponsableFondo);
			}
			
			
			
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsableFondo.gridy = 1;
			this.gridBagConstraintsResponsableFondo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionResponsableFondo.add(this.jButtonDuplicarResponsableFondo, this.gridBagConstraintsResponsableFondo);
			
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsableFondo.gridy = 1;
			this.gridBagConstraintsResponsableFondo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionResponsableFondo.add(this.jButtonCopiarResponsableFondo, this.gridBagConstraintsResponsableFondo);
		
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsableFondo.gridy = 1;
			this.gridBagConstraintsResponsableFondo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionResponsableFondo.add(this.jButtonVerFormResponsableFondo, this.gridBagConstraintsResponsableFondo);
		
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsableFondo.gridy = 1;
			this.gridBagConstraintsResponsableFondo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionResponsableFondo.add(this.jButtonCerrarResponsableFondo, this.gridBagConstraintsResponsableFondo);
		
		
		
		this.jButtonRecargarInformacionResponsableFondo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionResponsableFondo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionResponsableFondo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesResponsableFondo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesResponsableFondo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesResponsableFondo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesResponsableFondo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesResponsableFondo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesResponsableFondo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesResponsableFondo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesResponsableFondo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesResponsableFondo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionResponsableFondo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionResponsableFondo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionResponsableFondo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesResponsableFondo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesResponsableFondo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesResponsableFondo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesResponsableFondo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesResponsableFondo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesResponsableFondo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarResponsableFondo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarResponsableFondo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarResponsableFondo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaResponsableFondo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaResponsableFondo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaResponsableFondo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteResponsableFondo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteResponsableFondo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteResponsableFondo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosResponsableFondo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosResponsableFondo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosResponsableFondo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosResponsableFondo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosResponsableFondo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosResponsableFondo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesResponsableFondo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesResponsableFondo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ResponsableFondo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ResponsableFondo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ResponsableFondo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ResponsableFondo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesResponsableFondo.setLayout(gridaBagParametrosReportesResponsableFondo);
			this.jPanelParametrosReportesAccionesResponsableFondo.setLayout(gridaBagParametrosReportesAccionesResponsableFondo);
			
			
			this.jPanelParametrosAuxiliar1ResponsableFondo.setLayout(gridaBagParametrosAuxiliar1ResponsableFondo);
			this.jPanelParametrosAuxiliar2ResponsableFondo.setLayout(gridaBagParametrosAuxiliar2ResponsableFondo);
			this.jPanelParametrosAuxiliar3ResponsableFondo.setLayout(gridaBagParametrosAuxiliar3ResponsableFondo);
			this.jPanelParametrosAuxiliar4ResponsableFondo.setLayout(gridaBagParametrosAuxiliar4ResponsableFondo);
			//this.jPanelParametrosAuxiliar5ResponsableFondo.setLayout(gridaBagParametrosAuxiliar2ResponsableFondo);			
			
			
			
			
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsableFondo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsResponsableFondo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesResponsableFondo.add(this.jButtonRecargarInformacionResponsableFondo, this.gridBagConstraintsResponsableFondo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsableFondo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsResponsableFondo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ResponsableFondo.add(this.jComboBoxTiposPaginacionResponsableFondo, this.gridBagConstraintsResponsableFondo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsableFondo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsResponsableFondo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ResponsableFondo.add(this.jCheckBoxConAltoMaximoTablaResponsableFondo, this.gridBagConstraintsResponsableFondo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsableFondo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsResponsableFondo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ResponsableFondo.add(this.jComboBoxTiposArchivosReportesResponsableFondo, this.gridBagConstraintsResponsableFondo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsableFondo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResponsableFondo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesResponsableFondo.add(this.jPanelParametrosAuxiliar1ResponsableFondo, this.gridBagConstraintsResponsableFondo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsableFondo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsResponsableFondo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ResponsableFondo.add(this.jComboBoxTiposReportesResponsableFondo, this.gridBagConstraintsResponsableFondo);																		
			
			
			
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsableFondo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsResponsableFondo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ResponsableFondo.add(this.jComboBoxTiposGraficosReportesResponsableFondo, this.gridBagConstraintsResponsableFondo);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsableFondo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResponsableFondo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesResponsableFondo.add(this.jPanelParametrosAuxiliar4ResponsableFondo, this.gridBagConstraintsResponsableFondo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsableFondo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsResponsableFondo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesResponsableFondo.add(this.jComboBoxTiposReportesResponsableFondo, this.gridBagConstraintsResponsableFondo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsableFondo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResponsableFondo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesResponsableFondo.add(this.jCheckBoxGenerarReporteResponsableFondo, this.gridBagConstraintsResponsableFondo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsableFondo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResponsableFondo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesResponsableFondo.add(this.jPanelParametrosAuxiliar2ResponsableFondo, this.gridBagConstraintsResponsableFondo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsableFondo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsResponsableFondo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesResponsableFondo.add(this.jLabelAccionesResponsableFondo, this.gridBagConstraintsResponsableFondo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
				this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsResponsableFondo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsResponsableFondo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesResponsableFondo.add(this.jButtonAbrirOrderByResponsableFondo, this.gridBagConstraintsResponsableFondo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsResponsableFondo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResponsableFondo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesResponsableFondo.add(this.jComboBoxTiposSeleccionarResponsableFondo, this.gridBagConstraintsResponsableFondo);			
			
			
			/*
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsableFondo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsResponsableFondo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesResponsableFondo.add(this.jCheckBoxSeleccionarTodosResponsableFondo, this.gridBagConstraintsResponsableFondo);
			
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsableFondo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsResponsableFondo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesResponsableFondo.add(this.jCheckBoxConGraficoReporteResponsableFondo, this.gridBagConstraintsResponsableFondo);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsableFondo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsResponsableFondo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ResponsableFondo.add(this.jCheckBoxSeleccionarTodosResponsableFondo, this.gridBagConstraintsResponsableFondo);															
				
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsableFondo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsResponsableFondo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ResponsableFondo.add(this.jCheckBoxSeleccionadosResponsableFondo, this.gridBagConstraintsResponsableFondo);															
			
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsableFondo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsResponsableFondo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ResponsableFondo.add(this.jCheckBoxConGraficoReporteResponsableFondo, this.gridBagConstraintsResponsableFondo);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsableFondo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResponsableFondo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesResponsableFondo.add(this.jPanelParametrosAuxiliar3ResponsableFondo, this.gridBagConstraintsResponsableFondo);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResponsableFondo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesResponsableFondo.add(this.jComboBoxTiposRelacionesResponsableFondo, this.gridBagConstraintsResponsableFondo);
				
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResponsableFondo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesResponsableFondo.add(this.jComboBoxTiposAccionesResponsableFondo, this.gridBagConstraintsResponsableFondo);
	
				
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResponsableFondo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesResponsableFondo.add(this.jTextFieldValorCampoGeneralResponsableFondo, this.gridBagConstraintsResponsableFondo);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosResponsableFondo = new GridBagLayout();

			this.jScrollPanelDatosResponsableFondo.setLayout(gridaBagLayoutDatosResponsableFondo);
			
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsableFondo.gridy = 0;
			this.gridBagConstraintsResponsableFondo.gridx = 0;
			
			this.jScrollPanelDatosResponsableFondo.add(this.jTableDatosResponsableFondo, this.gridBagConstraintsResponsableFondo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosResponsableFondo.setViewportView(this.jTableDatosResponsableFondo);
		this.jTableDatosResponsableFondo.setFillsViewportHeight(true);
		this.jTableDatosResponsableFondo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesResponsableFondo= new GridBagLayout();
		this.jPanelAccionesResponsableFondo.setLayout(gridaBagLayoutAccionesResponsableFondo);
		
		
		/*	
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsableFondo.gridy = 0;
		this.gridBagConstraintsResponsableFondo.gridx = 0;
			
		this.jPanelAccionesResponsableFondo.add(this.jButtonNuevoResponsableFondo, this.gridBagConstraintsResponsableFondo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEmpleadoResponsableFondo= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoResponsableFondo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoResponsableFondo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoResponsableFondo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoResponsableFondo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoResponsableFondo.setLayout(gridaBagLayoutFK_IdEmpleadoResponsableFondo);

		gridBagConstraintsResponsableFondo = new GridBagConstraints();
		gridBagConstraintsResponsableFondo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResponsableFondo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResponsableFondo.gridy = 0;
		gridBagConstraintsResponsableFondo.gridx = 0;
		jPanelFK_IdEmpleadoResponsableFondo.add(jLabelid_empleadoFK_IdEmpleadoResponsableFondo, gridBagConstraintsResponsableFondo);

		gridBagConstraintsResponsableFondo = new GridBagConstraints();
		gridBagConstraintsResponsableFondo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResponsableFondo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResponsableFondo.gridy = 0;
		gridBagConstraintsResponsableFondo.gridx = 1;
		jPanelFK_IdEmpleadoResponsableFondo.add(jComboBoxid_empleadoFK_IdEmpleadoResponsableFondo, gridBagConstraintsResponsableFondo);


		gridBagConstraintsResponsableFondo = new GridBagConstraints();
		gridBagConstraintsResponsableFondo.anchor = GridBagConstraints.EAST;
		gridBagConstraintsResponsableFondo.fill = GridBagConstraints.NONE;
		gridBagConstraintsResponsableFondo.gridy = 0;
		gridBagConstraintsResponsableFondo.gridx = 0;
		jPanelFK_IdEmpleadoResponsableFondo.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoResponsableFondo, gridBagConstraintsResponsableFondo);

		gridBagConstraintsResponsableFondo = new GridBagConstraints();
		gridBagConstraintsResponsableFondo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResponsableFondo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResponsableFondo.gridy = 1;
		gridBagConstraintsResponsableFondo.gridx =1;
		jPanelFK_IdEmpleadoResponsableFondo.add(jButtonFK_IdEmpleadoResponsableFondo, gridBagConstraintsResponsableFondo);

		jTabbedPaneBusquedasResponsableFondo.addTab("1.-Por Empleado ", jPanelFK_IdEmpleadoResponsableFondo);
		jTabbedPaneBusquedasResponsableFondo.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutResponsableFondo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutResponsableFondo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.responsablefondoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();						
			this.gridBagConstraintsResponsableFondo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsResponsableFondo.gridx = 0;		
			//this.gridBagConstraintsResponsableFondo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsableFondo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsResponsableFondo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarResponsableFondo, this.gridBagConstraintsResponsableFondo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsResponsableFondo.gridx = 0;		
		//this.gridBagConstraintsResponsableFondo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsableFondo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsResponsableFondo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsResponsableFondo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsResponsableFondo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsResponsableFondo.gridx = 0;		
			this.gridBagConstraintsResponsableFondo.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsableFondo.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsResponsableFondo.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasResponsableFondo, this.gridBagConstraintsResponsableFondo);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResponsableFondo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesResponsableFondo, this.gridBagConstraintsResponsableFondo);								
		
		
		/*
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResponsableFondo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesResponsableFondo, this.gridBagConstraintsResponsableFondo);
		*/		
		
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsResponsableFondo.gridx =0;
		this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsResponsableFondo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosResponsableFondo, this.gridBagConstraintsResponsableFondo);
				
		
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResponsableFondo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionResponsableFondo, this.gridBagConstraintsResponsableFondo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(ResponsableFondoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosResponsableFondo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosResponsableFondo = new GridBagLayout();
			this.jPanelBusquedasParametrosResponsableFondo.setLayout(gridaBagLayoutBusquedasParametrosResponsableFondo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralResponsableFondo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralResponsableFondo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralResponsableFondo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralResponsableFondo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResponsableFondo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposResponsableFondo, this.gridBagConstraintsResponsableFondo);
			
			
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResponsableFondo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosResponsableFondo, this.gridBagConstraintsResponsableFondo);
		
			
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsResponsableFondo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesResponsableFondo, this.gridBagConstraintsResponsableFondo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralResponsableFondo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoResponsableFondo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoResponsableFondo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoResponsableFondo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoResponsableFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoResponsableFondo.setName("jPanelReporteDinamicoResponsableFondo"); 
		
		this.jPanelReporteDinamicoResponsableFondo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoResponsableFondo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoResponsableFondo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoResponsableFondo.setLayout(gridaBagLayoutReporteDinamicoResponsableFondo);
		
		
		this.jInternalFrameReporteDinamicoResponsableFondo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoResponsableFondo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteResponsableFondo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoResponsableFondo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoResponsableFondo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoResponsableFondo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoResponsableFondo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoResponsableFondo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoResponsableFondo.setResizable(true);
	    this.jInternalFrameReporteDinamicoResponsableFondo.setClosable(true);
	    this.jInternalFrameReporteDinamicoResponsableFondo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoResponsableFondo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoResponsableFondo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoResponsableFondo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoResponsableFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Responsable Fondo Rotativos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteResponsableFondo = new JLabelMe();

		this.jLabelColumnasSelectReporteResponsableFondo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteResponsableFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteResponsableFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteResponsableFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableFondo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResponsableFondo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoResponsableFondo.add(this.jLabelColumnasSelectReporteResponsableFondo, this.gridBagConstraintsResponsableFondo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteResponsableFondo = new JList<Reporte>();
		this.jListColumnasSelectReporteResponsableFondo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteResponsableFondo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteResponsableFondo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteResponsableFondo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteResponsableFondo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteResponsableFondo=new JScrollPane(this.jListColumnasSelectReporteResponsableFondo);
			
			this.jScrollColumnasSelectReporteResponsableFondo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteResponsableFondo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteResponsableFondo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteResponsableFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableFondo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResponsableFondo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoResponsableFondo.add(this.jListColumnasSelectReporteResponsableFondo, this.gridBagConstraintsResponsableFondo);
		this.jPanelReporteDinamicoResponsableFondo.add(this.jScrollColumnasSelectReporteResponsableFondo, this.gridBagConstraintsResponsableFondo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteResponsableFondo = new JLabelMe();

		this.jLabelRelacionesSelectReporteResponsableFondo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteResponsableFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteResponsableFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteResponsableFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableFondo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResponsableFondo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoResponsableFondo.add(this.jLabelRelacionesSelectReporteResponsableFondo, this.gridBagConstraintsResponsableFondo);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteResponsableFondo = new JList<Reporte>();
		this.jListRelacionesSelectReporteResponsableFondo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteResponsableFondo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteResponsableFondo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteResponsableFondo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteResponsableFondo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteResponsableFondo=new JScrollPane(this.jListRelacionesSelectReporteResponsableFondo);
			
			this.jScrollRelacionesSelectReporteResponsableFondo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteResponsableFondo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteResponsableFondo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteResponsableFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableFondo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResponsableFondo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoResponsableFondo.add(this.jListRelacionesSelectReporteResponsableFondo, this.gridBagConstraintsResponsableFondo);
		this.jPanelReporteDinamicoResponsableFondo.add(this.jScrollRelacionesSelectReporteResponsableFondo, this.gridBagConstraintsResponsableFondo);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoResponsableFondo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoResponsableFondo = new JComboBoxMe();
		this.jListColumnasValoresGraficoResponsableFondo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoResponsableFondo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoResponsableFondo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoResponsableFondo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoResponsableFondo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoResponsableFondo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoResponsableFondo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoResponsableFondo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoResponsableFondo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoResponsableFondo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoResponsableFondo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoResponsableFondo = new JLabelMe();

		this.jLabelConGraficoDinamicoResponsableFondo.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoResponsableFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoResponsableFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoResponsableFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableFondo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResponsableFondo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoResponsableFondo.add(this.jLabelConGraficoDinamicoResponsableFondo, this.gridBagConstraintsResponsableFondo);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoResponsableFondo = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoResponsableFondo.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoResponsableFondo.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoResponsableFondo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoResponsableFondo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoResponsableFondo.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableFondo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResponsableFondo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoResponsableFondo.add(this.jCheckBoxConGraficoDinamicoResponsableFondo, this.gridBagConstraintsResponsableFondo);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoResponsableFondo = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoResponsableFondo.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoResponsableFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoResponsableFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoResponsableFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableFondo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResponsableFondo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoResponsableFondo.add(this.jLabelColumnaCategoriaGraficoResponsableFondo, this.gridBagConstraintsResponsableFondo);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoResponsableFondo = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoResponsableFondo.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoResponsableFondo.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoResponsableFondo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoResponsableFondo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoResponsableFondo.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableFondo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResponsableFondo.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoResponsableFondo.add(this.jComboBoxColumnaCategoriaGraficoResponsableFondo, this.gridBagConstraintsResponsableFondo);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorResponsableFondo = new JLabelMe();

		this.jLabelColumnaCategoriaValorResponsableFondo.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorResponsableFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorResponsableFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorResponsableFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableFondo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResponsableFondo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoResponsableFondo.add(this.jLabelColumnaCategoriaValorResponsableFondo, this.gridBagConstraintsResponsableFondo);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorResponsableFondo = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorResponsableFondo.setText("Accion");
        this.jComboBoxColumnaCategoriaValorResponsableFondo.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorResponsableFondo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorResponsableFondo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorResponsableFondo.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableFondo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResponsableFondo.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoResponsableFondo.add(this.jComboBoxColumnaCategoriaValorResponsableFondo, this.gridBagConstraintsResponsableFondo);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoResponsableFondo = new JLabelMe();

		this.jLabelColumnasValoresGraficoResponsableFondo.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoResponsableFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoResponsableFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoResponsableFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableFondo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResponsableFondo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoResponsableFondo.add(this.jLabelColumnasValoresGraficoResponsableFondo, this.gridBagConstraintsResponsableFondo);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoResponsableFondo = new JList<Reporte>();
		this.jListColumnasValoresGraficoResponsableFondo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoResponsableFondo.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoResponsableFondo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoResponsableFondo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoResponsableFondo.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoResponsableFondo=new JScrollPane(this.jListColumnasValoresGraficoResponsableFondo);
			
			this.jScrollColumnasValoresGraficoResponsableFondo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoResponsableFondo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoResponsableFondo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoResponsableFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableFondo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResponsableFondo.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoResponsableFondo.add(this.jListColumnasSelectReporteResponsableFondo, this.gridBagConstraintsResponsableFondo);
		this.jPanelReporteDinamicoResponsableFondo.add(this.jScrollColumnasValoresGraficoResponsableFondo, this.gridBagConstraintsResponsableFondo);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoResponsableFondo = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoResponsableFondo.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoResponsableFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoResponsableFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoResponsableFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableFondo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResponsableFondo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoResponsableFondo.add(this.jLabelTiposGraficosReportesDinamicoResponsableFondo, this.gridBagConstraintsResponsableFondo);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoResponsableFondo = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoResponsableFondo.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoResponsableFondo.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoResponsableFondo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoResponsableFondo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoResponsableFondo.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableFondo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResponsableFondo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoResponsableFondo.add(this.jComboBoxTiposGraficosReportesDinamicoResponsableFondo, this.gridBagConstraintsResponsableFondo);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoResponsableFondo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoResponsableFondo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoResponsableFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoResponsableFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoResponsableFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableFondo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResponsableFondo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoResponsableFondo.add(this.jLabelGenerarExcelReporteDinamicoResponsableFondo, this.gridBagConstraintsResponsableFondo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoResponsableFondo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoResponsableFondo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoResponsableFondo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoResponsableFondo.setToolTipText("Generar EXCEL"+" "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		//this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsResponsableFondo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsResponsableFondo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoResponsableFondo.add(this.jButtonGenerarExcelReporteDinamicoResponsableFondo, this.gridBagConstraintsResponsableFondo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsableFondo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsResponsableFondo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoResponsableFondo.add(this.jComboBoxTiposReportesDinamicoResponsableFondo, this.gridBagConstraintsResponsableFondo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoResponsableFondo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoResponsableFondo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoResponsableFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoResponsableFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoResponsableFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableFondo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResponsableFondo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoResponsableFondo.add(this.jLabelTiposArchivoReporteDinamicoResponsableFondo, this.gridBagConstraintsResponsableFondo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsableFondo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsResponsableFondo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoResponsableFondo.add(this.jComboBoxTiposArchivosReportesDinamicoResponsableFondo, this.gridBagConstraintsResponsableFondo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoResponsableFondo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoResponsableFondo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoResponsableFondo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoResponsableFondo.setToolTipText("Generar"+" "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsableFondo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsResponsableFondo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoResponsableFondo.add(this.jButtonGenerarReporteDinamicoResponsableFondo, this.gridBagConstraintsResponsableFondo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoResponsableFondo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoResponsableFondo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoResponsableFondo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoResponsableFondo.setToolTipText("Cancelar"+" "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsableFondo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsResponsableFondo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoResponsableFondo.add(this.jButtonCerrarReporteDinamicoResponsableFondo, this.gridBagConstraintsResponsableFondo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalResponsableFondo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoResponsableFondo= new JScrollPane(jPanelReporteDinamicoResponsableFondo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoResponsableFondo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoResponsableFondo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoResponsableFondo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoResponsableFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Responsable Fondo Rotativos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsResponsableFondo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoResponsableFondo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoResponsableFondo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalResponsableFondo);
		this.jInternalFrameReporteDinamicoResponsableFondo.getContentPane().add(this.jScrollPanelReporteDinamicoResponsableFondo, this.gridBagConstraintsResponsableFondo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionResponsableFondo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionResponsableFondo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionResponsableFondo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionResponsableFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionResponsableFondo.setName("jPanelImportacionResponsableFondo"); 
		
		this.jPanelImportacionResponsableFondo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionResponsableFondo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionResponsableFondo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionResponsableFondo.setLayout(gridaBagLayoutImportacionResponsableFondo);
		
		
		this.jInternalFrameImportacionResponsableFondo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionResponsableFondo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionResponsableFondo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteResponsableFondo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionResponsableFondo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionResponsableFondo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionResponsableFondo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionResponsableFondo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionResponsableFondo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionResponsableFondo.setResizable(true);
	    this.jInternalFrameImportacionResponsableFondo.setClosable(true);
	    this.jInternalFrameImportacionResponsableFondo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionResponsableFondo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionResponsableFondo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionResponsableFondo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionResponsableFondo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionResponsableFondo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionResponsableFondo.setResizable(true);
	    this.jInternalFrameImportacionResponsableFondo.setClosable(true);
	    this.jInternalFrameImportacionResponsableFondo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionResponsableFondo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionResponsableFondo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionResponsableFondo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionResponsableFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Responsable Fondo Rotativos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionResponsableFondo = new JLabelMe();

		this.jLabelArchivoImportacionResponsableFondo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionResponsableFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionResponsableFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionResponsableFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableFondo.gridy = iPosYImportacion;		
		this.gridBagConstraintsResponsableFondo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionResponsableFondo.add(this.jLabelArchivoImportacionResponsableFondo, this.gridBagConstraintsResponsableFondo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionResponsableFondo = new JFileChooser();		
		this.jFileChooserImportacionResponsableFondo.setToolTipText("ESCOGER ARCHIVO"+" "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionResponsableFondo = new JButtonMe();
		this.jButtonAbrirImportacionResponsableFondo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionResponsableFondo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionResponsableFondo.setToolTipText("Generar"+" "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsableFondo.gridy = iPosYImportacion;
		this.gridBagConstraintsResponsableFondo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionResponsableFondo.add(this.jButtonAbrirImportacionResponsableFondo, this.gridBagConstraintsResponsableFondo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionResponsableFondo = new JLabelMe();

		this.jLabelPathArchivoImportacionResponsableFondo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionResponsableFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionResponsableFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionResponsableFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableFondo.gridy = iPosYImportacion;		
		this.gridBagConstraintsResponsableFondo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionResponsableFondo.add(this.jLabelPathArchivoImportacionResponsableFondo, this.gridBagConstraintsResponsableFondo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionResponsableFondo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionResponsableFondo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionResponsableFondo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionResponsableFondo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsableFondo.gridy = iPosYImportacion;
		this.gridBagConstraintsResponsableFondo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionResponsableFondo.add(this.jTextFieldPathArchivoImportacionResponsableFondo, this.gridBagConstraintsResponsableFondo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionResponsableFondo = new JButtonMe();
		this.jButtonGenerarImportacionResponsableFondo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionResponsableFondo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionResponsableFondo.setToolTipText("Generar"+" "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsableFondo.gridy = iPosYImportacion;
		this.gridBagConstraintsResponsableFondo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionResponsableFondo.add(this.jButtonGenerarImportacionResponsableFondo, this.gridBagConstraintsResponsableFondo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionResponsableFondo = new JButtonMe();
		this.jButtonCerrarImportacionResponsableFondo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionResponsableFondo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionResponsableFondo.setToolTipText("Cancelar"+" "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsableFondo.gridy = iPosYImportacion;
		this.gridBagConstraintsResponsableFondo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionResponsableFondo.add(this.jButtonCerrarImportacionResponsableFondo, this.gridBagConstraintsResponsableFondo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalResponsableFondo = new GridBagLayout();
		
		this.jScrollPanelImportacionResponsableFondo= new JScrollPane(jPanelImportacionResponsableFondo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.gridy =iPosYImportacion;
		this.gridBagConstraintsResponsableFondo.gridx =iPosXImportacion;
		this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionResponsableFondo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionResponsableFondo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalResponsableFondo);
		this.jInternalFrameImportacionResponsableFondo.getContentPane().add(this.jScrollPanelImportacionResponsableFondo, this.gridBagConstraintsResponsableFondo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByResponsableFondo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByResponsableFondo = new JButtonMe();
			this.jButtonAbrirOrderByResponsableFondo.setText("Orden");
			this.jButtonAbrirOrderByResponsableFondo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByResponsableFondo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByResponsableFondo";
			inputMap = this.jButtonAbrirOrderByResponsableFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByResponsableFondo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByResponsableFondo"));
		
		
			GridBagLayout gridaBagLayoutOrderByResponsableFondo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByResponsableFondo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByResponsableFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByResponsableFondo.setName("jPanelOrderByResponsableFondo"); 
			
			this.jPanelOrderByResponsableFondo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByResponsableFondo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByResponsableFondo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByResponsableFondo.setLayout(gridaBagLayoutOrderByResponsableFondo);
			
			
			this.jTableDatosResponsableFondoOrderBy = new JTableMe();        
			this.jTableDatosResponsableFondoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosResponsableFondoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosResponsableFondoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosResponsableFondoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosResponsableFondoOrderBy.setViewportView(this.jTableDatosResponsableFondoOrderBy);
			this.jTableDatosResponsableFondoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosResponsableFondoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByResponsableFondo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByResponsableFondo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByResponsableFondo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteResponsableFondo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByResponsableFondo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByResponsableFondo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByResponsableFondo.setTitle("Orden");
			this.jInternalFrameOrderByResponsableFondo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByResponsableFondo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByResponsableFondo.setResizable(true);
			this.jInternalFrameOrderByResponsableFondo.setClosable(true);
			this.jInternalFrameOrderByResponsableFondo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByResponsableFondo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByResponsableFondo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByResponsableFondo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByResponsableFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Responsable Fondo Rotativos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsResponsableFondo.gridx =iPosXOrderBy;
			this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsResponsableFondo.ipady =150;
				
			this.jPanelOrderByResponsableFondo.add(jScrollPanelDatosResponsableFondoOrderBy, this.gridBagConstraintsResponsableFondo);//this.jTableDatosResponsableFondoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByResponsableFondo = new JButtonMe();
			this.jButtonCerrarOrderByResponsableFondo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByResponsableFondo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByResponsableFondo.setToolTipText("Cancelar"+" "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsableFondo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsResponsableFondo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByResponsableFondo.add(this.jButtonCerrarOrderByResponsableFondo, this.gridBagConstraintsResponsableFondo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalResponsableFondo = new GridBagLayout();
			
			this.jScrollPanelOrderByResponsableFondo= new JScrollPane(jPanelOrderByResponsableFondo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.gridy =iPosYOrderBy;
			this.gridBagConstraintsResponsableFondo.gridx =iPosXOrderBy;
			this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByResponsableFondo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByResponsableFondo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalResponsableFondo);
			
			this.jInternalFrameOrderByResponsableFondo.getContentPane().add(this.jScrollPanelOrderByResponsableFondo, this.gridBagConstraintsResponsableFondo);			
		
		} else {
			this.jButtonAbrirOrderByResponsableFondo = new JButtonMe();
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
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.responsablefondoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosResponsableFondo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosResponsableFondo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosResponsableFondo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosResponsableFondo.getRowHeight();//ResponsableFondoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.responsablefondoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ResponsableFondoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaResponsableFondo.isSelected()) {
					iHeightTable=ResponsableFondoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ResponsableFondoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ResponsableFondoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ResponsableFondoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaResponsableFondo.isSelected()) {
					iHeightTable=ResponsableFondoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ResponsableFondoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ResponsableFondoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosResponsableFondo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosResponsableFondo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosResponsableFondo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosResponsableFondo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosResponsableFondo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosResponsableFondo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByResponsableFondo!=null && this.jInternalFrameOrderByResponsableFondo.getjTableDatosOrderBy()!=null) {
			//if(!this.responsablefondoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByResponsableFondo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByResponsableFondo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByResponsableFondo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByResponsableFondo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByResponsableFondo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByResponsableFondo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByResponsableFondo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosResponsableFondo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosResponsableFondo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosResponsableFondo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=responsablefondoLogic.getResponsableFondos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=responsablefondos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ResponsableFondo> TraerResponsableFondoBeans(List<ResponsableFondo> responsablefondos,ArrayList<Classe> classes)throws Exception {
		try {
			for(ResponsableFondo responsablefondo:responsablefondos) {
					
				if(!(ResponsableFondoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ResponsableFondoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					responsablefondo.setsDetalleGeneralEntityReporte(ResponsableFondoConstantesFunciones.getResponsableFondoDescripcion(responsablefondo));
										
						
					
					

					if(responsablefondo.getFacturaProveedors()!=null && Funciones.existeClass(classes,FacturaProveedor.class)) {
						try{responsablefondo.setfacturaproveedorsDescripcionReporte(new JRBeanCollectionDataSource(FacturaProveedorJInternalFrame.TraerFacturaProveedorBeans(responsablefondo.getFacturaProveedors(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//responsablefondo.setsDetalleGeneralEntityReporte(responsablefondo.getsDetalleGeneralEntityReporte());
										
				}
				
				//responsablefondobeans.add(responsablefondobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return responsablefondos;
    }
	//PARA REPORTES FIN
}
