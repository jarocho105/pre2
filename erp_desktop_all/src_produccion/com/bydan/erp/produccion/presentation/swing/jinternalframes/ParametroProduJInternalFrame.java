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
package com.bydan.erp.produccion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

//import com.bydan.erp.produccion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.produccion.util.ParametroProduConstantesFunciones;

import com.bydan.erp.produccion.business.logic.*;
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
public class ParametroProduJInternalFrame extends ParametroProduBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarParametroProdu;
	
	protected JMenuBar jmenuBarParametroProdu;
	
	protected JMenu jmenuParametroProdu;
	protected JMenu jmenuDatosParametroProdu;
	protected JMenu jmenuArchivoParametroProdu;
	protected JMenu jmenuAccionesParametroProdu;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosParametroProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroProdu;	
	protected GridBagConstraints gridBagConstraintsParametroProdu;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ParametroProduDetalleFormJInternalFrame jInternalFrameDetalleFormParametroProdu;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoParametroProdu;	
	protected ImportacionJInternalFrame jInternalFrameImportacionParametroProdu;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected BodegaBeanSwingJInternalFrame bodegamateriaprimaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodegamateriaprima="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected TransaccionBeanSwingJInternalFrame transaccionegresoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccionegreso="";
	
	public ParametroProduSessionBean parametroproduSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public BodegaSessionBean bodegamateriaprimaSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public TransaccionSessionBean transaccionegresoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ParametroProdu> parametroprodus;		
	public List<ParametroProdu> parametroprodusEliminados;	
	public List<ParametroProdu> parametroprodusAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByParametroProdu;		
	protected JButton jButtonAbrirOrderByParametroProdu;
	
	
	//protected JPanel jPanelOrderByParametroProdu;
	//public JScrollPane jScrollPanelOrderByParametroProdu;	
	//protected JButton jButtonCerrarOrderByParametroProdu;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ParametroProduLogic parametroproduLogic;
	
	
	
	public JScrollPane jScrollPanelDatosParametroProdu;
	public JScrollPane jScrollPanelDatosEdicionParametroProdu;
	public JScrollPane jScrollPanelDatosGeneralParametroProdu;
    
	
	
	//public JScrollPane jScrollPanelDatosParametroProduOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoParametroProdu;
	//public JScrollPane jScrollPanelImportacionParametroProdu;
	
	
	
	protected JPanel jPanelAccionesParametroProdu;
	
    protected JPanel jPanelPaginacionParametroProdu;
    protected JPanel jPanelParametrosReportesParametroProdu;
	protected JPanel jPanelParametrosReportesAccionesParametroProdu;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ParametroProdu;
	protected JPanel jPanelParametrosAuxiliar2ParametroProdu;
	protected JPanel jPanelParametrosAuxiliar3ParametroProdu;
	protected JPanel jPanelParametrosAuxiliar4ParametroProdu;
	//protected JPanel jPanelParametrosAuxiliar5ParametroProdu;
	
	
	
	//protected JPanel jPanelReporteDinamicoParametroProdu;
	//protected JPanel jPanelImportacionParametroProdu;
	
	
	public JTable jTableDatosParametroProdu;
	
	
	
	//public JTable jTableDatosParametroProduOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoParametroProdu;
	protected JButton jButtonDuplicarParametroProdu;
	protected JButton jButtonCopiarParametroProdu;
	protected JButton jButtonVerFormParametroProdu;
	protected JButton jButtonNuevoRelacionesParametroProdu;
	protected JButton jButtonModificarParametroProdu;
	
    protected JButton jButtonGuardarCambiosTablaParametroProdu;
	protected JButton jButtonCerrarParametroProdu;
	
	
	protected JButton jButtonRecargarInformacionParametroProdu;
	protected JButton jButtonProcesarInformacionParametroProdu;
	
	
	protected JButton jButtonAnterioresParametroProdu;
	protected JButton jButtonSiguientesParametroProdu;
	protected JButton jButtonNuevoGuardarCambiosParametroProdu;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoParametroProdu;
	//protected JButton jButtonCerrarReporteDinamicoParametroProdu;
	//protected JButton jButtonGenerarExcelReporteDinamicoParametroProdu;	
	
	
	
	//protected JButton jButtonAbrirImportacionParametroProdu;
	//protected JButton jButtonGenerarImportacionParametroProdu;
	//protected JButton jButtonCerrarImportacionParametroProdu;
	//protected JFileChooser jFileChooserImportacionParametroProdu;
	//protected File fileImportacionParametroProdu;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroProdu;
	protected JButton jButtonDuplicarToolBarParametroProdu;
	protected JButton jButtonNuevoRelacionesToolBarParametroProdu;
	
	
	public JButton jButtonGuardarCambiosToolBarParametroProdu;
	protected JButton jButtonCopiarToolBarParametroProdu;
	protected JButton jButtonVerFormToolBarParametroProdu;
	public JButton jButtonGuardarCambiosTablaToolBarParametroProdu;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroProdu;
	protected JButton jButtonCerrarToolBarParametroProdu;
	
	protected JButton jButtonRecargarInformacionToolBarParametroProdu;
	protected JButton jButtonProcesarInformacionToolBarParametroProdu;
	protected JButton jButtonAnterioresToolBarParametroProdu;
	protected JButton jButtonSiguientesToolBarParametroProdu;
	protected JButton jButtonNuevoGuardarCambiosToolBarParametroProdu;
	protected JButton jButtonAbrirOrderByToolBarParametroProdu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroProdu;
	protected JMenuItem jMenuItemDuplicarParametroProdu;
	protected JMenuItem jMenuItemNuevoRelacionesParametroProdu;
	
	
	protected JMenuItem jMenuItemGuardarCambiosParametroProdu;
	protected JMenuItem jMenuItemCopiarParametroProdu;
	protected JMenuItem jMenuItemVerFormParametroProdu;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroProdu;
	protected JMenuItem jMenuItemCerrarParametroProdu;
	protected JMenuItem jMenuItemDetalleCerrarParametroProdu;
	protected JMenuItem jMenuItemDetalleAbrirOrderByParametroProdu;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroProdu;
	
	protected JMenuItem jMenuItemRecargarInformacionParametroProdu;
	protected JMenuItem jMenuItemProcesarInformacionParametroProdu;
	protected JMenuItem jMenuItemAnterioresParametroProdu;
	protected JMenuItem jMenuItemSiguientesParametroProdu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroProdu;
	protected JMenuItem jMenuItemAbrirOrderByParametroProdu;
	protected JMenuItem jMenuItemMostrarOcultarParametroProdu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroProdu;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosParametroProdu;
	protected JCheckBox jCheckBoxSeleccionadosParametroProdu;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaParametroProdu;
	protected JCheckBox jCheckBoxConGraficoReporteParametroProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesParametroProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesParametroProdu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoParametroProdu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoParametroProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesParametroProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionParametroProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarParametroProdu;
	protected JTextField jTextFieldValorCampoGeneralParametroProdu;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteParametroProdu;
	//public JList<Reporte> jListColumnasSelectReporteParametroProdu;
	//public JScrollPane jScrollColumnasSelectReporteParametroProdu;
	
	//public JLabel jLabelRelacionesSelectReporteParametroProdu;
	//public JList<Reporte> jListRelacionesSelectReporteParametroProdu;
	//public JScrollPane jScrollRelacionesSelectReporteParametroProdu;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoParametroProdu;
	//protected JCheckBox jCheckBoxConGraficoDinamicoParametroProdu;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoParametroProdu;
	//public JLabel jLabelTiposArchivoReporteDinamicoParametroProdu;
	
		
	//public JLabel jLabelArchivoImportacionParametroProdu;	
	//public JLabel jLabelPathArchivoImportacionParametroProdu;
	//protected JTextField jTextFieldPathArchivoImportacionParametroProdu;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoParametroProdu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoParametroProdu;
	
	//public JLabel jLabelColumnaCategoriaValorParametroProdu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorParametroProdu;
	
	//public JLabel jLabelColumnasValoresGraficoParametroProdu;
	//public JList<Reporte> jListColumnasValoresGraficoParametroProdu;
	//public JScrollPane jScrollColumnasValoresGraficoParametroProdu;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoParametroProdu;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoParametroProdu;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasParametroProdu;
	public JPanel jPanelFK_IdBodegaParametroProdu;
	public JButton jButtonFK_IdBodegaParametroProdu;
	public JPanel jPanelFK_IdBodegaMateriaPrimaParametroProdu;
	public JButton jButtonFK_IdBodegaMateriaPrimaParametroProdu;
	public JPanel jPanelFK_IdTransaccionParametroProdu;
	public JButton jButtonFK_IdTransaccionParametroProdu;
	public JPanel jPanelFK_IdTransaccionEgresoParametroProdu;
	public JButton jButtonFK_IdTransaccionEgresoParametroProdu;
	
	public JPanel jPanelid_bodegaFK_IdBodegaParametroProdu;
	public JLabel jLabelid_bodegaFK_IdBodegaParametroProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaParametroProdu;
	public JButton jButtonid_bodegaFK_IdBodegaParametroProdu= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaParametroProduUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaParametroProduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_bodega_materia_primaFK_IdBodegaMateriaPrimaParametroProdu;
	public JLabel jLabelid_bodega_materia_primaFK_IdBodegaMateriaPrimaParametroProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodega_materia_primaFK_IdBodegaMateriaPrimaParametroProdu;
	public JButton jButtonid_bodega_materia_primaFK_IdBodegaMateriaPrimaParametroProdu= new JButtonMe();
	public JButton jButtonid_bodega_materia_primaFK_IdBodegaMateriaPrimaParametroProduUpdate= new JButtonMe();
	public JButton jButtonid_bodega_materia_primaFK_IdBodegaMateriaPrimaParametroProduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccionFK_IdTransaccionParametroProdu;
	public JLabel jLabelid_transaccionFK_IdTransaccionParametroProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionFK_IdTransaccionParametroProdu;
	public JButton jButtonid_transaccionFK_IdTransaccionParametroProdu= new JButtonMe();
	public JButton jButtonid_transaccionFK_IdTransaccionParametroProduUpdate= new JButtonMe();
	public JButton jButtonid_transaccionFK_IdTransaccionParametroProduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccion_egresoFK_IdTransaccionEgresoParametroProdu;
	public JLabel jLabelid_transaccion_egresoFK_IdTransaccionEgresoParametroProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_egresoFK_IdTransaccionEgresoParametroProdu;
	public JButton jButtonid_transaccion_egresoFK_IdTransaccionEgresoParametroProdu= new JButtonMe();
	public JButton jButtonid_transaccion_egresoFK_IdTransaccionEgresoParametroProduUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_egresoFK_IdTransaccionEgresoParametroProduBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ParametroProduJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ParametroProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroProduJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroProduJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroProduJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionParametroProdu)	{
		this.jButtonRecargarInformacionParametroProdu = jButtonRecargarInformacionParametroProdu;
	}
	
	public JButton getjButtonProcesarInformacionParametroProdu() {
		return this.jButtonProcesarInformacionParametroProdu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroProdu)	{
		this.jButtonProcesarInformacionParametroProdu = jButtonProcesarInformacionParametroProdu;
	}
	
	
	public JButton getjButtonRecargarInformacionParametroProdu() {
		return this.jButtonRecargarInformacionParametroProdu;
	}
	
	
	public List<ParametroProdu> getparametroprodus() {
		return this.parametroprodus;
	}

	public void setparametroprodus(List<ParametroProdu> parametroprodus) {
		this.parametroprodus = parametroprodus;
	}
	
	public List<ParametroProdu> getparametroprodusAux() {
		return this.parametroprodusAux;
	}

	public void setparametroprodusAux(List<ParametroProdu> parametroprodusAux) {
		this.parametroprodusAux = parametroprodusAux;
	}
	
	public List<ParametroProdu> getparametroprodusEliminados() {
		return this.parametroprodusEliminados;
	}

	public void setParametroProdusEliminados(List<ParametroProdu> parametroprodusEliminados) {
		this.parametroprodusEliminados = parametroprodusEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarParametroProdu() {
		return jComboBoxTiposSeleccionarParametroProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarParametroProdu(
			JComboBox jComboBoxTiposSeleccionarParametroProdu) {
		this.jComboBoxTiposSeleccionarParametroProdu = jComboBoxTiposSeleccionarParametroProdu;
	}
	
	public void setBorderResaltarTiposSeleccionarParametroProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarParametroProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarParametroProdu .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralParametroProdu() {
		return jTextFieldValorCampoGeneralParametroProdu;
	}

	public void setjTextFieldValorCampoGeneralParametroProdu(
			JTextField jTextFieldValorCampoGeneralParametroProdu) {
		this.jTextFieldValorCampoGeneralParametroProdu = jTextFieldValorCampoGeneralParametroProdu;
	}

	public void setBorderResaltarValorCampoGeneralParametroProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroProdu.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralParametroProdu .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosParametroProdu() {
		return this.jCheckBoxSeleccionarTodosParametroProdu;
	}

	public void setjCheckBoxSeleccionarTodosParametroProdu(
			JCheckBox jCheckBoxSeleccionarTodosParametroProdu) {
		this.jCheckBoxSeleccionarTodosParametroProdu = jCheckBoxSeleccionarTodosParametroProdu;
	}

	public void setBorderResaltarSeleccionarTodosParametroProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroProdu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosParametroProdu .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosParametroProdu() {
		return this.jCheckBoxSeleccionadosParametroProdu;
	}

	public void setjCheckBoxSeleccionadosParametroProdu(
			JCheckBox jCheckBoxSeleccionadosParametroProdu) {
		this.jCheckBoxSeleccionadosParametroProdu = jCheckBoxSeleccionadosParametroProdu;
	}
	
	public void setBorderResaltarSeleccionadosParametroProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroProdu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosParametroProdu .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesParametroProdu() {
		return this.jComboBoxTiposArchivosReportesParametroProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesParametroProdu(
			JComboBox jComboBoxTiposArchivosReportesParametroProdu) {
		this.jComboBoxTiposArchivosReportesParametroProdu = jComboBoxTiposArchivosReportesParametroProdu;
	}

	public void setBorderResaltarTiposArchivosReportesParametroProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesParametroProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesParametroProdu() {
		return this.jComboBoxTiposReportesParametroProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesParametroProdu(
			JComboBox jComboBoxTiposReportesParametroProdu) {
		this.jComboBoxTiposReportesParametroProdu = jComboBoxTiposReportesParametroProdu;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoParametroProdu() {
	//	return jComboBoxTiposReportesDinamicoParametroProdu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoParametroProdu(
	//		JComboBox jComboBoxTiposReportesDinamicoParametroProdu) {
	//	this.jComboBoxTiposReportesDinamicoParametroProdu = jComboBoxTiposReportesDinamicoParametroProdu;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoParametroProdu() {
	//	return jComboBoxTiposArchivosReportesDinamicoParametroProdu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoParametroProdu(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoParametroProdu) {
	//	this.jComboBoxTiposArchivosReportesDinamicoParametroProdu = jComboBoxTiposArchivosReportesDinamicoParametroProdu;
	//}
	
	public void setBorderResaltarTiposReportesParametroProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesParametroProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesParametroProdu() {
		return this.jComboBoxTiposGraficosReportesParametroProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesParametroProdu(
			JComboBox jComboBoxTiposGraficosReportesParametroProdu) {
		this.jComboBoxTiposGraficosReportesParametroProdu = jComboBoxTiposGraficosReportesParametroProdu;
	}
	
	public void setBorderResaltarTiposGraficosReportesParametroProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesParametroProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionParametroProdu() {
		return this.jComboBoxTiposPaginacionParametroProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionParametroProdu(
			JComboBox jComboBoxTiposPaginacionParametroProdu) {
		this.jComboBoxTiposPaginacionParametroProdu = jComboBoxTiposPaginacionParametroProdu;
	}
	
	public void setBorderResaltarTiposPaginacionParametroProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionParametroProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesParametroProdu() {
		return this.jComboBoxTiposRelacionesParametroProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroProdu() {
		return this.jComboBoxTiposAccionesParametroProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroProdu(
			JComboBox jComboBoxTiposRelacionesParametroProdu) {
		this.jComboBoxTiposRelacionesParametroProdu = jComboBoxTiposRelacionesParametroProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroProdu(
			JComboBox jComboBoxTiposAccionesParametroProdu) {
		this.jComboBoxTiposAccionesParametroProdu = jComboBoxTiposAccionesParametroProdu;
	}
	
	public void setBorderResaltarTiposRelacionesParametroProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesParametroProdu .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesParametroProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesParametroProdu .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoParametroProdu() {
	//	return jCheckBoxConGraficoDinamicoParametroProdu;
	//}

	//public void setjCheckBoxConGraficoDinamicoParametroProdu(
	//		JCheckBox jCheckBoxConGraficoDinamicoParametroProdu) {
	//	this.jCheckBoxConGraficoDinamicoParametroProdu = jCheckBoxConGraficoDinamicoParametroProdu;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoParametroProdu() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarParametroProdu.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoParametroProdu .setBorder(borderResaltar);		
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
		this.parametroproduSessionBean=new ParametroProduSessionBean();
		
		this.parametroproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametroproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametroproduSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ParametroProduJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ParametroProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroProduJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroProduJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Produccion MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.parametroproduSessionBean.getEsGuardarRelacionado()) {
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
		
		ParametroProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ParametroProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarParametroProdu= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarParametroProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarParametroProdu,this.jTtoolBarParametroProdu,
							"nuevo","nuevo","Nuevo"+" "+ParametroProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarParametroProdu,this.jTtoolBarParametroProdu,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarParametroProdu,this.jTtoolBarParametroProdu,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ParametroProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarParametroProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarParametroProdu,this.jTtoolBarParametroProdu,
							"duplicar","duplicar","Duplicar"+" "+ParametroProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarParametroProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarParametroProdu,this.jTtoolBarParametroProdu,
							"copiar","copiar","Copiar"+" "+ParametroProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarParametroProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarParametroProdu,this.jTtoolBarParametroProdu,
							"ver_form","ver_form","Ver"+" "+ParametroProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarParametroProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroProdu,this.jTtoolBarParametroProdu,
							"recargar","recargar","Recargar"+" "+ParametroProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarParametroProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroProdu,this.jTtoolBarParametroProdu,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarParametroProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroProdu,this.jTtoolBarParametroProdu,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarParametroProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarParametroProdu,this.jTtoolBarParametroProdu,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarParametroProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarParametroProdu,this.jTtoolBarParametroProdu,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarParametroProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarParametroProdu,this.jTtoolBarParametroProdu,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ParametroProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarParametroProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarParametroProdu,this.jTtoolBarParametroProdu,
							"cerrar","cerrar","Salir"+" "+ParametroProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarParametroProdu=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarParametroProdu;
			
				this.jButtonProcesarInformacionToolBarParametroProdu=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarParametroProdu;
				
		//protected JButton jButtonModificarToolBarParametroProdu;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarParametroProdu=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuParametroProdu=new JMenuMe("General");
		this.jmenuArchivoParametroProdu=new JMenuMe("Archivo");
		this.jmenuAccionesParametroProdu=new JMenuMe("Acciones");
		this.jmenuDatosParametroProdu=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroProdu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroProdu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroProdu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarParametroProdu= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarParametroProdu.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarParametroProdu,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesParametroProdu= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesParametroProdu.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesParametroProdu,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosParametroProdu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroProdu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroProdu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarParametroProdu= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarParametroProdu.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarParametroProdu,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormParametroProdu= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormParametroProdu.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormParametroProdu,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaParametroProdu= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaParametroProdu.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaParametroProdu,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionParametroProdu= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionParametroProdu.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionParametroProdu,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionParametroProdu= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionParametroProdu.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionParametroProdu,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresParametroProdu= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresParametroProdu.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresParametroProdu,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesParametroProdu= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesParametroProdu.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesParametroProdu,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByParametroProdu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByParametroProdu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByParametroProdu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroProdu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByParametroProdu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByParametroProdu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByParametroProdu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroProdu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosParametroProdu= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosParametroProdu.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosParametroProdu,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoParametroProdu.add(this.jMenuItemCerrarParametroProdu);
			
			this.jmenuAccionesParametroProdu.add(this.jMenuItemNuevoParametroProdu);
			this.jmenuAccionesParametroProdu.add(this.jMenuItemNuevoGuardarCambiosParametroProdu);
			this.jmenuAccionesParametroProdu.add(this.jMenuItemNuevoRelacionesParametroProdu);
			this.jmenuAccionesParametroProdu.add(this.jMenuItemGuardarCambiosTablaParametroProdu);		
			this.jmenuAccionesParametroProdu.add(this.jMenuItemDuplicarParametroProdu);		
			this.jmenuAccionesParametroProdu.add(this.jMenuItemCopiarParametroProdu);		
			this.jmenuAccionesParametroProdu.add(this.jMenuItemVerFormParametroProdu);		
			
			this.jmenuDatosParametroProdu.add(this.jMenuItemRecargarInformacionParametroProdu);				
			this.jmenuDatosParametroProdu.add(this.jMenuItemAnterioresParametroProdu);				
			this.jmenuDatosParametroProdu.add(this.jMenuItemSiguientesParametroProdu);				
			this.jmenuDatosParametroProdu.add(this.jMenuItemAbrirOrderByParametroProdu);				
			this.jmenuDatosParametroProdu.add(this.jMenuItemMostrarOcultarParametroProdu);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesParametroProdu.add(this.jMenuItemGuardarCambiosParametroProdu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarParametroProdu.add(this.jmenuArchivoParametroProdu);		
			this.jmenuBarParametroProdu.add(this.jmenuAccionesParametroProdu);		
			this.jmenuBarParametroProdu.add(this.jmenuDatosParametroProdu);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarParametroProdu);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasParametroProdu() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaParametroProdu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaParametroProdu.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaParametroProdu= new JButtonMe();
		this.jButtonFK_IdBodegaParametroProdu.setText("Buscar");
		this.jButtonFK_IdBodegaParametroProdu.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaParametroProdu,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaParametroProdu = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaParametroProdu.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaParametroProdu.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaParametroProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaParametroProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaParametroProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaParametroProdu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaParametroProdu= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaParametroProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaParametroProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaParametroProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaParametroProdu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdBodegaMateriaPrimaParametroProdu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaMateriaPrimaParametroProdu.setToolTipText("Buscar Por Bodega Materia Prima ");
		this.jButtonFK_IdBodegaMateriaPrimaParametroProdu= new JButtonMe();
		this.jButtonFK_IdBodegaMateriaPrimaParametroProdu.setText("Buscar");
		this.jButtonFK_IdBodegaMateriaPrimaParametroProdu.setToolTipText("Buscar Por Bodega Materia Prima ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaMateriaPrimaParametroProdu,"buscar_button","Buscar Por Bodega Materia Prima ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaMateriaPrimaParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodega_materia_primaFK_IdBodegaMateriaPrimaParametroProdu = new JLabelMe();
		jLabelid_bodega_materia_primaFK_IdBodegaMateriaPrimaParametroProdu.setText("Bodega Materia Prima :");
		jLabelid_bodega_materia_primaFK_IdBodegaMateriaPrimaParametroProdu.setToolTipText("Bodega Materia Prima");
		jLabelid_bodega_materia_primaFK_IdBodegaMateriaPrimaParametroProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_bodega_materia_primaFK_IdBodegaMateriaPrimaParametroProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_bodega_materia_primaFK_IdBodegaMateriaPrimaParametroProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_bodega_materia_primaFK_IdBodegaMateriaPrimaParametroProdu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodega_materia_primaFK_IdBodegaMateriaPrimaParametroProdu= new JComboBoxMe();
		jComboBoxid_bodega_materia_primaFK_IdBodegaMateriaPrimaParametroProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_materia_primaFK_IdBodegaMateriaPrimaParametroProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_materia_primaFK_IdBodegaMateriaPrimaParametroProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodega_materia_primaFK_IdBodegaMateriaPrimaParametroProdu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionParametroProdu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionParametroProdu.setToolTipText("Buscar Por Transaccion ");
		this.jButtonFK_IdTransaccionParametroProdu= new JButtonMe();
		this.jButtonFK_IdTransaccionParametroProdu.setText("Buscar");
		this.jButtonFK_IdTransaccionParametroProdu.setToolTipText("Buscar Por Transaccion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionParametroProdu,"buscar_button","Buscar Por Transaccion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccionFK_IdTransaccionParametroProdu = new JLabelMe();
		jLabelid_transaccionFK_IdTransaccionParametroProdu.setText("Transaccion :");
		jLabelid_transaccionFK_IdTransaccionParametroProdu.setToolTipText("Transaccion");
		jLabelid_transaccionFK_IdTransaccionParametroProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionFK_IdTransaccionParametroProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionFK_IdTransaccionParametroProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionFK_IdTransaccionParametroProdu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccionFK_IdTransaccionParametroProdu= new JComboBoxMe();
		jComboBoxid_transaccionFK_IdTransaccionParametroProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFK_IdTransaccionParametroProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFK_IdTransaccionParametroProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionFK_IdTransaccionParametroProdu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionEgresoParametroProdu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionEgresoParametroProdu.setToolTipText("Buscar Por Transaccion Egreso ");
		this.jButtonFK_IdTransaccionEgresoParametroProdu= new JButtonMe();
		this.jButtonFK_IdTransaccionEgresoParametroProdu.setText("Buscar");
		this.jButtonFK_IdTransaccionEgresoParametroProdu.setToolTipText("Buscar Por Transaccion Egreso ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionEgresoParametroProdu,"buscar_button","Buscar Por Transaccion Egreso ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionEgresoParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccion_egresoFK_IdTransaccionEgresoParametroProdu = new JLabelMe();
		jLabelid_transaccion_egresoFK_IdTransaccionEgresoParametroProdu.setText("Transaccion Egreso :");
		jLabelid_transaccion_egresoFK_IdTransaccionEgresoParametroProdu.setToolTipText("Transaccion Egreso");
		jLabelid_transaccion_egresoFK_IdTransaccionEgresoParametroProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_transaccion_egresoFK_IdTransaccionEgresoParametroProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_transaccion_egresoFK_IdTransaccionEgresoParametroProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_egresoFK_IdTransaccionEgresoParametroProdu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccion_egresoFK_IdTransaccionEgresoParametroProdu= new JComboBoxMe();
		jComboBoxid_transaccion_egresoFK_IdTransaccionEgresoParametroProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_egresoFK_IdTransaccionEgresoParametroProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_egresoFK_IdTransaccionEgresoParametroProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_egresoFK_IdTransaccionEgresoParametroProdu,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasParametroProdu=new JTabbedPane();


		this.jTabbedPaneBusquedasParametroProdu.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParametroProdu.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParametroProdu.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasParametroProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasParametroProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasParametroProdu,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleParametroProdu = new ParametroProduDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Parametro Produccion DATOS");
			this.jInternalFrameDetalleFormParametroProdu = new ParametroProduDetalleFormJInternalFrame(jDesktopPane,this.parametroproduSessionBean.getConGuardarRelaciones(),this.parametroproduSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormParametroProdu = null;//new ParametroProduDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroProdu= new GridBagLayout();
		
		
		this.jTableDatosParametroProdu = new JTableMe();      
		
		String sToolTipParametroProdu="";
		sToolTipParametroProdu=ParametroProduConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroProdu+="(Produccion.ParametroProdu)";
		}
		
		if(!this.parametroproduSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroProdu+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosParametroProdu.setToolTipText(sToolTipParametroProdu);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosParametroProdu);
		this.jTableDatosParametroProdu.setAutoCreateRowSorter(true);
		this.jTableDatosParametroProdu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosParametroProdu.setRowSelectionAllowed(true);
		this.jTableDatosParametroProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosParametroProdu,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoParametroProdu = new JButtonMe();
		this.jButtonDuplicarParametroProdu = new JButtonMe();
		this.jButtonCopiarParametroProdu = new JButtonMe();
		this.jButtonVerFormParametroProdu = new JButtonMe();
		this.jButtonNuevoRelacionesParametroProdu = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaParametroProdu = new JButtonMe();
		this.jButtonCerrarParametroProdu = new JButtonMe();
		
		this.jScrollPanelDatosParametroProdu = new JScrollPane();   
        this.jScrollPanelDatosGeneralParametroProdu = new JScrollPane();
		
				
		
		
		this.jPanelAccionesParametroProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Produccion";
		
		if(!this.parametroproduSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Producciones" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralParametroProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesParametroProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroProdu.setToolTipText("Acciones");
        this.jPanelAccionesParametroProdu.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroProdu, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoParametroProdu=new ReporteDinamicoJInternalFrame(ParametroProduConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoParametroProdu();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionParametroProdu=new ImportacionJInternalFrame(ParametroProduConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionParametroProdu();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByParametroProdu = new JButtonMe();
		
		this.jButtonAbrirOrderByParametroProdu.setText("Orden");
		this.jButtonAbrirOrderByParametroProdu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroProdu,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByParametroProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByParametroProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroProdu,false,this);
			
			//this.cargarOrderByParametroProdu(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroProdu,true,this);
			
			//this.cargarOrderByParametroProdu(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosParametroProdu.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosParametroProdu.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosParametroProdu.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosParametroProdu.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroProdu.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroProdu.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoParametroProdu.setText("Nuevo");
		this.jButtonDuplicarParametroProdu.setText("Duplicar");
		this.jButtonCopiarParametroProdu.setText("Copiar");
		this.jButtonVerFormParametroProdu.setText("Ver");
		this.jButtonNuevoRelacionesParametroProdu.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaParametroProdu.setText("Guardar");
		this.jButtonCerrarParametroProdu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroProdu,"nuevo_button","Nuevo",this.parametroproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarParametroProdu,"duplicar_button","Duplicar",this.parametroproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarParametroProdu,"copiar_button","Copiar",this.parametroproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormParametroProdu,"ver_form","Ver",this.parametroproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesParametroProdu,"nuevorelaciones_button","Nuevo Rel",this.parametroproduSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroProdu,"guardarcambiostabla_button","Guardar",this.parametroproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroProdu,"cerrar_button","Salir",this.parametroproduSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoParametroProdu.setToolTipText("Nuevo"+" "+ParametroProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarParametroProdu.setToolTipText("Duplicar"+" "+ParametroProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarParametroProdu.setToolTipText("Copiar"+" "+ParametroProduConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormParametroProdu.setToolTipText("Ver"+" "+ParametroProduConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesParametroProdu.setToolTipText("Nuevo Rel"+" "+ParametroProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaParametroProdu.setToolTipText("Guardar"+" "+ParametroProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroProdu.setToolTipText("Salir"+" "+ParametroProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroProdu";
		inputMap = this.jButtonNuevoParametroProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroProdu"));
		
		//DUPLICAR
		sMapKey = "DuplicarParametroProdu";
		inputMap = this.jButtonDuplicarParametroProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarParametroProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarParametroProdu"));
		
		//COPIAR
		sMapKey = "CopiarParametroProdu";
		inputMap = this.jButtonCopiarParametroProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarParametroProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarParametroProdu"));
		
		//VEr FORM
		sMapKey = "VerFormParametroProdu";
		inputMap = this.jButtonVerFormParametroProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormParametroProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormParametroProdu"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesParametroProdu";
		inputMap = this.jButtonNuevoRelacionesParametroProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesParametroProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesParametroProdu"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarParametroProdu";
		inputMap = this.jButtonModificarParametroProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarParametroProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarParametroProdu"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarParametroProdu";
		inputMap = this.jButtonCerrarParametroProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroProdu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroProdu";
		inputMap = this.jButtonGuardarCambiosTablaParametroProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroProdu"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesParametroProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesParametroProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionParametroProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ParametroProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ParametroProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ParametroProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ParametroProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ParametroProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesParametroProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesParametroProdu.setName("jPanelParametrosReportesParametroProdu"); 
		
		this.jPanelParametrosReportesAccionesParametroProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesParametroProdu.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesParametroProdu.setName("jPanelParametrosReportesAccionesParametroProdu"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesParametroProdu, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesParametroProdu, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionParametroProdu = new JButtonMe();
		this.jButtonRecargarInformacionParametroProdu.setText("Recargar");
		this.jButtonRecargarInformacionParametroProdu.setToolTipText("Recargar"+" "+ParametroProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionParametroProdu,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionParametroProdu = new JButtonMe();
		this.jButtonProcesarInformacionParametroProdu.setText("Procesar");
		this.jButtonProcesarInformacionParametroProdu.setToolTipText("Procesar"+" "+ParametroProduConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionParametroProdu.setVisible(false);
			
		this.jButtonProcesarInformacionParametroProdu.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroProdu.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroProdu.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesParametroProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroProdu.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesParametroProdu.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesParametroProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroProdu.setText("TIPO");       
		this.jComboBoxTiposReportesParametroProdu.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesParametroProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroProdu.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesParametroProdu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionParametroProdu = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionParametroProdu.setText("Paginacion");
		this.jComboBoxTiposPaginacionParametroProdu.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesParametroProdu = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesParametroProdu.setText("Accion");
		this.jComboBoxTiposRelacionesParametroProdu.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesParametroProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroProdu.setText("Accion");
		this.jComboBoxTiposAccionesParametroProdu.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarParametroProdu = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarParametroProdu.setText("Accion");
		this.jComboBoxTiposSeleccionarParametroProdu.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralParametroProdu=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralParametroProdu.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroProdu.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroProdu.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesParametroProdu = new JLabelMe();
		
		this.jLabelAccionesParametroProdu.setText("Acciones");		
		this.jLabelAccionesParametroProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosParametroProdu = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosParametroProdu.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosParametroProdu.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosParametroProdu = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosParametroProdu.setText("Seleccionados");
		this.jCheckBoxSeleccionadosParametroProdu.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaParametroProdu = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaParametroProdu.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaParametroProdu.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteParametroProdu = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteParametroProdu.setText("Graf.");
		this.jCheckBoxConGraficoReporteParametroProdu.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresParametroProdu = new JButtonMe();
		//this.jButtonAnterioresParametroProdu.setText("<<");
        this.jButtonAnterioresParametroProdu.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresParametroProdu,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesParametroProdu = new JButtonMe();
		//this.jButtonSiguientesParametroProdu.setText(">>");
        this.jButtonSiguientesParametroProdu.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesParametroProdu,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosParametroProdu = new JButtonMe();
		this.jButtonNuevoGuardarCambiosParametroProdu.setText("Nue");
        this.jButtonNuevoGuardarCambiosParametroProdu.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosParametroProdu,"nuevoguardarcambios_button","Nue",this.parametroproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosParametroProdu";
		inputMap = this.jButtonNuevoGuardarCambiosParametroProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosParametroProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosParametroProdu"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionParametroProdu";
		inputMap = this.jButtonRecargarInformacionParametroProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionParametroProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionParametroProdu"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesParametroProdu";
		inputMap = this.jButtonSiguientesParametroProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesParametroProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesParametroProdu"));
		
		//ANTERIORES		
		sMapKey = "AnterioresParametroProdu";
		inputMap = this.jButtonAnterioresParametroProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresParametroProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresParametroProdu"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasParametroProdu();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesParametroProdu.setMinimumSize(new Dimension(this.getWidth(),ParametroProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroProduBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroProdu.setMaximumSize(new Dimension(this.getWidth(),ParametroProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroProduBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroProdu.setPreferredSize(new Dimension(this.getWidth(),ParametroProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroProduBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionParametroProdu = new GridBagLayout();

			this.jPanelPaginacionParametroProdu.setLayout(gridaBagLayoutPaginacionParametroProdu);						
			
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			this.gridBagConstraintsParametroProdu.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroProdu.gridy = 0;
			this.gridBagConstraintsParametroProdu.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionParametroProdu.add(this.jButtonAnterioresParametroProdu, this.gridBagConstraintsParametroProdu);
					
						
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			this.gridBagConstraintsParametroProdu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroProdu.gridy = 0;
			
			this.jPanelPaginacionParametroProdu.add(this.jButtonNuevoGuardarCambiosParametroProdu, this.gridBagConstraintsParametroProdu);
						
			
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			this.gridBagConstraintsParametroProdu.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsParametroProdu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroProdu.gridy = 0;
			this.jPanelPaginacionParametroProdu.add(this.jButtonSiguientesParametroProdu, this.gridBagConstraintsParametroProdu);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroProdu.gridy = 1;
			this.gridBagConstraintsParametroProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroProdu.add(this.jButtonNuevoParametroProdu, this.gridBagConstraintsParametroProdu);
						
			
			
			if(!this.parametroproduSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsParametroProdu = new GridBagConstraints();
				this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsParametroProdu.gridy = 1;
				this.gridBagConstraintsParametroProdu.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionParametroProdu.add(this.jButtonGuardarCambiosTablaParametroProdu, this.gridBagConstraintsParametroProdu);
			}
			
			
			
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroProdu.gridy = 1;
			this.gridBagConstraintsParametroProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroProdu.add(this.jButtonDuplicarParametroProdu, this.gridBagConstraintsParametroProdu);
			
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroProdu.gridy = 1;
			this.gridBagConstraintsParametroProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroProdu.add(this.jButtonCopiarParametroProdu, this.gridBagConstraintsParametroProdu);
		
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroProdu.gridy = 1;
			this.gridBagConstraintsParametroProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroProdu.add(this.jButtonVerFormParametroProdu, this.gridBagConstraintsParametroProdu);
		
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroProdu.gridy = 1;
			this.gridBagConstraintsParametroProdu.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionParametroProdu.add(this.jButtonCerrarParametroProdu, this.gridBagConstraintsParametroProdu);
		
		
		
		this.jButtonRecargarInformacionParametroProdu.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroProdu.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroProdu.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesParametroProdu.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroProdu.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroProdu.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesParametroProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesParametroProdu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroProdu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroProdu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionParametroProdu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroProdu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroProdu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesParametroProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesParametroProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarParametroProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaParametroProdu.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroProdu.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroProdu.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteParametroProdu.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroProdu.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroProdu.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosParametroProdu.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroProdu.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroProdu.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosParametroProdu.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroProdu.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroProdu.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesParametroProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesParametroProdu = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ParametroProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ParametroProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ParametroProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ParametroProdu = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesParametroProdu.setLayout(gridaBagParametrosReportesParametroProdu);
			this.jPanelParametrosReportesAccionesParametroProdu.setLayout(gridaBagParametrosReportesAccionesParametroProdu);
			
			
			this.jPanelParametrosAuxiliar1ParametroProdu.setLayout(gridaBagParametrosAuxiliar1ParametroProdu);
			this.jPanelParametrosAuxiliar2ParametroProdu.setLayout(gridaBagParametrosAuxiliar2ParametroProdu);
			this.jPanelParametrosAuxiliar3ParametroProdu.setLayout(gridaBagParametrosAuxiliar3ParametroProdu);
			this.jPanelParametrosAuxiliar4ParametroProdu.setLayout(gridaBagParametrosAuxiliar4ParametroProdu);
			//this.jPanelParametrosAuxiliar5ParametroProdu.setLayout(gridaBagParametrosAuxiliar2ParametroProdu);			
			
			
			
			
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroProdu.add(this.jButtonRecargarInformacionParametroProdu, this.gridBagConstraintsParametroProdu);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			this.gridBagConstraintsParametroProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroProdu.add(this.jComboBoxTiposPaginacionParametroProdu, this.gridBagConstraintsParametroProdu);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			this.gridBagConstraintsParametroProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroProdu.add(this.jCheckBoxConAltoMaximoTablaParametroProdu, this.gridBagConstraintsParametroProdu);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			this.gridBagConstraintsParametroProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroProdu.add(this.jComboBoxTiposArchivosReportesParametroProdu, this.gridBagConstraintsParametroProdu);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			this.gridBagConstraintsParametroProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroProdu.add(this.jPanelParametrosAuxiliar1ParametroProdu, this.gridBagConstraintsParametroProdu);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			this.gridBagConstraintsParametroProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ParametroProdu.add(this.jComboBoxTiposReportesParametroProdu, this.gridBagConstraintsParametroProdu);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			this.gridBagConstraintsParametroProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroProdu.add(this.jPanelParametrosAuxiliar4ParametroProdu, this.gridBagConstraintsParametroProdu);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			this.gridBagConstraintsParametroProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroProdu.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroProdu.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroProdu.add(this.jComboBoxTiposReportesParametroProdu, this.gridBagConstraintsParametroProdu);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			this.gridBagConstraintsParametroProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroProdu.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroProdu.add(this.jCheckBoxGenerarReporteParametroProdu, this.gridBagConstraintsParametroProdu);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			this.gridBagConstraintsParametroProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroProdu.add(this.jPanelParametrosAuxiliar2ParametroProdu, this.gridBagConstraintsParametroProdu);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroProdu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroProdu.add(this.jLabelAccionesParametroProdu, this.gridBagConstraintsParametroProdu);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsParametroProdu = new GridBagConstraints();
				this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsParametroProdu.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsParametroProdu.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesParametroProdu.add(this.jButtonAbrirOrderByParametroProdu, this.gridBagConstraintsParametroProdu);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsParametroProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroProdu.add(this.jComboBoxTiposSeleccionarParametroProdu, this.gridBagConstraintsParametroProdu);			
			
			
			/*
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroProdu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroProdu.add(this.jCheckBoxSeleccionarTodosParametroProdu, this.gridBagConstraintsParametroProdu);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			this.gridBagConstraintsParametroProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroProdu.add(this.jCheckBoxSeleccionarTodosParametroProdu, this.gridBagConstraintsParametroProdu);															
				
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			this.gridBagConstraintsParametroProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroProdu.add(this.jCheckBoxSeleccionadosParametroProdu, this.gridBagConstraintsParametroProdu);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			this.gridBagConstraintsParametroProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroProdu.add(this.jPanelParametrosAuxiliar3ParametroProdu, this.gridBagConstraintsParametroProdu);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			this.gridBagConstraintsParametroProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroProdu.add(this.jComboBoxTiposAccionesParametroProdu, this.gridBagConstraintsParametroProdu);
	
				
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			this.gridBagConstraintsParametroProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroProdu.add(this.jTextFieldValorCampoGeneralParametroProdu, this.gridBagConstraintsParametroProdu);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosParametroProdu = new GridBagLayout();

			this.jScrollPanelDatosParametroProdu.setLayout(gridaBagLayoutDatosParametroProdu);
			
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroProdu.gridy = 0;
			this.gridBagConstraintsParametroProdu.gridx = 0;
			
			this.jScrollPanelDatosParametroProdu.add(this.jTableDatosParametroProdu, this.gridBagConstraintsParametroProdu);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosParametroProdu.setViewportView(this.jTableDatosParametroProdu);
		this.jTableDatosParametroProdu.setFillsViewportHeight(true);
		this.jTableDatosParametroProdu.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesParametroProdu= new GridBagLayout();
		this.jPanelAccionesParametroProdu.setLayout(gridaBagLayoutAccionesParametroProdu);
		
		
		/*	
		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroProdu.gridy = 0;
		this.gridBagConstraintsParametroProdu.gridx = 0;
			
		this.jPanelAccionesParametroProdu.add(this.jButtonNuevoParametroProdu, this.gridBagConstraintsParametroProdu);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroProdu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroProdu);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametroproduSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();						
			this.gridBagConstraintsParametroProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroProdu.gridx = 0;		
			//this.gridBagConstraintsParametroProdu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroProdu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroProdu.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarParametroProdu, this.gridBagConstraintsParametroProdu);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		this.gridBagConstraintsParametroProdu.gridy = iGridyPrincipal++;
		this.gridBagConstraintsParametroProdu.gridx = 0;		
		//this.gridBagConstraintsParametroProdu.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroProdu.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsParametroProdu.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsParametroProdu);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		this.gridBagConstraintsParametroProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroProdu.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesParametroProdu, this.gridBagConstraintsParametroProdu);								
		
		
		/*
		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		this.gridBagConstraintsParametroProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroProdu.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesParametroProdu, this.gridBagConstraintsParametroProdu);
		*/		
		
		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		this.gridBagConstraintsParametroProdu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroProdu.gridx =0;
		this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroProdu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroProdu, this.gridBagConstraintsParametroProdu);
				
		
		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		this.gridBagConstraintsParametroProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroProdu.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionParametroProdu, this.gridBagConstraintsParametroProdu);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ParametroProduJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosParametroProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroProdu = new GridBagLayout();
			this.jPanelBusquedasParametrosParametroProdu.setLayout(gridaBagLayoutBusquedasParametrosParametroProdu);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralParametroProdu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		this.gridBagConstraintsParametroProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroProdu, this.gridBagConstraintsParametroProdu);
			
			
		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		this.gridBagConstraintsParametroProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroProdu, this.gridBagConstraintsParametroProdu);
		
			
		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		this.gridBagConstraintsParametroProdu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroProdu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroProdu, this.gridBagConstraintsParametroProdu);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralParametroProdu;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoParametroProdu() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoParametroProdu = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoParametroProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoParametroProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoParametroProdu.setName("jPanelReporteDinamicoParametroProdu"); 
		
		this.jPanelReporteDinamicoParametroProdu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroProdu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroProdu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoParametroProdu.setLayout(gridaBagLayoutReporteDinamicoParametroProdu);
		
		
		this.jInternalFrameReporteDinamicoParametroProdu= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoParametroProdu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroProdu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoParametroProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoParametroProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoParametroProdu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoParametroProdu.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoParametroProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoParametroProdu.setResizable(true);
	    this.jInternalFrameReporteDinamicoParametroProdu.setClosable(true);
	    this.jInternalFrameReporteDinamicoParametroProdu.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoParametroProdu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroProdu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroProdu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoParametroProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Producciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteParametroProdu = new JLabelMe();

		this.jLabelColumnasSelectReporteParametroProdu.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteParametroProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroProdu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroProdu.add(this.jLabelColumnasSelectReporteParametroProdu, this.gridBagConstraintsParametroProdu);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteParametroProdu = new JList<Reporte>();
		this.jListColumnasSelectReporteParametroProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteParametroProdu.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteParametroProdu.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroProdu.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroProdu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteParametroProdu=new JScrollPane(this.jListColumnasSelectReporteParametroProdu);
			
			this.jScrollColumnasSelectReporteParametroProdu.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroProdu.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroProdu.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteParametroProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroProdu.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoParametroProdu.add(this.jListColumnasSelectReporteParametroProdu, this.gridBagConstraintsParametroProdu);
		this.jPanelReporteDinamicoParametroProdu.add(this.jScrollColumnasSelectReporteParametroProdu, this.gridBagConstraintsParametroProdu);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteParametroProdu = new JLabelMe();

		this.jLabelRelacionesSelectReporteParametroProdu.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteParametroProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteParametroProdu = new JList<Reporte>();
		this.jListRelacionesSelectReporteParametroProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteParametroProdu.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteParametroProdu.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroProdu.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroProdu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteParametroProdu=new JScrollPane(this.jListRelacionesSelectReporteParametroProdu);
			
			this.jScrollRelacionesSelectReporteParametroProdu.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroProdu.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroProdu.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteParametroProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoParametroProdu = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoParametroProdu = new JComboBoxMe();
		this.jListColumnasValoresGraficoParametroProdu = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoParametroProdu = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoParametroProdu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoParametroProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoParametroProdu = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoParametroProdu.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoParametroProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoParametroProdu = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoParametroProdu.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoParametroProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroProdu.add(this.jLabelGenerarExcelReporteDinamicoParametroProdu, this.gridBagConstraintsParametroProdu);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoParametroProdu = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoParametroProdu.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoParametroProdu,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoParametroProdu.setToolTipText("Generar EXCEL"+" "+ParametroProduConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		//this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsParametroProdu.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsParametroProdu.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoParametroProdu.add(this.jButtonGenerarExcelReporteDinamicoParametroProdu, this.gridBagConstraintsParametroProdu);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroProdu.add(this.jComboBoxTiposReportesDinamicoParametroProdu, this.gridBagConstraintsParametroProdu);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoParametroProdu = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoParametroProdu.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoParametroProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroProdu.add(this.jLabelTiposArchivoReporteDinamicoParametroProdu, this.gridBagConstraintsParametroProdu);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroProdu.add(this.jComboBoxTiposArchivosReportesDinamicoParametroProdu, this.gridBagConstraintsParametroProdu);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoParametroProdu = new JButtonMe();
		this.jButtonGenerarReporteDinamicoParametroProdu.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoParametroProdu,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoParametroProdu.setToolTipText("Generar"+" "+ParametroProduConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroProdu.add(this.jButtonGenerarReporteDinamicoParametroProdu, this.gridBagConstraintsParametroProdu);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoParametroProdu = new JButtonMe();
		this.jButtonCerrarReporteDinamicoParametroProdu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoParametroProdu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoParametroProdu.setToolTipText("Cancelar"+" "+ParametroProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroProdu.add(this.jButtonCerrarReporteDinamicoParametroProdu, this.gridBagConstraintsParametroProdu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalParametroProdu = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoParametroProdu= new JScrollPane(jPanelReporteDinamicoParametroProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoParametroProdu.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroProdu.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroProdu.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoParametroProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Producciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		this.gridBagConstraintsParametroProdu.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsParametroProdu.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoParametroProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoParametroProdu.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalParametroProdu);
		this.jInternalFrameReporteDinamicoParametroProdu.getContentPane().add(this.jScrollPanelReporteDinamicoParametroProdu, this.gridBagConstraintsParametroProdu);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionParametroProdu() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionParametroProdu = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionParametroProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionParametroProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionParametroProdu.setName("jPanelImportacionParametroProdu"); 
		
		this.jPanelImportacionParametroProdu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroProdu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroProdu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionParametroProdu.setLayout(gridaBagLayoutImportacionParametroProdu);
		
		
		this.jInternalFrameImportacionParametroProdu= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionParametroProdu= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionParametroProdu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroProdu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionParametroProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroProdu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionParametroProdu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroProdu.setResizable(true);
	    this.jInternalFrameImportacionParametroProdu.setClosable(true);
	    this.jInternalFrameImportacionParametroProdu.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionParametroProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroProdu.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionParametroProdu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroProdu.setResizable(true);
	    this.jInternalFrameImportacionParametroProdu.setClosable(true);
	    this.jInternalFrameImportacionParametroProdu.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionParametroProdu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroProdu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroProdu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionParametroProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Producciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionParametroProdu = new JLabelMe();

		this.jLabelArchivoImportacionParametroProdu.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionParametroProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProdu.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroProdu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroProdu.add(this.jLabelArchivoImportacionParametroProdu, this.gridBagConstraintsParametroProdu);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionParametroProdu = new JFileChooser();		
		this.jFileChooserImportacionParametroProdu.setToolTipText("ESCOGER ARCHIVO"+" "+ParametroProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionParametroProdu = new JButtonMe();
		this.jButtonAbrirImportacionParametroProdu.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionParametroProdu,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionParametroProdu.setToolTipText("Generar"+" "+ParametroProduConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroProdu.add(this.jButtonAbrirImportacionParametroProdu, this.gridBagConstraintsParametroProdu);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionParametroProdu = new JLabelMe();

		this.jLabelPathArchivoImportacionParametroProdu.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionParametroProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroProdu.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroProdu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroProdu.add(this.jLabelPathArchivoImportacionParametroProdu, this.gridBagConstraintsParametroProdu);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionParametroProdu=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionParametroProdu.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroProdu.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroProdu.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroProdu.add(this.jTextFieldPathArchivoImportacionParametroProdu, this.gridBagConstraintsParametroProdu);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionParametroProdu = new JButtonMe();
		this.jButtonGenerarImportacionParametroProdu.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionParametroProdu,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionParametroProdu.setToolTipText("Generar"+" "+ParametroProduConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroProdu.add(this.jButtonGenerarImportacionParametroProdu, this.gridBagConstraintsParametroProdu);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionParametroProdu = new JButtonMe();
		this.jButtonCerrarImportacionParametroProdu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionParametroProdu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionParametroProdu.setToolTipText("Cancelar"+" "+ParametroProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroProdu.add(this.jButtonCerrarImportacionParametroProdu, this.gridBagConstraintsParametroProdu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalParametroProdu = new GridBagLayout();
		
		this.jScrollPanelImportacionParametroProdu= new JScrollPane(jPanelImportacionParametroProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsParametroProdu = new GridBagConstraints();
		this.gridBagConstraintsParametroProdu.gridy =iPosYImportacion;
		this.gridBagConstraintsParametroProdu.gridx =iPosXImportacion;
		this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionParametroProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionParametroProdu.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalParametroProdu);
		this.jInternalFrameImportacionParametroProdu.getContentPane().add(this.jScrollPanelImportacionParametroProdu, this.gridBagConstraintsParametroProdu);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByParametroProdu(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByParametroProdu = new JButtonMe();
			this.jButtonAbrirOrderByParametroProdu.setText("Orden");
			this.jButtonAbrirOrderByParametroProdu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroProdu,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByParametroProdu";
			inputMap = this.jButtonAbrirOrderByParametroProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByParametroProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByParametroProdu"));
		
		
			GridBagLayout gridaBagLayoutOrderByParametroProdu = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByParametroProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByParametroProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByParametroProdu.setName("jPanelOrderByParametroProdu"); 
			
			this.jPanelOrderByParametroProdu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroProdu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroProdu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByParametroProdu.setLayout(gridaBagLayoutOrderByParametroProdu);
			
			
			this.jTableDatosParametroProduOrderBy = new JTableMe();        
			this.jTableDatosParametroProduOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosParametroProduOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosParametroProduOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosParametroProduOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosParametroProduOrderBy.setViewportView(this.jTableDatosParametroProduOrderBy);
			this.jTableDatosParametroProduOrderBy.setFillsViewportHeight(true);
			this.jTableDatosParametroProduOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByParametroProdu= new OrderByJInternalFrame();
			this.jInternalFrameOrderByParametroProdu= new OrderByJInternalFrame();
			this.jScrollPanelOrderByParametroProdu = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteParametroProdu= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByParametroProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByParametroProdu.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByParametroProdu.setTitle("Orden");
			this.jInternalFrameOrderByParametroProdu.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByParametroProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByParametroProdu.setResizable(true);
			this.jInternalFrameOrderByParametroProdu.setClosable(true);
			this.jInternalFrameOrderByParametroProdu.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByParametroProdu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroProdu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroProdu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByParametroProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Producciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			this.gridBagConstraintsParametroProdu.gridy =iPosYOrderBy++;
			this.gridBagConstraintsParametroProdu.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsParametroProdu.ipady =150;
				
			this.jPanelOrderByParametroProdu.add(jScrollPanelDatosParametroProduOrderBy, this.gridBagConstraintsParametroProdu);//this.jTableDatosParametroProduTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByParametroProdu = new JButtonMe();
			this.jButtonCerrarOrderByParametroProdu.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByParametroProdu,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByParametroProdu.setToolTipText("Cancelar"+" "+ParametroProduConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByParametroProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroProdu.gridy = iPosYOrderBy++;
			this.gridBagConstraintsParametroProdu.gridx = iPosXOrderBy;
									
			this.jPanelOrderByParametroProdu.add(this.jButtonCerrarOrderByParametroProdu, this.gridBagConstraintsParametroProdu);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalParametroProdu = new GridBagLayout();
			
			this.jScrollPanelOrderByParametroProdu= new JScrollPane(jPanelOrderByParametroProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsParametroProdu = new GridBagConstraints();
			this.gridBagConstraintsParametroProdu.gridy =iPosYOrderBy;
			this.gridBagConstraintsParametroProdu.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroProdu.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByParametroProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByParametroProdu.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalParametroProdu);
			
			this.jInternalFrameOrderByParametroProdu.getContentPane().add(this.jScrollPanelOrderByParametroProdu, this.gridBagConstraintsParametroProdu);			
		
		} else {
			this.jButtonAbrirOrderByParametroProdu = new JButtonMe();
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
		int iWidthTableCalculado=0;//1730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.parametroproduSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosParametroProdu.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosParametroProdu.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosParametroProdu.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosParametroProdu.getRowHeight();//ParametroProduConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.parametroproduSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ParametroProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroProdu.isSelected()) {
					iHeightTable=ParametroProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ParametroProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroProdu.isSelected()) {
					iHeightTable=ParametroProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosParametroProdu.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroProdu.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroProdu.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosParametroProdu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroProdu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroProdu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByParametroProdu!=null && this.jInternalFrameOrderByParametroProdu.getjTableDatosOrderBy()!=null) {
			//if(!this.parametroproduSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByParametroProdu.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByParametroProdu.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByParametroProdu.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByParametroProdu.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByParametroProdu.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByParametroProdu.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByParametroProdu.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosParametroProdu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroProdu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroProdu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=parametroproduLogic.getParametroProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametroprodus.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ParametroProdu> TraerParametroProduBeans(List<ParametroProdu> parametroprodus,ArrayList<Classe> classes)throws Exception {
		try {
			for(ParametroProdu parametroprodu:parametroprodus) {
					
				if(!(ParametroProduConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ParametroProduConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					parametroprodu.setsDetalleGeneralEntityReporte(ParametroProduConstantesFunciones.getParametroProduDescripcion(parametroprodu));
										
						
					
						
					
				} else  {
							
					//parametroprodu.setsDetalleGeneralEntityReporte(parametroprodu.getsDetalleGeneralEntityReporte());
										
				}
				
				//parametroprodubeans.add(parametroprodubean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return parametroprodus;
    }
	//PARA REPORTES FIN
}
