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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.ResponsableConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class ResponsableJInternalFrame extends ResponsableBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarResponsable;
	
	protected JMenuBar jmenuBarResponsable;
	
	protected JMenu jmenuResponsable;
	protected JMenu jmenuDatosResponsable;
	protected JMenu jmenuArchivoResponsable;
	protected JMenu jmenuAccionesResponsable;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosResponsable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutResponsable;	
	protected GridBagConstraints gridBagConstraintsResponsable;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ResponsableDetalleFormJInternalFrame jInternalFrameDetalleFormResponsable;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoResponsable;	
	protected ImportacionJInternalFrame jInternalFrameImportacionResponsable;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";
	
	public ResponsableSessionBean responsableSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Responsable> responsables;		
	public List<Responsable> responsablesEliminados;	
	public List<Responsable> responsablesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByResponsable;		
	protected JButton jButtonAbrirOrderByResponsable;
	
	
	//protected JPanel jPanelOrderByResponsable;
	//public JScrollPane jScrollPanelOrderByResponsable;	
	//protected JButton jButtonCerrarOrderByResponsable;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ResponsableLogic responsableLogic;
	
	
	
	public JScrollPane jScrollPanelDatosResponsable;
	public JScrollPane jScrollPanelDatosEdicionResponsable;
	public JScrollPane jScrollPanelDatosGeneralResponsable;
    
	
	
	//public JScrollPane jScrollPanelDatosResponsableOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoResponsable;
	//public JScrollPane jScrollPanelImportacionResponsable;
	
	
	
	protected JPanel jPanelAccionesResponsable;
	
    protected JPanel jPanelPaginacionResponsable;
    protected JPanel jPanelParametrosReportesResponsable;
	protected JPanel jPanelParametrosReportesAccionesResponsable;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Responsable;
	protected JPanel jPanelParametrosAuxiliar2Responsable;
	protected JPanel jPanelParametrosAuxiliar3Responsable;
	protected JPanel jPanelParametrosAuxiliar4Responsable;
	//protected JPanel jPanelParametrosAuxiliar5Responsable;
	
	
	
	//protected JPanel jPanelReporteDinamicoResponsable;
	//protected JPanel jPanelImportacionResponsable;
	
	
	public JTable jTableDatosResponsable;
	
	
	
	//public JTable jTableDatosResponsableOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoResponsable;
	protected JButton jButtonDuplicarResponsable;
	protected JButton jButtonCopiarResponsable;
	protected JButton jButtonVerFormResponsable;
	protected JButton jButtonNuevoRelacionesResponsable;
	protected JButton jButtonModificarResponsable;
	
    protected JButton jButtonGuardarCambiosTablaResponsable;
	protected JButton jButtonCerrarResponsable;
	
	
	protected JButton jButtonRecargarInformacionResponsable;
	protected JButton jButtonProcesarInformacionResponsable;
	
	
	protected JButton jButtonAnterioresResponsable;
	protected JButton jButtonSiguientesResponsable;
	protected JButton jButtonNuevoGuardarCambiosResponsable;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoResponsable;
	//protected JButton jButtonCerrarReporteDinamicoResponsable;
	//protected JButton jButtonGenerarExcelReporteDinamicoResponsable;	
	
	
	
	//protected JButton jButtonAbrirImportacionResponsable;
	//protected JButton jButtonGenerarImportacionResponsable;
	//protected JButton jButtonCerrarImportacionResponsable;
	//protected JFileChooser jFileChooserImportacionResponsable;
	//protected File fileImportacionResponsable;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarResponsable;
	protected JButton jButtonDuplicarToolBarResponsable;
	protected JButton jButtonNuevoRelacionesToolBarResponsable;
	
	
	public JButton jButtonGuardarCambiosToolBarResponsable;
	protected JButton jButtonCopiarToolBarResponsable;
	protected JButton jButtonVerFormToolBarResponsable;
	public JButton jButtonGuardarCambiosTablaToolBarResponsable;
	protected JButton jButtonMostrarOcultarTablaToolBarResponsable;
	protected JButton jButtonCerrarToolBarResponsable;
	
	protected JButton jButtonRecargarInformacionToolBarResponsable;
	protected JButton jButtonProcesarInformacionToolBarResponsable;
	protected JButton jButtonAnterioresToolBarResponsable;
	protected JButton jButtonSiguientesToolBarResponsable;
	protected JButton jButtonNuevoGuardarCambiosToolBarResponsable;
	protected JButton jButtonAbrirOrderByToolBarResponsable;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoResponsable;
	protected JMenuItem jMenuItemDuplicarResponsable;
	protected JMenuItem jMenuItemNuevoRelacionesResponsable;
	
	
	protected JMenuItem jMenuItemGuardarCambiosResponsable;
	protected JMenuItem jMenuItemCopiarResponsable;
	protected JMenuItem jMenuItemVerFormResponsable;
	protected JMenuItem jMenuItemGuardarCambiosTablaResponsable;
	protected JMenuItem jMenuItemCerrarResponsable;
	protected JMenuItem jMenuItemDetalleCerrarResponsable;
	protected JMenuItem jMenuItemDetalleAbrirOrderByResponsable;
	protected JMenuItem jMenuItemDetalleMostarOcultarResponsable;
	
	protected JMenuItem jMenuItemRecargarInformacionResponsable;
	protected JMenuItem jMenuItemProcesarInformacionResponsable;
	protected JMenuItem jMenuItemAnterioresResponsable;
	protected JMenuItem jMenuItemSiguientesResponsable;
	protected JMenuItem jMenuItemNuevoGuardarCambiosResponsable;
	protected JMenuItem jMenuItemAbrirOrderByResponsable;
	protected JMenuItem jMenuItemMostrarOcultarResponsable;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesResponsable;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosResponsable;
	protected JCheckBox jCheckBoxSeleccionadosResponsable;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaResponsable;
	protected JCheckBox jCheckBoxConGraficoReporteResponsable;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesResponsable;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesResponsable;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoResponsable;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoResponsable;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesResponsable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionResponsable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesResponsable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesResponsable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarResponsable;
	protected JTextField jTextFieldValorCampoGeneralResponsable;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteResponsable;
	//public JList<Reporte> jListColumnasSelectReporteResponsable;
	//public JScrollPane jScrollColumnasSelectReporteResponsable;
	
	//public JLabel jLabelRelacionesSelectReporteResponsable;
	//public JList<Reporte> jListRelacionesSelectReporteResponsable;
	//public JScrollPane jScrollRelacionesSelectReporteResponsable;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoResponsable;
	//protected JCheckBox jCheckBoxConGraficoDinamicoResponsable;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoResponsable;
	//public JLabel jLabelTiposArchivoReporteDinamicoResponsable;
	
		
	//public JLabel jLabelArchivoImportacionResponsable;	
	//public JLabel jLabelPathArchivoImportacionResponsable;
	//protected JTextField jTextFieldPathArchivoImportacionResponsable;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoResponsable;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoResponsable;
	
	//public JLabel jLabelColumnaCategoriaValorResponsable;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorResponsable;
	
	//public JLabel jLabelColumnasValoresGraficoResponsable;
	//public JList<Reporte> jListColumnasValoresGraficoResponsable;
	//public JScrollPane jScrollColumnasValoresGraficoResponsable;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoResponsable;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoResponsable;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasResponsable;
	public JPanel jPanelBusquedaPorIdentificacionResponsable;
	public JButton jButtonBusquedaPorIdentificacionResponsable;
	public JPanel jPanelBusquedaPorNombreCompletoResponsable;
	public JButton jButtonBusquedaPorNombreCompletoResponsable;
	public JPanel jPanelBusquedaPorRucResponsable;
	public JButton jButtonBusquedaPorRucResponsable;
	public JPanel jPanelBusquedaPorTelefonoResponsable;
	public JButton jButtonBusquedaPorTelefonoResponsable;
	public JPanel jPanelBusquedaPorTelefonoCelularResponsable;
	public JButton jButtonBusquedaPorTelefonoCelularResponsable;
	public JPanel jPanelFK_IdClienteResponsable;
	public JButton jButtonFK_IdClienteResponsable;
	
	public JPanel jPanelidentificacionBusquedaPorIdentificacionResponsable;
	public JLabel jLabelidentificacionBusquedaPorIdentificacionResponsable;
	public JTextField jTextFieldidentificacionBusquedaPorIdentificacionResponsable;
	public JButton jButtonidentificacionBusquedaPorIdentificacionResponsableBusqueda= new JButtonMe();

	
	public JPanel jPanelnombre_completoBusquedaPorNombreCompletoResponsable;
	public JLabel jLabelnombre_completoBusquedaPorNombreCompletoResponsable;
	public JTextArea jTextAreanombre_completoBusquedaPorNombreCompletoResponsable;
	public JButton jButtonnombre_completoBusquedaPorNombreCompletoResponsableBusqueda= new JButtonMe();

	
	public JPanel jPanelrucBusquedaPorRucResponsable;
	public JLabel jLabelrucBusquedaPorRucResponsable;
	public JTextField jTextFieldrucBusquedaPorRucResponsable;
	public JButton jButtonrucBusquedaPorRucResponsableBusqueda= new JButtonMe();

	
	public JPanel jPaneltelefonoBusquedaPorTelefonoResponsable;
	public JLabel jLabeltelefonoBusquedaPorTelefonoResponsable;
	public JTextField jTextFieldtelefonoBusquedaPorTelefonoResponsable;
	public JButton jButtontelefonoBusquedaPorTelefonoResponsableBusqueda= new JButtonMe();

	
	public JPanel jPaneltelefono_celularBusquedaPorTelefonoCelularResponsable;
	public JLabel jLabeltelefono_celularBusquedaPorTelefonoCelularResponsable;
	public JTextField jTextFieldtelefono_celularBusquedaPorTelefonoCelularResponsable;
	public JButton jButtontelefono_celularBusquedaPorTelefonoCelularResponsableBusqueda= new JButtonMe();

	
	public JPanel jPanelid_clienteFK_IdClienteResponsable;
	public JLabel jLabelid_clienteFK_IdClienteResponsable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteResponsable;
	public JButton jButtonid_clienteFK_IdClienteResponsable= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteResponsableUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteResponsableBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteResponsable;
	
	
	
	
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
	//public int iHeightFormulario=880;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ResponsableJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Responsable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResponsableJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Responsable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResponsableJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Responsable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResponsableJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Responsable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionResponsable)	{
		this.jButtonRecargarInformacionResponsable = jButtonRecargarInformacionResponsable;
	}
	
	public JButton getjButtonProcesarInformacionResponsable() {
		return this.jButtonProcesarInformacionResponsable;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionResponsable)	{
		this.jButtonProcesarInformacionResponsable = jButtonProcesarInformacionResponsable;
	}
	
	
	public JButton getjButtonRecargarInformacionResponsable() {
		return this.jButtonRecargarInformacionResponsable;
	}
	
	
	public List<Responsable> getresponsables() {
		return this.responsables;
	}

	public void setresponsables(List<Responsable> responsables) {
		this.responsables = responsables;
	}
	
	public List<Responsable> getresponsablesAux() {
		return this.responsablesAux;
	}

	public void setresponsablesAux(List<Responsable> responsablesAux) {
		this.responsablesAux = responsablesAux;
	}
	
	public List<Responsable> getresponsablesEliminados() {
		return this.responsablesEliminados;
	}

	public void setResponsablesEliminados(List<Responsable> responsablesEliminados) {
		this.responsablesEliminados = responsablesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarResponsable() {
		return jComboBoxTiposSeleccionarResponsable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarResponsable(
			JComboBox jComboBoxTiposSeleccionarResponsable) {
		this.jComboBoxTiposSeleccionarResponsable = jComboBoxTiposSeleccionarResponsable;
	}
	
	public void setBorderResaltarTiposSeleccionarResponsable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarResponsable.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarResponsable .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralResponsable() {
		return jTextFieldValorCampoGeneralResponsable;
	}

	public void setjTextFieldValorCampoGeneralResponsable(
			JTextField jTextFieldValorCampoGeneralResponsable) {
		this.jTextFieldValorCampoGeneralResponsable = jTextFieldValorCampoGeneralResponsable;
	}

	public void setBorderResaltarValorCampoGeneralResponsable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResponsable.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralResponsable .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosResponsable() {
		return this.jCheckBoxSeleccionarTodosResponsable;
	}

	public void setjCheckBoxSeleccionarTodosResponsable(
			JCheckBox jCheckBoxSeleccionarTodosResponsable) {
		this.jCheckBoxSeleccionarTodosResponsable = jCheckBoxSeleccionarTodosResponsable;
	}

	public void setBorderResaltarSeleccionarTodosResponsable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResponsable.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosResponsable .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosResponsable() {
		return this.jCheckBoxSeleccionadosResponsable;
	}

	public void setjCheckBoxSeleccionadosResponsable(
			JCheckBox jCheckBoxSeleccionadosResponsable) {
		this.jCheckBoxSeleccionadosResponsable = jCheckBoxSeleccionadosResponsable;
	}
	
	public void setBorderResaltarSeleccionadosResponsable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResponsable.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosResponsable .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesResponsable() {
		return this.jComboBoxTiposArchivosReportesResponsable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesResponsable(
			JComboBox jComboBoxTiposArchivosReportesResponsable) {
		this.jComboBoxTiposArchivosReportesResponsable = jComboBoxTiposArchivosReportesResponsable;
	}

	public void setBorderResaltarTiposArchivosReportesResponsable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResponsable.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesResponsable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesResponsable() {
		return this.jComboBoxTiposReportesResponsable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesResponsable(
			JComboBox jComboBoxTiposReportesResponsable) {
		this.jComboBoxTiposReportesResponsable = jComboBoxTiposReportesResponsable;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoResponsable() {
	//	return jComboBoxTiposReportesDinamicoResponsable;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoResponsable(
	//		JComboBox jComboBoxTiposReportesDinamicoResponsable) {
	//	this.jComboBoxTiposReportesDinamicoResponsable = jComboBoxTiposReportesDinamicoResponsable;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoResponsable() {
	//	return jComboBoxTiposArchivosReportesDinamicoResponsable;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoResponsable(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoResponsable) {
	//	this.jComboBoxTiposArchivosReportesDinamicoResponsable = jComboBoxTiposArchivosReportesDinamicoResponsable;
	//}
	
	public void setBorderResaltarTiposReportesResponsable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResponsable.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesResponsable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesResponsable() {
		return this.jComboBoxTiposGraficosReportesResponsable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesResponsable(
			JComboBox jComboBoxTiposGraficosReportesResponsable) {
		this.jComboBoxTiposGraficosReportesResponsable = jComboBoxTiposGraficosReportesResponsable;
	}
	
	public void setBorderResaltarTiposGraficosReportesResponsable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResponsable.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesResponsable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionResponsable() {
		return this.jComboBoxTiposPaginacionResponsable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionResponsable(
			JComboBox jComboBoxTiposPaginacionResponsable) {
		this.jComboBoxTiposPaginacionResponsable = jComboBoxTiposPaginacionResponsable;
	}
	
	public void setBorderResaltarTiposPaginacionResponsable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResponsable.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionResponsable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesResponsable() {
		return this.jComboBoxTiposRelacionesResponsable;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesResponsable() {
		return this.jComboBoxTiposAccionesResponsable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesResponsable(
			JComboBox jComboBoxTiposRelacionesResponsable) {
		this.jComboBoxTiposRelacionesResponsable = jComboBoxTiposRelacionesResponsable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesResponsable(
			JComboBox jComboBoxTiposAccionesResponsable) {
		this.jComboBoxTiposAccionesResponsable = jComboBoxTiposAccionesResponsable;
	}
	
	public void setBorderResaltarTiposRelacionesResponsable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResponsable.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesResponsable .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesResponsable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResponsable.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesResponsable .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoResponsable() {
	//	return jCheckBoxConGraficoDinamicoResponsable;
	//}

	//public void setjCheckBoxConGraficoDinamicoResponsable(
	//		JCheckBox jCheckBoxConGraficoDinamicoResponsable) {
	//	this.jCheckBoxConGraficoDinamicoResponsable = jCheckBoxConGraficoDinamicoResponsable;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoResponsable() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarResponsable.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoResponsable .setBorder(borderResaltar);		
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
		this.responsableSessionBean=new ResponsableSessionBean();
		
		this.responsableSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.responsableSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.responsableSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ResponsableJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ResponsableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ResponsableJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ResponsableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ResponsableJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Responsable MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.responsableSessionBean.getEsGuardarRelacionado()) {
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
		
		ResponsableJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Responsable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarResponsable= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarResponsable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarResponsable,this.jTtoolBarResponsable,
							"nuevo","nuevo","Nuevo"+" "+ResponsableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarResponsable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarResponsable,this.jTtoolBarResponsable,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarResponsable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarResponsable,this.jTtoolBarResponsable,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ResponsableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarResponsable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarResponsable,this.jTtoolBarResponsable,
							"duplicar","duplicar","Duplicar"+" "+ResponsableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarResponsable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarResponsable,this.jTtoolBarResponsable,
							"copiar","copiar","Copiar"+" "+ResponsableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarResponsable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarResponsable,this.jTtoolBarResponsable,
							"ver_form","ver_form","Ver"+" "+ResponsableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarResponsable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarResponsable,this.jTtoolBarResponsable,
							"recargar","recargar","Recargar"+" "+ResponsableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarResponsable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarResponsable,this.jTtoolBarResponsable,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarResponsable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarResponsable,this.jTtoolBarResponsable,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarResponsable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarResponsable,this.jTtoolBarResponsable,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarResponsable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarResponsable,this.jTtoolBarResponsable,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarResponsable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarResponsable,this.jTtoolBarResponsable,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ResponsableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarResponsable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarResponsable,this.jTtoolBarResponsable,
							"cerrar","cerrar","Salir"+" "+ResponsableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarResponsable=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarResponsable;
			
				this.jButtonProcesarInformacionToolBarResponsable=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarResponsable;
				
		//protected JButton jButtonModificarToolBarResponsable;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarResponsable=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuResponsable=new JMenuMe("General");
		this.jmenuArchivoResponsable=new JMenuMe("Archivo");
		this.jmenuAccionesResponsable=new JMenuMe("Acciones");
		this.jmenuDatosResponsable=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoResponsable= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoResponsable.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoResponsable,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarResponsable= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarResponsable.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarResponsable,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesResponsable= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesResponsable.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesResponsable,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosResponsable= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosResponsable.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosResponsable,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarResponsable= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarResponsable.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarResponsable,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormResponsable= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormResponsable.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormResponsable,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaResponsable= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaResponsable.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaResponsable,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarResponsable= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarResponsable.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarResponsable,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionResponsable= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionResponsable.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionResponsable,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionResponsable= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionResponsable.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionResponsable,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresResponsable= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresResponsable.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresResponsable,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesResponsable= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesResponsable.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesResponsable,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByResponsable= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByResponsable.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByResponsable,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarResponsable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarResponsable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarResponsable,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByResponsable= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByResponsable.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByResponsable,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarResponsable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarResponsable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarResponsable,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosResponsable= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosResponsable.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosResponsable,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoResponsable.add(this.jMenuItemCerrarResponsable);
			
			this.jmenuAccionesResponsable.add(this.jMenuItemNuevoResponsable);
			this.jmenuAccionesResponsable.add(this.jMenuItemNuevoGuardarCambiosResponsable);
			this.jmenuAccionesResponsable.add(this.jMenuItemNuevoRelacionesResponsable);
			this.jmenuAccionesResponsable.add(this.jMenuItemGuardarCambiosTablaResponsable);		
			this.jmenuAccionesResponsable.add(this.jMenuItemDuplicarResponsable);		
			this.jmenuAccionesResponsable.add(this.jMenuItemCopiarResponsable);		
			this.jmenuAccionesResponsable.add(this.jMenuItemVerFormResponsable);		
			
			this.jmenuDatosResponsable.add(this.jMenuItemRecargarInformacionResponsable);				
			this.jmenuDatosResponsable.add(this.jMenuItemAnterioresResponsable);				
			this.jmenuDatosResponsable.add(this.jMenuItemSiguientesResponsable);				
			this.jmenuDatosResponsable.add(this.jMenuItemAbrirOrderByResponsable);				
			this.jmenuDatosResponsable.add(this.jMenuItemMostrarOcultarResponsable);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesResponsable.add(this.jMenuItemGuardarCambiosResponsable);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarResponsable.add(this.jmenuArchivoResponsable);		
			this.jmenuBarResponsable.add(this.jmenuAccionesResponsable);		
			this.jmenuBarResponsable.add(this.jmenuDatosResponsable);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarResponsable);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasResponsable() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorIdentificacionResponsable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdentificacionResponsable.setToolTipText("Buscar Por Identificacion ");
		this.jButtonBusquedaPorIdentificacionResponsable= new JButtonMe();
		this.jButtonBusquedaPorIdentificacionResponsable.setText("Buscar");
		this.jButtonBusquedaPorIdentificacionResponsable.setToolTipText("Buscar Por Identificacion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdentificacionResponsable,"buscar_button","Buscar Por Identificacion ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdentificacionResponsable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelidentificacionBusquedaPorIdentificacionResponsable = new JLabelMe();
		jLabelidentificacionBusquedaPorIdentificacionResponsable.setText("Identificacion :");
		jLabelidentificacionBusquedaPorIdentificacionResponsable.setToolTipText("Identificacion");
		jLabelidentificacionBusquedaPorIdentificacionResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidentificacionBusquedaPorIdentificacionResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidentificacionBusquedaPorIdentificacionResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelidentificacionBusquedaPorIdentificacionResponsable,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldidentificacionBusquedaPorIdentificacionResponsable= new JTextFieldMe();
		jTextFieldidentificacionBusquedaPorIdentificacionResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldidentificacionBusquedaPorIdentificacionResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldidentificacionBusquedaPorIdentificacionResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldidentificacionBusquedaPorIdentificacionResponsable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreCompletoResponsable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreCompletoResponsable.setToolTipText("Buscar Por Nombre Completo ");
		this.jButtonBusquedaPorNombreCompletoResponsable= new JButtonMe();
		this.jButtonBusquedaPorNombreCompletoResponsable.setText("Buscar");
		this.jButtonBusquedaPorNombreCompletoResponsable.setToolTipText("Buscar Por Nombre Completo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreCompletoResponsable,"buscar_button","Buscar Por Nombre Completo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreCompletoResponsable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombre_completoBusquedaPorNombreCompletoResponsable = new JLabelMe();
		jLabelnombre_completoBusquedaPorNombreCompletoResponsable.setText("Nombre Completo :");
		jLabelnombre_completoBusquedaPorNombreCompletoResponsable.setToolTipText("Nombre Completo");
		jLabelnombre_completoBusquedaPorNombreCompletoResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelnombre_completoBusquedaPorNombreCompletoResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelnombre_completoBusquedaPorNombreCompletoResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelnombre_completoBusquedaPorNombreCompletoResponsable,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombre_completoBusquedaPorNombreCompletoResponsable= new JTextAreaMe();
		jTextAreanombre_completoBusquedaPorNombreCompletoResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoBusquedaPorNombreCompletoResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoBusquedaPorNombreCompletoResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completoBusquedaPorNombreCompletoResponsable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorRucResponsable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorRucResponsable.setToolTipText("Buscar Por Ruc ");
		this.jButtonBusquedaPorRucResponsable= new JButtonMe();
		this.jButtonBusquedaPorRucResponsable.setText("Buscar");
		this.jButtonBusquedaPorRucResponsable.setToolTipText("Buscar Por Ruc ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorRucResponsable,"buscar_button","Buscar Por Ruc ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorRucResponsable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelrucBusquedaPorRucResponsable = new JLabelMe();
		jLabelrucBusquedaPorRucResponsable.setText("Ruc :");
		jLabelrucBusquedaPorRucResponsable.setToolTipText("Ruc");
		jLabelrucBusquedaPorRucResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelrucBusquedaPorRucResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelrucBusquedaPorRucResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelrucBusquedaPorRucResponsable,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldrucBusquedaPorRucResponsable= new JTextFieldMe();
		jTextFieldrucBusquedaPorRucResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucBusquedaPorRucResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucBusquedaPorRucResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucBusquedaPorRucResponsable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorTelefonoResponsable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorTelefonoResponsable.setToolTipText("Buscar Por Telefono ");
		this.jButtonBusquedaPorTelefonoResponsable= new JButtonMe();
		this.jButtonBusquedaPorTelefonoResponsable.setText("Buscar");
		this.jButtonBusquedaPorTelefonoResponsable.setToolTipText("Buscar Por Telefono ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorTelefonoResponsable,"buscar_button","Buscar Por Telefono ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorTelefonoResponsable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabeltelefonoBusquedaPorTelefonoResponsable = new JLabelMe();
		jLabeltelefonoBusquedaPorTelefonoResponsable.setText("Telefono :");
		jLabeltelefonoBusquedaPorTelefonoResponsable.setToolTipText("Telefono");
		jLabeltelefonoBusquedaPorTelefonoResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabeltelefonoBusquedaPorTelefonoResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabeltelefonoBusquedaPorTelefonoResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabeltelefonoBusquedaPorTelefonoResponsable,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldtelefonoBusquedaPorTelefonoResponsable= new JTextFieldMe();
		jTextFieldtelefonoBusquedaPorTelefonoResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoBusquedaPorTelefonoResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoBusquedaPorTelefonoResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtelefonoBusquedaPorTelefonoResponsable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorTelefonoCelularResponsable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorTelefonoCelularResponsable.setToolTipText("Buscar Por Telefono Celular ");
		this.jButtonBusquedaPorTelefonoCelularResponsable= new JButtonMe();
		this.jButtonBusquedaPorTelefonoCelularResponsable.setText("Buscar");
		this.jButtonBusquedaPorTelefonoCelularResponsable.setToolTipText("Buscar Por Telefono Celular ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorTelefonoCelularResponsable,"buscar_button","Buscar Por Telefono Celular ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorTelefonoCelularResponsable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabeltelefono_celularBusquedaPorTelefonoCelularResponsable = new JLabelMe();
		jLabeltelefono_celularBusquedaPorTelefonoCelularResponsable.setText("Telefono Celular :");
		jLabeltelefono_celularBusquedaPorTelefonoCelularResponsable.setToolTipText("Telefono Celular");
		jLabeltelefono_celularBusquedaPorTelefonoCelularResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabeltelefono_celularBusquedaPorTelefonoCelularResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabeltelefono_celularBusquedaPorTelefonoCelularResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabeltelefono_celularBusquedaPorTelefonoCelularResponsable,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldtelefono_celularBusquedaPorTelefonoCelularResponsable= new JTextFieldMe();
		jTextFieldtelefono_celularBusquedaPorTelefonoCelularResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefono_celularBusquedaPorTelefonoCelularResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefono_celularBusquedaPorTelefonoCelularResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtelefono_celularBusquedaPorTelefonoCelularResponsable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdClienteResponsable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteResponsable.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteResponsable= new JButtonMe();
		this.jButtonFK_IdClienteResponsable.setText("Buscar");
		this.jButtonFK_IdClienteResponsable.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteResponsable,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteResponsable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteResponsable = new JLabelMe();
		jLabelid_clienteFK_IdClienteResponsable.setText("Cliente :");
		jLabelid_clienteFK_IdClienteResponsable.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteResponsable,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteResponsable= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteResponsable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteResponsable= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteResponsable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteResponsable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteResponsable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteResponsable.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteResponsable.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteResponsable.setFocusable(false);


		this.jTabbedPaneBusquedasResponsable=new JTabbedPane();


		this.jTabbedPaneBusquedasResponsable.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasResponsable.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasResponsable.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasResponsable.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasResponsable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasResponsable,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleResponsable = new ResponsableDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Responsable DATOS");
			this.jInternalFrameDetalleFormResponsable = new ResponsableDetalleFormJInternalFrame(jDesktopPane,this.responsableSessionBean.getConGuardarRelaciones(),this.responsableSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormResponsable = null;//new ResponsableDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutResponsable= new GridBagLayout();
		
		
		this.jTableDatosResponsable = new JTableMe();      
		
		String sToolTipResponsable="";
		sToolTipResponsable=ResponsableConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipResponsable+="(Facturacion.Responsable)";
		}
		
		if(!this.responsableSessionBean.getEsGuardarRelacionado()) {
			sToolTipResponsable+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosResponsable.setToolTipText(sToolTipResponsable);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosResponsable);
		this.jTableDatosResponsable.setAutoCreateRowSorter(true);
		this.jTableDatosResponsable.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosResponsable.setRowSelectionAllowed(true);
		this.jTableDatosResponsable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosResponsable,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoResponsable = new JButtonMe();
		this.jButtonDuplicarResponsable = new JButtonMe();
		this.jButtonCopiarResponsable = new JButtonMe();
		this.jButtonVerFormResponsable = new JButtonMe();
		this.jButtonNuevoRelacionesResponsable = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaResponsable = new JButtonMe();
		this.jButtonCerrarResponsable = new JButtonMe();
		
		this.jScrollPanelDatosResponsable = new JScrollPane();   
        this.jScrollPanelDatosGeneralResponsable = new JScrollPane();
		
				
		
		
		this.jPanelAccionesResponsable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Responsable";
		
		if(!this.responsableSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosResponsable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Responsables" + this.sPath));
		} else {
			this.jScrollPanelDatosResponsable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralResponsable.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesResponsable.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesResponsable.setToolTipText("Acciones");
        this.jPanelAccionesResponsable.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralResponsable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosResponsable, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoResponsable=new ReporteDinamicoJInternalFrame(ResponsableConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoResponsable();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionResponsable=new ImportacionJInternalFrame(ResponsableConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionResponsable();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByResponsable = new JButtonMe();
		
		this.jButtonAbrirOrderByResponsable.setText("Orden");
		this.jButtonAbrirOrderByResponsable.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByResponsable,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByResponsable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByResponsable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByResponsable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByResponsable=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByResponsable,false,this);
			
			//this.cargarOrderByResponsable(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByResponsable=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByResponsable,true,this);
			
			//this.cargarOrderByResponsable(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosResponsable.setMinimumSize(new Dimension(400,50));//1430
		this.jTableDatosResponsable.setMaximumSize(new Dimension(400,50));//1430
		this.jTableDatosResponsable.setPreferredSize(new Dimension(400,50));//1430
		
		this.jScrollPanelDatosResponsable.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosResponsable.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosResponsable.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoResponsable.setText("Nuevo");
		this.jButtonDuplicarResponsable.setText("Duplicar");
		this.jButtonCopiarResponsable.setText("Copiar");
		this.jButtonVerFormResponsable.setText("Ver");
		this.jButtonNuevoRelacionesResponsable.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaResponsable.setText("Guardar");
		this.jButtonCerrarResponsable.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoResponsable,"nuevo_button","Nuevo",this.responsableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarResponsable,"duplicar_button","Duplicar",this.responsableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarResponsable,"copiar_button","Copiar",this.responsableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormResponsable,"ver_form","Ver",this.responsableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesResponsable,"nuevorelaciones_button","Nuevo Rel",this.responsableSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaResponsable,"guardarcambiostabla_button","Guardar",this.responsableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarResponsable,"cerrar_button","Salir",this.responsableSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesResponsable, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoResponsable.setToolTipText("Nuevo"+" "+ResponsableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarResponsable.setToolTipText("Duplicar"+" "+ResponsableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarResponsable.setToolTipText("Copiar"+" "+ResponsableConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormResponsable.setToolTipText("Ver"+" "+ResponsableConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesResponsable.setToolTipText("Nuevo Rel"+" "+ResponsableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaResponsable.setToolTipText("Guardar"+" "+ResponsableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarResponsable.setToolTipText("Salir"+" "+ResponsableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoResponsable";
		inputMap = this.jButtonNuevoResponsable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoResponsable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoResponsable"));
		
		//DUPLICAR
		sMapKey = "DuplicarResponsable";
		inputMap = this.jButtonDuplicarResponsable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarResponsable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarResponsable"));
		
		//COPIAR
		sMapKey = "CopiarResponsable";
		inputMap = this.jButtonCopiarResponsable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarResponsable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarResponsable"));
		
		//VEr FORM
		sMapKey = "VerFormResponsable";
		inputMap = this.jButtonVerFormResponsable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormResponsable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormResponsable"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesResponsable";
		inputMap = this.jButtonNuevoRelacionesResponsable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesResponsable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesResponsable"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarResponsable";
		inputMap = this.jButtonModificarResponsable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarResponsable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarResponsable"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarResponsable";
		inputMap = this.jButtonCerrarResponsable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarResponsable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarResponsable"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaResponsable";
		inputMap = this.jButtonGuardarCambiosTablaResponsable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaResponsable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaResponsable"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesResponsable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesResponsable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionResponsable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Responsable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Responsable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Responsable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Responsable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Responsable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesResponsable.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesResponsable.setName("jPanelParametrosReportesResponsable"); 
		
		this.jPanelParametrosReportesAccionesResponsable.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesResponsable.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesResponsable.setName("jPanelParametrosReportesAccionesResponsable"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesResponsable, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesResponsable, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionResponsable = new JButtonMe();
		this.jButtonRecargarInformacionResponsable.setText("Recargar");
		this.jButtonRecargarInformacionResponsable.setToolTipText("Recargar"+" "+ResponsableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionResponsable,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionResponsable = new JButtonMe();
		this.jButtonProcesarInformacionResponsable.setText("Procesar");
		this.jButtonProcesarInformacionResponsable.setToolTipText("Procesar"+" "+ResponsableConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionResponsable.setVisible(false);
			
		this.jButtonProcesarInformacionResponsable.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionResponsable.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionResponsable.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesResponsable = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesResponsable.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesResponsable.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesResponsable = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesResponsable.setText("TIPO");       
		this.jComboBoxTiposReportesResponsable.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesResponsable = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesResponsable.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesResponsable.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionResponsable = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionResponsable.setText("Paginacion");
		this.jComboBoxTiposPaginacionResponsable.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesResponsable = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesResponsable.setText("Accion");
		this.jComboBoxTiposRelacionesResponsable.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesResponsable = new JComboBoxMe();
		//this.jComboBoxTiposAccionesResponsable.setText("Accion");
		this.jComboBoxTiposAccionesResponsable.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarResponsable = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarResponsable.setText("Accion");
		this.jComboBoxTiposSeleccionarResponsable.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralResponsable=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralResponsable.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralResponsable.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralResponsable.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesResponsable = new JLabelMe();
		
		this.jLabelAccionesResponsable.setText("Acciones");		
		this.jLabelAccionesResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosResponsable = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosResponsable.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosResponsable.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosResponsable = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosResponsable.setText("Seleccionados");
		this.jCheckBoxSeleccionadosResponsable.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaResponsable = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaResponsable.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaResponsable.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteResponsable = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteResponsable.setText("Graf.");
		this.jCheckBoxConGraficoReporteResponsable.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresResponsable = new JButtonMe();
		//this.jButtonAnterioresResponsable.setText("<<");
        this.jButtonAnterioresResponsable.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresResponsable,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesResponsable = new JButtonMe();
		//this.jButtonSiguientesResponsable.setText(">>");
        this.jButtonSiguientesResponsable.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesResponsable,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosResponsable = new JButtonMe();
		this.jButtonNuevoGuardarCambiosResponsable.setText("Nue");
        this.jButtonNuevoGuardarCambiosResponsable.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosResponsable,"nuevoguardarcambios_button","Nue",this.responsableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosResponsable";
		inputMap = this.jButtonNuevoGuardarCambiosResponsable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosResponsable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosResponsable"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionResponsable";
		inputMap = this.jButtonRecargarInformacionResponsable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionResponsable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionResponsable"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesResponsable";
		inputMap = this.jButtonSiguientesResponsable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesResponsable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesResponsable"));
		
		//ANTERIORES		
		sMapKey = "AnterioresResponsable";
		inputMap = this.jButtonAnterioresResponsable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresResponsable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresResponsable"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasResponsable();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesResponsable.setMinimumSize(new Dimension(this.getWidth(),ResponsableBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ResponsableBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesResponsable.setMaximumSize(new Dimension(this.getWidth(),ResponsableBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ResponsableBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesResponsable.setPreferredSize(new Dimension(this.getWidth(),ResponsableBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ResponsableBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionResponsable = new GridBagLayout();

			this.jPanelPaginacionResponsable.setLayout(gridaBagLayoutPaginacionResponsable);						
			
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			this.gridBagConstraintsResponsable.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsable.gridy = 0;
			this.gridBagConstraintsResponsable.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionResponsable.add(this.jButtonAnterioresResponsable, this.gridBagConstraintsResponsable);
					
						
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			this.gridBagConstraintsResponsable.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsResponsable.gridy = 0;
			
			this.jPanelPaginacionResponsable.add(this.jButtonNuevoGuardarCambiosResponsable, this.gridBagConstraintsResponsable);
						
			
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			this.gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsResponsable.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsResponsable.gridy = 0;
			this.jPanelPaginacionResponsable.add(this.jButtonSiguientesResponsable, this.gridBagConstraintsResponsable);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			this.gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsable.gridy = 1;
			this.gridBagConstraintsResponsable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionResponsable.add(this.jButtonNuevoResponsable, this.gridBagConstraintsResponsable);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsResponsable = new GridBagConstraints();
				this.gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsResponsable.gridy = 1;
				this.gridBagConstraintsResponsable.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionResponsable.add(this.jButtonNuevoRelacionesResponsable, this.gridBagConstraintsResponsable);
			}
			
			
			if(!this.responsableSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsResponsable = new GridBagConstraints();
				this.gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsResponsable.gridy = 1;
				this.gridBagConstraintsResponsable.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionResponsable.add(this.jButtonGuardarCambiosTablaResponsable, this.gridBagConstraintsResponsable);
			}
			
			
			
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			this.gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsable.gridy = 1;
			this.gridBagConstraintsResponsable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionResponsable.add(this.jButtonDuplicarResponsable, this.gridBagConstraintsResponsable);
			
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			this.gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsable.gridy = 1;
			this.gridBagConstraintsResponsable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionResponsable.add(this.jButtonCopiarResponsable, this.gridBagConstraintsResponsable);
		
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			this.gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsable.gridy = 1;
			this.gridBagConstraintsResponsable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionResponsable.add(this.jButtonVerFormResponsable, this.gridBagConstraintsResponsable);
		
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			this.gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsable.gridy = 1;
			this.gridBagConstraintsResponsable.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionResponsable.add(this.jButtonCerrarResponsable, this.gridBagConstraintsResponsable);
		
		
		
		this.jButtonRecargarInformacionResponsable.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionResponsable.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionResponsable.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionResponsable, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesResponsable.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesResponsable.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesResponsable.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesResponsable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesResponsable.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesResponsable.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesResponsable.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesResponsable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesResponsable.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesResponsable.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesResponsable.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesResponsable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionResponsable.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionResponsable.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionResponsable.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionResponsable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesResponsable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesResponsable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesResponsable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesResponsable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesResponsable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesResponsable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesResponsable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesResponsable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarResponsable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarResponsable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarResponsable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarResponsable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaResponsable.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaResponsable.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaResponsable.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaResponsable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteResponsable.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteResponsable.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteResponsable.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteResponsable, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosResponsable.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosResponsable.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosResponsable.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosResponsable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosResponsable.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosResponsable.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosResponsable.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosResponsable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesResponsable = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesResponsable = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Responsable = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Responsable = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Responsable = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Responsable = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesResponsable.setLayout(gridaBagParametrosReportesResponsable);
			this.jPanelParametrosReportesAccionesResponsable.setLayout(gridaBagParametrosReportesAccionesResponsable);
			
			
			this.jPanelParametrosAuxiliar1Responsable.setLayout(gridaBagParametrosAuxiliar1Responsable);
			this.jPanelParametrosAuxiliar2Responsable.setLayout(gridaBagParametrosAuxiliar2Responsable);
			this.jPanelParametrosAuxiliar3Responsable.setLayout(gridaBagParametrosAuxiliar3Responsable);
			this.jPanelParametrosAuxiliar4Responsable.setLayout(gridaBagParametrosAuxiliar4Responsable);
			//this.jPanelParametrosAuxiliar5Responsable.setLayout(gridaBagParametrosAuxiliar2Responsable);			
			
			
			
			
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			this.gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsResponsable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesResponsable.add(this.jButtonRecargarInformacionResponsable, this.gridBagConstraintsResponsable);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			this.gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsable.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsResponsable.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Responsable.add(this.jComboBoxTiposPaginacionResponsable, this.gridBagConstraintsResponsable);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			this.gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsable.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsResponsable.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Responsable.add(this.jCheckBoxConAltoMaximoTablaResponsable, this.gridBagConstraintsResponsable);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			this.gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsable.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsResponsable.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Responsable.add(this.jComboBoxTiposArchivosReportesResponsable, this.gridBagConstraintsResponsable);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			this.gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResponsable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesResponsable.add(this.jPanelParametrosAuxiliar1Responsable, this.gridBagConstraintsResponsable);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			this.gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsResponsable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Responsable.add(this.jComboBoxTiposReportesResponsable, this.gridBagConstraintsResponsable);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			this.gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResponsable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesResponsable.add(this.jPanelParametrosAuxiliar4Responsable, this.gridBagConstraintsResponsable);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			this.gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsable.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsResponsable.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesResponsable.add(this.jComboBoxTiposReportesResponsable, this.gridBagConstraintsResponsable);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			this.gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResponsable.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesResponsable.add(this.jCheckBoxGenerarReporteResponsable, this.gridBagConstraintsResponsable);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			this.gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResponsable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesResponsable.add(this.jPanelParametrosAuxiliar2Responsable, this.gridBagConstraintsResponsable);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			this.gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsResponsable.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesResponsable.add(this.jLabelAccionesResponsable, this.gridBagConstraintsResponsable);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsResponsable = new GridBagConstraints();
				this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsResponsable.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsResponsable.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesResponsable.add(this.jButtonAbrirOrderByResponsable, this.gridBagConstraintsResponsable);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsResponsable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResponsable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesResponsable.add(this.jComboBoxTiposSeleccionarResponsable, this.gridBagConstraintsResponsable);			
			
			
			/*
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			this.gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsResponsable.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesResponsable.add(this.jCheckBoxSeleccionarTodosResponsable, this.gridBagConstraintsResponsable);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			this.gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsResponsable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Responsable.add(this.jCheckBoxSeleccionarTodosResponsable, this.gridBagConstraintsResponsable);															
				
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			this.gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsResponsable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Responsable.add(this.jCheckBoxSeleccionadosResponsable, this.gridBagConstraintsResponsable);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			this.gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResponsable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesResponsable.add(this.jPanelParametrosAuxiliar3Responsable, this.gridBagConstraintsResponsable);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			this.gridBagConstraintsResponsable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResponsable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesResponsable.add(this.jComboBoxTiposRelacionesResponsable, this.gridBagConstraintsResponsable);
				
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			this.gridBagConstraintsResponsable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResponsable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesResponsable.add(this.jComboBoxTiposAccionesResponsable, this.gridBagConstraintsResponsable);
	
				
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			this.gridBagConstraintsResponsable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResponsable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesResponsable.add(this.jTextFieldValorCampoGeneralResponsable, this.gridBagConstraintsResponsable);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosResponsable = new GridBagLayout();

			this.jScrollPanelDatosResponsable.setLayout(gridaBagLayoutDatosResponsable);
			
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			this.gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsable.gridy = 0;
			this.gridBagConstraintsResponsable.gridx = 0;
			
			this.jScrollPanelDatosResponsable.add(this.jTableDatosResponsable, this.gridBagConstraintsResponsable);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosResponsable.setViewportView(this.jTableDatosResponsable);
		this.jTableDatosResponsable.setFillsViewportHeight(true);
		this.jTableDatosResponsable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesResponsable= new GridBagLayout();
		this.jPanelAccionesResponsable.setLayout(gridaBagLayoutAccionesResponsable);
		
		
		/*	
		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsable.gridy = 0;
		this.gridBagConstraintsResponsable.gridx = 0;
			
		this.jPanelAccionesResponsable.add(this.jButtonNuevoResponsable, this.gridBagConstraintsResponsable);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorIdentificacionResponsable= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdentificacionResponsable.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdentificacionResponsable.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdentificacionResponsable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdentificacionResponsable.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdentificacionResponsable.setLayout(gridaBagLayoutBusquedaPorIdentificacionResponsable);

		gridBagConstraintsResponsable = new GridBagConstraints();
		gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResponsable.gridy = 0;
		gridBagConstraintsResponsable.gridx = 0;
		jPanelBusquedaPorIdentificacionResponsable.add(jLabelidentificacionBusquedaPorIdentificacionResponsable, gridBagConstraintsResponsable);

		gridBagConstraintsResponsable = new GridBagConstraints();
		gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResponsable.gridy = 0;
		gridBagConstraintsResponsable.gridx = 1;
		jPanelBusquedaPorIdentificacionResponsable.add(jTextFieldidentificacionBusquedaPorIdentificacionResponsable, gridBagConstraintsResponsable);

		gridBagConstraintsResponsable = new GridBagConstraints();
		gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResponsable.gridy = 1;
		gridBagConstraintsResponsable.gridx =1;
		jPanelBusquedaPorIdentificacionResponsable.add(jButtonBusquedaPorIdentificacionResponsable, gridBagConstraintsResponsable);

		jTabbedPaneBusquedasResponsable.addTab("1.-Por Identificacion ", jPanelBusquedaPorIdentificacionResponsable);
		jTabbedPaneBusquedasResponsable.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreCompletoResponsable= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreCompletoResponsable.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreCompletoResponsable.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreCompletoResponsable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreCompletoResponsable.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreCompletoResponsable.setLayout(gridaBagLayoutBusquedaPorNombreCompletoResponsable);

		gridBagConstraintsResponsable = new GridBagConstraints();
		gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResponsable.gridy = 0;
		gridBagConstraintsResponsable.gridx = 0;
		jPanelBusquedaPorNombreCompletoResponsable.add(jLabelnombre_completoBusquedaPorNombreCompletoResponsable, gridBagConstraintsResponsable);

		gridBagConstraintsResponsable = new GridBagConstraints();
		gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResponsable.gridy = 0;
		gridBagConstraintsResponsable.gridx = 1;
		jPanelBusquedaPorNombreCompletoResponsable.add(jTextAreanombre_completoBusquedaPorNombreCompletoResponsable, gridBagConstraintsResponsable);

		gridBagConstraintsResponsable = new GridBagConstraints();
		gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResponsable.gridy = 1;
		gridBagConstraintsResponsable.gridx =1;
		jPanelBusquedaPorNombreCompletoResponsable.add(jButtonBusquedaPorNombreCompletoResponsable, gridBagConstraintsResponsable);

		jTabbedPaneBusquedasResponsable.addTab("2.-Por Nombre Completo ", jPanelBusquedaPorNombreCompletoResponsable);
		jTabbedPaneBusquedasResponsable.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutBusquedaPorRucResponsable= new GridBagLayout();
		gridaBagLayoutBusquedaPorRucResponsable.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorRucResponsable.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorRucResponsable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorRucResponsable.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorRucResponsable.setLayout(gridaBagLayoutBusquedaPorRucResponsable);

		gridBagConstraintsResponsable = new GridBagConstraints();
		gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResponsable.gridy = 0;
		gridBagConstraintsResponsable.gridx = 0;
		jPanelBusquedaPorRucResponsable.add(jLabelrucBusquedaPorRucResponsable, gridBagConstraintsResponsable);

		gridBagConstraintsResponsable = new GridBagConstraints();
		gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResponsable.gridy = 0;
		gridBagConstraintsResponsable.gridx = 1;
		jPanelBusquedaPorRucResponsable.add(jTextFieldrucBusquedaPorRucResponsable, gridBagConstraintsResponsable);

		gridBagConstraintsResponsable = new GridBagConstraints();
		gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResponsable.gridy = 1;
		gridBagConstraintsResponsable.gridx =1;
		jPanelBusquedaPorRucResponsable.add(jButtonBusquedaPorRucResponsable, gridBagConstraintsResponsable);

		jTabbedPaneBusquedasResponsable.addTab("3.-Por Ruc ", jPanelBusquedaPorRucResponsable);
		jTabbedPaneBusquedasResponsable.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutBusquedaPorTelefonoResponsable= new GridBagLayout();
		gridaBagLayoutBusquedaPorTelefonoResponsable.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorTelefonoResponsable.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorTelefonoResponsable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorTelefonoResponsable.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorTelefonoResponsable.setLayout(gridaBagLayoutBusquedaPorTelefonoResponsable);

		gridBagConstraintsResponsable = new GridBagConstraints();
		gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResponsable.gridy = 0;
		gridBagConstraintsResponsable.gridx = 0;
		jPanelBusquedaPorTelefonoResponsable.add(jLabeltelefonoBusquedaPorTelefonoResponsable, gridBagConstraintsResponsable);

		gridBagConstraintsResponsable = new GridBagConstraints();
		gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResponsable.gridy = 0;
		gridBagConstraintsResponsable.gridx = 1;
		jPanelBusquedaPorTelefonoResponsable.add(jTextFieldtelefonoBusquedaPorTelefonoResponsable, gridBagConstraintsResponsable);

		gridBagConstraintsResponsable = new GridBagConstraints();
		gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResponsable.gridy = 1;
		gridBagConstraintsResponsable.gridx =1;
		jPanelBusquedaPorTelefonoResponsable.add(jButtonBusquedaPorTelefonoResponsable, gridBagConstraintsResponsable);

		jTabbedPaneBusquedasResponsable.addTab("4.-Por Telefono ", jPanelBusquedaPorTelefonoResponsable);
		jTabbedPaneBusquedasResponsable.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutBusquedaPorTelefonoCelularResponsable= new GridBagLayout();
		gridaBagLayoutBusquedaPorTelefonoCelularResponsable.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorTelefonoCelularResponsable.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorTelefonoCelularResponsable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorTelefonoCelularResponsable.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorTelefonoCelularResponsable.setLayout(gridaBagLayoutBusquedaPorTelefonoCelularResponsable);

		gridBagConstraintsResponsable = new GridBagConstraints();
		gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResponsable.gridy = 0;
		gridBagConstraintsResponsable.gridx = 0;
		jPanelBusquedaPorTelefonoCelularResponsable.add(jLabeltelefono_celularBusquedaPorTelefonoCelularResponsable, gridBagConstraintsResponsable);

		gridBagConstraintsResponsable = new GridBagConstraints();
		gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResponsable.gridy = 0;
		gridBagConstraintsResponsable.gridx = 1;
		jPanelBusquedaPorTelefonoCelularResponsable.add(jTextFieldtelefono_celularBusquedaPorTelefonoCelularResponsable, gridBagConstraintsResponsable);

		gridBagConstraintsResponsable = new GridBagConstraints();
		gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResponsable.gridy = 1;
		gridBagConstraintsResponsable.gridx =1;
		jPanelBusquedaPorTelefonoCelularResponsable.add(jButtonBusquedaPorTelefonoCelularResponsable, gridBagConstraintsResponsable);

		jTabbedPaneBusquedasResponsable.addTab("5.-Por Telefono Celular ", jPanelBusquedaPorTelefonoCelularResponsable);
		jTabbedPaneBusquedasResponsable.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdClienteResponsable= new GridBagLayout();
		gridaBagLayoutFK_IdClienteResponsable.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteResponsable.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteResponsable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteResponsable.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteResponsable.setLayout(gridaBagLayoutFK_IdClienteResponsable);

		gridBagConstraintsResponsable = new GridBagConstraints();
		gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResponsable.gridy = 0;
		gridBagConstraintsResponsable.gridx = 0;
		jPanelFK_IdClienteResponsable.add(jLabelid_clienteFK_IdClienteResponsable, gridBagConstraintsResponsable);

		gridBagConstraintsResponsable = new GridBagConstraints();
		gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResponsable.gridy = 0;
		gridBagConstraintsResponsable.gridx = 1;
		jPanelFK_IdClienteResponsable.add(jComboBoxid_clienteFK_IdClienteResponsable, gridBagConstraintsResponsable);


		gridBagConstraintsResponsable = new GridBagConstraints();
		gridBagConstraintsResponsable.anchor = GridBagConstraints.EAST;
		gridBagConstraintsResponsable.fill = GridBagConstraints.NONE;
		gridBagConstraintsResponsable.gridy = 0;
		gridBagConstraintsResponsable.gridx = 0;
		jPanelFK_IdClienteResponsable.add(this.jButtonBuscarFK_IdClienteid_clienteResponsable, gridBagConstraintsResponsable);

		gridBagConstraintsResponsable = new GridBagConstraints();
		gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResponsable.gridy = 1;
		gridBagConstraintsResponsable.gridx =1;
		jPanelFK_IdClienteResponsable.add(jButtonFK_IdClienteResponsable, gridBagConstraintsResponsable);

		jTabbedPaneBusquedasResponsable.addTab("6.-Por Cliente ", jPanelFK_IdClienteResponsable);
		jTabbedPaneBusquedasResponsable.setMnemonicAt(5, KeyEvent.VK_6);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutResponsable = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutResponsable);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.responsableSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsResponsable = new GridBagConstraints();						
			this.gridBagConstraintsResponsable.gridy = iGridyPrincipal++;
			this.gridBagConstraintsResponsable.gridx = 0;		
			//this.gridBagConstraintsResponsable.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsable.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsResponsable.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarResponsable, this.gridBagConstraintsResponsable);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.gridy = iGridyPrincipal++;
		this.gridBagConstraintsResponsable.gridx = 0;		
		//this.gridBagConstraintsResponsable.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsable.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsResponsable.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsResponsable);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsResponsable = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsResponsable.gridy = iGridyPrincipal++;
			this.gridBagConstraintsResponsable.gridx = 0;		
			this.gridBagConstraintsResponsable.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsable.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsResponsable.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasResponsable, this.gridBagConstraintsResponsable);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResponsable.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesResponsable, this.gridBagConstraintsResponsable);								
		
		
		/*
		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResponsable.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesResponsable, this.gridBagConstraintsResponsable);
		*/		
		
		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.gridy =iGridyPrincipal++;
		this.gridBagConstraintsResponsable.gridx =0;
		this.gridBagConstraintsResponsable.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsResponsable.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosResponsable, this.gridBagConstraintsResponsable);
				
		
		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResponsable.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionResponsable, this.gridBagConstraintsResponsable);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(ResponsableJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosResponsable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosResponsable = new GridBagLayout();
			this.jPanelBusquedasParametrosResponsable.setLayout(gridaBagLayoutBusquedasParametrosResponsable);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralResponsable=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralResponsable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralResponsable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralResponsable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResponsable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposResponsable, this.gridBagConstraintsResponsable);
			
			
		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResponsable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosResponsable, this.gridBagConstraintsResponsable);
		
			
		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsResponsable.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesResponsable, this.gridBagConstraintsResponsable);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralResponsable;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoResponsable() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoResponsable = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoResponsable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoResponsable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoResponsable.setName("jPanelReporteDinamicoResponsable"); 
		
		this.jPanelReporteDinamicoResponsable.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoResponsable.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoResponsable.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoResponsable.setLayout(gridaBagLayoutReporteDinamicoResponsable);
		
		
		this.jInternalFrameReporteDinamicoResponsable= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoResponsable = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteResponsable= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoResponsable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoResponsable.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoResponsable.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoResponsable.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoResponsable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoResponsable.setResizable(true);
	    this.jInternalFrameReporteDinamicoResponsable.setClosable(true);
	    this.jInternalFrameReporteDinamicoResponsable.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoResponsable.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoResponsable.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoResponsable.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoResponsable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Responsables"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteResponsable = new JLabelMe();

		this.jLabelColumnasSelectReporteResponsable.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResponsable.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoResponsable.add(this.jLabelColumnasSelectReporteResponsable, this.gridBagConstraintsResponsable);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteResponsable = new JList<Reporte>();
		this.jListColumnasSelectReporteResponsable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteResponsable.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteResponsable.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteResponsable.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteResponsable.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteResponsable=new JScrollPane(this.jListColumnasSelectReporteResponsable);
			
			this.jScrollColumnasSelectReporteResponsable.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteResponsable.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteResponsable.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteResponsable.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResponsable.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoResponsable.add(this.jListColumnasSelectReporteResponsable, this.gridBagConstraintsResponsable);
		this.jPanelReporteDinamicoResponsable.add(this.jScrollColumnasSelectReporteResponsable, this.gridBagConstraintsResponsable);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteResponsable = new JLabelMe();

		this.jLabelRelacionesSelectReporteResponsable.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResponsable.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoResponsable.add(this.jLabelRelacionesSelectReporteResponsable, this.gridBagConstraintsResponsable);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteResponsable = new JList<Reporte>();
		this.jListRelacionesSelectReporteResponsable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteResponsable.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteResponsable.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteResponsable.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteResponsable.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteResponsable=new JScrollPane(this.jListRelacionesSelectReporteResponsable);
			
			this.jScrollRelacionesSelectReporteResponsable.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteResponsable.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteResponsable.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteResponsable.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResponsable.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoResponsable.add(this.jListRelacionesSelectReporteResponsable, this.gridBagConstraintsResponsable);
		this.jPanelReporteDinamicoResponsable.add(this.jScrollRelacionesSelectReporteResponsable, this.gridBagConstraintsResponsable);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoResponsable = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoResponsable = new JComboBoxMe();
		this.jListColumnasValoresGraficoResponsable = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoResponsable = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoResponsable.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoResponsable.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoResponsable.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoResponsable.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoResponsable, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoResponsable = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoResponsable.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoResponsable.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoResponsable.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoResponsable.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoResponsable, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoResponsable = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoResponsable.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResponsable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoResponsable.add(this.jLabelGenerarExcelReporteDinamicoResponsable, this.gridBagConstraintsResponsable);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoResponsable = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoResponsable.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoResponsable,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoResponsable.setToolTipText("Generar EXCEL"+" "+ResponsableConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsResponsable = new GridBagConstraints();
		//this.gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsResponsable.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsResponsable.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoResponsable.add(this.jButtonGenerarExcelReporteDinamicoResponsable, this.gridBagConstraintsResponsable);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsResponsable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoResponsable.add(this.jComboBoxTiposReportesDinamicoResponsable, this.gridBagConstraintsResponsable);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoResponsable = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoResponsable.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResponsable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoResponsable.add(this.jLabelTiposArchivoReporteDinamicoResponsable, this.gridBagConstraintsResponsable);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsResponsable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoResponsable.add(this.jComboBoxTiposArchivosReportesDinamicoResponsable, this.gridBagConstraintsResponsable);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoResponsable = new JButtonMe();
		this.jButtonGenerarReporteDinamicoResponsable.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoResponsable,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoResponsable.setToolTipText("Generar"+" "+ResponsableConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsResponsable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoResponsable.add(this.jButtonGenerarReporteDinamicoResponsable, this.gridBagConstraintsResponsable);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoResponsable = new JButtonMe();
		this.jButtonCerrarReporteDinamicoResponsable.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoResponsable,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoResponsable.setToolTipText("Cancelar"+" "+ResponsableConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsResponsable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoResponsable.add(this.jButtonCerrarReporteDinamicoResponsable, this.gridBagConstraintsResponsable);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalResponsable = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoResponsable= new JScrollPane(jPanelReporteDinamicoResponsable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoResponsable.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoResponsable.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoResponsable.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoResponsable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Responsables"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsResponsable.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsResponsable.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoResponsable.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoResponsable.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalResponsable);
		this.jInternalFrameReporteDinamicoResponsable.getContentPane().add(this.jScrollPanelReporteDinamicoResponsable, this.gridBagConstraintsResponsable);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionResponsable() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionResponsable = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionResponsable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionResponsable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionResponsable.setName("jPanelImportacionResponsable"); 
		
		this.jPanelImportacionResponsable.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionResponsable.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionResponsable.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionResponsable.setLayout(gridaBagLayoutImportacionResponsable);
		
		
		this.jInternalFrameImportacionResponsable= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionResponsable= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionResponsable = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteResponsable= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionResponsable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionResponsable.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionResponsable.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionResponsable.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionResponsable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionResponsable.setResizable(true);
	    this.jInternalFrameImportacionResponsable.setClosable(true);
	    this.jInternalFrameImportacionResponsable.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionResponsable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionResponsable.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionResponsable.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionResponsable.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionResponsable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionResponsable.setResizable(true);
	    this.jInternalFrameImportacionResponsable.setClosable(true);
	    this.jInternalFrameImportacionResponsable.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionResponsable.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionResponsable.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionResponsable.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionResponsable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Responsables"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionResponsable = new JLabelMe();

		this.jLabelArchivoImportacionResponsable.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsable.gridy = iPosYImportacion;		
		this.gridBagConstraintsResponsable.gridx = iPosXImportacion++;
			
		this.jPanelImportacionResponsable.add(this.jLabelArchivoImportacionResponsable, this.gridBagConstraintsResponsable);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionResponsable = new JFileChooser();		
		this.jFileChooserImportacionResponsable.setToolTipText("ESCOGER ARCHIVO"+" "+ResponsableConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionResponsable = new JButtonMe();
		this.jButtonAbrirImportacionResponsable.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionResponsable,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionResponsable.setToolTipText("Generar"+" "+ResponsableConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsable.gridy = iPosYImportacion;
		this.gridBagConstraintsResponsable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionResponsable.add(this.jButtonAbrirImportacionResponsable, this.gridBagConstraintsResponsable);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionResponsable = new JLabelMe();

		this.jLabelPathArchivoImportacionResponsable.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsable.gridy = iPosYImportacion;		
		this.gridBagConstraintsResponsable.gridx = iPosXImportacion++;
			
		this.jPanelImportacionResponsable.add(this.jLabelPathArchivoImportacionResponsable, this.gridBagConstraintsResponsable);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionResponsable=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionResponsable.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionResponsable.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionResponsable.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsable.gridy = iPosYImportacion;
		this.gridBagConstraintsResponsable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionResponsable.add(this.jTextFieldPathArchivoImportacionResponsable, this.gridBagConstraintsResponsable);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionResponsable = new JButtonMe();
		this.jButtonGenerarImportacionResponsable.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionResponsable,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionResponsable.setToolTipText("Generar"+" "+ResponsableConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsable.gridy = iPosYImportacion;
		this.gridBagConstraintsResponsable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionResponsable.add(this.jButtonGenerarImportacionResponsable, this.gridBagConstraintsResponsable);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionResponsable = new JButtonMe();
		this.jButtonCerrarImportacionResponsable.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionResponsable,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionResponsable.setToolTipText("Cancelar"+" "+ResponsableConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsable.gridy = iPosYImportacion;
		this.gridBagConstraintsResponsable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionResponsable.add(this.jButtonCerrarImportacionResponsable, this.gridBagConstraintsResponsable);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalResponsable = new GridBagLayout();
		
		this.jScrollPanelImportacionResponsable= new JScrollPane(jPanelImportacionResponsable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.gridy =iPosYImportacion;
		this.gridBagConstraintsResponsable.gridx =iPosXImportacion;
		this.gridBagConstraintsResponsable.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionResponsable.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionResponsable.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalResponsable);
		this.jInternalFrameImportacionResponsable.getContentPane().add(this.jScrollPanelImportacionResponsable, this.gridBagConstraintsResponsable);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByResponsable(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByResponsable = new JButtonMe();
			this.jButtonAbrirOrderByResponsable.setText("Orden");
			this.jButtonAbrirOrderByResponsable.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByResponsable,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByResponsable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByResponsable";
			inputMap = this.jButtonAbrirOrderByResponsable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByResponsable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByResponsable"));
		
		
			GridBagLayout gridaBagLayoutOrderByResponsable = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByResponsable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByResponsable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByResponsable.setName("jPanelOrderByResponsable"); 
			
			this.jPanelOrderByResponsable.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByResponsable.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByResponsable.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByResponsable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByResponsable.setLayout(gridaBagLayoutOrderByResponsable);
			
			
			this.jTableDatosResponsableOrderBy = new JTableMe();        
			this.jTableDatosResponsableOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosResponsableOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosResponsableOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosResponsableOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosResponsableOrderBy.setViewportView(this.jTableDatosResponsableOrderBy);
			this.jTableDatosResponsableOrderBy.setFillsViewportHeight(true);
			this.jTableDatosResponsableOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByResponsable= new OrderByJInternalFrame();
			this.jInternalFrameOrderByResponsable= new OrderByJInternalFrame();
			this.jScrollPanelOrderByResponsable = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteResponsable= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByResponsable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByResponsable.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByResponsable.setTitle("Orden");
			this.jInternalFrameOrderByResponsable.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByResponsable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByResponsable.setResizable(true);
			this.jInternalFrameOrderByResponsable.setClosable(true);
			this.jInternalFrameOrderByResponsable.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByResponsable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByResponsable.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByResponsable.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByResponsable.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByResponsable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByResponsable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Responsables"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			this.gridBagConstraintsResponsable.gridy =iPosYOrderBy++;
			this.gridBagConstraintsResponsable.gridx =iPosXOrderBy;
			this.gridBagConstraintsResponsable.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsResponsable.ipady =150;
				
			this.jPanelOrderByResponsable.add(jScrollPanelDatosResponsableOrderBy, this.gridBagConstraintsResponsable);//this.jTableDatosResponsableTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByResponsable = new JButtonMe();
			this.jButtonCerrarOrderByResponsable.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByResponsable,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByResponsable.setToolTipText("Cancelar"+" "+ResponsableConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByResponsable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			this.gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsable.gridy = iPosYOrderBy++;
			this.gridBagConstraintsResponsable.gridx = iPosXOrderBy;
									
			this.jPanelOrderByResponsable.add(this.jButtonCerrarOrderByResponsable, this.gridBagConstraintsResponsable);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalResponsable = new GridBagLayout();
			
			this.jScrollPanelOrderByResponsable= new JScrollPane(jPanelOrderByResponsable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			this.gridBagConstraintsResponsable.gridy =iPosYOrderBy;
			this.gridBagConstraintsResponsable.gridx =iPosXOrderBy;
			this.gridBagConstraintsResponsable.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByResponsable.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByResponsable.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalResponsable);
			
			this.jInternalFrameOrderByResponsable.getContentPane().add(this.jScrollPanelOrderByResponsable, this.gridBagConstraintsResponsable);			
		
		} else {
			this.jButtonAbrirOrderByResponsable = new JButtonMe();
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
		int iWidthTableCalculado=0;//3530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=500;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.responsableSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosResponsable.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosResponsable.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosResponsable.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosResponsable.getRowHeight();//ResponsableConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.responsableSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ResponsableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaResponsable.isSelected()) {
					iHeightTable=ResponsableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ResponsableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ResponsableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ResponsableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaResponsable.isSelected()) {
					iHeightTable=ResponsableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ResponsableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ResponsableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosResponsable.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosResponsable.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosResponsable.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosResponsable.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosResponsable.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosResponsable.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByResponsable!=null && this.jInternalFrameOrderByResponsable.getjTableDatosOrderBy()!=null) {
			//if(!this.responsableSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByResponsable.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByResponsable.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByResponsable.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByResponsable.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByResponsable.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByResponsable.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByResponsable.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosResponsable.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosResponsable.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosResponsable.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=responsableLogic.getResponsables().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=responsables.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Responsable> TraerResponsableBeans(List<Responsable> responsables,ArrayList<Classe> classes)throws Exception {
		try {
			for(Responsable responsable:responsables) {
					
				if(!(ResponsableConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ResponsableConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					responsable.setsDetalleGeneralEntityReporte(ResponsableConstantesFunciones.getResponsableDescripcion(responsable));
										
						
					
					

					if(responsable.getFacturas()!=null && Funciones.existeClass(classes,Factura.class)) {
						try{responsable.setfacturasDescripcionReporte(new JRBeanCollectionDataSource(FacturaJInternalFrame.TraerFacturaBeans(responsable.getFacturas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(responsable.getConsignacions()!=null && Funciones.existeClass(classes,Consignacion.class)) {
						try{responsable.setconsignacionsDescripcionReporte(new JRBeanCollectionDataSource(ConsignacionJInternalFrame.TraerConsignacionBeans(responsable.getConsignacions(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(responsable.getPedidos()!=null && Funciones.existeClass(classes,Pedido.class)) {
						try{responsable.setpedidosDescripcionReporte(new JRBeanCollectionDataSource(PedidoJInternalFrame.TraerPedidoBeans(responsable.getPedidos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(responsable.getPedidoExpors()!=null && Funciones.existeClass(classes,PedidoExpor.class)) {
						try{responsable.setpedidoexporsDescripcionReporte(new JRBeanCollectionDataSource(PedidoExporJInternalFrame.TraerPedidoExporBeans(responsable.getPedidoExpors(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(responsable.getNotaCreditoSolis()!=null && Funciones.existeClass(classes,NotaCreditoSoli.class)) {
						try{responsable.setnotacreditosolisDescripcionReporte(new JRBeanCollectionDataSource(NotaCreditoSoliJInternalFrame.TraerNotaCreditoSoliBeans(responsable.getNotaCreditoSolis(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//responsable.setsDetalleGeneralEntityReporte(responsable.getsDetalleGeneralEntityReporte());
										
				}
				
				//responsablebeans.add(responsablebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return responsables;
    }
	//PARA REPORTES FIN
}
