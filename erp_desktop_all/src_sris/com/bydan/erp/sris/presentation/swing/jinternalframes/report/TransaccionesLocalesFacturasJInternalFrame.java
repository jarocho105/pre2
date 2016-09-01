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
package com.bydan.erp.sris.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.sris.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.sris.business.entity.report.*;
import com.bydan.erp.sris.util.report.TransaccionesLocalesFacturasConstantesFunciones;

import com.bydan.erp.sris.business.logic.report.*;
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
public class TransaccionesLocalesFacturasJInternalFrame extends TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTransaccionesLocalesFacturas;
	
	protected JMenuBar jmenuBarTransaccionesLocalesFacturas;
	
	protected JMenu jmenuTransaccionesLocalesFacturas;
	protected JMenu jmenuDatosTransaccionesLocalesFacturas;
	protected JMenu jmenuArchivoTransaccionesLocalesFacturas;
	protected JMenu jmenuAccionesTransaccionesLocalesFacturas;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTransaccionesLocalesFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTransaccionesLocalesFacturas;	
	protected GridBagConstraints gridBagConstraintsTransaccionesLocalesFacturas;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TransaccionesLocalesFacturasDetalleFormJInternalFrame jInternalFrameDetalleFormTransaccionesLocalesFacturas;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTransaccionesLocalesFacturas;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTransaccionesLocalesFacturas;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";
	
	public TransaccionesLocalesFacturasSessionBean transaccioneslocalesfacturasSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TransaccionesLocalesFacturas> transaccioneslocalesfacturass;		
	public List<TransaccionesLocalesFacturas> transaccioneslocalesfacturassEliminados;	
	public List<TransaccionesLocalesFacturas> transaccioneslocalesfacturassAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTransaccionesLocalesFacturas;		
	protected JButton jButtonAbrirOrderByTransaccionesLocalesFacturas;
	
	
	//protected JPanel jPanelOrderByTransaccionesLocalesFacturas;
	//public JScrollPane jScrollPanelOrderByTransaccionesLocalesFacturas;	
	//protected JButton jButtonCerrarOrderByTransaccionesLocalesFacturas;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TransaccionesLocalesFacturasLogic transaccioneslocalesfacturasLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTransaccionesLocalesFacturas;
	public JScrollPane jScrollPanelDatosEdicionTransaccionesLocalesFacturas;
	public JScrollPane jScrollPanelDatosGeneralTransaccionesLocalesFacturas;
    
	
	
	//public JScrollPane jScrollPanelDatosTransaccionesLocalesFacturasOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTransaccionesLocalesFacturas;
	//public JScrollPane jScrollPanelImportacionTransaccionesLocalesFacturas;
	
	
	
	protected JPanel jPanelAccionesTransaccionesLocalesFacturas;
	
    protected JPanel jPanelPaginacionTransaccionesLocalesFacturas;
    protected JPanel jPanelParametrosReportesTransaccionesLocalesFacturas;
	protected JPanel jPanelParametrosReportesAccionesTransaccionesLocalesFacturas;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TransaccionesLocalesFacturas;
	protected JPanel jPanelParametrosAuxiliar2TransaccionesLocalesFacturas;
	protected JPanel jPanelParametrosAuxiliar3TransaccionesLocalesFacturas;
	protected JPanel jPanelParametrosAuxiliar4TransaccionesLocalesFacturas;
	//protected JPanel jPanelParametrosAuxiliar5TransaccionesLocalesFacturas;
	
	
	
	//protected JPanel jPanelReporteDinamicoTransaccionesLocalesFacturas;
	//protected JPanel jPanelImportacionTransaccionesLocalesFacturas;
	
	
	public JTable jTableDatosTransaccionesLocalesFacturas;
	
	
	
	//public JTable jTableDatosTransaccionesLocalesFacturasOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTransaccionesLocalesFacturas;
	protected JButton jButtonDuplicarTransaccionesLocalesFacturas;
	protected JButton jButtonCopiarTransaccionesLocalesFacturas;
	protected JButton jButtonVerFormTransaccionesLocalesFacturas;
	protected JButton jButtonNuevoRelacionesTransaccionesLocalesFacturas;
	protected JButton jButtonModificarTransaccionesLocalesFacturas;
	
    protected JButton jButtonGuardarCambiosTablaTransaccionesLocalesFacturas;
	protected JButton jButtonCerrarTransaccionesLocalesFacturas;
	
	
	protected JButton jButtonRecargarInformacionTransaccionesLocalesFacturas;
	protected JButton jButtonProcesarInformacionTransaccionesLocalesFacturas;
	
	
	protected JButton jButtonAnterioresTransaccionesLocalesFacturas;
	protected JButton jButtonSiguientesTransaccionesLocalesFacturas;
	protected JButton jButtonNuevoGuardarCambiosTransaccionesLocalesFacturas;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTransaccionesLocalesFacturas;
	//protected JButton jButtonCerrarReporteDinamicoTransaccionesLocalesFacturas;
	//protected JButton jButtonGenerarExcelReporteDinamicoTransaccionesLocalesFacturas;	
	
	
	
	//protected JButton jButtonAbrirImportacionTransaccionesLocalesFacturas;
	//protected JButton jButtonGenerarImportacionTransaccionesLocalesFacturas;
	//protected JButton jButtonCerrarImportacionTransaccionesLocalesFacturas;
	//protected JFileChooser jFileChooserImportacionTransaccionesLocalesFacturas;
	//protected File fileImportacionTransaccionesLocalesFacturas;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTransaccionesLocalesFacturas;
	protected JButton jButtonDuplicarToolBarTransaccionesLocalesFacturas;
	protected JButton jButtonNuevoRelacionesToolBarTransaccionesLocalesFacturas;
	
	
	public JButton jButtonGuardarCambiosToolBarTransaccionesLocalesFacturas;
	protected JButton jButtonCopiarToolBarTransaccionesLocalesFacturas;
	protected JButton jButtonVerFormToolBarTransaccionesLocalesFacturas;
	public JButton jButtonGuardarCambiosTablaToolBarTransaccionesLocalesFacturas;
	protected JButton jButtonMostrarOcultarTablaToolBarTransaccionesLocalesFacturas;
	protected JButton jButtonCerrarToolBarTransaccionesLocalesFacturas;
	
	protected JButton jButtonRecargarInformacionToolBarTransaccionesLocalesFacturas;
	protected JButton jButtonProcesarInformacionToolBarTransaccionesLocalesFacturas;
	protected JButton jButtonAnterioresToolBarTransaccionesLocalesFacturas;
	protected JButton jButtonSiguientesToolBarTransaccionesLocalesFacturas;
	protected JButton jButtonNuevoGuardarCambiosToolBarTransaccionesLocalesFacturas;
	protected JButton jButtonAbrirOrderByToolBarTransaccionesLocalesFacturas;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTransaccionesLocalesFacturas;
	protected JMenuItem jMenuItemDuplicarTransaccionesLocalesFacturas;
	protected JMenuItem jMenuItemNuevoRelacionesTransaccionesLocalesFacturas;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTransaccionesLocalesFacturas;
	protected JMenuItem jMenuItemCopiarTransaccionesLocalesFacturas;
	protected JMenuItem jMenuItemVerFormTransaccionesLocalesFacturas;
	protected JMenuItem jMenuItemGuardarCambiosTablaTransaccionesLocalesFacturas;
	protected JMenuItem jMenuItemCerrarTransaccionesLocalesFacturas;
	protected JMenuItem jMenuItemDetalleCerrarTransaccionesLocalesFacturas;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTransaccionesLocalesFacturas;
	protected JMenuItem jMenuItemDetalleMostarOcultarTransaccionesLocalesFacturas;
	
	protected JMenuItem jMenuItemRecargarInformacionTransaccionesLocalesFacturas;
	protected JMenuItem jMenuItemProcesarInformacionTransaccionesLocalesFacturas;
	protected JMenuItem jMenuItemAnterioresTransaccionesLocalesFacturas;
	protected JMenuItem jMenuItemSiguientesTransaccionesLocalesFacturas;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTransaccionesLocalesFacturas;
	protected JMenuItem jMenuItemAbrirOrderByTransaccionesLocalesFacturas;
	protected JMenuItem jMenuItemMostrarOcultarTransaccionesLocalesFacturas;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTransaccionesLocalesFacturas;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTransaccionesLocalesFacturas;
	protected JCheckBox jCheckBoxSeleccionadosTransaccionesLocalesFacturas;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTransaccionesLocalesFacturas;
	protected JCheckBox jCheckBoxConGraficoReporteTransaccionesLocalesFacturas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTransaccionesLocalesFacturas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTransaccionesLocalesFacturas;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTransaccionesLocalesFacturas;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTransaccionesLocalesFacturas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTransaccionesLocalesFacturas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTransaccionesLocalesFacturas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTransaccionesLocalesFacturas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTransaccionesLocalesFacturas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTransaccionesLocalesFacturas;
	protected JTextField jTextFieldValorCampoGeneralTransaccionesLocalesFacturas;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTransaccionesLocalesFacturas;
	//public JList<Reporte> jListColumnasSelectReporteTransaccionesLocalesFacturas;
	//public JScrollPane jScrollColumnasSelectReporteTransaccionesLocalesFacturas;
	
	//public JLabel jLabelRelacionesSelectReporteTransaccionesLocalesFacturas;
	//public JList<Reporte> jListRelacionesSelectReporteTransaccionesLocalesFacturas;
	//public JScrollPane jScrollRelacionesSelectReporteTransaccionesLocalesFacturas;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTransaccionesLocalesFacturas;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTransaccionesLocalesFacturas;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTransaccionesLocalesFacturas;
	//public JLabel jLabelTiposArchivoReporteDinamicoTransaccionesLocalesFacturas;
	
		
	//public JLabel jLabelArchivoImportacionTransaccionesLocalesFacturas;	
	//public JLabel jLabelPathArchivoImportacionTransaccionesLocalesFacturas;
	//protected JTextField jTextFieldPathArchivoImportacionTransaccionesLocalesFacturas;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTransaccionesLocalesFacturas;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTransaccionesLocalesFacturas;
	
	//public JLabel jLabelColumnaCategoriaValorTransaccionesLocalesFacturas;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTransaccionesLocalesFacturas;
	
	//public JLabel jLabelColumnasValoresGraficoTransaccionesLocalesFacturas;
	//public JList<Reporte> jListColumnasValoresGraficoTransaccionesLocalesFacturas;
	//public JScrollPane jScrollColumnasValoresGraficoTransaccionesLocalesFacturas;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTransaccionesLocalesFacturas;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTransaccionesLocalesFacturas;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTransaccionesLocalesFacturas;
	public JPanel jPanelBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas;
	public JButton jButtonBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas;
	
	public JPanel jPanelid_ejercicioBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas;
	public JLabel jLabelid_ejercicioBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas;
	public JButton jButtonid_ejercicioBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturasUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturasBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_desdeBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas;
	public JLabel jLabelfecha_desdeBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas;
	//public JFormattedTextField jDateChooserfecha_desdeBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas;

	public JDateChooser jDateChooserfecha_desdeBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas;
	public JButton jButtonfecha_desdeBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturasBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_hastaBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas;
	public JLabel jLabelfecha_hastaBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas;
	//public JFormattedTextField jDateChooserfecha_hastaBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas;

	public JDateChooser jDateChooserfecha_hastaBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas;
	public JButton jButtonfecha_hastaBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturasBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TransaccionesLocalesFacturasJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TransaccionesLocalesFacturas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionesLocalesFacturasJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TransaccionesLocalesFacturas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionesLocalesFacturasJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TransaccionesLocalesFacturas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionesLocalesFacturasJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TransaccionesLocalesFacturas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTransaccionesLocalesFacturas)	{
		this.jButtonRecargarInformacionTransaccionesLocalesFacturas = jButtonRecargarInformacionTransaccionesLocalesFacturas;
	}
	
	public JButton getjButtonProcesarInformacionTransaccionesLocalesFacturas() {
		return this.jButtonProcesarInformacionTransaccionesLocalesFacturas;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTransaccionesLocalesFacturas)	{
		this.jButtonProcesarInformacionTransaccionesLocalesFacturas = jButtonProcesarInformacionTransaccionesLocalesFacturas;
	}
	
	
	public JButton getjButtonRecargarInformacionTransaccionesLocalesFacturas() {
		return this.jButtonRecargarInformacionTransaccionesLocalesFacturas;
	}
	
	
	public List<TransaccionesLocalesFacturas> gettransaccioneslocalesfacturass() {
		return this.transaccioneslocalesfacturass;
	}

	public void settransaccioneslocalesfacturass(List<TransaccionesLocalesFacturas> transaccioneslocalesfacturass) {
		this.transaccioneslocalesfacturass = transaccioneslocalesfacturass;
	}
	
	public List<TransaccionesLocalesFacturas> gettransaccioneslocalesfacturassAux() {
		return this.transaccioneslocalesfacturassAux;
	}

	public void settransaccioneslocalesfacturassAux(List<TransaccionesLocalesFacturas> transaccioneslocalesfacturassAux) {
		this.transaccioneslocalesfacturassAux = transaccioneslocalesfacturassAux;
	}
	
	public List<TransaccionesLocalesFacturas> gettransaccioneslocalesfacturassEliminados() {
		return this.transaccioneslocalesfacturassEliminados;
	}

	public void setTransaccionesLocalesFacturassEliminados(List<TransaccionesLocalesFacturas> transaccioneslocalesfacturassEliminados) {
		this.transaccioneslocalesfacturassEliminados = transaccioneslocalesfacturassEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTransaccionesLocalesFacturas() {
		return jComboBoxTiposSeleccionarTransaccionesLocalesFacturas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTransaccionesLocalesFacturas(
			JComboBox jComboBoxTiposSeleccionarTransaccionesLocalesFacturas) {
		this.jComboBoxTiposSeleccionarTransaccionesLocalesFacturas = jComboBoxTiposSeleccionarTransaccionesLocalesFacturas;
	}
	
	public void setBorderResaltarTiposSeleccionarTransaccionesLocalesFacturas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTransaccionesLocalesFacturas.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTransaccionesLocalesFacturas .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTransaccionesLocalesFacturas() {
		return jTextFieldValorCampoGeneralTransaccionesLocalesFacturas;
	}

	public void setjTextFieldValorCampoGeneralTransaccionesLocalesFacturas(
			JTextField jTextFieldValorCampoGeneralTransaccionesLocalesFacturas) {
		this.jTextFieldValorCampoGeneralTransaccionesLocalesFacturas = jTextFieldValorCampoGeneralTransaccionesLocalesFacturas;
	}

	public void setBorderResaltarValorCampoGeneralTransaccionesLocalesFacturas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionesLocalesFacturas.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTransaccionesLocalesFacturas .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTransaccionesLocalesFacturas() {
		return this.jCheckBoxSeleccionarTodosTransaccionesLocalesFacturas;
	}

	public void setjCheckBoxSeleccionarTodosTransaccionesLocalesFacturas(
			JCheckBox jCheckBoxSeleccionarTodosTransaccionesLocalesFacturas) {
		this.jCheckBoxSeleccionarTodosTransaccionesLocalesFacturas = jCheckBoxSeleccionarTodosTransaccionesLocalesFacturas;
	}

	public void setBorderResaltarSeleccionarTodosTransaccionesLocalesFacturas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionesLocalesFacturas.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTransaccionesLocalesFacturas .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTransaccionesLocalesFacturas() {
		return this.jCheckBoxSeleccionadosTransaccionesLocalesFacturas;
	}

	public void setjCheckBoxSeleccionadosTransaccionesLocalesFacturas(
			JCheckBox jCheckBoxSeleccionadosTransaccionesLocalesFacturas) {
		this.jCheckBoxSeleccionadosTransaccionesLocalesFacturas = jCheckBoxSeleccionadosTransaccionesLocalesFacturas;
	}
	
	public void setBorderResaltarSeleccionadosTransaccionesLocalesFacturas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionesLocalesFacturas.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTransaccionesLocalesFacturas .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTransaccionesLocalesFacturas() {
		return this.jComboBoxTiposArchivosReportesTransaccionesLocalesFacturas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTransaccionesLocalesFacturas(
			JComboBox jComboBoxTiposArchivosReportesTransaccionesLocalesFacturas) {
		this.jComboBoxTiposArchivosReportesTransaccionesLocalesFacturas = jComboBoxTiposArchivosReportesTransaccionesLocalesFacturas;
	}

	public void setBorderResaltarTiposArchivosReportesTransaccionesLocalesFacturas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionesLocalesFacturas.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTransaccionesLocalesFacturas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTransaccionesLocalesFacturas() {
		return this.jComboBoxTiposReportesTransaccionesLocalesFacturas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTransaccionesLocalesFacturas(
			JComboBox jComboBoxTiposReportesTransaccionesLocalesFacturas) {
		this.jComboBoxTiposReportesTransaccionesLocalesFacturas = jComboBoxTiposReportesTransaccionesLocalesFacturas;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTransaccionesLocalesFacturas() {
	//	return jComboBoxTiposReportesDinamicoTransaccionesLocalesFacturas;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTransaccionesLocalesFacturas(
	//		JComboBox jComboBoxTiposReportesDinamicoTransaccionesLocalesFacturas) {
	//	this.jComboBoxTiposReportesDinamicoTransaccionesLocalesFacturas = jComboBoxTiposReportesDinamicoTransaccionesLocalesFacturas;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTransaccionesLocalesFacturas() {
	//	return jComboBoxTiposArchivosReportesDinamicoTransaccionesLocalesFacturas;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTransaccionesLocalesFacturas(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTransaccionesLocalesFacturas) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTransaccionesLocalesFacturas = jComboBoxTiposArchivosReportesDinamicoTransaccionesLocalesFacturas;
	//}
	
	public void setBorderResaltarTiposReportesTransaccionesLocalesFacturas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionesLocalesFacturas.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTransaccionesLocalesFacturas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTransaccionesLocalesFacturas() {
		return this.jComboBoxTiposGraficosReportesTransaccionesLocalesFacturas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTransaccionesLocalesFacturas(
			JComboBox jComboBoxTiposGraficosReportesTransaccionesLocalesFacturas) {
		this.jComboBoxTiposGraficosReportesTransaccionesLocalesFacturas = jComboBoxTiposGraficosReportesTransaccionesLocalesFacturas;
	}
	
	public void setBorderResaltarTiposGraficosReportesTransaccionesLocalesFacturas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionesLocalesFacturas.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTransaccionesLocalesFacturas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTransaccionesLocalesFacturas() {
		return this.jComboBoxTiposPaginacionTransaccionesLocalesFacturas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTransaccionesLocalesFacturas(
			JComboBox jComboBoxTiposPaginacionTransaccionesLocalesFacturas) {
		this.jComboBoxTiposPaginacionTransaccionesLocalesFacturas = jComboBoxTiposPaginacionTransaccionesLocalesFacturas;
	}
	
	public void setBorderResaltarTiposPaginacionTransaccionesLocalesFacturas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionesLocalesFacturas.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTransaccionesLocalesFacturas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTransaccionesLocalesFacturas() {
		return this.jComboBoxTiposRelacionesTransaccionesLocalesFacturas;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTransaccionesLocalesFacturas() {
		return this.jComboBoxTiposAccionesTransaccionesLocalesFacturas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTransaccionesLocalesFacturas(
			JComboBox jComboBoxTiposRelacionesTransaccionesLocalesFacturas) {
		this.jComboBoxTiposRelacionesTransaccionesLocalesFacturas = jComboBoxTiposRelacionesTransaccionesLocalesFacturas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTransaccionesLocalesFacturas(
			JComboBox jComboBoxTiposAccionesTransaccionesLocalesFacturas) {
		this.jComboBoxTiposAccionesTransaccionesLocalesFacturas = jComboBoxTiposAccionesTransaccionesLocalesFacturas;
	}
	
	public void setBorderResaltarTiposRelacionesTransaccionesLocalesFacturas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionesLocalesFacturas.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTransaccionesLocalesFacturas .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTransaccionesLocalesFacturas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionesLocalesFacturas.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTransaccionesLocalesFacturas .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTransaccionesLocalesFacturas() {
	//	return jCheckBoxConGraficoDinamicoTransaccionesLocalesFacturas;
	//}

	//public void setjCheckBoxConGraficoDinamicoTransaccionesLocalesFacturas(
	//		JCheckBox jCheckBoxConGraficoDinamicoTransaccionesLocalesFacturas) {
	//	this.jCheckBoxConGraficoDinamicoTransaccionesLocalesFacturas = jCheckBoxConGraficoDinamicoTransaccionesLocalesFacturas;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTransaccionesLocalesFacturas() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTransaccionesLocalesFacturas.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTransaccionesLocalesFacturas .setBorder(borderResaltar);		
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
		this.transaccioneslocalesfacturasSessionBean=new TransaccionesLocalesFacturasSessionBean();
		
		this.transaccioneslocalesfacturasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.transaccioneslocalesfacturasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TransaccionesLocalesFacturasJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TransaccionesLocalesFacturasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TransaccionesLocalesFacturasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TransaccionesLocalesFacturasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TransaccionesLocalesFacturasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Transacciones Locales Facturas MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {
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
		
		TransaccionesLocalesFacturasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TransaccionesLocalesFacturas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTransaccionesLocalesFacturas= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTransaccionesLocalesFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTransaccionesLocalesFacturas,this.jTtoolBarTransaccionesLocalesFacturas,
							"nuevo","nuevo","Nuevo"+" "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTransaccionesLocalesFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTransaccionesLocalesFacturas,this.jTtoolBarTransaccionesLocalesFacturas,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTransaccionesLocalesFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTransaccionesLocalesFacturas,this.jTtoolBarTransaccionesLocalesFacturas,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTransaccionesLocalesFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTransaccionesLocalesFacturas,this.jTtoolBarTransaccionesLocalesFacturas,
							"duplicar","duplicar","Duplicar"+" "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTransaccionesLocalesFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTransaccionesLocalesFacturas,this.jTtoolBarTransaccionesLocalesFacturas,
							"copiar","copiar","Copiar"+" "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTransaccionesLocalesFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTransaccionesLocalesFacturas,this.jTtoolBarTransaccionesLocalesFacturas,
							"ver_form","ver_form","Ver"+" "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTransaccionesLocalesFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTransaccionesLocalesFacturas,this.jTtoolBarTransaccionesLocalesFacturas,
							"recargar","recargar","Buscar"+" "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarTransaccionesLocalesFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTransaccionesLocalesFacturas,this.jTtoolBarTransaccionesLocalesFacturas,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTransaccionesLocalesFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTransaccionesLocalesFacturas,this.jTtoolBarTransaccionesLocalesFacturas,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTransaccionesLocalesFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTransaccionesLocalesFacturas,this.jTtoolBarTransaccionesLocalesFacturas,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTransaccionesLocalesFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTransaccionesLocalesFacturas,this.jTtoolBarTransaccionesLocalesFacturas,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTransaccionesLocalesFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTransaccionesLocalesFacturas,this.jTtoolBarTransaccionesLocalesFacturas,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTransaccionesLocalesFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTransaccionesLocalesFacturas,this.jTtoolBarTransaccionesLocalesFacturas,
							"cerrar","cerrar","Salir"+" "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTransaccionesLocalesFacturas=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTransaccionesLocalesFacturas;
			
				this.jButtonProcesarInformacionToolBarTransaccionesLocalesFacturas=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTransaccionesLocalesFacturas;
				
		//protected JButton jButtonModificarToolBarTransaccionesLocalesFacturas;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTransaccionesLocalesFacturas=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTransaccionesLocalesFacturas=new JMenuMe("General");
		this.jmenuArchivoTransaccionesLocalesFacturas=new JMenuMe("Archivo");
		this.jmenuAccionesTransaccionesLocalesFacturas=new JMenuMe("Acciones");
		this.jmenuDatosTransaccionesLocalesFacturas=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTransaccionesLocalesFacturas= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTransaccionesLocalesFacturas.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTransaccionesLocalesFacturas,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTransaccionesLocalesFacturas= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTransaccionesLocalesFacturas.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTransaccionesLocalesFacturas,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTransaccionesLocalesFacturas= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTransaccionesLocalesFacturas.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTransaccionesLocalesFacturas,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTransaccionesLocalesFacturas= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTransaccionesLocalesFacturas.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTransaccionesLocalesFacturas,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTransaccionesLocalesFacturas= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTransaccionesLocalesFacturas.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTransaccionesLocalesFacturas,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTransaccionesLocalesFacturas= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTransaccionesLocalesFacturas.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTransaccionesLocalesFacturas,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTransaccionesLocalesFacturas= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTransaccionesLocalesFacturas.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTransaccionesLocalesFacturas,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTransaccionesLocalesFacturas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTransaccionesLocalesFacturas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTransaccionesLocalesFacturas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTransaccionesLocalesFacturas= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTransaccionesLocalesFacturas.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTransaccionesLocalesFacturas,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTransaccionesLocalesFacturas= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTransaccionesLocalesFacturas.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTransaccionesLocalesFacturas,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTransaccionesLocalesFacturas= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTransaccionesLocalesFacturas.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTransaccionesLocalesFacturas,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTransaccionesLocalesFacturas= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTransaccionesLocalesFacturas.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTransaccionesLocalesFacturas,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTransaccionesLocalesFacturas= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTransaccionesLocalesFacturas.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTransaccionesLocalesFacturas,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTransaccionesLocalesFacturas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTransaccionesLocalesFacturas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTransaccionesLocalesFacturas,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTransaccionesLocalesFacturas= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTransaccionesLocalesFacturas.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTransaccionesLocalesFacturas,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTransaccionesLocalesFacturas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTransaccionesLocalesFacturas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTransaccionesLocalesFacturas,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTransaccionesLocalesFacturas= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTransaccionesLocalesFacturas.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTransaccionesLocalesFacturas,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTransaccionesLocalesFacturas.add(this.jMenuItemCerrarTransaccionesLocalesFacturas);
			
			this.jmenuAccionesTransaccionesLocalesFacturas.add(this.jMenuItemNuevoTransaccionesLocalesFacturas);
			this.jmenuAccionesTransaccionesLocalesFacturas.add(this.jMenuItemNuevoGuardarCambiosTransaccionesLocalesFacturas);
			this.jmenuAccionesTransaccionesLocalesFacturas.add(this.jMenuItemNuevoRelacionesTransaccionesLocalesFacturas);
			this.jmenuAccionesTransaccionesLocalesFacturas.add(this.jMenuItemGuardarCambiosTablaTransaccionesLocalesFacturas);		
			this.jmenuAccionesTransaccionesLocalesFacturas.add(this.jMenuItemDuplicarTransaccionesLocalesFacturas);		
			this.jmenuAccionesTransaccionesLocalesFacturas.add(this.jMenuItemCopiarTransaccionesLocalesFacturas);		
			this.jmenuAccionesTransaccionesLocalesFacturas.add(this.jMenuItemVerFormTransaccionesLocalesFacturas);		
			
			this.jmenuDatosTransaccionesLocalesFacturas.add(this.jMenuItemRecargarInformacionTransaccionesLocalesFacturas);				
			this.jmenuDatosTransaccionesLocalesFacturas.add(this.jMenuItemAnterioresTransaccionesLocalesFacturas);				
			this.jmenuDatosTransaccionesLocalesFacturas.add(this.jMenuItemSiguientesTransaccionesLocalesFacturas);				
			this.jmenuDatosTransaccionesLocalesFacturas.add(this.jMenuItemAbrirOrderByTransaccionesLocalesFacturas);				
			this.jmenuDatosTransaccionesLocalesFacturas.add(this.jMenuItemMostrarOcultarTransaccionesLocalesFacturas);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTransaccionesLocalesFacturas.add(this.jMenuItemGuardarCambiosTransaccionesLocalesFacturas);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTransaccionesLocalesFacturas.add(this.jmenuArchivoTransaccionesLocalesFacturas);		
			this.jmenuBarTransaccionesLocalesFacturas.add(this.jmenuAccionesTransaccionesLocalesFacturas);		
			this.jmenuBarTransaccionesLocalesFacturas.add(this.jmenuDatosTransaccionesLocalesFacturas);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTransaccionesLocalesFacturas);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTransaccionesLocalesFacturas() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setToolTipText("Buscar Por Ejercicio Por Fecha Desde Por Fecha Hasta ");
		this.jButtonBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas= new JButtonMe();
		this.jButtonBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setText("Buscar");
		this.jButtonBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setToolTipText("Buscar Por Ejercicio Por Fecha Desde Por Fecha Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas,"buscar_button","Buscar Por Ejercicio Por Fecha Desde Por Fecha Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ejercicioBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas = new JLabelMe();
		jLabelid_ejercicioBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setText("Ejercicio :");
		jLabelid_ejercicioBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setToolTipText("Ejercicio");
		jLabelid_ejercicioBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ejercicioBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas= new JComboBoxMe();
		jComboBoxid_ejercicioBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_desdeBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas = new JLabelMe();
		jLabelfecha_desdeBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setText("Fecha Desde :");
		jLabelfecha_desdeBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setToolTipText("Fecha Desde");
		jLabelfecha_desdeBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_desdeBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_desdeBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_desdeBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas= new JDateChooser();
		jDateChooserfecha_desdeBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_desdeBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setDate(new Date());
		jDateChooserfecha_desdeBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_desdeBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_hastaBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas = new JLabelMe();
		jLabelfecha_hastaBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setText("Fecha Hasta :");
		jLabelfecha_hastaBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setToolTipText("Fecha Hasta");
		jLabelfecha_hastaBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_hastaBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas= new JDateChooser();
		jDateChooserfecha_hastaBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_hastaBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setDate(new Date());
		jDateChooserfecha_hastaBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_hastaBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasTransaccionesLocalesFacturas=new JTabbedPane();


		this.jTabbedPaneBusquedasTransaccionesLocalesFacturas.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasTransaccionesLocalesFacturas.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasTransaccionesLocalesFacturas.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasTransaccionesLocalesFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTransaccionesLocalesFacturas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTransaccionesLocalesFacturas,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTransaccionesLocalesFacturas = new TransaccionesLocalesFacturasDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Transacciones Locales Facturas DATOS");
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas = new TransaccionesLocalesFacturasDetalleFormJInternalFrame(jDesktopPane,this.transaccioneslocalesfacturasSessionBean.getConGuardarRelaciones(),this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTransaccionesLocalesFacturas = null;//new TransaccionesLocalesFacturasDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTransaccionesLocalesFacturas= new GridBagLayout();
		
		
		this.jTableDatosTransaccionesLocalesFacturas = new JTableMe();      
		
		String sToolTipTransaccionesLocalesFacturas="";
		sToolTipTransaccionesLocalesFacturas=TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTransaccionesLocalesFacturas+="(Sris.TransaccionesLocalesFacturas)";
		}
		
		if(!this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {
			sToolTipTransaccionesLocalesFacturas+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTransaccionesLocalesFacturas.setToolTipText(sToolTipTransaccionesLocalesFacturas);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTransaccionesLocalesFacturas);
		this.jTableDatosTransaccionesLocalesFacturas.setAutoCreateRowSorter(true);
		this.jTableDatosTransaccionesLocalesFacturas.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTransaccionesLocalesFacturas.setRowSelectionAllowed(true);
		this.jTableDatosTransaccionesLocalesFacturas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTransaccionesLocalesFacturas,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTransaccionesLocalesFacturas = new JButtonMe();
		this.jButtonDuplicarTransaccionesLocalesFacturas = new JButtonMe();
		this.jButtonCopiarTransaccionesLocalesFacturas = new JButtonMe();
		this.jButtonVerFormTransaccionesLocalesFacturas = new JButtonMe();
		this.jButtonNuevoRelacionesTransaccionesLocalesFacturas = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTransaccionesLocalesFacturas = new JButtonMe();
		this.jButtonCerrarTransaccionesLocalesFacturas = new JButtonMe();
		
		this.jScrollPanelDatosTransaccionesLocalesFacturas = new JScrollPane();   
        this.jScrollPanelDatosGeneralTransaccionesLocalesFacturas = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTransaccionesLocalesFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Transacciones Locales Facturas";
		
		if(!this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTransaccionesLocalesFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transacciones Locales Facturases" + this.sPath));
		} else {
			this.jScrollPanelDatosTransaccionesLocalesFacturas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTransaccionesLocalesFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTransaccionesLocalesFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTransaccionesLocalesFacturas.setToolTipText("Acciones");
        this.jPanelAccionesTransaccionesLocalesFacturas.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas=new ReporteDinamicoJInternalFrame(TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTransaccionesLocalesFacturas();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTransaccionesLocalesFacturas=new ImportacionJInternalFrame(TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTransaccionesLocalesFacturas();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTransaccionesLocalesFacturas = new JButtonMe();
		
		this.jButtonAbrirOrderByTransaccionesLocalesFacturas.setText("Orden");
		this.jButtonAbrirOrderByTransaccionesLocalesFacturas.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTransaccionesLocalesFacturas,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTransaccionesLocalesFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTransaccionesLocalesFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTransaccionesLocalesFacturas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransaccionesLocalesFacturas,false,this);
			
			//this.cargarOrderByTransaccionesLocalesFacturas(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTransaccionesLocalesFacturas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransaccionesLocalesFacturas,true,this);
			
			//this.cargarOrderByTransaccionesLocalesFacturas(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTransaccionesLocalesFacturas.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosTransaccionesLocalesFacturas.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosTransaccionesLocalesFacturas.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosTransaccionesLocalesFacturas.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTransaccionesLocalesFacturas.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTransaccionesLocalesFacturas.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTransaccionesLocalesFacturas.setText("Nuevo");
		this.jButtonDuplicarTransaccionesLocalesFacturas.setText("Duplicar");
		this.jButtonCopiarTransaccionesLocalesFacturas.setText("Copiar");
		this.jButtonVerFormTransaccionesLocalesFacturas.setText("Ver");
		this.jButtonNuevoRelacionesTransaccionesLocalesFacturas.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTransaccionesLocalesFacturas.setText("Guardar");
		this.jButtonCerrarTransaccionesLocalesFacturas.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTransaccionesLocalesFacturas,"nuevo_button","Nuevo",this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTransaccionesLocalesFacturas,"duplicar_button","Duplicar",this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTransaccionesLocalesFacturas,"copiar_button","Copiar",this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTransaccionesLocalesFacturas,"ver_form","Ver",this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTransaccionesLocalesFacturas,"nuevorelaciones_button","Nuevo Rel",this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTransaccionesLocalesFacturas,"guardarcambiostabla_button","Guardar",this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTransaccionesLocalesFacturas,"cerrar_button","Salir",this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTransaccionesLocalesFacturas.setToolTipText("Nuevo"+" "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTransaccionesLocalesFacturas.setToolTipText("Duplicar"+" "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTransaccionesLocalesFacturas.setToolTipText("Copiar"+" "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTransaccionesLocalesFacturas.setToolTipText("Ver"+" "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTransaccionesLocalesFacturas.setToolTipText("Nuevo Rel"+" "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTransaccionesLocalesFacturas.setToolTipText("Guardar"+" "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTransaccionesLocalesFacturas.setToolTipText("Salir"+" "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTransaccionesLocalesFacturas";
		inputMap = this.jButtonNuevoTransaccionesLocalesFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTransaccionesLocalesFacturas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTransaccionesLocalesFacturas"));
		
		//DUPLICAR
		sMapKey = "DuplicarTransaccionesLocalesFacturas";
		inputMap = this.jButtonDuplicarTransaccionesLocalesFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTransaccionesLocalesFacturas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTransaccionesLocalesFacturas"));
		
		//COPIAR
		sMapKey = "CopiarTransaccionesLocalesFacturas";
		inputMap = this.jButtonCopiarTransaccionesLocalesFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTransaccionesLocalesFacturas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTransaccionesLocalesFacturas"));
		
		//VEr FORM
		sMapKey = "VerFormTransaccionesLocalesFacturas";
		inputMap = this.jButtonVerFormTransaccionesLocalesFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTransaccionesLocalesFacturas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTransaccionesLocalesFacturas"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTransaccionesLocalesFacturas";
		inputMap = this.jButtonNuevoRelacionesTransaccionesLocalesFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTransaccionesLocalesFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTransaccionesLocalesFacturas"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTransaccionesLocalesFacturas";
		inputMap = this.jButtonModificarTransaccionesLocalesFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTransaccionesLocalesFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTransaccionesLocalesFacturas"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTransaccionesLocalesFacturas";
		inputMap = this.jButtonCerrarTransaccionesLocalesFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTransaccionesLocalesFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTransaccionesLocalesFacturas"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTransaccionesLocalesFacturas";
		inputMap = this.jButtonGuardarCambiosTablaTransaccionesLocalesFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTransaccionesLocalesFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTransaccionesLocalesFacturas"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTransaccionesLocalesFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTransaccionesLocalesFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTransaccionesLocalesFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TransaccionesLocalesFacturas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TransaccionesLocalesFacturas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TransaccionesLocalesFacturas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TransaccionesLocalesFacturas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TransaccionesLocalesFacturas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTransaccionesLocalesFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTransaccionesLocalesFacturas.setName("jPanelParametrosReportesTransaccionesLocalesFacturas"); 
		
		this.jPanelParametrosReportesAccionesTransaccionesLocalesFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTransaccionesLocalesFacturas.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTransaccionesLocalesFacturas.setName("jPanelParametrosReportesAccionesTransaccionesLocalesFacturas"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTransaccionesLocalesFacturas = new JButtonMe();
		this.jButtonRecargarInformacionTransaccionesLocalesFacturas.setText("Buscar");
		this.jButtonRecargarInformacionTransaccionesLocalesFacturas.setToolTipText("Buscar"+" "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTransaccionesLocalesFacturas,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionTransaccionesLocalesFacturas.setVisible(false);
		
		
		this.jButtonProcesarInformacionTransaccionesLocalesFacturas = new JButtonMe();
		this.jButtonProcesarInformacionTransaccionesLocalesFacturas.setText("Procesar");
		this.jButtonProcesarInformacionTransaccionesLocalesFacturas.setToolTipText("Procesar"+" "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTransaccionesLocalesFacturas.setVisible(false);
			
		this.jButtonProcesarInformacionTransaccionesLocalesFacturas.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTransaccionesLocalesFacturas.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTransaccionesLocalesFacturas.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTransaccionesLocalesFacturas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTransaccionesLocalesFacturas.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTransaccionesLocalesFacturas.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTransaccionesLocalesFacturas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTransaccionesLocalesFacturas.setText("TIPO");       
		this.jComboBoxTiposReportesTransaccionesLocalesFacturas.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTransaccionesLocalesFacturas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTransaccionesLocalesFacturas.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTransaccionesLocalesFacturas.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTransaccionesLocalesFacturas = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTransaccionesLocalesFacturas.setText("Paginacion");
		this.jComboBoxTiposPaginacionTransaccionesLocalesFacturas.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTransaccionesLocalesFacturas = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTransaccionesLocalesFacturas.setText("Accion");
		this.jComboBoxTiposRelacionesTransaccionesLocalesFacturas.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTransaccionesLocalesFacturas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTransaccionesLocalesFacturas.setText("Accion");
		this.jComboBoxTiposAccionesTransaccionesLocalesFacturas.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTransaccionesLocalesFacturas = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTransaccionesLocalesFacturas.setText("Accion");
		this.jComboBoxTiposSeleccionarTransaccionesLocalesFacturas.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTransaccionesLocalesFacturas=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTransaccionesLocalesFacturas.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTransaccionesLocalesFacturas.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTransaccionesLocalesFacturas.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTransaccionesLocalesFacturas = new JLabelMe();
		
		this.jLabelAccionesTransaccionesLocalesFacturas.setText("Acciones");		
		this.jLabelAccionesTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTransaccionesLocalesFacturas = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTransaccionesLocalesFacturas.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTransaccionesLocalesFacturas.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTransaccionesLocalesFacturas = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTransaccionesLocalesFacturas.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTransaccionesLocalesFacturas.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTransaccionesLocalesFacturas = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTransaccionesLocalesFacturas.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTransaccionesLocalesFacturas.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTransaccionesLocalesFacturas = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTransaccionesLocalesFacturas.setText("Graf.");
		this.jCheckBoxConGraficoReporteTransaccionesLocalesFacturas.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTransaccionesLocalesFacturas = new JButtonMe();
		//this.jButtonAnterioresTransaccionesLocalesFacturas.setText("<<");
        this.jButtonAnterioresTransaccionesLocalesFacturas.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTransaccionesLocalesFacturas,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTransaccionesLocalesFacturas = new JButtonMe();
		//this.jButtonSiguientesTransaccionesLocalesFacturas.setText(">>");
        this.jButtonSiguientesTransaccionesLocalesFacturas.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTransaccionesLocalesFacturas,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTransaccionesLocalesFacturas = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTransaccionesLocalesFacturas.setText("Nue");
        this.jButtonNuevoGuardarCambiosTransaccionesLocalesFacturas.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTransaccionesLocalesFacturas,"nuevoguardarcambios_button","Nue",this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTransaccionesLocalesFacturas";
		inputMap = this.jButtonNuevoGuardarCambiosTransaccionesLocalesFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTransaccionesLocalesFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTransaccionesLocalesFacturas"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTransaccionesLocalesFacturas";
		inputMap = this.jButtonRecargarInformacionTransaccionesLocalesFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTransaccionesLocalesFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTransaccionesLocalesFacturas"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTransaccionesLocalesFacturas";
		inputMap = this.jButtonSiguientesTransaccionesLocalesFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTransaccionesLocalesFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTransaccionesLocalesFacturas"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTransaccionesLocalesFacturas";
		inputMap = this.jButtonAnterioresTransaccionesLocalesFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTransaccionesLocalesFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTransaccionesLocalesFacturas"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTransaccionesLocalesFacturas();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTransaccionesLocalesFacturas.setMinimumSize(new Dimension(this.getWidth(),TransaccionesLocalesFacturasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TransaccionesLocalesFacturasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTransaccionesLocalesFacturas.setMaximumSize(new Dimension(this.getWidth(),TransaccionesLocalesFacturasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TransaccionesLocalesFacturasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTransaccionesLocalesFacturas.setPreferredSize(new Dimension(this.getWidth(),TransaccionesLocalesFacturasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TransaccionesLocalesFacturasBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTransaccionesLocalesFacturas = new GridBagLayout();

			this.jPanelPaginacionTransaccionesLocalesFacturas.setLayout(gridaBagLayoutPaginacionTransaccionesLocalesFacturas);						
			
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTransaccionesLocalesFacturas.add(this.jButtonAnterioresTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
					
						
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
			
			this.jPanelPaginacionTransaccionesLocalesFacturas.add(this.jButtonNuevoGuardarCambiosTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
						
			
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
			this.jPanelPaginacionTransaccionesLocalesFacturas.add(this.jButtonSiguientesTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 1;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransaccionesLocalesFacturas.add(this.jButtonNuevoTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
						
			
			
			if(!this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
				this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 1;
				this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTransaccionesLocalesFacturas.add(this.jButtonGuardarCambiosTablaTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
			}
			
			
			
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 1;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransaccionesLocalesFacturas.add(this.jButtonDuplicarTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
			
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 1;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransaccionesLocalesFacturas.add(this.jButtonCopiarTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
		
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 1;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransaccionesLocalesFacturas.add(this.jButtonVerFormTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
		
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 1;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTransaccionesLocalesFacturas.add(this.jButtonCerrarTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
		
		
		
		this.jButtonRecargarInformacionTransaccionesLocalesFacturas.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTransaccionesLocalesFacturas.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTransaccionesLocalesFacturas.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTransaccionesLocalesFacturas.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTransaccionesLocalesFacturas.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTransaccionesLocalesFacturas.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTransaccionesLocalesFacturas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTransaccionesLocalesFacturas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTransaccionesLocalesFacturas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTransaccionesLocalesFacturas.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTransaccionesLocalesFacturas.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTransaccionesLocalesFacturas.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTransaccionesLocalesFacturas.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTransaccionesLocalesFacturas.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTransaccionesLocalesFacturas.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTransaccionesLocalesFacturas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTransaccionesLocalesFacturas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTransaccionesLocalesFacturas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTransaccionesLocalesFacturas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransaccionesLocalesFacturas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransaccionesLocalesFacturas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTransaccionesLocalesFacturas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTransaccionesLocalesFacturas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTransaccionesLocalesFacturas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTransaccionesLocalesFacturas.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTransaccionesLocalesFacturas.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTransaccionesLocalesFacturas.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTransaccionesLocalesFacturas.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTransaccionesLocalesFacturas.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTransaccionesLocalesFacturas.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTransaccionesLocalesFacturas.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTransaccionesLocalesFacturas.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTransaccionesLocalesFacturas.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTransaccionesLocalesFacturas.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTransaccionesLocalesFacturas.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTransaccionesLocalesFacturas.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTransaccionesLocalesFacturas = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTransaccionesLocalesFacturas = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TransaccionesLocalesFacturas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TransaccionesLocalesFacturas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TransaccionesLocalesFacturas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TransaccionesLocalesFacturas = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTransaccionesLocalesFacturas.setLayout(gridaBagParametrosReportesTransaccionesLocalesFacturas);
			this.jPanelParametrosReportesAccionesTransaccionesLocalesFacturas.setLayout(gridaBagParametrosReportesAccionesTransaccionesLocalesFacturas);
			
			
			this.jPanelParametrosAuxiliar1TransaccionesLocalesFacturas.setLayout(gridaBagParametrosAuxiliar1TransaccionesLocalesFacturas);
			this.jPanelParametrosAuxiliar2TransaccionesLocalesFacturas.setLayout(gridaBagParametrosAuxiliar2TransaccionesLocalesFacturas);
			this.jPanelParametrosAuxiliar3TransaccionesLocalesFacturas.setLayout(gridaBagParametrosAuxiliar3TransaccionesLocalesFacturas);
			this.jPanelParametrosAuxiliar4TransaccionesLocalesFacturas.setLayout(gridaBagParametrosAuxiliar4TransaccionesLocalesFacturas);
			//this.jPanelParametrosAuxiliar5TransaccionesLocalesFacturas.setLayout(gridaBagParametrosAuxiliar2TransaccionesLocalesFacturas);			
			
			
			
			
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransaccionesLocalesFacturas.add(this.jButtonRecargarInformacionTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TransaccionesLocalesFacturas.add(this.jComboBoxTiposPaginacionTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TransaccionesLocalesFacturas.add(this.jCheckBoxConAltoMaximoTablaTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TransaccionesLocalesFacturas.add(this.jComboBoxTiposArchivosReportesTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransaccionesLocalesFacturas.add(this.jPanelParametrosAuxiliar1TransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TransaccionesLocalesFacturas.add(this.jComboBoxTiposReportesTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);																		
			
			
			
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4TransaccionesLocalesFacturas.add(this.jComboBoxTiposGraficosReportesTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransaccionesLocalesFacturas.add(this.jPanelParametrosAuxiliar4TransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransaccionesLocalesFacturas.add(this.jComboBoxTiposReportesTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransaccionesLocalesFacturas.add(this.jCheckBoxGenerarReporteTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransaccionesLocalesFacturas.add(this.jPanelParametrosAuxiliar2TransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransaccionesLocalesFacturas.add(this.jLabelAccionesTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
				this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTransaccionesLocalesFacturas.add(this.jButtonAbrirOrderByTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransaccionesLocalesFacturas.add(this.jComboBoxTiposSeleccionarTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);			
			
			
			/*
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransaccionesLocalesFacturas.add(this.jCheckBoxSeleccionarTodosTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
			
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransaccionesLocalesFacturas.add(this.jCheckBoxConGraficoReporteTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TransaccionesLocalesFacturas.add(this.jCheckBoxSeleccionarTodosTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);															
				
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TransaccionesLocalesFacturas.add(this.jCheckBoxSeleccionadosTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);															
			
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TransaccionesLocalesFacturas.add(this.jCheckBoxConGraficoReporteTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransaccionesLocalesFacturas.add(this.jPanelParametrosAuxiliar3TransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransaccionesLocalesFacturas.add(this.jComboBoxTiposAccionesTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTransaccionesLocalesFacturas = new GridBagLayout();

			this.jScrollPanelDatosTransaccionesLocalesFacturas.setLayout(gridaBagLayoutDatosTransaccionesLocalesFacturas);
			
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 0;
			
			this.jScrollPanelDatosTransaccionesLocalesFacturas.add(this.jTableDatosTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTransaccionesLocalesFacturas.setViewportView(this.jTableDatosTransaccionesLocalesFacturas);
		this.jTableDatosTransaccionesLocalesFacturas.setFillsViewportHeight(true);
		this.jTableDatosTransaccionesLocalesFacturas.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTransaccionesLocalesFacturas= new GridBagLayout();
		this.jPanelAccionesTransaccionesLocalesFacturas.setLayout(gridaBagLayoutAccionesTransaccionesLocalesFacturas);
		
		
		/*	
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 0;
			
		this.jPanelAccionesTransaccionesLocalesFacturas.add(this.jButtonNuevoTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas= new GridBagLayout();
		gridaBagLayoutBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.setLayout(gridaBagLayoutBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas);

		gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
		gridBagConstraintsTransaccionesLocalesFacturas.gridx = 0;
		jPanelBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.add(jLabelid_ejercicioBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas, gridBagConstraintsTransaccionesLocalesFacturas);

		gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
		gridBagConstraintsTransaccionesLocalesFacturas.gridx = 1;
		jPanelBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.add(jComboBoxid_ejercicioBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas, gridBagConstraintsTransaccionesLocalesFacturas);


		gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionesLocalesFacturas.gridy = 1;
		gridBagConstraintsTransaccionesLocalesFacturas.gridx = 0;
		jPanelBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.add(jLabelfecha_desdeBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas, gridBagConstraintsTransaccionesLocalesFacturas);

		gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionesLocalesFacturas.gridy = 1;
		gridBagConstraintsTransaccionesLocalesFacturas.gridx = 1;
		jPanelBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.add(jDateChooserfecha_desdeBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas, gridBagConstraintsTransaccionesLocalesFacturas);


		gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionesLocalesFacturas.gridy = 2;
		gridBagConstraintsTransaccionesLocalesFacturas.gridx = 0;
		jPanelBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.add(jLabelfecha_hastaBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas, gridBagConstraintsTransaccionesLocalesFacturas);

		gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionesLocalesFacturas.gridy = 2;
		gridBagConstraintsTransaccionesLocalesFacturas.gridx = 1;
		jPanelBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.add(jDateChooserfecha_hastaBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas, gridBagConstraintsTransaccionesLocalesFacturas);

		gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionesLocalesFacturas.gridy = 3;
		gridBagConstraintsTransaccionesLocalesFacturas.gridx =1;
		jPanelBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas.add(jButtonBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas, gridBagConstraintsTransaccionesLocalesFacturas);

		jTabbedPaneBusquedasTransaccionesLocalesFacturas.addTab("1.-Por Ejercicio Por Fecha Desde Por Fecha Hasta ", jPanelBusquedaTransaccionesLocalesFacturasTransaccionesLocalesFacturas);
		jTabbedPaneBusquedasTransaccionesLocalesFacturas.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTransaccionesLocalesFacturas = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTransaccionesLocalesFacturas);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();						
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 0;		
			//this.gridBagConstraintsTransaccionesLocalesFacturas.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 0;		
		//this.gridBagConstraintsTransaccionesLocalesFacturas.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTransaccionesLocalesFacturas);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 0;		
			this.gridBagConstraintsTransaccionesLocalesFacturas.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);								
		
		
		/*
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
		*/		
		
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx =0;
		this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTransaccionesLocalesFacturas.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
				
		
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TransaccionesLocalesFacturasJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTransaccionesLocalesFacturas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTransaccionesLocalesFacturas = new GridBagLayout();
			this.jPanelBusquedasParametrosTransaccionesLocalesFacturas.setLayout(gridaBagLayoutBusquedasParametrosTransaccionesLocalesFacturas);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTransaccionesLocalesFacturas=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTransaccionesLocalesFacturas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransaccionesLocalesFacturas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransaccionesLocalesFacturas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
			
			
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
		
			
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTransaccionesLocalesFacturas;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTransaccionesLocalesFacturas() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTransaccionesLocalesFacturas = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTransaccionesLocalesFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTransaccionesLocalesFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTransaccionesLocalesFacturas.setName("jPanelReporteDinamicoTransaccionesLocalesFacturas"); 
		
		this.jPanelReporteDinamicoTransaccionesLocalesFacturas.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTransaccionesLocalesFacturas.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTransaccionesLocalesFacturas.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTransaccionesLocalesFacturas.setLayout(gridaBagLayoutReporteDinamicoTransaccionesLocalesFacturas);
		
		
		this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTransaccionesLocalesFacturas = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTransaccionesLocalesFacturas= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.setResizable(true);
	    this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.setClosable(true);
	    this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTransaccionesLocalesFacturas.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTransaccionesLocalesFacturas.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTransaccionesLocalesFacturas.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTransaccionesLocalesFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transacciones Locales Facturases"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTransaccionesLocalesFacturas = new JLabelMe();

		this.jLabelColumnasSelectReporteTransaccionesLocalesFacturas.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTransaccionesLocalesFacturas.add(this.jLabelColumnasSelectReporteTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTransaccionesLocalesFacturas = new JList<Reporte>();
		this.jListColumnasSelectReporteTransaccionesLocalesFacturas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTransaccionesLocalesFacturas.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTransaccionesLocalesFacturas.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTransaccionesLocalesFacturas.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTransaccionesLocalesFacturas.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTransaccionesLocalesFacturas=new JScrollPane(this.jListColumnasSelectReporteTransaccionesLocalesFacturas);
			
			this.jScrollColumnasSelectReporteTransaccionesLocalesFacturas.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTransaccionesLocalesFacturas.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTransaccionesLocalesFacturas.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTransaccionesLocalesFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTransaccionesLocalesFacturas.add(this.jListColumnasSelectReporteTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
		this.jPanelReporteDinamicoTransaccionesLocalesFacturas.add(this.jScrollColumnasSelectReporteTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTransaccionesLocalesFacturas = new JLabelMe();

		this.jLabelRelacionesSelectReporteTransaccionesLocalesFacturas.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTransaccionesLocalesFacturas = new JList<Reporte>();
		this.jListRelacionesSelectReporteTransaccionesLocalesFacturas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTransaccionesLocalesFacturas.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTransaccionesLocalesFacturas.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTransaccionesLocalesFacturas.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTransaccionesLocalesFacturas.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTransaccionesLocalesFacturas=new JScrollPane(this.jListRelacionesSelectReporteTransaccionesLocalesFacturas);
			
			this.jScrollRelacionesSelectReporteTransaccionesLocalesFacturas.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTransaccionesLocalesFacturas.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTransaccionesLocalesFacturas.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTransaccionesLocalesFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTransaccionesLocalesFacturas = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTransaccionesLocalesFacturas = new JComboBoxMe();
		this.jListColumnasValoresGraficoTransaccionesLocalesFacturas = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTransaccionesLocalesFacturas = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTransaccionesLocalesFacturas.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTransaccionesLocalesFacturas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTransaccionesLocalesFacturas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTransaccionesLocalesFacturas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTransaccionesLocalesFacturas = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTransaccionesLocalesFacturas.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTransaccionesLocalesFacturas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTransaccionesLocalesFacturas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTransaccionesLocalesFacturas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoTransaccionesLocalesFacturas = new JLabelMe();

		this.jLabelConGraficoDinamicoTransaccionesLocalesFacturas.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTransaccionesLocalesFacturas.add(this.jLabelConGraficoDinamicoTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoTransaccionesLocalesFacturas = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoTransaccionesLocalesFacturas.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoTransaccionesLocalesFacturas.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoTransaccionesLocalesFacturas.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTransaccionesLocalesFacturas.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTransaccionesLocalesFacturas.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransaccionesLocalesFacturas.add(this.jCheckBoxConGraficoDinamicoTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoTransaccionesLocalesFacturas = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoTransaccionesLocalesFacturas.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTransaccionesLocalesFacturas.add(this.jLabelColumnaCategoriaGraficoTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoTransaccionesLocalesFacturas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTransaccionesLocalesFacturas.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoTransaccionesLocalesFacturas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoTransaccionesLocalesFacturas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTransaccionesLocalesFacturas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTransaccionesLocalesFacturas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoTransaccionesLocalesFacturas.add(this.jComboBoxColumnaCategoriaGraficoTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorTransaccionesLocalesFacturas = new JLabelMe();

		this.jLabelColumnaCategoriaValorTransaccionesLocalesFacturas.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransaccionesLocalesFacturas.add(this.jLabelColumnaCategoriaValorTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorTransaccionesLocalesFacturas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorTransaccionesLocalesFacturas.setText("Accion");
        this.jComboBoxColumnaCategoriaValorTransaccionesLocalesFacturas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorTransaccionesLocalesFacturas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTransaccionesLocalesFacturas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTransaccionesLocalesFacturas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoTransaccionesLocalesFacturas.add(this.jComboBoxColumnaCategoriaValorTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoTransaccionesLocalesFacturas = new JLabelMe();

		this.jLabelColumnasValoresGraficoTransaccionesLocalesFacturas.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransaccionesLocalesFacturas.add(this.jLabelColumnasValoresGraficoTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoTransaccionesLocalesFacturas = new JList<Reporte>();
		this.jListColumnasValoresGraficoTransaccionesLocalesFacturas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoTransaccionesLocalesFacturas.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoTransaccionesLocalesFacturas.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTransaccionesLocalesFacturas.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTransaccionesLocalesFacturas.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoTransaccionesLocalesFacturas=new JScrollPane(this.jListColumnasValoresGraficoTransaccionesLocalesFacturas);
			
			this.jScrollColumnasValoresGraficoTransaccionesLocalesFacturas.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTransaccionesLocalesFacturas.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTransaccionesLocalesFacturas.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoTransaccionesLocalesFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoTransaccionesLocalesFacturas.add(this.jListColumnasSelectReporteTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
		this.jPanelReporteDinamicoTransaccionesLocalesFacturas.add(this.jScrollColumnasValoresGraficoTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoTransaccionesLocalesFacturas = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoTransaccionesLocalesFacturas.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransaccionesLocalesFacturas.add(this.jLabelTiposGraficosReportesDinamicoTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoTransaccionesLocalesFacturas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTransaccionesLocalesFacturas.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoTransaccionesLocalesFacturas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoTransaccionesLocalesFacturas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTransaccionesLocalesFacturas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTransaccionesLocalesFacturas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransaccionesLocalesFacturas.add(this.jComboBoxTiposGraficosReportesDinamicoTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTransaccionesLocalesFacturas = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTransaccionesLocalesFacturas.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransaccionesLocalesFacturas.add(this.jLabelGenerarExcelReporteDinamicoTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTransaccionesLocalesFacturas = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTransaccionesLocalesFacturas.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTransaccionesLocalesFacturas,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTransaccionesLocalesFacturas.setToolTipText("Generar EXCEL"+" "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTransaccionesLocalesFacturas.add(this.jButtonGenerarExcelReporteDinamicoTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransaccionesLocalesFacturas.add(this.jComboBoxTiposReportesDinamicoTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTransaccionesLocalesFacturas = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTransaccionesLocalesFacturas.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransaccionesLocalesFacturas.add(this.jLabelTiposArchivoReporteDinamicoTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransaccionesLocalesFacturas.add(this.jComboBoxTiposArchivosReportesDinamicoTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTransaccionesLocalesFacturas = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTransaccionesLocalesFacturas.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTransaccionesLocalesFacturas,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTransaccionesLocalesFacturas.setToolTipText("Generar"+" "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransaccionesLocalesFacturas.add(this.jButtonGenerarReporteDinamicoTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTransaccionesLocalesFacturas = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTransaccionesLocalesFacturas.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTransaccionesLocalesFacturas,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTransaccionesLocalesFacturas.setToolTipText("Cancelar"+" "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransaccionesLocalesFacturas.add(this.jButtonCerrarReporteDinamicoTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTransaccionesLocalesFacturas = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTransaccionesLocalesFacturas= new JScrollPane(jPanelReporteDinamicoTransaccionesLocalesFacturas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTransaccionesLocalesFacturas.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTransaccionesLocalesFacturas.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTransaccionesLocalesFacturas.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTransaccionesLocalesFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transacciones Locales Facturases"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTransaccionesLocalesFacturas);
		this.jInternalFrameReporteDinamicoTransaccionesLocalesFacturas.getContentPane().add(this.jScrollPanelReporteDinamicoTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTransaccionesLocalesFacturas() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTransaccionesLocalesFacturas = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTransaccionesLocalesFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTransaccionesLocalesFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTransaccionesLocalesFacturas.setName("jPanelImportacionTransaccionesLocalesFacturas"); 
		
		this.jPanelImportacionTransaccionesLocalesFacturas.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTransaccionesLocalesFacturas.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTransaccionesLocalesFacturas.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTransaccionesLocalesFacturas.setLayout(gridaBagLayoutImportacionTransaccionesLocalesFacturas);
		
		
		this.jInternalFrameImportacionTransaccionesLocalesFacturas= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTransaccionesLocalesFacturas= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTransaccionesLocalesFacturas = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTransaccionesLocalesFacturas= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTransaccionesLocalesFacturas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTransaccionesLocalesFacturas.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTransaccionesLocalesFacturas.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTransaccionesLocalesFacturas.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTransaccionesLocalesFacturas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTransaccionesLocalesFacturas.setResizable(true);
	    this.jInternalFrameImportacionTransaccionesLocalesFacturas.setClosable(true);
	    this.jInternalFrameImportacionTransaccionesLocalesFacturas.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTransaccionesLocalesFacturas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTransaccionesLocalesFacturas.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTransaccionesLocalesFacturas.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTransaccionesLocalesFacturas.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTransaccionesLocalesFacturas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTransaccionesLocalesFacturas.setResizable(true);
	    this.jInternalFrameImportacionTransaccionesLocalesFacturas.setClosable(true);
	    this.jInternalFrameImportacionTransaccionesLocalesFacturas.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTransaccionesLocalesFacturas.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTransaccionesLocalesFacturas.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTransaccionesLocalesFacturas.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTransaccionesLocalesFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transacciones Locales Facturases"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTransaccionesLocalesFacturas = new JLabelMe();

		this.jLabelArchivoImportacionTransaccionesLocalesFacturas.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iPosYImportacion;		
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTransaccionesLocalesFacturas.add(this.jLabelArchivoImportacionTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTransaccionesLocalesFacturas = new JFileChooser();		
		this.jFileChooserImportacionTransaccionesLocalesFacturas.setToolTipText("ESCOGER ARCHIVO"+" "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTransaccionesLocalesFacturas = new JButtonMe();
		this.jButtonAbrirImportacionTransaccionesLocalesFacturas.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTransaccionesLocalesFacturas,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTransaccionesLocalesFacturas.setToolTipText("Generar"+" "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iPosYImportacion;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransaccionesLocalesFacturas.add(this.jButtonAbrirImportacionTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTransaccionesLocalesFacturas = new JLabelMe();

		this.jLabelPathArchivoImportacionTransaccionesLocalesFacturas.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iPosYImportacion;		
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTransaccionesLocalesFacturas.add(this.jLabelPathArchivoImportacionTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTransaccionesLocalesFacturas=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTransaccionesLocalesFacturas.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTransaccionesLocalesFacturas.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTransaccionesLocalesFacturas.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iPosYImportacion;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransaccionesLocalesFacturas.add(this.jTextFieldPathArchivoImportacionTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTransaccionesLocalesFacturas = new JButtonMe();
		this.jButtonGenerarImportacionTransaccionesLocalesFacturas.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTransaccionesLocalesFacturas,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTransaccionesLocalesFacturas.setToolTipText("Generar"+" "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iPosYImportacion;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransaccionesLocalesFacturas.add(this.jButtonGenerarImportacionTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTransaccionesLocalesFacturas = new JButtonMe();
		this.jButtonCerrarImportacionTransaccionesLocalesFacturas.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTransaccionesLocalesFacturas,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTransaccionesLocalesFacturas.setToolTipText("Cancelar"+" "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iPosYImportacion;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransaccionesLocalesFacturas.add(this.jButtonCerrarImportacionTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTransaccionesLocalesFacturas = new GridBagLayout();
		
		this.jScrollPanelImportacionTransaccionesLocalesFacturas= new JScrollPane(jPanelImportacionTransaccionesLocalesFacturas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy =iPosYImportacion;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx =iPosXImportacion;
		this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTransaccionesLocalesFacturas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTransaccionesLocalesFacturas.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTransaccionesLocalesFacturas);
		this.jInternalFrameImportacionTransaccionesLocalesFacturas.getContentPane().add(this.jScrollPanelImportacionTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTransaccionesLocalesFacturas(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTransaccionesLocalesFacturas = new JButtonMe();
			this.jButtonAbrirOrderByTransaccionesLocalesFacturas.setText("Orden");
			this.jButtonAbrirOrderByTransaccionesLocalesFacturas.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTransaccionesLocalesFacturas,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTransaccionesLocalesFacturas";
			inputMap = this.jButtonAbrirOrderByTransaccionesLocalesFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTransaccionesLocalesFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTransaccionesLocalesFacturas"));
		
		
			GridBagLayout gridaBagLayoutOrderByTransaccionesLocalesFacturas = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTransaccionesLocalesFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTransaccionesLocalesFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTransaccionesLocalesFacturas.setName("jPanelOrderByTransaccionesLocalesFacturas"); 
			
			this.jPanelOrderByTransaccionesLocalesFacturas.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTransaccionesLocalesFacturas.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTransaccionesLocalesFacturas.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTransaccionesLocalesFacturas.setLayout(gridaBagLayoutOrderByTransaccionesLocalesFacturas);
			
			
			this.jTableDatosTransaccionesLocalesFacturasOrderBy = new JTableMe();        
			this.jTableDatosTransaccionesLocalesFacturasOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTransaccionesLocalesFacturasOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTransaccionesLocalesFacturasOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTransaccionesLocalesFacturasOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTransaccionesLocalesFacturasOrderBy.setViewportView(this.jTableDatosTransaccionesLocalesFacturasOrderBy);
			this.jTableDatosTransaccionesLocalesFacturasOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTransaccionesLocalesFacturasOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTransaccionesLocalesFacturas= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTransaccionesLocalesFacturas= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTransaccionesLocalesFacturas = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTransaccionesLocalesFacturas= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTransaccionesLocalesFacturas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTransaccionesLocalesFacturas.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTransaccionesLocalesFacturas.setTitle("Orden");
			this.jInternalFrameOrderByTransaccionesLocalesFacturas.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTransaccionesLocalesFacturas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTransaccionesLocalesFacturas.setResizable(true);
			this.jInternalFrameOrderByTransaccionesLocalesFacturas.setClosable(true);
			this.jInternalFrameOrderByTransaccionesLocalesFacturas.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTransaccionesLocalesFacturas.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTransaccionesLocalesFacturas.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTransaccionesLocalesFacturas.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTransaccionesLocalesFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transacciones Locales Facturases"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx =iPosXOrderBy;
			this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTransaccionesLocalesFacturas.ipady =150;
				
			this.jPanelOrderByTransaccionesLocalesFacturas.add(jScrollPanelDatosTransaccionesLocalesFacturasOrderBy, this.gridBagConstraintsTransaccionesLocalesFacturas);//this.jTableDatosTransaccionesLocalesFacturasTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTransaccionesLocalesFacturas = new JButtonMe();
			this.jButtonCerrarOrderByTransaccionesLocalesFacturas.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTransaccionesLocalesFacturas,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTransaccionesLocalesFacturas.setToolTipText("Cancelar"+" "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTransaccionesLocalesFacturas.add(this.jButtonCerrarOrderByTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTransaccionesLocalesFacturas = new GridBagLayout();
			
			this.jScrollPanelOrderByTransaccionesLocalesFacturas= new JScrollPane(jPanelOrderByTransaccionesLocalesFacturas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy =iPosYOrderBy;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx =iPosXOrderBy;
			this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTransaccionesLocalesFacturas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTransaccionesLocalesFacturas.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTransaccionesLocalesFacturas);
			
			this.jInternalFrameOrderByTransaccionesLocalesFacturas.getContentPane().add(this.jScrollPanelOrderByTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);			
		
		} else {
			this.jButtonAbrirOrderByTransaccionesLocalesFacturas = new JButtonMe();
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
		int iWidthTableCalculado=0;//2130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.transaccioneslocalesfacturasSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTransaccionesLocalesFacturas.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTransaccionesLocalesFacturas.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTransaccionesLocalesFacturas.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosTransaccionesLocalesFacturas.getRowHeight();//TransaccionesLocalesFacturasConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TransaccionesLocalesFacturasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTransaccionesLocalesFacturas.isSelected()) {
					iHeightTable=TransaccionesLocalesFacturasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TransaccionesLocalesFacturasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TransaccionesLocalesFacturasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TransaccionesLocalesFacturasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTransaccionesLocalesFacturas.isSelected()) {
					iHeightTable=TransaccionesLocalesFacturasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TransaccionesLocalesFacturasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TransaccionesLocalesFacturasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTransaccionesLocalesFacturas.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTransaccionesLocalesFacturas.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTransaccionesLocalesFacturas.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTransaccionesLocalesFacturas.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTransaccionesLocalesFacturas.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTransaccionesLocalesFacturas.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTransaccionesLocalesFacturas!=null && this.jInternalFrameOrderByTransaccionesLocalesFacturas.getjTableDatosOrderBy()!=null) {
			//if(!this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTransaccionesLocalesFacturas.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTransaccionesLocalesFacturas.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTransaccionesLocalesFacturas.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTransaccionesLocalesFacturas.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTransaccionesLocalesFacturas.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTransaccionesLocalesFacturas.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTransaccionesLocalesFacturas.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTransaccionesLocalesFacturas.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTransaccionesLocalesFacturas.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTransaccionesLocalesFacturas.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=transaccioneslocalesfacturasLogic.getTransaccionesLocalesFacturass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=transaccioneslocalesfacturass.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TransaccionesLocalesFacturas> TraerTransaccionesLocalesFacturasBeans(List<TransaccionesLocalesFacturas> transaccioneslocalesfacturass,ArrayList<Classe> classes)throws Exception {
		try {
			for(TransaccionesLocalesFacturas transaccioneslocalesfacturas:transaccioneslocalesfacturass) {
					
				if(!(TransaccionesLocalesFacturasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TransaccionesLocalesFacturasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					transaccioneslocalesfacturas.setsDetalleGeneralEntityReporte(TransaccionesLocalesFacturasConstantesFunciones.getTransaccionesLocalesFacturasDescripcion(transaccioneslocalesfacturas));
										
						
					
						
					
				} else  {
							
					//transaccioneslocalesfacturas.setsDetalleGeneralEntityReporte(transaccioneslocalesfacturas.getsDetalleGeneralEntityReporte());
										
				}
				
				//transaccioneslocalesfacturasbeans.add(transaccioneslocalesfacturasbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return transaccioneslocalesfacturass;
    }
	//PARA REPORTES FIN
}
