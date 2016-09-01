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

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.facturacion.util.TipoDevolucionEmpresaConstantesFunciones;

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
public class TipoDevolucionEmpresaJInternalFrame extends TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoDevolucionEmpresa;
	
	protected JMenuBar jmenuBarTipoDevolucionEmpresa;
	
	protected JMenu jmenuTipoDevolucionEmpresa;
	protected JMenu jmenuDatosTipoDevolucionEmpresa;
	protected JMenu jmenuArchivoTipoDevolucionEmpresa;
	protected JMenu jmenuAccionesTipoDevolucionEmpresa;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoDevolucionEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoDevolucionEmpresa;	
	protected GridBagConstraints gridBagConstraintsTipoDevolucionEmpresa;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoDevolucionEmpresaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoDevolucionEmpresa;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoDevolucionEmpresa;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoDevolucionEmpresa;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoDevolucionEmpresaSessionBean tipodevolucionempresaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoDevolucionEmpresa> tipodevolucionempresas;		
	public List<TipoDevolucionEmpresa> tipodevolucionempresasEliminados;	
	public List<TipoDevolucionEmpresa> tipodevolucionempresasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoDevolucionEmpresa;		
	protected JButton jButtonAbrirOrderByTipoDevolucionEmpresa;
	
	
	//protected JPanel jPanelOrderByTipoDevolucionEmpresa;
	//public JScrollPane jScrollPanelOrderByTipoDevolucionEmpresa;	
	//protected JButton jButtonCerrarOrderByTipoDevolucionEmpresa;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoDevolucionEmpresaLogic tipodevolucionempresaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoDevolucionEmpresa;
	public JScrollPane jScrollPanelDatosEdicionTipoDevolucionEmpresa;
	public JScrollPane jScrollPanelDatosGeneralTipoDevolucionEmpresa;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoDevolucionEmpresaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoDevolucionEmpresa;
	//public JScrollPane jScrollPanelImportacionTipoDevolucionEmpresa;
	
	
	
	protected JPanel jPanelAccionesTipoDevolucionEmpresa;
	
    protected JPanel jPanelPaginacionTipoDevolucionEmpresa;
    protected JPanel jPanelParametrosReportesTipoDevolucionEmpresa;
	protected JPanel jPanelParametrosReportesAccionesTipoDevolucionEmpresa;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoDevolucionEmpresa;
	protected JPanel jPanelParametrosAuxiliar2TipoDevolucionEmpresa;
	protected JPanel jPanelParametrosAuxiliar3TipoDevolucionEmpresa;
	protected JPanel jPanelParametrosAuxiliar4TipoDevolucionEmpresa;
	//protected JPanel jPanelParametrosAuxiliar5TipoDevolucionEmpresa;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoDevolucionEmpresa;
	//protected JPanel jPanelImportacionTipoDevolucionEmpresa;
	
	
	public JTable jTableDatosTipoDevolucionEmpresa;
	
	
	
	//public JTable jTableDatosTipoDevolucionEmpresaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoDevolucionEmpresa;
	protected JButton jButtonDuplicarTipoDevolucionEmpresa;
	protected JButton jButtonCopiarTipoDevolucionEmpresa;
	protected JButton jButtonVerFormTipoDevolucionEmpresa;
	protected JButton jButtonNuevoRelacionesTipoDevolucionEmpresa;
	protected JButton jButtonModificarTipoDevolucionEmpresa;
	
    protected JButton jButtonGuardarCambiosTablaTipoDevolucionEmpresa;
	protected JButton jButtonCerrarTipoDevolucionEmpresa;
	
	
	protected JButton jButtonRecargarInformacionTipoDevolucionEmpresa;
	protected JButton jButtonProcesarInformacionTipoDevolucionEmpresa;
	
	
	protected JButton jButtonAnterioresTipoDevolucionEmpresa;
	protected JButton jButtonSiguientesTipoDevolucionEmpresa;
	protected JButton jButtonNuevoGuardarCambiosTipoDevolucionEmpresa;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoDevolucionEmpresa;
	//protected JButton jButtonCerrarReporteDinamicoTipoDevolucionEmpresa;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoDevolucionEmpresa;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoDevolucionEmpresa;
	//protected JButton jButtonGenerarImportacionTipoDevolucionEmpresa;
	//protected JButton jButtonCerrarImportacionTipoDevolucionEmpresa;
	//protected JFileChooser jFileChooserImportacionTipoDevolucionEmpresa;
	//protected File fileImportacionTipoDevolucionEmpresa;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoDevolucionEmpresa;
	protected JButton jButtonDuplicarToolBarTipoDevolucionEmpresa;
	protected JButton jButtonNuevoRelacionesToolBarTipoDevolucionEmpresa;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoDevolucionEmpresa;
	protected JButton jButtonCopiarToolBarTipoDevolucionEmpresa;
	protected JButton jButtonVerFormToolBarTipoDevolucionEmpresa;
	public JButton jButtonGuardarCambiosTablaToolBarTipoDevolucionEmpresa;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoDevolucionEmpresa;
	protected JButton jButtonCerrarToolBarTipoDevolucionEmpresa;
	
	protected JButton jButtonRecargarInformacionToolBarTipoDevolucionEmpresa;
	protected JButton jButtonProcesarInformacionToolBarTipoDevolucionEmpresa;
	protected JButton jButtonAnterioresToolBarTipoDevolucionEmpresa;
	protected JButton jButtonSiguientesToolBarTipoDevolucionEmpresa;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoDevolucionEmpresa;
	protected JButton jButtonAbrirOrderByToolBarTipoDevolucionEmpresa;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoDevolucionEmpresa;
	protected JMenuItem jMenuItemDuplicarTipoDevolucionEmpresa;
	protected JMenuItem jMenuItemNuevoRelacionesTipoDevolucionEmpresa;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoDevolucionEmpresa;
	protected JMenuItem jMenuItemCopiarTipoDevolucionEmpresa;
	protected JMenuItem jMenuItemVerFormTipoDevolucionEmpresa;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoDevolucionEmpresa;
	protected JMenuItem jMenuItemCerrarTipoDevolucionEmpresa;
	protected JMenuItem jMenuItemDetalleCerrarTipoDevolucionEmpresa;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoDevolucionEmpresa;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoDevolucionEmpresa;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoDevolucionEmpresa;
	protected JMenuItem jMenuItemProcesarInformacionTipoDevolucionEmpresa;
	protected JMenuItem jMenuItemAnterioresTipoDevolucionEmpresa;
	protected JMenuItem jMenuItemSiguientesTipoDevolucionEmpresa;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoDevolucionEmpresa;
	protected JMenuItem jMenuItemAbrirOrderByTipoDevolucionEmpresa;
	protected JMenuItem jMenuItemMostrarOcultarTipoDevolucionEmpresa;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoDevolucionEmpresa;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoDevolucionEmpresa;
	protected JCheckBox jCheckBoxSeleccionadosTipoDevolucionEmpresa;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoDevolucionEmpresa;
	protected JCheckBox jCheckBoxConGraficoReporteTipoDevolucionEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoDevolucionEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoDevolucionEmpresa;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoDevolucionEmpresa;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoDevolucionEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoDevolucionEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoDevolucionEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoDevolucionEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoDevolucionEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoDevolucionEmpresa;
	protected JTextField jTextFieldValorCampoGeneralTipoDevolucionEmpresa;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoDevolucionEmpresa;
	//public JList<Reporte> jListColumnasSelectReporteTipoDevolucionEmpresa;
	//public JScrollPane jScrollColumnasSelectReporteTipoDevolucionEmpresa;
	
	//public JLabel jLabelRelacionesSelectReporteTipoDevolucionEmpresa;
	//public JList<Reporte> jListRelacionesSelectReporteTipoDevolucionEmpresa;
	//public JScrollPane jScrollRelacionesSelectReporteTipoDevolucionEmpresa;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoDevolucionEmpresa;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoDevolucionEmpresa;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoDevolucionEmpresa;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoDevolucionEmpresa;
	
		
	//public JLabel jLabelArchivoImportacionTipoDevolucionEmpresa;	
	//public JLabel jLabelPathArchivoImportacionTipoDevolucionEmpresa;
	//protected JTextField jTextFieldPathArchivoImportacionTipoDevolucionEmpresa;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoDevolucionEmpresa;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoDevolucionEmpresa;
	
	//public JLabel jLabelColumnaCategoriaValorTipoDevolucionEmpresa;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoDevolucionEmpresa;
	
	//public JLabel jLabelColumnasValoresGraficoTipoDevolucionEmpresa;
	//public JList<Reporte> jListColumnasValoresGraficoTipoDevolucionEmpresa;
	//public JScrollPane jScrollColumnasValoresGraficoTipoDevolucionEmpresa;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoDevolucionEmpresa;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoDevolucionEmpresa;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoDevolucionEmpresa;
	public JPanel jPanelBusquedaPorCodigoTipoDevolucionEmpresa;
	public JButton jButtonBusquedaPorCodigoTipoDevolucionEmpresa;
	public JPanel jPanelBusquedaPorNombreTipoDevolucionEmpresa;
	public JButton jButtonBusquedaPorNombreTipoDevolucionEmpresa;
	
	public JPanel jPanelcodigoBusquedaPorCodigoTipoDevolucionEmpresa;
	public JLabel jLabelcodigoBusquedaPorCodigoTipoDevolucionEmpresa;
	public JTextField jTextFieldcodigoBusquedaPorCodigoTipoDevolucionEmpresa;
	public JButton jButtoncodigoBusquedaPorCodigoTipoDevolucionEmpresaBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTipoDevolucionEmpresa;
	public JLabel jLabelnombreBusquedaPorNombreTipoDevolucionEmpresa;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoDevolucionEmpresa;
	public JButton jButtonnombreBusquedaPorNombreTipoDevolucionEmpresaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoDevolucionEmpresaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoDevolucionEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDevolucionEmpresaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDevolucionEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDevolucionEmpresaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDevolucionEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDevolucionEmpresaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoDevolucionEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoDevolucionEmpresa)	{
		this.jButtonRecargarInformacionTipoDevolucionEmpresa = jButtonRecargarInformacionTipoDevolucionEmpresa;
	}
	
	public JButton getjButtonProcesarInformacionTipoDevolucionEmpresa() {
		return this.jButtonProcesarInformacionTipoDevolucionEmpresa;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoDevolucionEmpresa)	{
		this.jButtonProcesarInformacionTipoDevolucionEmpresa = jButtonProcesarInformacionTipoDevolucionEmpresa;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoDevolucionEmpresa() {
		return this.jButtonRecargarInformacionTipoDevolucionEmpresa;
	}
	
	
	public List<TipoDevolucionEmpresa> gettipodevolucionempresas() {
		return this.tipodevolucionempresas;
	}

	public void settipodevolucionempresas(List<TipoDevolucionEmpresa> tipodevolucionempresas) {
		this.tipodevolucionempresas = tipodevolucionempresas;
	}
	
	public List<TipoDevolucionEmpresa> gettipodevolucionempresasAux() {
		return this.tipodevolucionempresasAux;
	}

	public void settipodevolucionempresasAux(List<TipoDevolucionEmpresa> tipodevolucionempresasAux) {
		this.tipodevolucionempresasAux = tipodevolucionempresasAux;
	}
	
	public List<TipoDevolucionEmpresa> gettipodevolucionempresasEliminados() {
		return this.tipodevolucionempresasEliminados;
	}

	public void setTipoDevolucionEmpresasEliminados(List<TipoDevolucionEmpresa> tipodevolucionempresasEliminados) {
		this.tipodevolucionempresasEliminados = tipodevolucionempresasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoDevolucionEmpresa() {
		return jComboBoxTiposSeleccionarTipoDevolucionEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoDevolucionEmpresa(
			JComboBox jComboBoxTiposSeleccionarTipoDevolucionEmpresa) {
		this.jComboBoxTiposSeleccionarTipoDevolucionEmpresa = jComboBoxTiposSeleccionarTipoDevolucionEmpresa;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoDevolucionEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoDevolucionEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoDevolucionEmpresa .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoDevolucionEmpresa() {
		return jTextFieldValorCampoGeneralTipoDevolucionEmpresa;
	}

	public void setjTextFieldValorCampoGeneralTipoDevolucionEmpresa(
			JTextField jTextFieldValorCampoGeneralTipoDevolucionEmpresa) {
		this.jTextFieldValorCampoGeneralTipoDevolucionEmpresa = jTextFieldValorCampoGeneralTipoDevolucionEmpresa;
	}

	public void setBorderResaltarValorCampoGeneralTipoDevolucionEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDevolucionEmpresa.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoDevolucionEmpresa .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoDevolucionEmpresa() {
		return this.jCheckBoxSeleccionarTodosTipoDevolucionEmpresa;
	}

	public void setjCheckBoxSeleccionarTodosTipoDevolucionEmpresa(
			JCheckBox jCheckBoxSeleccionarTodosTipoDevolucionEmpresa) {
		this.jCheckBoxSeleccionarTodosTipoDevolucionEmpresa = jCheckBoxSeleccionarTodosTipoDevolucionEmpresa;
	}

	public void setBorderResaltarSeleccionarTodosTipoDevolucionEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDevolucionEmpresa.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoDevolucionEmpresa .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoDevolucionEmpresa() {
		return this.jCheckBoxSeleccionadosTipoDevolucionEmpresa;
	}

	public void setjCheckBoxSeleccionadosTipoDevolucionEmpresa(
			JCheckBox jCheckBoxSeleccionadosTipoDevolucionEmpresa) {
		this.jCheckBoxSeleccionadosTipoDevolucionEmpresa = jCheckBoxSeleccionadosTipoDevolucionEmpresa;
	}
	
	public void setBorderResaltarSeleccionadosTipoDevolucionEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDevolucionEmpresa.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoDevolucionEmpresa .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoDevolucionEmpresa() {
		return this.jComboBoxTiposArchivosReportesTipoDevolucionEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoDevolucionEmpresa(
			JComboBox jComboBoxTiposArchivosReportesTipoDevolucionEmpresa) {
		this.jComboBoxTiposArchivosReportesTipoDevolucionEmpresa = jComboBoxTiposArchivosReportesTipoDevolucionEmpresa;
	}

	public void setBorderResaltarTiposArchivosReportesTipoDevolucionEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDevolucionEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoDevolucionEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoDevolucionEmpresa() {
		return this.jComboBoxTiposReportesTipoDevolucionEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoDevolucionEmpresa(
			JComboBox jComboBoxTiposReportesTipoDevolucionEmpresa) {
		this.jComboBoxTiposReportesTipoDevolucionEmpresa = jComboBoxTiposReportesTipoDevolucionEmpresa;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoDevolucionEmpresa() {
	//	return jComboBoxTiposReportesDinamicoTipoDevolucionEmpresa;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoDevolucionEmpresa(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoDevolucionEmpresa) {
	//	this.jComboBoxTiposReportesDinamicoTipoDevolucionEmpresa = jComboBoxTiposReportesDinamicoTipoDevolucionEmpresa;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoDevolucionEmpresa() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoDevolucionEmpresa;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoDevolucionEmpresa(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoDevolucionEmpresa) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoDevolucionEmpresa = jComboBoxTiposArchivosReportesDinamicoTipoDevolucionEmpresa;
	//}
	
	public void setBorderResaltarTiposReportesTipoDevolucionEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDevolucionEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoDevolucionEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoDevolucionEmpresa() {
		return this.jComboBoxTiposGraficosReportesTipoDevolucionEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoDevolucionEmpresa(
			JComboBox jComboBoxTiposGraficosReportesTipoDevolucionEmpresa) {
		this.jComboBoxTiposGraficosReportesTipoDevolucionEmpresa = jComboBoxTiposGraficosReportesTipoDevolucionEmpresa;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoDevolucionEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDevolucionEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoDevolucionEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoDevolucionEmpresa() {
		return this.jComboBoxTiposPaginacionTipoDevolucionEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoDevolucionEmpresa(
			JComboBox jComboBoxTiposPaginacionTipoDevolucionEmpresa) {
		this.jComboBoxTiposPaginacionTipoDevolucionEmpresa = jComboBoxTiposPaginacionTipoDevolucionEmpresa;
	}
	
	public void setBorderResaltarTiposPaginacionTipoDevolucionEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDevolucionEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoDevolucionEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoDevolucionEmpresa() {
		return this.jComboBoxTiposRelacionesTipoDevolucionEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoDevolucionEmpresa() {
		return this.jComboBoxTiposAccionesTipoDevolucionEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoDevolucionEmpresa(
			JComboBox jComboBoxTiposRelacionesTipoDevolucionEmpresa) {
		this.jComboBoxTiposRelacionesTipoDevolucionEmpresa = jComboBoxTiposRelacionesTipoDevolucionEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoDevolucionEmpresa(
			JComboBox jComboBoxTiposAccionesTipoDevolucionEmpresa) {
		this.jComboBoxTiposAccionesTipoDevolucionEmpresa = jComboBoxTiposAccionesTipoDevolucionEmpresa;
	}
	
	public void setBorderResaltarTiposRelacionesTipoDevolucionEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDevolucionEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoDevolucionEmpresa .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoDevolucionEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDevolucionEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoDevolucionEmpresa .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoDevolucionEmpresa() {
	//	return jCheckBoxConGraficoDinamicoTipoDevolucionEmpresa;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoDevolucionEmpresa(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoDevolucionEmpresa) {
	//	this.jCheckBoxConGraficoDinamicoTipoDevolucionEmpresa = jCheckBoxConGraficoDinamicoTipoDevolucionEmpresa;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoDevolucionEmpresa() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoDevolucionEmpresa.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoDevolucionEmpresa .setBorder(borderResaltar);		
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
		this.tipodevolucionempresaSessionBean=new TipoDevolucionEmpresaSessionBean();
		
		this.tipodevolucionempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodevolucionempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoDevolucionEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoDevolucionEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoDevolucionEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoDevolucionEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoDevolucionEmpresaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Devolucion Empresa MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoDevolucionEmpresaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoDevolucionEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoDevolucionEmpresa= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoDevolucionEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoDevolucionEmpresa,this.jTtoolBarTipoDevolucionEmpresa,
							"nuevo","nuevo","Nuevo"+" "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDevolucionEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoDevolucionEmpresa,this.jTtoolBarTipoDevolucionEmpresa,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoDevolucionEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoDevolucionEmpresa,this.jTtoolBarTipoDevolucionEmpresa,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoDevolucionEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoDevolucionEmpresa,this.jTtoolBarTipoDevolucionEmpresa,
							"duplicar","duplicar","Duplicar"+" "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoDevolucionEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoDevolucionEmpresa,this.jTtoolBarTipoDevolucionEmpresa,
							"copiar","copiar","Copiar"+" "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoDevolucionEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoDevolucionEmpresa,this.jTtoolBarTipoDevolucionEmpresa,
							"ver_form","ver_form","Ver"+" "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoDevolucionEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDevolucionEmpresa,this.jTtoolBarTipoDevolucionEmpresa,
							"recargar","recargar","Recargar"+" "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoDevolucionEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDevolucionEmpresa,this.jTtoolBarTipoDevolucionEmpresa,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoDevolucionEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDevolucionEmpresa,this.jTtoolBarTipoDevolucionEmpresa,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoDevolucionEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoDevolucionEmpresa,this.jTtoolBarTipoDevolucionEmpresa,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoDevolucionEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoDevolucionEmpresa,this.jTtoolBarTipoDevolucionEmpresa,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoDevolucionEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoDevolucionEmpresa,this.jTtoolBarTipoDevolucionEmpresa,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoDevolucionEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoDevolucionEmpresa,this.jTtoolBarTipoDevolucionEmpresa,
							"cerrar","cerrar","Salir"+" "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoDevolucionEmpresa=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoDevolucionEmpresa;
			
				this.jButtonProcesarInformacionToolBarTipoDevolucionEmpresa=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoDevolucionEmpresa;
				
		//protected JButton jButtonModificarToolBarTipoDevolucionEmpresa;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoDevolucionEmpresa=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoDevolucionEmpresa=new JMenuMe("General");
		this.jmenuArchivoTipoDevolucionEmpresa=new JMenuMe("Archivo");
		this.jmenuAccionesTipoDevolucionEmpresa=new JMenuMe("Acciones");
		this.jmenuDatosTipoDevolucionEmpresa=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoDevolucionEmpresa= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoDevolucionEmpresa.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoDevolucionEmpresa,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoDevolucionEmpresa= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoDevolucionEmpresa.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoDevolucionEmpresa,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoDevolucionEmpresa= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoDevolucionEmpresa.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoDevolucionEmpresa,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoDevolucionEmpresa= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoDevolucionEmpresa.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoDevolucionEmpresa,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoDevolucionEmpresa= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoDevolucionEmpresa.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoDevolucionEmpresa,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoDevolucionEmpresa= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoDevolucionEmpresa.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoDevolucionEmpresa,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoDevolucionEmpresa= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoDevolucionEmpresa.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoDevolucionEmpresa,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoDevolucionEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoDevolucionEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoDevolucionEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoDevolucionEmpresa= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoDevolucionEmpresa.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoDevolucionEmpresa,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoDevolucionEmpresa= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoDevolucionEmpresa.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoDevolucionEmpresa,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoDevolucionEmpresa= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoDevolucionEmpresa.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoDevolucionEmpresa,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoDevolucionEmpresa= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoDevolucionEmpresa.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoDevolucionEmpresa,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoDevolucionEmpresa= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoDevolucionEmpresa.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoDevolucionEmpresa,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoDevolucionEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoDevolucionEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoDevolucionEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoDevolucionEmpresa= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoDevolucionEmpresa.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoDevolucionEmpresa,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoDevolucionEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoDevolucionEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoDevolucionEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoDevolucionEmpresa= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoDevolucionEmpresa.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoDevolucionEmpresa,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoDevolucionEmpresa.add(this.jMenuItemCerrarTipoDevolucionEmpresa);
			
			this.jmenuAccionesTipoDevolucionEmpresa.add(this.jMenuItemNuevoTipoDevolucionEmpresa);
			this.jmenuAccionesTipoDevolucionEmpresa.add(this.jMenuItemNuevoGuardarCambiosTipoDevolucionEmpresa);
			this.jmenuAccionesTipoDevolucionEmpresa.add(this.jMenuItemNuevoRelacionesTipoDevolucionEmpresa);
			this.jmenuAccionesTipoDevolucionEmpresa.add(this.jMenuItemGuardarCambiosTablaTipoDevolucionEmpresa);		
			this.jmenuAccionesTipoDevolucionEmpresa.add(this.jMenuItemDuplicarTipoDevolucionEmpresa);		
			this.jmenuAccionesTipoDevolucionEmpresa.add(this.jMenuItemCopiarTipoDevolucionEmpresa);		
			this.jmenuAccionesTipoDevolucionEmpresa.add(this.jMenuItemVerFormTipoDevolucionEmpresa);		
			
			this.jmenuDatosTipoDevolucionEmpresa.add(this.jMenuItemRecargarInformacionTipoDevolucionEmpresa);				
			this.jmenuDatosTipoDevolucionEmpresa.add(this.jMenuItemAnterioresTipoDevolucionEmpresa);				
			this.jmenuDatosTipoDevolucionEmpresa.add(this.jMenuItemSiguientesTipoDevolucionEmpresa);				
			this.jmenuDatosTipoDevolucionEmpresa.add(this.jMenuItemAbrirOrderByTipoDevolucionEmpresa);				
			this.jmenuDatosTipoDevolucionEmpresa.add(this.jMenuItemMostrarOcultarTipoDevolucionEmpresa);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoDevolucionEmpresa.add(this.jMenuItemGuardarCambiosTipoDevolucionEmpresa);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoDevolucionEmpresa.add(this.jmenuArchivoTipoDevolucionEmpresa);		
			this.jmenuBarTipoDevolucionEmpresa.add(this.jmenuAccionesTipoDevolucionEmpresa);		
			this.jmenuBarTipoDevolucionEmpresa.add(this.jmenuDatosTipoDevolucionEmpresa);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoDevolucionEmpresa);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoDevolucionEmpresa() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoTipoDevolucionEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoTipoDevolucionEmpresa.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoTipoDevolucionEmpresa= new JButtonMe();
		this.jButtonBusquedaPorCodigoTipoDevolucionEmpresa.setText("Buscar");
		this.jButtonBusquedaPorCodigoTipoDevolucionEmpresa.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoTipoDevolucionEmpresa,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoTipoDevolucionEmpresa = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoTipoDevolucionEmpresa.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoTipoDevolucionEmpresa.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoTipoDevolucionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoDevolucionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoDevolucionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoTipoDevolucionEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoTipoDevolucionEmpresa= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoTipoDevolucionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoDevolucionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoDevolucionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoTipoDevolucionEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreTipoDevolucionEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoDevolucionEmpresa.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoDevolucionEmpresa= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoDevolucionEmpresa.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoDevolucionEmpresa.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoDevolucionEmpresa,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoDevolucionEmpresa = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoDevolucionEmpresa.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoDevolucionEmpresa.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoDevolucionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoDevolucionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoDevolucionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoDevolucionEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoDevolucionEmpresa= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoDevolucionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoDevolucionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoDevolucionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoDevolucionEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoDevolucionEmpresa=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoDevolucionEmpresa.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoDevolucionEmpresa.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoDevolucionEmpresa.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoDevolucionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoDevolucionEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoDevolucionEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoDevolucionEmpresa = new TipoDevolucionEmpresaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Devolucion Empresa DATOS");
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa = new TipoDevolucionEmpresaDetalleFormJInternalFrame(jDesktopPane,this.tipodevolucionempresaSessionBean.getConGuardarRelaciones(),this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa = null;//new TipoDevolucionEmpresaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoDevolucionEmpresa= new GridBagLayout();
		
		
		this.jTableDatosTipoDevolucionEmpresa = new JTableMe();      
		
		String sToolTipTipoDevolucionEmpresa="";
		sToolTipTipoDevolucionEmpresa=TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoDevolucionEmpresa+="(Facturacion.TipoDevolucionEmpresa)";
		}
		
		if(!this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoDevolucionEmpresa+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoDevolucionEmpresa.setToolTipText(sToolTipTipoDevolucionEmpresa);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoDevolucionEmpresa);
		this.jTableDatosTipoDevolucionEmpresa.setAutoCreateRowSorter(true);
		this.jTableDatosTipoDevolucionEmpresa.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoDevolucionEmpresa.setRowSelectionAllowed(true);
		this.jTableDatosTipoDevolucionEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoDevolucionEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoDevolucionEmpresa = new JButtonMe();
		this.jButtonDuplicarTipoDevolucionEmpresa = new JButtonMe();
		this.jButtonCopiarTipoDevolucionEmpresa = new JButtonMe();
		this.jButtonVerFormTipoDevolucionEmpresa = new JButtonMe();
		this.jButtonNuevoRelacionesTipoDevolucionEmpresa = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoDevolucionEmpresa = new JButtonMe();
		this.jButtonCerrarTipoDevolucionEmpresa = new JButtonMe();
		
		this.jScrollPanelDatosTipoDevolucionEmpresa = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoDevolucionEmpresa = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoDevolucionEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Devolucion Empresa";
		
		if(!this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoDevolucionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Devolucion Empresas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoDevolucionEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoDevolucionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoDevolucionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoDevolucionEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesTipoDevolucionEmpresa.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa=new ReporteDinamicoJInternalFrame(TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoDevolucionEmpresa();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoDevolucionEmpresa=new ImportacionJInternalFrame(TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoDevolucionEmpresa();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoDevolucionEmpresa = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoDevolucionEmpresa.setText("Orden");
		this.jButtonAbrirOrderByTipoDevolucionEmpresa.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoDevolucionEmpresa,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoDevolucionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoDevolucionEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoDevolucionEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDevolucionEmpresa,false,this);
			
			//this.cargarOrderByTipoDevolucionEmpresa(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoDevolucionEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDevolucionEmpresa,true,this);
			
			//this.cargarOrderByTipoDevolucionEmpresa(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoDevolucionEmpresa.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosTipoDevolucionEmpresa.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosTipoDevolucionEmpresa.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosTipoDevolucionEmpresa.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoDevolucionEmpresa.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoDevolucionEmpresa.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoDevolucionEmpresa.setText("Nuevo");
		this.jButtonDuplicarTipoDevolucionEmpresa.setText("Duplicar");
		this.jButtonCopiarTipoDevolucionEmpresa.setText("Copiar");
		this.jButtonVerFormTipoDevolucionEmpresa.setText("Ver");
		this.jButtonNuevoRelacionesTipoDevolucionEmpresa.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoDevolucionEmpresa.setText("Guardar");
		this.jButtonCerrarTipoDevolucionEmpresa.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoDevolucionEmpresa,"nuevo_button","Nuevo",this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoDevolucionEmpresa,"duplicar_button","Duplicar",this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoDevolucionEmpresa,"copiar_button","Copiar",this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoDevolucionEmpresa,"ver_form","Ver",this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoDevolucionEmpresa,"nuevorelaciones_button","Nuevo Rel",this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoDevolucionEmpresa,"guardarcambiostabla_button","Guardar",this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoDevolucionEmpresa,"cerrar_button","Salir",this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoDevolucionEmpresa.setToolTipText("Nuevo"+" "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoDevolucionEmpresa.setToolTipText("Duplicar"+" "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoDevolucionEmpresa.setToolTipText("Copiar"+" "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoDevolucionEmpresa.setToolTipText("Ver"+" "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoDevolucionEmpresa.setToolTipText("Nuevo Rel"+" "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoDevolucionEmpresa.setToolTipText("Guardar"+" "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoDevolucionEmpresa.setToolTipText("Salir"+" "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoDevolucionEmpresa";
		inputMap = this.jButtonNuevoTipoDevolucionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoDevolucionEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoDevolucionEmpresa"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoDevolucionEmpresa";
		inputMap = this.jButtonDuplicarTipoDevolucionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoDevolucionEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoDevolucionEmpresa"));
		
		//COPIAR
		sMapKey = "CopiarTipoDevolucionEmpresa";
		inputMap = this.jButtonCopiarTipoDevolucionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoDevolucionEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoDevolucionEmpresa"));
		
		//VEr FORM
		sMapKey = "VerFormTipoDevolucionEmpresa";
		inputMap = this.jButtonVerFormTipoDevolucionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoDevolucionEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoDevolucionEmpresa"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoDevolucionEmpresa";
		inputMap = this.jButtonNuevoRelacionesTipoDevolucionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoDevolucionEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoDevolucionEmpresa"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoDevolucionEmpresa";
		inputMap = this.jButtonModificarTipoDevolucionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoDevolucionEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoDevolucionEmpresa"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoDevolucionEmpresa";
		inputMap = this.jButtonCerrarTipoDevolucionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoDevolucionEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoDevolucionEmpresa"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoDevolucionEmpresa";
		inputMap = this.jButtonGuardarCambiosTablaTipoDevolucionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoDevolucionEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoDevolucionEmpresa"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoDevolucionEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoDevolucionEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoDevolucionEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoDevolucionEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoDevolucionEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoDevolucionEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoDevolucionEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoDevolucionEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoDevolucionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoDevolucionEmpresa.setName("jPanelParametrosReportesTipoDevolucionEmpresa"); 
		
		this.jPanelParametrosReportesAccionesTipoDevolucionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoDevolucionEmpresa.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoDevolucionEmpresa.setName("jPanelParametrosReportesAccionesTipoDevolucionEmpresa"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoDevolucionEmpresa = new JButtonMe();
		this.jButtonRecargarInformacionTipoDevolucionEmpresa.setText("Recargar");
		this.jButtonRecargarInformacionTipoDevolucionEmpresa.setToolTipText("Recargar"+" "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoDevolucionEmpresa,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoDevolucionEmpresa = new JButtonMe();
		this.jButtonProcesarInformacionTipoDevolucionEmpresa.setText("Procesar");
		this.jButtonProcesarInformacionTipoDevolucionEmpresa.setToolTipText("Procesar"+" "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoDevolucionEmpresa.setVisible(false);
			
		this.jButtonProcesarInformacionTipoDevolucionEmpresa.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoDevolucionEmpresa.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoDevolucionEmpresa.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoDevolucionEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDevolucionEmpresa.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoDevolucionEmpresa.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoDevolucionEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDevolucionEmpresa.setText("TIPO");       
		this.jComboBoxTiposReportesTipoDevolucionEmpresa.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoDevolucionEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDevolucionEmpresa.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoDevolucionEmpresa.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoDevolucionEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoDevolucionEmpresa.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoDevolucionEmpresa.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoDevolucionEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoDevolucionEmpresa.setText("Accion");
		this.jComboBoxTiposRelacionesTipoDevolucionEmpresa.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoDevolucionEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoDevolucionEmpresa.setText("Accion");
		this.jComboBoxTiposAccionesTipoDevolucionEmpresa.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoDevolucionEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoDevolucionEmpresa.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoDevolucionEmpresa.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoDevolucionEmpresa=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoDevolucionEmpresa.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoDevolucionEmpresa.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoDevolucionEmpresa.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoDevolucionEmpresa = new JLabelMe();
		
		this.jLabelAccionesTipoDevolucionEmpresa.setText("Acciones");		
		this.jLabelAccionesTipoDevolucionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDevolucionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDevolucionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoDevolucionEmpresa = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoDevolucionEmpresa.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoDevolucionEmpresa.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoDevolucionEmpresa = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoDevolucionEmpresa.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoDevolucionEmpresa.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoDevolucionEmpresa = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoDevolucionEmpresa.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoDevolucionEmpresa.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoDevolucionEmpresa = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoDevolucionEmpresa.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoDevolucionEmpresa.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoDevolucionEmpresa = new JButtonMe();
		//this.jButtonAnterioresTipoDevolucionEmpresa.setText("<<");
        this.jButtonAnterioresTipoDevolucionEmpresa.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoDevolucionEmpresa,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoDevolucionEmpresa = new JButtonMe();
		//this.jButtonSiguientesTipoDevolucionEmpresa.setText(">>");
        this.jButtonSiguientesTipoDevolucionEmpresa.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoDevolucionEmpresa,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoDevolucionEmpresa = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoDevolucionEmpresa.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoDevolucionEmpresa.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoDevolucionEmpresa,"nuevoguardarcambios_button","Nue",this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoDevolucionEmpresa";
		inputMap = this.jButtonNuevoGuardarCambiosTipoDevolucionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoDevolucionEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoDevolucionEmpresa"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoDevolucionEmpresa";
		inputMap = this.jButtonRecargarInformacionTipoDevolucionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoDevolucionEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoDevolucionEmpresa"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoDevolucionEmpresa";
		inputMap = this.jButtonSiguientesTipoDevolucionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoDevolucionEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoDevolucionEmpresa"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoDevolucionEmpresa";
		inputMap = this.jButtonAnterioresTipoDevolucionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoDevolucionEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoDevolucionEmpresa"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoDevolucionEmpresa();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoDevolucionEmpresa.setMinimumSize(new Dimension(this.getWidth(),TipoDevolucionEmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDevolucionEmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoDevolucionEmpresa.setMaximumSize(new Dimension(this.getWidth(),TipoDevolucionEmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDevolucionEmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoDevolucionEmpresa.setPreferredSize(new Dimension(this.getWidth(),TipoDevolucionEmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDevolucionEmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoDevolucionEmpresa = new GridBagLayout();

			this.jPanelPaginacionTipoDevolucionEmpresa.setLayout(gridaBagLayoutPaginacionTipoDevolucionEmpresa);						
			
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucionEmpresa.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy = 0;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoDevolucionEmpresa.add(this.jButtonAnterioresTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
					
						
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy = 0;
			
			this.jPanelPaginacionTipoDevolucionEmpresa.add(this.jButtonNuevoGuardarCambiosTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
						
			
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucionEmpresa.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy = 0;
			this.jPanelPaginacionTipoDevolucionEmpresa.add(this.jButtonSiguientesTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy = 1;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDevolucionEmpresa.add(this.jButtonNuevoTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
				this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoDevolucionEmpresa.gridy = 1;
				this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoDevolucionEmpresa.add(this.jButtonNuevoRelacionesTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
			}
			
			
			if(!this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
				this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoDevolucionEmpresa.gridy = 1;
				this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoDevolucionEmpresa.add(this.jButtonGuardarCambiosTablaTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
			}
			
			
			
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy = 1;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDevolucionEmpresa.add(this.jButtonDuplicarTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
			
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy = 1;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDevolucionEmpresa.add(this.jButtonCopiarTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
		
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy = 1;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDevolucionEmpresa.add(this.jButtonVerFormTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
		
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy = 1;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoDevolucionEmpresa.add(this.jButtonCerrarTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
		
		
		
		this.jButtonRecargarInformacionTipoDevolucionEmpresa.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoDevolucionEmpresa.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoDevolucionEmpresa.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoDevolucionEmpresa.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoDevolucionEmpresa.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoDevolucionEmpresa.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoDevolucionEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoDevolucionEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoDevolucionEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoDevolucionEmpresa.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoDevolucionEmpresa.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoDevolucionEmpresa.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoDevolucionEmpresa.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoDevolucionEmpresa.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoDevolucionEmpresa.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoDevolucionEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoDevolucionEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoDevolucionEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoDevolucionEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDevolucionEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDevolucionEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoDevolucionEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoDevolucionEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoDevolucionEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoDevolucionEmpresa.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoDevolucionEmpresa.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoDevolucionEmpresa.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoDevolucionEmpresa.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoDevolucionEmpresa.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoDevolucionEmpresa.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoDevolucionEmpresa.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoDevolucionEmpresa.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoDevolucionEmpresa.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoDevolucionEmpresa.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoDevolucionEmpresa.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoDevolucionEmpresa.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoDevolucionEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoDevolucionEmpresa = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoDevolucionEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoDevolucionEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoDevolucionEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoDevolucionEmpresa = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoDevolucionEmpresa.setLayout(gridaBagParametrosReportesTipoDevolucionEmpresa);
			this.jPanelParametrosReportesAccionesTipoDevolucionEmpresa.setLayout(gridaBagParametrosReportesAccionesTipoDevolucionEmpresa);
			
			
			this.jPanelParametrosAuxiliar1TipoDevolucionEmpresa.setLayout(gridaBagParametrosAuxiliar1TipoDevolucionEmpresa);
			this.jPanelParametrosAuxiliar2TipoDevolucionEmpresa.setLayout(gridaBagParametrosAuxiliar2TipoDevolucionEmpresa);
			this.jPanelParametrosAuxiliar3TipoDevolucionEmpresa.setLayout(gridaBagParametrosAuxiliar3TipoDevolucionEmpresa);
			this.jPanelParametrosAuxiliar4TipoDevolucionEmpresa.setLayout(gridaBagParametrosAuxiliar4TipoDevolucionEmpresa);
			//this.jPanelParametrosAuxiliar5TipoDevolucionEmpresa.setLayout(gridaBagParametrosAuxiliar2TipoDevolucionEmpresa);			
			
			
			
			
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDevolucionEmpresa.add(this.jButtonRecargarInformacionTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucionEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDevolucionEmpresa.add(this.jComboBoxTiposPaginacionTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucionEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDevolucionEmpresa.add(this.jCheckBoxConAltoMaximoTablaTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucionEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDevolucionEmpresa.add(this.jComboBoxTiposArchivosReportesTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucionEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDevolucionEmpresa.add(this.jPanelParametrosAuxiliar1TipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucionEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoDevolucionEmpresa.add(this.jComboBoxTiposReportesTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucionEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDevolucionEmpresa.add(this.jPanelParametrosAuxiliar4TipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucionEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDevolucionEmpresa.add(this.jComboBoxTiposReportesTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucionEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDevolucionEmpresa.add(this.jCheckBoxGenerarReporteTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucionEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDevolucionEmpresa.add(this.jPanelParametrosAuxiliar2TipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDevolucionEmpresa.add(this.jLabelAccionesTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
				this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoDevolucionEmpresa.add(this.jButtonAbrirOrderByTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDevolucionEmpresa.add(this.jComboBoxTiposSeleccionarTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);			
			
			
			/*
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDevolucionEmpresa.add(this.jCheckBoxSeleccionarTodosTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucionEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoDevolucionEmpresa.add(this.jCheckBoxSeleccionarTodosTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);															
				
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucionEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoDevolucionEmpresa.add(this.jCheckBoxSeleccionadosTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucionEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDevolucionEmpresa.add(this.jPanelParametrosAuxiliar3TipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDevolucionEmpresa.add(this.jComboBoxTiposRelacionesTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
				
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDevolucionEmpresa.add(this.jComboBoxTiposAccionesTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
	
				
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDevolucionEmpresa.add(this.jTextFieldValorCampoGeneralTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoDevolucionEmpresa = new GridBagLayout();

			this.jScrollPanelDatosTipoDevolucionEmpresa.setLayout(gridaBagLayoutDatosTipoDevolucionEmpresa);
			
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy = 0;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 0;
			
			this.jScrollPanelDatosTipoDevolucionEmpresa.add(this.jTableDatosTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoDevolucionEmpresa.setViewportView(this.jTableDatosTipoDevolucionEmpresa);
		this.jTableDatosTipoDevolucionEmpresa.setFillsViewportHeight(true);
		this.jTableDatosTipoDevolucionEmpresa.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoDevolucionEmpresa= new GridBagLayout();
		this.jPanelAccionesTipoDevolucionEmpresa.setLayout(gridaBagLayoutAccionesTipoDevolucionEmpresa);
		
		
		/*	
		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy = 0;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 0;
			
		this.jPanelAccionesTipoDevolucionEmpresa.add(this.jButtonNuevoTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoTipoDevolucionEmpresa= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoTipoDevolucionEmpresa.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoDevolucionEmpresa.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoDevolucionEmpresa.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoTipoDevolucionEmpresa.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoTipoDevolucionEmpresa.setLayout(gridaBagLayoutBusquedaPorCodigoTipoDevolucionEmpresa);

		gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		gridBagConstraintsTipoDevolucionEmpresa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDevolucionEmpresa.gridy = 0;
		gridBagConstraintsTipoDevolucionEmpresa.gridx = 0;
		jPanelBusquedaPorCodigoTipoDevolucionEmpresa.add(jLabelcodigoBusquedaPorCodigoTipoDevolucionEmpresa, gridBagConstraintsTipoDevolucionEmpresa);

		gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		gridBagConstraintsTipoDevolucionEmpresa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDevolucionEmpresa.gridy = 0;
		gridBagConstraintsTipoDevolucionEmpresa.gridx = 1;
		jPanelBusquedaPorCodigoTipoDevolucionEmpresa.add(jTextFieldcodigoBusquedaPorCodigoTipoDevolucionEmpresa, gridBagConstraintsTipoDevolucionEmpresa);

		gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		gridBagConstraintsTipoDevolucionEmpresa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDevolucionEmpresa.gridy = 1;
		gridBagConstraintsTipoDevolucionEmpresa.gridx =1;
		jPanelBusquedaPorCodigoTipoDevolucionEmpresa.add(jButtonBusquedaPorCodigoTipoDevolucionEmpresa, gridBagConstraintsTipoDevolucionEmpresa);

		jTabbedPaneBusquedasTipoDevolucionEmpresa.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoTipoDevolucionEmpresa);
		jTabbedPaneBusquedasTipoDevolucionEmpresa.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoDevolucionEmpresa= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoDevolucionEmpresa.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoDevolucionEmpresa.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoDevolucionEmpresa.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoDevolucionEmpresa.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoDevolucionEmpresa.setLayout(gridaBagLayoutBusquedaPorNombreTipoDevolucionEmpresa);

		gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		gridBagConstraintsTipoDevolucionEmpresa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDevolucionEmpresa.gridy = 0;
		gridBagConstraintsTipoDevolucionEmpresa.gridx = 0;
		jPanelBusquedaPorNombreTipoDevolucionEmpresa.add(jLabelnombreBusquedaPorNombreTipoDevolucionEmpresa, gridBagConstraintsTipoDevolucionEmpresa);

		gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		gridBagConstraintsTipoDevolucionEmpresa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDevolucionEmpresa.gridy = 0;
		gridBagConstraintsTipoDevolucionEmpresa.gridx = 1;
		jPanelBusquedaPorNombreTipoDevolucionEmpresa.add(jTextAreanombreBusquedaPorNombreTipoDevolucionEmpresa, gridBagConstraintsTipoDevolucionEmpresa);

		gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		gridBagConstraintsTipoDevolucionEmpresa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDevolucionEmpresa.gridy = 1;
		gridBagConstraintsTipoDevolucionEmpresa.gridx =1;
		jPanelBusquedaPorNombreTipoDevolucionEmpresa.add(jButtonBusquedaPorNombreTipoDevolucionEmpresa, gridBagConstraintsTipoDevolucionEmpresa);

		jTabbedPaneBusquedasTipoDevolucionEmpresa.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreTipoDevolucionEmpresa);
		jTabbedPaneBusquedasTipoDevolucionEmpresa.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoDevolucionEmpresa = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoDevolucionEmpresa);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();						
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 0;		
			//this.gridBagConstraintsTipoDevolucionEmpresa.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDevolucionEmpresa.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoDevolucionEmpresa.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 0;		
		//this.gridBagConstraintsTipoDevolucionEmpresa.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDevolucionEmpresa.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoDevolucionEmpresa.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoDevolucionEmpresa);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 0;		
			this.gridBagConstraintsTipoDevolucionEmpresa.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDevolucionEmpresa.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoDevolucionEmpresa.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);								
		
		
		/*
		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
		*/		
		
		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx =0;
		this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoDevolucionEmpresa.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
				
		
		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoDevolucionEmpresaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoDevolucionEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoDevolucionEmpresa = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoDevolucionEmpresa.setLayout(gridaBagLayoutBusquedasParametrosTipoDevolucionEmpresa);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoDevolucionEmpresa=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoDevolucionEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDevolucionEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDevolucionEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
			
			
		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
		
			
		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoDevolucionEmpresa;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoDevolucionEmpresa() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoDevolucionEmpresa = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoDevolucionEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoDevolucionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoDevolucionEmpresa.setName("jPanelReporteDinamicoTipoDevolucionEmpresa"); 
		
		this.jPanelReporteDinamicoTipoDevolucionEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoDevolucionEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoDevolucionEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoDevolucionEmpresa.setLayout(gridaBagLayoutReporteDinamicoTipoDevolucionEmpresa);
		
		
		this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoDevolucionEmpresa = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoDevolucionEmpresa= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoDevolucionEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoDevolucionEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoDevolucionEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoDevolucionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Devolucion Empresas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoDevolucionEmpresa = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoDevolucionEmpresa.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoDevolucionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoDevolucionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoDevolucionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoDevolucionEmpresa.add(this.jLabelColumnasSelectReporteTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoDevolucionEmpresa = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoDevolucionEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoDevolucionEmpresa.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoDevolucionEmpresa.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoDevolucionEmpresa.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoDevolucionEmpresa.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoDevolucionEmpresa=new JScrollPane(this.jListColumnasSelectReporteTipoDevolucionEmpresa);
			
			this.jScrollColumnasSelectReporteTipoDevolucionEmpresa.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoDevolucionEmpresa.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoDevolucionEmpresa.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoDevolucionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoDevolucionEmpresa.add(this.jListColumnasSelectReporteTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
		this.jPanelReporteDinamicoTipoDevolucionEmpresa.add(this.jScrollColumnasSelectReporteTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoDevolucionEmpresa = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoDevolucionEmpresa.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoDevolucionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoDevolucionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoDevolucionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoDevolucionEmpresa.add(this.jLabelRelacionesSelectReporteTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoDevolucionEmpresa = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoDevolucionEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoDevolucionEmpresa.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoDevolucionEmpresa.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoDevolucionEmpresa.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoDevolucionEmpresa.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoDevolucionEmpresa=new JScrollPane(this.jListRelacionesSelectReporteTipoDevolucionEmpresa);
			
			this.jScrollRelacionesSelectReporteTipoDevolucionEmpresa.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoDevolucionEmpresa.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoDevolucionEmpresa.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoDevolucionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoDevolucionEmpresa.add(this.jListRelacionesSelectReporteTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
		this.jPanelReporteDinamicoTipoDevolucionEmpresa.add(this.jScrollRelacionesSelectReporteTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoDevolucionEmpresa = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoDevolucionEmpresa = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoDevolucionEmpresa = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoDevolucionEmpresa = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoDevolucionEmpresa.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoDevolucionEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoDevolucionEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoDevolucionEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoDevolucionEmpresa = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoDevolucionEmpresa.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoDevolucionEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoDevolucionEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoDevolucionEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoDevolucionEmpresa = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoDevolucionEmpresa.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoDevolucionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoDevolucionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoDevolucionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoDevolucionEmpresa.add(this.jLabelGenerarExcelReporteDinamicoTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoDevolucionEmpresa = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoDevolucionEmpresa.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoDevolucionEmpresa,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoDevolucionEmpresa.setToolTipText("Generar EXCEL"+" "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoDevolucionEmpresa.add(this.jButtonGenerarExcelReporteDinamicoTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDevolucionEmpresa.add(this.jComboBoxTiposReportesDinamicoTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoDevolucionEmpresa = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoDevolucionEmpresa.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoDevolucionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoDevolucionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoDevolucionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoDevolucionEmpresa.add(this.jLabelTiposArchivoReporteDinamicoTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDevolucionEmpresa.add(this.jComboBoxTiposArchivosReportesDinamicoTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoDevolucionEmpresa = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoDevolucionEmpresa.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoDevolucionEmpresa,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoDevolucionEmpresa.setToolTipText("Generar"+" "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDevolucionEmpresa.add(this.jButtonGenerarReporteDinamicoTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoDevolucionEmpresa = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoDevolucionEmpresa.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoDevolucionEmpresa,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoDevolucionEmpresa.setToolTipText("Cancelar"+" "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDevolucionEmpresa.add(this.jButtonCerrarReporteDinamicoTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoDevolucionEmpresa = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoDevolucionEmpresa= new JScrollPane(jPanelReporteDinamicoTipoDevolucionEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoDevolucionEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoDevolucionEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoDevolucionEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoDevolucionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Devolucion Empresas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoDevolucionEmpresa);
		this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.getContentPane().add(this.jScrollPanelReporteDinamicoTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoDevolucionEmpresa() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoDevolucionEmpresa = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoDevolucionEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoDevolucionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoDevolucionEmpresa.setName("jPanelImportacionTipoDevolucionEmpresa"); 
		
		this.jPanelImportacionTipoDevolucionEmpresa.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoDevolucionEmpresa.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoDevolucionEmpresa.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoDevolucionEmpresa.setLayout(gridaBagLayoutImportacionTipoDevolucionEmpresa);
		
		
		this.jInternalFrameImportacionTipoDevolucionEmpresa= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoDevolucionEmpresa= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoDevolucionEmpresa = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoDevolucionEmpresa= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoDevolucionEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoDevolucionEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoDevolucionEmpresa.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoDevolucionEmpresa.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoDevolucionEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoDevolucionEmpresa.setResizable(true);
	    this.jInternalFrameImportacionTipoDevolucionEmpresa.setClosable(true);
	    this.jInternalFrameImportacionTipoDevolucionEmpresa.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoDevolucionEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoDevolucionEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoDevolucionEmpresa.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoDevolucionEmpresa.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoDevolucionEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoDevolucionEmpresa.setResizable(true);
	    this.jInternalFrameImportacionTipoDevolucionEmpresa.setClosable(true);
	    this.jInternalFrameImportacionTipoDevolucionEmpresa.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoDevolucionEmpresa.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoDevolucionEmpresa.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoDevolucionEmpresa.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoDevolucionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Devolucion Empresas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoDevolucionEmpresa = new JLabelMe();

		this.jLabelArchivoImportacionTipoDevolucionEmpresa.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoDevolucionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoDevolucionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoDevolucionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoDevolucionEmpresa.add(this.jLabelArchivoImportacionTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoDevolucionEmpresa = new JFileChooser();		
		this.jFileChooserImportacionTipoDevolucionEmpresa.setToolTipText("ESCOGER ARCHIVO"+" "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoDevolucionEmpresa = new JButtonMe();
		this.jButtonAbrirImportacionTipoDevolucionEmpresa.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoDevolucionEmpresa,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoDevolucionEmpresa.setToolTipText("Generar"+" "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDevolucionEmpresa.add(this.jButtonAbrirImportacionTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoDevolucionEmpresa = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoDevolucionEmpresa.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoDevolucionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoDevolucionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoDevolucionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoDevolucionEmpresa.add(this.jLabelPathArchivoImportacionTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoDevolucionEmpresa=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoDevolucionEmpresa.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoDevolucionEmpresa.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoDevolucionEmpresa.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDevolucionEmpresa.add(this.jTextFieldPathArchivoImportacionTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoDevolucionEmpresa = new JButtonMe();
		this.jButtonGenerarImportacionTipoDevolucionEmpresa.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoDevolucionEmpresa,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoDevolucionEmpresa.setToolTipText("Generar"+" "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDevolucionEmpresa.add(this.jButtonGenerarImportacionTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoDevolucionEmpresa = new JButtonMe();
		this.jButtonCerrarImportacionTipoDevolucionEmpresa.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoDevolucionEmpresa,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoDevolucionEmpresa.setToolTipText("Cancelar"+" "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDevolucionEmpresa.add(this.jButtonCerrarImportacionTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoDevolucionEmpresa = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoDevolucionEmpresa= new JScrollPane(jPanelImportacionTipoDevolucionEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoDevolucionEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoDevolucionEmpresa.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoDevolucionEmpresa);
		this.jInternalFrameImportacionTipoDevolucionEmpresa.getContentPane().add(this.jScrollPanelImportacionTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoDevolucionEmpresa(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoDevolucionEmpresa = new JButtonMe();
			this.jButtonAbrirOrderByTipoDevolucionEmpresa.setText("Orden");
			this.jButtonAbrirOrderByTipoDevolucionEmpresa.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoDevolucionEmpresa,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoDevolucionEmpresa";
			inputMap = this.jButtonAbrirOrderByTipoDevolucionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoDevolucionEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoDevolucionEmpresa"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoDevolucionEmpresa = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoDevolucionEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoDevolucionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoDevolucionEmpresa.setName("jPanelOrderByTipoDevolucionEmpresa"); 
			
			this.jPanelOrderByTipoDevolucionEmpresa.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoDevolucionEmpresa.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoDevolucionEmpresa.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoDevolucionEmpresa.setLayout(gridaBagLayoutOrderByTipoDevolucionEmpresa);
			
			
			this.jTableDatosTipoDevolucionEmpresaOrderBy = new JTableMe();        
			this.jTableDatosTipoDevolucionEmpresaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoDevolucionEmpresaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoDevolucionEmpresaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoDevolucionEmpresaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoDevolucionEmpresaOrderBy.setViewportView(this.jTableDatosTipoDevolucionEmpresaOrderBy);
			this.jTableDatosTipoDevolucionEmpresaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoDevolucionEmpresaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoDevolucionEmpresa= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoDevolucionEmpresa= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoDevolucionEmpresa = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoDevolucionEmpresa= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoDevolucionEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoDevolucionEmpresa.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoDevolucionEmpresa.setTitle("Orden");
			this.jInternalFrameOrderByTipoDevolucionEmpresa.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoDevolucionEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoDevolucionEmpresa.setResizable(true);
			this.jInternalFrameOrderByTipoDevolucionEmpresa.setClosable(true);
			this.jInternalFrameOrderByTipoDevolucionEmpresa.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoDevolucionEmpresa.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoDevolucionEmpresa.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoDevolucionEmpresa.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoDevolucionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Devolucion Empresas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoDevolucionEmpresa.ipady =150;
				
			this.jPanelOrderByTipoDevolucionEmpresa.add(jScrollPanelDatosTipoDevolucionEmpresaOrderBy, this.gridBagConstraintsTipoDevolucionEmpresa);//this.jTableDatosTipoDevolucionEmpresaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoDevolucionEmpresa = new JButtonMe();
			this.jButtonCerrarOrderByTipoDevolucionEmpresa.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoDevolucionEmpresa,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoDevolucionEmpresa.setToolTipText("Cancelar"+" "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoDevolucionEmpresa.add(this.jButtonCerrarOrderByTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoDevolucionEmpresa = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoDevolucionEmpresa= new JScrollPane(jPanelOrderByTipoDevolucionEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoDevolucionEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoDevolucionEmpresa.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoDevolucionEmpresa);
			
			this.jInternalFrameOrderByTipoDevolucionEmpresa.getContentPane().add(this.jScrollPanelOrderByTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);			
		
		} else {
			this.jButtonAbrirOrderByTipoDevolucionEmpresa = new JButtonMe();
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
		int iWidthTableCalculado=0;//1130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipodevolucionempresaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoDevolucionEmpresa.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoDevolucionEmpresa.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoDevolucionEmpresa.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoDevolucionEmpresa.getRowHeight();//TipoDevolucionEmpresaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoDevolucionEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoDevolucionEmpresa.isSelected()) {
					iHeightTable=TipoDevolucionEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoDevolucionEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoDevolucionEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoDevolucionEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoDevolucionEmpresa.isSelected()) {
					iHeightTable=TipoDevolucionEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoDevolucionEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoDevolucionEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoDevolucionEmpresa.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoDevolucionEmpresa.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoDevolucionEmpresa.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoDevolucionEmpresa.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoDevolucionEmpresa.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoDevolucionEmpresa.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoDevolucionEmpresa!=null && this.jInternalFrameOrderByTipoDevolucionEmpresa.getjTableDatosOrderBy()!=null) {
			//if(!this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoDevolucionEmpresa.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoDevolucionEmpresa.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoDevolucionEmpresa.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoDevolucionEmpresa.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoDevolucionEmpresa.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoDevolucionEmpresa.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoDevolucionEmpresa.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoDevolucionEmpresa.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoDevolucionEmpresa.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoDevolucionEmpresa.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipodevolucionempresaLogic.getTipoDevolucionEmpresas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodevolucionempresas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoDevolucionEmpresa> TraerTipoDevolucionEmpresaBeans(List<TipoDevolucionEmpresa> tipodevolucionempresas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoDevolucionEmpresa tipodevolucionempresa:tipodevolucionempresas) {
					
				if(!(TipoDevolucionEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoDevolucionEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipodevolucionempresa.setsDetalleGeneralEntityReporte(TipoDevolucionEmpresaConstantesFunciones.getTipoDevolucionEmpresaDescripcion(tipodevolucionempresa));
										
					tipodevolucionempresa.setesta_activo_descripcion(TipoDevolucionEmpresaConstantesFunciones.getesta_activoDescripcion(tipodevolucionempresa));	
					
					

					if(tipodevolucionempresa.getDetaNotaCreditoSolis()!=null && Funciones.existeClass(classes,DetaNotaCreditoSoli.class)) {
						try{tipodevolucionempresa.setdetanotacreditosolisDescripcionReporte(new JRBeanCollectionDataSource(DetaNotaCreditoSoliJInternalFrame.TraerDetaNotaCreditoSoliBeans(tipodevolucionempresa.getDetaNotaCreditoSolis(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipodevolucionempresa.setsDetalleGeneralEntityReporte(tipodevolucionempresa.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipodevolucionempresabeans.add(tipodevolucionempresabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipodevolucionempresas;
    }
	//PARA REPORTES FIN
}
