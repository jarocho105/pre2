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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;



import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.EmpresaConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class EmpresaJInternalFrame extends EmpresaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEmpresa;
	
	protected JMenuBar jmenuBarEmpresa;
	
	protected JMenu jmenuEmpresa;
	protected JMenu jmenuDatosEmpresa;
	protected JMenu jmenuArchivoEmpresa;
	protected JMenu jmenuAccionesEmpresa;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEmpresa;	
	protected GridBagConstraints gridBagConstraintsEmpresa;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EmpresaDetalleFormJInternalFrame jInternalFrameDetalleFormEmpresa;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEmpresa;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEmpresa;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";

	protected TipoEmpresaBeanSwingJInternalFrame tipoempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoempresa="";
	
	public EmpresaSessionBean empresaSessionBean;
		
	
	
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	public TipoEmpresaSessionBean tipoempresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Empresa> empresas;		
	public List<Empresa> empresasEliminados;	
	public List<Empresa> empresasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEmpresa;		
	protected JButton jButtonAbrirOrderByEmpresa;
	
	
	//protected JPanel jPanelOrderByEmpresa;
	//public JScrollPane jScrollPanelOrderByEmpresa;	
	//protected JButton jButtonCerrarOrderByEmpresa;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EmpresaLogic empresaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEmpresa;
	public JScrollPane jScrollPanelDatosEdicionEmpresa;
	public JScrollPane jScrollPanelDatosGeneralEmpresa;
    
	
	
	//public JScrollPane jScrollPanelDatosEmpresaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEmpresa;
	//public JScrollPane jScrollPanelImportacionEmpresa;
	
	
	
	protected JPanel jPanelAccionesEmpresa;
	
    protected JPanel jPanelPaginacionEmpresa;
    protected JPanel jPanelParametrosReportesEmpresa;
	protected JPanel jPanelParametrosReportesAccionesEmpresa;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralEmpresa;
	protected Integer iXPanelCamposIniciogeneralEmpresa=0;
	protected Integer iYPanelCamposIniciogeneralEmpresa=0;

	protected JPanel jPanelCamposIniciocontadorEmpresa;
	protected Integer iXPanelCamposIniciocontadorEmpresa=0;
	protected Integer iYPanelCamposIniciocontadorEmpresa=0;

	protected JPanel jPanelCamposIniciorepresentanteEmpresa;
	protected Integer iXPanelCamposIniciorepresentanteEmpresa=0;
	protected Integer iYPanelCamposIniciorepresentanteEmpresa=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Empresa;
	protected JPanel jPanelParametrosAuxiliar2Empresa;
	protected JPanel jPanelParametrosAuxiliar3Empresa;
	protected JPanel jPanelParametrosAuxiliar4Empresa;
	//protected JPanel jPanelParametrosAuxiliar5Empresa;
	
	
	
	//protected JPanel jPanelReporteDinamicoEmpresa;
	//protected JPanel jPanelImportacionEmpresa;
	
	
	public JTable jTableDatosEmpresa;
	
	
	
	//public JTable jTableDatosEmpresaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEmpresa;
	protected JButton jButtonDuplicarEmpresa;
	protected JButton jButtonCopiarEmpresa;
	protected JButton jButtonVerFormEmpresa;
	protected JButton jButtonNuevoRelacionesEmpresa;
	protected JButton jButtonModificarEmpresa;
	
    protected JButton jButtonGuardarCambiosTablaEmpresa;
	protected JButton jButtonCerrarEmpresa;
	
	
	protected JButton jButtonRecargarInformacionEmpresa;
	protected JButton jButtonProcesarInformacionEmpresa;
	
	
	protected JButton jButtonAnterioresEmpresa;
	protected JButton jButtonSiguientesEmpresa;
	protected JButton jButtonNuevoGuardarCambiosEmpresa;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEmpresa;
	//protected JButton jButtonCerrarReporteDinamicoEmpresa;
	//protected JButton jButtonGenerarExcelReporteDinamicoEmpresa;	
	
	
	
	//protected JButton jButtonAbrirImportacionEmpresa;
	//protected JButton jButtonGenerarImportacionEmpresa;
	//protected JButton jButtonCerrarImportacionEmpresa;
	//protected JFileChooser jFileChooserImportacionEmpresa;
	//protected File fileImportacionEmpresa;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEmpresa;
	protected JButton jButtonDuplicarToolBarEmpresa;
	protected JButton jButtonNuevoRelacionesToolBarEmpresa;
	
	
	public JButton jButtonGuardarCambiosToolBarEmpresa;
	protected JButton jButtonCopiarToolBarEmpresa;
	protected JButton jButtonVerFormToolBarEmpresa;
	public JButton jButtonGuardarCambiosTablaToolBarEmpresa;
	protected JButton jButtonMostrarOcultarTablaToolBarEmpresa;
	protected JButton jButtonCerrarToolBarEmpresa;
	
	protected JButton jButtonRecargarInformacionToolBarEmpresa;
	protected JButton jButtonProcesarInformacionToolBarEmpresa;
	protected JButton jButtonAnterioresToolBarEmpresa;
	protected JButton jButtonSiguientesToolBarEmpresa;
	protected JButton jButtonNuevoGuardarCambiosToolBarEmpresa;
	protected JButton jButtonAbrirOrderByToolBarEmpresa;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEmpresa;
	protected JMenuItem jMenuItemDuplicarEmpresa;
	protected JMenuItem jMenuItemNuevoRelacionesEmpresa;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEmpresa;
	protected JMenuItem jMenuItemCopiarEmpresa;
	protected JMenuItem jMenuItemVerFormEmpresa;
	protected JMenuItem jMenuItemGuardarCambiosTablaEmpresa;
	protected JMenuItem jMenuItemCerrarEmpresa;
	protected JMenuItem jMenuItemDetalleCerrarEmpresa;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEmpresa;
	protected JMenuItem jMenuItemDetalleMostarOcultarEmpresa;
	
	protected JMenuItem jMenuItemRecargarInformacionEmpresa;
	protected JMenuItem jMenuItemProcesarInformacionEmpresa;
	protected JMenuItem jMenuItemAnterioresEmpresa;
	protected JMenuItem jMenuItemSiguientesEmpresa;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEmpresa;
	protected JMenuItem jMenuItemAbrirOrderByEmpresa;
	protected JMenuItem jMenuItemMostrarOcultarEmpresa;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEmpresa;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEmpresa;
	protected JCheckBox jCheckBoxSeleccionadosEmpresa;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEmpresa;
	protected JCheckBox jCheckBoxConGraficoReporteEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEmpresa;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEmpresa;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEmpresa;
	protected JTextField jTextFieldValorCampoGeneralEmpresa;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEmpresa;
	//public JList<Reporte> jListColumnasSelectReporteEmpresa;
	//public JScrollPane jScrollColumnasSelectReporteEmpresa;
	
	//public JLabel jLabelRelacionesSelectReporteEmpresa;
	//public JList<Reporte> jListRelacionesSelectReporteEmpresa;
	//public JScrollPane jScrollRelacionesSelectReporteEmpresa;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEmpresa;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEmpresa;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEmpresa;
	//public JLabel jLabelTiposArchivoReporteDinamicoEmpresa;
	
		
	//public JLabel jLabelArchivoImportacionEmpresa;	
	//public JLabel jLabelPathArchivoImportacionEmpresa;
	//protected JTextField jTextFieldPathArchivoImportacionEmpresa;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEmpresa;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEmpresa;
	
	//public JLabel jLabelColumnaCategoriaValorEmpresa;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEmpresa;
	
	//public JLabel jLabelColumnasValoresGraficoEmpresa;
	//public JList<Reporte> jListColumnasValoresGraficoEmpresa;
	//public JScrollPane jScrollColumnasValoresGraficoEmpresa;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEmpresa;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEmpresa;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasEmpresa;
	public JPanel jPanelBusquedaPorIdPaisPorNombreEmpresa;
	public JButton jButtonBusquedaPorIdPaisPorNombreEmpresa;
	public JPanel jPanelFK_IdPaisEmpresa;
	public JButton jButtonFK_IdPaisEmpresa;
	public JPanel jPanelFK_IdTipoEmpresaEmpresa;
	public JButton jButtonFK_IdTipoEmpresaEmpresa;
	
	public JPanel jPanelid_paisBusquedaPorIdPaisPorNombreEmpresa;
	public JLabel jLabelid_paisBusquedaPorIdPaisPorNombreEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisBusquedaPorIdPaisPorNombreEmpresa;
	public JButton jButtonid_paisBusquedaPorIdPaisPorNombreEmpresa= new JButtonMe();
	public JButton jButtonid_paisBusquedaPorIdPaisPorNombreEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_paisBusquedaPorIdPaisPorNombreEmpresaBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorIdPaisPorNombreEmpresa;
	public JLabel jLabelnombreBusquedaPorIdPaisPorNombreEmpresa;
	public JTextArea jTextAreanombreBusquedaPorIdPaisPorNombreEmpresa;
	public JButton jButtonnombreBusquedaPorIdPaisPorNombreEmpresaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisFK_IdPaisEmpresa;
	public JLabel jLabelid_paisFK_IdPaisEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisEmpresa;
	public JButton jButtonid_paisFK_IdPaisEmpresa= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisEmpresaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_empresaFK_IdTipoEmpresaEmpresa;
	public JLabel jLabelid_tipo_empresaFK_IdTipoEmpresaEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_empresaFK_IdTipoEmpresaEmpresa;
	public JButton jButtonid_tipo_empresaFK_IdTipoEmpresaEmpresa= new JButtonMe();
	public JButton jButtonid_tipo_empresaFK_IdTipoEmpresaEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_empresaFK_IdTipoEmpresaEmpresaBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=1144;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public EmpresaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Empresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpresaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Empresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpresaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Empresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpresaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Empresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEmpresa)	{
		this.jButtonRecargarInformacionEmpresa = jButtonRecargarInformacionEmpresa;
	}
	
	public JButton getjButtonProcesarInformacionEmpresa() {
		return this.jButtonProcesarInformacionEmpresa;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEmpresa)	{
		this.jButtonProcesarInformacionEmpresa = jButtonProcesarInformacionEmpresa;
	}
	
	
	public JButton getjButtonRecargarInformacionEmpresa() {
		return this.jButtonRecargarInformacionEmpresa;
	}
	
	
	public List<Empresa> getempresas() {
		return this.empresas;
	}

	public void setempresas(List<Empresa> empresas) {
		this.empresas = empresas;
	}
	
	public List<Empresa> getempresasAux() {
		return this.empresasAux;
	}

	public void setempresasAux(List<Empresa> empresasAux) {
		this.empresasAux = empresasAux;
	}
	
	public List<Empresa> getempresasEliminados() {
		return this.empresasEliminados;
	}

	public void setEmpresasEliminados(List<Empresa> empresasEliminados) {
		this.empresasEliminados = empresasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEmpresa() {
		return jComboBoxTiposSeleccionarEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEmpresa(
			JComboBox jComboBoxTiposSeleccionarEmpresa) {
		this.jComboBoxTiposSeleccionarEmpresa = jComboBoxTiposSeleccionarEmpresa;
	}
	
	public void setBorderResaltarTiposSeleccionarEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEmpresa .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEmpresa() {
		return jTextFieldValorCampoGeneralEmpresa;
	}

	public void setjTextFieldValorCampoGeneralEmpresa(
			JTextField jTextFieldValorCampoGeneralEmpresa) {
		this.jTextFieldValorCampoGeneralEmpresa = jTextFieldValorCampoGeneralEmpresa;
	}

	public void setBorderResaltarValorCampoGeneralEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpresa.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEmpresa .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEmpresa() {
		return this.jCheckBoxSeleccionarTodosEmpresa;
	}

	public void setjCheckBoxSeleccionarTodosEmpresa(
			JCheckBox jCheckBoxSeleccionarTodosEmpresa) {
		this.jCheckBoxSeleccionarTodosEmpresa = jCheckBoxSeleccionarTodosEmpresa;
	}

	public void setBorderResaltarSeleccionarTodosEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpresa.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEmpresa .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEmpresa() {
		return this.jCheckBoxSeleccionadosEmpresa;
	}

	public void setjCheckBoxSeleccionadosEmpresa(
			JCheckBox jCheckBoxSeleccionadosEmpresa) {
		this.jCheckBoxSeleccionadosEmpresa = jCheckBoxSeleccionadosEmpresa;
	}
	
	public void setBorderResaltarSeleccionadosEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpresa.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEmpresa .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEmpresa() {
		return this.jComboBoxTiposArchivosReportesEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEmpresa(
			JComboBox jComboBoxTiposArchivosReportesEmpresa) {
		this.jComboBoxTiposArchivosReportesEmpresa = jComboBoxTiposArchivosReportesEmpresa;
	}

	public void setBorderResaltarTiposArchivosReportesEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEmpresa() {
		return this.jComboBoxTiposReportesEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEmpresa(
			JComboBox jComboBoxTiposReportesEmpresa) {
		this.jComboBoxTiposReportesEmpresa = jComboBoxTiposReportesEmpresa;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEmpresa() {
	//	return jComboBoxTiposReportesDinamicoEmpresa;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEmpresa(
	//		JComboBox jComboBoxTiposReportesDinamicoEmpresa) {
	//	this.jComboBoxTiposReportesDinamicoEmpresa = jComboBoxTiposReportesDinamicoEmpresa;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEmpresa() {
	//	return jComboBoxTiposArchivosReportesDinamicoEmpresa;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEmpresa(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEmpresa) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEmpresa = jComboBoxTiposArchivosReportesDinamicoEmpresa;
	//}
	
	public void setBorderResaltarTiposReportesEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEmpresa() {
		return this.jComboBoxTiposGraficosReportesEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEmpresa(
			JComboBox jComboBoxTiposGraficosReportesEmpresa) {
		this.jComboBoxTiposGraficosReportesEmpresa = jComboBoxTiposGraficosReportesEmpresa;
	}
	
	public void setBorderResaltarTiposGraficosReportesEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEmpresa() {
		return this.jComboBoxTiposPaginacionEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEmpresa(
			JComboBox jComboBoxTiposPaginacionEmpresa) {
		this.jComboBoxTiposPaginacionEmpresa = jComboBoxTiposPaginacionEmpresa;
	}
	
	public void setBorderResaltarTiposPaginacionEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEmpresa() {
		return this.jComboBoxTiposRelacionesEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEmpresa() {
		return this.jComboBoxTiposAccionesEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEmpresa(
			JComboBox jComboBoxTiposRelacionesEmpresa) {
		this.jComboBoxTiposRelacionesEmpresa = jComboBoxTiposRelacionesEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEmpresa(
			JComboBox jComboBoxTiposAccionesEmpresa) {
		this.jComboBoxTiposAccionesEmpresa = jComboBoxTiposAccionesEmpresa;
	}
	
	public void setBorderResaltarTiposRelacionesEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEmpresa .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEmpresa .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEmpresa() {
	//	return jCheckBoxConGraficoDinamicoEmpresa;
	//}

	//public void setjCheckBoxConGraficoDinamicoEmpresa(
	//		JCheckBox jCheckBoxConGraficoDinamicoEmpresa) {
	//	this.jCheckBoxConGraficoDinamicoEmpresa = jCheckBoxConGraficoDinamicoEmpresa;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEmpresa() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEmpresa.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEmpresa .setBorder(borderResaltar);		
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
		this.empresaSessionBean=new EmpresaSessionBean();
		
		this.empresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.empresaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EmpresaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EmpresaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EmpresaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Empresa MANTENIMIENTO"));
		
		
		if(iWidth > 2050) {
			iWidth=2050;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.empresaSessionBean.getEsGuardarRelacionado()) {
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
		
		EmpresaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Empresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEmpresa= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEmpresa,this.jTtoolBarEmpresa,
							"nuevo","nuevo","Nuevo"+" "+EmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEmpresa,this.jTtoolBarEmpresa,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEmpresa,this.jTtoolBarEmpresa,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEmpresa,this.jTtoolBarEmpresa,
							"duplicar","duplicar","Duplicar"+" "+EmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEmpresa,this.jTtoolBarEmpresa,
							"copiar","copiar","Copiar"+" "+EmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEmpresa,this.jTtoolBarEmpresa,
							"ver_form","ver_form","Ver"+" "+EmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpresa,this.jTtoolBarEmpresa,
							"recargar","recargar","Recargar"+" "+EmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpresa,this.jTtoolBarEmpresa,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpresa,this.jTtoolBarEmpresa,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEmpresa,this.jTtoolBarEmpresa,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEmpresa,this.jTtoolBarEmpresa,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEmpresa,this.jTtoolBarEmpresa,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEmpresa,this.jTtoolBarEmpresa,
							"cerrar","cerrar","Salir"+" "+EmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEmpresa=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEmpresa;
			
				this.jButtonProcesarInformacionToolBarEmpresa=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEmpresa;
				
		//protected JButton jButtonModificarToolBarEmpresa;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEmpresa=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEmpresa=new JMenuMe("General");
		this.jmenuArchivoEmpresa=new JMenuMe("Archivo");
		this.jmenuAccionesEmpresa=new JMenuMe("Acciones");
		this.jmenuDatosEmpresa=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEmpresa= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEmpresa.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEmpresa,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEmpresa= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEmpresa.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEmpresa,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEmpresa= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEmpresa.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEmpresa,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEmpresa= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEmpresa.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEmpresa,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEmpresa= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEmpresa.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEmpresa,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEmpresa= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEmpresa.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEmpresa,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEmpresa= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEmpresa.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEmpresa,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEmpresa= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEmpresa.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEmpresa,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEmpresa= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEmpresa.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEmpresa,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEmpresa= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEmpresa.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEmpresa,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEmpresa= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEmpresa.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEmpresa,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEmpresa= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEmpresa.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEmpresa,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEmpresa= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEmpresa.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEmpresa,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEmpresa= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEmpresa.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEmpresa,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEmpresa.add(this.jMenuItemCerrarEmpresa);
			
			this.jmenuAccionesEmpresa.add(this.jMenuItemNuevoEmpresa);
			this.jmenuAccionesEmpresa.add(this.jMenuItemNuevoGuardarCambiosEmpresa);
			this.jmenuAccionesEmpresa.add(this.jMenuItemNuevoRelacionesEmpresa);
			this.jmenuAccionesEmpresa.add(this.jMenuItemGuardarCambiosTablaEmpresa);		
			this.jmenuAccionesEmpresa.add(this.jMenuItemDuplicarEmpresa);		
			this.jmenuAccionesEmpresa.add(this.jMenuItemCopiarEmpresa);		
			this.jmenuAccionesEmpresa.add(this.jMenuItemVerFormEmpresa);		
			
			this.jmenuDatosEmpresa.add(this.jMenuItemRecargarInformacionEmpresa);				
			this.jmenuDatosEmpresa.add(this.jMenuItemAnterioresEmpresa);				
			this.jmenuDatosEmpresa.add(this.jMenuItemSiguientesEmpresa);				
			this.jmenuDatosEmpresa.add(this.jMenuItemAbrirOrderByEmpresa);				
			this.jmenuDatosEmpresa.add(this.jMenuItemMostrarOcultarEmpresa);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEmpresa.add(this.jMenuItemGuardarCambiosEmpresa);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEmpresa.add(this.jmenuArchivoEmpresa);		
			this.jmenuBarEmpresa.add(this.jmenuAccionesEmpresa);		
			this.jmenuBarEmpresa.add(this.jmenuDatosEmpresa);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEmpresa);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEmpresa() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorIdPaisPorNombreEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdPaisPorNombreEmpresa.setToolTipText("Buscar Por Pais Por Nombre ");
		this.jButtonBusquedaPorIdPaisPorNombreEmpresa= new JButtonMe();
		this.jButtonBusquedaPorIdPaisPorNombreEmpresa.setText("Buscar");
		this.jButtonBusquedaPorIdPaisPorNombreEmpresa.setToolTipText("Buscar Por Pais Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdPaisPorNombreEmpresa,"buscar_button","Buscar Por Pais Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdPaisPorNombreEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisBusquedaPorIdPaisPorNombreEmpresa = new JLabelMe();
		jLabelid_paisBusquedaPorIdPaisPorNombreEmpresa.setText("Pais :");
		jLabelid_paisBusquedaPorIdPaisPorNombreEmpresa.setToolTipText("Pais");
		jLabelid_paisBusquedaPorIdPaisPorNombreEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisBusquedaPorIdPaisPorNombreEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisBusquedaPorIdPaisPorNombreEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisBusquedaPorIdPaisPorNombreEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisBusquedaPorIdPaisPorNombreEmpresa= new JComboBoxMe();
		jComboBoxid_paisBusquedaPorIdPaisPorNombreEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisBusquedaPorIdPaisPorNombreEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisBusquedaPorIdPaisPorNombreEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisBusquedaPorIdPaisPorNombreEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelnombreBusquedaPorIdPaisPorNombreEmpresa = new JLabelMe();
		jLabelnombreBusquedaPorIdPaisPorNombreEmpresa.setText("Nombre :");
		jLabelnombreBusquedaPorIdPaisPorNombreEmpresa.setToolTipText("Nombre");
		jLabelnombreBusquedaPorIdPaisPorNombreEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorIdPaisPorNombreEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorIdPaisPorNombreEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorIdPaisPorNombreEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorIdPaisPorNombreEmpresa= new JTextAreaMe();
		jTextAreanombreBusquedaPorIdPaisPorNombreEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorIdPaisPorNombreEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorIdPaisPorNombreEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorIdPaisPorNombreEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPaisEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisEmpresa.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisEmpresa= new JButtonMe();
		this.jButtonFK_IdPaisEmpresa.setText("Buscar");
		this.jButtonFK_IdPaisEmpresa.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisEmpresa,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisEmpresa = new JLabelMe();
		jLabelid_paisFK_IdPaisEmpresa.setText("Pais :");
		jLabelid_paisFK_IdPaisEmpresa.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisEmpresa= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoEmpresaEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoEmpresaEmpresa.setToolTipText("Buscar Por Tipo Empresa ");
		this.jButtonFK_IdTipoEmpresaEmpresa= new JButtonMe();
		this.jButtonFK_IdTipoEmpresaEmpresa.setText("Buscar");
		this.jButtonFK_IdTipoEmpresaEmpresa.setToolTipText("Buscar Por Tipo Empresa ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoEmpresaEmpresa,"buscar_button","Buscar Por Tipo Empresa ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoEmpresaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_empresaFK_IdTipoEmpresaEmpresa = new JLabelMe();
		jLabelid_tipo_empresaFK_IdTipoEmpresaEmpresa.setText("Tipo Empresa :");
		jLabelid_tipo_empresaFK_IdTipoEmpresaEmpresa.setToolTipText("Tipo Empresa");
		jLabelid_tipo_empresaFK_IdTipoEmpresaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_empresaFK_IdTipoEmpresaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_empresaFK_IdTipoEmpresaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_empresaFK_IdTipoEmpresaEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_empresaFK_IdTipoEmpresaEmpresa= new JComboBoxMe();
		jComboBoxid_tipo_empresaFK_IdTipoEmpresaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_empresaFK_IdTipoEmpresaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_empresaFK_IdTipoEmpresaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_empresaFK_IdTipoEmpresaEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasEmpresa=new JTabbedPane();


		this.jTabbedPaneBusquedasEmpresa.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEmpresa.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEmpresa.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleEmpresa = new EmpresaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Empresa DATOS");
			this.jInternalFrameDetalleFormEmpresa = new EmpresaDetalleFormJInternalFrame(jDesktopPane,this.empresaSessionBean.getConGuardarRelaciones(),this.empresaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEmpresa = null;//new EmpresaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEmpresa= new GridBagLayout();
		
		
		this.jTableDatosEmpresa = new JTableMe();      
		
		String sToolTipEmpresa="";
		sToolTipEmpresa=EmpresaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEmpresa+="(Seguridad.Empresa)";
		}
		
		if(!this.empresaSessionBean.getEsGuardarRelacionado()) {
			sToolTipEmpresa+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEmpresa.setToolTipText(sToolTipEmpresa);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEmpresa);
		this.jTableDatosEmpresa.setAutoCreateRowSorter(true);
		this.jTableDatosEmpresa.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEmpresa.setRowSelectionAllowed(true);
		this.jTableDatosEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEmpresa = new JButtonMe();
		this.jButtonDuplicarEmpresa = new JButtonMe();
		this.jButtonCopiarEmpresa = new JButtonMe();
		this.jButtonVerFormEmpresa = new JButtonMe();
		this.jButtonNuevoRelacionesEmpresa = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEmpresa = new JButtonMe();
		this.jButtonCerrarEmpresa = new JButtonMe();
		
		this.jScrollPanelDatosEmpresa = new JScrollPane();   
        this.jScrollPanelDatosGeneralEmpresa = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocontadorEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciorepresentanteEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Empresa";
		
		if(!this.empresaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empresas" + this.sPath));
		} else {
			this.jScrollPanelDatosEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesEmpresa.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralEmpresa.setName("jPanelCamposFingeneralEmpresa");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocontadorEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Contador"));
		this.jPanelCamposIniciocontadorEmpresa.setName("jPanelCamposFincontadorEmpresa");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocontadorEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciorepresentanteEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Representante"));
		this.jPanelCamposIniciorepresentanteEmpresa.setName("jPanelCamposFinrepresentanteEmpresa");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciorepresentanteEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoEmpresa=new ReporteDinamicoJInternalFrame(EmpresaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEmpresa();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEmpresa=new ImportacionJInternalFrame(EmpresaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEmpresa();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEmpresa = new JButtonMe();
		
		this.jButtonAbrirOrderByEmpresa.setText("Orden");
		this.jButtonAbrirOrderByEmpresa.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEmpresa,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpresa,false,this);
			
			//this.cargarOrderByEmpresa(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpresa,true,this);
			
			//this.cargarOrderByEmpresa(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEmpresa.setMinimumSize(new Dimension(400,50));//2030
		this.jTableDatosEmpresa.setMaximumSize(new Dimension(400,50));//2030
		this.jTableDatosEmpresa.setPreferredSize(new Dimension(400,50));//2030
		
		this.jScrollPanelDatosEmpresa.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEmpresa.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEmpresa.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEmpresa.setText("Nuevo");
		this.jButtonDuplicarEmpresa.setText("Duplicar");
		this.jButtonCopiarEmpresa.setText("Copiar");
		this.jButtonVerFormEmpresa.setText("Ver");
		this.jButtonNuevoRelacionesEmpresa.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEmpresa.setText("Guardar");
		this.jButtonCerrarEmpresa.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEmpresa,"nuevo_button","Nuevo",this.empresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEmpresa,"duplicar_button","Duplicar",this.empresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEmpresa,"copiar_button","Copiar",this.empresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEmpresa,"ver_form","Ver",this.empresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEmpresa,"nuevorelaciones_button","Nuevo Rel",this.empresaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEmpresa,"guardarcambiostabla_button","Guardar",this.empresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEmpresa,"cerrar_button","Salir",this.empresaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEmpresa.setToolTipText("Nuevo"+" "+EmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEmpresa.setToolTipText("Duplicar"+" "+EmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEmpresa.setToolTipText("Copiar"+" "+EmpresaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEmpresa.setToolTipText("Ver"+" "+EmpresaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEmpresa.setToolTipText("Nuevo Rel"+" "+EmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEmpresa.setToolTipText("Guardar"+" "+EmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEmpresa.setToolTipText("Salir"+" "+EmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEmpresa";
		inputMap = this.jButtonNuevoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEmpresa"));
		
		//DUPLICAR
		sMapKey = "DuplicarEmpresa";
		inputMap = this.jButtonDuplicarEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEmpresa"));
		
		//COPIAR
		sMapKey = "CopiarEmpresa";
		inputMap = this.jButtonCopiarEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEmpresa"));
		
		//VEr FORM
		sMapKey = "VerFormEmpresa";
		inputMap = this.jButtonVerFormEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEmpresa"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEmpresa";
		inputMap = this.jButtonNuevoRelacionesEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEmpresa"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEmpresa";
		inputMap = this.jButtonModificarEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEmpresa"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEmpresa";
		inputMap = this.jButtonCerrarEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEmpresa"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEmpresa";
		inputMap = this.jButtonGuardarCambiosTablaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEmpresa"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Empresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Empresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Empresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Empresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Empresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEmpresa.setName("jPanelParametrosReportesEmpresa"); 
		
		this.jPanelParametrosReportesAccionesEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEmpresa.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEmpresa.setName("jPanelParametrosReportesAccionesEmpresa"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEmpresa = new JButtonMe();
		this.jButtonRecargarInformacionEmpresa.setText("Recargar");
		this.jButtonRecargarInformacionEmpresa.setToolTipText("Recargar"+" "+EmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEmpresa,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEmpresa = new JButtonMe();
		this.jButtonProcesarInformacionEmpresa.setText("Procesar");
		this.jButtonProcesarInformacionEmpresa.setToolTipText("Procesar"+" "+EmpresaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEmpresa.setVisible(false);
			
		this.jButtonProcesarInformacionEmpresa.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEmpresa.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEmpresa.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpresa.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEmpresa.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpresa.setText("TIPO");       
		this.jComboBoxTiposReportesEmpresa.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpresa.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEmpresa.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEmpresa.setText("Paginacion");
		this.jComboBoxTiposPaginacionEmpresa.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEmpresa.setText("Accion");
		this.jComboBoxTiposRelacionesEmpresa.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEmpresa.setText("Accion");
		this.jComboBoxTiposAccionesEmpresa.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEmpresa.setText("Accion");
		this.jComboBoxTiposSeleccionarEmpresa.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEmpresa=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEmpresa.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEmpresa.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEmpresa.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEmpresa = new JLabelMe();
		
		this.jLabelAccionesEmpresa.setText("Acciones");		
		this.jLabelAccionesEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEmpresa = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEmpresa.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEmpresa.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEmpresa = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEmpresa.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEmpresa.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEmpresa = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEmpresa.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEmpresa.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEmpresa = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEmpresa.setText("Graf.");
		this.jCheckBoxConGraficoReporteEmpresa.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEmpresa = new JButtonMe();
		//this.jButtonAnterioresEmpresa.setText("<<");
        this.jButtonAnterioresEmpresa.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEmpresa,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEmpresa = new JButtonMe();
		//this.jButtonSiguientesEmpresa.setText(">>");
        this.jButtonSiguientesEmpresa.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEmpresa,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEmpresa = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEmpresa.setText("Nue");
        this.jButtonNuevoGuardarCambiosEmpresa.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEmpresa,"nuevoguardarcambios_button","Nue",this.empresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEmpresa";
		inputMap = this.jButtonNuevoGuardarCambiosEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEmpresa"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEmpresa";
		inputMap = this.jButtonRecargarInformacionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEmpresa"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEmpresa";
		inputMap = this.jButtonSiguientesEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEmpresa"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEmpresa";
		inputMap = this.jButtonAnterioresEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEmpresa"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEmpresa();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEmpresa.setMinimumSize(new Dimension(this.getWidth(),EmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEmpresa.setMaximumSize(new Dimension(this.getWidth(),EmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEmpresa.setPreferredSize(new Dimension(this.getWidth(),EmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEmpresa = new GridBagLayout();

			this.jPanelPaginacionEmpresa.setLayout(gridaBagLayoutPaginacionEmpresa);						
			
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpresa.gridy = 0;
			this.gridBagConstraintsEmpresa.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEmpresa.add(this.jButtonAnterioresEmpresa, this.gridBagConstraintsEmpresa);
					
						
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEmpresa.gridy = 0;
			
			this.jPanelPaginacionEmpresa.add(this.jButtonNuevoGuardarCambiosEmpresa, this.gridBagConstraintsEmpresa);
						
			
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEmpresa.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEmpresa.gridy = 0;
			this.jPanelPaginacionEmpresa.add(this.jButtonSiguientesEmpresa, this.gridBagConstraintsEmpresa);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpresa.gridy = 1;
			this.gridBagConstraintsEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpresa.add(this.jButtonNuevoEmpresa, this.gridBagConstraintsEmpresa);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEmpresa = new GridBagConstraints();
				this.gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEmpresa.gridy = 1;
				this.gridBagConstraintsEmpresa.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEmpresa.add(this.jButtonNuevoRelacionesEmpresa, this.gridBagConstraintsEmpresa);
			}
			
			
			if(!this.empresaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEmpresa = new GridBagConstraints();
				this.gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEmpresa.gridy = 1;
				this.gridBagConstraintsEmpresa.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEmpresa.add(this.jButtonGuardarCambiosTablaEmpresa, this.gridBagConstraintsEmpresa);
			}
			
			
			
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpresa.gridy = 1;
			this.gridBagConstraintsEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpresa.add(this.jButtonDuplicarEmpresa, this.gridBagConstraintsEmpresa);
			
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpresa.gridy = 1;
			this.gridBagConstraintsEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpresa.add(this.jButtonCopiarEmpresa, this.gridBagConstraintsEmpresa);
		
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpresa.gridy = 1;
			this.gridBagConstraintsEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpresa.add(this.jButtonVerFormEmpresa, this.gridBagConstraintsEmpresa);
		
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpresa.gridy = 1;
			this.gridBagConstraintsEmpresa.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEmpresa.add(this.jButtonCerrarEmpresa, this.gridBagConstraintsEmpresa);
		
		
		
		this.jButtonRecargarInformacionEmpresa.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEmpresa.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEmpresa.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEmpresa.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEmpresa.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEmpresa.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEmpresa.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEmpresa.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEmpresa.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEmpresa.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEmpresa.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEmpresa.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEmpresa.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEmpresa.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEmpresa.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEmpresa.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEmpresa.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEmpresa.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEmpresa.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEmpresa.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEmpresa.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEmpresa.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEmpresa.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEmpresa.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEmpresa = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Empresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Empresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Empresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Empresa = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEmpresa.setLayout(gridaBagParametrosReportesEmpresa);
			this.jPanelParametrosReportesAccionesEmpresa.setLayout(gridaBagParametrosReportesAccionesEmpresa);
			
			
			this.jPanelParametrosAuxiliar1Empresa.setLayout(gridaBagParametrosAuxiliar1Empresa);
			this.jPanelParametrosAuxiliar2Empresa.setLayout(gridaBagParametrosAuxiliar2Empresa);
			this.jPanelParametrosAuxiliar3Empresa.setLayout(gridaBagParametrosAuxiliar3Empresa);
			this.jPanelParametrosAuxiliar4Empresa.setLayout(gridaBagParametrosAuxiliar4Empresa);
			//this.jPanelParametrosAuxiliar5Empresa.setLayout(gridaBagParametrosAuxiliar2Empresa);			
			
			
			
			
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpresa.add(this.jButtonRecargarInformacionEmpresa, this.gridBagConstraintsEmpresa);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Empresa.add(this.jComboBoxTiposPaginacionEmpresa, this.gridBagConstraintsEmpresa);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Empresa.add(this.jCheckBoxConAltoMaximoTablaEmpresa, this.gridBagConstraintsEmpresa);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Empresa.add(this.jComboBoxTiposArchivosReportesEmpresa, this.gridBagConstraintsEmpresa);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpresa.add(this.jPanelParametrosAuxiliar1Empresa, this.gridBagConstraintsEmpresa);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Empresa.add(this.jComboBoxTiposReportesEmpresa, this.gridBagConstraintsEmpresa);																		
			
			
			
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4Empresa.add(this.jComboBoxTiposGraficosReportesEmpresa, this.gridBagConstraintsEmpresa);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpresa.add(this.jPanelParametrosAuxiliar4Empresa, this.gridBagConstraintsEmpresa);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpresa.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpresa.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpresa.add(this.jComboBoxTiposReportesEmpresa, this.gridBagConstraintsEmpresa);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpresa.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpresa.add(this.jCheckBoxGenerarReporteEmpresa, this.gridBagConstraintsEmpresa);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpresa.add(this.jPanelParametrosAuxiliar2Empresa, this.gridBagConstraintsEmpresa);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpresa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpresa.add(this.jLabelAccionesEmpresa, this.gridBagConstraintsEmpresa);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEmpresa = new GridBagConstraints();
				this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEmpresa.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEmpresa.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEmpresa.add(this.jButtonAbrirOrderByEmpresa, this.gridBagConstraintsEmpresa);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpresa.add(this.jComboBoxTiposSeleccionarEmpresa, this.gridBagConstraintsEmpresa);			
			
			
			/*
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpresa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpresa.add(this.jCheckBoxSeleccionarTodosEmpresa, this.gridBagConstraintsEmpresa);
			
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpresa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpresa.add(this.jCheckBoxConGraficoReporteEmpresa, this.gridBagConstraintsEmpresa);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Empresa.add(this.jCheckBoxSeleccionarTodosEmpresa, this.gridBagConstraintsEmpresa);															
				
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Empresa.add(this.jCheckBoxSeleccionadosEmpresa, this.gridBagConstraintsEmpresa);															
			
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Empresa.add(this.jCheckBoxConGraficoReporteEmpresa, this.gridBagConstraintsEmpresa);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpresa.add(this.jPanelParametrosAuxiliar3Empresa, this.gridBagConstraintsEmpresa);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpresa.add(this.jComboBoxTiposRelacionesEmpresa, this.gridBagConstraintsEmpresa);
				
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpresa.add(this.jComboBoxTiposAccionesEmpresa, this.gridBagConstraintsEmpresa);
	
				
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpresa.add(this.jTextFieldValorCampoGeneralEmpresa, this.gridBagConstraintsEmpresa);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralEmpresa= new GridBagLayout();
		this.jPanelCamposIniciogeneralEmpresa.setLayout(gridaBagLayoutCamposIniciogeneralEmpresa);

		GridBagLayout gridaBagLayoutCamposIniciocontadorEmpresa= new GridBagLayout();
		this.jPanelCamposIniciocontadorEmpresa.setLayout(gridaBagLayoutCamposIniciocontadorEmpresa);

		GridBagLayout gridaBagLayoutCamposIniciorepresentanteEmpresa= new GridBagLayout();
		this.jPanelCamposIniciorepresentanteEmpresa.setLayout(gridaBagLayoutCamposIniciorepresentanteEmpresa);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEmpresa = new GridBagLayout();

			this.jScrollPanelDatosEmpresa.setLayout(gridaBagLayoutDatosEmpresa);
			
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpresa.gridy = 0;
			this.gridBagConstraintsEmpresa.gridx = 0;
			
			this.jScrollPanelDatosEmpresa.add(this.jTableDatosEmpresa, this.gridBagConstraintsEmpresa);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEmpresa.setViewportView(this.jTableDatosEmpresa);
		this.jTableDatosEmpresa.setFillsViewportHeight(true);
		this.jTableDatosEmpresa.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEmpresa= new GridBagLayout();
		this.jPanelAccionesEmpresa.setLayout(gridaBagLayoutAccionesEmpresa);
		
		
		/*	
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpresa.gridy = 0;
		this.gridBagConstraintsEmpresa.gridx = 0;
			
		this.jPanelAccionesEmpresa.add(this.jButtonNuevoEmpresa, this.gridBagConstraintsEmpresa);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorIdPaisPorNombreEmpresa= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdPaisPorNombreEmpresa.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdPaisPorNombreEmpresa.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdPaisPorNombreEmpresa.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdPaisPorNombreEmpresa.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdPaisPorNombreEmpresa.setLayout(gridaBagLayoutBusquedaPorIdPaisPorNombreEmpresa);

		gridBagConstraintsEmpresa = new GridBagConstraints();
		gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpresa.gridy = 0;
		gridBagConstraintsEmpresa.gridx = 0;
		jPanelBusquedaPorIdPaisPorNombreEmpresa.add(jLabelid_paisBusquedaPorIdPaisPorNombreEmpresa, gridBagConstraintsEmpresa);

		gridBagConstraintsEmpresa = new GridBagConstraints();
		gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpresa.gridy = 0;
		gridBagConstraintsEmpresa.gridx = 1;
		jPanelBusquedaPorIdPaisPorNombreEmpresa.add(jComboBoxid_paisBusquedaPorIdPaisPorNombreEmpresa, gridBagConstraintsEmpresa);


		gridBagConstraintsEmpresa = new GridBagConstraints();
		gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpresa.gridy = 1;
		gridBagConstraintsEmpresa.gridx = 0;
		jPanelBusquedaPorIdPaisPorNombreEmpresa.add(jLabelnombreBusquedaPorIdPaisPorNombreEmpresa, gridBagConstraintsEmpresa);

		gridBagConstraintsEmpresa = new GridBagConstraints();
		gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpresa.gridy = 1;
		gridBagConstraintsEmpresa.gridx = 1;
		jPanelBusquedaPorIdPaisPorNombreEmpresa.add(jTextAreanombreBusquedaPorIdPaisPorNombreEmpresa, gridBagConstraintsEmpresa);

		gridBagConstraintsEmpresa = new GridBagConstraints();
		gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpresa.gridy = 2;
		gridBagConstraintsEmpresa.gridx =1;
		jPanelBusquedaPorIdPaisPorNombreEmpresa.add(jButtonBusquedaPorIdPaisPorNombreEmpresa, gridBagConstraintsEmpresa);

		jTabbedPaneBusquedasEmpresa.addTab("1.-Por Pais Por Nombre ", jPanelBusquedaPorIdPaisPorNombreEmpresa);
		jTabbedPaneBusquedasEmpresa.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdPaisEmpresa= new GridBagLayout();
		gridaBagLayoutFK_IdPaisEmpresa.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisEmpresa.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisEmpresa.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisEmpresa.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisEmpresa.setLayout(gridaBagLayoutFK_IdPaisEmpresa);

		gridBagConstraintsEmpresa = new GridBagConstraints();
		gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpresa.gridy = 0;
		gridBagConstraintsEmpresa.gridx = 0;
		jPanelFK_IdPaisEmpresa.add(jLabelid_paisFK_IdPaisEmpresa, gridBagConstraintsEmpresa);

		gridBagConstraintsEmpresa = new GridBagConstraints();
		gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpresa.gridy = 0;
		gridBagConstraintsEmpresa.gridx = 1;
		jPanelFK_IdPaisEmpresa.add(jComboBoxid_paisFK_IdPaisEmpresa, gridBagConstraintsEmpresa);

		gridBagConstraintsEmpresa = new GridBagConstraints();
		gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpresa.gridy = 1;
		gridBagConstraintsEmpresa.gridx =1;
		jPanelFK_IdPaisEmpresa.add(jButtonFK_IdPaisEmpresa, gridBagConstraintsEmpresa);

		jTabbedPaneBusquedasEmpresa.addTab("2.-Por Pais ", jPanelFK_IdPaisEmpresa);
		jTabbedPaneBusquedasEmpresa.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoEmpresaEmpresa= new GridBagLayout();
		gridaBagLayoutFK_IdTipoEmpresaEmpresa.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoEmpresaEmpresa.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoEmpresaEmpresa.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoEmpresaEmpresa.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoEmpresaEmpresa.setLayout(gridaBagLayoutFK_IdTipoEmpresaEmpresa);

		gridBagConstraintsEmpresa = new GridBagConstraints();
		gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpresa.gridy = 0;
		gridBagConstraintsEmpresa.gridx = 0;
		jPanelFK_IdTipoEmpresaEmpresa.add(jLabelid_tipo_empresaFK_IdTipoEmpresaEmpresa, gridBagConstraintsEmpresa);

		gridBagConstraintsEmpresa = new GridBagConstraints();
		gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpresa.gridy = 0;
		gridBagConstraintsEmpresa.gridx = 1;
		jPanelFK_IdTipoEmpresaEmpresa.add(jComboBoxid_tipo_empresaFK_IdTipoEmpresaEmpresa, gridBagConstraintsEmpresa);

		gridBagConstraintsEmpresa = new GridBagConstraints();
		gridBagConstraintsEmpresa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpresa.gridy = 1;
		gridBagConstraintsEmpresa.gridx =1;
		jPanelFK_IdTipoEmpresaEmpresa.add(jButtonFK_IdTipoEmpresaEmpresa, gridBagConstraintsEmpresa);

		jTabbedPaneBusquedasEmpresa.addTab("3.-Por Tipo Empresa ", jPanelFK_IdTipoEmpresaEmpresa);
		jTabbedPaneBusquedasEmpresa.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEmpresa = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEmpresa);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.empresaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEmpresa = new GridBagConstraints();						
			this.gridBagConstraintsEmpresa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpresa.gridx = 0;		
			//this.gridBagConstraintsEmpresa.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEmpresa.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEmpresa, this.gridBagConstraintsEmpresa);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEmpresa.gridx = 0;		
		//this.gridBagConstraintsEmpresa.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEmpresa.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEmpresa);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsEmpresa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpresa.gridx = 0;		
			this.gridBagConstraintsEmpresa.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpresa.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsEmpresa.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasEmpresa, this.gridBagConstraintsEmpresa);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpresa.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEmpresa, this.gridBagConstraintsEmpresa);								
		
		
		/*
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpresa.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEmpresa, this.gridBagConstraintsEmpresa);
		*/		
		
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEmpresa.gridx =0;
		this.gridBagConstraintsEmpresa.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEmpresa.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEmpresa, this.gridBagConstraintsEmpresa);
				
		
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpresa.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEmpresa, this.gridBagConstraintsEmpresa);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EmpresaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEmpresa = new GridBagLayout();
			this.jPanelBusquedasParametrosEmpresa.setLayout(gridaBagLayoutBusquedasParametrosEmpresa);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEmpresa=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEmpresa, this.gridBagConstraintsEmpresa);
			
			
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEmpresa, this.gridBagConstraintsEmpresa);
		
			
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEmpresa.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEmpresa, this.gridBagConstraintsEmpresa);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEmpresa;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEmpresa() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEmpresa = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEmpresa.setName("jPanelReporteDinamicoEmpresa"); 
		
		this.jPanelReporteDinamicoEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEmpresa.setLayout(gridaBagLayoutReporteDinamicoEmpresa);
		
		
		this.jInternalFrameReporteDinamicoEmpresa= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEmpresa = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEmpresa= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEmpresa.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEmpresa.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEmpresa.setResizable(true);
	    this.jInternalFrameReporteDinamicoEmpresa.setClosable(true);
	    this.jInternalFrameReporteDinamicoEmpresa.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empresas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEmpresa = new JLabelMe();

		this.jLabelColumnasSelectReporteEmpresa.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpresa.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEmpresa.add(this.jLabelColumnasSelectReporteEmpresa, this.gridBagConstraintsEmpresa);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEmpresa = new JList<Reporte>();
		this.jListColumnasSelectReporteEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEmpresa.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEmpresa.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEmpresa.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEmpresa.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEmpresa=new JScrollPane(this.jListColumnasSelectReporteEmpresa);
			
			this.jScrollColumnasSelectReporteEmpresa.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEmpresa.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEmpresa.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpresa.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEmpresa.add(this.jListColumnasSelectReporteEmpresa, this.gridBagConstraintsEmpresa);
		this.jPanelReporteDinamicoEmpresa.add(this.jScrollColumnasSelectReporteEmpresa, this.gridBagConstraintsEmpresa);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEmpresa = new JLabelMe();

		this.jLabelRelacionesSelectReporteEmpresa.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpresa.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEmpresa.add(this.jLabelRelacionesSelectReporteEmpresa, this.gridBagConstraintsEmpresa);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEmpresa = new JList<Reporte>();
		this.jListRelacionesSelectReporteEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEmpresa.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEmpresa.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEmpresa.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEmpresa.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEmpresa=new JScrollPane(this.jListRelacionesSelectReporteEmpresa);
			
			this.jScrollRelacionesSelectReporteEmpresa.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEmpresa.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEmpresa.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpresa.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEmpresa.add(this.jListRelacionesSelectReporteEmpresa, this.gridBagConstraintsEmpresa);
		this.jPanelReporteDinamicoEmpresa.add(this.jScrollRelacionesSelectReporteEmpresa, this.gridBagConstraintsEmpresa);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEmpresa = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEmpresa = new JComboBoxMe();
		this.jListColumnasValoresGraficoEmpresa = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEmpresa = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEmpresa.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEmpresa = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEmpresa.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoEmpresa = new JLabelMe();

		this.jLabelConGraficoDinamicoEmpresa.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpresa.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEmpresa.add(this.jLabelConGraficoDinamicoEmpresa, this.gridBagConstraintsEmpresa);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoEmpresa = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoEmpresa.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoEmpresa.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoEmpresa.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoEmpresa.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoEmpresa.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpresa.add(this.jCheckBoxConGraficoDinamicoEmpresa, this.gridBagConstraintsEmpresa);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoEmpresa = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoEmpresa.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpresa.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEmpresa.add(this.jLabelColumnaCategoriaGraficoEmpresa, this.gridBagConstraintsEmpresa);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoEmpresa = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoEmpresa.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoEmpresa.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoEmpresa.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoEmpresa.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoEmpresa.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpresa.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoEmpresa.add(this.jComboBoxColumnaCategoriaGraficoEmpresa, this.gridBagConstraintsEmpresa);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorEmpresa = new JLabelMe();

		this.jLabelColumnaCategoriaValorEmpresa.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpresa.add(this.jLabelColumnaCategoriaValorEmpresa, this.gridBagConstraintsEmpresa);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorEmpresa = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorEmpresa.setText("Accion");
        this.jComboBoxColumnaCategoriaValorEmpresa.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorEmpresa.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorEmpresa.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorEmpresa.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpresa.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoEmpresa.add(this.jComboBoxColumnaCategoriaValorEmpresa, this.gridBagConstraintsEmpresa);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoEmpresa = new JLabelMe();

		this.jLabelColumnasValoresGraficoEmpresa.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpresa.add(this.jLabelColumnasValoresGraficoEmpresa, this.gridBagConstraintsEmpresa);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoEmpresa = new JList<Reporte>();
		this.jListColumnasValoresGraficoEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoEmpresa.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoEmpresa.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoEmpresa.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoEmpresa.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoEmpresa=new JScrollPane(this.jListColumnasValoresGraficoEmpresa);
			
			this.jScrollColumnasValoresGraficoEmpresa.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoEmpresa.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoEmpresa.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpresa.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoEmpresa.add(this.jListColumnasSelectReporteEmpresa, this.gridBagConstraintsEmpresa);
		this.jPanelReporteDinamicoEmpresa.add(this.jScrollColumnasValoresGraficoEmpresa, this.gridBagConstraintsEmpresa);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoEmpresa = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoEmpresa.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpresa.add(this.jLabelTiposGraficosReportesDinamicoEmpresa, this.gridBagConstraintsEmpresa);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoEmpresa = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoEmpresa.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoEmpresa.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoEmpresa.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoEmpresa.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoEmpresa.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpresa.add(this.jComboBoxTiposGraficosReportesDinamicoEmpresa, this.gridBagConstraintsEmpresa);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEmpresa = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEmpresa.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpresa.add(this.jLabelGenerarExcelReporteDinamicoEmpresa, this.gridBagConstraintsEmpresa);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEmpresa = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEmpresa.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEmpresa,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEmpresa.setToolTipText("Generar EXCEL"+" "+EmpresaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEmpresa.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEmpresa.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEmpresa.add(this.jButtonGenerarExcelReporteDinamicoEmpresa, this.gridBagConstraintsEmpresa);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpresa.add(this.jComboBoxTiposReportesDinamicoEmpresa, this.gridBagConstraintsEmpresa);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEmpresa = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEmpresa.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpresa.add(this.jLabelTiposArchivoReporteDinamicoEmpresa, this.gridBagConstraintsEmpresa);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpresa.add(this.jComboBoxTiposArchivosReportesDinamicoEmpresa, this.gridBagConstraintsEmpresa);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEmpresa = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEmpresa.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEmpresa,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEmpresa.setToolTipText("Generar"+" "+EmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpresa.add(this.jButtonGenerarReporteDinamicoEmpresa, this.gridBagConstraintsEmpresa);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEmpresa = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEmpresa.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEmpresa,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEmpresa.setToolTipText("Cancelar"+" "+EmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpresa.add(this.jButtonCerrarReporteDinamicoEmpresa, this.gridBagConstraintsEmpresa);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEmpresa = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEmpresa= new JScrollPane(jPanelReporteDinamicoEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empresas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEmpresa.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEmpresa.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEmpresa.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEmpresa);
		this.jInternalFrameReporteDinamicoEmpresa.getContentPane().add(this.jScrollPanelReporteDinamicoEmpresa, this.gridBagConstraintsEmpresa);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEmpresa() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEmpresa = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEmpresa.setName("jPanelImportacionEmpresa"); 
		
		this.jPanelImportacionEmpresa.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEmpresa.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEmpresa.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEmpresa.setLayout(gridaBagLayoutImportacionEmpresa);
		
		
		this.jInternalFrameImportacionEmpresa= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEmpresa= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEmpresa = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEmpresa= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEmpresa.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEmpresa.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEmpresa.setResizable(true);
	    this.jInternalFrameImportacionEmpresa.setClosable(true);
	    this.jInternalFrameImportacionEmpresa.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEmpresa.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEmpresa.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEmpresa.setResizable(true);
	    this.jInternalFrameImportacionEmpresa.setClosable(true);
	    this.jInternalFrameImportacionEmpresa.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEmpresa.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEmpresa.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEmpresa.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empresas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEmpresa = new JLabelMe();

		this.jLabelArchivoImportacionEmpresa.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = iPosYImportacion;		
		this.gridBagConstraintsEmpresa.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEmpresa.add(this.jLabelArchivoImportacionEmpresa, this.gridBagConstraintsEmpresa);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEmpresa = new JFileChooser();		
		this.jFileChooserImportacionEmpresa.setToolTipText("ESCOGER ARCHIVO"+" "+EmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEmpresa = new JButtonMe();
		this.jButtonAbrirImportacionEmpresa.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEmpresa,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEmpresa.setToolTipText("Generar"+" "+EmpresaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpresa.add(this.jButtonAbrirImportacionEmpresa, this.gridBagConstraintsEmpresa);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEmpresa = new JLabelMe();

		this.jLabelPathArchivoImportacionEmpresa.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresa.gridy = iPosYImportacion;		
		this.gridBagConstraintsEmpresa.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEmpresa.add(this.jLabelPathArchivoImportacionEmpresa, this.gridBagConstraintsEmpresa);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEmpresa=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEmpresa.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEmpresa.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEmpresa.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpresa.add(this.jTextFieldPathArchivoImportacionEmpresa, this.gridBagConstraintsEmpresa);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEmpresa = new JButtonMe();
		this.jButtonGenerarImportacionEmpresa.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEmpresa,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEmpresa.setToolTipText("Generar"+" "+EmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpresa.add(this.jButtonGenerarImportacionEmpresa, this.gridBagConstraintsEmpresa);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEmpresa = new JButtonMe();
		this.jButtonCerrarImportacionEmpresa.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEmpresa,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEmpresa.setToolTipText("Cancelar"+" "+EmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpresa.add(this.jButtonCerrarImportacionEmpresa, this.gridBagConstraintsEmpresa);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEmpresa = new GridBagLayout();
		
		this.jScrollPanelImportacionEmpresa= new JScrollPane(jPanelImportacionEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEmpresa.gridy =iPosYImportacion;
		this.gridBagConstraintsEmpresa.gridx =iPosXImportacion;
		this.gridBagConstraintsEmpresa.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEmpresa.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEmpresa);
		this.jInternalFrameImportacionEmpresa.getContentPane().add(this.jScrollPanelImportacionEmpresa, this.gridBagConstraintsEmpresa);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEmpresa(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEmpresa = new JButtonMe();
			this.jButtonAbrirOrderByEmpresa.setText("Orden");
			this.jButtonAbrirOrderByEmpresa.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEmpresa,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEmpresa";
			inputMap = this.jButtonAbrirOrderByEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEmpresa"));
		
		
			GridBagLayout gridaBagLayoutOrderByEmpresa = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEmpresa.setName("jPanelOrderByEmpresa"); 
			
			this.jPanelOrderByEmpresa.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEmpresa.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEmpresa.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEmpresa.setLayout(gridaBagLayoutOrderByEmpresa);
			
			
			this.jTableDatosEmpresaOrderBy = new JTableMe();        
			this.jTableDatosEmpresaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEmpresaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEmpresaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEmpresaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEmpresaOrderBy.setViewportView(this.jTableDatosEmpresaOrderBy);
			this.jTableDatosEmpresaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEmpresaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEmpresa= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEmpresa= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEmpresa = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEmpresa= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEmpresa.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEmpresa.setTitle("Orden");
			this.jInternalFrameOrderByEmpresa.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEmpresa.setResizable(true);
			this.jInternalFrameOrderByEmpresa.setClosable(true);
			this.jInternalFrameOrderByEmpresa.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEmpresa.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEmpresa.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEmpresa.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empresas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEmpresa.gridx =iPosXOrderBy;
			this.gridBagConstraintsEmpresa.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEmpresa.ipady =150;
				
			this.jPanelOrderByEmpresa.add(jScrollPanelDatosEmpresaOrderBy, this.gridBagConstraintsEmpresa);//this.jTableDatosEmpresaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEmpresa = new JButtonMe();
			this.jButtonCerrarOrderByEmpresa.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEmpresa,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEmpresa.setToolTipText("Cancelar"+" "+EmpresaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpresa.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEmpresa.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEmpresa.add(this.jButtonCerrarOrderByEmpresa, this.gridBagConstraintsEmpresa);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEmpresa = new GridBagLayout();
			
			this.jScrollPanelOrderByEmpresa= new JScrollPane(jPanelOrderByEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEmpresa.gridy =iPosYOrderBy;
			this.gridBagConstraintsEmpresa.gridx =iPosXOrderBy;
			this.gridBagConstraintsEmpresa.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEmpresa.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEmpresa);
			
			this.jInternalFrameOrderByEmpresa.getContentPane().add(this.jScrollPanelOrderByEmpresa, this.gridBagConstraintsEmpresa);			
		
		} else {
			this.jButtonAbrirOrderByEmpresa = new JButtonMe();
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
		int iWidthTableCalculado=0;//4030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.empresaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEmpresa.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEmpresa.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEmpresa.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEmpresa.getRowHeight();//EmpresaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.empresaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEmpresa.isSelected()) {
					iHeightTable=EmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEmpresa.isSelected()) {
					iHeightTable=EmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEmpresa.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEmpresa.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEmpresa.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEmpresa.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEmpresa.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEmpresa.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEmpresa!=null && this.jInternalFrameOrderByEmpresa.getjTableDatosOrderBy()!=null) {
			//if(!this.empresaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEmpresa.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEmpresa.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEmpresa.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEmpresa.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEmpresa.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEmpresa.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEmpresa.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEmpresa.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEmpresa.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEmpresa.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=empresaLogic.getEmpresas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empresas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Empresa> TraerEmpresaBeans(List<Empresa> empresas,ArrayList<Classe> classes)throws Exception {
		try {
			for(Empresa empresa:empresas) {
					
				if(!(EmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					empresa.setsDetalleGeneralEntityReporte(EmpresaConstantesFunciones.getEmpresaDescripcion(empresa));
										
						
					
					

					if(empresa.getSucursals()!=null && Funciones.existeClass(classes,Sucursal.class)) {
						try{empresa.setsucursalsDescripcionReporte(new JRBeanCollectionDataSource(SucursalJInternalFrame.TraerSucursalBeans(empresa.getSucursals(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//empresa.setsDetalleGeneralEntityReporte(empresa.getsDetalleGeneralEntityReporte());
										
				}
				
				//empresabeans.add(empresabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return empresas;
    }
	//PARA REPORTES FIN
}
