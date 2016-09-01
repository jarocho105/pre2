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
package com.bydan.erp.comisiones.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;

//import com.bydan.erp.comisiones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.comisiones.util.ComisionVentaCobroConstantesFunciones;

import com.bydan.erp.comisiones.business.logic.*;
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
public class ComisionVentaCobroJInternalFrame extends ComisionVentaCobroBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarComisionVentaCobro;
	
	protected JMenuBar jmenuBarComisionVentaCobro;
	
	protected JMenu jmenuComisionVentaCobro;
	protected JMenu jmenuDatosComisionVentaCobro;
	protected JMenu jmenuArchivoComisionVentaCobro;
	protected JMenu jmenuAccionesComisionVentaCobro;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosComisionVentaCobro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutComisionVentaCobro;	
	protected GridBagConstraints gridBagConstraintsComisionVentaCobro;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ComisionVentaCobroDetalleFormJInternalFrame jInternalFrameDetalleFormComisionVentaCobro;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoComisionVentaCobro;	
	protected ImportacionJInternalFrame jInternalFrameImportacionComisionVentaCobro;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";
	
	public ComisionVentaCobroSessionBean comisionventacobroSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public FacturaSessionBean facturaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ComisionVentaCobro> comisionventacobros;		
	public List<ComisionVentaCobro> comisionventacobrosEliminados;	
	public List<ComisionVentaCobro> comisionventacobrosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByComisionVentaCobro;		
	protected JButton jButtonAbrirOrderByComisionVentaCobro;
	
	
	//protected JPanel jPanelOrderByComisionVentaCobro;
	//public JScrollPane jScrollPanelOrderByComisionVentaCobro;	
	//protected JButton jButtonCerrarOrderByComisionVentaCobro;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ComisionVentaCobroLogic comisionventacobroLogic;
	
	
	
	public JScrollPane jScrollPanelDatosComisionVentaCobro;
	public JScrollPane jScrollPanelDatosEdicionComisionVentaCobro;
	public JScrollPane jScrollPanelDatosGeneralComisionVentaCobro;
    
	
	
	//public JScrollPane jScrollPanelDatosComisionVentaCobroOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoComisionVentaCobro;
	//public JScrollPane jScrollPanelImportacionComisionVentaCobro;
	
	
	
	protected JPanel jPanelAccionesComisionVentaCobro;
	
    protected JPanel jPanelPaginacionComisionVentaCobro;
    protected JPanel jPanelParametrosReportesComisionVentaCobro;
	protected JPanel jPanelParametrosReportesAccionesComisionVentaCobro;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralComisionVentaCobro;
	protected Integer iXPanelCamposIniciogeneralComisionVentaCobro=0;
	protected Integer iYPanelCamposIniciogeneralComisionVentaCobro=0;

	protected JPanel jPanelCamposIniciovaloresComisionVentaCobro;
	protected Integer iXPanelCamposIniciovaloresComisionVentaCobro=0;
	protected Integer iYPanelCamposIniciovaloresComisionVentaCobro=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ComisionVentaCobro;
	protected JPanel jPanelParametrosAuxiliar2ComisionVentaCobro;
	protected JPanel jPanelParametrosAuxiliar3ComisionVentaCobro;
	protected JPanel jPanelParametrosAuxiliar4ComisionVentaCobro;
	//protected JPanel jPanelParametrosAuxiliar5ComisionVentaCobro;
	
	
	
	//protected JPanel jPanelReporteDinamicoComisionVentaCobro;
	//protected JPanel jPanelImportacionComisionVentaCobro;
	
	
	public JTable jTableDatosComisionVentaCobro;
	
	
	
	//public JTable jTableDatosComisionVentaCobroOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoComisionVentaCobro;
	protected JButton jButtonDuplicarComisionVentaCobro;
	protected JButton jButtonCopiarComisionVentaCobro;
	protected JButton jButtonVerFormComisionVentaCobro;
	protected JButton jButtonNuevoRelacionesComisionVentaCobro;
	protected JButton jButtonModificarComisionVentaCobro;
	
    protected JButton jButtonGuardarCambiosTablaComisionVentaCobro;
	protected JButton jButtonCerrarComisionVentaCobro;
	
	
	protected JButton jButtonRecargarInformacionComisionVentaCobro;
	protected JButton jButtonProcesarInformacionComisionVentaCobro;
	
	
	protected JButton jButtonAnterioresComisionVentaCobro;
	protected JButton jButtonSiguientesComisionVentaCobro;
	protected JButton jButtonNuevoGuardarCambiosComisionVentaCobro;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoComisionVentaCobro;
	//protected JButton jButtonCerrarReporteDinamicoComisionVentaCobro;
	//protected JButton jButtonGenerarExcelReporteDinamicoComisionVentaCobro;	
	
	
	
	//protected JButton jButtonAbrirImportacionComisionVentaCobro;
	//protected JButton jButtonGenerarImportacionComisionVentaCobro;
	//protected JButton jButtonCerrarImportacionComisionVentaCobro;
	//protected JFileChooser jFileChooserImportacionComisionVentaCobro;
	//protected File fileImportacionComisionVentaCobro;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarComisionVentaCobro;
	protected JButton jButtonDuplicarToolBarComisionVentaCobro;
	protected JButton jButtonNuevoRelacionesToolBarComisionVentaCobro;
	
	
	public JButton jButtonGuardarCambiosToolBarComisionVentaCobro;
	protected JButton jButtonCopiarToolBarComisionVentaCobro;
	protected JButton jButtonVerFormToolBarComisionVentaCobro;
	public JButton jButtonGuardarCambiosTablaToolBarComisionVentaCobro;
	protected JButton jButtonMostrarOcultarTablaToolBarComisionVentaCobro;
	protected JButton jButtonCerrarToolBarComisionVentaCobro;
	
	protected JButton jButtonRecargarInformacionToolBarComisionVentaCobro;
	protected JButton jButtonProcesarInformacionToolBarComisionVentaCobro;
	protected JButton jButtonAnterioresToolBarComisionVentaCobro;
	protected JButton jButtonSiguientesToolBarComisionVentaCobro;
	protected JButton jButtonNuevoGuardarCambiosToolBarComisionVentaCobro;
	protected JButton jButtonAbrirOrderByToolBarComisionVentaCobro;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoComisionVentaCobro;
	protected JMenuItem jMenuItemDuplicarComisionVentaCobro;
	protected JMenuItem jMenuItemNuevoRelacionesComisionVentaCobro;
	
	
	protected JMenuItem jMenuItemGuardarCambiosComisionVentaCobro;
	protected JMenuItem jMenuItemCopiarComisionVentaCobro;
	protected JMenuItem jMenuItemVerFormComisionVentaCobro;
	protected JMenuItem jMenuItemGuardarCambiosTablaComisionVentaCobro;
	protected JMenuItem jMenuItemCerrarComisionVentaCobro;
	protected JMenuItem jMenuItemDetalleCerrarComisionVentaCobro;
	protected JMenuItem jMenuItemDetalleAbrirOrderByComisionVentaCobro;
	protected JMenuItem jMenuItemDetalleMostarOcultarComisionVentaCobro;
	
	protected JMenuItem jMenuItemRecargarInformacionComisionVentaCobro;
	protected JMenuItem jMenuItemProcesarInformacionComisionVentaCobro;
	protected JMenuItem jMenuItemAnterioresComisionVentaCobro;
	protected JMenuItem jMenuItemSiguientesComisionVentaCobro;
	protected JMenuItem jMenuItemNuevoGuardarCambiosComisionVentaCobro;
	protected JMenuItem jMenuItemAbrirOrderByComisionVentaCobro;
	protected JMenuItem jMenuItemMostrarOcultarComisionVentaCobro;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesComisionVentaCobro;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosComisionVentaCobro;
	protected JCheckBox jCheckBoxSeleccionadosComisionVentaCobro;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaComisionVentaCobro;
	protected JCheckBox jCheckBoxConGraficoReporteComisionVentaCobro;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesComisionVentaCobro;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesComisionVentaCobro;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoComisionVentaCobro;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoComisionVentaCobro;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesComisionVentaCobro;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionComisionVentaCobro;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesComisionVentaCobro;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesComisionVentaCobro;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarComisionVentaCobro;
	protected JTextField jTextFieldValorCampoGeneralComisionVentaCobro;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteComisionVentaCobro;
	//public JList<Reporte> jListColumnasSelectReporteComisionVentaCobro;
	//public JScrollPane jScrollColumnasSelectReporteComisionVentaCobro;
	
	//public JLabel jLabelRelacionesSelectReporteComisionVentaCobro;
	//public JList<Reporte> jListRelacionesSelectReporteComisionVentaCobro;
	//public JScrollPane jScrollRelacionesSelectReporteComisionVentaCobro;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoComisionVentaCobro;
	//protected JCheckBox jCheckBoxConGraficoDinamicoComisionVentaCobro;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoComisionVentaCobro;
	//public JLabel jLabelTiposArchivoReporteDinamicoComisionVentaCobro;
	
		
	//public JLabel jLabelArchivoImportacionComisionVentaCobro;	
	//public JLabel jLabelPathArchivoImportacionComisionVentaCobro;
	//protected JTextField jTextFieldPathArchivoImportacionComisionVentaCobro;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoComisionVentaCobro;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoComisionVentaCobro;
	
	//public JLabel jLabelColumnaCategoriaValorComisionVentaCobro;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorComisionVentaCobro;
	
	//public JLabel jLabelColumnasValoresGraficoComisionVentaCobro;
	//public JList<Reporte> jListColumnasValoresGraficoComisionVentaCobro;
	//public JScrollPane jScrollColumnasValoresGraficoComisionVentaCobro;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoComisionVentaCobro;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoComisionVentaCobro;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasComisionVentaCobro;
	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=815;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=616;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ComisionVentaCobroJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ComisionVentaCobro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionVentaCobroJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComisionVentaCobro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionVentaCobroJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComisionVentaCobro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionVentaCobroJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ComisionVentaCobro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionComisionVentaCobro)	{
		this.jButtonRecargarInformacionComisionVentaCobro = jButtonRecargarInformacionComisionVentaCobro;
	}
	
	public JButton getjButtonProcesarInformacionComisionVentaCobro() {
		return this.jButtonProcesarInformacionComisionVentaCobro;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionComisionVentaCobro)	{
		this.jButtonProcesarInformacionComisionVentaCobro = jButtonProcesarInformacionComisionVentaCobro;
	}
	
	
	public JButton getjButtonRecargarInformacionComisionVentaCobro() {
		return this.jButtonRecargarInformacionComisionVentaCobro;
	}
	
	
	public List<ComisionVentaCobro> getcomisionventacobros() {
		return this.comisionventacobros;
	}

	public void setcomisionventacobros(List<ComisionVentaCobro> comisionventacobros) {
		this.comisionventacobros = comisionventacobros;
	}
	
	public List<ComisionVentaCobro> getcomisionventacobrosAux() {
		return this.comisionventacobrosAux;
	}

	public void setcomisionventacobrosAux(List<ComisionVentaCobro> comisionventacobrosAux) {
		this.comisionventacobrosAux = comisionventacobrosAux;
	}
	
	public List<ComisionVentaCobro> getcomisionventacobrosEliminados() {
		return this.comisionventacobrosEliminados;
	}

	public void setComisionVentaCobrosEliminados(List<ComisionVentaCobro> comisionventacobrosEliminados) {
		this.comisionventacobrosEliminados = comisionventacobrosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarComisionVentaCobro() {
		return jComboBoxTiposSeleccionarComisionVentaCobro;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarComisionVentaCobro(
			JComboBox jComboBoxTiposSeleccionarComisionVentaCobro) {
		this.jComboBoxTiposSeleccionarComisionVentaCobro = jComboBoxTiposSeleccionarComisionVentaCobro;
	}
	
	public void setBorderResaltarTiposSeleccionarComisionVentaCobro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarComisionVentaCobro.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarComisionVentaCobro .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralComisionVentaCobro() {
		return jTextFieldValorCampoGeneralComisionVentaCobro;
	}

	public void setjTextFieldValorCampoGeneralComisionVentaCobro(
			JTextField jTextFieldValorCampoGeneralComisionVentaCobro) {
		this.jTextFieldValorCampoGeneralComisionVentaCobro = jTextFieldValorCampoGeneralComisionVentaCobro;
	}

	public void setBorderResaltarValorCampoGeneralComisionVentaCobro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionVentaCobro.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralComisionVentaCobro .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosComisionVentaCobro() {
		return this.jCheckBoxSeleccionarTodosComisionVentaCobro;
	}

	public void setjCheckBoxSeleccionarTodosComisionVentaCobro(
			JCheckBox jCheckBoxSeleccionarTodosComisionVentaCobro) {
		this.jCheckBoxSeleccionarTodosComisionVentaCobro = jCheckBoxSeleccionarTodosComisionVentaCobro;
	}

	public void setBorderResaltarSeleccionarTodosComisionVentaCobro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionVentaCobro.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosComisionVentaCobro .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosComisionVentaCobro() {
		return this.jCheckBoxSeleccionadosComisionVentaCobro;
	}

	public void setjCheckBoxSeleccionadosComisionVentaCobro(
			JCheckBox jCheckBoxSeleccionadosComisionVentaCobro) {
		this.jCheckBoxSeleccionadosComisionVentaCobro = jCheckBoxSeleccionadosComisionVentaCobro;
	}
	
	public void setBorderResaltarSeleccionadosComisionVentaCobro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionVentaCobro.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosComisionVentaCobro .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesComisionVentaCobro() {
		return this.jComboBoxTiposArchivosReportesComisionVentaCobro;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesComisionVentaCobro(
			JComboBox jComboBoxTiposArchivosReportesComisionVentaCobro) {
		this.jComboBoxTiposArchivosReportesComisionVentaCobro = jComboBoxTiposArchivosReportesComisionVentaCobro;
	}

	public void setBorderResaltarTiposArchivosReportesComisionVentaCobro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionVentaCobro.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesComisionVentaCobro .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesComisionVentaCobro() {
		return this.jComboBoxTiposReportesComisionVentaCobro;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesComisionVentaCobro(
			JComboBox jComboBoxTiposReportesComisionVentaCobro) {
		this.jComboBoxTiposReportesComisionVentaCobro = jComboBoxTiposReportesComisionVentaCobro;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoComisionVentaCobro() {
	//	return jComboBoxTiposReportesDinamicoComisionVentaCobro;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoComisionVentaCobro(
	//		JComboBox jComboBoxTiposReportesDinamicoComisionVentaCobro) {
	//	this.jComboBoxTiposReportesDinamicoComisionVentaCobro = jComboBoxTiposReportesDinamicoComisionVentaCobro;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoComisionVentaCobro() {
	//	return jComboBoxTiposArchivosReportesDinamicoComisionVentaCobro;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoComisionVentaCobro(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoComisionVentaCobro) {
	//	this.jComboBoxTiposArchivosReportesDinamicoComisionVentaCobro = jComboBoxTiposArchivosReportesDinamicoComisionVentaCobro;
	//}
	
	public void setBorderResaltarTiposReportesComisionVentaCobro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionVentaCobro.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesComisionVentaCobro .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesComisionVentaCobro() {
		return this.jComboBoxTiposGraficosReportesComisionVentaCobro;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesComisionVentaCobro(
			JComboBox jComboBoxTiposGraficosReportesComisionVentaCobro) {
		this.jComboBoxTiposGraficosReportesComisionVentaCobro = jComboBoxTiposGraficosReportesComisionVentaCobro;
	}
	
	public void setBorderResaltarTiposGraficosReportesComisionVentaCobro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionVentaCobro.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesComisionVentaCobro .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionComisionVentaCobro() {
		return this.jComboBoxTiposPaginacionComisionVentaCobro;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionComisionVentaCobro(
			JComboBox jComboBoxTiposPaginacionComisionVentaCobro) {
		this.jComboBoxTiposPaginacionComisionVentaCobro = jComboBoxTiposPaginacionComisionVentaCobro;
	}
	
	public void setBorderResaltarTiposPaginacionComisionVentaCobro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionVentaCobro.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionComisionVentaCobro .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesComisionVentaCobro() {
		return this.jComboBoxTiposRelacionesComisionVentaCobro;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesComisionVentaCobro() {
		return this.jComboBoxTiposAccionesComisionVentaCobro;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesComisionVentaCobro(
			JComboBox jComboBoxTiposRelacionesComisionVentaCobro) {
		this.jComboBoxTiposRelacionesComisionVentaCobro = jComboBoxTiposRelacionesComisionVentaCobro;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesComisionVentaCobro(
			JComboBox jComboBoxTiposAccionesComisionVentaCobro) {
		this.jComboBoxTiposAccionesComisionVentaCobro = jComboBoxTiposAccionesComisionVentaCobro;
	}
	
	public void setBorderResaltarTiposRelacionesComisionVentaCobro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionVentaCobro.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesComisionVentaCobro .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesComisionVentaCobro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionVentaCobro.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesComisionVentaCobro .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoComisionVentaCobro() {
	//	return jCheckBoxConGraficoDinamicoComisionVentaCobro;
	//}

	//public void setjCheckBoxConGraficoDinamicoComisionVentaCobro(
	//		JCheckBox jCheckBoxConGraficoDinamicoComisionVentaCobro) {
	//	this.jCheckBoxConGraficoDinamicoComisionVentaCobro = jCheckBoxConGraficoDinamicoComisionVentaCobro;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoComisionVentaCobro() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarComisionVentaCobro.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoComisionVentaCobro .setBorder(borderResaltar);		
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
		this.comisionventacobroSessionBean=new ComisionVentaCobroSessionBean();
		
		this.comisionventacobroSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comisionventacobroSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.comisionventacobroSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ComisionVentaCobroJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ComisionVentaCobroJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ComisionVentaCobroJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ComisionVentaCobroJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ComisionVentaCobroJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Comision Venta Cobro MANTENIMIENTO"));
		
		
		if(iWidth > 1650) {
			iWidth=1650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {
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
		
		ComisionVentaCobroJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ComisionVentaCobro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarComisionVentaCobro= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarComisionVentaCobro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarComisionVentaCobro,this.jTtoolBarComisionVentaCobro,
							"nuevo","nuevo","Nuevo"+" "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarComisionVentaCobro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarComisionVentaCobro,this.jTtoolBarComisionVentaCobro,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarComisionVentaCobro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarComisionVentaCobro,this.jTtoolBarComisionVentaCobro,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarComisionVentaCobro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarComisionVentaCobro,this.jTtoolBarComisionVentaCobro,
							"duplicar","duplicar","Duplicar"+" "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarComisionVentaCobro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarComisionVentaCobro,this.jTtoolBarComisionVentaCobro,
							"copiar","copiar","Copiar"+" "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarComisionVentaCobro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarComisionVentaCobro,this.jTtoolBarComisionVentaCobro,
							"ver_form","ver_form","Ver"+" "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarComisionVentaCobro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComisionVentaCobro,this.jTtoolBarComisionVentaCobro,
							"recargar","recargar","Recargar"+" "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarComisionVentaCobro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComisionVentaCobro,this.jTtoolBarComisionVentaCobro,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarComisionVentaCobro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComisionVentaCobro,this.jTtoolBarComisionVentaCobro,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarComisionVentaCobro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarComisionVentaCobro,this.jTtoolBarComisionVentaCobro,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarComisionVentaCobro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarComisionVentaCobro,this.jTtoolBarComisionVentaCobro,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarComisionVentaCobro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarComisionVentaCobro,this.jTtoolBarComisionVentaCobro,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarComisionVentaCobro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarComisionVentaCobro,this.jTtoolBarComisionVentaCobro,
							"cerrar","cerrar","Salir"+" "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarComisionVentaCobro=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarComisionVentaCobro;
			
				this.jButtonProcesarInformacionToolBarComisionVentaCobro=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarComisionVentaCobro;
				
		//protected JButton jButtonModificarToolBarComisionVentaCobro;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarComisionVentaCobro=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuComisionVentaCobro=new JMenuMe("General");
		this.jmenuArchivoComisionVentaCobro=new JMenuMe("Archivo");
		this.jmenuAccionesComisionVentaCobro=new JMenuMe("Acciones");
		this.jmenuDatosComisionVentaCobro=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoComisionVentaCobro= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoComisionVentaCobro.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoComisionVentaCobro,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarComisionVentaCobro= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarComisionVentaCobro.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarComisionVentaCobro,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesComisionVentaCobro= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesComisionVentaCobro.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesComisionVentaCobro,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosComisionVentaCobro= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosComisionVentaCobro.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosComisionVentaCobro,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarComisionVentaCobro= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarComisionVentaCobro.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarComisionVentaCobro,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormComisionVentaCobro= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormComisionVentaCobro.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormComisionVentaCobro,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaComisionVentaCobro= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaComisionVentaCobro.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaComisionVentaCobro,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarComisionVentaCobro= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarComisionVentaCobro.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarComisionVentaCobro,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionComisionVentaCobro= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionComisionVentaCobro.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionComisionVentaCobro,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionComisionVentaCobro= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionComisionVentaCobro.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionComisionVentaCobro,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresComisionVentaCobro= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresComisionVentaCobro.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresComisionVentaCobro,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesComisionVentaCobro= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesComisionVentaCobro.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesComisionVentaCobro,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByComisionVentaCobro= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByComisionVentaCobro.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByComisionVentaCobro,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarComisionVentaCobro= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarComisionVentaCobro.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarComisionVentaCobro,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByComisionVentaCobro= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByComisionVentaCobro.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByComisionVentaCobro,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarComisionVentaCobro= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarComisionVentaCobro.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarComisionVentaCobro,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosComisionVentaCobro= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosComisionVentaCobro.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosComisionVentaCobro,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoComisionVentaCobro.add(this.jMenuItemCerrarComisionVentaCobro);
			
			this.jmenuAccionesComisionVentaCobro.add(this.jMenuItemNuevoComisionVentaCobro);
			this.jmenuAccionesComisionVentaCobro.add(this.jMenuItemNuevoGuardarCambiosComisionVentaCobro);
			this.jmenuAccionesComisionVentaCobro.add(this.jMenuItemNuevoRelacionesComisionVentaCobro);
			this.jmenuAccionesComisionVentaCobro.add(this.jMenuItemGuardarCambiosTablaComisionVentaCobro);		
			this.jmenuAccionesComisionVentaCobro.add(this.jMenuItemDuplicarComisionVentaCobro);		
			this.jmenuAccionesComisionVentaCobro.add(this.jMenuItemCopiarComisionVentaCobro);		
			this.jmenuAccionesComisionVentaCobro.add(this.jMenuItemVerFormComisionVentaCobro);		
			
			this.jmenuDatosComisionVentaCobro.add(this.jMenuItemRecargarInformacionComisionVentaCobro);				
			this.jmenuDatosComisionVentaCobro.add(this.jMenuItemAnterioresComisionVentaCobro);				
			this.jmenuDatosComisionVentaCobro.add(this.jMenuItemSiguientesComisionVentaCobro);				
			this.jmenuDatosComisionVentaCobro.add(this.jMenuItemAbrirOrderByComisionVentaCobro);				
			this.jmenuDatosComisionVentaCobro.add(this.jMenuItemMostrarOcultarComisionVentaCobro);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesComisionVentaCobro.add(this.jMenuItemGuardarCambiosComisionVentaCobro);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarComisionVentaCobro.add(this.jmenuArchivoComisionVentaCobro);		
			this.jmenuBarComisionVentaCobro.add(this.jmenuAccionesComisionVentaCobro);		
			this.jmenuBarComisionVentaCobro.add(this.jmenuDatosComisionVentaCobro);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarComisionVentaCobro);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasComisionVentaCobro() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasComisionVentaCobro=new JTabbedPane();


		this.jTabbedPaneBusquedasComisionVentaCobro.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasComisionVentaCobro.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasComisionVentaCobro.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasComisionVentaCobro.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasComisionVentaCobro.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasComisionVentaCobro,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleComisionVentaCobro = new ComisionVentaCobroDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Comision Venta Cobro DATOS");
			this.jInternalFrameDetalleFormComisionVentaCobro = new ComisionVentaCobroDetalleFormJInternalFrame(jDesktopPane,this.comisionventacobroSessionBean.getConGuardarRelaciones(),this.comisionventacobroSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormComisionVentaCobro = null;//new ComisionVentaCobroDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutComisionVentaCobro= new GridBagLayout();
		
		
		this.jTableDatosComisionVentaCobro = new JTableMe();      
		
		String sToolTipComisionVentaCobro="";
		sToolTipComisionVentaCobro=ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipComisionVentaCobro+="(Comisiones.ComisionVentaCobro)";
		}
		
		if(!this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {
			sToolTipComisionVentaCobro+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosComisionVentaCobro.setToolTipText(sToolTipComisionVentaCobro);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosComisionVentaCobro);
		this.jTableDatosComisionVentaCobro.setAutoCreateRowSorter(true);
		this.jTableDatosComisionVentaCobro.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosComisionVentaCobro.setRowSelectionAllowed(true);
		this.jTableDatosComisionVentaCobro.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosComisionVentaCobro,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoComisionVentaCobro = new JButtonMe();
		this.jButtonDuplicarComisionVentaCobro = new JButtonMe();
		this.jButtonCopiarComisionVentaCobro = new JButtonMe();
		this.jButtonVerFormComisionVentaCobro = new JButtonMe();
		this.jButtonNuevoRelacionesComisionVentaCobro = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaComisionVentaCobro = new JButtonMe();
		this.jButtonCerrarComisionVentaCobro = new JButtonMe();
		
		this.jScrollPanelDatosComisionVentaCobro = new JScrollPane();   
        this.jScrollPanelDatosGeneralComisionVentaCobro = new JScrollPane();
		
				
		
		
		this.jPanelAccionesComisionVentaCobro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralComisionVentaCobro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciovaloresComisionVentaCobro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Comision Venta Cobro";
		
		if(!this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosComisionVentaCobro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comision Venta Cobroes" + this.sPath));
		} else {
			this.jScrollPanelDatosComisionVentaCobro.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralComisionVentaCobro.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesComisionVentaCobro.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesComisionVentaCobro.setToolTipText("Acciones");
        this.jPanelAccionesComisionVentaCobro.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralComisionVentaCobro.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralComisionVentaCobro.setName("jPanelCamposFingeneralComisionVentaCobro");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciovaloresComisionVentaCobro.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores"));
		this.jPanelCamposIniciovaloresComisionVentaCobro.setName("jPanelCamposFinvaloresComisionVentaCobro");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciovaloresComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoComisionVentaCobro=new ReporteDinamicoJInternalFrame(ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoComisionVentaCobro();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionComisionVentaCobro=new ImportacionJInternalFrame(ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionComisionVentaCobro();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByComisionVentaCobro = new JButtonMe();
		
		this.jButtonAbrirOrderByComisionVentaCobro.setText("Orden");
		this.jButtonAbrirOrderByComisionVentaCobro.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByComisionVentaCobro,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByComisionVentaCobro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByComisionVentaCobro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByComisionVentaCobro=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComisionVentaCobro,false,this);
			
			//this.cargarOrderByComisionVentaCobro(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByComisionVentaCobro=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComisionVentaCobro,true,this);
			
			//this.cargarOrderByComisionVentaCobro(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosComisionVentaCobro.setMinimumSize(new Dimension(400,50));//1630
		this.jTableDatosComisionVentaCobro.setMaximumSize(new Dimension(400,50));//1630
		this.jTableDatosComisionVentaCobro.setPreferredSize(new Dimension(400,50));//1630
		
		this.jScrollPanelDatosComisionVentaCobro.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosComisionVentaCobro.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosComisionVentaCobro.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoComisionVentaCobro.setText("Nuevo");
		this.jButtonDuplicarComisionVentaCobro.setText("Duplicar");
		this.jButtonCopiarComisionVentaCobro.setText("Copiar");
		this.jButtonVerFormComisionVentaCobro.setText("Ver");
		this.jButtonNuevoRelacionesComisionVentaCobro.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaComisionVentaCobro.setText("Guardar");
		this.jButtonCerrarComisionVentaCobro.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoComisionVentaCobro,"nuevo_button","Nuevo",this.comisionventacobroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarComisionVentaCobro,"duplicar_button","Duplicar",this.comisionventacobroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarComisionVentaCobro,"copiar_button","Copiar",this.comisionventacobroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormComisionVentaCobro,"ver_form","Ver",this.comisionventacobroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesComisionVentaCobro,"nuevorelaciones_button","Nuevo Rel",this.comisionventacobroSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaComisionVentaCobro,"guardarcambiostabla_button","Guardar",this.comisionventacobroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarComisionVentaCobro,"cerrar_button","Salir",this.comisionventacobroSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoComisionVentaCobro.setToolTipText("Nuevo"+" "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarComisionVentaCobro.setToolTipText("Duplicar"+" "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarComisionVentaCobro.setToolTipText("Copiar"+" "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormComisionVentaCobro.setToolTipText("Ver"+" "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesComisionVentaCobro.setToolTipText("Nuevo Rel"+" "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaComisionVentaCobro.setToolTipText("Guardar"+" "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarComisionVentaCobro.setToolTipText("Salir"+" "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoComisionVentaCobro";
		inputMap = this.jButtonNuevoComisionVentaCobro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoComisionVentaCobro.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoComisionVentaCobro"));
		
		//DUPLICAR
		sMapKey = "DuplicarComisionVentaCobro";
		inputMap = this.jButtonDuplicarComisionVentaCobro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarComisionVentaCobro.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarComisionVentaCobro"));
		
		//COPIAR
		sMapKey = "CopiarComisionVentaCobro";
		inputMap = this.jButtonCopiarComisionVentaCobro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarComisionVentaCobro.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarComisionVentaCobro"));
		
		//VEr FORM
		sMapKey = "VerFormComisionVentaCobro";
		inputMap = this.jButtonVerFormComisionVentaCobro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormComisionVentaCobro.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormComisionVentaCobro"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesComisionVentaCobro";
		inputMap = this.jButtonNuevoRelacionesComisionVentaCobro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesComisionVentaCobro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesComisionVentaCobro"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarComisionVentaCobro";
		inputMap = this.jButtonModificarComisionVentaCobro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarComisionVentaCobro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarComisionVentaCobro"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarComisionVentaCobro";
		inputMap = this.jButtonCerrarComisionVentaCobro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarComisionVentaCobro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarComisionVentaCobro"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaComisionVentaCobro";
		inputMap = this.jButtonGuardarCambiosTablaComisionVentaCobro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaComisionVentaCobro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaComisionVentaCobro"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesComisionVentaCobro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesComisionVentaCobro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionComisionVentaCobro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ComisionVentaCobro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ComisionVentaCobro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ComisionVentaCobro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ComisionVentaCobro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ComisionVentaCobro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesComisionVentaCobro.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesComisionVentaCobro.setName("jPanelParametrosReportesComisionVentaCobro"); 
		
		this.jPanelParametrosReportesAccionesComisionVentaCobro.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesComisionVentaCobro.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesComisionVentaCobro.setName("jPanelParametrosReportesAccionesComisionVentaCobro"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionComisionVentaCobro = new JButtonMe();
		this.jButtonRecargarInformacionComisionVentaCobro.setText("Recargar");
		this.jButtonRecargarInformacionComisionVentaCobro.setToolTipText("Recargar"+" "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionComisionVentaCobro,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionComisionVentaCobro = new JButtonMe();
		this.jButtonProcesarInformacionComisionVentaCobro.setText("Procesar");
		this.jButtonProcesarInformacionComisionVentaCobro.setToolTipText("Procesar"+" "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionComisionVentaCobro.setVisible(false);
			
		this.jButtonProcesarInformacionComisionVentaCobro.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionComisionVentaCobro.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionComisionVentaCobro.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesComisionVentaCobro = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComisionVentaCobro.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesComisionVentaCobro.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesComisionVentaCobro = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComisionVentaCobro.setText("TIPO");       
		this.jComboBoxTiposReportesComisionVentaCobro.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesComisionVentaCobro = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComisionVentaCobro.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesComisionVentaCobro.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionComisionVentaCobro = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionComisionVentaCobro.setText("Paginacion");
		this.jComboBoxTiposPaginacionComisionVentaCobro.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesComisionVentaCobro = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesComisionVentaCobro.setText("Accion");
		this.jComboBoxTiposRelacionesComisionVentaCobro.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesComisionVentaCobro = new JComboBoxMe();
		//this.jComboBoxTiposAccionesComisionVentaCobro.setText("Accion");
		this.jComboBoxTiposAccionesComisionVentaCobro.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarComisionVentaCobro = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarComisionVentaCobro.setText("Accion");
		this.jComboBoxTiposSeleccionarComisionVentaCobro.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralComisionVentaCobro=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralComisionVentaCobro.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralComisionVentaCobro.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralComisionVentaCobro.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesComisionVentaCobro = new JLabelMe();
		
		this.jLabelAccionesComisionVentaCobro.setText("Acciones");		
		this.jLabelAccionesComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosComisionVentaCobro = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosComisionVentaCobro.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosComisionVentaCobro.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosComisionVentaCobro = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosComisionVentaCobro.setText("Seleccionados");
		this.jCheckBoxSeleccionadosComisionVentaCobro.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaComisionVentaCobro = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaComisionVentaCobro.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaComisionVentaCobro.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteComisionVentaCobro = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteComisionVentaCobro.setText("Graf.");
		this.jCheckBoxConGraficoReporteComisionVentaCobro.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresComisionVentaCobro = new JButtonMe();
		//this.jButtonAnterioresComisionVentaCobro.setText("<<");
        this.jButtonAnterioresComisionVentaCobro.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresComisionVentaCobro,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesComisionVentaCobro = new JButtonMe();
		//this.jButtonSiguientesComisionVentaCobro.setText(">>");
        this.jButtonSiguientesComisionVentaCobro.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesComisionVentaCobro,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosComisionVentaCobro = new JButtonMe();
		this.jButtonNuevoGuardarCambiosComisionVentaCobro.setText("Nue");
        this.jButtonNuevoGuardarCambiosComisionVentaCobro.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosComisionVentaCobro,"nuevoguardarcambios_button","Nue",this.comisionventacobroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosComisionVentaCobro";
		inputMap = this.jButtonNuevoGuardarCambiosComisionVentaCobro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosComisionVentaCobro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosComisionVentaCobro"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionComisionVentaCobro";
		inputMap = this.jButtonRecargarInformacionComisionVentaCobro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionComisionVentaCobro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionComisionVentaCobro"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesComisionVentaCobro";
		inputMap = this.jButtonSiguientesComisionVentaCobro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesComisionVentaCobro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesComisionVentaCobro"));
		
		//ANTERIORES		
		sMapKey = "AnterioresComisionVentaCobro";
		inputMap = this.jButtonAnterioresComisionVentaCobro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresComisionVentaCobro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresComisionVentaCobro"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasComisionVentaCobro();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesComisionVentaCobro.setMinimumSize(new Dimension(this.getWidth(),ComisionVentaCobroBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComisionVentaCobroBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesComisionVentaCobro.setMaximumSize(new Dimension(this.getWidth(),ComisionVentaCobroBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComisionVentaCobroBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesComisionVentaCobro.setPreferredSize(new Dimension(this.getWidth(),ComisionVentaCobroBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComisionVentaCobroBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionComisionVentaCobro = new GridBagLayout();

			this.jPanelPaginacionComisionVentaCobro.setLayout(gridaBagLayoutPaginacionComisionVentaCobro);						
			
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionVentaCobro.gridy = 0;
			this.gridBagConstraintsComisionVentaCobro.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionComisionVentaCobro.add(this.jButtonAnterioresComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
					
						
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsComisionVentaCobro.gridy = 0;
			
			this.jPanelPaginacionComisionVentaCobro.add(this.jButtonNuevoGuardarCambiosComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
						
			
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsComisionVentaCobro.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsComisionVentaCobro.gridy = 0;
			this.jPanelPaginacionComisionVentaCobro.add(this.jButtonSiguientesComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionVentaCobro.gridy = 1;
			this.gridBagConstraintsComisionVentaCobro.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComisionVentaCobro.add(this.jButtonNuevoComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
						
			
			
			if(!this.comisionventacobroSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
				this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsComisionVentaCobro.gridy = 1;
				this.gridBagConstraintsComisionVentaCobro.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionComisionVentaCobro.add(this.jButtonGuardarCambiosTablaComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
			}
			
			
			
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionVentaCobro.gridy = 1;
			this.gridBagConstraintsComisionVentaCobro.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComisionVentaCobro.add(this.jButtonDuplicarComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
			
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionVentaCobro.gridy = 1;
			this.gridBagConstraintsComisionVentaCobro.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComisionVentaCobro.add(this.jButtonCopiarComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
		
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionVentaCobro.gridy = 1;
			this.gridBagConstraintsComisionVentaCobro.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComisionVentaCobro.add(this.jButtonVerFormComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
		
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionVentaCobro.gridy = 1;
			this.gridBagConstraintsComisionVentaCobro.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionComisionVentaCobro.add(this.jButtonCerrarComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
		
		
		
		this.jButtonRecargarInformacionComisionVentaCobro.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionComisionVentaCobro.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionComisionVentaCobro.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesComisionVentaCobro.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesComisionVentaCobro.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesComisionVentaCobro.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesComisionVentaCobro.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesComisionVentaCobro.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesComisionVentaCobro.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesComisionVentaCobro.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesComisionVentaCobro.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesComisionVentaCobro.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionComisionVentaCobro.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionComisionVentaCobro.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionComisionVentaCobro.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesComisionVentaCobro.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesComisionVentaCobro.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesComisionVentaCobro.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesComisionVentaCobro.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComisionVentaCobro.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComisionVentaCobro.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarComisionVentaCobro.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarComisionVentaCobro.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarComisionVentaCobro.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaComisionVentaCobro.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaComisionVentaCobro.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaComisionVentaCobro.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteComisionVentaCobro.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteComisionVentaCobro.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteComisionVentaCobro.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosComisionVentaCobro.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosComisionVentaCobro.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosComisionVentaCobro.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosComisionVentaCobro.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosComisionVentaCobro.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosComisionVentaCobro.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesComisionVentaCobro = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesComisionVentaCobro = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ComisionVentaCobro = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ComisionVentaCobro = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ComisionVentaCobro = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ComisionVentaCobro = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesComisionVentaCobro.setLayout(gridaBagParametrosReportesComisionVentaCobro);
			this.jPanelParametrosReportesAccionesComisionVentaCobro.setLayout(gridaBagParametrosReportesAccionesComisionVentaCobro);
			
			
			this.jPanelParametrosAuxiliar1ComisionVentaCobro.setLayout(gridaBagParametrosAuxiliar1ComisionVentaCobro);
			this.jPanelParametrosAuxiliar2ComisionVentaCobro.setLayout(gridaBagParametrosAuxiliar2ComisionVentaCobro);
			this.jPanelParametrosAuxiliar3ComisionVentaCobro.setLayout(gridaBagParametrosAuxiliar3ComisionVentaCobro);
			this.jPanelParametrosAuxiliar4ComisionVentaCobro.setLayout(gridaBagParametrosAuxiliar4ComisionVentaCobro);
			//this.jPanelParametrosAuxiliar5ComisionVentaCobro.setLayout(gridaBagParametrosAuxiliar2ComisionVentaCobro);			
			
			
			
			
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionVentaCobro.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComisionVentaCobro.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComisionVentaCobro.add(this.jButtonRecargarInformacionComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionVentaCobro.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComisionVentaCobro.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComisionVentaCobro.add(this.jComboBoxTiposPaginacionComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionVentaCobro.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComisionVentaCobro.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComisionVentaCobro.add(this.jCheckBoxConAltoMaximoTablaComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionVentaCobro.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComisionVentaCobro.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComisionVentaCobro.add(this.jComboBoxTiposArchivosReportesComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionVentaCobro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionVentaCobro.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisionVentaCobro.add(this.jPanelParametrosAuxiliar1ComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionVentaCobro.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComisionVentaCobro.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ComisionVentaCobro.add(this.jComboBoxTiposReportesComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);																		
			
			
			
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionVentaCobro.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComisionVentaCobro.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ComisionVentaCobro.add(this.jComboBoxTiposGraficosReportesComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionVentaCobro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionVentaCobro.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisionVentaCobro.add(this.jPanelParametrosAuxiliar4ComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionVentaCobro.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsComisionVentaCobro.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisionVentaCobro.add(this.jComboBoxTiposReportesComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionVentaCobro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionVentaCobro.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComisionVentaCobro.add(this.jCheckBoxGenerarReporteComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionVentaCobro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionVentaCobro.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisionVentaCobro.add(this.jPanelParametrosAuxiliar2ComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionVentaCobro.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComisionVentaCobro.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComisionVentaCobro.add(this.jLabelAccionesComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
				this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsComisionVentaCobro.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsComisionVentaCobro.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesComisionVentaCobro.add(this.jButtonAbrirOrderByComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsComisionVentaCobro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionVentaCobro.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComisionVentaCobro.add(this.jComboBoxTiposSeleccionarComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);			
			
			
			/*
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionVentaCobro.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComisionVentaCobro.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComisionVentaCobro.add(this.jCheckBoxSeleccionarTodosComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
			
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionVentaCobro.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComisionVentaCobro.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComisionVentaCobro.add(this.jCheckBoxConGraficoReporteComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionVentaCobro.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComisionVentaCobro.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComisionVentaCobro.add(this.jCheckBoxSeleccionarTodosComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);															
				
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionVentaCobro.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComisionVentaCobro.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComisionVentaCobro.add(this.jCheckBoxSeleccionadosComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);															
			
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionVentaCobro.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComisionVentaCobro.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComisionVentaCobro.add(this.jCheckBoxConGraficoReporteComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionVentaCobro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionVentaCobro.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisionVentaCobro.add(this.jPanelParametrosAuxiliar3ComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionVentaCobro.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComisionVentaCobro.add(this.jComboBoxTiposAccionesComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
	
				
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionVentaCobro.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComisionVentaCobro.add(this.jTextFieldValorCampoGeneralComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralComisionVentaCobro= new GridBagLayout();
		this.jPanelCamposIniciogeneralComisionVentaCobro.setLayout(gridaBagLayoutCamposIniciogeneralComisionVentaCobro);

		GridBagLayout gridaBagLayoutCamposIniciovaloresComisionVentaCobro= new GridBagLayout();
		this.jPanelCamposIniciovaloresComisionVentaCobro.setLayout(gridaBagLayoutCamposIniciovaloresComisionVentaCobro);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosComisionVentaCobro = new GridBagLayout();

			this.jScrollPanelDatosComisionVentaCobro.setLayout(gridaBagLayoutDatosComisionVentaCobro);
			
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionVentaCobro.gridy = 0;
			this.gridBagConstraintsComisionVentaCobro.gridx = 0;
			
			this.jScrollPanelDatosComisionVentaCobro.add(this.jTableDatosComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosComisionVentaCobro.setViewportView(this.jTableDatosComisionVentaCobro);
		this.jTableDatosComisionVentaCobro.setFillsViewportHeight(true);
		this.jTableDatosComisionVentaCobro.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesComisionVentaCobro= new GridBagLayout();
		this.jPanelAccionesComisionVentaCobro.setLayout(gridaBagLayoutAccionesComisionVentaCobro);
		
		
		/*	
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = 0;
		this.gridBagConstraintsComisionVentaCobro.gridx = 0;
			
		this.jPanelAccionesComisionVentaCobro.add(this.jButtonNuevoComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutComisionVentaCobro = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutComisionVentaCobro);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();						
			this.gridBagConstraintsComisionVentaCobro.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComisionVentaCobro.gridx = 0;		
			//this.gridBagConstraintsComisionVentaCobro.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsComisionVentaCobro.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.gridy = iGridyPrincipal++;
		this.gridBagConstraintsComisionVentaCobro.gridx = 0;		
		//this.gridBagConstraintsComisionVentaCobro.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionVentaCobro.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsComisionVentaCobro.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsComisionVentaCobro);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionVentaCobro.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);								
		
		
		/*
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionVentaCobro.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
		*/		
		
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.gridy =iGridyPrincipal++;
		this.gridBagConstraintsComisionVentaCobro.gridx =0;
		this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsComisionVentaCobro.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
				
		
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionVentaCobro.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ComisionVentaCobroJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosComisionVentaCobro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosComisionVentaCobro = new GridBagLayout();
			this.jPanelBusquedasParametrosComisionVentaCobro.setLayout(gridaBagLayoutBusquedasParametrosComisionVentaCobro);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralComisionVentaCobro=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralComisionVentaCobro.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComisionVentaCobro.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComisionVentaCobro.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionVentaCobro.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
			
			
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionVentaCobro.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
		
			
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsComisionVentaCobro.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralComisionVentaCobro;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoComisionVentaCobro() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoComisionVentaCobro = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoComisionVentaCobro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoComisionVentaCobro.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoComisionVentaCobro.setName("jPanelReporteDinamicoComisionVentaCobro"); 
		
		this.jPanelReporteDinamicoComisionVentaCobro.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoComisionVentaCobro.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoComisionVentaCobro.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoComisionVentaCobro.setLayout(gridaBagLayoutReporteDinamicoComisionVentaCobro);
		
		
		this.jInternalFrameReporteDinamicoComisionVentaCobro= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoComisionVentaCobro = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteComisionVentaCobro= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoComisionVentaCobro.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoComisionVentaCobro.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoComisionVentaCobro.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoComisionVentaCobro.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoComisionVentaCobro.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoComisionVentaCobro.setResizable(true);
	    this.jInternalFrameReporteDinamicoComisionVentaCobro.setClosable(true);
	    this.jInternalFrameReporteDinamicoComisionVentaCobro.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoComisionVentaCobro.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoComisionVentaCobro.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoComisionVentaCobro.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoComisionVentaCobro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comision Venta Cobroes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteComisionVentaCobro = new JLabelMe();

		this.jLabelColumnasSelectReporteComisionVentaCobro.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionVentaCobro.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComisionVentaCobro.add(this.jLabelColumnasSelectReporteComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteComisionVentaCobro = new JList<Reporte>();
		this.jListColumnasSelectReporteComisionVentaCobro.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteComisionVentaCobro.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteComisionVentaCobro.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteComisionVentaCobro.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteComisionVentaCobro.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteComisionVentaCobro=new JScrollPane(this.jListColumnasSelectReporteComisionVentaCobro);
			
			this.jScrollColumnasSelectReporteComisionVentaCobro.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteComisionVentaCobro.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteComisionVentaCobro.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteComisionVentaCobro.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionVentaCobro.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoComisionVentaCobro.add(this.jListColumnasSelectReporteComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
		this.jPanelReporteDinamicoComisionVentaCobro.add(this.jScrollColumnasSelectReporteComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteComisionVentaCobro = new JLabelMe();

		this.jLabelRelacionesSelectReporteComisionVentaCobro.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteComisionVentaCobro = new JList<Reporte>();
		this.jListRelacionesSelectReporteComisionVentaCobro.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteComisionVentaCobro.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteComisionVentaCobro.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteComisionVentaCobro.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteComisionVentaCobro.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteComisionVentaCobro=new JScrollPane(this.jListRelacionesSelectReporteComisionVentaCobro);
			
			this.jScrollRelacionesSelectReporteComisionVentaCobro.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteComisionVentaCobro.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteComisionVentaCobro.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteComisionVentaCobro.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoComisionVentaCobro = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoComisionVentaCobro = new JComboBoxMe();
		this.jListColumnasValoresGraficoComisionVentaCobro = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoComisionVentaCobro = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoComisionVentaCobro.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoComisionVentaCobro.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoComisionVentaCobro.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoComisionVentaCobro.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoComisionVentaCobro = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoComisionVentaCobro.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoComisionVentaCobro.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoComisionVentaCobro.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoComisionVentaCobro.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoComisionVentaCobro = new JLabelMe();

		this.jLabelConGraficoDinamicoComisionVentaCobro.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionVentaCobro.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComisionVentaCobro.add(this.jLabelConGraficoDinamicoComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoComisionVentaCobro = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoComisionVentaCobro.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoComisionVentaCobro.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoComisionVentaCobro.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoComisionVentaCobro.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoComisionVentaCobro.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionVentaCobro.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionVentaCobro.add(this.jCheckBoxConGraficoDinamicoComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoComisionVentaCobro = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoComisionVentaCobro.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionVentaCobro.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComisionVentaCobro.add(this.jLabelColumnaCategoriaGraficoComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoComisionVentaCobro = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoComisionVentaCobro.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoComisionVentaCobro.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoComisionVentaCobro.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoComisionVentaCobro.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoComisionVentaCobro.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionVentaCobro.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoComisionVentaCobro.add(this.jComboBoxColumnaCategoriaGraficoComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorComisionVentaCobro = new JLabelMe();

		this.jLabelColumnaCategoriaValorComisionVentaCobro.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionVentaCobro.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionVentaCobro.add(this.jLabelColumnaCategoriaValorComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorComisionVentaCobro = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorComisionVentaCobro.setText("Accion");
        this.jComboBoxColumnaCategoriaValorComisionVentaCobro.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorComisionVentaCobro.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorComisionVentaCobro.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorComisionVentaCobro.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionVentaCobro.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoComisionVentaCobro.add(this.jComboBoxColumnaCategoriaValorComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoComisionVentaCobro = new JLabelMe();

		this.jLabelColumnasValoresGraficoComisionVentaCobro.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionVentaCobro.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionVentaCobro.add(this.jLabelColumnasValoresGraficoComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoComisionVentaCobro = new JList<Reporte>();
		this.jListColumnasValoresGraficoComisionVentaCobro.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoComisionVentaCobro.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoComisionVentaCobro.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoComisionVentaCobro.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoComisionVentaCobro.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoComisionVentaCobro=new JScrollPane(this.jListColumnasValoresGraficoComisionVentaCobro);
			
			this.jScrollColumnasValoresGraficoComisionVentaCobro.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoComisionVentaCobro.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoComisionVentaCobro.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoComisionVentaCobro.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionVentaCobro.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoComisionVentaCobro.add(this.jListColumnasSelectReporteComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
		this.jPanelReporteDinamicoComisionVentaCobro.add(this.jScrollColumnasValoresGraficoComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoComisionVentaCobro = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoComisionVentaCobro.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionVentaCobro.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionVentaCobro.add(this.jLabelTiposGraficosReportesDinamicoComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoComisionVentaCobro = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoComisionVentaCobro.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoComisionVentaCobro.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoComisionVentaCobro.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoComisionVentaCobro.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoComisionVentaCobro.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionVentaCobro.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionVentaCobro.add(this.jComboBoxTiposGraficosReportesDinamicoComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoComisionVentaCobro = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoComisionVentaCobro.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionVentaCobro.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionVentaCobro.add(this.jLabelGenerarExcelReporteDinamicoComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoComisionVentaCobro = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoComisionVentaCobro.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoComisionVentaCobro,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoComisionVentaCobro.setToolTipText("Generar EXCEL"+" "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		//this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsComisionVentaCobro.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsComisionVentaCobro.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoComisionVentaCobro.add(this.jButtonGenerarExcelReporteDinamicoComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComisionVentaCobro.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComisionVentaCobro.add(this.jComboBoxTiposReportesDinamicoComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoComisionVentaCobro = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoComisionVentaCobro.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionVentaCobro.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionVentaCobro.add(this.jLabelTiposArchivoReporteDinamicoComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComisionVentaCobro.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComisionVentaCobro.add(this.jComboBoxTiposArchivosReportesDinamicoComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoComisionVentaCobro = new JButtonMe();
		this.jButtonGenerarReporteDinamicoComisionVentaCobro.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoComisionVentaCobro,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoComisionVentaCobro.setToolTipText("Generar"+" "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComisionVentaCobro.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComisionVentaCobro.add(this.jButtonGenerarReporteDinamicoComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoComisionVentaCobro = new JButtonMe();
		this.jButtonCerrarReporteDinamicoComisionVentaCobro.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoComisionVentaCobro,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoComisionVentaCobro.setToolTipText("Cancelar"+" "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComisionVentaCobro.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComisionVentaCobro.add(this.jButtonCerrarReporteDinamicoComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalComisionVentaCobro = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoComisionVentaCobro= new JScrollPane(jPanelReporteDinamicoComisionVentaCobro,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoComisionVentaCobro.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoComisionVentaCobro.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoComisionVentaCobro.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoComisionVentaCobro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comision Venta Cobroes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsComisionVentaCobro.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoComisionVentaCobro.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoComisionVentaCobro.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalComisionVentaCobro);
		this.jInternalFrameReporteDinamicoComisionVentaCobro.getContentPane().add(this.jScrollPanelReporteDinamicoComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionComisionVentaCobro() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionComisionVentaCobro = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionComisionVentaCobro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionComisionVentaCobro.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionComisionVentaCobro.setName("jPanelImportacionComisionVentaCobro"); 
		
		this.jPanelImportacionComisionVentaCobro.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionComisionVentaCobro.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionComisionVentaCobro.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionComisionVentaCobro.setLayout(gridaBagLayoutImportacionComisionVentaCobro);
		
		
		this.jInternalFrameImportacionComisionVentaCobro= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionComisionVentaCobro= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionComisionVentaCobro = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteComisionVentaCobro= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionComisionVentaCobro.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionComisionVentaCobro.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionComisionVentaCobro.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionComisionVentaCobro.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionComisionVentaCobro.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionComisionVentaCobro.setResizable(true);
	    this.jInternalFrameImportacionComisionVentaCobro.setClosable(true);
	    this.jInternalFrameImportacionComisionVentaCobro.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionComisionVentaCobro.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionComisionVentaCobro.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionComisionVentaCobro.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionComisionVentaCobro.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionComisionVentaCobro.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionComisionVentaCobro.setResizable(true);
	    this.jInternalFrameImportacionComisionVentaCobro.setClosable(true);
	    this.jInternalFrameImportacionComisionVentaCobro.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionComisionVentaCobro.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionComisionVentaCobro.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionComisionVentaCobro.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionComisionVentaCobro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comision Venta Cobroes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionComisionVentaCobro = new JLabelMe();

		this.jLabelArchivoImportacionComisionVentaCobro.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = iPosYImportacion;		
		this.gridBagConstraintsComisionVentaCobro.gridx = iPosXImportacion++;
			
		this.jPanelImportacionComisionVentaCobro.add(this.jLabelArchivoImportacionComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionComisionVentaCobro = new JFileChooser();		
		this.jFileChooserImportacionComisionVentaCobro.setToolTipText("ESCOGER ARCHIVO"+" "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionComisionVentaCobro = new JButtonMe();
		this.jButtonAbrirImportacionComisionVentaCobro.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionComisionVentaCobro,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionComisionVentaCobro.setToolTipText("Generar"+" "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = iPosYImportacion;
		this.gridBagConstraintsComisionVentaCobro.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComisionVentaCobro.add(this.jButtonAbrirImportacionComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionComisionVentaCobro = new JLabelMe();

		this.jLabelPathArchivoImportacionComisionVentaCobro.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionComisionVentaCobro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionComisionVentaCobro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionComisionVentaCobro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = iPosYImportacion;		
		this.gridBagConstraintsComisionVentaCobro.gridx = iPosXImportacion++;
			
		this.jPanelImportacionComisionVentaCobro.add(this.jLabelPathArchivoImportacionComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionComisionVentaCobro=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionComisionVentaCobro.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionComisionVentaCobro.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionComisionVentaCobro.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = iPosYImportacion;
		this.gridBagConstraintsComisionVentaCobro.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComisionVentaCobro.add(this.jTextFieldPathArchivoImportacionComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionComisionVentaCobro = new JButtonMe();
		this.jButtonGenerarImportacionComisionVentaCobro.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionComisionVentaCobro,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionComisionVentaCobro.setToolTipText("Generar"+" "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = iPosYImportacion;
		this.gridBagConstraintsComisionVentaCobro.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComisionVentaCobro.add(this.jButtonGenerarImportacionComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionComisionVentaCobro = new JButtonMe();
		this.jButtonCerrarImportacionComisionVentaCobro.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionComisionVentaCobro,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionComisionVentaCobro.setToolTipText("Cancelar"+" "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionVentaCobro.gridy = iPosYImportacion;
		this.gridBagConstraintsComisionVentaCobro.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComisionVentaCobro.add(this.jButtonCerrarImportacionComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalComisionVentaCobro = new GridBagLayout();
		
		this.jScrollPanelImportacionComisionVentaCobro= new JScrollPane(jPanelImportacionComisionVentaCobro,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
		this.gridBagConstraintsComisionVentaCobro.gridy =iPosYImportacion;
		this.gridBagConstraintsComisionVentaCobro.gridx =iPosXImportacion;
		this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionComisionVentaCobro.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionComisionVentaCobro.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalComisionVentaCobro);
		this.jInternalFrameImportacionComisionVentaCobro.getContentPane().add(this.jScrollPanelImportacionComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByComisionVentaCobro(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByComisionVentaCobro = new JButtonMe();
			this.jButtonAbrirOrderByComisionVentaCobro.setText("Orden");
			this.jButtonAbrirOrderByComisionVentaCobro.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByComisionVentaCobro,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByComisionVentaCobro";
			inputMap = this.jButtonAbrirOrderByComisionVentaCobro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByComisionVentaCobro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByComisionVentaCobro"));
		
		
			GridBagLayout gridaBagLayoutOrderByComisionVentaCobro = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByComisionVentaCobro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByComisionVentaCobro.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByComisionVentaCobro.setName("jPanelOrderByComisionVentaCobro"); 
			
			this.jPanelOrderByComisionVentaCobro.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByComisionVentaCobro.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByComisionVentaCobro.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByComisionVentaCobro.setLayout(gridaBagLayoutOrderByComisionVentaCobro);
			
			
			this.jTableDatosComisionVentaCobroOrderBy = new JTableMe();        
			this.jTableDatosComisionVentaCobroOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosComisionVentaCobroOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosComisionVentaCobroOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosComisionVentaCobroOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosComisionVentaCobroOrderBy.setViewportView(this.jTableDatosComisionVentaCobroOrderBy);
			this.jTableDatosComisionVentaCobroOrderBy.setFillsViewportHeight(true);
			this.jTableDatosComisionVentaCobroOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByComisionVentaCobro= new OrderByJInternalFrame();
			this.jInternalFrameOrderByComisionVentaCobro= new OrderByJInternalFrame();
			this.jScrollPanelOrderByComisionVentaCobro = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteComisionVentaCobro= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByComisionVentaCobro.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByComisionVentaCobro.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByComisionVentaCobro.setTitle("Orden");
			this.jInternalFrameOrderByComisionVentaCobro.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByComisionVentaCobro.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByComisionVentaCobro.setResizable(true);
			this.jInternalFrameOrderByComisionVentaCobro.setClosable(true);
			this.jInternalFrameOrderByComisionVentaCobro.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByComisionVentaCobro.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByComisionVentaCobro.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByComisionVentaCobro.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByComisionVentaCobro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comision Venta Cobroes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.gridy =iPosYOrderBy++;
			this.gridBagConstraintsComisionVentaCobro.gridx =iPosXOrderBy;
			this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsComisionVentaCobro.ipady =150;
				
			this.jPanelOrderByComisionVentaCobro.add(jScrollPanelDatosComisionVentaCobroOrderBy, this.gridBagConstraintsComisionVentaCobro);//this.jTableDatosComisionVentaCobroTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByComisionVentaCobro = new JButtonMe();
			this.jButtonCerrarOrderByComisionVentaCobro.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByComisionVentaCobro,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByComisionVentaCobro.setToolTipText("Cancelar"+" "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByComisionVentaCobro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionVentaCobro.gridy = iPosYOrderBy++;
			this.gridBagConstraintsComisionVentaCobro.gridx = iPosXOrderBy;
									
			this.jPanelOrderByComisionVentaCobro.add(this.jButtonCerrarOrderByComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalComisionVentaCobro = new GridBagLayout();
			
			this.jScrollPanelOrderByComisionVentaCobro= new JScrollPane(jPanelOrderByComisionVentaCobro,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsComisionVentaCobro = new GridBagConstraints();
			this.gridBagConstraintsComisionVentaCobro.gridy =iPosYOrderBy;
			this.gridBagConstraintsComisionVentaCobro.gridx =iPosXOrderBy;
			this.gridBagConstraintsComisionVentaCobro.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByComisionVentaCobro.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByComisionVentaCobro.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalComisionVentaCobro);
			
			this.jInternalFrameOrderByComisionVentaCobro.getContentPane().add(this.jScrollPanelOrderByComisionVentaCobro, this.gridBagConstraintsComisionVentaCobro);			
		
		} else {
			this.jButtonAbrirOrderByComisionVentaCobro = new JButtonMe();
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
		int iWidthTableCalculado=0;//3230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.comisionventacobroSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosComisionVentaCobro.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosComisionVentaCobro.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosComisionVentaCobro.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosComisionVentaCobro.getRowHeight();//ComisionVentaCobroConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ComisionVentaCobroConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaComisionVentaCobro.isSelected()) {
					iHeightTable=ComisionVentaCobroConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ComisionVentaCobroConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ComisionVentaCobroConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ComisionVentaCobroConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaComisionVentaCobro.isSelected()) {
					iHeightTable=ComisionVentaCobroConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ComisionVentaCobroConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ComisionVentaCobroConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosComisionVentaCobro.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosComisionVentaCobro.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosComisionVentaCobro.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosComisionVentaCobro.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosComisionVentaCobro.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosComisionVentaCobro.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByComisionVentaCobro!=null && this.jInternalFrameOrderByComisionVentaCobro.getjTableDatosOrderBy()!=null) {
			//if(!this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByComisionVentaCobro.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByComisionVentaCobro.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByComisionVentaCobro.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByComisionVentaCobro.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByComisionVentaCobro.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByComisionVentaCobro.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByComisionVentaCobro.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosComisionVentaCobro.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosComisionVentaCobro.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosComisionVentaCobro.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=comisionventacobroLogic.getComisionVentaCobros().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comisionventacobros.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ComisionVentaCobro> TraerComisionVentaCobroBeans(List<ComisionVentaCobro> comisionventacobros,ArrayList<Classe> classes)throws Exception {
		try {
			for(ComisionVentaCobro comisionventacobro:comisionventacobros) {
					
				if(!(ComisionVentaCobroConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ComisionVentaCobroConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					comisionventacobro.setsDetalleGeneralEntityReporte(ComisionVentaCobroConstantesFunciones.getComisionVentaCobroDescripcion(comisionventacobro));
										
						
					
						
					
				} else  {
							
					//comisionventacobro.setsDetalleGeneralEntityReporte(comisionventacobro.getsDetalleGeneralEntityReporte());
										
				}
				
				//comisionventacobrobeans.add(comisionventacobrobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return comisionventacobros;
    }
	//PARA REPORTES FIN
}
