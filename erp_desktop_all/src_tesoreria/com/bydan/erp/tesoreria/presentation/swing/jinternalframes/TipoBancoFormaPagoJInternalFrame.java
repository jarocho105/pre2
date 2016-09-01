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
import com.bydan.erp.tesoreria.util.TipoBancoFormaPagoConstantesFunciones;

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
public class TipoBancoFormaPagoJInternalFrame extends TipoBancoFormaPagoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoBancoFormaPago;
	
	protected JMenuBar jmenuBarTipoBancoFormaPago;
	
	protected JMenu jmenuTipoBancoFormaPago;
	protected JMenu jmenuDatosTipoBancoFormaPago;
	protected JMenu jmenuArchivoTipoBancoFormaPago;
	protected JMenu jmenuAccionesTipoBancoFormaPago;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoBancoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoBancoFormaPago;	
	protected GridBagConstraints gridBagConstraintsTipoBancoFormaPago;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoBancoFormaPagoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoBancoFormaPago;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoBancoFormaPago;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoBancoFormaPago;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoBancoFormaPagoSessionBean tipobancoformapagoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoBancoFormaPago> tipobancoformapagos;		
	public List<TipoBancoFormaPago> tipobancoformapagosEliminados;	
	public List<TipoBancoFormaPago> tipobancoformapagosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoBancoFormaPago;		
	protected JButton jButtonAbrirOrderByTipoBancoFormaPago;
	
	
	//protected JPanel jPanelOrderByTipoBancoFormaPago;
	//public JScrollPane jScrollPanelOrderByTipoBancoFormaPago;	
	//protected JButton jButtonCerrarOrderByTipoBancoFormaPago;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoBancoFormaPagoLogic tipobancoformapagoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoBancoFormaPago;
	public JScrollPane jScrollPanelDatosEdicionTipoBancoFormaPago;
	public JScrollPane jScrollPanelDatosGeneralTipoBancoFormaPago;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoBancoFormaPagoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoBancoFormaPago;
	//public JScrollPane jScrollPanelImportacionTipoBancoFormaPago;
	
	
	
	protected JPanel jPanelAccionesTipoBancoFormaPago;
	
    protected JPanel jPanelPaginacionTipoBancoFormaPago;
    protected JPanel jPanelParametrosReportesTipoBancoFormaPago;
	protected JPanel jPanelParametrosReportesAccionesTipoBancoFormaPago;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoBancoFormaPago;
	protected JPanel jPanelParametrosAuxiliar2TipoBancoFormaPago;
	protected JPanel jPanelParametrosAuxiliar3TipoBancoFormaPago;
	protected JPanel jPanelParametrosAuxiliar4TipoBancoFormaPago;
	//protected JPanel jPanelParametrosAuxiliar5TipoBancoFormaPago;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoBancoFormaPago;
	//protected JPanel jPanelImportacionTipoBancoFormaPago;
	
	
	public JTable jTableDatosTipoBancoFormaPago;
	
	
	
	//public JTable jTableDatosTipoBancoFormaPagoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoBancoFormaPago;
	protected JButton jButtonDuplicarTipoBancoFormaPago;
	protected JButton jButtonCopiarTipoBancoFormaPago;
	protected JButton jButtonVerFormTipoBancoFormaPago;
	protected JButton jButtonNuevoRelacionesTipoBancoFormaPago;
	protected JButton jButtonModificarTipoBancoFormaPago;
	
    protected JButton jButtonGuardarCambiosTablaTipoBancoFormaPago;
	protected JButton jButtonCerrarTipoBancoFormaPago;
	
	
	protected JButton jButtonRecargarInformacionTipoBancoFormaPago;
	protected JButton jButtonProcesarInformacionTipoBancoFormaPago;
	
	
	protected JButton jButtonAnterioresTipoBancoFormaPago;
	protected JButton jButtonSiguientesTipoBancoFormaPago;
	protected JButton jButtonNuevoGuardarCambiosTipoBancoFormaPago;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoBancoFormaPago;
	//protected JButton jButtonCerrarReporteDinamicoTipoBancoFormaPago;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoBancoFormaPago;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoBancoFormaPago;
	//protected JButton jButtonGenerarImportacionTipoBancoFormaPago;
	//protected JButton jButtonCerrarImportacionTipoBancoFormaPago;
	//protected JFileChooser jFileChooserImportacionTipoBancoFormaPago;
	//protected File fileImportacionTipoBancoFormaPago;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoBancoFormaPago;
	protected JButton jButtonDuplicarToolBarTipoBancoFormaPago;
	protected JButton jButtonNuevoRelacionesToolBarTipoBancoFormaPago;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoBancoFormaPago;
	protected JButton jButtonCopiarToolBarTipoBancoFormaPago;
	protected JButton jButtonVerFormToolBarTipoBancoFormaPago;
	public JButton jButtonGuardarCambiosTablaToolBarTipoBancoFormaPago;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoBancoFormaPago;
	protected JButton jButtonCerrarToolBarTipoBancoFormaPago;
	
	protected JButton jButtonRecargarInformacionToolBarTipoBancoFormaPago;
	protected JButton jButtonProcesarInformacionToolBarTipoBancoFormaPago;
	protected JButton jButtonAnterioresToolBarTipoBancoFormaPago;
	protected JButton jButtonSiguientesToolBarTipoBancoFormaPago;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoBancoFormaPago;
	protected JButton jButtonAbrirOrderByToolBarTipoBancoFormaPago;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoBancoFormaPago;
	protected JMenuItem jMenuItemDuplicarTipoBancoFormaPago;
	protected JMenuItem jMenuItemNuevoRelacionesTipoBancoFormaPago;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoBancoFormaPago;
	protected JMenuItem jMenuItemCopiarTipoBancoFormaPago;
	protected JMenuItem jMenuItemVerFormTipoBancoFormaPago;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoBancoFormaPago;
	protected JMenuItem jMenuItemCerrarTipoBancoFormaPago;
	protected JMenuItem jMenuItemDetalleCerrarTipoBancoFormaPago;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoBancoFormaPago;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoBancoFormaPago;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoBancoFormaPago;
	protected JMenuItem jMenuItemProcesarInformacionTipoBancoFormaPago;
	protected JMenuItem jMenuItemAnterioresTipoBancoFormaPago;
	protected JMenuItem jMenuItemSiguientesTipoBancoFormaPago;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoBancoFormaPago;
	protected JMenuItem jMenuItemAbrirOrderByTipoBancoFormaPago;
	protected JMenuItem jMenuItemMostrarOcultarTipoBancoFormaPago;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoBancoFormaPago;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoBancoFormaPago;
	protected JCheckBox jCheckBoxSeleccionadosTipoBancoFormaPago;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoBancoFormaPago;
	protected JCheckBox jCheckBoxConGraficoReporteTipoBancoFormaPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoBancoFormaPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoBancoFormaPago;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoBancoFormaPago;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoBancoFormaPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoBancoFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoBancoFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoBancoFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoBancoFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoBancoFormaPago;
	protected JTextField jTextFieldValorCampoGeneralTipoBancoFormaPago;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoBancoFormaPago;
	//public JList<Reporte> jListColumnasSelectReporteTipoBancoFormaPago;
	//public JScrollPane jScrollColumnasSelectReporteTipoBancoFormaPago;
	
	//public JLabel jLabelRelacionesSelectReporteTipoBancoFormaPago;
	//public JList<Reporte> jListRelacionesSelectReporteTipoBancoFormaPago;
	//public JScrollPane jScrollRelacionesSelectReporteTipoBancoFormaPago;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoBancoFormaPago;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoBancoFormaPago;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoBancoFormaPago;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoBancoFormaPago;
	
		
	//public JLabel jLabelArchivoImportacionTipoBancoFormaPago;	
	//public JLabel jLabelPathArchivoImportacionTipoBancoFormaPago;
	//protected JTextField jTextFieldPathArchivoImportacionTipoBancoFormaPago;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoBancoFormaPago;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoBancoFormaPago;
	
	//public JLabel jLabelColumnaCategoriaValorTipoBancoFormaPago;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoBancoFormaPago;
	
	//public JLabel jLabelColumnasValoresGraficoTipoBancoFormaPago;
	//public JList<Reporte> jListColumnasValoresGraficoTipoBancoFormaPago;
	//public JScrollPane jScrollColumnasValoresGraficoTipoBancoFormaPago;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoBancoFormaPago;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoBancoFormaPago;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoBancoFormaPago;
	
	
	
	
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
	public TipoBancoFormaPagoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoBancoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoBancoFormaPagoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoBancoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoBancoFormaPagoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoBancoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoBancoFormaPagoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoBancoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoBancoFormaPago)	{
		this.jButtonRecargarInformacionTipoBancoFormaPago = jButtonRecargarInformacionTipoBancoFormaPago;
	}
	
	public JButton getjButtonProcesarInformacionTipoBancoFormaPago() {
		return this.jButtonProcesarInformacionTipoBancoFormaPago;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoBancoFormaPago)	{
		this.jButtonProcesarInformacionTipoBancoFormaPago = jButtonProcesarInformacionTipoBancoFormaPago;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoBancoFormaPago() {
		return this.jButtonRecargarInformacionTipoBancoFormaPago;
	}
	
	
	public List<TipoBancoFormaPago> gettipobancoformapagos() {
		return this.tipobancoformapagos;
	}

	public void settipobancoformapagos(List<TipoBancoFormaPago> tipobancoformapagos) {
		this.tipobancoformapagos = tipobancoformapagos;
	}
	
	public List<TipoBancoFormaPago> gettipobancoformapagosAux() {
		return this.tipobancoformapagosAux;
	}

	public void settipobancoformapagosAux(List<TipoBancoFormaPago> tipobancoformapagosAux) {
		this.tipobancoformapagosAux = tipobancoformapagosAux;
	}
	
	public List<TipoBancoFormaPago> gettipobancoformapagosEliminados() {
		return this.tipobancoformapagosEliminados;
	}

	public void setTipoBancoFormaPagosEliminados(List<TipoBancoFormaPago> tipobancoformapagosEliminados) {
		this.tipobancoformapagosEliminados = tipobancoformapagosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoBancoFormaPago() {
		return jComboBoxTiposSeleccionarTipoBancoFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoBancoFormaPago(
			JComboBox jComboBoxTiposSeleccionarTipoBancoFormaPago) {
		this.jComboBoxTiposSeleccionarTipoBancoFormaPago = jComboBoxTiposSeleccionarTipoBancoFormaPago;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoBancoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoBancoFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoBancoFormaPago .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoBancoFormaPago() {
		return jTextFieldValorCampoGeneralTipoBancoFormaPago;
	}

	public void setjTextFieldValorCampoGeneralTipoBancoFormaPago(
			JTextField jTextFieldValorCampoGeneralTipoBancoFormaPago) {
		this.jTextFieldValorCampoGeneralTipoBancoFormaPago = jTextFieldValorCampoGeneralTipoBancoFormaPago;
	}

	public void setBorderResaltarValorCampoGeneralTipoBancoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBancoFormaPago.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoBancoFormaPago .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoBancoFormaPago() {
		return this.jCheckBoxSeleccionarTodosTipoBancoFormaPago;
	}

	public void setjCheckBoxSeleccionarTodosTipoBancoFormaPago(
			JCheckBox jCheckBoxSeleccionarTodosTipoBancoFormaPago) {
		this.jCheckBoxSeleccionarTodosTipoBancoFormaPago = jCheckBoxSeleccionarTodosTipoBancoFormaPago;
	}

	public void setBorderResaltarSeleccionarTodosTipoBancoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBancoFormaPago.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoBancoFormaPago .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoBancoFormaPago() {
		return this.jCheckBoxSeleccionadosTipoBancoFormaPago;
	}

	public void setjCheckBoxSeleccionadosTipoBancoFormaPago(
			JCheckBox jCheckBoxSeleccionadosTipoBancoFormaPago) {
		this.jCheckBoxSeleccionadosTipoBancoFormaPago = jCheckBoxSeleccionadosTipoBancoFormaPago;
	}
	
	public void setBorderResaltarSeleccionadosTipoBancoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBancoFormaPago.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoBancoFormaPago .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoBancoFormaPago() {
		return this.jComboBoxTiposArchivosReportesTipoBancoFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoBancoFormaPago(
			JComboBox jComboBoxTiposArchivosReportesTipoBancoFormaPago) {
		this.jComboBoxTiposArchivosReportesTipoBancoFormaPago = jComboBoxTiposArchivosReportesTipoBancoFormaPago;
	}

	public void setBorderResaltarTiposArchivosReportesTipoBancoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBancoFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoBancoFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoBancoFormaPago() {
		return this.jComboBoxTiposReportesTipoBancoFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoBancoFormaPago(
			JComboBox jComboBoxTiposReportesTipoBancoFormaPago) {
		this.jComboBoxTiposReportesTipoBancoFormaPago = jComboBoxTiposReportesTipoBancoFormaPago;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoBancoFormaPago() {
	//	return jComboBoxTiposReportesDinamicoTipoBancoFormaPago;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoBancoFormaPago(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoBancoFormaPago) {
	//	this.jComboBoxTiposReportesDinamicoTipoBancoFormaPago = jComboBoxTiposReportesDinamicoTipoBancoFormaPago;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoBancoFormaPago() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoBancoFormaPago;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoBancoFormaPago(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoBancoFormaPago) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoBancoFormaPago = jComboBoxTiposArchivosReportesDinamicoTipoBancoFormaPago;
	//}
	
	public void setBorderResaltarTiposReportesTipoBancoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBancoFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoBancoFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoBancoFormaPago() {
		return this.jComboBoxTiposGraficosReportesTipoBancoFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoBancoFormaPago(
			JComboBox jComboBoxTiposGraficosReportesTipoBancoFormaPago) {
		this.jComboBoxTiposGraficosReportesTipoBancoFormaPago = jComboBoxTiposGraficosReportesTipoBancoFormaPago;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoBancoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBancoFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoBancoFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoBancoFormaPago() {
		return this.jComboBoxTiposPaginacionTipoBancoFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoBancoFormaPago(
			JComboBox jComboBoxTiposPaginacionTipoBancoFormaPago) {
		this.jComboBoxTiposPaginacionTipoBancoFormaPago = jComboBoxTiposPaginacionTipoBancoFormaPago;
	}
	
	public void setBorderResaltarTiposPaginacionTipoBancoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBancoFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoBancoFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoBancoFormaPago() {
		return this.jComboBoxTiposRelacionesTipoBancoFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoBancoFormaPago() {
		return this.jComboBoxTiposAccionesTipoBancoFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoBancoFormaPago(
			JComboBox jComboBoxTiposRelacionesTipoBancoFormaPago) {
		this.jComboBoxTiposRelacionesTipoBancoFormaPago = jComboBoxTiposRelacionesTipoBancoFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoBancoFormaPago(
			JComboBox jComboBoxTiposAccionesTipoBancoFormaPago) {
		this.jComboBoxTiposAccionesTipoBancoFormaPago = jComboBoxTiposAccionesTipoBancoFormaPago;
	}
	
	public void setBorderResaltarTiposRelacionesTipoBancoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBancoFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoBancoFormaPago .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoBancoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBancoFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoBancoFormaPago .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoBancoFormaPago() {
	//	return jCheckBoxConGraficoDinamicoTipoBancoFormaPago;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoBancoFormaPago(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoBancoFormaPago) {
	//	this.jCheckBoxConGraficoDinamicoTipoBancoFormaPago = jCheckBoxConGraficoDinamicoTipoBancoFormaPago;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoBancoFormaPago() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoBancoFormaPago.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoBancoFormaPago .setBorder(borderResaltar);		
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
		this.tipobancoformapagoSessionBean=new TipoBancoFormaPagoSessionBean();
		
		this.tipobancoformapagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipobancoformapagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipobancoformapagoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoBancoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoBancoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoBancoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoBancoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoBancoFormaPagoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Banco Forma Pago MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoBancoFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoBancoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoBancoFormaPago= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoBancoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoBancoFormaPago,this.jTtoolBarTipoBancoFormaPago,
							"nuevo","nuevo","Nuevo"+" "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoBancoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoBancoFormaPago,this.jTtoolBarTipoBancoFormaPago,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoBancoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoBancoFormaPago,this.jTtoolBarTipoBancoFormaPago,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoBancoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoBancoFormaPago,this.jTtoolBarTipoBancoFormaPago,
							"duplicar","duplicar","Duplicar"+" "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoBancoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoBancoFormaPago,this.jTtoolBarTipoBancoFormaPago,
							"copiar","copiar","Copiar"+" "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoBancoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoBancoFormaPago,this.jTtoolBarTipoBancoFormaPago,
							"ver_form","ver_form","Ver"+" "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoBancoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoBancoFormaPago,this.jTtoolBarTipoBancoFormaPago,
							"recargar","recargar","Recargar"+" "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoBancoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoBancoFormaPago,this.jTtoolBarTipoBancoFormaPago,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoBancoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoBancoFormaPago,this.jTtoolBarTipoBancoFormaPago,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoBancoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoBancoFormaPago,this.jTtoolBarTipoBancoFormaPago,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoBancoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoBancoFormaPago,this.jTtoolBarTipoBancoFormaPago,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoBancoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoBancoFormaPago,this.jTtoolBarTipoBancoFormaPago,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoBancoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoBancoFormaPago,this.jTtoolBarTipoBancoFormaPago,
							"cerrar","cerrar","Salir"+" "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoBancoFormaPago=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoBancoFormaPago;
			
				this.jButtonProcesarInformacionToolBarTipoBancoFormaPago=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoBancoFormaPago;
				
		//protected JButton jButtonModificarToolBarTipoBancoFormaPago;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoBancoFormaPago=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoBancoFormaPago=new JMenuMe("General");
		this.jmenuArchivoTipoBancoFormaPago=new JMenuMe("Archivo");
		this.jmenuAccionesTipoBancoFormaPago=new JMenuMe("Acciones");
		this.jmenuDatosTipoBancoFormaPago=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoBancoFormaPago= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoBancoFormaPago.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoBancoFormaPago,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoBancoFormaPago= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoBancoFormaPago.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoBancoFormaPago,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoBancoFormaPago= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoBancoFormaPago.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoBancoFormaPago,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoBancoFormaPago= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoBancoFormaPago.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoBancoFormaPago,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoBancoFormaPago= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoBancoFormaPago.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoBancoFormaPago,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoBancoFormaPago= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoBancoFormaPago.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoBancoFormaPago,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoBancoFormaPago= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoBancoFormaPago.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoBancoFormaPago,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoBancoFormaPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoBancoFormaPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoBancoFormaPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoBancoFormaPago= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoBancoFormaPago.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoBancoFormaPago,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoBancoFormaPago= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoBancoFormaPago.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoBancoFormaPago,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoBancoFormaPago= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoBancoFormaPago.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoBancoFormaPago,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoBancoFormaPago= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoBancoFormaPago.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoBancoFormaPago,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoBancoFormaPago= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoBancoFormaPago.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoBancoFormaPago,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoBancoFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoBancoFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoBancoFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoBancoFormaPago= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoBancoFormaPago.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoBancoFormaPago,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoBancoFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoBancoFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoBancoFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoBancoFormaPago= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoBancoFormaPago.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoBancoFormaPago,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoBancoFormaPago.add(this.jMenuItemCerrarTipoBancoFormaPago);
			
			this.jmenuAccionesTipoBancoFormaPago.add(this.jMenuItemNuevoTipoBancoFormaPago);
			this.jmenuAccionesTipoBancoFormaPago.add(this.jMenuItemNuevoGuardarCambiosTipoBancoFormaPago);
			this.jmenuAccionesTipoBancoFormaPago.add(this.jMenuItemNuevoRelacionesTipoBancoFormaPago);
			this.jmenuAccionesTipoBancoFormaPago.add(this.jMenuItemGuardarCambiosTablaTipoBancoFormaPago);		
			this.jmenuAccionesTipoBancoFormaPago.add(this.jMenuItemDuplicarTipoBancoFormaPago);		
			this.jmenuAccionesTipoBancoFormaPago.add(this.jMenuItemCopiarTipoBancoFormaPago);		
			this.jmenuAccionesTipoBancoFormaPago.add(this.jMenuItemVerFormTipoBancoFormaPago);		
			
			this.jmenuDatosTipoBancoFormaPago.add(this.jMenuItemRecargarInformacionTipoBancoFormaPago);				
			this.jmenuDatosTipoBancoFormaPago.add(this.jMenuItemAnterioresTipoBancoFormaPago);				
			this.jmenuDatosTipoBancoFormaPago.add(this.jMenuItemSiguientesTipoBancoFormaPago);				
			this.jmenuDatosTipoBancoFormaPago.add(this.jMenuItemAbrirOrderByTipoBancoFormaPago);				
			this.jmenuDatosTipoBancoFormaPago.add(this.jMenuItemMostrarOcultarTipoBancoFormaPago);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoBancoFormaPago.add(this.jMenuItemGuardarCambiosTipoBancoFormaPago);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoBancoFormaPago.add(this.jmenuArchivoTipoBancoFormaPago);		
			this.jmenuBarTipoBancoFormaPago.add(this.jmenuAccionesTipoBancoFormaPago);		
			this.jmenuBarTipoBancoFormaPago.add(this.jmenuDatosTipoBancoFormaPago);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoBancoFormaPago);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoBancoFormaPago() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoBancoFormaPago=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoBancoFormaPago.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoBancoFormaPago.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoBancoFormaPago.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoBancoFormaPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoBancoFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoBancoFormaPago = new TipoBancoFormaPagoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Banco Forma Pago DATOS");
			this.jInternalFrameDetalleFormTipoBancoFormaPago = new TipoBancoFormaPagoDetalleFormJInternalFrame(jDesktopPane,this.tipobancoformapagoSessionBean.getConGuardarRelaciones(),this.tipobancoformapagoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoBancoFormaPago = null;//new TipoBancoFormaPagoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoBancoFormaPago= new GridBagLayout();
		
		
		this.jTableDatosTipoBancoFormaPago = new JTableMe();      
		
		String sToolTipTipoBancoFormaPago="";
		sToolTipTipoBancoFormaPago=TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoBancoFormaPago+="(Tesoreria.TipoBancoFormaPago)";
		}
		
		if(!this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoBancoFormaPago+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoBancoFormaPago.setToolTipText(sToolTipTipoBancoFormaPago);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoBancoFormaPago);
		this.jTableDatosTipoBancoFormaPago.setAutoCreateRowSorter(true);
		this.jTableDatosTipoBancoFormaPago.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoBancoFormaPago.setRowSelectionAllowed(true);
		this.jTableDatosTipoBancoFormaPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoBancoFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoBancoFormaPago = new JButtonMe();
		this.jButtonDuplicarTipoBancoFormaPago = new JButtonMe();
		this.jButtonCopiarTipoBancoFormaPago = new JButtonMe();
		this.jButtonVerFormTipoBancoFormaPago = new JButtonMe();
		this.jButtonNuevoRelacionesTipoBancoFormaPago = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoBancoFormaPago = new JButtonMe();
		this.jButtonCerrarTipoBancoFormaPago = new JButtonMe();
		
		this.jScrollPanelDatosTipoBancoFormaPago = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoBancoFormaPago = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoBancoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Banco Forma Pago";
		
		if(!this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Banco Forma Pagos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoBancoFormaPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoBancoFormaPago.setToolTipText("Acciones");
        this.jPanelAccionesTipoBancoFormaPago.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoBancoFormaPago=new ReporteDinamicoJInternalFrame(TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoBancoFormaPago();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoBancoFormaPago=new ImportacionJInternalFrame(TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoBancoFormaPago();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoBancoFormaPago = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoBancoFormaPago.setText("Orden");
		this.jButtonAbrirOrderByTipoBancoFormaPago.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoBancoFormaPago,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoBancoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoBancoFormaPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoBancoFormaPago,false,this);
			
			//this.cargarOrderByTipoBancoFormaPago(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoBancoFormaPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoBancoFormaPago,true,this);
			
			//this.cargarOrderByTipoBancoFormaPago(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoBancoFormaPago.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoBancoFormaPago.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoBancoFormaPago.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoBancoFormaPago.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoBancoFormaPago.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoBancoFormaPago.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoBancoFormaPago.setText("Nuevo");
		this.jButtonDuplicarTipoBancoFormaPago.setText("Duplicar");
		this.jButtonCopiarTipoBancoFormaPago.setText("Copiar");
		this.jButtonVerFormTipoBancoFormaPago.setText("Ver");
		this.jButtonNuevoRelacionesTipoBancoFormaPago.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoBancoFormaPago.setText("Guardar");
		this.jButtonCerrarTipoBancoFormaPago.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoBancoFormaPago,"nuevo_button","Nuevo",this.tipobancoformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoBancoFormaPago,"duplicar_button","Duplicar",this.tipobancoformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoBancoFormaPago,"copiar_button","Copiar",this.tipobancoformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoBancoFormaPago,"ver_form","Ver",this.tipobancoformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoBancoFormaPago,"nuevorelaciones_button","Nuevo Rel",this.tipobancoformapagoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoBancoFormaPago,"guardarcambiostabla_button","Guardar",this.tipobancoformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoBancoFormaPago,"cerrar_button","Salir",this.tipobancoformapagoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoBancoFormaPago.setToolTipText("Nuevo"+" "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoBancoFormaPago.setToolTipText("Duplicar"+" "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoBancoFormaPago.setToolTipText("Copiar"+" "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoBancoFormaPago.setToolTipText("Ver"+" "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoBancoFormaPago.setToolTipText("Nuevo Rel"+" "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoBancoFormaPago.setToolTipText("Guardar"+" "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoBancoFormaPago.setToolTipText("Salir"+" "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoBancoFormaPago";
		inputMap = this.jButtonNuevoTipoBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoBancoFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoBancoFormaPago"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoBancoFormaPago";
		inputMap = this.jButtonDuplicarTipoBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoBancoFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoBancoFormaPago"));
		
		//COPIAR
		sMapKey = "CopiarTipoBancoFormaPago";
		inputMap = this.jButtonCopiarTipoBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoBancoFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoBancoFormaPago"));
		
		//VEr FORM
		sMapKey = "VerFormTipoBancoFormaPago";
		inputMap = this.jButtonVerFormTipoBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoBancoFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoBancoFormaPago"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoBancoFormaPago";
		inputMap = this.jButtonNuevoRelacionesTipoBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoBancoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoBancoFormaPago"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoBancoFormaPago";
		inputMap = this.jButtonModificarTipoBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoBancoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoBancoFormaPago"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoBancoFormaPago";
		inputMap = this.jButtonCerrarTipoBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoBancoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoBancoFormaPago"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoBancoFormaPago";
		inputMap = this.jButtonGuardarCambiosTablaTipoBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoBancoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoBancoFormaPago"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoBancoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoBancoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoBancoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoBancoFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoBancoFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoBancoFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoBancoFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoBancoFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoBancoFormaPago.setName("jPanelParametrosReportesTipoBancoFormaPago"); 
		
		this.jPanelParametrosReportesAccionesTipoBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoBancoFormaPago.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoBancoFormaPago.setName("jPanelParametrosReportesAccionesTipoBancoFormaPago"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoBancoFormaPago = new JButtonMe();
		this.jButtonRecargarInformacionTipoBancoFormaPago.setText("Recargar");
		this.jButtonRecargarInformacionTipoBancoFormaPago.setToolTipText("Recargar"+" "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoBancoFormaPago,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoBancoFormaPago = new JButtonMe();
		this.jButtonProcesarInformacionTipoBancoFormaPago.setText("Procesar");
		this.jButtonProcesarInformacionTipoBancoFormaPago.setToolTipText("Procesar"+" "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoBancoFormaPago.setVisible(false);
			
		this.jButtonProcesarInformacionTipoBancoFormaPago.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoBancoFormaPago.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoBancoFormaPago.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoBancoFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoBancoFormaPago.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoBancoFormaPago.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoBancoFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoBancoFormaPago.setText("TIPO");       
		this.jComboBoxTiposReportesTipoBancoFormaPago.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoBancoFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoBancoFormaPago.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoBancoFormaPago.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoBancoFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoBancoFormaPago.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoBancoFormaPago.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoBancoFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoBancoFormaPago.setText("Accion");
		this.jComboBoxTiposRelacionesTipoBancoFormaPago.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoBancoFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoBancoFormaPago.setText("Accion");
		this.jComboBoxTiposAccionesTipoBancoFormaPago.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoBancoFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoBancoFormaPago.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoBancoFormaPago.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoBancoFormaPago=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoBancoFormaPago.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoBancoFormaPago.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoBancoFormaPago.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoBancoFormaPago = new JLabelMe();
		
		this.jLabelAccionesTipoBancoFormaPago.setText("Acciones");		
		this.jLabelAccionesTipoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoBancoFormaPago = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoBancoFormaPago.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoBancoFormaPago.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoBancoFormaPago = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoBancoFormaPago.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoBancoFormaPago.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoBancoFormaPago = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoBancoFormaPago.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoBancoFormaPago.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoBancoFormaPago = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoBancoFormaPago.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoBancoFormaPago.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoBancoFormaPago = new JButtonMe();
		//this.jButtonAnterioresTipoBancoFormaPago.setText("<<");
        this.jButtonAnterioresTipoBancoFormaPago.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoBancoFormaPago,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoBancoFormaPago = new JButtonMe();
		//this.jButtonSiguientesTipoBancoFormaPago.setText(">>");
        this.jButtonSiguientesTipoBancoFormaPago.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoBancoFormaPago,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoBancoFormaPago = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoBancoFormaPago.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoBancoFormaPago.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoBancoFormaPago,"nuevoguardarcambios_button","Nue",this.tipobancoformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoBancoFormaPago";
		inputMap = this.jButtonNuevoGuardarCambiosTipoBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoBancoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoBancoFormaPago"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoBancoFormaPago";
		inputMap = this.jButtonRecargarInformacionTipoBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoBancoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoBancoFormaPago"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoBancoFormaPago";
		inputMap = this.jButtonSiguientesTipoBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoBancoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoBancoFormaPago"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoBancoFormaPago";
		inputMap = this.jButtonAnterioresTipoBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoBancoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoBancoFormaPago"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoBancoFormaPago();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoBancoFormaPago.setMinimumSize(new Dimension(this.getWidth(),TipoBancoFormaPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoBancoFormaPagoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoBancoFormaPago.setMaximumSize(new Dimension(this.getWidth(),TipoBancoFormaPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoBancoFormaPagoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoBancoFormaPago.setPreferredSize(new Dimension(this.getWidth(),TipoBancoFormaPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoBancoFormaPagoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoBancoFormaPago = new GridBagLayout();

			this.jPanelPaginacionTipoBancoFormaPago.setLayout(gridaBagLayoutPaginacionTipoBancoFormaPago);						
			
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoFormaPago.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoFormaPago.gridy = 0;
			this.gridBagConstraintsTipoBancoFormaPago.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoBancoFormaPago.add(this.jButtonAnterioresTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
					
						
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoFormaPago.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoBancoFormaPago.gridy = 0;
			
			this.jPanelPaginacionTipoBancoFormaPago.add(this.jButtonNuevoGuardarCambiosTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
						
			
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoFormaPago.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoBancoFormaPago.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoBancoFormaPago.gridy = 0;
			this.jPanelPaginacionTipoBancoFormaPago.add(this.jButtonSiguientesTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoFormaPago.gridy = 1;
			this.gridBagConstraintsTipoBancoFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoBancoFormaPago.add(this.jButtonNuevoTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
				this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoBancoFormaPago.gridy = 1;
				this.gridBagConstraintsTipoBancoFormaPago.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoBancoFormaPago.add(this.jButtonNuevoRelacionesTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
			}
			
			
			if(!this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
				this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoBancoFormaPago.gridy = 1;
				this.gridBagConstraintsTipoBancoFormaPago.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoBancoFormaPago.add(this.jButtonGuardarCambiosTablaTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
			}
			
			
			
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoFormaPago.gridy = 1;
			this.gridBagConstraintsTipoBancoFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoBancoFormaPago.add(this.jButtonDuplicarTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
			
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoFormaPago.gridy = 1;
			this.gridBagConstraintsTipoBancoFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoBancoFormaPago.add(this.jButtonCopiarTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
		
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoFormaPago.gridy = 1;
			this.gridBagConstraintsTipoBancoFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoBancoFormaPago.add(this.jButtonVerFormTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
		
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoFormaPago.gridy = 1;
			this.gridBagConstraintsTipoBancoFormaPago.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoBancoFormaPago.add(this.jButtonCerrarTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
		
		
		
		this.jButtonRecargarInformacionTipoBancoFormaPago.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoBancoFormaPago.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoBancoFormaPago.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoBancoFormaPago.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoBancoFormaPago.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoBancoFormaPago.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoBancoFormaPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoBancoFormaPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoBancoFormaPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoBancoFormaPago.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoBancoFormaPago.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoBancoFormaPago.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoBancoFormaPago.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoBancoFormaPago.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoBancoFormaPago.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoBancoFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoBancoFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoBancoFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoBancoFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoBancoFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoBancoFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoBancoFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoBancoFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoBancoFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoBancoFormaPago.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoBancoFormaPago.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoBancoFormaPago.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoBancoFormaPago.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoBancoFormaPago.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoBancoFormaPago.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoBancoFormaPago.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoBancoFormaPago.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoBancoFormaPago.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoBancoFormaPago.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoBancoFormaPago.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoBancoFormaPago.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoBancoFormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoBancoFormaPago = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoBancoFormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoBancoFormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoBancoFormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoBancoFormaPago = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoBancoFormaPago.setLayout(gridaBagParametrosReportesTipoBancoFormaPago);
			this.jPanelParametrosReportesAccionesTipoBancoFormaPago.setLayout(gridaBagParametrosReportesAccionesTipoBancoFormaPago);
			
			
			this.jPanelParametrosAuxiliar1TipoBancoFormaPago.setLayout(gridaBagParametrosAuxiliar1TipoBancoFormaPago);
			this.jPanelParametrosAuxiliar2TipoBancoFormaPago.setLayout(gridaBagParametrosAuxiliar2TipoBancoFormaPago);
			this.jPanelParametrosAuxiliar3TipoBancoFormaPago.setLayout(gridaBagParametrosAuxiliar3TipoBancoFormaPago);
			this.jPanelParametrosAuxiliar4TipoBancoFormaPago.setLayout(gridaBagParametrosAuxiliar4TipoBancoFormaPago);
			//this.jPanelParametrosAuxiliar5TipoBancoFormaPago.setLayout(gridaBagParametrosAuxiliar2TipoBancoFormaPago);			
			
			
			
			
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoBancoFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoBancoFormaPago.add(this.jButtonRecargarInformacionTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBancoFormaPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoBancoFormaPago.add(this.jComboBoxTiposPaginacionTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBancoFormaPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoBancoFormaPago.add(this.jCheckBoxConAltoMaximoTablaTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBancoFormaPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoBancoFormaPago.add(this.jComboBoxTiposArchivosReportesTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBancoFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoBancoFormaPago.add(this.jPanelParametrosAuxiliar1TipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoBancoFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoBancoFormaPago.add(this.jComboBoxTiposReportesTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBancoFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoBancoFormaPago.add(this.jPanelParametrosAuxiliar4TipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBancoFormaPago.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoBancoFormaPago.add(this.jComboBoxTiposReportesTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBancoFormaPago.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoBancoFormaPago.add(this.jCheckBoxGenerarReporteTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBancoFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoBancoFormaPago.add(this.jPanelParametrosAuxiliar2TipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoBancoFormaPago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoBancoFormaPago.add(this.jLabelAccionesTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
				this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoBancoFormaPago.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoBancoFormaPago.add(this.jButtonAbrirOrderByTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBancoFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoBancoFormaPago.add(this.jComboBoxTiposSeleccionarTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);			
			
			
			/*
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoBancoFormaPago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoBancoFormaPago.add(this.jCheckBoxSeleccionarTodosTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoBancoFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoBancoFormaPago.add(this.jCheckBoxSeleccionarTodosTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);															
				
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoBancoFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoBancoFormaPago.add(this.jCheckBoxSeleccionadosTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBancoFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoBancoFormaPago.add(this.jPanelParametrosAuxiliar3TipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBancoFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoBancoFormaPago.add(this.jComboBoxTiposRelacionesTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
				
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBancoFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoBancoFormaPago.add(this.jComboBoxTiposAccionesTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
	
				
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBancoFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoBancoFormaPago.add(this.jTextFieldValorCampoGeneralTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoBancoFormaPago = new GridBagLayout();

			this.jScrollPanelDatosTipoBancoFormaPago.setLayout(gridaBagLayoutDatosTipoBancoFormaPago);
			
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoFormaPago.gridy = 0;
			this.gridBagConstraintsTipoBancoFormaPago.gridx = 0;
			
			this.jScrollPanelDatosTipoBancoFormaPago.add(this.jTableDatosTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoBancoFormaPago.setViewportView(this.jTableDatosTipoBancoFormaPago);
		this.jTableDatosTipoBancoFormaPago.setFillsViewportHeight(true);
		this.jTableDatosTipoBancoFormaPago.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoBancoFormaPago= new GridBagLayout();
		this.jPanelAccionesTipoBancoFormaPago.setLayout(gridaBagLayoutAccionesTipoBancoFormaPago);
		
		
		/*	
		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBancoFormaPago.gridy = 0;
		this.gridBagConstraintsTipoBancoFormaPago.gridx = 0;
			
		this.jPanelAccionesTipoBancoFormaPago.add(this.jButtonNuevoTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoBancoFormaPago = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoBancoFormaPago);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();						
			this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoBancoFormaPago.gridx = 0;		
			//this.gridBagConstraintsTipoBancoFormaPago.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoFormaPago.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoBancoFormaPago.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoBancoFormaPago.gridx = 0;		
		//this.gridBagConstraintsTipoBancoFormaPago.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBancoFormaPago.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoBancoFormaPago.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoBancoFormaPago);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoBancoFormaPago.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);								
		
		
		/*
		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoBancoFormaPago.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
		*/		
		
		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoBancoFormaPago.gridx =0;
		this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoBancoFormaPago.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
				
		
		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoBancoFormaPago.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoBancoFormaPagoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoBancoFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoBancoFormaPago = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoBancoFormaPago.setLayout(gridaBagLayoutBusquedasParametrosTipoBancoFormaPago);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoBancoFormaPago=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoBancoFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoBancoFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoBancoFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoBancoFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
			
			
		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoBancoFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
		
			
		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoBancoFormaPago.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoBancoFormaPago;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoBancoFormaPago() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoBancoFormaPago = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoBancoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoBancoFormaPago.setName("jPanelReporteDinamicoTipoBancoFormaPago"); 
		
		this.jPanelReporteDinamicoTipoBancoFormaPago.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoBancoFormaPago.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoBancoFormaPago.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoBancoFormaPago.setLayout(gridaBagLayoutReporteDinamicoTipoBancoFormaPago);
		
		
		this.jInternalFrameReporteDinamicoTipoBancoFormaPago= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoBancoFormaPago = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoBancoFormaPago= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoBancoFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoBancoFormaPago.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoBancoFormaPago.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoBancoFormaPago.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoBancoFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoBancoFormaPago.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoBancoFormaPago.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoBancoFormaPago.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoBancoFormaPago.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoBancoFormaPago.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoBancoFormaPago.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Banco Forma Pagos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoBancoFormaPago = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoBancoFormaPago.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBancoFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoBancoFormaPago.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoBancoFormaPago.add(this.jLabelColumnasSelectReporteTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoBancoFormaPago = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoBancoFormaPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoBancoFormaPago.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoBancoFormaPago.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoBancoFormaPago.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoBancoFormaPago.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoBancoFormaPago=new JScrollPane(this.jListColumnasSelectReporteTipoBancoFormaPago);
			
			this.jScrollColumnasSelectReporteTipoBancoFormaPago.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoBancoFormaPago.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoBancoFormaPago.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBancoFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoBancoFormaPago.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoBancoFormaPago.add(this.jListColumnasSelectReporteTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
		this.jPanelReporteDinamicoTipoBancoFormaPago.add(this.jScrollColumnasSelectReporteTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoBancoFormaPago = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoBancoFormaPago.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBancoFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoBancoFormaPago.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoBancoFormaPago.add(this.jLabelRelacionesSelectReporteTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoBancoFormaPago = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoBancoFormaPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoBancoFormaPago.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoBancoFormaPago.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoBancoFormaPago.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoBancoFormaPago.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoBancoFormaPago=new JScrollPane(this.jListRelacionesSelectReporteTipoBancoFormaPago);
			
			this.jScrollRelacionesSelectReporteTipoBancoFormaPago.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoBancoFormaPago.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoBancoFormaPago.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBancoFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoBancoFormaPago.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoBancoFormaPago.add(this.jListRelacionesSelectReporteTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
		this.jPanelReporteDinamicoTipoBancoFormaPago.add(this.jScrollRelacionesSelectReporteTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoBancoFormaPago = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoBancoFormaPago = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoBancoFormaPago = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoBancoFormaPago = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoBancoFormaPago.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoBancoFormaPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoBancoFormaPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoBancoFormaPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoBancoFormaPago = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoBancoFormaPago.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoBancoFormaPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoBancoFormaPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoBancoFormaPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoBancoFormaPago = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoBancoFormaPago.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBancoFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoBancoFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoBancoFormaPago.add(this.jLabelGenerarExcelReporteDinamicoTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoBancoFormaPago = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoBancoFormaPago.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoBancoFormaPago,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoBancoFormaPago.setToolTipText("Generar EXCEL"+" "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoBancoFormaPago.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoBancoFormaPago.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoBancoFormaPago.add(this.jButtonGenerarExcelReporteDinamicoTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBancoFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoBancoFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoBancoFormaPago.add(this.jComboBoxTiposReportesDinamicoTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoBancoFormaPago = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoBancoFormaPago.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBancoFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoBancoFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoBancoFormaPago.add(this.jLabelTiposArchivoReporteDinamicoTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBancoFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoBancoFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoBancoFormaPago.add(this.jComboBoxTiposArchivosReportesDinamicoTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoBancoFormaPago = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoBancoFormaPago.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoBancoFormaPago,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoBancoFormaPago.setToolTipText("Generar"+" "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBancoFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoBancoFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoBancoFormaPago.add(this.jButtonGenerarReporteDinamicoTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoBancoFormaPago = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoBancoFormaPago.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoBancoFormaPago,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoBancoFormaPago.setToolTipText("Cancelar"+" "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBancoFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoBancoFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoBancoFormaPago.add(this.jButtonCerrarReporteDinamicoTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoBancoFormaPago = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoBancoFormaPago= new JScrollPane(jPanelReporteDinamicoTipoBancoFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoBancoFormaPago.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoBancoFormaPago.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoBancoFormaPago.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Banco Forma Pagos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoBancoFormaPago.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoBancoFormaPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoBancoFormaPago.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoBancoFormaPago);
		this.jInternalFrameReporteDinamicoTipoBancoFormaPago.getContentPane().add(this.jScrollPanelReporteDinamicoTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoBancoFormaPago() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoBancoFormaPago = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoBancoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoBancoFormaPago.setName("jPanelImportacionTipoBancoFormaPago"); 
		
		this.jPanelImportacionTipoBancoFormaPago.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoBancoFormaPago.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoBancoFormaPago.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoBancoFormaPago.setLayout(gridaBagLayoutImportacionTipoBancoFormaPago);
		
		
		this.jInternalFrameImportacionTipoBancoFormaPago= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoBancoFormaPago= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoBancoFormaPago = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoBancoFormaPago= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoBancoFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoBancoFormaPago.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoBancoFormaPago.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoBancoFormaPago.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoBancoFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoBancoFormaPago.setResizable(true);
	    this.jInternalFrameImportacionTipoBancoFormaPago.setClosable(true);
	    this.jInternalFrameImportacionTipoBancoFormaPago.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoBancoFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoBancoFormaPago.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoBancoFormaPago.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoBancoFormaPago.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoBancoFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoBancoFormaPago.setResizable(true);
	    this.jInternalFrameImportacionTipoBancoFormaPago.setClosable(true);
	    this.jInternalFrameImportacionTipoBancoFormaPago.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoBancoFormaPago.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoBancoFormaPago.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoBancoFormaPago.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Banco Forma Pagos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoBancoFormaPago = new JLabelMe();

		this.jLabelArchivoImportacionTipoBancoFormaPago.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBancoFormaPago.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoBancoFormaPago.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoBancoFormaPago.add(this.jLabelArchivoImportacionTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoBancoFormaPago = new JFileChooser();		
		this.jFileChooserImportacionTipoBancoFormaPago.setToolTipText("ESCOGER ARCHIVO"+" "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoBancoFormaPago = new JButtonMe();
		this.jButtonAbrirImportacionTipoBancoFormaPago.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoBancoFormaPago,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoBancoFormaPago.setToolTipText("Generar"+" "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBancoFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoBancoFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoBancoFormaPago.add(this.jButtonAbrirImportacionTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoBancoFormaPago = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoBancoFormaPago.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBancoFormaPago.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoBancoFormaPago.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoBancoFormaPago.add(this.jLabelPathArchivoImportacionTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoBancoFormaPago=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoBancoFormaPago.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoBancoFormaPago.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoBancoFormaPago.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBancoFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoBancoFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoBancoFormaPago.add(this.jTextFieldPathArchivoImportacionTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoBancoFormaPago = new JButtonMe();
		this.jButtonGenerarImportacionTipoBancoFormaPago.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoBancoFormaPago,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoBancoFormaPago.setToolTipText("Generar"+" "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBancoFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoBancoFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoBancoFormaPago.add(this.jButtonGenerarImportacionTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoBancoFormaPago = new JButtonMe();
		this.jButtonCerrarImportacionTipoBancoFormaPago.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoBancoFormaPago,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoBancoFormaPago.setToolTipText("Cancelar"+" "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBancoFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoBancoFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoBancoFormaPago.add(this.jButtonCerrarImportacionTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoBancoFormaPago = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoBancoFormaPago= new JScrollPane(jPanelImportacionTipoBancoFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoFormaPago.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoBancoFormaPago.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoBancoFormaPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoBancoFormaPago.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoBancoFormaPago);
		this.jInternalFrameImportacionTipoBancoFormaPago.getContentPane().add(this.jScrollPanelImportacionTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoBancoFormaPago(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoBancoFormaPago = new JButtonMe();
			this.jButtonAbrirOrderByTipoBancoFormaPago.setText("Orden");
			this.jButtonAbrirOrderByTipoBancoFormaPago.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoBancoFormaPago,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoBancoFormaPago";
			inputMap = this.jButtonAbrirOrderByTipoBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoBancoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoBancoFormaPago"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoBancoFormaPago = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoBancoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoBancoFormaPago.setName("jPanelOrderByTipoBancoFormaPago"); 
			
			this.jPanelOrderByTipoBancoFormaPago.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoBancoFormaPago.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoBancoFormaPago.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoBancoFormaPago.setLayout(gridaBagLayoutOrderByTipoBancoFormaPago);
			
			
			this.jTableDatosTipoBancoFormaPagoOrderBy = new JTableMe();        
			this.jTableDatosTipoBancoFormaPagoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoBancoFormaPagoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoBancoFormaPagoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoBancoFormaPagoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoBancoFormaPagoOrderBy.setViewportView(this.jTableDatosTipoBancoFormaPagoOrderBy);
			this.jTableDatosTipoBancoFormaPagoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoBancoFormaPagoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoBancoFormaPago= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoBancoFormaPago= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoBancoFormaPago = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoBancoFormaPago= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoBancoFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoBancoFormaPago.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoBancoFormaPago.setTitle("Orden");
			this.jInternalFrameOrderByTipoBancoFormaPago.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoBancoFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoBancoFormaPago.setResizable(true);
			this.jInternalFrameOrderByTipoBancoFormaPago.setClosable(true);
			this.jInternalFrameOrderByTipoBancoFormaPago.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoBancoFormaPago.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoBancoFormaPago.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoBancoFormaPago.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Banco Forma Pagos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoFormaPago.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoBancoFormaPago.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoBancoFormaPago.ipady =150;
				
			this.jPanelOrderByTipoBancoFormaPago.add(jScrollPanelDatosTipoBancoFormaPagoOrderBy, this.gridBagConstraintsTipoBancoFormaPago);//this.jTableDatosTipoBancoFormaPagoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoBancoFormaPago = new JButtonMe();
			this.jButtonCerrarOrderByTipoBancoFormaPago.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoBancoFormaPago,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoBancoFormaPago.setToolTipText("Cancelar"+" "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoFormaPago.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoBancoFormaPago.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoBancoFormaPago.add(this.jButtonCerrarOrderByTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoBancoFormaPago = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoBancoFormaPago= new JScrollPane(jPanelOrderByTipoBancoFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoFormaPago.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoBancoFormaPago.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoBancoFormaPago.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoBancoFormaPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoBancoFormaPago.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoBancoFormaPago);
			
			this.jInternalFrameOrderByTipoBancoFormaPago.getContentPane().add(this.jScrollPanelOrderByTipoBancoFormaPago, this.gridBagConstraintsTipoBancoFormaPago);			
		
		} else {
			this.jButtonAbrirOrderByTipoBancoFormaPago = new JButtonMe();
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
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipobancoformapagoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoBancoFormaPago.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoBancoFormaPago.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoBancoFormaPago.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoBancoFormaPago.getRowHeight();//TipoBancoFormaPagoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoBancoFormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoBancoFormaPago.isSelected()) {
					iHeightTable=TipoBancoFormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoBancoFormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoBancoFormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoBancoFormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoBancoFormaPago.isSelected()) {
					iHeightTable=TipoBancoFormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoBancoFormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoBancoFormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoBancoFormaPago.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoBancoFormaPago.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoBancoFormaPago.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoBancoFormaPago.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoBancoFormaPago.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoBancoFormaPago.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoBancoFormaPago!=null && this.jInternalFrameOrderByTipoBancoFormaPago.getjTableDatosOrderBy()!=null) {
			//if(!this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoBancoFormaPago.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoBancoFormaPago.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoBancoFormaPago.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoBancoFormaPago.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoBancoFormaPago.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoBancoFormaPago.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoBancoFormaPago.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoBancoFormaPago.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoBancoFormaPago.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoBancoFormaPago.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipobancoformapagoLogic.getTipoBancoFormaPagos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipobancoformapagos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoBancoFormaPago> TraerTipoBancoFormaPagoBeans(List<TipoBancoFormaPago> tipobancoformapagos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoBancoFormaPago tipobancoformapago:tipobancoformapagos) {
					
				if(!(TipoBancoFormaPagoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoBancoFormaPagoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipobancoformapago.setsDetalleGeneralEntityReporte(TipoBancoFormaPagoConstantesFunciones.getTipoBancoFormaPagoDescripcion(tipobancoformapago));
										
						
					
					

					if(tipobancoformapago.getBancoFormaPagos()!=null && Funciones.existeClass(classes,BancoFormaPago.class)) {
						try{tipobancoformapago.setbancoformapagosDescripcionReporte(new JRBeanCollectionDataSource(BancoFormaPagoJInternalFrame.TraerBancoFormaPagoBeans(tipobancoformapago.getBancoFormaPagos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipobancoformapago.setsDetalleGeneralEntityReporte(tipobancoformapago.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipobancoformapagobeans.add(tipobancoformapagobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipobancoformapagos;
    }
	//PARA REPORTES FIN
}
