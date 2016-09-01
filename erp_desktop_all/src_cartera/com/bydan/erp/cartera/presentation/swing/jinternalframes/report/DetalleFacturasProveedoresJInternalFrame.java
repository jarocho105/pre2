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

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.cartera.util.report.DetalleFacturasProveedoresConstantesFunciones;

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
public class DetalleFacturasProveedoresJInternalFrame extends DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetalleFacturasProveedores;
	
	protected JMenuBar jmenuBarDetalleFacturasProveedores;
	
	protected JMenu jmenuDetalleFacturasProveedores;
	protected JMenu jmenuDatosDetalleFacturasProveedores;
	protected JMenu jmenuArchivoDetalleFacturasProveedores;
	protected JMenu jmenuAccionesDetalleFacturasProveedores;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleFacturasProveedores;	
	protected GridBagConstraints gridBagConstraintsDetalleFacturasProveedores;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleFacturasProveedoresDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleFacturasProveedores;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleFacturasProveedores;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleFacturasProveedores;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public DetalleFacturasProveedoresSessionBean detallefacturasproveedoresSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleFacturasProveedores> detallefacturasproveedoress;		
	public List<DetalleFacturasProveedores> detallefacturasproveedoressEliminados;	
	public List<DetalleFacturasProveedores> detallefacturasproveedoressAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleFacturasProveedores;		
	protected JButton jButtonAbrirOrderByDetalleFacturasProveedores;
	
	
	//protected JPanel jPanelOrderByDetalleFacturasProveedores;
	//public JScrollPane jScrollPanelOrderByDetalleFacturasProveedores;	
	//protected JButton jButtonCerrarOrderByDetalleFacturasProveedores;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetalleFacturasProveedoresLogic detallefacturasproveedoresLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleFacturasProveedores;
	public JScrollPane jScrollPanelDatosEdicionDetalleFacturasProveedores;
	public JScrollPane jScrollPanelDatosGeneralDetalleFacturasProveedores;
    
	
	
	//public JScrollPane jScrollPanelDatosDetalleFacturasProveedoresOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleFacturasProveedores;
	//public JScrollPane jScrollPanelImportacionDetalleFacturasProveedores;
	
	
	
	protected JPanel jPanelAccionesDetalleFacturasProveedores;
	
    protected JPanel jPanelPaginacionDetalleFacturasProveedores;
    protected JPanel jPanelParametrosReportesDetalleFacturasProveedores;
	protected JPanel jPanelParametrosReportesAccionesDetalleFacturasProveedores;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetalleFacturasProveedores;
	protected JPanel jPanelParametrosAuxiliar2DetalleFacturasProveedores;
	protected JPanel jPanelParametrosAuxiliar3DetalleFacturasProveedores;
	protected JPanel jPanelParametrosAuxiliar4DetalleFacturasProveedores;
	//protected JPanel jPanelParametrosAuxiliar5DetalleFacturasProveedores;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetalleFacturasProveedores;
	//protected JPanel jPanelImportacionDetalleFacturasProveedores;
	
	
	public JTable jTableDatosDetalleFacturasProveedores;
	
	
	
	//public JTable jTableDatosDetalleFacturasProveedoresOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleFacturasProveedores;
	protected JButton jButtonDuplicarDetalleFacturasProveedores;
	protected JButton jButtonCopiarDetalleFacturasProveedores;
	protected JButton jButtonVerFormDetalleFacturasProveedores;
	protected JButton jButtonNuevoRelacionesDetalleFacturasProveedores;
	protected JButton jButtonModificarDetalleFacturasProveedores;
	
    protected JButton jButtonGuardarCambiosTablaDetalleFacturasProveedores;
	protected JButton jButtonCerrarDetalleFacturasProveedores;
	
	
	protected JButton jButtonRecargarInformacionDetalleFacturasProveedores;
	protected JButton jButtonProcesarInformacionDetalleFacturasProveedores;
	
	
	protected JButton jButtonAnterioresDetalleFacturasProveedores;
	protected JButton jButtonSiguientesDetalleFacturasProveedores;
	protected JButton jButtonNuevoGuardarCambiosDetalleFacturasProveedores;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleFacturasProveedores;
	//protected JButton jButtonCerrarReporteDinamicoDetalleFacturasProveedores;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleFacturasProveedores;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleFacturasProveedores;
	//protected JButton jButtonGenerarImportacionDetalleFacturasProveedores;
	//protected JButton jButtonCerrarImportacionDetalleFacturasProveedores;
	//protected JFileChooser jFileChooserImportacionDetalleFacturasProveedores;
	//protected File fileImportacionDetalleFacturasProveedores;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleFacturasProveedores;
	protected JButton jButtonDuplicarToolBarDetalleFacturasProveedores;
	protected JButton jButtonNuevoRelacionesToolBarDetalleFacturasProveedores;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleFacturasProveedores;
	protected JButton jButtonCopiarToolBarDetalleFacturasProveedores;
	protected JButton jButtonVerFormToolBarDetalleFacturasProveedores;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleFacturasProveedores;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleFacturasProveedores;
	protected JButton jButtonCerrarToolBarDetalleFacturasProveedores;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleFacturasProveedores;
	protected JButton jButtonProcesarInformacionToolBarDetalleFacturasProveedores;
	protected JButton jButtonAnterioresToolBarDetalleFacturasProveedores;
	protected JButton jButtonSiguientesToolBarDetalleFacturasProveedores;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleFacturasProveedores;
	protected JButton jButtonAbrirOrderByToolBarDetalleFacturasProveedores;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleFacturasProveedores;
	protected JMenuItem jMenuItemDuplicarDetalleFacturasProveedores;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleFacturasProveedores;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleFacturasProveedores;
	protected JMenuItem jMenuItemCopiarDetalleFacturasProveedores;
	protected JMenuItem jMenuItemVerFormDetalleFacturasProveedores;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleFacturasProveedores;
	protected JMenuItem jMenuItemCerrarDetalleFacturasProveedores;
	protected JMenuItem jMenuItemDetalleCerrarDetalleFacturasProveedores;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleFacturasProveedores;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleFacturasProveedores;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleFacturasProveedores;
	protected JMenuItem jMenuItemProcesarInformacionDetalleFacturasProveedores;
	protected JMenuItem jMenuItemAnterioresDetalleFacturasProveedores;
	protected JMenuItem jMenuItemSiguientesDetalleFacturasProveedores;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleFacturasProveedores;
	protected JMenuItem jMenuItemAbrirOrderByDetalleFacturasProveedores;
	protected JMenuItem jMenuItemMostrarOcultarDetalleFacturasProveedores;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleFacturasProveedores;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleFacturasProveedores;
	protected JCheckBox jCheckBoxSeleccionadosDetalleFacturasProveedores;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleFacturasProveedores;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleFacturasProveedores;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleFacturasProveedores;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleFacturasProveedores;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleFacturasProveedores;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleFacturasProveedores;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleFacturasProveedores;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleFacturasProveedores;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleFacturasProveedores;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleFacturasProveedores;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleFacturasProveedores;
	protected JTextField jTextFieldValorCampoGeneralDetalleFacturasProveedores;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetalleFacturasProveedores;
	//public JList<Reporte> jListColumnasSelectReporteDetalleFacturasProveedores;
	//public JScrollPane jScrollColumnasSelectReporteDetalleFacturasProveedores;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleFacturasProveedores;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleFacturasProveedores;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleFacturasProveedores;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleFacturasProveedores;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleFacturasProveedores;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleFacturasProveedores;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleFacturasProveedores;
	
		
	//public JLabel jLabelArchivoImportacionDetalleFacturasProveedores;	
	//public JLabel jLabelPathArchivoImportacionDetalleFacturasProveedores;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleFacturasProveedores;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleFacturasProveedores;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleFacturasProveedores;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleFacturasProveedores;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleFacturasProveedores;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleFacturasProveedores;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleFacturasProveedores;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleFacturasProveedores;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleFacturasProveedores;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleFacturasProveedores;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetalleFacturasProveedores;
	public JPanel jPanelBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores;
	public JButton jButtonBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores;
	
	public JPanel jPanelIdIdBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores;
	public JLabel jLabelidBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores;
	public JTextFieldMe jLabelidDetalleFacturasProveedoresBusquedaDetalleFacturasProveedores;
	public JButton jButtonidBusquedaDetalleFacturasProveedoresDetalleFacturasProveedoresBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetalleFacturasProveedoresJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleFacturasProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleFacturasProveedoresJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleFacturasProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleFacturasProveedoresJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleFacturasProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleFacturasProveedoresJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleFacturasProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleFacturasProveedores)	{
		this.jButtonRecargarInformacionDetalleFacturasProveedores = jButtonRecargarInformacionDetalleFacturasProveedores;
	}
	
	public JButton getjButtonProcesarInformacionDetalleFacturasProveedores() {
		return this.jButtonProcesarInformacionDetalleFacturasProveedores;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleFacturasProveedores)	{
		this.jButtonProcesarInformacionDetalleFacturasProveedores = jButtonProcesarInformacionDetalleFacturasProveedores;
	}
	
	
	public JButton getjButtonRecargarInformacionDetalleFacturasProveedores() {
		return this.jButtonRecargarInformacionDetalleFacturasProveedores;
	}
	
	
	public List<DetalleFacturasProveedores> getdetallefacturasproveedoress() {
		return this.detallefacturasproveedoress;
	}

	public void setdetallefacturasproveedoress(List<DetalleFacturasProveedores> detallefacturasproveedoress) {
		this.detallefacturasproveedoress = detallefacturasproveedoress;
	}
	
	public List<DetalleFacturasProveedores> getdetallefacturasproveedoressAux() {
		return this.detallefacturasproveedoressAux;
	}

	public void setdetallefacturasproveedoressAux(List<DetalleFacturasProveedores> detallefacturasproveedoressAux) {
		this.detallefacturasproveedoressAux = detallefacturasproveedoressAux;
	}
	
	public List<DetalleFacturasProveedores> getdetallefacturasproveedoressEliminados() {
		return this.detallefacturasproveedoressEliminados;
	}

	public void setDetalleFacturasProveedoressEliminados(List<DetalleFacturasProveedores> detallefacturasproveedoressEliminados) {
		this.detallefacturasproveedoressEliminados = detallefacturasproveedoressEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleFacturasProveedores() {
		return jComboBoxTiposSeleccionarDetalleFacturasProveedores;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleFacturasProveedores(
			JComboBox jComboBoxTiposSeleccionarDetalleFacturasProveedores) {
		this.jComboBoxTiposSeleccionarDetalleFacturasProveedores = jComboBoxTiposSeleccionarDetalleFacturasProveedores;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleFacturasProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleFacturasProveedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleFacturasProveedores .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleFacturasProveedores() {
		return jTextFieldValorCampoGeneralDetalleFacturasProveedores;
	}

	public void setjTextFieldValorCampoGeneralDetalleFacturasProveedores(
			JTextField jTextFieldValorCampoGeneralDetalleFacturasProveedores) {
		this.jTextFieldValorCampoGeneralDetalleFacturasProveedores = jTextFieldValorCampoGeneralDetalleFacturasProveedores;
	}

	public void setBorderResaltarValorCampoGeneralDetalleFacturasProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFacturasProveedores.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleFacturasProveedores .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleFacturasProveedores() {
		return this.jCheckBoxSeleccionarTodosDetalleFacturasProveedores;
	}

	public void setjCheckBoxSeleccionarTodosDetalleFacturasProveedores(
			JCheckBox jCheckBoxSeleccionarTodosDetalleFacturasProveedores) {
		this.jCheckBoxSeleccionarTodosDetalleFacturasProveedores = jCheckBoxSeleccionarTodosDetalleFacturasProveedores;
	}

	public void setBorderResaltarSeleccionarTodosDetalleFacturasProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFacturasProveedores.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetalleFacturasProveedores .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleFacturasProveedores() {
		return this.jCheckBoxSeleccionadosDetalleFacturasProveedores;
	}

	public void setjCheckBoxSeleccionadosDetalleFacturasProveedores(
			JCheckBox jCheckBoxSeleccionadosDetalleFacturasProveedores) {
		this.jCheckBoxSeleccionadosDetalleFacturasProveedores = jCheckBoxSeleccionadosDetalleFacturasProveedores;
	}
	
	public void setBorderResaltarSeleccionadosDetalleFacturasProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFacturasProveedores.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetalleFacturasProveedores .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleFacturasProveedores() {
		return this.jComboBoxTiposArchivosReportesDetalleFacturasProveedores;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleFacturasProveedores(
			JComboBox jComboBoxTiposArchivosReportesDetalleFacturasProveedores) {
		this.jComboBoxTiposArchivosReportesDetalleFacturasProveedores = jComboBoxTiposArchivosReportesDetalleFacturasProveedores;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleFacturasProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFacturasProveedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleFacturasProveedores .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleFacturasProveedores() {
		return this.jComboBoxTiposReportesDetalleFacturasProveedores;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleFacturasProveedores(
			JComboBox jComboBoxTiposReportesDetalleFacturasProveedores) {
		this.jComboBoxTiposReportesDetalleFacturasProveedores = jComboBoxTiposReportesDetalleFacturasProveedores;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleFacturasProveedores() {
	//	return jComboBoxTiposReportesDinamicoDetalleFacturasProveedores;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleFacturasProveedores(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleFacturasProveedores) {
	//	this.jComboBoxTiposReportesDinamicoDetalleFacturasProveedores = jComboBoxTiposReportesDinamicoDetalleFacturasProveedores;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleFacturasProveedores() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleFacturasProveedores;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleFacturasProveedores(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleFacturasProveedores) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleFacturasProveedores = jComboBoxTiposArchivosReportesDinamicoDetalleFacturasProveedores;
	//}
	
	public void setBorderResaltarTiposReportesDetalleFacturasProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFacturasProveedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleFacturasProveedores .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleFacturasProveedores() {
		return this.jComboBoxTiposGraficosReportesDetalleFacturasProveedores;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleFacturasProveedores(
			JComboBox jComboBoxTiposGraficosReportesDetalleFacturasProveedores) {
		this.jComboBoxTiposGraficosReportesDetalleFacturasProveedores = jComboBoxTiposGraficosReportesDetalleFacturasProveedores;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleFacturasProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFacturasProveedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleFacturasProveedores .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleFacturasProveedores() {
		return this.jComboBoxTiposPaginacionDetalleFacturasProveedores;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleFacturasProveedores(
			JComboBox jComboBoxTiposPaginacionDetalleFacturasProveedores) {
		this.jComboBoxTiposPaginacionDetalleFacturasProveedores = jComboBoxTiposPaginacionDetalleFacturasProveedores;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleFacturasProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFacturasProveedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleFacturasProveedores .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleFacturasProveedores() {
		return this.jComboBoxTiposRelacionesDetalleFacturasProveedores;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleFacturasProveedores() {
		return this.jComboBoxTiposAccionesDetalleFacturasProveedores;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleFacturasProveedores(
			JComboBox jComboBoxTiposRelacionesDetalleFacturasProveedores) {
		this.jComboBoxTiposRelacionesDetalleFacturasProveedores = jComboBoxTiposRelacionesDetalleFacturasProveedores;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleFacturasProveedores(
			JComboBox jComboBoxTiposAccionesDetalleFacturasProveedores) {
		this.jComboBoxTiposAccionesDetalleFacturasProveedores = jComboBoxTiposAccionesDetalleFacturasProveedores;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleFacturasProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFacturasProveedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleFacturasProveedores .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleFacturasProveedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFacturasProveedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleFacturasProveedores .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleFacturasProveedores() {
	//	return jCheckBoxConGraficoDinamicoDetalleFacturasProveedores;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleFacturasProveedores(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleFacturasProveedores) {
	//	this.jCheckBoxConGraficoDinamicoDetalleFacturasProveedores = jCheckBoxConGraficoDinamicoDetalleFacturasProveedores;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleFacturasProveedores() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleFacturasProveedores.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleFacturasProveedores .setBorder(borderResaltar);		
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
		this.detallefacturasproveedoresSessionBean=new DetalleFacturasProveedoresSessionBean();
		
		this.detallefacturasproveedoresSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallefacturasproveedoresSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleFacturasProveedoresJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleFacturasProveedoresJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleFacturasProveedoresJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleFacturasProveedoresJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleFacturasProveedoresJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Facturas Proveedores MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleFacturasProveedoresJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleFacturasProveedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleFacturasProveedores= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleFacturasProveedores,this.jTtoolBarDetalleFacturasProveedores,
							"nuevo","nuevo","Nuevo"+" "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleFacturasProveedores,this.jTtoolBarDetalleFacturasProveedores,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleFacturasProveedores,this.jTtoolBarDetalleFacturasProveedores,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleFacturasProveedores,this.jTtoolBarDetalleFacturasProveedores,
							"duplicar","duplicar","Duplicar"+" "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleFacturasProveedores,this.jTtoolBarDetalleFacturasProveedores,
							"copiar","copiar","Copiar"+" "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleFacturasProveedores,this.jTtoolBarDetalleFacturasProveedores,
							"ver_form","ver_form","Ver"+" "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleFacturasProveedores,this.jTtoolBarDetalleFacturasProveedores,
							"recargar","recargar","Buscar"+" "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleFacturasProveedores,this.jTtoolBarDetalleFacturasProveedores,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleFacturasProveedores,this.jTtoolBarDetalleFacturasProveedores,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleFacturasProveedores,this.jTtoolBarDetalleFacturasProveedores,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleFacturasProveedores,this.jTtoolBarDetalleFacturasProveedores,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleFacturasProveedores,this.jTtoolBarDetalleFacturasProveedores,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleFacturasProveedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleFacturasProveedores,this.jTtoolBarDetalleFacturasProveedores,
							"cerrar","cerrar","Salir"+" "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleFacturasProveedores=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleFacturasProveedores;
			
				this.jButtonProcesarInformacionToolBarDetalleFacturasProveedores=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleFacturasProveedores;
				
		//protected JButton jButtonModificarToolBarDetalleFacturasProveedores;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetalleFacturasProveedores=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleFacturasProveedores=new JMenuMe("General");
		this.jmenuArchivoDetalleFacturasProveedores=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleFacturasProveedores=new JMenuMe("Acciones");
		this.jmenuDatosDetalleFacturasProveedores=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleFacturasProveedores= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleFacturasProveedores.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleFacturasProveedores,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleFacturasProveedores= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleFacturasProveedores.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleFacturasProveedores,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleFacturasProveedores= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleFacturasProveedores.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleFacturasProveedores,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleFacturasProveedores= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleFacturasProveedores.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleFacturasProveedores,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleFacturasProveedores= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleFacturasProveedores.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleFacturasProveedores,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleFacturasProveedores= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleFacturasProveedores.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleFacturasProveedores,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleFacturasProveedores= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleFacturasProveedores.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleFacturasProveedores,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleFacturasProveedores= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleFacturasProveedores.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleFacturasProveedores,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleFacturasProveedores= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleFacturasProveedores.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleFacturasProveedores,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleFacturasProveedores= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleFacturasProveedores.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleFacturasProveedores,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleFacturasProveedores= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleFacturasProveedores.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleFacturasProveedores,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleFacturasProveedores= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleFacturasProveedores.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleFacturasProveedores,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleFacturasProveedores= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleFacturasProveedores.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleFacturasProveedores,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleFacturasProveedores= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleFacturasProveedores.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleFacturasProveedores,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleFacturasProveedores= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleFacturasProveedores.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleFacturasProveedores,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleFacturasProveedores= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleFacturasProveedores.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleFacturasProveedores,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleFacturasProveedores= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleFacturasProveedores.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleFacturasProveedores,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleFacturasProveedores.add(this.jMenuItemCerrarDetalleFacturasProveedores);
			
			this.jmenuAccionesDetalleFacturasProveedores.add(this.jMenuItemNuevoDetalleFacturasProveedores);
			this.jmenuAccionesDetalleFacturasProveedores.add(this.jMenuItemNuevoGuardarCambiosDetalleFacturasProveedores);
			this.jmenuAccionesDetalleFacturasProveedores.add(this.jMenuItemNuevoRelacionesDetalleFacturasProveedores);
			this.jmenuAccionesDetalleFacturasProveedores.add(this.jMenuItemGuardarCambiosTablaDetalleFacturasProveedores);		
			this.jmenuAccionesDetalleFacturasProveedores.add(this.jMenuItemDuplicarDetalleFacturasProveedores);		
			this.jmenuAccionesDetalleFacturasProveedores.add(this.jMenuItemCopiarDetalleFacturasProveedores);		
			this.jmenuAccionesDetalleFacturasProveedores.add(this.jMenuItemVerFormDetalleFacturasProveedores);		
			
			this.jmenuDatosDetalleFacturasProveedores.add(this.jMenuItemRecargarInformacionDetalleFacturasProveedores);				
			this.jmenuDatosDetalleFacturasProveedores.add(this.jMenuItemAnterioresDetalleFacturasProveedores);				
			this.jmenuDatosDetalleFacturasProveedores.add(this.jMenuItemSiguientesDetalleFacturasProveedores);				
			this.jmenuDatosDetalleFacturasProveedores.add(this.jMenuItemAbrirOrderByDetalleFacturasProveedores);				
			this.jmenuDatosDetalleFacturasProveedores.add(this.jMenuItemMostrarOcultarDetalleFacturasProveedores);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleFacturasProveedores.add(this.jMenuItemGuardarCambiosDetalleFacturasProveedores);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleFacturasProveedores.add(this.jmenuArchivoDetalleFacturasProveedores);		
			this.jmenuBarDetalleFacturasProveedores.add(this.jmenuAccionesDetalleFacturasProveedores);		
			this.jmenuBarDetalleFacturasProveedores.add(this.jmenuDatosDetalleFacturasProveedores);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleFacturasProveedores);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetalleFacturasProveedores() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores.setToolTipText("Buscar Por  ");
		this.jButtonBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores= new JButtonMe();
		this.jButtonBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores.setText("Buscar");
		this.jButtonBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores.setToolTipText("Buscar Por  ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores,"buscar_button","Buscar Por  ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			jLabelidBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores = new JLabelMe();
		jLabelidBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores.setText("Id :");
		jLabelidBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-26),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-26),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-26),Constantes.ISWING_ALTO_CONTROL));

		FuncionesSwing.setBoldLabel(jLabelidBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores,STIPO_TAMANIO_GENERAL,false,true,this);

		jLabelidDetalleFacturasProveedoresBusquedaDetalleFacturasProveedores= new JTextFieldMe();
		jLabelidDetalleFacturasProveedoresBusquedaDetalleFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleFacturasProveedoresBusquedaDetalleFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleFacturasProveedoresBusquedaDetalleFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));


		//SE OCULTA CAMPO ID AUXILIAR PARA REPORTE
		jLabelidDetalleFacturasProveedoresBusquedaDetalleFacturasProveedores.setVisible(false);




		this.jTabbedPaneBusquedasDetalleFacturasProveedores=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleFacturasProveedores.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasDetalleFacturasProveedores.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasDetalleFacturasProveedores.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasDetalleFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleFacturasProveedores.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleFacturasProveedores,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleFacturasProveedores = new DetalleFacturasProveedoresDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Facturas Proveedores DATOS");
			this.jInternalFrameDetalleFormDetalleFacturasProveedores = new DetalleFacturasProveedoresDetalleFormJInternalFrame(jDesktopPane,this.detallefacturasproveedoresSessionBean.getConGuardarRelaciones(),this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleFacturasProveedores = null;//new DetalleFacturasProveedoresDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleFacturasProveedores= new GridBagLayout();
		
		
		this.jTableDatosDetalleFacturasProveedores = new JTableMe();      
		
		String sToolTipDetalleFacturasProveedores="";
		sToolTipDetalleFacturasProveedores=DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleFacturasProveedores+="(Cartera.DetalleFacturasProveedores)";
		}
		
		if(!this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleFacturasProveedores+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleFacturasProveedores.setToolTipText(sToolTipDetalleFacturasProveedores);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleFacturasProveedores);
		this.jTableDatosDetalleFacturasProveedores.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleFacturasProveedores.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleFacturasProveedores.setRowSelectionAllowed(true);
		this.jTableDatosDetalleFacturasProveedores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleFacturasProveedores,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetalleFacturasProveedores = new JButtonMe();
		this.jButtonDuplicarDetalleFacturasProveedores = new JButtonMe();
		this.jButtonCopiarDetalleFacturasProveedores = new JButtonMe();
		this.jButtonVerFormDetalleFacturasProveedores = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleFacturasProveedores = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleFacturasProveedores = new JButtonMe();
		this.jButtonCerrarDetalleFacturasProveedores = new JButtonMe();
		
		this.jScrollPanelDatosDetalleFacturasProveedores = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleFacturasProveedores = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetalleFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Facturas Proveedores";
		
		if(!this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Facturas Proveedoreses" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleFacturasProveedores.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetalleFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleFacturasProveedores.setToolTipText("Acciones");
        this.jPanelAccionesDetalleFacturasProveedores.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetalleFacturasProveedores=new ReporteDinamicoJInternalFrame(DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleFacturasProveedores();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleFacturasProveedores=new ImportacionJInternalFrame(DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleFacturasProveedores();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetalleFacturasProveedores = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleFacturasProveedores.setText("Orden");
		this.jButtonAbrirOrderByDetalleFacturasProveedores.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleFacturasProveedores,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleFacturasProveedores=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleFacturasProveedores,false,this);
			
			//this.cargarOrderByDetalleFacturasProveedores(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleFacturasProveedores=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleFacturasProveedores,true,this);
			
			//this.cargarOrderByDetalleFacturasProveedores(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleFacturasProveedores.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosDetalleFacturasProveedores.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosDetalleFacturasProveedores.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosDetalleFacturasProveedores.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleFacturasProveedores.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleFacturasProveedores.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleFacturasProveedores.setText("Nuevo");
		this.jButtonDuplicarDetalleFacturasProveedores.setText("Duplicar");
		this.jButtonCopiarDetalleFacturasProveedores.setText("Copiar");
		this.jButtonVerFormDetalleFacturasProveedores.setText("Ver");
		this.jButtonNuevoRelacionesDetalleFacturasProveedores.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleFacturasProveedores.setText("Guardar");
		this.jButtonCerrarDetalleFacturasProveedores.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleFacturasProveedores,"nuevo_button","Nuevo",this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleFacturasProveedores,"duplicar_button","Duplicar",this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleFacturasProveedores,"copiar_button","Copiar",this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleFacturasProveedores,"ver_form","Ver",this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleFacturasProveedores,"nuevorelaciones_button","Nuevo Rel",this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleFacturasProveedores,"guardarcambiostabla_button","Guardar",this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleFacturasProveedores,"cerrar_button","Salir",this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleFacturasProveedores.setToolTipText("Nuevo"+" "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleFacturasProveedores.setToolTipText("Duplicar"+" "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleFacturasProveedores.setToolTipText("Copiar"+" "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleFacturasProveedores.setToolTipText("Ver"+" "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleFacturasProveedores.setToolTipText("Nuevo Rel"+" "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleFacturasProveedores.setToolTipText("Guardar"+" "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleFacturasProveedores.setToolTipText("Salir"+" "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleFacturasProveedores";
		inputMap = this.jButtonNuevoDetalleFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleFacturasProveedores.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleFacturasProveedores"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleFacturasProveedores";
		inputMap = this.jButtonDuplicarDetalleFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleFacturasProveedores.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleFacturasProveedores"));
		
		//COPIAR
		sMapKey = "CopiarDetalleFacturasProveedores";
		inputMap = this.jButtonCopiarDetalleFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleFacturasProveedores.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleFacturasProveedores"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleFacturasProveedores";
		inputMap = this.jButtonVerFormDetalleFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleFacturasProveedores.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleFacturasProveedores"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleFacturasProveedores";
		inputMap = this.jButtonNuevoRelacionesDetalleFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleFacturasProveedores"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleFacturasProveedores";
		inputMap = this.jButtonModificarDetalleFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleFacturasProveedores"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleFacturasProveedores";
		inputMap = this.jButtonCerrarDetalleFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleFacturasProveedores"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleFacturasProveedores";
		inputMap = this.jButtonGuardarCambiosTablaDetalleFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleFacturasProveedores"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetalleFacturasProveedores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleFacturasProveedores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleFacturasProveedores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleFacturasProveedores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleFacturasProveedores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetalleFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleFacturasProveedores.setName("jPanelParametrosReportesDetalleFacturasProveedores"); 
		
		this.jPanelParametrosReportesAccionesDetalleFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleFacturasProveedores.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleFacturasProveedores.setName("jPanelParametrosReportesAccionesDetalleFacturasProveedores"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetalleFacturasProveedores = new JButtonMe();
		this.jButtonRecargarInformacionDetalleFacturasProveedores.setText("Buscar");
		this.jButtonRecargarInformacionDetalleFacturasProveedores.setToolTipText("Buscar"+" "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleFacturasProveedores,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionDetalleFacturasProveedores.setVisible(false);
		
		
		this.jButtonProcesarInformacionDetalleFacturasProveedores = new JButtonMe();
		this.jButtonProcesarInformacionDetalleFacturasProveedores.setText("Procesar");
		this.jButtonProcesarInformacionDetalleFacturasProveedores.setToolTipText("Procesar"+" "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleFacturasProveedores.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleFacturasProveedores.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleFacturasProveedores.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleFacturasProveedores.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetalleFacturasProveedores = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleFacturasProveedores.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleFacturasProveedores.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleFacturasProveedores = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleFacturasProveedores.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleFacturasProveedores.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleFacturasProveedores = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleFacturasProveedores.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleFacturasProveedores.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleFacturasProveedores = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleFacturasProveedores.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleFacturasProveedores.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleFacturasProveedores = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleFacturasProveedores.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleFacturasProveedores.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleFacturasProveedores = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleFacturasProveedores.setText("Accion");
		this.jComboBoxTiposAccionesDetalleFacturasProveedores.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleFacturasProveedores = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleFacturasProveedores.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleFacturasProveedores.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleFacturasProveedores=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleFacturasProveedores.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleFacturasProveedores.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleFacturasProveedores.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetalleFacturasProveedores = new JLabelMe();
		
		this.jLabelAccionesDetalleFacturasProveedores.setText("Acciones");		
		this.jLabelAccionesDetalleFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleFacturasProveedores = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleFacturasProveedores.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleFacturasProveedores.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleFacturasProveedores = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleFacturasProveedores.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleFacturasProveedores.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetalleFacturasProveedores = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleFacturasProveedores.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleFacturasProveedores.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleFacturasProveedores = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleFacturasProveedores.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleFacturasProveedores.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetalleFacturasProveedores = new JButtonMe();
		//this.jButtonAnterioresDetalleFacturasProveedores.setText("<<");
        this.jButtonAnterioresDetalleFacturasProveedores.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleFacturasProveedores,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleFacturasProveedores = new JButtonMe();
		//this.jButtonSiguientesDetalleFacturasProveedores.setText(">>");
        this.jButtonSiguientesDetalleFacturasProveedores.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleFacturasProveedores,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleFacturasProveedores = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleFacturasProveedores.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleFacturasProveedores.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleFacturasProveedores,"nuevoguardarcambios_button","Nue",this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleFacturasProveedores";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleFacturasProveedores"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetalleFacturasProveedores";
		inputMap = this.jButtonRecargarInformacionDetalleFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleFacturasProveedores"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleFacturasProveedores";
		inputMap = this.jButtonSiguientesDetalleFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleFacturasProveedores"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleFacturasProveedores";
		inputMap = this.jButtonAnterioresDetalleFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleFacturasProveedores"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetalleFacturasProveedores();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleFacturasProveedores.setMinimumSize(new Dimension(this.getWidth(),DetalleFacturasProveedoresBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleFacturasProveedoresBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleFacturasProveedores.setMaximumSize(new Dimension(this.getWidth(),DetalleFacturasProveedoresBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleFacturasProveedoresBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleFacturasProveedores.setPreferredSize(new Dimension(this.getWidth(),DetalleFacturasProveedoresBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleFacturasProveedoresBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleFacturasProveedores = new GridBagLayout();

			this.jPanelPaginacionDetalleFacturasProveedores.setLayout(gridaBagLayoutPaginacionDetalleFacturasProveedores);						
			
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturasProveedores.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturasProveedores.gridy = 0;
			this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleFacturasProveedores.add(this.jButtonAnterioresDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
					
						
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleFacturasProveedores.gridy = 0;
			
			this.jPanelPaginacionDetalleFacturasProveedores.add(this.jButtonNuevoGuardarCambiosDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
						
			
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturasProveedores.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleFacturasProveedores.gridy = 0;
			this.jPanelPaginacionDetalleFacturasProveedores.add(this.jButtonSiguientesDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturasProveedores.gridy = 1;
			this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleFacturasProveedores.add(this.jButtonNuevoDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
						
			
			
			if(!this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
				this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleFacturasProveedores.gridy = 1;
				this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleFacturasProveedores.add(this.jButtonGuardarCambiosTablaDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
			}
			
			
			
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturasProveedores.gridy = 1;
			this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleFacturasProveedores.add(this.jButtonDuplicarDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
			
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturasProveedores.gridy = 1;
			this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleFacturasProveedores.add(this.jButtonCopiarDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
		
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturasProveedores.gridy = 1;
			this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleFacturasProveedores.add(this.jButtonVerFormDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
		
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturasProveedores.gridy = 1;
			this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleFacturasProveedores.add(this.jButtonCerrarDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
		
		
		
		this.jButtonRecargarInformacionDetalleFacturasProveedores.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleFacturasProveedores.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleFacturasProveedores.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetalleFacturasProveedores.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleFacturasProveedores.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleFacturasProveedores.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleFacturasProveedores.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleFacturasProveedores.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleFacturasProveedores.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleFacturasProveedores.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleFacturasProveedores.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleFacturasProveedores.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleFacturasProveedores.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleFacturasProveedores.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleFacturasProveedores.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleFacturasProveedores.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleFacturasProveedores.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleFacturasProveedores.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleFacturasProveedores.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleFacturasProveedores.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleFacturasProveedores.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleFacturasProveedores.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleFacturasProveedores.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleFacturasProveedores.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleFacturasProveedores.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleFacturasProveedores.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleFacturasProveedores.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleFacturasProveedores.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleFacturasProveedores.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleFacturasProveedores.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetalleFacturasProveedores.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleFacturasProveedores.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleFacturasProveedores.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleFacturasProveedores.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleFacturasProveedores.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleFacturasProveedores.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleFacturasProveedores = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleFacturasProveedores = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleFacturasProveedores = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleFacturasProveedores = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleFacturasProveedores = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleFacturasProveedores = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleFacturasProveedores.setLayout(gridaBagParametrosReportesDetalleFacturasProveedores);
			this.jPanelParametrosReportesAccionesDetalleFacturasProveedores.setLayout(gridaBagParametrosReportesAccionesDetalleFacturasProveedores);
			
			
			this.jPanelParametrosAuxiliar1DetalleFacturasProveedores.setLayout(gridaBagParametrosAuxiliar1DetalleFacturasProveedores);
			this.jPanelParametrosAuxiliar2DetalleFacturasProveedores.setLayout(gridaBagParametrosAuxiliar2DetalleFacturasProveedores);
			this.jPanelParametrosAuxiliar3DetalleFacturasProveedores.setLayout(gridaBagParametrosAuxiliar3DetalleFacturasProveedores);
			this.jPanelParametrosAuxiliar4DetalleFacturasProveedores.setLayout(gridaBagParametrosAuxiliar4DetalleFacturasProveedores);
			//this.jPanelParametrosAuxiliar5DetalleFacturasProveedores.setLayout(gridaBagParametrosAuxiliar2DetalleFacturasProveedores);			
			
			
			
			
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturasProveedores.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFacturasProveedores.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleFacturasProveedores.add(this.jButtonRecargarInformacionDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturasProveedores.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFacturasProveedores.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleFacturasProveedores.add(this.jComboBoxTiposPaginacionDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturasProveedores.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFacturasProveedores.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleFacturasProveedores.add(this.jCheckBoxConAltoMaximoTablaDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturasProveedores.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFacturasProveedores.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleFacturasProveedores.add(this.jComboBoxTiposArchivosReportesDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturasProveedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFacturasProveedores.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleFacturasProveedores.add(this.jPanelParametrosAuxiliar1DetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturasProveedores.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFacturasProveedores.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleFacturasProveedores.add(this.jComboBoxTiposReportesDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);																		
			
			
			
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturasProveedores.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFacturasProveedores.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetalleFacturasProveedores.add(this.jComboBoxTiposGraficosReportesDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturasProveedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFacturasProveedores.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleFacturasProveedores.add(this.jPanelParametrosAuxiliar4DetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturasProveedores.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFacturasProveedores.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleFacturasProveedores.add(this.jComboBoxTiposReportesDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturasProveedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFacturasProveedores.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleFacturasProveedores.add(this.jCheckBoxGenerarReporteDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturasProveedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFacturasProveedores.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleFacturasProveedores.add(this.jPanelParametrosAuxiliar2DetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturasProveedores.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFacturasProveedores.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleFacturasProveedores.add(this.jLabelAccionesDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
				this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleFacturasProveedores.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleFacturasProveedores.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleFacturasProveedores.add(this.jButtonAbrirOrderByDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleFacturasProveedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFacturasProveedores.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleFacturasProveedores.add(this.jComboBoxTiposSeleccionarDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);			
			
			
			/*
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturasProveedores.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFacturasProveedores.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleFacturasProveedores.add(this.jCheckBoxSeleccionarTodosDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
			
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturasProveedores.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFacturasProveedores.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleFacturasProveedores.add(this.jCheckBoxConGraficoReporteDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturasProveedores.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFacturasProveedores.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleFacturasProveedores.add(this.jCheckBoxSeleccionarTodosDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);															
				
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturasProveedores.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFacturasProveedores.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleFacturasProveedores.add(this.jCheckBoxSeleccionadosDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);															
			
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturasProveedores.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFacturasProveedores.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleFacturasProveedores.add(this.jCheckBoxConGraficoReporteDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturasProveedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFacturasProveedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFacturasProveedores.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleFacturasProveedores.add(this.jPanelParametrosAuxiliar3DetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturasProveedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFacturasProveedores.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleFacturasProveedores.add(this.jComboBoxTiposAccionesDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleFacturasProveedores = new GridBagLayout();

			this.jScrollPanelDatosDetalleFacturasProveedores.setLayout(gridaBagLayoutDatosDetalleFacturasProveedores);
			
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturasProveedores.gridy = 0;
			this.gridBagConstraintsDetalleFacturasProveedores.gridx = 0;
			
			this.jScrollPanelDatosDetalleFacturasProveedores.add(this.jTableDatosDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleFacturasProveedores.setViewportView(this.jTableDatosDetalleFacturasProveedores);
		this.jTableDatosDetalleFacturasProveedores.setFillsViewportHeight(true);
		this.jTableDatosDetalleFacturasProveedores.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleFacturasProveedores= new GridBagLayout();
		this.jPanelAccionesDetalleFacturasProveedores.setLayout(gridaBagLayoutAccionesDetalleFacturasProveedores);
		
		
		/*	
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = 0;
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = 0;
			
		this.jPanelAccionesDetalleFacturasProveedores.add(this.jButtonNuevoDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores= new GridBagLayout();
		gridaBagLayoutBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores.setLayout(gridaBagLayoutBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores);

		gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		gridBagConstraintsDetalleFacturasProveedores.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturasProveedores.gridy = 0;
		gridBagConstraintsDetalleFacturasProveedores.gridx = 0;
		jPanelBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores.add(jLabelidBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores, gridBagConstraintsDetalleFacturasProveedores);

		gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		gridBagConstraintsDetalleFacturasProveedores.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturasProveedores.gridy = 0;
		gridBagConstraintsDetalleFacturasProveedores.gridx = 1;
		jPanelBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores.add(jLabelidDetalleFacturasProveedoresBusquedaDetalleFacturasProveedores, gridBagConstraintsDetalleFacturasProveedores);

		gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		gridBagConstraintsDetalleFacturasProveedores.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFacturasProveedores.gridy = 1;
		gridBagConstraintsDetalleFacturasProveedores.gridx =1;
		jPanelBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores.add(jButtonBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores, gridBagConstraintsDetalleFacturasProveedores);

		jTabbedPaneBusquedasDetalleFacturasProveedores.addTab("1.-Por  ", jPanelBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores);
		jTabbedPaneBusquedasDetalleFacturasProveedores.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleFacturasProveedores = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleFacturasProveedores);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();						
			this.gridBagConstraintsDetalleFacturasProveedores.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleFacturasProveedores.gridx = 0;		
			//this.gridBagConstraintsDetalleFacturasProveedores.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturasProveedores.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleFacturasProveedores.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = 0;		
		//this.gridBagConstraintsDetalleFacturasProveedores.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFacturasProveedores.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleFacturasProveedores.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleFacturasProveedores);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleFacturasProveedores.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleFacturasProveedores.gridx = 0;		
			this.gridBagConstraintsDetalleFacturasProveedores.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturasProveedores.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleFacturasProveedores.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);								
		
		
		/*
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
		*/		
		
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleFacturasProveedores.gridx =0;
		this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleFacturasProveedores.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
				
		
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetalleFacturasProveedoresJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleFacturasProveedores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleFacturasProveedores = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleFacturasProveedores.setLayout(gridaBagLayoutBusquedasParametrosDetalleFacturasProveedores);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleFacturasProveedores=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleFacturasProveedores.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleFacturasProveedores.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleFacturasProveedores.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
			
			
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
		
			
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFacturasProveedores.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleFacturasProveedores;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleFacturasProveedores() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleFacturasProveedores = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleFacturasProveedores.setName("jPanelReporteDinamicoDetalleFacturasProveedores"); 
		
		this.jPanelReporteDinamicoDetalleFacturasProveedores.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleFacturasProveedores.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleFacturasProveedores.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleFacturasProveedores.setLayout(gridaBagLayoutReporteDinamicoDetalleFacturasProveedores);
		
		
		this.jInternalFrameReporteDinamicoDetalleFacturasProveedores= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleFacturasProveedores = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleFacturasProveedores= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleFacturasProveedores.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleFacturasProveedores.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleFacturasProveedores.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Facturas Proveedoreses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleFacturasProveedores = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleFacturasProveedores.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleFacturasProveedores.add(this.jLabelColumnasSelectReporteDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleFacturasProveedores = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleFacturasProveedores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleFacturasProveedores.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleFacturasProveedores.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleFacturasProveedores.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleFacturasProveedores.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleFacturasProveedores=new JScrollPane(this.jListColumnasSelectReporteDetalleFacturasProveedores);
			
			this.jScrollColumnasSelectReporteDetalleFacturasProveedores.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleFacturasProveedores.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleFacturasProveedores.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleFacturasProveedores.add(this.jListColumnasSelectReporteDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
		this.jPanelReporteDinamicoDetalleFacturasProveedores.add(this.jScrollColumnasSelectReporteDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleFacturasProveedores = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleFacturasProveedores.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleFacturasProveedores = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleFacturasProveedores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleFacturasProveedores.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleFacturasProveedores.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleFacturasProveedores.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleFacturasProveedores.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleFacturasProveedores=new JScrollPane(this.jListRelacionesSelectReporteDetalleFacturasProveedores);
			
			this.jScrollRelacionesSelectReporteDetalleFacturasProveedores.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleFacturasProveedores.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleFacturasProveedores.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetalleFacturasProveedores = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleFacturasProveedores = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleFacturasProveedores = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleFacturasProveedores = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleFacturasProveedores.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleFacturasProveedores.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleFacturasProveedores.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleFacturasProveedores.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleFacturasProveedores = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleFacturasProveedores.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleFacturasProveedores.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleFacturasProveedores.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleFacturasProveedores.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetalleFacturasProveedores = new JLabelMe();

		this.jLabelConGraficoDinamicoDetalleFacturasProveedores.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetalleFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleFacturasProveedores.add(this.jLabelConGraficoDinamicoDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetalleFacturasProveedores = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetalleFacturasProveedores.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetalleFacturasProveedores.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetalleFacturasProveedores.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleFacturasProveedores.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleFacturasProveedores.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleFacturasProveedores.add(this.jCheckBoxConGraficoDinamicoDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetalleFacturasProveedores = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetalleFacturasProveedores.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetalleFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleFacturasProveedores.add(this.jLabelColumnaCategoriaGraficoDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetalleFacturasProveedores = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleFacturasProveedores.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetalleFacturasProveedores.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetalleFacturasProveedores.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleFacturasProveedores.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleFacturasProveedores.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetalleFacturasProveedores.add(this.jComboBoxColumnaCategoriaGraficoDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetalleFacturasProveedores = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetalleFacturasProveedores.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetalleFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleFacturasProveedores.add(this.jLabelColumnaCategoriaValorDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetalleFacturasProveedores = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetalleFacturasProveedores.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetalleFacturasProveedores.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetalleFacturasProveedores.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleFacturasProveedores.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleFacturasProveedores.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetalleFacturasProveedores.add(this.jComboBoxColumnaCategoriaValorDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetalleFacturasProveedores = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetalleFacturasProveedores.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetalleFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleFacturasProveedores.add(this.jLabelColumnasValoresGraficoDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetalleFacturasProveedores = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetalleFacturasProveedores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetalleFacturasProveedores.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetalleFacturasProveedores.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleFacturasProveedores.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleFacturasProveedores.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetalleFacturasProveedores=new JScrollPane(this.jListColumnasValoresGraficoDetalleFacturasProveedores);
			
			this.jScrollColumnasValoresGraficoDetalleFacturasProveedores.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleFacturasProveedores.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleFacturasProveedores.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetalleFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetalleFacturasProveedores.add(this.jListColumnasSelectReporteDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
		this.jPanelReporteDinamicoDetalleFacturasProveedores.add(this.jScrollColumnasValoresGraficoDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetalleFacturasProveedores = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetalleFacturasProveedores.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetalleFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleFacturasProveedores.add(this.jLabelTiposGraficosReportesDinamicoDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetalleFacturasProveedores = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleFacturasProveedores.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetalleFacturasProveedores.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetalleFacturasProveedores.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleFacturasProveedores.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleFacturasProveedores.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleFacturasProveedores.add(this.jComboBoxTiposGraficosReportesDinamicoDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleFacturasProveedores = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleFacturasProveedores.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleFacturasProveedores.add(this.jLabelGenerarExcelReporteDinamicoDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleFacturasProveedores = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleFacturasProveedores.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleFacturasProveedores,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleFacturasProveedores.setToolTipText("Generar EXCEL"+" "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleFacturasProveedores.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleFacturasProveedores.add(this.jButtonGenerarExcelReporteDinamicoDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleFacturasProveedores.add(this.jComboBoxTiposReportesDinamicoDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleFacturasProveedores = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleFacturasProveedores.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleFacturasProveedores.add(this.jLabelTiposArchivoReporteDinamicoDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleFacturasProveedores.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleFacturasProveedores = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleFacturasProveedores.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleFacturasProveedores,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleFacturasProveedores.setToolTipText("Generar"+" "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleFacturasProveedores.add(this.jButtonGenerarReporteDinamicoDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleFacturasProveedores = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleFacturasProveedores.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleFacturasProveedores,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleFacturasProveedores.setToolTipText("Cancelar"+" "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleFacturasProveedores.add(this.jButtonCerrarReporteDinamicoDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleFacturasProveedores = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleFacturasProveedores= new JScrollPane(jPanelReporteDinamicoDetalleFacturasProveedores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleFacturasProveedores.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleFacturasProveedores.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleFacturasProveedores.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Facturas Proveedoreses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleFacturasProveedores.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleFacturasProveedores);
		this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleFacturasProveedores() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleFacturasProveedores = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleFacturasProveedores.setName("jPanelImportacionDetalleFacturasProveedores"); 
		
		this.jPanelImportacionDetalleFacturasProveedores.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleFacturasProveedores.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleFacturasProveedores.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleFacturasProveedores.setLayout(gridaBagLayoutImportacionDetalleFacturasProveedores);
		
		
		this.jInternalFrameImportacionDetalleFacturasProveedores= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleFacturasProveedores= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleFacturasProveedores = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleFacturasProveedores= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleFacturasProveedores.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleFacturasProveedores.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleFacturasProveedores.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleFacturasProveedores.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleFacturasProveedores.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleFacturasProveedores.setResizable(true);
	    this.jInternalFrameImportacionDetalleFacturasProveedores.setClosable(true);
	    this.jInternalFrameImportacionDetalleFacturasProveedores.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleFacturasProveedores.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleFacturasProveedores.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleFacturasProveedores.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleFacturasProveedores.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleFacturasProveedores.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleFacturasProveedores.setResizable(true);
	    this.jInternalFrameImportacionDetalleFacturasProveedores.setClosable(true);
	    this.jInternalFrameImportacionDetalleFacturasProveedores.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleFacturasProveedores.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleFacturasProveedores.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleFacturasProveedores.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Facturas Proveedoreses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleFacturasProveedores = new JLabelMe();

		this.jLabelArchivoImportacionDetalleFacturasProveedores.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleFacturasProveedores.add(this.jLabelArchivoImportacionDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleFacturasProveedores = new JFileChooser();		
		this.jFileChooserImportacionDetalleFacturasProveedores.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleFacturasProveedores = new JButtonMe();
		this.jButtonAbrirImportacionDetalleFacturasProveedores.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleFacturasProveedores,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleFacturasProveedores.setToolTipText("Generar"+" "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleFacturasProveedores.add(this.jButtonAbrirImportacionDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleFacturasProveedores = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleFacturasProveedores.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleFacturasProveedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleFacturasProveedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleFacturasProveedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleFacturasProveedores.add(this.jLabelPathArchivoImportacionDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleFacturasProveedores=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleFacturasProveedores.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleFacturasProveedores.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleFacturasProveedores.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleFacturasProveedores.add(this.jTextFieldPathArchivoImportacionDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleFacturasProveedores = new JButtonMe();
		this.jButtonGenerarImportacionDetalleFacturasProveedores.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleFacturasProveedores,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleFacturasProveedores.setToolTipText("Generar"+" "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleFacturasProveedores.add(this.jButtonGenerarImportacionDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleFacturasProveedores = new JButtonMe();
		this.jButtonCerrarImportacionDetalleFacturasProveedores.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleFacturasProveedores,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleFacturasProveedores.setToolTipText("Cancelar"+" "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFacturasProveedores.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleFacturasProveedores.add(this.jButtonCerrarImportacionDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleFacturasProveedores = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleFacturasProveedores= new JScrollPane(jPanelImportacionDetalleFacturasProveedores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturasProveedores.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleFacturasProveedores.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleFacturasProveedores.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleFacturasProveedores.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleFacturasProveedores);
		this.jInternalFrameImportacionDetalleFacturasProveedores.getContentPane().add(this.jScrollPanelImportacionDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetalleFacturasProveedores(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleFacturasProveedores = new JButtonMe();
			this.jButtonAbrirOrderByDetalleFacturasProveedores.setText("Orden");
			this.jButtonAbrirOrderByDetalleFacturasProveedores.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleFacturasProveedores,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleFacturasProveedores";
			inputMap = this.jButtonAbrirOrderByDetalleFacturasProveedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleFacturasProveedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleFacturasProveedores"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleFacturasProveedores = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleFacturasProveedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleFacturasProveedores.setName("jPanelOrderByDetalleFacturasProveedores"); 
			
			this.jPanelOrderByDetalleFacturasProveedores.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleFacturasProveedores.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleFacturasProveedores.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleFacturasProveedores.setLayout(gridaBagLayoutOrderByDetalleFacturasProveedores);
			
			
			this.jTableDatosDetalleFacturasProveedoresOrderBy = new JTableMe();        
			this.jTableDatosDetalleFacturasProveedoresOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleFacturasProveedoresOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleFacturasProveedoresOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleFacturasProveedoresOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleFacturasProveedoresOrderBy.setViewportView(this.jTableDatosDetalleFacturasProveedoresOrderBy);
			this.jTableDatosDetalleFacturasProveedoresOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleFacturasProveedoresOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleFacturasProveedores= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleFacturasProveedores= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleFacturasProveedores = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleFacturasProveedores= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleFacturasProveedores.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleFacturasProveedores.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleFacturasProveedores.setTitle("Orden");
			this.jInternalFrameOrderByDetalleFacturasProveedores.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleFacturasProveedores.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleFacturasProveedores.setResizable(true);
			this.jInternalFrameOrderByDetalleFacturasProveedores.setClosable(true);
			this.jInternalFrameOrderByDetalleFacturasProveedores.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleFacturasProveedores.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleFacturasProveedores.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleFacturasProveedores.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleFacturasProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Facturas Proveedoreses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturasProveedores.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleFacturasProveedores.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleFacturasProveedores.ipady =150;
				
			this.jPanelOrderByDetalleFacturasProveedores.add(jScrollPanelDatosDetalleFacturasProveedoresOrderBy, this.gridBagConstraintsDetalleFacturasProveedores);//this.jTableDatosDetalleFacturasProveedoresTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleFacturasProveedores = new JButtonMe();
			this.jButtonCerrarOrderByDetalleFacturasProveedores.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleFacturasProveedores,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleFacturasProveedores.setToolTipText("Cancelar"+" "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleFacturasProveedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturasProveedores.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleFacturasProveedores.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleFacturasProveedores.add(this.jButtonCerrarOrderByDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleFacturasProveedores = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleFacturasProveedores= new JScrollPane(jPanelOrderByDetalleFacturasProveedores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleFacturasProveedores = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturasProveedores.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleFacturasProveedores.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleFacturasProveedores.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleFacturasProveedores.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleFacturasProveedores.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleFacturasProveedores);
			
			this.jInternalFrameOrderByDetalleFacturasProveedores.getContentPane().add(this.jScrollPanelOrderByDetalleFacturasProveedores, this.gridBagConstraintsDetalleFacturasProveedores);			
		
		} else {
			this.jButtonAbrirOrderByDetalleFacturasProveedores = new JButtonMe();
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
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.detallefacturasproveedoresSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleFacturasProveedores.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleFacturasProveedores.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleFacturasProveedores.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosDetalleFacturasProveedores.getRowHeight();//DetalleFacturasProveedoresConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleFacturasProveedoresConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleFacturasProveedores.isSelected()) {
					iHeightTable=DetalleFacturasProveedoresConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleFacturasProveedoresConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleFacturasProveedoresConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleFacturasProveedoresConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleFacturasProveedores.isSelected()) {
					iHeightTable=DetalleFacturasProveedoresConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleFacturasProveedoresConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleFacturasProveedoresConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleFacturasProveedores.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleFacturasProveedores.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleFacturasProveedores.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleFacturasProveedores.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleFacturasProveedores.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleFacturasProveedores.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleFacturasProveedores!=null && this.jInternalFrameOrderByDetalleFacturasProveedores.getjTableDatosOrderBy()!=null) {
			//if(!this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleFacturasProveedores.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleFacturasProveedores.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleFacturasProveedores.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleFacturasProveedores.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleFacturasProveedores.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleFacturasProveedores.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleFacturasProveedores.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleFacturasProveedores.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleFacturasProveedores.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleFacturasProveedores.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallefacturasproveedoress.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleFacturasProveedores> TraerDetalleFacturasProveedoresBeans(List<DetalleFacturasProveedores> detallefacturasproveedoress,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleFacturasProveedores detallefacturasproveedores:detallefacturasproveedoress) {
					
				if(!(DetalleFacturasProveedoresConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleFacturasProveedoresConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detallefacturasproveedores.setsDetalleGeneralEntityReporte(DetalleFacturasProveedoresConstantesFunciones.getDetalleFacturasProveedoresDescripcion(detallefacturasproveedores));
										
						
					
						
					
				} else  {
							
					//detallefacturasproveedores.setsDetalleGeneralEntityReporte(detallefacturasproveedores.getsDetalleGeneralEntityReporte());
										
				}
				
				//detallefacturasproveedoresbeans.add(detallefacturasproveedoresbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detallefacturasproveedoress;
    }
	//PARA REPORTES FIN
}
