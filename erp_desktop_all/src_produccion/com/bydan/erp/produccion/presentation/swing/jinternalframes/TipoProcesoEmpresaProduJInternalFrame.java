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

import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.produccion.util.TipoProcesoEmpresaProduConstantesFunciones;

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
public class TipoProcesoEmpresaProduJInternalFrame extends TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoProcesoEmpresaProdu;
	
	protected JMenuBar jmenuBarTipoProcesoEmpresaProdu;
	
	protected JMenu jmenuTipoProcesoEmpresaProdu;
	protected JMenu jmenuDatosTipoProcesoEmpresaProdu;
	protected JMenu jmenuArchivoTipoProcesoEmpresaProdu;
	protected JMenu jmenuAccionesTipoProcesoEmpresaProdu;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoProcesoEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoProcesoEmpresaProdu;	
	protected GridBagConstraints gridBagConstraintsTipoProcesoEmpresaProdu;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoProcesoEmpresaProduDetalleFormJInternalFrame jInternalFrameDetalleFormTipoProcesoEmpresaProdu;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoProcesoEmpresaProdu;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoProcesoEmpresaProduSessionBean tipoprocesoempresaproduSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoProcesoEmpresaProdu> tipoprocesoempresaprodus;		
	public List<TipoProcesoEmpresaProdu> tipoprocesoempresaprodusEliminados;	
	public List<TipoProcesoEmpresaProdu> tipoprocesoempresaprodusAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoProcesoEmpresaProdu;		
	protected JButton jButtonAbrirOrderByTipoProcesoEmpresaProdu;
	
	
	//protected JPanel jPanelOrderByTipoProcesoEmpresaProdu;
	//public JScrollPane jScrollPanelOrderByTipoProcesoEmpresaProdu;	
	//protected JButton jButtonCerrarOrderByTipoProcesoEmpresaProdu;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoProcesoEmpresaProduLogic tipoprocesoempresaproduLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoProcesoEmpresaProdu;
	public JScrollPane jScrollPanelDatosEdicionTipoProcesoEmpresaProdu;
	public JScrollPane jScrollPanelDatosGeneralTipoProcesoEmpresaProdu;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoProcesoEmpresaProduOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoProcesoEmpresaProdu;
	//public JScrollPane jScrollPanelImportacionTipoProcesoEmpresaProdu;
	
	
	
	protected JPanel jPanelAccionesTipoProcesoEmpresaProdu;
	
    protected JPanel jPanelPaginacionTipoProcesoEmpresaProdu;
    protected JPanel jPanelParametrosReportesTipoProcesoEmpresaProdu;
	protected JPanel jPanelParametrosReportesAccionesTipoProcesoEmpresaProdu;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoProcesoEmpresaProdu;
	protected JPanel jPanelParametrosAuxiliar2TipoProcesoEmpresaProdu;
	protected JPanel jPanelParametrosAuxiliar3TipoProcesoEmpresaProdu;
	protected JPanel jPanelParametrosAuxiliar4TipoProcesoEmpresaProdu;
	//protected JPanel jPanelParametrosAuxiliar5TipoProcesoEmpresaProdu;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoProcesoEmpresaProdu;
	//protected JPanel jPanelImportacionTipoProcesoEmpresaProdu;
	
	
	public JTable jTableDatosTipoProcesoEmpresaProdu;
	
	
	
	//public JTable jTableDatosTipoProcesoEmpresaProduOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoProcesoEmpresaProdu;
	protected JButton jButtonDuplicarTipoProcesoEmpresaProdu;
	protected JButton jButtonCopiarTipoProcesoEmpresaProdu;
	protected JButton jButtonVerFormTipoProcesoEmpresaProdu;
	protected JButton jButtonNuevoRelacionesTipoProcesoEmpresaProdu;
	protected JButton jButtonModificarTipoProcesoEmpresaProdu;
	
    protected JButton jButtonGuardarCambiosTablaTipoProcesoEmpresaProdu;
	protected JButton jButtonCerrarTipoProcesoEmpresaProdu;
	
	
	protected JButton jButtonRecargarInformacionTipoProcesoEmpresaProdu;
	protected JButton jButtonProcesarInformacionTipoProcesoEmpresaProdu;
	
	
	protected JButton jButtonAnterioresTipoProcesoEmpresaProdu;
	protected JButton jButtonSiguientesTipoProcesoEmpresaProdu;
	protected JButton jButtonNuevoGuardarCambiosTipoProcesoEmpresaProdu;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoProcesoEmpresaProdu;
	//protected JButton jButtonCerrarReporteDinamicoTipoProcesoEmpresaProdu;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoProcesoEmpresaProdu;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoProcesoEmpresaProdu;
	//protected JButton jButtonGenerarImportacionTipoProcesoEmpresaProdu;
	//protected JButton jButtonCerrarImportacionTipoProcesoEmpresaProdu;
	//protected JFileChooser jFileChooserImportacionTipoProcesoEmpresaProdu;
	//protected File fileImportacionTipoProcesoEmpresaProdu;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoProcesoEmpresaProdu;
	protected JButton jButtonDuplicarToolBarTipoProcesoEmpresaProdu;
	protected JButton jButtonNuevoRelacionesToolBarTipoProcesoEmpresaProdu;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoProcesoEmpresaProdu;
	protected JButton jButtonCopiarToolBarTipoProcesoEmpresaProdu;
	protected JButton jButtonVerFormToolBarTipoProcesoEmpresaProdu;
	public JButton jButtonGuardarCambiosTablaToolBarTipoProcesoEmpresaProdu;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoProcesoEmpresaProdu;
	protected JButton jButtonCerrarToolBarTipoProcesoEmpresaProdu;
	
	protected JButton jButtonRecargarInformacionToolBarTipoProcesoEmpresaProdu;
	protected JButton jButtonProcesarInformacionToolBarTipoProcesoEmpresaProdu;
	protected JButton jButtonAnterioresToolBarTipoProcesoEmpresaProdu;
	protected JButton jButtonSiguientesToolBarTipoProcesoEmpresaProdu;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoProcesoEmpresaProdu;
	protected JButton jButtonAbrirOrderByToolBarTipoProcesoEmpresaProdu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoProcesoEmpresaProdu;
	protected JMenuItem jMenuItemDuplicarTipoProcesoEmpresaProdu;
	protected JMenuItem jMenuItemNuevoRelacionesTipoProcesoEmpresaProdu;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoProcesoEmpresaProdu;
	protected JMenuItem jMenuItemCopiarTipoProcesoEmpresaProdu;
	protected JMenuItem jMenuItemVerFormTipoProcesoEmpresaProdu;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoProcesoEmpresaProdu;
	protected JMenuItem jMenuItemCerrarTipoProcesoEmpresaProdu;
	protected JMenuItem jMenuItemDetalleCerrarTipoProcesoEmpresaProdu;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoProcesoEmpresaProdu;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoProcesoEmpresaProdu;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoProcesoEmpresaProdu;
	protected JMenuItem jMenuItemProcesarInformacionTipoProcesoEmpresaProdu;
	protected JMenuItem jMenuItemAnterioresTipoProcesoEmpresaProdu;
	protected JMenuItem jMenuItemSiguientesTipoProcesoEmpresaProdu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoProcesoEmpresaProdu;
	protected JMenuItem jMenuItemAbrirOrderByTipoProcesoEmpresaProdu;
	protected JMenuItem jMenuItemMostrarOcultarTipoProcesoEmpresaProdu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoProcesoEmpresaProdu;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoProcesoEmpresaProdu;
	protected JCheckBox jCheckBoxSeleccionadosTipoProcesoEmpresaProdu;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoProcesoEmpresaProdu;
	protected JCheckBox jCheckBoxConGraficoReporteTipoProcesoEmpresaProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoProcesoEmpresaProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoProcesoEmpresaProdu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoProcesoEmpresaProdu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoProcesoEmpresaProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoProcesoEmpresaProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoProcesoEmpresaProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoProcesoEmpresaProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoProcesoEmpresaProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoProcesoEmpresaProdu;
	protected JTextField jTextFieldValorCampoGeneralTipoProcesoEmpresaProdu;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoProcesoEmpresaProdu;
	//public JList<Reporte> jListColumnasSelectReporteTipoProcesoEmpresaProdu;
	//public JScrollPane jScrollColumnasSelectReporteTipoProcesoEmpresaProdu;
	
	//public JLabel jLabelRelacionesSelectReporteTipoProcesoEmpresaProdu;
	//public JList<Reporte> jListRelacionesSelectReporteTipoProcesoEmpresaProdu;
	//public JScrollPane jScrollRelacionesSelectReporteTipoProcesoEmpresaProdu;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoProcesoEmpresaProdu;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoProcesoEmpresaProdu;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoProcesoEmpresaProdu;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoProcesoEmpresaProdu;
	
		
	//public JLabel jLabelArchivoImportacionTipoProcesoEmpresaProdu;	
	//public JLabel jLabelPathArchivoImportacionTipoProcesoEmpresaProdu;
	//protected JTextField jTextFieldPathArchivoImportacionTipoProcesoEmpresaProdu;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoProcesoEmpresaProdu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoProcesoEmpresaProdu;
	
	//public JLabel jLabelColumnaCategoriaValorTipoProcesoEmpresaProdu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoProcesoEmpresaProdu;
	
	//public JLabel jLabelColumnasValoresGraficoTipoProcesoEmpresaProdu;
	//public JList<Reporte> jListColumnasValoresGraficoTipoProcesoEmpresaProdu;
	//public JScrollPane jScrollColumnasValoresGraficoTipoProcesoEmpresaProdu;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoProcesoEmpresaProdu;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoProcesoEmpresaProdu;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoProcesoEmpresaProdu;
	
	
	
	
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
	public TipoProcesoEmpresaProduJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoProcesoEmpresaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProcesoEmpresaProduJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProcesoEmpresaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProcesoEmpresaProduJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProcesoEmpresaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProcesoEmpresaProduJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoProcesoEmpresaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoProcesoEmpresaProdu)	{
		this.jButtonRecargarInformacionTipoProcesoEmpresaProdu = jButtonRecargarInformacionTipoProcesoEmpresaProdu;
	}
	
	public JButton getjButtonProcesarInformacionTipoProcesoEmpresaProdu() {
		return this.jButtonProcesarInformacionTipoProcesoEmpresaProdu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoProcesoEmpresaProdu)	{
		this.jButtonProcesarInformacionTipoProcesoEmpresaProdu = jButtonProcesarInformacionTipoProcesoEmpresaProdu;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoProcesoEmpresaProdu() {
		return this.jButtonRecargarInformacionTipoProcesoEmpresaProdu;
	}
	
	
	public List<TipoProcesoEmpresaProdu> gettipoprocesoempresaprodus() {
		return this.tipoprocesoempresaprodus;
	}

	public void settipoprocesoempresaprodus(List<TipoProcesoEmpresaProdu> tipoprocesoempresaprodus) {
		this.tipoprocesoempresaprodus = tipoprocesoempresaprodus;
	}
	
	public List<TipoProcesoEmpresaProdu> gettipoprocesoempresaprodusAux() {
		return this.tipoprocesoempresaprodusAux;
	}

	public void settipoprocesoempresaprodusAux(List<TipoProcesoEmpresaProdu> tipoprocesoempresaprodusAux) {
		this.tipoprocesoempresaprodusAux = tipoprocesoempresaprodusAux;
	}
	
	public List<TipoProcesoEmpresaProdu> gettipoprocesoempresaprodusEliminados() {
		return this.tipoprocesoempresaprodusEliminados;
	}

	public void setTipoProcesoEmpresaProdusEliminados(List<TipoProcesoEmpresaProdu> tipoprocesoempresaprodusEliminados) {
		this.tipoprocesoempresaprodusEliminados = tipoprocesoempresaprodusEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoProcesoEmpresaProdu() {
		return jComboBoxTiposSeleccionarTipoProcesoEmpresaProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoProcesoEmpresaProdu(
			JComboBox jComboBoxTiposSeleccionarTipoProcesoEmpresaProdu) {
		this.jComboBoxTiposSeleccionarTipoProcesoEmpresaProdu = jComboBoxTiposSeleccionarTipoProcesoEmpresaProdu;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoProcesoEmpresaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoProcesoEmpresaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoProcesoEmpresaProdu .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoProcesoEmpresaProdu() {
		return jTextFieldValorCampoGeneralTipoProcesoEmpresaProdu;
	}

	public void setjTextFieldValorCampoGeneralTipoProcesoEmpresaProdu(
			JTextField jTextFieldValorCampoGeneralTipoProcesoEmpresaProdu) {
		this.jTextFieldValorCampoGeneralTipoProcesoEmpresaProdu = jTextFieldValorCampoGeneralTipoProcesoEmpresaProdu;
	}

	public void setBorderResaltarValorCampoGeneralTipoProcesoEmpresaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProcesoEmpresaProdu.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoProcesoEmpresaProdu .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoProcesoEmpresaProdu() {
		return this.jCheckBoxSeleccionarTodosTipoProcesoEmpresaProdu;
	}

	public void setjCheckBoxSeleccionarTodosTipoProcesoEmpresaProdu(
			JCheckBox jCheckBoxSeleccionarTodosTipoProcesoEmpresaProdu) {
		this.jCheckBoxSeleccionarTodosTipoProcesoEmpresaProdu = jCheckBoxSeleccionarTodosTipoProcesoEmpresaProdu;
	}

	public void setBorderResaltarSeleccionarTodosTipoProcesoEmpresaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProcesoEmpresaProdu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoProcesoEmpresaProdu .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoProcesoEmpresaProdu() {
		return this.jCheckBoxSeleccionadosTipoProcesoEmpresaProdu;
	}

	public void setjCheckBoxSeleccionadosTipoProcesoEmpresaProdu(
			JCheckBox jCheckBoxSeleccionadosTipoProcesoEmpresaProdu) {
		this.jCheckBoxSeleccionadosTipoProcesoEmpresaProdu = jCheckBoxSeleccionadosTipoProcesoEmpresaProdu;
	}
	
	public void setBorderResaltarSeleccionadosTipoProcesoEmpresaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProcesoEmpresaProdu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoProcesoEmpresaProdu .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoProcesoEmpresaProdu() {
		return this.jComboBoxTiposArchivosReportesTipoProcesoEmpresaProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoProcesoEmpresaProdu(
			JComboBox jComboBoxTiposArchivosReportesTipoProcesoEmpresaProdu) {
		this.jComboBoxTiposArchivosReportesTipoProcesoEmpresaProdu = jComboBoxTiposArchivosReportesTipoProcesoEmpresaProdu;
	}

	public void setBorderResaltarTiposArchivosReportesTipoProcesoEmpresaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProcesoEmpresaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoProcesoEmpresaProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoProcesoEmpresaProdu() {
		return this.jComboBoxTiposReportesTipoProcesoEmpresaProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoProcesoEmpresaProdu(
			JComboBox jComboBoxTiposReportesTipoProcesoEmpresaProdu) {
		this.jComboBoxTiposReportesTipoProcesoEmpresaProdu = jComboBoxTiposReportesTipoProcesoEmpresaProdu;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoProcesoEmpresaProdu() {
	//	return jComboBoxTiposReportesDinamicoTipoProcesoEmpresaProdu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoProcesoEmpresaProdu(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoProcesoEmpresaProdu) {
	//	this.jComboBoxTiposReportesDinamicoTipoProcesoEmpresaProdu = jComboBoxTiposReportesDinamicoTipoProcesoEmpresaProdu;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoProcesoEmpresaProdu() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoProcesoEmpresaProdu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoProcesoEmpresaProdu(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoProcesoEmpresaProdu) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoProcesoEmpresaProdu = jComboBoxTiposArchivosReportesDinamicoTipoProcesoEmpresaProdu;
	//}
	
	public void setBorderResaltarTiposReportesTipoProcesoEmpresaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProcesoEmpresaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoProcesoEmpresaProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoProcesoEmpresaProdu() {
		return this.jComboBoxTiposGraficosReportesTipoProcesoEmpresaProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoProcesoEmpresaProdu(
			JComboBox jComboBoxTiposGraficosReportesTipoProcesoEmpresaProdu) {
		this.jComboBoxTiposGraficosReportesTipoProcesoEmpresaProdu = jComboBoxTiposGraficosReportesTipoProcesoEmpresaProdu;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoProcesoEmpresaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProcesoEmpresaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoProcesoEmpresaProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoProcesoEmpresaProdu() {
		return this.jComboBoxTiposPaginacionTipoProcesoEmpresaProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoProcesoEmpresaProdu(
			JComboBox jComboBoxTiposPaginacionTipoProcesoEmpresaProdu) {
		this.jComboBoxTiposPaginacionTipoProcesoEmpresaProdu = jComboBoxTiposPaginacionTipoProcesoEmpresaProdu;
	}
	
	public void setBorderResaltarTiposPaginacionTipoProcesoEmpresaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProcesoEmpresaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoProcesoEmpresaProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoProcesoEmpresaProdu() {
		return this.jComboBoxTiposRelacionesTipoProcesoEmpresaProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoProcesoEmpresaProdu() {
		return this.jComboBoxTiposAccionesTipoProcesoEmpresaProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoProcesoEmpresaProdu(
			JComboBox jComboBoxTiposRelacionesTipoProcesoEmpresaProdu) {
		this.jComboBoxTiposRelacionesTipoProcesoEmpresaProdu = jComboBoxTiposRelacionesTipoProcesoEmpresaProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoProcesoEmpresaProdu(
			JComboBox jComboBoxTiposAccionesTipoProcesoEmpresaProdu) {
		this.jComboBoxTiposAccionesTipoProcesoEmpresaProdu = jComboBoxTiposAccionesTipoProcesoEmpresaProdu;
	}
	
	public void setBorderResaltarTiposRelacionesTipoProcesoEmpresaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProcesoEmpresaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoProcesoEmpresaProdu .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoProcesoEmpresaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProcesoEmpresaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoProcesoEmpresaProdu .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoProcesoEmpresaProdu() {
	//	return jCheckBoxConGraficoDinamicoTipoProcesoEmpresaProdu;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoProcesoEmpresaProdu(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoProcesoEmpresaProdu) {
	//	this.jCheckBoxConGraficoDinamicoTipoProcesoEmpresaProdu = jCheckBoxConGraficoDinamicoTipoProcesoEmpresaProdu;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoProcesoEmpresaProdu() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoProcesoEmpresaProdu.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoProcesoEmpresaProdu .setBorder(borderResaltar);		
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
		this.tipoprocesoempresaproduSessionBean=new TipoProcesoEmpresaProduSessionBean();
		
		this.tipoprocesoempresaproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoprocesoempresaproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoProcesoEmpresaProduJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoProcesoEmpresaProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoProcesoEmpresaProduJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoProcesoEmpresaProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoProcesoEmpresaProduJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Proceso Empresa MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoProcesoEmpresaProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoProcesoEmpresaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoProcesoEmpresaProdu= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoProcesoEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoProcesoEmpresaProdu,this.jTtoolBarTipoProcesoEmpresaProdu,
							"nuevo","nuevo","Nuevo"+" "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoProcesoEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoProcesoEmpresaProdu,this.jTtoolBarTipoProcesoEmpresaProdu,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoProcesoEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoProcesoEmpresaProdu,this.jTtoolBarTipoProcesoEmpresaProdu,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoProcesoEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoProcesoEmpresaProdu,this.jTtoolBarTipoProcesoEmpresaProdu,
							"duplicar","duplicar","Duplicar"+" "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoProcesoEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoProcesoEmpresaProdu,this.jTtoolBarTipoProcesoEmpresaProdu,
							"copiar","copiar","Copiar"+" "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoProcesoEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoProcesoEmpresaProdu,this.jTtoolBarTipoProcesoEmpresaProdu,
							"ver_form","ver_form","Ver"+" "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoProcesoEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoProcesoEmpresaProdu,this.jTtoolBarTipoProcesoEmpresaProdu,
							"recargar","recargar","Recargar"+" "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoProcesoEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoProcesoEmpresaProdu,this.jTtoolBarTipoProcesoEmpresaProdu,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoProcesoEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoProcesoEmpresaProdu,this.jTtoolBarTipoProcesoEmpresaProdu,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoProcesoEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoProcesoEmpresaProdu,this.jTtoolBarTipoProcesoEmpresaProdu,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoProcesoEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoProcesoEmpresaProdu,this.jTtoolBarTipoProcesoEmpresaProdu,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoProcesoEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoProcesoEmpresaProdu,this.jTtoolBarTipoProcesoEmpresaProdu,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoProcesoEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoProcesoEmpresaProdu,this.jTtoolBarTipoProcesoEmpresaProdu,
							"cerrar","cerrar","Salir"+" "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoProcesoEmpresaProdu=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoProcesoEmpresaProdu;
			
				this.jButtonProcesarInformacionToolBarTipoProcesoEmpresaProdu=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoProcesoEmpresaProdu;
				
		//protected JButton jButtonModificarToolBarTipoProcesoEmpresaProdu;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoProcesoEmpresaProdu=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoProcesoEmpresaProdu=new JMenuMe("General");
		this.jmenuArchivoTipoProcesoEmpresaProdu=new JMenuMe("Archivo");
		this.jmenuAccionesTipoProcesoEmpresaProdu=new JMenuMe("Acciones");
		this.jmenuDatosTipoProcesoEmpresaProdu=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoProcesoEmpresaProdu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoProcesoEmpresaProdu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoProcesoEmpresaProdu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoProcesoEmpresaProdu= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoProcesoEmpresaProdu.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoProcesoEmpresaProdu,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoProcesoEmpresaProdu= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoProcesoEmpresaProdu.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoProcesoEmpresaProdu,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoProcesoEmpresaProdu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoProcesoEmpresaProdu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoProcesoEmpresaProdu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoProcesoEmpresaProdu= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoProcesoEmpresaProdu.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoProcesoEmpresaProdu,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoProcesoEmpresaProdu= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoProcesoEmpresaProdu.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoProcesoEmpresaProdu,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoProcesoEmpresaProdu= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoProcesoEmpresaProdu.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoProcesoEmpresaProdu,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoProcesoEmpresaProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoProcesoEmpresaProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoProcesoEmpresaProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoProcesoEmpresaProdu= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoProcesoEmpresaProdu.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoProcesoEmpresaProdu,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoProcesoEmpresaProdu= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoProcesoEmpresaProdu.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoProcesoEmpresaProdu,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoProcesoEmpresaProdu= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoProcesoEmpresaProdu.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoProcesoEmpresaProdu,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoProcesoEmpresaProdu= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoProcesoEmpresaProdu.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoProcesoEmpresaProdu,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoProcesoEmpresaProdu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoProcesoEmpresaProdu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoProcesoEmpresaProdu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoProcesoEmpresaProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoProcesoEmpresaProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoProcesoEmpresaProdu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoProcesoEmpresaProdu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoProcesoEmpresaProdu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoProcesoEmpresaProdu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoProcesoEmpresaProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoProcesoEmpresaProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoProcesoEmpresaProdu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoProcesoEmpresaProdu= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoProcesoEmpresaProdu.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoProcesoEmpresaProdu,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoProcesoEmpresaProdu.add(this.jMenuItemCerrarTipoProcesoEmpresaProdu);
			
			this.jmenuAccionesTipoProcesoEmpresaProdu.add(this.jMenuItemNuevoTipoProcesoEmpresaProdu);
			this.jmenuAccionesTipoProcesoEmpresaProdu.add(this.jMenuItemNuevoGuardarCambiosTipoProcesoEmpresaProdu);
			this.jmenuAccionesTipoProcesoEmpresaProdu.add(this.jMenuItemNuevoRelacionesTipoProcesoEmpresaProdu);
			this.jmenuAccionesTipoProcesoEmpresaProdu.add(this.jMenuItemGuardarCambiosTablaTipoProcesoEmpresaProdu);		
			this.jmenuAccionesTipoProcesoEmpresaProdu.add(this.jMenuItemDuplicarTipoProcesoEmpresaProdu);		
			this.jmenuAccionesTipoProcesoEmpresaProdu.add(this.jMenuItemCopiarTipoProcesoEmpresaProdu);		
			this.jmenuAccionesTipoProcesoEmpresaProdu.add(this.jMenuItemVerFormTipoProcesoEmpresaProdu);		
			
			this.jmenuDatosTipoProcesoEmpresaProdu.add(this.jMenuItemRecargarInformacionTipoProcesoEmpresaProdu);				
			this.jmenuDatosTipoProcesoEmpresaProdu.add(this.jMenuItemAnterioresTipoProcesoEmpresaProdu);				
			this.jmenuDatosTipoProcesoEmpresaProdu.add(this.jMenuItemSiguientesTipoProcesoEmpresaProdu);				
			this.jmenuDatosTipoProcesoEmpresaProdu.add(this.jMenuItemAbrirOrderByTipoProcesoEmpresaProdu);				
			this.jmenuDatosTipoProcesoEmpresaProdu.add(this.jMenuItemMostrarOcultarTipoProcesoEmpresaProdu);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoProcesoEmpresaProdu.add(this.jMenuItemGuardarCambiosTipoProcesoEmpresaProdu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoProcesoEmpresaProdu.add(this.jmenuArchivoTipoProcesoEmpresaProdu);		
			this.jmenuBarTipoProcesoEmpresaProdu.add(this.jmenuAccionesTipoProcesoEmpresaProdu);		
			this.jmenuBarTipoProcesoEmpresaProdu.add(this.jmenuDatosTipoProcesoEmpresaProdu);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoProcesoEmpresaProdu);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoProcesoEmpresaProdu() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoProcesoEmpresaProdu=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoProcesoEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoProcesoEmpresaProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoProcesoEmpresaProdu,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoProcesoEmpresaProdu = new TipoProcesoEmpresaProduDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Proceso Empresa DATOS");
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu = new TipoProcesoEmpresaProduDetalleFormJInternalFrame(jDesktopPane,this.tipoprocesoempresaproduSessionBean.getConGuardarRelaciones(),this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoProcesoEmpresaProdu = null;//new TipoProcesoEmpresaProduDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoProcesoEmpresaProdu= new GridBagLayout();
		
		
		this.jTableDatosTipoProcesoEmpresaProdu = new JTableMe();      
		
		String sToolTipTipoProcesoEmpresaProdu="";
		sToolTipTipoProcesoEmpresaProdu=TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoProcesoEmpresaProdu+="(Produccion.TipoProcesoEmpresaProdu)";
		}
		
		if(!this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoProcesoEmpresaProdu+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoProcesoEmpresaProdu.setToolTipText(sToolTipTipoProcesoEmpresaProdu);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoProcesoEmpresaProdu);
		this.jTableDatosTipoProcesoEmpresaProdu.setAutoCreateRowSorter(true);
		this.jTableDatosTipoProcesoEmpresaProdu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoProcesoEmpresaProdu.setRowSelectionAllowed(true);
		this.jTableDatosTipoProcesoEmpresaProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoProcesoEmpresaProdu,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoProcesoEmpresaProdu = new JButtonMe();
		this.jButtonDuplicarTipoProcesoEmpresaProdu = new JButtonMe();
		this.jButtonCopiarTipoProcesoEmpresaProdu = new JButtonMe();
		this.jButtonVerFormTipoProcesoEmpresaProdu = new JButtonMe();
		this.jButtonNuevoRelacionesTipoProcesoEmpresaProdu = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoProcesoEmpresaProdu = new JButtonMe();
		this.jButtonCerrarTipoProcesoEmpresaProdu = new JButtonMe();
		
		this.jScrollPanelDatosTipoProcesoEmpresaProdu = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoProcesoEmpresaProdu = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoProcesoEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Proceso Empresa";
		
		if(!this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoProcesoEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Proceso Empresas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoProcesoEmpresaProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoProcesoEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoProcesoEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoProcesoEmpresaProdu.setToolTipText("Acciones");
        this.jPanelAccionesTipoProcesoEmpresaProdu.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu=new ReporteDinamicoJInternalFrame(TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoProcesoEmpresaProdu();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoProcesoEmpresaProdu=new ImportacionJInternalFrame(TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoProcesoEmpresaProdu();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoProcesoEmpresaProdu = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoProcesoEmpresaProdu.setText("Orden");
		this.jButtonAbrirOrderByTipoProcesoEmpresaProdu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoProcesoEmpresaProdu,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoProcesoEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoProcesoEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoProcesoEmpresaProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProcesoEmpresaProdu,false,this);
			
			//this.cargarOrderByTipoProcesoEmpresaProdu(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoProcesoEmpresaProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProcesoEmpresaProdu,true,this);
			
			//this.cargarOrderByTipoProcesoEmpresaProdu(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoProcesoEmpresaProdu.setText("Nuevo");
		this.jButtonDuplicarTipoProcesoEmpresaProdu.setText("Duplicar");
		this.jButtonCopiarTipoProcesoEmpresaProdu.setText("Copiar");
		this.jButtonVerFormTipoProcesoEmpresaProdu.setText("Ver");
		this.jButtonNuevoRelacionesTipoProcesoEmpresaProdu.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoProcesoEmpresaProdu.setText("Guardar");
		this.jButtonCerrarTipoProcesoEmpresaProdu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoProcesoEmpresaProdu,"nuevo_button","Nuevo",this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoProcesoEmpresaProdu,"duplicar_button","Duplicar",this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoProcesoEmpresaProdu,"copiar_button","Copiar",this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoProcesoEmpresaProdu,"ver_form","Ver",this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoProcesoEmpresaProdu,"nuevorelaciones_button","Nuevo Rel",this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoProcesoEmpresaProdu,"guardarcambiostabla_button","Guardar",this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoProcesoEmpresaProdu,"cerrar_button","Salir",this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoProcesoEmpresaProdu.setToolTipText("Nuevo"+" "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoProcesoEmpresaProdu.setToolTipText("Duplicar"+" "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoProcesoEmpresaProdu.setToolTipText("Copiar"+" "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoProcesoEmpresaProdu.setToolTipText("Ver"+" "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoProcesoEmpresaProdu.setToolTipText("Nuevo Rel"+" "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoProcesoEmpresaProdu.setToolTipText("Guardar"+" "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoProcesoEmpresaProdu.setToolTipText("Salir"+" "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoProcesoEmpresaProdu";
		inputMap = this.jButtonNuevoTipoProcesoEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoProcesoEmpresaProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoProcesoEmpresaProdu"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoProcesoEmpresaProdu";
		inputMap = this.jButtonDuplicarTipoProcesoEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoProcesoEmpresaProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoProcesoEmpresaProdu"));
		
		//COPIAR
		sMapKey = "CopiarTipoProcesoEmpresaProdu";
		inputMap = this.jButtonCopiarTipoProcesoEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoProcesoEmpresaProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoProcesoEmpresaProdu"));
		
		//VEr FORM
		sMapKey = "VerFormTipoProcesoEmpresaProdu";
		inputMap = this.jButtonVerFormTipoProcesoEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoProcesoEmpresaProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoProcesoEmpresaProdu"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoProcesoEmpresaProdu";
		inputMap = this.jButtonNuevoRelacionesTipoProcesoEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoProcesoEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoProcesoEmpresaProdu"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoProcesoEmpresaProdu";
		inputMap = this.jButtonModificarTipoProcesoEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoProcesoEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoProcesoEmpresaProdu"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoProcesoEmpresaProdu";
		inputMap = this.jButtonCerrarTipoProcesoEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoProcesoEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoProcesoEmpresaProdu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoProcesoEmpresaProdu";
		inputMap = this.jButtonGuardarCambiosTablaTipoProcesoEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoProcesoEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoProcesoEmpresaProdu"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoProcesoEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoProcesoEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoProcesoEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoProcesoEmpresaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoProcesoEmpresaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoProcesoEmpresaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoProcesoEmpresaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoProcesoEmpresaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoProcesoEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoProcesoEmpresaProdu.setName("jPanelParametrosReportesTipoProcesoEmpresaProdu"); 
		
		this.jPanelParametrosReportesAccionesTipoProcesoEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoProcesoEmpresaProdu.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoProcesoEmpresaProdu.setName("jPanelParametrosReportesAccionesTipoProcesoEmpresaProdu"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoProcesoEmpresaProdu = new JButtonMe();
		this.jButtonRecargarInformacionTipoProcesoEmpresaProdu.setText("Recargar");
		this.jButtonRecargarInformacionTipoProcesoEmpresaProdu.setToolTipText("Recargar"+" "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoProcesoEmpresaProdu,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoProcesoEmpresaProdu = new JButtonMe();
		this.jButtonProcesarInformacionTipoProcesoEmpresaProdu.setText("Procesar");
		this.jButtonProcesarInformacionTipoProcesoEmpresaProdu.setToolTipText("Procesar"+" "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoProcesoEmpresaProdu.setVisible(false);
			
		this.jButtonProcesarInformacionTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoProcesoEmpresaProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoProcesoEmpresaProdu.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoProcesoEmpresaProdu.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoProcesoEmpresaProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoProcesoEmpresaProdu.setText("TIPO");       
		this.jComboBoxTiposReportesTipoProcesoEmpresaProdu.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoProcesoEmpresaProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoProcesoEmpresaProdu.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoProcesoEmpresaProdu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoProcesoEmpresaProdu = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoProcesoEmpresaProdu.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoProcesoEmpresaProdu.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoProcesoEmpresaProdu = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoProcesoEmpresaProdu.setText("Accion");
		this.jComboBoxTiposRelacionesTipoProcesoEmpresaProdu.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoProcesoEmpresaProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoProcesoEmpresaProdu.setText("Accion");
		this.jComboBoxTiposAccionesTipoProcesoEmpresaProdu.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoProcesoEmpresaProdu = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoProcesoEmpresaProdu.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoProcesoEmpresaProdu.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoProcesoEmpresaProdu=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoProcesoEmpresaProdu = new JLabelMe();
		
		this.jLabelAccionesTipoProcesoEmpresaProdu.setText("Acciones");		
		this.jLabelAccionesTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoProcesoEmpresaProdu = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoProcesoEmpresaProdu.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoProcesoEmpresaProdu.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoProcesoEmpresaProdu = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoProcesoEmpresaProdu.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoProcesoEmpresaProdu.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoProcesoEmpresaProdu = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoProcesoEmpresaProdu.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoProcesoEmpresaProdu.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoProcesoEmpresaProdu = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoProcesoEmpresaProdu.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoProcesoEmpresaProdu.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoProcesoEmpresaProdu = new JButtonMe();
		//this.jButtonAnterioresTipoProcesoEmpresaProdu.setText("<<");
        this.jButtonAnterioresTipoProcesoEmpresaProdu.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoProcesoEmpresaProdu,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoProcesoEmpresaProdu = new JButtonMe();
		//this.jButtonSiguientesTipoProcesoEmpresaProdu.setText(">>");
        this.jButtonSiguientesTipoProcesoEmpresaProdu.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoProcesoEmpresaProdu,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoProcesoEmpresaProdu = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoProcesoEmpresaProdu.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoProcesoEmpresaProdu.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoProcesoEmpresaProdu,"nuevoguardarcambios_button","Nue",this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoProcesoEmpresaProdu";
		inputMap = this.jButtonNuevoGuardarCambiosTipoProcesoEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoProcesoEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoProcesoEmpresaProdu"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoProcesoEmpresaProdu";
		inputMap = this.jButtonRecargarInformacionTipoProcesoEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoProcesoEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoProcesoEmpresaProdu"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoProcesoEmpresaProdu";
		inputMap = this.jButtonSiguientesTipoProcesoEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoProcesoEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoProcesoEmpresaProdu"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoProcesoEmpresaProdu";
		inputMap = this.jButtonAnterioresTipoProcesoEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoProcesoEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoProcesoEmpresaProdu"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoProcesoEmpresaProdu();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(this.getWidth(),TipoProcesoEmpresaProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoProcesoEmpresaProduBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(this.getWidth(),TipoProcesoEmpresaProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoProcesoEmpresaProduBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(this.getWidth(),TipoProcesoEmpresaProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoProcesoEmpresaProduBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoProcesoEmpresaProdu = new GridBagLayout();

			this.jPanelPaginacionTipoProcesoEmpresaProdu.setLayout(gridaBagLayoutPaginacionTipoProcesoEmpresaProdu);						
			
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoEmpresaProdu.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = 0;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoProcesoEmpresaProdu.add(this.jButtonAnterioresTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
					
						
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = 0;
			
			this.jPanelPaginacionTipoProcesoEmpresaProdu.add(this.jButtonNuevoGuardarCambiosTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
						
			
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoEmpresaProdu.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = 0;
			this.jPanelPaginacionTipoProcesoEmpresaProdu.add(this.jButtonSiguientesTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = 1;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProcesoEmpresaProdu.add(this.jButtonNuevoTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
				this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = 1;
				this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoProcesoEmpresaProdu.add(this.jButtonNuevoRelacionesTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
			}
			
			
			if(!this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
				this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = 1;
				this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoProcesoEmpresaProdu.add(this.jButtonGuardarCambiosTablaTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
			}
			
			
			
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = 1;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProcesoEmpresaProdu.add(this.jButtonDuplicarTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
			
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = 1;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProcesoEmpresaProdu.add(this.jButtonCopiarTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
		
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = 1;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProcesoEmpresaProdu.add(this.jButtonVerFormTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
		
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = 1;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoProcesoEmpresaProdu.add(this.jButtonCerrarTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
		
		
		
		this.jButtonRecargarInformacionTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoProcesoEmpresaProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoProcesoEmpresaProdu = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoProcesoEmpresaProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoProcesoEmpresaProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoProcesoEmpresaProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoProcesoEmpresaProdu = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoProcesoEmpresaProdu.setLayout(gridaBagParametrosReportesTipoProcesoEmpresaProdu);
			this.jPanelParametrosReportesAccionesTipoProcesoEmpresaProdu.setLayout(gridaBagParametrosReportesAccionesTipoProcesoEmpresaProdu);
			
			
			this.jPanelParametrosAuxiliar1TipoProcesoEmpresaProdu.setLayout(gridaBagParametrosAuxiliar1TipoProcesoEmpresaProdu);
			this.jPanelParametrosAuxiliar2TipoProcesoEmpresaProdu.setLayout(gridaBagParametrosAuxiliar2TipoProcesoEmpresaProdu);
			this.jPanelParametrosAuxiliar3TipoProcesoEmpresaProdu.setLayout(gridaBagParametrosAuxiliar3TipoProcesoEmpresaProdu);
			this.jPanelParametrosAuxiliar4TipoProcesoEmpresaProdu.setLayout(gridaBagParametrosAuxiliar4TipoProcesoEmpresaProdu);
			//this.jPanelParametrosAuxiliar5TipoProcesoEmpresaProdu.setLayout(gridaBagParametrosAuxiliar2TipoProcesoEmpresaProdu);			
			
			
			
			
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProcesoEmpresaProdu.add(this.jButtonRecargarInformacionTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoEmpresaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoProcesoEmpresaProdu.add(this.jComboBoxTiposPaginacionTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoEmpresaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoProcesoEmpresaProdu.add(this.jCheckBoxConAltoMaximoTablaTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoEmpresaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoProcesoEmpresaProdu.add(this.jComboBoxTiposArchivosReportesTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoEmpresaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProcesoEmpresaProdu.add(this.jPanelParametrosAuxiliar1TipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoEmpresaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoProcesoEmpresaProdu.add(this.jComboBoxTiposReportesTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoEmpresaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProcesoEmpresaProdu.add(this.jPanelParametrosAuxiliar4TipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoEmpresaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProcesoEmpresaProdu.add(this.jComboBoxTiposReportesTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoEmpresaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoProcesoEmpresaProdu.add(this.jCheckBoxGenerarReporteTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoEmpresaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProcesoEmpresaProdu.add(this.jPanelParametrosAuxiliar2TipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoProcesoEmpresaProdu.add(this.jLabelAccionesTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
				this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoProcesoEmpresaProdu.add(this.jButtonAbrirOrderByTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProcesoEmpresaProdu.add(this.jComboBoxTiposSeleccionarTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);			
			
			
			/*
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoProcesoEmpresaProdu.add(this.jCheckBoxSeleccionarTodosTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoEmpresaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoProcesoEmpresaProdu.add(this.jCheckBoxSeleccionarTodosTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);															
				
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoEmpresaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoProcesoEmpresaProdu.add(this.jCheckBoxSeleccionadosTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoEmpresaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProcesoEmpresaProdu.add(this.jPanelParametrosAuxiliar3TipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProcesoEmpresaProdu.add(this.jComboBoxTiposRelacionesTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
				
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProcesoEmpresaProdu.add(this.jComboBoxTiposAccionesTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
	
				
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProcesoEmpresaProdu.add(this.jTextFieldValorCampoGeneralTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoProcesoEmpresaProdu = new GridBagLayout();

			this.jScrollPanelDatosTipoProcesoEmpresaProdu.setLayout(gridaBagLayoutDatosTipoProcesoEmpresaProdu);
			
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = 0;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = 0;
			
			this.jScrollPanelDatosTipoProcesoEmpresaProdu.add(this.jTableDatosTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoProcesoEmpresaProdu.setViewportView(this.jTableDatosTipoProcesoEmpresaProdu);
		this.jTableDatosTipoProcesoEmpresaProdu.setFillsViewportHeight(true);
		this.jTableDatosTipoProcesoEmpresaProdu.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoProcesoEmpresaProdu= new GridBagLayout();
		this.jPanelAccionesTipoProcesoEmpresaProdu.setLayout(gridaBagLayoutAccionesTipoProcesoEmpresaProdu);
		
		
		/*	
		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = 0;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = 0;
			
		this.jPanelAccionesTipoProcesoEmpresaProdu.add(this.jButtonNuevoTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoProcesoEmpresaProdu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoProcesoEmpresaProdu);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();						
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = 0;		
			//this.gridBagConstraintsTipoProcesoEmpresaProdu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoProcesoEmpresaProdu.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = 0;		
		//this.gridBagConstraintsTipoProcesoEmpresaProdu.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoProcesoEmpresaProdu);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);								
		
		
		/*
		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
		*/		
		
		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx =0;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoProcesoEmpresaProdu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
				
		
		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoProcesoEmpresaProduJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoProcesoEmpresaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoProcesoEmpresaProdu = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoProcesoEmpresaProdu.setLayout(gridaBagLayoutBusquedasParametrosTipoProcesoEmpresaProdu);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoProcesoEmpresaProdu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
			
			
		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
		
			
		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoProcesoEmpresaProdu;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoProcesoEmpresaProdu() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoProcesoEmpresaProdu = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoProcesoEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoProcesoEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoProcesoEmpresaProdu.setName("jPanelReporteDinamicoTipoProcesoEmpresaProdu"); 
		
		this.jPanelReporteDinamicoTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoProcesoEmpresaProdu.setLayout(gridaBagLayoutReporteDinamicoTipoProcesoEmpresaProdu);
		
		
		this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoProcesoEmpresaProdu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoProcesoEmpresaProdu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoProcesoEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Proceso Empresas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoProcesoEmpresaProdu = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoProcesoEmpresaProdu.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoProcesoEmpresaProdu.add(this.jLabelColumnasSelectReporteTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoProcesoEmpresaProdu = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoProcesoEmpresaProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoProcesoEmpresaProdu.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoProcesoEmpresaProdu=new JScrollPane(this.jListColumnasSelectReporteTipoProcesoEmpresaProdu);
			
			this.jScrollColumnasSelectReporteTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoProcesoEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoProcesoEmpresaProdu.add(this.jListColumnasSelectReporteTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
		this.jPanelReporteDinamicoTipoProcesoEmpresaProdu.add(this.jScrollColumnasSelectReporteTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoProcesoEmpresaProdu = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoProcesoEmpresaProdu.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoProcesoEmpresaProdu.add(this.jLabelRelacionesSelectReporteTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoProcesoEmpresaProdu = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoProcesoEmpresaProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoProcesoEmpresaProdu.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoProcesoEmpresaProdu=new JScrollPane(this.jListRelacionesSelectReporteTipoProcesoEmpresaProdu);
			
			this.jScrollRelacionesSelectReporteTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoProcesoEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoProcesoEmpresaProdu.add(this.jListRelacionesSelectReporteTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
		this.jPanelReporteDinamicoTipoProcesoEmpresaProdu.add(this.jScrollRelacionesSelectReporteTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoProcesoEmpresaProdu = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoProcesoEmpresaProdu = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoProcesoEmpresaProdu = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoProcesoEmpresaProdu = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoProcesoEmpresaProdu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoProcesoEmpresaProdu = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoProcesoEmpresaProdu.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoProcesoEmpresaProdu = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoProcesoEmpresaProdu.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoProcesoEmpresaProdu.add(this.jLabelGenerarExcelReporteDinamicoTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoProcesoEmpresaProdu = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoProcesoEmpresaProdu.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoProcesoEmpresaProdu,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoProcesoEmpresaProdu.setToolTipText("Generar EXCEL"+" "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		//this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoProcesoEmpresaProdu.add(this.jButtonGenerarExcelReporteDinamicoTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProcesoEmpresaProdu.add(this.jComboBoxTiposReportesDinamicoTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoProcesoEmpresaProdu = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoProcesoEmpresaProdu.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoProcesoEmpresaProdu.add(this.jLabelTiposArchivoReporteDinamicoTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProcesoEmpresaProdu.add(this.jComboBoxTiposArchivosReportesDinamicoTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoProcesoEmpresaProdu = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoProcesoEmpresaProdu.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoProcesoEmpresaProdu,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoProcesoEmpresaProdu.setToolTipText("Generar"+" "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProcesoEmpresaProdu.add(this.jButtonGenerarReporteDinamicoTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoProcesoEmpresaProdu = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoProcesoEmpresaProdu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoProcesoEmpresaProdu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoProcesoEmpresaProdu.setToolTipText("Cancelar"+" "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProcesoEmpresaProdu.add(this.jButtonCerrarReporteDinamicoTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoProcesoEmpresaProdu = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoProcesoEmpresaProdu= new JScrollPane(jPanelReporteDinamicoTipoProcesoEmpresaProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoProcesoEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Proceso Empresas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoProcesoEmpresaProdu);
		this.jInternalFrameReporteDinamicoTipoProcesoEmpresaProdu.getContentPane().add(this.jScrollPanelReporteDinamicoTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoProcesoEmpresaProdu() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoProcesoEmpresaProdu = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoProcesoEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoProcesoEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoProcesoEmpresaProdu.setName("jPanelImportacionTipoProcesoEmpresaProdu"); 
		
		this.jPanelImportacionTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoProcesoEmpresaProdu.setLayout(gridaBagLayoutImportacionTipoProcesoEmpresaProdu);
		
		
		this.jInternalFrameImportacionTipoProcesoEmpresaProdu= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoProcesoEmpresaProdu= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoProcesoEmpresaProdu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoProcesoEmpresaProdu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoProcesoEmpresaProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoProcesoEmpresaProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoProcesoEmpresaProdu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoProcesoEmpresaProdu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoProcesoEmpresaProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoProcesoEmpresaProdu.setResizable(true);
	    this.jInternalFrameImportacionTipoProcesoEmpresaProdu.setClosable(true);
	    this.jInternalFrameImportacionTipoProcesoEmpresaProdu.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoProcesoEmpresaProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoProcesoEmpresaProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoProcesoEmpresaProdu.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoProcesoEmpresaProdu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoProcesoEmpresaProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoProcesoEmpresaProdu.setResizable(true);
	    this.jInternalFrameImportacionTipoProcesoEmpresaProdu.setClosable(true);
	    this.jInternalFrameImportacionTipoProcesoEmpresaProdu.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoProcesoEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Proceso Empresas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoProcesoEmpresaProdu = new JLabelMe();

		this.jLabelArchivoImportacionTipoProcesoEmpresaProdu.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoProcesoEmpresaProdu.add(this.jLabelArchivoImportacionTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoProcesoEmpresaProdu = new JFileChooser();		
		this.jFileChooserImportacionTipoProcesoEmpresaProdu.setToolTipText("ESCOGER ARCHIVO"+" "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoProcesoEmpresaProdu = new JButtonMe();
		this.jButtonAbrirImportacionTipoProcesoEmpresaProdu.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoProcesoEmpresaProdu,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoProcesoEmpresaProdu.setToolTipText("Generar"+" "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProcesoEmpresaProdu.add(this.jButtonAbrirImportacionTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoProcesoEmpresaProdu = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoProcesoEmpresaProdu.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoProcesoEmpresaProdu.add(this.jLabelPathArchivoImportacionTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoProcesoEmpresaProdu=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProcesoEmpresaProdu.add(this.jTextFieldPathArchivoImportacionTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoProcesoEmpresaProdu = new JButtonMe();
		this.jButtonGenerarImportacionTipoProcesoEmpresaProdu.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoProcesoEmpresaProdu,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoProcesoEmpresaProdu.setToolTipText("Generar"+" "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProcesoEmpresaProdu.add(this.jButtonGenerarImportacionTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoProcesoEmpresaProdu = new JButtonMe();
		this.jButtonCerrarImportacionTipoProcesoEmpresaProdu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoProcesoEmpresaProdu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoProcesoEmpresaProdu.setToolTipText("Cancelar"+" "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProcesoEmpresaProdu.add(this.jButtonCerrarImportacionTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoProcesoEmpresaProdu = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoProcesoEmpresaProdu= new JScrollPane(jPanelImportacionTipoProcesoEmpresaProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoProcesoEmpresaProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoProcesoEmpresaProdu.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoProcesoEmpresaProdu);
		this.jInternalFrameImportacionTipoProcesoEmpresaProdu.getContentPane().add(this.jScrollPanelImportacionTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoProcesoEmpresaProdu(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoProcesoEmpresaProdu = new JButtonMe();
			this.jButtonAbrirOrderByTipoProcesoEmpresaProdu.setText("Orden");
			this.jButtonAbrirOrderByTipoProcesoEmpresaProdu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoProcesoEmpresaProdu,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoProcesoEmpresaProdu";
			inputMap = this.jButtonAbrirOrderByTipoProcesoEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoProcesoEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoProcesoEmpresaProdu"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoProcesoEmpresaProdu = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoProcesoEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoProcesoEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoProcesoEmpresaProdu.setName("jPanelOrderByTipoProcesoEmpresaProdu"); 
			
			this.jPanelOrderByTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoProcesoEmpresaProdu.setLayout(gridaBagLayoutOrderByTipoProcesoEmpresaProdu);
			
			
			this.jTableDatosTipoProcesoEmpresaProduOrderBy = new JTableMe();        
			this.jTableDatosTipoProcesoEmpresaProduOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoProcesoEmpresaProduOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoProcesoEmpresaProduOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoProcesoEmpresaProduOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoProcesoEmpresaProduOrderBy.setViewportView(this.jTableDatosTipoProcesoEmpresaProduOrderBy);
			this.jTableDatosTipoProcesoEmpresaProduOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoProcesoEmpresaProduOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoProcesoEmpresaProdu= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoProcesoEmpresaProdu= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoProcesoEmpresaProdu = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoProcesoEmpresaProdu= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoProcesoEmpresaProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoProcesoEmpresaProdu.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoProcesoEmpresaProdu.setTitle("Orden");
			this.jInternalFrameOrderByTipoProcesoEmpresaProdu.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoProcesoEmpresaProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoProcesoEmpresaProdu.setResizable(true);
			this.jInternalFrameOrderByTipoProcesoEmpresaProdu.setClosable(true);
			this.jInternalFrameOrderByTipoProcesoEmpresaProdu.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoProcesoEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Proceso Empresas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoProcesoEmpresaProdu.ipady =150;
				
			this.jPanelOrderByTipoProcesoEmpresaProdu.add(jScrollPanelDatosTipoProcesoEmpresaProduOrderBy, this.gridBagConstraintsTipoProcesoEmpresaProdu);//this.jTableDatosTipoProcesoEmpresaProduTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoProcesoEmpresaProdu = new JButtonMe();
			this.jButtonCerrarOrderByTipoProcesoEmpresaProdu.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoProcesoEmpresaProdu,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoProcesoEmpresaProdu.setToolTipText("Cancelar"+" "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoProcesoEmpresaProdu.add(this.jButtonCerrarOrderByTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoProcesoEmpresaProdu = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoProcesoEmpresaProdu= new JScrollPane(jPanelOrderByTipoProcesoEmpresaProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoProcesoEmpresaProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoProcesoEmpresaProdu.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoProcesoEmpresaProdu);
			
			this.jInternalFrameOrderByTipoProcesoEmpresaProdu.getContentPane().add(this.jScrollPanelOrderByTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);			
		
		} else {
			this.jButtonAbrirOrderByTipoProcesoEmpresaProdu = new JButtonMe();
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
		int iWidthTableCalculado=0;//1230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=400;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipoprocesoempresaproduSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoProcesoEmpresaProdu.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoProcesoEmpresaProdu.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoProcesoEmpresaProdu.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoProcesoEmpresaProdu.getRowHeight();//TipoProcesoEmpresaProduConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoProcesoEmpresaProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoProcesoEmpresaProdu.isSelected()) {
					iHeightTable=TipoProcesoEmpresaProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoProcesoEmpresaProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoProcesoEmpresaProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoProcesoEmpresaProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoProcesoEmpresaProdu.isSelected()) {
					iHeightTable=TipoProcesoEmpresaProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoProcesoEmpresaProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoProcesoEmpresaProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoProcesoEmpresaProdu!=null && this.jInternalFrameOrderByTipoProcesoEmpresaProdu.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoProcesoEmpresaProdu.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoProcesoEmpresaProdu.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoProcesoEmpresaProdu.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoProcesoEmpresaProdu.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoProcesoEmpresaProdu.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoProcesoEmpresaProdu.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoProcesoEmpresaProdu.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoprocesoempresaprodus.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoProcesoEmpresaProdu> TraerTipoProcesoEmpresaProduBeans(List<TipoProcesoEmpresaProdu> tipoprocesoempresaprodus,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoProcesoEmpresaProdu tipoprocesoempresaprodu:tipoprocesoempresaprodus) {
					
				if(!(TipoProcesoEmpresaProduConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoProcesoEmpresaProduConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoprocesoempresaprodu.setsDetalleGeneralEntityReporte(TipoProcesoEmpresaProduConstantesFunciones.getTipoProcesoEmpresaProduDescripcion(tipoprocesoempresaprodu));
										
						
					
					

					if(tipoprocesoempresaprodu.getProductoProduManos()!=null && Funciones.existeClass(classes,ProductoProduMano.class)) {
						try{tipoprocesoempresaprodu.setproductoprodumanosDescripcionReporte(new JRBeanCollectionDataSource(ProductoProduManoJInternalFrame.TraerProductoProduManoBeans(tipoprocesoempresaprodu.getProductoProduManos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoprocesoempresaprodu.getProductoOrdenDetaProduManos()!=null && Funciones.existeClass(classes,ProductoOrdenDetaProduMano.class)) {
						try{tipoprocesoempresaprodu.setproductoordendetaprodumanosDescripcionReporte(new JRBeanCollectionDataSource(ProductoOrdenDetaProduManoJInternalFrame.TraerProductoOrdenDetaProduManoBeans(tipoprocesoempresaprodu.getProductoOrdenDetaProduManos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoprocesoempresaprodu.getProductoOrdenDetaProduMaquinas()!=null && Funciones.existeClass(classes,ProductoOrdenDetaProduMaquina.class)) {
						try{tipoprocesoempresaprodu.setproductoordendetaprodumaquinasDescripcionReporte(new JRBeanCollectionDataSource(ProductoOrdenDetaProduMaquinaJInternalFrame.TraerProductoOrdenDetaProduMaquinaBeans(tipoprocesoempresaprodu.getProductoOrdenDetaProduMaquinas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoprocesoempresaprodu.getProductoProduMaquinas()!=null && Funciones.existeClass(classes,ProductoProduMaquina.class)) {
						try{tipoprocesoempresaprodu.setproductoprodumaquinasDescripcionReporte(new JRBeanCollectionDataSource(ProductoProduMaquinaJInternalFrame.TraerProductoProduMaquinaBeans(tipoprocesoempresaprodu.getProductoProduMaquinas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipoprocesoempresaprodu.setsDetalleGeneralEntityReporte(tipoprocesoempresaprodu.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoprocesoempresaprodubeans.add(tipoprocesoempresaprodubean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoprocesoempresaprodus;
    }
	//PARA REPORTES FIN
}
