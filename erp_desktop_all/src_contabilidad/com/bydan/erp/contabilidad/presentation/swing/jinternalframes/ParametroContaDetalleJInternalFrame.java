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



import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;





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
import com.bydan.erp.contabilidad.util.ParametroContaDetalleConstantesFunciones;

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
public class ParametroContaDetalleJInternalFrame extends ParametroContaDetalleBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarParametroContaDetalle;
	
	protected JMenuBar jmenuBarParametroContaDetalle;
	
	protected JMenu jmenuParametroContaDetalle;
	protected JMenu jmenuDatosParametroContaDetalle;
	protected JMenu jmenuArchivoParametroContaDetalle;
	protected JMenu jmenuAccionesParametroContaDetalle;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosParametroContaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroContaDetalle;	
	protected GridBagConstraints gridBagConstraintsParametroContaDetalle;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ParametroContaDetalleDetalleFormJInternalFrame jInternalFrameDetalleFormParametroContaDetalle;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoParametroContaDetalle;	
	protected ImportacionJInternalFrame jInternalFrameImportacionParametroContaDetalle;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ParametroContaBeanSwingJInternalFrame parametrocontaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_parametroconta="";

	protected TipoParametroContaBeanSwingJInternalFrame tipoparametrocontaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoparametroconta="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";
	
	public ParametroContaDetalleSessionBean parametrocontadetalleSessionBean;
		
	
	
	public ParametroContaSessionBean parametrocontaSessionBean;
	public TipoParametroContaSessionBean tipoparametrocontaSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ParametroContaDetalle> parametrocontadetalles;		
	public List<ParametroContaDetalle> parametrocontadetallesEliminados;	
	public List<ParametroContaDetalle> parametrocontadetallesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByParametroContaDetalle;		
	protected JButton jButtonAbrirOrderByParametroContaDetalle;
	
	
	//protected JPanel jPanelOrderByParametroContaDetalle;
	//public JScrollPane jScrollPanelOrderByParametroContaDetalle;	
	//protected JButton jButtonCerrarOrderByParametroContaDetalle;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ParametroContaDetalleLogic parametrocontadetalleLogic;
	
	
	
	public JScrollPane jScrollPanelDatosParametroContaDetalle;
	public JScrollPane jScrollPanelDatosEdicionParametroContaDetalle;
	public JScrollPane jScrollPanelDatosGeneralParametroContaDetalle;
    
	
	
	//public JScrollPane jScrollPanelDatosParametroContaDetalleOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoParametroContaDetalle;
	//public JScrollPane jScrollPanelImportacionParametroContaDetalle;
	
	
	
	protected JPanel jPanelAccionesParametroContaDetalle;
	
    protected JPanel jPanelPaginacionParametroContaDetalle;
    protected JPanel jPanelParametrosReportesParametroContaDetalle;
	protected JPanel jPanelParametrosReportesAccionesParametroContaDetalle;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ParametroContaDetalle;
	protected JPanel jPanelParametrosAuxiliar2ParametroContaDetalle;
	protected JPanel jPanelParametrosAuxiliar3ParametroContaDetalle;
	protected JPanel jPanelParametrosAuxiliar4ParametroContaDetalle;
	//protected JPanel jPanelParametrosAuxiliar5ParametroContaDetalle;
	
	
	
	//protected JPanel jPanelReporteDinamicoParametroContaDetalle;
	//protected JPanel jPanelImportacionParametroContaDetalle;
	
	
	public JTable jTableDatosParametroContaDetalle;
	
	
	
	//public JTable jTableDatosParametroContaDetalleOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoParametroContaDetalle;
	protected JButton jButtonDuplicarParametroContaDetalle;
	protected JButton jButtonCopiarParametroContaDetalle;
	protected JButton jButtonVerFormParametroContaDetalle;
	protected JButton jButtonNuevoRelacionesParametroContaDetalle;
	protected JButton jButtonModificarParametroContaDetalle;
	
    protected JButton jButtonGuardarCambiosTablaParametroContaDetalle;
	protected JButton jButtonCerrarParametroContaDetalle;
	
	
	protected JButton jButtonRecargarInformacionParametroContaDetalle;
	protected JButton jButtonProcesarInformacionParametroContaDetalle;
	
	
	protected JButton jButtonAnterioresParametroContaDetalle;
	protected JButton jButtonSiguientesParametroContaDetalle;
	protected JButton jButtonNuevoGuardarCambiosParametroContaDetalle;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoParametroContaDetalle;
	//protected JButton jButtonCerrarReporteDinamicoParametroContaDetalle;
	//protected JButton jButtonGenerarExcelReporteDinamicoParametroContaDetalle;	
	
	
	
	//protected JButton jButtonAbrirImportacionParametroContaDetalle;
	//protected JButton jButtonGenerarImportacionParametroContaDetalle;
	//protected JButton jButtonCerrarImportacionParametroContaDetalle;
	//protected JFileChooser jFileChooserImportacionParametroContaDetalle;
	//protected File fileImportacionParametroContaDetalle;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroContaDetalle;
	protected JButton jButtonDuplicarToolBarParametroContaDetalle;
	protected JButton jButtonNuevoRelacionesToolBarParametroContaDetalle;
	
	
	public JButton jButtonGuardarCambiosToolBarParametroContaDetalle;
	protected JButton jButtonCopiarToolBarParametroContaDetalle;
	protected JButton jButtonVerFormToolBarParametroContaDetalle;
	public JButton jButtonGuardarCambiosTablaToolBarParametroContaDetalle;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroContaDetalle;
	protected JButton jButtonCerrarToolBarParametroContaDetalle;
	
	protected JButton jButtonRecargarInformacionToolBarParametroContaDetalle;
	protected JButton jButtonProcesarInformacionToolBarParametroContaDetalle;
	protected JButton jButtonAnterioresToolBarParametroContaDetalle;
	protected JButton jButtonSiguientesToolBarParametroContaDetalle;
	protected JButton jButtonNuevoGuardarCambiosToolBarParametroContaDetalle;
	protected JButton jButtonAbrirOrderByToolBarParametroContaDetalle;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroContaDetalle;
	protected JMenuItem jMenuItemDuplicarParametroContaDetalle;
	protected JMenuItem jMenuItemNuevoRelacionesParametroContaDetalle;
	
	
	protected JMenuItem jMenuItemGuardarCambiosParametroContaDetalle;
	protected JMenuItem jMenuItemCopiarParametroContaDetalle;
	protected JMenuItem jMenuItemVerFormParametroContaDetalle;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroContaDetalle;
	protected JMenuItem jMenuItemCerrarParametroContaDetalle;
	protected JMenuItem jMenuItemDetalleCerrarParametroContaDetalle;
	protected JMenuItem jMenuItemDetalleAbrirOrderByParametroContaDetalle;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroContaDetalle;
	
	protected JMenuItem jMenuItemRecargarInformacionParametroContaDetalle;
	protected JMenuItem jMenuItemProcesarInformacionParametroContaDetalle;
	protected JMenuItem jMenuItemAnterioresParametroContaDetalle;
	protected JMenuItem jMenuItemSiguientesParametroContaDetalle;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroContaDetalle;
	protected JMenuItem jMenuItemAbrirOrderByParametroContaDetalle;
	protected JMenuItem jMenuItemMostrarOcultarParametroContaDetalle;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroContaDetalle;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosParametroContaDetalle;
	protected JCheckBox jCheckBoxSeleccionadosParametroContaDetalle;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaParametroContaDetalle;
	protected JCheckBox jCheckBoxConGraficoReporteParametroContaDetalle;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesParametroContaDetalle;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesParametroContaDetalle;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoParametroContaDetalle;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoParametroContaDetalle;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesParametroContaDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionParametroContaDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroContaDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroContaDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarParametroContaDetalle;
	protected JTextField jTextFieldValorCampoGeneralParametroContaDetalle;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteParametroContaDetalle;
	//public JList<Reporte> jListColumnasSelectReporteParametroContaDetalle;
	//public JScrollPane jScrollColumnasSelectReporteParametroContaDetalle;
	
	//public JLabel jLabelRelacionesSelectReporteParametroContaDetalle;
	//public JList<Reporte> jListRelacionesSelectReporteParametroContaDetalle;
	//public JScrollPane jScrollRelacionesSelectReporteParametroContaDetalle;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoParametroContaDetalle;
	//protected JCheckBox jCheckBoxConGraficoDinamicoParametroContaDetalle;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoParametroContaDetalle;
	//public JLabel jLabelTiposArchivoReporteDinamicoParametroContaDetalle;
	
		
	//public JLabel jLabelArchivoImportacionParametroContaDetalle;	
	//public JLabel jLabelPathArchivoImportacionParametroContaDetalle;
	//protected JTextField jTextFieldPathArchivoImportacionParametroContaDetalle;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoParametroContaDetalle;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoParametroContaDetalle;
	
	//public JLabel jLabelColumnaCategoriaValorParametroContaDetalle;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorParametroContaDetalle;
	
	//public JLabel jLabelColumnasValoresGraficoParametroContaDetalle;
	//public JList<Reporte> jListColumnasValoresGraficoParametroContaDetalle;
	//public JScrollPane jScrollColumnasValoresGraficoParametroContaDetalle;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoParametroContaDetalle;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoParametroContaDetalle;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasParametroContaDetalle;
	public JPanel jPanelFK_IdCuentaContableParametroContaDetalle;
	public JButton jButtonFK_IdCuentaContableParametroContaDetalle;
	public JPanel jPanelFK_IdParametroContaParametroContaDetalle;
	public JButton jButtonFK_IdParametroContaParametroContaDetalle;
	public JPanel jPanelFK_IdParametroContaDetalleParametroContaDetalle;
	public JButton jButtonFK_IdParametroContaDetalleParametroContaDetalle;
	
	public JPanel jPanelid_cuenta_contableFK_IdCuentaContableParametroContaDetalle;
	public JLabel jLabelid_cuenta_contableFK_IdCuentaContableParametroContaDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFK_IdCuentaContableParametroContaDetalle;
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableParametroContaDetalle= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableParametroContaDetalleUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableParametroContaDetalleBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableParametroContaDetalleArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableid_cuenta_contableParametroContaDetalle;
	
	public JPanel jPanelid_parametro_contaFK_IdParametroContaParametroContaDetalle;
	public JLabel jLabelid_parametro_contaFK_IdParametroContaParametroContaDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_parametro_contaFK_IdParametroContaParametroContaDetalle;
	public JButton jButtonid_parametro_contaFK_IdParametroContaParametroContaDetalle= new JButtonMe();
	public JButton jButtonid_parametro_contaFK_IdParametroContaParametroContaDetalleUpdate= new JButtonMe();
	public JButton jButtonid_parametro_contaFK_IdParametroContaParametroContaDetalleBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_parametro_contaFK_IdParametroContaDetalleParametroContaDetalle;
	public JLabel jLabelid_tipo_parametro_contaFK_IdParametroContaDetalleParametroContaDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_parametro_contaFK_IdParametroContaDetalleParametroContaDetalle;
	public JButton jButtonid_tipo_parametro_contaFK_IdParametroContaDetalleParametroContaDetalle= new JButtonMe();
	public JButton jButtonid_tipo_parametro_contaFK_IdParametroContaDetalleParametroContaDetalleUpdate= new JButtonMe();
	public JButton jButtonid_tipo_parametro_contaFK_IdParametroContaDetalleParametroContaDetalleBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
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
	public ParametroContaDetalleJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ParametroContaDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroContaDetalleJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroContaDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroContaDetalleJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroContaDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroContaDetalleJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroContaDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionParametroContaDetalle)	{
		this.jButtonRecargarInformacionParametroContaDetalle = jButtonRecargarInformacionParametroContaDetalle;
	}
	
	public JButton getjButtonProcesarInformacionParametroContaDetalle() {
		return this.jButtonProcesarInformacionParametroContaDetalle;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroContaDetalle)	{
		this.jButtonProcesarInformacionParametroContaDetalle = jButtonProcesarInformacionParametroContaDetalle;
	}
	
	
	public JButton getjButtonRecargarInformacionParametroContaDetalle() {
		return this.jButtonRecargarInformacionParametroContaDetalle;
	}
	
	
	public List<ParametroContaDetalle> getparametrocontadetalles() {
		return this.parametrocontadetalles;
	}

	public void setparametrocontadetalles(List<ParametroContaDetalle> parametrocontadetalles) {
		this.parametrocontadetalles = parametrocontadetalles;
	}
	
	public List<ParametroContaDetalle> getparametrocontadetallesAux() {
		return this.parametrocontadetallesAux;
	}

	public void setparametrocontadetallesAux(List<ParametroContaDetalle> parametrocontadetallesAux) {
		this.parametrocontadetallesAux = parametrocontadetallesAux;
	}
	
	public List<ParametroContaDetalle> getparametrocontadetallesEliminados() {
		return this.parametrocontadetallesEliminados;
	}

	public void setParametroContaDetallesEliminados(List<ParametroContaDetalle> parametrocontadetallesEliminados) {
		this.parametrocontadetallesEliminados = parametrocontadetallesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarParametroContaDetalle() {
		return jComboBoxTiposSeleccionarParametroContaDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarParametroContaDetalle(
			JComboBox jComboBoxTiposSeleccionarParametroContaDetalle) {
		this.jComboBoxTiposSeleccionarParametroContaDetalle = jComboBoxTiposSeleccionarParametroContaDetalle;
	}
	
	public void setBorderResaltarTiposSeleccionarParametroContaDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarParametroContaDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarParametroContaDetalle .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralParametroContaDetalle() {
		return jTextFieldValorCampoGeneralParametroContaDetalle;
	}

	public void setjTextFieldValorCampoGeneralParametroContaDetalle(
			JTextField jTextFieldValorCampoGeneralParametroContaDetalle) {
		this.jTextFieldValorCampoGeneralParametroContaDetalle = jTextFieldValorCampoGeneralParametroContaDetalle;
	}

	public void setBorderResaltarValorCampoGeneralParametroContaDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroContaDetalle.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralParametroContaDetalle .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosParametroContaDetalle() {
		return this.jCheckBoxSeleccionarTodosParametroContaDetalle;
	}

	public void setjCheckBoxSeleccionarTodosParametroContaDetalle(
			JCheckBox jCheckBoxSeleccionarTodosParametroContaDetalle) {
		this.jCheckBoxSeleccionarTodosParametroContaDetalle = jCheckBoxSeleccionarTodosParametroContaDetalle;
	}

	public void setBorderResaltarSeleccionarTodosParametroContaDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroContaDetalle.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosParametroContaDetalle .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosParametroContaDetalle() {
		return this.jCheckBoxSeleccionadosParametroContaDetalle;
	}

	public void setjCheckBoxSeleccionadosParametroContaDetalle(
			JCheckBox jCheckBoxSeleccionadosParametroContaDetalle) {
		this.jCheckBoxSeleccionadosParametroContaDetalle = jCheckBoxSeleccionadosParametroContaDetalle;
	}
	
	public void setBorderResaltarSeleccionadosParametroContaDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroContaDetalle.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosParametroContaDetalle .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesParametroContaDetalle() {
		return this.jComboBoxTiposArchivosReportesParametroContaDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesParametroContaDetalle(
			JComboBox jComboBoxTiposArchivosReportesParametroContaDetalle) {
		this.jComboBoxTiposArchivosReportesParametroContaDetalle = jComboBoxTiposArchivosReportesParametroContaDetalle;
	}

	public void setBorderResaltarTiposArchivosReportesParametroContaDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroContaDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesParametroContaDetalle .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesParametroContaDetalle() {
		return this.jComboBoxTiposReportesParametroContaDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesParametroContaDetalle(
			JComboBox jComboBoxTiposReportesParametroContaDetalle) {
		this.jComboBoxTiposReportesParametroContaDetalle = jComboBoxTiposReportesParametroContaDetalle;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoParametroContaDetalle() {
	//	return jComboBoxTiposReportesDinamicoParametroContaDetalle;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoParametroContaDetalle(
	//		JComboBox jComboBoxTiposReportesDinamicoParametroContaDetalle) {
	//	this.jComboBoxTiposReportesDinamicoParametroContaDetalle = jComboBoxTiposReportesDinamicoParametroContaDetalle;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoParametroContaDetalle() {
	//	return jComboBoxTiposArchivosReportesDinamicoParametroContaDetalle;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoParametroContaDetalle(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoParametroContaDetalle) {
	//	this.jComboBoxTiposArchivosReportesDinamicoParametroContaDetalle = jComboBoxTiposArchivosReportesDinamicoParametroContaDetalle;
	//}
	
	public void setBorderResaltarTiposReportesParametroContaDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroContaDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesParametroContaDetalle .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesParametroContaDetalle() {
		return this.jComboBoxTiposGraficosReportesParametroContaDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesParametroContaDetalle(
			JComboBox jComboBoxTiposGraficosReportesParametroContaDetalle) {
		this.jComboBoxTiposGraficosReportesParametroContaDetalle = jComboBoxTiposGraficosReportesParametroContaDetalle;
	}
	
	public void setBorderResaltarTiposGraficosReportesParametroContaDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroContaDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesParametroContaDetalle .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionParametroContaDetalle() {
		return this.jComboBoxTiposPaginacionParametroContaDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionParametroContaDetalle(
			JComboBox jComboBoxTiposPaginacionParametroContaDetalle) {
		this.jComboBoxTiposPaginacionParametroContaDetalle = jComboBoxTiposPaginacionParametroContaDetalle;
	}
	
	public void setBorderResaltarTiposPaginacionParametroContaDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroContaDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionParametroContaDetalle .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesParametroContaDetalle() {
		return this.jComboBoxTiposRelacionesParametroContaDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroContaDetalle() {
		return this.jComboBoxTiposAccionesParametroContaDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroContaDetalle(
			JComboBox jComboBoxTiposRelacionesParametroContaDetalle) {
		this.jComboBoxTiposRelacionesParametroContaDetalle = jComboBoxTiposRelacionesParametroContaDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroContaDetalle(
			JComboBox jComboBoxTiposAccionesParametroContaDetalle) {
		this.jComboBoxTiposAccionesParametroContaDetalle = jComboBoxTiposAccionesParametroContaDetalle;
	}
	
	public void setBorderResaltarTiposRelacionesParametroContaDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroContaDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesParametroContaDetalle .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesParametroContaDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroContaDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesParametroContaDetalle .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoParametroContaDetalle() {
	//	return jCheckBoxConGraficoDinamicoParametroContaDetalle;
	//}

	//public void setjCheckBoxConGraficoDinamicoParametroContaDetalle(
	//		JCheckBox jCheckBoxConGraficoDinamicoParametroContaDetalle) {
	//	this.jCheckBoxConGraficoDinamicoParametroContaDetalle = jCheckBoxConGraficoDinamicoParametroContaDetalle;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoParametroContaDetalle() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarParametroContaDetalle.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoParametroContaDetalle .setBorder(borderResaltar);		
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
		this.parametrocontadetalleSessionBean=new ParametroContaDetalleSessionBean();
		
		this.parametrocontadetalleSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrocontadetalleSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrocontadetalleSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ParametroContaDetalleJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ParametroContaDetalleJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroContaDetalleJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroContaDetalleJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroContaDetalleJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Conta Detalle MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {
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
		
		ParametroContaDetalleJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ParametroContaDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarParametroContaDetalle= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarParametroContaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarParametroContaDetalle,this.jTtoolBarParametroContaDetalle,
							"nuevo","nuevo","Nuevo"+" "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroContaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarParametroContaDetalle,this.jTtoolBarParametroContaDetalle,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroContaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarParametroContaDetalle,this.jTtoolBarParametroContaDetalle,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarParametroContaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarParametroContaDetalle,this.jTtoolBarParametroContaDetalle,
							"duplicar","duplicar","Duplicar"+" "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarParametroContaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarParametroContaDetalle,this.jTtoolBarParametroContaDetalle,
							"copiar","copiar","Copiar"+" "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarParametroContaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarParametroContaDetalle,this.jTtoolBarParametroContaDetalle,
							"ver_form","ver_form","Ver"+" "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarParametroContaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroContaDetalle,this.jTtoolBarParametroContaDetalle,
							"recargar","recargar","Recargar"+" "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarParametroContaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroContaDetalle,this.jTtoolBarParametroContaDetalle,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarParametroContaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroContaDetalle,this.jTtoolBarParametroContaDetalle,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarParametroContaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarParametroContaDetalle,this.jTtoolBarParametroContaDetalle,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarParametroContaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarParametroContaDetalle,this.jTtoolBarParametroContaDetalle,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarParametroContaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarParametroContaDetalle,this.jTtoolBarParametroContaDetalle,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarParametroContaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarParametroContaDetalle,this.jTtoolBarParametroContaDetalle,
							"cerrar","cerrar","Salir"+" "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarParametroContaDetalle=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarParametroContaDetalle;
			
				this.jButtonProcesarInformacionToolBarParametroContaDetalle=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarParametroContaDetalle;
				
		//protected JButton jButtonModificarToolBarParametroContaDetalle;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarParametroContaDetalle=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuParametroContaDetalle=new JMenuMe("General");
		this.jmenuArchivoParametroContaDetalle=new JMenuMe("Archivo");
		this.jmenuAccionesParametroContaDetalle=new JMenuMe("Acciones");
		this.jmenuDatosParametroContaDetalle=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroContaDetalle= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroContaDetalle.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroContaDetalle,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarParametroContaDetalle= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarParametroContaDetalle.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarParametroContaDetalle,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesParametroContaDetalle= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesParametroContaDetalle.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesParametroContaDetalle,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosParametroContaDetalle= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroContaDetalle.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroContaDetalle,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarParametroContaDetalle= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarParametroContaDetalle.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarParametroContaDetalle,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormParametroContaDetalle= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormParametroContaDetalle.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormParametroContaDetalle,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaParametroContaDetalle= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaParametroContaDetalle.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaParametroContaDetalle,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroContaDetalle= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroContaDetalle.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroContaDetalle,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionParametroContaDetalle= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionParametroContaDetalle.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionParametroContaDetalle,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionParametroContaDetalle= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionParametroContaDetalle.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionParametroContaDetalle,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresParametroContaDetalle= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresParametroContaDetalle.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresParametroContaDetalle,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesParametroContaDetalle= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesParametroContaDetalle.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesParametroContaDetalle,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByParametroContaDetalle= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByParametroContaDetalle.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByParametroContaDetalle,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroContaDetalle= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroContaDetalle.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroContaDetalle,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByParametroContaDetalle= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByParametroContaDetalle.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByParametroContaDetalle,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroContaDetalle= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroContaDetalle.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroContaDetalle,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosParametroContaDetalle= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosParametroContaDetalle.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosParametroContaDetalle,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoParametroContaDetalle.add(this.jMenuItemCerrarParametroContaDetalle);
			
			this.jmenuAccionesParametroContaDetalle.add(this.jMenuItemNuevoParametroContaDetalle);
			this.jmenuAccionesParametroContaDetalle.add(this.jMenuItemNuevoGuardarCambiosParametroContaDetalle);
			this.jmenuAccionesParametroContaDetalle.add(this.jMenuItemNuevoRelacionesParametroContaDetalle);
			this.jmenuAccionesParametroContaDetalle.add(this.jMenuItemGuardarCambiosTablaParametroContaDetalle);		
			this.jmenuAccionesParametroContaDetalle.add(this.jMenuItemDuplicarParametroContaDetalle);		
			this.jmenuAccionesParametroContaDetalle.add(this.jMenuItemCopiarParametroContaDetalle);		
			this.jmenuAccionesParametroContaDetalle.add(this.jMenuItemVerFormParametroContaDetalle);		
			
			this.jmenuDatosParametroContaDetalle.add(this.jMenuItemRecargarInformacionParametroContaDetalle);				
			this.jmenuDatosParametroContaDetalle.add(this.jMenuItemAnterioresParametroContaDetalle);				
			this.jmenuDatosParametroContaDetalle.add(this.jMenuItemSiguientesParametroContaDetalle);				
			this.jmenuDatosParametroContaDetalle.add(this.jMenuItemAbrirOrderByParametroContaDetalle);				
			this.jmenuDatosParametroContaDetalle.add(this.jMenuItemMostrarOcultarParametroContaDetalle);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesParametroContaDetalle.add(this.jMenuItemGuardarCambiosParametroContaDetalle);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarParametroContaDetalle.add(this.jmenuArchivoParametroContaDetalle);		
			this.jmenuBarParametroContaDetalle.add(this.jmenuAccionesParametroContaDetalle);		
			this.jmenuBarParametroContaDetalle.add(this.jmenuDatosParametroContaDetalle);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarParametroContaDetalle);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasParametroContaDetalle() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCuentaContableParametroContaDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableParametroContaDetalle.setToolTipText("Buscar Por Cuenta Contable ");
		this.jButtonFK_IdCuentaContableParametroContaDetalle= new JButtonMe();
		this.jButtonFK_IdCuentaContableParametroContaDetalle.setText("Buscar");
		this.jButtonFK_IdCuentaContableParametroContaDetalle.setToolTipText("Buscar Por Cuenta Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableParametroContaDetalle,"buscar_button","Buscar Por Cuenta Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableFK_IdCuentaContableParametroContaDetalle = new JLabelMe();
		jLabelid_cuenta_contableFK_IdCuentaContableParametroContaDetalle.setText("Cuenta Contable :");
		jLabelid_cuenta_contableFK_IdCuentaContableParametroContaDetalle.setToolTipText("Cuenta Contable");
		jLabelid_cuenta_contableFK_IdCuentaContableParametroContaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableParametroContaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableParametroContaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFK_IdCuentaContableParametroContaDetalle,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableFK_IdCuentaContableParametroContaDetalle= new JComboBoxMe();
		jComboBoxid_cuenta_contableFK_IdCuentaContableParametroContaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableParametroContaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableParametroContaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFK_IdCuentaContableParametroContaDetalle,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableParametroContaDetalle= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableParametroContaDetalle.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableParametroContaDetalle.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableParametroContaDetalle.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableParametroContaDetalle.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableParametroContaDetalle.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableParametroContaDetalle.setFocusable(false);

		this.jPanelFK_IdParametroContaParametroContaDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdParametroContaParametroContaDetalle.setToolTipText("Buscar Por Parametro Conta ");
		this.jButtonFK_IdParametroContaParametroContaDetalle= new JButtonMe();
		this.jButtonFK_IdParametroContaParametroContaDetalle.setText("Buscar");
		this.jButtonFK_IdParametroContaParametroContaDetalle.setToolTipText("Buscar Por Parametro Conta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdParametroContaParametroContaDetalle,"buscar_button","Buscar Por Parametro Conta ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdParametroContaParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_parametro_contaFK_IdParametroContaParametroContaDetalle = new JLabelMe();
		jLabelid_parametro_contaFK_IdParametroContaParametroContaDetalle.setText("Parametro Conta :");
		jLabelid_parametro_contaFK_IdParametroContaParametroContaDetalle.setToolTipText("Parametro Conta");
		jLabelid_parametro_contaFK_IdParametroContaParametroContaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_parametro_contaFK_IdParametroContaParametroContaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_parametro_contaFK_IdParametroContaParametroContaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_parametro_contaFK_IdParametroContaParametroContaDetalle,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_parametro_contaFK_IdParametroContaParametroContaDetalle= new JComboBoxMe();
		jComboBoxid_parametro_contaFK_IdParametroContaParametroContaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_parametro_contaFK_IdParametroContaParametroContaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_parametro_contaFK_IdParametroContaParametroContaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_parametro_contaFK_IdParametroContaParametroContaDetalle,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdParametroContaDetalleParametroContaDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdParametroContaDetalleParametroContaDetalle.setToolTipText("Buscar Por Tipo Parametro Conta ");
		this.jButtonFK_IdParametroContaDetalleParametroContaDetalle= new JButtonMe();
		this.jButtonFK_IdParametroContaDetalleParametroContaDetalle.setText("Buscar");
		this.jButtonFK_IdParametroContaDetalleParametroContaDetalle.setToolTipText("Buscar Por Tipo Parametro Conta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdParametroContaDetalleParametroContaDetalle,"buscar_button","Buscar Por Tipo Parametro Conta ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdParametroContaDetalleParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_parametro_contaFK_IdParametroContaDetalleParametroContaDetalle = new JLabelMe();
		jLabelid_tipo_parametro_contaFK_IdParametroContaDetalleParametroContaDetalle.setText("Tipo Parametro Conta :");
		jLabelid_tipo_parametro_contaFK_IdParametroContaDetalleParametroContaDetalle.setToolTipText("Tipo Parametro Conta");
		jLabelid_tipo_parametro_contaFK_IdParametroContaDetalleParametroContaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_parametro_contaFK_IdParametroContaDetalleParametroContaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_parametro_contaFK_IdParametroContaDetalleParametroContaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_parametro_contaFK_IdParametroContaDetalleParametroContaDetalle,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_parametro_contaFK_IdParametroContaDetalleParametroContaDetalle= new JComboBoxMe();
		jComboBoxid_tipo_parametro_contaFK_IdParametroContaDetalleParametroContaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_parametro_contaFK_IdParametroContaDetalleParametroContaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_parametro_contaFK_IdParametroContaDetalleParametroContaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_parametro_contaFK_IdParametroContaDetalleParametroContaDetalle,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasParametroContaDetalle=new JTabbedPane();


		this.jTabbedPaneBusquedasParametroContaDetalle.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParametroContaDetalle.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParametroContaDetalle.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasParametroContaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasParametroContaDetalle.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasParametroContaDetalle,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleParametroContaDetalle = new ParametroContaDetalleDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Parametro Conta Detalle DATOS");
			this.jInternalFrameDetalleFormParametroContaDetalle = new ParametroContaDetalleDetalleFormJInternalFrame(jDesktopPane,this.parametrocontadetalleSessionBean.getConGuardarRelaciones(),this.parametrocontadetalleSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormParametroContaDetalle = null;//new ParametroContaDetalleDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroContaDetalle= new GridBagLayout();
		
		
		this.jTableDatosParametroContaDetalle = new JTableMe();      
		
		String sToolTipParametroContaDetalle="";
		sToolTipParametroContaDetalle=ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroContaDetalle+="(Contabilidad.ParametroContaDetalle)";
		}
		
		if(!this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroContaDetalle+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosParametroContaDetalle.setToolTipText(sToolTipParametroContaDetalle);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosParametroContaDetalle);
		this.jTableDatosParametroContaDetalle.setAutoCreateRowSorter(true);
		this.jTableDatosParametroContaDetalle.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosParametroContaDetalle.setRowSelectionAllowed(true);
		this.jTableDatosParametroContaDetalle.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosParametroContaDetalle,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoParametroContaDetalle = new JButtonMe();
		this.jButtonDuplicarParametroContaDetalle = new JButtonMe();
		this.jButtonCopiarParametroContaDetalle = new JButtonMe();
		this.jButtonVerFormParametroContaDetalle = new JButtonMe();
		this.jButtonNuevoRelacionesParametroContaDetalle = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaParametroContaDetalle = new JButtonMe();
		this.jButtonCerrarParametroContaDetalle = new JButtonMe();
		
		this.jScrollPanelDatosParametroContaDetalle = new JScrollPane();   
        this.jScrollPanelDatosGeneralParametroContaDetalle = new JScrollPane();
		
				
		
		
		this.jPanelAccionesParametroContaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Conta Detalle";
		
		if(!this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroContaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Conta Detalles" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroContaDetalle.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralParametroContaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesParametroContaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroContaDetalle.setToolTipText("Acciones");
        this.jPanelAccionesParametroContaDetalle.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoParametroContaDetalle=new ReporteDinamicoJInternalFrame(ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoParametroContaDetalle();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionParametroContaDetalle=new ImportacionJInternalFrame(ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionParametroContaDetalle();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByParametroContaDetalle = new JButtonMe();
		
		this.jButtonAbrirOrderByParametroContaDetalle.setText("Orden");
		this.jButtonAbrirOrderByParametroContaDetalle.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroContaDetalle,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByParametroContaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByParametroContaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroContaDetalle=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroContaDetalle,false,this);
			
			//this.cargarOrderByParametroContaDetalle(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroContaDetalle=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroContaDetalle,true,this);
			
			//this.cargarOrderByParametroContaDetalle(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosParametroContaDetalle.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosParametroContaDetalle.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosParametroContaDetalle.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosParametroContaDetalle.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroContaDetalle.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroContaDetalle.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoParametroContaDetalle.setText("Nuevo");
		this.jButtonDuplicarParametroContaDetalle.setText("Duplicar");
		this.jButtonCopiarParametroContaDetalle.setText("Copiar");
		this.jButtonVerFormParametroContaDetalle.setText("Ver");
		this.jButtonNuevoRelacionesParametroContaDetalle.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaParametroContaDetalle.setText("Guardar");
		this.jButtonCerrarParametroContaDetalle.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroContaDetalle,"nuevo_button","Nuevo",this.parametrocontadetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarParametroContaDetalle,"duplicar_button","Duplicar",this.parametrocontadetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarParametroContaDetalle,"copiar_button","Copiar",this.parametrocontadetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormParametroContaDetalle,"ver_form","Ver",this.parametrocontadetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesParametroContaDetalle,"nuevorelaciones_button","Nuevo Rel",this.parametrocontadetalleSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroContaDetalle,"guardarcambiostabla_button","Guardar",this.parametrocontadetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroContaDetalle,"cerrar_button","Salir",this.parametrocontadetalleSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoParametroContaDetalle.setToolTipText("Nuevo"+" "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarParametroContaDetalle.setToolTipText("Duplicar"+" "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarParametroContaDetalle.setToolTipText("Copiar"+" "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormParametroContaDetalle.setToolTipText("Ver"+" "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesParametroContaDetalle.setToolTipText("Nuevo Rel"+" "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaParametroContaDetalle.setToolTipText("Guardar"+" "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroContaDetalle.setToolTipText("Salir"+" "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroContaDetalle";
		inputMap = this.jButtonNuevoParametroContaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroContaDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroContaDetalle"));
		
		//DUPLICAR
		sMapKey = "DuplicarParametroContaDetalle";
		inputMap = this.jButtonDuplicarParametroContaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarParametroContaDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarParametroContaDetalle"));
		
		//COPIAR
		sMapKey = "CopiarParametroContaDetalle";
		inputMap = this.jButtonCopiarParametroContaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarParametroContaDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarParametroContaDetalle"));
		
		//VEr FORM
		sMapKey = "VerFormParametroContaDetalle";
		inputMap = this.jButtonVerFormParametroContaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormParametroContaDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormParametroContaDetalle"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesParametroContaDetalle";
		inputMap = this.jButtonNuevoRelacionesParametroContaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesParametroContaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesParametroContaDetalle"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarParametroContaDetalle";
		inputMap = this.jButtonModificarParametroContaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarParametroContaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarParametroContaDetalle"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarParametroContaDetalle";
		inputMap = this.jButtonCerrarParametroContaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroContaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroContaDetalle"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroContaDetalle";
		inputMap = this.jButtonGuardarCambiosTablaParametroContaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroContaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroContaDetalle"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesParametroContaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesParametroContaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionParametroContaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ParametroContaDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ParametroContaDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ParametroContaDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ParametroContaDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ParametroContaDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesParametroContaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesParametroContaDetalle.setName("jPanelParametrosReportesParametroContaDetalle"); 
		
		this.jPanelParametrosReportesAccionesParametroContaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesParametroContaDetalle.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesParametroContaDetalle.setName("jPanelParametrosReportesAccionesParametroContaDetalle"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionParametroContaDetalle = new JButtonMe();
		this.jButtonRecargarInformacionParametroContaDetalle.setText("Recargar");
		this.jButtonRecargarInformacionParametroContaDetalle.setToolTipText("Recargar"+" "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionParametroContaDetalle,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionParametroContaDetalle = new JButtonMe();
		this.jButtonProcesarInformacionParametroContaDetalle.setText("Procesar");
		this.jButtonProcesarInformacionParametroContaDetalle.setToolTipText("Procesar"+" "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionParametroContaDetalle.setVisible(false);
			
		this.jButtonProcesarInformacionParametroContaDetalle.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroContaDetalle.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroContaDetalle.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesParametroContaDetalle = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroContaDetalle.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesParametroContaDetalle.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesParametroContaDetalle = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroContaDetalle.setText("TIPO");       
		this.jComboBoxTiposReportesParametroContaDetalle.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesParametroContaDetalle = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroContaDetalle.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesParametroContaDetalle.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionParametroContaDetalle = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionParametroContaDetalle.setText("Paginacion");
		this.jComboBoxTiposPaginacionParametroContaDetalle.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesParametroContaDetalle = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesParametroContaDetalle.setText("Accion");
		this.jComboBoxTiposRelacionesParametroContaDetalle.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesParametroContaDetalle = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroContaDetalle.setText("Accion");
		this.jComboBoxTiposAccionesParametroContaDetalle.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarParametroContaDetalle = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarParametroContaDetalle.setText("Accion");
		this.jComboBoxTiposSeleccionarParametroContaDetalle.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralParametroContaDetalle=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralParametroContaDetalle.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroContaDetalle.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroContaDetalle.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesParametroContaDetalle = new JLabelMe();
		
		this.jLabelAccionesParametroContaDetalle.setText("Acciones");		
		this.jLabelAccionesParametroContaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroContaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroContaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosParametroContaDetalle = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosParametroContaDetalle.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosParametroContaDetalle.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosParametroContaDetalle = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosParametroContaDetalle.setText("Seleccionados");
		this.jCheckBoxSeleccionadosParametroContaDetalle.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaParametroContaDetalle = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaParametroContaDetalle.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaParametroContaDetalle.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteParametroContaDetalle = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteParametroContaDetalle.setText("Graf.");
		this.jCheckBoxConGraficoReporteParametroContaDetalle.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresParametroContaDetalle = new JButtonMe();
		//this.jButtonAnterioresParametroContaDetalle.setText("<<");
        this.jButtonAnterioresParametroContaDetalle.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresParametroContaDetalle,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesParametroContaDetalle = new JButtonMe();
		//this.jButtonSiguientesParametroContaDetalle.setText(">>");
        this.jButtonSiguientesParametroContaDetalle.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesParametroContaDetalle,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosParametroContaDetalle = new JButtonMe();
		this.jButtonNuevoGuardarCambiosParametroContaDetalle.setText("Nue");
        this.jButtonNuevoGuardarCambiosParametroContaDetalle.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosParametroContaDetalle,"nuevoguardarcambios_button","Nue",this.parametrocontadetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosParametroContaDetalle";
		inputMap = this.jButtonNuevoGuardarCambiosParametroContaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosParametroContaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosParametroContaDetalle"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionParametroContaDetalle";
		inputMap = this.jButtonRecargarInformacionParametroContaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionParametroContaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionParametroContaDetalle"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesParametroContaDetalle";
		inputMap = this.jButtonSiguientesParametroContaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesParametroContaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesParametroContaDetalle"));
		
		//ANTERIORES		
		sMapKey = "AnterioresParametroContaDetalle";
		inputMap = this.jButtonAnterioresParametroContaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresParametroContaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresParametroContaDetalle"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasParametroContaDetalle();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesParametroContaDetalle.setMinimumSize(new Dimension(this.getWidth(),ParametroContaDetalleBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroContaDetalleBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroContaDetalle.setMaximumSize(new Dimension(this.getWidth(),ParametroContaDetalleBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroContaDetalleBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroContaDetalle.setPreferredSize(new Dimension(this.getWidth(),ParametroContaDetalleBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroContaDetalleBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionParametroContaDetalle = new GridBagLayout();

			this.jPanelPaginacionParametroContaDetalle.setLayout(gridaBagLayoutPaginacionParametroContaDetalle);						
			
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			this.gridBagConstraintsParametroContaDetalle.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroContaDetalle.gridy = 0;
			this.gridBagConstraintsParametroContaDetalle.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionParametroContaDetalle.add(this.jButtonAnterioresParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
					
						
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			this.gridBagConstraintsParametroContaDetalle.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroContaDetalle.gridy = 0;
			
			this.jPanelPaginacionParametroContaDetalle.add(this.jButtonNuevoGuardarCambiosParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
						
			
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			this.gridBagConstraintsParametroContaDetalle.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsParametroContaDetalle.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroContaDetalle.gridy = 0;
			this.jPanelPaginacionParametroContaDetalle.add(this.jButtonSiguientesParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroContaDetalle.gridy = 1;
			this.gridBagConstraintsParametroContaDetalle.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroContaDetalle.add(this.jButtonNuevoParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
						
			
			
			if(!this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
				this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsParametroContaDetalle.gridy = 1;
				this.gridBagConstraintsParametroContaDetalle.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionParametroContaDetalle.add(this.jButtonGuardarCambiosTablaParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
			}
			
			
			
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroContaDetalle.gridy = 1;
			this.gridBagConstraintsParametroContaDetalle.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroContaDetalle.add(this.jButtonDuplicarParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
			
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroContaDetalle.gridy = 1;
			this.gridBagConstraintsParametroContaDetalle.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroContaDetalle.add(this.jButtonCopiarParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
		
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroContaDetalle.gridy = 1;
			this.gridBagConstraintsParametroContaDetalle.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroContaDetalle.add(this.jButtonVerFormParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
		
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroContaDetalle.gridy = 1;
			this.gridBagConstraintsParametroContaDetalle.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionParametroContaDetalle.add(this.jButtonCerrarParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
		
		
		
		this.jButtonRecargarInformacionParametroContaDetalle.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroContaDetalle.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroContaDetalle.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesParametroContaDetalle.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroContaDetalle.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroContaDetalle.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesParametroContaDetalle.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroContaDetalle.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroContaDetalle.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesParametroContaDetalle.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroContaDetalle.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroContaDetalle.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionParametroContaDetalle.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroContaDetalle.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroContaDetalle.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesParametroContaDetalle.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroContaDetalle.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroContaDetalle.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesParametroContaDetalle.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroContaDetalle.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroContaDetalle.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarParametroContaDetalle.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroContaDetalle.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroContaDetalle.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaParametroContaDetalle.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroContaDetalle.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroContaDetalle.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteParametroContaDetalle.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroContaDetalle.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroContaDetalle.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosParametroContaDetalle.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroContaDetalle.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroContaDetalle.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosParametroContaDetalle.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroContaDetalle.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroContaDetalle.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesParametroContaDetalle = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesParametroContaDetalle = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ParametroContaDetalle = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ParametroContaDetalle = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ParametroContaDetalle = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ParametroContaDetalle = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesParametroContaDetalle.setLayout(gridaBagParametrosReportesParametroContaDetalle);
			this.jPanelParametrosReportesAccionesParametroContaDetalle.setLayout(gridaBagParametrosReportesAccionesParametroContaDetalle);
			
			
			this.jPanelParametrosAuxiliar1ParametroContaDetalle.setLayout(gridaBagParametrosAuxiliar1ParametroContaDetalle);
			this.jPanelParametrosAuxiliar2ParametroContaDetalle.setLayout(gridaBagParametrosAuxiliar2ParametroContaDetalle);
			this.jPanelParametrosAuxiliar3ParametroContaDetalle.setLayout(gridaBagParametrosAuxiliar3ParametroContaDetalle);
			this.jPanelParametrosAuxiliar4ParametroContaDetalle.setLayout(gridaBagParametrosAuxiliar4ParametroContaDetalle);
			//this.jPanelParametrosAuxiliar5ParametroContaDetalle.setLayout(gridaBagParametrosAuxiliar2ParametroContaDetalle);			
			
			
			
			
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroContaDetalle.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroContaDetalle.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroContaDetalle.add(this.jButtonRecargarInformacionParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			this.gridBagConstraintsParametroContaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroContaDetalle.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroContaDetalle.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroContaDetalle.add(this.jComboBoxTiposPaginacionParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			this.gridBagConstraintsParametroContaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroContaDetalle.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroContaDetalle.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroContaDetalle.add(this.jCheckBoxConAltoMaximoTablaParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			this.gridBagConstraintsParametroContaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroContaDetalle.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroContaDetalle.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroContaDetalle.add(this.jComboBoxTiposArchivosReportesParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			this.gridBagConstraintsParametroContaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroContaDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroContaDetalle.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroContaDetalle.add(this.jPanelParametrosAuxiliar1ParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			this.gridBagConstraintsParametroContaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroContaDetalle.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroContaDetalle.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ParametroContaDetalle.add(this.jComboBoxTiposReportesParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			this.gridBagConstraintsParametroContaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroContaDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroContaDetalle.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroContaDetalle.add(this.jPanelParametrosAuxiliar4ParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			this.gridBagConstraintsParametroContaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroContaDetalle.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroContaDetalle.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroContaDetalle.add(this.jComboBoxTiposReportesParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			this.gridBagConstraintsParametroContaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroContaDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroContaDetalle.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroContaDetalle.add(this.jCheckBoxGenerarReporteParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			this.gridBagConstraintsParametroContaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroContaDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroContaDetalle.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroContaDetalle.add(this.jPanelParametrosAuxiliar2ParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroContaDetalle.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroContaDetalle.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroContaDetalle.add(this.jLabelAccionesParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
				this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsParametroContaDetalle.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsParametroContaDetalle.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesParametroContaDetalle.add(this.jButtonAbrirOrderByParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsParametroContaDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroContaDetalle.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroContaDetalle.add(this.jComboBoxTiposSeleccionarParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);			
			
			
			/*
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroContaDetalle.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroContaDetalle.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroContaDetalle.add(this.jCheckBoxSeleccionarTodosParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			this.gridBagConstraintsParametroContaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroContaDetalle.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroContaDetalle.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroContaDetalle.add(this.jCheckBoxSeleccionarTodosParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);															
				
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			this.gridBagConstraintsParametroContaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroContaDetalle.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroContaDetalle.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroContaDetalle.add(this.jCheckBoxSeleccionadosParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			this.gridBagConstraintsParametroContaDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroContaDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroContaDetalle.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroContaDetalle.add(this.jPanelParametrosAuxiliar3ParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			this.gridBagConstraintsParametroContaDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroContaDetalle.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroContaDetalle.add(this.jComboBoxTiposAccionesParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
	
				
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			this.gridBagConstraintsParametroContaDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroContaDetalle.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroContaDetalle.add(this.jTextFieldValorCampoGeneralParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosParametroContaDetalle = new GridBagLayout();

			this.jScrollPanelDatosParametroContaDetalle.setLayout(gridaBagLayoutDatosParametroContaDetalle);
			
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroContaDetalle.gridy = 0;
			this.gridBagConstraintsParametroContaDetalle.gridx = 0;
			
			this.jScrollPanelDatosParametroContaDetalle.add(this.jTableDatosParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosParametroContaDetalle.setViewportView(this.jTableDatosParametroContaDetalle);
		this.jTableDatosParametroContaDetalle.setFillsViewportHeight(true);
		this.jTableDatosParametroContaDetalle.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesParametroContaDetalle= new GridBagLayout();
		this.jPanelAccionesParametroContaDetalle.setLayout(gridaBagLayoutAccionesParametroContaDetalle);
		
		
		/*	
		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroContaDetalle.gridy = 0;
		this.gridBagConstraintsParametroContaDetalle.gridx = 0;
			
		this.jPanelAccionesParametroContaDetalle.add(this.jButtonNuevoParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCuentaContableParametroContaDetalle= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableParametroContaDetalle.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableParametroContaDetalle.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableParametroContaDetalle.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableParametroContaDetalle.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableParametroContaDetalle.setLayout(gridaBagLayoutFK_IdCuentaContableParametroContaDetalle);

		gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		gridBagConstraintsParametroContaDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroContaDetalle.gridy = 0;
		gridBagConstraintsParametroContaDetalle.gridx = 0;
		jPanelFK_IdCuentaContableParametroContaDetalle.add(jLabelid_cuenta_contableFK_IdCuentaContableParametroContaDetalle, gridBagConstraintsParametroContaDetalle);

		gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		gridBagConstraintsParametroContaDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroContaDetalle.gridy = 0;
		gridBagConstraintsParametroContaDetalle.gridx = 1;
		jPanelFK_IdCuentaContableParametroContaDetalle.add(jComboBoxid_cuenta_contableFK_IdCuentaContableParametroContaDetalle, gridBagConstraintsParametroContaDetalle);


		gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		gridBagConstraintsParametroContaDetalle.anchor = GridBagConstraints.EAST;
		gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.NONE;
		gridBagConstraintsParametroContaDetalle.gridy = 0;
		gridBagConstraintsParametroContaDetalle.gridx = 0;
		jPanelFK_IdCuentaContableParametroContaDetalle.add(this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableParametroContaDetalle, gridBagConstraintsParametroContaDetalle);

		gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		gridBagConstraintsParametroContaDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroContaDetalle.gridy = 1;
		gridBagConstraintsParametroContaDetalle.gridx =1;
		jPanelFK_IdCuentaContableParametroContaDetalle.add(jButtonFK_IdCuentaContableParametroContaDetalle, gridBagConstraintsParametroContaDetalle);

		jTabbedPaneBusquedasParametroContaDetalle.addTab("1.-Por Cuenta Contable ", jPanelFK_IdCuentaContableParametroContaDetalle);
		jTabbedPaneBusquedasParametroContaDetalle.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdParametroContaParametroContaDetalle= new GridBagLayout();
		gridaBagLayoutFK_IdParametroContaParametroContaDetalle.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdParametroContaParametroContaDetalle.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdParametroContaParametroContaDetalle.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdParametroContaParametroContaDetalle.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdParametroContaParametroContaDetalle.setLayout(gridaBagLayoutFK_IdParametroContaParametroContaDetalle);

		gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		gridBagConstraintsParametroContaDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroContaDetalle.gridy = 0;
		gridBagConstraintsParametroContaDetalle.gridx = 0;
		jPanelFK_IdParametroContaParametroContaDetalle.add(jLabelid_parametro_contaFK_IdParametroContaParametroContaDetalle, gridBagConstraintsParametroContaDetalle);

		gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		gridBagConstraintsParametroContaDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroContaDetalle.gridy = 0;
		gridBagConstraintsParametroContaDetalle.gridx = 1;
		jPanelFK_IdParametroContaParametroContaDetalle.add(jComboBoxid_parametro_contaFK_IdParametroContaParametroContaDetalle, gridBagConstraintsParametroContaDetalle);

		gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		gridBagConstraintsParametroContaDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroContaDetalle.gridy = 1;
		gridBagConstraintsParametroContaDetalle.gridx =1;
		jPanelFK_IdParametroContaParametroContaDetalle.add(jButtonFK_IdParametroContaParametroContaDetalle, gridBagConstraintsParametroContaDetalle);

		jTabbedPaneBusquedasParametroContaDetalle.addTab("2.-Por Parametro Conta ", jPanelFK_IdParametroContaParametroContaDetalle);
		jTabbedPaneBusquedasParametroContaDetalle.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdParametroContaDetalleParametroContaDetalle= new GridBagLayout();
		gridaBagLayoutFK_IdParametroContaDetalleParametroContaDetalle.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdParametroContaDetalleParametroContaDetalle.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdParametroContaDetalleParametroContaDetalle.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdParametroContaDetalleParametroContaDetalle.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdParametroContaDetalleParametroContaDetalle.setLayout(gridaBagLayoutFK_IdParametroContaDetalleParametroContaDetalle);

		gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		gridBagConstraintsParametroContaDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroContaDetalle.gridy = 0;
		gridBagConstraintsParametroContaDetalle.gridx = 0;
		jPanelFK_IdParametroContaDetalleParametroContaDetalle.add(jLabelid_tipo_parametro_contaFK_IdParametroContaDetalleParametroContaDetalle, gridBagConstraintsParametroContaDetalle);

		gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		gridBagConstraintsParametroContaDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroContaDetalle.gridy = 0;
		gridBagConstraintsParametroContaDetalle.gridx = 1;
		jPanelFK_IdParametroContaDetalleParametroContaDetalle.add(jComboBoxid_tipo_parametro_contaFK_IdParametroContaDetalleParametroContaDetalle, gridBagConstraintsParametroContaDetalle);

		gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		gridBagConstraintsParametroContaDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroContaDetalle.gridy = 1;
		gridBagConstraintsParametroContaDetalle.gridx =1;
		jPanelFK_IdParametroContaDetalleParametroContaDetalle.add(jButtonFK_IdParametroContaDetalleParametroContaDetalle, gridBagConstraintsParametroContaDetalle);

		jTabbedPaneBusquedasParametroContaDetalle.addTab("3.-Por Tipo Parametro Conta ", jPanelFK_IdParametroContaDetalleParametroContaDetalle);
		jTabbedPaneBusquedasParametroContaDetalle.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroContaDetalle = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroContaDetalle);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();						
			this.gridBagConstraintsParametroContaDetalle.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroContaDetalle.gridx = 0;		
			//this.gridBagConstraintsParametroContaDetalle.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroContaDetalle.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroContaDetalle.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		this.gridBagConstraintsParametroContaDetalle.gridy = iGridyPrincipal++;
		this.gridBagConstraintsParametroContaDetalle.gridx = 0;		
		//this.gridBagConstraintsParametroContaDetalle.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroContaDetalle.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsParametroContaDetalle.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsParametroContaDetalle);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsParametroContaDetalle.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroContaDetalle.gridx = 0;		
			this.gridBagConstraintsParametroContaDetalle.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroContaDetalle.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsParametroContaDetalle.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		this.gridBagConstraintsParametroContaDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroContaDetalle.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);								
		
		
		/*
		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		this.gridBagConstraintsParametroContaDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroContaDetalle.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
		*/		
		
		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		this.gridBagConstraintsParametroContaDetalle.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroContaDetalle.gridx =0;
		this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroContaDetalle.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
				
		
		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		this.gridBagConstraintsParametroContaDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroContaDetalle.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ParametroContaDetalleJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosParametroContaDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroContaDetalle = new GridBagLayout();
			this.jPanelBusquedasParametrosParametroContaDetalle.setLayout(gridaBagLayoutBusquedasParametrosParametroContaDetalle);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralParametroContaDetalle=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroContaDetalle.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroContaDetalle.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroContaDetalle.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}
			
			
			Boolean tieneColumnasOcultas=false;
			
			
			
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
		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		this.gridBagConstraintsParametroContaDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroContaDetalle.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
			
			
		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		this.gridBagConstraintsParametroContaDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroContaDetalle.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
		
			
		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		this.gridBagConstraintsParametroContaDetalle.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroContaDetalle.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralParametroContaDetalle;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoParametroContaDetalle() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoParametroContaDetalle = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoParametroContaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoParametroContaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoParametroContaDetalle.setName("jPanelReporteDinamicoParametroContaDetalle"); 
		
		this.jPanelReporteDinamicoParametroContaDetalle.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroContaDetalle.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroContaDetalle.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoParametroContaDetalle.setLayout(gridaBagLayoutReporteDinamicoParametroContaDetalle);
		
		
		this.jInternalFrameReporteDinamicoParametroContaDetalle= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoParametroContaDetalle = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroContaDetalle= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoParametroContaDetalle.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoParametroContaDetalle.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoParametroContaDetalle.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoParametroContaDetalle.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoParametroContaDetalle.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoParametroContaDetalle.setResizable(true);
	    this.jInternalFrameReporteDinamicoParametroContaDetalle.setClosable(true);
	    this.jInternalFrameReporteDinamicoParametroContaDetalle.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoParametroContaDetalle.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroContaDetalle.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroContaDetalle.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoParametroContaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Conta Detalles"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteParametroContaDetalle = new JLabelMe();

		this.jLabelColumnasSelectReporteParametroContaDetalle.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteParametroContaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroContaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroContaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroContaDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroContaDetalle.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroContaDetalle.add(this.jLabelColumnasSelectReporteParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteParametroContaDetalle = new JList<Reporte>();
		this.jListColumnasSelectReporteParametroContaDetalle.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteParametroContaDetalle.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteParametroContaDetalle.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroContaDetalle.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroContaDetalle.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteParametroContaDetalle=new JScrollPane(this.jListColumnasSelectReporteParametroContaDetalle);
			
			this.jScrollColumnasSelectReporteParametroContaDetalle.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroContaDetalle.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroContaDetalle.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteParametroContaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroContaDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroContaDetalle.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoParametroContaDetalle.add(this.jListColumnasSelectReporteParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
		this.jPanelReporteDinamicoParametroContaDetalle.add(this.jScrollColumnasSelectReporteParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteParametroContaDetalle = new JLabelMe();

		this.jLabelRelacionesSelectReporteParametroContaDetalle.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteParametroContaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroContaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroContaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteParametroContaDetalle = new JList<Reporte>();
		this.jListRelacionesSelectReporteParametroContaDetalle.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteParametroContaDetalle.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteParametroContaDetalle.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroContaDetalle.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroContaDetalle.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteParametroContaDetalle=new JScrollPane(this.jListRelacionesSelectReporteParametroContaDetalle);
			
			this.jScrollRelacionesSelectReporteParametroContaDetalle.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroContaDetalle.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroContaDetalle.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteParametroContaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoParametroContaDetalle = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoParametroContaDetalle = new JComboBoxMe();
		this.jListColumnasValoresGraficoParametroContaDetalle = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoParametroContaDetalle = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoParametroContaDetalle.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoParametroContaDetalle.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroContaDetalle.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroContaDetalle.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoParametroContaDetalle = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoParametroContaDetalle.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoParametroContaDetalle.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroContaDetalle.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroContaDetalle.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoParametroContaDetalle = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoParametroContaDetalle.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoParametroContaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroContaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroContaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroContaDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroContaDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroContaDetalle.add(this.jLabelGenerarExcelReporteDinamicoParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoParametroContaDetalle = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoParametroContaDetalle.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoParametroContaDetalle,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoParametroContaDetalle.setToolTipText("Generar EXCEL"+" "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		//this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsParametroContaDetalle.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsParametroContaDetalle.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoParametroContaDetalle.add(this.jButtonGenerarExcelReporteDinamicoParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroContaDetalle.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroContaDetalle.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroContaDetalle.add(this.jComboBoxTiposReportesDinamicoParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoParametroContaDetalle = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoParametroContaDetalle.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoParametroContaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroContaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroContaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroContaDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroContaDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroContaDetalle.add(this.jLabelTiposArchivoReporteDinamicoParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroContaDetalle.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroContaDetalle.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroContaDetalle.add(this.jComboBoxTiposArchivosReportesDinamicoParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoParametroContaDetalle = new JButtonMe();
		this.jButtonGenerarReporteDinamicoParametroContaDetalle.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoParametroContaDetalle,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoParametroContaDetalle.setToolTipText("Generar"+" "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroContaDetalle.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroContaDetalle.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroContaDetalle.add(this.jButtonGenerarReporteDinamicoParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoParametroContaDetalle = new JButtonMe();
		this.jButtonCerrarReporteDinamicoParametroContaDetalle.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoParametroContaDetalle,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoParametroContaDetalle.setToolTipText("Cancelar"+" "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroContaDetalle.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroContaDetalle.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroContaDetalle.add(this.jButtonCerrarReporteDinamicoParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalParametroContaDetalle = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoParametroContaDetalle= new JScrollPane(jPanelReporteDinamicoParametroContaDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoParametroContaDetalle.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroContaDetalle.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroContaDetalle.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoParametroContaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Conta Detalles"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		this.gridBagConstraintsParametroContaDetalle.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsParametroContaDetalle.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoParametroContaDetalle.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoParametroContaDetalle.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalParametroContaDetalle);
		this.jInternalFrameReporteDinamicoParametroContaDetalle.getContentPane().add(this.jScrollPanelReporteDinamicoParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionParametroContaDetalle() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionParametroContaDetalle = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionParametroContaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionParametroContaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionParametroContaDetalle.setName("jPanelImportacionParametroContaDetalle"); 
		
		this.jPanelImportacionParametroContaDetalle.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroContaDetalle.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroContaDetalle.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionParametroContaDetalle.setLayout(gridaBagLayoutImportacionParametroContaDetalle);
		
		
		this.jInternalFrameImportacionParametroContaDetalle= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionParametroContaDetalle= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionParametroContaDetalle = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroContaDetalle= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionParametroContaDetalle.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroContaDetalle.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroContaDetalle.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionParametroContaDetalle.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroContaDetalle.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroContaDetalle.setResizable(true);
	    this.jInternalFrameImportacionParametroContaDetalle.setClosable(true);
	    this.jInternalFrameImportacionParametroContaDetalle.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionParametroContaDetalle.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroContaDetalle.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroContaDetalle.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionParametroContaDetalle.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroContaDetalle.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroContaDetalle.setResizable(true);
	    this.jInternalFrameImportacionParametroContaDetalle.setClosable(true);
	    this.jInternalFrameImportacionParametroContaDetalle.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionParametroContaDetalle.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroContaDetalle.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroContaDetalle.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionParametroContaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Conta Detalles"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionParametroContaDetalle = new JLabelMe();

		this.jLabelArchivoImportacionParametroContaDetalle.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionParametroContaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroContaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroContaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroContaDetalle.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroContaDetalle.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroContaDetalle.add(this.jLabelArchivoImportacionParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionParametroContaDetalle = new JFileChooser();		
		this.jFileChooserImportacionParametroContaDetalle.setToolTipText("ESCOGER ARCHIVO"+" "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionParametroContaDetalle = new JButtonMe();
		this.jButtonAbrirImportacionParametroContaDetalle.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionParametroContaDetalle,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionParametroContaDetalle.setToolTipText("Generar"+" "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroContaDetalle.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroContaDetalle.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroContaDetalle.add(this.jButtonAbrirImportacionParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionParametroContaDetalle = new JLabelMe();

		this.jLabelPathArchivoImportacionParametroContaDetalle.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionParametroContaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroContaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroContaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroContaDetalle.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroContaDetalle.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroContaDetalle.add(this.jLabelPathArchivoImportacionParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionParametroContaDetalle=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionParametroContaDetalle.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroContaDetalle.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroContaDetalle.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroContaDetalle.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroContaDetalle.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroContaDetalle.add(this.jTextFieldPathArchivoImportacionParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionParametroContaDetalle = new JButtonMe();
		this.jButtonGenerarImportacionParametroContaDetalle.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionParametroContaDetalle,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionParametroContaDetalle.setToolTipText("Generar"+" "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroContaDetalle.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroContaDetalle.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroContaDetalle.add(this.jButtonGenerarImportacionParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionParametroContaDetalle = new JButtonMe();
		this.jButtonCerrarImportacionParametroContaDetalle.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionParametroContaDetalle,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionParametroContaDetalle.setToolTipText("Cancelar"+" "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroContaDetalle.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroContaDetalle.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroContaDetalle.add(this.jButtonCerrarImportacionParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalParametroContaDetalle = new GridBagLayout();
		
		this.jScrollPanelImportacionParametroContaDetalle= new JScrollPane(jPanelImportacionParametroContaDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		this.gridBagConstraintsParametroContaDetalle.gridy =iPosYImportacion;
		this.gridBagConstraintsParametroContaDetalle.gridx =iPosXImportacion;
		this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionParametroContaDetalle.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionParametroContaDetalle.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalParametroContaDetalle);
		this.jInternalFrameImportacionParametroContaDetalle.getContentPane().add(this.jScrollPanelImportacionParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByParametroContaDetalle(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByParametroContaDetalle = new JButtonMe();
			this.jButtonAbrirOrderByParametroContaDetalle.setText("Orden");
			this.jButtonAbrirOrderByParametroContaDetalle.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroContaDetalle,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByParametroContaDetalle";
			inputMap = this.jButtonAbrirOrderByParametroContaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByParametroContaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByParametroContaDetalle"));
		
		
			GridBagLayout gridaBagLayoutOrderByParametroContaDetalle = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByParametroContaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByParametroContaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByParametroContaDetalle.setName("jPanelOrderByParametroContaDetalle"); 
			
			this.jPanelOrderByParametroContaDetalle.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroContaDetalle.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroContaDetalle.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByParametroContaDetalle.setLayout(gridaBagLayoutOrderByParametroContaDetalle);
			
			
			this.jTableDatosParametroContaDetalleOrderBy = new JTableMe();        
			this.jTableDatosParametroContaDetalleOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosParametroContaDetalleOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosParametroContaDetalleOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosParametroContaDetalleOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosParametroContaDetalleOrderBy.setViewportView(this.jTableDatosParametroContaDetalleOrderBy);
			this.jTableDatosParametroContaDetalleOrderBy.setFillsViewportHeight(true);
			this.jTableDatosParametroContaDetalleOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByParametroContaDetalle= new OrderByJInternalFrame();
			this.jInternalFrameOrderByParametroContaDetalle= new OrderByJInternalFrame();
			this.jScrollPanelOrderByParametroContaDetalle = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteParametroContaDetalle= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByParametroContaDetalle.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByParametroContaDetalle.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByParametroContaDetalle.setTitle("Orden");
			this.jInternalFrameOrderByParametroContaDetalle.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByParametroContaDetalle.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByParametroContaDetalle.setResizable(true);
			this.jInternalFrameOrderByParametroContaDetalle.setClosable(true);
			this.jInternalFrameOrderByParametroContaDetalle.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByParametroContaDetalle.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroContaDetalle.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroContaDetalle.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByParametroContaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Conta Detalles"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			this.gridBagConstraintsParametroContaDetalle.gridy =iPosYOrderBy++;
			this.gridBagConstraintsParametroContaDetalle.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsParametroContaDetalle.ipady =150;
				
			this.jPanelOrderByParametroContaDetalle.add(jScrollPanelDatosParametroContaDetalleOrderBy, this.gridBagConstraintsParametroContaDetalle);//this.jTableDatosParametroContaDetalleTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByParametroContaDetalle = new JButtonMe();
			this.jButtonCerrarOrderByParametroContaDetalle.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByParametroContaDetalle,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByParametroContaDetalle.setToolTipText("Cancelar"+" "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroContaDetalle.gridy = iPosYOrderBy++;
			this.gridBagConstraintsParametroContaDetalle.gridx = iPosXOrderBy;
									
			this.jPanelOrderByParametroContaDetalle.add(this.jButtonCerrarOrderByParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalParametroContaDetalle = new GridBagLayout();
			
			this.jScrollPanelOrderByParametroContaDetalle= new JScrollPane(jPanelOrderByParametroContaDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			this.gridBagConstraintsParametroContaDetalle.gridy =iPosYOrderBy;
			this.gridBagConstraintsParametroContaDetalle.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByParametroContaDetalle.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByParametroContaDetalle.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalParametroContaDetalle);
			
			this.jInternalFrameOrderByParametroContaDetalle.getContentPane().add(this.jScrollPanelOrderByParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);			
		
		} else {
			this.jButtonAbrirOrderByParametroContaDetalle = new JButtonMe();
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
		int iWidthTableCalculado=0;//930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.parametrocontadetalleSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosParametroContaDetalle.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosParametroContaDetalle.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosParametroContaDetalle.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosParametroContaDetalle.getRowHeight();//ParametroContaDetalleConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ParametroContaDetalleConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroContaDetalle.isSelected()) {
					iHeightTable=ParametroContaDetalleConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroContaDetalleConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroContaDetalleConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ParametroContaDetalleConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroContaDetalle.isSelected()) {
					iHeightTable=ParametroContaDetalleConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroContaDetalleConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroContaDetalleConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosParametroContaDetalle.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroContaDetalle.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroContaDetalle.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosParametroContaDetalle.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroContaDetalle.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroContaDetalle.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByParametroContaDetalle!=null && this.jInternalFrameOrderByParametroContaDetalle.getjTableDatosOrderBy()!=null) {
			//if(!this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByParametroContaDetalle.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByParametroContaDetalle.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByParametroContaDetalle.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByParametroContaDetalle.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByParametroContaDetalle.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByParametroContaDetalle.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByParametroContaDetalle.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosParametroContaDetalle.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroContaDetalle.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroContaDetalle.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=parametrocontadetalleLogic.getParametroContaDetalles().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrocontadetalles.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ParametroContaDetalle> TraerParametroContaDetalleBeans(List<ParametroContaDetalle> parametrocontadetalles,ArrayList<Classe> classes)throws Exception {
		try {
			for(ParametroContaDetalle parametrocontadetalle:parametrocontadetalles) {
					
				if(!(ParametroContaDetalleConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ParametroContaDetalleConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					parametrocontadetalle.setsDetalleGeneralEntityReporte(ParametroContaDetalleConstantesFunciones.getParametroContaDetalleDescripcion(parametrocontadetalle));
										
						
					
						
					
				} else  {
							
					//parametrocontadetalle.setsDetalleGeneralEntityReporte(parametrocontadetalle.getsDetalleGeneralEntityReporte());
										
				}
				
				//parametrocontadetallebeans.add(parametrocontadetallebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return parametrocontadetalles;
    }
	//PARA REPORTES FIN
}
