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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

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
import com.bydan.erp.produccion.util.TipoPrioridadEmpresaProduConstantesFunciones;

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
public class TipoPrioridadEmpresaProduJInternalFrame extends TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoPrioridadEmpresaProdu;
	
	protected JMenuBar jmenuBarTipoPrioridadEmpresaProdu;
	
	protected JMenu jmenuTipoPrioridadEmpresaProdu;
	protected JMenu jmenuDatosTipoPrioridadEmpresaProdu;
	protected JMenu jmenuArchivoTipoPrioridadEmpresaProdu;
	protected JMenu jmenuAccionesTipoPrioridadEmpresaProdu;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoPrioridadEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoPrioridadEmpresaProdu;	
	protected GridBagConstraints gridBagConstraintsTipoPrioridadEmpresaProdu;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoPrioridadEmpresaProduDetalleFormJInternalFrame jInternalFrameDetalleFormTipoPrioridadEmpresaProdu;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoPrioridadEmpresaProdu;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoPrioridadEmpresaProduSessionBean tipoprioridadempresaproduSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodus;		
	public List<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodusEliminados;	
	public List<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodusAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoPrioridadEmpresaProdu;		
	protected JButton jButtonAbrirOrderByTipoPrioridadEmpresaProdu;
	
	
	//protected JPanel jPanelOrderByTipoPrioridadEmpresaProdu;
	//public JScrollPane jScrollPanelOrderByTipoPrioridadEmpresaProdu;	
	//protected JButton jButtonCerrarOrderByTipoPrioridadEmpresaProdu;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoPrioridadEmpresaProduLogic tipoprioridadempresaproduLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoPrioridadEmpresaProdu;
	public JScrollPane jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu;
	public JScrollPane jScrollPanelDatosGeneralTipoPrioridadEmpresaProdu;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoPrioridadEmpresaProduOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoPrioridadEmpresaProdu;
	//public JScrollPane jScrollPanelImportacionTipoPrioridadEmpresaProdu;
	
	
	
	protected JPanel jPanelAccionesTipoPrioridadEmpresaProdu;
	
    protected JPanel jPanelPaginacionTipoPrioridadEmpresaProdu;
    protected JPanel jPanelParametrosReportesTipoPrioridadEmpresaProdu;
	protected JPanel jPanelParametrosReportesAccionesTipoPrioridadEmpresaProdu;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoPrioridadEmpresaProdu;
	protected JPanel jPanelParametrosAuxiliar2TipoPrioridadEmpresaProdu;
	protected JPanel jPanelParametrosAuxiliar3TipoPrioridadEmpresaProdu;
	protected JPanel jPanelParametrosAuxiliar4TipoPrioridadEmpresaProdu;
	//protected JPanel jPanelParametrosAuxiliar5TipoPrioridadEmpresaProdu;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoPrioridadEmpresaProdu;
	//protected JPanel jPanelImportacionTipoPrioridadEmpresaProdu;
	
	
	public JTable jTableDatosTipoPrioridadEmpresaProdu;
	
	
	
	//public JTable jTableDatosTipoPrioridadEmpresaProduOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoPrioridadEmpresaProdu;
	protected JButton jButtonDuplicarTipoPrioridadEmpresaProdu;
	protected JButton jButtonCopiarTipoPrioridadEmpresaProdu;
	protected JButton jButtonVerFormTipoPrioridadEmpresaProdu;
	protected JButton jButtonNuevoRelacionesTipoPrioridadEmpresaProdu;
	protected JButton jButtonModificarTipoPrioridadEmpresaProdu;
	
    protected JButton jButtonGuardarCambiosTablaTipoPrioridadEmpresaProdu;
	protected JButton jButtonCerrarTipoPrioridadEmpresaProdu;
	
	
	protected JButton jButtonRecargarInformacionTipoPrioridadEmpresaProdu;
	protected JButton jButtonProcesarInformacionTipoPrioridadEmpresaProdu;
	
	
	protected JButton jButtonAnterioresTipoPrioridadEmpresaProdu;
	protected JButton jButtonSiguientesTipoPrioridadEmpresaProdu;
	protected JButton jButtonNuevoGuardarCambiosTipoPrioridadEmpresaProdu;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoPrioridadEmpresaProdu;
	//protected JButton jButtonCerrarReporteDinamicoTipoPrioridadEmpresaProdu;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoPrioridadEmpresaProdu;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoPrioridadEmpresaProdu;
	//protected JButton jButtonGenerarImportacionTipoPrioridadEmpresaProdu;
	//protected JButton jButtonCerrarImportacionTipoPrioridadEmpresaProdu;
	//protected JFileChooser jFileChooserImportacionTipoPrioridadEmpresaProdu;
	//protected File fileImportacionTipoPrioridadEmpresaProdu;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoPrioridadEmpresaProdu;
	protected JButton jButtonDuplicarToolBarTipoPrioridadEmpresaProdu;
	protected JButton jButtonNuevoRelacionesToolBarTipoPrioridadEmpresaProdu;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoPrioridadEmpresaProdu;
	protected JButton jButtonCopiarToolBarTipoPrioridadEmpresaProdu;
	protected JButton jButtonVerFormToolBarTipoPrioridadEmpresaProdu;
	public JButton jButtonGuardarCambiosTablaToolBarTipoPrioridadEmpresaProdu;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoPrioridadEmpresaProdu;
	protected JButton jButtonCerrarToolBarTipoPrioridadEmpresaProdu;
	
	protected JButton jButtonRecargarInformacionToolBarTipoPrioridadEmpresaProdu;
	protected JButton jButtonProcesarInformacionToolBarTipoPrioridadEmpresaProdu;
	protected JButton jButtonAnterioresToolBarTipoPrioridadEmpresaProdu;
	protected JButton jButtonSiguientesToolBarTipoPrioridadEmpresaProdu;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoPrioridadEmpresaProdu;
	protected JButton jButtonAbrirOrderByToolBarTipoPrioridadEmpresaProdu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoPrioridadEmpresaProdu;
	protected JMenuItem jMenuItemDuplicarTipoPrioridadEmpresaProdu;
	protected JMenuItem jMenuItemNuevoRelacionesTipoPrioridadEmpresaProdu;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoPrioridadEmpresaProdu;
	protected JMenuItem jMenuItemCopiarTipoPrioridadEmpresaProdu;
	protected JMenuItem jMenuItemVerFormTipoPrioridadEmpresaProdu;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoPrioridadEmpresaProdu;
	protected JMenuItem jMenuItemCerrarTipoPrioridadEmpresaProdu;
	protected JMenuItem jMenuItemDetalleCerrarTipoPrioridadEmpresaProdu;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoPrioridadEmpresaProdu;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoPrioridadEmpresaProdu;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoPrioridadEmpresaProdu;
	protected JMenuItem jMenuItemProcesarInformacionTipoPrioridadEmpresaProdu;
	protected JMenuItem jMenuItemAnterioresTipoPrioridadEmpresaProdu;
	protected JMenuItem jMenuItemSiguientesTipoPrioridadEmpresaProdu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoPrioridadEmpresaProdu;
	protected JMenuItem jMenuItemAbrirOrderByTipoPrioridadEmpresaProdu;
	protected JMenuItem jMenuItemMostrarOcultarTipoPrioridadEmpresaProdu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoPrioridadEmpresaProdu;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoPrioridadEmpresaProdu;
	protected JCheckBox jCheckBoxSeleccionadosTipoPrioridadEmpresaProdu;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoPrioridadEmpresaProdu;
	protected JCheckBox jCheckBoxConGraficoReporteTipoPrioridadEmpresaProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoPrioridadEmpresaProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoPrioridadEmpresaProdu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoPrioridadEmpresaProdu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoPrioridadEmpresaProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoPrioridadEmpresaProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoPrioridadEmpresaProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoPrioridadEmpresaProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoPrioridadEmpresaProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoPrioridadEmpresaProdu;
	protected JTextField jTextFieldValorCampoGeneralTipoPrioridadEmpresaProdu;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoPrioridadEmpresaProdu;
	//public JList<Reporte> jListColumnasSelectReporteTipoPrioridadEmpresaProdu;
	//public JScrollPane jScrollColumnasSelectReporteTipoPrioridadEmpresaProdu;
	
	//public JLabel jLabelRelacionesSelectReporteTipoPrioridadEmpresaProdu;
	//public JList<Reporte> jListRelacionesSelectReporteTipoPrioridadEmpresaProdu;
	//public JScrollPane jScrollRelacionesSelectReporteTipoPrioridadEmpresaProdu;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoPrioridadEmpresaProdu;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoPrioridadEmpresaProdu;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoPrioridadEmpresaProdu;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoPrioridadEmpresaProdu;
	
		
	//public JLabel jLabelArchivoImportacionTipoPrioridadEmpresaProdu;	
	//public JLabel jLabelPathArchivoImportacionTipoPrioridadEmpresaProdu;
	//protected JTextField jTextFieldPathArchivoImportacionTipoPrioridadEmpresaProdu;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoPrioridadEmpresaProdu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoPrioridadEmpresaProdu;
	
	//public JLabel jLabelColumnaCategoriaValorTipoPrioridadEmpresaProdu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoPrioridadEmpresaProdu;
	
	//public JLabel jLabelColumnasValoresGraficoTipoPrioridadEmpresaProdu;
	//public JList<Reporte> jListColumnasValoresGraficoTipoPrioridadEmpresaProdu;
	//public JScrollPane jScrollColumnasValoresGraficoTipoPrioridadEmpresaProdu;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoPrioridadEmpresaProdu;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoPrioridadEmpresaProdu;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoPrioridadEmpresaProdu;
	
	
	
	
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
	public TipoPrioridadEmpresaProduJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoPrioridadEmpresaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPrioridadEmpresaProduJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPrioridadEmpresaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPrioridadEmpresaProduJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPrioridadEmpresaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPrioridadEmpresaProduJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoPrioridadEmpresaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoPrioridadEmpresaProdu)	{
		this.jButtonRecargarInformacionTipoPrioridadEmpresaProdu = jButtonRecargarInformacionTipoPrioridadEmpresaProdu;
	}
	
	public JButton getjButtonProcesarInformacionTipoPrioridadEmpresaProdu() {
		return this.jButtonProcesarInformacionTipoPrioridadEmpresaProdu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoPrioridadEmpresaProdu)	{
		this.jButtonProcesarInformacionTipoPrioridadEmpresaProdu = jButtonProcesarInformacionTipoPrioridadEmpresaProdu;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoPrioridadEmpresaProdu() {
		return this.jButtonRecargarInformacionTipoPrioridadEmpresaProdu;
	}
	
	
	public List<TipoPrioridadEmpresaProdu> gettipoprioridadempresaprodus() {
		return this.tipoprioridadempresaprodus;
	}

	public void settipoprioridadempresaprodus(List<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodus) {
		this.tipoprioridadempresaprodus = tipoprioridadempresaprodus;
	}
	
	public List<TipoPrioridadEmpresaProdu> gettipoprioridadempresaprodusAux() {
		return this.tipoprioridadempresaprodusAux;
	}

	public void settipoprioridadempresaprodusAux(List<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodusAux) {
		this.tipoprioridadempresaprodusAux = tipoprioridadempresaprodusAux;
	}
	
	public List<TipoPrioridadEmpresaProdu> gettipoprioridadempresaprodusEliminados() {
		return this.tipoprioridadempresaprodusEliminados;
	}

	public void setTipoPrioridadEmpresaProdusEliminados(List<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodusEliminados) {
		this.tipoprioridadempresaprodusEliminados = tipoprioridadempresaprodusEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoPrioridadEmpresaProdu() {
		return jComboBoxTiposSeleccionarTipoPrioridadEmpresaProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoPrioridadEmpresaProdu(
			JComboBox jComboBoxTiposSeleccionarTipoPrioridadEmpresaProdu) {
		this.jComboBoxTiposSeleccionarTipoPrioridadEmpresaProdu = jComboBoxTiposSeleccionarTipoPrioridadEmpresaProdu;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoPrioridadEmpresaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoPrioridadEmpresaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoPrioridadEmpresaProdu .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoPrioridadEmpresaProdu() {
		return jTextFieldValorCampoGeneralTipoPrioridadEmpresaProdu;
	}

	public void setjTextFieldValorCampoGeneralTipoPrioridadEmpresaProdu(
			JTextField jTextFieldValorCampoGeneralTipoPrioridadEmpresaProdu) {
		this.jTextFieldValorCampoGeneralTipoPrioridadEmpresaProdu = jTextFieldValorCampoGeneralTipoPrioridadEmpresaProdu;
	}

	public void setBorderResaltarValorCampoGeneralTipoPrioridadEmpresaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrioridadEmpresaProdu.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoPrioridadEmpresaProdu .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoPrioridadEmpresaProdu() {
		return this.jCheckBoxSeleccionarTodosTipoPrioridadEmpresaProdu;
	}

	public void setjCheckBoxSeleccionarTodosTipoPrioridadEmpresaProdu(
			JCheckBox jCheckBoxSeleccionarTodosTipoPrioridadEmpresaProdu) {
		this.jCheckBoxSeleccionarTodosTipoPrioridadEmpresaProdu = jCheckBoxSeleccionarTodosTipoPrioridadEmpresaProdu;
	}

	public void setBorderResaltarSeleccionarTodosTipoPrioridadEmpresaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrioridadEmpresaProdu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoPrioridadEmpresaProdu .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoPrioridadEmpresaProdu() {
		return this.jCheckBoxSeleccionadosTipoPrioridadEmpresaProdu;
	}

	public void setjCheckBoxSeleccionadosTipoPrioridadEmpresaProdu(
			JCheckBox jCheckBoxSeleccionadosTipoPrioridadEmpresaProdu) {
		this.jCheckBoxSeleccionadosTipoPrioridadEmpresaProdu = jCheckBoxSeleccionadosTipoPrioridadEmpresaProdu;
	}
	
	public void setBorderResaltarSeleccionadosTipoPrioridadEmpresaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrioridadEmpresaProdu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoPrioridadEmpresaProdu .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoPrioridadEmpresaProdu() {
		return this.jComboBoxTiposArchivosReportesTipoPrioridadEmpresaProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoPrioridadEmpresaProdu(
			JComboBox jComboBoxTiposArchivosReportesTipoPrioridadEmpresaProdu) {
		this.jComboBoxTiposArchivosReportesTipoPrioridadEmpresaProdu = jComboBoxTiposArchivosReportesTipoPrioridadEmpresaProdu;
	}

	public void setBorderResaltarTiposArchivosReportesTipoPrioridadEmpresaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrioridadEmpresaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoPrioridadEmpresaProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoPrioridadEmpresaProdu() {
		return this.jComboBoxTiposReportesTipoPrioridadEmpresaProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoPrioridadEmpresaProdu(
			JComboBox jComboBoxTiposReportesTipoPrioridadEmpresaProdu) {
		this.jComboBoxTiposReportesTipoPrioridadEmpresaProdu = jComboBoxTiposReportesTipoPrioridadEmpresaProdu;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoPrioridadEmpresaProdu() {
	//	return jComboBoxTiposReportesDinamicoTipoPrioridadEmpresaProdu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoPrioridadEmpresaProdu(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoPrioridadEmpresaProdu) {
	//	this.jComboBoxTiposReportesDinamicoTipoPrioridadEmpresaProdu = jComboBoxTiposReportesDinamicoTipoPrioridadEmpresaProdu;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoPrioridadEmpresaProdu() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoPrioridadEmpresaProdu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoPrioridadEmpresaProdu(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoPrioridadEmpresaProdu) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoPrioridadEmpresaProdu = jComboBoxTiposArchivosReportesDinamicoTipoPrioridadEmpresaProdu;
	//}
	
	public void setBorderResaltarTiposReportesTipoPrioridadEmpresaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrioridadEmpresaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoPrioridadEmpresaProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoPrioridadEmpresaProdu() {
		return this.jComboBoxTiposGraficosReportesTipoPrioridadEmpresaProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoPrioridadEmpresaProdu(
			JComboBox jComboBoxTiposGraficosReportesTipoPrioridadEmpresaProdu) {
		this.jComboBoxTiposGraficosReportesTipoPrioridadEmpresaProdu = jComboBoxTiposGraficosReportesTipoPrioridadEmpresaProdu;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoPrioridadEmpresaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrioridadEmpresaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoPrioridadEmpresaProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoPrioridadEmpresaProdu() {
		return this.jComboBoxTiposPaginacionTipoPrioridadEmpresaProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoPrioridadEmpresaProdu(
			JComboBox jComboBoxTiposPaginacionTipoPrioridadEmpresaProdu) {
		this.jComboBoxTiposPaginacionTipoPrioridadEmpresaProdu = jComboBoxTiposPaginacionTipoPrioridadEmpresaProdu;
	}
	
	public void setBorderResaltarTiposPaginacionTipoPrioridadEmpresaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrioridadEmpresaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoPrioridadEmpresaProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoPrioridadEmpresaProdu() {
		return this.jComboBoxTiposRelacionesTipoPrioridadEmpresaProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoPrioridadEmpresaProdu() {
		return this.jComboBoxTiposAccionesTipoPrioridadEmpresaProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoPrioridadEmpresaProdu(
			JComboBox jComboBoxTiposRelacionesTipoPrioridadEmpresaProdu) {
		this.jComboBoxTiposRelacionesTipoPrioridadEmpresaProdu = jComboBoxTiposRelacionesTipoPrioridadEmpresaProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoPrioridadEmpresaProdu(
			JComboBox jComboBoxTiposAccionesTipoPrioridadEmpresaProdu) {
		this.jComboBoxTiposAccionesTipoPrioridadEmpresaProdu = jComboBoxTiposAccionesTipoPrioridadEmpresaProdu;
	}
	
	public void setBorderResaltarTiposRelacionesTipoPrioridadEmpresaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrioridadEmpresaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoPrioridadEmpresaProdu .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoPrioridadEmpresaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrioridadEmpresaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoPrioridadEmpresaProdu .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoPrioridadEmpresaProdu() {
	//	return jCheckBoxConGraficoDinamicoTipoPrioridadEmpresaProdu;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoPrioridadEmpresaProdu(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoPrioridadEmpresaProdu) {
	//	this.jCheckBoxConGraficoDinamicoTipoPrioridadEmpresaProdu = jCheckBoxConGraficoDinamicoTipoPrioridadEmpresaProdu;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoPrioridadEmpresaProdu() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoPrioridadEmpresaProdu.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoPrioridadEmpresaProdu .setBorder(borderResaltar);		
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
		this.tipoprioridadempresaproduSessionBean=new TipoPrioridadEmpresaProduSessionBean();
		
		this.tipoprioridadempresaproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoprioridadempresaproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoPrioridadEmpresaProduJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoPrioridadEmpresaProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoPrioridadEmpresaProduJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoPrioridadEmpresaProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoPrioridadEmpresaProduJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Prioridad Empresa MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoPrioridadEmpresaProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoPrioridadEmpresaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoPrioridadEmpresaProdu= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoPrioridadEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoPrioridadEmpresaProdu,this.jTtoolBarTipoPrioridadEmpresaProdu,
							"nuevo","nuevo","Nuevo"+" "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoPrioridadEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoPrioridadEmpresaProdu,this.jTtoolBarTipoPrioridadEmpresaProdu,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoPrioridadEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoPrioridadEmpresaProdu,this.jTtoolBarTipoPrioridadEmpresaProdu,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoPrioridadEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoPrioridadEmpresaProdu,this.jTtoolBarTipoPrioridadEmpresaProdu,
							"duplicar","duplicar","Duplicar"+" "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoPrioridadEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoPrioridadEmpresaProdu,this.jTtoolBarTipoPrioridadEmpresaProdu,
							"copiar","copiar","Copiar"+" "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoPrioridadEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoPrioridadEmpresaProdu,this.jTtoolBarTipoPrioridadEmpresaProdu,
							"ver_form","ver_form","Ver"+" "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoPrioridadEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoPrioridadEmpresaProdu,this.jTtoolBarTipoPrioridadEmpresaProdu,
							"recargar","recargar","Recargar"+" "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoPrioridadEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoPrioridadEmpresaProdu,this.jTtoolBarTipoPrioridadEmpresaProdu,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoPrioridadEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoPrioridadEmpresaProdu,this.jTtoolBarTipoPrioridadEmpresaProdu,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoPrioridadEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoPrioridadEmpresaProdu,this.jTtoolBarTipoPrioridadEmpresaProdu,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoPrioridadEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoPrioridadEmpresaProdu,this.jTtoolBarTipoPrioridadEmpresaProdu,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoPrioridadEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoPrioridadEmpresaProdu,this.jTtoolBarTipoPrioridadEmpresaProdu,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoPrioridadEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoPrioridadEmpresaProdu,this.jTtoolBarTipoPrioridadEmpresaProdu,
							"cerrar","cerrar","Salir"+" "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoPrioridadEmpresaProdu=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoPrioridadEmpresaProdu;
			
				this.jButtonProcesarInformacionToolBarTipoPrioridadEmpresaProdu=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoPrioridadEmpresaProdu;
				
		//protected JButton jButtonModificarToolBarTipoPrioridadEmpresaProdu;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoPrioridadEmpresaProdu=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoPrioridadEmpresaProdu=new JMenuMe("General");
		this.jmenuArchivoTipoPrioridadEmpresaProdu=new JMenuMe("Archivo");
		this.jmenuAccionesTipoPrioridadEmpresaProdu=new JMenuMe("Acciones");
		this.jmenuDatosTipoPrioridadEmpresaProdu=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoPrioridadEmpresaProdu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoPrioridadEmpresaProdu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoPrioridadEmpresaProdu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoPrioridadEmpresaProdu= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoPrioridadEmpresaProdu.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoPrioridadEmpresaProdu,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoPrioridadEmpresaProdu= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoPrioridadEmpresaProdu.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoPrioridadEmpresaProdu,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoPrioridadEmpresaProdu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoPrioridadEmpresaProdu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoPrioridadEmpresaProdu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoPrioridadEmpresaProdu= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoPrioridadEmpresaProdu.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoPrioridadEmpresaProdu,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoPrioridadEmpresaProdu= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoPrioridadEmpresaProdu.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoPrioridadEmpresaProdu,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoPrioridadEmpresaProdu= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoPrioridadEmpresaProdu.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoPrioridadEmpresaProdu,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoPrioridadEmpresaProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoPrioridadEmpresaProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoPrioridadEmpresaProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoPrioridadEmpresaProdu= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoPrioridadEmpresaProdu.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoPrioridadEmpresaProdu,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoPrioridadEmpresaProdu= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoPrioridadEmpresaProdu.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoPrioridadEmpresaProdu,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoPrioridadEmpresaProdu= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoPrioridadEmpresaProdu.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoPrioridadEmpresaProdu,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoPrioridadEmpresaProdu= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoPrioridadEmpresaProdu.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoPrioridadEmpresaProdu,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoPrioridadEmpresaProdu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoPrioridadEmpresaProdu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoPrioridadEmpresaProdu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoPrioridadEmpresaProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoPrioridadEmpresaProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoPrioridadEmpresaProdu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoPrioridadEmpresaProdu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoPrioridadEmpresaProdu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoPrioridadEmpresaProdu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoPrioridadEmpresaProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoPrioridadEmpresaProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoPrioridadEmpresaProdu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoPrioridadEmpresaProdu= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoPrioridadEmpresaProdu.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoPrioridadEmpresaProdu,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoPrioridadEmpresaProdu.add(this.jMenuItemCerrarTipoPrioridadEmpresaProdu);
			
			this.jmenuAccionesTipoPrioridadEmpresaProdu.add(this.jMenuItemNuevoTipoPrioridadEmpresaProdu);
			this.jmenuAccionesTipoPrioridadEmpresaProdu.add(this.jMenuItemNuevoGuardarCambiosTipoPrioridadEmpresaProdu);
			this.jmenuAccionesTipoPrioridadEmpresaProdu.add(this.jMenuItemNuevoRelacionesTipoPrioridadEmpresaProdu);
			this.jmenuAccionesTipoPrioridadEmpresaProdu.add(this.jMenuItemGuardarCambiosTablaTipoPrioridadEmpresaProdu);		
			this.jmenuAccionesTipoPrioridadEmpresaProdu.add(this.jMenuItemDuplicarTipoPrioridadEmpresaProdu);		
			this.jmenuAccionesTipoPrioridadEmpresaProdu.add(this.jMenuItemCopiarTipoPrioridadEmpresaProdu);		
			this.jmenuAccionesTipoPrioridadEmpresaProdu.add(this.jMenuItemVerFormTipoPrioridadEmpresaProdu);		
			
			this.jmenuDatosTipoPrioridadEmpresaProdu.add(this.jMenuItemRecargarInformacionTipoPrioridadEmpresaProdu);				
			this.jmenuDatosTipoPrioridadEmpresaProdu.add(this.jMenuItemAnterioresTipoPrioridadEmpresaProdu);				
			this.jmenuDatosTipoPrioridadEmpresaProdu.add(this.jMenuItemSiguientesTipoPrioridadEmpresaProdu);				
			this.jmenuDatosTipoPrioridadEmpresaProdu.add(this.jMenuItemAbrirOrderByTipoPrioridadEmpresaProdu);				
			this.jmenuDatosTipoPrioridadEmpresaProdu.add(this.jMenuItemMostrarOcultarTipoPrioridadEmpresaProdu);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoPrioridadEmpresaProdu.add(this.jMenuItemGuardarCambiosTipoPrioridadEmpresaProdu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoPrioridadEmpresaProdu.add(this.jmenuArchivoTipoPrioridadEmpresaProdu);		
			this.jmenuBarTipoPrioridadEmpresaProdu.add(this.jmenuAccionesTipoPrioridadEmpresaProdu);		
			this.jmenuBarTipoPrioridadEmpresaProdu.add(this.jmenuDatosTipoPrioridadEmpresaProdu);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoPrioridadEmpresaProdu);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoPrioridadEmpresaProdu() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoPrioridadEmpresaProdu=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoPrioridadEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoPrioridadEmpresaProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoPrioridadEmpresaProdu,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoPrioridadEmpresaProdu = new TipoPrioridadEmpresaProduDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Prioridad Empresa DATOS");
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu = new TipoPrioridadEmpresaProduDetalleFormJInternalFrame(jDesktopPane,this.tipoprioridadempresaproduSessionBean.getConGuardarRelaciones(),this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoPrioridadEmpresaProdu = null;//new TipoPrioridadEmpresaProduDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoPrioridadEmpresaProdu= new GridBagLayout();
		
		
		this.jTableDatosTipoPrioridadEmpresaProdu = new JTableMe();      
		
		String sToolTipTipoPrioridadEmpresaProdu="";
		sToolTipTipoPrioridadEmpresaProdu=TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoPrioridadEmpresaProdu+="(Produccion.TipoPrioridadEmpresaProdu)";
		}
		
		if(!this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoPrioridadEmpresaProdu+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoPrioridadEmpresaProdu.setToolTipText(sToolTipTipoPrioridadEmpresaProdu);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoPrioridadEmpresaProdu);
		this.jTableDatosTipoPrioridadEmpresaProdu.setAutoCreateRowSorter(true);
		this.jTableDatosTipoPrioridadEmpresaProdu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoPrioridadEmpresaProdu.setRowSelectionAllowed(true);
		this.jTableDatosTipoPrioridadEmpresaProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoPrioridadEmpresaProdu,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoPrioridadEmpresaProdu = new JButtonMe();
		this.jButtonDuplicarTipoPrioridadEmpresaProdu = new JButtonMe();
		this.jButtonCopiarTipoPrioridadEmpresaProdu = new JButtonMe();
		this.jButtonVerFormTipoPrioridadEmpresaProdu = new JButtonMe();
		this.jButtonNuevoRelacionesTipoPrioridadEmpresaProdu = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoPrioridadEmpresaProdu = new JButtonMe();
		this.jButtonCerrarTipoPrioridadEmpresaProdu = new JButtonMe();
		
		this.jScrollPanelDatosTipoPrioridadEmpresaProdu = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoPrioridadEmpresaProdu = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoPrioridadEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Prioridad Empresa";
		
		if(!this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoPrioridadEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Prioridad Empresas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoPrioridadEmpresaProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoPrioridadEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoPrioridadEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoPrioridadEmpresaProdu.setToolTipText("Acciones");
        this.jPanelAccionesTipoPrioridadEmpresaProdu.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu=new ReporteDinamicoJInternalFrame(TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoPrioridadEmpresaProdu();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoPrioridadEmpresaProdu=new ImportacionJInternalFrame(TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoPrioridadEmpresaProdu();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoPrioridadEmpresaProdu = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoPrioridadEmpresaProdu.setText("Orden");
		this.jButtonAbrirOrderByTipoPrioridadEmpresaProdu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoPrioridadEmpresaProdu,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoPrioridadEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoPrioridadEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoPrioridadEmpresaProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPrioridadEmpresaProdu,false,this);
			
			//this.cargarOrderByTipoPrioridadEmpresaProdu(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoPrioridadEmpresaProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPrioridadEmpresaProdu,true,this);
			
			//this.cargarOrderByTipoPrioridadEmpresaProdu(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoPrioridadEmpresaProdu.setText("Nuevo");
		this.jButtonDuplicarTipoPrioridadEmpresaProdu.setText("Duplicar");
		this.jButtonCopiarTipoPrioridadEmpresaProdu.setText("Copiar");
		this.jButtonVerFormTipoPrioridadEmpresaProdu.setText("Ver");
		this.jButtonNuevoRelacionesTipoPrioridadEmpresaProdu.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoPrioridadEmpresaProdu.setText("Guardar");
		this.jButtonCerrarTipoPrioridadEmpresaProdu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoPrioridadEmpresaProdu,"nuevo_button","Nuevo",this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoPrioridadEmpresaProdu,"duplicar_button","Duplicar",this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoPrioridadEmpresaProdu,"copiar_button","Copiar",this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoPrioridadEmpresaProdu,"ver_form","Ver",this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoPrioridadEmpresaProdu,"nuevorelaciones_button","Nuevo Rel",this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoPrioridadEmpresaProdu,"guardarcambiostabla_button","Guardar",this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoPrioridadEmpresaProdu,"cerrar_button","Salir",this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoPrioridadEmpresaProdu.setToolTipText("Nuevo"+" "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoPrioridadEmpresaProdu.setToolTipText("Duplicar"+" "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoPrioridadEmpresaProdu.setToolTipText("Copiar"+" "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoPrioridadEmpresaProdu.setToolTipText("Ver"+" "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoPrioridadEmpresaProdu.setToolTipText("Nuevo Rel"+" "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoPrioridadEmpresaProdu.setToolTipText("Guardar"+" "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoPrioridadEmpresaProdu.setToolTipText("Salir"+" "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoPrioridadEmpresaProdu";
		inputMap = this.jButtonNuevoTipoPrioridadEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoPrioridadEmpresaProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoPrioridadEmpresaProdu"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoPrioridadEmpresaProdu";
		inputMap = this.jButtonDuplicarTipoPrioridadEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoPrioridadEmpresaProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoPrioridadEmpresaProdu"));
		
		//COPIAR
		sMapKey = "CopiarTipoPrioridadEmpresaProdu";
		inputMap = this.jButtonCopiarTipoPrioridadEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoPrioridadEmpresaProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoPrioridadEmpresaProdu"));
		
		//VEr FORM
		sMapKey = "VerFormTipoPrioridadEmpresaProdu";
		inputMap = this.jButtonVerFormTipoPrioridadEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoPrioridadEmpresaProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoPrioridadEmpresaProdu"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoPrioridadEmpresaProdu";
		inputMap = this.jButtonNuevoRelacionesTipoPrioridadEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoPrioridadEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoPrioridadEmpresaProdu"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoPrioridadEmpresaProdu";
		inputMap = this.jButtonModificarTipoPrioridadEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoPrioridadEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoPrioridadEmpresaProdu"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoPrioridadEmpresaProdu";
		inputMap = this.jButtonCerrarTipoPrioridadEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoPrioridadEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoPrioridadEmpresaProdu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoPrioridadEmpresaProdu";
		inputMap = this.jButtonGuardarCambiosTablaTipoPrioridadEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoPrioridadEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoPrioridadEmpresaProdu"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoPrioridadEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoPrioridadEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoPrioridadEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoPrioridadEmpresaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoPrioridadEmpresaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoPrioridadEmpresaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoPrioridadEmpresaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoPrioridadEmpresaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoPrioridadEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoPrioridadEmpresaProdu.setName("jPanelParametrosReportesTipoPrioridadEmpresaProdu"); 
		
		this.jPanelParametrosReportesAccionesTipoPrioridadEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoPrioridadEmpresaProdu.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoPrioridadEmpresaProdu.setName("jPanelParametrosReportesAccionesTipoPrioridadEmpresaProdu"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoPrioridadEmpresaProdu = new JButtonMe();
		this.jButtonRecargarInformacionTipoPrioridadEmpresaProdu.setText("Recargar");
		this.jButtonRecargarInformacionTipoPrioridadEmpresaProdu.setToolTipText("Recargar"+" "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoPrioridadEmpresaProdu,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoPrioridadEmpresaProdu = new JButtonMe();
		this.jButtonProcesarInformacionTipoPrioridadEmpresaProdu.setText("Procesar");
		this.jButtonProcesarInformacionTipoPrioridadEmpresaProdu.setToolTipText("Procesar"+" "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoPrioridadEmpresaProdu.setVisible(false);
			
		this.jButtonProcesarInformacionTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoPrioridadEmpresaProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoPrioridadEmpresaProdu.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoPrioridadEmpresaProdu.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoPrioridadEmpresaProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoPrioridadEmpresaProdu.setText("TIPO");       
		this.jComboBoxTiposReportesTipoPrioridadEmpresaProdu.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoPrioridadEmpresaProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoPrioridadEmpresaProdu.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoPrioridadEmpresaProdu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoPrioridadEmpresaProdu = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoPrioridadEmpresaProdu.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoPrioridadEmpresaProdu.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoPrioridadEmpresaProdu = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoPrioridadEmpresaProdu.setText("Accion");
		this.jComboBoxTiposRelacionesTipoPrioridadEmpresaProdu.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoPrioridadEmpresaProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoPrioridadEmpresaProdu.setText("Accion");
		this.jComboBoxTiposAccionesTipoPrioridadEmpresaProdu.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoPrioridadEmpresaProdu = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoPrioridadEmpresaProdu.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoPrioridadEmpresaProdu.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoPrioridadEmpresaProdu=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoPrioridadEmpresaProdu = new JLabelMe();
		
		this.jLabelAccionesTipoPrioridadEmpresaProdu.setText("Acciones");		
		this.jLabelAccionesTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoPrioridadEmpresaProdu = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoPrioridadEmpresaProdu.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoPrioridadEmpresaProdu.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoPrioridadEmpresaProdu = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoPrioridadEmpresaProdu.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoPrioridadEmpresaProdu.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoPrioridadEmpresaProdu = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoPrioridadEmpresaProdu.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoPrioridadEmpresaProdu.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoPrioridadEmpresaProdu = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoPrioridadEmpresaProdu.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoPrioridadEmpresaProdu.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoPrioridadEmpresaProdu = new JButtonMe();
		//this.jButtonAnterioresTipoPrioridadEmpresaProdu.setText("<<");
        this.jButtonAnterioresTipoPrioridadEmpresaProdu.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoPrioridadEmpresaProdu,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoPrioridadEmpresaProdu = new JButtonMe();
		//this.jButtonSiguientesTipoPrioridadEmpresaProdu.setText(">>");
        this.jButtonSiguientesTipoPrioridadEmpresaProdu.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoPrioridadEmpresaProdu,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoPrioridadEmpresaProdu = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoPrioridadEmpresaProdu.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoPrioridadEmpresaProdu.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoPrioridadEmpresaProdu,"nuevoguardarcambios_button","Nue",this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoPrioridadEmpresaProdu";
		inputMap = this.jButtonNuevoGuardarCambiosTipoPrioridadEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoPrioridadEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoPrioridadEmpresaProdu"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoPrioridadEmpresaProdu";
		inputMap = this.jButtonRecargarInformacionTipoPrioridadEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoPrioridadEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoPrioridadEmpresaProdu"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoPrioridadEmpresaProdu";
		inputMap = this.jButtonSiguientesTipoPrioridadEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoPrioridadEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoPrioridadEmpresaProdu"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoPrioridadEmpresaProdu";
		inputMap = this.jButtonAnterioresTipoPrioridadEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoPrioridadEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoPrioridadEmpresaProdu"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoPrioridadEmpresaProdu();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(this.getWidth(),TipoPrioridadEmpresaProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoPrioridadEmpresaProduBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(this.getWidth(),TipoPrioridadEmpresaProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoPrioridadEmpresaProduBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(this.getWidth(),TipoPrioridadEmpresaProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoPrioridadEmpresaProduBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoPrioridadEmpresaProdu = new GridBagLayout();

			this.jPanelPaginacionTipoPrioridadEmpresaProdu.setLayout(gridaBagLayoutPaginacionTipoPrioridadEmpresaProdu);						
			
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = 0;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoPrioridadEmpresaProdu.add(this.jButtonAnterioresTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
					
						
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = 0;
			
			this.jPanelPaginacionTipoPrioridadEmpresaProdu.add(this.jButtonNuevoGuardarCambiosTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
						
			
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = 0;
			this.jPanelPaginacionTipoPrioridadEmpresaProdu.add(this.jButtonSiguientesTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = 1;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPrioridadEmpresaProdu.add(this.jButtonNuevoTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
				this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = 1;
				this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoPrioridadEmpresaProdu.add(this.jButtonNuevoRelacionesTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
			}
			
			
			if(!this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
				this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = 1;
				this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoPrioridadEmpresaProdu.add(this.jButtonGuardarCambiosTablaTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
			}
			
			
			
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = 1;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPrioridadEmpresaProdu.add(this.jButtonDuplicarTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
			
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = 1;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPrioridadEmpresaProdu.add(this.jButtonCopiarTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
		
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = 1;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPrioridadEmpresaProdu.add(this.jButtonVerFormTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
		
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = 1;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoPrioridadEmpresaProdu.add(this.jButtonCerrarTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
		
		
		
		this.jButtonRecargarInformacionTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoPrioridadEmpresaProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoPrioridadEmpresaProdu = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoPrioridadEmpresaProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoPrioridadEmpresaProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoPrioridadEmpresaProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoPrioridadEmpresaProdu = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoPrioridadEmpresaProdu.setLayout(gridaBagParametrosReportesTipoPrioridadEmpresaProdu);
			this.jPanelParametrosReportesAccionesTipoPrioridadEmpresaProdu.setLayout(gridaBagParametrosReportesAccionesTipoPrioridadEmpresaProdu);
			
			
			this.jPanelParametrosAuxiliar1TipoPrioridadEmpresaProdu.setLayout(gridaBagParametrosAuxiliar1TipoPrioridadEmpresaProdu);
			this.jPanelParametrosAuxiliar2TipoPrioridadEmpresaProdu.setLayout(gridaBagParametrosAuxiliar2TipoPrioridadEmpresaProdu);
			this.jPanelParametrosAuxiliar3TipoPrioridadEmpresaProdu.setLayout(gridaBagParametrosAuxiliar3TipoPrioridadEmpresaProdu);
			this.jPanelParametrosAuxiliar4TipoPrioridadEmpresaProdu.setLayout(gridaBagParametrosAuxiliar4TipoPrioridadEmpresaProdu);
			//this.jPanelParametrosAuxiliar5TipoPrioridadEmpresaProdu.setLayout(gridaBagParametrosAuxiliar2TipoPrioridadEmpresaProdu);			
			
			
			
			
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPrioridadEmpresaProdu.add(this.jButtonRecargarInformacionTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoPrioridadEmpresaProdu.add(this.jComboBoxTiposPaginacionTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoPrioridadEmpresaProdu.add(this.jCheckBoxConAltoMaximoTablaTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoPrioridadEmpresaProdu.add(this.jComboBoxTiposArchivosReportesTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPrioridadEmpresaProdu.add(this.jPanelParametrosAuxiliar1TipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoPrioridadEmpresaProdu.add(this.jComboBoxTiposReportesTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPrioridadEmpresaProdu.add(this.jPanelParametrosAuxiliar4TipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPrioridadEmpresaProdu.add(this.jComboBoxTiposReportesTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoPrioridadEmpresaProdu.add(this.jCheckBoxGenerarReporteTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPrioridadEmpresaProdu.add(this.jPanelParametrosAuxiliar2TipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoPrioridadEmpresaProdu.add(this.jLabelAccionesTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
				this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoPrioridadEmpresaProdu.add(this.jButtonAbrirOrderByTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPrioridadEmpresaProdu.add(this.jComboBoxTiposSeleccionarTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);			
			
			
			/*
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoPrioridadEmpresaProdu.add(this.jCheckBoxSeleccionarTodosTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoPrioridadEmpresaProdu.add(this.jCheckBoxSeleccionarTodosTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);															
				
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoPrioridadEmpresaProdu.add(this.jCheckBoxSeleccionadosTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPrioridadEmpresaProdu.add(this.jPanelParametrosAuxiliar3TipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPrioridadEmpresaProdu.add(this.jComboBoxTiposRelacionesTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
				
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPrioridadEmpresaProdu.add(this.jComboBoxTiposAccionesTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
	
				
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPrioridadEmpresaProdu.add(this.jTextFieldValorCampoGeneralTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoPrioridadEmpresaProdu = new GridBagLayout();

			this.jScrollPanelDatosTipoPrioridadEmpresaProdu.setLayout(gridaBagLayoutDatosTipoPrioridadEmpresaProdu);
			
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = 0;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = 0;
			
			this.jScrollPanelDatosTipoPrioridadEmpresaProdu.add(this.jTableDatosTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoPrioridadEmpresaProdu.setViewportView(this.jTableDatosTipoPrioridadEmpresaProdu);
		this.jTableDatosTipoPrioridadEmpresaProdu.setFillsViewportHeight(true);
		this.jTableDatosTipoPrioridadEmpresaProdu.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoPrioridadEmpresaProdu= new GridBagLayout();
		this.jPanelAccionesTipoPrioridadEmpresaProdu.setLayout(gridaBagLayoutAccionesTipoPrioridadEmpresaProdu);
		
		
		/*	
		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = 0;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = 0;
			
		this.jPanelAccionesTipoPrioridadEmpresaProdu.add(this.jButtonNuevoTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoPrioridadEmpresaProdu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoPrioridadEmpresaProdu);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();						
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = 0;		
			//this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = 0;		
		//this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);								
		
		
		/*
		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
		*/		
		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx =0;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoPrioridadEmpresaProdu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
				
		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoPrioridadEmpresaProduJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoPrioridadEmpresaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoPrioridadEmpresaProdu = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoPrioridadEmpresaProdu.setLayout(gridaBagLayoutBusquedasParametrosTipoPrioridadEmpresaProdu);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoPrioridadEmpresaProdu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
			
			
		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
		
			
		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoPrioridadEmpresaProdu;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoPrioridadEmpresaProdu() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoPrioridadEmpresaProdu = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoPrioridadEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoPrioridadEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoPrioridadEmpresaProdu.setName("jPanelReporteDinamicoTipoPrioridadEmpresaProdu"); 
		
		this.jPanelReporteDinamicoTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoPrioridadEmpresaProdu.setLayout(gridaBagLayoutReporteDinamicoTipoPrioridadEmpresaProdu);
		
		
		this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoPrioridadEmpresaProdu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoPrioridadEmpresaProdu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoPrioridadEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Prioridad Empresas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoPrioridadEmpresaProdu = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoPrioridadEmpresaProdu.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoPrioridadEmpresaProdu.add(this.jLabelColumnasSelectReporteTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoPrioridadEmpresaProdu = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoPrioridadEmpresaProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoPrioridadEmpresaProdu.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoPrioridadEmpresaProdu=new JScrollPane(this.jListColumnasSelectReporteTipoPrioridadEmpresaProdu);
			
			this.jScrollColumnasSelectReporteTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoPrioridadEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoPrioridadEmpresaProdu.add(this.jListColumnasSelectReporteTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
		this.jPanelReporteDinamicoTipoPrioridadEmpresaProdu.add(this.jScrollColumnasSelectReporteTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoPrioridadEmpresaProdu = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoPrioridadEmpresaProdu.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoPrioridadEmpresaProdu.add(this.jLabelRelacionesSelectReporteTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoPrioridadEmpresaProdu = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoPrioridadEmpresaProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoPrioridadEmpresaProdu.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoPrioridadEmpresaProdu=new JScrollPane(this.jListRelacionesSelectReporteTipoPrioridadEmpresaProdu);
			
			this.jScrollRelacionesSelectReporteTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoPrioridadEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoPrioridadEmpresaProdu.add(this.jListRelacionesSelectReporteTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
		this.jPanelReporteDinamicoTipoPrioridadEmpresaProdu.add(this.jScrollRelacionesSelectReporteTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoPrioridadEmpresaProdu = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoPrioridadEmpresaProdu = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoPrioridadEmpresaProdu = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoPrioridadEmpresaProdu = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoPrioridadEmpresaProdu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoPrioridadEmpresaProdu = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoPrioridadEmpresaProdu.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoPrioridadEmpresaProdu = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoPrioridadEmpresaProdu.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoPrioridadEmpresaProdu.add(this.jLabelGenerarExcelReporteDinamicoTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoPrioridadEmpresaProdu = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoPrioridadEmpresaProdu.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoPrioridadEmpresaProdu,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoPrioridadEmpresaProdu.setToolTipText("Generar EXCEL"+" "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		//this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoPrioridadEmpresaProdu.add(this.jButtonGenerarExcelReporteDinamicoTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPrioridadEmpresaProdu.add(this.jComboBoxTiposReportesDinamicoTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoPrioridadEmpresaProdu = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoPrioridadEmpresaProdu.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoPrioridadEmpresaProdu.add(this.jLabelTiposArchivoReporteDinamicoTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPrioridadEmpresaProdu.add(this.jComboBoxTiposArchivosReportesDinamicoTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoPrioridadEmpresaProdu = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoPrioridadEmpresaProdu.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoPrioridadEmpresaProdu,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoPrioridadEmpresaProdu.setToolTipText("Generar"+" "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPrioridadEmpresaProdu.add(this.jButtonGenerarReporteDinamicoTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoPrioridadEmpresaProdu = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoPrioridadEmpresaProdu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoPrioridadEmpresaProdu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoPrioridadEmpresaProdu.setToolTipText("Cancelar"+" "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPrioridadEmpresaProdu.add(this.jButtonCerrarReporteDinamicoTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoPrioridadEmpresaProdu = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoPrioridadEmpresaProdu= new JScrollPane(jPanelReporteDinamicoTipoPrioridadEmpresaProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoPrioridadEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Prioridad Empresas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoPrioridadEmpresaProdu);
		this.jInternalFrameReporteDinamicoTipoPrioridadEmpresaProdu.getContentPane().add(this.jScrollPanelReporteDinamicoTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoPrioridadEmpresaProdu() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoPrioridadEmpresaProdu = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoPrioridadEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoPrioridadEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoPrioridadEmpresaProdu.setName("jPanelImportacionTipoPrioridadEmpresaProdu"); 
		
		this.jPanelImportacionTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoPrioridadEmpresaProdu.setLayout(gridaBagLayoutImportacionTipoPrioridadEmpresaProdu);
		
		
		this.jInternalFrameImportacionTipoPrioridadEmpresaProdu= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoPrioridadEmpresaProdu= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoPrioridadEmpresaProdu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoPrioridadEmpresaProdu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.setResizable(true);
	    this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.setClosable(true);
	    this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.setResizable(true);
	    this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.setClosable(true);
	    this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoPrioridadEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Prioridad Empresas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoPrioridadEmpresaProdu = new JLabelMe();

		this.jLabelArchivoImportacionTipoPrioridadEmpresaProdu.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoPrioridadEmpresaProdu.add(this.jLabelArchivoImportacionTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoPrioridadEmpresaProdu = new JFileChooser();		
		this.jFileChooserImportacionTipoPrioridadEmpresaProdu.setToolTipText("ESCOGER ARCHIVO"+" "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoPrioridadEmpresaProdu = new JButtonMe();
		this.jButtonAbrirImportacionTipoPrioridadEmpresaProdu.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoPrioridadEmpresaProdu,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoPrioridadEmpresaProdu.setToolTipText("Generar"+" "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPrioridadEmpresaProdu.add(this.jButtonAbrirImportacionTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoPrioridadEmpresaProdu = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoPrioridadEmpresaProdu.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoPrioridadEmpresaProdu.add(this.jLabelPathArchivoImportacionTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoPrioridadEmpresaProdu=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPrioridadEmpresaProdu.add(this.jTextFieldPathArchivoImportacionTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoPrioridadEmpresaProdu = new JButtonMe();
		this.jButtonGenerarImportacionTipoPrioridadEmpresaProdu.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoPrioridadEmpresaProdu,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoPrioridadEmpresaProdu.setToolTipText("Generar"+" "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPrioridadEmpresaProdu.add(this.jButtonGenerarImportacionTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoPrioridadEmpresaProdu = new JButtonMe();
		this.jButtonCerrarImportacionTipoPrioridadEmpresaProdu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoPrioridadEmpresaProdu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoPrioridadEmpresaProdu.setToolTipText("Cancelar"+" "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPrioridadEmpresaProdu.add(this.jButtonCerrarImportacionTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoPrioridadEmpresaProdu = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoPrioridadEmpresaProdu= new JScrollPane(jPanelImportacionTipoPrioridadEmpresaProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoPrioridadEmpresaProdu);
		this.jInternalFrameImportacionTipoPrioridadEmpresaProdu.getContentPane().add(this.jScrollPanelImportacionTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoPrioridadEmpresaProdu(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoPrioridadEmpresaProdu = new JButtonMe();
			this.jButtonAbrirOrderByTipoPrioridadEmpresaProdu.setText("Orden");
			this.jButtonAbrirOrderByTipoPrioridadEmpresaProdu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoPrioridadEmpresaProdu,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoPrioridadEmpresaProdu";
			inputMap = this.jButtonAbrirOrderByTipoPrioridadEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoPrioridadEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoPrioridadEmpresaProdu"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoPrioridadEmpresaProdu = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoPrioridadEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoPrioridadEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoPrioridadEmpresaProdu.setName("jPanelOrderByTipoPrioridadEmpresaProdu"); 
			
			this.jPanelOrderByTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoPrioridadEmpresaProdu.setLayout(gridaBagLayoutOrderByTipoPrioridadEmpresaProdu);
			
			
			this.jTableDatosTipoPrioridadEmpresaProduOrderBy = new JTableMe();        
			this.jTableDatosTipoPrioridadEmpresaProduOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoPrioridadEmpresaProduOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoPrioridadEmpresaProduOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoPrioridadEmpresaProduOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoPrioridadEmpresaProduOrderBy.setViewportView(this.jTableDatosTipoPrioridadEmpresaProduOrderBy);
			this.jTableDatosTipoPrioridadEmpresaProduOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoPrioridadEmpresaProduOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoPrioridadEmpresaProdu= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoPrioridadEmpresaProdu= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoPrioridadEmpresaProdu = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoPrioridadEmpresaProdu= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.setTitle("Orden");
			this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.setResizable(true);
			this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.setClosable(true);
			this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoPrioridadEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Prioridad Empresas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoPrioridadEmpresaProdu.ipady =150;
				
			this.jPanelOrderByTipoPrioridadEmpresaProdu.add(jScrollPanelDatosTipoPrioridadEmpresaProduOrderBy, this.gridBagConstraintsTipoPrioridadEmpresaProdu);//this.jTableDatosTipoPrioridadEmpresaProduTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoPrioridadEmpresaProdu = new JButtonMe();
			this.jButtonCerrarOrderByTipoPrioridadEmpresaProdu.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoPrioridadEmpresaProdu,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoPrioridadEmpresaProdu.setToolTipText("Cancelar"+" "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoPrioridadEmpresaProdu.add(this.jButtonCerrarOrderByTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoPrioridadEmpresaProdu = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoPrioridadEmpresaProdu= new JScrollPane(jPanelOrderByTipoPrioridadEmpresaProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoPrioridadEmpresaProdu);
			
			this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.getContentPane().add(this.jScrollPanelOrderByTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);			
		
		} else {
			this.jButtonAbrirOrderByTipoPrioridadEmpresaProdu = new JButtonMe();
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
		int iWidthTableCalculado=0;//1030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipoprioridadempresaproduSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoPrioridadEmpresaProdu.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoPrioridadEmpresaProdu.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoPrioridadEmpresaProdu.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoPrioridadEmpresaProdu.getRowHeight();//TipoPrioridadEmpresaProduConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoPrioridadEmpresaProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoPrioridadEmpresaProdu.isSelected()) {
					iHeightTable=TipoPrioridadEmpresaProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoPrioridadEmpresaProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoPrioridadEmpresaProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoPrioridadEmpresaProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoPrioridadEmpresaProdu.isSelected()) {
					iHeightTable=TipoPrioridadEmpresaProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoPrioridadEmpresaProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoPrioridadEmpresaProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoPrioridadEmpresaProdu!=null && this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoPrioridadEmpresaProdu.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoprioridadempresaprodus.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoPrioridadEmpresaProdu> TraerTipoPrioridadEmpresaProduBeans(List<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodus,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu:tipoprioridadempresaprodus) {
					
				if(!(TipoPrioridadEmpresaProduConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoPrioridadEmpresaProduConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoprioridadempresaprodu.setsDetalleGeneralEntityReporte(TipoPrioridadEmpresaProduConstantesFunciones.getTipoPrioridadEmpresaProduDescripcion(tipoprioridadempresaprodu));
										
						
					
					

					if(tipoprioridadempresaprodu.getOrdenProdus()!=null && Funciones.existeClass(classes,OrdenProdu.class)) {
						try{tipoprioridadempresaprodu.setordenprodusDescripcionReporte(new JRBeanCollectionDataSource(OrdenProduJInternalFrame.TraerOrdenProduBeans(tipoprioridadempresaprodu.getOrdenProdus(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoprioridadempresaprodu.getPedidoProdus()!=null && Funciones.existeClass(classes,PedidoProdu.class)) {
						try{tipoprioridadempresaprodu.setpedidoprodusDescripcionReporte(new JRBeanCollectionDataSource(PedidoProduJInternalFrame.TraerPedidoProduBeans(tipoprioridadempresaprodu.getPedidoProdus(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipoprioridadempresaprodu.setsDetalleGeneralEntityReporte(tipoprioridadempresaprodu.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoprioridadempresaprodubeans.add(tipoprioridadempresaprodubean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoprioridadempresaprodus;
    }
	//PARA REPORTES FIN
}
