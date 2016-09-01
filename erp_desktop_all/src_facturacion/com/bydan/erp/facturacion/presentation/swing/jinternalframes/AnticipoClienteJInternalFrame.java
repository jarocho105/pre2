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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;

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
import com.bydan.erp.facturacion.util.AnticipoClienteConstantesFunciones;

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
public class AnticipoClienteJInternalFrame extends AnticipoClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarAnticipoCliente;
	
	protected JMenuBar jmenuBarAnticipoCliente;
	
	protected JMenu jmenuAnticipoCliente;
	protected JMenu jmenuDatosAnticipoCliente;
	protected JMenu jmenuArchivoAnticipoCliente;
	protected JMenu jmenuAccionesAnticipoCliente;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosAnticipoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAnticipoCliente;	
	protected GridBagConstraints gridBagConstraintsAnticipoCliente;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public AnticipoClienteDetalleFormJInternalFrame jInternalFrameDetalleFormAnticipoCliente;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoAnticipoCliente;	
	protected ImportacionJInternalFrame jInternalFrameImportacionAnticipoCliente;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EstadoAntiClienteBeanSwingJInternalFrame estadoanticlienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoanticliente="";

	protected TipoGrupoFormaPagoBeanSwingJInternalFrame tipogrupoformapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipogrupoformapago="";
	
	public AnticipoClienteSessionBean anticipoclienteSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EstadoAntiClienteSessionBean estadoanticlienteSessionBean;
	public TipoGrupoFormaPagoSessionBean tipogrupoformapagoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<AnticipoCliente> anticipoclientes;		
	public List<AnticipoCliente> anticipoclientesEliminados;	
	public List<AnticipoCliente> anticipoclientesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByAnticipoCliente;		
	protected JButton jButtonAbrirOrderByAnticipoCliente;
	
	
	//protected JPanel jPanelOrderByAnticipoCliente;
	//public JScrollPane jScrollPanelOrderByAnticipoCliente;	
	//protected JButton jButtonCerrarOrderByAnticipoCliente;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public AnticipoClienteLogic anticipoclienteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosAnticipoCliente;
	public JScrollPane jScrollPanelDatosEdicionAnticipoCliente;
	public JScrollPane jScrollPanelDatosGeneralAnticipoCliente;
    
	
	
	//public JScrollPane jScrollPanelDatosAnticipoClienteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoAnticipoCliente;
	//public JScrollPane jScrollPanelImportacionAnticipoCliente;
	
	
	
	protected JPanel jPanelAccionesAnticipoCliente;
	
    protected JPanel jPanelPaginacionAnticipoCliente;
    protected JPanel jPanelParametrosReportesAnticipoCliente;
	protected JPanel jPanelParametrosReportesAccionesAnticipoCliente;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1AnticipoCliente;
	protected JPanel jPanelParametrosAuxiliar2AnticipoCliente;
	protected JPanel jPanelParametrosAuxiliar3AnticipoCliente;
	protected JPanel jPanelParametrosAuxiliar4AnticipoCliente;
	//protected JPanel jPanelParametrosAuxiliar5AnticipoCliente;
	
	
	
	//protected JPanel jPanelReporteDinamicoAnticipoCliente;
	//protected JPanel jPanelImportacionAnticipoCliente;
	
	
	public JTable jTableDatosAnticipoCliente;
	
	
	
	//public JTable jTableDatosAnticipoClienteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoAnticipoCliente;
	protected JButton jButtonDuplicarAnticipoCliente;
	protected JButton jButtonCopiarAnticipoCliente;
	protected JButton jButtonVerFormAnticipoCliente;
	protected JButton jButtonNuevoRelacionesAnticipoCliente;
	protected JButton jButtonModificarAnticipoCliente;
	
    protected JButton jButtonGuardarCambiosTablaAnticipoCliente;
	protected JButton jButtonCerrarAnticipoCliente;
	
	
	protected JButton jButtonRecargarInformacionAnticipoCliente;
	protected JButton jButtonProcesarInformacionAnticipoCliente;
	
	
	protected JButton jButtonAnterioresAnticipoCliente;
	protected JButton jButtonSiguientesAnticipoCliente;
	protected JButton jButtonNuevoGuardarCambiosAnticipoCliente;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoAnticipoCliente;
	//protected JButton jButtonCerrarReporteDinamicoAnticipoCliente;
	//protected JButton jButtonGenerarExcelReporteDinamicoAnticipoCliente;	
	
	
	
	//protected JButton jButtonAbrirImportacionAnticipoCliente;
	//protected JButton jButtonGenerarImportacionAnticipoCliente;
	//protected JButton jButtonCerrarImportacionAnticipoCliente;
	//protected JFileChooser jFileChooserImportacionAnticipoCliente;
	//protected File fileImportacionAnticipoCliente;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAnticipoCliente;
	protected JButton jButtonDuplicarToolBarAnticipoCliente;
	protected JButton jButtonNuevoRelacionesToolBarAnticipoCliente;
	
	
	public JButton jButtonGuardarCambiosToolBarAnticipoCliente;
	protected JButton jButtonCopiarToolBarAnticipoCliente;
	protected JButton jButtonVerFormToolBarAnticipoCliente;
	public JButton jButtonGuardarCambiosTablaToolBarAnticipoCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarAnticipoCliente;
	protected JButton jButtonCerrarToolBarAnticipoCliente;
	
	protected JButton jButtonRecargarInformacionToolBarAnticipoCliente;
	protected JButton jButtonProcesarInformacionToolBarAnticipoCliente;
	protected JButton jButtonAnterioresToolBarAnticipoCliente;
	protected JButton jButtonSiguientesToolBarAnticipoCliente;
	protected JButton jButtonNuevoGuardarCambiosToolBarAnticipoCliente;
	protected JButton jButtonAbrirOrderByToolBarAnticipoCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAnticipoCliente;
	protected JMenuItem jMenuItemDuplicarAnticipoCliente;
	protected JMenuItem jMenuItemNuevoRelacionesAnticipoCliente;
	
	
	protected JMenuItem jMenuItemGuardarCambiosAnticipoCliente;
	protected JMenuItem jMenuItemCopiarAnticipoCliente;
	protected JMenuItem jMenuItemVerFormAnticipoCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaAnticipoCliente;
	protected JMenuItem jMenuItemCerrarAnticipoCliente;
	protected JMenuItem jMenuItemDetalleCerrarAnticipoCliente;
	protected JMenuItem jMenuItemDetalleAbrirOrderByAnticipoCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarAnticipoCliente;
	
	protected JMenuItem jMenuItemRecargarInformacionAnticipoCliente;
	protected JMenuItem jMenuItemProcesarInformacionAnticipoCliente;
	protected JMenuItem jMenuItemAnterioresAnticipoCliente;
	protected JMenuItem jMenuItemSiguientesAnticipoCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAnticipoCliente;
	protected JMenuItem jMenuItemAbrirOrderByAnticipoCliente;
	protected JMenuItem jMenuItemMostrarOcultarAnticipoCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAnticipoCliente;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosAnticipoCliente;
	protected JCheckBox jCheckBoxSeleccionadosAnticipoCliente;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaAnticipoCliente;
	protected JCheckBox jCheckBoxConGraficoReporteAnticipoCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesAnticipoCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesAnticipoCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoAnticipoCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoAnticipoCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesAnticipoCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionAnticipoCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAnticipoCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAnticipoCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarAnticipoCliente;
	protected JTextField jTextFieldValorCampoGeneralAnticipoCliente;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteAnticipoCliente;
	//public JList<Reporte> jListColumnasSelectReporteAnticipoCliente;
	//public JScrollPane jScrollColumnasSelectReporteAnticipoCliente;
	
	//public JLabel jLabelRelacionesSelectReporteAnticipoCliente;
	//public JList<Reporte> jListRelacionesSelectReporteAnticipoCliente;
	//public JScrollPane jScrollRelacionesSelectReporteAnticipoCliente;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoAnticipoCliente;
	//protected JCheckBox jCheckBoxConGraficoDinamicoAnticipoCliente;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoAnticipoCliente;
	//public JLabel jLabelTiposArchivoReporteDinamicoAnticipoCliente;
	
		
	//public JLabel jLabelArchivoImportacionAnticipoCliente;	
	//public JLabel jLabelPathArchivoImportacionAnticipoCliente;
	//protected JTextField jTextFieldPathArchivoImportacionAnticipoCliente;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoAnticipoCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoAnticipoCliente;
	
	//public JLabel jLabelColumnaCategoriaValorAnticipoCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorAnticipoCliente;
	
	//public JLabel jLabelColumnasValoresGraficoAnticipoCliente;
	//public JList<Reporte> jListColumnasValoresGraficoAnticipoCliente;
	//public JScrollPane jScrollColumnasValoresGraficoAnticipoCliente;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoAnticipoCliente;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoAnticipoCliente;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasAnticipoCliente;
	public JPanel jPanelFK_IdEmpleadoAnticipoCliente;
	public JButton jButtonFK_IdEmpleadoAnticipoCliente;
	public JPanel jPanelFK_IdEstadoAntiClienteAnticipoCliente;
	public JButton jButtonFK_IdEstadoAntiClienteAnticipoCliente;
	public JPanel jPanelFK_IdTipoGrupoFormaPagoAnticipoCliente;
	public JButton jButtonFK_IdTipoGrupoFormaPagoAnticipoCliente;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoAnticipoCliente;
	public JLabel jLabelid_empleadoFK_IdEmpleadoAnticipoCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoAnticipoCliente;
	public JButton jButtonid_empleadoFK_IdEmpleadoAnticipoCliente= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoAnticipoClienteUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoAnticipoClienteBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoAnticipoCliente;
	
	public JPanel jPanelid_estado_anti_clienteFK_IdEstadoAntiClienteAnticipoCliente;
	public JLabel jLabelid_estado_anti_clienteFK_IdEstadoAntiClienteAnticipoCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_anti_clienteFK_IdEstadoAntiClienteAnticipoCliente;
	public JButton jButtonid_estado_anti_clienteFK_IdEstadoAntiClienteAnticipoCliente= new JButtonMe();
	public JButton jButtonid_estado_anti_clienteFK_IdEstadoAntiClienteAnticipoClienteUpdate= new JButtonMe();
	public JButton jButtonid_estado_anti_clienteFK_IdEstadoAntiClienteAnticipoClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoAnticipoCliente;
	public JLabel jLabelid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoAnticipoCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoAnticipoCliente;
	public JButton jButtonid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoAnticipoCliente= new JButtonMe();
	public JButton jButtonid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoAnticipoClienteUpdate= new JButtonMe();
	public JButton jButtonid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoAnticipoClienteBusqueda= new JButtonMe();

	
	
	
	
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
	public AnticipoClienteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("AnticipoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AnticipoClienteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AnticipoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AnticipoClienteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AnticipoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AnticipoClienteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("AnticipoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionAnticipoCliente)	{
		this.jButtonRecargarInformacionAnticipoCliente = jButtonRecargarInformacionAnticipoCliente;
	}
	
	public JButton getjButtonProcesarInformacionAnticipoCliente() {
		return this.jButtonProcesarInformacionAnticipoCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAnticipoCliente)	{
		this.jButtonProcesarInformacionAnticipoCliente = jButtonProcesarInformacionAnticipoCliente;
	}
	
	
	public JButton getjButtonRecargarInformacionAnticipoCliente() {
		return this.jButtonRecargarInformacionAnticipoCliente;
	}
	
	
	public List<AnticipoCliente> getanticipoclientes() {
		return this.anticipoclientes;
	}

	public void setanticipoclientes(List<AnticipoCliente> anticipoclientes) {
		this.anticipoclientes = anticipoclientes;
	}
	
	public List<AnticipoCliente> getanticipoclientesAux() {
		return this.anticipoclientesAux;
	}

	public void setanticipoclientesAux(List<AnticipoCliente> anticipoclientesAux) {
		this.anticipoclientesAux = anticipoclientesAux;
	}
	
	public List<AnticipoCliente> getanticipoclientesEliminados() {
		return this.anticipoclientesEliminados;
	}

	public void setAnticipoClientesEliminados(List<AnticipoCliente> anticipoclientesEliminados) {
		this.anticipoclientesEliminados = anticipoclientesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarAnticipoCliente() {
		return jComboBoxTiposSeleccionarAnticipoCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarAnticipoCliente(
			JComboBox jComboBoxTiposSeleccionarAnticipoCliente) {
		this.jComboBoxTiposSeleccionarAnticipoCliente = jComboBoxTiposSeleccionarAnticipoCliente;
	}
	
	public void setBorderResaltarTiposSeleccionarAnticipoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarAnticipoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarAnticipoCliente .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralAnticipoCliente() {
		return jTextFieldValorCampoGeneralAnticipoCliente;
	}

	public void setjTextFieldValorCampoGeneralAnticipoCliente(
			JTextField jTextFieldValorCampoGeneralAnticipoCliente) {
		this.jTextFieldValorCampoGeneralAnticipoCliente = jTextFieldValorCampoGeneralAnticipoCliente;
	}

	public void setBorderResaltarValorCampoGeneralAnticipoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAnticipoCliente.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralAnticipoCliente .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosAnticipoCliente() {
		return this.jCheckBoxSeleccionarTodosAnticipoCliente;
	}

	public void setjCheckBoxSeleccionarTodosAnticipoCliente(
			JCheckBox jCheckBoxSeleccionarTodosAnticipoCliente) {
		this.jCheckBoxSeleccionarTodosAnticipoCliente = jCheckBoxSeleccionarTodosAnticipoCliente;
	}

	public void setBorderResaltarSeleccionarTodosAnticipoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAnticipoCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosAnticipoCliente .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosAnticipoCliente() {
		return this.jCheckBoxSeleccionadosAnticipoCliente;
	}

	public void setjCheckBoxSeleccionadosAnticipoCliente(
			JCheckBox jCheckBoxSeleccionadosAnticipoCliente) {
		this.jCheckBoxSeleccionadosAnticipoCliente = jCheckBoxSeleccionadosAnticipoCliente;
	}
	
	public void setBorderResaltarSeleccionadosAnticipoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAnticipoCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosAnticipoCliente .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesAnticipoCliente() {
		return this.jComboBoxTiposArchivosReportesAnticipoCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesAnticipoCliente(
			JComboBox jComboBoxTiposArchivosReportesAnticipoCliente) {
		this.jComboBoxTiposArchivosReportesAnticipoCliente = jComboBoxTiposArchivosReportesAnticipoCliente;
	}

	public void setBorderResaltarTiposArchivosReportesAnticipoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAnticipoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesAnticipoCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesAnticipoCliente() {
		return this.jComboBoxTiposReportesAnticipoCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesAnticipoCliente(
			JComboBox jComboBoxTiposReportesAnticipoCliente) {
		this.jComboBoxTiposReportesAnticipoCliente = jComboBoxTiposReportesAnticipoCliente;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoAnticipoCliente() {
	//	return jComboBoxTiposReportesDinamicoAnticipoCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoAnticipoCliente(
	//		JComboBox jComboBoxTiposReportesDinamicoAnticipoCliente) {
	//	this.jComboBoxTiposReportesDinamicoAnticipoCliente = jComboBoxTiposReportesDinamicoAnticipoCliente;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoAnticipoCliente() {
	//	return jComboBoxTiposArchivosReportesDinamicoAnticipoCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoAnticipoCliente(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoAnticipoCliente) {
	//	this.jComboBoxTiposArchivosReportesDinamicoAnticipoCliente = jComboBoxTiposArchivosReportesDinamicoAnticipoCliente;
	//}
	
	public void setBorderResaltarTiposReportesAnticipoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAnticipoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesAnticipoCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesAnticipoCliente() {
		return this.jComboBoxTiposGraficosReportesAnticipoCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesAnticipoCliente(
			JComboBox jComboBoxTiposGraficosReportesAnticipoCliente) {
		this.jComboBoxTiposGraficosReportesAnticipoCliente = jComboBoxTiposGraficosReportesAnticipoCliente;
	}
	
	public void setBorderResaltarTiposGraficosReportesAnticipoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAnticipoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesAnticipoCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionAnticipoCliente() {
		return this.jComboBoxTiposPaginacionAnticipoCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionAnticipoCliente(
			JComboBox jComboBoxTiposPaginacionAnticipoCliente) {
		this.jComboBoxTiposPaginacionAnticipoCliente = jComboBoxTiposPaginacionAnticipoCliente;
	}
	
	public void setBorderResaltarTiposPaginacionAnticipoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAnticipoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionAnticipoCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesAnticipoCliente() {
		return this.jComboBoxTiposRelacionesAnticipoCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAnticipoCliente() {
		return this.jComboBoxTiposAccionesAnticipoCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAnticipoCliente(
			JComboBox jComboBoxTiposRelacionesAnticipoCliente) {
		this.jComboBoxTiposRelacionesAnticipoCliente = jComboBoxTiposRelacionesAnticipoCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAnticipoCliente(
			JComboBox jComboBoxTiposAccionesAnticipoCliente) {
		this.jComboBoxTiposAccionesAnticipoCliente = jComboBoxTiposAccionesAnticipoCliente;
	}
	
	public void setBorderResaltarTiposRelacionesAnticipoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAnticipoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesAnticipoCliente .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesAnticipoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAnticipoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesAnticipoCliente .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoAnticipoCliente() {
	//	return jCheckBoxConGraficoDinamicoAnticipoCliente;
	//}

	//public void setjCheckBoxConGraficoDinamicoAnticipoCliente(
	//		JCheckBox jCheckBoxConGraficoDinamicoAnticipoCliente) {
	//	this.jCheckBoxConGraficoDinamicoAnticipoCliente = jCheckBoxConGraficoDinamicoAnticipoCliente;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoAnticipoCliente() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarAnticipoCliente.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoAnticipoCliente .setBorder(borderResaltar);		
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
		this.anticipoclienteSessionBean=new AnticipoClienteSessionBean();
		
		this.anticipoclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.anticipoclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.anticipoclienteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=AnticipoClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=AnticipoClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AnticipoClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AnticipoClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AnticipoClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Anticipo Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 2250) {
			iWidth=2250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {
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
		
		AnticipoClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("AnticipoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarAnticipoCliente= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarAnticipoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarAnticipoCliente,this.jTtoolBarAnticipoCliente,
							"nuevo","nuevo","Nuevo"+" "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarAnticipoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarAnticipoCliente,this.jTtoolBarAnticipoCliente,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarAnticipoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarAnticipoCliente,this.jTtoolBarAnticipoCliente,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarAnticipoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarAnticipoCliente,this.jTtoolBarAnticipoCliente,
							"duplicar","duplicar","Duplicar"+" "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarAnticipoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarAnticipoCliente,this.jTtoolBarAnticipoCliente,
							"copiar","copiar","Copiar"+" "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarAnticipoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarAnticipoCliente,this.jTtoolBarAnticipoCliente,
							"ver_form","ver_form","Ver"+" "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarAnticipoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAnticipoCliente,this.jTtoolBarAnticipoCliente,
							"recargar","recargar","Recargar"+" "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarAnticipoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAnticipoCliente,this.jTtoolBarAnticipoCliente,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarAnticipoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAnticipoCliente,this.jTtoolBarAnticipoCliente,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarAnticipoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarAnticipoCliente,this.jTtoolBarAnticipoCliente,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarAnticipoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarAnticipoCliente,this.jTtoolBarAnticipoCliente,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarAnticipoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarAnticipoCliente,this.jTtoolBarAnticipoCliente,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarAnticipoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarAnticipoCliente,this.jTtoolBarAnticipoCliente,
							"cerrar","cerrar","Salir"+" "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarAnticipoCliente=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarAnticipoCliente;
			
				this.jButtonProcesarInformacionToolBarAnticipoCliente=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarAnticipoCliente;
				
		//protected JButton jButtonModificarToolBarAnticipoCliente;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarAnticipoCliente=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuAnticipoCliente=new JMenuMe("General");
		this.jmenuArchivoAnticipoCliente=new JMenuMe("Archivo");
		this.jmenuAccionesAnticipoCliente=new JMenuMe("Acciones");
		this.jmenuDatosAnticipoCliente=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAnticipoCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAnticipoCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAnticipoCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarAnticipoCliente= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarAnticipoCliente.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarAnticipoCliente,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesAnticipoCliente= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesAnticipoCliente.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesAnticipoCliente,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosAnticipoCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAnticipoCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAnticipoCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarAnticipoCliente= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarAnticipoCliente.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarAnticipoCliente,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormAnticipoCliente= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormAnticipoCliente.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormAnticipoCliente,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaAnticipoCliente= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaAnticipoCliente.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaAnticipoCliente,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAnticipoCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAnticipoCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAnticipoCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionAnticipoCliente= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionAnticipoCliente.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionAnticipoCliente,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionAnticipoCliente= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionAnticipoCliente.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionAnticipoCliente,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresAnticipoCliente= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresAnticipoCliente.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresAnticipoCliente,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesAnticipoCliente= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesAnticipoCliente.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesAnticipoCliente,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByAnticipoCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByAnticipoCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByAnticipoCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAnticipoCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAnticipoCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAnticipoCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByAnticipoCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByAnticipoCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByAnticipoCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAnticipoCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAnticipoCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAnticipoCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosAnticipoCliente= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosAnticipoCliente.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosAnticipoCliente,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoAnticipoCliente.add(this.jMenuItemCerrarAnticipoCliente);
			
			this.jmenuAccionesAnticipoCliente.add(this.jMenuItemNuevoAnticipoCliente);
			this.jmenuAccionesAnticipoCliente.add(this.jMenuItemNuevoGuardarCambiosAnticipoCliente);
			this.jmenuAccionesAnticipoCliente.add(this.jMenuItemNuevoRelacionesAnticipoCliente);
			this.jmenuAccionesAnticipoCliente.add(this.jMenuItemGuardarCambiosTablaAnticipoCliente);		
			this.jmenuAccionesAnticipoCliente.add(this.jMenuItemDuplicarAnticipoCliente);		
			this.jmenuAccionesAnticipoCliente.add(this.jMenuItemCopiarAnticipoCliente);		
			this.jmenuAccionesAnticipoCliente.add(this.jMenuItemVerFormAnticipoCliente);		
			
			this.jmenuDatosAnticipoCliente.add(this.jMenuItemRecargarInformacionAnticipoCliente);				
			this.jmenuDatosAnticipoCliente.add(this.jMenuItemAnterioresAnticipoCliente);				
			this.jmenuDatosAnticipoCliente.add(this.jMenuItemSiguientesAnticipoCliente);				
			this.jmenuDatosAnticipoCliente.add(this.jMenuItemAbrirOrderByAnticipoCliente);				
			this.jmenuDatosAnticipoCliente.add(this.jMenuItemMostrarOcultarAnticipoCliente);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesAnticipoCliente.add(this.jMenuItemGuardarCambiosAnticipoCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarAnticipoCliente.add(this.jmenuArchivoAnticipoCliente);		
			this.jmenuBarAnticipoCliente.add(this.jmenuAccionesAnticipoCliente);		
			this.jmenuBarAnticipoCliente.add(this.jmenuDatosAnticipoCliente);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarAnticipoCliente);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasAnticipoCliente() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEmpleadoAnticipoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoAnticipoCliente.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoAnticipoCliente= new JButtonMe();
		this.jButtonFK_IdEmpleadoAnticipoCliente.setText("Buscar");
		this.jButtonFK_IdEmpleadoAnticipoCliente.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoAnticipoCliente,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoAnticipoCliente = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoAnticipoCliente.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoAnticipoCliente.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoAnticipoCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoAnticipoCliente= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoAnticipoCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoAnticipoCliente= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoAnticipoCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoAnticipoCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoAnticipoCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoAnticipoCliente.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoAnticipoCliente.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoAnticipoCliente.setFocusable(false);

		this.jPanelFK_IdEstadoAntiClienteAnticipoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoAntiClienteAnticipoCliente.setToolTipText("Buscar Por Estado Anti Cliente ");
		this.jButtonFK_IdEstadoAntiClienteAnticipoCliente= new JButtonMe();
		this.jButtonFK_IdEstadoAntiClienteAnticipoCliente.setText("Buscar");
		this.jButtonFK_IdEstadoAntiClienteAnticipoCliente.setToolTipText("Buscar Por Estado Anti Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoAntiClienteAnticipoCliente,"buscar_button","Buscar Por Estado Anti Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoAntiClienteAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_anti_clienteFK_IdEstadoAntiClienteAnticipoCliente = new JLabelMe();
		jLabelid_estado_anti_clienteFK_IdEstadoAntiClienteAnticipoCliente.setText("Estado Anti Cliente :");
		jLabelid_estado_anti_clienteFK_IdEstadoAntiClienteAnticipoCliente.setToolTipText("Estado Anti Cliente");
		jLabelid_estado_anti_clienteFK_IdEstadoAntiClienteAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estado_anti_clienteFK_IdEstadoAntiClienteAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estado_anti_clienteFK_IdEstadoAntiClienteAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_estado_anti_clienteFK_IdEstadoAntiClienteAnticipoCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_anti_clienteFK_IdEstadoAntiClienteAnticipoCliente= new JComboBoxMe();
		jComboBoxid_estado_anti_clienteFK_IdEstadoAntiClienteAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_anti_clienteFK_IdEstadoAntiClienteAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_anti_clienteFK_IdEstadoAntiClienteAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_anti_clienteFK_IdEstadoAntiClienteAnticipoCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoGrupoFormaPagoAnticipoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoGrupoFormaPagoAnticipoCliente.setToolTipText("Buscar Por Tipo Grupo Forma Pago ");
		this.jButtonFK_IdTipoGrupoFormaPagoAnticipoCliente= new JButtonMe();
		this.jButtonFK_IdTipoGrupoFormaPagoAnticipoCliente.setText("Buscar");
		this.jButtonFK_IdTipoGrupoFormaPagoAnticipoCliente.setToolTipText("Buscar Por Tipo Grupo Forma Pago ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoGrupoFormaPagoAnticipoCliente,"buscar_button","Buscar Por Tipo Grupo Forma Pago ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoGrupoFormaPagoAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoAnticipoCliente = new JLabelMe();
		jLabelid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoAnticipoCliente.setText("Tipo Grupo Forma Pago :");
		jLabelid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoAnticipoCliente.setToolTipText("Tipo Grupo Forma Pago");
		jLabelid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoAnticipoCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoAnticipoCliente= new JComboBoxMe();
		jComboBoxid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoAnticipoCliente,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasAnticipoCliente=new JTabbedPane();


		this.jTabbedPaneBusquedasAnticipoCliente.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasAnticipoCliente.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasAnticipoCliente.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasAnticipoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasAnticipoCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasAnticipoCliente,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleAnticipoCliente = new AnticipoClienteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Anticipo Cliente DATOS");
			this.jInternalFrameDetalleFormAnticipoCliente = new AnticipoClienteDetalleFormJInternalFrame(jDesktopPane,this.anticipoclienteSessionBean.getConGuardarRelaciones(),this.anticipoclienteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormAnticipoCliente = null;//new AnticipoClienteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAnticipoCliente= new GridBagLayout();
		
		
		this.jTableDatosAnticipoCliente = new JTableMe();      
		
		String sToolTipAnticipoCliente="";
		sToolTipAnticipoCliente=AnticipoClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAnticipoCliente+="(Facturacion.AnticipoCliente)";
		}
		
		if(!this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipAnticipoCliente+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosAnticipoCliente.setToolTipText(sToolTipAnticipoCliente);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosAnticipoCliente);
		this.jTableDatosAnticipoCliente.setAutoCreateRowSorter(true);
		this.jTableDatosAnticipoCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosAnticipoCliente.setRowSelectionAllowed(true);
		this.jTableDatosAnticipoCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosAnticipoCliente,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoAnticipoCliente = new JButtonMe();
		this.jButtonDuplicarAnticipoCliente = new JButtonMe();
		this.jButtonCopiarAnticipoCliente = new JButtonMe();
		this.jButtonVerFormAnticipoCliente = new JButtonMe();
		this.jButtonNuevoRelacionesAnticipoCliente = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaAnticipoCliente = new JButtonMe();
		this.jButtonCerrarAnticipoCliente = new JButtonMe();
		
		this.jScrollPanelDatosAnticipoCliente = new JScrollPane();   
        this.jScrollPanelDatosGeneralAnticipoCliente = new JScrollPane();
		
				
		
		
		this.jPanelAccionesAnticipoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Anticipo Cliente";
		
		if(!this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAnticipoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Anticipo Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosAnticipoCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralAnticipoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesAnticipoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAnticipoCliente.setToolTipText("Acciones");
        this.jPanelAccionesAnticipoCliente.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAnticipoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAnticipoCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoAnticipoCliente=new ReporteDinamicoJInternalFrame(AnticipoClienteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoAnticipoCliente();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionAnticipoCliente=new ImportacionJInternalFrame(AnticipoClienteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionAnticipoCliente();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByAnticipoCliente = new JButtonMe();
		
		this.jButtonAbrirOrderByAnticipoCliente.setText("Orden");
		this.jButtonAbrirOrderByAnticipoCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAnticipoCliente,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByAnticipoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByAnticipoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAnticipoCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAnticipoCliente,false,this);
			
			//this.cargarOrderByAnticipoCliente(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAnticipoCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAnticipoCliente,true,this);
			
			//this.cargarOrderByAnticipoCliente(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosAnticipoCliente.setMinimumSize(new Dimension(400,50));//2230
		this.jTableDatosAnticipoCliente.setMaximumSize(new Dimension(400,50));//2230
		this.jTableDatosAnticipoCliente.setPreferredSize(new Dimension(400,50));//2230
		
		this.jScrollPanelDatosAnticipoCliente.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosAnticipoCliente.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosAnticipoCliente.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoAnticipoCliente.setText("Nuevo");
		this.jButtonDuplicarAnticipoCliente.setText("Duplicar");
		this.jButtonCopiarAnticipoCliente.setText("Copiar");
		this.jButtonVerFormAnticipoCliente.setText("Ver");
		this.jButtonNuevoRelacionesAnticipoCliente.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaAnticipoCliente.setText("Guardar");
		this.jButtonCerrarAnticipoCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAnticipoCliente,"nuevo_button","Nuevo",this.anticipoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarAnticipoCliente,"duplicar_button","Duplicar",this.anticipoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarAnticipoCliente,"copiar_button","Copiar",this.anticipoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormAnticipoCliente,"ver_form","Ver",this.anticipoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesAnticipoCliente,"nuevorelaciones_button","Nuevo Rel",this.anticipoclienteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAnticipoCliente,"guardarcambiostabla_button","Guardar",this.anticipoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAnticipoCliente,"cerrar_button","Salir",this.anticipoclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoAnticipoCliente.setToolTipText("Nuevo"+" "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarAnticipoCliente.setToolTipText("Duplicar"+" "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarAnticipoCliente.setToolTipText("Copiar"+" "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormAnticipoCliente.setToolTipText("Ver"+" "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesAnticipoCliente.setToolTipText("Nuevo Rel"+" "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaAnticipoCliente.setToolTipText("Guardar"+" "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAnticipoCliente.setToolTipText("Salir"+" "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAnticipoCliente";
		inputMap = this.jButtonNuevoAnticipoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAnticipoCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAnticipoCliente"));
		
		//DUPLICAR
		sMapKey = "DuplicarAnticipoCliente";
		inputMap = this.jButtonDuplicarAnticipoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarAnticipoCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarAnticipoCliente"));
		
		//COPIAR
		sMapKey = "CopiarAnticipoCliente";
		inputMap = this.jButtonCopiarAnticipoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarAnticipoCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarAnticipoCliente"));
		
		//VEr FORM
		sMapKey = "VerFormAnticipoCliente";
		inputMap = this.jButtonVerFormAnticipoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormAnticipoCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormAnticipoCliente"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesAnticipoCliente";
		inputMap = this.jButtonNuevoRelacionesAnticipoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesAnticipoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesAnticipoCliente"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarAnticipoCliente";
		inputMap = this.jButtonModificarAnticipoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarAnticipoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarAnticipoCliente"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarAnticipoCliente";
		inputMap = this.jButtonCerrarAnticipoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAnticipoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAnticipoCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAnticipoCliente";
		inputMap = this.jButtonGuardarCambiosTablaAnticipoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAnticipoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAnticipoCliente"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesAnticipoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesAnticipoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionAnticipoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1AnticipoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2AnticipoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3AnticipoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4AnticipoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5AnticipoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesAnticipoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesAnticipoCliente.setName("jPanelParametrosReportesAnticipoCliente"); 
		
		this.jPanelParametrosReportesAccionesAnticipoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesAnticipoCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesAnticipoCliente.setName("jPanelParametrosReportesAccionesAnticipoCliente"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAnticipoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesAnticipoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionAnticipoCliente = new JButtonMe();
		this.jButtonRecargarInformacionAnticipoCliente.setText("Recargar");
		this.jButtonRecargarInformacionAnticipoCliente.setToolTipText("Recargar"+" "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionAnticipoCliente,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionAnticipoCliente = new JButtonMe();
		this.jButtonProcesarInformacionAnticipoCliente.setText("Procesar");
		this.jButtonProcesarInformacionAnticipoCliente.setToolTipText("Procesar"+" "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionAnticipoCliente.setVisible(false);
			
		this.jButtonProcesarInformacionAnticipoCliente.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAnticipoCliente.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAnticipoCliente.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesAnticipoCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAnticipoCliente.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesAnticipoCliente.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesAnticipoCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAnticipoCliente.setText("TIPO");       
		this.jComboBoxTiposReportesAnticipoCliente.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesAnticipoCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAnticipoCliente.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesAnticipoCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionAnticipoCliente = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionAnticipoCliente.setText("Paginacion");
		this.jComboBoxTiposPaginacionAnticipoCliente.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesAnticipoCliente = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesAnticipoCliente.setText("Accion");
		this.jComboBoxTiposRelacionesAnticipoCliente.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesAnticipoCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAnticipoCliente.setText("Accion");
		this.jComboBoxTiposAccionesAnticipoCliente.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarAnticipoCliente = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarAnticipoCliente.setText("Accion");
		this.jComboBoxTiposSeleccionarAnticipoCliente.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralAnticipoCliente=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralAnticipoCliente.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAnticipoCliente.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAnticipoCliente.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesAnticipoCliente = new JLabelMe();
		
		this.jLabelAccionesAnticipoCliente.setText("Acciones");		
		this.jLabelAccionesAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosAnticipoCliente = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosAnticipoCliente.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosAnticipoCliente.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosAnticipoCliente = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosAnticipoCliente.setText("Seleccionados");
		this.jCheckBoxSeleccionadosAnticipoCliente.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaAnticipoCliente = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaAnticipoCliente.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaAnticipoCliente.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteAnticipoCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteAnticipoCliente.setText("Graf.");
		this.jCheckBoxConGraficoReporteAnticipoCliente.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresAnticipoCliente = new JButtonMe();
		//this.jButtonAnterioresAnticipoCliente.setText("<<");
        this.jButtonAnterioresAnticipoCliente.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresAnticipoCliente,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesAnticipoCliente = new JButtonMe();
		//this.jButtonSiguientesAnticipoCliente.setText(">>");
        this.jButtonSiguientesAnticipoCliente.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesAnticipoCliente,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosAnticipoCliente = new JButtonMe();
		this.jButtonNuevoGuardarCambiosAnticipoCliente.setText("Nue");
        this.jButtonNuevoGuardarCambiosAnticipoCliente.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosAnticipoCliente,"nuevoguardarcambios_button","Nue",this.anticipoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosAnticipoCliente";
		inputMap = this.jButtonNuevoGuardarCambiosAnticipoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosAnticipoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosAnticipoCliente"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionAnticipoCliente";
		inputMap = this.jButtonRecargarInformacionAnticipoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionAnticipoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionAnticipoCliente"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesAnticipoCliente";
		inputMap = this.jButtonSiguientesAnticipoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesAnticipoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesAnticipoCliente"));
		
		//ANTERIORES		
		sMapKey = "AnterioresAnticipoCliente";
		inputMap = this.jButtonAnterioresAnticipoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresAnticipoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresAnticipoCliente"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasAnticipoCliente();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesAnticipoCliente.setMinimumSize(new Dimension(this.getWidth(),AnticipoClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AnticipoClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAnticipoCliente.setMaximumSize(new Dimension(this.getWidth(),AnticipoClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AnticipoClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAnticipoCliente.setPreferredSize(new Dimension(this.getWidth(),AnticipoClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AnticipoClienteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionAnticipoCliente = new GridBagLayout();

			this.jPanelPaginacionAnticipoCliente.setLayout(gridaBagLayoutPaginacionAnticipoCliente);						
			
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipoCliente.gridy = 0;
			this.gridBagConstraintsAnticipoCliente.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionAnticipoCliente.add(this.jButtonAnterioresAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
					
						
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAnticipoCliente.gridy = 0;
			
			this.jPanelPaginacionAnticipoCliente.add(this.jButtonNuevoGuardarCambiosAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
						
			
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsAnticipoCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAnticipoCliente.gridy = 0;
			this.jPanelPaginacionAnticipoCliente.add(this.jButtonSiguientesAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipoCliente.gridy = 1;
			this.gridBagConstraintsAnticipoCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAnticipoCliente.add(this.jButtonNuevoAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
						
			
			
			if(!this.anticipoclienteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
				this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsAnticipoCliente.gridy = 1;
				this.gridBagConstraintsAnticipoCliente.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionAnticipoCliente.add(this.jButtonGuardarCambiosTablaAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
			}
			
			
			
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipoCliente.gridy = 1;
			this.gridBagConstraintsAnticipoCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAnticipoCliente.add(this.jButtonDuplicarAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
			
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipoCliente.gridy = 1;
			this.gridBagConstraintsAnticipoCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAnticipoCliente.add(this.jButtonCopiarAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
		
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipoCliente.gridy = 1;
			this.gridBagConstraintsAnticipoCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAnticipoCliente.add(this.jButtonVerFormAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
		
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipoCliente.gridy = 1;
			this.gridBagConstraintsAnticipoCliente.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionAnticipoCliente.add(this.jButtonCerrarAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
		
		
		
		this.jButtonRecargarInformacionAnticipoCliente.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAnticipoCliente.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAnticipoCliente.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesAnticipoCliente.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAnticipoCliente.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAnticipoCliente.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesAnticipoCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAnticipoCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAnticipoCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesAnticipoCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAnticipoCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAnticipoCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionAnticipoCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAnticipoCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAnticipoCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesAnticipoCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAnticipoCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAnticipoCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesAnticipoCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAnticipoCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAnticipoCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarAnticipoCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAnticipoCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAnticipoCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaAnticipoCliente.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAnticipoCliente.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAnticipoCliente.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteAnticipoCliente.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAnticipoCliente.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAnticipoCliente.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosAnticipoCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAnticipoCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAnticipoCliente.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosAnticipoCliente.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAnticipoCliente.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAnticipoCliente.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesAnticipoCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesAnticipoCliente = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1AnticipoCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2AnticipoCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3AnticipoCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4AnticipoCliente = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesAnticipoCliente.setLayout(gridaBagParametrosReportesAnticipoCliente);
			this.jPanelParametrosReportesAccionesAnticipoCliente.setLayout(gridaBagParametrosReportesAccionesAnticipoCliente);
			
			
			this.jPanelParametrosAuxiliar1AnticipoCliente.setLayout(gridaBagParametrosAuxiliar1AnticipoCliente);
			this.jPanelParametrosAuxiliar2AnticipoCliente.setLayout(gridaBagParametrosAuxiliar2AnticipoCliente);
			this.jPanelParametrosAuxiliar3AnticipoCliente.setLayout(gridaBagParametrosAuxiliar3AnticipoCliente);
			this.jPanelParametrosAuxiliar4AnticipoCliente.setLayout(gridaBagParametrosAuxiliar4AnticipoCliente);
			//this.jPanelParametrosAuxiliar5AnticipoCliente.setLayout(gridaBagParametrosAuxiliar2AnticipoCliente);			
			
			
			
			
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipoCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAnticipoCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAnticipoCliente.add(this.jButtonRecargarInformacionAnticipoCliente, this.gridBagConstraintsAnticipoCliente);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnticipoCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAnticipoCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AnticipoCliente.add(this.jComboBoxTiposPaginacionAnticipoCliente, this.gridBagConstraintsAnticipoCliente);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnticipoCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAnticipoCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AnticipoCliente.add(this.jCheckBoxConAltoMaximoTablaAnticipoCliente, this.gridBagConstraintsAnticipoCliente);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnticipoCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAnticipoCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AnticipoCliente.add(this.jComboBoxTiposArchivosReportesAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnticipoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAnticipoCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAnticipoCliente.add(this.jPanelParametrosAuxiliar1AnticipoCliente, this.gridBagConstraintsAnticipoCliente);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipoCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAnticipoCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4AnticipoCliente.add(this.jComboBoxTiposReportesAnticipoCliente, this.gridBagConstraintsAnticipoCliente);																		
			
			
			
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipoCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAnticipoCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4AnticipoCliente.add(this.jComboBoxTiposGraficosReportesAnticipoCliente, this.gridBagConstraintsAnticipoCliente);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnticipoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAnticipoCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAnticipoCliente.add(this.jPanelParametrosAuxiliar4AnticipoCliente, this.gridBagConstraintsAnticipoCliente);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnticipoCliente.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsAnticipoCliente.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAnticipoCliente.add(this.jComboBoxTiposReportesAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnticipoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAnticipoCliente.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAnticipoCliente.add(this.jCheckBoxGenerarReporteAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnticipoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAnticipoCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAnticipoCliente.add(this.jPanelParametrosAuxiliar2AnticipoCliente, this.gridBagConstraintsAnticipoCliente);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipoCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAnticipoCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAnticipoCliente.add(this.jLabelAccionesAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
				this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsAnticipoCliente.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsAnticipoCliente.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesAnticipoCliente.add(this.jButtonAbrirOrderByAnticipoCliente, this.gridBagConstraintsAnticipoCliente);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsAnticipoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAnticipoCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAnticipoCliente.add(this.jComboBoxTiposSeleccionarAnticipoCliente, this.gridBagConstraintsAnticipoCliente);			
			
			
			/*
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipoCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAnticipoCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAnticipoCliente.add(this.jCheckBoxSeleccionarTodosAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
			
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipoCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAnticipoCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAnticipoCliente.add(this.jCheckBoxConGraficoReporteAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipoCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAnticipoCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AnticipoCliente.add(this.jCheckBoxSeleccionarTodosAnticipoCliente, this.gridBagConstraintsAnticipoCliente);															
				
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipoCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAnticipoCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AnticipoCliente.add(this.jCheckBoxSeleccionadosAnticipoCliente, this.gridBagConstraintsAnticipoCliente);															
			
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipoCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAnticipoCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AnticipoCliente.add(this.jCheckBoxConGraficoReporteAnticipoCliente, this.gridBagConstraintsAnticipoCliente);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnticipoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAnticipoCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAnticipoCliente.add(this.jPanelParametrosAuxiliar3AnticipoCliente, this.gridBagConstraintsAnticipoCliente);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAnticipoCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAnticipoCliente.add(this.jComboBoxTiposAccionesAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
	
				
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAnticipoCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAnticipoCliente.add(this.jTextFieldValorCampoGeneralAnticipoCliente, this.gridBagConstraintsAnticipoCliente);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosAnticipoCliente = new GridBagLayout();

			this.jScrollPanelDatosAnticipoCliente.setLayout(gridaBagLayoutDatosAnticipoCliente);
			
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipoCliente.gridy = 0;
			this.gridBagConstraintsAnticipoCliente.gridx = 0;
			
			this.jScrollPanelDatosAnticipoCliente.add(this.jTableDatosAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosAnticipoCliente.setViewportView(this.jTableDatosAnticipoCliente);
		this.jTableDatosAnticipoCliente.setFillsViewportHeight(true);
		this.jTableDatosAnticipoCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesAnticipoCliente= new GridBagLayout();
		this.jPanelAccionesAnticipoCliente.setLayout(gridaBagLayoutAccionesAnticipoCliente);
		
		
		/*	
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnticipoCliente.gridy = 0;
		this.gridBagConstraintsAnticipoCliente.gridx = 0;
			
		this.jPanelAccionesAnticipoCliente.add(this.jButtonNuevoAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEmpleadoAnticipoCliente= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoAnticipoCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoAnticipoCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoAnticipoCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoAnticipoCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoAnticipoCliente.setLayout(gridaBagLayoutFK_IdEmpleadoAnticipoCliente);

		gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAnticipoCliente.gridy = 0;
		gridBagConstraintsAnticipoCliente.gridx = 0;
		jPanelFK_IdEmpleadoAnticipoCliente.add(jLabelid_empleadoFK_IdEmpleadoAnticipoCliente, gridBagConstraintsAnticipoCliente);

		gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAnticipoCliente.gridy = 0;
		gridBagConstraintsAnticipoCliente.gridx = 1;
		jPanelFK_IdEmpleadoAnticipoCliente.add(jComboBoxid_empleadoFK_IdEmpleadoAnticipoCliente, gridBagConstraintsAnticipoCliente);


		gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.EAST;
		gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.NONE;
		gridBagConstraintsAnticipoCliente.gridy = 0;
		gridBagConstraintsAnticipoCliente.gridx = 0;
		jPanelFK_IdEmpleadoAnticipoCliente.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoAnticipoCliente, gridBagConstraintsAnticipoCliente);

		gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAnticipoCliente.gridy = 1;
		gridBagConstraintsAnticipoCliente.gridx =1;
		jPanelFK_IdEmpleadoAnticipoCliente.add(jButtonFK_IdEmpleadoAnticipoCliente, gridBagConstraintsAnticipoCliente);

		jTabbedPaneBusquedasAnticipoCliente.addTab("1.-Por Empleado ", jPanelFK_IdEmpleadoAnticipoCliente);
		jTabbedPaneBusquedasAnticipoCliente.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEstadoAntiClienteAnticipoCliente= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoAntiClienteAnticipoCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoAntiClienteAnticipoCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoAntiClienteAnticipoCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoAntiClienteAnticipoCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoAntiClienteAnticipoCliente.setLayout(gridaBagLayoutFK_IdEstadoAntiClienteAnticipoCliente);

		gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAnticipoCliente.gridy = 0;
		gridBagConstraintsAnticipoCliente.gridx = 0;
		jPanelFK_IdEstadoAntiClienteAnticipoCliente.add(jLabelid_estado_anti_clienteFK_IdEstadoAntiClienteAnticipoCliente, gridBagConstraintsAnticipoCliente);

		gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAnticipoCliente.gridy = 0;
		gridBagConstraintsAnticipoCliente.gridx = 1;
		jPanelFK_IdEstadoAntiClienteAnticipoCliente.add(jComboBoxid_estado_anti_clienteFK_IdEstadoAntiClienteAnticipoCliente, gridBagConstraintsAnticipoCliente);

		gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAnticipoCliente.gridy = 1;
		gridBagConstraintsAnticipoCliente.gridx =1;
		jPanelFK_IdEstadoAntiClienteAnticipoCliente.add(jButtonFK_IdEstadoAntiClienteAnticipoCliente, gridBagConstraintsAnticipoCliente);

		jTabbedPaneBusquedasAnticipoCliente.addTab("2.-Por Estado Anti Cliente ", jPanelFK_IdEstadoAntiClienteAnticipoCliente);
		jTabbedPaneBusquedasAnticipoCliente.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoGrupoFormaPagoAnticipoCliente= new GridBagLayout();
		gridaBagLayoutFK_IdTipoGrupoFormaPagoAnticipoCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoGrupoFormaPagoAnticipoCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoGrupoFormaPagoAnticipoCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoGrupoFormaPagoAnticipoCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoGrupoFormaPagoAnticipoCliente.setLayout(gridaBagLayoutFK_IdTipoGrupoFormaPagoAnticipoCliente);

		gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAnticipoCliente.gridy = 0;
		gridBagConstraintsAnticipoCliente.gridx = 0;
		jPanelFK_IdTipoGrupoFormaPagoAnticipoCliente.add(jLabelid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoAnticipoCliente, gridBagConstraintsAnticipoCliente);

		gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAnticipoCliente.gridy = 0;
		gridBagConstraintsAnticipoCliente.gridx = 1;
		jPanelFK_IdTipoGrupoFormaPagoAnticipoCliente.add(jComboBoxid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoAnticipoCliente, gridBagConstraintsAnticipoCliente);

		gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAnticipoCliente.gridy = 1;
		gridBagConstraintsAnticipoCliente.gridx =1;
		jPanelFK_IdTipoGrupoFormaPagoAnticipoCliente.add(jButtonFK_IdTipoGrupoFormaPagoAnticipoCliente, gridBagConstraintsAnticipoCliente);

		jTabbedPaneBusquedasAnticipoCliente.addTab("3.-Por Tipo Grupo Forma Pago ", jPanelFK_IdTipoGrupoFormaPagoAnticipoCliente);
		jTabbedPaneBusquedasAnticipoCliente.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAnticipoCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAnticipoCliente);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();						
			this.gridBagConstraintsAnticipoCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAnticipoCliente.gridx = 0;		
			//this.gridBagConstraintsAnticipoCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAnticipoCliente.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarAnticipoCliente, this.gridBagConstraintsAnticipoCliente);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.gridy = iGridyPrincipal++;
		this.gridBagConstraintsAnticipoCliente.gridx = 0;		
		//this.gridBagConstraintsAnticipoCliente.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsAnticipoCliente.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsAnticipoCliente);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsAnticipoCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAnticipoCliente.gridx = 0;		
			this.gridBagConstraintsAnticipoCliente.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipoCliente.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsAnticipoCliente.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasAnticipoCliente, this.gridBagConstraintsAnticipoCliente);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAnticipoCliente.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesAnticipoCliente, this.gridBagConstraintsAnticipoCliente);								
		
		
		/*
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAnticipoCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
		*/		
		
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAnticipoCliente.gridx =0;
		this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAnticipoCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
				
		
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAnticipoCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(AnticipoClienteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosAnticipoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAnticipoCliente = new GridBagLayout();
			this.jPanelBusquedasParametrosAnticipoCliente.setLayout(gridaBagLayoutBusquedasParametrosAnticipoCliente);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralAnticipoCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAnticipoCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAnticipoCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAnticipoCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAnticipoCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
			
			
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAnticipoCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
		
			
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAnticipoCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralAnticipoCliente;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoAnticipoCliente() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoAnticipoCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoAnticipoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoAnticipoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoAnticipoCliente.setName("jPanelReporteDinamicoAnticipoCliente"); 
		
		this.jPanelReporteDinamicoAnticipoCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAnticipoCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAnticipoCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoAnticipoCliente.setLayout(gridaBagLayoutReporteDinamicoAnticipoCliente);
		
		
		this.jInternalFrameReporteDinamicoAnticipoCliente= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoAnticipoCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAnticipoCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoAnticipoCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoAnticipoCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoAnticipoCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoAnticipoCliente.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoAnticipoCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoAnticipoCliente.setResizable(true);
	    this.jInternalFrameReporteDinamicoAnticipoCliente.setClosable(true);
	    this.jInternalFrameReporteDinamicoAnticipoCliente.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoAnticipoCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAnticipoCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAnticipoCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoAnticipoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Anticipo Clientes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteAnticipoCliente = new JLabelMe();

		this.jLabelColumnasSelectReporteAnticipoCliente.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnticipoCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAnticipoCliente.add(this.jLabelColumnasSelectReporteAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteAnticipoCliente = new JList<Reporte>();
		this.jListColumnasSelectReporteAnticipoCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteAnticipoCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteAnticipoCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAnticipoCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAnticipoCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteAnticipoCliente=new JScrollPane(this.jListColumnasSelectReporteAnticipoCliente);
			
			this.jScrollColumnasSelectReporteAnticipoCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAnticipoCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAnticipoCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteAnticipoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnticipoCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoAnticipoCliente.add(this.jListColumnasSelectReporteAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
		this.jPanelReporteDinamicoAnticipoCliente.add(this.jScrollColumnasSelectReporteAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteAnticipoCliente = new JLabelMe();

		this.jLabelRelacionesSelectReporteAnticipoCliente.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteAnticipoCliente = new JList<Reporte>();
		this.jListRelacionesSelectReporteAnticipoCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteAnticipoCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteAnticipoCliente.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAnticipoCliente.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAnticipoCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteAnticipoCliente=new JScrollPane(this.jListRelacionesSelectReporteAnticipoCliente);
			
			this.jScrollRelacionesSelectReporteAnticipoCliente.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAnticipoCliente.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAnticipoCliente.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteAnticipoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoAnticipoCliente = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoAnticipoCliente = new JComboBoxMe();
		this.jListColumnasValoresGraficoAnticipoCliente = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoAnticipoCliente = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoAnticipoCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoAnticipoCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAnticipoCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAnticipoCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoAnticipoCliente = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoAnticipoCliente.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoAnticipoCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAnticipoCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAnticipoCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoAnticipoCliente = new JLabelMe();

		this.jLabelConGraficoDinamicoAnticipoCliente.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnticipoCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAnticipoCliente.add(this.jLabelConGraficoDinamicoAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoAnticipoCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoAnticipoCliente.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoAnticipoCliente.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoAnticipoCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoAnticipoCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoAnticipoCliente.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnticipoCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAnticipoCliente.add(this.jCheckBoxConGraficoDinamicoAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoAnticipoCliente = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoAnticipoCliente.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnticipoCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAnticipoCliente.add(this.jLabelColumnaCategoriaGraficoAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoAnticipoCliente = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoAnticipoCliente.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoAnticipoCliente.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoAnticipoCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoAnticipoCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoAnticipoCliente.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnticipoCliente.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoAnticipoCliente.add(this.jComboBoxColumnaCategoriaGraficoAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorAnticipoCliente = new JLabelMe();

		this.jLabelColumnaCategoriaValorAnticipoCliente.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnticipoCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAnticipoCliente.add(this.jLabelColumnaCategoriaValorAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorAnticipoCliente = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorAnticipoCliente.setText("Accion");
        this.jComboBoxColumnaCategoriaValorAnticipoCliente.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorAnticipoCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorAnticipoCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorAnticipoCliente.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnticipoCliente.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoAnticipoCliente.add(this.jComboBoxColumnaCategoriaValorAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoAnticipoCliente = new JLabelMe();

		this.jLabelColumnasValoresGraficoAnticipoCliente.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnticipoCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAnticipoCliente.add(this.jLabelColumnasValoresGraficoAnticipoCliente, this.gridBagConstraintsAnticipoCliente);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoAnticipoCliente = new JList<Reporte>();
		this.jListColumnasValoresGraficoAnticipoCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoAnticipoCliente.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoAnticipoCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoAnticipoCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoAnticipoCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoAnticipoCliente=new JScrollPane(this.jListColumnasValoresGraficoAnticipoCliente);
			
			this.jScrollColumnasValoresGraficoAnticipoCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoAnticipoCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoAnticipoCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoAnticipoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnticipoCliente.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoAnticipoCliente.add(this.jListColumnasSelectReporteAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
		this.jPanelReporteDinamicoAnticipoCliente.add(this.jScrollColumnasValoresGraficoAnticipoCliente, this.gridBagConstraintsAnticipoCliente);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoAnticipoCliente = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoAnticipoCliente.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnticipoCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAnticipoCliente.add(this.jLabelTiposGraficosReportesDinamicoAnticipoCliente, this.gridBagConstraintsAnticipoCliente);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoAnticipoCliente = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoAnticipoCliente.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoAnticipoCliente.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoAnticipoCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoAnticipoCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoAnticipoCliente.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnticipoCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAnticipoCliente.add(this.jComboBoxTiposGraficosReportesDinamicoAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoAnticipoCliente = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoAnticipoCliente.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnticipoCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAnticipoCliente.add(this.jLabelGenerarExcelReporteDinamicoAnticipoCliente, this.gridBagConstraintsAnticipoCliente);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoAnticipoCliente = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoAnticipoCliente.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoAnticipoCliente,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoAnticipoCliente.setToolTipText("Generar EXCEL"+" "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsAnticipoCliente.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsAnticipoCliente.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoAnticipoCliente.add(this.jButtonGenerarExcelReporteDinamicoAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnticipoCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAnticipoCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAnticipoCliente.add(this.jComboBoxTiposReportesDinamicoAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoAnticipoCliente = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoAnticipoCliente.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnticipoCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAnticipoCliente.add(this.jLabelTiposArchivoReporteDinamicoAnticipoCliente, this.gridBagConstraintsAnticipoCliente);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnticipoCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAnticipoCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAnticipoCliente.add(this.jComboBoxTiposArchivosReportesDinamicoAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoAnticipoCliente = new JButtonMe();
		this.jButtonGenerarReporteDinamicoAnticipoCliente.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoAnticipoCliente,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoAnticipoCliente.setToolTipText("Generar"+" "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnticipoCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAnticipoCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAnticipoCliente.add(this.jButtonGenerarReporteDinamicoAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoAnticipoCliente = new JButtonMe();
		this.jButtonCerrarReporteDinamicoAnticipoCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoAnticipoCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoAnticipoCliente.setToolTipText("Cancelar"+" "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnticipoCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAnticipoCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAnticipoCliente.add(this.jButtonCerrarReporteDinamicoAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalAnticipoCliente = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoAnticipoCliente= new JScrollPane(jPanelReporteDinamicoAnticipoCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoAnticipoCliente.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAnticipoCliente.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAnticipoCliente.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoAnticipoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Anticipo Clientes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsAnticipoCliente.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoAnticipoCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoAnticipoCliente.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalAnticipoCliente);
		this.jInternalFrameReporteDinamicoAnticipoCliente.getContentPane().add(this.jScrollPanelReporteDinamicoAnticipoCliente, this.gridBagConstraintsAnticipoCliente);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionAnticipoCliente() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionAnticipoCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionAnticipoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionAnticipoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionAnticipoCliente.setName("jPanelImportacionAnticipoCliente"); 
		
		this.jPanelImportacionAnticipoCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAnticipoCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAnticipoCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionAnticipoCliente.setLayout(gridaBagLayoutImportacionAnticipoCliente);
		
		
		this.jInternalFrameImportacionAnticipoCliente= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionAnticipoCliente= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionAnticipoCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAnticipoCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionAnticipoCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAnticipoCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAnticipoCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionAnticipoCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAnticipoCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAnticipoCliente.setResizable(true);
	    this.jInternalFrameImportacionAnticipoCliente.setClosable(true);
	    this.jInternalFrameImportacionAnticipoCliente.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionAnticipoCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAnticipoCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAnticipoCliente.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionAnticipoCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAnticipoCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAnticipoCliente.setResizable(true);
	    this.jInternalFrameImportacionAnticipoCliente.setClosable(true);
	    this.jInternalFrameImportacionAnticipoCliente.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionAnticipoCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAnticipoCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAnticipoCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionAnticipoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Anticipo Clientes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionAnticipoCliente = new JLabelMe();

		this.jLabelArchivoImportacionAnticipoCliente.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsAnticipoCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAnticipoCliente.add(this.jLabelArchivoImportacionAnticipoCliente, this.gridBagConstraintsAnticipoCliente);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionAnticipoCliente = new JFileChooser();		
		this.jFileChooserImportacionAnticipoCliente.setToolTipText("ESCOGER ARCHIVO"+" "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionAnticipoCliente = new JButtonMe();
		this.jButtonAbrirImportacionAnticipoCliente.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionAnticipoCliente,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionAnticipoCliente.setToolTipText("Generar"+" "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnticipoCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsAnticipoCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAnticipoCliente.add(this.jButtonAbrirImportacionAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionAnticipoCliente = new JLabelMe();

		this.jLabelPathArchivoImportacionAnticipoCliente.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionAnticipoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAnticipoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAnticipoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipoCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsAnticipoCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAnticipoCliente.add(this.jLabelPathArchivoImportacionAnticipoCliente, this.gridBagConstraintsAnticipoCliente);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionAnticipoCliente=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionAnticipoCliente.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAnticipoCliente.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAnticipoCliente.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnticipoCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsAnticipoCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAnticipoCliente.add(this.jTextFieldPathArchivoImportacionAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionAnticipoCliente = new JButtonMe();
		this.jButtonGenerarImportacionAnticipoCliente.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionAnticipoCliente,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionAnticipoCliente.setToolTipText("Generar"+" "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnticipoCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsAnticipoCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAnticipoCliente.add(this.jButtonGenerarImportacionAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionAnticipoCliente = new JButtonMe();
		this.jButtonCerrarImportacionAnticipoCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionAnticipoCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionAnticipoCliente.setToolTipText("Cancelar"+" "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnticipoCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsAnticipoCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAnticipoCliente.add(this.jButtonCerrarImportacionAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalAnticipoCliente = new GridBagLayout();
		
		this.jScrollPanelImportacionAnticipoCliente= new JScrollPane(jPanelImportacionAnticipoCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
		this.gridBagConstraintsAnticipoCliente.gridy =iPosYImportacion;
		this.gridBagConstraintsAnticipoCliente.gridx =iPosXImportacion;
		this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionAnticipoCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionAnticipoCliente.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalAnticipoCliente);
		this.jInternalFrameImportacionAnticipoCliente.getContentPane().add(this.jScrollPanelImportacionAnticipoCliente, this.gridBagConstraintsAnticipoCliente);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByAnticipoCliente(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByAnticipoCliente = new JButtonMe();
			this.jButtonAbrirOrderByAnticipoCliente.setText("Orden");
			this.jButtonAbrirOrderByAnticipoCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAnticipoCliente,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByAnticipoCliente";
			inputMap = this.jButtonAbrirOrderByAnticipoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByAnticipoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByAnticipoCliente"));
		
		
			GridBagLayout gridaBagLayoutOrderByAnticipoCliente = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByAnticipoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByAnticipoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByAnticipoCliente.setName("jPanelOrderByAnticipoCliente"); 
			
			this.jPanelOrderByAnticipoCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAnticipoCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAnticipoCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByAnticipoCliente.setLayout(gridaBagLayoutOrderByAnticipoCliente);
			
			
			this.jTableDatosAnticipoClienteOrderBy = new JTableMe();        
			this.jTableDatosAnticipoClienteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosAnticipoClienteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosAnticipoClienteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosAnticipoClienteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosAnticipoClienteOrderBy.setViewportView(this.jTableDatosAnticipoClienteOrderBy);
			this.jTableDatosAnticipoClienteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosAnticipoClienteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByAnticipoCliente= new OrderByJInternalFrame();
			this.jInternalFrameOrderByAnticipoCliente= new OrderByJInternalFrame();
			this.jScrollPanelOrderByAnticipoCliente = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteAnticipoCliente= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByAnticipoCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByAnticipoCliente.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByAnticipoCliente.setTitle("Orden");
			this.jInternalFrameOrderByAnticipoCliente.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByAnticipoCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByAnticipoCliente.setResizable(true);
			this.jInternalFrameOrderByAnticipoCliente.setClosable(true);
			this.jInternalFrameOrderByAnticipoCliente.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByAnticipoCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAnticipoCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAnticipoCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByAnticipoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Anticipo Clientes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.gridy =iPosYOrderBy++;
			this.gridBagConstraintsAnticipoCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsAnticipoCliente.ipady =150;
				
			this.jPanelOrderByAnticipoCliente.add(jScrollPanelDatosAnticipoClienteOrderBy, this.gridBagConstraintsAnticipoCliente);//this.jTableDatosAnticipoClienteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByAnticipoCliente = new JButtonMe();
			this.jButtonCerrarOrderByAnticipoCliente.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByAnticipoCliente,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByAnticipoCliente.setToolTipText("Cancelar"+" "+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByAnticipoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipoCliente.gridy = iPosYOrderBy++;
			this.gridBagConstraintsAnticipoCliente.gridx = iPosXOrderBy;
									
			this.jPanelOrderByAnticipoCliente.add(this.jButtonCerrarOrderByAnticipoCliente, this.gridBagConstraintsAnticipoCliente);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalAnticipoCliente = new GridBagLayout();
			
			this.jScrollPanelOrderByAnticipoCliente= new JScrollPane(jPanelOrderByAnticipoCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsAnticipoCliente = new GridBagConstraints();
			this.gridBagConstraintsAnticipoCliente.gridy =iPosYOrderBy;
			this.gridBagConstraintsAnticipoCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsAnticipoCliente.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByAnticipoCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByAnticipoCliente.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalAnticipoCliente);
			
			this.jInternalFrameOrderByAnticipoCliente.getContentPane().add(this.jScrollPanelOrderByAnticipoCliente, this.gridBagConstraintsAnticipoCliente);			
		
		} else {
			this.jButtonAbrirOrderByAnticipoCliente = new JButtonMe();
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
		int iWidthTableCalculado=0;//4430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.anticipoclienteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosAnticipoCliente.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosAnticipoCliente.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosAnticipoCliente.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosAnticipoCliente.getRowHeight();//AnticipoClienteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > AnticipoClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAnticipoCliente.isSelected()) {
					iHeightTable=AnticipoClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AnticipoClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AnticipoClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > AnticipoClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAnticipoCliente.isSelected()) {
					iHeightTable=AnticipoClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AnticipoClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AnticipoClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosAnticipoCliente.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAnticipoCliente.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAnticipoCliente.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosAnticipoCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAnticipoCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAnticipoCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByAnticipoCliente!=null && this.jInternalFrameOrderByAnticipoCliente.getjTableDatosOrderBy()!=null) {
			//if(!this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByAnticipoCliente.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByAnticipoCliente.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByAnticipoCliente.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByAnticipoCliente.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByAnticipoCliente.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByAnticipoCliente.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByAnticipoCliente.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosAnticipoCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAnticipoCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAnticipoCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=anticipoclienteLogic.getAnticipoClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=anticipoclientes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<AnticipoCliente> TraerAnticipoClienteBeans(List<AnticipoCliente> anticipoclientes,ArrayList<Classe> classes)throws Exception {
		try {
			for(AnticipoCliente anticipocliente:anticipoclientes) {
					
				if(!(AnticipoClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || AnticipoClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					anticipocliente.setsDetalleGeneralEntityReporte(AnticipoClienteConstantesFunciones.getAnticipoClienteDescripcion(anticipocliente));
										
						
					
						
					
				} else  {
							
					//anticipocliente.setsDetalleGeneralEntityReporte(anticipocliente.getsDetalleGeneralEntityReporte());
										
				}
				
				//anticipoclientebeans.add(anticipoclientebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return anticipoclientes;
    }
	//PARA REPORTES FIN
}
