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


import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

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
import com.bydan.erp.contabilidad.util.TipoFacturaConstantesFunciones;

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
public class TipoFacturaJInternalFrame extends TipoFacturaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoFactura;
	
	protected JMenuBar jmenuBarTipoFactura;
	
	protected JMenu jmenuTipoFactura;
	protected JMenu jmenuDatosTipoFactura;
	protected JMenu jmenuArchivoTipoFactura;
	protected JMenu jmenuAccionesTipoFactura;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoFactura;	
	protected GridBagConstraints gridBagConstraintsTipoFactura;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoFacturaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoFactura;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoFactura;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoFactura;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoFacturaSessionBean tipofacturaSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoFactura> tipofacturas;		
	public List<TipoFactura> tipofacturasEliminados;	
	public List<TipoFactura> tipofacturasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoFactura;		
	protected JButton jButtonAbrirOrderByTipoFactura;
	
	
	//protected JPanel jPanelOrderByTipoFactura;
	//public JScrollPane jScrollPanelOrderByTipoFactura;	
	//protected JButton jButtonCerrarOrderByTipoFactura;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoFacturaLogic tipofacturaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoFactura;
	public JScrollPane jScrollPanelDatosEdicionTipoFactura;
	public JScrollPane jScrollPanelDatosGeneralTipoFactura;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoFacturaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoFactura;
	//public JScrollPane jScrollPanelImportacionTipoFactura;
	
	
	
	protected JPanel jPanelAccionesTipoFactura;
	
    protected JPanel jPanelPaginacionTipoFactura;
    protected JPanel jPanelParametrosReportesTipoFactura;
	protected JPanel jPanelParametrosReportesAccionesTipoFactura;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoFactura;
	protected JPanel jPanelParametrosAuxiliar2TipoFactura;
	protected JPanel jPanelParametrosAuxiliar3TipoFactura;
	protected JPanel jPanelParametrosAuxiliar4TipoFactura;
	//protected JPanel jPanelParametrosAuxiliar5TipoFactura;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoFactura;
	//protected JPanel jPanelImportacionTipoFactura;
	
	
	public JTable jTableDatosTipoFactura;
	
	
	
	//public JTable jTableDatosTipoFacturaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoFactura;
	protected JButton jButtonDuplicarTipoFactura;
	protected JButton jButtonCopiarTipoFactura;
	protected JButton jButtonVerFormTipoFactura;
	protected JButton jButtonNuevoRelacionesTipoFactura;
	protected JButton jButtonModificarTipoFactura;
	
    protected JButton jButtonGuardarCambiosTablaTipoFactura;
	protected JButton jButtonCerrarTipoFactura;
	
	
	protected JButton jButtonRecargarInformacionTipoFactura;
	protected JButton jButtonProcesarInformacionTipoFactura;
	
	
	protected JButton jButtonAnterioresTipoFactura;
	protected JButton jButtonSiguientesTipoFactura;
	protected JButton jButtonNuevoGuardarCambiosTipoFactura;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoFactura;
	//protected JButton jButtonCerrarReporteDinamicoTipoFactura;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoFactura;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoFactura;
	//protected JButton jButtonGenerarImportacionTipoFactura;
	//protected JButton jButtonCerrarImportacionTipoFactura;
	//protected JFileChooser jFileChooserImportacionTipoFactura;
	//protected File fileImportacionTipoFactura;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoFactura;
	protected JButton jButtonDuplicarToolBarTipoFactura;
	protected JButton jButtonNuevoRelacionesToolBarTipoFactura;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoFactura;
	protected JButton jButtonCopiarToolBarTipoFactura;
	protected JButton jButtonVerFormToolBarTipoFactura;
	public JButton jButtonGuardarCambiosTablaToolBarTipoFactura;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoFactura;
	protected JButton jButtonCerrarToolBarTipoFactura;
	
	protected JButton jButtonRecargarInformacionToolBarTipoFactura;
	protected JButton jButtonProcesarInformacionToolBarTipoFactura;
	protected JButton jButtonAnterioresToolBarTipoFactura;
	protected JButton jButtonSiguientesToolBarTipoFactura;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoFactura;
	protected JButton jButtonAbrirOrderByToolBarTipoFactura;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoFactura;
	protected JMenuItem jMenuItemDuplicarTipoFactura;
	protected JMenuItem jMenuItemNuevoRelacionesTipoFactura;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoFactura;
	protected JMenuItem jMenuItemCopiarTipoFactura;
	protected JMenuItem jMenuItemVerFormTipoFactura;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoFactura;
	protected JMenuItem jMenuItemCerrarTipoFactura;
	protected JMenuItem jMenuItemDetalleCerrarTipoFactura;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoFactura;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoFactura;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoFactura;
	protected JMenuItem jMenuItemProcesarInformacionTipoFactura;
	protected JMenuItem jMenuItemAnterioresTipoFactura;
	protected JMenuItem jMenuItemSiguientesTipoFactura;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoFactura;
	protected JMenuItem jMenuItemAbrirOrderByTipoFactura;
	protected JMenuItem jMenuItemMostrarOcultarTipoFactura;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoFactura;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoFactura;
	protected JCheckBox jCheckBoxSeleccionadosTipoFactura;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoFactura;
	protected JCheckBox jCheckBoxConGraficoReporteTipoFactura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoFactura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoFactura;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoFactura;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoFactura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoFactura;
	protected JTextField jTextFieldValorCampoGeneralTipoFactura;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoFactura;
	//public JList<Reporte> jListColumnasSelectReporteTipoFactura;
	//public JScrollPane jScrollColumnasSelectReporteTipoFactura;
	
	//public JLabel jLabelRelacionesSelectReporteTipoFactura;
	//public JList<Reporte> jListRelacionesSelectReporteTipoFactura;
	//public JScrollPane jScrollRelacionesSelectReporteTipoFactura;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoFactura;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoFactura;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoFactura;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoFactura;
	
		
	//public JLabel jLabelArchivoImportacionTipoFactura;	
	//public JLabel jLabelPathArchivoImportacionTipoFactura;
	//protected JTextField jTextFieldPathArchivoImportacionTipoFactura;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoFactura;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoFactura;
	
	//public JLabel jLabelColumnaCategoriaValorTipoFactura;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoFactura;
	
	//public JLabel jLabelColumnasValoresGraficoTipoFactura;
	//public JList<Reporte> jListColumnasValoresGraficoTipoFactura;
	//public JScrollPane jScrollColumnasValoresGraficoTipoFactura;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoFactura;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoFactura;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	
	
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
	public TipoFacturaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFacturaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFacturaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFacturaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoFactura)	{
		this.jButtonRecargarInformacionTipoFactura = jButtonRecargarInformacionTipoFactura;
	}
	
	public JButton getjButtonProcesarInformacionTipoFactura() {
		return this.jButtonProcesarInformacionTipoFactura;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoFactura)	{
		this.jButtonProcesarInformacionTipoFactura = jButtonProcesarInformacionTipoFactura;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoFactura() {
		return this.jButtonRecargarInformacionTipoFactura;
	}
	
	
	public List<TipoFactura> gettipofacturas() {
		return this.tipofacturas;
	}

	public void settipofacturas(List<TipoFactura> tipofacturas) {
		this.tipofacturas = tipofacturas;
	}
	
	public List<TipoFactura> gettipofacturasAux() {
		return this.tipofacturasAux;
	}

	public void settipofacturasAux(List<TipoFactura> tipofacturasAux) {
		this.tipofacturasAux = tipofacturasAux;
	}
	
	public List<TipoFactura> gettipofacturasEliminados() {
		return this.tipofacturasEliminados;
	}

	public void setTipoFacturasEliminados(List<TipoFactura> tipofacturasEliminados) {
		this.tipofacturasEliminados = tipofacturasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoFactura() {
		return jComboBoxTiposSeleccionarTipoFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoFactura(
			JComboBox jComboBoxTiposSeleccionarTipoFactura) {
		this.jComboBoxTiposSeleccionarTipoFactura = jComboBoxTiposSeleccionarTipoFactura;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoFactura .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoFactura() {
		return jTextFieldValorCampoGeneralTipoFactura;
	}

	public void setjTextFieldValorCampoGeneralTipoFactura(
			JTextField jTextFieldValorCampoGeneralTipoFactura) {
		this.jTextFieldValorCampoGeneralTipoFactura = jTextFieldValorCampoGeneralTipoFactura;
	}

	public void setBorderResaltarValorCampoGeneralTipoFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFactura.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoFactura .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoFactura() {
		return this.jCheckBoxSeleccionarTodosTipoFactura;
	}

	public void setjCheckBoxSeleccionarTodosTipoFactura(
			JCheckBox jCheckBoxSeleccionarTodosTipoFactura) {
		this.jCheckBoxSeleccionarTodosTipoFactura = jCheckBoxSeleccionarTodosTipoFactura;
	}

	public void setBorderResaltarSeleccionarTodosTipoFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFactura.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoFactura .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoFactura() {
		return this.jCheckBoxSeleccionadosTipoFactura;
	}

	public void setjCheckBoxSeleccionadosTipoFactura(
			JCheckBox jCheckBoxSeleccionadosTipoFactura) {
		this.jCheckBoxSeleccionadosTipoFactura = jCheckBoxSeleccionadosTipoFactura;
	}
	
	public void setBorderResaltarSeleccionadosTipoFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFactura.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoFactura .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoFactura() {
		return this.jComboBoxTiposArchivosReportesTipoFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoFactura(
			JComboBox jComboBoxTiposArchivosReportesTipoFactura) {
		this.jComboBoxTiposArchivosReportesTipoFactura = jComboBoxTiposArchivosReportesTipoFactura;
	}

	public void setBorderResaltarTiposArchivosReportesTipoFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoFactura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoFactura() {
		return this.jComboBoxTiposReportesTipoFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoFactura(
			JComboBox jComboBoxTiposReportesTipoFactura) {
		this.jComboBoxTiposReportesTipoFactura = jComboBoxTiposReportesTipoFactura;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoFactura() {
	//	return jComboBoxTiposReportesDinamicoTipoFactura;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoFactura(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoFactura) {
	//	this.jComboBoxTiposReportesDinamicoTipoFactura = jComboBoxTiposReportesDinamicoTipoFactura;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoFactura() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoFactura;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoFactura(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoFactura) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoFactura = jComboBoxTiposArchivosReportesDinamicoTipoFactura;
	//}
	
	public void setBorderResaltarTiposReportesTipoFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoFactura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoFactura() {
		return this.jComboBoxTiposGraficosReportesTipoFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoFactura(
			JComboBox jComboBoxTiposGraficosReportesTipoFactura) {
		this.jComboBoxTiposGraficosReportesTipoFactura = jComboBoxTiposGraficosReportesTipoFactura;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoFactura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoFactura() {
		return this.jComboBoxTiposPaginacionTipoFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoFactura(
			JComboBox jComboBoxTiposPaginacionTipoFactura) {
		this.jComboBoxTiposPaginacionTipoFactura = jComboBoxTiposPaginacionTipoFactura;
	}
	
	public void setBorderResaltarTiposPaginacionTipoFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoFactura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoFactura() {
		return this.jComboBoxTiposRelacionesTipoFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoFactura() {
		return this.jComboBoxTiposAccionesTipoFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoFactura(
			JComboBox jComboBoxTiposRelacionesTipoFactura) {
		this.jComboBoxTiposRelacionesTipoFactura = jComboBoxTiposRelacionesTipoFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoFactura(
			JComboBox jComboBoxTiposAccionesTipoFactura) {
		this.jComboBoxTiposAccionesTipoFactura = jComboBoxTiposAccionesTipoFactura;
	}
	
	public void setBorderResaltarTiposRelacionesTipoFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoFactura .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoFactura .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoFactura() {
	//	return jCheckBoxConGraficoDinamicoTipoFactura;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoFactura(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoFactura) {
	//	this.jCheckBoxConGraficoDinamicoTipoFactura = jCheckBoxConGraficoDinamicoTipoFactura;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoFactura() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoFactura.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoFactura .setBorder(borderResaltar);		
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
		this.tipofacturaSessionBean=new TipoFacturaSessionBean();
		
		this.tipofacturaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipofacturaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipofacturaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoFacturaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoFacturaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoFacturaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoFacturaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoFacturaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Factura MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipofacturaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoFacturaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoFactura= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoFactura,this.jTtoolBarTipoFactura,
							"nuevo","nuevo","Nuevo"+" "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoFactura,this.jTtoolBarTipoFactura,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoFactura,this.jTtoolBarTipoFactura,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoFactura,this.jTtoolBarTipoFactura,
							"duplicar","duplicar","Duplicar"+" "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoFactura,this.jTtoolBarTipoFactura,
							"copiar","copiar","Copiar"+" "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoFactura,this.jTtoolBarTipoFactura,
							"ver_form","ver_form","Ver"+" "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoFactura,this.jTtoolBarTipoFactura,
							"recargar","recargar","Recargar"+" "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoFactura,this.jTtoolBarTipoFactura,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoFactura,this.jTtoolBarTipoFactura,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoFactura,this.jTtoolBarTipoFactura,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoFactura,this.jTtoolBarTipoFactura,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoFactura,this.jTtoolBarTipoFactura,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoFactura,this.jTtoolBarTipoFactura,
							"cerrar","cerrar","Salir"+" "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoFactura=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoFactura;
			
				this.jButtonProcesarInformacionToolBarTipoFactura=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoFactura;
				
		//protected JButton jButtonModificarToolBarTipoFactura;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoFactura=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoFactura=new JMenuMe("General");
		this.jmenuArchivoTipoFactura=new JMenuMe("Archivo");
		this.jmenuAccionesTipoFactura=new JMenuMe("Acciones");
		this.jmenuDatosTipoFactura=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoFactura= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoFactura.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoFactura,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoFactura= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoFactura.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoFactura,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoFactura= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoFactura.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoFactura,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoFactura= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoFactura.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoFactura,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoFactura= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoFactura.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoFactura,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoFactura= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoFactura.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoFactura,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoFactura= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoFactura.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoFactura,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoFactura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoFactura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoFactura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoFactura= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoFactura.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoFactura,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoFactura= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoFactura.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoFactura,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoFactura= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoFactura.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoFactura,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoFactura= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoFactura.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoFactura,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoFactura= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoFactura.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoFactura,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoFactura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoFactura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoFactura,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoFactura= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoFactura.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoFactura,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoFactura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoFactura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoFactura,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoFactura= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoFactura.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoFactura,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoFactura.add(this.jMenuItemCerrarTipoFactura);
			
			this.jmenuAccionesTipoFactura.add(this.jMenuItemNuevoTipoFactura);
			this.jmenuAccionesTipoFactura.add(this.jMenuItemNuevoGuardarCambiosTipoFactura);
			this.jmenuAccionesTipoFactura.add(this.jMenuItemNuevoRelacionesTipoFactura);
			this.jmenuAccionesTipoFactura.add(this.jMenuItemGuardarCambiosTablaTipoFactura);		
			this.jmenuAccionesTipoFactura.add(this.jMenuItemDuplicarTipoFactura);		
			this.jmenuAccionesTipoFactura.add(this.jMenuItemCopiarTipoFactura);		
			this.jmenuAccionesTipoFactura.add(this.jMenuItemVerFormTipoFactura);		
			
			this.jmenuDatosTipoFactura.add(this.jMenuItemRecargarInformacionTipoFactura);				
			this.jmenuDatosTipoFactura.add(this.jMenuItemAnterioresTipoFactura);				
			this.jmenuDatosTipoFactura.add(this.jMenuItemSiguientesTipoFactura);				
			this.jmenuDatosTipoFactura.add(this.jMenuItemAbrirOrderByTipoFactura);				
			this.jmenuDatosTipoFactura.add(this.jMenuItemMostrarOcultarTipoFactura);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoFactura.add(this.jMenuItemGuardarCambiosTipoFactura);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoFactura.add(this.jmenuArchivoTipoFactura);		
			this.jmenuBarTipoFactura.add(this.jmenuAccionesTipoFactura);		
			this.jmenuBarTipoFactura.add(this.jmenuDatosTipoFactura);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoFactura);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoFactura() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
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
			//this.jInternalFrameDetalleTipoFactura = new TipoFacturaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Factura DATOS");
			this.jInternalFrameDetalleFormTipoFactura = new TipoFacturaDetalleFormJInternalFrame(jDesktopPane,this.tipofacturaSessionBean.getConGuardarRelaciones(),this.tipofacturaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoFactura = null;//new TipoFacturaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoFactura= new GridBagLayout();
		
		
		this.jTableDatosTipoFactura = new JTableMe();      
		
		String sToolTipTipoFactura="";
		sToolTipTipoFactura=TipoFacturaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoFactura+="(Contabilidad.TipoFactura)";
		}
		
		if(!this.tipofacturaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoFactura+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoFactura.setToolTipText(sToolTipTipoFactura);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoFactura);
		this.jTableDatosTipoFactura.setAutoCreateRowSorter(true);
		this.jTableDatosTipoFactura.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoFactura.setRowSelectionAllowed(true);
		this.jTableDatosTipoFactura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoFactura,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoFactura = new JButtonMe();
		this.jButtonDuplicarTipoFactura = new JButtonMe();
		this.jButtonCopiarTipoFactura = new JButtonMe();
		this.jButtonVerFormTipoFactura = new JButtonMe();
		this.jButtonNuevoRelacionesTipoFactura = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoFactura = new JButtonMe();
		this.jButtonCerrarTipoFactura = new JButtonMe();
		
		this.jScrollPanelDatosTipoFactura = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoFactura = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Factura";
		
		if(!this.tipofacturaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Facturas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoFactura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoFactura.setToolTipText("Acciones");
        this.jPanelAccionesTipoFactura.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoFactura, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoFactura=new ReporteDinamicoJInternalFrame(TipoFacturaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoFactura();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoFactura=new ImportacionJInternalFrame(TipoFacturaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoFactura();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoFactura = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoFactura.setText("Orden");
		this.jButtonAbrirOrderByTipoFactura.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoFactura,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoFactura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFactura,false,this);
			
			//this.cargarOrderByTipoFactura(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoFactura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFactura,true,this);
			
			//this.cargarOrderByTipoFactura(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoFactura.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoFactura.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoFactura.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoFactura.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoFactura.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoFactura.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoFactura.setText("Nuevo");
		this.jButtonDuplicarTipoFactura.setText("Duplicar");
		this.jButtonCopiarTipoFactura.setText("Copiar");
		this.jButtonVerFormTipoFactura.setText("Ver");
		this.jButtonNuevoRelacionesTipoFactura.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoFactura.setText("Guardar");
		this.jButtonCerrarTipoFactura.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoFactura,"nuevo_button","Nuevo",this.tipofacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoFactura,"duplicar_button","Duplicar",this.tipofacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoFactura,"copiar_button","Copiar",this.tipofacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoFactura,"ver_form","Ver",this.tipofacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoFactura,"nuevorelaciones_button","Nuevo Rel",this.tipofacturaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoFactura,"guardarcambiostabla_button","Guardar",this.tipofacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoFactura,"cerrar_button","Salir",this.tipofacturaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoFactura.setToolTipText("Nuevo"+" "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoFactura.setToolTipText("Duplicar"+" "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoFactura.setToolTipText("Copiar"+" "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoFactura.setToolTipText("Ver"+" "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoFactura.setToolTipText("Nuevo Rel"+" "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoFactura.setToolTipText("Guardar"+" "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoFactura.setToolTipText("Salir"+" "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoFactura";
		inputMap = this.jButtonNuevoTipoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoFactura"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoFactura";
		inputMap = this.jButtonDuplicarTipoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoFactura"));
		
		//COPIAR
		sMapKey = "CopiarTipoFactura";
		inputMap = this.jButtonCopiarTipoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoFactura"));
		
		//VEr FORM
		sMapKey = "VerFormTipoFactura";
		inputMap = this.jButtonVerFormTipoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoFactura"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoFactura";
		inputMap = this.jButtonNuevoRelacionesTipoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoFactura"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoFactura";
		inputMap = this.jButtonModificarTipoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoFactura"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoFactura";
		inputMap = this.jButtonCerrarTipoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoFactura"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoFactura";
		inputMap = this.jButtonGuardarCambiosTablaTipoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoFactura"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoFactura.setName("jPanelParametrosReportesTipoFactura"); 
		
		this.jPanelParametrosReportesAccionesTipoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoFactura.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoFactura.setName("jPanelParametrosReportesAccionesTipoFactura"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoFactura, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoFactura, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoFactura = new JButtonMe();
		this.jButtonRecargarInformacionTipoFactura.setText("Recargar");
		this.jButtonRecargarInformacionTipoFactura.setToolTipText("Recargar"+" "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoFactura,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoFactura = new JButtonMe();
		this.jButtonProcesarInformacionTipoFactura.setText("Procesar");
		this.jButtonProcesarInformacionTipoFactura.setToolTipText("Procesar"+" "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoFactura.setVisible(false);
			
		this.jButtonProcesarInformacionTipoFactura.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoFactura.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoFactura.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoFactura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoFactura.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoFactura.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoFactura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoFactura.setText("TIPO");       
		this.jComboBoxTiposReportesTipoFactura.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoFactura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoFactura.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoFactura.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoFactura = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoFactura.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoFactura.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoFactura = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoFactura.setText("Accion");
		this.jComboBoxTiposRelacionesTipoFactura.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoFactura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoFactura.setText("Accion");
		this.jComboBoxTiposAccionesTipoFactura.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoFactura = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoFactura.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoFactura.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoFactura=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoFactura.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoFactura.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoFactura.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoFactura = new JLabelMe();
		
		this.jLabelAccionesTipoFactura.setText("Acciones");		
		this.jLabelAccionesTipoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoFactura = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoFactura.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoFactura.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoFactura = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoFactura.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoFactura.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoFactura = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoFactura.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoFactura.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoFactura = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoFactura.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoFactura.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoFactura = new JButtonMe();
		//this.jButtonAnterioresTipoFactura.setText("<<");
        this.jButtonAnterioresTipoFactura.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoFactura,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoFactura = new JButtonMe();
		//this.jButtonSiguientesTipoFactura.setText(">>");
        this.jButtonSiguientesTipoFactura.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoFactura,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoFactura = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoFactura.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoFactura.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoFactura,"nuevoguardarcambios_button","Nue",this.tipofacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoFactura";
		inputMap = this.jButtonNuevoGuardarCambiosTipoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoFactura"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoFactura";
		inputMap = this.jButtonRecargarInformacionTipoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoFactura"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoFactura";
		inputMap = this.jButtonSiguientesTipoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoFactura"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoFactura";
		inputMap = this.jButtonAnterioresTipoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoFactura"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoFactura();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoFactura.setMinimumSize(new Dimension(this.getWidth(),TipoFacturaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoFacturaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoFactura.setMaximumSize(new Dimension(this.getWidth(),TipoFacturaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoFacturaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoFactura.setPreferredSize(new Dimension(this.getWidth(),TipoFacturaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoFacturaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoFactura = new GridBagLayout();

			this.jPanelPaginacionTipoFactura.setLayout(gridaBagLayoutPaginacionTipoFactura);						
			
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoFactura.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFactura.gridy = 0;
			this.gridBagConstraintsTipoFactura.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoFactura.add(this.jButtonAnterioresTipoFactura, this.gridBagConstraintsTipoFactura);
					
						
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoFactura.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoFactura.gridy = 0;
			
			this.jPanelPaginacionTipoFactura.add(this.jButtonNuevoGuardarCambiosTipoFactura, this.gridBagConstraintsTipoFactura);
						
			
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoFactura.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoFactura.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoFactura.gridy = 0;
			this.jPanelPaginacionTipoFactura.add(this.jButtonSiguientesTipoFactura, this.gridBagConstraintsTipoFactura);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFactura.gridy = 1;
			this.gridBagConstraintsTipoFactura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFactura.add(this.jButtonNuevoTipoFactura, this.gridBagConstraintsTipoFactura);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoFactura = new GridBagConstraints();
				this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoFactura.gridy = 1;
				this.gridBagConstraintsTipoFactura.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoFactura.add(this.jButtonNuevoRelacionesTipoFactura, this.gridBagConstraintsTipoFactura);
			}
			
			
			if(!this.tipofacturaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoFactura = new GridBagConstraints();
				this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoFactura.gridy = 1;
				this.gridBagConstraintsTipoFactura.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoFactura.add(this.jButtonGuardarCambiosTablaTipoFactura, this.gridBagConstraintsTipoFactura);
			}
			
			
			
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFactura.gridy = 1;
			this.gridBagConstraintsTipoFactura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFactura.add(this.jButtonDuplicarTipoFactura, this.gridBagConstraintsTipoFactura);
			
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFactura.gridy = 1;
			this.gridBagConstraintsTipoFactura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFactura.add(this.jButtonCopiarTipoFactura, this.gridBagConstraintsTipoFactura);
		
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFactura.gridy = 1;
			this.gridBagConstraintsTipoFactura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFactura.add(this.jButtonVerFormTipoFactura, this.gridBagConstraintsTipoFactura);
		
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFactura.gridy = 1;
			this.gridBagConstraintsTipoFactura.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoFactura.add(this.jButtonCerrarTipoFactura, this.gridBagConstraintsTipoFactura);
		
		
		
		this.jButtonRecargarInformacionTipoFactura.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoFactura.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoFactura.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoFactura.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoFactura.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoFactura.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoFactura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoFactura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoFactura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoFactura.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoFactura.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoFactura.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoFactura.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoFactura.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoFactura.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoFactura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoFactura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoFactura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoFactura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFactura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFactura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoFactura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoFactura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoFactura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoFactura.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoFactura.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoFactura.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoFactura.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoFactura.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoFactura.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoFactura.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoFactura.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoFactura.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoFactura.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoFactura.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoFactura.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoFactura = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoFactura = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoFactura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoFactura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoFactura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoFactura = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoFactura.setLayout(gridaBagParametrosReportesTipoFactura);
			this.jPanelParametrosReportesAccionesTipoFactura.setLayout(gridaBagParametrosReportesAccionesTipoFactura);
			
			
			this.jPanelParametrosAuxiliar1TipoFactura.setLayout(gridaBagParametrosAuxiliar1TipoFactura);
			this.jPanelParametrosAuxiliar2TipoFactura.setLayout(gridaBagParametrosAuxiliar2TipoFactura);
			this.jPanelParametrosAuxiliar3TipoFactura.setLayout(gridaBagParametrosAuxiliar3TipoFactura);
			this.jPanelParametrosAuxiliar4TipoFactura.setLayout(gridaBagParametrosAuxiliar4TipoFactura);
			//this.jPanelParametrosAuxiliar5TipoFactura.setLayout(gridaBagParametrosAuxiliar2TipoFactura);			
			
			
			
			
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFactura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoFactura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFactura.add(this.jButtonRecargarInformacionTipoFactura, this.gridBagConstraintsTipoFactura);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFactura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFactura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoFactura.add(this.jComboBoxTiposPaginacionTipoFactura, this.gridBagConstraintsTipoFactura);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFactura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFactura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoFactura.add(this.jCheckBoxConAltoMaximoTablaTipoFactura, this.gridBagConstraintsTipoFactura);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFactura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFactura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoFactura.add(this.jComboBoxTiposArchivosReportesTipoFactura, this.gridBagConstraintsTipoFactura);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFactura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFactura.add(this.jPanelParametrosAuxiliar1TipoFactura, this.gridBagConstraintsTipoFactura);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFactura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoFactura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoFactura.add(this.jComboBoxTiposReportesTipoFactura, this.gridBagConstraintsTipoFactura);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFactura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFactura.add(this.jPanelParametrosAuxiliar4TipoFactura, this.gridBagConstraintsTipoFactura);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFactura.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFactura.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFactura.add(this.jComboBoxTiposReportesTipoFactura, this.gridBagConstraintsTipoFactura);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFactura.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoFactura.add(this.jCheckBoxGenerarReporteTipoFactura, this.gridBagConstraintsTipoFactura);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFactura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFactura.add(this.jPanelParametrosAuxiliar2TipoFactura, this.gridBagConstraintsTipoFactura);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFactura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoFactura.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoFactura.add(this.jLabelAccionesTipoFactura, this.gridBagConstraintsTipoFactura);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoFactura = new GridBagConstraints();
				this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoFactura.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoFactura.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoFactura.add(this.jButtonAbrirOrderByTipoFactura, this.gridBagConstraintsTipoFactura);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFactura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFactura.add(this.jComboBoxTiposSeleccionarTipoFactura, this.gridBagConstraintsTipoFactura);			
			
			
			/*
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFactura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoFactura.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoFactura.add(this.jCheckBoxSeleccionarTodosTipoFactura, this.gridBagConstraintsTipoFactura);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFactura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoFactura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoFactura.add(this.jCheckBoxSeleccionarTodosTipoFactura, this.gridBagConstraintsTipoFactura);															
				
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFactura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoFactura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoFactura.add(this.jCheckBoxSeleccionadosTipoFactura, this.gridBagConstraintsTipoFactura);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFactura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFactura.add(this.jPanelParametrosAuxiliar3TipoFactura, this.gridBagConstraintsTipoFactura);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFactura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFactura.add(this.jComboBoxTiposRelacionesTipoFactura, this.gridBagConstraintsTipoFactura);
				
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFactura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFactura.add(this.jComboBoxTiposAccionesTipoFactura, this.gridBagConstraintsTipoFactura);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoFactura = new GridBagLayout();

			this.jScrollPanelDatosTipoFactura.setLayout(gridaBagLayoutDatosTipoFactura);
			
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFactura.gridy = 0;
			this.gridBagConstraintsTipoFactura.gridx = 0;
			
			this.jScrollPanelDatosTipoFactura.add(this.jTableDatosTipoFactura, this.gridBagConstraintsTipoFactura);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoFactura.setViewportView(this.jTableDatosTipoFactura);
		this.jTableDatosTipoFactura.setFillsViewportHeight(true);
		this.jTableDatosTipoFactura.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoFactura= new GridBagLayout();
		this.jPanelAccionesTipoFactura.setLayout(gridaBagLayoutAccionesTipoFactura);
		
		
		/*	
		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFactura.gridy = 0;
		this.gridBagConstraintsTipoFactura.gridx = 0;
			
		this.jPanelAccionesTipoFactura.add(this.jButtonNuevoTipoFactura, this.gridBagConstraintsTipoFactura);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoFactura = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoFactura);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipofacturaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();						
			this.gridBagConstraintsTipoFactura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoFactura.gridx = 0;		
			//this.gridBagConstraintsTipoFactura.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFactura.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoFactura.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoFactura, this.gridBagConstraintsTipoFactura);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoFactura.gridx = 0;		
		//this.gridBagConstraintsTipoFactura.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFactura.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoFactura.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoFactura);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFactura.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoFactura, this.gridBagConstraintsTipoFactura);								
		
		
		/*
		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFactura.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoFactura, this.gridBagConstraintsTipoFactura);
		*/		
		
		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoFactura.gridx =0;
		this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoFactura.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoFactura, this.gridBagConstraintsTipoFactura);
				
		
		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFactura.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoFactura, this.gridBagConstraintsTipoFactura);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoFacturaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoFactura = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoFactura.setLayout(gridaBagLayoutBusquedasParametrosTipoFactura);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoFactura=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoFactura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFactura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFactura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFactura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoFactura, this.gridBagConstraintsTipoFactura);
			
			
		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFactura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoFactura, this.gridBagConstraintsTipoFactura);
		
			
		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoFactura.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoFactura, this.gridBagConstraintsTipoFactura);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoFactura;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoFactura() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoFactura = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoFactura.setName("jPanelReporteDinamicoTipoFactura"); 
		
		this.jPanelReporteDinamicoTipoFactura.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoFactura.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoFactura.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoFactura.setLayout(gridaBagLayoutReporteDinamicoTipoFactura);
		
		
		this.jInternalFrameReporteDinamicoTipoFactura= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoFactura = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoFactura= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoFactura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoFactura.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoFactura.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoFactura.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoFactura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoFactura.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoFactura.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoFactura.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoFactura.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoFactura.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoFactura.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Facturas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoFactura = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoFactura.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFactura.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoFactura.add(this.jLabelColumnasSelectReporteTipoFactura, this.gridBagConstraintsTipoFactura);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoFactura = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoFactura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoFactura.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoFactura.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoFactura.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoFactura.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoFactura=new JScrollPane(this.jListColumnasSelectReporteTipoFactura);
			
			this.jScrollColumnasSelectReporteTipoFactura.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoFactura.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoFactura.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFactura.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoFactura.add(this.jListColumnasSelectReporteTipoFactura, this.gridBagConstraintsTipoFactura);
		this.jPanelReporteDinamicoTipoFactura.add(this.jScrollColumnasSelectReporteTipoFactura, this.gridBagConstraintsTipoFactura);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoFactura = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoFactura.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFactura.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoFactura.add(this.jLabelRelacionesSelectReporteTipoFactura, this.gridBagConstraintsTipoFactura);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoFactura = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoFactura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoFactura.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoFactura.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoFactura.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoFactura.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoFactura=new JScrollPane(this.jListRelacionesSelectReporteTipoFactura);
			
			this.jScrollRelacionesSelectReporteTipoFactura.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoFactura.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoFactura.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFactura.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoFactura.add(this.jListRelacionesSelectReporteTipoFactura, this.gridBagConstraintsTipoFactura);
		this.jPanelReporteDinamicoTipoFactura.add(this.jScrollRelacionesSelectReporteTipoFactura, this.gridBagConstraintsTipoFactura);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoFactura = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoFactura = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoFactura = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoFactura = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoFactura.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoFactura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoFactura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoFactura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoFactura = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoFactura.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoFactura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoFactura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoFactura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoFactura = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoFactura.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoFactura.add(this.jLabelGenerarExcelReporteDinamicoTipoFactura, this.gridBagConstraintsTipoFactura);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoFactura = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoFactura.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoFactura,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoFactura.setToolTipText("Generar EXCEL"+" "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		//this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoFactura.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoFactura.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoFactura.add(this.jButtonGenerarExcelReporteDinamicoTipoFactura, this.gridBagConstraintsTipoFactura);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFactura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFactura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFactura.add(this.jComboBoxTiposReportesDinamicoTipoFactura, this.gridBagConstraintsTipoFactura);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoFactura = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoFactura.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoFactura.add(this.jLabelTiposArchivoReporteDinamicoTipoFactura, this.gridBagConstraintsTipoFactura);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFactura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFactura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFactura.add(this.jComboBoxTiposArchivosReportesDinamicoTipoFactura, this.gridBagConstraintsTipoFactura);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoFactura = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoFactura.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoFactura,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoFactura.setToolTipText("Generar"+" "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFactura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFactura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFactura.add(this.jButtonGenerarReporteDinamicoTipoFactura, this.gridBagConstraintsTipoFactura);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoFactura = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoFactura.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoFactura,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoFactura.setToolTipText("Cancelar"+" "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFactura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFactura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFactura.add(this.jButtonCerrarReporteDinamicoTipoFactura, this.gridBagConstraintsTipoFactura);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoFactura = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoFactura= new JScrollPane(jPanelReporteDinamicoTipoFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoFactura.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoFactura.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoFactura.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Facturas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoFactura.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoFactura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoFactura.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoFactura);
		this.jInternalFrameReporteDinamicoTipoFactura.getContentPane().add(this.jScrollPanelReporteDinamicoTipoFactura, this.gridBagConstraintsTipoFactura);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoFactura() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoFactura = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoFactura.setName("jPanelImportacionTipoFactura"); 
		
		this.jPanelImportacionTipoFactura.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoFactura.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoFactura.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoFactura.setLayout(gridaBagLayoutImportacionTipoFactura);
		
		
		this.jInternalFrameImportacionTipoFactura= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoFactura= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoFactura = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoFactura= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoFactura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoFactura.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoFactura.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoFactura.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoFactura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoFactura.setResizable(true);
	    this.jInternalFrameImportacionTipoFactura.setClosable(true);
	    this.jInternalFrameImportacionTipoFactura.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoFactura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoFactura.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoFactura.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoFactura.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoFactura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoFactura.setResizable(true);
	    this.jInternalFrameImportacionTipoFactura.setClosable(true);
	    this.jInternalFrameImportacionTipoFactura.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoFactura.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoFactura.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoFactura.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Facturas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoFactura = new JLabelMe();

		this.jLabelArchivoImportacionTipoFactura.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFactura.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoFactura.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoFactura.add(this.jLabelArchivoImportacionTipoFactura, this.gridBagConstraintsTipoFactura);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoFactura = new JFileChooser();		
		this.jFileChooserImportacionTipoFactura.setToolTipText("ESCOGER ARCHIVO"+" "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoFactura = new JButtonMe();
		this.jButtonAbrirImportacionTipoFactura.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoFactura,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoFactura.setToolTipText("Generar"+" "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFactura.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFactura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFactura.add(this.jButtonAbrirImportacionTipoFactura, this.gridBagConstraintsTipoFactura);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoFactura = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoFactura.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFactura.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoFactura.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoFactura.add(this.jLabelPathArchivoImportacionTipoFactura, this.gridBagConstraintsTipoFactura);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoFactura=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoFactura.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoFactura.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoFactura.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFactura.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFactura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFactura.add(this.jTextFieldPathArchivoImportacionTipoFactura, this.gridBagConstraintsTipoFactura);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoFactura = new JButtonMe();
		this.jButtonGenerarImportacionTipoFactura.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoFactura,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoFactura.setToolTipText("Generar"+" "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFactura.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFactura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFactura.add(this.jButtonGenerarImportacionTipoFactura, this.gridBagConstraintsTipoFactura);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoFactura = new JButtonMe();
		this.jButtonCerrarImportacionTipoFactura.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoFactura,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoFactura.setToolTipText("Cancelar"+" "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFactura.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFactura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFactura.add(this.jButtonCerrarImportacionTipoFactura, this.gridBagConstraintsTipoFactura);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoFactura = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoFactura= new JScrollPane(jPanelImportacionTipoFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoFactura.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoFactura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoFactura.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoFactura);
		this.jInternalFrameImportacionTipoFactura.getContentPane().add(this.jScrollPanelImportacionTipoFactura, this.gridBagConstraintsTipoFactura);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoFactura(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoFactura = new JButtonMe();
			this.jButtonAbrirOrderByTipoFactura.setText("Orden");
			this.jButtonAbrirOrderByTipoFactura.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoFactura,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoFactura";
			inputMap = this.jButtonAbrirOrderByTipoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoFactura"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoFactura = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoFactura.setName("jPanelOrderByTipoFactura"); 
			
			this.jPanelOrderByTipoFactura.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoFactura.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoFactura.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoFactura.setLayout(gridaBagLayoutOrderByTipoFactura);
			
			
			this.jTableDatosTipoFacturaOrderBy = new JTableMe();        
			this.jTableDatosTipoFacturaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoFacturaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoFacturaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoFacturaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoFacturaOrderBy.setViewportView(this.jTableDatosTipoFacturaOrderBy);
			this.jTableDatosTipoFacturaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoFacturaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoFactura= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoFactura= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoFactura = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoFactura= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoFactura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoFactura.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoFactura.setTitle("Orden");
			this.jInternalFrameOrderByTipoFactura.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoFactura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoFactura.setResizable(true);
			this.jInternalFrameOrderByTipoFactura.setClosable(true);
			this.jInternalFrameOrderByTipoFactura.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoFactura.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoFactura.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoFactura.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Facturas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoFactura.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoFactura.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoFactura.ipady =150;
				
			this.jPanelOrderByTipoFactura.add(jScrollPanelDatosTipoFacturaOrderBy, this.gridBagConstraintsTipoFactura);//this.jTableDatosTipoFacturaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoFactura = new JButtonMe();
			this.jButtonCerrarOrderByTipoFactura.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoFactura,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoFactura.setToolTipText("Cancelar"+" "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFactura.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoFactura.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoFactura.add(this.jButtonCerrarOrderByTipoFactura, this.gridBagConstraintsTipoFactura);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoFactura = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoFactura= new JScrollPane(jPanelOrderByTipoFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoFactura.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoFactura.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoFactura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoFactura.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoFactura);
			
			this.jInternalFrameOrderByTipoFactura.getContentPane().add(this.jScrollPanelOrderByTipoFactura, this.gridBagConstraintsTipoFactura);			
		
		} else {
			this.jButtonAbrirOrderByTipoFactura = new JButtonMe();
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
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipofacturaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoFactura.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoFactura.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoFactura.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoFactura.getRowHeight();//TipoFacturaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipofacturaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoFacturaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoFactura.isSelected()) {
					iHeightTable=TipoFacturaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoFacturaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoFacturaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoFacturaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoFactura.isSelected()) {
					iHeightTable=TipoFacturaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoFacturaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoFacturaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoFactura.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoFactura.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoFactura.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoFactura.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoFactura.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoFactura.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoFactura!=null && this.jInternalFrameOrderByTipoFactura.getjTableDatosOrderBy()!=null) {
			//if(!this.tipofacturaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoFactura.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoFactura.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoFactura.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoFactura.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoFactura.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoFactura.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoFactura.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoFactura.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoFactura.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoFactura.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipofacturaLogic.getTipoFacturas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipofacturas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoFactura> TraerTipoFacturaBeans(List<TipoFactura> tipofacturas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoFactura tipofactura:tipofacturas) {
					
				if(!(TipoFacturaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoFacturaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipofactura.setsDetalleGeneralEntityReporte(TipoFacturaConstantesFunciones.getTipoFacturaDescripcion(tipofactura));
										
						
					
					

					if(tipofactura.getFacturas()!=null && Funciones.existeClass(classes,Factura.class)) {
						try{tipofactura.setfacturasDescripcionReporte(new JRBeanCollectionDataSource(FacturaJInternalFrame.TraerFacturaBeans(tipofactura.getFacturas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipofactura.setsDetalleGeneralEntityReporte(tipofactura.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipofacturabeans.add(tipofacturabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipofacturas;
    }
	//PARA REPORTES FIN
}
