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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
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
import com.bydan.erp.facturacion.util.TipoDetaFormaPagoConstantesFunciones;

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
public class TipoDetaFormaPagoJInternalFrame extends TipoDetaFormaPagoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoDetaFormaPago;
	
	protected JMenuBar jmenuBarTipoDetaFormaPago;
	
	protected JMenu jmenuTipoDetaFormaPago;
	protected JMenu jmenuDatosTipoDetaFormaPago;
	protected JMenu jmenuArchivoTipoDetaFormaPago;
	protected JMenu jmenuAccionesTipoDetaFormaPago;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoDetaFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoDetaFormaPago;	
	protected GridBagConstraints gridBagConstraintsTipoDetaFormaPago;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoDetaFormaPagoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoDetaFormaPago;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoDetaFormaPago;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoDetaFormaPago;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoDetaFormaPagoSessionBean tipodetaformapagoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoDetaFormaPago> tipodetaformapagos;		
	public List<TipoDetaFormaPago> tipodetaformapagosEliminados;	
	public List<TipoDetaFormaPago> tipodetaformapagosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoDetaFormaPago;		
	protected JButton jButtonAbrirOrderByTipoDetaFormaPago;
	
	
	//protected JPanel jPanelOrderByTipoDetaFormaPago;
	//public JScrollPane jScrollPanelOrderByTipoDetaFormaPago;	
	//protected JButton jButtonCerrarOrderByTipoDetaFormaPago;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoDetaFormaPagoLogic tipodetaformapagoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoDetaFormaPago;
	public JScrollPane jScrollPanelDatosEdicionTipoDetaFormaPago;
	public JScrollPane jScrollPanelDatosGeneralTipoDetaFormaPago;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoDetaFormaPagoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoDetaFormaPago;
	//public JScrollPane jScrollPanelImportacionTipoDetaFormaPago;
	
	
	
	protected JPanel jPanelAccionesTipoDetaFormaPago;
	
    protected JPanel jPanelPaginacionTipoDetaFormaPago;
    protected JPanel jPanelParametrosReportesTipoDetaFormaPago;
	protected JPanel jPanelParametrosReportesAccionesTipoDetaFormaPago;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoDetaFormaPago;
	protected JPanel jPanelParametrosAuxiliar2TipoDetaFormaPago;
	protected JPanel jPanelParametrosAuxiliar3TipoDetaFormaPago;
	protected JPanel jPanelParametrosAuxiliar4TipoDetaFormaPago;
	//protected JPanel jPanelParametrosAuxiliar5TipoDetaFormaPago;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoDetaFormaPago;
	//protected JPanel jPanelImportacionTipoDetaFormaPago;
	
	
	public JTable jTableDatosTipoDetaFormaPago;
	
	
	
	//public JTable jTableDatosTipoDetaFormaPagoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoDetaFormaPago;
	protected JButton jButtonDuplicarTipoDetaFormaPago;
	protected JButton jButtonCopiarTipoDetaFormaPago;
	protected JButton jButtonVerFormTipoDetaFormaPago;
	protected JButton jButtonNuevoRelacionesTipoDetaFormaPago;
	protected JButton jButtonModificarTipoDetaFormaPago;
	
    protected JButton jButtonGuardarCambiosTablaTipoDetaFormaPago;
	protected JButton jButtonCerrarTipoDetaFormaPago;
	
	
	protected JButton jButtonRecargarInformacionTipoDetaFormaPago;
	protected JButton jButtonProcesarInformacionTipoDetaFormaPago;
	
	
	protected JButton jButtonAnterioresTipoDetaFormaPago;
	protected JButton jButtonSiguientesTipoDetaFormaPago;
	protected JButton jButtonNuevoGuardarCambiosTipoDetaFormaPago;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoDetaFormaPago;
	//protected JButton jButtonCerrarReporteDinamicoTipoDetaFormaPago;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoDetaFormaPago;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoDetaFormaPago;
	//protected JButton jButtonGenerarImportacionTipoDetaFormaPago;
	//protected JButton jButtonCerrarImportacionTipoDetaFormaPago;
	//protected JFileChooser jFileChooserImportacionTipoDetaFormaPago;
	//protected File fileImportacionTipoDetaFormaPago;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoDetaFormaPago;
	protected JButton jButtonDuplicarToolBarTipoDetaFormaPago;
	protected JButton jButtonNuevoRelacionesToolBarTipoDetaFormaPago;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoDetaFormaPago;
	protected JButton jButtonCopiarToolBarTipoDetaFormaPago;
	protected JButton jButtonVerFormToolBarTipoDetaFormaPago;
	public JButton jButtonGuardarCambiosTablaToolBarTipoDetaFormaPago;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoDetaFormaPago;
	protected JButton jButtonCerrarToolBarTipoDetaFormaPago;
	
	protected JButton jButtonRecargarInformacionToolBarTipoDetaFormaPago;
	protected JButton jButtonProcesarInformacionToolBarTipoDetaFormaPago;
	protected JButton jButtonAnterioresToolBarTipoDetaFormaPago;
	protected JButton jButtonSiguientesToolBarTipoDetaFormaPago;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoDetaFormaPago;
	protected JButton jButtonAbrirOrderByToolBarTipoDetaFormaPago;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoDetaFormaPago;
	protected JMenuItem jMenuItemDuplicarTipoDetaFormaPago;
	protected JMenuItem jMenuItemNuevoRelacionesTipoDetaFormaPago;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoDetaFormaPago;
	protected JMenuItem jMenuItemCopiarTipoDetaFormaPago;
	protected JMenuItem jMenuItemVerFormTipoDetaFormaPago;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoDetaFormaPago;
	protected JMenuItem jMenuItemCerrarTipoDetaFormaPago;
	protected JMenuItem jMenuItemDetalleCerrarTipoDetaFormaPago;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoDetaFormaPago;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoDetaFormaPago;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoDetaFormaPago;
	protected JMenuItem jMenuItemProcesarInformacionTipoDetaFormaPago;
	protected JMenuItem jMenuItemAnterioresTipoDetaFormaPago;
	protected JMenuItem jMenuItemSiguientesTipoDetaFormaPago;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoDetaFormaPago;
	protected JMenuItem jMenuItemAbrirOrderByTipoDetaFormaPago;
	protected JMenuItem jMenuItemMostrarOcultarTipoDetaFormaPago;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoDetaFormaPago;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoDetaFormaPago;
	protected JCheckBox jCheckBoxSeleccionadosTipoDetaFormaPago;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoDetaFormaPago;
	protected JCheckBox jCheckBoxConGraficoReporteTipoDetaFormaPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoDetaFormaPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoDetaFormaPago;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoDetaFormaPago;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoDetaFormaPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoDetaFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoDetaFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoDetaFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoDetaFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoDetaFormaPago;
	protected JTextField jTextFieldValorCampoGeneralTipoDetaFormaPago;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoDetaFormaPago;
	//public JList<Reporte> jListColumnasSelectReporteTipoDetaFormaPago;
	//public JScrollPane jScrollColumnasSelectReporteTipoDetaFormaPago;
	
	//public JLabel jLabelRelacionesSelectReporteTipoDetaFormaPago;
	//public JList<Reporte> jListRelacionesSelectReporteTipoDetaFormaPago;
	//public JScrollPane jScrollRelacionesSelectReporteTipoDetaFormaPago;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoDetaFormaPago;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoDetaFormaPago;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoDetaFormaPago;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoDetaFormaPago;
	
		
	//public JLabel jLabelArchivoImportacionTipoDetaFormaPago;	
	//public JLabel jLabelPathArchivoImportacionTipoDetaFormaPago;
	//protected JTextField jTextFieldPathArchivoImportacionTipoDetaFormaPago;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoDetaFormaPago;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoDetaFormaPago;
	
	//public JLabel jLabelColumnaCategoriaValorTipoDetaFormaPago;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoDetaFormaPago;
	
	//public JLabel jLabelColumnasValoresGraficoTipoDetaFormaPago;
	//public JList<Reporte> jListColumnasValoresGraficoTipoDetaFormaPago;
	//public JScrollPane jScrollColumnasValoresGraficoTipoDetaFormaPago;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoDetaFormaPago;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoDetaFormaPago;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoDetaFormaPago;
	public JPanel jPanelBusquedaPorCodigoTipoDetaFormaPago;
	public JButton jButtonBusquedaPorCodigoTipoDetaFormaPago;
	public JPanel jPanelBusquedaPorNombreTipoDetaFormaPago;
	public JButton jButtonBusquedaPorNombreTipoDetaFormaPago;
	
	public JPanel jPanelcodigoBusquedaPorCodigoTipoDetaFormaPago;
	public JLabel jLabelcodigoBusquedaPorCodigoTipoDetaFormaPago;
	public JTextField jTextFieldcodigoBusquedaPorCodigoTipoDetaFormaPago;
	public JButton jButtoncodigoBusquedaPorCodigoTipoDetaFormaPagoBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTipoDetaFormaPago;
	public JLabel jLabelnombreBusquedaPorNombreTipoDetaFormaPago;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoDetaFormaPago;
	public JButton jButtonnombreBusquedaPorNombreTipoDetaFormaPagoBusqueda= new JButtonMe();

	
	
	
	
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
	public TipoDetaFormaPagoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoDetaFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDetaFormaPagoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDetaFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDetaFormaPagoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDetaFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDetaFormaPagoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoDetaFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoDetaFormaPago)	{
		this.jButtonRecargarInformacionTipoDetaFormaPago = jButtonRecargarInformacionTipoDetaFormaPago;
	}
	
	public JButton getjButtonProcesarInformacionTipoDetaFormaPago() {
		return this.jButtonProcesarInformacionTipoDetaFormaPago;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoDetaFormaPago)	{
		this.jButtonProcesarInformacionTipoDetaFormaPago = jButtonProcesarInformacionTipoDetaFormaPago;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoDetaFormaPago() {
		return this.jButtonRecargarInformacionTipoDetaFormaPago;
	}
	
	
	public List<TipoDetaFormaPago> gettipodetaformapagos() {
		return this.tipodetaformapagos;
	}

	public void settipodetaformapagos(List<TipoDetaFormaPago> tipodetaformapagos) {
		this.tipodetaformapagos = tipodetaformapagos;
	}
	
	public List<TipoDetaFormaPago> gettipodetaformapagosAux() {
		return this.tipodetaformapagosAux;
	}

	public void settipodetaformapagosAux(List<TipoDetaFormaPago> tipodetaformapagosAux) {
		this.tipodetaformapagosAux = tipodetaformapagosAux;
	}
	
	public List<TipoDetaFormaPago> gettipodetaformapagosEliminados() {
		return this.tipodetaformapagosEliminados;
	}

	public void setTipoDetaFormaPagosEliminados(List<TipoDetaFormaPago> tipodetaformapagosEliminados) {
		this.tipodetaformapagosEliminados = tipodetaformapagosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoDetaFormaPago() {
		return jComboBoxTiposSeleccionarTipoDetaFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoDetaFormaPago(
			JComboBox jComboBoxTiposSeleccionarTipoDetaFormaPago) {
		this.jComboBoxTiposSeleccionarTipoDetaFormaPago = jComboBoxTiposSeleccionarTipoDetaFormaPago;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoDetaFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoDetaFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoDetaFormaPago .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoDetaFormaPago() {
		return jTextFieldValorCampoGeneralTipoDetaFormaPago;
	}

	public void setjTextFieldValorCampoGeneralTipoDetaFormaPago(
			JTextField jTextFieldValorCampoGeneralTipoDetaFormaPago) {
		this.jTextFieldValorCampoGeneralTipoDetaFormaPago = jTextFieldValorCampoGeneralTipoDetaFormaPago;
	}

	public void setBorderResaltarValorCampoGeneralTipoDetaFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDetaFormaPago.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoDetaFormaPago .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoDetaFormaPago() {
		return this.jCheckBoxSeleccionarTodosTipoDetaFormaPago;
	}

	public void setjCheckBoxSeleccionarTodosTipoDetaFormaPago(
			JCheckBox jCheckBoxSeleccionarTodosTipoDetaFormaPago) {
		this.jCheckBoxSeleccionarTodosTipoDetaFormaPago = jCheckBoxSeleccionarTodosTipoDetaFormaPago;
	}

	public void setBorderResaltarSeleccionarTodosTipoDetaFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDetaFormaPago.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoDetaFormaPago .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoDetaFormaPago() {
		return this.jCheckBoxSeleccionadosTipoDetaFormaPago;
	}

	public void setjCheckBoxSeleccionadosTipoDetaFormaPago(
			JCheckBox jCheckBoxSeleccionadosTipoDetaFormaPago) {
		this.jCheckBoxSeleccionadosTipoDetaFormaPago = jCheckBoxSeleccionadosTipoDetaFormaPago;
	}
	
	public void setBorderResaltarSeleccionadosTipoDetaFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDetaFormaPago.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoDetaFormaPago .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoDetaFormaPago() {
		return this.jComboBoxTiposArchivosReportesTipoDetaFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoDetaFormaPago(
			JComboBox jComboBoxTiposArchivosReportesTipoDetaFormaPago) {
		this.jComboBoxTiposArchivosReportesTipoDetaFormaPago = jComboBoxTiposArchivosReportesTipoDetaFormaPago;
	}

	public void setBorderResaltarTiposArchivosReportesTipoDetaFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDetaFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoDetaFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoDetaFormaPago() {
		return this.jComboBoxTiposReportesTipoDetaFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoDetaFormaPago(
			JComboBox jComboBoxTiposReportesTipoDetaFormaPago) {
		this.jComboBoxTiposReportesTipoDetaFormaPago = jComboBoxTiposReportesTipoDetaFormaPago;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoDetaFormaPago() {
	//	return jComboBoxTiposReportesDinamicoTipoDetaFormaPago;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoDetaFormaPago(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoDetaFormaPago) {
	//	this.jComboBoxTiposReportesDinamicoTipoDetaFormaPago = jComboBoxTiposReportesDinamicoTipoDetaFormaPago;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoDetaFormaPago() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoDetaFormaPago;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoDetaFormaPago(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoDetaFormaPago) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoDetaFormaPago = jComboBoxTiposArchivosReportesDinamicoTipoDetaFormaPago;
	//}
	
	public void setBorderResaltarTiposReportesTipoDetaFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDetaFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoDetaFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoDetaFormaPago() {
		return this.jComboBoxTiposGraficosReportesTipoDetaFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoDetaFormaPago(
			JComboBox jComboBoxTiposGraficosReportesTipoDetaFormaPago) {
		this.jComboBoxTiposGraficosReportesTipoDetaFormaPago = jComboBoxTiposGraficosReportesTipoDetaFormaPago;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoDetaFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDetaFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoDetaFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoDetaFormaPago() {
		return this.jComboBoxTiposPaginacionTipoDetaFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoDetaFormaPago(
			JComboBox jComboBoxTiposPaginacionTipoDetaFormaPago) {
		this.jComboBoxTiposPaginacionTipoDetaFormaPago = jComboBoxTiposPaginacionTipoDetaFormaPago;
	}
	
	public void setBorderResaltarTiposPaginacionTipoDetaFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDetaFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoDetaFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoDetaFormaPago() {
		return this.jComboBoxTiposRelacionesTipoDetaFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoDetaFormaPago() {
		return this.jComboBoxTiposAccionesTipoDetaFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoDetaFormaPago(
			JComboBox jComboBoxTiposRelacionesTipoDetaFormaPago) {
		this.jComboBoxTiposRelacionesTipoDetaFormaPago = jComboBoxTiposRelacionesTipoDetaFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoDetaFormaPago(
			JComboBox jComboBoxTiposAccionesTipoDetaFormaPago) {
		this.jComboBoxTiposAccionesTipoDetaFormaPago = jComboBoxTiposAccionesTipoDetaFormaPago;
	}
	
	public void setBorderResaltarTiposRelacionesTipoDetaFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDetaFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoDetaFormaPago .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoDetaFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDetaFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoDetaFormaPago .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoDetaFormaPago() {
	//	return jCheckBoxConGraficoDinamicoTipoDetaFormaPago;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoDetaFormaPago(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoDetaFormaPago) {
	//	this.jCheckBoxConGraficoDinamicoTipoDetaFormaPago = jCheckBoxConGraficoDinamicoTipoDetaFormaPago;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoDetaFormaPago() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoDetaFormaPago.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoDetaFormaPago .setBorder(borderResaltar);		
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
		this.tipodetaformapagoSessionBean=new TipoDetaFormaPagoSessionBean();
		
		this.tipodetaformapagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodetaformapagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipodetaformapagoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoDetaFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoDetaFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoDetaFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoDetaFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoDetaFormaPagoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Detalle Forma Pago MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoDetaFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoDetaFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoDetaFormaPago= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoDetaFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoDetaFormaPago,this.jTtoolBarTipoDetaFormaPago,
							"nuevo","nuevo","Nuevo"+" "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDetaFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoDetaFormaPago,this.jTtoolBarTipoDetaFormaPago,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoDetaFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoDetaFormaPago,this.jTtoolBarTipoDetaFormaPago,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoDetaFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoDetaFormaPago,this.jTtoolBarTipoDetaFormaPago,
							"duplicar","duplicar","Duplicar"+" "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoDetaFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoDetaFormaPago,this.jTtoolBarTipoDetaFormaPago,
							"copiar","copiar","Copiar"+" "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoDetaFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoDetaFormaPago,this.jTtoolBarTipoDetaFormaPago,
							"ver_form","ver_form","Ver"+" "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoDetaFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDetaFormaPago,this.jTtoolBarTipoDetaFormaPago,
							"recargar","recargar","Recargar"+" "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoDetaFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDetaFormaPago,this.jTtoolBarTipoDetaFormaPago,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoDetaFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDetaFormaPago,this.jTtoolBarTipoDetaFormaPago,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoDetaFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoDetaFormaPago,this.jTtoolBarTipoDetaFormaPago,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoDetaFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoDetaFormaPago,this.jTtoolBarTipoDetaFormaPago,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoDetaFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoDetaFormaPago,this.jTtoolBarTipoDetaFormaPago,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoDetaFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoDetaFormaPago,this.jTtoolBarTipoDetaFormaPago,
							"cerrar","cerrar","Salir"+" "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoDetaFormaPago=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoDetaFormaPago;
			
				this.jButtonProcesarInformacionToolBarTipoDetaFormaPago=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoDetaFormaPago;
				
		//protected JButton jButtonModificarToolBarTipoDetaFormaPago;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoDetaFormaPago=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoDetaFormaPago=new JMenuMe("General");
		this.jmenuArchivoTipoDetaFormaPago=new JMenuMe("Archivo");
		this.jmenuAccionesTipoDetaFormaPago=new JMenuMe("Acciones");
		this.jmenuDatosTipoDetaFormaPago=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoDetaFormaPago= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoDetaFormaPago.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoDetaFormaPago,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoDetaFormaPago= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoDetaFormaPago.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoDetaFormaPago,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoDetaFormaPago= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoDetaFormaPago.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoDetaFormaPago,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoDetaFormaPago= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoDetaFormaPago.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoDetaFormaPago,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoDetaFormaPago= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoDetaFormaPago.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoDetaFormaPago,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoDetaFormaPago= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoDetaFormaPago.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoDetaFormaPago,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoDetaFormaPago= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoDetaFormaPago.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoDetaFormaPago,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoDetaFormaPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoDetaFormaPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoDetaFormaPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoDetaFormaPago= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoDetaFormaPago.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoDetaFormaPago,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoDetaFormaPago= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoDetaFormaPago.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoDetaFormaPago,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoDetaFormaPago= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoDetaFormaPago.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoDetaFormaPago,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoDetaFormaPago= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoDetaFormaPago.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoDetaFormaPago,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoDetaFormaPago= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoDetaFormaPago.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoDetaFormaPago,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoDetaFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoDetaFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoDetaFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoDetaFormaPago= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoDetaFormaPago.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoDetaFormaPago,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoDetaFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoDetaFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoDetaFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoDetaFormaPago= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoDetaFormaPago.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoDetaFormaPago,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoDetaFormaPago.add(this.jMenuItemCerrarTipoDetaFormaPago);
			
			this.jmenuAccionesTipoDetaFormaPago.add(this.jMenuItemNuevoTipoDetaFormaPago);
			this.jmenuAccionesTipoDetaFormaPago.add(this.jMenuItemNuevoGuardarCambiosTipoDetaFormaPago);
			this.jmenuAccionesTipoDetaFormaPago.add(this.jMenuItemNuevoRelacionesTipoDetaFormaPago);
			this.jmenuAccionesTipoDetaFormaPago.add(this.jMenuItemGuardarCambiosTablaTipoDetaFormaPago);		
			this.jmenuAccionesTipoDetaFormaPago.add(this.jMenuItemDuplicarTipoDetaFormaPago);		
			this.jmenuAccionesTipoDetaFormaPago.add(this.jMenuItemCopiarTipoDetaFormaPago);		
			this.jmenuAccionesTipoDetaFormaPago.add(this.jMenuItemVerFormTipoDetaFormaPago);		
			
			this.jmenuDatosTipoDetaFormaPago.add(this.jMenuItemRecargarInformacionTipoDetaFormaPago);				
			this.jmenuDatosTipoDetaFormaPago.add(this.jMenuItemAnterioresTipoDetaFormaPago);				
			this.jmenuDatosTipoDetaFormaPago.add(this.jMenuItemSiguientesTipoDetaFormaPago);				
			this.jmenuDatosTipoDetaFormaPago.add(this.jMenuItemAbrirOrderByTipoDetaFormaPago);				
			this.jmenuDatosTipoDetaFormaPago.add(this.jMenuItemMostrarOcultarTipoDetaFormaPago);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoDetaFormaPago.add(this.jMenuItemGuardarCambiosTipoDetaFormaPago);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoDetaFormaPago.add(this.jmenuArchivoTipoDetaFormaPago);		
			this.jmenuBarTipoDetaFormaPago.add(this.jmenuAccionesTipoDetaFormaPago);		
			this.jmenuBarTipoDetaFormaPago.add(this.jmenuDatosTipoDetaFormaPago);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoDetaFormaPago);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoDetaFormaPago() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoTipoDetaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoTipoDetaFormaPago.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoTipoDetaFormaPago= new JButtonMe();
		this.jButtonBusquedaPorCodigoTipoDetaFormaPago.setText("Buscar");
		this.jButtonBusquedaPorCodigoTipoDetaFormaPago.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoTipoDetaFormaPago,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoTipoDetaFormaPago = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoTipoDetaFormaPago.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoTipoDetaFormaPago.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoTipoDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoTipoDetaFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoTipoDetaFormaPago= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoTipoDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoTipoDetaFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreTipoDetaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoDetaFormaPago.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoDetaFormaPago= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoDetaFormaPago.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoDetaFormaPago.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoDetaFormaPago,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoDetaFormaPago = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoDetaFormaPago.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoDetaFormaPago.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoDetaFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoDetaFormaPago= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoDetaFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoDetaFormaPago=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoDetaFormaPago.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoDetaFormaPago.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoDetaFormaPago.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoDetaFormaPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoDetaFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoDetaFormaPago = new TipoDetaFormaPagoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Detalle Forma Pago DATOS");
			this.jInternalFrameDetalleFormTipoDetaFormaPago = new TipoDetaFormaPagoDetalleFormJInternalFrame(jDesktopPane,this.tipodetaformapagoSessionBean.getConGuardarRelaciones(),this.tipodetaformapagoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoDetaFormaPago = null;//new TipoDetaFormaPagoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoDetaFormaPago= new GridBagLayout();
		
		
		this.jTableDatosTipoDetaFormaPago = new JTableMe();      
		
		String sToolTipTipoDetaFormaPago="";
		sToolTipTipoDetaFormaPago=TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoDetaFormaPago+="(Facturacion.TipoDetaFormaPago)";
		}
		
		if(!this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoDetaFormaPago+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoDetaFormaPago.setToolTipText(sToolTipTipoDetaFormaPago);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoDetaFormaPago);
		this.jTableDatosTipoDetaFormaPago.setAutoCreateRowSorter(true);
		this.jTableDatosTipoDetaFormaPago.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoDetaFormaPago.setRowSelectionAllowed(true);
		this.jTableDatosTipoDetaFormaPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoDetaFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoDetaFormaPago = new JButtonMe();
		this.jButtonDuplicarTipoDetaFormaPago = new JButtonMe();
		this.jButtonCopiarTipoDetaFormaPago = new JButtonMe();
		this.jButtonVerFormTipoDetaFormaPago = new JButtonMe();
		this.jButtonNuevoRelacionesTipoDetaFormaPago = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoDetaFormaPago = new JButtonMe();
		this.jButtonCerrarTipoDetaFormaPago = new JButtonMe();
		
		this.jScrollPanelDatosTipoDetaFormaPago = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoDetaFormaPago = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoDetaFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Detalle Forma Pago";
		
		if(!this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Detalle Forma Pagos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoDetaFormaPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoDetaFormaPago.setToolTipText("Acciones");
        this.jPanelAccionesTipoDetaFormaPago.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoDetaFormaPago=new ReporteDinamicoJInternalFrame(TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoDetaFormaPago();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoDetaFormaPago=new ImportacionJInternalFrame(TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoDetaFormaPago();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoDetaFormaPago = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoDetaFormaPago.setText("Orden");
		this.jButtonAbrirOrderByTipoDetaFormaPago.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoDetaFormaPago,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoDetaFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoDetaFormaPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDetaFormaPago,false,this);
			
			//this.cargarOrderByTipoDetaFormaPago(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoDetaFormaPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDetaFormaPago,true,this);
			
			//this.cargarOrderByTipoDetaFormaPago(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoDetaFormaPago.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoDetaFormaPago.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoDetaFormaPago.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoDetaFormaPago.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoDetaFormaPago.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoDetaFormaPago.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoDetaFormaPago.setText("Nuevo");
		this.jButtonDuplicarTipoDetaFormaPago.setText("Duplicar");
		this.jButtonCopiarTipoDetaFormaPago.setText("Copiar");
		this.jButtonVerFormTipoDetaFormaPago.setText("Ver");
		this.jButtonNuevoRelacionesTipoDetaFormaPago.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoDetaFormaPago.setText("Guardar");
		this.jButtonCerrarTipoDetaFormaPago.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoDetaFormaPago,"nuevo_button","Nuevo",this.tipodetaformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoDetaFormaPago,"duplicar_button","Duplicar",this.tipodetaformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoDetaFormaPago,"copiar_button","Copiar",this.tipodetaformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoDetaFormaPago,"ver_form","Ver",this.tipodetaformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoDetaFormaPago,"nuevorelaciones_button","Nuevo Rel",this.tipodetaformapagoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoDetaFormaPago,"guardarcambiostabla_button","Guardar",this.tipodetaformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoDetaFormaPago,"cerrar_button","Salir",this.tipodetaformapagoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoDetaFormaPago.setToolTipText("Nuevo"+" "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoDetaFormaPago.setToolTipText("Duplicar"+" "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoDetaFormaPago.setToolTipText("Copiar"+" "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoDetaFormaPago.setToolTipText("Ver"+" "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoDetaFormaPago.setToolTipText("Nuevo Rel"+" "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoDetaFormaPago.setToolTipText("Guardar"+" "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoDetaFormaPago.setToolTipText("Salir"+" "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoDetaFormaPago";
		inputMap = this.jButtonNuevoTipoDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoDetaFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoDetaFormaPago"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoDetaFormaPago";
		inputMap = this.jButtonDuplicarTipoDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoDetaFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoDetaFormaPago"));
		
		//COPIAR
		sMapKey = "CopiarTipoDetaFormaPago";
		inputMap = this.jButtonCopiarTipoDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoDetaFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoDetaFormaPago"));
		
		//VEr FORM
		sMapKey = "VerFormTipoDetaFormaPago";
		inputMap = this.jButtonVerFormTipoDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoDetaFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoDetaFormaPago"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoDetaFormaPago";
		inputMap = this.jButtonNuevoRelacionesTipoDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoDetaFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoDetaFormaPago"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoDetaFormaPago";
		inputMap = this.jButtonModificarTipoDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoDetaFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoDetaFormaPago"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoDetaFormaPago";
		inputMap = this.jButtonCerrarTipoDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoDetaFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoDetaFormaPago"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoDetaFormaPago";
		inputMap = this.jButtonGuardarCambiosTablaTipoDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoDetaFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoDetaFormaPago"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoDetaFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoDetaFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoDetaFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoDetaFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoDetaFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoDetaFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoDetaFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoDetaFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoDetaFormaPago.setName("jPanelParametrosReportesTipoDetaFormaPago"); 
		
		this.jPanelParametrosReportesAccionesTipoDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoDetaFormaPago.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoDetaFormaPago.setName("jPanelParametrosReportesAccionesTipoDetaFormaPago"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoDetaFormaPago = new JButtonMe();
		this.jButtonRecargarInformacionTipoDetaFormaPago.setText("Recargar");
		this.jButtonRecargarInformacionTipoDetaFormaPago.setToolTipText("Recargar"+" "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoDetaFormaPago,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoDetaFormaPago = new JButtonMe();
		this.jButtonProcesarInformacionTipoDetaFormaPago.setText("Procesar");
		this.jButtonProcesarInformacionTipoDetaFormaPago.setToolTipText("Procesar"+" "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoDetaFormaPago.setVisible(false);
			
		this.jButtonProcesarInformacionTipoDetaFormaPago.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoDetaFormaPago.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoDetaFormaPago.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoDetaFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDetaFormaPago.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoDetaFormaPago.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoDetaFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDetaFormaPago.setText("TIPO");       
		this.jComboBoxTiposReportesTipoDetaFormaPago.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoDetaFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDetaFormaPago.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoDetaFormaPago.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoDetaFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoDetaFormaPago.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoDetaFormaPago.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoDetaFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoDetaFormaPago.setText("Accion");
		this.jComboBoxTiposRelacionesTipoDetaFormaPago.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoDetaFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoDetaFormaPago.setText("Accion");
		this.jComboBoxTiposAccionesTipoDetaFormaPago.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoDetaFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoDetaFormaPago.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoDetaFormaPago.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoDetaFormaPago=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoDetaFormaPago.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoDetaFormaPago.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoDetaFormaPago.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoDetaFormaPago = new JLabelMe();
		
		this.jLabelAccionesTipoDetaFormaPago.setText("Acciones");		
		this.jLabelAccionesTipoDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoDetaFormaPago = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoDetaFormaPago.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoDetaFormaPago.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoDetaFormaPago = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoDetaFormaPago.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoDetaFormaPago.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoDetaFormaPago = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoDetaFormaPago.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoDetaFormaPago.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoDetaFormaPago = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoDetaFormaPago.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoDetaFormaPago.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoDetaFormaPago = new JButtonMe();
		//this.jButtonAnterioresTipoDetaFormaPago.setText("<<");
        this.jButtonAnterioresTipoDetaFormaPago.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoDetaFormaPago,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoDetaFormaPago = new JButtonMe();
		//this.jButtonSiguientesTipoDetaFormaPago.setText(">>");
        this.jButtonSiguientesTipoDetaFormaPago.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoDetaFormaPago,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoDetaFormaPago = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoDetaFormaPago.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoDetaFormaPago.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoDetaFormaPago,"nuevoguardarcambios_button","Nue",this.tipodetaformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoDetaFormaPago";
		inputMap = this.jButtonNuevoGuardarCambiosTipoDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoDetaFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoDetaFormaPago"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoDetaFormaPago";
		inputMap = this.jButtonRecargarInformacionTipoDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoDetaFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoDetaFormaPago"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoDetaFormaPago";
		inputMap = this.jButtonSiguientesTipoDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoDetaFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoDetaFormaPago"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoDetaFormaPago";
		inputMap = this.jButtonAnterioresTipoDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoDetaFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoDetaFormaPago"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoDetaFormaPago();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoDetaFormaPago.setMinimumSize(new Dimension(this.getWidth(),TipoDetaFormaPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDetaFormaPagoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoDetaFormaPago.setMaximumSize(new Dimension(this.getWidth(),TipoDetaFormaPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDetaFormaPagoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoDetaFormaPago.setPreferredSize(new Dimension(this.getWidth(),TipoDetaFormaPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDetaFormaPagoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoDetaFormaPago = new GridBagLayout();

			this.jPanelPaginacionTipoDetaFormaPago.setLayout(gridaBagLayoutPaginacionTipoDetaFormaPago);						
			
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaFormaPago.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetaFormaPago.gridy = 0;
			this.gridBagConstraintsTipoDetaFormaPago.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoDetaFormaPago.add(this.jButtonAnterioresTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
					
						
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaFormaPago.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoDetaFormaPago.gridy = 0;
			
			this.jPanelPaginacionTipoDetaFormaPago.add(this.jButtonNuevoGuardarCambiosTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
						
			
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaFormaPago.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoDetaFormaPago.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoDetaFormaPago.gridy = 0;
			this.jPanelPaginacionTipoDetaFormaPago.add(this.jButtonSiguientesTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetaFormaPago.gridy = 1;
			this.gridBagConstraintsTipoDetaFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDetaFormaPago.add(this.jButtonNuevoTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
						
			
			
			if(!this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
				this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoDetaFormaPago.gridy = 1;
				this.gridBagConstraintsTipoDetaFormaPago.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoDetaFormaPago.add(this.jButtonGuardarCambiosTablaTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
			}
			
			
			
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetaFormaPago.gridy = 1;
			this.gridBagConstraintsTipoDetaFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDetaFormaPago.add(this.jButtonDuplicarTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
			
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetaFormaPago.gridy = 1;
			this.gridBagConstraintsTipoDetaFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDetaFormaPago.add(this.jButtonCopiarTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
		
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetaFormaPago.gridy = 1;
			this.gridBagConstraintsTipoDetaFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDetaFormaPago.add(this.jButtonVerFormTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
		
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetaFormaPago.gridy = 1;
			this.gridBagConstraintsTipoDetaFormaPago.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoDetaFormaPago.add(this.jButtonCerrarTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
		
		
		
		this.jButtonRecargarInformacionTipoDetaFormaPago.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoDetaFormaPago.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoDetaFormaPago.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoDetaFormaPago.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoDetaFormaPago.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoDetaFormaPago.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoDetaFormaPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoDetaFormaPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoDetaFormaPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoDetaFormaPago.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoDetaFormaPago.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoDetaFormaPago.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoDetaFormaPago.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoDetaFormaPago.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoDetaFormaPago.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoDetaFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoDetaFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoDetaFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoDetaFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDetaFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDetaFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoDetaFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoDetaFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoDetaFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoDetaFormaPago.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoDetaFormaPago.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoDetaFormaPago.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoDetaFormaPago.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoDetaFormaPago.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoDetaFormaPago.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoDetaFormaPago.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoDetaFormaPago.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoDetaFormaPago.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoDetaFormaPago.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoDetaFormaPago.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoDetaFormaPago.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoDetaFormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoDetaFormaPago = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoDetaFormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoDetaFormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoDetaFormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoDetaFormaPago = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoDetaFormaPago.setLayout(gridaBagParametrosReportesTipoDetaFormaPago);
			this.jPanelParametrosReportesAccionesTipoDetaFormaPago.setLayout(gridaBagParametrosReportesAccionesTipoDetaFormaPago);
			
			
			this.jPanelParametrosAuxiliar1TipoDetaFormaPago.setLayout(gridaBagParametrosAuxiliar1TipoDetaFormaPago);
			this.jPanelParametrosAuxiliar2TipoDetaFormaPago.setLayout(gridaBagParametrosAuxiliar2TipoDetaFormaPago);
			this.jPanelParametrosAuxiliar3TipoDetaFormaPago.setLayout(gridaBagParametrosAuxiliar3TipoDetaFormaPago);
			this.jPanelParametrosAuxiliar4TipoDetaFormaPago.setLayout(gridaBagParametrosAuxiliar4TipoDetaFormaPago);
			//this.jPanelParametrosAuxiliar5TipoDetaFormaPago.setLayout(gridaBagParametrosAuxiliar2TipoDetaFormaPago);			
			
			
			
			
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDetaFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDetaFormaPago.add(this.jButtonRecargarInformacionTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetaFormaPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDetaFormaPago.add(this.jComboBoxTiposPaginacionTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetaFormaPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDetaFormaPago.add(this.jCheckBoxConAltoMaximoTablaTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetaFormaPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDetaFormaPago.add(this.jComboBoxTiposArchivosReportesTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetaFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDetaFormaPago.add(this.jPanelParametrosAuxiliar1TipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetaFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDetaFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoDetaFormaPago.add(this.jComboBoxTiposReportesTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetaFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDetaFormaPago.add(this.jPanelParametrosAuxiliar4TipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetaFormaPago.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDetaFormaPago.add(this.jComboBoxTiposReportesTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetaFormaPago.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDetaFormaPago.add(this.jCheckBoxGenerarReporteTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetaFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDetaFormaPago.add(this.jPanelParametrosAuxiliar2TipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDetaFormaPago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDetaFormaPago.add(this.jLabelAccionesTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
				this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoDetaFormaPago.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoDetaFormaPago.add(this.jButtonAbrirOrderByTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetaFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDetaFormaPago.add(this.jComboBoxTiposSeleccionarTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);			
			
			
			/*
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDetaFormaPago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDetaFormaPago.add(this.jCheckBoxSeleccionarTodosTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetaFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDetaFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoDetaFormaPago.add(this.jCheckBoxSeleccionarTodosTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);															
				
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetaFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDetaFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoDetaFormaPago.add(this.jCheckBoxSeleccionadosTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetaFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDetaFormaPago.add(this.jPanelParametrosAuxiliar3TipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetaFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDetaFormaPago.add(this.jComboBoxTiposRelacionesTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
				
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetaFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDetaFormaPago.add(this.jComboBoxTiposAccionesTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
	
				
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetaFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDetaFormaPago.add(this.jTextFieldValorCampoGeneralTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoDetaFormaPago = new GridBagLayout();

			this.jScrollPanelDatosTipoDetaFormaPago.setLayout(gridaBagLayoutDatosTipoDetaFormaPago);
			
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetaFormaPago.gridy = 0;
			this.gridBagConstraintsTipoDetaFormaPago.gridx = 0;
			
			this.jScrollPanelDatosTipoDetaFormaPago.add(this.jTableDatosTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoDetaFormaPago.setViewportView(this.jTableDatosTipoDetaFormaPago);
		this.jTableDatosTipoDetaFormaPago.setFillsViewportHeight(true);
		this.jTableDatosTipoDetaFormaPago.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoDetaFormaPago= new GridBagLayout();
		this.jPanelAccionesTipoDetaFormaPago.setLayout(gridaBagLayoutAccionesTipoDetaFormaPago);
		
		
		/*	
		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetaFormaPago.gridy = 0;
		this.gridBagConstraintsTipoDetaFormaPago.gridx = 0;
			
		this.jPanelAccionesTipoDetaFormaPago.add(this.jButtonNuevoTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoTipoDetaFormaPago= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoTipoDetaFormaPago.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoDetaFormaPago.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoDetaFormaPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoTipoDetaFormaPago.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoTipoDetaFormaPago.setLayout(gridaBagLayoutBusquedaPorCodigoTipoDetaFormaPago);

		gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		gridBagConstraintsTipoDetaFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDetaFormaPago.gridy = 0;
		gridBagConstraintsTipoDetaFormaPago.gridx = 0;
		jPanelBusquedaPorCodigoTipoDetaFormaPago.add(jLabelcodigoBusquedaPorCodigoTipoDetaFormaPago, gridBagConstraintsTipoDetaFormaPago);

		gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		gridBagConstraintsTipoDetaFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDetaFormaPago.gridy = 0;
		gridBagConstraintsTipoDetaFormaPago.gridx = 1;
		jPanelBusquedaPorCodigoTipoDetaFormaPago.add(jTextFieldcodigoBusquedaPorCodigoTipoDetaFormaPago, gridBagConstraintsTipoDetaFormaPago);

		gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		gridBagConstraintsTipoDetaFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDetaFormaPago.gridy = 1;
		gridBagConstraintsTipoDetaFormaPago.gridx =1;
		jPanelBusquedaPorCodigoTipoDetaFormaPago.add(jButtonBusquedaPorCodigoTipoDetaFormaPago, gridBagConstraintsTipoDetaFormaPago);

		jTabbedPaneBusquedasTipoDetaFormaPago.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoTipoDetaFormaPago);
		jTabbedPaneBusquedasTipoDetaFormaPago.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoDetaFormaPago= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoDetaFormaPago.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoDetaFormaPago.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoDetaFormaPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoDetaFormaPago.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoDetaFormaPago.setLayout(gridaBagLayoutBusquedaPorNombreTipoDetaFormaPago);

		gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		gridBagConstraintsTipoDetaFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDetaFormaPago.gridy = 0;
		gridBagConstraintsTipoDetaFormaPago.gridx = 0;
		jPanelBusquedaPorNombreTipoDetaFormaPago.add(jLabelnombreBusquedaPorNombreTipoDetaFormaPago, gridBagConstraintsTipoDetaFormaPago);

		gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		gridBagConstraintsTipoDetaFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDetaFormaPago.gridy = 0;
		gridBagConstraintsTipoDetaFormaPago.gridx = 1;
		jPanelBusquedaPorNombreTipoDetaFormaPago.add(jTextAreanombreBusquedaPorNombreTipoDetaFormaPago, gridBagConstraintsTipoDetaFormaPago);

		gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		gridBagConstraintsTipoDetaFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDetaFormaPago.gridy = 1;
		gridBagConstraintsTipoDetaFormaPago.gridx =1;
		jPanelBusquedaPorNombreTipoDetaFormaPago.add(jButtonBusquedaPorNombreTipoDetaFormaPago, gridBagConstraintsTipoDetaFormaPago);

		jTabbedPaneBusquedasTipoDetaFormaPago.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreTipoDetaFormaPago);
		jTabbedPaneBusquedasTipoDetaFormaPago.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoDetaFormaPago = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoDetaFormaPago);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();						
			this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDetaFormaPago.gridx = 0;		
			//this.gridBagConstraintsTipoDetaFormaPago.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetaFormaPago.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoDetaFormaPago.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoDetaFormaPago.gridx = 0;		
		//this.gridBagConstraintsTipoDetaFormaPago.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetaFormaPago.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoDetaFormaPago.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoDetaFormaPago);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDetaFormaPago.gridx = 0;		
			this.gridBagConstraintsTipoDetaFormaPago.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetaFormaPago.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoDetaFormaPago.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDetaFormaPago.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);								
		
		
		/*
		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDetaFormaPago.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
		*/		
		
		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaFormaPago.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoDetaFormaPago.gridx =0;
		this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoDetaFormaPago.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
				
		
		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDetaFormaPago.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoDetaFormaPagoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoDetaFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoDetaFormaPago = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoDetaFormaPago.setLayout(gridaBagLayoutBusquedasParametrosTipoDetaFormaPago);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoDetaFormaPago=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoDetaFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDetaFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDetaFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDetaFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
			
			
		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDetaFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
		
			
		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaFormaPago.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoDetaFormaPago.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoDetaFormaPago;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoDetaFormaPago() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoDetaFormaPago = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoDetaFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoDetaFormaPago.setName("jPanelReporteDinamicoTipoDetaFormaPago"); 
		
		this.jPanelReporteDinamicoTipoDetaFormaPago.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoDetaFormaPago.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoDetaFormaPago.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoDetaFormaPago.setLayout(gridaBagLayoutReporteDinamicoTipoDetaFormaPago);
		
		
		this.jInternalFrameReporteDinamicoTipoDetaFormaPago= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoDetaFormaPago = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoDetaFormaPago= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoDetaFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoDetaFormaPago.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoDetaFormaPago.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoDetaFormaPago.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoDetaFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoDetaFormaPago.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoDetaFormaPago.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoDetaFormaPago.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoDetaFormaPago.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoDetaFormaPago.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoDetaFormaPago.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Detalle Forma Pagos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoDetaFormaPago = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoDetaFormaPago.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetaFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDetaFormaPago.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoDetaFormaPago.add(this.jLabelColumnasSelectReporteTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoDetaFormaPago = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoDetaFormaPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoDetaFormaPago.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoDetaFormaPago.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoDetaFormaPago.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoDetaFormaPago.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoDetaFormaPago=new JScrollPane(this.jListColumnasSelectReporteTipoDetaFormaPago);
			
			this.jScrollColumnasSelectReporteTipoDetaFormaPago.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoDetaFormaPago.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoDetaFormaPago.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetaFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDetaFormaPago.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoDetaFormaPago.add(this.jListColumnasSelectReporteTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
		this.jPanelReporteDinamicoTipoDetaFormaPago.add(this.jScrollColumnasSelectReporteTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoDetaFormaPago = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoDetaFormaPago.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoDetaFormaPago = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoDetaFormaPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoDetaFormaPago.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoDetaFormaPago.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoDetaFormaPago.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoDetaFormaPago.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoDetaFormaPago=new JScrollPane(this.jListRelacionesSelectReporteTipoDetaFormaPago);
			
			this.jScrollRelacionesSelectReporteTipoDetaFormaPago.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoDetaFormaPago.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoDetaFormaPago.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoDetaFormaPago = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoDetaFormaPago = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoDetaFormaPago = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoDetaFormaPago = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoDetaFormaPago.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoDetaFormaPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoDetaFormaPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoDetaFormaPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoDetaFormaPago = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoDetaFormaPago.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoDetaFormaPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoDetaFormaPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoDetaFormaPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoDetaFormaPago = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoDetaFormaPago.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetaFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDetaFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoDetaFormaPago.add(this.jLabelGenerarExcelReporteDinamicoTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoDetaFormaPago = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoDetaFormaPago.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoDetaFormaPago,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoDetaFormaPago.setToolTipText("Generar EXCEL"+" "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoDetaFormaPago.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoDetaFormaPago.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoDetaFormaPago.add(this.jButtonGenerarExcelReporteDinamicoTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetaFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDetaFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDetaFormaPago.add(this.jComboBoxTiposReportesDinamicoTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoDetaFormaPago = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoDetaFormaPago.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetaFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDetaFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoDetaFormaPago.add(this.jLabelTiposArchivoReporteDinamicoTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetaFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDetaFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDetaFormaPago.add(this.jComboBoxTiposArchivosReportesDinamicoTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoDetaFormaPago = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoDetaFormaPago.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoDetaFormaPago,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoDetaFormaPago.setToolTipText("Generar"+" "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetaFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDetaFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDetaFormaPago.add(this.jButtonGenerarReporteDinamicoTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoDetaFormaPago = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoDetaFormaPago.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoDetaFormaPago,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoDetaFormaPago.setToolTipText("Cancelar"+" "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetaFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDetaFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDetaFormaPago.add(this.jButtonCerrarReporteDinamicoTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoDetaFormaPago = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoDetaFormaPago= new JScrollPane(jPanelReporteDinamicoTipoDetaFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoDetaFormaPago.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoDetaFormaPago.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoDetaFormaPago.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Detalle Forma Pagos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaFormaPago.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoDetaFormaPago.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoDetaFormaPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoDetaFormaPago.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoDetaFormaPago);
		this.jInternalFrameReporteDinamicoTipoDetaFormaPago.getContentPane().add(this.jScrollPanelReporteDinamicoTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoDetaFormaPago() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoDetaFormaPago = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoDetaFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoDetaFormaPago.setName("jPanelImportacionTipoDetaFormaPago"); 
		
		this.jPanelImportacionTipoDetaFormaPago.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoDetaFormaPago.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoDetaFormaPago.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoDetaFormaPago.setLayout(gridaBagLayoutImportacionTipoDetaFormaPago);
		
		
		this.jInternalFrameImportacionTipoDetaFormaPago= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoDetaFormaPago= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoDetaFormaPago = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoDetaFormaPago= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoDetaFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoDetaFormaPago.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoDetaFormaPago.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoDetaFormaPago.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoDetaFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoDetaFormaPago.setResizable(true);
	    this.jInternalFrameImportacionTipoDetaFormaPago.setClosable(true);
	    this.jInternalFrameImportacionTipoDetaFormaPago.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoDetaFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoDetaFormaPago.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoDetaFormaPago.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoDetaFormaPago.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoDetaFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoDetaFormaPago.setResizable(true);
	    this.jInternalFrameImportacionTipoDetaFormaPago.setClosable(true);
	    this.jInternalFrameImportacionTipoDetaFormaPago.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoDetaFormaPago.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoDetaFormaPago.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoDetaFormaPago.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Detalle Forma Pagos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoDetaFormaPago = new JLabelMe();

		this.jLabelArchivoImportacionTipoDetaFormaPago.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetaFormaPago.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoDetaFormaPago.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoDetaFormaPago.add(this.jLabelArchivoImportacionTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoDetaFormaPago = new JFileChooser();		
		this.jFileChooserImportacionTipoDetaFormaPago.setToolTipText("ESCOGER ARCHIVO"+" "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoDetaFormaPago = new JButtonMe();
		this.jButtonAbrirImportacionTipoDetaFormaPago.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoDetaFormaPago,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoDetaFormaPago.setToolTipText("Generar"+" "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetaFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDetaFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDetaFormaPago.add(this.jButtonAbrirImportacionTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoDetaFormaPago = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoDetaFormaPago.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetaFormaPago.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoDetaFormaPago.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoDetaFormaPago.add(this.jLabelPathArchivoImportacionTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoDetaFormaPago=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoDetaFormaPago.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoDetaFormaPago.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoDetaFormaPago.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetaFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDetaFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDetaFormaPago.add(this.jTextFieldPathArchivoImportacionTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoDetaFormaPago = new JButtonMe();
		this.jButtonGenerarImportacionTipoDetaFormaPago.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoDetaFormaPago,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoDetaFormaPago.setToolTipText("Generar"+" "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetaFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDetaFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDetaFormaPago.add(this.jButtonGenerarImportacionTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoDetaFormaPago = new JButtonMe();
		this.jButtonCerrarImportacionTipoDetaFormaPago.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoDetaFormaPago,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoDetaFormaPago.setToolTipText("Cancelar"+" "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetaFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDetaFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDetaFormaPago.add(this.jButtonCerrarImportacionTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoDetaFormaPago = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoDetaFormaPago= new JScrollPane(jPanelImportacionTipoDetaFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoDetaFormaPago.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoDetaFormaPago.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoDetaFormaPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoDetaFormaPago.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoDetaFormaPago);
		this.jInternalFrameImportacionTipoDetaFormaPago.getContentPane().add(this.jScrollPanelImportacionTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoDetaFormaPago(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoDetaFormaPago = new JButtonMe();
			this.jButtonAbrirOrderByTipoDetaFormaPago.setText("Orden");
			this.jButtonAbrirOrderByTipoDetaFormaPago.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoDetaFormaPago,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoDetaFormaPago";
			inputMap = this.jButtonAbrirOrderByTipoDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoDetaFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoDetaFormaPago"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoDetaFormaPago = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoDetaFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoDetaFormaPago.setName("jPanelOrderByTipoDetaFormaPago"); 
			
			this.jPanelOrderByTipoDetaFormaPago.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoDetaFormaPago.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoDetaFormaPago.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoDetaFormaPago.setLayout(gridaBagLayoutOrderByTipoDetaFormaPago);
			
			
			this.jTableDatosTipoDetaFormaPagoOrderBy = new JTableMe();        
			this.jTableDatosTipoDetaFormaPagoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoDetaFormaPagoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoDetaFormaPagoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoDetaFormaPagoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoDetaFormaPagoOrderBy.setViewportView(this.jTableDatosTipoDetaFormaPagoOrderBy);
			this.jTableDatosTipoDetaFormaPagoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoDetaFormaPagoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoDetaFormaPago= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoDetaFormaPago= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoDetaFormaPago = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoDetaFormaPago= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoDetaFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoDetaFormaPago.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoDetaFormaPago.setTitle("Orden");
			this.jInternalFrameOrderByTipoDetaFormaPago.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoDetaFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoDetaFormaPago.setResizable(true);
			this.jInternalFrameOrderByTipoDetaFormaPago.setClosable(true);
			this.jInternalFrameOrderByTipoDetaFormaPago.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoDetaFormaPago.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoDetaFormaPago.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoDetaFormaPago.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Detalle Forma Pagos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaFormaPago.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoDetaFormaPago.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoDetaFormaPago.ipady =150;
				
			this.jPanelOrderByTipoDetaFormaPago.add(jScrollPanelDatosTipoDetaFormaPagoOrderBy, this.gridBagConstraintsTipoDetaFormaPago);//this.jTableDatosTipoDetaFormaPagoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoDetaFormaPago = new JButtonMe();
			this.jButtonCerrarOrderByTipoDetaFormaPago.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoDetaFormaPago,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoDetaFormaPago.setToolTipText("Cancelar"+" "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetaFormaPago.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoDetaFormaPago.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoDetaFormaPago.add(this.jButtonCerrarOrderByTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoDetaFormaPago = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoDetaFormaPago= new JScrollPane(jPanelOrderByTipoDetaFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoDetaFormaPago.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoDetaFormaPago.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoDetaFormaPago.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoDetaFormaPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoDetaFormaPago.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoDetaFormaPago);
			
			this.jInternalFrameOrderByTipoDetaFormaPago.getContentPane().add(this.jScrollPanelOrderByTipoDetaFormaPago, this.gridBagConstraintsTipoDetaFormaPago);			
		
		} else {
			this.jButtonAbrirOrderByTipoDetaFormaPago = new JButtonMe();
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
		int iWidthTableCalculado=0;//830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipodetaformapagoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoDetaFormaPago.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoDetaFormaPago.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoDetaFormaPago.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoDetaFormaPago.getRowHeight();//TipoDetaFormaPagoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoDetaFormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoDetaFormaPago.isSelected()) {
					iHeightTable=TipoDetaFormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoDetaFormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoDetaFormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoDetaFormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoDetaFormaPago.isSelected()) {
					iHeightTable=TipoDetaFormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoDetaFormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoDetaFormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoDetaFormaPago.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoDetaFormaPago.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoDetaFormaPago.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoDetaFormaPago.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoDetaFormaPago.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoDetaFormaPago.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoDetaFormaPago!=null && this.jInternalFrameOrderByTipoDetaFormaPago.getjTableDatosOrderBy()!=null) {
			//if(!this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoDetaFormaPago.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoDetaFormaPago.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoDetaFormaPago.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoDetaFormaPago.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoDetaFormaPago.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoDetaFormaPago.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoDetaFormaPago.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoDetaFormaPago.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoDetaFormaPago.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoDetaFormaPago.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipodetaformapagoLogic.getTipoDetaFormaPagos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodetaformapagos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoDetaFormaPago> TraerTipoDetaFormaPagoBeans(List<TipoDetaFormaPago> tipodetaformapagos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoDetaFormaPago tipodetaformapago:tipodetaformapagos) {
					
				if(!(TipoDetaFormaPagoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoDetaFormaPagoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipodetaformapago.setsDetalleGeneralEntityReporte(TipoDetaFormaPagoConstantesFunciones.getTipoDetaFormaPagoDescripcion(tipodetaformapago));
										
						
					
						
					
				} else  {
							
					//tipodetaformapago.setsDetalleGeneralEntityReporte(tipodetaformapago.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipodetaformapagobeans.add(tipodetaformapagobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipodetaformapagos;
    }
	//PARA REPORTES FIN
}
