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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.tesoreria.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.util.ParametroTesoreriaDefectoConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.*;
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
public class ParametroTesoreriaDefectoJInternalFrame extends ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarParametroTesoreriaDefecto;
	
	protected JMenuBar jmenuBarParametroTesoreriaDefecto;
	
	protected JMenu jmenuParametroTesoreriaDefecto;
	protected JMenu jmenuDatosParametroTesoreriaDefecto;
	protected JMenu jmenuArchivoParametroTesoreriaDefecto;
	protected JMenu jmenuAccionesParametroTesoreriaDefecto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosParametroTesoreriaDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroTesoreriaDefecto;	
	protected GridBagConstraints gridBagConstraintsParametroTesoreriaDefecto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ParametroTesoreriaDefectoDetalleFormJInternalFrame jInternalFrameDetalleFormParametroTesoreriaDefecto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoParametroTesoreriaDefecto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionParametroTesoreriaDefecto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TipoCuentaBancoGlobalBeanSwingJInternalFrame tipocuentabancoglobalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocuentabancoglobal="";
	
	public ParametroTesoreriaDefectoSessionBean parametrotesoreriadefectoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TipoCuentaBancoGlobalSessionBean tipocuentabancoglobalSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ParametroTesoreriaDefecto> parametrotesoreriadefectos;		
	public List<ParametroTesoreriaDefecto> parametrotesoreriadefectosEliminados;	
	public List<ParametroTesoreriaDefecto> parametrotesoreriadefectosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByParametroTesoreriaDefecto;		
	protected JButton jButtonAbrirOrderByParametroTesoreriaDefecto;
	
	
	//protected JPanel jPanelOrderByParametroTesoreriaDefecto;
	//public JScrollPane jScrollPanelOrderByParametroTesoreriaDefecto;	
	//protected JButton jButtonCerrarOrderByParametroTesoreriaDefecto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ParametroTesoreriaDefectoLogic parametrotesoreriadefectoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosParametroTesoreriaDefecto;
	public JScrollPane jScrollPanelDatosEdicionParametroTesoreriaDefecto;
	public JScrollPane jScrollPanelDatosGeneralParametroTesoreriaDefecto;
    
	
	
	//public JScrollPane jScrollPanelDatosParametroTesoreriaDefectoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoParametroTesoreriaDefecto;
	//public JScrollPane jScrollPanelImportacionParametroTesoreriaDefecto;
	
	
	
	protected JPanel jPanelAccionesParametroTesoreriaDefecto;
	
    protected JPanel jPanelPaginacionParametroTesoreriaDefecto;
    protected JPanel jPanelParametrosReportesParametroTesoreriaDefecto;
	protected JPanel jPanelParametrosReportesAccionesParametroTesoreriaDefecto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ParametroTesoreriaDefecto;
	protected JPanel jPanelParametrosAuxiliar2ParametroTesoreriaDefecto;
	protected JPanel jPanelParametrosAuxiliar3ParametroTesoreriaDefecto;
	protected JPanel jPanelParametrosAuxiliar4ParametroTesoreriaDefecto;
	//protected JPanel jPanelParametrosAuxiliar5ParametroTesoreriaDefecto;
	
	
	
	//protected JPanel jPanelReporteDinamicoParametroTesoreriaDefecto;
	//protected JPanel jPanelImportacionParametroTesoreriaDefecto;
	
	
	public JTable jTableDatosParametroTesoreriaDefecto;
	
	
	
	//public JTable jTableDatosParametroTesoreriaDefectoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoParametroTesoreriaDefecto;
	protected JButton jButtonDuplicarParametroTesoreriaDefecto;
	protected JButton jButtonCopiarParametroTesoreriaDefecto;
	protected JButton jButtonVerFormParametroTesoreriaDefecto;
	protected JButton jButtonNuevoRelacionesParametroTesoreriaDefecto;
	protected JButton jButtonModificarParametroTesoreriaDefecto;
	
    protected JButton jButtonGuardarCambiosTablaParametroTesoreriaDefecto;
	protected JButton jButtonCerrarParametroTesoreriaDefecto;
	
	
	protected JButton jButtonRecargarInformacionParametroTesoreriaDefecto;
	protected JButton jButtonProcesarInformacionParametroTesoreriaDefecto;
	
	
	protected JButton jButtonAnterioresParametroTesoreriaDefecto;
	protected JButton jButtonSiguientesParametroTesoreriaDefecto;
	protected JButton jButtonNuevoGuardarCambiosParametroTesoreriaDefecto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoParametroTesoreriaDefecto;
	//protected JButton jButtonCerrarReporteDinamicoParametroTesoreriaDefecto;
	//protected JButton jButtonGenerarExcelReporteDinamicoParametroTesoreriaDefecto;	
	
	
	
	//protected JButton jButtonAbrirImportacionParametroTesoreriaDefecto;
	//protected JButton jButtonGenerarImportacionParametroTesoreriaDefecto;
	//protected JButton jButtonCerrarImportacionParametroTesoreriaDefecto;
	//protected JFileChooser jFileChooserImportacionParametroTesoreriaDefecto;
	//protected File fileImportacionParametroTesoreriaDefecto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroTesoreriaDefecto;
	protected JButton jButtonDuplicarToolBarParametroTesoreriaDefecto;
	protected JButton jButtonNuevoRelacionesToolBarParametroTesoreriaDefecto;
	
	
	public JButton jButtonGuardarCambiosToolBarParametroTesoreriaDefecto;
	protected JButton jButtonCopiarToolBarParametroTesoreriaDefecto;
	protected JButton jButtonVerFormToolBarParametroTesoreriaDefecto;
	public JButton jButtonGuardarCambiosTablaToolBarParametroTesoreriaDefecto;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroTesoreriaDefecto;
	protected JButton jButtonCerrarToolBarParametroTesoreriaDefecto;
	
	protected JButton jButtonRecargarInformacionToolBarParametroTesoreriaDefecto;
	protected JButton jButtonProcesarInformacionToolBarParametroTesoreriaDefecto;
	protected JButton jButtonAnterioresToolBarParametroTesoreriaDefecto;
	protected JButton jButtonSiguientesToolBarParametroTesoreriaDefecto;
	protected JButton jButtonNuevoGuardarCambiosToolBarParametroTesoreriaDefecto;
	protected JButton jButtonAbrirOrderByToolBarParametroTesoreriaDefecto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroTesoreriaDefecto;
	protected JMenuItem jMenuItemDuplicarParametroTesoreriaDefecto;
	protected JMenuItem jMenuItemNuevoRelacionesParametroTesoreriaDefecto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosParametroTesoreriaDefecto;
	protected JMenuItem jMenuItemCopiarParametroTesoreriaDefecto;
	protected JMenuItem jMenuItemVerFormParametroTesoreriaDefecto;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroTesoreriaDefecto;
	protected JMenuItem jMenuItemCerrarParametroTesoreriaDefecto;
	protected JMenuItem jMenuItemDetalleCerrarParametroTesoreriaDefecto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByParametroTesoreriaDefecto;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroTesoreriaDefecto;
	
	protected JMenuItem jMenuItemRecargarInformacionParametroTesoreriaDefecto;
	protected JMenuItem jMenuItemProcesarInformacionParametroTesoreriaDefecto;
	protected JMenuItem jMenuItemAnterioresParametroTesoreriaDefecto;
	protected JMenuItem jMenuItemSiguientesParametroTesoreriaDefecto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroTesoreriaDefecto;
	protected JMenuItem jMenuItemAbrirOrderByParametroTesoreriaDefecto;
	protected JMenuItem jMenuItemMostrarOcultarParametroTesoreriaDefecto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroTesoreriaDefecto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosParametroTesoreriaDefecto;
	protected JCheckBox jCheckBoxSeleccionadosParametroTesoreriaDefecto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaParametroTesoreriaDefecto;
	protected JCheckBox jCheckBoxConGraficoReporteParametroTesoreriaDefecto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesParametroTesoreriaDefecto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesParametroTesoreriaDefecto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoParametroTesoreriaDefecto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoParametroTesoreriaDefecto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesParametroTesoreriaDefecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionParametroTesoreriaDefecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroTesoreriaDefecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroTesoreriaDefecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarParametroTesoreriaDefecto;
	protected JTextField jTextFieldValorCampoGeneralParametroTesoreriaDefecto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteParametroTesoreriaDefecto;
	//public JList<Reporte> jListColumnasSelectReporteParametroTesoreriaDefecto;
	//public JScrollPane jScrollColumnasSelectReporteParametroTesoreriaDefecto;
	
	//public JLabel jLabelRelacionesSelectReporteParametroTesoreriaDefecto;
	//public JList<Reporte> jListRelacionesSelectReporteParametroTesoreriaDefecto;
	//public JScrollPane jScrollRelacionesSelectReporteParametroTesoreriaDefecto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoParametroTesoreriaDefecto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoParametroTesoreriaDefecto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoParametroTesoreriaDefecto;
	//public JLabel jLabelTiposArchivoReporteDinamicoParametroTesoreriaDefecto;
	
		
	//public JLabel jLabelArchivoImportacionParametroTesoreriaDefecto;	
	//public JLabel jLabelPathArchivoImportacionParametroTesoreriaDefecto;
	//protected JTextField jTextFieldPathArchivoImportacionParametroTesoreriaDefecto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoParametroTesoreriaDefecto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoParametroTesoreriaDefecto;
	
	//public JLabel jLabelColumnaCategoriaValorParametroTesoreriaDefecto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorParametroTesoreriaDefecto;
	
	//public JLabel jLabelColumnasValoresGraficoParametroTesoreriaDefecto;
	//public JList<Reporte> jListColumnasValoresGraficoParametroTesoreriaDefecto;
	//public JScrollPane jScrollColumnasValoresGraficoParametroTesoreriaDefecto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoParametroTesoreriaDefecto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoParametroTesoreriaDefecto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasParametroTesoreriaDefecto;
	public JPanel jPanelFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto;
	public JButton jButtonFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto;
	
	public JPanel jPanelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto;
	public JLabel jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto;
	public JButton jButtonid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto= new JButtonMe();
	public JButton jButtonid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefectoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefectoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=198;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ParametroTesoreriaDefectoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ParametroTesoreriaDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroTesoreriaDefectoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroTesoreriaDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroTesoreriaDefectoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroTesoreriaDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroTesoreriaDefectoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroTesoreriaDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionParametroTesoreriaDefecto)	{
		this.jButtonRecargarInformacionParametroTesoreriaDefecto = jButtonRecargarInformacionParametroTesoreriaDefecto;
	}
	
	public JButton getjButtonProcesarInformacionParametroTesoreriaDefecto() {
		return this.jButtonProcesarInformacionParametroTesoreriaDefecto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroTesoreriaDefecto)	{
		this.jButtonProcesarInformacionParametroTesoreriaDefecto = jButtonProcesarInformacionParametroTesoreriaDefecto;
	}
	
	
	public JButton getjButtonRecargarInformacionParametroTesoreriaDefecto() {
		return this.jButtonRecargarInformacionParametroTesoreriaDefecto;
	}
	
	
	public List<ParametroTesoreriaDefecto> getparametrotesoreriadefectos() {
		return this.parametrotesoreriadefectos;
	}

	public void setparametrotesoreriadefectos(List<ParametroTesoreriaDefecto> parametrotesoreriadefectos) {
		this.parametrotesoreriadefectos = parametrotesoreriadefectos;
	}
	
	public List<ParametroTesoreriaDefecto> getparametrotesoreriadefectosAux() {
		return this.parametrotesoreriadefectosAux;
	}

	public void setparametrotesoreriadefectosAux(List<ParametroTesoreriaDefecto> parametrotesoreriadefectosAux) {
		this.parametrotesoreriadefectosAux = parametrotesoreriadefectosAux;
	}
	
	public List<ParametroTesoreriaDefecto> getparametrotesoreriadefectosEliminados() {
		return this.parametrotesoreriadefectosEliminados;
	}

	public void setParametroTesoreriaDefectosEliminados(List<ParametroTesoreriaDefecto> parametrotesoreriadefectosEliminados) {
		this.parametrotesoreriadefectosEliminados = parametrotesoreriadefectosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarParametroTesoreriaDefecto() {
		return jComboBoxTiposSeleccionarParametroTesoreriaDefecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarParametroTesoreriaDefecto(
			JComboBox jComboBoxTiposSeleccionarParametroTesoreriaDefecto) {
		this.jComboBoxTiposSeleccionarParametroTesoreriaDefecto = jComboBoxTiposSeleccionarParametroTesoreriaDefecto;
	}
	
	public void setBorderResaltarTiposSeleccionarParametroTesoreriaDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarParametroTesoreriaDefecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarParametroTesoreriaDefecto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralParametroTesoreriaDefecto() {
		return jTextFieldValorCampoGeneralParametroTesoreriaDefecto;
	}

	public void setjTextFieldValorCampoGeneralParametroTesoreriaDefecto(
			JTextField jTextFieldValorCampoGeneralParametroTesoreriaDefecto) {
		this.jTextFieldValorCampoGeneralParametroTesoreriaDefecto = jTextFieldValorCampoGeneralParametroTesoreriaDefecto;
	}

	public void setBorderResaltarValorCampoGeneralParametroTesoreriaDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroTesoreriaDefecto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralParametroTesoreriaDefecto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosParametroTesoreriaDefecto() {
		return this.jCheckBoxSeleccionarTodosParametroTesoreriaDefecto;
	}

	public void setjCheckBoxSeleccionarTodosParametroTesoreriaDefecto(
			JCheckBox jCheckBoxSeleccionarTodosParametroTesoreriaDefecto) {
		this.jCheckBoxSeleccionarTodosParametroTesoreriaDefecto = jCheckBoxSeleccionarTodosParametroTesoreriaDefecto;
	}

	public void setBorderResaltarSeleccionarTodosParametroTesoreriaDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroTesoreriaDefecto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosParametroTesoreriaDefecto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosParametroTesoreriaDefecto() {
		return this.jCheckBoxSeleccionadosParametroTesoreriaDefecto;
	}

	public void setjCheckBoxSeleccionadosParametroTesoreriaDefecto(
			JCheckBox jCheckBoxSeleccionadosParametroTesoreriaDefecto) {
		this.jCheckBoxSeleccionadosParametroTesoreriaDefecto = jCheckBoxSeleccionadosParametroTesoreriaDefecto;
	}
	
	public void setBorderResaltarSeleccionadosParametroTesoreriaDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroTesoreriaDefecto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosParametroTesoreriaDefecto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesParametroTesoreriaDefecto() {
		return this.jComboBoxTiposArchivosReportesParametroTesoreriaDefecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesParametroTesoreriaDefecto(
			JComboBox jComboBoxTiposArchivosReportesParametroTesoreriaDefecto) {
		this.jComboBoxTiposArchivosReportesParametroTesoreriaDefecto = jComboBoxTiposArchivosReportesParametroTesoreriaDefecto;
	}

	public void setBorderResaltarTiposArchivosReportesParametroTesoreriaDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroTesoreriaDefecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesParametroTesoreriaDefecto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesParametroTesoreriaDefecto() {
		return this.jComboBoxTiposReportesParametroTesoreriaDefecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesParametroTesoreriaDefecto(
			JComboBox jComboBoxTiposReportesParametroTesoreriaDefecto) {
		this.jComboBoxTiposReportesParametroTesoreriaDefecto = jComboBoxTiposReportesParametroTesoreriaDefecto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoParametroTesoreriaDefecto() {
	//	return jComboBoxTiposReportesDinamicoParametroTesoreriaDefecto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoParametroTesoreriaDefecto(
	//		JComboBox jComboBoxTiposReportesDinamicoParametroTesoreriaDefecto) {
	//	this.jComboBoxTiposReportesDinamicoParametroTesoreriaDefecto = jComboBoxTiposReportesDinamicoParametroTesoreriaDefecto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoParametroTesoreriaDefecto() {
	//	return jComboBoxTiposArchivosReportesDinamicoParametroTesoreriaDefecto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoParametroTesoreriaDefecto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoParametroTesoreriaDefecto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoParametroTesoreriaDefecto = jComboBoxTiposArchivosReportesDinamicoParametroTesoreriaDefecto;
	//}
	
	public void setBorderResaltarTiposReportesParametroTesoreriaDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroTesoreriaDefecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesParametroTesoreriaDefecto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesParametroTesoreriaDefecto() {
		return this.jComboBoxTiposGraficosReportesParametroTesoreriaDefecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesParametroTesoreriaDefecto(
			JComboBox jComboBoxTiposGraficosReportesParametroTesoreriaDefecto) {
		this.jComboBoxTiposGraficosReportesParametroTesoreriaDefecto = jComboBoxTiposGraficosReportesParametroTesoreriaDefecto;
	}
	
	public void setBorderResaltarTiposGraficosReportesParametroTesoreriaDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroTesoreriaDefecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesParametroTesoreriaDefecto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionParametroTesoreriaDefecto() {
		return this.jComboBoxTiposPaginacionParametroTesoreriaDefecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionParametroTesoreriaDefecto(
			JComboBox jComboBoxTiposPaginacionParametroTesoreriaDefecto) {
		this.jComboBoxTiposPaginacionParametroTesoreriaDefecto = jComboBoxTiposPaginacionParametroTesoreriaDefecto;
	}
	
	public void setBorderResaltarTiposPaginacionParametroTesoreriaDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroTesoreriaDefecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionParametroTesoreriaDefecto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesParametroTesoreriaDefecto() {
		return this.jComboBoxTiposRelacionesParametroTesoreriaDefecto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroTesoreriaDefecto() {
		return this.jComboBoxTiposAccionesParametroTesoreriaDefecto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroTesoreriaDefecto(
			JComboBox jComboBoxTiposRelacionesParametroTesoreriaDefecto) {
		this.jComboBoxTiposRelacionesParametroTesoreriaDefecto = jComboBoxTiposRelacionesParametroTesoreriaDefecto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroTesoreriaDefecto(
			JComboBox jComboBoxTiposAccionesParametroTesoreriaDefecto) {
		this.jComboBoxTiposAccionesParametroTesoreriaDefecto = jComboBoxTiposAccionesParametroTesoreriaDefecto;
	}
	
	public void setBorderResaltarTiposRelacionesParametroTesoreriaDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroTesoreriaDefecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesParametroTesoreriaDefecto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesParametroTesoreriaDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroTesoreriaDefecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesParametroTesoreriaDefecto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoParametroTesoreriaDefecto() {
	//	return jCheckBoxConGraficoDinamicoParametroTesoreriaDefecto;
	//}

	//public void setjCheckBoxConGraficoDinamicoParametroTesoreriaDefecto(
	//		JCheckBox jCheckBoxConGraficoDinamicoParametroTesoreriaDefecto) {
	//	this.jCheckBoxConGraficoDinamicoParametroTesoreriaDefecto = jCheckBoxConGraficoDinamicoParametroTesoreriaDefecto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoParametroTesoreriaDefecto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarParametroTesoreriaDefecto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoParametroTesoreriaDefecto .setBorder(borderResaltar);		
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
		this.parametrotesoreriadefectoSessionBean=new ParametroTesoreriaDefectoSessionBean();
		
		this.parametrotesoreriadefectoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrotesoreriadefectoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ParametroTesoreriaDefectoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ParametroTesoreriaDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroTesoreriaDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroTesoreriaDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroTesoreriaDefectoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Tesoreria Defecto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {
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
		
		ParametroTesoreriaDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ParametroTesoreriaDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarParametroTesoreriaDefecto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarParametroTesoreriaDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarParametroTesoreriaDefecto,this.jTtoolBarParametroTesoreriaDefecto,
							"nuevo","nuevo","Nuevo"+" "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroTesoreriaDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarParametroTesoreriaDefecto,this.jTtoolBarParametroTesoreriaDefecto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroTesoreriaDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarParametroTesoreriaDefecto,this.jTtoolBarParametroTesoreriaDefecto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarParametroTesoreriaDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarParametroTesoreriaDefecto,this.jTtoolBarParametroTesoreriaDefecto,
							"duplicar","duplicar","Duplicar"+" "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarParametroTesoreriaDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarParametroTesoreriaDefecto,this.jTtoolBarParametroTesoreriaDefecto,
							"copiar","copiar","Copiar"+" "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarParametroTesoreriaDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarParametroTesoreriaDefecto,this.jTtoolBarParametroTesoreriaDefecto,
							"ver_form","ver_form","Ver"+" "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarParametroTesoreriaDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroTesoreriaDefecto,this.jTtoolBarParametroTesoreriaDefecto,
							"recargar","recargar","Recargar"+" "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarParametroTesoreriaDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroTesoreriaDefecto,this.jTtoolBarParametroTesoreriaDefecto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarParametroTesoreriaDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroTesoreriaDefecto,this.jTtoolBarParametroTesoreriaDefecto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarParametroTesoreriaDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarParametroTesoreriaDefecto,this.jTtoolBarParametroTesoreriaDefecto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarParametroTesoreriaDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarParametroTesoreriaDefecto,this.jTtoolBarParametroTesoreriaDefecto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarParametroTesoreriaDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarParametroTesoreriaDefecto,this.jTtoolBarParametroTesoreriaDefecto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarParametroTesoreriaDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarParametroTesoreriaDefecto,this.jTtoolBarParametroTesoreriaDefecto,
							"cerrar","cerrar","Salir"+" "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarParametroTesoreriaDefecto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarParametroTesoreriaDefecto;
			
				this.jButtonProcesarInformacionToolBarParametroTesoreriaDefecto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarParametroTesoreriaDefecto;
				
		//protected JButton jButtonModificarToolBarParametroTesoreriaDefecto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarParametroTesoreriaDefecto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuParametroTesoreriaDefecto=new JMenuMe("General");
		this.jmenuArchivoParametroTesoreriaDefecto=new JMenuMe("Archivo");
		this.jmenuAccionesParametroTesoreriaDefecto=new JMenuMe("Acciones");
		this.jmenuDatosParametroTesoreriaDefecto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroTesoreriaDefecto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroTesoreriaDefecto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroTesoreriaDefecto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarParametroTesoreriaDefecto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarParametroTesoreriaDefecto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarParametroTesoreriaDefecto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesParametroTesoreriaDefecto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesParametroTesoreriaDefecto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesParametroTesoreriaDefecto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosParametroTesoreriaDefecto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroTesoreriaDefecto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroTesoreriaDefecto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarParametroTesoreriaDefecto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarParametroTesoreriaDefecto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarParametroTesoreriaDefecto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormParametroTesoreriaDefecto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormParametroTesoreriaDefecto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormParametroTesoreriaDefecto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaParametroTesoreriaDefecto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaParametroTesoreriaDefecto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaParametroTesoreriaDefecto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroTesoreriaDefecto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroTesoreriaDefecto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroTesoreriaDefecto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionParametroTesoreriaDefecto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionParametroTesoreriaDefecto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionParametroTesoreriaDefecto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionParametroTesoreriaDefecto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionParametroTesoreriaDefecto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionParametroTesoreriaDefecto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresParametroTesoreriaDefecto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresParametroTesoreriaDefecto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresParametroTesoreriaDefecto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesParametroTesoreriaDefecto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesParametroTesoreriaDefecto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesParametroTesoreriaDefecto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByParametroTesoreriaDefecto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByParametroTesoreriaDefecto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByParametroTesoreriaDefecto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroTesoreriaDefecto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroTesoreriaDefecto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroTesoreriaDefecto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByParametroTesoreriaDefecto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByParametroTesoreriaDefecto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByParametroTesoreriaDefecto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroTesoreriaDefecto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroTesoreriaDefecto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroTesoreriaDefecto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosParametroTesoreriaDefecto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosParametroTesoreriaDefecto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosParametroTesoreriaDefecto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoParametroTesoreriaDefecto.add(this.jMenuItemCerrarParametroTesoreriaDefecto);
			
			this.jmenuAccionesParametroTesoreriaDefecto.add(this.jMenuItemNuevoParametroTesoreriaDefecto);
			this.jmenuAccionesParametroTesoreriaDefecto.add(this.jMenuItemNuevoGuardarCambiosParametroTesoreriaDefecto);
			this.jmenuAccionesParametroTesoreriaDefecto.add(this.jMenuItemNuevoRelacionesParametroTesoreriaDefecto);
			this.jmenuAccionesParametroTesoreriaDefecto.add(this.jMenuItemGuardarCambiosTablaParametroTesoreriaDefecto);		
			this.jmenuAccionesParametroTesoreriaDefecto.add(this.jMenuItemDuplicarParametroTesoreriaDefecto);		
			this.jmenuAccionesParametroTesoreriaDefecto.add(this.jMenuItemCopiarParametroTesoreriaDefecto);		
			this.jmenuAccionesParametroTesoreriaDefecto.add(this.jMenuItemVerFormParametroTesoreriaDefecto);		
			
			this.jmenuDatosParametroTesoreriaDefecto.add(this.jMenuItemRecargarInformacionParametroTesoreriaDefecto);				
			this.jmenuDatosParametroTesoreriaDefecto.add(this.jMenuItemAnterioresParametroTesoreriaDefecto);				
			this.jmenuDatosParametroTesoreriaDefecto.add(this.jMenuItemSiguientesParametroTesoreriaDefecto);				
			this.jmenuDatosParametroTesoreriaDefecto.add(this.jMenuItemAbrirOrderByParametroTesoreriaDefecto);				
			this.jmenuDatosParametroTesoreriaDefecto.add(this.jMenuItemMostrarOcultarParametroTesoreriaDefecto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesParametroTesoreriaDefecto.add(this.jMenuItemGuardarCambiosParametroTesoreriaDefecto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarParametroTesoreriaDefecto.add(this.jmenuArchivoParametroTesoreriaDefecto);		
			this.jmenuBarParametroTesoreriaDefecto.add(this.jmenuAccionesParametroTesoreriaDefecto);		
			this.jmenuBarParametroTesoreriaDefecto.add(this.jmenuDatosParametroTesoreriaDefecto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarParametroTesoreriaDefecto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasParametroTesoreriaDefecto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto.setToolTipText("Buscar Por Tipo Cuenta ");
		this.jButtonFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto= new JButtonMe();
		this.jButtonFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto.setText("Buscar");
		this.jButtonFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto.setToolTipText("Buscar Por Tipo Cuenta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto,"buscar_button","Buscar Por Tipo Cuenta ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto = new JLabelMe();
		jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto.setText("Tipo Cuenta :");
		jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto.setToolTipText("Tipo Cuenta");
		jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto= new JComboBoxMe();
		jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasParametroTesoreriaDefecto=new JTabbedPane();


		this.jTabbedPaneBusquedasParametroTesoreriaDefecto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParametroTesoreriaDefecto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParametroTesoreriaDefecto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasParametroTesoreriaDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasParametroTesoreriaDefecto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasParametroTesoreriaDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleParametroTesoreriaDefecto = new ParametroTesoreriaDefectoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Parametro Tesoreria Defecto DATOS");
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto = new ParametroTesoreriaDefectoDetalleFormJInternalFrame(jDesktopPane,this.parametrotesoreriadefectoSessionBean.getConGuardarRelaciones(),this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormParametroTesoreriaDefecto = null;//new ParametroTesoreriaDefectoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroTesoreriaDefecto= new GridBagLayout();
		
		
		this.jTableDatosParametroTesoreriaDefecto = new JTableMe();      
		
		String sToolTipParametroTesoreriaDefecto="";
		sToolTipParametroTesoreriaDefecto=ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroTesoreriaDefecto+="(Tesoreria.ParametroTesoreriaDefecto)";
		}
		
		if(!this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroTesoreriaDefecto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosParametroTesoreriaDefecto.setToolTipText(sToolTipParametroTesoreriaDefecto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosParametroTesoreriaDefecto);
		this.jTableDatosParametroTesoreriaDefecto.setAutoCreateRowSorter(true);
		this.jTableDatosParametroTesoreriaDefecto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosParametroTesoreriaDefecto.setRowSelectionAllowed(true);
		this.jTableDatosParametroTesoreriaDefecto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosParametroTesoreriaDefecto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoParametroTesoreriaDefecto = new JButtonMe();
		this.jButtonDuplicarParametroTesoreriaDefecto = new JButtonMe();
		this.jButtonCopiarParametroTesoreriaDefecto = new JButtonMe();
		this.jButtonVerFormParametroTesoreriaDefecto = new JButtonMe();
		this.jButtonNuevoRelacionesParametroTesoreriaDefecto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaParametroTesoreriaDefecto = new JButtonMe();
		this.jButtonCerrarParametroTesoreriaDefecto = new JButtonMe();
		
		this.jScrollPanelDatosParametroTesoreriaDefecto = new JScrollPane();   
        this.jScrollPanelDatosGeneralParametroTesoreriaDefecto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesParametroTesoreriaDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Tesoreria Defecto";
		
		if(!this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroTesoreriaDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Tesoreria Defectos" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroTesoreriaDefecto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralParametroTesoreriaDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesParametroTesoreriaDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroTesoreriaDefecto.setToolTipText("Acciones");
        this.jPanelAccionesParametroTesoreriaDefecto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto=new ReporteDinamicoJInternalFrame(ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoParametroTesoreriaDefecto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionParametroTesoreriaDefecto=new ImportacionJInternalFrame(ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionParametroTesoreriaDefecto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByParametroTesoreriaDefecto = new JButtonMe();
		
		this.jButtonAbrirOrderByParametroTesoreriaDefecto.setText("Orden");
		this.jButtonAbrirOrderByParametroTesoreriaDefecto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroTesoreriaDefecto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByParametroTesoreriaDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByParametroTesoreriaDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroTesoreriaDefecto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroTesoreriaDefecto,false,this);
			
			//this.cargarOrderByParametroTesoreriaDefecto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroTesoreriaDefecto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroTesoreriaDefecto,true,this);
			
			//this.cargarOrderByParametroTesoreriaDefecto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosParametroTesoreriaDefecto.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosParametroTesoreriaDefecto.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosParametroTesoreriaDefecto.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosParametroTesoreriaDefecto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroTesoreriaDefecto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroTesoreriaDefecto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoParametroTesoreriaDefecto.setText("Nuevo");
		this.jButtonDuplicarParametroTesoreriaDefecto.setText("Duplicar");
		this.jButtonCopiarParametroTesoreriaDefecto.setText("Copiar");
		this.jButtonVerFormParametroTesoreriaDefecto.setText("Ver");
		this.jButtonNuevoRelacionesParametroTesoreriaDefecto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaParametroTesoreriaDefecto.setText("Guardar");
		this.jButtonCerrarParametroTesoreriaDefecto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroTesoreriaDefecto,"nuevo_button","Nuevo",this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarParametroTesoreriaDefecto,"duplicar_button","Duplicar",this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarParametroTesoreriaDefecto,"copiar_button","Copiar",this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormParametroTesoreriaDefecto,"ver_form","Ver",this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesParametroTesoreriaDefecto,"nuevorelaciones_button","Nuevo Rel",this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroTesoreriaDefecto,"guardarcambiostabla_button","Guardar",this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroTesoreriaDefecto,"cerrar_button","Salir",this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoParametroTesoreriaDefecto.setToolTipText("Nuevo"+" "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarParametroTesoreriaDefecto.setToolTipText("Duplicar"+" "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarParametroTesoreriaDefecto.setToolTipText("Copiar"+" "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormParametroTesoreriaDefecto.setToolTipText("Ver"+" "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesParametroTesoreriaDefecto.setToolTipText("Nuevo Rel"+" "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaParametroTesoreriaDefecto.setToolTipText("Guardar"+" "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroTesoreriaDefecto.setToolTipText("Salir"+" "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroTesoreriaDefecto";
		inputMap = this.jButtonNuevoParametroTesoreriaDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroTesoreriaDefecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroTesoreriaDefecto"));
		
		//DUPLICAR
		sMapKey = "DuplicarParametroTesoreriaDefecto";
		inputMap = this.jButtonDuplicarParametroTesoreriaDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarParametroTesoreriaDefecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarParametroTesoreriaDefecto"));
		
		//COPIAR
		sMapKey = "CopiarParametroTesoreriaDefecto";
		inputMap = this.jButtonCopiarParametroTesoreriaDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarParametroTesoreriaDefecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarParametroTesoreriaDefecto"));
		
		//VEr FORM
		sMapKey = "VerFormParametroTesoreriaDefecto";
		inputMap = this.jButtonVerFormParametroTesoreriaDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormParametroTesoreriaDefecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormParametroTesoreriaDefecto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesParametroTesoreriaDefecto";
		inputMap = this.jButtonNuevoRelacionesParametroTesoreriaDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesParametroTesoreriaDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesParametroTesoreriaDefecto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarParametroTesoreriaDefecto";
		inputMap = this.jButtonModificarParametroTesoreriaDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarParametroTesoreriaDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarParametroTesoreriaDefecto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarParametroTesoreriaDefecto";
		inputMap = this.jButtonCerrarParametroTesoreriaDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroTesoreriaDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroTesoreriaDefecto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroTesoreriaDefecto";
		inputMap = this.jButtonGuardarCambiosTablaParametroTesoreriaDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroTesoreriaDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroTesoreriaDefecto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesParametroTesoreriaDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesParametroTesoreriaDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionParametroTesoreriaDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ParametroTesoreriaDefecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ParametroTesoreriaDefecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ParametroTesoreriaDefecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ParametroTesoreriaDefecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ParametroTesoreriaDefecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesParametroTesoreriaDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesParametroTesoreriaDefecto.setName("jPanelParametrosReportesParametroTesoreriaDefecto"); 
		
		this.jPanelParametrosReportesAccionesParametroTesoreriaDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesParametroTesoreriaDefecto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesParametroTesoreriaDefecto.setName("jPanelParametrosReportesAccionesParametroTesoreriaDefecto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionParametroTesoreriaDefecto = new JButtonMe();
		this.jButtonRecargarInformacionParametroTesoreriaDefecto.setText("Recargar");
		this.jButtonRecargarInformacionParametroTesoreriaDefecto.setToolTipText("Recargar"+" "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionParametroTesoreriaDefecto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionParametroTesoreriaDefecto = new JButtonMe();
		this.jButtonProcesarInformacionParametroTesoreriaDefecto.setText("Procesar");
		this.jButtonProcesarInformacionParametroTesoreriaDefecto.setToolTipText("Procesar"+" "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionParametroTesoreriaDefecto.setVisible(false);
			
		this.jButtonProcesarInformacionParametroTesoreriaDefecto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroTesoreriaDefecto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroTesoreriaDefecto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesParametroTesoreriaDefecto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroTesoreriaDefecto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesParametroTesoreriaDefecto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesParametroTesoreriaDefecto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroTesoreriaDefecto.setText("TIPO");       
		this.jComboBoxTiposReportesParametroTesoreriaDefecto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesParametroTesoreriaDefecto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroTesoreriaDefecto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesParametroTesoreriaDefecto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionParametroTesoreriaDefecto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionParametroTesoreriaDefecto.setText("Paginacion");
		this.jComboBoxTiposPaginacionParametroTesoreriaDefecto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesParametroTesoreriaDefecto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesParametroTesoreriaDefecto.setText("Accion");
		this.jComboBoxTiposRelacionesParametroTesoreriaDefecto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesParametroTesoreriaDefecto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroTesoreriaDefecto.setText("Accion");
		this.jComboBoxTiposAccionesParametroTesoreriaDefecto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarParametroTesoreriaDefecto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarParametroTesoreriaDefecto.setText("Accion");
		this.jComboBoxTiposSeleccionarParametroTesoreriaDefecto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralParametroTesoreriaDefecto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralParametroTesoreriaDefecto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroTesoreriaDefecto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroTesoreriaDefecto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesParametroTesoreriaDefecto = new JLabelMe();
		
		this.jLabelAccionesParametroTesoreriaDefecto.setText("Acciones");		
		this.jLabelAccionesParametroTesoreriaDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroTesoreriaDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroTesoreriaDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosParametroTesoreriaDefecto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosParametroTesoreriaDefecto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosParametroTesoreriaDefecto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosParametroTesoreriaDefecto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosParametroTesoreriaDefecto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosParametroTesoreriaDefecto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaParametroTesoreriaDefecto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaParametroTesoreriaDefecto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaParametroTesoreriaDefecto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteParametroTesoreriaDefecto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteParametroTesoreriaDefecto.setText("Graf.");
		this.jCheckBoxConGraficoReporteParametroTesoreriaDefecto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresParametroTesoreriaDefecto = new JButtonMe();
		//this.jButtonAnterioresParametroTesoreriaDefecto.setText("<<");
        this.jButtonAnterioresParametroTesoreriaDefecto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresParametroTesoreriaDefecto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesParametroTesoreriaDefecto = new JButtonMe();
		//this.jButtonSiguientesParametroTesoreriaDefecto.setText(">>");
        this.jButtonSiguientesParametroTesoreriaDefecto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesParametroTesoreriaDefecto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosParametroTesoreriaDefecto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosParametroTesoreriaDefecto.setText("Nue");
        this.jButtonNuevoGuardarCambiosParametroTesoreriaDefecto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosParametroTesoreriaDefecto,"nuevoguardarcambios_button","Nue",this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosParametroTesoreriaDefecto";
		inputMap = this.jButtonNuevoGuardarCambiosParametroTesoreriaDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosParametroTesoreriaDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosParametroTesoreriaDefecto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionParametroTesoreriaDefecto";
		inputMap = this.jButtonRecargarInformacionParametroTesoreriaDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionParametroTesoreriaDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionParametroTesoreriaDefecto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesParametroTesoreriaDefecto";
		inputMap = this.jButtonSiguientesParametroTesoreriaDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesParametroTesoreriaDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesParametroTesoreriaDefecto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresParametroTesoreriaDefecto";
		inputMap = this.jButtonAnterioresParametroTesoreriaDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresParametroTesoreriaDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresParametroTesoreriaDefecto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasParametroTesoreriaDefecto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesParametroTesoreriaDefecto.setMinimumSize(new Dimension(this.getWidth(),ParametroTesoreriaDefectoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroTesoreriaDefectoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroTesoreriaDefecto.setMaximumSize(new Dimension(this.getWidth(),ParametroTesoreriaDefectoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroTesoreriaDefectoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroTesoreriaDefecto.setPreferredSize(new Dimension(this.getWidth(),ParametroTesoreriaDefectoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroTesoreriaDefectoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionParametroTesoreriaDefecto = new GridBagLayout();

			this.jPanelPaginacionParametroTesoreriaDefecto.setLayout(gridaBagLayoutPaginacionParametroTesoreriaDefecto);						
			
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreriaDefecto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy = 0;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionParametroTesoreriaDefecto.add(this.jButtonAnterioresParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
					
						
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy = 0;
			
			this.jPanelPaginacionParametroTesoreriaDefecto.add(this.jButtonNuevoGuardarCambiosParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
						
			
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreriaDefecto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy = 0;
			this.jPanelPaginacionParametroTesoreriaDefecto.add(this.jButtonSiguientesParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy = 1;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroTesoreriaDefecto.add(this.jButtonNuevoParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
						
			
			
			if(!this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
				this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsParametroTesoreriaDefecto.gridy = 1;
				this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionParametroTesoreriaDefecto.add(this.jButtonGuardarCambiosTablaParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
			}
			
			
			
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy = 1;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroTesoreriaDefecto.add(this.jButtonDuplicarParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
			
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy = 1;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroTesoreriaDefecto.add(this.jButtonCopiarParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
		
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy = 1;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroTesoreriaDefecto.add(this.jButtonVerFormParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
		
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy = 1;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionParametroTesoreriaDefecto.add(this.jButtonCerrarParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
		
		
		
		this.jButtonRecargarInformacionParametroTesoreriaDefecto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroTesoreriaDefecto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroTesoreriaDefecto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesParametroTesoreriaDefecto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroTesoreriaDefecto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroTesoreriaDefecto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesParametroTesoreriaDefecto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroTesoreriaDefecto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroTesoreriaDefecto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesParametroTesoreriaDefecto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroTesoreriaDefecto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroTesoreriaDefecto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionParametroTesoreriaDefecto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroTesoreriaDefecto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroTesoreriaDefecto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesParametroTesoreriaDefecto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroTesoreriaDefecto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroTesoreriaDefecto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesParametroTesoreriaDefecto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroTesoreriaDefecto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroTesoreriaDefecto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarParametroTesoreriaDefecto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroTesoreriaDefecto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroTesoreriaDefecto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaParametroTesoreriaDefecto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroTesoreriaDefecto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroTesoreriaDefecto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteParametroTesoreriaDefecto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroTesoreriaDefecto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroTesoreriaDefecto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosParametroTesoreriaDefecto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroTesoreriaDefecto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroTesoreriaDefecto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosParametroTesoreriaDefecto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroTesoreriaDefecto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroTesoreriaDefecto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesParametroTesoreriaDefecto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesParametroTesoreriaDefecto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ParametroTesoreriaDefecto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ParametroTesoreriaDefecto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ParametroTesoreriaDefecto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ParametroTesoreriaDefecto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesParametroTesoreriaDefecto.setLayout(gridaBagParametrosReportesParametroTesoreriaDefecto);
			this.jPanelParametrosReportesAccionesParametroTesoreriaDefecto.setLayout(gridaBagParametrosReportesAccionesParametroTesoreriaDefecto);
			
			
			this.jPanelParametrosAuxiliar1ParametroTesoreriaDefecto.setLayout(gridaBagParametrosAuxiliar1ParametroTesoreriaDefecto);
			this.jPanelParametrosAuxiliar2ParametroTesoreriaDefecto.setLayout(gridaBagParametrosAuxiliar2ParametroTesoreriaDefecto);
			this.jPanelParametrosAuxiliar3ParametroTesoreriaDefecto.setLayout(gridaBagParametrosAuxiliar3ParametroTesoreriaDefecto);
			this.jPanelParametrosAuxiliar4ParametroTesoreriaDefecto.setLayout(gridaBagParametrosAuxiliar4ParametroTesoreriaDefecto);
			//this.jPanelParametrosAuxiliar5ParametroTesoreriaDefecto.setLayout(gridaBagParametrosAuxiliar2ParametroTesoreriaDefecto);			
			
			
			
			
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroTesoreriaDefecto.add(this.jButtonRecargarInformacionParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreriaDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroTesoreriaDefecto.add(this.jComboBoxTiposPaginacionParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreriaDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroTesoreriaDefecto.add(this.jCheckBoxConAltoMaximoTablaParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreriaDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroTesoreriaDefecto.add(this.jComboBoxTiposArchivosReportesParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreriaDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroTesoreriaDefecto.add(this.jPanelParametrosAuxiliar1ParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreriaDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ParametroTesoreriaDefecto.add(this.jComboBoxTiposReportesParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreriaDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroTesoreriaDefecto.add(this.jPanelParametrosAuxiliar4ParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreriaDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroTesoreriaDefecto.add(this.jComboBoxTiposReportesParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreriaDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroTesoreriaDefecto.add(this.jCheckBoxGenerarReporteParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreriaDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroTesoreriaDefecto.add(this.jPanelParametrosAuxiliar2ParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroTesoreriaDefecto.add(this.jLabelAccionesParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
				this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesParametroTesoreriaDefecto.add(this.jButtonAbrirOrderByParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroTesoreriaDefecto.add(this.jComboBoxTiposSeleccionarParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);			
			
			
			/*
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroTesoreriaDefecto.add(this.jCheckBoxSeleccionarTodosParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreriaDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroTesoreriaDefecto.add(this.jCheckBoxSeleccionarTodosParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);															
				
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreriaDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroTesoreriaDefecto.add(this.jCheckBoxSeleccionadosParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreriaDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroTesoreriaDefecto.add(this.jPanelParametrosAuxiliar3ParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroTesoreriaDefecto.add(this.jComboBoxTiposAccionesParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
	
				
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroTesoreriaDefecto.add(this.jTextFieldValorCampoGeneralParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosParametroTesoreriaDefecto = new GridBagLayout();

			this.jScrollPanelDatosParametroTesoreriaDefecto.setLayout(gridaBagLayoutDatosParametroTesoreriaDefecto);
			
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy = 0;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx = 0;
			
			this.jScrollPanelDatosParametroTesoreriaDefecto.add(this.jTableDatosParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosParametroTesoreriaDefecto.setViewportView(this.jTableDatosParametroTesoreriaDefecto);
		this.jTableDatosParametroTesoreriaDefecto.setFillsViewportHeight(true);
		this.jTableDatosParametroTesoreriaDefecto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesParametroTesoreriaDefecto= new GridBagLayout();
		this.jPanelAccionesParametroTesoreriaDefecto.setLayout(gridaBagLayoutAccionesParametroTesoreriaDefecto);
		
		
		/*	
		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy = 0;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx = 0;
			
		this.jPanelAccionesParametroTesoreriaDefecto.add(this.jButtonNuevoParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto= new GridBagLayout();
		gridaBagLayoutFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto.setLayout(gridaBagLayoutFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto);

		gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		gridBagConstraintsParametroTesoreriaDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroTesoreriaDefecto.gridy = 0;
		gridBagConstraintsParametroTesoreriaDefecto.gridx = 0;
		jPanelFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto.add(jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto, gridBagConstraintsParametroTesoreriaDefecto);

		gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		gridBagConstraintsParametroTesoreriaDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroTesoreriaDefecto.gridy = 0;
		gridBagConstraintsParametroTesoreriaDefecto.gridx = 1;
		jPanelFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto.add(jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto, gridBagConstraintsParametroTesoreriaDefecto);

		gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		gridBagConstraintsParametroTesoreriaDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroTesoreriaDefecto.gridy = 1;
		gridBagConstraintsParametroTesoreriaDefecto.gridx =1;
		jPanelFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto.add(jButtonFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto, gridBagConstraintsParametroTesoreriaDefecto);

		jTabbedPaneBusquedasParametroTesoreriaDefecto.addTab("1.-Por Tipo Cuenta ", jPanelFK_IdTipoCuentaBancoGlobalParametroTesoreriaDefecto);
		jTabbedPaneBusquedasParametroTesoreriaDefecto.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroTesoreriaDefecto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroTesoreriaDefecto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();						
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx = 0;		
			//this.gridBagConstraintsParametroTesoreriaDefecto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroTesoreriaDefecto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroTesoreriaDefecto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx = 0;		
		//this.gridBagConstraintsParametroTesoreriaDefecto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroTesoreriaDefecto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsParametroTesoreriaDefecto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsParametroTesoreriaDefecto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx = 0;		
			this.gridBagConstraintsParametroTesoreriaDefecto.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroTesoreriaDefecto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsParametroTesoreriaDefecto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);								
		
		
		/*
		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
		*/		
		
		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx =0;
		this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroTesoreriaDefecto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
				
		
		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ParametroTesoreriaDefectoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosParametroTesoreriaDefecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroTesoreriaDefecto = new GridBagLayout();
			this.jPanelBusquedasParametrosParametroTesoreriaDefecto.setLayout(gridaBagLayoutBusquedasParametrosParametroTesoreriaDefecto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralParametroTesoreriaDefecto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroTesoreriaDefecto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroTesoreriaDefecto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroTesoreriaDefecto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
			
			
		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
		
			
		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralParametroTesoreriaDefecto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoParametroTesoreriaDefecto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoParametroTesoreriaDefecto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoParametroTesoreriaDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoParametroTesoreriaDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoParametroTesoreriaDefecto.setName("jPanelReporteDinamicoParametroTesoreriaDefecto"); 
		
		this.jPanelReporteDinamicoParametroTesoreriaDefecto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroTesoreriaDefecto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroTesoreriaDefecto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoParametroTesoreriaDefecto.setLayout(gridaBagLayoutReporteDinamicoParametroTesoreriaDefecto);
		
		
		this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoParametroTesoreriaDefecto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroTesoreriaDefecto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.setResizable(true);
	    this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.setClosable(true);
	    this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoParametroTesoreriaDefecto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroTesoreriaDefecto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroTesoreriaDefecto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoParametroTesoreriaDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Tesoreria Defectos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteParametroTesoreriaDefecto = new JLabelMe();

		this.jLabelColumnasSelectReporteParametroTesoreriaDefecto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteParametroTesoreriaDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroTesoreriaDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroTesoreriaDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroTesoreriaDefecto.add(this.jLabelColumnasSelectReporteParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteParametroTesoreriaDefecto = new JList<Reporte>();
		this.jListColumnasSelectReporteParametroTesoreriaDefecto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteParametroTesoreriaDefecto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteParametroTesoreriaDefecto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroTesoreriaDefecto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroTesoreriaDefecto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteParametroTesoreriaDefecto=new JScrollPane(this.jListColumnasSelectReporteParametroTesoreriaDefecto);
			
			this.jScrollColumnasSelectReporteParametroTesoreriaDefecto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroTesoreriaDefecto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroTesoreriaDefecto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteParametroTesoreriaDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoParametroTesoreriaDefecto.add(this.jListColumnasSelectReporteParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
		this.jPanelReporteDinamicoParametroTesoreriaDefecto.add(this.jScrollColumnasSelectReporteParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteParametroTesoreriaDefecto = new JLabelMe();

		this.jLabelRelacionesSelectReporteParametroTesoreriaDefecto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteParametroTesoreriaDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroTesoreriaDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroTesoreriaDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteParametroTesoreriaDefecto = new JList<Reporte>();
		this.jListRelacionesSelectReporteParametroTesoreriaDefecto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteParametroTesoreriaDefecto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteParametroTesoreriaDefecto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroTesoreriaDefecto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroTesoreriaDefecto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteParametroTesoreriaDefecto=new JScrollPane(this.jListRelacionesSelectReporteParametroTesoreriaDefecto);
			
			this.jScrollRelacionesSelectReporteParametroTesoreriaDefecto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroTesoreriaDefecto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroTesoreriaDefecto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteParametroTesoreriaDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoParametroTesoreriaDefecto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoParametroTesoreriaDefecto = new JComboBoxMe();
		this.jListColumnasValoresGraficoParametroTesoreriaDefecto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoParametroTesoreriaDefecto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoParametroTesoreriaDefecto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoParametroTesoreriaDefecto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroTesoreriaDefecto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroTesoreriaDefecto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoParametroTesoreriaDefecto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoParametroTesoreriaDefecto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoParametroTesoreriaDefecto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroTesoreriaDefecto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroTesoreriaDefecto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoParametroTesoreriaDefecto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoParametroTesoreriaDefecto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoParametroTesoreriaDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroTesoreriaDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroTesoreriaDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroTesoreriaDefecto.add(this.jLabelGenerarExcelReporteDinamicoParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoParametroTesoreriaDefecto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoParametroTesoreriaDefecto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoParametroTesoreriaDefecto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoParametroTesoreriaDefecto.setToolTipText("Generar EXCEL"+" "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoParametroTesoreriaDefecto.add(this.jButtonGenerarExcelReporteDinamicoParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroTesoreriaDefecto.add(this.jComboBoxTiposReportesDinamicoParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoParametroTesoreriaDefecto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoParametroTesoreriaDefecto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoParametroTesoreriaDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroTesoreriaDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroTesoreriaDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroTesoreriaDefecto.add(this.jLabelTiposArchivoReporteDinamicoParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroTesoreriaDefecto.add(this.jComboBoxTiposArchivosReportesDinamicoParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoParametroTesoreriaDefecto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoParametroTesoreriaDefecto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoParametroTesoreriaDefecto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoParametroTesoreriaDefecto.setToolTipText("Generar"+" "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroTesoreriaDefecto.add(this.jButtonGenerarReporteDinamicoParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoParametroTesoreriaDefecto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoParametroTesoreriaDefecto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoParametroTesoreriaDefecto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoParametroTesoreriaDefecto.setToolTipText("Cancelar"+" "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroTesoreriaDefecto.add(this.jButtonCerrarReporteDinamicoParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalParametroTesoreriaDefecto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoParametroTesoreriaDefecto= new JScrollPane(jPanelReporteDinamicoParametroTesoreriaDefecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoParametroTesoreriaDefecto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroTesoreriaDefecto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroTesoreriaDefecto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoParametroTesoreriaDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Tesoreria Defectos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalParametroTesoreriaDefecto);
		this.jInternalFrameReporteDinamicoParametroTesoreriaDefecto.getContentPane().add(this.jScrollPanelReporteDinamicoParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionParametroTesoreriaDefecto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionParametroTesoreriaDefecto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionParametroTesoreriaDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionParametroTesoreriaDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionParametroTesoreriaDefecto.setName("jPanelImportacionParametroTesoreriaDefecto"); 
		
		this.jPanelImportacionParametroTesoreriaDefecto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroTesoreriaDefecto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroTesoreriaDefecto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionParametroTesoreriaDefecto.setLayout(gridaBagLayoutImportacionParametroTesoreriaDefecto);
		
		
		this.jInternalFrameImportacionParametroTesoreriaDefecto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionParametroTesoreriaDefecto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionParametroTesoreriaDefecto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroTesoreriaDefecto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionParametroTesoreriaDefecto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroTesoreriaDefecto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroTesoreriaDefecto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionParametroTesoreriaDefecto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroTesoreriaDefecto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroTesoreriaDefecto.setResizable(true);
	    this.jInternalFrameImportacionParametroTesoreriaDefecto.setClosable(true);
	    this.jInternalFrameImportacionParametroTesoreriaDefecto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionParametroTesoreriaDefecto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroTesoreriaDefecto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroTesoreriaDefecto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionParametroTesoreriaDefecto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroTesoreriaDefecto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroTesoreriaDefecto.setResizable(true);
	    this.jInternalFrameImportacionParametroTesoreriaDefecto.setClosable(true);
	    this.jInternalFrameImportacionParametroTesoreriaDefecto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionParametroTesoreriaDefecto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroTesoreriaDefecto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroTesoreriaDefecto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionParametroTesoreriaDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Tesoreria Defectos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionParametroTesoreriaDefecto = new JLabelMe();

		this.jLabelArchivoImportacionParametroTesoreriaDefecto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionParametroTesoreriaDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroTesoreriaDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroTesoreriaDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroTesoreriaDefecto.add(this.jLabelArchivoImportacionParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionParametroTesoreriaDefecto = new JFileChooser();		
		this.jFileChooserImportacionParametroTesoreriaDefecto.setToolTipText("ESCOGER ARCHIVO"+" "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionParametroTesoreriaDefecto = new JButtonMe();
		this.jButtonAbrirImportacionParametroTesoreriaDefecto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionParametroTesoreriaDefecto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionParametroTesoreriaDefecto.setToolTipText("Generar"+" "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroTesoreriaDefecto.add(this.jButtonAbrirImportacionParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionParametroTesoreriaDefecto = new JLabelMe();

		this.jLabelPathArchivoImportacionParametroTesoreriaDefecto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionParametroTesoreriaDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroTesoreriaDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroTesoreriaDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroTesoreriaDefecto.add(this.jLabelPathArchivoImportacionParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionParametroTesoreriaDefecto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionParametroTesoreriaDefecto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroTesoreriaDefecto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroTesoreriaDefecto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroTesoreriaDefecto.add(this.jTextFieldPathArchivoImportacionParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionParametroTesoreriaDefecto = new JButtonMe();
		this.jButtonGenerarImportacionParametroTesoreriaDefecto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionParametroTesoreriaDefecto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionParametroTesoreriaDefecto.setToolTipText("Generar"+" "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroTesoreriaDefecto.add(this.jButtonGenerarImportacionParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionParametroTesoreriaDefecto = new JButtonMe();
		this.jButtonCerrarImportacionParametroTesoreriaDefecto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionParametroTesoreriaDefecto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionParametroTesoreriaDefecto.setToolTipText("Cancelar"+" "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroTesoreriaDefecto.add(this.jButtonCerrarImportacionParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalParametroTesoreriaDefecto = new GridBagLayout();
		
		this.jScrollPanelImportacionParametroTesoreriaDefecto= new JScrollPane(jPanelImportacionParametroTesoreriaDefecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy =iPosYImportacion;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx =iPosXImportacion;
		this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionParametroTesoreriaDefecto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionParametroTesoreriaDefecto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalParametroTesoreriaDefecto);
		this.jInternalFrameImportacionParametroTesoreriaDefecto.getContentPane().add(this.jScrollPanelImportacionParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByParametroTesoreriaDefecto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByParametroTesoreriaDefecto = new JButtonMe();
			this.jButtonAbrirOrderByParametroTesoreriaDefecto.setText("Orden");
			this.jButtonAbrirOrderByParametroTesoreriaDefecto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroTesoreriaDefecto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByParametroTesoreriaDefecto";
			inputMap = this.jButtonAbrirOrderByParametroTesoreriaDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByParametroTesoreriaDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByParametroTesoreriaDefecto"));
		
		
			GridBagLayout gridaBagLayoutOrderByParametroTesoreriaDefecto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByParametroTesoreriaDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByParametroTesoreriaDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByParametroTesoreriaDefecto.setName("jPanelOrderByParametroTesoreriaDefecto"); 
			
			this.jPanelOrderByParametroTesoreriaDefecto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroTesoreriaDefecto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroTesoreriaDefecto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByParametroTesoreriaDefecto.setLayout(gridaBagLayoutOrderByParametroTesoreriaDefecto);
			
			
			this.jTableDatosParametroTesoreriaDefectoOrderBy = new JTableMe();        
			this.jTableDatosParametroTesoreriaDefectoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosParametroTesoreriaDefectoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosParametroTesoreriaDefectoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosParametroTesoreriaDefectoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosParametroTesoreriaDefectoOrderBy.setViewportView(this.jTableDatosParametroTesoreriaDefectoOrderBy);
			this.jTableDatosParametroTesoreriaDefectoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosParametroTesoreriaDefectoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByParametroTesoreriaDefecto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByParametroTesoreriaDefecto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByParametroTesoreriaDefecto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteParametroTesoreriaDefecto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByParametroTesoreriaDefecto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByParametroTesoreriaDefecto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByParametroTesoreriaDefecto.setTitle("Orden");
			this.jInternalFrameOrderByParametroTesoreriaDefecto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByParametroTesoreriaDefecto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByParametroTesoreriaDefecto.setResizable(true);
			this.jInternalFrameOrderByParametroTesoreriaDefecto.setClosable(true);
			this.jInternalFrameOrderByParametroTesoreriaDefecto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByParametroTesoreriaDefecto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroTesoreriaDefecto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroTesoreriaDefecto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByParametroTesoreriaDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Tesoreria Defectos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsParametroTesoreriaDefecto.ipady =150;
				
			this.jPanelOrderByParametroTesoreriaDefecto.add(jScrollPanelDatosParametroTesoreriaDefectoOrderBy, this.gridBagConstraintsParametroTesoreriaDefecto);//this.jTableDatosParametroTesoreriaDefectoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByParametroTesoreriaDefecto = new JButtonMe();
			this.jButtonCerrarOrderByParametroTesoreriaDefecto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByParametroTesoreriaDefecto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByParametroTesoreriaDefecto.setToolTipText("Cancelar"+" "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByParametroTesoreriaDefecto.add(this.jButtonCerrarOrderByParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalParametroTesoreriaDefecto = new GridBagLayout();
			
			this.jScrollPanelOrderByParametroTesoreriaDefecto= new JScrollPane(jPanelOrderByParametroTesoreriaDefecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy =iPosYOrderBy;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByParametroTesoreriaDefecto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByParametroTesoreriaDefecto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalParametroTesoreriaDefecto);
			
			this.jInternalFrameOrderByParametroTesoreriaDefecto.getContentPane().add(this.jScrollPanelOrderByParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);			
		
		} else {
			this.jButtonAbrirOrderByParametroTesoreriaDefecto = new JButtonMe();
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
		int iWidthTableCalculado=0;//730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.parametrotesoreriadefectoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosParametroTesoreriaDefecto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosParametroTesoreriaDefecto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosParametroTesoreriaDefecto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosParametroTesoreriaDefecto.getRowHeight();//ParametroTesoreriaDefectoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ParametroTesoreriaDefectoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroTesoreriaDefecto.isSelected()) {
					iHeightTable=ParametroTesoreriaDefectoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroTesoreriaDefectoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroTesoreriaDefectoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ParametroTesoreriaDefectoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroTesoreriaDefecto.isSelected()) {
					iHeightTable=ParametroTesoreriaDefectoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroTesoreriaDefectoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroTesoreriaDefectoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosParametroTesoreriaDefecto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroTesoreriaDefecto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroTesoreriaDefecto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosParametroTesoreriaDefecto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroTesoreriaDefecto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroTesoreriaDefecto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByParametroTesoreriaDefecto!=null && this.jInternalFrameOrderByParametroTesoreriaDefecto.getjTableDatosOrderBy()!=null) {
			//if(!this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByParametroTesoreriaDefecto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByParametroTesoreriaDefecto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByParametroTesoreriaDefecto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByParametroTesoreriaDefecto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByParametroTesoreriaDefecto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByParametroTesoreriaDefecto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByParametroTesoreriaDefecto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosParametroTesoreriaDefecto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroTesoreriaDefecto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroTesoreriaDefecto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrotesoreriadefectos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ParametroTesoreriaDefecto> TraerParametroTesoreriaDefectoBeans(List<ParametroTesoreriaDefecto> parametrotesoreriadefectos,ArrayList<Classe> classes)throws Exception {
		try {
			for(ParametroTesoreriaDefecto parametrotesoreriadefecto:parametrotesoreriadefectos) {
					
				if(!(ParametroTesoreriaDefectoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ParametroTesoreriaDefectoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					parametrotesoreriadefecto.setsDetalleGeneralEntityReporte(ParametroTesoreriaDefectoConstantesFunciones.getParametroTesoreriaDefectoDescripcion(parametrotesoreriadefecto));
										
						
					
						
					
				} else  {
							
					//parametrotesoreriadefecto.setsDetalleGeneralEntityReporte(parametrotesoreriadefecto.getsDetalleGeneralEntityReporte());
										
				}
				
				//parametrotesoreriadefectobeans.add(parametrotesoreriadefectobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return parametrotesoreriadefectos;
    }
	//PARA REPORTES FIN
}
